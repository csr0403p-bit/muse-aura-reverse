package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class OnboardingUiFlowNameKt$OnboardingUiFlowNameChips$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $name;
    public final /* synthetic */ G0U<String, Unit> $onSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingUiFlowNameKt$OnboardingUiFlowNameChips$1$1$1$1(G0U<? super String, Unit> g0u, String str) {
        super(0);
        this.$onSelected = g0u;
        this.$name = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnboardingUiFlowNameKt.logAgentNameEditClick();
        this.$onSelected.invoke(this.$name);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
