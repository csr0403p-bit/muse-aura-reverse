package X;

/* renamed from: X.C6j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3263C6j {
    public static boolean A00(char c) {
        return 'r' == c || 'c' == c || 's' == c || 'e' == c || 'p' == c || 'f' == c;
    }

    public static boolean A01(EnumC3254C5u enumC3254C5u, char c) {
        for (C68 c68 : C68.values()) {
            if (c68.mSymbol == c) {
                return c68.mCrashType == enumC3254C5u;
            }
        }
        return false;
    }
}
