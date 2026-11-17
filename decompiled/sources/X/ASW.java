package X;

/* loaded from: classes4.dex */
public final class ASW extends Ab8<ASX> {
    public final C1518AkS A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ASW) && C7384Etj.areEqual(this.A00, ((ASW) obj).A00));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        C1518AkS c1518AkS = this.A00;
        ASX asx = new ASX();
        asx.A00 = c1518AkS;
        return asx;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "focusRequester";
        asf.A02.A01("focusRequester", this.A00);
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("FocusRequesterElement(focusRequester="));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ASX asx = (ASX) abstractC1439Aj8;
        asx.A00.A00.A0I(asx);
        C1518AkS c1518AkS = this.A00;
        asx.A00 = c1518AkS;
        c1518AkS.A00.A0G(asx);
    }

    public ASW(C1518AkS c1518AkS) {
        this.A00 = c1518AkS;
    }
}
