package com.facebook.aura.network.transport.cache;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3UX;
import X.C60O;
import X.C7384Etj;
import X.C7438Evz;
import X.C78T;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchDuplexHttpStream;
import com.facebook.aura.network.transport.HatchDuplexResponseHandler;
import com.facebook.aura.network.transport.HatchHttpCachePolicy;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchHttpResponseStream;
import com.facebook.aura.network.transport.HatchVmProbeAuthProvider;
import com.facebook.aura.network.transport.HatchVmProbeResponseObserver;
import com.facebook.aura.network.transport.HatchVmProbeResult;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class CachingHatchHttpClient implements HatchHttpClient {
    public final C3UX cacheScope;
    public final G0V<HatchAuthScheme, String, String> cacheScopeProvider;
    public final HatchHttpCacheClock clock;
    public final HatchHttpClient delegate;
    public final ConcurrentHashMap<String, CompletableFuture<NetworkResult>> inFlight;
    public final HatchAuthScheme scheme;
    public final HatchHttpCacheStore store;

    /* renamed from: com.facebook.aura.network.transport.cache.CachingHatchHttpClient$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements G0V<HatchAuthScheme, String, String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2, CachingHatchHttpClientKt.class, "defaultCacheScope", "defaultCacheScope(Lcom/facebook/aura/network/transport/HatchAuthScheme;Ljava/lang/String;)Ljava/lang/String;", 1);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ String invoke(HatchAuthScheme hatchAuthScheme, String str) {
            HatchAuthScheme hatchAuthScheme2 = hatchAuthScheme;
            String str2 = str;
            AnonymousClass003.A0u(hatchAuthScheme2, str2);
            return CachingHatchHttpClientKt.defaultCacheScope(hatchAuthScheme2, str2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String invoke2(HatchAuthScheme hatchAuthScheme, String str) {
            AnonymousClass003.A0u(hatchAuthScheme, str);
            return CachingHatchHttpClientKt.defaultCacheScope(hatchAuthScheme, str);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.transport.cache.CachingHatchHttpClient", f = "CachingHatchHttpClient.kt", l = {MessageDraftSenderKt.UNICODE_MULTIPART_CHARS, HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX, 94}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.network.transport.cache.CachingHatchHttpClient$execute$1, reason: invalid class name and case insensitive filesystem */
    public final class C127311 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C127311(HtJ<? super C127311> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachingHatchHttpClient.this.execute(null, this);
        }
    }

    /* renamed from: com.facebook.aura.network.transport.cache.CachingHatchHttpClient$execute$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends C7438Evz implements G0V {
        public AnonymousClass2(Object obj) {
            super(2, obj, HatchHttpClient.class, "execute", "execute(Lcom/facebook/aura/network/transport/HatchHttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // X.G0V
        public final Object invoke(HatchHttpRequest hatchHttpRequest, HtJ<? super HatchHttpResponse> htJ) {
            return ((HatchHttpClient) this.receiver).execute(hatchHttpRequest, htJ);
        }
    }

    /* renamed from: com.facebook.aura.network.transport.cache.CachingHatchHttpClient$execute$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends C7438Evz implements G0V {
        public AnonymousClass3(Object obj) {
            super(2, obj, HatchHttpClient.class, "execute", "execute(Lcom/facebook/aura/network/transport/HatchHttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // X.G0V
        public final Object invoke(HatchHttpRequest hatchHttpRequest, HtJ<? super HatchHttpResponse> htJ) {
            return ((HatchHttpClient) this.receiver).execute(hatchHttpRequest, htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.transport.cache.CachingHatchHttpClient", f = "CachingHatchHttpClient.kt", l = {104}, m = "executeWithBearer", v = 2)
    /* renamed from: com.facebook.aura.network.transport.cache.CachingHatchHttpClient$executeWithBearer$1, reason: invalid class name and case insensitive filesystem */
    public final class C127321 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C127321(HtJ<? super C127321> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachingHatchHttpClient.this.executeWithBearer(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.transport.cache.CachingHatchHttpClient$launchSharedFetch$1", f = "CachingHatchHttpClient.kt", l = {VoiceCallForegroundService.AVATAR_TARGET_PX, 147}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.network.transport.cache.CachingHatchHttpClient$launchSharedFetch$1, reason: invalid class name and case insensitive filesystem */
    public final class C127331 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $cacheKey;
        public final /* synthetic */ CompletableFuture<NetworkResult> $created;
        public final /* synthetic */ G0V<HatchHttpRequest, HtJ<? super HatchHttpResponse>, Object> $network;
        public final /* synthetic */ HatchHttpCachePolicy $policy;
        public final /* synthetic */ HatchHttpRequest $request;
        public Object L$0;
        public int label;
        public final /* synthetic */ CachingHatchHttpClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C127331(G0V<? super HatchHttpRequest, ? super HtJ<? super HatchHttpResponse>, ? extends Object> g0v, HatchHttpRequest hatchHttpRequest, CompletableFuture<NetworkResult> completableFuture, CachingHatchHttpClient cachingHatchHttpClient, String str, HatchHttpCachePolicy hatchHttpCachePolicy, HtJ<? super C127331> htJ) {
            super(2, htJ);
            this.$network = g0v;
            this.$request = hatchHttpRequest;
            this.$created = completableFuture;
            this.this$0 = cachingHatchHttpClient;
            this.$cacheKey = str;
            this.$policy = hatchHttpCachePolicy;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C127331(this.$network, this.$request, this.$created, this.this$0, this.$cacheKey, this.$policy, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    try {
                    } catch (Throwable th) {
                        CFK.A0A(CachingHatchHttpClientKt.TAG, "Cache write failed; network result already delivered", th);
                    }
                } catch (CancellationException e) {
                    throw e;
                }
            } finally {
                try {
                    this.this$0.inFlight.remove(this.$cacheKey, this.$created);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                }
            }
            if (i == 0) {
                Hwg.A00(obj);
                G0V<HatchHttpRequest, HtJ<? super HatchHttpResponse>, Object> g0v = this.$network;
                HatchHttpRequest hatchHttpRequest = this.$request;
                this.label = 1;
                obj = g0v.invoke(hatchHttpRequest, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    this.this$0.inFlight.remove(this.$cacheKey, this.$created);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            NetworkResult networkResult = CachingHatchHttpClientKt.toNetworkResult((HatchHttpResponse) obj);
            this.$created.complete(networkResult);
            CachingHatchHttpClient cachingHatchHttpClient = this.this$0;
            String str = this.$cacheKey;
            HatchHttpCachePolicy hatchHttpCachePolicy = this.$policy;
            long jNowMs = cachingHatchHttpClient.clock.nowMs();
            this.L$0 = null;
            this.label = 2;
            if (cachingHatchHttpClient.maybeWrite(str, networkResult, hatchHttpCachePolicy, jNowMs, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            this.this$0.inFlight.remove(this.$cacheKey, this.$created);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C127331) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CachingHatchHttpClient(HatchHttpClient hatchHttpClient, HatchAuthScheme hatchAuthScheme) {
        this(hatchHttpClient, hatchAuthScheme, (HatchHttpCacheStore) DefaultHatchHttpCacheStore.store$delegate.getValue(), SystemHatchHttpCacheClock.INSTANCE, AnonymousClass1.INSTANCE);
        AnonymousClass003.A0u(hatchHttpClient, hatchAuthScheme);
    }

    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public void preconnect(String str) {
        C7384Etj.A0Y(str, 0);
        this.delegate.preconnect(str);
    }

    private final CompletableFuture<NetworkResult> launchSharedFetch(String str, HatchHttpRequest hatchHttpRequest, HatchHttpCachePolicy hatchHttpCachePolicy, G0V<? super HatchHttpRequest, ? super HtJ<? super HatchHttpResponse>, ? extends Object> g0v) {
        CompletableFuture<NetworkResult> completableFuture = new CompletableFuture<>();
        CompletableFuture<NetworkResult> completableFuturePutIfAbsent = this.inFlight.putIfAbsent(str, completableFuture);
        if (completableFuturePutIfAbsent != null) {
            return completableFuturePutIfAbsent;
        }
        AnonymousClass001.A1J(new C127331(g0v, hatchHttpRequest, completableFuture, this, str, hatchHttpCachePolicy, null), this.cacheScope);
        return completableFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object maybeWrite(String str, NetworkResult networkResult, HatchHttpCachePolicy hatchHttpCachePolicy, long j, HtJ<? super Unit> htJ) {
        Object objWrite;
        byte[] bArr = networkResult.body;
        return (bArr == null || !networkResult.isSuccessful || ((long) bArr.length) > hatchHttpCachePolicy.maxBodyBytes || (objWrite = this.store.write(str, new HatchHttpCachedResponse(networkResult.code, networkResult.message, networkResult.headers, bArr, j, j), htJ)) != EnumC10460Hji.A02) ? Unit.INSTANCE : objWrite;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    @Override // com.facebook.aura.network.transport.HatchHttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.facebook.aura.network.transport.HatchHttpRequest r14, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponse> r15) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.cache.CachingHatchHttpClient.execute(com.facebook.aura.network.transport.HatchHttpRequest, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public Object executeStreaming(HatchHttpRequest hatchHttpRequest, OutputStream outputStream, HtJ<? super HatchHttpResponse> htJ) {
        return this.delegate.executeStreaming(hatchHttpRequest, outputStream, htJ);
    }

    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public Object executeVmProbe(String str, String str2, List<HatchHttpRequest> list, HatchVmProbeAuthProvider hatchVmProbeAuthProvider, HatchVmProbeResponseObserver hatchVmProbeResponseObserver, HtJ<? super HatchVmProbeResult> htJ) {
        return this.delegate.executeVmProbe(str, str2, list, hatchVmProbeAuthProvider, hatchVmProbeResponseObserver, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    @Override // com.facebook.aura.network.transport.HatchHttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object executeWithBearer(com.facebook.aura.network.transport.HatchHttpRequest r6, java.lang.String r7, java.lang.String r8, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponse> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.facebook.aura.network.transport.cache.CachingHatchHttpClient.C127321
            if (r0 == 0) goto L40
            r4 = r9
            com.facebook.aura.network.transport.cache.CachingHatchHttpClient$executeWithBearer$1 r4 = (com.facebook.aura.network.transport.cache.CachingHatchHttpClient.C127321) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 != r2) goto L48
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.network.transport.HatchHttpResponse r1 = (com.facebook.aura.network.transport.HatchHttpResponse) r1
            if (r1 == 0) goto L46
            com.facebook.aura.network.transport.HatchHttpCacheStatus r0 = com.facebook.aura.network.transport.HatchHttpCacheStatus.NETWORK
            com.facebook.aura.network.transport.HatchHttpResponse r3 = com.facebook.aura.network.transport.cache.CachingHatchHttpClientKt.withCacheStatus(r1, r0)
            return r3
        L2b:
            X.Hwg.A00(r1)
            com.facebook.aura.network.transport.HatchHttpClient r1 = r5.delegate
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.label = r2
            java.lang.Object r1 = r1.executeWithBearer(r6, r7, r8, r4)
            if (r1 != r3) goto L20
            return r3
        L40:
            com.facebook.aura.network.transport.cache.CachingHatchHttpClient$executeWithBearer$1 r4 = new com.facebook.aura.network.transport.cache.CachingHatchHttpClient$executeWithBearer$1
            r4.<init>(r9)
            goto L12
        L46:
            r3 = 0
            return r3
        L48:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.cache.CachingHatchHttpClient.executeWithBearer(com.facebook.aura.network.transport.HatchHttpRequest, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public Object openDuplexStream(HatchHttpRequest hatchHttpRequest, HatchDuplexResponseHandler hatchDuplexResponseHandler, HtJ<? super HatchDuplexHttpStream> htJ) {
        return this.delegate.openDuplexStream(hatchHttpRequest, hatchDuplexResponseHandler, htJ);
    }

    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public Object openResponseStream(HatchHttpRequest hatchHttpRequest, HtJ<? super HatchHttpResponseStream> htJ) {
        return this.delegate.openResponseStream(hatchHttpRequest, htJ);
    }

    private final void reportCacheHit(HatchHttpRequest hatchHttpRequest, HatchHttpCachedResponse hatchHttpCachedResponse) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CachingHatchHttpClient(HatchHttpClient hatchHttpClient, HatchAuthScheme hatchAuthScheme, HatchHttpCacheStore hatchHttpCacheStore, HatchHttpCacheClock hatchHttpCacheClock, G0V<? super HatchAuthScheme, ? super String, String> g0v) {
        AnonymousClass005.A17(hatchHttpClient, hatchAuthScheme, hatchHttpCacheStore, hatchHttpCacheClock, g0v);
        this.delegate = hatchHttpClient;
        this.scheme = hatchAuthScheme;
        this.store = hatchHttpCacheStore;
        this.clock = hatchHttpCacheClock;
        this.cacheScopeProvider = g0v;
        this.cacheScope = C78T.A00();
        this.inFlight = C60O.A1C();
    }
}
