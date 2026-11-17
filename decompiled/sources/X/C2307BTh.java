package X;

import androidx.compose.foundation.gestures.AnchoredDraggableNode;
import androidx.compose.foundation.gestures.FlingCancellationException;
import androidx.compose.foundation.gestures.ScrollingLogic;

/* renamed from: X.BTh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2307BTh implements C3Q0 {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public C2307BTh(int i, AnchoredDraggableNode<T> anchoredDraggableNode, AcX acX) {
        this.$t = i;
        this.A01 = acX;
        this.A00 = anchoredDraggableNode;
    }

    @Override // X.C3Q0
    public final float AcG(float f) {
        if (this.$t == 0) {
            AnchoredDraggableNode anchoredDraggableNode = (AnchoredDraggableNode) this.A01;
            float fA02 = anchoredDraggableNode.A00.A02(f);
            float fAFn = fA02 - anchoredDraggableNode.A00.A08.AFn();
            ((AcX) this.A00).A9C(fA02, 0.0f);
            return fAFn;
        }
        if (Math.abs(f) != 0.0f && !AnonymousClass003.A1Y(((ScrollingLogic) this.A01).A0B)) {
            throw new FlingCancellationException();
        }
        ScrollingLogic scrollingLogic = (ScrollingLogic) this.A01;
        float fA022 = scrollingLogic.A02(((InterfaceC1258Afu) this.A00).AcH(scrollingLogic.A05(scrollingLogic.A04(f)), 2));
        return ScrollingLogic.A00(scrollingLogic, fA022, fA022);
    }
}
