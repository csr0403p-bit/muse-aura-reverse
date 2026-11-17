package com.facebook.aura.onboarding.view;

import X.AHD;
import X.AKQ;
import X.AbstractC1754Apr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C0z7;
import X.C1515AkP;
import X.C1BO;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C7bA;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HatchHeaderKt;
import com.facebook.aura.header.view.HatchHeaderTitleAlignment;
import com.facebook.aura.header.view.HeaderButton;
import com.facebook.aura.header.view.SettingsHeaderButtonKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.onboarding.OnboardingGateDestination;
import com.facebook.aura.onboarding.OnboardingGateLoadingPhase;
import com.facebook.aura.onboarding.OnboardingGateUiState;
import com.facebook.aura.onboarding.OnboardingGateViewModel;
import com.facebook.aura.ui.OnboardingAndActivationSpinnerKt;
import com.facebook.aura.ui.adaptive.AuraContentFrameKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class OnboardingGateScreenKt {
    public static final String TAG = "OnboardingGateScreen";

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingGateScreenKt$OnboardingGateScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ OnboardingGateViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(OnboardingGateViewModel onboardingGateViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = onboardingGateViewModel;
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
            OnboardingGateScreenKt.OnboardingGateScreen(this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OnboardingGateLoadingPhase.values().length];
            try {
                AnonymousClass002.A13(OnboardingGateLoadingPhase.WAITING_VM_CONNECTION, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(OnboardingGateLoadingPhase.VM_CONNECTION_FAILED_FETCHING_ONBOARDING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(OnboardingGateLoadingPhase.VM_CONNECTION_SUCCESS_FETCHING_ONBOARDING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void OnboardingGateScreen(OnboardingGateViewModel onboardingGateViewModel, BRg bRg, BFM bfm, int i, int i2) {
        String str;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(onboardingGateViewModel, 0);
        bfm.AgG(1452430955);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, onboardingGateViewModel) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, onboardingGateViewModel.uiState);
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            boolean zA67 = bfm.A67(onboardingGateViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new OnboardingGateScreenKt$OnboardingGateScreen$1$1(onboardingGateViewModel);
                bfm.Ai0(objAaT);
            }
            C7bA.A05(bfm, null, onboardingGateViewModel, (G0U) objAaT, iA0T & 14, 2);
            Boolean boolValueOf = Boolean.valueOf(((OnboardingGateUiState) c1boA02.getValue()).isError);
            OnboardingGateLoadingPhase onboardingGateLoadingPhase = ((OnboardingGateUiState) c1boA02.getValue()).loadingPhase;
            boolean zA65 = bfm.A65(c1boA02);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new OnboardingGateScreenKt$OnboardingGateScreen$2$1(c1boA02);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A19(bfm, objAaT2, boolValueOf, onboardingGateLoadingPhase);
            OnboardingGateDestination onboardingGateDestination = ((OnboardingGateUiState) c1boA02.getValue()).destination;
            boolean zA1J = AnonymousClass003.A1J(bfm, c1boA02, auraNavigatorA0b);
            Object objAaT3 = bfm.AaT();
            if (zA1J || objAaT3 == C78N.A00) {
                objAaT3 = new OnboardingGateScreenKt$OnboardingGateScreen$3$1(auraNavigatorA0b, c1boA02, null);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A18(bfm, objAaT3, onboardingGateDestination);
            int iOrdinal = ((OnboardingGateUiState) c1boA02.getValue()).loadingPhase.ordinal();
            if (iOrdinal == 0) {
                str = "onboarding: waiting vm connection";
            } else if (iOrdinal == 1) {
                str = "vm_connection_failed:Fetching_onboarding";
            } else {
                if (iOrdinal != 2) {
                    throw C3cG.A0q();
                }
                str = "vm_connection_success:Fetching_onboarding";
            }
            BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(AnonymousClass001.A0T(bRg2), HatchOrigin.ONBOARDING, HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_POST_AUTH, HatchScreen.ONBOARDING_GATE, null, null, null, null, 0L, 0.0f, null, null, null);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgHatchImpression);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            OnboardingAndActivationSpinnerKt.OnboardingAndActivationSpinner(str, null, ((OnboardingGateUiState) c1boA02.getValue()).isError ? ComposableSingletons$OnboardingGateScreenKt.f198lambda$2062125086 : null, bfm, 0, 2);
            if (((OnboardingGateUiState) c1boA02.getValue()).isError) {
                bfm.AgE(257650917);
                HatchHeaderTitleAlignment hatchHeaderTitleAlignment = HatchHeaderTitleAlignment.HIDDEN;
                AHD<HeaderButton> ahd = SettingsHeaderButtonKt.SettingsHeaderButtons;
                boolean zA672 = bfm.A67(auraNavigatorA0b);
                Object objAaT4 = bfm.AaT();
                if (zA672 || objAaT4 == C78N.A00) {
                    objAaT4 = new OnboardingGateScreenKt$OnboardingGateScreen$4$1$1(auraNavigatorA0b);
                    bfm.Ai0(objAaT4);
                }
                HatchHeaderKt.m994HatchPageHeaderOT94q8g(null, null, null, null, hatchHeaderTitleAlignment, false, 0, null, null, false, ahd, (G0U) objAaT4, null, null, 0L, 0L, null, null, 0, null, null, false, bfm, 221184, 0, 0, 4191183);
                boolean zA673 = bfm.A67(onboardingGateViewModel);
                Object objAaT5 = bfm.AaT();
                if (zA673 || objAaT5 == C78N.A00) {
                    objAaT5 = new OnboardingGateScreenKt$OnboardingGateScreen$4$2$1(onboardingGateViewModel);
                    bfm.Ai0(objAaT5);
                }
                BRg bRgA012 = AbstractC1754Apr.A01(AnonymousClass001.A0R(c0z7.A4C(C2VU.A06, BRg.A00)));
                float f = AuraDimensKt.SpacingLarge;
                OnboardingErrorStateKt.OnboardingErrorRetryButton((Function0) ((InterfaceC7353EnQ) objAaT5), OnboardingGateVisibilityModifierKt.onboardingGateErrorVisibility(AuraContentFrameKt.auraContentWidth(C3U4.A0C(bRgA012, f, 0.0f, f, f), AuraContentRole.Focused, bfm, 48), (OnboardingGateUiState) c1boA02.getValue(), bfm, 0), bfm, 0, 0);
            } else {
                bfm.AgE(258338993);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(onboardingGateViewModel, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ OnboardingGateUiState access$OnboardingGateScreen$lambda$0(C1BO c1bo) {
        return (OnboardingGateUiState) c1bo.getValue();
    }
}
