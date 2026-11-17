package com.facebook.aura.iap.iac;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class IacSandboxSheetContentKt$IacSandboxSheetBody$1$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ IacSandboxSheetState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IacSandboxSheetContentKt$IacSandboxSheetBody$1$3$1$1(IacSandboxSheetState iacSandboxSheetState, int i) {
        super(0);
        this.$state = iacSandboxSheetState;
        this.$index = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$state.setOutcomeIndex(this.$index);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
