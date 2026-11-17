package X;

/* renamed from: X.1YN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1YN implements C19h {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C1YQ A03;
    public final C1Y4 A04;

    @Override // X.C19h
    public final C1YX filter(ApQ apQ) {
        String strSubstring = apQ.A00;
        int length = strSubstring.length();
        int i = this.A00;
        int i2 = 0;
        if (length > i) {
            ADq aDqA0C = ATD.A0C(0, i);
            strSubstring = strSubstring.substring(aDqA0C.A00, aDqA0C.A01 + 1);
        }
        String strA0E = "";
        int i3 = 0;
        while (i2 < strSubstring.length()) {
            int i4 = i3 + 1;
            strA0E = FGI.A0E(strA0E, strSubstring.charAt(i2));
            if (i4 == this.A01 || i3 + 2 == this.A02) {
                strA0E = FGI.A0E(strA0E, this.A04.A00);
            }
            i2++;
            i3 = i4;
        }
        C0881AGi c0881AGi = C0881AGi.A00;
        return new C1YX(new ApQ(strA0E, c0881AGi, c0881AGi), this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.1YQ] */
    public C1YN(C1Y4 c1y4) {
        this.A04 = c1y4;
        String str = c1y4.A01;
        char c = c1y4.A00;
        this.A01 = C7BY.A08(str, c, 0);
        this.A02 = C7BY.A09(str, c, str.length() - 1);
        this.A00 = c1y4.A02.length();
        this.A03 = new InterfaceC2128Ayu() { // from class: X.1YQ
            @Override // X.InterfaceC2128Ayu
            public final int originalToTransformed(int i) {
                C1YN c1yn = this.A00;
                if (i < c1yn.A01) {
                    return i;
                }
                if (i < c1yn.A02) {
                    return i + 1;
                }
                int i2 = c1yn.A00;
                if (i > i2) {
                    i = i2;
                }
                return i + 2;
            }

            @Override // X.InterfaceC2128Ayu
            public final int transformedToOriginal(int i) {
                C1YN c1yn = this.A00;
                if (i <= c1yn.A01 - 1) {
                    return i;
                }
                if (i <= c1yn.A02 - 1) {
                    return i - 1;
                }
                int i2 = c1yn.A00;
                return i > i2 + 1 ? i2 : i - 2;
            }
        };
    }
}
