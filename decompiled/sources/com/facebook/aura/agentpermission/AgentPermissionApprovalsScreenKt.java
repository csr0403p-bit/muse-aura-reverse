package com.facebook.aura.agentpermission;

import X.AHD;
import X.AKQ;
import X.ARD;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AnonymousClass037;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C0A8;
import X.C0CD;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DP;
import X.C1YY;
import X.C2273BRq;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.C9m9;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.text.format.DateUtils;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.AgentPermissionApprovalsViewModel;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.AgentPermissionHeadlineKt;
import com.facebook.aura.gateway.ApprovalConversationIdentity;
import com.facebook.aura.gateway.ApprovalRecord;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.skills.view.common.HatchConnectorIconKt;
import com.facebook.aura.ui.HatchScreenEmptyStateKt;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonCorner;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AgentPermissionApprovalsScreenKt {

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$ActionedApprovalRow$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$onClick = function0;
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
            AgentPermissionApprovalsScreenKt.ActionedApprovalRow(this.$approval, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$ApprovalDecisionButtons$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C107322 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ ApprovalRowDecisions $decisions;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Integer, Unit> $onDecision;
        public final /* synthetic */ Function0<Unit> $onReview;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107322(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, ApprovalRowDecisions approvalRowDecisions, boolean z, G0U<? super Integer, Unit> g0u, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$decisions = approvalRowDecisions;
            this.$enabled = z;
            this.$onDecision = g0u;
            this.$onReview = function0;
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
            AgentPermissionApprovalsScreenKt.ApprovalDecisionButtons(this.$approval, this.$decisions, this.$enabled, this.$onDecision, this.$onReview, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$ApprovalIdentityRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C107332 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $additionalContent;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107332(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, BRg bRg, String str, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$modifier = bRg;
            this.$title = str;
            this.$additionalContent = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionApprovalsScreenKt.ApprovalIdentityRow(this.$approval, this.$modifier, this.$title, this.$additionalContent, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$ApprovalsSectionHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C107342 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107342(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
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
            AgentPermissionApprovalsScreenKt.ApprovalsSectionHeader(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$CheckoutApprovalRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C107352 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ boolean $confirming;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onReview;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107352(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$confirming = z;
            this.$onReview = function0;
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
            AgentPermissionApprovalsScreenKt.CheckoutApprovalRow(this.$approval, this.$confirming, this.$onReview, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$CollapsedApprovalRow$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
            super(2);
            this.$approval = agentPermissionApproval;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                AgentPermissionPendingCardKt.PermissionCaption(this.$approval, C06G.A0Z(bfm), bfm, HatchAgentPermissionsRepository.AgentPermissionApproval.$stable, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$CollapsedApprovalRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C107362 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107362(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$onClick = function0;
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
            AgentPermissionApprovalsScreenKt.CollapsedApprovalRow(this.$approval, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$ExpandedApprovalRow$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C107371 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ boolean $confirming;
        public final /* synthetic */ ApprovalRowDecisions $decisions;
        public final /* synthetic */ G0U<Integer, Unit> $onDecision;
        public final /* synthetic */ Function0<Unit> $onReview;
        public final /* synthetic */ boolean $submitting;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107371(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, ApprovalRowDecisions approvalRowDecisions, boolean z, G0U<? super Integer, Unit> g0u, Function0<Unit> function0, boolean z2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$decisions = approvalRowDecisions;
            this.$submitting = z;
            this.$onDecision = g0u;
            this.$onReview = function0;
            this.$confirming = z2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                C1062ATq c1062ATq = C10G.A02;
                C9m9 c9m9A00 = AcQ.A00(10.0f);
                HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = this.$approval;
                ApprovalRowDecisions approvalRowDecisions = this.$decisions;
                boolean z = this.$submitting;
                G0U<Integer, Unit> g0u = this.$onDecision;
                Function0<Unit> function0 = this.$onReview;
                boolean z2 = this.$confirming;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 6);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, c1062ATq);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, i2);
                C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
                int i3 = HatchAgentPermissionsRepository.AgentPermissionApproval.$stable;
                AgentPermissionPendingCardKt.PermissionCaption(agentPermissionApproval, c1822ArmA0Z, bfm, i3, 0);
                AgentPermissionPendingCardKt.AgentPermissionPurposeCard(agentPermissionApproval, HatchScreen.AGENT_PERMISSION_MULTI_APPROVAL_SHEET, null, bfm, i3 | 48, 4);
                if (approvalRowDecisions != null) {
                    bfm.AgE(753355195);
                    AgentPermissionApprovalsScreenKt.ApprovalDecisionButtons(agentPermissionApproval, approvalRowDecisions, !z, g0u, function0, null, bfm, i3 | (ApprovalRowDecisions.$stable << 3), 32);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(753602172);
                    BBI.A0R(bbi, false);
                }
                if (z2) {
                    bfm.AgE(-1499710001);
                    AgentPermissionPendingCardKt.AgentPermissionDecisionConfirmingStatus(null, bfm, 0, 1);
                } else {
                    bfm.AgE(753669628);
                }
                AnonymousClass003.A0q(bbi);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$ExpandedApprovalRow$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C107382 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ boolean $confirming;
        public final /* synthetic */ ApprovalRowDecisions $decisions;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Integer, Unit> $onDecision;
        public final /* synthetic */ Function0<Unit> $onReview;
        public final /* synthetic */ boolean $submitting;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107382(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, ApprovalRowDecisions approvalRowDecisions, boolean z, boolean z2, G0U<? super Integer, Unit> g0u, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$decisions = approvalRowDecisions;
            this.$submitting = z;
            this.$confirming = z2;
            this.$onDecision = g0u;
            this.$onReview = function0;
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
            AgentPermissionApprovalsScreenKt.ExpandedApprovalRow(this.$approval, this.$decisions, this.$submitting, this.$confirming, this.$onDecision, this.$onReview, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$approvalsStatusItem$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C107401 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107401(Function0<Unit> function0) {
            super(3);
            this.$onRetry = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                HatchScreenErrorStateKt.HatchScreenErrorState(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12007f), this.$onRetry, AnonymousClass001.A0V(C3U4.A07(C10G.A02, 16.0f), 200.0f), HatchSurface.STATUS, HatchSubsurface.BOT_SHEET_CONTENT, HatchScreen.BOT_SHEET, HatchComponent.TAB_APPROVALS.getValue(), bfm, 224640, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$approvalsStatusItem$2, reason: invalid class name and case insensitive filesystem */
    public final class C107412 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onLoadMore;
        public final /* synthetic */ AgentPermissionApprovalsUiState $uiState;

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            C7384Etj.A0Y(anonymousClass037, 0);
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            AgentPermissionApprovalsUiState agentPermissionApprovalsUiState = this.$uiState;
            String str = agentPermissionApprovalsUiState.historyLoadMoreKey;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onLoadMore, bfm.A67(agentPermissionApprovalsUiState));
            AgentPermissionApprovalsUiState agentPermissionApprovalsUiState2 = this.$uiState;
            Function0<Unit> function0 = this.$onLoadMore;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new AgentPermissionApprovalsScreenKt$approvalsStatusItem$2$1$1(agentPermissionApprovalsUiState2, function0);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, str);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120113);
            AuraLabelButtonStyle auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
            boolean z = this.$uiState.isLoadingMoreHistory;
            boolean z2 = !z;
            BRg bRgA0O = AnonymousClass006.A0O(C3U4.A07(C10G.A02, 16.0f));
            boolean zA65 = bfm.A65(this.$onLoadMore);
            Function0<Unit> function02 = this.$onLoadMore;
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new AgentPermissionApprovalsScreenKt$approvalsStatusItem$2$2$1(function02);
                bfm.Ai0(objAaT2);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA0O, auraLabelButtonStyleSecondary, auraButtonSize, null, false, false, z2, z, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134199749);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107412(AgentPermissionApprovalsUiState agentPermissionApprovalsUiState, Function0<Unit> function0) {
            super(3);
            this.$uiState = agentPermissionApprovalsUiState;
            this.$onLoadMore = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final String approvalHistoryTitle(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        String str;
        C7384Etj.A0Y(agentPermissionApproval, 0);
        ApprovalRecord approvalRecord = agentPermissionApproval.approvalRecord;
        String str2 = approvalRecord != null ? approvalRecord.summaryTitle : null;
        if (str2 != null && !C7BY.A0j(str2)) {
            ApprovalRecord approvalRecord2 = agentPermissionApproval.approvalRecord;
            if (approvalRecord2 != null) {
                str = approvalRecord2.summaryTitle;
            }
        }
        String str3 = agentPermissionApproval.purposeSummary;
        if (str3 == null || C7BY.A0j(str3)) {
            String str4 = agentPermissionApproval.displayName;
            if (str4 == null || C7BY.A0j(str4)) {
                String str5 = agentPermissionApproval.permissionQuestion;
                if (str5 == null || C7BY.A0j(str5)) {
                    return agentPermissionApproval.approvalId;
                }
                str = agentPermissionApproval.permissionQuestion;
            } else {
                str = agentPermissionApproval.displayName;
            }
        } else {
            str = agentPermissionApproval.purposeSummary;
        }
        return str == null ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String decisionLabel(com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval r3, X.BFM r4, int r5) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r3, r0)
            com.facebook.aura.gateway.ApprovalRecord r3 = r3.approvalRecord
            r1 = 0
            if (r3 == 0) goto Lb1
            com.facebook.aura.gateway.ApprovalRecordStatus r2 = r3.status
        Lb:
            com.facebook.aura.gateway.ApprovalRecordStatus r0 = com.facebook.aura.gateway.ApprovalRecordStatus.TIMED_OUT
            if (r2 == r0) goto La6
            if (r3 == 0) goto La3
            com.facebook.aura.gateway.ApprovalRecordDecision r2 = r3.decision
        L13:
            com.facebook.aura.gateway.ApprovalRecordDecision r0 = com.facebook.aura.gateway.ApprovalRecordDecision.TIMED_OUT
            if (r2 == r0) goto La6
            if (r3 == 0) goto La0
            com.facebook.aura.gateway.ApprovalRecordDecision r2 = r3.decision
        L1b:
            com.facebook.aura.gateway.ApprovalRecordDecision r0 = com.facebook.aura.gateway.ApprovalRecordDecision.ALLOW_ALWAYS
            if (r2 != r0) goto L2d
            r0 = 1397285623(0x5348e2f7, float:8.628013E11)
            r4.AgE(r0)
            r0 = 2131886238(0x7f12009e, float:1.940705E38)
        L28:
            java.lang.String r0 = X.AnonymousClass003.A0e(r4, r0)
            return r0
        L2d:
            if (r3 == 0) goto L3f
            com.facebook.aura.gateway.ApprovalRecordDecision r2 = r3.decision
        L31:
            com.facebook.aura.gateway.ApprovalRecordDecision r0 = com.facebook.aura.gateway.ApprovalRecordDecision.AUTO_ALLOW
            if (r2 != r0) goto L41
            r0 = 1397290389(0x5348f595, float:8.6311364E11)
            r4.AgE(r0)
            r0 = 2131886240(0x7f1200a0, float:1.9407053E38)
            goto L28
        L3f:
            r2 = r1
            goto L31
        L41:
            if (r3 == 0) goto L9e
            com.facebook.aura.gateway.ApprovalRecordDecision r2 = r3.decision
        L45:
            com.facebook.aura.gateway.ApprovalRecordDecision r0 = com.facebook.aura.gateway.ApprovalRecordDecision.ALLOW_ONCE
            if (r2 != r0) goto L53
            r0 = 1397295090(0x534907f2, float:8.6342173E11)
        L4c:
            r4.AgE(r0)
            r0 = 2131886237(0x7f12009d, float:1.9407047E38)
            goto L28
        L53:
            if (r3 == 0) goto L65
            com.facebook.aura.gateway.ApprovalRecordDecision r2 = r3.decision
        L57:
            com.facebook.aura.gateway.ApprovalRecordDecision r0 = com.facebook.aura.gateway.ApprovalRecordDecision.DENY_ALWAYS
            if (r2 != r0) goto L67
            r0 = 1397299734(0x53491a16, float:8.6372608E11)
            r4.AgE(r0)
            r0 = 2131886239(0x7f12009f, float:1.9407051E38)
            goto L28
        L65:
            r2 = r1
            goto L57
        L67:
            if (r3 == 0) goto L9c
            com.facebook.aura.gateway.ApprovalRecordDecision r2 = r3.decision
        L6b:
            com.facebook.aura.gateway.ApprovalRecordDecision r0 = com.facebook.aura.gateway.ApprovalRecordDecision.DENY
            if (r2 != r0) goto L79
            r2 = 1397304273(0x53492bd1, float:8.6402354E11)
        L72:
            r4.AgE(r2)
            r0 = 2131886243(0x7f1200a3, float:1.940706E38)
            goto L28
        L79:
            if (r3 == 0) goto L85
            com.facebook.aura.gateway.ApprovalRecordStatus r2 = r3.status
        L7d:
            com.facebook.aura.gateway.ApprovalRecordStatus r0 = com.facebook.aura.gateway.ApprovalRecordStatus.APPROVED
            if (r2 != r0) goto L87
            r0 = 1397308658(0x53493cf2, float:8.6431092E11)
            goto L4c
        L85:
            r2 = r1
            goto L7d
        L87:
            if (r3 == 0) goto L8b
            com.facebook.aura.gateway.ApprovalRecordStatus r1 = r3.status
        L8b:
            com.facebook.aura.gateway.ApprovalRecordStatus r0 = com.facebook.aura.gateway.ApprovalRecordStatus.DENIED
            r2 = 1397313009(0x53494df1, float:8.6459607E11)
            if (r1 == r0) goto L72
            r0 = 1397315442(0x53495772, float:8.6475552E11)
            r4.AgE(r0)
            r0 = 2131886244(0x7f1200a4, float:1.9407061E38)
            goto L28
        L9c:
            r2 = r1
            goto L6b
        L9e:
            r2 = r1
            goto L45
        La0:
            r2 = r1
            goto L1b
        La3:
            r2 = r1
            goto L13
        La6:
            r0 = 1397280884(0x5348d074, float:8.6249072E11)
            r4.AgE(r0)
            r0 = 2131886245(0x7f1200a5, float:1.9407063E38)
            goto L28
        Lb1:
            r2 = r1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt.decisionLabel(com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval, X.BFM, int):java.lang.String");
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$actionedApprovalsSection$1, reason: invalid class name and case insensitive filesystem */
    public final class C107391 extends AbstractC7559F3s implements G0V<Integer, HatchAgentPermissionsRepository.AgentPermissionApproval, Object> {
        public static final C107391 INSTANCE = new C107391();

        public C107391() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
            return invoke(AnonymousClass001.A0F(num), agentPermissionApproval);
        }

        public final Object invoke(int i, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
            C7384Etj.A0Y(agentPermissionApproval, 1);
            return FGI.A0M("actioned_approval_", agentPermissionApproval.approvalId);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$openApprovalsSection$1, reason: invalid class name and case insensitive filesystem */
    public final class C107421 extends AbstractC7559F3s implements G0V<Integer, HatchAgentPermissionsRepository.AgentPermissionApproval, Object> {
        public static final C107421 INSTANCE = new C107421();

        public C107421() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
            return invoke(AnonymousClass001.A0F(num), agentPermissionApproval);
        }

        public final Object invoke(int i, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
            C7384Etj.A0Y(agentPermissionApproval, 1);
            return FGI.A0M("open_approval_", agentPermissionApproval.approvalId);
        }
    }

    public static final void ActionedApprovalRow(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        String strDecisionLabel;
        String strA0w;
        BRg bRg2 = bRg;
        bfm.AgG(1875360064);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strApprovalHistoryTitle = approvalHistoryTitle(agentPermissionApproval);
            String strApprovalHistorySummary = approvalHistorySummary(agentPermissionApproval, strApprovalHistoryTitle);
            ApprovalRecord approvalRecord = agentPermissionApproval.approvalRecord;
            if (approvalRecord == null || (strDecisionLabel = approvalRecord.outcomeLabel) == null) {
                bfm.AgE(-1665233361);
                strDecisionLabel = decisionLabel(agentPermissionApproval, bfm, (iA05 & 14) | HatchAgentPermissionsRepository.AgentPermissionApproval.$stable);
            } else {
                bfm.AgE(-1665234911);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            String strApprovalHistoryTimestamp = approvalHistoryTimestamp(agentPermissionApproval.requestedAtMs, bfm, 0);
            BRg bRgA04 = C0v5.A04(AnonymousClass001.A0R(bRg2), C3cG.A0A(0), null, function0, true);
            float f = AuraDimensKt.SpacingMedium;
            float f2 = AuraDimensKt.SpacingXsmallPlusNano;
            BRg bRgA0B = C3U4.A0B(bRgA04, f, f2);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(f2), bfm, C2VU.A05, 48);
            int iA02 = C3cG.A02(bbiA07.A06);
            AKQ akqA04 = BBI.A04(bbiA07);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA07.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA07, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            HatchConnectorIconKt.m2169ConnectorIconVRRgpyE(agentPermissionApproval.iconUrl, agentPermissionApproval.iconRes, null, AgentPermissionIconsKt.ApprovalIconSize, AgentPermissionIconsKt.ApprovalIconCornerRadius, AgentPermissionIconsKt.approvalGlyphRes(agentPermissionApproval), AgentPermissionIconsKt.ApprovalIconGlyphSize, null, null, bfm, 0, 388);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, BRg.A00, true);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMicro, 0);
            int iA0D = AnonymousClass001.A0D(bbiA07);
            AKQ akqA042 = BBI.A04(bbiA07);
            BRg bRgA012 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbiA07, function02);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strApprovalHistoryTitle, null, C3cH.A06(bfm, auraTheme), C3cH.A0D(bfm, auraTheme), null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            if (strApprovalHistorySummary == null) {
                bfm.AgE(259858754);
                BBI.A0R(bbiA07, false);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(strApprovalHistorySummary, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, 259858755).subheadlineRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbiA07, false);
            }
            if (strApprovalHistoryTimestamp == null) {
                bfm.AgE(260160198);
                BBI.A0R(bbiA07, false);
            } else {
                bfm.AgE(260160199);
                strA0w = AnonymousClass006.A0w(bfm, strDecisionLabel, strApprovalHistoryTimestamp, R.string._name_removed__res_0x7f1200f9);
                BBI.A0R(bbiA07, false);
                if (strA0w == null) {
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA0w, null, C3cH.A05(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbiA07, true);
                BBI.A0R(bbiA07, true);
            }
            strA0w = strDecisionLabel;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0w, null, C3cH.A05(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbiA07, true);
            BBI.A0R(bbiA07, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(agentPermissionApproval, function0, bRg2, i, i2);
        }
    }

    /* renamed from: AgentPermissionApprovalsScreen-djqs-MU, reason: not valid java name */
    public static final void m161AgentPermissionApprovalsScreendjqsMU(String str, float f, float f2, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object agentPermissionApprovalsScreenKt$AgentPermissionApprovalsScreen$5;
        BRg bRg2 = bRg;
        bfm.AgG(-1493387380);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA0d & 14;
            AgentPermissionApprovalsViewModel agentPermissionApprovalsViewModelRememberAgentPermissionApprovalsViewModel = rememberAgentPermissionApprovalsViewModel(str, bfm, i4);
            C1BO c1boA02 = C2CK.A02(bfm, agentPermissionApprovalsViewModelRememberAgentPermissionApprovalsViewModel.uiState);
            boolean zA67 = bfm.A67(agentPermissionApprovalsViewModelRememberAgentPermissionApprovalsViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new AgentPermissionApprovalsScreenKt$AgentPermissionApprovalsScreen$1$1(agentPermissionApprovalsViewModelRememberAgentPermissionApprovalsViewModel);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, agentPermissionApprovalsViewModelRememberAgentPermissionApprovalsViewModel);
            if (C3cH.A0J(c1boA02).historyLoadingState == ApprovalHistoryLoadingState.SUCCESS && C3cH.A0J(c1boA02).history.isEmpty() && C3cH.A0J(c1boA02).openApprovals.isEmpty()) {
                bfm.AgE(2063316436);
                HatchScreenEmptyStateKt.HatchScreenEmptyState(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121055), C3cJ.A05(bRg2, f2, f), null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120080), bfm, 0, 4);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc == null) {
                    return;
                } else {
                    agentPermissionApprovalsScreenKt$AgentPermissionApprovalsScreen$5 = new AgentPermissionApprovalsScreenKt$AgentPermissionApprovalsScreen$2(str, f, f2, bRg2, i, i2);
                }
            } else {
                BBI bbiA0M = AnonymousClass002.A0M(bfm, 2063625878);
                if (C3cH.A0J(c1boA02).historyLoadingState == ApprovalHistoryLoadingState.LOADING && C3cH.A0J(c1boA02).history.isEmpty() && C3cH.A0J(c1boA02).openApprovals.isEmpty()) {
                    bfm.AgE(2063799757);
                    HatchScreenLoadingStateKt.HatchScreenLoadingState(C3cJ.A05(bRg2, f2, f), bfm, 0, 0);
                    bBbAAc = AnonymousClass001.A0L(bfm, bbiA0M);
                    if (bBbAAc == null) {
                        return;
                    } else {
                        agentPermissionApprovalsScreenKt$AgentPermissionApprovalsScreen$5 = new AgentPermissionApprovalsScreenKt$AgentPermissionApprovalsScreen$3(str, f, f2, bRg2, i, i2);
                    }
                } else {
                    bfm.AgE(2063962166);
                    BBI.A0R(bbiA0M, false);
                    AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
                    BRg bRgA0T = AnonymousClass001.A0T(bRg2);
                    C1DP c1dp = new C1DP(0.0f, f, 0.0f, f2 + AuraDimensKt.SpacingMedium);
                    boolean zA1O = C3cH.A1O(bfm, c1boA02, agentPermissionApprovalsViewModelRememberAgentPermissionApprovalsViewModel, auraNavigatorA0b) | (i4 == 4);
                    Object objAaT2 = bfm.AaT();
                    if (zA1O || objAaT2 == C78N.A00) {
                        objAaT2 = new AgentPermissionApprovalsScreenKt$AgentPermissionApprovalsScreen$4$1(agentPermissionApprovalsViewModelRememberAgentPermissionApprovalsViewModel, c1boA02, auraNavigatorA0b, str);
                        bfm.Ai0(objAaT2);
                    }
                    C1YY.A01(null, null, null, c1dp, null, bfm, null, bRgA0T, (G0U) objAaT2, 0, 506, false, false);
                }
            }
            C3cG.A1D(bBbAAc, agentPermissionApprovalsScreenKt$AgentPermissionApprovalsScreen$5);
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            agentPermissionApprovalsScreenKt$AgentPermissionApprovalsScreen$5 = new AgentPermissionApprovalsScreenKt$AgentPermissionApprovalsScreen$5(str, f, f2, bRg2, i, i2);
            C3cG.A1D(bBbAAc, agentPermissionApprovalsScreenKt$AgentPermissionApprovalsScreen$5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v0, types: [X.1YL] */
    /* JADX WARN: Type inference failed for: r25v0, types: [X.G0W] */
    /* JADX WARN: Type inference failed for: r31v0, types: [X.AWd] */
    /* JADX WARN: Type inference failed for: r32v0, types: [X.1Yg] */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r35v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r36v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r37v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r39v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r41v0, types: [com.facebook.aura.vds.compose.button.AuraButtonAccessibility] */
    public static final void ApprovalDecisionButtons(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, ApprovalRowDecisions approvalRowDecisions, boolean z, G0U<? super Integer, Unit> g0u, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        AuraButtonCorner auraButtonCorner;
        int i3;
        int i4;
        AuraLabelButtonStyle auraLabelButtonStyleSecondary;
        BRg bRg2 = bRg;
        bfm.AgG(2089745041);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(approvalRowDecisions, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function0);
        }
        int i5 = i2 & 32;
        int iA0i = 196608;
        if (i5 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA05, 74898), bfm, iA05)) {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            boolean z2 = approvalRowDecisions.reviewsOnCard;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA13 = AnonymousClass004.A13(bfm, 10.0f);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA13, akqA04, bRgA01, iA0J);
            if (z2) {
                bfm.AgE(866203649);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120081);
                i3 = 1879048192;
                auraButtonCorner = null;
                i4 = 199680;
                AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
                BRg bRgA09 = C10G.A09(c1062ATq, Float.NaN, 36.0f);
                AgentPermissionApprovalsScreenKt$ApprovalDecisionButtons$1$1 agentPermissionApprovalsScreenKt$ApprovalDecisionButtons$1$1 = AgentPermissionApprovalsScreenKt$ApprovalDecisionButtons$1$1.INSTANCE;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = AgentPermissionApprovalsScreenKt$ApprovalDecisionButtons$1$2$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA09, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, z, false, false, null, null, function0, null, null, null, null, agentPermissionApprovalsScreenKt$ApprovalDecisionButtons$1$1, null, (Function0) objAaT, null, false, 0, false, 0, bfm, ((iA05 << 21) & 1879048192) | 199680, iA05 & 57344, 48, 131579333);
                BBI.A0R(bbi, false);
            } else {
                auraButtonCorner = null;
                i3 = 1879048192;
                i4 = 199680;
                bfm.AgE(866757371);
                BBI.A0R(bbi, false);
            }
            bfm.AgE(-110585717);
            Iterator it = approvalRowDecisions.options.iterator();
            while (it.hasNext()) {
                C2273BRq c2273BRq = (C2273BRq) it.next();
                int i6 = c2273BRq.A00;
                AgentPermissionDecisionOption agentPermissionDecisionOption = (AgentPermissionDecisionOption) c2273BRq.A01;
                String str = agentPermissionDecisionOption.labelText;
                if (i6 != 0 || z2) {
                    bfm.AgE(1575315825);
                    auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(auraButtonCorner, bfm, 48, 1);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(1575314351);
                    auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.primary(auraButtonCorner, bfm, 48, 1);
                    BBI.A0R(bbi, false);
                }
                AuraButtonSize auraButtonSize2 = AuraButtonSize.SMALL;
                BRg bRgA092 = C10G.A09(c1062ATq, Float.NaN, 36.0f);
                boolean zA1S = AnonymousClass002.A1S(bfm, i6, AnonymousClass004.A1M(iA05), AnonymousClass001.A1T(bfm, agentPermissionDecisionOption, (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval))));
                Object objAaT2 = bfm.AaT();
                if (zA1S || objAaT2 == C78N.A00) {
                    objAaT2 = new AgentPermissionApprovalsScreenKt$ApprovalDecisionButtons$1$3$1$1(agentPermissionApproval, agentPermissionDecisionOption, g0u, i6);
                    bfm.Ai0(objAaT2);
                }
                Function0 function03 = (Function0) objAaT2;
                AgentPermissionApprovalsScreenKt$ApprovalDecisionButtons$1$3$2 agentPermissionApprovalsScreenKt$ApprovalDecisionButtons$1$3$2 = AgentPermissionApprovalsScreenKt$ApprovalDecisionButtons$1$3$2.INSTANCE;
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == C78N.A00) {
                    objAaT3 = AgentPermissionApprovalsScreenKt$ApprovalDecisionButtons$1$3$3$1.INSTANCE;
                    bfm.Ai0(objAaT3);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(auraButtonCorner, str, auraButtonCorner, bRgA092, auraLabelButtonStyleSecondary, auraButtonSize2, auraButtonCorner, false, false, z, false, false, auraButtonCorner, auraButtonCorner, function03, auraButtonCorner, auraButtonCorner, auraButtonCorner, auraButtonCorner, agentPermissionApprovalsScreenKt$ApprovalDecisionButtons$1$3$2, auraButtonCorner, (Function0) objAaT3, auraButtonCorner, false, 0, false, 0, bfm, ((iA05 << 21) & i3) | i4, 0, 48, 131579333);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107322(agentPermissionApproval, approvalRowDecisions, z, g0u, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ApprovalIdentityRow(com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval r37, X.BRg r38, java.lang.String r39, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r40, X.BFM r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt.ApprovalIdentityRow(com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval, X.BRg, java.lang.String, X.G0V, X.BFM, int, int):void");
    }

    public static final void ApprovalsSectionHeader(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1914924326);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
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
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0D = C3cH.A0D(bfm, auraTheme);
            long jA06 = C3cH.A06(bfm, auraTheme);
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingXsmallPlusNano);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = AgentPermissionApprovalsScreenKt$ApprovalsSectionHeader$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARD.A01(bRgA0B, (G0U) objAaT, false), jA06, c1822ArmA0D, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107342(str, bRg2, i, i2);
        }
    }

    public static final void CheckoutApprovalRow(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-2140995243);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            List listSingletonList = Collections.singletonList(agentPermissionApproval);
            HatchScreen hatchScreen = HatchScreen.AGENT_PERMISSION_MULTI_APPROVAL_SHEET;
            int i4 = HatchAgentPermissionsRepository.AgentPermissionApproval.$stable;
            BRg bRgA0B = C3U4.A0B(AgentPermissionPendingCardKt.agentPermissionApprovalImpressions(bRg2, listSingletonList, hatchScreen, bfm, ((iA05 >> 9) & 14) | 384 | (i4 << 3)), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingXsmallPlusNano);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(10.0f), bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            String strPurposeSummaryText = AgentPermissionHeadlineKt.purposeSummaryText(agentPermissionApproval);
            if (strPurposeSummaryText == null) {
                bfm.AgE(737979808);
                strPurposeSummaryText = AgentPermissionTitleKt.agentPermissionQuestion(agentPermissionApproval, bfm, i4 | (iA05 & 14));
            } else {
                bfm.AgE(737978785);
            }
            BBI.A0R(bbi, false);
            ApprovalIdentityRow(agentPermissionApproval, null, strPurposeSummaryText, null, bfm, i4 | (iA05 & 14), 10);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120081);
            AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
            BS0 bs0 = BRg.A00;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, C10G.A09(C3U4.A0C(C10G.A02, 54.0f, 0.0f, 0.0f, 0.0f), Float.NaN, 36.0f), auraLabelButtonStylePrimary, auraButtonSize, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA05 << 6) & 57344, 0, 134201285);
            if (z) {
                bfm.AgE(737991655);
                AgentPermissionPendingCardKt.AgentPermissionDecisionConfirmingStatus(C3U4.A0C(bs0, 54.0f, 0.0f, 0.0f, 0.0f), bfm, 6, 0);
            } else {
                bfm.AgE(1402974019);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107352(agentPermissionApproval, z, function0, bRg2, i, i2);
        }
    }

    public static final void ExpandedApprovalRow(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, ApprovalRowDecisions approvalRowDecisions, boolean z, boolean z2, G0U<? super Integer, Unit> g0u, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(610874257);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(approvalRowDecisions, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, g0u);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, function0);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA05 |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA05 |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            List listSingletonList = Collections.singletonList(agentPermissionApproval);
            HatchScreen hatchScreen = HatchScreen.AGENT_PERMISSION_MULTI_APPROVAL_SHEET;
            int i4 = HatchAgentPermissionsRepository.AgentPermissionApproval.$stable;
            ApprovalIdentityRow(agentPermissionApproval, C3U4.A0B(AgentPermissionPendingCardKt.agentPermissionApprovalImpressions(bRg2, listSingletonList, hatchScreen, bfm, ((iA05 >> 18) & 14) | 384 | (i4 << 3)), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingXsmallPlusNano), null, B1V.A00(bfm, new C107371(agentPermissionApproval, approvalRowDecisions, z, g0u, function0, z2), 1727772732), bfm, i4 | 3072 | (iA05 & 14), 4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107382(agentPermissionApproval, approvalRowDecisions, z, z2, g0u, function0, bRg2, i, i2);
        }
    }

    public static final void actionedApprovalsSection(C0CD c0cd, AgentPermissionApprovalsUiState agentPermissionApprovalsUiState, final G0U<? super HatchAgentPermissionsRepository.AgentPermissionApproval, Unit> g0u) {
        if (agentPermissionApprovalsUiState.history.isEmpty()) {
            return;
        }
        c0cd.APJ("actioned_approvals_header", "section_header", ComposableSingletons$AgentPermissionApprovalsScreenKt.f4lambda$80254027);
        final AHD<HatchAgentPermissionsRepository.AgentPermissionApproval> ahd = agentPermissionApprovalsUiState.history;
        final C107391 c107391 = C107391.INSTANCE;
        c0cd.APL(c107391 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$actionedApprovalsSection$$inlined$itemsIndexed$1
            public final Object invoke(int i) {
                return c107391.invoke(Integer.valueOf(i), ahd.get(i));
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$actionedApprovalsSection$$inlined$itemsIndexed$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                ahd.get(AnonymousClass001.A0F(num));
                return "actioned_approval_row";
            }

            public final Object invoke(int i) {
                ahd.get(i);
                return "actioned_approval_row";
            }
        }, AnonymousClass001.A0M(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$actionedApprovalsSection$$inlined$itemsIndexed$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = (HatchAgentPermissionsRepository.AgentPermissionApproval) ahd.get(i);
                boolean zA1R = AnonymousClass001.A1R(bfm, g0u, AnonymousClass001.A1Z(agentPermissionApproval, bfm, -2084531510));
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new AgentPermissionApprovalsScreenKt$actionedApprovalsSection$3$1$1(agentPermissionApproval, g0u);
                    bfm.Ai0(objAaT);
                }
                AgentPermissionApprovalsScreenKt.ActionedApprovalRow(agentPermissionApproval, (Function0) objAaT, null, bfm, HatchAgentPermissionsRepository.AgentPermissionApproval.$stable, 4);
                AnonymousClass002.A19(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996), ahd.size());
    }

    public static final void approvalsStatusItem(C0CD c0cd, AgentPermissionApprovalsUiState agentPermissionApprovalsUiState, Function0<Unit> function0, Function0<Unit> function02) {
        B1U b1uA01;
        String str;
        String str2;
        ApprovalHistoryLoadingState approvalHistoryLoadingState = agentPermissionApprovalsUiState.historyLoadingState;
        if (approvalHistoryLoadingState == ApprovalHistoryLoadingState.ERROR) {
            b1uA01 = B1V.A01(new C107401(function0), 49081873, true);
            str = "approvals_error";
            str2 = AuraDeeplinkRouteMapper.STATUS_ROUTE;
        } else {
            if (approvalHistoryLoadingState != ApprovalHistoryLoadingState.SUCCESS) {
                return;
            }
            if (!agentPermissionApprovalsUiState.canLoadMoreHistory && !agentPermissionApprovalsUiState.isLoadingMoreHistory) {
                return;
            }
            b1uA01 = B1V.A01(new C107412(agentPermissionApprovalsUiState, function02), -1786162182, true);
            str = "approvals_load_more";
            str2 = "load_more";
        }
        c0cd.APJ(str, str2, b1uA01);
    }

    public static final void openApprovalsSection(C0CD c0cd, final AgentPermissionApprovalsUiState agentPermissionApprovalsUiState, final G0V<? super HatchAgentPermissionsRepository.AgentPermissionApproval, ? super Integer, Unit> g0v, final G0U<? super HatchAgentPermissionsRepository.AgentPermissionApproval, Unit> g0u) {
        if (agentPermissionApprovalsUiState.openApprovals.isEmpty()) {
            return;
        }
        c0cd.APJ("open_approvals_header", "section_header", ComposableSingletons$AgentPermissionApprovalsScreenKt.lambda$213780472);
        final AHD<HatchAgentPermissionsRepository.AgentPermissionApproval> ahd = agentPermissionApprovalsUiState.openApprovals;
        final C107421 c107421 = C107421.INSTANCE;
        c0cd.APL(c107421 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$openApprovalsSection$$inlined$itemsIndexed$1
            public final Object invoke(int i) {
                return c107421.invoke(Integer.valueOf(i), ahd.get(i));
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$openApprovalsSection$$inlined$itemsIndexed$2
            public final Object invoke(int i) {
                return AgentPermissionHeadlineKt.rendersCheckoutCard((HatchAgentPermissionsRepository.AgentPermissionApproval) ahd.get(i)) ? "checkout_approval" : i == 0 ? "expanded_approval" : "approval_row";
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, AnonymousClass001.A0M(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt$openApprovalsSection$$inlined$itemsIndexed$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? i2 | AnonymousClass004.A0d(bfm, anonymousClass037) : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = (HatchAgentPermissionsRepository.AgentPermissionApproval) ahd.get(i);
                boolean zA1R = AnonymousClass001.A1R(bfm, g0u, AnonymousClass001.A1T(bfm, agentPermissionApprovalsUiState, AnonymousClass001.A1Z(agentPermissionApproval, bfm, -380081316)));
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new AgentPermissionApprovalsScreenKt$openApprovalsSection$3$onReview$1$1(agentPermissionApproval, agentPermissionApprovalsUiState, g0u);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) objAaT;
                if (AgentPermissionHeadlineKt.rendersCheckoutCard(agentPermissionApproval)) {
                    bfm.AgE(-1397722556);
                    AgentPermissionApprovalsScreenKt.CheckoutApprovalRow(agentPermissionApproval, agentPermissionApprovalsUiState.confirmingApprovalIds.contains(agentPermissionApproval.approvalId), function0, C10G.A02, bfm, HatchAgentPermissionsRepository.AgentPermissionApproval.$stable | 3072, 0);
                } else if (i == 0) {
                    bfm.AgE(-1397713879);
                    ApprovalRowDecisions approvalRowDecisions = agentPermissionApprovalsUiState.rowDecisions.get(agentPermissionApproval.approvalId);
                    boolean zContains = agentPermissionApprovalsUiState.submittingApprovalIds.contains(agentPermissionApproval.approvalId);
                    boolean zContains2 = agentPermissionApprovalsUiState.confirmingApprovalIds.contains(agentPermissionApproval.approvalId);
                    boolean zA1J = AnonymousClass003.A1J(bfm, g0v, agentPermissionApproval);
                    Object objAaT2 = bfm.AaT();
                    if (zA1J || objAaT2 == C78N.A00) {
                        objAaT2 = new AgentPermissionApprovalsScreenKt$openApprovalsSection$3$1$1(g0v, agentPermissionApproval);
                        bfm.Ai0(objAaT2);
                    }
                    AgentPermissionApprovalsScreenKt.ExpandedApprovalRow(agentPermissionApproval, approvalRowDecisions, zContains, zContains2, (G0U) objAaT2, function0, C10G.A02, bfm, (ApprovalRowDecisions.$stable << 3) | 1572864 | HatchAgentPermissionsRepository.AgentPermissionApproval.$stable, 0);
                } else {
                    bfm.AgE(-1397699016);
                    AgentPermissionApprovalsScreenKt.CollapsedApprovalRow(agentPermissionApproval, function0, null, bfm, HatchAgentPermissionsRepository.AgentPermissionApproval.$stable, 4);
                }
                BBI bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, false);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996), ahd.size());
    }

    public static final void CollapsedApprovalRow(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-997329754);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            ApprovalIdentityRow(agentPermissionApproval, C3U4.A0B(C3cI.A06(C10G.A09(AnonymousClass001.A0R(bRg), Float.NaN, 64.0f), null, function0), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingXsmallPlusNano), null, B1V.A00(bfm, new AnonymousClass1(agentPermissionApproval), -1546937199), bfm, (iA05 & 14) | HatchAgentPermissionsRepository.AgentPermissionApproval.$stable | 3072, 4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107362(agentPermissionApproval, function0, bRg, i, i2);
        }
    }

    public static final String approvalHistorySummary(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, String str) {
        String strPurposeSummaryText;
        AnonymousClass003.A0u(agentPermissionApproval, str);
        String str2 = agentPermissionApproval.scopeSummary;
        if (((str2 == null || (strPurposeSummaryText = AnonymousClass002.A0l(str2)) == null || C7BY.A0j(strPurposeSummaryText)) && (strPurposeSummaryText = AgentPermissionHeadlineKt.purposeSummaryText(agentPermissionApproval)) == null) || strPurposeSummaryText.equals(str)) {
            return null;
        }
        return strPurposeSummaryText;
    }

    public static final String approvalHistoryTimestamp(long j, BFM bfm, int i) {
        BBI bbiA07;
        String dateTime;
        int i2;
        bfm.AgE(325502608);
        if (j <= 0) {
            AnonymousClass002.A19(bfm);
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        int i3 = (int) ((jCurrentTimeMillis >= 0 ? jCurrentTimeMillis : 0L) / 60000);
        if (i3 < 1) {
            bfm.AgE(-987683135);
            dateTime = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12011f);
        } else {
            bfm.AgE(-987605294);
            bbiA07 = (BBI) bfm;
            BBI.A0R(bbiA07, false);
            if (i3 < 60) {
                bfm.AgE(-987572713);
                i2 = R.plurals._name_removed__res_0x7f100009;
            } else {
                bfm.AgE(-987423758);
                BBI.A0R(bbiA07, false);
                i3 /= 60;
                if (i3 < 24) {
                    bfm.AgE(-987352675);
                    i2 = R.plurals._name_removed__res_0x7f100008;
                } else {
                    bfm.AgE(-987209486);
                    BBI.A0R(bbiA07, false);
                    i3 /= 24;
                    if (i3 >= 7) {
                        bfm.AgE(-987003150);
                        BBI.A0R(bbiA07, false);
                        Context contextA0H = AnonymousClass002.A0H(bfm);
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(j);
                        dateTime = DateUtils.formatDateTime(contextA0H, j, (calendar.get(1) == Calendar.getInstance().get(1) ? 8 : 4) | 65552);
                        BBI.A0R(bbiA07, false);
                        return dateTime;
                    }
                    bfm.AgE(-987143456);
                    i2 = R.plurals._name_removed__res_0x7f100007;
                }
            }
            dateTime = AnonymousClass007.A0Y(i3, bfm, i2);
        }
        bbiA07 = C3cG.A07(bfm);
        BBI.A0R(bbiA07, false);
        return dateTime;
    }

    public static final AgentPermissionApprovalsViewModel rememberAgentPermissionApprovalsViewModel(String str, BFM bfm, int i) {
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        String strA0M = FGI.A0M("agent_permission_approvals_", ApprovalConversationIdentity.INSTANCE.normalize(str));
        AgentPermissionApprovalsViewModel.Factory factory = new AgentPermissionApprovalsViewModel.Factory(abstractC3358CGzA0h);
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 != null) {
            return (AgentPermissionApprovalsViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), AgentPermissionApprovalsViewModel.class, strA0M);
        }
        throw AnonymousClass001.A0o();
    }

    public static final int rememberOpenAgentPermissionTaskCount(String str, BFM bfm, int i, int i2) {
        return ((AgentPermissionApprovalsUiState) C1BO.A07(bfm, rememberAgentPermissionApprovalsViewModel(AnonymousClass006.A0r(i2, str), bfm, i & 14).uiState)).openApprovals.size();
    }
}
