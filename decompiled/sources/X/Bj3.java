package X;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import java.util.Collections;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class Bj3 extends CameraDevice.StateCallback {
    public final /* synthetic */ Bj4 A00;
    public final /* synthetic */ C3010Brs A01;

    public Bj3(Bj4 bj4, C3010Brs c3010Brs) {
        this.A00 = bj4;
        this.A01 = c3010Brs;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        Bj4.A09(this.A00, "openCameraConfigAndClose camera closed", null);
        this.A01.A03(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        Bj4.A09(this.A00, "openCameraConfigAndClose camera disconnected", null);
        this.A01.A03(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        Bj4.A09(this.A00, FGI.A0H("openCameraConfigAndClose camera error ", i), null);
        this.A01.A03(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(final CameraDevice cameraDevice) {
        Bj4 bj4 = this.A00;
        Bj4.A09(bj4, "openCameraConfigAndClose camera opened", null);
        C2714Bik c2714Bik = new C2714Bik(bj4.A0J, new C2511Bch(Collections.EMPTY_LIST));
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        BhY bhY = new BhY(surface);
        ExecutorC2446BbZ.A03(AbstractC2942BpW.A01(bhY.A08), new Runnable() { // from class: X.BkI
            public static final String __redex_internal_original_name = "Camera2CameraImpl$$ExternalSyntheticLambda19";

            @Override // java.lang.Runnable
            public final void run() {
                Surface surface2 = surface;
                SurfaceTexture surfaceTexture2 = surfaceTexture;
                surface2.release();
                surfaceTexture2.release();
            }
        });
        BgX bgX = new BgX();
        bgX.A02(C2507Bcd.A07, bhY);
        bgX.A04.A00 = 1;
        Bj4.A09(bj4, "Start configAndClose.", null);
        C2643Bga c2643BgaA01 = bgX.A01();
        C2748Bjp c2748Bjp = bj4.A0H;
        C2511Bch c2511Bch = c2748Bjp.A02;
        C2511Bch c2511Bch2 = c2748Bjp.A03;
        C2945Bpd c2945BpdA00 = C2945Bpd.A00(AbstractC2947Bpi.A01(c2714Bik.AXV(cameraDevice, new C2715Bil(c2748Bjp.A00, c2748Bjp.A01, c2511Bch, c2511Bch2, c2748Bjp.A04, c2748Bjp.A05), c2643BgaA01), 20));
        F4N f4n = new F4N(0, c2714Bik, bhY);
        Executor executor = bj4.A0Q;
        Bpe bpeA01 = Bpe.A01(f4n, c2945BpdA00, executor);
        cameraDevice.getClass();
        bpeA01.addListener(new Runnable() { // from class: X.Bl2
            public static final String __redex_internal_original_name = "Camera2CameraImpl$2$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                cameraDevice.close();
            }
        }, executor);
    }
}
