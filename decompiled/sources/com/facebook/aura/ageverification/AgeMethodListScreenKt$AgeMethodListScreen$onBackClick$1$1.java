package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AgeMethodListScreenKt$AgeMethodListScreen$onBackClick$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onBack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgeMethodListScreenKt$AgeMethodListScreen$onBackClick$1$1(Function0<Unit> function0) {
        super(0);
        this.$onBack = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SelfieAgeStepAnalytics.INSTANCE.logClick(HatchComponent.BACK_BUTTON, AgeMethodListScreenKt.AGE_METHODS_SCREEN);
        this.$onBack.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
