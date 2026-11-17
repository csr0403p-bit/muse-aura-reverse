package com.facebook.aura.onboarding.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.navigation.key.OnboardingUiFlowScreenKey;
import com.facebook.aura.onboarding.OnboardingGateDestination;
import com.facebook.aura.onboarding.OnboardingGateUiState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchSetupAnimationState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.onboarding.view.OnboardingGateScreenKt$OnboardingGateScreen$3$1", f = "OnboardingGateScreen.kt", l = {HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class OnboardingGateScreenKt$OnboardingGateScreen$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<OnboardingGateUiState> $uiState$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingGateScreenKt$OnboardingGateScreen$3$1(AuraNavigator auraNavigator, C1BO<OnboardingGateUiState> c1bo, HtJ<? super OnboardingGateScreenKt$OnboardingGateScreen$3$1> htJ) {
        super(2, htJ);
        this.$navigator = auraNavigator;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new OnboardingGateScreenKt$OnboardingGateScreen$3$1(this.$navigator, this.$uiState$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        AuraNavigator auraNavigator;
        AuraNavKey auraNavKey;
        LaunchFlag launchFlag;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            OnboardingGateDestination onboardingGateDestination = this.$uiState$delegate.getValue().destination;
            if (C7384Etj.areEqual(onboardingGateDestination, OnboardingGateDestination.UiFlow.INSTANCE)) {
                HatchSetupAnimationState.INSTANCE.finish();
                auraNavigator = this.$navigator;
                auraNavKey = OnboardingUiFlowScreenKey.INSTANCE;
                launchFlag = LaunchFlag.REPLACE;
                auraNavigator.navigate(auraNavKey, launchFlag);
                return Unit.INSTANCE;
            }
            if (!C7384Etj.areEqual(onboardingGateDestination, OnboardingGateDestination.Conversation.INSTANCE)) {
                if (onboardingGateDestination != null) {
                    throw C3cG.A0q();
                }
                return Unit.INSTANCE;
            }
            HatchSetupAnimationState hatchSetupAnimationState = HatchSetupAnimationState.INSTANCE;
            this.label = 1;
            if (hatchSetupAnimationState.finishAfterHold(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        auraNavigator = this.$navigator;
        auraNavKey = ConversationTabScreenKey.INSTANCE;
        launchFlag = LaunchFlag.REPLACE_BACKSTACK;
        auraNavigator.navigate(auraNavKey, launchFlag);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((OnboardingGateScreenKt$OnboardingGateScreen$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
