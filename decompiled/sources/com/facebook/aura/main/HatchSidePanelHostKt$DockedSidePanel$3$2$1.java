package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSidePanelHostKt$DockedSidePanel$3$2$1 extends AbstractC7559F3s implements G0U<Function0<? extends Boolean>, Unit> {
    public final /* synthetic */ MutableState<Function0<Boolean>> $sidePanelContentBackHandler$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSidePanelHostKt$DockedSidePanel$3$2$1(MutableState<Function0<Boolean>> mutableState) {
        super(1);
        this.$sidePanelContentBackHandler$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Boolean> function0) {
        invoke2((Function0<Boolean>) function0);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Function0<Boolean> function0) {
        this.$sidePanelContentBackHandler$delegate.Af8(function0);
    }
}
