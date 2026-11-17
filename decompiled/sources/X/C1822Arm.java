package X;

/* renamed from: X.Arm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1822Arm {
    public static final C1822Arm A03;
    public final C1818Arh A00;
    public final C1831Arv A01;
    public final C1824Aro A02;

    static {
        long j = B6A.A07;
        long j2 = C1809ArT.A01;
        A03 = new C1822Arm(null, null, null, 0, 0, j, j2, j2, j, j2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1822Arm) {
                C1822Arm c1822Arm = (C1822Arm) obj;
                if (!this.A02.equals(c1822Arm.A02) || !this.A00.equals(c1822Arm.A00) || !C7384Etj.areEqual(this.A01, c1822Arm.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C1822Arm A00(C1831Arv c1831Arv, C1822Arm c1822Arm, AbstractC1996Aw5 abstractC1996Aw5, B0A b0a, C1736ApY c1736ApY, C1804ArN c1804ArN, BG3 bg3, C1810ArU c1810ArU, As2 as2, String str, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4) {
        C1831Arv c1831Arv2 = c1831Arv;
        C1804ArN c1804ArN2 = c1804ArN;
        As2 as22 = as2;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        long j5 = j2;
        C1736ApY c1736ApY2 = c1736ApY;
        B0A b0a2 = b0a;
        AbstractC1996Aw5 abstractC1996Aw52 = abstractC1996Aw5;
        String str2 = str;
        long j6 = j3;
        BG3 bg32 = bg3;
        long j7 = j4;
        C1810ArU c1810ArU2 = c1810ArU;
        if ((i4 & 1) != 0) {
            j = c1822Arm.A02.A0D.ADn();
        }
        if ((i4 & 2) != 0) {
            j5 = c1822Arm.A02.A01;
        }
        if ((i4 & 4) != 0) {
            c1736ApY2 = c1822Arm.A02.A09;
        }
        if ((i4 & 8) != 0) {
            b0a2 = c1822Arm.A02.A07;
        }
        C1824Aro c1824Aro = c1822Arm.A02;
        B0I b0i = c1824Aro.A08;
        if ((i4 & 32) != 0) {
            abstractC1996Aw52 = c1824Aro.A06;
        }
        if ((i4 & 64) != 0) {
            str2 = c1824Aro.A0F;
        }
        if ((i4 & 128) != 0) {
            j6 = c1824Aro.A02;
        }
        ArS arS = c1824Aro.A0B;
        C1807ArQ c1807ArQ = c1824Aro.A0E;
        C0874AGa c0874AGa = c1824Aro.A0A;
        long j8 = c1824Aro.A00;
        if ((i4 & 4096) != 0) {
            bg32 = c1824Aro.A0C;
        }
        C1780Aqg c1780Aqg = c1824Aro.A03;
        C16b c16b = c1824Aro.A04;
        if ((i4 & 32768) != 0) {
            i5 = c1822Arm.A00.A02;
        }
        if ((i4 & 65536) != 0) {
            i6 = c1822Arm.A00.A03;
        }
        if ((i4 & 131072) != 0) {
            j7 = c1822Arm.A00.A04;
        }
        if ((i4 & 262144) != 0) {
            c1810ArU2 = c1822Arm.A00.A07;
        }
        if ((i4 & 524288) != 0) {
            c1831Arv2 = c1822Arm.A01;
        }
        if ((i4 & 1048576) != 0) {
            c1804ArN2 = c1822Arm.A00.A06;
        }
        if ((i4 & 2097152) != 0) {
            i7 = c1822Arm.A00.A01;
        }
        C1818Arh c1818Arh = c1822Arm.A00;
        int i8 = c1818Arh.A00;
        if ((i4 & 8388608) != 0) {
            as22 = c1818Arh.A08;
        }
        InterfaceC1829Art interfaceC1829ArtA00 = c1824Aro.A0D;
        long jADn = interfaceC1829ArtA00.ADn();
        long j9 = B6A.A01;
        if (j != jADn) {
            interfaceC1829ArtA00 = InterfaceC1829Art.A00(j);
        }
        return new C1822Arm(new C1818Arh(c1831Arv2 != null ? c1831Arv2.A00 : null, c1804ArN2, c1810ArU2, as22, i5, i6, i7, i8, j7), c1831Arv2, new C1824Aro(c1780Aqg, c16b, c1831Arv2 != null ? c1831Arv2.A01 : null, abstractC1996Aw52, b0a2, b0i, c1736ApY2, c0874AGa, arS, bg32, interfaceC1829ArtA00, c1807ArQ, str2, j5, j6, j8));
    }

    public static final C1822Arm A01(C1822Arm c1822Arm, AbstractC1996Aw5 abstractC1996Aw5, B0A b0a, C1736ApY c1736ApY, BG3 bg3, C1810ArU c1810ArU, As2 as2, int i, int i2, long j, long j2, long j3, long j4, long j5) {
        C1824Aro c1824Aro = c1822Arm.A02;
        C1824Aro c1824AroA01 = AbstractC1825Arp.A01(null, null, null, null, c1824Aro, abstractC1996Aw5, b0a, null, c1736ApY, null, null, bg3, null, null, Float.NaN, j, j2, j3, j4);
        C1818Arh c1818Arh = c1822Arm.A00;
        C1818Arh c1818ArhA00 = AbstractC1816Arf.A00(c1818Arh, null, null, c1810ArU, as2, i, 0, i2, 0, j5);
        return (c1824Aro == c1824AroA01 && c1818Arh == c1818ArhA00) ? c1822Arm : new C1822Arm(c1818ArhA00, c1824AroA01);
    }

    public final C1822Arm A02(C1822Arm c1822Arm) {
        if (c1822Arm == null || c1822Arm.equals(A03)) {
            return this;
        }
        return new C1822Arm(this.A00.A01(c1822Arm.A00), this.A02.A03(c1822Arm.A02));
    }

    public final boolean A03(C1822Arm c1822Arm) {
        if (this != c1822Arm) {
            return this.A00.equals(c1822Arm.A00) && this.A02.A04(c1822Arm.A02);
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A00, AnonymousClass005.A0E(this.A02)) + C60R.A01(this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TextStyle(color=");
        C1824Aro c1824Aro = this.A02;
        InterfaceC1829Art interfaceC1829Art = c1824Aro.A0D;
        AnonymousClass005.A0m(interfaceC1829Art.ADn(), sbA0x);
        C1824Aro.A02(c1824Aro, interfaceC1829Art, sbA0x);
        AnonymousClass005.A0m(c1824Aro.A00, sbA0x);
        sbA0x.append(", textDecoration=");
        sbA0x.append(c1824Aro.A0C);
        sbA0x.append(", shadow=");
        sbA0x.append(c1824Aro.A03);
        sbA0x.append(", drawStyle=");
        sbA0x.append(c1824Aro.A04);
        sbA0x.append(", textAlign=");
        C1818Arh c1818Arh = this.A00;
        C1818Arh.A00(c1818Arh, sbA0x);
        C1811ArV.A01(c1818Arh, this.A01, sbA0x);
        return AnonymousClass007.A0Z(c1818Arh.A08, sbA0x);
    }

    public C1822Arm(C1818Arh c1818Arh, C1831Arv c1831Arv, C1824Aro c1824Aro) {
        this.A02 = c1824Aro;
        this.A00 = c1818Arh;
        this.A01 = c1831Arv;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1822Arm(C1818Arh c1818Arh, C1824Aro c1824Aro) {
        C1831Arv c1831Arv;
        C1848AsL c1848AsL = c1824Aro.A05;
        C1830Aru c1830Aru = c1818Arh.A05;
        if (c1848AsL == null && c1830Aru == null) {
            c1831Arv = null;
        } else {
            c1831Arv = new C1831Arv(c1830Aru, c1848AsL);
        }
        this(c1818Arh, c1831Arv, c1824Aro);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1822Arm(C1831Arv c1831Arv, AbstractC1996Aw5 abstractC1996Aw5, C1736ApY c1736ApY, int i, int i2, long j, long j2, long j3, long j4, long j5) {
        C1848AsL c1848AsL;
        if (c1831Arv != null) {
            c1848AsL = c1831Arv.A01;
        } else {
            c1848AsL = null;
        }
        this(new C1818Arh(c1831Arv != null ? c1831Arv.A00 : null, null, null, null, i, i2, 0, 0, j5), c1831Arv, new C1824Aro(null, c1848AsL, abstractC1996Aw5, null, null, c1736ApY, null, null, null, null, null, j, j2, j3, j4));
    }
}
