package X;

/* loaded from: classes4.dex */
public final class AnN extends Ab8<C1617Amo> {
    public final InterfaceC1762AqF A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnN) && C7384Etj.areEqual(this.A00, ((AnN) obj).A00));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        InterfaceC1762AqF interfaceC1762AqF = this.A00;
        C1617Amo c1617Amo = new C1617Amo();
        c1617Amo.A01 = null;
        c1617Amo.A00 = interfaceC1762AqF;
        return c1617Amo;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0E(this.A00) + 1237;
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "pointerHoverIcon";
        BHD bhd = asf.A02;
        bhd.A01("icon", this.A00);
        bhd.A01("overrideDescendants", AnonymousClass001.A0h());
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("PointerHoverIconModifierElement(icon=");
        sbA0x.append(this.A00);
        sbA0x.append(", overrideDescendants=");
        sbA0x.append(false);
        return AnonymousClass006.A0z(sbA0x);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ((AnM) abstractC1439Aj8).A03(this.A00);
    }

    public AnN(InterfaceC1762AqF interfaceC1762AqF) {
        this.A00 = interfaceC1762AqF;
    }
}
