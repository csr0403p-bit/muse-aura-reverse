package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BRg;
import X.C00x;
import X.C07C;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DP;
import X.C2CK;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.AgentPermissionHeadlineKt;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AgentPermissionDecisionSheetKt {

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionDecisionSheetKt$AgentPermissionDecisionLoading$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $loadingDescription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(3);
            this.$loadingDescription = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BRg bRgA04 = C10G.A04(C10G.A02, 120.0f);
                boolean zA65 = bfm.A65(this.$loadingDescription);
                String str = this.$loadingDescription;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new AgentPermissionDecisionSheetKt$AgentPermissionDecisionLoading$1$1$1(str);
                    bfm.Ai0(objAaT);
                }
                BRg bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT, false);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
                AnonymousClass007.A0s(bfm, bbi);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionDecisionSheetKt$AgentPermissionDecisionLoading$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
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
            AgentPermissionDecisionSheetKt.AgentPermissionDecisionLoading(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionDecisionSheetKt$AgentPermissionDecisionSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$approvalId = str;
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
            AgentPermissionDecisionSheetKt.AgentPermissionDecisionSheet(this.$approvalId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionDecisionSheetKt$AgentPermissionDecisionSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$approvalId = str;
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
            AgentPermissionDecisionSheetKt.AgentPermissionDecisionSheet(this.$approvalId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionDecisionSheetKt$AgentPermissionDecisionSheet$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $currentApproval;
        public final /* synthetic */ C1BO<AgentPermissionDecisionUiState> $uiState$delegate;
        public final /* synthetic */ AgentPermissionDecisionViewModel $viewModel;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                bfm.Afo();
                return;
            }
            HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = this.$currentApproval;
            HatchScreen hatchScreen = HatchScreen.AGENT_PERMISSION_SINGLE_APPROVAL_SHEET;
            float f = AuraDimensKt.SpacingLarge;
            boolean z = !this.$uiState$delegate.getValue().submitting;
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A67(this.$currentApproval));
            HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval2 = this.$currentApproval;
            AgentPermissionDecisionViewModel agentPermissionDecisionViewModel = this.$viewModel;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new AgentPermissionDecisionSheetKt$AgentPermissionDecisionSheet$7$1$1(agentPermissionApproval2, agentPermissionDecisionViewModel);
                bfm.Ai0(objAaT);
            }
            BRg bRgAgentPermissionApprovalImpression = AgentPermissionTelemetryKt.agentPermissionApprovalImpression(C10G.A02, this.$currentApproval, hatchScreen);
            float f2 = AuraDimensKt.SpacingMedium;
            AgentPermissionPendingCardKt.m168AgentPermissionApprovalContent7UH0Qls(agentPermissionApproval, hatchScreen, f, z, (G0U) objAaT, C3U4.A0C(bRgAgentPermissionApprovalImpression, 0.0f, 0.0f, 0.0f, f2), AuraDimensKt.SpacingXsmallPlusNano, new C1DP(f2, 11.0f, f2, 11.0f), this.$uiState$delegate.getValue().confirming, bfm, HatchAgentPermissionsRepository.AgentPermissionApproval.$stable | 48, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, AgentPermissionDecisionViewModel agentPermissionDecisionViewModel, C1BO<AgentPermissionDecisionUiState> c1bo) {
            super(3);
            this.$currentApproval = agentPermissionApproval;
            this.$viewModel = agentPermissionDecisionViewModel;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionDecisionSheetKt$AgentPermissionDecisionSheet$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$approvalId = str;
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
            AgentPermissionDecisionSheetKt.AgentPermissionDecisionSheet(this.$approvalId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AgentPermissionDecisionLoading(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-2145860534);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, bRg2, null, null, null, null, null, false, false, false, null, B1V.A00(bfm, new AnonymousClass1(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120232)), -1430835513), bfm, (iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 48, 2045);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg2, i, i2);
        }
    }

    public static final void AgentPermissionDecisionSheet(String str, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass8;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1974801492);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AgentPermissionDecisionViewModel.Factory factory = new AgentPermissionDecisionViewModel.Factory(AnonymousClass002.A0h(bfm), str);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            AgentPermissionDecisionViewModel agentPermissionDecisionViewModel = (AgentPermissionDecisionViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(AgentPermissionDecisionViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, agentPermissionDecisionViewModel.uiState);
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new AgentPermissionDecisionSheetKt$AgentPermissionDecisionSheet$1$1(str);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, str);
            HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = ((AgentPermissionDecisionUiState) c1boA02.getValue()).approval;
            Boolean boolValueOf = Boolean.valueOf(((AgentPermissionDecisionUiState) c1boA02.getValue()).awaitingApproval);
            boolean zA1J = AnonymousClass003.A1J(bfm, c1boA02, auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA1J || objAaT2 == C78N.A00) {
                objAaT2 = new AgentPermissionDecisionSheetKt$AgentPermissionDecisionSheet$2$1(auraNavigatorA0b, c1boA02, null);
                bfm.Ai0(objAaT2);
            }
            int i4 = HatchAgentPermissionsRepository.AgentPermissionApproval.$stable;
            C78e.A04(bfm, agentPermissionApproval, boolValueOf, (G0V) objAaT2);
            HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval2 = ((AgentPermissionDecisionUiState) c1boA02.getValue()).approval;
            if (agentPermissionApproval2 == null) {
                bfm.AgE(1151546818);
                if (((AgentPermissionDecisionUiState) c1boA02.getValue()).awaitingApproval) {
                    bfm.AgE(1151580949);
                    AgentPermissionDecisionLoading(bRg2, bfm, (iA0d >> 3) & 14, 0);
                } else {
                    bfm.AgE(1151643414);
                }
                AnonymousClass006.A1N(bfm);
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    anonymousClass8 = new AnonymousClass3(str, bRg2, i, i2);
                }
            } else {
                BBI bbiA0M = AnonymousClass002.A0M(bfm, 1151658294);
                if (AgentPermissionHeadlineKt.rendersCheckoutCard(agentPermissionApproval2)) {
                    bfm.AgE(1151719116);
                    boolean z = ((AgentPermissionDecisionUiState) c1boA02.getValue()).submitting;
                    boolean z2 = ((AgentPermissionDecisionUiState) c1boA02.getValue()).confirming;
                    boolean zA1M = AnonymousClass003.A1M(bfm, agentPermissionApproval2, agentPermissionDecisionViewModel);
                    Object objAaT3 = bfm.AaT();
                    if (zA1M || objAaT3 == C78N.A00) {
                        objAaT3 = new AgentPermissionDecisionSheetKt$AgentPermissionDecisionSheet$4$1(agentPermissionApproval2, agentPermissionDecisionViewModel);
                        bfm.Ai0(objAaT3);
                    }
                    CheckoutApprovalDecisionSheetKt.CheckoutApprovalDecisionSheet(agentPermissionApproval2, z, (G0U) objAaT3, bRg2, z2, bfm, i4 | ((iA0d << 6) & 7168), 0);
                    bBbAAc = AnonymousClass001.A0L(bfm, bbiA0M);
                    if (bBbAAc == null) {
                        return;
                    } else {
                        anonymousClass8 = new AnonymousClass5(str, bRg2, i, i2);
                    }
                } else {
                    bfm.AgE(1152159254);
                    BBI.A0R(bbiA0M, false);
                    boolean zA1M2 = AnonymousClass003.A1M(bfm, agentPermissionApproval2, auraNavigatorA0b);
                    Object objAaT4 = bfm.AaT();
                    if (zA1M2 || objAaT4 == C78N.A00) {
                        objAaT4 = new AgentPermissionDecisionSheetKt$AgentPermissionDecisionSheet$6$1(agentPermissionApproval2, auraNavigatorA0b);
                        bfm.Ai0(objAaT4);
                    }
                    AuraBottomSheetContentKt.AuraBottomSheetContent(null, bRg2, null, null, null, null, (Function0) objAaT4, false, false, false, null, B1V.A00(bfm, new AnonymousClass7(agentPermissionApproval2, agentPermissionDecisionViewModel, c1boA02), 158107471), bfm, iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 48, 1981);
                }
            }
            C3cG.A1D(bBbAAc, anonymousClass8);
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass8 = new AnonymousClass8(str, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass8);
        }
    }

    public static final /* synthetic */ AgentPermissionDecisionUiState access$AgentPermissionDecisionSheet$lambda$0(C1BO c1bo) {
        return (AgentPermissionDecisionUiState) c1bo.getValue();
    }
}
