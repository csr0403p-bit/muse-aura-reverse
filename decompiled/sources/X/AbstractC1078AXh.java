package X;

/* renamed from: X.AXh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1078AXh {
    public static final boolean A01(C1299Agk c1299Agk) {
        return !c1299Agk.A0G && c1299Agk.A0F;
    }

    public static final boolean A03(C1299Agk c1299Agk) {
        return c1299Agk.A0G && !c1299Agk.A0F;
    }

    public static final boolean A04(C1299Agk c1299Agk, long j, long j2) {
        boolean zA1Q = AnonymousClass002.A1Q(c1299Agk.A07, 1);
        long j3 = c1299Agk.A0A;
        float fA00 = AnonymousClass001.A00(j3);
        float fA01 = AnonymousClass001.A01(j3, 4294967295L);
        float fA002 = AnonymousClass001.A00(j2);
        float f = zA1Q ? 1.0f : 0.0f;
        float f2 = fA002 * f;
        float fA012 = AnonymousClass001.A01(j2, 4294967295L) * f;
        return AnonymousClass002.A1N((fA00 > (((int) (j >> 32)) + f2) ? 1 : (fA00 == (((int) (j >> 32)) + f2) ? 0 : -1))) | C8j3.A1R((fA00 > (-f2) ? 1 : (fA00 == (-f2) ? 0 : -1))) | C8j3.A1R((fA01 > (-fA012) ? 1 : (fA01 == (-fA012) ? 0 : -1))) | (fA01 > ((int) (j & 4294967295L)) + fA012);
    }

    public static final long A00(C1299Agk c1299Agk) {
        long jA08 = AWx.A08(c1299Agk);
        if (c1299Agk.A03()) {
            return 0L;
        }
        return jA08;
    }

    public static final boolean A02(C1299Agk c1299Agk) {
        return (c1299Agk.A03() || !c1299Agk.A0G || c1299Agk.A0F) ? false : true;
    }
}
