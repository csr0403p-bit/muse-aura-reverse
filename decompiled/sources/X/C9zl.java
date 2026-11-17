package X;

/* renamed from: X.9zl, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9zl {
    public static final boolean A00(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= '\u0080' || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }
}
