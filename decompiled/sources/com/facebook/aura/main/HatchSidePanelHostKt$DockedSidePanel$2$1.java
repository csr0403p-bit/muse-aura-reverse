package com.facebook.aura.main;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSidePanelHostKt$DockedSidePanel$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Function0<Boolean>> $sidePanelContentBackHandler$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSidePanelHostKt$DockedSidePanel$2$1(MutableState<Function0<Boolean>> mutableState) {
        super(0);
        this.$sidePanelContentBackHandler$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0<Boolean> value = this.$sidePanelContentBackHandler$delegate.getValue();
        if (value != null) {
            value.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
