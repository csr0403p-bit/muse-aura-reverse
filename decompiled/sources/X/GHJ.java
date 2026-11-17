package X;

/* loaded from: classes6.dex */
public abstract class GHJ {
    public static void A00(GGF ggf, int i) {
        ggf.A02((i << 3) | 2);
    }

    public static void A01(GGF ggf, int i, int i2) {
        ggf.A02((i << 3) | 5);
        ggf.A01(i2);
    }

    public static void A02(GGF ggf, int i, long j) {
        ggf.A02((i << 3) | 1);
        ggf.A05(j);
    }

    public static void A03(GGF ggf, int i, long j) {
        ggf.A02(i << 3);
        ggf.A06(j);
    }
}
