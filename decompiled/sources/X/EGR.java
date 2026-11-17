package X;

import android.view.Choreographer;

/* loaded from: classes5.dex */
public final class EGR implements Choreographer.FrameCallback {
    public final /* synthetic */ EGP A00;

    public EGR(EGP egp) {
        this.A00 = egp;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i;
        EGP egp = this.A00;
        egp.A06 = false;
        if (egp.A05 && egp.isAttachedToWindow()) {
            C5219Ddb c5219Ddb = egp.A02;
            if (c5219Ddb == null || (i = c5219Ddb.A00) <= 0 || j - egp.A00 >= (1000000000 / i) - 1000000) {
                egp.A00 = j;
                egp.invalidate();
            }
            EGP.A04(egp);
        }
    }
}
