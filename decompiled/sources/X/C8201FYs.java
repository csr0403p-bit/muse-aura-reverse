package X;

/* renamed from: X.FYs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8201FYs implements FZM {
    public static final C8201FYs A00 = new C8201FYs();

    @Override // X.FZM
    public final int A6A(CharSequence charSequence, int i, int i2) {
        int i3 = i2 + i;
        boolean z = false;
        while (i < i3) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i));
            if (directionality == 0) {
                z = true;
            } else if (directionality == 1 || directionality == 2) {
                return 0;
            }
            i++;
        }
        return z ? 1 : 2;
    }
}
