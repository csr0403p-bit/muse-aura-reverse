package com.facebook.aura.iap.iac;

import X.AbstractC7559F3s;
import X.C9xv;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class IacSandboxSheetContentKt$IacSandboxSheetBody$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C9xv $option;
    public final /* synthetic */ IacSandboxSheetState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IacSandboxSheetContentKt$IacSandboxSheetBody$1$1$1$1(IacSandboxSheetState iacSandboxSheetState, C9xv c9xv) {
        super(0);
        this.$state = iacSandboxSheetState;
        this.$option = c9xv;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$state.setCadenceSeconds(this.$option.A00);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
