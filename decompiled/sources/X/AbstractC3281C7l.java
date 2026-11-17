package X;

/* renamed from: X.C7l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3281C7l {
    public static String A00;
    public static final C3283C7x A01 = new C3283C7x();

    public static final String A00() {
        C3283C7x c3283C7x = A01;
        if (A00 == null) {
            synchronized (c3283C7x) {
                String str = A00;
                if (str != null) {
                    return str;
                }
                String string = Long.toString(System.currentTimeMillis());
                C7384Etj.A0U(string);
                A00 = FGI.A0U(string, "-", C9M.A00());
            }
        }
        String str2 = A00;
        C7384Etj.A0X(str2);
        return str2;
    }
}
