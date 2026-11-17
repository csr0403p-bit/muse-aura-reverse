package X;

/* loaded from: classes4.dex */
public final class Au6 extends Ab8<C2017AwV> {
    public final InterfaceC1866Asg A00;

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        InterfaceC1866Asg interfaceC1866Asg = this.A00;
        C2017AwV c2017AwV = new C2017AwV();
        c2017AwV.A00 = interfaceC1866Asg;
        return c2017AwV;
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Au6) && C7384Etj.areEqual(this.A00, ((Au6) obj).A00);
        }
        return true;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "bringIntoViewRequester";
        asf.A02.A01("bringIntoViewRequester", this.A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ((C2017AwV) abstractC1439Aj8).A00(this.A00);
    }

    public Au6(InterfaceC1866Asg interfaceC1866Asg) {
        this.A00 = interfaceC1866Asg;
    }
}
