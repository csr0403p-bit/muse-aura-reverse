package com.facebook.aura.activation.view;

import X.AHD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.C2CK;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.InterfaceC7353EnQ;
import androidx.activity.ComponentActivity;
import com.facebook.aura.R;
import com.facebook.aura.activation.model.HatchReTosViewModel;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.login.nativeflow.HatchItemizedConsent;
import com.facebook.aura.login.nativeflow.HatchReTosScreen;
import com.facebook.aura.login.nativeflow.NativeLoginItemizedConsentScreenKt;
import com.facebook.aura.login.nativeflow.NativeLoginReTosProseScreenKt;
import com.facebook.aura.navigation.AuraTerminalBackHandlerKt;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.ui.OnboardingAndActivationSpinnerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AuraReTosScreenKt {

    /* renamed from: com.facebook.aura.activation.view.AuraReTosScreenKt$AuraReTosScreen$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraReTosScreenKt.AuraReTosScreen(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AuraReTosScreen(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1356422698);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchReTosViewModel.Factory factory = new HatchReTosViewModel.Factory(AnonymousClass002.A0h(bfm));
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            HatchReTosViewModel hatchReTosViewModel = (HatchReTosViewModel) C3cH.A0H(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), C3cG.A0x(HatchReTosViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, hatchReTosViewModel.uiState);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b19);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AuraReTosScreenKt$AuraReTosScreen$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTerminalBackHandlerKt.AuraTerminalBackHandler(false, (Function0) objAaT, bfm, 48, 1);
            HatchReTosViewModel.Content content = ((HatchReTosViewModel.UiState) c1boA02.getValue()).content;
            if (content instanceof HatchReTosViewModel.Content.Screen) {
                bfm.AgE(-2135752347);
                HatchReTosScreen hatchReTosScreen = ((HatchReTosViewModel.Content.Screen) content).reTos.screen;
                if (hatchReTosScreen instanceof HatchReTosScreen.Prose) {
                    bfm.AgE(-2147103027);
                    HatchReTosScreen.Prose prose = (HatchReTosScreen.Prose) hatchReTosScreen;
                    boolean zA67 = bfm.A67(hatchReTosViewModel);
                    Object objAaT2 = bfm.AaT();
                    if (zA67 || objAaT2 == obj) {
                        objAaT2 = new AuraReTosScreenKt$AuraReTosScreen$2$1(hatchReTosViewModel);
                        bfm.Ai0(objAaT2);
                    }
                    Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT2);
                    boolean zA672 = bfm.A67(hatchReTosViewModel);
                    Object objAaT3 = bfm.AaT();
                    if (zA672 || objAaT3 == obj) {
                        objAaT3 = new AuraReTosScreenKt$AuraReTosScreen$3$1(hatchReTosViewModel);
                        bfm.Ai0(objAaT3);
                    }
                    NativeLoginReTosProseScreenKt.NativeLoginReTosProseScreen(prose, function0, (G0U) ((InterfaceC7353EnQ) objAaT3), ((HatchReTosViewModel.UiState) c1boA02.getValue()).isLoading, bRg2, bfm, (iA0d << 12) & 57344, 0);
                } else {
                    if (!(hatchReTosScreen instanceof HatchReTosScreen.Itemized)) {
                        throw AnonymousClass005.A0k(bfm, -2147105219);
                    }
                    bfm.AgE(-2147091837);
                    HatchItemizedConsent hatchItemizedConsent = ((HatchReTosScreen.Itemized) hatchReTosScreen).consent;
                    AHD<Boolean> ahd = ((HatchReTosViewModel.UiState) c1boA02.getValue()).accepted;
                    boolean z = ((HatchReTosViewModel.UiState) c1boA02.getValue()).allAccepted;
                    boolean z2 = ((HatchReTosViewModel.UiState) c1boA02.getValue()).confirmEnabled;
                    boolean zA673 = bfm.A67(hatchReTosViewModel);
                    Object objAaT4 = bfm.AaT();
                    if (zA673 || objAaT4 == obj) {
                        objAaT4 = new AuraReTosScreenKt$AuraReTosScreen$4$1(hatchReTosViewModel);
                        bfm.Ai0(objAaT4);
                    }
                    G0V g0v = (G0V) ((InterfaceC7353EnQ) objAaT4);
                    boolean zA674 = bfm.A67(hatchReTosViewModel);
                    Object objAaT5 = bfm.AaT();
                    if (zA674 || objAaT5 == obj) {
                        objAaT5 = new AuraReTosScreenKt$AuraReTosScreen$5$1(hatchReTosViewModel);
                        bfm.Ai0(objAaT5);
                    }
                    G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT5);
                    boolean zA675 = bfm.A67(hatchReTosViewModel);
                    Object objAaT6 = bfm.AaT();
                    if (zA675 || objAaT6 == obj) {
                        objAaT6 = new AuraReTosScreenKt$AuraReTosScreen$6$1(hatchReTosViewModel);
                        bfm.Ai0(objAaT6);
                    }
                    Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT6);
                    Object objAaT7 = bfm.AaT();
                    if (objAaT7 == obj) {
                        objAaT7 = AuraReTosScreenKt$AuraReTosScreen$7$1.INSTANCE;
                        bfm.Ai0(objAaT7);
                    }
                    NativeLoginItemizedConsentScreenKt.NativeLoginItemizedConsentScreen(hatchItemizedConsent, ahd, z, z2, g0v, g0u, function02, (Function0) objAaT7, null, ((HatchReTosViewModel.UiState) c1boA02.getValue()).isLoading, bRg2, HatchSubsurface.ONBOARDING_POST_AUTH, HatchScreen.ONBOARDING_RETOS, bfm, 113246208, (iA0d & 14) | 432, 0);
                }
            } else if (C7384Etj.areEqual(content, HatchReTosViewModel.Content.Unreadable.INSTANCE)) {
                bfm.AgE(-2147067059);
                if (((HatchReTosViewModel.UiState) c1boA02.getValue()).isLoading) {
                    bfm.AgE(-2134558692);
                    OnboardingAndActivationSpinnerKt.OnboardingAndActivationSpinner("activation: re-ToS retry", null, null, bfm, 6, 6);
                } else {
                    boolean zA1Z = AnonymousClass001.A1Z(hatchReTosViewModel, bfm, -2134464638);
                    Object objAaT8 = bfm.AaT();
                    if (zA1Z || objAaT8 == obj) {
                        objAaT8 = new AuraReTosScreenKt$AuraReTosScreen$8$1(hatchReTosViewModel);
                        bfm.Ai0(objAaT8);
                    }
                    HatchScreenErrorStateKt.HatchScreenErrorState(strA01, (Function0) ((InterfaceC7353EnQ) objAaT8), AnonymousClass001.A0T(bRg2), HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_POST_AUTH, HatchScreen.ONBOARDING_RETOS, null, bfm, 224256, 64);
                }
            } else {
                if (content != null) {
                    throw AnonymousClass005.A0k(bfm, -2147107468);
                }
                bfm.AgE(-2147051982);
                OnboardingAndActivationSpinnerKt.OnboardingAndActivationSpinner("activation: re-ToS cleared", null, null, bfm, 6, 6);
                AnonymousClass001.A1D(bfm);
            }
            AnonymousClass001.A1D(bfm);
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass9(bRg2, i, i2);
        }
    }
}
