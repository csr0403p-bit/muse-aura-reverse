package X;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.concurrent.ExecutionException;

/* renamed from: X.Box, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class SurfaceHolderCallbackC2931Box implements SurfaceHolder.Callback {
    public Size A00;
    public Size A01;
    public BmM A02;
    public InterfaceC2921Bom A03;
    public BmM A06;
    public final /* synthetic */ C2932Boy A07;
    public boolean A05 = false;
    public boolean A04 = false;

    public SurfaceHolderCallbackC2931Box(C2932Boy c2932Boy) {
        this.A07 = c2932Boy;
    }

    public static boolean A00(SurfaceHolderCallbackC2931Box surfaceHolderCallbackC2931Box) throws ExecutionException, InterruptedException {
        C2932Boy c2932Boy = surfaceHolderCallbackC2931Box.A07;
        Surface surface = c2932Boy.A00.getHolder().getSurface();
        if (surfaceHolderCallbackC2931Box.A05 || surfaceHolderCallbackC2931Box.A02 == null || !C6xC.A00(surfaceHolderCallbackC2931Box.A01, surfaceHolderCallbackC2931Box.A00)) {
            return false;
        }
        AbstractC2875Bni.A01("SurfaceViewImpl", "Surface set on Preview.");
        InterfaceC2921Bom interfaceC2921Bom = surfaceHolderCallbackC2931Box.A03;
        BmM bmM = surfaceHolderCallbackC2931Box.A02;
        bmM.getClass();
        bmM.A01(surface, new C7576F4p(interfaceC2921Bom, 7), c2932Boy.A00.getContext().getMainExecutor());
        surfaceHolderCallbackC2931Box.A05 = true;
        c2932Boy.A02 = true;
        c2932Boy.A00();
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) throws ExecutionException, InterruptedException {
        AbstractC2875Bni.A01("SurfaceViewImpl", FGI.A0T("Surface changed. Size: ", "x", i2, i3));
        this.A00 = BV6.A0P(i2, i3);
        A00(this);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        BmM bmM;
        AbstractC2875Bni.A01("SurfaceViewImpl", "Surface created.");
        if (!this.A04 || (bmM = this.A06) == null) {
            return;
        }
        bmM.A00();
        bmM.A09.A03(null);
        this.A06 = null;
        this.A04 = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        AbstractC2875Bni.A01("SurfaceViewImpl", "Surface destroyed.");
        boolean z = this.A05;
        BmM bmM = this.A02;
        if (z) {
            if (bmM != null) {
                AbstractC2875Bni.A00(bmM, "Surface closed ", "SurfaceViewImpl");
                this.A02.A07.A02();
            }
        } else if (bmM != null) {
            AbstractC2875Bni.A00(bmM, "Request canceled: ", "SurfaceViewImpl");
            this.A02.A00();
        }
        this.A04 = true;
        BmM bmM2 = this.A02;
        if (bmM2 != null) {
            this.A06 = bmM2;
        }
        this.A05 = false;
        this.A02 = null;
        this.A03 = null;
        this.A00 = null;
        this.A01 = null;
    }
}
