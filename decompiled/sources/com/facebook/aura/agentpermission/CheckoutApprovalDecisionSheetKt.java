package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AcQ;
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
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C07C;
import X.C10G;
import X.C1515AkP;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class CheckoutApprovalDecisionSheetKt {

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalDecisionSheetKt$CheckoutApprovalDecisionSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ boolean $confirming;
        public final /* synthetic */ G0U<AgentPermissionDecisionOption, Unit> $onDecision;
        public final /* synthetic */ boolean $submitting;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, boolean z, G0U<? super AgentPermissionDecisionOption, Unit> g0u, boolean z2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$submitting = z;
            this.$onDecision = g0u;
            this.$confirming = z2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                BS0 bs0 = BRg.A00;
                float f = AuraDimensKt.SpacingLarge;
                float f2 = AuraDimensKt.SpacingSmall;
                BRg bRgA0B = C3U4.A0B(bs0, f, f2);
                C9m9 c9m9A00 = AcQ.A00(f2);
                HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = this.$approval;
                boolean z = this.$submitting;
                G0U<AgentPermissionDecisionOption, Unit> g0u = this.$onDecision;
                boolean z2 = this.$confirming;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 0);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0B);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                CheckoutApprovalSharedKt.CheckoutActions(agentPermissionApproval.decisionOptions, !z, g0u, null, bfm, 0, 8);
                if (z2) {
                    bfm.AgE(-1801366056);
                    AgentPermissionPendingCardKt.AgentPermissionDecisionConfirmingStatus(null, bfm, 0, 1);
                } else {
                    bfm.AgE(-7733485);
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalDecisionSheetKt$CheckoutApprovalDecisionSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $actionsInFooter;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ boolean $confirming;
        public final /* synthetic */ G0U<AgentPermissionDecisionOption, Unit> $onDecision;
        public final /* synthetic */ boolean $submitting;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, boolean z, boolean z2, G0U<? super AgentPermissionDecisionOption, Unit> g0u, boolean z3) {
            super(3);
            this.$approval = agentPermissionApproval;
            this.$submitting = z;
            this.$actionsInFooter = z2;
            this.$onDecision = g0u;
            this.$confirming = z3;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = this.$approval;
                HatchScreen hatchScreen = HatchScreen.AGENT_PERMISSION_SINGLE_APPROVAL_SHEET;
                RichApprovalCardKt.RichApprovalCard(agentPermissionApproval, new RichApprovalSurface(hatchScreen, this.$submitting, true, false, this.$actionsInFooter, this.$onDecision, this.$confirming), AgentPermissionTelemetryKt.agentPermissionApprovalImpression(C10G.A02, this.$approval, hatchScreen), bfm, HatchAgentPermissionsRepository.AgentPermissionApproval.$stable | (RichApprovalSurface.$stable << 3), 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalDecisionSheetKt$CheckoutApprovalDecisionSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ boolean $confirming;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<AgentPermissionDecisionOption, Unit> $onDecision;
        public final /* synthetic */ boolean $submitting;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, boolean z, G0U<? super AgentPermissionDecisionOption, Unit> g0u, BRg bRg, boolean z2, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$submitting = z;
            this.$onDecision = g0u;
            this.$modifier = bRg;
            this.$confirming = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutApprovalDecisionSheetKt.CheckoutApprovalDecisionSheet(this.$approval, this.$submitting, this.$onDecision, this.$modifier, this.$confirming, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void CheckoutApprovalDecisionSheet(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, boolean z, G0U<? super AgentPermissionDecisionOption, Unit> g0u, BRg bRg, boolean z2, BFM bfm, int i, int i2) {
        B1U b1uA00;
        boolean z3 = z2;
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(agentPermissionApproval, 0, g0u);
        bfm.AgG(1353173893);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0r(bfm, z3);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z3 = false;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zRichActionsInSheetFooter = RichApprovalCardKt.richActionsInSheetFooter(agentPermissionApproval);
            if (zRichActionsInSheetFooter) {
                bfm.AgE(-159152544);
                b1uA00 = B1V.A00(bfm, new AnonymousClass1(agentPermissionApproval, z, g0u, z3), -1969085479);
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, -158626568);
                b1uA00 = null;
            }
            boolean zA1S = AnonymousClass001.A1S(bfm, auraNavigatorA0b, (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval)));
            Object objAaT = bfm.AaT();
            if (zA1S || objAaT == C78N.A00) {
                objAaT = new CheckoutApprovalDecisionSheetKt$CheckoutApprovalDecisionSheet$2$1(agentPermissionApproval, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, bRg2, null, null, b1uA00, null, (Function0) objAaT, false, false, false, null, B1V.A00(bfm, new AnonymousClass3(agentPermissionApproval, z, zRichActionsInSheetFooter, g0u, z3), -318423870), bfm, (iA05 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 48, 1965);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(agentPermissionApproval, z, g0u, bRg2, z3, i, i2);
        }
    }
}
