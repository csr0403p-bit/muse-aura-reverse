package com.facebook.aura.agentpermission;

import X.A3q;
import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass441;
import X.AnonymousClass602;
import X.AnonymousClass603;
import X.BLG;
import X.C0881AGi;
import X.C1BN;
import X.C20Z;
import X.C3Ek;
import X.C3UX;
import X.C3cG;
import X.C3rb;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.ApprovalCardOnlyKt;
import com.facebook.aura.gateway.ApprovalDecisionAnalytics;
import com.facebook.aura.gateway.ApprovalDecisionSkipReason;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class AgentPermissionApprovalsViewModel extends AEs {
    public static final int $stable = 8;
    public final HatchAgentPermissionsRepository approvalsRepository;
    public final AgentPermissionApprovalHistoryRepository historyRepository;
    public final BLG<ApprovalHistoryState> historyState;
    public final BLG<Set<String>> submittingApprovalIds;
    public final C1BN<AgentPermissionApprovalsUiState> uiState;

    @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionApprovalsViewModel$1", f = "AgentPermissionApprovalsViewModel.kt", l = {122}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AgentPermissionApprovalsViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final AgentPermissionApprovalsViewModel agentPermissionApprovalsViewModel = AgentPermissionApprovalsViewModel.this;
                AnonymousClass602 anonymousClass602A00 = AnonymousClass602.A00(agentPermissionApprovalsViewModel.approvalsRepository.historyRefreshVersion);
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.agentpermission.AgentPermissionApprovalsViewModel.1.1
                    public final Object emit(long j, HtJ<? super Unit> htJ) {
                        agentPermissionApprovalsViewModel.loadHistory(true);
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        ((Number) obj2).longValue();
                        agentPermissionApprovalsViewModel.loadHistory(true);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (anonymousClass602A00.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return AgentPermissionApprovalsViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<AgentPermissionApprovalsViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new AgentPermissionApprovalsViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AgentPermissionApprovalsViewModel create() {
            return new AgentPermissionApprovalsViewModel(this.userSession);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionApprovalsViewModel$loadHistory$1", f = "AgentPermissionApprovalsViewModel.kt", l = {155, 159}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsViewModel$loadHistory$1, reason: invalid class name and case insensitive filesystem */
    public final class C107431 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $reset;
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107431(boolean z, HtJ<? super C107431> htJ) {
            super(2, htJ);
            this.$reset = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AgentPermissionApprovalsViewModel.this.new C107431(this.$reset, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0108 A[PHI: r7
  0x0108: PHI (r7v2 int) = (r7v0 int), (r7v3 int) binds: [B:32:0x00ab, B:30:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r13v4, types: [com.facebook.aura.agentpermission.ApprovalHistoryState] */
        /* JADX WARN: Type inference failed for: r14v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r14v3, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r14v4 */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 359
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionApprovalsViewModel.C107431.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C107431) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionApprovalsViewModel$submit$2", f = "AgentPermissionApprovalsViewModel.kt", l = {222}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionApprovalsViewModel$submit$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ AgentPermissionDecisionOption $option;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, AgentPermissionDecisionOption agentPermissionDecisionOption, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$approvalId = str;
            this.$option = agentPermissionDecisionOption;
            this.$approval = agentPermissionApproval;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AgentPermissionApprovalsViewModel.this.new AnonymousClass2(this.$approvalId, this.$option, this.$approval, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAgentPermissionsRepository hatchAgentPermissionsRepository = AgentPermissionApprovalsViewModel.this.approvalsRepository;
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
                BLG<Set<String>> blg = AgentPermissionApprovalsViewModel.this.submittingApprovalIds;
                while (!AnonymousClass007.A1N(this.$approvalId, blg)) {
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AgentPermissionApprovalsViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        HatchAgentPermissionsRepository companion = HatchAgentPermissionsRepository.Companion.getInstance(abstractC3358CGz);
        this.approvalsRepository = companion;
        this.historyRepository = AgentPermissionApprovalHistoryRepository.Companion.getInstance(abstractC3358CGz);
        C9286GCn c9286GCnA14 = C3cG.A14(new ApprovalHistoryState(C0881AGi.A00, ApprovalHistoryLoadingState.IDLE, null, true, false));
        this.historyState = c9286GCnA14;
        C9286GCn c9286GCnA01 = HnJ.A01(A3q.A00);
        this.submittingApprovalIds = c9286GCnA01;
        AnonymousClass603 anonymousClass603A01 = C3rb.A01(new AgentPermissionApprovalsViewModel$uiState$1(null), companion.pendingApprovals, c9286GCnA14, c9286GCnA01, companion.confirmingApprovalIds);
        this.uiState = AnonymousClass441.A00(new AgentPermissionApprovalsUiState(null, null, null, false, false, null, null, null, null, 511, null), AEu.A00(this), anonymousClass603A01, C3Ek.A00);
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }

    public final void submit(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, int i) {
        ApprovalDecisionSkipReason approvalDecisionSkipReason;
        C7384Etj.A0Y(agentPermissionApproval, 0);
        String str = agentPermissionApproval.approvalId;
        AgentPermissionDecisionOption agentPermissionDecisionOption = (AgentPermissionDecisionOption) AbstractC0878AGe.A0A(i, agentPermissionApproval.decisionOptions);
        if (agentPermissionDecisionOption == null || !ApprovalCardOnlyKt.isQuickDecisionAllowed(agentPermissionApproval, agentPermissionDecisionOption)) {
            ApprovalDecisionAnalytics.INSTANCE.logSkipped(str, ApprovalDecisionSkipReason.OPTION_UNAVAILABLE, agentPermissionApproval.origin);
            return;
        }
        if (AnonymousClass006.A1a(str, this.submittingApprovalIds)) {
            approvalDecisionSkipReason = ApprovalDecisionSkipReason.ALREADY_SUBMITTING;
        } else if (this.approvalsRepository.isConfirmingDecision(str)) {
            approvalDecisionSkipReason = ApprovalDecisionSkipReason.AWAITING_SNAPSHOT;
        } else {
            List<HatchAgentPermissionsRepository.AgentPermissionApproval> value = this.approvalsRepository.pendingApprovals.getValue();
            if (!(value instanceof Collection) || !C3cG.A1N(value)) {
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    if (C7384Etj.areEqual(((HatchAgentPermissionsRepository.AgentPermissionApproval) it.next()).approvalId, str)) {
                        while (!AnonymousClass007.A1O(str, this.submittingApprovalIds)) {
                        }
                        AnonymousClass001.A1J(new AnonymousClass2(str, agentPermissionDecisionOption, agentPermissionApproval, null), AEu.A00(this));
                        return;
                    }
                }
            }
            approvalDecisionSkipReason = ApprovalDecisionSkipReason.NOT_PENDING;
        }
        ApprovalDecisionAnalytics.INSTANCE.logSkipped(str, approvalDecisionSkipReason, agentPermissionApproval.origin);
        if (approvalDecisionSkipReason == ApprovalDecisionSkipReason.AWAITING_SNAPSHOT) {
            this.approvalsRepository.requestDecisionConfirmation();
        }
    }

    public final C1BN<AgentPermissionApprovalsUiState> getUiState() {
        return this.uiState;
    }

    public final void loadHistory(boolean z) {
        ApprovalHistoryState value = this.historyState.getValue();
        ApprovalHistoryLoadingState approvalHistoryLoadingState = value.loadingState;
        if (approvalHistoryLoadingState == ApprovalHistoryLoadingState.LOADING || value.isLoadingMore) {
            return;
        }
        if (z || approvalHistoryLoadingState == ApprovalHistoryLoadingState.IDLE || value.canLoadMore) {
            AnonymousClass001.A1J(new C107431(z, null), AEu.A00(this));
        }
    }
}
