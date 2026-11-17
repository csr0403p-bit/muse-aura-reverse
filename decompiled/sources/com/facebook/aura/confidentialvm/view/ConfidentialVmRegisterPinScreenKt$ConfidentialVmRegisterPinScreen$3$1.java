package com.facebook.aura.confidentialvm.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.View;
import com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewEffect;
import com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ActivationScreenKey;
import com.facebook.aura.navigation.key.AuraNavigationKeysKt;
import com.facebook.aura.navigation.key.ConfidentialVmSetupLoginScreenKey;
import com.facebook.aura.navigation.key.RegisterPinEntryPoint;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$3$1", f = "ConfidentialVmRegisterPinScreen.kt", l = {116}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ RegisterPinEntryPoint $entryPoint;
    public final /* synthetic */ String $genericErrorMessage;
    public final /* synthetic */ boolean $isCvmEnrollment;
    public final /* synthetic */ boolean $isFromActivation;
    public final /* synthetic */ boolean $isFromOnboarding;
    public final /* synthetic */ boolean $isFromSettings;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $pinUpdatedMessage;
    public final /* synthetic */ ConfidentialVmSwitchViewModel $switchViewModel;
    public final /* synthetic */ View $view;
    public final /* synthetic */ ConfidentialVmRegisterPinViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$3$1(ConfidentialVmRegisterPinViewModel confidentialVmRegisterPinViewModel, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, RegisterPinEntryPoint registerPinEntryPoint, boolean z, AuraNavigator auraNavigator, boolean z2, boolean z3, boolean z4, View view, String str, String str2, HtJ<? super ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$3$1> htJ) {
        super(2, htJ);
        this.$viewModel = confidentialVmRegisterPinViewModel;
        this.$switchViewModel = confidentialVmSwitchViewModel;
        this.$entryPoint = registerPinEntryPoint;
        this.$isFromActivation = z;
        this.$navigator = auraNavigator;
        this.$isFromOnboarding = z2;
        this.$isCvmEnrollment = z3;
        this.$isFromSettings = z4;
        this.$view = view;
        this.$pinUpdatedMessage = str;
        this.$genericErrorMessage = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$3$1(this.$viewModel, this.$switchViewModel, this.$entryPoint, this.$isFromActivation, this.$navigator, this.$isFromOnboarding, this.$isCvmEnrollment, this.$isFromSettings, this.$view, this.$pinUpdatedMessage, this.$genericErrorMessage, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<ConfidentialVmRegisterPinViewEffect> c22i = this.$viewModel.viewEffects;
            final ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel = this.$switchViewModel;
            final RegisterPinEntryPoint registerPinEntryPoint = this.$entryPoint;
            final boolean z = this.$isFromActivation;
            final AuraNavigator auraNavigator = this.$navigator;
            final boolean z2 = this.$isFromOnboarding;
            final boolean z3 = this.$isCvmEnrollment;
            final boolean z4 = this.$isFromSettings;
            final View view = this.$view;
            final String str = this.$pinUpdatedMessage;
            final String str2 = this.$genericErrorMessage;
            C20Z<? super ConfidentialVmRegisterPinViewEffect> c20z = new C20Z() { // from class: com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$3$1.1

                /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$3$1$1$1, reason: invalid class name and collision with other inner class name */
                public final class C00881 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
                    public static final C00881 INSTANCE = new C00881();

                    public C00881() {
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
                    return emit((ConfidentialVmRegisterPinViewEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(ConfidentialVmRegisterPinViewEffect confidentialVmRegisterPinViewEffect, HtJ<? super Unit> htJ) {
                    AuraToast auraToastM3114makeKDArT4I;
                    if (C7384Etj.areEqual(confidentialVmRegisterPinViewEffect, ConfidentialVmRegisterPinViewEffect.CredentialAccepted.INSTANCE)) {
                        ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel2 = confidentialVmSwitchViewModel;
                        if (confidentialVmSwitchViewModel2 != null) {
                            confidentialVmSwitchViewModel2.onCredentialReady(registerPinEntryPoint);
                        } else if (z) {
                            auraNavigator.navigate(new ActivationScreenKey(false, false, null, false, null), LaunchFlag.REPLACE_BACKSTACK);
                        } else if (z2) {
                            auraNavigator.popAll(C00881.INSTANCE);
                        } else if (!z3) {
                            if (z4 && (auraToastM3114makeKDArT4I = AuraToast.Companion.m3114makeKDArT4I(view, str, null, AuraToast.Duration.SHORT, null, AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, true, null, null, null, AuraIconSize.MEDIUM, null)) != null) {
                                auraToastM3114makeKDArT4I.show();
                            }
                            auraNavigator.back();
                        }
                    } else if (!C7384Etj.areEqual(confidentialVmRegisterPinViewEffect, ConfidentialVmRegisterPinViewEffect.EscrowFailed.INSTANCE)) {
                        if (C7384Etj.areEqual(confidentialVmRegisterPinViewEffect, ConfidentialVmRegisterPinViewEffect.ExistingRegistrationFound.INSTANCE)) {
                            if (z2 || z || confidentialVmSwitchViewModel != null) {
                                auraNavigator.navigate((AuraNavKey) new ConfidentialVmSetupLoginScreenKey(registerPinEntryPoint), false);
                            }
                        } else {
                            if (!C7384Etj.areEqual(confidentialVmRegisterPinViewEffect, ConfidentialVmRegisterPinViewEffect.RegistrationLookupRetryFailed.INSTANCE) && !C7384Etj.areEqual(confidentialVmRegisterPinViewEffect, ConfidentialVmRegisterPinViewEffect.SelectionPersistenceFailed.INSTANCE)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            AnonymousClass007.A0m(view, AuraToast.Companion, str2);
                        }
                    } else {
                        AnonymousClass007.A0m(view, AuraToast.Companion, str2);
                    }
                    return Unit.INSTANCE;
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
        return ((ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
