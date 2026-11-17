package com.facebook.aura.pairs;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BLG;
import X.C06H;
import X.C0881AGi;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.pairs.ConnectionsTabSnapshot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ConnectionsTabStore implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BLG<ConnectionsOlderActivityState> _olderActivity;
    public final BLG<ConnectionsTabSnapshot> _snapshot;
    public final AtomicBoolean hasStarted;
    public final C1BN<ConnectionsOlderActivityState> olderActivity;
    public final SingleFlight olderFlight;
    public final SingleFlight refreshFlight;
    public final C1BN<ConnectionsTabSnapshot> snapshot;
    public volatile List<PairsSuggestion> suggestions;
    public final AbstractC3358CGz userSession;

    public final class LoadedFeed {
        public final boolean hasLoadedOlder;
        public final List<PeerActivityJson> items;
        public final String nextCursor;

        public LoadedFeed(List<PeerActivityJson> list, String str, boolean z) {
            C7384Etj.A0Y(list, 0);
            this.items = list;
            this.nextCursor = str;
            this.hasLoadedOlder = z;
        }

        public final boolean getHasLoadedOlder() {
            return this.hasLoadedOlder;
        }

        public final List<PeerActivityJson> getItems() {
            return this.items;
        }

        public final String getNextCursor() {
            return this.nextCursor;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsTabStore", f = "ConnectionsTabStore.kt", l = {111}, m = "directory", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsTabStore$directory$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionsTabStore.this.directory(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsTabStore", f = "ConnectionsTabStore.kt", l = {156, 156}, m = "firstActivityPage", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsTabStore$firstActivityPage$1, reason: invalid class name and case insensitive filesystem */
    public final class C128661 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C128661(HtJ<? super C128661> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionsTabStore.this.firstActivityPage(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsTabStore", f = "ConnectionsTabStore.kt", l = {174}, m = "followUnknownPages", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsTabStore$followUnknownPages$1, reason: invalid class name and case insensitive filesystem */
    public final class C128671 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C128671(HtJ<? super C128671> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionsTabStore.this.followUnknownPages(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsTabStore", f = "ConnectionsTabStore.kt", l = {75}, m = "load", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsTabStore$load$1, reason: invalid class name and case insensitive filesystem */
    public final class C128681 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C128681(HtJ<? super C128681> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionsTabStore.this.load(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsTabStore$load$2", f = "ConnectionsTabStore.kt", l = {83, 87, 88, 90, AuraWaitlistConfettiKt.StandardParticleCount}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsTabStore$load$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConnectionsTabSnapshot>, Object> {
        public final /* synthetic */ PairsRepository $repository;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PairsRepository pairsRepository, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$repository = pairsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = ConnectionsTabStore.this.new AnonymousClass2(this.$repository, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0060 A[PHI: r6
  0x0060: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String) binds: [B:24:0x0056, B:26:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0127 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0150 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0183 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0184  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 395
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsTabStore.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ConnectionsTabSnapshot> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsTabStore", f = "ConnectionsTabStore.kt", l = {118}, m = "loadOlderActivity", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsTabStore$loadOlderActivity$1, reason: invalid class name and case insensitive filesystem */
    public final class C128691 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C128691(HtJ<? super C128691> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionsTabStore.this.loadOlderActivity(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsTabStore$loadOlderActivity$2", f = "ConnectionsTabStore.kt", l = {125, 125}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsTabStore$loadOlderActivity$2, reason: invalid class name and case insensitive filesystem */
    public final class C128702 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        public C128702(HtJ<? super C128702> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ConnectionsTabStore.this.new C128702(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ConnectionsTabStore.this.new C128702(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            ConnectionsTabSnapshot.Loaded loaded;
            String str;
            PairsRepository companion;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            ConnectionsActivityPage connectionsActivityPage = null;
            try {
                try {
                } catch (PairsException e) {
                    CFK.A0H(ConnectionsTabStoreKt.TAG, "older activity failed: %s", e.error);
                    obj2 = ConnectionsOlderActivityState.FAILED;
                }
                if (i == 0) {
                    Hwg.A00(obj);
                    ConnectionsTabSnapshot value = ConnectionsTabStore.this._snapshot.getValue();
                    if ((value instanceof ConnectionsTabSnapshot.Loaded) && (loaded = (ConnectionsTabSnapshot.Loaded) value) != null && (str = loaded.feedCursor) != null) {
                        AnonymousClass001.A1E(ConnectionsTabStore.this._olderActivity, null, ConnectionsOlderActivityState.LOADING);
                        obj2 = ConnectionsOlderActivityState.IDLE;
                        companion = PairsRepository.Companion.getInstance(ConnectionsTabStore.this.userSession);
                        this.L$0 = str;
                        this.L$1 = obj2;
                        this.L$2 = companion;
                        this.label = 1;
                        obj = companion.activityPage(str, this);
                        if (obj == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    obj2 = this.L$1;
                    str = (String) this.L$0;
                    Hwg.A00(obj);
                    connectionsActivityPage = (ConnectionsActivityPage) obj;
                    ConnectionsTabStore.this.appendOlderPage(str, connectionsActivityPage);
                    return Unit.INSTANCE;
                }
                companion = (PairsRepository) this.L$2;
                obj2 = this.L$1;
                str = (String) this.L$0;
                Hwg.A00(obj);
                ConnectionsActivityPage connectionsActivityPage2 = (ConnectionsActivityPage) obj;
                if (connectionsActivityPage2 != null) {
                    ConnectionsTabStore connectionsTabStore = ConnectionsTabStore.this;
                    this.L$0 = str;
                    this.L$1 = obj2;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 2;
                    obj = connectionsTabStore.followUnknownPages(companion, connectionsActivityPage2, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                    connectionsActivityPage = (ConnectionsActivityPage) obj;
                }
                ConnectionsTabStore.this.appendOlderPage(str, connectionsActivityPage);
                return Unit.INSTANCE;
            } finally {
                ConnectionsTabStore.this._olderActivity.Af8(obj2);
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsTabStore", f = "ConnectionsTabStore.kt", l = {207}, m = "loadSuggestions", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsTabStore$loadSuggestions$1, reason: invalid class name and case insensitive filesystem */
    public final class C128711 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C128711(HtJ<? super C128711> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionsTabStore.this.loadSuggestions(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsTabStore", f = "ConnectionsTabStore.kt", l = {54}, m = "refresh", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsTabStore$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C128721 extends HzP {
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C128721(HtJ<? super C128721> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionsTabStore.this.refresh(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsTabStore$refresh$2", f = "ConnectionsTabStore.kt", l = {57}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsTabStore$refresh$2, reason: invalid class name and case insensitive filesystem */
    public final class C128732 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $refetchSuggestions;
        public Object L$0;
        public int label;
        public final /* synthetic */ ConnectionsTabStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128732(boolean z, ConnectionsTabStore connectionsTabStore, HtJ<? super C128732> htJ) {
            super(1, htJ);
            this.$refetchSuggestions = z;
            this.this$0 = connectionsTabStore;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new C128732(this.$refetchSuggestions, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BLG blg;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                CFK.A05(ConnectionsTabStoreKt.TAG, "refresh");
                if (this.$refetchSuggestions) {
                    this.this$0.suggestions = null;
                }
                ConnectionsTabStore connectionsTabStore = this.this$0;
                blg = connectionsTabStore._snapshot;
                this.L$0 = blg;
                this.label = 1;
                obj = connectionsTabStore.load(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                blg = (BLG) this.L$0;
                Hwg.A00(obj);
            }
            blg.Af8(obj);
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C128732) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadedFeed withOlderFeed(ConnectionsActivityPage connectionsActivityPage) {
        Long lValueOf = null;
        if (connectionsActivityPage == null) {
            return null;
        }
        ConnectionsTabSnapshot value = this._snapshot.getValue();
        ConnectionsTabSnapshot.Loaded loaded = value instanceof ConnectionsTabSnapshot.Loaded ? (ConnectionsTabSnapshot.Loaded) value : null;
        Iterator<PeerActivityJson> it = connectionsActivityPage.items.iterator();
        if (it.hasNext()) {
            lValueOf = Long.valueOf(it.next().at_ms);
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(it.next().at_ms);
                if (lValueOf.compareTo(lValueOf2) > 0) {
                    lValueOf = lValueOf2;
                }
            }
        }
        if (loaded != null && loaded.hasLoadedOlderFeed && lValueOf != null) {
            List<PeerActivityJson> list = connectionsActivityPage.items;
            HashSet hashSetA13 = C60O.A13();
            Iterator<PeerActivityJson> it2 = list.iterator();
            while (it2.hasNext()) {
                hashSetA13.add(it2.next().activity_id);
            }
            List list2 = loaded.feed;
            if (list2 == null) {
                list2 = C0881AGi.A00;
            }
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (hashSetA13.contains(((PeerActivityJson) it3.next()).activity_id)) {
                        List list3 = loaded.feed;
                        if (list3 == null) {
                            list3 = C0881AGi.A00;
                        }
                        ArrayList arrayListA0h = C3cG.A0h();
                        for (Object obj : list3) {
                            PeerActivityJson peerActivityJson = (PeerActivityJson) obj;
                            if (!hashSetA13.contains(peerActivityJson.activity_id) && peerActivityJson.at_ms <= lValueOf.longValue()) {
                                arrayListA0h.add(obj);
                            }
                        }
                        return new LoadedFeed(AbstractC0878AGe.A0P(arrayListA0h, connectionsActivityPage.items), loaded.feedCursor, true);
                    }
                }
            }
        }
        return new LoadedFeed(connectionsActivityPage.items, connectionsActivityPage.nextCursor, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void appendOlderPage(String str, ConnectionsActivityPage connectionsActivityPage) {
        ConnectionsTabSnapshot.Loaded loaded;
        List list;
        ConnectionsTabSnapshot value = this._snapshot.getValue();
        if ((value instanceof ConnectionsTabSnapshot.Loaded) && (loaded = (ConnectionsTabSnapshot.Loaded) value) != null && C7384Etj.areEqual(loaded.feedCursor, str)) {
            List list2 = loaded.feed;
            if (list2 == null) {
                list2 = C0881AGi.A00;
            }
            HashSet hashSetA13 = C60O.A13();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                hashSetA13.add(((PeerActivityJson) it.next()).activity_id);
            }
            BLG<ConnectionsTabSnapshot> blg = this._snapshot;
            PairsHubSnapshot pairsHubSnapshot = loaded.hub;
            if (connectionsActivityPage == null || (list = connectionsActivityPage.items) == null) {
                list = C0881AGi.A00;
            }
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj : list) {
                C60R.A1I(((PeerActivityJson) obj).activity_id, obj, hashSetA13, arrayListA0h);
            }
            AnonymousClass002.A1I(blg, new ConnectionsTabSnapshot.Loaded(pairsHubSnapshot, AbstractC0878AGe.A0P(arrayListA0h, list2), loaded.suggestions, loaded.groups, loaded.people, connectionsActivityPage != null ? connectionsActivityPage.nextCursor : null, true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object directory(com.facebook.aura.pairs.PairsRepository r6, X.HtJ<? super com.facebook.aura.pairs.ConnectionsDirectory> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.pairs.ConnectionsTabStore.AnonymousClass1
            if (r0 == 0) goto L1e
            r4 = r7
            com.facebook.aura.pairs.ConnectionsTabStore$directory$1 r4 = (com.facebook.aura.pairs.ConnectionsTabStore.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L28
            goto L24
        L1e:
            com.facebook.aura.pairs.ConnectionsTabStore$directory$1 r4 = new com.facebook.aura.pairs.ConnectionsTabStore$directory$1
            r4.<init>(r7)
            goto L12
        L24:
            X.Hwg.A00(r3)     // Catch: com.facebook.aura.pairs.PairsException -> L3d
            return r3
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0     // Catch: com.facebook.aura.pairs.PairsException -> L3d
            r4.label = r1     // Catch: com.facebook.aura.pairs.PairsException -> L3d
            java.lang.Object r3 = r6.directory(r4)     // Catch: com.facebook.aura.pairs.PairsException -> L3d
            if (r3 != r2) goto L3c
            return r2
        L3c:
            return r3
        L3d:
            r0 = move-exception
            java.lang.Object[] r2 = X.C60Q.A1Z(r0)
            java.lang.String r1 = "ConnectionsTabStore"
            java.lang.String r0 = "connections directory failed: %s"
            X.CFK.A0H(r1, r0, r2)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsTabStore.directory(com.facebook.aura.pairs.PairsRepository, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object firstActivityPage(com.facebook.aura.pairs.PairsRepository r8, X.HtJ<? super com.facebook.aura.pairs.ConnectionsActivityPage> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.pairs.ConnectionsTabStore.C128661
            if (r0 == 0) goto L22
            r6 = r9
            com.facebook.aura.pairs.ConnectionsTabStore$firstActivityPage$1 r6 = (com.facebook.aura.pairs.ConnectionsTabStore.C128661) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r2 = r6.label
            r1 = 2
            r3 = 0
            r0 = 1
            if (r2 == 0) goto L36
            if (r2 == r0) goto L31
            if (r2 != r1) goto L2c
            goto L28
        L22:
            com.facebook.aura.pairs.ConnectionsTabStore$firstActivityPage$1 r6 = new com.facebook.aura.pairs.ConnectionsTabStore$firstActivityPage$1
            r6.<init>(r9)
            goto L12
        L28:
            X.Hwg.A00(r5)     // Catch: com.facebook.aura.pairs.PairsException -> L5a
            return r5
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            java.lang.Object r8 = r6.L$0
            com.facebook.aura.pairs.PairsRepository r8 = (com.facebook.aura.pairs.PairsRepository) r8
            goto L44
        L36:
            X.Hwg.A00(r5)
            r6.L$0 = r8     // Catch: com.facebook.aura.pairs.PairsException -> L5a
            r6.label = r0     // Catch: com.facebook.aura.pairs.PairsException -> L5a
            java.lang.Object r5 = r8.activityPage(r3, r6)     // Catch: com.facebook.aura.pairs.PairsException -> L5a
            if (r5 != r4) goto L47
            return r4
        L44:
            X.Hwg.A00(r5)     // Catch: com.facebook.aura.pairs.PairsException -> L5a
        L47:
            com.facebook.aura.pairs.ConnectionsActivityPage r5 = (com.facebook.aura.pairs.ConnectionsActivityPage) r5     // Catch: com.facebook.aura.pairs.PairsException -> L5a
            if (r5 == 0) goto L59
            r6.L$0 = r3     // Catch: com.facebook.aura.pairs.PairsException -> L5a
            r6.L$1 = r3     // Catch: com.facebook.aura.pairs.PairsException -> L5a
            r6.label = r1     // Catch: com.facebook.aura.pairs.PairsException -> L5a
            java.lang.Object r5 = r7.followUnknownPages(r8, r5, r6)     // Catch: com.facebook.aura.pairs.PairsException -> L5a
            if (r5 != r4) goto L58
            return r4
        L58:
            return r5
        L59:
            return r3
        L5a:
            r0 = move-exception
            java.lang.Object[] r2 = X.C60Q.A1Z(r0)
            java.lang.String r1 = "ConnectionsTabStore"
            java.lang.String r0 = "activity feed failed: %s"
            X.CFK.A0H(r1, r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsTabStore.firstActivityPage(com.facebook.aura.pairs.PairsRepository, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Path cross not found for [B:19:0x0046, B:24:0x0060], limit reached: 38 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005d -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object followUnknownPages(com.facebook.aura.pairs.PairsRepository r9, com.facebook.aura.pairs.ConnectionsActivityPage r10, X.HtJ<? super com.facebook.aura.pairs.ConnectionsActivityPage> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.facebook.aura.pairs.ConnectionsTabStore.C128671
            if (r0 == 0) goto L89
            r4 = r11
            com.facebook.aura.pairs.ConnectionsTabStore$followUnknownPages$1 r4 = (com.facebook.aura.pairs.ConnectionsTabStore.C128671) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L89
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r5 = 1
            if (r0 == 0) goto L7c
            if (r0 != r5) goto L8f
            int r7 = r4.I$0
            java.lang.Object r8 = r4.L$3
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r3 = r4.L$2
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r9 = r4.L$0
            com.facebook.aura.pairs.PairsRepository r9 = (com.facebook.aura.pairs.PairsRepository) r9
            X.Hwg.A00(r1)
        L2e:
            com.facebook.aura.pairs.ConnectionsActivityPage r1 = (com.facebook.aura.pairs.ConnectionsActivityPage) r1
            if (r1 == 0) goto L76
            java.util.List<com.facebook.aura.pairs.PeerActivityJson> r0 = r1.items
            X.AbstractC0882AGj.A0r(r0, r3)
            java.lang.String r8 = r1.nextCursor
            int r7 = r7 + 1
        L3b:
            if (r8 == 0) goto L76
            r0 = 5
            if (r7 >= r0) goto L76
            com.facebook.aura.pairs.ConnectionsActivityRules r2 = com.facebook.aura.pairs.ConnectionsActivityRules.INSTANCE
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L60
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L60
        L4c:
            r4.L$0 = r9
            r0 = 0
            r4.L$1 = r0
            r4.L$2 = r3
            r4.L$3 = r8
            r4.I$0 = r7
            r4.label = r5
            java.lang.Object r1 = r9.activityPage(r8, r4)
            if (r1 != r6) goto L2e
            return r6
        L60:
            java.util.Iterator r1 = r3.iterator()
        L64:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r1.next()
            com.facebook.aura.pairs.PeerActivityJson r0 = (com.facebook.aura.pairs.PeerActivityJson) r0
            boolean r0 = r2.isKnown(r0)
            if (r0 == 0) goto L64
        L76:
            com.facebook.aura.pairs.ConnectionsActivityPage r0 = new com.facebook.aura.pairs.ConnectionsActivityPage
            r0.<init>(r3, r8)
            return r0
        L7c:
            X.Hwg.A00(r1)
            java.util.List<com.facebook.aura.pairs.PeerActivityJson> r0 = r10.items
            java.util.ArrayList r3 = X.AbstractC0878AGe.A0R(r0)
            java.lang.String r8 = r10.nextCursor
            r7 = 0
            goto L3b
        L89:
            com.facebook.aura.pairs.ConnectionsTabStore$followUnknownPages$1 r4 = new com.facebook.aura.pairs.ConnectionsTabStore$followUnknownPages$1
            r4.<init>(r11)
            goto L12
        L8f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsTabStore.followUnknownPages(com.facebook.aura.pairs.PairsRepository, com.facebook.aura.pairs.ConnectionsActivityPage, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(X.HtJ<? super com.facebook.aura.pairs.ConnectionsTabSnapshot> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.pairs.ConnectionsTabStore.C128681
            if (r0 == 0) goto L1e
            r5 = r7
            com.facebook.aura.pairs.ConnectionsTabStore$load$1 r5 = (com.facebook.aura.pairs.ConnectionsTabStore.C128681) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L28
            goto L24
        L1e:
            com.facebook.aura.pairs.ConnectionsTabStore$load$1 r5 = new com.facebook.aura.pairs.ConnectionsTabStore$load$1
            r5.<init>(r7)
            goto L12
        L24:
            X.Hwg.A00(r1)     // Catch: com.facebook.aura.pairs.PairsException -> L51 java.util.concurrent.CancellationException -> L5b
            return r1
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            com.facebook.aura.utils.HatchUtil r0 = com.facebook.aura.utils.HatchUtil.INSTANCE
            boolean r0 = r0.isConnectionsTabEnabled()
            if (r0 == 0) goto L5d
            com.facebook.aura.pairs.PairsRepository$Companion r1 = com.facebook.aura.pairs.PairsRepository.Companion
            X.CGz r0 = r6.userSession
            com.facebook.aura.pairs.PairsRepository r2 = r1.getInstance(r0)
            r1 = 0
            com.facebook.aura.pairs.ConnectionsTabStore$load$2 r0 = new com.facebook.aura.pairs.ConnectionsTabStore$load$2     // Catch: com.facebook.aura.pairs.PairsException -> L51 java.util.concurrent.CancellationException -> L5b
            r0.<init>(r2, r1)     // Catch: com.facebook.aura.pairs.PairsException -> L51 java.util.concurrent.CancellationException -> L5b
            r5.L$0 = r1     // Catch: com.facebook.aura.pairs.PairsException -> L51 java.util.concurrent.CancellationException -> L5b
            r5.label = r3     // Catch: com.facebook.aura.pairs.PairsException -> L51 java.util.concurrent.CancellationException -> L5b
            java.lang.Object r1 = X.Hxb.A00(r0, r5)     // Catch: com.facebook.aura.pairs.PairsException -> L51 java.util.concurrent.CancellationException -> L5b
            if (r1 != r4) goto L5f
            return r4
        L51:
            r0 = move-exception
            com.facebook.aura.pairs.PairsError r1 = r0.error
            com.facebook.aura.pairs.PairsError r0 = com.facebook.aura.pairs.PairsError.UNAVAILABLE
            if (r1 == r0) goto L5d
            com.facebook.aura.pairs.ConnectionsTabSnapshot$Failed r1 = com.facebook.aura.pairs.ConnectionsTabSnapshot.Failed.INSTANCE
            return r1
        L5b:
            r0 = move-exception
            throw r0
        L5d:
            com.facebook.aura.pairs.ConnectionsTabSnapshot$Unavailable r1 = com.facebook.aura.pairs.ConnectionsTabSnapshot.Unavailable.INSTANCE
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsTabStore.load(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadSuggestions(com.facebook.aura.pairs.PairsRepository r6, X.HtJ<? super java.util.List<com.facebook.aura.pairs.PairsSuggestion>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.pairs.ConnectionsTabStore.C128711
            if (r0 == 0) goto L1e
            r4 = r7
            com.facebook.aura.pairs.ConnectionsTabStore$loadSuggestions$1 r4 = (com.facebook.aura.pairs.ConnectionsTabStore.C128711) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L24
            goto L3e
        L1e:
            com.facebook.aura.pairs.ConnectionsTabStore$loadSuggestions$1 r4 = new com.facebook.aura.pairs.ConnectionsTabStore$loadSuggestions$1
            r4.<init>(r7)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r1)
            java.util.List<com.facebook.aura.pairs.PairsSuggestion> r1 = r5.suggestions
            if (r1 != 0) goto L54
            com.facebook.aura.pairs.PairsRecipientPurpose r1 = com.facebook.aura.pairs.PairsRecipientPurpose.ADD_CONNECTION     // Catch: com.facebook.aura.pairs.PairsException -> L46
            r0 = 0
            r4.L$0 = r0     // Catch: com.facebook.aura.pairs.PairsException -> L46
            r4.label = r2     // Catch: com.facebook.aura.pairs.PairsException -> L46
            java.lang.Object r1 = r6.suggestions(r1, r4)     // Catch: com.facebook.aura.pairs.PairsException -> L46
            if (r1 != r3) goto L41
            return r3
        L3e:
            X.Hwg.A00(r1)     // Catch: com.facebook.aura.pairs.PairsException -> L46
        L41:
            java.util.List r1 = (java.util.List) r1     // Catch: com.facebook.aura.pairs.PairsException -> L46
            r5.suggestions = r1     // Catch: com.facebook.aura.pairs.PairsException -> L46
            return r1
        L46:
            r0 = move-exception
            java.lang.Object[] r2 = X.C60Q.A1Z(r0)
            java.lang.String r1 = "ConnectionsTabStore"
            java.lang.String r0 = "suggestions failed: %s"
            X.CFK.A0H(r1, r0, r2)
            X.AGi r1 = X.C0881AGi.A00
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsTabStore.loadSuggestions(com.facebook.aura.pairs.PairsRepository, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.refreshFlight.clearAndCancelAll();
        this.olderFlight.clearAndCancelAll();
        C9286GCn.A00(null, ConnectionsOlderActivityState.IDLE, (C9286GCn) this._olderActivity);
        this._snapshot.Af8(null);
        this.suggestions = null;
    }

    public final C1BN<ConnectionsOlderActivityState> getOlderActivity() {
        return this.olderActivity;
    }

    public final C1BN<ConnectionsTabSnapshot> getSnapshot() {
        return this.snapshot;
    }

    public final Object loadIfNeeded(HtJ<? super Unit> htJ) {
        Object objRefresh;
        return ((this._snapshot.getValue() instanceof ConnectionsTabSnapshot.Loaded) || (objRefresh = refresh(false, htJ)) != EnumC10460Hji.A02) ? Unit.INSTANCE : objRefresh;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadOlderActivity(X.HtJ<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.pairs.ConnectionsTabStore.C128691
            if (r0 == 0) goto L39
            r5 = r7
            com.facebook.aura.pairs.ConnectionsTabStore$loadOlderActivity$1 r5 = (com.facebook.aura.pairs.ConnectionsTabStore.C128691) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L3f
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            com.facebook.aura.common.coroutines.SingleFlight r2 = r6.olderFlight
            r0 = 0
            com.facebook.aura.pairs.ConnectionsTabStore$loadOlderActivity$2 r1 = new com.facebook.aura.pairs.ConnectionsTabStore$loadOlderActivity$2
            r1.<init>(r0)
            r5.label = r3
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r2.invoke(r0, r1, r5)
            if (r0 != r4) goto L20
            return r4
        L39:
            com.facebook.aura.pairs.ConnectionsTabStore$loadOlderActivity$1 r5 = new com.facebook.aura.pairs.ConnectionsTabStore$loadOlderActivity$1
            r5.<init>(r7)
            goto L12
        L3f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsTabStore.loadOlderActivity(X.HtJ):java.lang.Object");
    }

    public final boolean markStarted() {
        return C3cI.A1W(this.hasStarted);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(boolean r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.pairs.ConnectionsTabStore.C128721
            if (r0 == 0) goto L3b
            r5 = r8
            com.facebook.aura.pairs.ConnectionsTabStore$refresh$1 r5 = (com.facebook.aura.pairs.ConnectionsTabStore.C128721) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L41
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            com.facebook.aura.common.coroutines.SingleFlight r2 = r6.refreshFlight
            r0 = 0
            com.facebook.aura.pairs.ConnectionsTabStore$refresh$2 r1 = new com.facebook.aura.pairs.ConnectionsTabStore$refresh$2
            r1.<init>(r7, r6, r0)
            r5.Z$0 = r7
            r5.label = r3
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r2.invoke(r0, r1, r5)
            if (r0 != r4) goto L20
            return r4
        L3b:
            com.facebook.aura.pairs.ConnectionsTabStore$refresh$1 r5 = new com.facebook.aura.pairs.ConnectionsTabStore$refresh$1
            r5.<init>(r8)
            goto L12
        L41:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsTabStore.refresh(boolean, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final ConnectionsTabStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ConnectionsTabStore) abstractC3358CGz.A03(ConnectionsTabStore.class, new ConnectionsTabStore$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ConnectionsTabStore(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCnA13 = C3cG.A13();
        this._snapshot = c9286GCnA13;
        this.snapshot = C3cG.A11(c9286GCnA13);
        OnDuplicateCall.Join join = OnDuplicateCall.Join.INSTANCE;
        this.refreshFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, join, false);
        this.olderFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, join, false);
        C9286GCn c9286GCnA14 = C3cG.A14(ConnectionsOlderActivityState.IDLE);
        this._olderActivity = c9286GCnA14;
        this.olderActivity = C3cG.A11(c9286GCnA14);
        this.hasStarted = new AtomicBoolean(false);
    }

    public /* synthetic */ ConnectionsTabStore(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
