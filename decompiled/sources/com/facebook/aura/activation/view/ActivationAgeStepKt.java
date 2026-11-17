package com.facebook.aura.activation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BQN;
import X.BRg;
import X.C1BO;
import X.C2CK;
import X.C3cG;
import X.C5wL;
import X.C78N;
import X.G0U;
import X.G0V;
import X.InterfaceC7353EnQ;
import com.facebook.aura.activation.model.AgeStep;
import com.facebook.aura.activation.model.AuraActivationViewModel;
import com.facebook.aura.ageverification.intf.AgeVerificationIntegration;
import com.facebook.aura.ccv.nativeflow.HatchLinkableAccountType;
import com.facebook.aura.ccv.nativeflow.ui.HatchAgeLinkingKt;
import com.facebook.aura.ccv.nativeflow.ui.HatchAgeLinkingState;
import com.facebook.aura.ccv.nativeflow.ui.HatchAgeLinkingViewModel;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryHostKt;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLinkingError;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.user.provider.AgeCheckMethod;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class ActivationAgeStepKt {

    /* renamed from: com.facebook.aura.activation.view.ActivationAgeStepKt$ActivationAgeVerificationStep$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAgeLogOutConfirmationDismissed;
        public final /* synthetic */ G0V<AgeCheckMethod, Integer, Unit> $onAgeMethodPicked;
        public final /* synthetic */ Function0<Unit> $onAgeStepBack;
        public final /* synthetic */ Function0<Unit> $onCCVAgeVerified;
        public final /* synthetic */ Function0<Unit> $onLogOutClick;
        public final /* synthetic */ G0U<Boolean, Unit> $onOtherAgeMethods;
        public final /* synthetic */ Function0<Unit> $onRefresh;
        public final /* synthetic */ Function0<Unit> $onRefreshAfterLinking;
        public final /* synthetic */ Function0<Unit> $onSelfieAgeConfirmed;
        public final /* synthetic */ Function0<Unit> $onSettingsClick;
        public final /* synthetic */ AuraActivationViewModel.UiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(AuraActivationViewModel.UiState uiState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0V<? super AgeCheckMethod, ? super Integer, Unit> g0v, G0U<? super Boolean, Unit> g0u, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Function0<Unit> function08, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$uiState = uiState;
            this.$onSettingsClick = function0;
            this.$onLogOutClick = function02;
            this.$onRefresh = function03;
            this.$onAgeMethodPicked = g0v;
            this.$onOtherAgeMethods = g0u;
            this.$onAgeStepBack = function04;
            this.$onAgeLogOutConfirmationDismissed = function05;
            this.$onSelfieAgeConfirmed = function06;
            this.$onCCVAgeVerified = function07;
            this.$onRefreshAfterLinking = function08;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ActivationAgeStepKt.ActivationAgeVerificationStep(this.$uiState, this.$onSettingsClick, this.$onLogOutClick, this.$onRefresh, this.$onAgeMethodPicked, this.$onOtherAgeMethods, this.$onAgeStepBack, this.$onAgeLogOutConfirmationDismissed, this.$onSelfieAgeConfirmed, this.$onCCVAgeVerified, this.$onRefreshAfterLinking, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.ActivationAgeStepKt$CardAgeStep$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onCCVAgeVerified;
        public final /* synthetic */ Function0<Unit> $onLogOut;
        public final /* synthetic */ Function0<Unit> $onLogOutConfirmationDismissed;
        public final /* synthetic */ Function0<Unit> $onRefreshAfterLinking;
        public final /* synthetic */ Function0<Unit> $onSettingsClick;
        public final /* synthetic */ boolean $showsLogOutConfirmation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, boolean z, Function0<Unit> function05, Function0<Unit> function06, BRg bRg, int i, int i2) {
            super(2);
            this.$onCCVAgeVerified = function0;
            this.$onRefreshAfterLinking = function02;
            this.$onSettingsClick = function03;
            this.$onBack = function04;
            this.$showsLogOutConfirmation = z;
            this.$onLogOutConfirmationDismissed = function05;
            this.$onLogOut = function06;
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
            ActivationAgeStepKt.CardAgeStep(this.$onCCVAgeVerified, this.$onRefreshAfterLinking, this.$onSettingsClick, this.$onBack, this.$showsLogOutConfirmation, this.$onLogOutConfirmationDismissed, this.$onLogOut, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.ActivationAgeStepKt$MethodListAgeStep$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AgeVerificationIntegration $integration;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ G0V<AgeCheckMethod, Integer, Unit> $onPick;
        public final /* synthetic */ Function0<Unit> $onRefreshAfterLinking;
        public final /* synthetic */ AgeStep.Methods $step;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(AgeVerificationIntegration ageVerificationIntegration, AgeStep.Methods methods, G0V<? super AgeCheckMethod, ? super Integer, Unit> g0v, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$integration = ageVerificationIntegration;
            this.$step = methods;
            this.$onPick = g0v;
            this.$onBack = function0;
            this.$onRefreshAfterLinking = function02;
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
            ActivationAgeStepKt.MethodListAgeStep(this.$integration, this.$step, this.$onPick, this.$onBack, this.$onRefreshAfterLinking, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void CardAgeStep(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, boolean z, Function0<Unit> function05, Function0<Unit> function06, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1692865696);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function03);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function04);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0r(bfm, z);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A0Y(bfm, function05);
        }
        if ((1572864 & i) == 0) {
            iA0T |= AnonymousClass004.A0Z(bfm, function06);
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA0T |= iA0k;
        } else if ((12582912 & i) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA0T |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(4793491 & iA0T, 4793490), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new AtomicBoolean(false);
                bfm.Ai0(objAaT);
            }
            AtomicBoolean atomicBoolean = (AtomicBoolean) objAaT;
            boolean zA67 = bfm.A67(atomicBoolean) | ((iA0T & 14) == 4);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new ActivationAgeStepKt$CardAgeStep$onAgeVerified$1$1(atomicBoolean, function0);
                bfm.Ai0(objAaT2);
            }
            Function0 function07 = (Function0) objAaT2;
            Unit unit = Unit.INSTANCE;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = ActivationAgeStepKt$CardAgeStep$1$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, unit);
            int i4 = iA0T << 3;
            function02 = function02;
            HatchCcvCardEntryHostKt.HatchCcvCardEntryHost(function07, function06, function03, function02, function04, z, function05, bRg2, bfm, AnonymousClass001.A0C(iA0T, AnonymousClass001.A05(i4, AnonymousClass004.A02(i4, ((iA0T >> 15) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (iA0T & 896) | ((iA0T << 6) & 7168)))), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, function02, function03, function04, z, function05, function06, bRg2, i, i2);
        }
    }

    public static final void MethodListAgeStep(AgeVerificationIntegration ageVerificationIntegration, AgeStep.Methods methods, G0V<? super AgeCheckMethod, ? super Integer, Unit> g0v, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2003882139);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ageVerificationIntegration, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, methods);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0v);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function02);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA05, 74898), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchAgeLinkingViewModel.Factory factory = new HatchAgeLinkingViewModel.Factory(AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            HatchAgeLinkingViewModel hatchAgeLinkingViewModel = (HatchAgeLinkingViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), "age_linking_list", C3cG.A0x(HatchAgeLinkingViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, hatchAgeLinkingViewModel.state);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = ActivationAgeStepKt$MethodListAgeStep$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            Function0 function03 = (Function0) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = ActivationAgeStepKt$MethodListAgeStep$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            HatchCcvCardEntryHostKt.HatchAgeLinkingLauncher(hatchAgeLinkingViewModel, function03, function02, (Function0) objAaT2, bfm, HatchAgeLinkingViewModel.$stable | 3120 | ((iA05 >> 6) & 896));
            AHD<AgeCheckMethod> ahd = methods.primary;
            AHD<AgeCheckMethod> ahd2 = methods.accounts;
            HatchLinkableAccountType hatchLinkableAccountType = ((HatchAgeLinkingState) c1boA02.getValue()).account;
            AgeCheckMethod ageCheckMethod = hatchLinkableAccountType != null ? HatchAgeLinkingKt.getAgeCheckMethod(hatchLinkableAccountType) : null;
            boolean zA67 = bfm.A67(hatchAgeLinkingViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new ActivationAgeStepKt$MethodListAgeStep$3$1(hatchAgeLinkingViewModel);
                bfm.Ai0(objAaT3);
            }
            G0V<? super AgeCheckMethod, ? super Integer, Unit> g0v2 = (G0V) ((InterfaceC7353EnQ) objAaT3);
            boolean z = !((HatchAgeLinkingState) c1boA02.getValue()).isResolving;
            boolean zA672 = bfm.A67(hatchAgeLinkingViewModel) | ((iA05 & 7168) == 2048);
            Object objAaT4 = bfm.AaT();
            if (zA672 || objAaT4 == obj) {
                objAaT4 = new ActivationAgeStepKt$MethodListAgeStep$4$1(hatchAgeLinkingViewModel, function0);
                bfm.Ai0(objAaT4);
            }
            ageVerificationIntegration.AgeMethodList(ahd, ahd2, ageCheckMethod, g0v, g0v2, z, (Function0) objAaT4, bRg2, bfm, AnonymousClass001.A0C(iA05 << 6, (iA05 << 3) & 7168) | ((iA05 << 24) & 234881024));
            HatchCcvLinkingError hatchCcvLinkingError = ((HatchAgeLinkingState) c1boA02.getValue()).error;
            if (hatchCcvLinkingError == null) {
                bfm.AgE(1903379621);
            } else {
                boolean zA1Z = AnonymousClass001.A1Z(hatchAgeLinkingViewModel, bfm, 1903379622);
                Object objAaT5 = bfm.AaT();
                if (zA1Z || objAaT5 == obj) {
                    objAaT5 = new ActivationAgeStepKt$MethodListAgeStep$5$1$1(hatchAgeLinkingViewModel);
                    bfm.Ai0(objAaT5);
                }
                HatchCcvCardEntryScreenKt.HatchCcvLinkingErrorDialog(hatchCcvLinkingError, (Function0) ((InterfaceC7353EnQ) objAaT5), bfm, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass6(ageVerificationIntegration, methods, g0v, function0, function02, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ActivationAgeVerificationStep(com.facebook.aura.activation.model.AuraActivationViewModel.UiState r40, kotlin.jvm.functions.Function0<kotlin.Unit> r41, kotlin.jvm.functions.Function0<kotlin.Unit> r42, kotlin.jvm.functions.Function0<kotlin.Unit> r43, X.G0V<? super com.facebook.aura.user.provider.AgeCheckMethod, ? super java.lang.Integer, kotlin.Unit> r44, X.G0U<? super java.lang.Boolean, kotlin.Unit> r45, kotlin.jvm.functions.Function0<kotlin.Unit> r46, kotlin.jvm.functions.Function0<kotlin.Unit> r47, kotlin.jvm.functions.Function0<kotlin.Unit> r48, kotlin.jvm.functions.Function0<kotlin.Unit> r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, X.BRg r51, X.BFM r52, int r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.ActivationAgeStepKt.ActivationAgeVerificationStep(com.facebook.aura.activation.model.AuraActivationViewModel$UiState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0V, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int, int):void");
    }
}
