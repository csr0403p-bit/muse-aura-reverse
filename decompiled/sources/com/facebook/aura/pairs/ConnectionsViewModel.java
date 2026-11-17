package com.facebook.aura.pairs;

import X.A3Y;
import X.A3Z;
import X.A3q;
import X.AEs;
import X.AEu;
import X.AGH;
import X.AGI;
import X.AHD;
import X.AHG;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass441;
import X.AnonymousClass602;
import X.AnonymousClass603;
import X.BGK;
import X.BHL;
import X.BLG;
import X.BLL;
import X.C0881AGi;
import X.C0893AGu;
import X.C0943AIw;
import X.C10649I0t;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C22I;
import X.C3Ek;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3pd;
import X.C3rb;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.C7Bq;
import X.C9286GCn;
import X.C9290GCr;
import X.C9hr;
import X.EnumC10460Hji;
import X.F0C;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import com.facebook.aura.R;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ConnectionsSheetKey;
import com.facebook.aura.navigation.key.ConnectionsSheetSubject;
import com.facebook.aura.navigation.key.PairsHistoryScreenKey;
import com.facebook.aura.navigation.key.PairsStatusSheetKey;
import com.facebook.aura.pairs.ConnectionsEffect;
import com.facebook.aura.pairs.ConnectionsTabSnapshot;
import com.facebook.aura.pairs.ConnectionsUiState;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.sharesheet.HatchShareDestination;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ConnectionsViewModel extends AEs {
    public static final int $stable = 8;
    public final C3Em<ConnectionsEffect> _effects;
    public final BLG<HatchShareDestination> _inviteLinkDestination;
    public final BLG<Boolean> _isRefreshing;
    public final BLG<ConnectionsUiState> _uiState;
    public final BLG<String> addQuery;
    public final C1BN<AHD<PairsSuggestion>> addSuggestions;
    public final C1BN<String> addSuggestionsQuery;
    public final BLG<AHG<String>> busyIds;
    public final BLG<Set<String>> dismissedIds;
    public final C22I<ConnectionsEffect> effects;
    public volatile boolean hasInviteInbox;
    public final C1BN<HatchShareDestination> inviteLinkDestination;
    public volatile String inviteLinkRequestId;
    public final C1BN<Boolean> isRefreshing;
    public final PairsInviteMailbox mailbox;
    public final ConcurrentHashMap<String, PairsMintedInvite> mintedInvites;
    public final C1BN<ConnectionsOlderActivityState> olderActivity;
    public final ConcurrentHashMap<AuraNavKey, String> presentationKeys;
    public final PairsRepository repository;
    public HoC searchJob;
    public final BLG<SearchResults> searchResults;
    public final BLG<AHG<String>> sentIds;
    public volatile Map<String, PairsInvite> sentInvites;
    public final ConnectionsTabStore store;
    public final C1BN<ConnectionsUiState> uiState;

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel$1", f = "ConnectionsViewModel.kt", l = {156}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionsViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConnectionsViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final ConnectionsViewModel connectionsViewModel = ConnectionsViewModel.this;
                C10649I0t c10649I0t = new C10649I0t(connectionsViewModel.store.snapshot, 2);
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.pairs.ConnectionsViewModel.1.1
                    public final Object emit(ConnectionsTabSnapshot connectionsTabSnapshot, HtJ<? super Unit> htJ) {
                        ConnectionsViewModel connectionsViewModel2 = connectionsViewModel;
                        connectionsViewModel2._uiState.Af8(connectionsViewModel2.uiStateFor(connectionsTabSnapshot));
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((ConnectionsTabSnapshot) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c10649I0t.collect(c20z, this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel$2", f = "ConnectionsViewModel.kt", l = {159, 160}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionsViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConnectionsViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConnectionsTabStore connectionsTabStore = ConnectionsViewModel.this.store;
                this.label = 1;
                if (connectionsTabStore.loadIfNeeded(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            final ConnectionsViewModel connectionsViewModel = ConnectionsViewModel.this;
            AnonymousClass602 anonymousClass602A00 = AnonymousClass602.A00(connectionsViewModel.repository.changes);
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.pairs.ConnectionsViewModel.2.1
                public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                    return C3cG.A0U(connectionsViewModel.store.refresh(true, htJ));
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 2;
            if (anonymousClass602A00.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }
    }

    public final class Factory extends AuraViewModelFactory<ConnectionsViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConnectionsViewModel create() {
            return new ConnectionsViewModel(PairsRepository.Companion.getInstance(this.userSession), PairsInviteMailbox.Companion.getInstance(this.userSession), ConnectionsTabStore.Companion.getInstance(this.userSession));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel$accept$1", f = "ConnectionsViewModel.kt", l = {390, 393, 396, 399, 401}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$accept$1, reason: invalid class name and case insensitive filesystem */
    public final class C128741 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ PairsInboxRequest $request;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128741(PairsInboxRequest pairsInboxRequest, HtJ<? super C128741> htJ) {
            super(1, htJ);
            this.$request = pairsInboxRequest;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ConnectionsViewModel.this.new C128741(this.$request, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 213
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsViewModel.C128741.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C128741) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel$cancelRequest$1", f = "ConnectionsViewModel.kt", l = {325, 332}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$cancelRequest$1, reason: invalid class name and case insensitive filesystem */
    public final class C128751 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $inviteId;
        public final /* synthetic */ PairsSuggestion $person;
        public int I$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128751(String str, PairsSuggestion pairsSuggestion, HtJ<? super C128751> htJ) {
            super(1, htJ);
            this.$inviteId = str;
            this.$person = pairsSuggestion;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ConnectionsViewModel.this.new C128751(this.$inviteId, this.$person, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            int iCancelMessage;
            AHG<String> value;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (PairsException e) {
                iCancelMessage = ConnectionsViewModelKt.cancelMessage(e.error);
            }
            if (i == 0) {
                Hwg.A00(obj);
                PairsRepository pairsRepository = ConnectionsViewModel.this.repository;
                String str = this.$inviteId;
                this.label = 1;
                if (pairsRepository.cancelInvite(str, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            ConnectionsViewModel.this.mintedInvites.remove(this.$person.id);
            BLG<AHG<String>> blg = ConnectionsViewModel.this.sentIds;
            PairsSuggestion pairsSuggestion = this.$person;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, value.Aaa(pairsSuggestion.id)));
            iCancelMessage = R.string._name_removed__res_0x7f120d88;
            C3Em<ConnectionsEffect> c3Em = ConnectionsViewModel.this._effects;
            ConnectionsEffect.Message message = new ConnectionsEffect.Message(iCancelMessage);
            this.I$0 = iCancelMessage;
            this.label = 2;
            if (c3Em.emit(message, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C128751) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel$confirm$1", f = "ConnectionsViewModel.kt", l = {410, 411, HatchTransportHttpDataSourceKt.HTTP_RANGE_NOT_SATISFIABLE, 419, 420, 422}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$confirm$1, reason: invalid class name and case insensitive filesystem */
    public final class C128761 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $generationId;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128761(String str, HtJ<? super C128761> htJ) {
            super(1, htJ);
            this.$generationId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ConnectionsViewModel.this.new C128761(this.$generationId, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r5.label
                r2 = 1
                r4 = 0
                switch(r0) {
                    case 0: goto Le;
                    case 1: goto L20;
                    case 2: goto L3d;
                    case 3: goto Laa;
                    case 4: goto L9f;
                    case 5: goto Laa;
                    case 6: goto Laa;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            Le:
                X.Hwg.A00(r6)
                com.facebook.aura.pairs.ConnectionsViewModel r0 = com.facebook.aura.pairs.ConnectionsViewModel.this
                com.facebook.aura.pairs.PairsRepository r1 = r0.repository
                java.lang.String r0 = r5.$generationId
                r5.label = r2
                java.lang.Object r6 = r1.readSafetyCodeWhenReady(r0, r4, r5)
                if (r6 != r3) goto L23
                return r3
            L20:
                X.Hwg.A00(r6)
            L23:
                com.facebook.aura.pairs.PairsCodeOutcome r6 = (com.facebook.aura.pairs.PairsCodeOutcome) r6
                boolean r0 = r6 instanceof com.facebook.aura.pairs.PairsCodeOutcome.Ready
                if (r0 == 0) goto L40
                com.facebook.aura.pairs.ConnectionsViewModel r0 = com.facebook.aura.pairs.ConnectionsViewModel.this
                com.facebook.aura.pairs.PairsRepository r2 = r0.repository
                com.facebook.aura.pairs.PairsCodeOutcome$Ready r6 = (com.facebook.aura.pairs.PairsCodeOutcome.Ready) r6
                com.facebook.aura.pairs.PairsPairingCode r1 = r6.code
                r5.L$0 = r4
                r0 = 2
                r5.label = r0
                java.lang.Object r6 = r2.confirmSafetyCode(r1, r5)
                if (r6 != r3) goto L40
                return r3
            L3d:
                X.Hwg.A00(r6)
            L40:
                com.facebook.aura.pairs.PairsCodeOutcome$Confirmed r0 = com.facebook.aura.pairs.PairsCodeOutcome.Confirmed.INSTANCE
                boolean r0 = X.C7384Etj.areEqual(r6, r0)
                if (r0 != 0) goto Lad
                com.facebook.aura.pairs.PairsCodeOutcome$AlreadyConfirmed r0 = com.facebook.aura.pairs.PairsCodeOutcome.AlreadyConfirmed.INSTANCE
                boolean r0 = X.C7384Etj.areEqual(r6, r0)
                if (r0 == 0) goto L61
                com.facebook.aura.pairs.ConnectionsViewModel r0 = com.facebook.aura.pairs.ConnectionsViewModel.this
                com.facebook.aura.pairs.ConnectionsTabStore r1 = r0.store
                r5.L$0 = r4
                r0 = 3
            L57:
                r5.label = r0
                r0 = 0
                java.lang.Object r0 = r1.refresh(r0, r5)
            L5e:
                if (r0 != r3) goto Lad
                return r3
            L61:
                com.facebook.aura.pairs.PairsCodeOutcome$Gone r0 = com.facebook.aura.pairs.PairsCodeOutcome.Gone.INSTANCE
                boolean r0 = X.C7384Etj.areEqual(r6, r0)
                if (r0 != 0) goto L87
                com.facebook.aura.pairs.PairsCodeOutcome$Expired r0 = com.facebook.aura.pairs.PairsCodeOutcome.Expired.INSTANCE
                boolean r0 = X.C7384Etj.areEqual(r6, r0)
                if (r0 != 0) goto L87
                com.facebook.aura.pairs.ConnectionsViewModel r0 = com.facebook.aura.pairs.ConnectionsViewModel.this
                X.3Em<com.facebook.aura.pairs.ConnectionsEffect> r2 = r0._effects
                r0 = 2131888100(0x7f1207e4, float:1.9410826E38)
                com.facebook.aura.pairs.ConnectionsEffect$Message r1 = new com.facebook.aura.pairs.ConnectionsEffect$Message
                r1.<init>(r0)
                r5.L$0 = r4
                r0 = 6
                r5.label = r0
                java.lang.Object r0 = r2.emit(r1, r5)
                goto L5e
            L87:
                com.facebook.aura.pairs.ConnectionsViewModel r0 = com.facebook.aura.pairs.ConnectionsViewModel.this
                X.3Em<com.facebook.aura.pairs.ConnectionsEffect> r2 = r0._effects
                r0 = 2131888100(0x7f1207e4, float:1.9410826E38)
                com.facebook.aura.pairs.ConnectionsEffect$Message r1 = new com.facebook.aura.pairs.ConnectionsEffect$Message
                r1.<init>(r0)
                r5.L$0 = r4
                r0 = 4
                r5.label = r0
                java.lang.Object r0 = r2.emit(r1, r5)
                if (r0 != r3) goto La2
                return r3
            L9f:
                X.Hwg.A00(r6)
            La2:
                com.facebook.aura.pairs.ConnectionsViewModel r0 = com.facebook.aura.pairs.ConnectionsViewModel.this
                com.facebook.aura.pairs.ConnectionsTabStore r1 = r0.store
                r5.L$0 = r4
                r0 = 5
                goto L57
            Laa:
                X.Hwg.A00(r6)
            Lad:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsViewModel.C128761.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C128761) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel$connect$1", f = "ConnectionsViewModel.kt", l = {273, 275, 282, 285}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$connect$1, reason: invalid class name and case insensitive filesystem */
    public final class C128771 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ PairsSuggestion $person;
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128771(PairsSuggestion pairsSuggestion, HtJ<? super C128771> htJ) {
            super(1, htJ);
            this.$person = pairsSuggestion;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ConnectionsViewModel.this.new C128771(this.$person, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r9.label
                r6 = 4
                r7 = 3
                r4 = 2
                r5 = 1
                if (r0 == 0) goto L17
                if (r0 == r5) goto L35
                if (r0 == r4) goto Lc5
                if (r0 == r7) goto L5c
                if (r0 == r6) goto Lc5
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L17:
                X.Hwg.A00(r10)
                com.facebook.aura.pairs.ConnectionsViewModel r0 = com.facebook.aura.pairs.ConnectionsViewModel.this     // Catch: com.facebook.aura.pairs.PairsException -> Lad
                com.facebook.aura.pairs.PairsRepository r8 = r0.repository     // Catch: com.facebook.aura.pairs.PairsException -> Lad
                com.facebook.aura.pairs.PairsLevel r2 = com.facebook.aura.pairs.PairsLevel.ASK_FIRST     // Catch: com.facebook.aura.pairs.PairsException -> Lad
                com.facebook.aura.pairs.PairsSuggestion r0 = r9.$person     // Catch: com.facebook.aura.pairs.PairsException -> Lad
                java.lang.String r1 = r0.name     // Catch: com.facebook.aura.pairs.PairsException -> Lad
                java.lang.String r0 = X.AnonymousClass002.A0k()     // Catch: com.facebook.aura.pairs.PairsException -> Lad
                java.lang.String r0 = X.AnonymousClass001.A0u(r0)     // Catch: com.facebook.aura.pairs.PairsException -> Lad
                r9.label = r5     // Catch: com.facebook.aura.pairs.PairsException -> Lad
                java.lang.Object r10 = r8.createInvite(r2, r1, r0, r9)     // Catch: com.facebook.aura.pairs.PairsException -> Lad
                if (r10 != r3) goto L38
                return r3
            L35:
                X.Hwg.A00(r10)     // Catch: com.facebook.aura.pairs.PairsException -> Lad
            L38:
                com.facebook.aura.pairs.PairsMintedInvite r10 = (com.facebook.aura.pairs.PairsMintedInvite) r10     // Catch: com.facebook.aura.pairs.PairsException -> Lad
                com.facebook.aura.pairs.PairsSuggestion r0 = r9.$person
                com.facebook.aura.navigation.key.PairsMuseRecipient r4 = r0.museRecipient
                if (r4 == 0) goto L6a
                com.facebook.aura.pairs.ConnectionsViewModel r0 = com.facebook.aura.pairs.ConnectionsViewModel.this
                boolean r0 = r0.hasInviteInbox
                if (r0 == 0) goto L6a
                com.facebook.aura.pairs.ConnectionsViewModel r0 = com.facebook.aura.pairs.ConnectionsViewModel.this
                com.facebook.aura.pairs.PairsInviteMailbox r2 = r0.mailbox
                com.facebook.aura.pairs.PairsLevel r1 = com.facebook.aura.pairs.PairsLevel.ASK_FIRST
                r9.L$0 = r10
                r0 = 0
                r9.L$1 = r0
                r9.label = r7
                java.lang.Object r0 = r2.send(r4, r10, r1, r9)
                if (r0 == r3) goto Lca
                r8 = r10
                r10 = r0
                goto L63
            L5c:
                java.lang.Object r8 = r9.L$0
                com.facebook.aura.pairs.PairsMintedInvite r8 = (com.facebook.aura.pairs.PairsMintedInvite) r8
                X.Hwg.A00(r10)
            L63:
                boolean r0 = X.AnonymousClass001.A1X(r10)
                if (r0 != 0) goto L6c
                r10 = r8
            L6a:
                r5 = 0
                r8 = r10
            L6c:
                com.facebook.aura.pairs.ConnectionsViewModel r0 = com.facebook.aura.pairs.ConnectionsViewModel.this
                java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.pairs.PairsMintedInvite> r1 = r0.mintedInvites
                com.facebook.aura.pairs.PairsSuggestion r0 = r9.$person
                java.lang.String r0 = r0.id
                r1.put(r0, r8)
                com.facebook.aura.pairs.ConnectionsViewModel r0 = com.facebook.aura.pairs.ConnectionsViewModel.this
                X.BLG<X.AHG<java.lang.String>> r7 = r0.sentIds
                com.facebook.aura.pairs.PairsSuggestion r4 = r9.$person
            L7d:
                java.lang.Object r2 = r7.getValue()
                r1 = r2
                X.AHG r1 = (X.AHG) r1
                java.lang.String r0 = r4.id
                X.AIw r0 = r1.A35(r0)
                boolean r0 = r7.A6e(r2, r0)
                if (r0 == 0) goto L7d
                if (r5 != 0) goto Lc8
                com.facebook.aura.pairs.ConnectionsViewModel r0 = com.facebook.aura.pairs.ConnectionsViewModel.this
                X.3Em<com.facebook.aura.pairs.ConnectionsEffect> r2 = r0._effects
                java.lang.String r0 = r8.url
                com.facebook.aura.pairs.ConnectionsEffect$ShareLink r1 = new com.facebook.aura.pairs.ConnectionsEffect$ShareLink
                r1.<init>(r0)
                r0 = 0
                r9.L$0 = r0
                r9.L$1 = r0
                r9.I$0 = r5
                r9.label = r6
                java.lang.Object r0 = r2.emit(r1, r9)
                if (r0 != r3) goto Lc8
                return r3
            Lad:
                com.facebook.aura.pairs.ConnectionsViewModel r0 = com.facebook.aura.pairs.ConnectionsViewModel.this
                X.3Em<com.facebook.aura.pairs.ConnectionsEffect> r2 = r0._effects
                r0 = 2131888154(0x7f12081a, float:1.9410935E38)
                com.facebook.aura.pairs.ConnectionsEffect$Message r1 = new com.facebook.aura.pairs.ConnectionsEffect$Message
                r1.<init>(r0)
                r0 = 0
                r9.L$0 = r0
                r9.label = r4
                java.lang.Object r0 = r2.emit(r1, r9)
                if (r0 != r3) goto Lc8
                return r3
            Lc5:
                X.Hwg.A00(r10)
            Lc8:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
            Lca:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsViewModel.C128771.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C128771) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel$dismiss$1", f = "ConnectionsViewModel.kt", l = {379, 382}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$dismiss$1, reason: invalid class name and case insensitive filesystem */
    public final class C128781 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ ConnectionsActivity $activity;
        public final /* synthetic */ String $activityId;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128781(String str, ConnectionsActivity connectionsActivity, HtJ<? super C128781> htJ) {
            super(1, htJ);
            this.$activityId = str;
            this.$activity = connectionsActivity;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ConnectionsViewModel.this.new C128781(this.$activityId, this.$activity, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Set<String> value;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (PairsException unused) {
                C3Em<ConnectionsEffect> c3Em = ConnectionsViewModel.this._effects;
                ConnectionsEffect.Message message = new ConnectionsEffect.Message(R.string._name_removed__res_0x7f1207ea);
                this.L$0 = null;
                this.label = 2;
                if (c3Em.emit(message, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            if (i == 0) {
                Hwg.A00(obj);
                PairsRepository pairsRepository = ConnectionsViewModel.this.repository;
                String str = this.$activityId;
                this.label = 1;
                if (pairsRepository.dismissActivity(str, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            BLG<Set<String>> blg = ConnectionsViewModel.this.dismissedIds;
            ConnectionsActivity connectionsActivity = this.$activity;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, BGK.A02(connectionsActivity.id, value)));
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C128781) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel$ignore$1", f = "ConnectionsViewModel.kt", l = {430, 433}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$ignore$1, reason: invalid class name and case insensitive filesystem */
    public final class C128791 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ PairsInboxRequest $request;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128791(PairsInboxRequest pairsInboxRequest, HtJ<? super C128791> htJ) {
            super(1, htJ);
            this.$request = pairsInboxRequest;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ConnectionsViewModel.this.new C128791(this.$request, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (PairsException unused) {
                C3Em<ConnectionsEffect> c3Em = ConnectionsViewModel.this._effects;
                ConnectionsEffect.Message message = new ConnectionsEffect.Message(R.string._name_removed__res_0x7f120d5b);
                this.L$0 = null;
                this.label = 2;
                if (c3Em.emit(message, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            if (i == 0) {
                Hwg.A00(obj);
                PairsRepository pairsRepository = ConnectionsViewModel.this.repository;
                String str = this.$request.deliveryId;
                this.label = 1;
                if (pairsRepository.declineInbox(str, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            ConnectionsViewModel.this.mailbox.decline(this.$request.deliveryId);
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C128791) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel$loadOlderActivity$1", f = "ConnectionsViewModel.kt", l = {176}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$loadOlderActivity$1, reason: invalid class name and case insensitive filesystem */
    public final class C128801 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C128801(HtJ<? super C128801> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionsViewModel.this.new C128801(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConnectionsViewModel.this.new C128801(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConnectionsTabStore connectionsTabStore = ConnectionsViewModel.this.store;
                this.label = 1;
                if (connectionsTabStore.loadOlderActivity(this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel$onAddQueryChange$1", f = "ConnectionsViewModel.kt", l = {364, 367}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$onAddQueryChange$1, reason: invalid class name and case insensitive filesystem */
    public final class C128811 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $trimmed;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128811(String str, HtJ<? super C128811> htJ) {
            super(2, htJ);
            this.$trimmed = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionsViewModel.this.new C128811(this.$trimmed, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            List list;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (PairsException unused) {
                list = C0881AGi.A00;
            }
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(300L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    list = (List) obj;
                    AnonymousClass002.A1I(ConnectionsViewModel.this.searchResults, new SearchResults(this.$trimmed, list));
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            PairsRepository pairsRepository = ConnectionsViewModel.this.repository;
            String str = this.$trimmed;
            PairsRecipientPurpose pairsRecipientPurpose = PairsRecipientPurpose.ADD_CONNECTION;
            this.label = 2;
            obj = pairsRepository.searchSuggestions(str, pairsRecipientPurpose, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
            list = (List) obj;
            AnonymousClass002.A1I(ConnectionsViewModel.this.searchResults, new SearchResults(this.$trimmed, list));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C128811) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel$onPullToRefresh$1", f = "ConnectionsViewModel.kt", l = {256}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$onPullToRefresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C128821 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C128821(HtJ<? super C128821> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionsViewModel.this.new C128821(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConnectionsViewModel.this.new C128821(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    ConnectionsTabStore connectionsTabStore = ConnectionsViewModel.this.store;
                    this.label = 1;
                    if (connectionsTabStore.refresh(true, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                AnonymousClass004.A1D(false, ConnectionsViewModel.this._isRefreshing);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                AnonymousClass004.A1D(false, ConnectionsViewModel.this._isRefreshing);
                throw th;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel$onSurfaceOpened$1", f = "ConnectionsViewModel.kt", l = {180}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$onSurfaceOpened$1, reason: invalid class name and case insensitive filesystem */
    public final class C128831 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C128831(HtJ<? super C128831> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionsViewModel.this.new C128831(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConnectionsViewModel.this.new C128831(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                PairsInviteMailbox pairsInviteMailbox = ConnectionsViewModel.this.mailbox;
                this.label = 1;
                if (pairsInviteMailbox.pull(this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel$open$3", f = "ConnectionsViewModel.kt", l = {HatchWidgetWebViewKt.HTTP_NO_CONTENT, 205, HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$open$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ConnectionsActivity $activity;
        public final /* synthetic */ String $shareId;
        public final /* synthetic */ String $spaceSlug;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ ConnectionsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, ConnectionsViewModel connectionsViewModel, ConnectionsActivity connectionsActivity, String str2, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$shareId = str;
            this.this$0 = connectionsViewModel;
            this.$activity = connectionsActivity;
            this.$spaceSlug = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$shareId, this.this$0, this.$activity, this.$spaceSlug, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                String str = this.$shareId;
                ConnectionsViewModel connectionsViewModel = this.this$0;
                ConnectionsActivity connectionsActivity = this.$activity;
                if (str != null) {
                    AuraNavKey auraNavKey = connectionsActivity.destination;
                    this.label = 1;
                    obj = connectionsViewModel.receivedShareEffect(str, auraNavKey, this);
                } else {
                    String str2 = connectionsActivity.museId;
                    String str3 = this.$spaceSlug;
                    if (str3 == null) {
                        throw C3cG.A0Q("Required value was null.");
                    }
                    AuraNavKey auraNavKey2 = connectionsActivity.destination;
                    this.label = 2;
                    obj = connectionsViewModel.sharedSpaceEffect(str2, str3, auraNavKey2, this);
                }
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            if (obj != null) {
                C20Z c20z = this.this$0._effects;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (c20z.emit(obj, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel", f = "ConnectionsViewModel.kt", l = {HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE}, m = "receivedShareEffect", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$receivedShareEffect$1, reason: invalid class name and case insensitive filesystem */
    public final class C128841 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C128841(HtJ<? super C128841> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionsViewModel.this.receivedShareEffect(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel$remove$1", f = "ConnectionsViewModel.kt", l = {456, 458, 464}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$remove$1, reason: invalid class name and case insensitive filesystem */
    public final class C128851 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ PairsContact $contact;
        public final /* synthetic */ ConnectionsInfo $info;
        public int I$0;
        public int label;
        public final /* synthetic */ ConnectionsViewModel this$0;

        /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$remove$1$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ConnectionsDisconnectEffect.values().length];
                try {
                    AnonymousClass002.A13(ConnectionsDisconnectEffect.STOP_CONVERSATION, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(ConnectionsDisconnectEffect.REMOVE_FROM_DIRECTORY, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(ConnectionsDisconnectEffect.DISCONNECT_RELATIONSHIP, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128851(ConnectionsInfo connectionsInfo, ConnectionsViewModel connectionsViewModel, PairsContact pairsContact, HtJ<? super C128851> htJ) {
            super(1, htJ);
            this.$info = connectionsInfo;
            this.this$0 = connectionsViewModel;
            this.$contact = pairsContact;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new C128851(this.$info, this.this$0, this.$contact, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r8.label
                r4 = 3
                r7 = 0
                r2 = 2
                r6 = 1
                if (r0 == 0) goto L1a
                if (r0 == r6) goto L16
                if (r0 == r2) goto L16
                if (r0 != r4) goto L74
                X.Hwg.A00(r9)
            L13:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            L16:
                X.Hwg.A00(r9)     // Catch: com.facebook.aura.pairs.PairsException -> L59
                goto L5d
            L1a:
                X.Hwg.A00(r9)
                com.facebook.aura.pairs.ConnectionsInfo r5 = r8.$info     // Catch: com.facebook.aura.pairs.PairsException -> L59
                if (r5 == 0) goto L4a
                com.facebook.aura.pairs.ConnectionsDisconnectEffect r0 = r5.disconnectEffect     // Catch: com.facebook.aura.pairs.PairsException -> L59
                r1 = -1
                if (r0 == 0) goto L4a
                int r0 = r0.ordinal()     // Catch: com.facebook.aura.pairs.PairsException -> L59
                if (r0 == r1) goto L4a
                if (r0 == r6) goto L37
                if (r0 == r2) goto L37
                if (r0 == r7) goto L4a
                kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()     // Catch: com.facebook.aura.pairs.PairsException -> L59
                throw r0     // Catch: com.facebook.aura.pairs.PairsException -> L59
            L37:
                com.facebook.aura.pairs.ConnectionsViewModel r0 = r8.this$0     // Catch: com.facebook.aura.pairs.PairsException -> L59
                com.facebook.aura.pairs.PairsRepository r2 = r0.repository     // Catch: com.facebook.aura.pairs.PairsException -> L59
                com.facebook.aura.pairs.PairsContact r0 = r8.$contact     // Catch: com.facebook.aura.pairs.PairsException -> L59
                java.lang.String r1 = r0.museId     // Catch: com.facebook.aura.pairs.PairsException -> L59
                java.lang.String r0 = r5.connectionId     // Catch: com.facebook.aura.pairs.PairsException -> L59
                r8.label = r6     // Catch: com.facebook.aura.pairs.PairsException -> L59
                java.lang.Object r0 = r2.disconnect(r1, r0, r8)     // Catch: com.facebook.aura.pairs.PairsException -> L59
                if (r0 != r3) goto L5d
                goto L79
            L4a:
                com.facebook.aura.pairs.ConnectionsViewModel r0 = r8.this$0     // Catch: com.facebook.aura.pairs.PairsException -> L59
                com.facebook.aura.pairs.PairsRepository r1 = r0.repository     // Catch: com.facebook.aura.pairs.PairsException -> L59
                com.facebook.aura.pairs.PairsContact r0 = r8.$contact     // Catch: com.facebook.aura.pairs.PairsException -> L59
                r8.label = r2     // Catch: com.facebook.aura.pairs.PairsException -> L59
                java.lang.Object r0 = r1.removeContact(r0, r8)     // Catch: com.facebook.aura.pairs.PairsException -> L59
                if (r0 != r3) goto L5d
                goto L7a
            L59:
                r2 = 2131889542(0x7f120d86, float:1.941375E38)
                goto L60
            L5d:
                r2 = 2131889532(0x7f120d7c, float:1.941373E38)
            L60:
                com.facebook.aura.pairs.ConnectionsViewModel r0 = r8.this$0
                X.3Em<com.facebook.aura.pairs.ConnectionsEffect> r1 = r0._effects
                com.facebook.aura.pairs.ConnectionsEffect$Message r0 = new com.facebook.aura.pairs.ConnectionsEffect$Message
                r0.<init>(r2)
                r8.I$0 = r2
                r8.label = r4
                java.lang.Object r0 = r1.emit(r0, r8)
                if (r0 != r3) goto L13
                return r3
            L74:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L79:
                return r3
            L7a:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsViewModel.C128851.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C128851) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel$removeGroup$1", f = "ConnectionsViewModel.kt", l = {472, 477}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$removeGroup$1, reason: invalid class name and case insensitive filesystem */
    public final class C128861 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ ConnectionsGroup $group;
        public int I$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128861(ConnectionsGroup connectionsGroup, HtJ<? super C128861> htJ) {
            super(1, htJ);
            this.$group = connectionsGroup;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ConnectionsViewModel.this.new C128861(this.$group, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            int i;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i2 = this.label;
            try {
            } catch (PairsException unused) {
                i = R.string._name_removed__res_0x7f120d86;
            }
            if (i2 == 0) {
                Hwg.A00(obj);
                PairsRepository pairsRepository = ConnectionsViewModel.this.repository;
                String str = this.$group.connectionId;
                this.label = 1;
                if (pairsRepository.disconnectGroup(str, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            i = R.string._name_removed__res_0x7f120d7c;
            C3Em<ConnectionsEffect> c3Em = ConnectionsViewModel.this._effects;
            ConnectionsEffect.Message message = new ConnectionsEffect.Message(i);
            this.I$0 = i;
            this.label = 2;
            if (c3Em.emit(message, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C128861) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel$retry$1", f = "ConnectionsViewModel.kt", l = {265}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$retry$1, reason: invalid class name and case insensitive filesystem */
    public final class C128871 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C128871(HtJ<? super C128871> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionsViewModel.this.new C128871(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConnectionsViewModel.this.new C128871(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConnectionsTabStore connectionsTabStore = ConnectionsViewModel.this.store;
                this.label = 1;
                if (connectionsTabStore.refresh(true, this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel$runAction$1", f = "ConnectionsViewModel.kt", l = {486}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$runAction$1, reason: invalid class name and case insensitive filesystem */
    public final class C128881 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $action;
        public final /* synthetic */ String $key;
        public int label;
        public final /* synthetic */ ConnectionsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C128881(G0U<? super HtJ<? super Unit>, ? extends Object> g0u, ConnectionsViewModel connectionsViewModel, String str, HtJ<? super C128881> htJ) {
            super(2, htJ);
            this.$action = g0u;
            this.this$0 = connectionsViewModel;
            this.$key = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C128881(this.$action, this.this$0, this.$key, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    G0U<HtJ<? super Unit>, Object> g0u = this.$action;
                    this.label = 1;
                    if (g0u.invoke(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                this.this$0.setBusy(this.$key, false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.this$0.setBusy(this.$key, false);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C128881) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel$shareInviteLink$1", f = "ConnectionsViewModel.kt", l = {308, HatchMessageShareDocumentRenderer.MIN_CONTENT_HEIGHT_PX, 313}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$shareInviteLink$1, reason: invalid class name and case insensitive filesystem */
    public final class C128891 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchShareDestination $destination;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128891(HatchShareDestination hatchShareDestination, HtJ<? super C128891> htJ) {
            super(1, htJ);
            this.$destination = hatchShareDestination;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ConnectionsViewModel.this.new C128891(this.$destination, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                } catch (PairsException e) {
                    if (e.error == PairsError.REQUEST_CHANGED) {
                        ConnectionsViewModel.this.inviteLinkRequestId = null;
                    }
                    C3Em<ConnectionsEffect> c3Em = ConnectionsViewModel.this._effects;
                    ConnectionsEffect.Message message = new ConnectionsEffect.Message(R.string._name_removed__res_0x7f1207ee);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    if (c3Em.emit(message, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                if (i == 0) {
                    Hwg.A00(obj);
                    ConnectionsViewModel.this._inviteLinkDestination.Af8(this.$destination);
                    String strA0u = ConnectionsViewModel.this.inviteLinkRequestId;
                    if (strA0u == null) {
                        strA0u = AnonymousClass001.A0u(AnonymousClass002.A0k());
                        ConnectionsViewModel.this.inviteLinkRequestId = strA0u;
                    }
                    PairsRepository pairsRepository = ConnectionsViewModel.this.repository;
                    this.L$0 = null;
                    this.label = 1;
                    obj = pairsRepository.createInviteLink(strA0u, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                        ConnectionsViewModel.this._inviteLinkDestination.Af8(null);
                        return Unit.INSTANCE;
                    }
                    Hwg.A00(obj);
                }
                ConnectionsViewModel.this.inviteLinkRequestId = null;
                C3Em<ConnectionsEffect> c3Em2 = ConnectionsViewModel.this._effects;
                ConnectionsEffect.ShareInviteLink shareInviteLink = new ConnectionsEffect.ShareInviteLink((String) obj, this.$destination);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (c3Em2.emit(shareInviteLink, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                ConnectionsViewModel.this._inviteLinkDestination.Af8(null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                ConnectionsViewModel.this._inviteLinkDestination.Af8(null);
                throw th;
            }
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C128891) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel$shareLink$1", f = "ConnectionsViewModel.kt", l = {295, 296, 298}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$shareLink$1, reason: invalid class name and case insensitive filesystem */
    public final class C128901 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ PairsInvite $invite;
        public final /* synthetic */ PairsMintedInvite $minted;
        public Object L$0;
        public int label;
        public final /* synthetic */ ConnectionsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128901(PairsInvite pairsInvite, PairsMintedInvite pairsMintedInvite, ConnectionsViewModel connectionsViewModel, HtJ<? super C128901> htJ) {
            super(1, htJ);
            this.$invite = pairsInvite;
            this.$minted = pairsMintedInvite;
            this.this$0 = connectionsViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new C128901(this.$invite, this.$minted, this.this$0, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x003b A[Catch: PairsException -> 0x0059, TryCatch #0 {PairsException -> 0x0059, blocks: (B:10:0x0015, B:17:0x0030, B:18:0x0033, B:20:0x0037, B:22:0x003b, B:26:0x0052, B:27:0x0058, B:23:0x003d, B:12:0x001c, B:14:0x0020), top: B:36:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0052 A[Catch: PairsException -> 0x0059, TryCatch #0 {PairsException -> 0x0059, blocks: (B:10:0x0015, B:17:0x0030, B:18:0x0033, B:20:0x0037, B:22:0x003b, B:26:0x0052, B:27:0x0058, B:23:0x003d, B:12:0x001c, B:14:0x0020), top: B:36:0x0007 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r4 = 3
                r6 = 2
                r5 = 1
                if (r0 == 0) goto L19
                if (r0 == r5) goto L30
                if (r0 == r6) goto L15
                if (r0 != r4) goto L75
                X.Hwg.A00(r8)
            L12:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            L15:
                X.Hwg.A00(r8)     // Catch: com.facebook.aura.pairs.PairsException -> L59
                goto L12
            L19:
                X.Hwg.A00(r8)
                com.facebook.aura.pairs.PairsInvite r2 = r7.$invite     // Catch: com.facebook.aura.pairs.PairsException -> L59
                if (r2 == 0) goto L37
                com.facebook.aura.pairs.ConnectionsViewModel r0 = r7.this$0     // Catch: com.facebook.aura.pairs.PairsException -> L59
                com.facebook.aura.pairs.PairsRepository r1 = r0.repository     // Catch: com.facebook.aura.pairs.PairsException -> L59
                r0 = 0
                r7.L$0 = r0     // Catch: com.facebook.aura.pairs.PairsException -> L59
                r7.label = r5     // Catch: com.facebook.aura.pairs.PairsException -> L59
                java.lang.Object r8 = r1.copyLink(r2, r7)     // Catch: com.facebook.aura.pairs.PairsException -> L59
                if (r8 != r3) goto L33
                goto L7a
            L30:
                X.Hwg.A00(r8)     // Catch: com.facebook.aura.pairs.PairsException -> L59
            L33:
                java.lang.String r8 = (java.lang.String) r8     // Catch: com.facebook.aura.pairs.PairsException -> L59
                if (r8 != 0) goto L3d
            L37:
                com.facebook.aura.pairs.PairsMintedInvite r0 = r7.$minted     // Catch: com.facebook.aura.pairs.PairsException -> L59
                if (r0 == 0) goto L52
                java.lang.String r8 = r0.url     // Catch: com.facebook.aura.pairs.PairsException -> L59
            L3d:
                com.facebook.aura.pairs.ConnectionsViewModel r0 = r7.this$0     // Catch: com.facebook.aura.pairs.PairsException -> L59
                X.3Em<com.facebook.aura.pairs.ConnectionsEffect> r2 = r0._effects     // Catch: com.facebook.aura.pairs.PairsException -> L59
                com.facebook.aura.pairs.ConnectionsEffect$ShareLink r1 = new com.facebook.aura.pairs.ConnectionsEffect$ShareLink     // Catch: com.facebook.aura.pairs.PairsException -> L59
                r1.<init>(r8)     // Catch: com.facebook.aura.pairs.PairsException -> L59
                r0 = 0
                r7.L$0 = r0     // Catch: com.facebook.aura.pairs.PairsException -> L59
                r7.label = r6     // Catch: com.facebook.aura.pairs.PairsException -> L59
                java.lang.Object r0 = r2.emit(r1, r7)     // Catch: com.facebook.aura.pairs.PairsException -> L59
                if (r0 != r3) goto L12
                goto L7b
            L52:
                java.lang.String r0 = "Required value was null."
                java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)     // Catch: com.facebook.aura.pairs.PairsException -> L59
                throw r0     // Catch: com.facebook.aura.pairs.PairsException -> L59
            L59:
                r1 = move-exception
                com.facebook.aura.pairs.ConnectionsViewModel r0 = r7.this$0
                X.3Em<com.facebook.aura.pairs.ConnectionsEffect> r2 = r0._effects
                com.facebook.aura.pairs.PairsError r0 = r1.error
                int r0 = com.facebook.aura.pairs.ConnectionsViewModelKt.copyLinkMessage(r0)
                com.facebook.aura.pairs.ConnectionsEffect$Message r1 = new com.facebook.aura.pairs.ConnectionsEffect$Message
                r1.<init>(r0)
                r0 = 0
                r7.L$0 = r0
                r7.label = r4
                java.lang.Object r0 = r2.emit(r1, r7)
                if (r0 != r3) goto L12
                return r3
            L75:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L7a:
                return r3
            L7b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsViewModel.C128901.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C128901) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel", f = "ConnectionsViewModel.kt", l = {243}, m = "sharedSpaceEffect", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsViewModel$sharedSpaceEffect$1, reason: invalid class name and case insensitive filesystem */
    public final class C128911 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C128911(HtJ<? super C128911> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionsViewModel.this.sharedSpaceEffect(null, null, null, this);
        }
    }

    public ConnectionsViewModel(PairsRepository pairsRepository, PairsInviteMailbox pairsInviteMailbox, ConnectionsTabStore connectionsTabStore) {
        boolean zA1Z = AnonymousClass005.A1Z(pairsRepository, pairsInviteMailbox, connectionsTabStore);
        this.repository = pairsRepository;
        this.mailbox = pairsInviteMailbox;
        this.store = connectionsTabStore;
        C9286GCn c9286GCnA01 = HnJ.A01(ConnectionsUiState.Loading.INSTANCE);
        this._uiState = c9286GCnA01;
        this.uiState = C3cG.A11(c9286GCnA01);
        C9290GCr c9290GCrA12 = C3cG.A12(C79.A01, 0, zA1Z ? 1 : 0);
        this._effects = c9290GCrA12;
        this.effects = C3pd.A00(c9290GCrA12);
        C0943AIw c0943AIw = C0943AIw.A03;
        this.busyIds = HnJ.A01(c0943AIw);
        this.sentIds = HnJ.A01(c0943AIw);
        this.sentInvites = AGH.A0E();
        this.dismissedIds = HnJ.A01(A3q.A00);
        this.mintedInvites = C60O.A1C();
        C9286GCn c9286GCnA14 = C3cG.A14("");
        this.addQuery = c9286GCnA14;
        C9286GCn c9286GCnA142 = C3cG.A14(new SearchResults("", C0881AGi.A00));
        this.searchResults = c9286GCnA142;
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        this._isRefreshing = c9286GCnA0v;
        this.isRefreshing = C3cG.A11(c9286GCnA0v);
        this.presentationKeys = C60O.A1C();
        C9286GCn c9286GCnA13 = C3cG.A13();
        this._inviteLinkDestination = c9286GCnA13;
        this.inviteLinkDestination = C3cG.A11(c9286GCnA13);
        BLL bllA00 = AEu.A00(this);
        AuraDispatchers auraDispatchers = AuraDispatchers.INSTANCE;
        C78T c78tIo = auraDispatchers.io();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        Integer num = C79.A00;
        GAo.A02(num, auraDispatchers.io(), new AnonymousClass2(null), AnonymousClass001.A0e(this, num, c78tIo, anonymousClass1, bllA00));
        this.olderActivity = connectionsTabStore.olderActivity;
        this.addSuggestionsQuery = C3cG.A11(c9286GCnA14);
        AnonymousClass603 anonymousClass603A00 = C3rb.A00(new ConnectionsViewModel$addSuggestions$1(null), c9286GCnA01, c9286GCnA14, c9286GCnA142);
        this.addSuggestions = AnonymousClass441.A00(AHI.A01, AEu.A00(this), anonymousClass603A00, C3Ek.A00);
    }

    public final void accept(PairsInboxRequest pairsInboxRequest) {
        C7384Etj.A0Y(pairsInboxRequest, 0);
        runAction(pairsInboxRequest.deliveryId, new C128741(pairsInboxRequest, null));
    }

    public final void cancelRequest(PairsSuggestion pairsSuggestion) {
        String str;
        C7384Etj.A0Y(pairsSuggestion, 0);
        PairsInvite pairsInvite = this.sentInvites.get(pairsSuggestion.id);
        if (pairsInvite == null || (str = pairsInvite.id) == null) {
            PairsMintedInvite pairsMintedInvite = this.mintedInvites.get(pairsSuggestion.id);
            if (pairsMintedInvite == null) {
                return;
            } else {
                str = pairsMintedInvite.inviteId;
            }
        }
        runAction(pairsSuggestion.id, new C128751(str, pairsSuggestion, null));
    }

    public final void confirm(PairsContact pairsContact) {
        String str;
        C7384Etj.A0Y(pairsContact, 0);
        PairsRelationship pairsRelationship = pairsContact.relationship;
        if (pairsRelationship == null || (str = pairsRelationship.generationId) == null) {
            return;
        }
        runAction(pairsContact.museId, new C128761(str, null));
    }

    public final void connect(PairsSuggestion pairsSuggestion) {
        C7384Etj.A0Y(pairsSuggestion, 0);
        if (this.sentIds.getValue().contains(pairsSuggestion.id)) {
            return;
        }
        runAction(pairsSuggestion.id, new C128771(pairsSuggestion, null));
    }

    public final void dismiss(ConnectionsActivity connectionsActivity) {
        C7384Etj.A0Y(connectionsActivity, 0);
        String str = connectionsActivity.feedActivityId;
        if (str != null) {
            runAction(connectionsActivity.id, new C128781(str, connectionsActivity, null));
        }
    }

    public final void ignore(PairsInboxRequest pairsInboxRequest) {
        C7384Etj.A0Y(pairsInboxRequest, 0);
        runAction(pairsInboxRequest.deliveryId, new C128791(pairsInboxRequest, null));
    }

    public final void onAddQueryChange(String str) {
        C7384Etj.A0Y(str, 0);
        C9286GCn.A00(null, str, (C9286GCn) this.addQuery);
        HoC hoC = this.searchJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        String strA0l = AnonymousClass002.A0l(str);
        int length = strA0l.length();
        if (2 > length || length >= 101) {
            AnonymousClass001.A1E(this.searchResults, null, new SearchResults("", C0881AGi.A00));
            return;
        }
        BLL bllA00 = AEu.A00(this);
        this.searchJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C128811(strA0l, null), bllA00);
    }

    public final void onScreenLeft(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        this.presentationKeys.remove(auraNavKey);
    }

    public final void open(ConnectionsActivity connectionsActivity) {
        C3Em<ConnectionsEffect> c3Em;
        ConnectionsEffect open;
        String str;
        C7384Etj.A0Y(connectionsActivity, 0);
        ConnectionsSharedLink connectionsSharedLink = connectionsActivity.link;
        if (connectionsSharedLink != null) {
            c3Em = this._effects;
            open = new ConnectionsEffect.OpenUrl(connectionsSharedLink.url);
        } else {
            ConnectionsSharedFile connectionsSharedFile = connectionsActivity.file;
            if (connectionsSharedFile != null && (str = connectionsSharedFile.workspacePath) != null) {
                this._effects.AhV(new ConnectionsEffect.OpenFile(str, connectionsSharedFile.name, connectionsSharedFile.mimeType, connectionsActivity.destination));
                return;
            }
            String str2 = connectionsActivity.receivedShareId;
            String spaceSlugToResolve = ConnectionsViewModelKt.getSpaceSlugToResolve(connectionsActivity);
            if (str2 != null || spaceSlugToResolve != null) {
                AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass3(str2, this, connectionsActivity, spaceSlugToResolve, null), AEu.A00(this));
                return;
            }
            AuraNavKey auraNavKey = connectionsActivity.destination;
            if (auraNavKey == null) {
                return;
            }
            c3Em = this._effects;
            open = new ConnectionsEffect.Open(auraNavKey);
        }
        c3Em.AhV(open);
    }

    public final String presentationKey(AuraNavKey auraNavKey) {
        String strPutIfAbsent;
        C7384Etj.A0Y(auraNavKey, 0);
        ConcurrentHashMap<AuraNavKey, String> concurrentHashMap = this.presentationKeys;
        String strNewPresentationKey = concurrentHashMap.get(auraNavKey);
        if (strNewPresentationKey == null && (strPutIfAbsent = concurrentHashMap.putIfAbsent(auraNavKey, (strNewPresentationKey = PairsAnalyticsKt.newPresentationKey()))) != null) {
            strNewPresentationKey = strPutIfAbsent;
        }
        C7384Etj.A0W(strNewPresentationKey);
        return strNewPresentationKey;
    }

    public final void remove(PairsContact pairsContact, ConnectionsInfo connectionsInfo) {
        C7384Etj.A0Y(pairsContact, 0);
        runAction(pairsContact.museId, new C128851(connectionsInfo, this, pairsContact, null));
    }

    public final void removeGroup(ConnectionsGroup connectionsGroup) {
        C7384Etj.A0Y(connectionsGroup, 0);
        runAction(connectionsGroup.connectionId, new C128861(connectionsGroup, null));
    }

    public final void shareInviteLink(HatchShareDestination hatchShareDestination) {
        C7384Etj.A0Y(hatchShareDestination, 0);
        runAction(ConnectionsViewModelKt.INVITE_LINK_ACTION_KEY, new C128891(hatchShareDestination, null));
    }

    public final void shareLink(PairsSuggestion pairsSuggestion) {
        C7384Etj.A0Y(pairsSuggestion, 0);
        PairsInvite pairsInvite = this.sentInvites.get(pairsSuggestion.id);
        PairsMintedInvite pairsMintedInvite = this.mintedInvites.get(pairsSuggestion.id);
        if (pairsInvite == null && pairsMintedInvite == null) {
            return;
        }
        runAction(pairsSuggestion.id, new C128901(pairsInvite, pairsMintedInvite, this, null));
    }

    public final C20Q<ConnectionsSheetState> sheetState(ConnectionsSheetSubject connectionsSheetSubject) {
        C7384Etj.A0Y(connectionsSheetSubject, 0);
        return new ConnectionsViewModel$sheetState$$inlined$map$1(this._uiState, connectionsSheetSubject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<HxE<PairsContact, String>> connectedPeople(ConnectionsTabSnapshot.Loaded loaded) {
        List<PairsContact> list = loaded.hub.contacts;
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(list));
        for (PairsContact pairsContact : list) {
            linkedHashMapA15.put(pairsContact.museId, pairsContact);
        }
        List<PairsContact> list2 = loaded.people;
        if (list2 == null) {
            list2 = C0881AGi.A00;
        }
        HashSet hashSetA13 = C60O.A13();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            hashSetA13.add(((PairsContact) it.next()).museId);
        }
        ArrayList arrayListA0m = AnonymousClass002.A0m(list2);
        for (PairsContact pairsContact2 : list2) {
            Object obj = linkedHashMapA15.get(pairsContact2.museId);
            if (obj == null) {
                obj = pairsContact2;
            }
            AnonymousClass002.A1J(obj, pairsContact2.connectionId, arrayListA0m);
        }
        List<PairsContact> list3 = loaded.hub.contacts;
        ArrayList<PairsContact> arrayListA0h = C3cG.A0h();
        for (PairsContact pairsContact3 : list3) {
            C60R.A1I(pairsContact3.museId, pairsContact3, hashSetA13, arrayListA0h);
        }
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayListA0h);
        for (PairsContact pairsContact4 : arrayListA0h) {
            AnonymousClass002.A1J(pairsContact4, pairsContact4.connectionId, arrayListA0m2);
        }
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(arrayListA0m2, arrayListA0m);
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator it2 = arrayListA0P.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            PairsContact pairsContact5 = (PairsContact) ((HxE) next).first;
            if (pairsContact5.status == PairsContactStatus.VERIFIED && !pairsContact5.isSpaceOnly) {
                arrayListA0h2.add(next);
            }
        }
        return arrayListA0h2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ConnectionsUiState loadedState(ConnectionsTabSnapshot.Loaded loaded) {
        PairsHubSnapshot pairsHubSnapshot = loaded.hub;
        this.hasInviteInbox = pairsHubSnapshot.access.hasInviteInbox;
        final List<PairsSuggestion> list = loaded.suggestions;
        C0893AGu c0893AGuA1B = BHL.A1B(pairsHubSnapshot.liveInvites);
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(c0893AGuA1B));
        Iterator<T> it = c0893AGuA1B.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMapA15.put(((PairsInvite) next).label, next);
        }
        Map mapA00 = A3Z.A00(new A3Y<PairsSuggestion, String>() { // from class: com.facebook.aura.pairs.ConnectionsViewModel$loadedState$$inlined$groupingBy$1
            @Override // X.A3Y
            public String keyOf(PairsSuggestion pairsSuggestion) {
                return pairsSuggestion.name;
            }

            @Override // X.A3Y
            public Iterator<PairsSuggestion> sourceIterator() {
                return list.iterator();
            }
        });
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(mapA00);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (AnonymousClass001.A0F(entryA0l.getValue()) == 1) {
                AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
            }
        }
        Set setKeySet = linkedHashMapA0j.keySet();
        ArrayList<PairsSuggestion> arrayListA0h = C3cG.A0h();
        for (PairsSuggestion pairsSuggestion : list) {
            C60Q.A1G(pairsSuggestion.name, pairsSuggestion, arrayListA0h, setKeySet);
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (PairsSuggestion pairsSuggestion2 : arrayListA0h) {
            Object obj = linkedHashMapA15.get(pairsSuggestion2.name);
            if (obj != null) {
                AnonymousClass002.A1J(pairsSuggestion2.id, obj, arrayListA0h2);
            }
        }
        this.sentInvites = AGH.A06(arrayListA0h2);
        HashSet hashSetA13 = C60O.A13();
        Iterator<PairsSuggestion> it2 = list.iterator();
        while (it2.hasNext()) {
            hashSetA13.add(it2.next().id);
        }
        BLG<AHG<String>> blg = this.sentIds;
        Set<String> setKeySet2 = this.sentInvites.keySet();
        Set<String> setKeySet3 = this.mintedInvites.keySet();
        ArrayList arrayListA0s = C60Q.A0s(setKeySet3);
        for (String str : setKeySet3) {
            if (!hashSetA13.contains(str)) {
                arrayListA0s.add(str);
            }
        }
        blg.Af8(AGI.A0H(BGK.A01(arrayListA0s, setKeySet2)));
        List<HxE<PairsContact, String>> listConnectedPeople = connectedPeople(loaded);
        ArrayList arrayListA0m = AnonymousClass002.A0m(listConnectedPeople);
        Iterator<HxE<PairsContact, String>> it3 = listConnectedPeople.iterator();
        while (it3.hasNext()) {
            HxE hxEA10 = C60Q.A10(it3);
            PairsContact pairsContact = (PairsContact) hxEA10.first;
            String str2 = (String) hxEA10.second;
            AuraNavKey auraNavKeyPersonTarget = personTarget(pairsContact, pairsHubSnapshot);
            String str3 = pairsContact.chatSessionId;
            arrayListA0m.add(new ConnectionsPerson(pairsContact, auraNavKeyPersonTarget, str3 != null ? new PairsHistoryScreenKey(pairsContact.museId, str3, str2) : null));
        }
        AHD ahdA07 = AGI.A07(arrayListA0m);
        AHD ahdA072 = AGI.A07(loaded.groups);
        List<ConnectionsActivity> listActivity = ConnectionsActivityRules.INSTANCE.activity(pairsHubSnapshot, loaded.feed, System.currentTimeMillis());
        ArrayList arrayListA0h3 = C3cG.A0h();
        for (ConnectionsActivity connectionsActivity : listActivity) {
            C60Q.A1H(connectionsActivity.id, connectionsActivity, arrayListA0h3, this.dismissedIds.getValue());
        }
        return new ConnectionsUiState.Loaded(ahdA07, ahdA072, AGI.A07(arrayListA0h3), AGI.A07(AbstractC0878AGe.A0c(list, new Comparator() { // from class: com.facebook.aura.pairs.ConnectionsViewModel$loadedState$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C3cG.A0P(((PairsSuggestion) t).isOnMuse).compareTo(C3cG.A0P(((PairsSuggestion) t2).isOnMuse));
            }
        })), AGI.A09(C60O.A0j(this.sentIds)), this.busyIds.getValue(), AnonymousClass002.A1X(loaded.feedCursor));
    }

    private final AuraNavKey personTarget(PairsContact pairsContact, PairsHubSnapshot pairsHubSnapshot) {
        String str;
        PairsRelationship pairsRelationship = pairsContact.relationship;
        if (pairsRelationship != null && (str = pairsRelationship.generationId) != null) {
            PairsPairingRules pairsPairingRules = PairsPairingRules.INSTANCE;
            if (pairsPairingRules.needsOwnerConfirmation(pairsContact, pairsHubSnapshot)) {
                F0C<C9hr<Object>>[] f0cArr = PairsStatusSheetKey.$childSerializers;
                return new PairsStatusSheetKey(str, pairsPairingRules.role(pairsContact, pairsHubSnapshot), false);
            }
        }
        F0C<C9hr<Object>>[] f0cArr2 = ConnectionsSheetKey.$childSerializers;
        return new ConnectionsSheetKey(new ConnectionsSheetSubject.Person(pairsContact.museId));
    }

    private final void publish() {
        ConnectionsUiState value;
        ConnectionsUiState loaded;
        BLG<ConnectionsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            loaded = value;
            if (loaded instanceof ConnectionsUiState.Loaded) {
                ConnectionsUiState.Loaded loaded2 = (ConnectionsUiState.Loaded) loaded;
                AHD<ConnectionsPerson> ahd = loaded2.connections;
                AHD<ConnectionsGroup> ahd2 = loaded2.groups;
                AHD<ConnectionsActivity> ahd3 = loaded2.activity;
                ArrayList arrayListA0h = C3cG.A0h();
                for (Object obj : ahd3) {
                    C60Q.A1H(((ConnectionsActivity) obj).id, obj, arrayListA0h, this.dismissedIds.getValue());
                }
                loaded = new ConnectionsUiState.Loaded(ahd, ahd2, AGI.A07(arrayListA0h), loaded2.suggestions, this.sentIds.getValue(), this.busyIds.getValue(), loaded2.hasOlderActivity);
            }
        } while (!blg.A6e(value, loaded));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object receivedShareEffect(java.lang.String r7, com.facebook.aura.navigation.AuraNavKey r8, X.HtJ<? super com.facebook.aura.pairs.ConnectionsEffect> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.pairs.ConnectionsViewModel.C128841
            if (r0 == 0) goto L23
            r5 = r9
            com.facebook.aura.pairs.ConnectionsViewModel$receivedShareEffect$1 r5 = (com.facebook.aura.pairs.ConnectionsViewModel.C128841) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L29
            java.lang.Object r8 = r5.L$1
            com.facebook.aura.navigation.AuraNavKey r8 = (com.facebook.aura.navigation.AuraNavKey) r8
            goto L40
        L23:
            com.facebook.aura.pairs.ConnectionsViewModel$receivedShareEffect$1 r5 = new com.facebook.aura.pairs.ConnectionsViewModel$receivedShareEffect$1
            r5.<init>(r9)
            goto L12
        L29:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2e:
            X.Hwg.A00(r4)
            com.facebook.aura.pairs.PairsRepository r0 = r6.repository     // Catch: com.facebook.aura.pairs.PairsException -> L48
            r5.L$0 = r3     // Catch: com.facebook.aura.pairs.PairsException -> L48
            r5.L$1 = r8     // Catch: com.facebook.aura.pairs.PairsException -> L48
            r5.label = r1     // Catch: com.facebook.aura.pairs.PairsException -> L48
            java.lang.Object r4 = r0.receivedItem(r7, r5)     // Catch: com.facebook.aura.pairs.PairsException -> L48
            if (r4 != r2) goto L43
            return r2
        L40:
            X.Hwg.A00(r4)     // Catch: com.facebook.aura.pairs.PairsException -> L48
        L43:
            com.facebook.aura.pairs.ConnectionsReceivedItem r4 = (com.facebook.aura.pairs.ConnectionsReceivedItem) r4     // Catch: com.facebook.aura.pairs.PairsException -> L48
            if (r4 == 0) goto L54
            goto L5c
        L48:
            r0 = move-exception
            java.lang.Object[] r2 = X.C60Q.A1Z(r0)
            java.lang.String r1 = "ConnectionsViewModel"
            java.lang.String r0 = "received share read failed: %s"
            X.CFK.A0H(r1, r0, r2)
        L54:
            if (r8 == 0) goto L72
            com.facebook.aura.pairs.ConnectionsEffect$Open r3 = new com.facebook.aura.pairs.ConnectionsEffect$Open
            r3.<init>(r8)
            return r3
        L5c:
            com.facebook.aura.navigation.AuraNavKey r0 = r4.destination
            if (r0 == 0) goto L61
            r8 = r0
        L61:
            java.lang.String r2 = r4.workspacePath
            if (r2 == 0) goto L54
            java.lang.String r1 = r4.fileName
            if (r1 != 0) goto L6b
            java.lang.String r1 = r4.title
        L6b:
            java.lang.String r0 = r4.mimeType
            com.facebook.aura.pairs.ConnectionsEffect$OpenFile r3 = new com.facebook.aura.pairs.ConnectionsEffect$OpenFile
            r3.<init>(r2, r1, r0, r8)
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsViewModel.receivedShareEffect(java.lang.String, com.facebook.aura.navigation.AuraNavKey, X.HtJ):java.lang.Object");
    }

    private final void runAction(String str, G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
        if (this.busyIds.getValue().contains(str)) {
            return;
        }
        setBusy(str, true);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C128881(g0u, this, str, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBusy(String str, boolean z) {
        AHG<String> value;
        AHG<String> ahg;
        BLG<AHG<String>> blg = this.busyIds;
        do {
            value = blg.getValue();
            ahg = value;
        } while (!blg.A6e(value, z ? ahg.A35(str) : ahg.Aaa(str)));
        publish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sharedSpaceEffect(java.lang.String r7, java.lang.String r8, com.facebook.aura.navigation.AuraNavKey r9, X.HtJ<? super com.facebook.aura.pairs.ConnectionsEffect> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.pairs.ConnectionsViewModel.C128911
            if (r0 == 0) goto L23
            r5 = r10
            com.facebook.aura.pairs.ConnectionsViewModel$sharedSpaceEffect$1 r5 = (com.facebook.aura.pairs.ConnectionsViewModel.C128911) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L29
            java.lang.Object r9 = r5.L$2
            com.facebook.aura.navigation.AuraNavKey r9 = (com.facebook.aura.navigation.AuraNavKey) r9
            goto L42
        L23:
            com.facebook.aura.pairs.ConnectionsViewModel$sharedSpaceEffect$1 r5 = new com.facebook.aura.pairs.ConnectionsViewModel$sharedSpaceEffect$1
            r5.<init>(r10)
            goto L12
        L29:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2e:
            X.Hwg.A00(r4)
            com.facebook.aura.pairs.PairsRepository r0 = r6.repository     // Catch: com.facebook.aura.pairs.PairsException -> L4a
            r5.L$0 = r3     // Catch: com.facebook.aura.pairs.PairsException -> L4a
            r5.L$1 = r3     // Catch: com.facebook.aura.pairs.PairsException -> L4a
            r5.L$2 = r9     // Catch: com.facebook.aura.pairs.PairsException -> L4a
            r5.label = r1     // Catch: com.facebook.aura.pairs.PairsException -> L4a
            java.lang.Object r4 = r0.sharedSpaceBySlug(r7, r8, r5)     // Catch: com.facebook.aura.pairs.PairsException -> L4a
            if (r4 != r2) goto L45
            return r2
        L42:
            X.Hwg.A00(r4)     // Catch: com.facebook.aura.pairs.PairsException -> L4a
        L45:
            com.facebook.aura.navigation.key.PeerSpaceScreenKey r4 = (com.facebook.aura.navigation.key.PeerSpaceScreenKey) r4     // Catch: com.facebook.aura.pairs.PairsException -> L4a
            if (r4 == 0) goto L56
            goto L59
        L4a:
            r0 = move-exception
            java.lang.Object[] r2 = X.C60Q.A1Z(r0)
            java.lang.String r1 = "ConnectionsViewModel"
            java.lang.String r0 = "shared space lookup failed: %s"
            X.CFK.A0H(r1, r0, r2)
        L56:
            if (r9 == 0) goto L5f
            goto L5a
        L59:
            r9 = r4
        L5a:
            com.facebook.aura.pairs.ConnectionsEffect$Open r3 = new com.facebook.aura.pairs.ConnectionsEffect$Open
            r3.<init>(r9)
        L5f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsViewModel.sharedSpaceEffect(java.lang.String, java.lang.String, com.facebook.aura.navigation.AuraNavKey, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConnectionsUiState uiStateFor(ConnectionsTabSnapshot connectionsTabSnapshot) {
        ConnectionsUiState connectionsUiState;
        if (C7384Etj.areEqual(connectionsTabSnapshot, ConnectionsTabSnapshot.Unavailable.INSTANCE)) {
            connectionsUiState = ConnectionsUiState.Unavailable.INSTANCE;
        } else {
            if (!C7384Etj.areEqual(connectionsTabSnapshot, ConnectionsTabSnapshot.Failed.INSTANCE)) {
                if (connectionsTabSnapshot instanceof ConnectionsTabSnapshot.Loaded) {
                    return loadedState((ConnectionsTabSnapshot.Loaded) connectionsTabSnapshot);
                }
                throw C3cG.A0q();
            }
            connectionsUiState = ConnectionsUiState.Failed.INSTANCE;
        }
        return connectionsUiState;
    }

    public final C1BN<AHD<PairsSuggestion>> getAddSuggestions() {
        return this.addSuggestions;
    }

    public final C1BN<String> getAddSuggestionsQuery() {
        return this.addSuggestionsQuery;
    }

    public final C22I<ConnectionsEffect> getEffects() {
        return this.effects;
    }

    public final C1BN<HatchShareDestination> getInviteLinkDestination() {
        return this.inviteLinkDestination;
    }

    public final C1BN<ConnectionsOlderActivityState> getOlderActivity() {
        return this.olderActivity;
    }

    public final C1BN<ConnectionsUiState> getUiState() {
        return this.uiState;
    }

    public final C1BN<Boolean> isRefreshing() {
        return this.isRefreshing;
    }

    public final void onPullToRefresh() {
        if (AnonymousClass003.A1Z(this._isRefreshing)) {
            return;
        }
        HtJ htJA14 = C3cI.A14(this._isRefreshing, AnonymousClass001.A0i());
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C128821(htJA14), AEu.A00(this));
    }

    public final void refresh() {
        this.repository.invalidate();
    }

    public final void retry() {
        this._uiState.Af8(ConnectionsUiState.Loading.INSTANCE);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C128871(null), AEu.A00(this));
    }

    private final String newRequestId() {
        return AnonymousClass001.A0u(AnonymousClass002.A0k());
    }

    public final void loadOlderActivity() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C128801(null), AEu.A00(this));
    }

    public final void onSurfaceOpened() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C128831(null), AEu.A00(this));
    }
}
