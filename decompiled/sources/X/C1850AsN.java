package X;

/* renamed from: X.AsN, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1850AsN extends Ab8<C1851AsO> {
    public final C1822Arm A00;

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return new C1851AsO(this.A00);
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1850AsN) {
            return C7384Etj.areEqual(this.A00, ((C1850AsN) obj).A00);
        }
        return false;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "textFieldMinSize";
        asf.A02.A01("style", this.A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1851AsO c1851AsO = (C1851AsO) abstractC1439Aj8;
        C1822Arm c1822ArmA01 = AbstractC1823Arn.A01(this.A00, AbstractC1414Aij.A04(c1851AsO).A0G);
        C1851AsO.A00(c1851AsO, c1822ArmA01, (C2K7) ARZ.A01(Am0.A06, c1851AsO));
        C1854AsR c1854AsR = c1851AsO.A00;
        if (c1854AsR == null) {
            throw C60O.A0i("Min size state is not set.");
        }
        C1854AsR.A00(c1854AsR, c1822ArmA01, null, null, 23);
        AbstractC1339AhQ.A00(c1851AsO);
    }

    public C1850AsN(C1822Arm c1822Arm) {
        this.A00 = c1822Arm;
    }
}
