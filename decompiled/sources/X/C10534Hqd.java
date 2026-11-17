package X;

/* renamed from: X.Hqd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10534Hqd {
    public static final C10534Hqd A00 = new C10534Hqd();

    public final int A00(CharSequence charSequence, int i) {
        int i2;
        char cCharAt = charSequence.charAt(i);
        if (Character.isHighSurrogate(cCharAt) && (i2 = i + 1) < charSequence.length()) {
            if (Character.isLowSurrogate(charSequence.charAt(i2))) {
                return ((cCharAt << '\n') + r2) - 56613888;
            }
        }
        return cCharAt;
    }
}
