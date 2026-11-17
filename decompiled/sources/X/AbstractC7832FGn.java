package X;

/* renamed from: X.FGn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7832FGn {
    public static final long A00(long j) {
        AbstractC7829FGk abstractC7829FGkA01 = AbstractC7829FGk.A01(BV6.A03(j));
        int iA03 = abstractC7829FGkA01.A03(j);
        if (iA03 == Integer.MAX_VALUE) {
            AbstractC7829FGk abstractC7829FGkA012 = AbstractC7829FGk.A01((int) j);
            if (abstractC7829FGkA012.A02(j) == Integer.MAX_VALUE) {
                return FEP.A00(Math.max(abstractC7829FGkA01.A05(j), 0), Math.max(abstractC7829FGkA012.A04(j), 0));
            }
        }
        int i = iA03 != Integer.MAX_VALUE ? iA03 : 0;
        int iA02 = AbstractC7829FGk.A01((int) j).A02(j);
        return FEP.A00(i, iA02 != Integer.MAX_VALUE ? iA02 : 0);
    }
}
