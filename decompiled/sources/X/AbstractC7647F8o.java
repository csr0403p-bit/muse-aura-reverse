package X;

/* renamed from: X.F8o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7647F8o {
    public static final String A02(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return (str2 == null || str2.equals("")) ? str : FGI.A0U(str, "#", str2);
    }

    public static final String A00(C7648F8p c7648F8p, Integer num) {
        char c = num == C79.A00 ? '/' : '|';
        StringBuilder sbA0w = C60O.A0w();
        for (int i : c7648F8p.A01) {
            sbA0w.append(c);
            sbA0w.append(i);
        }
        return sbA0w.toString();
    }

    public static String A01(C7648F8p c7648F8p, Integer num, String str, int i) {
        return A02(str, A00(c7648F8p.A01(i), num));
    }
}
