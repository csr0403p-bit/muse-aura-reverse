package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.C00q;
import X.C0dx;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class OnboardingUiFlowNameKt$OnboardingUiFlowRegenerateNameButton$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ Function0<Unit> $onRegenerateName;
    public final /* synthetic */ C00q $targetRotation$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowNameKt$OnboardingUiFlowRegenerateNameButton$1$1(C0dx c0dx, Function0<Unit> function0, C00q c00q) {
        super(0);
        this.$haptics = c0dx;
        this.$onRegenerateName = function0;
        this.$targetRotation$delegate = c00q;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$haptics.AXr(AuraHaptics.BUTTON_TAP);
        C00q c00q = this.$targetRotation$delegate;
        c00q.AdS(c00q.AFn() + 180.0f);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_IDENTITY, HatchScreen.ONBOARDING_IDENTITY, HatchComponent.ONBOARDING_AGENT_NAME_REGENERATE, null, null, null);
        this.$onRegenerateName.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
