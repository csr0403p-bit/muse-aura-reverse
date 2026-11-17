package X;

import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;

/* renamed from: X.AwV, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2017AwV extends AbstractC1439Aj8 {
    public InterfaceC1866Asg A00;

    public final void A00(InterfaceC1866Asg interfaceC1866Asg) {
        InterfaceC1866Asg interfaceC1866Asg2 = this.A00;
        if (interfaceC1866Asg2 instanceof BringIntoViewRequesterImpl) {
            C7384Etj.A0Z(interfaceC1866Asg2, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((BringIntoViewRequesterImpl) interfaceC1866Asg2).A00.A0I(this);
        }
        if (interfaceC1866Asg instanceof BringIntoViewRequesterImpl) {
            ((BringIntoViewRequesterImpl) interfaceC1866Asg).A00.A0G(this);
        }
        this.A00 = interfaceC1866Asg;
    }

    @Override // X.AbstractC1439Aj8
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        A00(this.A00);
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        InterfaceC1866Asg interfaceC1866Asg = this.A00;
        if (interfaceC1866Asg instanceof BringIntoViewRequesterImpl) {
            C7384Etj.A0Z(interfaceC1866Asg, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((BringIntoViewRequesterImpl) interfaceC1866Asg).A00.A0I(this);
        }
    }
}
