package X;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class BjR {
    public C3010Brs<Void> A01;
    public final Executor A05;
    public final Bj5 A06;
    public boolean A02 = false;
    public boolean A03 = false;
    public final Object A04 = C3cG.A0T();
    public BgU A00 = new BgU();

    public static void A00(final BjR bjR) {
        AbstractC2942BpW.A01(AbstractC2947Bpi.A01(bjR.A06, 0)).addListener(new Runnable() { // from class: X.BkL
            public static final String __redex_internal_original_name = "Camera2CameraControl$$ExternalSyntheticLambda2";

            @Override // java.lang.Runnable
            public final void run() {
                BjR bjR2 = this.A00;
                C3010Brs<Void> c3010Brs = bjR2.A01;
                if (c3010Brs != null) {
                    c3010Brs.A03(null);
                    bjR2.A01 = null;
                }
            }
        }, bjR.A05);
        bjR.A03 = false;
    }

    public BjR(Bj5 bj5, Executor executor) {
        this.A06 = bj5;
        this.A05 = executor;
    }
}
