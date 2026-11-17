package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC1996Aw5;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C07C;
import X.C0A8;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60N;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.AgentPermissionHeadlineKt;
import com.facebook.aura.gateway.ApprovalRecord;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.tag.AuraStatusTagKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AgentPermissionHistoryDetailsSheetKt {

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionHistoryDetailsSheetKt$AgentPermissionHistoryDetailsSheet$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $currentApproval;
        public final /* synthetic */ String $outcome;
        public final /* synthetic */ String $summary;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, String str, String str2, String str3) {
            super(3);
            this.$currentApproval = agentPermissionApproval;
            this.$outcome = str;
            this.$title = str2;
            this.$summary = str3;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA0B = C3U4.A0B(c1062ATq, C06G.A00(bfm), 0.0f);
                float f = AuraDimensKt.SpacingMedium;
                BRg bRgA0C = C3U4.A0C(bRgA0B, 0.0f, 0.0f, 0.0f, f);
                HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = this.$currentApproval;
                String str = this.$outcome;
                String str2 = this.$title;
                String str3 = this.$summary;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0C);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                int i2 = HatchAgentPermissionsRepository.AgentPermissionApproval.$stable;
                AgentPermissionHistoryDetailsSheetKt.HistoryMetadataRow(agentPermissionApproval, str, null, bfm, i2, 4);
                float f2 = AuraDimensKt.SpacingSmall;
                C01N.A08(bfm, bs0, f2);
                AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A0C(bfm), C01N.A01(bfm, bs0, f).title3Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                if (str3 == null) {
                    bfm.AgE(830925648);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(830925649);
                    AuraTextKt.m2639AuraTextUY9GdpU(str3, null, C06G.A08(bfm), C01N.A01(bfm, bs0, f2).subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                    BBI.A0R(bbi, false);
                }
                if (AgentPermissionHeadlineKt.hasRequestPreview(agentPermissionApproval)) {
                    bfm.AgE(831213670);
                    C01N.A08(bfm, bs0, f);
                    AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200f8), null, C06G.A0C(bfm), C1822Arm.A00(null, AnonymousClass002.A0f(bfm).footnoteEmphasized, AbstractC1996Aw5.A01, null, null, null, null, null, null, null, 0, 0, 0, 16777183, 0L, 0L, 0L, 0L), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                    C01N.A08(bfm, bs0, f2);
                    AgentPermissionRequestPreviewKt.m177AgentPermissionRequestPreviewContenthYmLsZ8(agentPermissionApproval.requestPreviewDocument, agentPermissionApproval.requestPreview, C06G.A0T(bfm), C06G.A08(bfm), agentPermissionApproval, HatchScreen.AGENT_PERMISSION_MULTI_APPROVAL_SHEET, c1062ATq, bfm, 1769472 | HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument.$stable | (i2 << 12), 0);
                } else {
                    bfm.AgE(831992080);
                }
                AnonymousClass003.A0q(bbi);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionHistoryDetailsSheetKt$AgentPermissionHistoryDetailsSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $sessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$approvalId = str;
            this.$sessionId = str2;
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
            AgentPermissionHistoryDetailsSheetKt.AgentPermissionHistoryDetailsSheet(this.$approvalId, this.$sessionId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionHistoryDetailsSheetKt$HistoryMetadataRow$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $outcome;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$outcome = str;
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
            AgentPermissionHistoryDetailsSheetKt.HistoryMetadataRow(this.$approval, this.$outcome, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AgentPermissionHistoryDetailsSheet(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass5;
        Object next;
        String strDecisionLabel;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1773774965);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
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
            int i4 = iA0d >> 3;
            AgentPermissionApprovalsViewModel agentPermissionApprovalsViewModelRememberAgentPermissionApprovalsViewModel = AgentPermissionApprovalsScreenKt.rememberAgentPermissionApprovalsViewModel(str2, bfm, i4 & 14);
            C1BO c1boA02 = C2CK.A02(bfm, agentPermissionApprovalsViewModelRememberAgentPermissionApprovalsViewModel.uiState);
            Iterator it = C3cH.A0J(c1boA02).history.iterator();
            do {
                next = null;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            } while (!str.equals(((HatchAgentPermissionsRepository.AgentPermissionApproval) next).approvalId));
            HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = (HatchAgentPermissionsRepository.AgentPermissionApproval) next;
            boolean zA67 = bfm.A67(agentPermissionApprovalsViewModelRememberAgentPermissionApprovalsViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new AgentPermissionHistoryDetailsSheetKt$AgentPermissionHistoryDetailsSheet$1$1(agentPermissionApprovalsViewModelRememberAgentPermissionApprovalsViewModel);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, agentPermissionApprovalsViewModelRememberAgentPermissionApprovalsViewModel);
            ApprovalHistoryLoadingState approvalHistoryLoadingState = C3cH.A0J(c1boA02).historyLoadingState;
            boolean zA1S = AnonymousClass004.A1S(bfm, c1boA02, auraNavigatorA0b, bfm.A67(agentPermissionApproval));
            Object objAaT2 = bfm.AaT();
            if (zA1S || objAaT2 == C78N.A00) {
                objAaT2 = new AgentPermissionHistoryDetailsSheetKt$AgentPermissionHistoryDetailsSheet$2$1(agentPermissionApproval, auraNavigatorA0b, c1boA02);
                bfm.Ai0(objAaT2);
            }
            int i5 = HatchAgentPermissionsRepository.AgentPermissionApproval.$stable;
            C78e.A03(bfm, agentPermissionApproval, approvalHistoryLoadingState, (G0U) objAaT2);
            if (agentPermissionApproval == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass5 = new AgentPermissionHistoryDetailsSheetKt$AgentPermissionHistoryDetailsSheet$currentApproval$1(str, str2, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass5);
                }
                return;
            }
            String strApprovalHistoryTitle = AgentPermissionApprovalsScreenKt.approvalHistoryTitle(agentPermissionApproval);
            String strApprovalHistorySummary = AgentPermissionApprovalsScreenKt.approvalHistorySummary(agentPermissionApproval, strApprovalHistoryTitle);
            ApprovalRecord approvalRecord = agentPermissionApproval.approvalRecord;
            if (approvalRecord == null || (strDecisionLabel = approvalRecord.outcomeLabel) == null) {
                bfm.AgE(504304250);
                strDecisionLabel = AgentPermissionApprovalsScreenKt.decisionLabel(agentPermissionApproval, bfm, i5);
            } else {
                bfm.AgE(504302266);
            }
            AnonymousClass001.A1D(bfm);
            boolean zA1M = AnonymousClass003.A1M(bfm, agentPermissionApproval, auraNavigatorA0b);
            Object objAaT3 = bfm.AaT();
            if (zA1M || objAaT3 == C78N.A00) {
                objAaT3 = new AgentPermissionHistoryDetailsSheetKt$AgentPermissionHistoryDetailsSheet$3$1(agentPermissionApproval, auraNavigatorA0b);
                bfm.Ai0(objAaT3);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, bRg2, null, null, null, null, (Function0) objAaT3, false, false, false, null, B1V.A00(bfm, new AnonymousClass4(agentPermissionApproval, strDecisionLabel, strApprovalHistoryTitle, strApprovalHistorySummary), -765699320), bfm, i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 48, 1981);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(str, str2, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass5);
        }
    }

    public static final void HistoryMetadataRow(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-385619759);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
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
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A03, bfm, C2VU.A04, 54);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraStatusTagKt.m2637AuraStatusTagRWsq2U(str, historyOutcomeColor(agentPermissionApproval, bfm, C3cH.A01(iA05)), null, 0L, bfm, (iA05 >> 3) & 14, 12);
            if (agentPermissionApproval.requestedAtMs > 0) {
                bfm.AgE(-1677732269);
                String strApprovalHistorySheetTimestamp = approvalHistorySheetTimestamp(agentPermissionApproval.requestedAtMs, bfm, 0);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(strApprovalHistorySheetTimestamp, null, C3cH.A05(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            } else {
                bfm.AgE(-1677539883);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(agentPermissionApproval, str, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long historyOutcomeColor(com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval r3, X.BFM r4, int r5) {
        /*
            com.facebook.aura.gateway.ApprovalRecord r3 = r3.approvalRecord
            r1 = 0
            if (r3 == 0) goto L52
            com.facebook.aura.gateway.ApprovalRecordStatus r2 = r3.status
        L7:
            com.facebook.aura.gateway.ApprovalRecordStatus r0 = com.facebook.aura.gateway.ApprovalRecordStatus.TIMED_OUT
            if (r2 == r0) goto L48
            if (r3 == 0) goto L46
            com.facebook.aura.gateway.ApprovalRecordDecision r2 = r3.decision
        Lf:
            com.facebook.aura.gateway.ApprovalRecordDecision r0 = com.facebook.aura.gateway.ApprovalRecordDecision.TIMED_OUT
            if (r2 == r0) goto L48
            if (r3 == 0) goto L44
            com.facebook.aura.gateway.ApprovalRecordStatus r2 = r3.status
        L17:
            com.facebook.aura.gateway.ApprovalRecordStatus r0 = com.facebook.aura.gateway.ApprovalRecordStatus.DENIED
            if (r2 == r0) goto L3a
            if (r3 == 0) goto L38
            com.facebook.aura.gateway.ApprovalRecordDecision r2 = r3.decision
        L1f:
            com.facebook.aura.gateway.ApprovalRecordDecision r0 = com.facebook.aura.gateway.ApprovalRecordDecision.DENY
            if (r2 == r0) goto L3a
            if (r3 == 0) goto L27
            com.facebook.aura.gateway.ApprovalRecordDecision r1 = r3.decision
        L27:
            com.facebook.aura.gateway.ApprovalRecordDecision r0 = com.facebook.aura.gateway.ApprovalRecordDecision.DENY_ALWAYS
            if (r1 == r0) goto L3a
            r0 = -882137623(0xffffffffcb6ba5e9, float:-1.5443433E7)
            com.facebook.aura.vds.compose.theme.AuraColors r0 = X.C3cI.A0K(r4, r0)
            long r0 = r0.success
        L34:
            X.AnonymousClass002.A19(r4)
            return r0
        L38:
            r2 = r1
            goto L1f
        L3a:
            r0 = -882138809(0xffffffffcb6ba147, float:-1.5442247E7)
            com.facebook.aura.vds.compose.theme.AuraColors r0 = X.C3cI.A0K(r4, r0)
            long r0 = r0.error
            goto L34
        L44:
            r2 = r1
            goto L17
        L46:
            r2 = r1
            goto Lf
        L48:
            r0 = -882146449(0xffffffffcb6b836f, float:-1.5434607E7)
            com.facebook.aura.vds.compose.theme.AuraColors r0 = X.C3cI.A0K(r4, r0)
            long r0 = r0.secondaryText
            goto L34
        L52:
            r2 = r1
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionHistoryDetailsSheetKt.historyOutcomeColor(com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval, X.BFM, int):long");
    }

    public static final String approvalHistorySheetTimestamp(long j, BFM bfm, int i) {
        int i2;
        Object[] objArr;
        Context contextA0H = AnonymousClass002.A0H(bfm);
        String str = DateFormat.getTimeFormat(contextA0H).format(new Date(j));
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        if (DateUtils.isToday(j)) {
            bfm.AgE(-2105525510);
            i2 = R.string._name_removed__res_0x7f1200fb;
        } else {
            C7384Etj.A0X(calendar2);
            if (!isYesterday(calendar, calendar2)) {
                bfm.AgE(-846564585);
                String dateTime = DateUtils.formatDateTime(contextA0H, j, 65560);
                i2 = R.string._name_removed__res_0x7f1200fa;
                C7384Etj.A0X(dateTime);
                C7384Etj.A0X(str);
                objArr = new Object[]{dateTime, str};
                String strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
                AnonymousClass001.A1D(bfm);
                return strA02;
            }
            bfm.AgE(-2105521570);
            i2 = R.string._name_removed__res_0x7f1200fc;
        }
        C7384Etj.A0X(str);
        objArr = new Object[]{str};
        String strA022 = AbstractC2271BQs.A02(bfm, objArr, i2);
        AnonymousClass001.A1D(bfm);
        return strA022;
    }

    public static final boolean isYesterday(Calendar calendar, Calendar calendar2) {
        Object objClone = calendar2.clone();
        C7384Etj.A0Z(objClone, C60N.A00(95));
        Calendar calendar3 = (Calendar) objClone;
        calendar3.add(6, -1);
        return calendar.get(1) == calendar3.get(1) && calendar.get(6) == calendar3.get(6);
    }
}
