package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ASG extends Ab8<ASI> implements AbD {
    public final G0U<InterfaceC0857A6e, Unit> A00;
    public final boolean A01;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ASG) {
                ASG asg = (ASG) obj;
                if (this.A01 != asg.A01 || this.A00 != asg.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbD
    public final C0919AHv AKL() {
        C0919AHv c0919AHv = new C0919AHv();
        c0919AHv.A01 = this.A01;
        this.A00.invoke(c0919AHv);
        return c0919AHv;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        boolean z = this.A01;
        G0U<InterfaceC0857A6e, Unit> g0u = this.A00;
        ASI asi = new ASI();
        asi.A02 = z;
        asi.A01 = false;
        asi.A00 = g0u;
        return asi;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, C0KA.A02(this.A01));
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "semantics";
        asf.A02.A01("mergeDescendants", Boolean.valueOf(this.A01));
        ARD.A02(asf, AKL());
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ASI asi = (ASI) abstractC1439Aj8;
        asi.A02 = this.A01;
        asi.A00 = this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ASG(boolean z, G0U<? super InterfaceC0857A6e, Unit> g0u) {
        this.A01 = z;
        this.A00 = g0u;
    }
}
