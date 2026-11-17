package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.BL5;
import X.C2BR;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchAppEventLoggingContext;
import com.facebook.aura.onboarding.OnboardingGateUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class OnboardingGateVisibilityModifierKt$onboardingGateErrorVisibility$1$1 extends AbstractC7559F3s implements G0U {
    public final /* synthetic */ HatchAppEventLoggingContext $context;
    public final /* synthetic */ OnboardingGateUiState $state;

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingGateVisibilityModifierKt$onboardingGateErrorVisibility$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ HatchAppEventLoggingContext $context;
        public final /* synthetic */ OnboardingGateUiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OnboardingGateUiState onboardingGateUiState, HatchAppEventLoggingContext hatchAppEventLoggingContext) {
            super(0);
            this.$state = onboardingGateUiState;
            this.$context = hatchAppEventLoggingContext;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnboardingGateVisibilityModifierKt.onboardingGateErrorVisibility$log(this.$state, this.$context, false);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Override // X.G0U
    public final BL5 invoke(C2BR c2br) {
        C7384Etj.A0Y(c2br, 0);
        OnboardingGateVisibilityModifierKt.onboardingGateErrorVisibility$log(this.$state, this.$context, true);
        return new BL5(new AnonymousClass1(this.$state, this.$context));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingGateVisibilityModifierKt$onboardingGateErrorVisibility$1$1(OnboardingGateUiState onboardingGateUiState, HatchAppEventLoggingContext hatchAppEventLoggingContext) {
        super(1);
        this.$state = onboardingGateUiState;
        this.$context = hatchAppEventLoggingContext;
    }
}
