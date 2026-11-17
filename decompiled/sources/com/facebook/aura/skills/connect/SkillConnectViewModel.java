package com.facebook.aura.skills.connect;

import X.A3q;
import X.A6J;
import X.AEs;
import X.AEu;
import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC08429uh;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C9uG;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC08439ui;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.skills.connect.LinkedAccountsChipLabel;
import com.facebook.aura.skills.connect.LinkedAccountsTitle;
import com.facebook.aura.skills.connect.config.FirstPartyConnectorConfig;
import com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository;
import com.facebook.aura.skills.connect.repository.SkillConnectAction;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import com.facebook.aura.skills.repo.OAuthLinkedAccount;
import com.facebook.aura.skills.repo.SkillsFirstPartyAccountsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class SkillConnectViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<SkillConnectUiState> _uiState;
    public SkillConnectAction cachedConnectAction;
    public final SingleFlight connectActionSingleFlight;
    public final HatchConnectorCatalogRepository connectorRepository;
    public final FirstPartyConnectorConfig firstPartyConfig;
    public boolean hasShownLinkUpsell;
    public boolean isSubmitting;
    public final SingleFlight linkedAccountsSingleFlight;
    public final SkillsFirstPartyAccountsRepository repository;
    public final Skill skill;
    public final AuraSkillAuthRepository skillAuthRepository;
    public final String sourceSessionId;
    public final C1BN<SkillConnectUiState> uiState;

    @DebugMetadata(c = "com.facebook.aura.skills.connect.SkillConnectViewModel$1", f = "SkillConnectViewModel.kt", l = {132}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.connect.SkillConnectViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SkillConnectViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SkillConnectViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SkillConnectViewModel skillConnectViewModel = SkillConnectViewModel.this;
                this.label = 1;
                if (skillConnectViewModel.fetchConnectAction(this) == enumC10460Hji) {
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
    }

    public final class Factory implements InterfaceC08439ui {
        public static final int $stable = 8;
        public final Skill skill;
        public final String sourceSessionId;
        public final AbstractC3358CGz userSession;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC08439ui
        public <T extends AEs> T create(Class<T> cls) {
            return new SkillConnectViewModel(this.skill, this.userSession, this.sourceSessionId, null, 0 == true ? 1 : 0, 24, 0 == true ? 1 : 0);
        }

        public Factory(Skill skill, AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(skill, abstractC3358CGz);
            this.skill = skill;
            this.userSession = abstractC3358CGz;
            this.sourceSessionId = str;
        }

        public /* synthetic */ Factory(Skill skill, AbstractC3358CGz abstractC3358CGz, String str, int i, C06H c06h) {
            this(skill, abstractC3358CGz, AnonymousClass006.A0t(i, str));
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
            return (T) AbstractC08429uh.A00(this, a6j, c9uG);
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(Class<T> cls, A6J a6j) {
            return (T) AbstractC08429uh.A01(this, cls);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.connect.SkillConnectViewModel", f = "SkillConnectViewModel.kt", l = {181}, m = "connectSelectedAccounts", v = 2)
    /* renamed from: com.facebook.aura.skills.connect.SkillConnectViewModel$connectSelectedAccounts$1, reason: invalid class name and case insensitive filesystem */
    public final class C138001 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C138001(HtJ<? super C138001> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SkillConnectViewModel.this.connectSelectedAccounts(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.connect.SkillConnectViewModel", f = "SkillConnectViewModel.kt", l = {HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE}, m = "directlyConnect", v = 2)
    /* renamed from: com.facebook.aura.skills.connect.SkillConnectViewModel$directlyConnect$1, reason: invalid class name and case insensitive filesystem */
    public final class C138011 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C138011(HtJ<? super C138011> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SkillConnectViewModel.this.directlyConnect(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.connect.SkillConnectViewModel", f = "SkillConnectViewModel.kt", l = {242}, m = "fetchConnectAction", v = 2)
    /* renamed from: com.facebook.aura.skills.connect.SkillConnectViewModel$fetchConnectAction$1, reason: invalid class name and case insensitive filesystem */
    public final class C138021 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C138021(HtJ<? super C138021> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SkillConnectViewModel.this.fetchConnectAction(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.connect.SkillConnectViewModel$maybeFetchLinkedAccounts$2", f = "SkillConnectViewModel.kt", l = {282}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.connect.SkillConnectViewModel$maybeFetchLinkedAccounts$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ FirstPartyConnectorConfig $config;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.skills.connect.SkillConnectViewModel$maybeFetchLinkedAccounts$2$1", f = "SkillConnectViewModel.kt", l = {283}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.skills.connect.SkillConnectViewModel$maybeFetchLinkedAccounts$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ FirstPartyConnectorConfig $config;
            public int label;
            public final /* synthetic */ SkillConnectViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SkillConnectViewModel skillConnectViewModel, FirstPartyConnectorConfig firstPartyConnectorConfig, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.this$0 = skillConnectViewModel;
                this.$config = firstPartyConnectorConfig;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$config, htJ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
            /* JADX WARN: Type inference failed for: r12v2, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
            /* JADX WARN: Type inference failed for: r12v3, types: [java.util.Set] */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r16) {
                /*
                    r15 = this;
                    r3 = r16
                    X.Hji r4 = X.EnumC10460Hji.A02
                    int r0 = r15.label
                    r2 = 1
                    if (r0 == 0) goto L3b
                    if (r0 != r2) goto Lc1
                    X.Hwg.A00(r3)
                Le:
                    com.facebook.aura.skills.repo.OAuthLinkedAccountsResult r3 = (com.facebook.aura.skills.repo.OAuthLinkedAccountsResult) r3
                    if (r3 == 0) goto L16
                    java.util.List<com.facebook.aura.skills.repo.OAuthLinkedAccount> r10 = r3.accounts
                    if (r10 != 0) goto L18
                L16:
                    X.AGi r10 = X.C0881AGi.A00
                L18:
                    com.facebook.aura.skills.connect.config.FirstPartyConnectorConfig r0 = r15.$config
                    boolean r0 = r0.requiresLinkedAccountSelection
                    if (r0 == 0) goto L67
                    java.util.ArrayList r4 = X.C3cG.A0h()
                    java.util.Iterator r2 = r10.iterator()
                L26:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L4d
                    java.lang.Object r1 = r2.next()
                    r0 = r1
                    com.facebook.aura.skills.repo.OAuthLinkedAccount r0 = (com.facebook.aura.skills.repo.OAuthLinkedAccount) r0
                    boolean r0 = r0.connected
                    if (r0 == 0) goto L26
                    r4.add(r1)
                    goto L26
                L3b:
                    X.Hwg.A00(r3)
                    com.facebook.aura.skills.connect.SkillConnectViewModel r0 = r15.this$0
                    com.facebook.aura.skills.repo.SkillsFirstPartyAccountsRepository r1 = r0.repository
                    com.facebook.aura.skills.connect.config.FirstPartyConnectorConfig r0 = r15.$config
                    r15.label = r2
                    java.lang.Object r3 = r1.fetchLinkedAccountsResult(r0, r15)
                    if (r3 != r4) goto Le
                    return r4
                L4d:
                    java.util.LinkedHashSet r12 = X.C3cG.A0k()
                    java.util.Iterator r1 = r4.iterator()
                L55:
                    boolean r0 = r1.hasNext()
                    if (r0 == 0) goto L6a
                    java.lang.Object r0 = r1.next()
                    com.facebook.aura.skills.repo.OAuthLinkedAccount r0 = (com.facebook.aura.skills.repo.OAuthLinkedAccount) r0
                    java.lang.String r0 = r0.accountId
                    r12.add(r0)
                    goto L55
                L67:
                    X.A3q r12 = X.A3q.A00
                    goto L80
                L6a:
                    boolean r0 = r12.isEmpty()
                    if (r0 == 0) goto L80
                    java.lang.Object r0 = X.AbstractC0878AGe.A0G(r10)
                    com.facebook.aura.skills.repo.OAuthLinkedAccount r0 = (com.facebook.aura.skills.repo.OAuthLinkedAccount) r0
                    if (r0 == 0) goto L67
                    java.lang.String r0 = r0.accountId
                    if (r0 == 0) goto L67
                    java.util.Set r12 = java.util.Collections.singleton(r0)
                L80:
                    com.facebook.aura.skills.connect.SkillConnectViewModel r2 = r15.this$0
                    X.BLG<com.facebook.aura.skills.connect.SkillConnectUiState> r1 = r2._uiState
                    com.facebook.aura.skills.connect.config.FirstPartyConnectorConfig r4 = r15.$config
                L86:
                    java.lang.Object r5 = r1.getValue()
                    r6 = r5
                    com.facebook.aura.skills.connect.SkillConnectUiState r6 = (com.facebook.aura.skills.connect.SkillConnectUiState) r6
                    boolean r8 = r4.requiresLinkedAccountSelection
                    if (r3 == 0) goto L95
                    java.util.List<com.facebook.aura.skills.repo.OAuthLinkedAccountGroup> r11 = r3.groups
                    if (r11 != 0) goto L97
                L95:
                    X.AGi r11 = X.C0881AGi.A00
                L97:
                    if (r8 == 0) goto La4
                    boolean r0 = r10.isEmpty()
                    if (r0 == 0) goto La4
                    boolean r0 = r2.hasShownLinkUpsell
                    r14 = 1
                    if (r0 == 0) goto La5
                La4:
                    r14 = 0
                La5:
                    r9 = 0
                    boolean r7 = r6.compactAccounts
                    com.facebook.aura.skills.connect.ConnectButtonState r13 = r6.connectButtonState
                    com.facebook.aura.skills.connect.LinkedAccountsTitle r15 = r6.linkedAccountsTitle
                    boolean r0 = r6.showsLinkedAccountList
                    r16 = r0
                    com.facebook.aura.skills.connect.SkillConnectUiState r0 = r6.copy(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                    com.facebook.aura.skills.connect.SkillConnectUiState r0 = com.facebook.aura.skills.connect.SkillConnectViewModel.access$withDerivedState(r2, r0)
                    boolean r0 = r1.A6e(r5, r0)
                    if (r0 == 0) goto L86
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    return r4
                Lc1:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.SkillConnectViewModel.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FirstPartyConnectorConfig firstPartyConnectorConfig, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$config = firstPartyConnectorConfig;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SkillConnectViewModel.this.new AnonymousClass2(this.$config, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SkillConnectViewModel skillConnectViewModel = SkillConnectViewModel.this;
                SingleFlight singleFlight = skillConnectViewModel.linkedAccountsSingleFlight;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(skillConnectViewModel, this.$config, null);
                this.label = 1;
                if (singleFlight.invoke(Unit.INSTANCE, anonymousClass1, this) == enumC10460Hji) {
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
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.connect.SkillConnectViewModel", f = "SkillConnectViewModel.kt", l = {234}, m = "resolveConnectAction", v = 2)
    /* renamed from: com.facebook.aura.skills.connect.SkillConnectViewModel$resolveConnectAction$1, reason: invalid class name and case insensitive filesystem */
    public final class C138031 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C138031(HtJ<? super C138031> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SkillConnectViewModel.this.resolveConnectAction(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SkillConnectViewModel(com.facebook.aura.skills.model.Skill r15, X.AbstractC3358CGz r16, java.lang.String r17, com.facebook.aura.skills.repo.SkillsFirstPartyAccountsRepository r18, com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository r19) {
        /*
            r14 = this;
            r5 = 0
            X.C7384Etj.A0Y(r15, r5)
            r1 = 1
            r2 = r18
            r0 = r19
            r4 = r16
            X.AnonymousClass005.A12(r4, r2, r0, r1)
            r14.<init>()
            r14.skill = r15
            r3 = r17
            r14.sourceSessionId = r3
            r14.repository = r2
            r14.skillAuthRepository = r0
            com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$Companion r0 = com.facebook.aura.skills.repo.HatchConnectorCatalogRepository.Companion
            com.facebook.aura.skills.repo.HatchConnectorCatalogRepository r0 = r0.getInstance(r4)
            r14.connectorRepository = r0
            boolean r0 = r15.isCustom
            r2 = 0
            if (r0 == 0) goto L7f
            com.facebook.aura.skills.connect.repository.SkillConnectAction$None r0 = com.facebook.aura.skills.connect.repository.SkillConnectAction.None.INSTANCE
        L2a:
            r14.cachedConnectAction = r0
            com.facebook.aura.common.coroutines.OnDuplicateCall$Join r0 = com.facebook.aura.common.coroutines.OnDuplicateCall.Join.INSTANCE
            com.facebook.aura.common.coroutines.SingleFlight r0 = com.facebook.aura.common.coroutines.SingleFlightKt.SingleFlight(r4, r0, r5)
            r14.connectActionSingleFlight = r0
            com.facebook.aura.common.coroutines.OnDuplicateCall$Cancel r0 = com.facebook.aura.common.coroutines.OnDuplicateCall.Cancel.INSTANCE
            com.facebook.aura.common.coroutines.SingleFlight r0 = com.facebook.aura.common.coroutines.SingleFlightKt.SingleFlight(r4, r0, r5)
            r14.linkedAccountsSingleFlight = r0
            java.lang.String r0 = r15.id
            com.facebook.aura.skills.connect.config.FirstPartyConnectorConfig r0 = com.facebook.aura.skills.connect.config.SkillConnectConfigKt.firstPartyConnectorConfigForSkill(r0)
            r14.firstPartyConfig = r0
            if (r0 == 0) goto L4b
            boolean r0 = r0.compactLinkedAccounts
            r4 = 1
            if (r0 == r1) goto L4c
        L4b:
            r4 = 0
        L4c:
            X.A3q r9 = X.A3q.A00
            com.facebook.aura.skills.connect.ConnectButtonState r10 = r14.getConnectButtonState(r9, r5)
            X.AGi r7 = X.C0881AGi.A00
            com.facebook.aura.skills.connect.LinkedAccountsTitle$None r12 = com.facebook.aura.skills.connect.LinkedAccountsTitle.None.INSTANCE
            com.facebook.aura.skills.connect.SkillConnectUiState r3 = new com.facebook.aura.skills.connect.SkillConnectUiState
            r6 = r5
            r8 = r7
            r11 = r5
            r13 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.GCn r0 = X.C3cG.A14(r3)
            r14._uiState = r0
            X.3Pi r0 = X.C3cG.A11(r0)
            r14.uiState = r0
            boolean r0 = r15.isCustom
            if (r0 != 0) goto L7b
            X.BLL r1 = X.AEu.A00(r14)
            com.facebook.aura.skills.connect.SkillConnectViewModel$1 r0 = new com.facebook.aura.skills.connect.SkillConnectViewModel$1
            r0.<init>(r2)
            X.AnonymousClass001.A1J(r0, r1)
        L7b:
            r14.maybeFetchLinkedAccounts()
            return
        L7f:
            r0 = r2
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.SkillConnectViewModel.<init>(com.facebook.aura.skills.model.Skill, X.CGz, java.lang.String, com.facebook.aura.skills.repo.SkillsFirstPartyAccountsRepository, com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.skills.connect.SkillConnectUiState withDerivedState(com.facebook.aura.skills.connect.SkillConnectUiState r13) {
        /*
            r12 = this;
            r2 = r13
            java.util.Set<java.lang.String> r1 = r13.selectedAccountIds
            boolean r0 = r13.isFetchingAccounts
            com.facebook.aura.skills.connect.ConnectButtonState r9 = r12.getConnectButtonState(r1, r0)
            boolean r0 = r13.getNeedsAccountToContinue()
            if (r0 == 0) goto L3e
            com.facebook.aura.skills.connect.LinkedAccountsTitle$AddAccount r11 = com.facebook.aura.skills.connect.LinkedAccountsTitle.AddAccount.INSTANCE
        L11:
            com.facebook.aura.skills.connect.LinkedAccountsTitle r11 = (com.facebook.aura.skills.connect.LinkedAccountsTitle) r11
            com.facebook.aura.skills.connect.config.FirstPartyConnectorConfig r0 = r12.firstPartyConfig
            if (r0 == 0) goto L3c
            boolean r1 = r0.showsLinkedAccountsOnConnect
            r0 = 1
            if (r1 != r0) goto L3c
            java.util.List<com.facebook.aura.skills.repo.OAuthLinkedAccountGroup> r0 = r13.linkedAccountGroups
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L28
            boolean r0 = r13.requiresAccountSelection
            if (r0 != 0) goto L3c
        L28:
            r12 = 1
        L29:
            boolean r3 = r13.compactAccounts
            boolean r4 = r13.requiresAccountSelection
            boolean r5 = r13.isFetchingAccounts
            java.util.List<com.facebook.aura.skills.repo.OAuthLinkedAccount> r6 = r13.linkedAccounts
            java.util.List<com.facebook.aura.skills.repo.OAuthLinkedAccountGroup> r7 = r13.linkedAccountGroups
            java.util.Set<java.lang.String> r8 = r13.selectedAccountIds
            boolean r10 = r13.showLinkUpsell
            com.facebook.aura.skills.connect.SkillConnectUiState r0 = r2.copy(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L3c:
            r12 = 0
            goto L29
        L3e:
            boolean r0 = r13.requiresAccountSelection
            if (r0 == 0) goto L56
            boolean r0 = r13.isFetchingAccounts
            if (r0 == 0) goto L49
            com.facebook.aura.skills.connect.LinkedAccountsTitle$Loading r11 = com.facebook.aura.skills.connect.LinkedAccountsTitle.Loading.INSTANCE
            goto L11
        L49:
            java.util.List<com.facebook.aura.skills.repo.OAuthLinkedAccount> r0 = r13.linkedAccounts
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L56
            com.facebook.aura.skills.connect.LinkedAccountsTitle$Chip r11 = r12.chipTitle(r13)
            goto L11
        L56:
            com.facebook.aura.skills.connect.LinkedAccountsTitle$None r11 = com.facebook.aura.skills.connect.LinkedAccountsTitle.None.INSTANCE
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.SkillConnectViewModel.withDerivedState(com.facebook.aura.skills.connect.SkillConnectUiState):com.facebook.aura.skills.connect.SkillConnectUiState");
    }

    public final void onAccountsChipClicked(HatchSkillOAuthOrigin hatchSkillOAuthOrigin) {
        C7384Etj.A0Y(hatchSkillOAuthOrigin, 0);
        HatchInteractionLogger.INSTANCE.logClick(hatchSkillOAuthOrigin, HatchComponent.CONNECTOR_ACCOUNTS_CHIP, AnonymousClass006.A10(HatchMetadataKey.PROVIDER.getValue(), this.skill.id));
    }

    public final void onAddAccountTapped(HatchSkillOAuthOrigin hatchSkillOAuthOrigin) {
        C7384Etj.A0Y(hatchSkillOAuthOrigin, 0);
        logConsentClick(hatchSkillOAuthOrigin, HatchComponent.ACCOUNTS_CENTER_BUTTON);
    }

    public final void onLinkUpsellShown() {
        SkillConnectUiState value;
        this.hasShownLinkUpsell = true;
        BLG<SkillConnectUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, SkillConnectUiState.copy$default(value, false, false, false, null, null, null, null, false, null, false, 895, null)));
    }

    public final void onTermsLinkTapped(HatchSkillOAuthOrigin hatchSkillOAuthOrigin) {
        C7384Etj.A0Y(hatchSkillOAuthOrigin, 0);
        logConsentClick(hatchSkillOAuthOrigin, HatchComponent.TOS_DISCLOSURE_LINK);
    }

    private final LinkedAccountsTitle.Chip chipTitle(SkillConnectUiState skillConnectUiState) {
        List<OAuthLinkedAccount> list = skillConnectUiState.linkedAccounts;
        ArrayList arrayListA0h = C3cG.A0h();
        for (OAuthLinkedAccount oAuthLinkedAccount : list) {
            C60Q.A1G(oAuthLinkedAccount.accountId, oAuthLinkedAccount, arrayListA0h, skillConnectUiState.selectedAccountIds);
        }
        List listA0a = AbstractC0878AGe.A0a(arrayListA0h, 2);
        ArrayList arrayListA0m = AnonymousClass002.A0m(listA0a);
        Iterator it = listA0a.iterator();
        while (it.hasNext()) {
            String str = ((OAuthLinkedAccount) it.next()).profilePictureUrl;
            if (str == null) {
                str = "";
            }
            arrayListA0m.add(str);
        }
        AHD ahdA07 = AGI.A07(arrayListA0m);
        LinkedAccountsChipLabel accountCount = arrayListA0h.isEmpty() ? LinkedAccountsChipLabel.ChooseAccounts.INSTANCE : (arrayListA0h.size() != 1 || C7BY.A0j(((OAuthLinkedAccount) AbstractC0878AGe.A0J(arrayListA0h)).username)) ? new LinkedAccountsChipLabel.AccountCount(arrayListA0h.size()) : new LinkedAccountsChipLabel.AccountName(((OAuthLinkedAccount) AbstractC0878AGe.A0J(arrayListA0h)).username);
        List<OAuthLinkedAccount> list2 = skillConnectUiState.linkedAccounts;
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list2);
        for (OAuthLinkedAccount oAuthLinkedAccount2 : list2) {
            String str2 = oAuthLinkedAccount2.accountId;
            String str3 = oAuthLinkedAccount2.username;
            if (C7BY.A0j(str3)) {
                str3 = null;
            }
            arrayListA0m2.add(new LinkedAccountMenuItem(str2, str3, skillConnectUiState.selectedAccountIds.contains(oAuthLinkedAccount2.accountId)));
        }
        return new LinkedAccountsTitle.Chip(ahdA07, accountCount, AGI.A07(arrayListA0m2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchConnectAction(X.HtJ<? super com.facebook.aura.skills.connect.repository.SkillConnectAction> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.skills.connect.SkillConnectViewModel.C138021
            if (r0 == 0) goto L50
            r5 = r7
            com.facebook.aura.skills.connect.SkillConnectViewModel$fetchConnectAction$1 r5 = (com.facebook.aura.skills.connect.SkillConnectViewModel.C138021) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L3a
            if (r0 != r3) goto L5b
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.common.coroutines.SingleFlightResult r1 = (com.facebook.aura.common.coroutines.SingleFlightResult) r1
            boolean r0 = r1 instanceof com.facebook.aura.common.coroutines.SingleFlightResult.Result
            if (r0 == 0) goto L2f
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1
            T r0 = r1.value
            com.facebook.aura.skills.connect.repository.SkillConnectAction r0 = (com.facebook.aura.skills.connect.repository.SkillConnectAction) r0
        L2c:
            r6.cachedConnectAction = r0
            return r0
        L2f:
            com.facebook.aura.common.coroutines.SingleFlightResult$Skipped r0 = com.facebook.aura.common.coroutines.SingleFlightResult.Skipped.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L56
            com.facebook.aura.skills.connect.repository.SkillConnectAction r0 = r6.cachedConnectAction
            goto L2c
        L3a:
            X.Hwg.A00(r1)
            com.facebook.aura.common.coroutines.SingleFlight r2 = r6.connectActionSingleFlight
            r0 = 0
            com.facebook.aura.skills.connect.SkillConnectViewModel$fetchConnectAction$result$1 r1 = new com.facebook.aura.skills.connect.SkillConnectViewModel$fetchConnectAction$result$1
            r1.<init>(r6, r0)
            r5.label = r3
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r2.invoke(r0, r1, r5)
            if (r1 != r4) goto L20
            return r4
        L50:
            com.facebook.aura.skills.connect.SkillConnectViewModel$fetchConnectAction$1 r5 = new com.facebook.aura.skills.connect.SkillConnectViewModel$fetchConnectAction$1
            r5.<init>(r7)
            goto L12
        L56:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L5b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.SkillConnectViewModel.fetchConnectAction(X.HtJ):java.lang.Object");
    }

    private final ConnectButtonState getConnectButtonState(Set<String> set, boolean z) {
        FirstPartyConnectorConfig firstPartyConnectorConfig;
        return this.isSubmitting ? ConnectButtonState.LOADING : (z || ((firstPartyConnectorConfig = this.firstPartyConfig) != null && firstPartyConnectorConfig.requiresLinkedAccountSelection && set.isEmpty())) ? ConnectButtonState.DISABLED : ConnectButtonState.ENABLED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectButtonState getConnectButtonState$default(SkillConnectViewModel skillConnectViewModel, Set set, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            set = A3q.A00;
        }
        return skillConnectViewModel.getConnectButtonState(set, AnonymousClass001.A1Q(i, z));
    }

    private final void logConsentClick(HatchSkillOAuthOrigin hatchSkillOAuthOrigin, HatchComponent hatchComponent) {
        HatchInteractionLogger.INSTANCE.logClick(hatchSkillOAuthOrigin, hatchComponent, AnonymousClass006.A10(HatchMetadataKey.PROVIDER.getValue(), this.skill.id));
    }

    private final void maybeFetchLinkedAccounts() {
        SkillConnectUiState value;
        FirstPartyConnectorConfig firstPartyConnectorConfig = this.firstPartyConfig;
        if (firstPartyConnectorConfig == null || !firstPartyConnectorConfig.showsLinkedAccountsOnConnect) {
            return;
        }
        BLG<SkillConnectUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, withDerivedState(SkillConnectUiState.copy$default(value, false, firstPartyConnectorConfig.requiresLinkedAccountSelection, true, null, null, null, null, false, null, false, 1017, null))));
        AnonymousClass001.A1J(new AnonymousClass2(firstPartyConnectorConfig, null), AEu.A00(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object connectSelectedAccounts(java.lang.String r24, X.HtJ<? super java.lang.Boolean> r25) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.SkillConnectViewModel.connectSelectedAccounts(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object directlyConnect(com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin r9, java.lang.String r10, X.HtJ<? super java.lang.Boolean> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.facebook.aura.skills.connect.SkillConnectViewModel.C138011
            if (r0 == 0) goto L6c
            r5 = r11
            com.facebook.aura.skills.connect.SkillConnectViewModel$directlyConnect$1 r5 = (com.facebook.aura.skills.connect.SkillConnectViewModel.C138011) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r7 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L37
            if (r0 != r3) goto L72
            X.Hwg.A00(r7)
        L21:
            r8.isSubmitting = r4
            X.BLG<com.facebook.aura.skills.connect.SkillConnectUiState> r2 = r8._uiState
        L25:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            com.facebook.aura.skills.connect.SkillConnectUiState r0 = (com.facebook.aura.skills.connect.SkillConnectUiState) r0
            com.facebook.aura.skills.connect.SkillConnectUiState r0 = r8.withDerivedState(r0)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto L25
            return r7
        L37:
            X.Hwg.A00(r7)
            boolean r0 = r8.isSubmitting
            if (r0 == 0) goto L43
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L43:
            r8.isSubmitting = r3
            X.BLG<com.facebook.aura.skills.connect.SkillConnectUiState> r2 = r8._uiState
        L47:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            com.facebook.aura.skills.connect.SkillConnectUiState r0 = (com.facebook.aura.skills.connect.SkillConnectUiState) r0
            com.facebook.aura.skills.connect.SkillConnectUiState r0 = r8.withDerivedState(r0)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto L47
            com.facebook.aura.skills.repo.HatchConnectorCatalogRepository r2 = r8.connectorRepository
            com.facebook.aura.skills.model.Skill r0 = r8.skill
            java.lang.String r1 = r0.id
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r3
            java.lang.Object r7 = r2.sendConsentAuthCallback(r1, r9, r10, r5)
            if (r7 != r6) goto L21
            return r6
        L6c:
            com.facebook.aura.skills.connect.SkillConnectViewModel$directlyConnect$1 r5 = new com.facebook.aura.skills.connect.SkillConnectViewModel$directlyConnect$1
            r5.<init>(r11)
            goto L12
        L72:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.SkillConnectViewModel.directlyConnect(com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final C1BN<SkillConnectUiState> getUiState() {
        return this.uiState;
    }

    public final void onAccountLinkDismissed() {
        this.connectorRepository.checkLinkedAccountAndPromote(this.skill.id);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveConnectAction(X.HtJ<? super com.facebook.aura.skills.connect.repository.SkillConnectAction> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.facebook.aura.skills.connect.SkillConnectViewModel.C138031
            if (r0 == 0) goto L1f
            r7 = r9
            com.facebook.aura.skills.connect.SkillConnectViewModel$resolveConnectAction$1 r7 = (com.facebook.aura.skills.connect.SkillConnectViewModel.C138031) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r6 = r7.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L7c
            goto L4a
        L1f:
            com.facebook.aura.skills.connect.SkillConnectViewModel$resolveConnectAction$1 r7 = new com.facebook.aura.skills.connect.SkillConnectViewModel$resolveConnectAction$1
            r7.<init>(r9)
            goto L12
        L25:
            X.Hwg.A00(r6)
            com.facebook.aura.skills.connect.repository.SkillConnectAction r6 = r8.cachedConnectAction
            if (r6 != 0) goto L81
            r8.isSubmitting = r3
            X.BLG<com.facebook.aura.skills.connect.SkillConnectUiState> r2 = r8._uiState
        L30:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            com.facebook.aura.skills.connect.SkillConnectUiState r0 = (com.facebook.aura.skills.connect.SkillConnectUiState) r0
            com.facebook.aura.skills.connect.SkillConnectUiState r0 = r8.withDerivedState(r0)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto L30
            r7.label = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r8.fetchConnectAction(r7)     // Catch: java.lang.Throwable -> L65
            if (r6 != r5) goto L4d
            return r5
        L4a:
            X.Hwg.A00(r6)     // Catch: java.lang.Throwable -> L65
        L4d:
            com.facebook.aura.skills.connect.repository.SkillConnectAction r6 = (com.facebook.aura.skills.connect.repository.SkillConnectAction) r6     // Catch: java.lang.Throwable -> L65
            r8.isSubmitting = r4
            X.BLG<com.facebook.aura.skills.connect.SkillConnectUiState> r2 = r8._uiState
        L53:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            com.facebook.aura.skills.connect.SkillConnectUiState r0 = (com.facebook.aura.skills.connect.SkillConnectUiState) r0
            com.facebook.aura.skills.connect.SkillConnectUiState r0 = r8.withDerivedState(r0)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto L53
            return r6
        L65:
            r3 = move-exception
            r8.isSubmitting = r4
            X.BLG<com.facebook.aura.skills.connect.SkillConnectUiState> r2 = r8._uiState
        L6a:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            com.facebook.aura.skills.connect.SkillConnectUiState r0 = (com.facebook.aura.skills.connect.SkillConnectUiState) r0
            com.facebook.aura.skills.connect.SkillConnectUiState r0 = r8.withDerivedState(r0)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 != 0) goto L80
            goto L6a
        L7c:
            java.lang.IllegalStateException r3 = X.AnonymousClass001.A0n()
        L80:
            throw r3
        L81:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.SkillConnectViewModel.resolveConnectAction(X.HtJ):java.lang.Object");
    }

    public final void toggleAccountSelection(String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin) {
        SkillConnectUiState value;
        SkillConnectUiState skillConnectUiState;
        Set setA0f;
        boolean zA1b = AnonymousClass004.A1b(str, hatchSkillOAuthOrigin);
        HatchInteractionLogger.INSTANCE.logClick(hatchSkillOAuthOrigin, HatchComponent.ACCOUNT_SELECTION_ROW, AnonymousClass006.A10(HatchMetadataKey.PROVIDER.getValue(), this.skill.id));
        BLG<SkillConnectUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            skillConnectUiState = value;
            setA0f = AbstractC0878AGe.A0f(skillConnectUiState.selectedAccountIds);
            if (!setA0f.add(str)) {
                setA0f.remove(str);
            }
        } while (!blg.A6e(value, withDerivedState(SkillConnectUiState.copy$default(skillConnectUiState, zA1b, zA1b, zA1b, null, null, setA0f, null, zA1b, null, zA1b, 991, null))));
    }

    public final void refreshLinkedAccounts() {
        maybeFetchLinkedAccounts();
    }

    public /* synthetic */ SkillConnectViewModel(Skill skill, AbstractC3358CGz abstractC3358CGz, String str, SkillsFirstPartyAccountsRepository skillsFirstPartyAccountsRepository, AuraSkillAuthRepository auraSkillAuthRepository, int i, C06H c06h) {
        this(skill, abstractC3358CGz, AnonymousClass006.A0t(i, str), (i & 8) != 0 ? new SkillsFirstPartyAccountsRepository(abstractC3358CGz) : skillsFirstPartyAccountsRepository, (i & 16) != 0 ? AuraSkillAuthRepository.Companion.getInstance(abstractC3358CGz) : auraSkillAuthRepository);
    }
}
