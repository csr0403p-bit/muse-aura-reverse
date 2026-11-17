package X;

import androidx.compose.foundation.HoverableNode;

/* renamed from: X.Aoa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1696Aoa extends Ab8<HoverableNode> {
    public final InterfaceC1072AWd A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1696Aoa) && C7384Etj.areEqual(((C1696Aoa) obj).A00, this.A00));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        InterfaceC1072AWd interfaceC1072AWd = this.A00;
        HoverableNode hoverableNode = new HoverableNode();
        hoverableNode.A00 = interfaceC1072AWd;
        return hoverableNode;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0E(this.A00);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "hoverable";
        BHD bhd = asf.A02;
        bhd.A01("interactionSource", this.A00);
        bhd.A01("enabled", AnonymousClass001.A0i());
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        HoverableNode hoverableNode = (HoverableNode) abstractC1439Aj8;
        InterfaceC1072AWd interfaceC1072AWd = this.A00;
        if (C7384Etj.areEqual(hoverableNode.A00, interfaceC1072AWd)) {
            return;
        }
        HoverableNode.A02(hoverableNode);
        hoverableNode.A00 = interfaceC1072AWd;
    }

    public C1696Aoa(InterfaceC1072AWd interfaceC1072AWd) {
        this.A00 = interfaceC1072AWd;
    }
}
