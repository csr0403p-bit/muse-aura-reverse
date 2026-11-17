package X;

/* loaded from: classes4.dex */
public final class AdD extends Ab8<C1162Acv> {
    public final Acy<?> A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AdD) && C7384Etj.areEqual(this.A00, ((AdD) obj).A00));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        Acy<?> acy = this.A00;
        C1162Acv c1162Acv = new C1162Acv();
        c1162Acv.A00 = acy;
        return c1162Acv;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "DisplayingDisappearingItemsElement";
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("DisplayingDisappearingItemsElement(animator="));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1162Acv c1162Acv = (C1162Acv) abstractC1439Aj8;
        Acy<?> acy = this.A00;
        if (C7384Etj.areEqual(c1162Acv.A00, acy) || !c1162Acv.node.isAttached) {
            return;
        }
        Acy.A02(c1162Acv.A00);
        acy.A02 = c1162Acv;
        c1162Acv.A00 = acy;
    }

    public AdD(Acy<?> acy) {
        this.A00 = acy;
    }
}
