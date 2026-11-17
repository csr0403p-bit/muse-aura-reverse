package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchStep;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AuraNavigationKeysKt;
import com.facebook.aura.navigation.key.ConfidentialVmDataChoiceScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmDataTransferConfirmScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmDataTransferProgressScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmDeleteDataSheetKey;
import com.facebook.aura.navigation.key.ConfidentialVmRegisterPinScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmReviewArtifactsScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmSetupLoginScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchFlowKey;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchPlansScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchProgressScreenKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class ConfidentialVmSwitchNavigationKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchNavigationKt$ConfidentialVmSwitchScreenImpressionEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchScreen $screen;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchScreen hatchScreen, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, int i) {
            super(2);
            this.$screen = hatchScreen;
            this.$viewModel = confidentialVmSwitchViewModel;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmSwitchNavigationKt.ConfidentialVmSwitchScreenImpressionEffect(this.$screen, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchNavigationKt$ConfidentialVmSwitchStepEffect$2, reason: invalid class name and case insensitive filesystem */
    public final class C112802 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112802(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, int i) {
            super(2);
            this.$viewModel = confidentialVmSwitchViewModel;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmSwitchNavigationKt.ConfidentialVmSwitchStepEffect(this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchNavigationKt$navigateTo$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(AuraNavKey auraNavKey) {
            C7384Etj.A0Y(auraNavKey, 0);
            return Boolean.valueOf(auraNavKey instanceof ConfidentialVmDataTransferConfirmScreenKey);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchNavigationKt$navigateTo$2, reason: invalid class name and case insensitive filesystem */
    public final class C112812 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final C112812 INSTANCE = new C112812();

        public C112812() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(AuraNavKey auraNavKey) {
            C7384Etj.A0Y(auraNavKey, 0);
            return Boolean.valueOf(auraNavKey instanceof ConfidentialVmSwitchPlansScreenKey);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchNavigationKt$navigateTo$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(AuraNavKey auraNavKey) {
            C7384Etj.A0Y(auraNavKey, 0);
            return Boolean.valueOf(auraNavKey instanceof ConfidentialVmSwitchFlowKey);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchNavigationKt$navigateTo$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
        @Override // X.G0U
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(com.facebook.aura.navigation.AuraNavKey r1) {
            /*
                r0 = this;
                r0 = 0
                X.C7384Etj.A0Y(r1, r0)
                boolean r0 = r1 instanceof com.facebook.aura.navigation.key.ConfidentialVmSwitchFlowKey
                if (r0 != 0) goto Lf
                boolean r1 = com.facebook.aura.navigation.key.AuraNavigationKeysKt.isConfidentialVmCredentialFlowKey(r1)
                r0 = 0
                if (r1 == 0) goto L10
            Lf:
                r0 = 1
            L10:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchNavigationKt.AnonymousClass4.invoke(com.facebook.aura.navigation.AuraNavKey):java.lang.Boolean");
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchNavigationKt$navigateTo$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(AuraNavKey auraNavKey) {
            C7384Etj.A0Y(auraNavKey, 0);
            return Boolean.valueOf(AuraNavigationKeysKt.isConfidentialVmCredentialFlowKey(auraNavKey));
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchNavigationKt$navigateTo$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(AuraNavKey auraNavKey) {
            C7384Etj.A0Y(auraNavKey, 0);
            return Boolean.valueOf(auraNavKey instanceof ConfidentialVmSwitchFlowKey);
        }
    }

    public static final void ConfidentialVmSwitchStepEffect(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, BFM bfm, int i) {
        C7384Etj.A0Y(confidentialVmSwitchViewModel, 0);
        bfm.AgG(-1706335788);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(confidentialVmSwitchViewModel, bfm, i) ? 1 : 0) | i : i;
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(confidentialVmSwitchViewModel))) {
                z = true;
            }
            boolean zA1S = AnonymousClass001.A1S(bfm, auraNavigatorA0b, z);
            Object objAaT = bfm.AaT();
            if (zA1S || objAaT == C78N.A00) {
                objAaT = new ConfidentialVmSwitchNavigationKt$ConfidentialVmSwitchStepEffect$1$1(confidentialVmSwitchViewModel, auraNavigatorA0b, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A1A(bfm, objAaT, confidentialVmSwitchViewModel, auraNavigatorA0b);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C112802(confidentialVmSwitchViewModel, i);
        }
    }

    public static final void navigateTo(AuraNavigator auraNavigator, ConfidentialVmSwitchStep confidentialVmSwitchStep) {
        G0U<? super AuraNavKey, Boolean> g0u;
        AuraNavKey confidentialVmSetupLoginScreenKey;
        AuraNavKey auraNavKey;
        if (!C7384Etj.areEqual(confidentialVmSwitchStep, ConfidentialVmSwitchStep.DataChoice.INSTANCE)) {
            if (C7384Etj.areEqual(confidentialVmSwitchStep, ConfidentialVmSwitchStep.ReturnToDataChoice.INSTANCE)) {
                g0u = AnonymousClass1.INSTANCE;
            } else if (C7384Etj.areEqual(confidentialVmSwitchStep, ConfidentialVmSwitchStep.ReviewArtifacts.INSTANCE)) {
                auraNavKey = ConfidentialVmReviewArtifactsScreenKey.INSTANCE;
            } else if (C7384Etj.areEqual(confidentialVmSwitchStep, ConfidentialVmSwitchStep.ConfirmDelete.INSTANCE)) {
                auraNavKey = ConfidentialVmDeleteDataSheetKey.INSTANCE;
            } else if (C7384Etj.areEqual(confidentialVmSwitchStep, ConfidentialVmSwitchStep.Subscribe.INSTANCE)) {
                auraNavKey = ConfidentialVmSwitchPlansScreenKey.INSTANCE;
            } else if (C7384Etj.areEqual(confidentialVmSwitchStep, ConfidentialVmSwitchStep.DataChoiceAfterSubscribing.INSTANCE)) {
                auraNavigator.navigate((AuraNavKey) ConfidentialVmDataChoiceScreenKey.INSTANCE, false);
                g0u = C112812.INSTANCE;
            } else {
                if (!C7384Etj.areEqual(confidentialVmSwitchStep, ConfidentialVmSwitchStep.Close.INSTANCE)) {
                    if (confidentialVmSwitchStep instanceof ConfidentialVmSwitchStep.CreatePin) {
                        confidentialVmSetupLoginScreenKey = new ConfidentialVmRegisterPinScreenKey(((ConfidentialVmSwitchStep.CreatePin) confidentialVmSwitchStep).entryPoint);
                    } else if (confidentialVmSwitchStep instanceof ConfidentialVmSwitchStep.EnterPin) {
                        confidentialVmSetupLoginScreenKey = new ConfidentialVmSetupLoginScreenKey(((ConfidentialVmSwitchStep.EnterPin) confidentialVmSwitchStep).entryPoint);
                    } else if (confidentialVmSwitchStep instanceof ConfidentialVmSwitchStep.Progress) {
                        auraNavigator.navigate((AuraNavKey) new ConfidentialVmSwitchProgressScreenKey(((ConfidentialVmSwitchStep.Progress) confidentialVmSwitchStep).direction), false);
                        g0u = AnonymousClass4.INSTANCE;
                    } else if (C7384Etj.areEqual(confidentialVmSwitchStep, ConfidentialVmSwitchStep.DataTransferConfirm.INSTANCE)) {
                        auraNavigator.navigate((AuraNavKey) ConfidentialVmDataTransferConfirmScreenKey.INSTANCE, false);
                        g0u = AnonymousClass5.INSTANCE;
                    } else {
                        if (!(confidentialVmSwitchStep instanceof ConfidentialVmSwitchStep.DataTransferProgress)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        auraNavigator.navigate((AuraNavKey) new ConfidentialVmDataTransferProgressScreenKey(((ConfidentialVmSwitchStep.DataTransferProgress) confidentialVmSwitchStep).direction), false);
                        g0u = AnonymousClass6.INSTANCE;
                    }
                    auraNavigator.navigate(confidentialVmSetupLoginScreenKey, false);
                    return;
                }
                g0u = AnonymousClass3.INSTANCE;
            }
            auraNavigator.popAll(g0u);
            return;
        }
        auraNavKey = ConfidentialVmDataChoiceScreenKey.INSTANCE;
        auraNavigator.navigate(auraNavKey, false);
    }

    public static final void ConfidentialVmSwitchScreenImpressionEffect(HatchScreen hatchScreen, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, BFM bfm, int i) {
        AnonymousClass003.A0u(hatchScreen, confidentialVmSwitchViewModel);
        bfm.AgG(509538397);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchScreen) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass002.A06(AnonymousClass004.A1Y(confidentialVmSwitchViewModel, bfm, i) ? 1 : 0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 19, 18), bfm, iA08)) {
            boolean zA1M = ((iA08 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA08 & 64) != 0 && bfm.A67(confidentialVmSwitchViewModel))) | AnonymousClass001.A1M(iA08);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new ConfidentialVmSwitchNavigationKt$ConfidentialVmSwitchScreenImpressionEffect$1$1(confidentialVmSwitchViewModel, hatchScreen);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, hatchScreen);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchScreen, confidentialVmSwitchViewModel, i);
        }
    }
}
