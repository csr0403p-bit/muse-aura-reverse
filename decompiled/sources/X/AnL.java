package X;

/* loaded from: classes4.dex */
public final class AnL extends Ab8<C1616Amn> {
    public final InterfaceC1762AqF A00;
    public final BG1 A01;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnL) {
                AnL anL = (AnL) obj;
                if (!C7384Etj.areEqual(this.A00, anL.A00) || !C7384Etj.areEqual(this.A01, anL.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        InterfaceC1762AqF interfaceC1762AqF = this.A00;
        BG1 bg1 = this.A01;
        C1616Amn c1616Amn = new C1616Amn();
        c1616Amn.A01 = bg1;
        c1616Amn.A00 = interfaceC1762AqF;
        return c1616Amn;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return ((AnonymousClass005.A0E(this.A00) + 1237) * 31) + AnonymousClass006.A0D(this.A01);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "stylusHoverIcon";
        BHD bhd = asf.A02;
        bhd.A01("icon", this.A00);
        bhd.A01("overrideDescendants", AnonymousClass001.A0h());
        bhd.A01("touchBoundsExpansion", this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("StylusHoverIconModifierElement(icon=");
        sbA0x.append(this.A00);
        sbA0x.append(", overrideDescendants=");
        sbA0x.append(false);
        sbA0x.append(", touchBoundsExpansion=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AnM anM = (AnM) abstractC1439Aj8;
        anM.A03(this.A00);
        anM.A01 = this.A01;
    }

    public AnL(InterfaceC1762AqF interfaceC1762AqF, BG1 bg1) {
        this.A00 = interfaceC1762AqF;
        this.A01 = bg1;
    }
}
