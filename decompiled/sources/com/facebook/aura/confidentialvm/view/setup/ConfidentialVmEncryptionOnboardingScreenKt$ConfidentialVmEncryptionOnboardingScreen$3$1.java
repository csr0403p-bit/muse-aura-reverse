package com.facebook.aura.confidentialvm.view.setup;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.confidentialvm.model.ConfidentialVmEnrollmentChoiceViewEffect;
import com.facebook.aura.confidentialvm.model.ConfidentialVmEnrollmentChoiceViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConfidentialVmRegisterPinScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmSetupLoginScreenKey;
import com.facebook.aura.navigation.key.RegisterPinEntryPoint;
import com.facebook.aura.ui.HatchSetupAnimationState;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.view.setup.ConfidentialVmEncryptionOnboardingScreenKt$ConfidentialVmEncryptionOnboardingScreen$3$1", f = "ConfidentialVmEncryptionOnboardingScreen.kt", l = {SelfieSnapshotKt.SELFIE_JPEG_QUALITY}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConfidentialVmEncryptionOnboardingScreenKt$ConfidentialVmEncryptionOnboardingScreen$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ RegisterPinEntryPoint $entryPoint;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ MutableState<Object> $setupAnimationSuppression$delegate;
    public final /* synthetic */ ConfidentialVmEnrollmentChoiceViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmEncryptionOnboardingScreenKt$ConfidentialVmEncryptionOnboardingScreen$3$1(ConfidentialVmEnrollmentChoiceViewModel confidentialVmEnrollmentChoiceViewModel, AuraNavigator auraNavigator, RegisterPinEntryPoint registerPinEntryPoint, MutableState<Object> mutableState, HtJ<? super ConfidentialVmEncryptionOnboardingScreenKt$ConfidentialVmEncryptionOnboardingScreen$3$1> htJ) {
        super(2, htJ);
        this.$viewModel = confidentialVmEnrollmentChoiceViewModel;
        this.$navigator = auraNavigator;
        this.$entryPoint = registerPinEntryPoint;
        this.$setupAnimationSuppression$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConfidentialVmEncryptionOnboardingScreenKt$ConfidentialVmEncryptionOnboardingScreen$3$1(this.$viewModel, this.$navigator, this.$entryPoint, this.$setupAnimationSuppression$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<ConfidentialVmEnrollmentChoiceViewEffect> c22i = this.$viewModel.viewEffects;
            final AuraNavigator auraNavigator = this.$navigator;
            final RegisterPinEntryPoint registerPinEntryPoint = this.$entryPoint;
            final MutableState<Object> mutableState = this.$setupAnimationSuppression$delegate;
            C20Z<? super ConfidentialVmEnrollmentChoiceViewEffect> c20z = new C20Z() { // from class: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmEncryptionOnboardingScreenKt$ConfidentialVmEncryptionOnboardingScreen$3$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((ConfidentialVmEnrollmentChoiceViewEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(ConfidentialVmEnrollmentChoiceViewEffect confidentialVmEnrollmentChoiceViewEffect, HtJ<? super Unit> htJ) {
                    AuraNavigator auraNavigator2;
                    AuraNavKey confidentialVmRegisterPinScreenKey;
                    MutableState<Object> mutableState2 = mutableState;
                    Object value = mutableState2.getValue();
                    if (value == null) {
                        value = HatchSetupAnimationState.INSTANCE.suppress();
                    }
                    mutableState2.Af8(value);
                    if (C7384Etj.areEqual(confidentialVmEnrollmentChoiceViewEffect, ConfidentialVmEnrollmentChoiceViewEffect.EnterExistingPin.INSTANCE)) {
                        auraNavigator2 = auraNavigator;
                        confidentialVmRegisterPinScreenKey = new ConfidentialVmSetupLoginScreenKey(registerPinEntryPoint);
                    } else if (C7384Etj.areEqual(confidentialVmEnrollmentChoiceViewEffect, ConfidentialVmEnrollmentChoiceViewEffect.CreatePin.INSTANCE)) {
                        auraNavigator2 = auraNavigator;
                        confidentialVmRegisterPinScreenKey = new ConfidentialVmRegisterPinScreenKey(registerPinEntryPoint);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    auraNavigator2.navigate(confidentialVmRegisterPinScreenKey, false);
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
        return ((ConfidentialVmEncryptionOnboardingScreenKt$ConfidentialVmEncryptionOnboardingScreen$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
