package X;

/* renamed from: X.7LE, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7LE {
    public static final boolean A00(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static boolean A01(String str, int i) {
        return A00(str.charAt(i));
    }
}
