package X;

/* renamed from: X.1Xo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC04851Xo {
    public static final C3TQ A00 = new C1DP(24.0f, 8.0f, 24.0f, 8.0f);
    public static final C3TQ A01;

    static {
        new C1DP(16.0f, 8.0f, 24.0f, 8.0f);
        A01 = new C1DP(12.0f, 8.0f, 12.0f, 8.0f);
        new C1DP(12.0f, 8.0f, 16.0f, 8.0f);
    }

    public static final C04791Xh A00(C04921Xv c04921Xv) {
        C04791Xh c04791Xh = c04921Xv.A01;
        if (c04791Xh != null) {
            return c04791Xh;
        }
        long j = B6A.A06;
        long jA00 = AbstractC04931Xw.A00(c04921Xv, AbstractC04871Xq.A02);
        long jA002 = AbstractC04931Xw.A00(c04921Xv, AbstractC04871Xq.A01);
        C04791Xh c04791Xh2 = new C04791Xh(j, jA00, j, HxS.A04(HDi.A0O[(int) (jA002 & 63)], B6A.A03(jA002), B6A.A02(jA002), B6A.A01(jA002), 0.38f));
        c04921Xv.A01 = c04791Xh2;
        return c04791Xh2;
    }
}
