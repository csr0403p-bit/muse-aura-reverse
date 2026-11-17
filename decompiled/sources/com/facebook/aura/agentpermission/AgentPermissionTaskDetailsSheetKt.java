package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C07C;
import X.C1515AkP;
import X.C1BO;
import X.C2CK;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.AgentPermissionTaskDetailsViewModel;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.ConnectorOrderCheckout;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.base.ComponentsKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.header.AuraSectionHeaderKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AgentPermissionTaskDetailsSheetKt {

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionTaskDetailsSheetKt$AgentPermissionTaskDetailsSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $currentApproval;
        public final /* synthetic */ HatchScreen $openerScreen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen) {
            super(3);
            this.$currentApproval = agentPermissionApproval;
            this.$openerScreen = hatchScreen;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                AgentPermissionTaskDetailsSheetKt.TaskDetailsBody(this.$currentApproval, AgentPermissionTaskDetailsSheetKt.taskDetailsScreen(this.$openerScreen), bfm, HatchAgentPermissionsRepository.AgentPermissionApproval.$stable);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionTaskDetailsSheetKt$AgentPermissionTaskDetailsSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchScreen $openerScreen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, HatchScreen hatchScreen, BRg bRg, int i, int i2) {
            super(2);
            this.$approvalId = str;
            this.$openerScreen = hatchScreen;
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
            AgentPermissionTaskDetailsSheetKt.AgentPermissionTaskDetailsSheet(this.$approvalId, this.$openerScreen, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionTaskDetailsSheetKt$DetailSection$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $header;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(2);
            this.$header = str;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AuraSectionHeaderKt.AuraSectionHeader(this.$header, null, null, bfm, 48, 4);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionTaskDetailsSheetKt$DetailSection$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $body;
        public final /* synthetic */ String $header;
        public final /* synthetic */ C07C $this_DetailSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C07C c07c, String str, String str2, int i) {
            super(2);
            this.$this_DetailSection = c07c;
            this.$header = str;
            this.$body = str2;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionTaskDetailsSheetKt.DetailSection(this.$this_DetailSection, this.$header, this.$body, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionTaskDetailsSheetKt$GenericTaskDetails$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ HatchAgentPermissionsRepository.OutgoingMediaApproval $outgoingMedia;
        public final /* synthetic */ HatchScreen $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, HatchAgentPermissionsRepository.OutgoingMediaApproval outgoingMediaApproval, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$screen = hatchScreen;
            this.$outgoingMedia = outgoingMediaApproval;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionTaskDetailsSheetKt.GenericTaskDetails(this.$approval, this.$screen, this.$outgoingMedia, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionTaskDetailsSheetKt$TaskDetailsBody$1, reason: invalid class name and case insensitive filesystem */
    public final class C107761 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ HatchScreen $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107761(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, int i) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$screen = hatchScreen;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionTaskDetailsSheetKt.TaskDetailsBody(this.$approval, this.$screen, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionTaskDetailsSheetKt$TaskDetailsBody$2, reason: invalid class name and case insensitive filesystem */
    public final class C107772 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ HatchScreen $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107772(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, int i) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$screen = hatchScreen;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionTaskDetailsSheetKt.TaskDetailsBody(this.$approval, this.$screen, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final boolean hasTaskDetailsBeyondSummary(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        HatchAgentPermissionsRepository.OutgoingMediaApproval outgoingMediaApproval;
        List<HatchAgentPermissionsRepository.OutgoingMediaItem> list;
        C7384Etj.A0Y(agentPermissionApproval, 0);
        List<HatchAgentPermissionsRepository.AgentPermissionDetailRow> list2 = agentPermissionApproval.detailRows;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (HatchAgentPermissionsRepository.AgentPermissionDetailRow agentPermissionDetailRow : list2) {
                if (!C7BY.A0j(agentPermissionDetailRow.label) && !C7BY.A0j(agentPermissionDetailRow.value)) {
                    return true;
                }
            }
        }
        if (!AgentPermissionRequestPreviewKt.hasDetailsRequestPreview(agentPermissionApproval)) {
            HatchAgentPermissionsRepository.AgentPermissionRichPayload agentPermissionRichPayload = agentPermissionApproval.richPayload;
            if (!(agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.StripeLinkCheckoutApproval)) {
                if (!(agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.OutgoingMediaApproval) || (outgoingMediaApproval = (HatchAgentPermissionsRepository.OutgoingMediaApproval) agentPermissionRichPayload) == null || (list = outgoingMediaApproval.items) == null || !(!list.isEmpty())) {
                    String str = agentPermissionApproval.scopeSummary;
                    if (str != null && !C7BY.A0j(str)) {
                        String str2 = agentPermissionApproval.scopeSummary;
                        String strA0l = str2 != null ? AnonymousClass002.A0l(str2) : null;
                        String str3 = agentPermissionApproval.purposeSummary;
                        if (!C7384Etj.areEqual(strA0l, str3 != null ? AnonymousClass002.A0l(str3) : null)) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static final void AgentPermissionTaskDetailsSheet(String str, HatchScreen hatchScreen, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass5;
        BRg bRgA0U;
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(str, hatchScreen);
        bfm.AgG(1456834354);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass005.A09(bfm, hatchScreen);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AgentPermissionTaskDetailsViewModel.Factory factory = new AgentPermissionTaskDetailsViewModel.Factory(AnonymousClass002.A0h(bfm), str);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            C1BO c1boA02 = C2CK.A02(bfm, ((AgentPermissionTaskDetailsViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(AgentPermissionTaskDetailsViewModel.class))).approval);
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new AgentPermissionTaskDetailsSheetKt$AgentPermissionTaskDetailsSheet$1$1(str);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, str);
            Object value = c1boA02.getValue();
            boolean zA1J = AnonymousClass003.A1J(bfm, c1boA02, auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA1J || objAaT2 == C78N.A00) {
                objAaT2 = new AgentPermissionTaskDetailsSheetKt$AgentPermissionTaskDetailsSheet$2$1(auraNavigatorA0b, c1boA02, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, value);
            HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApprovalA0N = C3cH.A0N(c1boA02);
            if (agentPermissionApprovalA0N == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass5 = new AgentPermissionTaskDetailsSheetKt$AgentPermissionTaskDetailsSheet$currentApproval$1(str, hatchScreen, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass5);
                }
                return;
            }
            if (agentPermissionApprovalA0N.richPayload instanceof HatchAgentPermissionsRepository.StripeLinkCheckoutApproval) {
                AnonymousClass003.A0l(bfm, -141498502);
                bRgA0U = BRg.A00;
            } else {
                bRgA0U = AnonymousClass001.A0U(C3cG.A09(bfm, -141497541), AuraLayoutSizeKt.auraLayoutHeight(bfm, zA1b ? 1 : 0) * 0.8f);
                AnonymousClass001.A1D(bfm);
            }
            AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
            BRg bRgThen = bRg2.then(bRgA0U);
            AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig = new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120149), null, null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null);
            boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, bfm.A67(agentPermissionApprovalA0N), AnonymousClass004.A1I(iA0d));
            Object objAaT3 = bfm.AaT();
            if (zA1V || objAaT3 == C78N.A00) {
                objAaT3 = new AgentPermissionTaskDetailsSheetKt$AgentPermissionTaskDetailsSheet$3$1(agentPermissionApprovalA0N, hatchScreen, auraNavigatorA0b);
                bfm.Ai0(objAaT3);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, bRgThen, null, auraBottomSheetHeaderConfig, null, null, (Function0) objAaT3, zA1b, zA1b, zA1b, null, B1V.A00(bfm, new AnonymousClass4(agentPermissionApprovalA0N, hatchScreen), -865951723), bfm, 6, 48, 1972);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(str, hatchScreen, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass5);
        }
    }

    public static final void GenericTaskDetails(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, HatchAgentPermissionsRepository.OutgoingMediaApproval outgoingMediaApproval, BFM bfm, int i, int i2) {
        String strA0l;
        boolean z;
        HatchAgentPermissionsRepository.OutgoingMediaApproval outgoingMediaApproval2 = outgoingMediaApproval;
        bfm.AgG(-1633740270);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass005.A09(bfm, hatchScreen);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(outgoingMediaApproval2, bfm, i) ? 1 : 0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                outgoingMediaApproval2 = null;
            }
            BS0 bs0 = BRg.A00;
            float f = AuraDimensKt.SpacingLarge;
            BRg bRgA07 = C3U4.A07(bs0, f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA02);
            C90l c90l = C90l.A00;
            String str = agentPermissionApproval.scopeSummary;
            if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || C7BY.A0j(strA0l)) {
                strA0l = null;
            }
            if (strA0l != null) {
                bfm.AgE(978949813);
                DetailSection(c90l, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12014a), strA0l, bfm, 6);
                BBI.A0R(bbi, false);
                z = true;
            } else {
                bfm.AgE(979108378);
                BBI.A0R(bbi, false);
                z = false;
            }
            bfm.AgE(-1215340871);
            for (HatchAgentPermissionsRepository.AgentPermissionDetailRow agentPermissionDetailRow : agentPermissionApproval.detailRows) {
                if (z) {
                    bfm.AgE(-554877516);
                    ComponentsKt.m2403AuraVerticalSpacer8Feqmps(f, bfm, 0);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(-554829466);
                    BBI.A0R(bbi, false);
                }
                DetailSection(c90l, agentPermissionDetailRow.label, agentPermissionDetailRow.value, bfm, 6);
                z = true;
            }
            BBI.A0R(bbi, false);
            if (outgoingMediaApproval2 == null || outgoingMediaApproval2.items.isEmpty()) {
                bfm.AgE(979547834);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(979381581);
                if (z) {
                    bfm.AgE(979401576);
                    ComponentsKt.m2403AuraVerticalSpacer8Feqmps(f, bfm, 0);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(979449626);
                    BBI.A0R(bbi, false);
                }
                AgentPermissionOutgoingMediaApprovalKt.AgentPermissionOutgoingMediaApproval(outgoingMediaApproval2, null, bfm, HatchAgentPermissionsRepository.OutgoingMediaApproval.$stable | ((iA05 >> 6) & 14), 2);
                BBI.A0R(bbi, false);
                z = true;
            }
            if (AgentPermissionRequestPreviewKt.hasDetailsRequestPreview(agentPermissionApproval) || (agentPermissionApproval.richPayload instanceof ConnectorOrderCheckout)) {
                bfm.AgE(979666378);
                if (z) {
                    bfm.AgE(979668424);
                    ComponentsKt.m2403AuraVerticalSpacer8Feqmps(f, bfm, 0);
                } else {
                    bfm.AgE(979716474);
                }
                BBI.A0R(bbi, false);
                G0V<BFM, Integer, Unit> g0v = ComposableSingletons$AgentPermissionTaskDetailsSheetKt.lambda$1588808366;
                boolean zA1C = ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval))) | AnonymousClass003.A1C(iA05);
                Object objAaT = bfm.AaT();
                if (zA1C || objAaT == C78N.A00) {
                    objAaT = new AgentPermissionTaskDetailsSheetKt$GenericTaskDetails$1$2$1(agentPermissionApproval, hatchScreen);
                    bfm.Ai0(objAaT);
                }
                HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, g0v, 0L, (G0U) objAaT, bfm, 390, 5);
            } else {
                bfm.AgE(980389050);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(agentPermissionApproval, hatchScreen, outgoingMediaApproval2, i, i2);
        }
    }

    public static final HatchScreen taskDetailsScreen(HatchScreen hatchScreen) {
        HatchScreen hatchScreen2 = HatchScreen.AGENT_PERMISSION_MULTI_APPROVAL_SHEET;
        return hatchScreen != hatchScreen2 ? HatchScreen.AGENT_PERMISSION_SINGLE_APPROVAL_SHEET : hatchScreen2;
    }

    public static final void DetailSection(C07C c07c, String str, String str2, BFM bfm, int i) {
        bfm.AgG(483220234);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            B1U b1uA00 = B1V.A00(bfm, new AnonymousClass1(str), 1434446551);
            boolean z = (iA0d & 896) == 256;
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new AgentPermissionTaskDetailsSheetKt$DetailSection$2$1(str2);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, b1uA00, 0L, (G0U) objAaT, bfm, (iA0d & 14) | 384, 5);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(c07c, str, str2, i);
        }
    }

    public static final void TaskDetailsBody(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c107772;
        int iA01;
        int i2;
        HatchAgentPermissionsRepository.OutgoingMediaApproval outgoingMediaApproval;
        bfm.AgG(1092557060);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass005.A09(bfm, hatchScreen);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            HatchAgentPermissionsRepository.AgentPermissionRichPayload agentPermissionRichPayload = agentPermissionApproval.richPayload;
            if (agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.StripeLinkCheckoutApproval) {
                bfm.AgE(1105376990);
                PayWithLinkDetails payWithLinkDetails = CheckoutPayWithLinkSheetKt.toPayWithLinkDetails((HatchAgentPermissionsRepository.StripeLinkCheckoutApproval) agentPermissionRichPayload);
                CheckoutPayWithLinkSheetKt.PayWithLinkBody(payWithLinkDetails, CheckoutPayWithLinkSheetKt.cardExpiry(payWithLinkDetails.cardExpiresInMs), false, false, null, bfm, PayWithLinkDetails.$stable | 3456 | (CardExpiry.$stable << 3), 16);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    c107772 = new C107761(agentPermissionApproval, hatchScreen, i);
                    bBbAAc.A06 = c107772;
                }
                return;
            }
            if (agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.OutgoingMediaApproval) {
                bfm.AgE(1975329305);
                outgoingMediaApproval = (HatchAgentPermissionsRepository.OutgoingMediaApproval) agentPermissionRichPayload;
                iA01 = (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | C3cH.A01(iA05) | (HatchAgentPermissionsRepository.OutgoingMediaApproval.$stable << 6);
                i2 = 0;
            } else {
                bfm.AgE(1975332412);
                iA01 = C3cH.A01(iA05) | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
                i2 = 4;
                outgoingMediaApproval = null;
            }
            GenericTaskDetails(agentPermissionApproval, hatchScreen, outgoingMediaApproval, bfm, iA01, i2);
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c107772 = new C107772(agentPermissionApproval, hatchScreen, i);
            bBbAAc.A06 = c107772;
        }
    }
}
