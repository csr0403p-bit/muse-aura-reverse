package X;

/* renamed from: X.C0i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3160C0i {
    public static final String A00(String str) {
        int iA08;
        if (str == null || (iA08 = C7BY.A08(str, '.', 0)) <= 0) {
            return null;
        }
        return str.substring(0, iA08);
    }
}
