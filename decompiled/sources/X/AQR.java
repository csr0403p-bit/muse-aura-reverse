package X;

/* loaded from: classes4.dex */
public final class AQR extends Ab8<AQN> {
    public final APZ A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AQR) && C7384Etj.areEqual(this.A00, ((AQR) obj).A00));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        APZ apz = this.A00;
        AQN aqn = new AQN();
        aqn.A00 = apz;
        return aqn;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "SharedTransitionScopeRootModifier";
        asf.A02.A01("sharedTransitionScope", this.A00);
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("SharedTransitionScopeRootModifierElement(sharedTransitionScope="));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AQN aqn = (AQN) abstractC1439Aj8;
        APZ apz = this.A00;
        if (!C7384Etj.areEqual(apz, aqn.A00)) {
            AbstractC1441AjA.A00(aqn, apz.A06);
        }
        aqn.A00 = apz;
    }

    public AQR(APZ apz) {
        this.A00 = apz;
    }
}
