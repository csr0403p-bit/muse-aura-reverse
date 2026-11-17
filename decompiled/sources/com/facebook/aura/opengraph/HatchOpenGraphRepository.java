package com.facebook.aura.opengraph;

import X.AHD;
import X.AHI;
import X.AIW;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C06H;
import X.C0924AIa;
import X.C10571Hud;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C78T;
import X.C7BY;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import com.facebook.aura.memory.AuraByteLruCache;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchHttpResponseBody;
import com.facebook.aura.network.transport.HatchRequestCategory;
import com.facebook.aura.network.transport.HatchRequestPurpose;
import com.facebook.aura.network.transport.HatchResponseBodyPolicy;
import java.io.InputStream;
import java.util.Locale;
import java.util.regex.Matcher;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class HatchOpenGraphRepository {
    public static final String ACCEPT_HEADER = "Accept";
    public static final String ACCEPT_HTML = "text/html,application/xhtml+xml";
    public static final String CONTENT_TYPE_HEADER = "Content-Type";
    public static final Companion Companion = new Companion();
    public static final String HTML_CONTENT_TYPE = "text/html";
    public static final String UNKNOWN_HOST = "?";
    public static final String USER_AGENT_HEADER = "User-Agent";
    public final AuraByteLruCache<String, CacheEntry> cache;
    public final C3UX scope;
    public final SingleFlight singleFlight;
    public final AbstractC3358CGz userSession;

    public final class CacheEntry {
        public final long expiresAtMs;
        public final HatchWebPageMetadata metadata;

        public CacheEntry(HatchWebPageMetadata hatchWebPageMetadata, long j) {
            C7384Etj.A0Y(hatchWebPageMetadata, 0);
            this.metadata = hatchWebPageMetadata;
            this.expiresAtMs = j;
        }

        public final long getExpiresAtMs() {
            return this.expiresAtMs;
        }

        public final HatchWebPageMetadata getMetadata() {
            return this.metadata;
        }
    }

    public interface FetchAttempt {

        public final class Answered implements FetchAttempt {
            public final HatchWebPageMetadata metadata;

            public Answered(HatchWebPageMetadata hatchWebPageMetadata) {
                C7384Etj.A0Y(hatchWebPageMetadata, 0);
                this.metadata = hatchWebPageMetadata;
            }

            public final HatchWebPageMetadata getMetadata() {
                return this.metadata;
            }
        }

        public final class Failed implements FetchAttempt {
            public static final Failed INSTANCE = new Failed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Failed);
            }

            public String toString() {
                return "Failed";
            }

            public int hashCode() {
                return 79323058;
            }
        }

        public final class Refused implements FetchAttempt {
            public final int statusCode;

            public final int getStatusCode() {
                return this.statusCode;
            }

            public Refused(int i) {
                this.statusCode = i;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.opengraph.HatchOpenGraphRepository$fetch$2", f = "HatchOpenGraphRepository.kt", l = {AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.opengraph.HatchOpenGraphRepository$fetch$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super FetchAttempt>, Object> {
        public final /* synthetic */ boolean $asCrawler;
        public final /* synthetic */ String $url;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public boolean Z$0;
        public int label;
        public final /* synthetic */ HatchOpenGraphRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, boolean z, HatchOpenGraphRepository hatchOpenGraphRepository, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$url = str;
            this.$asCrawler = z;
            this.this$0 = hatchOpenGraphRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$url, this.$asCrawler, this.this$0, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objA0s;
            String strDisplayHost;
            String str;
            boolean z;
            HatchOpenGraphRepository hatchOpenGraphRepository;
            Object objExecute = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objExecute);
                    strDisplayHost = HatchUrlDisplayKt.displayHost(this.$url);
                    if (strDisplayHost == null) {
                        strDisplayHost = HatchOpenGraphRepository.UNKNOWN_HOST;
                    }
                    str = this.$url;
                    z = this.$asCrawler;
                    hatchOpenGraphRepository = this.this$0;
                    HatchHttpClient hatchHttpClientA07 = C60O.A07();
                    HatchHttpRequest.Companion companion = HatchHttpRequest.Companion;
                    C0924AIa c0924AIa = new C0924AIa();
                    c0924AIa.put("Accept", HatchOpenGraphRepository.ACCEPT_HTML);
                    if (z) {
                        c0924AIa.put("User-Agent", HatchOpenGraphRepositoryKt.USER_AGENT);
                    }
                    C0924AIa c0924AIaA0K = AIW.A0K(c0924AIa);
                    Long lA0S = C3cG.A0S(10000L);
                    HatchHttpRequest hatchHttpRequest = companion.get(str, c0924AIaA0K, lA0S, lA0S, lA0S, HatchRequestCategory.API, HatchRequestPurpose.PREFETCH, null, false, false, HatchResponseBodyPolicy.DEFAULT);
                    this.L$0 = null;
                    this.L$1 = strDisplayHost;
                    this.L$2 = str;
                    this.L$3 = hatchOpenGraphRepository;
                    this.L$4 = null;
                    this.Z$0 = z;
                    this.label = 1;
                    objExecute = hatchHttpClientA07.execute(hatchHttpRequest, this);
                    if (objExecute == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    z = this.Z$0;
                    hatchOpenGraphRepository = (HatchOpenGraphRepository) this.L$3;
                    str = (String) this.L$2;
                    strDisplayHost = (String) this.L$1;
                    Hwg.A00(objExecute);
                }
                HatchHttpResponse hatchHttpResponse = (HatchHttpResponse) objExecute;
                String strHeader = hatchHttpResponse.header("Content-Type");
                if (strHeader == null) {
                    strHeader = "";
                }
                if (hatchHttpResponse.isSuccessful && C7BY.A0q(strHeader, "text/html", true)) {
                    HatchHttpResponseBody hatchHttpResponseBodyBody = hatchHttpResponse.body();
                    InputStream inputStream = hatchHttpResponseBodyBody != null ? hatchHttpResponseBodyBody.stream : null;
                    if (inputStream == null) {
                        CFK.A0H(HatchOpenGraphRepositoryKt.TAG, "no metadata: empty body host=%s", strDisplayHost);
                        objA0s = FetchAttempt.Failed.INSTANCE;
                    } else {
                        try {
                            HatchWebPageReader hatchWebPageReader = new HatchWebPageReader(inputStream);
                            byte[] head = hatchWebPageReader.readHead();
                            if (head.length == 0) {
                                CFK.A0H(HatchOpenGraphRepositoryKt.TAG, "no metadata: empty body host=%s", strDisplayHost);
                                objA0s = FetchAttempt.Failed.INSTANCE;
                            } else {
                                HatchWebPageMetadata webPageBytes = HatchWebPageParserKt.parseWebPageBytes(head, str, hatchOpenGraphRepository.charsetFromContentType(strHeader));
                                if (webPageBytes.imageCandidates.isEmpty()) {
                                    webPageBytes = hatchOpenGraphRepository.withBodyImages(webPageBytes, hatchWebPageReader.readBody(), str);
                                }
                                webPageBytes.imageCandidates.size();
                                objA0s = new FetchAttempt.Answered(webPageBytes);
                            }
                            inputStream.close();
                        } finally {
                        }
                    }
                } else {
                    CFK.A0H(HatchOpenGraphRepositoryKt.TAG, "no metadata: code=%d contentType=%s err=%s host=%s crawler=%b", C3cG.A0R(hatchHttpResponse.statusCode), strHeader, hatchHttpResponse.errorMessage, strDisplayHost, Boolean.valueOf(z));
                    objA0s = hatchHttpResponse.isSuccessful ? FetchAttempt.Failed.INSTANCE : new FetchAttempt.Refused(hatchHttpResponse.statusCode);
                }
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            Throwable thA00 = HsJ.A00(objA0s);
            if (thA00 != null) {
                CFK.A0A(HatchOpenGraphRepositoryKt.TAG, FGI.A0M("open graph fetch failed for host=", strDisplayHost), thA00);
            }
            return objA0s instanceof C10571Hud ? FetchAttempt.Failed.INSTANCE : objA0s;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super FetchAttempt> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.opengraph.HatchOpenGraphRepository", f = "HatchOpenGraphRepository.kt", l = {135}, m = "fetchAndCache", v = 2)
    /* renamed from: com.facebook.aura.opengraph.HatchOpenGraphRepository$fetchAndCache$1, reason: invalid class name */
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
            return HatchOpenGraphRepository.this.fetchAndCache(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.opengraph.HatchOpenGraphRepository", f = "HatchOpenGraphRepository.kt", l = {173, 178}, m = "fetchWithCrawlerRetry", v = 2)
    /* renamed from: com.facebook.aura.opengraph.HatchOpenGraphRepository$fetchWithCrawlerRetry$1, reason: invalid class name and case insensitive filesystem */
    public final class C128081 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C128081(HtJ<? super C128081> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchOpenGraphRepository.this.fetchWithCrawlerRetry(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.opengraph.HatchOpenGraphRepository", f = "HatchOpenGraphRepository.kt", l = {124}, m = "metadata", v = 2)
    /* renamed from: com.facebook.aura.opengraph.HatchOpenGraphRepository$metadata$1, reason: invalid class name and case insensitive filesystem */
    public final class C128091 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C128091(HtJ<? super C128091> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchOpenGraphRepository.this.metadata(null, this);
        }
    }

    public HatchOpenGraphRepository(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.singleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
        this.scope = C78T.A01(AnonymousClass001.A0y(), null);
        this.cache = new AuraByteLruCache<>(100, 262144L, 0L, false, 0L, HatchOpenGraphRepository$cache$1.INSTANCE, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchWebPageMetadata withBodyImages(HatchWebPageMetadata hatchWebPageMetadata, byte[] bArr, String str) {
        AHD<String> bodyImageCandidates = HatchWebPageParserKt.parseBodyImageCandidates(bArr, str);
        return !bodyImageCandidates.isEmpty() ? new HatchWebPageMetadata(hatchWebPageMetadata.title, hatchWebPageMetadata.description, hatchWebPageMetadata.siteName, hatchWebPageMetadata.canonicalUrl, bodyImageCandidates, hatchWebPageMetadata.faviconUrl) : hatchWebPageMetadata;
    }

    public final HatchWebPageMetadata cachedMetadata(String str) {
        C7384Etj.A0Y(str, 0);
        return cached(str);
    }

    private final HatchWebPageMetadata cached(String str) {
        CacheEntry cacheEntry = this.cache.get(str);
        if (cacheEntry == null || System.currentTimeMillis() >= cacheEntry.expiresAtMs) {
            return null;
        }
        return cacheEntry.metadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String charsetFromContentType(String str) {
        String strGroup;
        String strA0l;
        Matcher matcher = HatchOpenGraphRepositoryKt.CHARSET_PATTERN.matcher(str);
        if (matcher.find() && (strGroup = matcher.group(1)) != null && (strA0l = AnonymousClass002.A0l(strGroup)) != null) {
            Locale locale = Locale.US;
            C7384Etj.A0V(locale);
            String upperCase = strA0l.toUpperCase(locale);
            if (upperCase.length() > 0) {
                return upperCase;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchAndCache(java.lang.String r8, X.HtJ<? super com.facebook.aura.opengraph.HatchWebPageMetadata> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.opengraph.HatchOpenGraphRepository.AnonymousClass1
            if (r0 == 0) goto L5d
            r3 = r9
            com.facebook.aura.opengraph.HatchOpenGraphRepository$fetchAndCache$1 r3 = (com.facebook.aura.opengraph.HatchOpenGraphRepository.AnonymousClass1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r6 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r3.label
            r0 = 1
            if (r1 == 0) goto L49
            if (r1 != r0) goto L63
            java.lang.Object r8 = r3.L$0
            java.lang.String r8 = (java.lang.String) r8
            X.Hwg.A00(r6)
        L24:
            com.facebook.aura.opengraph.HatchWebPageMetadata r6 = (com.facebook.aura.opengraph.HatchWebPageMetadata) r6
            if (r6 != 0) goto L2c
            com.facebook.aura.opengraph.HatchWebPageMetadata r6 = r7.fallback(r8)
        L2c:
            boolean r0 = r7.isUseful(r6, r8)
            if (r0 == 0) goto L45
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
        L35:
            com.facebook.aura.memory.AuraByteLruCache<java.lang.String, com.facebook.aura.opengraph.HatchOpenGraphRepository$CacheEntry> r3 = r7.cache
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 + r4
            com.facebook.aura.opengraph.HatchOpenGraphRepository$CacheEntry r0 = new com.facebook.aura.opengraph.HatchOpenGraphRepository$CacheEntry
            r0.<init>(r6, r1)
            r3.put(r8, r0)
        L44:
            return r6
        L45:
            r4 = 600000(0x927c0, double:2.964394E-318)
            goto L35
        L49:
            X.Hwg.A00(r6)
            com.facebook.aura.opengraph.HatchWebPageMetadata r6 = r7.cached(r8)
            if (r6 != 0) goto L44
            r3.L$0 = r8
            r3.label = r0
            java.lang.Object r6 = r7.fetchWithCrawlerRetry(r8, r3)
            if (r6 != r2) goto L24
            return r2
        L5d:
            com.facebook.aura.opengraph.HatchOpenGraphRepository$fetchAndCache$1 r3 = new com.facebook.aura.opengraph.HatchOpenGraphRepository$fetchAndCache$1
            r3.<init>(r9)
            goto L12
        L63:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.opengraph.HatchOpenGraphRepository.fetchAndCache(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchWithCrawlerRetry(java.lang.String r8, X.HtJ<? super com.facebook.aura.opengraph.HatchWebPageMetadata> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.opengraph.HatchOpenGraphRepository.C128081
            if (r0 == 0) goto L77
            r4 = r9
            com.facebook.aura.opengraph.HatchOpenGraphRepository$fetchWithCrawlerRetry$1 r4 = (com.facebook.aura.opengraph.HatchOpenGraphRepository.C128081) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r6 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r3 = 2
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L2f
            if (r1 == r0) goto L3d
            if (r1 != r3) goto L7d
            X.Hwg.A00(r6)
        L24:
            boolean r0 = r6 instanceof com.facebook.aura.opengraph.HatchOpenGraphRepository.FetchAttempt.Answered
            if (r0 == 0) goto L2e
            com.facebook.aura.opengraph.HatchOpenGraphRepository$FetchAttempt$Answered r6 = (com.facebook.aura.opengraph.HatchOpenGraphRepository.FetchAttempt.Answered) r6
            if (r6 == 0) goto L2e
        L2c:
            com.facebook.aura.opengraph.HatchWebPageMetadata r2 = r6.metadata
        L2e:
            return r2
        L2f:
            X.Hwg.A00(r6)
            r4.L$0 = r8
            r4.label = r0
            java.lang.Object r6 = r7.fetch(r8, r0, r4)
            if (r6 != r5) goto L44
            return r5
        L3d:
            java.lang.Object r8 = r4.L$0
            java.lang.String r8 = (java.lang.String) r8
            X.Hwg.A00(r6)
        L44:
            com.facebook.aura.opengraph.HatchOpenGraphRepository$FetchAttempt r6 = (com.facebook.aura.opengraph.HatchOpenGraphRepository.FetchAttempt) r6
            boolean r0 = r6 instanceof com.facebook.aura.opengraph.HatchOpenGraphRepository.FetchAttempt.Answered
            if (r0 == 0) goto L4d
            com.facebook.aura.opengraph.HatchOpenGraphRepository$FetchAttempt$Answered r6 = (com.facebook.aura.opengraph.HatchOpenGraphRepository.FetchAttempt.Answered) r6
            goto L2c
        L4d:
            com.facebook.aura.opengraph.HatchOpenGraphRepository$FetchAttempt$Failed r0 = com.facebook.aura.opengraph.HatchOpenGraphRepository.FetchAttempt.Failed.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r6, r0)
            if (r0 != 0) goto L2e
            boolean r0 = r6 instanceof com.facebook.aura.opengraph.HatchOpenGraphRepository.FetchAttempt.Refused
            if (r0 == 0) goto L82
            java.util.Set<java.lang.Integer> r1 = com.facebook.aura.opengraph.HatchOpenGraphRepositoryKt.CRAWLER_REJECTION_STATUSES
            com.facebook.aura.opengraph.HatchOpenGraphRepository$FetchAttempt$Refused r6 = (com.facebook.aura.opengraph.HatchOpenGraphRepository.FetchAttempt.Refused) r6
            int r0 = r6.statusCode
            java.lang.Integer r0 = X.C3cG.A0R(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L2e
            r4.L$0 = r2
            r4.L$1 = r2
            r4.label = r3
            r0 = 0
            java.lang.Object r6 = r7.fetch(r8, r0, r4)
            if (r6 != r5) goto L24
            return r5
        L77:
            com.facebook.aura.opengraph.HatchOpenGraphRepository$fetchWithCrawlerRetry$1 r4 = new com.facebook.aura.opengraph.HatchOpenGraphRepository$fetchWithCrawlerRetry$1
            r4.<init>(r9)
            goto L12
        L7d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L82:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.opengraph.HatchOpenGraphRepository.fetchWithCrawlerRetry(java.lang.String, X.HtJ):java.lang.Object");
    }

    private final boolean isUseful(HatchWebPageMetadata hatchWebPageMetadata, String str) {
        if (hatchWebPageMetadata.imageCandidates.isEmpty()) {
            String strDisplayHost = HatchUrlDisplayKt.displayHost(str);
            String str2 = hatchWebPageMetadata.title;
            if (strDisplayHost == null) {
                if (str2 != null) {
                }
            } else if (str2 != null && !str2.equalsIgnoreCase(strDisplayHost)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metadata(java.lang.String r8, X.HtJ<? super com.facebook.aura.opengraph.HatchWebPageMetadata> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.opengraph.HatchOpenGraphRepository.C128091
            if (r0 == 0) goto L53
            r6 = r9
            com.facebook.aura.opengraph.HatchOpenGraphRepository$metadata$1 r6 = (com.facebook.aura.opengraph.HatchOpenGraphRepository.C128091) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L2f
            if (r0 != r4) goto L71
            java.lang.Object r8 = r6.L$0
            java.lang.String r8 = (java.lang.String) r8
            X.Hwg.A00(r1)
        L24:
            com.facebook.aura.common.coroutines.SingleFlightResult r1 = (com.facebook.aura.common.coroutines.SingleFlightResult) r1
            boolean r0 = r1 instanceof com.facebook.aura.common.coroutines.SingleFlightResult.Result
            if (r0 == 0) goto L59
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1
            T r5 = r1.value
            return r5
        L2f:
            X.Hwg.A00(r1)
            com.facebook.aura.opengraph.HatchWebPageMetadata r0 = r7.cached(r8)
            if (r0 != 0) goto L76
            X.3UX r3 = r7.scope
            r0 = 0
            com.facebook.aura.opengraph.HatchOpenGraphRepository$metadata$result$1 r2 = new com.facebook.aura.opengraph.HatchOpenGraphRepository$metadata$result$1
            r2.<init>(r7, r8, r0)
            X.6ys r1 = X.C6ys.A00
            java.lang.Integer r0 = X.C79.A00
            X.Hrx r0 = X.GAo.A01(r0, r1, r2, r3)
            r6.L$0 = r8
            r6.label = r4
            java.lang.Object r1 = r0.A0E(r6)
            if (r1 != r5) goto L24
            return r5
        L53:
            com.facebook.aura.opengraph.HatchOpenGraphRepository$metadata$1 r6 = new com.facebook.aura.opengraph.HatchOpenGraphRepository$metadata$1
            r6.<init>(r9)
            goto L12
        L59:
            com.facebook.aura.common.coroutines.SingleFlightResult$Skipped r0 = com.facebook.aura.common.coroutines.SingleFlightResult.Skipped.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L6c
            com.facebook.aura.opengraph.HatchWebPageMetadata r0 = r7.cached(r8)
            if (r0 != 0) goto L76
            com.facebook.aura.opengraph.HatchWebPageMetadata r5 = r7.fallback(r8)
            return r5
        L6c:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L71:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.opengraph.HatchOpenGraphRepository.metadata(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final HatchOpenGraphRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchOpenGraphRepository) abstractC3358CGz.A03(HatchOpenGraphRepository.class, new HatchOpenGraphRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final HatchWebPageMetadata fallback(String str) {
        return new HatchWebPageMetadata(null, null, HatchUrlDisplayKt.displayHost(str), null, AHI.A01, HatchUrlDisplayKt.faviconUri(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetch(String str, boolean z, HtJ<? super FetchAttempt> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, z, this, null));
    }
}
