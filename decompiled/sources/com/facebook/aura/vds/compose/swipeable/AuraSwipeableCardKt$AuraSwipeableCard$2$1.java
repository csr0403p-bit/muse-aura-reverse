package com.facebook.aura.vds.compose.swipeable;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C3UY;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$AuraSwipeableCard$2$1", f = "AuraSwipeableCard.kt", l = {135}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class AuraSwipeableCardKt$AuraSwipeableCard$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> $anchoredDraggableState;
    public final /* synthetic */ Function0<Unit> $localEndToStartSwipeAction;
    public final /* synthetic */ Function0<Unit> $localStartToEndSwipeAction;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSwipeableCardKt$AuraSwipeableCard$2$1(AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> anchoredDraggableState, Function0<Unit> function0, Function0<Unit> function02, HtJ<? super AuraSwipeableCardKt$AuraSwipeableCard$2$1> htJ) {
        super(2, htJ);
        this.$anchoredDraggableState = anchoredDraggableState;
        this.$localEndToStartSwipeAction = function0;
        this.$localStartToEndSwipeAction = function02;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraSwipeableCardKt$AuraSwipeableCard$2$1(this.$anchoredDraggableState, this.$localEndToStartSwipeAction, this.$localStartToEndSwipeAction, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Function0<Unit> function0;
        Object obj2 = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (C1BO.A01(this.$anchoredDraggableState.A0D) == 1.0f) {
                if (this.$anchoredDraggableState.A0A.getValue() == AuraSwipeableMenuStateDragAnchors.END_DISMISS) {
                    Function0<Unit> function02 = this.$localEndToStartSwipeAction;
                    if (function02 != null) {
                        function02.invoke();
                    }
                    AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> anchoredDraggableState = this.$anchoredDraggableState;
                    AuraSwipeableMenuStateDragAnchors auraSwipeableMenuStateDragAnchors = AuraSwipeableMenuStateDragAnchors.IDLE;
                    this.label = 1;
                    Object objA04 = anchoredDraggableState.A04(C3UY.A02, auraSwipeableMenuStateDragAnchors, this, new AnchoredDraggableKt$snapTo$2(null));
                    if (objA04 != obj2) {
                        objA04 = Unit.INSTANCE;
                    }
                    if (objA04 == obj2) {
                        return obj2;
                    }
                } else if (this.$anchoredDraggableState.A0E.getValue() == AuraSwipeableMenuStateDragAnchors.START_ACTION && (function0 = this.$localStartToEndSwipeAction) != null) {
                    function0.invoke();
                }
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraSwipeableCardKt$AuraSwipeableCard$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
