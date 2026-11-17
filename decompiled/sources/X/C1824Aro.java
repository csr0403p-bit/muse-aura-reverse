package X;

/* renamed from: X.Aro, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1824Aro implements C1OS {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C1780Aqg A03;
    public final C16b A04;
    public final C1848AsL A05;
    public final AbstractC1996Aw5 A06;
    public final B0A A07;
    public final B0I A08;
    public final C1736ApY A09;
    public final C0874AGa A0A;
    public final ArS A0B;
    public final BG3 A0C;
    public final InterfaceC1829Art A0D;
    public final C1807ArQ A0E;
    public final String A0F;

    public C1824Aro(C1780Aqg c1780Aqg, C1848AsL c1848AsL, AbstractC1996Aw5 abstractC1996Aw5, B0A b0a, B0I b0i, C1736ApY c1736ApY, C0874AGa c0874AGa, ArS arS, BG3 bg3, C1807ArQ c1807ArQ, String str, long j, long j2, long j3, long j4) {
        this(c1780Aqg, null, c1848AsL, abstractC1996Aw5, b0a, b0i, c1736ApY, c0874AGa, arS, bg3, InterfaceC1829Art.A00(j), c1807ArQ, str, j2, j3, j4);
    }

    public final boolean A04(C1824Aro c1824Aro) {
        if (this != c1824Aro) {
            long j = this.A01;
            long j2 = c1824Aro.A01;
            C1813ArX[] c1813ArXArr = C1809ArT.A02;
            if (AnonymousClass002.A1M((j > j2 ? 1 : (j == j2 ? 0 : -1))) && C7384Etj.areEqual(this.A09, c1824Aro.A09) && C7384Etj.areEqual(this.A07, c1824Aro.A07) && C7384Etj.areEqual(this.A08, c1824Aro.A08) && C7384Etj.areEqual(this.A06, c1824Aro.A06) && C7384Etj.areEqual(this.A0F, c1824Aro.A0F) && this.A02 == c1824Aro.A02 && C7384Etj.areEqual(this.A0B, c1824Aro.A0B) && C7384Etj.areEqual(this.A0E, c1824Aro.A0E) && C7384Etj.areEqual(this.A0A, c1824Aro.A0A)) {
                long j3 = this.A00;
                long j4 = c1824Aro.A00;
                long j5 = B6A.A01;
                if (j3 != j4 || !C7384Etj.areEqual(this.A05, c1824Aro.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1824Aro) {
                C1824Aro c1824Aro = (C1824Aro) obj;
                if (!A04(c1824Aro) || !A05(c1824Aro)) {
                }
            }
            return false;
        }
        return true;
    }

    public static int A00(C1824Aro c1824Aro) {
        B0A b0a = c1824Aro.A07;
        if (b0a != null) {
            return b0a.A00;
        }
        return 0;
    }

    public static /* synthetic */ C1824Aro A01(C1824Aro c1824Aro, int i, long j, long j2) {
        long j3 = j2;
        if ((i & 1) != 0) {
            j = c1824Aro.A0D.ADn();
        }
        long j4 = c1824Aro.A01;
        C1736ApY c1736ApY = c1824Aro.A09;
        B0A b0a = c1824Aro.A07;
        B0I b0i = c1824Aro.A08;
        AbstractC1996Aw5 abstractC1996Aw5 = (i & 32) != 0 ? c1824Aro.A06 : null;
        String str = c1824Aro.A0F;
        long j5 = c1824Aro.A02;
        ArS arS = c1824Aro.A0B;
        C1807ArQ c1807ArQ = c1824Aro.A0E;
        C0874AGa c0874AGa = c1824Aro.A0A;
        if ((i & 2048) != 0) {
            j3 = c1824Aro.A00;
        }
        BG3 bg3 = c1824Aro.A0C;
        C1780Aqg c1780Aqg = c1824Aro.A03;
        C1848AsL c1848AsL = c1824Aro.A05;
        C16b c16b = c1824Aro.A04;
        InterfaceC1829Art interfaceC1829ArtA00 = c1824Aro.A0D;
        long jADn = interfaceC1829ArtA00.ADn();
        long j6 = B6A.A01;
        if (j != jADn) {
            interfaceC1829ArtA00 = InterfaceC1829Art.A00(j);
        }
        return new C1824Aro(c1780Aqg, c16b, c1848AsL, abstractC1996Aw5, b0a, b0i, c1736ApY, c0874AGa, arS, bg3, interfaceC1829ArtA00, c1807ArQ, str, j4, j5, j3);
    }

    public static void A02(C1824Aro c1824Aro, InterfaceC1829Art interfaceC1829Art, StringBuilder sb) {
        sb.append(", brush=");
        sb.append(interfaceC1829Art.AD4());
        sb.append(", alpha=");
        sb.append(interfaceC1829Art.getAlpha());
        sb.append(", fontSize=");
        sb.append((Object) C1809ArT.A02(c1824Aro.A01));
        sb.append(", fontWeight=");
        sb.append(c1824Aro.A09);
        sb.append(", fontStyle=");
        sb.append(c1824Aro.A07);
        sb.append(", fontSynthesis=");
        sb.append(c1824Aro.A08);
        sb.append(", fontFamily=");
        sb.append(c1824Aro.A06);
        sb.append(", fontFeatureSettings=");
        sb.append(c1824Aro.A0F);
        sb.append(AbstractC7606F5t.A00(19));
        sb.append((Object) C1809ArT.A02(c1824Aro.A02));
        sb.append(", baselineShift=");
        sb.append(c1824Aro.A0B);
        sb.append(", textGeometricTransform=");
        sb.append(c1824Aro.A0E);
        sb.append(", localeList=");
        sb.append(c1824Aro.A0A);
        sb.append(", background=");
    }

    public final C1824Aro A03(C1824Aro c1824Aro) {
        if (c1824Aro == null) {
            return this;
        }
        InterfaceC1829Art interfaceC1829Art = c1824Aro.A0D;
        long jADn = interfaceC1829Art.ADn();
        C1EQ c1eqAD4 = interfaceC1829Art.AD4();
        float alpha = interfaceC1829Art.getAlpha();
        long j = c1824Aro.A01;
        C1736ApY c1736ApY = c1824Aro.A09;
        B0A b0a = c1824Aro.A07;
        B0I b0i = c1824Aro.A08;
        AbstractC1996Aw5 abstractC1996Aw5 = c1824Aro.A06;
        String str = c1824Aro.A0F;
        long j2 = c1824Aro.A02;
        ArS arS = c1824Aro.A0B;
        C1807ArQ c1807ArQ = c1824Aro.A0E;
        C0874AGa c0874AGa = c1824Aro.A0A;
        long j3 = c1824Aro.A00;
        BG3 bg3 = c1824Aro.A0C;
        return AbstractC1825Arp.A01(c1eqAD4, c1824Aro.A03, c1824Aro.A04, c1824Aro.A05, this, abstractC1996Aw5, b0a, b0i, c1736ApY, c0874AGa, arS, bg3, c1807ArQ, str, alpha, jADn, j, j2, j3);
    }

    public final boolean A05(C1824Aro c1824Aro) {
        return C7384Etj.areEqual(this.A0D, c1824Aro.A0D) && C7384Etj.areEqual(this.A0C, c1824Aro.A0C) && C7384Etj.areEqual(this.A03, c1824Aro.A03) && C7384Etj.areEqual(this.A04, c1824Aro.A04);
    }

    public final int hashCode() {
        InterfaceC1829Art interfaceC1829Art = this.A0D;
        long jADn = interfaceC1829Art.ADn();
        long j = B6A.A01;
        int iA02 = AnonymousClass005.A02((AnonymousClass005.A07(jADn) + C60R.A01(interfaceC1829Art.AD4())) * 31, interfaceC1829Art.getAlpha());
        long j2 = this.A01;
        C1813ArX[] c1813ArXArr = C1809ArT.A02;
        int iA06 = (((AnonymousClass006.A06(j2, iA02) + C60R.A01(this.A09)) * 31) + A00(this)) * 31;
        B0I b0i = this.A08;
        int iA01 = (((iA06 + (b0i != null ? b0i.A00 : 0)) * 31) + C60R.A01(this.A06)) * 31;
        String str = this.A0F;
        int iA062 = AnonymousClass006.A06(this.A02, (iA01 + (str != null ? str.hashCode() : 0)) * 31);
        ArS arS = this.A0B;
        return ((((((AnonymousClass006.A06(this.A00, (((((iA062 + (arS != null ? Float.floatToIntBits(arS.A00) : 0)) * 31) + C60R.A01(this.A0E)) * 31) + C60R.A01(this.A0A)) * 31) + C60R.A01(this.A0C)) * 31) + C60R.A01(this.A03)) * 31) + C60R.A01(this.A05)) * 31) + C8j4.A0E(this.A04, 0);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("SpanStyle(color=");
        InterfaceC1829Art interfaceC1829Art = this.A0D;
        AnonymousClass005.A0m(interfaceC1829Art.ADn(), sbA0x);
        A02(this, interfaceC1829Art, sbA0x);
        AnonymousClass005.A0m(this.A00, sbA0x);
        sbA0x.append(", textDecoration=");
        sbA0x.append(this.A0C);
        sbA0x.append(", shadow=");
        sbA0x.append(this.A03);
        sbA0x.append(", platformStyle=");
        sbA0x.append(this.A05);
        sbA0x.append(", drawStyle=");
        return AnonymousClass007.A0Z(this.A04, sbA0x);
    }

    public C1824Aro(C1780Aqg c1780Aqg, C16b c16b, C1848AsL c1848AsL, AbstractC1996Aw5 abstractC1996Aw5, B0A b0a, B0I b0i, C1736ApY c1736ApY, C0874AGa c0874AGa, ArS arS, BG3 bg3, InterfaceC1829Art interfaceC1829Art, C1807ArQ c1807ArQ, String str, long j, long j2, long j3) {
        this.A0D = interfaceC1829Art;
        this.A01 = j;
        this.A09 = c1736ApY;
        this.A07 = b0a;
        this.A08 = b0i;
        this.A06 = abstractC1996Aw5;
        this.A0F = str;
        this.A02 = j2;
        this.A0B = arS;
        this.A0E = c1807ArQ;
        this.A0A = c0874AGa;
        this.A00 = j3;
        this.A0C = bg3;
        this.A03 = c1780Aqg;
        this.A05 = c1848AsL;
        this.A04 = c16b;
    }
}
