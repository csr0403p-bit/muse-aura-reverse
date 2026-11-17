package X;

/* renamed from: X.G7k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9229G7k extends G7Y {
    public static final C9229G7k A01 = new C9229G7k(new char[0], new int[0], new boolean[0], 0, false);
    public final boolean A00;

    @Override // X.G7Y
    public final C9238G7t A01(G7T g7t) {
        C7384Etj.A0Y(g7t, 0);
        C9238G7t c9238G7tA01 = super.A01(g7t);
        if (c9238G7tA01 == null) {
            return null;
        }
        CharSequence charSequence = g7t.A03;
        int i = g7t.A02;
        int i2 = c9238G7tA01.A02;
        int i3 = i + i2;
        while (i3 < charSequence.length() && (charSequence.charAt(i3) == ' ' || charSequence.charAt(i3) == '\t')) {
            i3++;
        }
        int i4 = i3 + 3;
        if (i4 > charSequence.length() || charSequence.charAt(i3) != '[' || charSequence.charAt(i3 + 2) != ']') {
            return c9238G7tA01;
        }
        int i5 = i3 + 1;
        if (charSequence.charAt(i5) != 'x' && charSequence.charAt(i5) != 'X' && charSequence.charAt(i5) != ' ') {
            return c9238G7tA01;
        }
        return new C9238G7t((char) (c9238G7tA01.A00 + 'd'), i4 - i, i2);
    }

    public C9229G7k(char[] cArr, int[] iArr, boolean[] zArr, int i, boolean z) {
        super(cArr, iArr, zArr, i);
        this.A00 = z;
    }
}
