package com.facebook.aura.subscription.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.EnumC10460Hji;
import X.F0C;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ActivationScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmRegisterPinScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmSetupLoginScreenKey;
import com.facebook.aura.navigation.key.RegisterPinEntryPoint;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ActivationFinishNavigation$1$1", f = "AuraActivationSubscriptionScreen.kt", l = {843}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class AuraActivationSubscriptionScreenKt$ActivationFinishNavigation$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<String, Unit> $showDismissToast;
    public final /* synthetic */ String $termsFailedMessage;
    public final /* synthetic */ C20Q<AuraActivationPlanFinishViewModel.ViewEffect> $viewEffects;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraActivationSubscriptionScreenKt$ActivationFinishNavigation$1$1(C20Q<? extends AuraActivationPlanFinishViewModel.ViewEffect> c20q, AuraNavigator auraNavigator, G0U<? super String, Unit> g0u, String str, HtJ<? super AuraActivationSubscriptionScreenKt$ActivationFinishNavigation$1$1> htJ) {
        super(2, htJ);
        this.$viewEffects = c20q;
        this.$navigator = auraNavigator;
        this.$showDismissToast = g0u;
        this.$termsFailedMessage = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraActivationSubscriptionScreenKt$ActivationFinishNavigation$1$1(this.$viewEffects, this.$navigator, this.$showDismissToast, this.$termsFailedMessage, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<AuraActivationPlanFinishViewModel.ViewEffect> c20q = this.$viewEffects;
            final AuraNavigator auraNavigator = this.$navigator;
            final G0U<String, Unit> g0u = this.$showDismissToast;
            final String str = this.$termsFailedMessage;
            C20Z<? super AuraActivationPlanFinishViewModel.ViewEffect> c20z = new C20Z() { // from class: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ActivationFinishNavigation$1$1.1
                public final Object emit(AuraActivationPlanFinishViewModel.ViewEffect viewEffect, HtJ<? super Unit> htJ) {
                    AuraNavigator auraNavigator2;
                    AuraNavKey confidentialVmRegisterPinScreenKey;
                    if (C7384Etj.areEqual(viewEffect, AuraActivationPlanFinishViewModel.ViewEffect.EnterExistingPin.INSTANCE)) {
                        auraNavigator2 = auraNavigator;
                        F0C<C9hr<Object>>[] f0cArr = ConfidentialVmSetupLoginScreenKey.$childSerializers;
                        confidentialVmRegisterPinScreenKey = new ConfidentialVmSetupLoginScreenKey(RegisterPinEntryPoint.ACTIVATION);
                    } else {
                        if (!C7384Etj.areEqual(viewEffect, AuraActivationPlanFinishViewModel.ViewEffect.CreatePin.INSTANCE)) {
                            if (C7384Etj.areEqual(viewEffect, AuraActivationPlanFinishViewModel.ViewEffect.Finished.INSTANCE)) {
                                auraNavigator.navigate(new ActivationScreenKey(false, false, null, false, null), LaunchFlag.REPLACE_BACKSTACK);
                            } else {
                                if (!C7384Etj.areEqual(viewEffect, AuraActivationPlanFinishViewModel.ViewEffect.ReturnToActivation.INSTANCE)) {
                                    if (!C7384Etj.areEqual(viewEffect, AuraActivationPlanFinishViewModel.ViewEffect.TermsFailed.INSTANCE)) {
                                        throw C3cG.A0q();
                                    }
                                    g0u.invoke(str);
                                }
                                auraNavigator.back();
                            }
                            return Unit.INSTANCE;
                        }
                        auraNavigator2 = auraNavigator;
                        F0C<C9hr<Object>>[] f0cArr2 = ConfidentialVmRegisterPinScreenKey.$childSerializers;
                        confidentialVmRegisterPinScreenKey = new ConfidentialVmRegisterPinScreenKey(RegisterPinEntryPoint.ACTIVATION);
                    }
                    auraNavigator2.navigate(confidentialVmRegisterPinScreenKey, true);
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((AuraActivationPlanFinishViewModel.ViewEffect) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (c20q.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraActivationSubscriptionScreenKt$ActivationFinishNavigation$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
