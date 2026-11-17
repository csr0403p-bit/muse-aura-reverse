package X;

/* loaded from: classes6.dex */
public final class HWA {
    public final C1822Arm A00;
    public final C1822Arm A01;
    public final C1822Arm A02;
    public final C1822Arm A03;
    public final C1822Arm A04;
    public final C1822Arm A05;
    public final C1822Arm A06;
    public final C1822Arm A07;
    public final C1822Arm A08;
    public final C1822Arm A09;
    public final C1822Arm A0A;
    public final C1822Arm A0B;
    public final C1822Arm A0C;
    public final C1822Arm A0D;
    public final C1822Arm A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HWA) {
                HWA hwa = (HWA) obj;
                if (!this.A03.equals(hwa.A03) || !this.A04.equals(hwa.A04) || !this.A05.equals(hwa.A05) || !C7384Etj.areEqual(this.A06, hwa.A06) || !this.A07.equals(hwa.A07) || !C7384Etj.areEqual(this.A08, hwa.A08) || !C7384Etj.areEqual(this.A0C, hwa.A0C) || !C7384Etj.areEqual(this.A0D, hwa.A0D) || !C7384Etj.areEqual(this.A0E, hwa.A0E) || !C7384Etj.areEqual(this.A00, hwa.A00) || !C7384Etj.areEqual(this.A01, hwa.A01) || !this.A02.equals(hwa.A02) || !C7384Etj.areEqual(this.A09, hwa.A09) || !C7384Etj.areEqual(this.A0A, hwa.A0A) || !this.A0B.equals(hwa.A0B)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HWA() {
        C1822Arm c1822Arm = null;
        this(c1822Arm, c1822Arm, c1822Arm, c1822Arm, c1822Arm, c1822Arm, c1822Arm, c1822Arm, c1822Arm, 32767);
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A0B, AnonymousClass005.A0F(this.A0A, AnonymousClass005.A0F(this.A09, AnonymousClass005.A0F(this.A02, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0F(this.A00, AnonymousClass005.A0F(this.A0E, AnonymousClass005.A0F(this.A0D, AnonymousClass005.A0F(this.A0C, AnonymousClass005.A0F(this.A08, AnonymousClass005.A0F(this.A07, AnonymousClass005.A0F(this.A06, AnonymousClass005.A0F(this.A05, AnonymousClass005.A0F(this.A04, AnonymousClass005.A0E(this.A03)))))))))))))));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Typography(displayLarge=");
        sbA0x.append(this.A03);
        sbA0x.append(", displayMedium=");
        sbA0x.append(this.A04);
        sbA0x.append(",displaySmall=");
        sbA0x.append(this.A05);
        sbA0x.append(", headlineLarge=");
        sbA0x.append(this.A06);
        sbA0x.append(", headlineMedium=");
        sbA0x.append(this.A07);
        sbA0x.append(", headlineSmall=");
        sbA0x.append(this.A08);
        sbA0x.append(", titleLarge=");
        sbA0x.append(this.A0C);
        sbA0x.append(", titleMedium=");
        sbA0x.append(this.A0D);
        sbA0x.append(", titleSmall=");
        sbA0x.append(this.A0E);
        sbA0x.append(", bodyLarge=");
        sbA0x.append(this.A00);
        sbA0x.append(", bodyMedium=");
        sbA0x.append(this.A01);
        sbA0x.append(", bodySmall=");
        sbA0x.append(this.A02);
        sbA0x.append(", labelLarge=");
        sbA0x.append(this.A09);
        sbA0x.append(", labelMedium=");
        sbA0x.append(this.A0A);
        sbA0x.append(", labelSmall=");
        return AnonymousClass007.A0Z(this.A0B, sbA0x);
    }

    public /* synthetic */ HWA(C1822Arm c1822Arm, C1822Arm c1822Arm2, C1822Arm c1822Arm3, C1822Arm c1822Arm4, C1822Arm c1822Arm5, C1822Arm c1822Arm6, C1822Arm c1822Arm7, C1822Arm c1822Arm8, C1822Arm c1822Arm9, int i) {
        C1822Arm c1822Arm10 = c1822Arm;
        C1822Arm c1822Arm11 = c1822Arm2;
        C1822Arm c1822Arm12 = c1822Arm3;
        C1822Arm c1822Arm13 = c1822Arm4;
        C1822Arm c1822Arm14 = c1822Arm5;
        C1822Arm c1822Arm15 = c1822Arm6;
        C1822Arm c1822Arm16 = c1822Arm7;
        C1822Arm c1822Arm17 = c1822Arm8;
        C1822Arm c1822Arm18 = c1822Arm9;
        C1822Arm c1822Arm19 = AbstractC10404HbL.A03;
        C1822Arm c1822Arm20 = AbstractC10404HbL.A04;
        C1822Arm c1822Arm21 = AbstractC10404HbL.A05;
        c1822Arm10 = (i & 8) != 0 ? AbstractC10404HbL.A06 : c1822Arm10;
        C1822Arm c1822Arm22 = AbstractC10404HbL.A07;
        c1822Arm11 = (i & 32) != 0 ? AbstractC10404HbL.A08 : c1822Arm11;
        c1822Arm12 = (i & 64) != 0 ? AbstractC10404HbL.A0C : c1822Arm12;
        c1822Arm13 = (i & 128) != 0 ? AbstractC10404HbL.A0D : c1822Arm13;
        c1822Arm14 = (i & 256) != 0 ? AbstractC10404HbL.A0E : c1822Arm14;
        c1822Arm15 = (i & 512) != 0 ? AbstractC10404HbL.A00 : c1822Arm15;
        c1822Arm16 = (i & 1024) != 0 ? AbstractC10404HbL.A01 : c1822Arm16;
        C1822Arm c1822Arm23 = AbstractC10404HbL.A02;
        c1822Arm17 = (i & 4096) != 0 ? AbstractC10404HbL.A09 : c1822Arm17;
        c1822Arm18 = (i & 8192) != 0 ? AbstractC10404HbL.A0A : c1822Arm18;
        C1822Arm c1822Arm24 = AbstractC10404HbL.A0B;
        this.A03 = c1822Arm19;
        this.A04 = c1822Arm20;
        this.A05 = c1822Arm21;
        this.A06 = c1822Arm10;
        this.A07 = c1822Arm22;
        this.A08 = c1822Arm11;
        this.A0C = c1822Arm12;
        this.A0D = c1822Arm13;
        this.A0E = c1822Arm14;
        this.A00 = c1822Arm15;
        this.A01 = c1822Arm16;
        this.A02 = c1822Arm23;
        this.A09 = c1822Arm17;
        this.A0A = c1822Arm18;
        this.A0B = c1822Arm24;
    }
}
