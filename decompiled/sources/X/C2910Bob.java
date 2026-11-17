package X;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Bob, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2910Bob extends AbstractC2908BoZ {
    public SurfaceTexture A00;
    public SurfaceTexture A01;
    public TextureView A02;
    public BmM A03;
    public InterfaceC2924Bop A04;
    public InterfaceC2921Bom A05;
    public ListenableFuture<Bn0> A06;
    public Executor A07;
    public AtomicReference<C3010Brs<Void>> A08;
    public boolean A09;

    public final void A01() {
        SurfaceTexture surfaceTexture;
        Size size = super.A00;
        if (size == null || (surfaceTexture = this.A01) == null || this.A03 == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), super.A00.getHeight());
        final Surface surface = new Surface(this.A01);
        final BmM bmM = this.A03;
        final C3009Brr c3009BrrA02 = AbstractC2947Bpi.A02(surface, this, 9);
        this.A06 = c3009BrrA02;
        c3009BrrA02.addListener(new Runnable() { // from class: X.Bod
            public static final String __redex_internal_original_name = "TextureViewImplementation$$ExternalSyntheticLambda4";

            @Override // java.lang.Runnable
            public final void run() {
                C2910Bob c2910Bob = this;
                Surface surface2 = surface;
                ListenableFuture<Bn0> listenableFuture = c3009BrrA02;
                BmM bmM2 = bmM;
                AbstractC2875Bni.A01("TextureViewImpl", "Safe to release surface.");
                InterfaceC2921Bom interfaceC2921Bom = c2910Bob.A05;
                if (interfaceC2921Bom != null) {
                    interfaceC2921Bom.AWP();
                    c2910Bob.A05 = null;
                }
                surface2.release();
                if (c2910Bob.A06 == listenableFuture) {
                    c2910Bob.A06 = null;
                }
                if (c2910Bob.A03 == bmM2) {
                    c2910Bob.A03 = null;
                }
            }
        }, this.A02.getContext().getMainExecutor());
        super.A02 = true;
        A00();
    }
}
