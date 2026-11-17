package com.facebook.aura.skills.viewmodel;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass441;
import X.BLG;
import X.C1BN;
import X.C3Ek;
import X.C3UX;
import X.C3cI;
import X.C3rb;
import X.C7384Etj;
import X.C7BY;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import com.facebook.aura.skills.connect.config.ConnectorConnectionRoute;
import com.facebook.aura.skills.connect.config.ConnectorConnectionRouteKt;
import com.facebook.aura.skills.connect.config.FirstPartyConnectorConfig;
import com.facebook.aura.skills.connect.config.SkillConnectConfigKt;
import com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository;
import com.facebook.aura.skills.connect.repository.SkillConnectAction;
import com.facebook.aura.skills.model.ConnectorGroup;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.model.SkillState;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import com.facebook.aura.skills.viewmodel.DirectSignInOutcome;
import com.facebook.aura.skills.viewmodel.DirectSignInState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchConnectorLookupViewModel extends AEs {
    public final AuraSkillAuthRepository authRepository;
    public final ConfidentialSessionGate confidentialSessionGate;
    public final String connectorId;
    public final BLG<DirectSignInState> directSignIn;
    public final BLG<Boolean> loading;
    public HoC refreshJob;
    public final HatchConnectorCatalogRepository repository;
    public final C1BN<ConnectorLookupUiState> uiState;

    /* loaded from: classes.dex */
    public final class Factory extends AuraViewModelFactory<HatchConnectorLookupViewModel> {
        public final String connectorId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchConnectorLookupViewModel create() {
            return new HatchConnectorLookupViewModel(this.userSession, this.connectorId);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.connectorId = str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.HatchConnectorLookupViewModel$refresh$1", f = "HatchConnectorLookupViewModel.kt", l = {81}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.HatchConnectorLookupViewModel$refresh$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConnectorLookupViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConnectorLookupViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchConnectorLookupViewModel hatchConnectorLookupViewModel = HatchConnectorLookupViewModel.this;
                    HatchConnectorCatalogRepository hatchConnectorCatalogRepository = hatchConnectorLookupViewModel.repository;
                    String str = hatchConnectorLookupViewModel.connectorId;
                    this.label = 1;
                    if (hatchConnectorCatalogRepository.m2119fetchConnectorgIAlus(str, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                AnonymousClass004.A1D(false, HatchConnectorLookupViewModel.this.loading);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                AnonymousClass004.A1D(false, HatchConnectorLookupViewModel.this.loading);
                throw th;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.HatchConnectorLookupViewModel$startDirectSignIn$1", f = "HatchConnectorLookupViewModel.kt", l = {111}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.HatchConnectorLookupViewModel$startDirectSignIn$1, reason: invalid class name and case insensitive filesystem */
    public final class C138731 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $sourceSessionId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138731(String str, HtJ<? super C138731> htJ) {
            super(2, htJ);
            this.$sourceSessionId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConnectorLookupViewModel.this.new C138731(this.$sourceSessionId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchConnectorLookupViewModel hatchConnectorLookupViewModel = HatchConnectorLookupViewModel.this;
                    AuraSkillAuthRepository auraSkillAuthRepository = hatchConnectorLookupViewModel.authRepository;
                    String str = hatchConnectorLookupViewModel.connectorId;
                    String str2 = this.$sourceSessionId;
                    this.label = 1;
                    obj = auraSkillAuthRepository.fetchConnectAction(str, str2, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                SkillConnectAction skillConnectAction = (SkillConnectAction) obj;
                AnonymousClass002.A1I(HatchConnectorLookupViewModel.this.directSignIn, new DirectSignInState.Resolved(skillConnectAction instanceof SkillConnectAction.OAuth ? new DirectSignInOutcome.OpenSignInPage(((SkillConnectAction.OAuth) skillConnectAction).url) : DirectSignInOutcome.ShowConnectSheet.INSTANCE));
                HatchConnectorLookupViewModel.this.directSignIn.A6e(DirectSignInState.Resolving.INSTANCE, DirectSignInState.Idle.INSTANCE);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                HatchConnectorLookupViewModel.this.directSignIn.A6e(DirectSignInState.Resolving.INSTANCE, DirectSignInState.Idle.INSTANCE);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C138731) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.skills.viewmodel.ConnectorLookupUiState present(com.facebook.aura.skills.model.Skill r4, boolean r5, com.facebook.aura.skills.viewmodel.DirectSignInState r6) {
        /*
            r3 = this;
            r1 = 0
            if (r4 == 0) goto La
            com.facebook.aura.skills.model.SkillState r2 = r4.state
            com.facebook.aura.skills.model.SkillState r0 = com.facebook.aura.skills.model.SkillState.CONNECTED
            r3 = r4
            if (r2 == r0) goto Lb
        La:
            r3 = r1
        Lb:
            if (r5 == 0) goto Lf
            if (r4 == 0) goto L18
        Lf:
            com.facebook.aura.skills.viewmodel.DirectSignInState$Resolving r0 = com.facebook.aura.skills.viewmodel.DirectSignInState.Resolving.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r6, r0)
            r2 = 0
            if (r0 == 0) goto L19
        L18:
            r2 = 1
        L19:
            boolean r0 = r6 instanceof com.facebook.aura.skills.viewmodel.DirectSignInState.Resolved
            if (r0 == 0) goto L23
            com.facebook.aura.skills.viewmodel.DirectSignInState$Resolved r6 = (com.facebook.aura.skills.viewmodel.DirectSignInState.Resolved) r6
            if (r6 == 0) goto L23
            com.facebook.aura.skills.viewmodel.DirectSignInOutcome r1 = r6.outcome
        L23:
            com.facebook.aura.skills.viewmodel.ConnectorLookupUiState r0 = new com.facebook.aura.skills.viewmodel.ConnectorLookupUiState
            r0.<init>(r4, r3, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.viewmodel.HatchConnectorLookupViewModel.present(com.facebook.aura.skills.model.Skill, boolean, com.facebook.aura.skills.viewmodel.DirectSignInState):com.facebook.aura.skills.viewmodel.ConnectorLookupUiState");
    }

    public final ConnectorConnectionRoute connectionRoute(boolean z) {
        ConnectorConnectionRoute connectorConnectionRoute;
        FirstPartyConnectorConfig firstPartyConnectorConfigFirstPartyConnectorConfigForSkill;
        ConnectorConnectionRoute connectorConnectionRouteAccountsCenterConnectionRoute;
        Skill skill = this.uiState.getValue().skill;
        if (skill == null) {
            return null;
        }
        if (AnonymousClass002.A1Z(skill.state, SkillState.CONNECTED) == z) {
            connectorConnectionRoute = ConnectorConnectionRoute.AlreadyInRequestedState.INSTANCE;
        } else if (!z) {
            connectorConnectionRoute = ConnectorConnectionRoute.Disconnect.INSTANCE;
        } else if (skill.group == ConnectorGroup.OPTIMIZED_SITES) {
            connectorConnectionRoute = ConnectorConnectionRoute.DirectSignIn.INSTANCE;
        } else {
            if (!this.confidentialSessionGate.isConfidentialVm() && (firstPartyConnectorConfigFirstPartyConnectorConfigForSkill = SkillConnectConfigKt.firstPartyConnectorConfigForSkill(skill.id)) != null && (connectorConnectionRouteAccountsCenterConnectionRoute = ConnectorConnectionRouteKt.accountsCenterConnectionRoute(firstPartyConnectorConfigFirstPartyConnectorConfigForSkill)) != null) {
                return connectorConnectionRouteAccountsCenterConnectionRoute;
            }
            connectorConnectionRoute = ConnectorConnectionRoute.Connect.INSTANCE;
        }
        return connectorConnectionRoute;
    }

    public final Object disconnect(String str, HtJ<? super Boolean> htJ) {
        return this.repository.disconnectSkill(this.connectorId, str, htJ);
    }

    public final C1BN<ConnectorLookupUiState> getUiState() {
        return this.uiState;
    }

    public final void onAccountLinkDismissed() {
        this.repository.checkLinkedAccountAndPromote(this.connectorId);
    }

    public final void onDirectSignInHandled() {
        this.directSignIn.Af8(DirectSignInState.Handled.INSTANCE);
    }

    public final void refresh() {
        if (C7BY.A0j(this.connectorId)) {
            return;
        }
        HoC hoC = this.refreshJob;
        if (hoC == null || !hoC.isActive()) {
            HtJ htJA14 = C3cI.A14(this.loading, true);
            this.refreshJob = AnonymousClass001.A11(new AnonymousClass1(htJA14), AEu.A00(this));
        }
    }

    public final void startDirectSignIn(String str) {
        if (C7384Etj.areEqual(this.directSignIn.getValue(), DirectSignInState.Idle.INSTANCE)) {
            this.directSignIn.Af8(DirectSignInState.Resolving.INSTANCE);
            AnonymousClass001.A1J(new C138731(str, null), AEu.A00(this));
        }
    }

    public HatchConnectorLookupViewModel(AbstractC3358CGz abstractC3358CGz, String str) {
        boolean zA1b = AnonymousClass004.A1b(abstractC3358CGz, str);
        this.connectorId = str;
        HatchConnectorCatalogRepository companion = HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz);
        this.repository = companion;
        this.authRepository = AuraSkillAuthRepository.Companion.getInstance(abstractC3358CGz);
        this.confidentialSessionGate = ConfidentialSessionGate.Companion.getInstance(abstractC3358CGz);
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(zA1b);
        this.loading = c9286GCnA0v;
        DirectSignInState.Idle idle = DirectSignInState.Idle.INSTANCE;
        C9286GCn c9286GCnA01 = HnJ.A01(idle);
        this.directSignIn = c9286GCnA01;
        this.uiState = AnonymousClass441.A00(present(companion.getCachedConnector(str), !C7BY.A0j(str), idle), AEu.A00(this), C3rb.A00(new HatchConnectorLookupViewModel$uiState$1(this), companion.observeConnector(str), c9286GCnA0v, c9286GCnA01), C3Ek.A00);
        if (companion.getCachedConnector(str) == null) {
            refresh();
        }
    }
}
