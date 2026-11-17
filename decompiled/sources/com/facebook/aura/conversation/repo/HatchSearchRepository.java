package com.facebook.aura.conversation.repo;

import X.AGH;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BLG;
import X.C06H;
import X.C0881AGi;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C7384Etj;
import X.C8eO;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.InterfaceC7549F2g;
import com.facebook.aura.conversation.data.HatchSearchHit;
import com.facebook.aura.conversation.data.HatchSearchResult;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchSearchRepository implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public static final long DEBOUNCE_MS = 300;
    public static final String TAG = "HatchSearchRepository";
    public final BLG<HatchSearchUiState> _uiState;
    public String currentSearchQuery;
    public final C3UX scope;
    public Map<String, HatchSearchScrollAnchor> scrollAnchors;
    public HoC searchJob;
    public final C1BN<HatchSearchUiState> uiState;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchSearchRepository$loadMoreSearchResults$2", f = "HatchSearchRepository.kt", l = {143}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchSearchRepository$loadMoreSearchResults$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $cursor;
        public final /* synthetic */ String $query;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, long j, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$query = str;
            this.$cursor = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchSearchRepository.this.new AnonymousClass2(this.$query, this.$cursor, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchSearchUiState value;
            String str;
            AHD<HatchSearchHit> ahd;
            boolean z;
            boolean z2;
            Long l;
            HatchSearchUiState value2;
            AHD ahdA07;
            boolean z3;
            Long l2;
            String str2;
            boolean z4;
            boolean z5;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchSearchRepository hatchSearchRepository = HatchSearchRepository.this;
                    String str3 = this.$query;
                    Long l3 = new Long(this.$cursor);
                    this.label = 1;
                    obj = hatchSearchRepository.searchChat(str3, l3, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                HatchSearchResult hatchSearchResult = (HatchSearchResult) obj;
                List<HatchSearchHit> list = hatchSearchResult != null ? hatchSearchResult.hits : null;
                if (list == null) {
                    list = C0881AGi.A00;
                }
                BLG<HatchSearchUiState> blg = HatchSearchRepository.this._uiState;
                do {
                    value2 = blg.getValue();
                    HatchSearchUiState hatchSearchUiState = value2;
                    ahdA07 = AGI.A07(AbstractC0878AGe.A0P(list, hatchSearchUiState.results));
                    z3 = hatchSearchResult != null ? hatchSearchResult.hasMore : false;
                    if (hatchSearchResult == null || (l2 = hatchSearchResult.nextBeforeRowId) == null) {
                        l2 = hatchSearchUiState.nextBeforeRowId;
                    }
                    str2 = hatchSearchUiState.query;
                    z4 = hatchSearchUiState.isLoading;
                    z5 = hatchSearchUiState.isError;
                    AnonymousClass003.A0u(str2, ahdA07);
                } while (!blg.A6e(value2, new HatchSearchUiState(str2, ahdA07, z4, z5, z3, false, l2)));
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A06(HatchSearchRepository.TAG, FGI.A0M("Search load more failed: ", e2.getMessage()));
                BLG<HatchSearchUiState> blg2 = HatchSearchRepository.this._uiState;
                do {
                    value = blg2.getValue();
                    HatchSearchUiState hatchSearchUiState2 = value;
                    str = hatchSearchUiState2.query;
                    ahd = hatchSearchUiState2.results;
                    z = hatchSearchUiState2.isLoading;
                    z2 = hatchSearchUiState2.isError;
                    l = hatchSearchUiState2.nextBeforeRowId;
                    AnonymousClass003.A0u(str, ahd);
                } while (!blg2.A6e(value, new HatchSearchUiState(str, ahd, z, z2, false, false, l)));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchSearchRepository$searchMessages$2", f = "HatchSearchRepository.kt", l = {111, 113}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchSearchRepository$searchMessages$2, reason: invalid class name and case insensitive filesystem */
    public final class C113852 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $trimmed;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113852(String str, HtJ<? super C113852> htJ) {
            super(2, htJ);
            this.$trimmed = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchSearchRepository.this.new C113852(this.$trimmed, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x004e A[Catch: Exception -> 0x0069, CancellationException -> 0x0092, TryCatch #2 {CancellationException -> 0x0092, Exception -> 0x0069, blocks: (B:16:0x0037, B:17:0x003a, B:19:0x0044, B:21:0x0048, B:25:0x0052, B:30:0x005b, B:31:0x005d, B:23:0x004e, B:13:0x0026), top: B:38:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[Catch: Exception -> 0x0069, CancellationException -> 0x0092, TryCatch #2 {CancellationException -> 0x0092, Exception -> 0x0069, blocks: (B:16:0x0037, B:17:0x003a, B:19:0x0044, B:21:0x0048, B:25:0x0052, B:30:0x005b, B:31:0x005d, B:23:0x004e, B:13:0x0026), top: B:38:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                r15 = this;
                r5 = r16
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r15.label
                r3 = 2
                r13 = 1
                if (r0 == 0) goto L18
                if (r0 == r13) goto L14
                if (r0 != r3) goto Lf
                goto L37
            Lf:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L14:
                X.Hwg.A00(r5)
                goto L26
            L18:
                X.Hwg.A00(r5)
                r15.label = r13
                r0 = 300(0x12c, double:1.48E-321)
                java.lang.Object r0 = X.C7Bq.A01(r0, r15)
                if (r0 != r4) goto L26
                return r4
            L26:
                com.facebook.aura.conversation.repo.HatchSearchRepository r5 = com.facebook.aura.conversation.repo.HatchSearchRepository.this     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L92
                java.lang.String r6 = r15.$trimmed     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L92
                r15.label = r3     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L92
                r7 = 0
                r10 = r7
                r9 = r3
                r8 = r15
                java.lang.Object r5 = com.facebook.aura.conversation.repo.HatchSearchRepository.searchChat$default(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L92
                if (r5 != r4) goto L3a
                return r4
            L37:
                X.Hwg.A00(r5)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L92
            L3a:
                com.facebook.aura.conversation.data.HatchSearchResult r5 = (com.facebook.aura.conversation.data.HatchSearchResult) r5     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L92
                com.facebook.aura.conversation.repo.HatchSearchRepository r0 = com.facebook.aura.conversation.repo.HatchSearchRepository.this     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L92
                X.BLG<com.facebook.aura.conversation.repo.HatchSearchUiState> r1 = r0._uiState     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L92
                java.lang.String r6 = r15.$trimmed     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L92
                if (r5 == 0) goto L4e
                java.util.List<com.facebook.aura.conversation.data.HatchSearchHit> r0 = r5.hits     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L92
                if (r0 == 0) goto L4e
                X.AHD r7 = X.AGI.A07(r0)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L92
                if (r7 != 0) goto L50
            L4e:
                X.AHI r7 = X.AHI.A01     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L92
            L50:
                if (r5 == 0) goto L55
                boolean r10 = r5.hasMore     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L92
                goto L56
            L55:
                r10 = 0
            L56:
                if (r5 == 0) goto L59
                goto L5b
            L59:
                r12 = 0
                goto L5d
            L5b:
                java.lang.Long r12 = r5.nextBeforeRowId     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L92
            L5d:
                r8 = 0
                com.facebook.aura.conversation.repo.HatchSearchUiState r5 = new com.facebook.aura.conversation.repo.HatchSearchUiState     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L92
                r9 = r8
                r11 = r8
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L92
                X.AnonymousClass002.A1I(r1, r5)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L92
                goto L8f
            L69:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                java.lang.String r0 = "Search failed: "
                java.lang.String r1 = X.FGI.A0M(r0, r1)
                java.lang.String r0 = "HatchSearchRepository"
                X.CFK.A06(r0, r1)
                com.facebook.aura.conversation.repo.HatchSearchRepository r0 = com.facebook.aura.conversation.repo.HatchSearchRepository.this
                X.BLG<com.facebook.aura.conversation.repo.HatchSearchUiState> r1 = r0._uiState
                java.lang.String r10 = r15.$trimmed
                r0 = 0
                X.AHI r11 = X.AHI.A01
                r12 = 0
                com.facebook.aura.conversation.repo.HatchSearchUiState r9 = new com.facebook.aura.conversation.repo.HatchSearchUiState
                r14 = r12
                r15 = r12
                r16 = r0
                r9.<init>(r10, r11, r12, r13, r14, r15, r16)
                X.AnonymousClass001.A1E(r1, r0, r9)
            L8f:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L92:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchSearchRepository.C113852.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C113852) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchSearchRepository(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.scope = Hxb.A02(new C8eO(null).plus(AuraDispatchers.INSTANCE.m764default()));
        C9286GCn c9286GCn = new C9286GCn(new HatchSearchUiState("", AHI.A01, false, false, false, false, null));
        this._uiState = c9286GCn;
        this.uiState = new C3Pi(null, c9286GCn);
        this.scrollAnchors = AGH.A0E();
    }

    public final void loadMoreSearchResults() {
        String str;
        HatchSearchUiState value;
        String str2;
        AHD<HatchSearchHit> ahd;
        boolean z;
        boolean z2;
        boolean z3;
        Long l;
        HatchSearchHit hatchSearchHit;
        HatchSearchUiState value2 = this._uiState.getValue();
        if (!value2.hasMore || value2.isLoading || value2.isLoadingMore || (str = this.currentSearchQuery) == null) {
            return;
        }
        Long l2 = value2.nextBeforeRowId;
        if (l2 == null && ((hatchSearchHit = (HatchSearchHit) AbstractC0878AGe.A0I(value2.results)) == null || (l2 = hatchSearchHit.rowId) == null)) {
            return;
        }
        long jLongValue = l2.longValue();
        BLG<HatchSearchUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            HatchSearchUiState hatchSearchUiState = value;
            str2 = hatchSearchUiState.query;
            ahd = hatchSearchUiState.results;
            z = hatchSearchUiState.isLoading;
            z2 = hatchSearchUiState.isError;
            z3 = hatchSearchUiState.hasMore;
            l = hatchSearchUiState.nextBeforeRowId;
            AnonymousClass003.A0u(str2, ahd);
        } while (!blg.A6e(value, new HatchSearchUiState(str2, ahd, z, z2, z3, true, l)));
        this.searchJob = AnonymousClass001.A11(new AnonymousClass2(str, jLongValue, null), this.scope);
    }

    public final void recordScrollAnchor(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        String str2 = this._uiState.getValue().query;
        int length = str2.length();
        Map<String, HatchSearchScrollAnchor> map = this.scrollAnchors;
        this.scrollAnchors = length == 0 ? AGH.A09(str, map) : AnonymousClass006.A11(str, new HatchSearchScrollAnchor(str2, i, i2), map);
    }

    public final void searchMessages(String str) {
        HatchSearchUiState value;
        AHD<HatchSearchHit> ahd;
        boolean z;
        Long l;
        C7384Etj.A0Y(str, 0);
        HoC hoC = this.searchJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() == 0) {
            this.currentSearchQuery = null;
            AnonymousClass001.A1E(this._uiState, null, new HatchSearchUiState("", AHI.A01, false, false, false, false, null));
            return;
        }
        this.currentSearchQuery = strA0l;
        BLG<HatchSearchUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            HatchSearchUiState hatchSearchUiState = value;
            ahd = hatchSearchUiState.results;
            z = hatchSearchUiState.hasMore;
            l = hatchSearchUiState.nextBeforeRowId;
            AnonymousClass003.A0u(strA0l, ahd);
        } while (!blg.A6e(value, new HatchSearchUiState(strA0l, ahd, true, false, z, false, l)));
        this.searchJob = AnonymousClass001.A11(new C113852(strA0l, null), this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object searchChat(String str, Long l, HtJ<? super HatchSearchResult> htJ) {
        return HatchGatewayServiceManager.INSTANCE.getGateway(this.userSession).searchChat(str, 20, true, l, htJ);
    }

    public static /* synthetic */ Object searchChat$default(HatchSearchRepository hatchSearchRepository, String str, Long l, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        return hatchSearchRepository.searchChat(str, l, htJ);
    }

    public final void clearSearch() {
        HoC hoC = this.searchJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.searchJob = null;
        this.currentSearchQuery = null;
        this.scrollAnchors = AGH.A0E();
        AnonymousClass001.A1E(this._uiState, null, new HatchSearchUiState("", AHI.A01, false, false, false, false, null));
    }

    public final C1BN<HatchSearchUiState> getUiState() {
        return this.uiState;
    }

    public final class Companion {
        public final HatchSearchRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchSearchRepository) abstractC3358CGz.A03(HatchSearchRepository.class, new HatchSearchRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final HatchSearchScrollAnchor scrollAnchorFor(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        HatchSearchScrollAnchor hatchSearchScrollAnchor = this.scrollAnchors.get(str);
        if (hatchSearchScrollAnchor == null || !str2.equals(hatchSearchScrollAnchor.query)) {
            return null;
        }
        return hatchSearchScrollAnchor;
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        clearSearch();
    }
}
