package com.facebook.aura.survey;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchSurveySheetKt$SurveyQuestion$1$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<Integer, Unit> $onSelectOption;
    public final /* synthetic */ HatchSurveyOption $option;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSurveySheetKt$SurveyQuestion$1$2$1$1$1(G0U<? super Integer, Unit> g0u, HatchSurveyOption hatchSurveyOption) {
        super(0);
        this.$onSelectOption = g0u;
        this.$option = hatchSurveyOption;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onSelectOption.invoke(Integer.valueOf(this.$option.value));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
