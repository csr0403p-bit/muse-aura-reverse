package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import com.facebook.aura.ccv.nativeflow.ui.HatchAgeLinkingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ActivationAgeStepKt$MethodListAgeStep$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchAgeLinkingViewModel $linking;
    public final /* synthetic */ Function0<Unit> $onBack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivationAgeStepKt$MethodListAgeStep$4$1(HatchAgeLinkingViewModel hatchAgeLinkingViewModel, Function0<Unit> function0) {
        super(0);
        this.$linking = hatchAgeLinkingViewModel;
        this.$onBack = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$linking.reset();
        this.$onBack.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
