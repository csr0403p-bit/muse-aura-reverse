package com.facebook.aura.agentpermission;

import X.A3q;
import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass441;
import X.BGK;
import X.BLG;
import X.BLL;
import X.C06H;
import X.C1BN;
import X.C3Ej;
import X.C3Ek;
import X.C3UX;
import X.C3cG;
import X.C3rb;
import X.C60I;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.conversation.repo.HatchPrimarySessionRepository;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.ApprovalCardOnlyKt;
import com.facebook.aura.gateway.ApprovalConversationIdentity;
import com.facebook.aura.gateway.ApprovalDecisionAnalytics;
import com.facebook.aura.gateway.ApprovalDecisionSkipReason;
import com.facebook.aura.gateway.ApprovalPresentation;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.HatchAgentPermissionsRepositoryKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class AgentPermissionPendingCardViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<Set<String>> _submittingApprovalIds;
    public final C1BN<List<HatchAgentPermissionsRepository.AgentPermissionApproval>> approvals;
    public final C1BN<Set<String>> confirmingApprovalIds;
    public final HatchPrimarySessionRepository primarySessionRepository;
    public final HatchAgentPermissionsRepository repository;
    public final String screenSessionId;
    public final C1BN<Set<String>> submittingApprovalIds;

    public final class Factory extends AuraViewModelFactory<AgentPermissionPendingCardViewModel> {
        public static final int $stable = 8;
        public final boolean includeAllApprovals;
        public final String sessionId;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, boolean z) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
            this.sessionId = str;
            this.includeAllApprovals = z;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AgentPermissionPendingCardViewModel create() {
            return new AgentPermissionPendingCardViewModel(this.userSession, this.sessionId, this.includeAllApprovals);
        }

        public /* synthetic */ Factory(AbstractC3358CGz abstractC3358CGz, String str, boolean z, int i, C06H c06h) {
            this(abstractC3358CGz, AnonymousClass006.A0s(i, str), (i & 4) != 0 ? true : z);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionPendingCardViewModel$submitBulkDecision$2", f = "AgentPermissionPendingCardViewModel.kt", l = {145}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardViewModel$submitBulkDecision$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Set<String> $approvalIds;
        public final /* synthetic */ List<HatchAgentPermissionsRepository.AgentPermissionApprovalDecision> $decisions;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(List<HatchAgentPermissionsRepository.AgentPermissionApprovalDecision> list, Set<String> set, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$decisions = list;
            this.$approvalIds = set;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AgentPermissionPendingCardViewModel.this.new AnonymousClass2(this.$decisions, this.$approvalIds, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Set<String> value;
            Set<String> value2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAgentPermissionsRepository hatchAgentPermissionsRepository = AgentPermissionPendingCardViewModel.this.repository;
                List<HatchAgentPermissionsRepository.AgentPermissionApprovalDecision> list = this.$decisions;
                this.label = 1;
                obj = hatchAgentPermissionsRepository.decideApprovals(list, true, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchAgentPermissionsRepository.DecideResult decideResult = (HatchAgentPermissionsRepository.DecideResult) obj;
            if (!(decideResult instanceof HatchAgentPermissionsRepository.DecideResult.Success)) {
                if ((decideResult instanceof HatchAgentPermissionsRepository.DecideResult.Failed) || (decideResult instanceof HatchAgentPermissionsRepository.DecideResult.Confirming)) {
                    BLG<Set<String>> blg = AgentPermissionPendingCardViewModel.this._submittingApprovalIds;
                    Set<String> set = this.$approvalIds;
                    do {
                        value = blg.getValue();
                    } while (!blg.A6e(value, BGK.A03(set, value)));
                } else {
                    if (!(decideResult instanceof HatchAgentPermissionsRepository.DecideResult.PartiallyApplied)) {
                        throw C3cG.A0q();
                    }
                    BLG<Set<String>> blg2 = AgentPermissionPendingCardViewModel.this._submittingApprovalIds;
                    do {
                        value2 = blg2.getValue();
                    } while (!blg2.A6e(value2, BGK.A03(((HatchAgentPermissionsRepository.DecideResult.PartiallyApplied) decideResult).unappliedApprovalIds, value2)));
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionPendingCardViewModel$submitSingleDecision$3", f = "AgentPermissionPendingCardViewModel.kt", l = {111}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardViewModel$submitSingleDecision$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ AgentPermissionDecisionOption $option;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, AgentPermissionDecisionOption agentPermissionDecisionOption, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$approvalId = str;
            this.$option = agentPermissionDecisionOption;
            this.$approval = agentPermissionApproval;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AgentPermissionPendingCardViewModel.this.new AnonymousClass3(this.$approvalId, this.$option, this.$approval, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAgentPermissionsRepository hatchAgentPermissionsRepository = AgentPermissionPendingCardViewModel.this.repository;
                String str = this.$approvalId;
                AgentPermissionDecisionOption agentPermissionDecisionOption = this.$option;
                String str2 = agentPermissionDecisionOption.kind;
                String str3 = agentPermissionDecisionOption.alwaysScope;
                Long l = this.$approval.messageRevision;
                this.label = 1;
                obj = hatchAgentPermissionsRepository.decideApproval(str, str2, str3, null, true, l, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (!(obj instanceof HatchAgentPermissionsRepository.DecideResult.Success)) {
                BLG<Set<String>> blg = AgentPermissionPendingCardViewModel.this._submittingApprovalIds;
                while (!AnonymousClass007.A1N(this.$approvalId, blg)) {
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AgentPermissionPendingCardViewModel(AbstractC3358CGz abstractC3358CGz, String str, boolean z) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        HatchAgentPermissionsRepository companion = HatchAgentPermissionsRepository.Companion.getInstance(abstractC3358CGz);
        this.repository = companion;
        HatchPrimarySessionRepository companion2 = HatchPrimarySessionRepository.Companion.getInstance(abstractC3358CGz);
        this.primarySessionRepository = companion2;
        this.screenSessionId = str;
        C1BN<List<HatchAgentPermissionsRepository.AgentPermissionApproval>> c1bnA00 = companion.pendingApprovals;
        if (!z) {
            C60I c60iA03 = C3rb.A03(new AgentPermissionPendingCardViewModel$approvals$1(this, null), c1bnA00, companion2.primarySessionId);
            BLL bllA00 = AEu.A00(this);
            C3Ej c3Ej = C3Ek.A00;
            List<HatchAgentPermissionsRepository.AgentPermissionApproval> value = companion.pendingApprovals.getValue();
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj : value) {
                if (HatchAgentPermissionsRepositoryKt.classifyApprovalPresentation((HatchAgentPermissionsRepository.AgentPermissionApproval) obj, ApprovalConversationIdentity.INSTANCE.resolveThreadId(this.screenSessionId, this.primarySessionRepository.primarySessionId.getValue())) == ApprovalPresentation.BLOCKING) {
                    arrayListA0h.add(obj);
                }
            }
            c1bnA00 = AnonymousClass441.A00(arrayListA0h, bllA00, c60iA03, c3Ej);
        }
        this.approvals = c1bnA00;
        C9286GCn c9286GCnA01 = HnJ.A01(A3q.A00);
        this._submittingApprovalIds = c9286GCnA01;
        C60I c60iA032 = C3rb.A03(new AgentPermissionPendingCardViewModel$submittingApprovalIds$1(null), c9286GCnA01, this.repository.confirmingApprovalIds);
        BLL bllA002 = AEu.A00(this);
        C3Ej c3Ej2 = C3Ek.A00;
        this.submittingApprovalIds = AnonymousClass441.A00(BGK.A01(this.repository.confirmingApprovalIds.getValue(), (Set) c9286GCnA01.getValue()), bllA002, c60iA032, c3Ej2);
        C60I c60iA033 = C3rb.A03(new AgentPermissionPendingCardViewModel$confirmingApprovalIds$1(null), c9286GCnA01, this.repository.confirmingApprovalIds);
        this.confirmingApprovalIds = AnonymousClass441.A00(BGK.A03((Iterable) c9286GCnA01.getValue(), this.repository.confirmingApprovalIds.getValue()), AEu.A00(this), c60iA033, c3Ej2);
    }

    public final void submitSingleDecision(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, AgentPermissionDecisionOption agentPermissionDecisionOption) {
        AnonymousClass003.A0u(agentPermissionApproval, agentPermissionDecisionOption);
        String str = agentPermissionApproval.approvalId;
        List<AgentPermissionDecisionOption> list = agentPermissionApproval.decisionOptions;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<AgentPermissionDecisionOption> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (C7384Etj.areEqual(it.next().kind, agentPermissionDecisionOption.kind)) {
                    z = true;
                    break;
                }
            }
        }
        if (canSubmit(agentPermissionApproval, z)) {
            while (!AnonymousClass007.A1O(str, this._submittingApprovalIds)) {
            }
            AnonymousClass001.A1J(new AnonymousClass3(str, agentPermissionDecisionOption, agentPermissionApproval, null), AEu.A00(this));
        }
    }

    private final boolean canSubmit(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, boolean z) {
        ApprovalDecisionSkipReason approvalDecisionSkipReason;
        String str = agentPermissionApproval.approvalId;
        if (!z) {
            approvalDecisionSkipReason = ApprovalDecisionSkipReason.OPTION_UNAVAILABLE;
        } else if (AnonymousClass006.A1a(str, this._submittingApprovalIds)) {
            approvalDecisionSkipReason = ApprovalDecisionSkipReason.ALREADY_SUBMITTING;
        } else if (this.repository.isConfirmingDecision(str)) {
            approvalDecisionSkipReason = ApprovalDecisionSkipReason.AWAITING_SNAPSHOT;
        } else {
            List<HatchAgentPermissionsRepository.AgentPermissionApproval> value = this.approvals.getValue();
            if (!(value instanceof Collection) || !C3cG.A1N(value)) {
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    if (C7384Etj.areEqual(((HatchAgentPermissionsRepository.AgentPermissionApproval) it.next()).approvalId, str)) {
                        return true;
                    }
                }
            }
            approvalDecisionSkipReason = ApprovalDecisionSkipReason.NOT_PENDING;
        }
        ApprovalDecisionAnalytics.INSTANCE.logSkipped(str, approvalDecisionSkipReason, agentPermissionApproval.origin);
        if (approvalDecisionSkipReason != ApprovalDecisionSkipReason.AWAITING_SNAPSHOT) {
            return false;
        }
        this.repository.requestDecisionConfirmation();
        return false;
    }

    public final String currentBatchKey() {
        HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = (HatchAgentPermissionsRepository.AgentPermissionApproval) AbstractC0878AGe.A0G(this.approvals.getValue());
        if (agentPermissionApproval != null) {
            return agentPermissionApproval.approvalId;
        }
        return null;
    }

    public final C1BN<List<HatchAgentPermissionsRepository.AgentPermissionApproval>> getApprovals() {
        return this.approvals;
    }

    public final C1BN<Set<String>> getConfirmingApprovalIds() {
        return this.confirmingApprovalIds;
    }

    public final C1BN<Set<String>> getSubmittingApprovalIds() {
        return this.submittingApprovalIds;
    }

    public final void submitBulkDecision(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, AgentPermissionDecisionOption agentPermissionDecisionOption) {
        Set<String> value;
        AgentPermissionDecisionOption next;
        AnonymousClass003.A0u(list, agentPermissionDecisionOption);
        ArrayList arrayListA0h = C3cG.A0h();
        for (HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval : list) {
            Iterator<AgentPermissionDecisionOption> it = ApprovalCardOnlyKt.quickDecisionOptions(agentPermissionApproval).iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (C7384Etj.areEqual(next.kind, agentPermissionDecisionOption.kind)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AgentPermissionDecisionOption agentPermissionDecisionOption2 = next;
            if (canSubmit(agentPermissionApproval, AnonymousClass002.A1X(agentPermissionDecisionOption2)) && agentPermissionDecisionOption2 != null) {
                arrayListA0h.add(new HatchAgentPermissionsRepository.AgentPermissionApprovalDecision(agentPermissionApproval.approvalId, agentPermissionDecisionOption2.kind, agentPermissionDecisionOption2.alwaysScope, null, agentPermissionApproval.messageRevision));
            }
        }
        if (arrayListA0h.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            linkedHashSetA0k.add(((HatchAgentPermissionsRepository.AgentPermissionApprovalDecision) it2.next()).approvalId);
        }
        BLG<Set<String>> blg = this._submittingApprovalIds;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, BGK.A01(linkedHashSetA0k, value)));
        AnonymousClass001.A1J(new AnonymousClass2(arrayListA0h, linkedHashSetA0k, null), AEu.A00(this));
    }

    public /* synthetic */ AgentPermissionPendingCardViewModel(AbstractC3358CGz abstractC3358CGz, String str, boolean z, int i, C06H c06h) {
        this(abstractC3358CGz, AnonymousClass006.A0s(i, str), (i & 4) != 0 ? true : z);
    }
}
