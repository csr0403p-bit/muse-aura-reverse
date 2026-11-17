package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Dsf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5945Dsf implements Runnable {
    public static final String __redex_internal_original_name = "PlayerListener$WeakReferenceLogHeartbeatRunnable";
    public final WeakReference<C5630DmE> A00;

    public RunnableC5945Dsf(C5630DmE c5630DmE) {
        C7384Etj.A0Y(c5630DmE, 0);
        this.A00 = BV4.A0q(c5630DmE);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5630DmE c5630DmE = this.A00.get();
        if (c5630DmE != null) {
            C5630DmE.A07(c5630DmE);
        }
    }
}
