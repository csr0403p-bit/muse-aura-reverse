package X;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.foundation.HoverableNode;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.gestures.NonTouchScrollingLogic;
import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.gestures.TrackpadScrollingLogic;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerWrapperFlingBehavior;
import androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidPlatformTextInputSession;
import androidx.compose.ui.scrollcapture.RelativeScroller;
import com.meta.compose.indication.bouncy.BouncyNode;

/* renamed from: X.BTk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2310BTk extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        switch (this.$t) {
            case 0:
                A00(obj, this);
                return SeekableTransitionState.A01((SeekableTransitionState) this.A02, this);
            case 1:
                A00(obj, this);
                return HoverableNode.A01((HoverableNode) this.A02, this);
            case 2:
                A00(obj, this);
                return ((AnchoredDraggableState) this.A02).A04(null, null, this, null);
            case 3:
                A00(obj, this);
                return DragGestureNode.A05((DragGestureNode) this.A02, this);
            case 4:
                A00(obj, this);
                return ((NonTouchScrollingLogic) this.A02).A06(null, this);
            case 5:
                A00(obj, this);
                return ((PressGestureScopeImpl) this.A02).A00(this);
            case 6:
                A00(obj, this);
                return ((PressGestureScopeImpl) this.A02).AhU(this);
            case 7:
                A01(obj, this);
                return ScrollExtensionsKt.A00(null, null, this, 0.0f);
            case 8:
                A01(obj, this);
                return ScrollExtensionsKt.A02(null, this, 0.0f);
            case 9:
                A01(obj, this);
                return TapGestureDetectorKt.A05(null, this);
            case 10:
                A01(obj, this);
                return TapGestureDetectorKt.A02(null, null, this);
            case 11:
                A00(obj, this);
                return TrackpadScrollingLogic.A01(null, null, (TrackpadScrollingLogic) this.A02, this);
            case 12:
                A00(obj, this);
                return ((SnapFlingBehavior) this.A02).AXp(null, this, null, 0.0f);
            case 13:
                A00(obj, this);
                return SnapFlingBehavior.A01(null, (SnapFlingBehavior) this.A02, this, null, 0.0f, 0.0f);
            case 14:
                A00(obj, this);
                return ((LazyListState) this.A02).A05(0, 0, this);
            case 15:
                A00(obj, this);
                return ((PagerWrapperFlingBehavior) this.A02).AXo(null, this, 0.0f);
            case 16:
                A01(obj, this);
                return RightClickGesturesKt.A00(null, this);
            case 17:
                A00(obj, this);
                return TextFieldSelectionState.A06((TextFieldSelectionState) this.A02, this);
            case 18:
                A00(obj, this);
                return ((TextFieldSelectionState) this.A02).A0F(this);
            case 19:
                A01(obj, this);
                return SelectionGesturesKt.A04(null, this);
            case 20:
                A00(obj, this);
                return ((GraphicsLayer) this.A02).A08(this);
            case 21:
                A00(obj, this);
                return ((NestedScrollDispatcher) this.A02).A00(0L, 0L, this);
            case 22:
                A00(obj, this);
                return ((NestedScrollDispatcher) this.A02).A01(0L, this);
            case 23:
                A00(obj, this);
                return ((SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) this.A02).AiU(this, null, 0L);
            case 24:
                A00(obj, this);
                return ((AndroidComposeView) this.A02).Ago(this, null);
            case 25:
                A00(obj, this);
                return ((AndroidPlatformTextInputSession) this.A02).Ag6(null, this);
            case 26:
                A00(obj, this);
                return RelativeScroller.A00((RelativeScroller) this.A02, this, 0.0f);
            default:
                A00(obj, this);
                return BouncyNode.A00((BouncyNode) this.A02, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2310BTk(Object obj, SeekableTransitionState<S> seekableTransitionState, HtJ<? super C2310BTk> htJ) {
        super(seekableTransitionState);
        this.$t = htJ;
        this.A02 = obj;
    }

    public static void A00(Object obj, C2310BTk c2310BTk) {
        c2310BTk.A01 = obj;
        c2310BTk.A00 |= Integer.MIN_VALUE;
    }

    public static void A01(Object obj, C2310BTk c2310BTk) {
        c2310BTk.A02 = obj;
        c2310BTk.A00 |= Integer.MIN_VALUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2310BTk(int i, HtJ<? super C2310BTk> htJ) {
        super(htJ);
        this.$t = i;
    }
}
