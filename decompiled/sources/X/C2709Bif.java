package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.Bif, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2709Bif extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ C2714Bik A00;

    public C2709Bif(C2714Bik c2714Bik) {
        this.A00 = c2714Bik;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C2714Bik c2714Bik = this.A00;
        synchronized (c2714Bik.A0E) {
            C2643Bga c2643Bga = c2714Bik.A02;
            if (c2643Bga != null) {
                C2646Bgd c2646Bgd = c2643Bga.A02;
                AbstractC2875Bni.A01("CaptureSession", "Submit FLASH_MODE_OFF request");
                C2645Bgc c2645Bgc = new C2645Bgc();
                c2645Bgc.A00 = c2646Bgd.A00;
                Iterator it = Collections.unmodifiableList(c2646Bgd.A05).iterator();
                while (it.hasNext()) {
                    c2645Bgc.A07.add((BjC) it.next());
                }
                c2645Bgc.A02(c2646Bgd.A02);
                BgU bgU = new BgU();
                bgU.A01(CaptureRequest.FLASH_MODE, BV4.A0V());
                C2592Beo.A00(bgU, c2645Bgc);
                c2714Bik.API(Collections.singletonList(c2645Bgc.A01()));
            }
        }
    }
}
