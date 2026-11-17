package X;

/* loaded from: classes6.dex */
public abstract class HlF extends C7LE {
    public static final boolean A02(char c, char c2, boolean z) {
        char upperCase;
        char upperCase2;
        return c == c2 || (z && ((upperCase = Character.toUpperCase(c)) == (upperCase2 = Character.toUpperCase(c2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)));
    }
}
