package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AuraActivationScreenKt$AuraActivationScreen$4$9$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onRefresh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraActivationScreenKt$AuraActivationScreen$4$9$1(Function0<Unit> function0) {
        super(0);
        this.$onRefresh = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onRefresh.invoke();
    }
}
