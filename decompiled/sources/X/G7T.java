package X;

/* loaded from: classes6.dex */
public final class G7T {
    public final int A00;
    public final int A01;
    public final int A02;
    public final CharSequence A03;
    public final /* synthetic */ C9227G7i A04;

    public final G7T A05(int i) {
        G7T g7t = this;
        while (i != 0) {
            int i2 = g7t.A02 + i;
            if (i2 < g7t.A03.length()) {
                return new G7T(this.A04, g7t.A01, i2, g7t.A00 + i);
            }
            if (g7t.A03() == null) {
                return null;
            }
            int length = g7t.A03.length() - g7t.A02;
            g7t = new G7T(this.A04, g7t.A01 + 1, -1, g7t.A00 + length);
            i -= length;
        }
        return g7t;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && obj.getClass() == getClass() && this.A00 == ((G7T) obj).A00);
    }

    public G7T(C9227G7i c9227G7i, int i, int i2, int i3) {
        this.A04 = c9227G7i;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        CharSequence charSequence = c9227G7i.A01.get(i);
        this.A03 = charSequence;
        if (i2 < -1 || i2 >= charSequence.length()) {
            throw AbstractC7608F5v.A19();
        }
    }

    public final int A01() {
        return this.A00 + (this.A03.length() - this.A02);
    }

    public final Integer A02() {
        CharSequence charSequence = this.A03;
        int i = this.A02;
        for (int iMax = Math.max(i, 0); iMax < charSequence.length(); iMax++) {
            char cCharAt = charSequence.charAt(iMax);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return Integer.valueOf(iMax - i);
            }
        }
        return null;
    }

    public final Integer A03() {
        if (this.A01 + 1 < this.A04.A01.size()) {
            return Integer.valueOf(this.A00 + (this.A03.length() - this.A02));
        }
        return null;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        int i = this.A02;
        CharSequence charSequence = this.A03;
        return FGI.A0N("Position: '", (i == -1 ? C3cG.A0f(charSequence, "\\n") : AbstractC7608F5v.A0c(charSequence, i)).toString(), '\'');
    }

    public static ADq A00(G7T g7t, int i) {
        return new ADq(i, g7t.A01());
    }

    public final G7T A04() {
        Integer numA03 = A03();
        if (numA03 != null) {
            return A05(numA03.intValue() - this.A00);
        }
        return null;
    }
}
