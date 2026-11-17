package com.facebook.aura.agentpermission;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass441;
import X.AnonymousClass603;
import X.BLG;
import X.BLL;
import X.C1BN;
import X.C3Ej;
import X.C3Ek;
import X.C3Pi;
import X.C3UX;
import X.C3cI;
import X.C3rb;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.ApprovalDecisionAnalytics;
import com.facebook.aura.gateway.ApprovalDecisionSkipReason;
import com.facebook.aura.gateway.ApprovalOrigin;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class AgentPermissionDecisionViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<Boolean> _awaitingApproval;
    public final BLG<Boolean> _submitting;
    public final C1BN<HatchAgentPermissionsRepository.AgentPermissionApproval> approval;
    public final String approvalId;
    public final HatchAgentPermissionsRepository repository;
    public final C1BN<Boolean> repositoryConfirming;
    public final C1BN<AgentPermissionDecisionUiState> uiState;

    @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$1", f = "AgentPermissionDecisionViewModel.kt", l = {LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$1$1", f = "AgentPermissionDecisionViewModel.kt", l = {66}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00161 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
            public int label;
            public final /* synthetic */ AgentPermissionDecisionViewModel this$0;

            @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$1$1$1", f = "AgentPermissionDecisionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C00171 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
                public /* synthetic */ boolean Z$0;
                public int label;

                public C00171(HtJ<? super C00171> htJ) {
                    super(2, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C00171 c00171 = new C00171(htJ);
                    c00171.Z$0 = AnonymousClass001.A1X(obj);
                    return c00171;
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    boolean z = this.Z$0;
                    if (this.label == 0) {
                        return AnonymousClass001.A0k(obj, z);
                    }
                    throw AnonymousClass001.A0n();
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                    return invoke(AnonymousClass001.A1X(bool), htJ);
                }

                public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                    return ((C00171) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00161(AgentPermissionDecisionViewModel agentPermissionDecisionViewModel, HtJ<? super C00161> htJ) {
                super(2, htJ);
                this.this$0 = agentPermissionDecisionViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C00161(this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C1BN<Boolean> c1bn = this.this$0.repository.hasLoadedServerApprovals;
                    C00171 c00171 = new C00171(null);
                    this.label = 1;
                    obj = AbstractC9777Gfy.A00(this, c00171, c1bn);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return obj;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
                return new C00161(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AgentPermissionDecisionViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C00161 c00161 = new C00161(AgentPermissionDecisionViewModel.this, null);
                this.label = 1;
                if (C3cI.A0S(c00161, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            AnonymousClass004.A1D(false, AgentPermissionDecisionViewModel.this._awaitingApproval);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return AgentPermissionDecisionViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<AgentPermissionDecisionViewModel> {
        public static final int $stable = 8;
        public final String approvalId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AgentPermissionDecisionViewModel create() {
            return new AgentPermissionDecisionViewModel(this.userSession, this.approvalId);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.approvalId = str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$submit$1", f = "AgentPermissionDecisionViewModel.kt", l = {VoiceCallForegroundService.AVATAR_TARGET_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionDecisionViewModel$submit$1, reason: invalid class name and case insensitive filesystem */
    public final class C107441 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ Long $expectedMessageRevision;
        public final /* synthetic */ AgentPermissionDecisionOption $selected;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107441(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, AgentPermissionDecisionOption agentPermissionDecisionOption, Long l, HtJ<? super C107441> htJ) {
            super(2, htJ);
            this.$approval = agentPermissionApproval;
            this.$selected = agentPermissionDecisionOption;
            this.$expectedMessageRevision = l;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AgentPermissionDecisionViewModel.this.new C107441(this.$approval, this.$selected, this.$expectedMessageRevision, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAgentPermissionsRepository hatchAgentPermissionsRepository = AgentPermissionDecisionViewModel.this.repository;
                String str = this.$approval.approvalId;
                AgentPermissionDecisionOption agentPermissionDecisionOption = this.$selected;
                String str2 = agentPermissionDecisionOption.kind;
                String str3 = agentPermissionDecisionOption.alwaysScope;
                Long l = this.$expectedMessageRevision;
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
                AnonymousClass004.A1D(false, AgentPermissionDecisionViewModel.this._submitting);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C107441) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void submit(AgentPermissionDecisionOption agentPermissionDecisionOption, Long l) {
        ApprovalDecisionAnalytics approvalDecisionAnalytics;
        String str;
        ApprovalDecisionSkipReason approvalDecisionSkipReason;
        C7384Etj.A0Y(agentPermissionDecisionOption, 0);
        AgentPermissionDecisionOption agentPermissionDecisionOption2 = null;
        ApprovalOrigin approvalOrigin = null;
        if (AnonymousClass003.A1Z(this._submitting)) {
            approvalDecisionAnalytics = ApprovalDecisionAnalytics.INSTANCE;
            str = this.approvalId;
            approvalDecisionSkipReason = ApprovalDecisionSkipReason.ALREADY_SUBMITTING;
            HatchAgentPermissionsRepository.AgentPermissionApproval value = this.approval.getValue();
            if (value != null) {
                approvalOrigin = value.origin;
            }
        } else {
            HatchAgentPermissionsRepository.AgentPermissionApproval value2 = this.approval.getValue();
            if (value2 == null) {
                ApprovalDecisionAnalytics.INSTANCE.logSkipped(this.approvalId, ApprovalDecisionSkipReason.NOT_PENDING, null);
                return;
            }
            if (this.repository.isConfirmingDecision(this.approvalId)) {
                ApprovalDecisionAnalytics.INSTANCE.logSkipped(this.approvalId, ApprovalDecisionSkipReason.AWAITING_SNAPSHOT, value2.origin);
                this.repository.requestDecisionConfirmation();
                return;
            }
            Iterator<AgentPermissionDecisionOption> it = value2.decisionOptions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AgentPermissionDecisionOption next = it.next();
                AgentPermissionDecisionOption agentPermissionDecisionOption3 = next;
                if (C7384Etj.areEqual(agentPermissionDecisionOption3.kind, agentPermissionDecisionOption.kind) && C7384Etj.areEqual(agentPermissionDecisionOption3.alwaysScope, agentPermissionDecisionOption.alwaysScope)) {
                    agentPermissionDecisionOption2 = next;
                    break;
                }
            }
            AgentPermissionDecisionOption agentPermissionDecisionOption4 = agentPermissionDecisionOption2;
            if (agentPermissionDecisionOption4 != null) {
                HtJ htJA14 = C3cI.A14(this._submitting, AnonymousClass001.A0i());
                AnonymousClass001.A1J(new C107441(value2, agentPermissionDecisionOption4, l, htJA14), AEu.A00(this));
                return;
            } else {
                approvalDecisionAnalytics = ApprovalDecisionAnalytics.INSTANCE;
                str = this.approvalId;
                approvalDecisionSkipReason = ApprovalDecisionSkipReason.OPTION_UNAVAILABLE;
                approvalOrigin = value2.origin;
            }
        }
        approvalDecisionAnalytics.logSkipped(str, approvalDecisionSkipReason, approvalOrigin);
    }

    public final C1BN<AgentPermissionDecisionUiState> getUiState() {
        return this.uiState;
    }

    public AgentPermissionDecisionViewModel(AbstractC3358CGz abstractC3358CGz, String str) {
        Object next;
        boolean zA1b = AnonymousClass004.A1b(abstractC3358CGz, str);
        this.approvalId = str;
        HatchAgentPermissionsRepository companion = HatchAgentPermissionsRepository.Companion.getInstance(abstractC3358CGz);
        this.repository = companion;
        AgentPermissionDecisionViewModel$special$$inlined$map$1 agentPermissionDecisionViewModel$special$$inlined$map$1 = new AgentPermissionDecisionViewModel$special$$inlined$map$1(companion.pendingApprovals, this);
        BLL bllA00 = AEu.A00(this);
        C3Ej c3Ej = C3Ek.A00;
        Iterator itA0z = C3cI.A0z(companion.pendingApprovals);
        while (true) {
            if (!itA0z.hasNext()) {
                next = null;
                break;
            } else {
                next = itA0z.next();
                if (C7384Etj.areEqual(((HatchAgentPermissionsRepository.AgentPermissionApproval) next).approvalId, this.approvalId)) {
                    break;
                }
            }
        }
        C3Pi c3PiA00 = AnonymousClass441.A00(next, bllA00, agentPermissionDecisionViewModel$special$$inlined$map$1, c3Ej);
        this.approval = c3PiA00;
        boolean z = false;
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(zA1b);
        this._submitting = c9286GCnA0v;
        C9286GCn c9286GCnA0v2 = AnonymousClass002.A0v(c3PiA00.getValue() == null ? true : zA1b);
        this._awaitingApproval = c9286GCnA0v2;
        if (AnonymousClass001.A1X(c9286GCnA0v2.getValue())) {
            AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
        }
        C3Pi c3PiA002 = AnonymousClass441.A00(Boolean.valueOf(this.repository.isConfirmingDecision(this.approvalId)), AEu.A00(this), new AgentPermissionDecisionViewModel$special$$inlined$map$2(this.repository.confirmingApprovalIds, this), c3Ej);
        this.repositoryConfirming = c3PiA002;
        AnonymousClass603 anonymousClass603A01 = C3rb.A01(new AgentPermissionDecisionViewModel$uiState$1(null), c3PiA00, c9286GCnA0v, c9286GCnA0v2, c3PiA002);
        BLL bllA002 = AEu.A00(this);
        HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = (HatchAgentPermissionsRepository.AgentPermissionApproval) c3PiA00.getValue();
        boolean zA1X = AnonymousClass001.A1X(c3PiA002.getValue());
        if (c3PiA00.getValue() == null && AnonymousClass001.A1X(c9286GCnA0v2.getValue())) {
            z = true;
        }
        this.uiState = AnonymousClass441.A00(new AgentPermissionDecisionUiState(agentPermissionApproval, zA1X, z, AnonymousClass001.A1X(c3PiA002.getValue())), bllA002, anonymousClass603A01, c3Ej);
    }
}
