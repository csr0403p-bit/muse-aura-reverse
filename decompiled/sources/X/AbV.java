package X;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableNode;
import androidx.compose.foundation.gestures.AnchoredDraggableState;

/* loaded from: classes4.dex */
public final class AbV<T> extends Ab8<AnchoredDraggableNode<T>> {
    public final AnchoredDraggableState<T> A00;
    public final EnumC1108AYu A01;
    public final InterfaceC1072AWd A02;
    public final Boolean A03;
    public final boolean A04;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AbV) {
                AbV abV = (AbV) obj;
                if (!C7384Etj.areEqual(this.A00, abV.A00) || this.A01 != abV.A01 || this.A04 != abV.A04 || !C7384Etj.areEqual(this.A02, abV.A02) || !C7384Etj.areEqual(this.A03, abV.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        boolean z;
        AnchoredDraggableNode anchoredDraggableNode = (AnchoredDraggableNode) abstractC1439Aj8;
        AnchoredDraggableState<T> anchoredDraggableState = this.A00;
        EnumC1108AYu enumC1108AYu = this.A01;
        boolean z2 = this.A04;
        InterfaceC1072AWd interfaceC1072AWd = this.A02;
        Boolean bool = this.A03;
        if (C7384Etj.areEqual(anchoredDraggableNode.A00, anchoredDraggableState)) {
            z = false;
        } else {
            anchoredDraggableNode.A00 = anchoredDraggableState;
            AnchoredDraggableNode.A01(anchoredDraggableNode);
            z = true;
        }
        if (anchoredDraggableNode.A02 != enumC1108AYu) {
            anchoredDraggableNode.A02 = enumC1108AYu;
            z = true;
        }
        anchoredDraggableNode.A04 = bool;
        anchoredDraggableNode.A0M(enumC1108AYu, interfaceC1072AWd, anchoredDraggableNode.A09, z2, z);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        AnchoredDraggableState<T> anchoredDraggableState = this.A00;
        EnumC1108AYu enumC1108AYu = this.A01;
        boolean z = this.A04;
        InterfaceC1072AWd interfaceC1072AWd = this.A02;
        Boolean bool = this.A03;
        AnchoredDraggableNode anchoredDraggableNode = new AnchoredDraggableNode(enumC1108AYu, interfaceC1072AWd, AnchoredDraggableKt.A01, z);
        anchoredDraggableNode.A00 = anchoredDraggableState;
        anchoredDraggableNode.A02 = enumC1108AYu;
        anchoredDraggableNode.A04 = bool;
        return anchoredDraggableNode;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return ((((C0KA.A01(AnonymousClass005.A0F(this.A01, AnonymousClass005.A0E(this.A00)), this.A04) * 31) + C60R.A01(this.A02)) * 31) + C60R.A01(this.A03)) * 31 * 31;
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "anchoredDraggable";
        BHD bhd = asf.A02;
        bhd.A01("state", this.A00);
        bhd.A01("orientation", this.A01);
        Ab8.A03(bhd, this.A04);
        bhd.A01("reverseDirection", null);
        bhd.A01("interactionSource", this.A02);
        bhd.A01("startDragImmediately", this.A03);
        bhd.A01("overscrollEffect", null);
        bhd.A01("flingBehavior", null);
    }

    public AbV(AnchoredDraggableState anchoredDraggableState, EnumC1108AYu enumC1108AYu, InterfaceC1072AWd interfaceC1072AWd, Boolean bool, boolean z) {
        this.A00 = anchoredDraggableState;
        this.A01 = enumC1108AYu;
        this.A04 = z;
        this.A02 = interfaceC1072AWd;
        this.A03 = bool;
    }
}
