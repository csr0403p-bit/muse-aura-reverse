package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryScreenKt$HatchCcvCardEntryScreen$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onBack;
    public final /* synthetic */ HatchCcvUiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCcvCardEntryScreenKt$HatchCcvCardEntryScreen$1$1(HatchCcvUiState hatchCcvUiState, Function0<Unit> function0) {
        super(0);
        this.$uiState = hatchCcvUiState;
        this.$onBack = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$uiState.isSubmitting) {
            return;
        }
        this.$onBack.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
