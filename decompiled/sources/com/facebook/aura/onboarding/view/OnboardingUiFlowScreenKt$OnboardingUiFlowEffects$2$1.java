package com.facebook.aura.onboarding.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.SkillConnectDisconnectRouterScreenKey;
import com.facebook.aura.onboarding.OnboardingUiFlowEffect;
import com.facebook.aura.onboarding.OnboardingUiFlowViewModel;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt$OnboardingUiFlowEffects$2$1", f = "OnboardingUiFlowScreen.kt", l = {296}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class OnboardingUiFlowScreenKt$OnboardingUiFlowEffects$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $failedMessage;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ OnboardingUiFlowViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowScreenKt$OnboardingUiFlowEffects$2$1(OnboardingUiFlowViewModel onboardingUiFlowViewModel, String str, AuraNavigator auraNavigator, HtJ<? super OnboardingUiFlowScreenKt$OnboardingUiFlowEffects$2$1> htJ) {
        super(2, htJ);
        this.$viewModel = onboardingUiFlowViewModel;
        this.$failedMessage = str;
        this.$navigator = auraNavigator;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new OnboardingUiFlowScreenKt$OnboardingUiFlowEffects$2$1(this.$viewModel, this.$failedMessage, this.$navigator, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<OnboardingUiFlowEffect> c22i = this.$viewModel.effects;
            final String str = this.$failedMessage;
            final AuraNavigator auraNavigator = this.$navigator;
            C20Z<? super OnboardingUiFlowEffect> c20z = new C20Z() { // from class: com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt$OnboardingUiFlowEffects$2$1.1
                public final Object emit(OnboardingUiFlowEffect onboardingUiFlowEffect, HtJ<? super Unit> htJ) {
                    if (C7384Etj.areEqual(onboardingUiFlowEffect, OnboardingUiFlowEffect.Failed.INSTANCE)) {
                        ToastApi.INSTANCE.showToast(str);
                    } else {
                        if (!(onboardingUiFlowEffect instanceof OnboardingUiFlowEffect.OpenConnector)) {
                            throw C3cG.A0q();
                        }
                        auraNavigator.navigate((AuraNavKey) new SkillConnectDisconnectRouterScreenKey(((OnboardingUiFlowEffect.OpenConnector) onboardingUiFlowEffect).connectorId, true, null, HatchSkillOAuthOrigin.ONBOARDING, null, true), false);
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((OnboardingUiFlowEffect) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (c22i.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw C3cG.A0p();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((OnboardingUiFlowScreenKt$OnboardingUiFlowEffects$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
