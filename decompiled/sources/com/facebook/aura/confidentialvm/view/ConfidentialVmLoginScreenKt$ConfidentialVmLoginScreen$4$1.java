package com.facebook.aura.confidentialvm.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewEffect;
import com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ActivationScreenKey;
import com.facebook.aura.navigation.key.AuraNavigationKeysKt;
import com.facebook.aura.navigation.key.RegisterPinEntryPoint;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.view.ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$4$1", f = "ConfidentialVmLoginScreen.kt", l = {106}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ RegisterPinEntryPoint $setupEntryPoint;
    public final /* synthetic */ ConfidentialVmSwitchViewModel $switchViewModel;
    public final /* synthetic */ ConfidentialVmLoginViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$4$1(ConfidentialVmLoginViewModel confidentialVmLoginViewModel, RegisterPinEntryPoint registerPinEntryPoint, AuraNavigator auraNavigator, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, HtJ<? super ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$4$1> htJ) {
        super(2, htJ);
        this.$viewModel = confidentialVmLoginViewModel;
        this.$setupEntryPoint = registerPinEntryPoint;
        this.$navigator = auraNavigator;
        this.$switchViewModel = confidentialVmSwitchViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$4$1(this.$viewModel, this.$setupEntryPoint, this.$navigator, this.$switchViewModel, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<ConfidentialVmLoginViewEffect> c22i = this.$viewModel.viewEffects;
            final RegisterPinEntryPoint registerPinEntryPoint = this.$setupEntryPoint;
            final AuraNavigator auraNavigator = this.$navigator;
            final ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel = this.$switchViewModel;
            C20Z<? super ConfidentialVmLoginViewEffect> c20z = new C20Z() { // from class: com.facebook.aura.confidentialvm.view.ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$4$1.1

                /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$4$1$1$1, reason: invalid class name and collision with other inner class name */
                public final class C00871 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
                    public static final C00871 INSTANCE = new C00871();

                    public C00871() {
                        super(1);
                    }

                    @Override // X.G0U
                    public final Boolean invoke(AuraNavKey auraNavKey) {
                        C7384Etj.A0Y(auraNavKey, 0);
                        return Boolean.valueOf(AuraNavigationKeysKt.isConfidentialVmCredentialFlowKey(auraNavKey));
                    }
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((ConfidentialVmLoginViewEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(ConfidentialVmLoginViewEffect confidentialVmLoginViewEffect, HtJ<? super Unit> htJ) {
                    if (C7384Etj.areEqual(confidentialVmLoginViewEffect, ConfidentialVmLoginViewEffect.VerificationSucceeded.INSTANCE)) {
                        RegisterPinEntryPoint registerPinEntryPoint2 = registerPinEntryPoint;
                        if (registerPinEntryPoint2 == null) {
                            auraNavigator.back();
                        } else {
                            ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel2 = confidentialVmSwitchViewModel;
                            if (confidentialVmSwitchViewModel2 != null) {
                                confidentialVmSwitchViewModel2.onCredentialReady(registerPinEntryPoint2);
                            } else {
                                RegisterPinEntryPoint registerPinEntryPoint3 = RegisterPinEntryPoint.ACTIVATION;
                                AuraNavigator auraNavigator2 = auraNavigator;
                                if (registerPinEntryPoint2 == registerPinEntryPoint3) {
                                    auraNavigator2.navigate(new ActivationScreenKey(false, false, null, false, null), LaunchFlag.REPLACE_BACKSTACK);
                                } else {
                                    auraNavigator2.popAll(C00871.INSTANCE);
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    throw new NoWhenBranchMatchedException();
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
        throw new KotlinNothingValueException();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
