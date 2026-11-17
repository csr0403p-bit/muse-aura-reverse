package com.facebook.aura.vds.compose.swipeable;

import X.AbstractC07127nr;
import X.C3UX;
import X.F0C;
import X.G0V;
import X.HtJ;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$PeekHint$2$1", f = "AuraSwipeableCard.kt", l = {316, 317, 318, 319}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class AuraSwipeableCardKt$PeekHint$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> $anchoredDraggableState;
    public final /* synthetic */ AuraSwipeablePeek $peek;
    public final /* synthetic */ F0C<AuraSwipeablePeekViewModel> $viewModel$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSwipeableCardKt$PeekHint$2$1(AuraSwipeablePeek auraSwipeablePeek, AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> anchoredDraggableState, F0C<AuraSwipeablePeekViewModel> f0c, HtJ<? super AuraSwipeableCardKt$PeekHint$2$1> htJ) {
        super(2, htJ);
        this.$peek = auraSwipeablePeek;
        this.$anchoredDraggableState = anchoredDraggableState;
        this.$viewModel$delegate = f0c;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraSwipeableCardKt$PeekHint$2$1(this.$peek, this.$anchoredDraggableState, this.$viewModel$delegate, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r3 = 4
            r5 = 3
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 == r2) goto L3a
            if (r0 == r6) goto L4c
            if (r0 == r5) goto L5c
            if (r0 != r3) goto L6c
            X.Hwg.A00(r8)
        L15:
            X.F0C<com.facebook.aura.vds.compose.swipeable.AuraSwipeablePeekViewModel> r0 = r7.$viewModel$delegate
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.vds.compose.swipeable.AuraSwipeablePeekViewModel r0 = (com.facebook.aura.vds.compose.swipeable.AuraSwipeablePeekViewModel) r0
            r0.setHasPeekAnimationPlayed(r2)
            com.facebook.aura.vds.compose.swipeable.AuraSwipeablePeek r0 = r7.$peek
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r0.onPeekHintShown
            r0.invoke()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2a:
            X.Hwg.A00(r8)
            com.facebook.aura.vds.compose.swipeable.AuraSwipeablePeek r0 = r7.$peek
            long r0 = r0.delayStartTime
            r7.label = r2
            java.lang.Object r0 = X.C7Bq.A01(r0, r7)
            if (r0 != r4) goto L3d
            return r4
        L3a:
            X.Hwg.A00(r8)
        L3d:
            androidx.compose.foundation.gestures.AnchoredDraggableState<com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuStateDragAnchors> r1 = r7.$anchoredDraggableState
            com.facebook.aura.vds.compose.swipeable.AuraSwipeablePeek r0 = r7.$peek
            com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuStateDragAnchors r0 = r0.peekEndDestination
            r7.label = r6
            java.lang.Object r0 = androidx.compose.foundation.gestures.AnchoredDraggableKt.A02(r1, r0, r7)
            if (r0 != r4) goto L4f
            return r4
        L4c:
            X.Hwg.A00(r8)
        L4f:
            com.facebook.aura.vds.compose.swipeable.AuraSwipeablePeek r0 = r7.$peek
            long r0 = r0.peekPauseTime
            r7.label = r5
            java.lang.Object r0 = X.C7Bq.A01(r0, r7)
            if (r0 != r4) goto L5f
            return r4
        L5c:
            X.Hwg.A00(r8)
        L5f:
            androidx.compose.foundation.gestures.AnchoredDraggableState<com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuStateDragAnchors> r1 = r7.$anchoredDraggableState
            com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuStateDragAnchors r0 = com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuStateDragAnchors.IDLE
            r7.label = r3
            java.lang.Object r0 = androidx.compose.foundation.gestures.AnchoredDraggableKt.A02(r1, r0, r7)
            if (r0 != r4) goto L15
            return r4
        L6c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$PeekHint$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraSwipeableCardKt$PeekHint$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
