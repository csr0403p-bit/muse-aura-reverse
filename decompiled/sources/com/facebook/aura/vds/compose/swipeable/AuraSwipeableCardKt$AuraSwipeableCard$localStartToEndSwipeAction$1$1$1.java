package com.facebook.aura.vds.compose.swipeable;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraSwipeableCardKt$AuraSwipeableCard$localStartToEndSwipeAction$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $handlerActionSend;
    public final /* synthetic */ Function0<Unit> $swipeAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSwipeableCardKt$AuraSwipeableCard$localStartToEndSwipeAction$1$1$1(MutableState<Boolean> mutableState, Function0<Unit> function0) {
        super(0);
        this.$handlerActionSend = mutableState;
        this.$swipeAction = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (MutableState.A0A((MutableState) this.$handlerActionSend)) {
            return;
        }
        MutableState.A09(true, this.$handlerActionSend);
        this.$swipeAction.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
