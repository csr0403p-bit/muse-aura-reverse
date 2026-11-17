package X;

/* renamed from: X.Hnh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10504Hnh {
    public static final String A00(HtJ<?> htJ) {
        Object objA0s;
        if (htJ instanceof GBJ) {
            return htJ.toString();
        }
        try {
            StringBuilder sbA0q = BV5.A0q(htJ);
            sbA0q.append('@');
            AbstractC7609F5w.A1K(sbA0q, htJ);
            objA0s = sbA0q.toString();
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (HsJ.A00(objA0s) != null) {
            objA0s = FGI.A0O(C60Q.A0e(htJ), BV7.A0x(htJ), '@');
        }
        return (String) objA0s;
    }
}
