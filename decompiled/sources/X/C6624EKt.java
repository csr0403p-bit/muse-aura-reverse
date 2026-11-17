package X;

import java.util.Map;

/* renamed from: X.EKt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6624EKt {
    public final ENJ A00;
    public final EN7 A01;
    public final Object A02 = C3cG.A0T();
    public final Map<EMx, Runnable> A03 = C3cG.A0j();

    public final void A00(EMx eMx) {
        Runnable runnableRemove;
        C7384Etj.A0Y(eMx, 0);
        synchronized (this.A02) {
            runnableRemove = this.A03.remove(eMx);
        }
        if (runnableRemove != null) {
            ((C6633ELd) this.A00).A00.removeCallbacks(runnableRemove);
        }
    }

    public final void A01(final EMx eMx) {
        C7384Etj.A0Y(eMx, 0);
        Runnable runnable = new Runnable() { // from class: X.ELe
            public static final String __redex_internal_original_name = "TimeLimiter$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                C6624EKt c6624EKt = this;
                c6624EKt.A01.AgU(eMx, 3);
            }
        };
        synchronized (this.A02) {
            this.A03.put(eMx, runnable);
        }
        ((C6633ELd) this.A00).A00.postDelayed(runnable, 5400000L);
    }

    public C6624EKt(ENJ enj, EN7 en7) {
        this.A00 = enj;
        this.A01 = en7;
    }
}
