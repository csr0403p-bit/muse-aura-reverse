package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.onboarding.OnboardingTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeasList$3$1$3$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ OnboardingTask $idea;
    public final /* synthetic */ G0U<String, Unit> $onIdeaSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeasList$3$1$3$3$1(OnboardingTask onboardingTask, G0U<? super String, Unit> g0u) {
        super(0);
        this.$idea = onboardingTask;
        this.$onIdeaSelected = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_TASKS, HatchScreen.ONBOARDING_TASKS, HatchComponent.ONBOARDING_TASK_OPTION, this.$idea.id, null, null);
        this.$onIdeaSelected.invoke(this.$idea.id);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
