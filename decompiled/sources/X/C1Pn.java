package X;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import kotlin.Unit;

/* renamed from: X.1Pn, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Pn {
    public AnchoredDraggableState<C1Vj> A00;
    public final boolean A01;
    public final boolean A02;

    public final Object A00(HtJ<? super Unit> htJ) {
        if (this.A02) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        C1Vj c1Vj = C1Vj.Hidden;
        AnchoredDraggableState<C1Vj> anchoredDraggableState = this.A00;
        Object objA00 = AnchoredDraggableKt.A00(anchoredDraggableState, c1Vj, htJ, anchoredDraggableState.A04.AFn());
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        if (objA00 != enumC10460Hji) {
            objA00 = Unit.INSTANCE;
        }
        return objA00 != enumC10460Hji ? Unit.INSTANCE : objA00;
    }

    public final Object A01(HtJ<? super Unit> htJ) {
        if (this.A01) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        C1Vj c1Vj = C1Vj.PartiallyExpanded;
        AnchoredDraggableState<C1Vj> anchoredDraggableState = this.A00;
        Object objA00 = AnchoredDraggableKt.A00(anchoredDraggableState, c1Vj, htJ, anchoredDraggableState.A04.AFn());
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        if (objA00 != enumC10460Hji) {
            objA00 = Unit.INSTANCE;
        }
        return objA00 != enumC10460Hji ? Unit.INSTANCE : objA00;
    }

    public final boolean A02() {
        return AnonymousClass006.A1Z(this.A00.A07.getValue(), C1Vj.Hidden);
    }

    /* JADX WARN: Incorrect types in method signature: (ZLX/AXN;LX/1Vj;LX/G0U<-LX/1Vj;Ljava/lang/Boolean;>;Z)V */
    public C1Pn(C1Vj c1Vj, AXN axn, G0U g0u, boolean z, boolean z2) {
        this.A01 = z;
        this.A02 = z2;
        if (z && c1Vj == C1Vj.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (z2 && c1Vj == C1Vj.Hidden) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.A00 = new AnchoredDraggableState<>(C1AP.A00, c1Vj, new C05453br(axn, 9), new C05463bs(axn, 18), g0u);
    }
}
