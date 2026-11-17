package X;

/* renamed from: X.AwU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2016AwU implements InterfaceC2106AyW {
    public final C1959Auy A00;
    public final CharSequence A01;

    @Override // X.InterfaceC2106AyW
    public final int ARI(int i) {
        do {
            i = this.A00.A06(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.A01.charAt(i - 1)));
        return i;
    }

    @Override // X.InterfaceC2106AyW
    public final int ARJ(int i) {
        CharSequence charSequence;
        do {
            i = this.A00.A06(i);
            if (i != -1) {
                charSequence = this.A01;
                if (i != charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // X.InterfaceC2106AyW
    public final int AYU(int i) {
        do {
            i = this.A00.A07(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.A01.charAt(i - 1)));
        return i;
    }

    @Override // X.InterfaceC2106AyW
    public final int AYW(int i) {
        do {
            i = this.A00.A07(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.A01.charAt(i)));
        return i;
    }

    public C2016AwU(C1959Auy c1959Auy, CharSequence charSequence) {
        this.A01 = charSequence;
        this.A00 = c1959Auy;
    }
}
