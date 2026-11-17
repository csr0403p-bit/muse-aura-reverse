package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$animatedDismiss$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $isVisible$delegate;
    public final /* synthetic */ MutableState<Boolean> $pendingDismiss$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$animatedDismiss$1$1(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$isVisible$delegate = mutableState;
        this.$pendingDismiss$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(false, this.$isVisible$delegate);
        MutableState.A09(true, this.$pendingDismiss$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
