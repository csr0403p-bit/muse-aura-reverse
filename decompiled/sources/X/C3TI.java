package X;

import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1;
import androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$drag$2;
import kotlin.Unit;

/* renamed from: X.3TI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3TI extends DragGestureNode {
    public C1Cw A00;
    public EnumC1108AYu A01;
    public G0W<? super C3UX, ? super AWx, ? super HtJ<? super Unit>, ? extends Object> A02;
    public G0W<? super C3UX, ? super Float, ? super HtJ<? super Unit>, ? extends Object> A03;
    public boolean A04;

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final Object A0I(G0V<? super G0U<? super C1257Aft, Unit>, ? super HtJ<? super Unit>, ? extends Object> g0v, HtJ<? super Unit> htJ) {
        C3T8 c3t8 = (C3T8) this.A00;
        Object objA05 = c3t8.A01.A05(C3UY.A03, htJ, new AnchoredDraggableState$draggableState$1$drag$2(c3t8, null, new C05393bl((Object) this, (G0V<? super G0U<? super C1257Aft, Unit>, ? super HtJ<? super Unit>, ? extends Object>) null, (C3TI) g0v, (HtJ<? super C05393bl>) 2)));
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        if (objA05 != enumC10460Hji) {
            objA05 = Unit.INSTANCE;
        }
        return objA05 != enumC10460Hji ? Unit.INSTANCE : objA05;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void A0J(long j) {
        if (!this.isAttached || C7384Etj.areEqual(this.A02, C3US.A00)) {
            return;
        }
        C3UX coroutineScope = getCoroutineScope();
        GAo.A02(C79.A0K, C6ys.A00, new DraggableNode$onDragStarted$1(this, null, j), coroutineScope);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void A0K(C1249Afg c1249Afg) {
        if (!this.isAttached || C7384Etj.areEqual(this.A03, C3US.A01)) {
            return;
        }
        C3UX coroutineScope = getCoroutineScope();
        GAo.A02(C79.A0K, C6ys.A00, new C05393bl((Object) this, (G0V<? super G0U<? super C1257Aft, Unit>, ? super HtJ<? super Unit>, ? extends Object>) null, (C3TI) c1249Afg, (HtJ<? super C05393bl>) 3), coroutineScope);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final boolean A0N() {
        return this.A04;
    }
}
