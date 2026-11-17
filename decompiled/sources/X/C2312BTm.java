package X;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.foundation.HoverableNode;
import androidx.compose.foundation.gestures.AnchoredDraggableNode;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
import androidx.compose.ui.text.font.AndroidFontLoader;
import androidx.compose.ui.text.font.AsyncFontListLoader;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;

/* renamed from: X.BTm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2312BTm extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2312BTm(Object obj, SeekableTransitionState<S> seekableTransitionState, HtJ<? super C2312BTm> htJ) {
        super(seekableTransitionState);
        this.$t = htJ;
        this.A03 = obj;
    }

    public static void A00(Object obj, C2312BTm c2312BTm) {
        c2312BTm.A02 = obj;
        c2312BTm.A00 |= Integer.MIN_VALUE;
    }

    public static void A01(Object obj, C2312BTm c2312BTm) {
        c2312BTm.A03 = obj;
        c2312BTm.A00 |= Integer.MIN_VALUE;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        switch (this.$t) {
            case 0:
                A00(obj, this);
                return SeekableTransitionState.A02((SeekableTransitionState) this.A03, this);
            case 1:
                A00(obj, this);
                return SeekableTransitionState.A03((SeekableTransitionState) this.A03, this);
            case 2:
                A00(obj, this);
                return HoverableNode.A00((HoverableNode) this.A03, this);
            case 3:
                A00(obj, this);
                return AnchoredDraggableNode.A00((AnchoredDraggableNode) this.A03, this, 0.0f);
            case 4:
                A01(obj, this);
                return DragGestureDetectorKt.A03(null, this, 0L);
            case 5:
                A01(obj, this);
                return DragGestureDetectorKt.A05(null, this, null, 0L);
            case 6:
                A00(obj, this);
                return DragGestureNode.A04(null, (DragGestureNode) this.A03, this);
            case 7:
                A01(obj, this);
                return ForEachGestureKt.A00(null, null, this);
            case 8:
                A01(obj, this);
                return ScrollableKt.A00(null, this, 0L);
            case 9:
                A00(obj, this);
                return ((ScrollingLogic) this.A03).A99(0L, this);
            case 10:
                A01(obj, this);
                return TapGestureDetectorKt.A03(null, null, this);
            case 11:
                A00(obj, this);
                return SnapFlingBehavior.A00(null, (SnapFlingBehavior) this.A03, this, null, 0.0f);
            case 12:
                A00(obj, this);
                return ((TransformedTextFieldState) this.A03).A08(null, this);
            case 13:
                A00(obj, this);
                return ((TextFieldSelectionState) this.A03).A0E(this);
            case 14:
                A00(obj, this);
                return ((TextFieldSelectionManager) this.A03).A07(this);
            case 15:
                A00(obj, this);
                return ((AndroidContentCaptureManager) this.A03).A07(this);
            case 16:
                A00(obj, this);
                return ((SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) this.A03).AiT(this, null, 0L);
            case 17:
                A00(obj, this);
                return ((AndroidFontLoader) this.A03).A4y(null, this);
            case 18:
                A00(obj, this);
                return ((AsyncFontListLoader) this.A03).A00(null, this);
            default:
                A00(obj, this);
                return ((FontFamilyResolverImpl) this.A03).AYM(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2312BTm(int i, HtJ<? super C2312BTm> htJ) {
        super(htJ);
        this.$t = i;
    }
}
