package X;

/* loaded from: classes4.dex */
public final class Au7 extends Ab8<C2037Awr> {
    public final InterfaceC2163Azt A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof Au7) && C7384Etj.areEqual(this.A00, ((Au7) obj).A00));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        InterfaceC2163Azt interfaceC2163Azt = this.A00;
        C2037Awr c2037Awr = new C2037Awr();
        c2037Awr.A00 = interfaceC2163Azt;
        return c2037Awr;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "focusProperties";
        asf.A02.A01("scope", this.A00);
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("FocusPropertiesElement(scope="));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ((C2037Awr) abstractC1439Aj8).A00 = this.A00;
    }

    public Au7(InterfaceC2163Azt interfaceC2163Azt) {
        this.A00 = interfaceC2163Azt;
    }
}
