package X;

import android.os.Looper;

/* loaded from: classes5.dex */
public final class Dn3 {
    public final /* synthetic */ Dlw A00;

    public Dn3(Dlw dlw) {
        this.A00 = dlw;
    }

    public final void A00(long j) {
        Dlw dlw = this.A00;
        Dlw.A0u(dlw, "stall_recovery", j, dlw.A0P, false, true, true);
    }

    public final boolean A02() {
        Dlw dlw = this.A00;
        final C5615Dlu c5615Dlu = dlw.A2j;
        if (c5615Dlu == null) {
            return false;
        }
        final long jA1O = dlw.A1O() * 1000;
        Looper looperA01 = AbstractC5797Dph.A01(c5615Dlu);
        if (looperA01 == null) {
            return false;
        }
        BV4.A09(looperA01).post(new Runnable() { // from class: X.DpM
            public static final String __redex_internal_original_name = "HeroExoPlayer2$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                C5615Dlu c5615Dlu2 = c5615Dlu;
                long j = jA1O;
                InterfaceC6022DuF interfaceC6022DuFAL9 = c5615Dlu2.A0i.A00[0].AL9();
                if (interfaceC6022DuFAL9 instanceof C5422DiI) {
                    C5422DiI.A08((C5422DiI) interfaceC6022DuFAL9, j, true);
                    AbstractC5718DoA.A02("StallRecovery: cancelCurrentVideoChunkLoad applied", new Object[0]);
                }
            }
        });
        return true;
    }

    public final void A01(String str) {
        AbstractC3426CMt.A04("HeroService", "StallRecovery: %s", str);
    }
}
