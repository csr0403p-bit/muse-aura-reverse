package X;

import androidx.compose.ui.Alignment;

/* loaded from: classes4.dex */
public final class AYN extends Ab8<AYM> {
    public final float A00;
    public final Alignment A01;
    public final C1423Ais A02;
    public final AVy A03;
    public final ARL A04;
    public final boolean A05 = true;

    public AYN(Alignment alignment, C1423Ais c1423Ais, AVy aVy, ARL arl, float f) {
        this.A03 = aVy;
        this.A01 = alignment;
        this.A04 = arl;
        this.A00 = f;
        this.A02 = c1423Ais;
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AYN) {
                AYN ayn = (AYN) obj;
                if (!C7384Etj.areEqual(this.A03, ayn.A03) || this.A05 != ayn.A05 || !C7384Etj.areEqual(this.A01, ayn.A01) || !C7384Etj.areEqual(this.A04, ayn.A04) || Float.compare(this.A00, ayn.A00) != 0 || !C7384Etj.areEqual(this.A02, ayn.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        AVy aVy = this.A03;
        boolean z = this.A05;
        Alignment alignment = this.A01;
        ARL arl = this.A04;
        float f = this.A00;
        C1423Ais c1423Ais = this.A02;
        AYM aym = new AYM();
        aym.A03 = aVy;
        aym.A05 = z;
        aym.A01 = alignment;
        aym.A04 = arl;
        aym.A00 = f;
        aym.A02 = c1423Ais;
        return aym;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A02(AnonymousClass005.A0F(this.A04, AnonymousClass005.A0F(this.A01, C0KA.A01(AnonymousClass005.A0E(this.A03), this.A05))), this.A00) + AnonymousClass006.A0D(this.A02);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "paint";
        BHD bhd = asf.A02;
        bhd.A01("painter", this.A03);
        bhd.A01("sizeToIntrinsics", Boolean.valueOf(this.A05));
        bhd.A01("alignment", this.A01);
        bhd.A01("contentScale", this.A04);
        bhd.A01("alpha", Float.valueOf(this.A00));
        bhd.A01("colorFilter", this.A02);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("PainterElement(painter=");
        sbA0x.append(this.A03);
        sbA0x.append(", sizeToIntrinsics=");
        sbA0x.append(this.A05);
        sbA0x.append(", alignment=");
        sbA0x.append(this.A01);
        sbA0x.append(C60N.A00(34));
        sbA0x.append(this.A04);
        sbA0x.append(", alpha=");
        sbA0x.append(this.A00);
        sbA0x.append(", colorFilter=");
        return AnonymousClass007.A0Z(this.A02, sbA0x);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AYM aym = (AYM) abstractC1439Aj8;
        boolean z = aym.A05;
        boolean z2 = this.A05;
        boolean z3 = z != z2 || (z2 && aym.A03.mo0getIntrinsicSizeNHjbRc() != this.A03.mo0getIntrinsicSizeNHjbRc());
        aym.A03 = this.A03;
        aym.A05 = z2;
        aym.A01 = this.A01;
        aym.A04 = this.A04;
        aym.A00 = this.A00;
        aym.A02 = this.A02;
        if (z3) {
            AbstractC1339AhQ.A00(aym);
        }
        AaD.A00(aym);
    }
}
