package com.facebook.aura.skills.viewmodel;

import X.AbstractC05633ui;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass441;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C1BN;
import X.C3Ek;
import X.C3UX;
import X.C7384Etj;
import X.C9286GCn;
import X.G0V;
import X.GDB;
import X.HoC;
import X.HtJ;
import com.facebook.aura.skills.model.ConnectorCatalogPage;
import com.facebook.aura.skills.model.ConnectorCatalogQuery;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class ConnectorPager {
    public final HatchConnectorCatalogRepository repository;
    public final BLG<Request> request;
    public HoC requestJob;
    public long requestVersion;
    public final C3UX scope;
    public final C1BN<ConnectorPagerState> state;

    public final class Request extends C06G {
        public final ConnectorCatalogQuery query;
        public final ConnectorLoadStatus status;

        public Request(ConnectorCatalogQuery connectorCatalogQuery, ConnectorLoadStatus connectorLoadStatus) {
            C7384Etj.A0Y(connectorLoadStatus, 1);
            this.query = connectorCatalogQuery;
            this.status = connectorLoadStatus;
        }

        public final Request copy(ConnectorCatalogQuery connectorCatalogQuery, ConnectorLoadStatus connectorLoadStatus) {
            C7384Etj.A0Y(connectorLoadStatus, 1);
            return new Request(connectorCatalogQuery, connectorLoadStatus);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Request) {
                    Request request = (Request) obj;
                    if (!C7384Etj.areEqual(this.query, request.query) || this.status != request.status) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Request copy$default(Request request, ConnectorCatalogQuery connectorCatalogQuery, ConnectorLoadStatus connectorLoadStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                connectorCatalogQuery = request.query;
            }
            if ((i & 2) != 0) {
                connectorLoadStatus = request.status;
            }
            C7384Etj.A0Y(connectorLoadStatus, 1);
            return new Request(connectorCatalogQuery, connectorLoadStatus);
        }

        public final ConnectorCatalogQuery component1() {
            return this.query;
        }

        public final ConnectorLoadStatus component2() {
            return this.status;
        }

        public final ConnectorCatalogQuery getQuery() {
            return this.query;
        }

        public final ConnectorLoadStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.status, AnonymousClass006.A0D(this.query) * 31);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Request(ConnectorCatalogQuery connectorCatalogQuery, ConnectorLoadStatus connectorLoadStatus, int i, C06H c06h) {
            this(connectorCatalogQuery, (i & 2) != 0 ? ConnectorLoadStatus.IDLE : connectorLoadStatus);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.ConnectorPager$requestPage$1", f = "ConnectorPager.kt", l = {136, 140, 148}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.ConnectorPager$requestPage$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $cursor;
        public final /* synthetic */ long $debounceMs;
        public final /* synthetic */ ConnectorLoadStatus $loadingStatus;
        public final /* synthetic */ ConnectorCatalogQuery $query;
        public final /* synthetic */ long $version;
        public Object L$0;
        public int label;
        public final /* synthetic */ ConnectorPager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, ConnectorPager connectorPager, ConnectorCatalogQuery connectorCatalogQuery, ConnectorLoadStatus connectorLoadStatus, String str, long j2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$debounceMs = j;
            this.this$0 = connectorPager;
            this.$query = connectorCatalogQuery;
            this.$loadingStatus = connectorLoadStatus;
            this.$cursor = str;
            this.$version = j2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$debounceMs, this.this$0, this.$query, this.$loadingStatus, this.$cursor, this.$version, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0076 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r11.label
                r5 = 3
                r7 = 2
                r4 = 0
                r8 = 1
                if (r0 == 0) goto L3d
                if (r0 == r8) goto L51
                if (r0 == r7) goto L77
                if (r0 != r5) goto Lb9
                java.lang.Object r10 = X.AnonymousClass001.A0q(r12)
            L14:
                long r5 = r11.$version
                com.facebook.aura.skills.viewmodel.ConnectorPager r3 = r11.this$0
                long r1 = r3.requestVersion
                int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r0 != 0) goto L32
                X.BLG<com.facebook.aura.skills.viewmodel.ConnectorPager$Request> r3 = r3.request
                com.facebook.aura.skills.model.ConnectorCatalogQuery r2 = r11.$query
                boolean r0 = r10 instanceof X.C10571Hud
                r0 = r0 ^ 1
                if (r0 == 0) goto L35
                com.facebook.aura.skills.viewmodel.ConnectorLoadStatus r1 = com.facebook.aura.skills.viewmodel.ConnectorLoadStatus.IDLE
            L2a:
                com.facebook.aura.skills.viewmodel.ConnectorPager$Request r0 = new com.facebook.aura.skills.viewmodel.ConnectorPager$Request
                r0.<init>(r2, r1)
                X.AnonymousClass002.A1I(r3, r0)
            L32:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L35:
                if (r4 == 0) goto L3a
                com.facebook.aura.skills.viewmodel.ConnectorLoadStatus r1 = com.facebook.aura.skills.viewmodel.ConnectorLoadStatus.APPEND_ERROR
                goto L2a
            L3a:
                com.facebook.aura.skills.viewmodel.ConnectorLoadStatus r1 = com.facebook.aura.skills.viewmodel.ConnectorLoadStatus.INITIAL_ERROR
                goto L2a
            L3d:
                X.Hwg.A00(r12)
                long r0 = r11.$debounceMs
                r9 = 0
                int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
                if (r2 <= 0) goto L64
                r11.label = r8
                java.lang.Object r0 = X.C7Bq.A01(r0, r11)
                if (r0 != r6) goto L54
                return r6
            L51:
                X.Hwg.A00(r12)
            L54:
                com.facebook.aura.skills.viewmodel.ConnectorPager r0 = r11.this$0
                X.BLG<com.facebook.aura.skills.viewmodel.ConnectorPager$Request> r3 = r0.request
                com.facebook.aura.skills.model.ConnectorCatalogQuery r2 = r11.$query
                com.facebook.aura.skills.viewmodel.ConnectorLoadStatus r1 = r11.$loadingStatus
                com.facebook.aura.skills.viewmodel.ConnectorPager$Request r0 = new com.facebook.aura.skills.viewmodel.ConnectorPager$Request
                r0.<init>(r2, r1)
                X.AnonymousClass001.A1E(r3, r4, r0)
            L64:
                java.lang.String r9 = r11.$cursor
                com.facebook.aura.skills.viewmodel.ConnectorPager r0 = r11.this$0
                com.facebook.aura.skills.repo.HatchConnectorCatalogRepository r1 = r0.repository
                com.facebook.aura.skills.model.ConnectorCatalogQuery r0 = r11.$query
                r11.L$0 = r9
                r11.label = r7
                java.lang.Object r10 = r1.m2121fetchQueryPage0E7RQCE(r0, r9, r11)
                if (r10 != r6) goto L7d
                return r6
            L77:
                java.lang.Object r9 = r11.L$0
                java.lang.Object r10 = X.AnonymousClass001.A0q(r12)
            L7d:
                long r2 = r11.$version
                com.facebook.aura.skills.viewmodel.ConnectorPager r0 = r11.this$0
                long r0 = r0.requestVersion
                int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r7 != 0) goto L32
                if (r9 == 0) goto Lb6
                java.lang.Throwable r0 = X.HsJ.A00(r10)
                if (r0 == 0) goto Lb6
                boolean r0 = com.facebook.aura.skills.repo.HatchConnectorCatalogRepositoryKt.requiresConnectorPageRestart(r0)
                if (r0 != r8) goto Lb6
                com.facebook.aura.skills.viewmodel.ConnectorPager r0 = r11.this$0
                X.BLG<com.facebook.aura.skills.viewmodel.ConnectorPager$Request> r3 = r0.request
                com.facebook.aura.skills.model.ConnectorCatalogQuery r2 = r11.$query
                com.facebook.aura.skills.viewmodel.ConnectorLoadStatus r1 = com.facebook.aura.skills.viewmodel.ConnectorLoadStatus.LOADING
                com.facebook.aura.skills.viewmodel.ConnectorPager$Request r0 = new com.facebook.aura.skills.viewmodel.ConnectorPager$Request
                r0.<init>(r2, r1)
                X.AnonymousClass001.A1E(r3, r4, r0)
                com.facebook.aura.skills.viewmodel.ConnectorPager r0 = r11.this$0
                com.facebook.aura.skills.repo.HatchConnectorCatalogRepository r1 = r0.repository
                com.facebook.aura.skills.model.ConnectorCatalogQuery r0 = r11.$query
                r11.L$0 = r4
                r11.label = r5
                java.lang.Object r10 = r1.m2121fetchQueryPage0E7RQCE(r0, r4, r11)
                if (r10 != r6) goto L14
                return r6
            Lb6:
                r4 = r9
                goto L14
            Lb9:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.viewmodel.ConnectorPager.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void requestPage(String str, boolean z, long j) {
        ConnectorCatalogQuery connectorCatalogQuery = this.request.getValue().query;
        if (connectorCatalogQuery != null) {
            AnonymousClass002.A1K(this.requestJob);
            long j2 = this.requestVersion + 1;
            this.requestVersion = j2;
            ConnectorLoadStatus connectorLoadStatus = str != null ? ConnectorLoadStatus.APPENDING : z ? ConnectorLoadStatus.REFRESHING : ConnectorLoadStatus.LOADING;
            C9286GCn.A00(null, new Request(connectorCatalogQuery, j > 0 ? ConnectorLoadStatus.DEBOUNCING : connectorLoadStatus), (C9286GCn) this.request);
            this.requestJob = AnonymousClass001.A11(new AnonymousClass1(j, this, connectorCatalogQuery, connectorLoadStatus, str, j2, null), this.scope);
        }
    }

    public final void refresh(boolean z) {
        requestPage(null, z, 0L);
    }

    public static /* synthetic */ void selectQuery$default(ConnectorPager connectorPager, ConnectorCatalogQuery connectorCatalogQuery, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        connectorPager.selectQuery(connectorCatalogQuery, j);
    }

    public final void ensureLoaded() {
        ConnectorCatalogQuery connectorCatalogQuery = this.request.getValue().query;
        if (connectorCatalogQuery == null || this.repository.hasRecentPage(connectorCatalogQuery)) {
            return;
        }
        HoC hoC = this.requestJob;
        if (hoC == null || !hoC.isActive()) {
            refresh(false);
        }
    }

    public final C1BN<ConnectorPagerState> getState() {
        return this.state;
    }

    public final void loadNextPage() {
        ConnectorCatalogQuery connectorCatalogQuery;
        String str;
        HoC hoC = this.requestJob;
        if ((hoC == null || !hoC.isActive()) && (connectorCatalogQuery = this.request.getValue().query) != null) {
            if (!this.repository.hasFreshPage(connectorCatalogQuery, false)) {
                refresh(false);
                return;
            }
            ConnectorCatalogPage connectorCatalogPagePage = this.repository.cache.page(connectorCatalogQuery);
            if (connectorCatalogPagePage == null || (str = connectorCatalogPagePage.nextCursor) == null) {
                return;
            }
            requestPage(str, false, 0L);
        }
    }

    public final void retry() {
        if (this.request.getValue().status == ConnectorLoadStatus.APPEND_ERROR) {
            loadNextPage();
        } else {
            refresh(false);
        }
    }

    public final void selectQuery(ConnectorCatalogQuery connectorCatalogQuery, long j) {
        if (C7384Etj.areEqual(connectorCatalogQuery, this.request.getValue().query)) {
            return;
        }
        HoC hoC = this.requestJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.requestVersion++;
        AnonymousClass001.A1E(this.request, null, new Request(connectorCatalogQuery, ConnectorLoadStatus.IDLE));
        if (connectorCatalogQuery != null) {
            requestPage(null, false, j);
        }
    }

    public ConnectorPager(C3UX c3ux, HatchConnectorCatalogRepository hatchConnectorCatalogRepository, ConnectorCatalogQuery connectorCatalogQuery) {
        AnonymousClass003.A0u(c3ux, hatchConnectorCatalogRepository);
        this.scope = c3ux;
        this.repository = hatchConnectorCatalogRepository;
        ConnectorLoadStatus connectorLoadStatus = ConnectorLoadStatus.IDLE;
        C9286GCn c9286GCn = new C9286GCn(new Request(connectorCatalogQuery, connectorLoadStatus));
        this.request = c9286GCn;
        this.state = AnonymousClass441.A00(new ConnectorPagerState(connectorCatalogQuery, connectorCatalogQuery != null ? hatchConnectorCatalogRepository.cache.page(connectorCatalogQuery) : null, connectorLoadStatus), c3ux, AbstractC05633ui.A00(new ConnectorPager$special$$inlined$flatMapLatest$1(null, this), GDB.A01(new ConnectorPager$special$$inlined$map$1(c9286GCn))), C3Ek.A00);
    }

    public static /* synthetic */ void requestPage$default(ConnectorPager connectorPager, String str, boolean z, long j, int i, Object obj) {
        boolean zA1Q = AnonymousClass001.A1Q(i, z);
        if ((i & 4) != 0) {
            j = 0;
        }
        connectorPager.requestPage(str, zA1Q, j);
    }

    public /* synthetic */ ConnectorPager(C3UX c3ux, HatchConnectorCatalogRepository hatchConnectorCatalogRepository, ConnectorCatalogQuery connectorCatalogQuery, int i, C06H c06h) {
        this(c3ux, hatchConnectorCatalogRepository, (i & 4) != 0 ? null : connectorCatalogQuery);
    }
}
