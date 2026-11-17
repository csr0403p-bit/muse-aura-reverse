package X;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* renamed from: X.BTo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2314BTo extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2314BTo(Object obj, DragGestureNode dragGestureNode, HtJ<? super C2314BTo> htJ) {
        super(dragGestureNode);
        this.$t = htJ;
        this.A04 = obj;
    }

    public static void A00(C2314BTo c2314BTo) {
        c2314BTo.A00 |= Integer.MIN_VALUE;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        switch (this.$t) {
            case 0:
                this.A04 = obj;
                A00(this);
                return DragGestureDetectorKt.A04(null, this, 0L);
            case 1:
                this.A03 = obj;
                A00(this);
                return DragGestureNode.A03(null, (DragGestureNode) this.A04, this);
            case 2:
                this.A04 = obj;
                A00(this);
                return ForEachGestureKt.A02(null, this, null);
            case 3:
                this.A03 = obj;
                A00(this);
                return ((LazyListState) this.A04).AcF(null, this, null);
            case 4:
                this.A03 = obj;
                A00(this);
                return ((LazyGridState) this.A04).AcF(null, this, null);
            case 5:
                this.A03 = obj;
                A00(this);
                return ((LazyStaggeredGridState) this.A04).AcF(null, this, null);
            case 6:
                this.A03 = obj;
                A00(this);
                return TextFieldSelectionState.A04((TextFieldSelectionState) this.A04, null, this);
            case 7:
                this.A04 = obj;
                A00(this);
                return SelectionGesturesKt.A03(null, null, null, null, this);
            case 8:
                this.A04 = obj;
                A00(this);
                return SelectionGesturesKt.A01(null, null, null, this);
            case 9:
                this.A03 = obj;
                A00(this);
                return ((AndroidComposeViewAccessibilityDelegateCompat) this.A04).A0R(this);
            default:
                this.A03 = obj;
                A00(this);
                return ((BSP) this.A04).emit(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2314BTo(int i, HtJ<? super C2314BTo> htJ) {
        super(htJ);
        this.$t = i;
    }
}
