package com.facebook.aura.skills.viewmodel;

import X.A3q;
import X.A6J;
import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC08429uh;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06H;
import X.C0881AGi;
import X.C1BN;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3pd;
import X.C60Q;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.C9uG;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC08439ui;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.skills.connect.config.FirstPartyConnectorConfig;
import com.facebook.aura.skills.connect.config.SkillConnectConfigKt;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import com.facebook.aura.skills.repo.OAuthLinkedAccount;
import com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository;
import com.facebook.aura.skills.repo.SkillsFirstPartyAccountsRepository;
import com.facebook.aura.skills.viewmodel.SkillAccountsEffect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SkillLinkedAccountsViewModel extends AEs {
    public static final Companion Companion = new Companion();
    public final C3Em<SkillAccountsEffect> _effects;
    public final BLG<SkillAccountsUiState> _uiState;
    public final SkillsConnectorAccountsRepository connectorAccountsRepository;
    public final String connectorId;
    public final HatchConnectorCatalogRepository connectorRepository;
    public final C22I<SkillAccountsEffect> effects;
    public final FirstPartyConnectorConfig firstPartyConfig;
    public final SkillsFirstPartyAccountsRepository repository;
    public final C1BN<SkillAccountsUiState> uiState;

    public final class Factory implements InterfaceC08439ui {
        public final String connectorId;
        public final AbstractC3358CGz userSession;

        @Override // X.InterfaceC08439ui
        public <T extends AEs> T create(Class<T> cls) {
            String str = this.connectorId;
            AbstractC3358CGz abstractC3358CGz = this.userSession;
            return new SkillLinkedAccountsViewModel(str, abstractC3358CGz, new SkillsFirstPartyAccountsRepository(abstractC3358CGz), new SkillsConnectorAccountsRepository(abstractC3358CGz));
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.connectorId = str;
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

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel$addConnectorAccount$2", f = "SkillLinkedAccountsViewModel.kt", l = {317}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel$addConnectorAccount$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SkillLinkedAccountsViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SkillLinkedAccountsViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SkillLinkedAccountsViewModel skillLinkedAccountsViewModel = SkillLinkedAccountsViewModel.this;
                SkillsConnectorAccountsRepository skillsConnectorAccountsRepository = skillLinkedAccountsViewModel.connectorAccountsRepository;
                String str = skillLinkedAccountsViewModel.connectorId;
                this.label = 1;
                obj = skillsConnectorAccountsRepository.fetchLinkUrl(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            String str2 = (String) obj;
            while (!AbstractC07127nr.A0L(SkillLinkedAccountsViewModel.this._uiState)) {
            }
            if (str2 != null) {
                SkillLinkedAccountsViewModel skillLinkedAccountsViewModel2 = SkillLinkedAccountsViewModel.this;
                skillLinkedAccountsViewModel2._effects.AhV(new SkillAccountsEffect.OpenConnectorAccountLink(skillLinkedAccountsViewModel2.connectorId, str2));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel$reconnect$2", f = "SkillLinkedAccountsViewModel.kt", l = {HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE, 220, 223, 232}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel$reconnect$2, reason: invalid class name and case insensitive filesystem */
    public final class C138742 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ SkillLinkedAccountUiModel $account;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138742(SkillLinkedAccountUiModel skillLinkedAccountUiModel, HtJ<? super C138742> htJ) {
            super(2, htJ);
            this.$account = skillLinkedAccountUiModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SkillLinkedAccountsViewModel.this.new C138742(this.$account, htJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:59:0x00cc, code lost:
        
            if (r0 == false) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00e3, code lost:
        
            if (r0 != false) goto L65;
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0084 A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:68:0x00fb, B:69:0x00ff, B:72:0x0104, B:74:0x0108, B:75:0x0110, B:60:0x00ce, B:62:0x00d4, B:9:0x001d, B:35:0x0078, B:36:0x007c, B:38:0x0084, B:41:0x009d, B:43:0x00a1, B:45:0x00a5, B:47:0x00a9, B:63:0x00dd, B:65:0x00e5, B:58:0x00c8, B:54:0x00bd, B:21:0x004f, B:22:0x0052, B:11:0x0025, B:13:0x002f, B:14:0x0031, B:18:0x003c, B:27:0x005f, B:29:0x0067, B:30:0x0069), top: B:89:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x009d A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:68:0x00fb, B:69:0x00ff, B:72:0x0104, B:74:0x0108, B:75:0x0110, B:60:0x00ce, B:62:0x00d4, B:9:0x001d, B:35:0x0078, B:36:0x007c, B:38:0x0084, B:41:0x009d, B:43:0x00a1, B:45:0x00a5, B:47:0x00a9, B:63:0x00dd, B:65:0x00e5, B:58:0x00c8, B:54:0x00bd, B:21:0x004f, B:22:0x0052, B:11:0x0025, B:13:0x002f, B:14:0x0031, B:18:0x003c, B:27:0x005f, B:29:0x0067, B:30:0x0069), top: B:89:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00d4 A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:68:0x00fb, B:69:0x00ff, B:72:0x0104, B:74:0x0108, B:75:0x0110, B:60:0x00ce, B:62:0x00d4, B:9:0x001d, B:35:0x0078, B:36:0x007c, B:38:0x0084, B:41:0x009d, B:43:0x00a1, B:45:0x00a5, B:47:0x00a9, B:63:0x00dd, B:65:0x00e5, B:58:0x00c8, B:54:0x00bd, B:21:0x004f, B:22:0x0052, B:11:0x0025, B:13:0x002f, B:14:0x0031, B:18:0x003c, B:27:0x005f, B:29:0x0067, B:30:0x0069), top: B:89:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0108 A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:68:0x00fb, B:69:0x00ff, B:72:0x0104, B:74:0x0108, B:75:0x0110, B:60:0x00ce, B:62:0x00d4, B:9:0x001d, B:35:0x0078, B:36:0x007c, B:38:0x0084, B:41:0x009d, B:43:0x00a1, B:45:0x00a5, B:47:0x00a9, B:63:0x00dd, B:65:0x00e5, B:58:0x00c8, B:54:0x00bd, B:21:0x004f, B:22:0x0052, B:11:0x0025, B:13:0x002f, B:14:0x0031, B:18:0x003c, B:27:0x005f, B:29:0x0067, B:30:0x0069), top: B:89:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:93:? A[LOOP:1: B:24:0x0058->B:93:?, LOOP_END, SYNTHETIC] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 307
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel.C138742.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C138742) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel$refresh$2", f = "SkillLinkedAccountsViewModel.kt", l = {138}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel$refresh$2, reason: invalid class name and case insensitive filesystem */
    public final class C138752 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ FirstPartyConnectorConfig $config;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138752(FirstPartyConnectorConfig firstPartyConnectorConfig, HtJ<? super C138752> htJ) {
            super(2, htJ);
            this.$config = firstPartyConnectorConfig;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SkillLinkedAccountsViewModel.this.new C138752(this.$config, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            SkillAccountsUiState value;
            SkillAccountsUiState skillAccountsUiState;
            Object objFetchLinkedAccounts = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objFetchLinkedAccounts);
                SkillsFirstPartyAccountsRepository skillsFirstPartyAccountsRepository = SkillLinkedAccountsViewModel.this.repository;
                FirstPartyConnectorConfig firstPartyConnectorConfig = this.$config;
                this.label = 1;
                objFetchLinkedAccounts = skillsFirstPartyAccountsRepository.fetchLinkedAccounts(firstPartyConnectorConfig, this);
                if (objFetchLinkedAccounts == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objFetchLinkedAccounts);
            }
            List<OAuthLinkedAccount> list = (List) objFetchLinkedAccounts;
            if (list == null) {
                list = C0881AGi.A00;
            }
            ArrayList arrayListA0h = C3cG.A0h();
            for (OAuthLinkedAccount oAuthLinkedAccount : list) {
                if (oAuthLinkedAccount.connected) {
                    arrayListA0h.add(oAuthLinkedAccount);
                }
            }
            LinkedHashSet linkedHashSetA0k = C3cG.A0k();
            Iterator it = arrayListA0h.iterator();
            while (it.hasNext()) {
                linkedHashSetA0k.add(((OAuthLinkedAccount) it.next()).accountId);
            }
            List<SkillLinkedAccountUiModel> firstPartyLinkedAccountUiModels = SkillLinkedAccountsViewModelKt.toFirstPartyLinkedAccountUiModels(list, this.$config.canManageAccountSelection);
            BLG<SkillAccountsUiState> blg = SkillLinkedAccountsViewModel.this._uiState;
            FirstPartyConnectorConfig firstPartyConnectorConfig2 = this.$config;
            do {
                value = blg.getValue();
                skillAccountsUiState = value;
            } while (!blg.A6e(value, skillAccountsUiState.copy(false, skillAccountsUiState.isUpdating, firstPartyLinkedAccountUiModels, list, linkedHashSetA0k, linkedHashSetA0k, !list.isEmpty(), list.size() > 1, skillAccountsUiState.shouldShowAccountsSection, skillAccountsUiState.accountsCenterFootnoteDisplayName, (!firstPartyConnectorConfig2.canManageAccountSelection || list.size() <= 1) ? SkillAccountsAction.NONE : SkillAccountsAction.MANAGE_ACCOUNTS, skillAccountsUiState.accountPendingRemoval, skillAccountsUiState.isRemovingAccount)));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C138752) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel$refreshAccountsForSkillIfSupported$3", f = "SkillLinkedAccountsViewModel.kt", l = {182}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel$refreshAccountsForSkillIfSupported$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SkillLinkedAccountsViewModel.this.new AnonymousClass3(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SkillLinkedAccountsViewModel.this.new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            SkillAccountsUiState value;
            SkillAccountsUiState skillAccountsUiState;
            Object objFetchLinkedAccounts = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objFetchLinkedAccounts);
                SkillLinkedAccountsViewModel skillLinkedAccountsViewModel = SkillLinkedAccountsViewModel.this;
                SkillsConnectorAccountsRepository skillsConnectorAccountsRepository = skillLinkedAccountsViewModel.connectorAccountsRepository;
                String str = skillLinkedAccountsViewModel.connectorId;
                this.label = 1;
                objFetchLinkedAccounts = skillsConnectorAccountsRepository.fetchLinkedAccounts(str, this);
                if (objFetchLinkedAccounts == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objFetchLinkedAccounts);
            }
            List list = (List) objFetchLinkedAccounts;
            if (list == null) {
                list = C0881AGi.A00;
            }
            BLG<SkillAccountsUiState> blg = SkillLinkedAccountsViewModel.this._uiState;
            do {
                value = blg.getValue();
                skillAccountsUiState = value;
            } while (!blg.A6e(value, skillAccountsUiState.copy(false, skillAccountsUiState.isUpdating, SkillLinkedAccountsViewModelKt.toSkillLinkedAccountUiModels(list), skillAccountsUiState.allLinkedAccounts, skillAccountsUiState.selectedAccountIds, skillAccountsUiState.savedAccountIds, !list.isEmpty(), list.size() > 1, true, skillAccountsUiState.accountsCenterFootnoteDisplayName, SkillAccountsAction.ADD_ACCOUNT, skillAccountsUiState.accountPendingRemoval, skillAccountsUiState.isRemovingAccount)));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel$removePendingAccount$2", f = "SkillLinkedAccountsViewModel.kt", l = {287, 289}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel$removePendingAccount$2, reason: invalid class name and case insensitive filesystem */
    public final class C138762 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ SkillLinkedAccountUiModel $account;
        public boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138762(SkillLinkedAccountUiModel skillLinkedAccountUiModel, HtJ<? super C138762> htJ) {
            super(2, htJ);
            this.$account = skillLinkedAccountUiModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SkillLinkedAccountsViewModel.this.new C138762(this.$account, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r4 = r20
                X.Hji r6 = X.EnumC10460Hji.A02
                r7 = r19
                int r0 = r7.label
                r5 = 2
                r3 = 1
                if (r0 == 0) goto L54
                if (r0 == r3) goto L6a
                if (r0 != r5) goto Laa
                X.Hwg.A00(r4)
            L13:
                java.util.List r4 = (java.util.List) r4
                if (r4 != 0) goto L19
                X.AGi r4 = X.C0881AGi.A00
            L19:
                com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel r0 = com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel.this
                X.BLG<com.facebook.aura.skills.viewmodel.SkillAccountsUiState> r2 = r0._uiState
            L1d:
                java.lang.Object r1 = r2.getValue()
                r5 = r1
                com.facebook.aura.skills.viewmodel.SkillAccountsUiState r5 = (com.facebook.aura.skills.viewmodel.SkillAccountsUiState) r5
                java.util.List r8 = com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModelKt.toSkillLinkedAccountUiModels(r4)
                boolean r0 = r4.isEmpty()
                r12 = r0 ^ 1
                int r0 = r4.size()
                r13 = 0
                if (r0 <= r3) goto L36
                r13 = 1
            L36:
                r19 = 1851(0x73b, float:2.594E-42)
                r9 = 0
                r6 = 0
                r7 = r6
                r10 = r9
                r11 = r9
                r14 = r6
                r15 = r9
                r16 = r9
                r17 = r9
                r18 = r6
                r20 = r9
                com.facebook.aura.skills.viewmodel.SkillAccountsUiState r0 = com.facebook.aura.skills.viewmodel.SkillAccountsUiState.copy$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                boolean r0 = r2.A6e(r1, r0)
                if (r0 == 0) goto L1d
            L51:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L54:
                X.Hwg.A00(r4)
                com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel r0 = com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel.this
                com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository r2 = r0.connectorAccountsRepository
                java.lang.String r1 = r0.connectorId
                com.facebook.aura.skills.viewmodel.SkillLinkedAccountUiModel r0 = r7.$account
                java.lang.String r0 = r0.accountId
                r7.label = r3
                java.lang.Object r4 = r2.unlinkAccount(r1, r0, r7)
                if (r4 != r6) goto L6d
                return r6
            L6a:
                X.Hwg.A00(r4)
            L6d:
                boolean r2 = X.AnonymousClass001.A1X(r4)
                com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel r0 = com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel.this
                if (r2 == 0) goto L84
                com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository r1 = r0.connectorAccountsRepository
                java.lang.String r0 = r0.connectorId
                r7.Z$0 = r2
                r7.label = r5
                java.lang.Object r4 = r1.fetchLinkedAccounts(r0, r7)
                if (r4 != r6) goto L13
                return r6
            L84:
                X.BLG<com.facebook.aura.skills.viewmodel.SkillAccountsUiState> r2 = r0._uiState
            L86:
                java.lang.Object r1 = r2.getValue()
                r3 = r1
                com.facebook.aura.skills.viewmodel.SkillAccountsUiState r3 = (com.facebook.aura.skills.viewmodel.SkillAccountsUiState) r3
                r17 = 4095(0xfff, float:5.738E-42)
                r6 = 0
                r4 = 0
                r5 = r4
                r7 = r6
                r8 = r6
                r9 = r6
                r10 = r4
                r11 = r4
                r12 = r4
                r13 = r6
                r14 = r6
                r15 = r6
                r16 = r4
                r18 = r6
                com.facebook.aura.skills.viewmodel.SkillAccountsUiState r0 = com.facebook.aura.skills.viewmodel.SkillAccountsUiState.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                boolean r0 = r2.A6e(r1, r0)
                if (r0 == 0) goto L86
                goto L51
            Laa:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel.C138762.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C138762) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel$updateAccountSelection$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel$updateAccountSelection$3", f = "SkillLinkedAccountsViewModel.kt", l = {359}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel$updateAccountSelection$3, reason: invalid class name and case insensitive filesystem */
    public final class C138773 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ FirstPartyConnectorConfig $config;
        public final /* synthetic */ Function0<Unit> $onSuccess;
        public final /* synthetic */ Set<String> $selectedAccountIds;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138773(FirstPartyConnectorConfig firstPartyConnectorConfig, Set<String> set, Function0<Unit> function0, HtJ<? super C138773> htJ) {
            super(2, htJ);
            this.$config = firstPartyConnectorConfig;
            this.$selectedAccountIds = set;
            this.$onSuccess = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SkillLinkedAccountsViewModel.this.new C138773(this.$config, this.$selectedAccountIds, this.$onSuccess, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            SkillAccountsUiState value;
            SkillAccountsUiState skillAccountsUiStateCopy$default;
            Object objUpdateLinkedAccounts = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objUpdateLinkedAccounts);
                SkillsFirstPartyAccountsRepository skillsFirstPartyAccountsRepository = SkillLinkedAccountsViewModel.this.repository;
                String str = this.$config.id;
                Set<String> set = this.$selectedAccountIds;
                this.label = 1;
                objUpdateLinkedAccounts = skillsFirstPartyAccountsRepository.updateLinkedAccounts(str, set, null, this);
                if (objUpdateLinkedAccounts == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objUpdateLinkedAccounts);
            }
            boolean zA1X = AnonymousClass001.A1X(objUpdateLinkedAccounts);
            BLG<SkillAccountsUiState> blg = SkillLinkedAccountsViewModel.this._uiState;
            FirstPartyConnectorConfig firstPartyConnectorConfig = this.$config;
            Set<String> set2 = this.$selectedAccountIds;
            do {
                value = blg.getValue();
                SkillAccountsUiState skillAccountsUiState = value;
                if (zA1X) {
                    List<OAuthLinkedAccount> list = skillAccountsUiState.allLinkedAccounts;
                    ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                    for (OAuthLinkedAccount oAuthLinkedAccount : list) {
                        boolean zContains = set2.contains(oAuthLinkedAccount.accountId);
                        String str2 = oAuthLinkedAccount.accountId;
                        String str3 = oAuthLinkedAccount.username;
                        String str4 = oAuthLinkedAccount.profilePictureUrl;
                        AnonymousClass003.A0u(str2, str3);
                        arrayListA0i.add(new OAuthLinkedAccount(str2, str3, str4, zContains));
                    }
                    skillAccountsUiStateCopy$default = SkillAccountsUiState.copy$default(skillAccountsUiState, false, false, SkillLinkedAccountsViewModelKt.toFirstPartyLinkedAccountUiModels(arrayListA0i, firstPartyConnectorConfig.canManageAccountSelection), arrayListA0i, null, set2, false, false, false, null, null, null, false, 8145, null);
                } else {
                    zA1X = false;
                    skillAccountsUiStateCopy$default = SkillAccountsUiState.copy$default(skillAccountsUiState, false, false, null, null, null, null, false, false, false, null, null, null, false, 8189, null);
                }
            } while (!blg.A6e(value, skillAccountsUiStateCopy$default));
            if (zA1X) {
                this.$onSuccess.invoke();
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C138773) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void showRemoveAccountDialog(SkillLinkedAccountUiModel skillLinkedAccountUiModel) {
        SkillAccountsUiState value;
        C7384Etj.A0Y(skillLinkedAccountUiModel, 0);
        logConnectorClick(HatchComponent.DISCONNECT_BUTTON);
        if (this.firstPartyConfig != null || C60Q.A0Q(this).isRemovingAccount || C60Q.A0Q(this).isUpdating) {
            return;
        }
        BLG<SkillAccountsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, SkillAccountsUiState.copy$default(value, false, false, null, null, null, null, false, false, false, null, null, skillLinkedAccountUiModel, false, 6143, null)));
    }

    public final void toggleAccountSelection(String str) {
        SkillAccountsUiState value;
        SkillAccountsUiState skillAccountsUiState;
        Set setA0f;
        C7384Etj.A0Y(str, 0);
        logConnectorClick(HatchComponent.ACCOUNT_SELECTION_ROW);
        BLG<SkillAccountsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            skillAccountsUiState = value;
            setA0f = AbstractC0878AGe.A0f(skillAccountsUiState.selectedAccountIds);
            if (!setA0f.add(str)) {
                setA0f.remove(str);
            }
        } while (!blg.A6e(value, SkillAccountsUiState.copy$default(skillAccountsUiState, false, false, null, null, setA0f, null, false, false, false, null, null, null, false, 8175, null)));
    }

    public final void updateAccountSelection(Function0<Unit> function0) {
        SkillAccountsUiState value;
        C7384Etj.A0Y(function0, 0);
        logConnectorClick(HatchComponent.SAVE_BUTTON);
        FirstPartyConnectorConfig firstPartyConnectorConfig = this.firstPartyConfig;
        if (firstPartyConnectorConfig != null) {
            Set<String> set = C60Q.A0Q(this).selectedAccountIds;
            if (set.isEmpty()) {
                return;
            }
            BLG<SkillAccountsUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, SkillAccountsUiState.copy$default(value, false, true, null, null, null, null, false, false, false, null, null, null, false, 8189, null)));
            AnonymousClass001.A1J(new C138773(firstPartyConnectorConfig, set, function0, null), AEu.A00(this));
        }
    }

    public /* synthetic */ SkillLinkedAccountsViewModel(String str, AbstractC3358CGz abstractC3358CGz, SkillsFirstPartyAccountsRepository skillsFirstPartyAccountsRepository, SkillsConnectorAccountsRepository skillsConnectorAccountsRepository, int i, C06H c06h) {
        this(str, abstractC3358CGz, (i & 4) != 0 ? new SkillsFirstPartyAccountsRepository(abstractC3358CGz) : skillsFirstPartyAccountsRepository, (i & 8) != 0 ? new SkillsConnectorAccountsRepository(abstractC3358CGz) : skillsConnectorAccountsRepository);
    }

    private final void dismissRemoveAccountDialog() {
        SkillAccountsUiState value;
        if (C60Q.A0Q(this).isRemovingAccount) {
            return;
        }
        BLG<SkillAccountsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, SkillAccountsUiState.copy$default(value, false, false, null, null, null, null, false, false, false, null, null, null, false, 6143, null)));
    }

    private final void logConnectorClick(HatchComponent hatchComponent) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.CONNECTORS, HatchScreen.CONNECTORS, hatchComponent, null, providerMetadata(), null);
    }

    private final Map<String, String> providerMetadata() {
        return AnonymousClass006.A10(HatchMetadataKey.PROVIDER.getValue(), this.connectorId);
    }

    public static /* synthetic */ void reconnect$default(SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, SkillLinkedAccountUiModel skillLinkedAccountUiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            skillLinkedAccountUiModel = null;
        }
        skillLinkedAccountsViewModel.reconnect(skillLinkedAccountUiModel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAccountSelection$default(SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = AnonymousClass1.INSTANCE;
        }
        skillLinkedAccountsViewModel.updateAccountSelection(function0);
    }

    public final void addConnectorAccount() {
        SkillAccountsUiState value;
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.CONNECTORS, HatchScreen.CONNECTORS, HatchComponent.ADD_CONNECTOR_ACCOUNT_BUTTON, null, null, null);
        if (this.firstPartyConfig != null || C60Q.A0Q(this).isUpdating || C60Q.A0Q(this).isRemovingAccount) {
            return;
        }
        BLG<SkillAccountsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, SkillAccountsUiState.copy$default(value, false, true, null, null, null, null, false, false, false, null, null, null, false, 8189, null)));
        AnonymousClass001.A1J(new AnonymousClass2(null), AEu.A00(this));
    }

    public final C22I<SkillAccountsEffect> getEffects() {
        return this.effects;
    }

    public final C1BN<SkillAccountsUiState> getUiState() {
        return this.uiState;
    }

    public final void onAccountMenuOpened() {
        logConnectorClick(HatchComponent.THREE_DOTS_MENU);
    }

    public final void onAccountsCenterTapped() {
        logConnectorClick(HatchComponent.ACCOUNTS_CENTER_BUTTON);
    }

    public final void onManageAccountsCancelTapped() {
        logConnectorClick(HatchComponent.CANCEL_BUTTON);
    }

    public final void onManageAccountsTapped() {
        logConnectorClick(HatchComponent.MANAGE_ACCOUNTS_BUTTON);
    }

    public final void onRemoveAccountCancelTapped() {
        logConnectorClick(HatchComponent.DELETE_CANCEL_BUTTON);
        dismissRemoveAccountDialog();
    }

    public final void onRemoveAccountDialogDismissed() {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.SETTINGS, HatchSubsurface.CONNECTORS, HatchScreen.CONNECTORS, HatchComponent.DELETE_CANCEL_BUTTON, null, providerMetadata());
        dismissRemoveAccountDialog();
    }

    public final void reconnect(SkillLinkedAccountUiModel skillLinkedAccountUiModel) {
        SkillAccountsUiState value;
        logConnectorClick(HatchComponent.RECONNECT_CONNECTOR_BUTTON);
        if (C60Q.A0Q(this).isUpdating || C60Q.A0Q(this).isRemovingAccount) {
            return;
        }
        BLG<SkillAccountsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, SkillAccountsUiState.copy$default(value, false, true, null, null, null, null, false, false, false, null, null, null, false, 8189, null)));
        AnonymousClass001.A1J(new C138742(skillLinkedAccountUiModel, null), AEu.A00(this));
    }

    public final void refresh() {
        SkillAccountsUiState value;
        SkillAccountsUiState skillAccountsUiState;
        String str;
        FirstPartyConnectorConfig firstPartyConnectorConfig = this.firstPartyConfig;
        if (firstPartyConnectorConfig == null || !firstPartyConnectorConfig.getShowsLinkedAccounts()) {
            return;
        }
        BLG<SkillAccountsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            skillAccountsUiState = value;
            String str2 = firstPartyConnectorConfig.displayName;
            str = null;
            if (firstPartyConnectorConfig.isAccountsCenterManaged) {
                str = str2;
            }
        } while (!blg.A6e(value, SkillAccountsUiState.copy$default(skillAccountsUiState, true, false, null, null, null, null, false, false, true, str, SkillAccountsAction.NONE, null, false, 6398, null)));
        AnonymousClass001.A1J(new C138752(firstPartyConnectorConfig, null), AEu.A00(this));
    }

    public final void refreshAccountsForSkillIfSupported(Skill skill) {
        SkillAccountsUiState value;
        boolean z;
        C0881AGi c0881AGi;
        A3q a3q;
        SkillAccountsUiState value2;
        if (this.firstPartyConfig == null) {
            if (skill != null && skill.supportsMultipleAccounts) {
                BLG<SkillAccountsUiState> blg = this._uiState;
                do {
                    value2 = blg.getValue();
                } while (!blg.A6e(value2, SkillAccountsUiState.copy$default(value2, true, false, null, null, null, null, false, false, true, null, SkillAccountsAction.ADD_ACCOUNT, null, false, 6398, null)));
                AnonymousClass001.A1J(new AnonymousClass3(null), AEu.A00(this));
                return;
            }
            BLG<SkillAccountsUiState> blg2 = this._uiState;
            do {
                value = blg2.getValue();
                z = value.isUpdating;
                c0881AGi = C0881AGi.A00;
                a3q = A3q.A00;
            } while (!blg2.A6e(value, new SkillAccountsUiState(false, z, c0881AGi, c0881AGi, a3q, a3q, false, false, false, null, SkillAccountsAction.NONE, null, false)));
        }
    }

    public final void removePendingAccount() {
        SkillAccountsUiState value;
        logConnectorClick(HatchComponent.DELETE_CONFIRM_BUTTON);
        SkillLinkedAccountUiModel skillLinkedAccountUiModel = C60Q.A0Q(this).accountPendingRemoval;
        if (skillLinkedAccountUiModel == null || this.firstPartyConfig != null || C60Q.A0Q(this).isRemovingAccount || C60Q.A0Q(this).isUpdating) {
            return;
        }
        BLG<SkillAccountsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, SkillAccountsUiState.copy$default(value, false, false, null, null, null, null, false, false, false, null, null, null, true, 4095, null)));
        AnonymousClass001.A1J(new C138762(skillLinkedAccountUiModel, null), AEu.A00(this));
    }

    public final void resetAccountSelection() {
        SkillAccountsUiState value;
        SkillAccountsUiState skillAccountsUiStateCopy$default;
        BLG<SkillAccountsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            skillAccountsUiStateCopy$default = value;
            if (!skillAccountsUiStateCopy$default.isUpdating) {
                skillAccountsUiStateCopy$default = SkillAccountsUiState.copy$default(skillAccountsUiStateCopy$default, false, false, null, null, skillAccountsUiStateCopy$default.savedAccountIds, null, false, false, false, null, null, null, false, 8175, null);
            }
        } while (!blg.A6e(value, skillAccountsUiStateCopy$default));
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final String key(String str) {
            C7384Etj.A0Y(str, 0);
            return FGI.A0M("SkillLinkedAccountsViewModel:", str);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SkillLinkedAccountsViewModel(String str, AbstractC3358CGz abstractC3358CGz, SkillsFirstPartyAccountsRepository skillsFirstPartyAccountsRepository, SkillsConnectorAccountsRepository skillsConnectorAccountsRepository) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(abstractC3358CGz, skillsFirstPartyAccountsRepository, skillsConnectorAccountsRepository, 1);
        this.connectorId = str;
        this.repository = skillsFirstPartyAccountsRepository;
        this.connectorAccountsRepository = skillsConnectorAccountsRepository;
        this.firstPartyConfig = SkillConnectConfigKt.firstPartyConnectorConfigForSkill(str);
        this.connectorRepository = HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz);
        C0881AGi c0881AGi = C0881AGi.A00;
        A3q a3q = A3q.A00;
        C9286GCn c9286GCnA14 = C3cG.A14(new SkillAccountsUiState(false, false, c0881AGi, c0881AGi, a3q, a3q, false, false, false, null, SkillAccountsAction.NONE, null, false));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        C9290GCr c9290GCrA12 = C3cG.A12(C79.A00, 0, 1);
        this._effects = c9290GCrA12;
        this.effects = C3pd.A00(c9290GCrA12);
        refresh();
    }
}
