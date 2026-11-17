package androidx.compose.foundation.gestures;

import X.AOc;
import X.AXN;
import X.Aa1;
import X.AbstractC1414Aij;
import X.BLD;
import X.BSU;
import X.C2292BSs;
import X.EnumC1108AYu;
import X.G0U;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;

/* loaded from: classes4.dex */
public final class AnchoredDraggableNode<T> extends DragGestureNode {
    public AnchoredDraggableState<T> A00;
    public BLD A01;
    public EnumC1108AYu A02;
    public AXN A03;
    public Boolean A04;

    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(androidx.compose.foundation.gestures.AnchoredDraggableNode r9, X.HtJ r10, float r11) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableNode.A00(androidx.compose.foundation.gestures.AnchoredDraggableNode, X.HtJ, float):java.lang.Object");
    }

    public static final void A01(AnchoredDraggableNode anchoredDraggableNode) {
        AOc<Float> aOc = Aa1.A00;
        G0U<Float, Float> g0u = Aa1.A02;
        AXN axnA08 = AbstractC1414Aij.A08(anchoredDraggableNode);
        anchoredDraggableNode.A03 = axnA08;
        anchoredDraggableNode.A01 = new SnapFlingBehavior(aOc, AnchoredDraggableKt.A00, new BSU(anchoredDraggableNode.A00, C2292BSs.A00(axnA08, 19), g0u, 0));
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        A01(this);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, X.AbstractC1439Aj8
    /* renamed from: onDensityChange */
    public final void onViewConfigurationChange() {
        onViewConfigurationChange();
        if (this.isAttached) {
            AXN axnA08 = AbstractC1414Aij.A08(this);
            AXN axn = this.A03;
            if (axn == null || !axn.equals(axnA08)) {
                this.A03 = axnA08;
                A01(this);
            }
        }
    }
}
