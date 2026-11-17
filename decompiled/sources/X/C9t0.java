package X;

/* renamed from: X.9t0, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9t0 {
    public static final String A01(byte b) {
        return b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }

    public static final byte A00(char c) {
        if (c < '~') {
            return C9t7.A00[c];
        }
        return (byte) 0;
    }
}
