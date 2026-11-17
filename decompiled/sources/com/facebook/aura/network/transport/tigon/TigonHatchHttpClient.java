package com.facebook.aura.network.transport.tigon;

import X.AGH;
import X.AIW;
import X.AbstractC4085Cli;
import X.AbstractC4088Clr;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.BV5;
import X.BV8;
import X.C06H;
import X.C0861A6i;
import X.C10543Hqv;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C4884DBm;
import X.C5322DgG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C7Bm;
import X.C8j3;
import X.C9X;
import X.C9jH;
import X.CY1;
import X.CY4;
import X.CY7;
import X.CYF;
import X.DC3;
import X.DCW;
import X.F0C;
import X.F1E;
import X.F1F;
import X.FGI;
import X.G0U;
import X.GAt;
import X.GBL;
import X.Hm1;
import X.HtJ;
import X.HzP;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.network.AuraAuthHeaders;
import com.facebook.aura.network.noise.AuraNoiseVmTransport;
import com.facebook.aura.network.state.AuraNetworkMonitor;
import com.facebook.aura.network.state.AuraNetworkState;
import com.facebook.aura.network.state.NoNetworkException;
import com.facebook.aura.network.tigon.AuraTigonServiceProvider;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchDuplexHttpStream;
import com.facebook.aura.network.transport.HatchDuplexResponseHandler;
import com.facebook.aura.network.transport.HatchHttpCacheStatus;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchHttpResponseStream;
import com.facebook.aura.network.transport.HatchHttpResponseStream$Companion$of$1;
import com.facebook.aura.network.transport.HatchHttpTransportTimings;
import com.facebook.aura.network.transport.HatchRequestBody;
import com.facebook.aura.network.transport.HatchVmInboundTraffic;
import com.facebook.aura.network.transport.HatchVmProbeAuthProvider;
import com.facebook.aura.network.transport.HatchVmProbeResponseObserver;
import com.facebook.aura.network.transport.HatchVmProbeResult;
import com.facebook.aura.network.transport.tigon.internal.LiveDuplexBodyProvider;
import com.facebook.aura.network.transport.tigon.internal.TigonVmAuth;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import com.facebook.tigon.TigonCallbacks;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonRequestToken;
import com.facebook.tigon.TigonXplatBodyProvider;
import com.facebook.tigon.iface.TigonErrorCode;
import com.facebook.tigon.iface.TigonPropertyContainer;
import com.facebook.tigon.iface.TigonRequest;
import java.io.OutputStream;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.DispatchException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class TigonHatchHttpClient implements HatchHttpClient {
    public final F0C e2eProxyString$delegate;
    public final Function0<String> e2eProxyStringProvider;
    public final Function0<Boolean> isVmNoiseHttpRoutingEnabled;
    public final G0U<String, Unit> preconnector;
    public final HatchAuthScheme scheme;
    public final boolean scopedVmChannel;
    public final Function0<DCW> tigonHttpClientProvider;

    /* renamed from: com.facebook.aura.network.transport.tigon.TigonHatchHttpClient$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<DCW> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [X.DCW, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ DCW invoke() {
            return AuraTigonServiceProvider.tigonHttpClient$delegate.getValue();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final DCW invoke() {
            return F0C.A02();
        }
    }

    /* renamed from: com.facebook.aura.network.transport.tigon.TigonHatchHttpClient$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AuraNoiseVmTransport.httpRoutingEnabled);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(AuraNoiseVmTransport.httpRoutingEnabled);
        }
    }

    /* renamed from: com.facebook.aura.network.transport.tigon.TigonHatchHttpClient$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<String> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
            JSONObject jSONObjectA02 = C9X.A02("/settings/http/transparent_http_proxy");
            String strOptString = jSONObjectA02 != null ? jSONObjectA02.optString(BrowserOperationCatalogKt.VALUE, "") : "";
            C7384Etj.A0U(strOptString);
            return strOptString;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            JSONObject jSONObjectA02 = C9X.A02("/settings/http/transparent_http_proxy");
            String strOptString = "";
            if (jSONObjectA02 != null) {
                strOptString = jSONObjectA02.optString(BrowserOperationCatalogKt.VALUE, "");
            }
            C7384Etj.A0U(strOptString);
            return strOptString;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.transport.tigon.TigonHatchHttpClient", f = "TigonHatchHttpClient.kt", l = {167}, m = "executeInternal", v = 2)
    /* renamed from: com.facebook.aura.network.transport.tigon.TigonHatchHttpClient$executeInternal$1, reason: invalid class name and case insensitive filesystem */
    public final class C127411 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C127411(HtJ<? super C127411> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TigonHatchHttpClient.this.executeInternal(null, null, this);
        }
    }

    public final TigonRequest buildTigonRequest$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_tigon(HatchHttpRequest hatchHttpRequest) {
        C7384Etj.A0Y(hatchHttpRequest, 0);
        EncodedBody encodedBodyEncodeBody = TigonHatchHttpClientKt.encodeBody(hatchHttpRequest.body);
        String str = encodedBodyEncodeBody.contentType;
        byte[] bArr = encodedBodyEncodeBody.bytes;
        return buildTigonRequestInternal(hatchHttpRequest, str, null, AGH.A0E(), bArr != null ? Integer.valueOf(bArr.length) : null);
    }

    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public Object execute(HatchHttpRequest hatchHttpRequest, HtJ<? super HatchHttpResponse> htJ) {
        return executeInternal(hatchHttpRequest, null, htJ);
    }

    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public Object openDuplexStream(HatchHttpRequest hatchHttpRequest, HatchDuplexResponseHandler hatchDuplexResponseHandler, HtJ<? super HatchDuplexHttpStream> htJ) {
        return openDuplexStreamInternal(hatchHttpRequest, hatchDuplexResponseHandler, null, htJ);
    }

    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public void preconnect(String str) {
        C7384Etj.A0Y(str, 0);
        this.preconnector.invoke(str);
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchAuthScheme.values().length];
            try {
                AnonymousClass002.A13(HatchAuthScheme.META_BEARER, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchAuthScheme.META_UNAUTH, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchAuthScheme.VM_JWT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ TigonHatchHttpClient(HatchAuthScheme hatchAuthScheme, Function0 function0, Function0 function02, Function0 function03, G0U g0u, boolean z, int i, C06H c06h) {
        this(hatchAuthScheme, (i & 2) != 0 ? AnonymousClass1.INSTANCE : function0, (i & 4) != 0 ? AnonymousClass2.INSTANCE : function02, (i & 8) != 0 ? AnonymousClass3.INSTANCE : function03, (i & 16) != 0 ? AnonymousClass4.INSTANCE : g0u, C3cG.A1K(i & 32, z));
    }

    private final String authHeaderForScheme(String str) {
        int iOrdinal = this.scheme.ordinal();
        if (iOrdinal == 1) {
            return AuraAuthHeaders.INSTANCE.currentMetaBearer();
        }
        if (iOrdinal == 2) {
            return null;
        }
        if (iOrdinal == 0) {
            return TigonVmAuth.INSTANCE.vmBearerForUrl(str);
        }
        throw C3cG.A0q();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.tigon.iface.TigonRequest buildTigonRequestInternal(com.facebook.aura.network.transport.HatchHttpRequest r11, java.lang.String r12, java.lang.String r13, java.util.Map<java.lang.String, java.lang.String> r14, java.lang.Integer r15) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.tigon.TigonHatchHttpClient.buildTigonRequestInternal(com.facebook.aura.network.transport.HatchHttpRequest, java.lang.String, java.lang.String, java.util.Map, java.lang.Integer):com.facebook.tigon.iface.TigonRequest");
    }

    public static /* synthetic */ TigonRequest buildTigonRequestInternal$default(TigonHatchHttpClient tigonHatchHttpClient, HatchHttpRequest hatchHttpRequest, String str, String str2, Map map, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        Map<String, String> mapA0o = C3cH.A0o(map, i & 8);
        if ((i & 16) != 0) {
            num = null;
        }
        return tigonHatchHttpClient.buildTigonRequestInternal(hatchHttpRequest, str, str2, mapA0o, num);
    }

    private final String e2eProxyRewrite(String str) {
        String e2eProxyString = getE2eProxyString();
        if (e2eProxyString == null || !TigonVmAuth.INSTANCE.isMetaAiVmUrl(str)) {
            return str;
        }
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            if (scheme == null) {
                scheme = "https";
            }
            String rawPath = uri.getRawPath();
            if (rawPath == null) {
                rawPath = "";
            }
            return FGI.A0h(scheme, "://", e2eProxyString, rawPath, uri.getRawQuery() != null ? FGI.A0M(HatchOpenGraphRepository.UNKNOWN_HOST, uri.getRawQuery()) : "");
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.facebook.aura.network.transport.tigon.EncodedBody, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeInternal(com.facebook.aura.network.transport.HatchHttpRequest r14, java.lang.String r15, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponse> r16) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.tigon.TigonHatchHttpClient.executeInternal(com.facebook.aura.network.transport.HatchHttpRequest, java.lang.String, X.HtJ):java.lang.Object");
    }

    private final String getE2eProxyString() {
        return (String) this.e2eProxyString$delegate.getValue();
    }

    private final String noiseInboundHost(String str) {
        if (this.scopedVmChannel || !shouldUseNoiseHttpRouting(str)) {
            return null;
        }
        return HatchVmInboundTraffic.INSTANCE.hostOf(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, X.9jH, java.util.Map] */
    public final Object openDuplexStreamInternal(HatchHttpRequest hatchHttpRequest, final HatchDuplexResponseHandler hatchDuplexResponseHandler, String str, HtJ<? super HatchDuplexHttpStream> htJ) {
        final DCW dcwInvoke;
        final GAt gAt;
        final AtomicReference atomicReferenceA16;
        AuraExecutors auraExecutors;
        LiveDuplexBodyProvider liveDuplexBodyProvider;
        TigonRequest tigonRequestBuildTigonRequestInternal;
        final String strNoiseInboundHost;
        final F1E f1e;
        final C10543Hqv c10543HqvA0z;
        final F1F f1f;
        final DuplexErrorBodyAccumulator duplexErrorBodyAccumulator;
        Throwable thA0Q;
        if (AuraNetworkMonitor._state.getValue() instanceof AuraNetworkState.Offline) {
            thA0Q = new NoNetworkException(hatchHttpRequest.url);
        } else if (this.scheme != HatchAuthScheme.VM_JWT) {
            thA0Q = C8j3.A18("duplex streaming requires VM_JWT");
        } else if (!(hatchHttpRequest.body instanceof HatchRequestBody.Empty)) {
            thA0Q = C60O.A0i("duplex stream request body must be Empty");
        } else {
            if (AnonymousClass003.A1Y(this.isVmNoiseHttpRoutingEnabled)) {
                try {
                    try {
                        dcwInvoke = this.tigonHttpClientProvider.invoke();
                        gAt = new GAt(null);
                        atomicReferenceA16 = BV4.A16(null);
                        TigonXplatBodyProvider tigonXplatBodyProvider = TigonXplatBodyProvider.$redex_init_class;
                        auraExecutors = AuraExecutors.INSTANCE;
                        liveDuplexBodyProvider = new LiveDuplexBodyProvider(F0C.A06(AuraExecutors.fileUploadStreamingExecutor$delegate), 64);
                        ?? A0E = AGH.A0E();
                        tigonRequestBuildTigonRequestInternal = buildTigonRequestInternal(hatchHttpRequest, null, str, A0E, null);
                        strNoiseInboundHost = noiseInboundHost(hatchHttpRequest.url);
                        f1e = new F1E();
                        f1e.element = -1;
                        c10543HqvA0z = C3cG.A0z();
                        c10543HqvA0z.element = A0E;
                        f1f = new F1F();
                        duplexErrorBodyAccumulator = new DuplexErrorBodyAccumulator(65536);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        atomicReferenceA16.set(AbstractC4085Cli.A00(dcwInvoke, liveDuplexBodyProvider, new TigonCallbacks() { // from class: com.facebook.aura.network.transport.tigon.TigonHatchHttpClient$openDuplexStreamInternal$callbacks$1
                            @Override // com.facebook.tigon.TigonCallbacks
                            public void onBody(ByteBuffer byteBuffer) {
                                C7384Etj.A0Y(byteBuffer, 0);
                                String str2 = strNoiseInboundHost;
                                if (str2 != null) {
                                    HatchVmInboundTraffic.INSTANCE.recordBytesReceived(str2);
                                }
                                try {
                                    int iRemaining = byteBuffer.remaining();
                                    if (iRemaining > 0) {
                                        byte[] bArr = new byte[iRemaining];
                                        byteBuffer.get(bArr);
                                        if (f1f.element) {
                                            hatchDuplexResponseHandler.onBody(bArr);
                                        } else {
                                            duplexErrorBodyAccumulator.append(bArr);
                                        }
                                    }
                                } finally {
                                    try {
                                    } finally {
                                    }
                                }
                            }

                            @Override // com.facebook.tigon.TigonCallbacks
                            public void onError(TigonError tigonError, CY1 cy1) {
                                C7384Etj.A0Y(tigonError, 0);
                                if (gAt.AOG()) {
                                    return;
                                }
                                String strA0s = BV8.A0s(tigonError);
                                TigonHatchHttpClientKt.completeDuplexFailure(gAt, hatchDuplexResponseHandler, tigonError.category == TigonErrorCode.A04 ? new CancellationException(strA0s) : new TigonTransportException(strA0s, tigonError), f1e.element, c10543HqvA0z.element);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r3v0, types: [T, java.util.Map, java.util.Map<java.lang.String, java.lang.String>] */
                            @Override // com.facebook.tigon.TigonCallbacks
                            public void onResponse(CYF cyf) {
                                C7384Etj.A0Y(cyf, 0);
                                F1E f1e2 = f1e;
                                int i = cyf.A00;
                                f1e2.element = i;
                                C10543Hqv<Map<String, String>> c10543Hqv = c10543HqvA0z;
                                ?? r3 = cyf.A01;
                                c10543Hqv.element = r3;
                                F1F f1f2 = f1f;
                                boolean z = false;
                                if (200 <= i && i < 300) {
                                    z = true;
                                }
                                f1f2.element = z;
                                hatchDuplexResponseHandler.onResponse(i, r3);
                            }

                            @Override // com.facebook.tigon.TigonCallbacks
                            public void onEOM(CY1 cy1) {
                                if (gAt.AOG()) {
                                    return;
                                }
                                byte[] bArrBytesOrNull = f1f.element ? null : duplexErrorBodyAccumulator.bytesOrNull();
                                HatchHttpResponse hatchHttpResponseOf = HatchHttpResponse.Companion.of(f1e.element, "", c10543HqvA0z.element, bArrBytesOrNull != null ? BV4.A0E(bArrBytesOrNull) : null, f1f.element ? null : duplexErrorBodyAccumulator.errorMessageOrNull(), f1f.element, HatchHttpCacheStatus.NETWORK, null);
                                hatchDuplexResponseHandler.onComplete(hatchHttpResponseOf);
                                C3cG.A1F(gAt, hatchHttpResponseOf);
                            }
                        }, tigonRequestBuildTigonRequestInternal, auraExecutors.createResponseStreamingSerialExecutor()));
                        return new TigonDuplexHttpStream(liveDuplexBodyProvider, gAt, atomicReferenceA16);
                    } catch (Throwable th2) {
                        th = th2;
                        liveDuplexBodyProvider.cancel();
                        return new FailedTigonDuplexHttpStream(TigonHatchHttpClientKt.transportFailureResponse(th));
                    }
                } catch (CancellationException e) {
                    throw e;
                }
            }
            thA0Q = C3cG.A0Q("Noise HTTP routing is not enabled");
        }
        return new FailedTigonDuplexHttpStream(TigonHatchHttpClientKt.transportFailureResponse(thA0Q));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Map<java.lang.String, java.lang.String> resolvedHeaders(com.facebook.aura.network.transport.HatchHttpRequest r6, java.lang.String r7, java.lang.Integer r8, java.lang.String r9) {
        /*
            r5 = this;
            java.util.Comparator r0 = java.lang.String.CASE_INSENSITIVE_ORDER
            X.C7384Etj.A0V(r0)
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>(r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.headers
            java.util.Set r1 = r0.keySet()
            boolean r0 = r1 instanceof java.util.Collection
            r2 = 0
            java.lang.String r3 = "Authorization"
            if (r0 == 0) goto L92
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L92
        L1d:
            if (r9 != 0) goto L90
            if (r2 != 0) goto L2c
            java.lang.String r0 = r6.url
            java.lang.String r0 = r5.authHeaderForScheme(r0)
            if (r0 == 0) goto L2c
        L29:
            r4.put(r3, r0)
        L2c:
            if (r7 == 0) goto L33
            java.lang.String r0 = "Content-Type"
            r4.put(r0, r7)
        L33:
            if (r8 == 0) goto L42
            int r0 = r8.intValue()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "Content-Length"
            r4.put(r0, r1)
        L42:
            boolean r0 = r6.useOhai
            if (r0 == 0) goto L62
            java.lang.String r1 = r6.url
            java.net.URI r0 = new java.net.URI
            r0.<init>(r1)
            java.lang.String r1 = r0.getHost()
            java.lang.String r0 = r0.toString()
            boolean r0 = com.facebook.tigon.requestdomainhelpers.TigonRequestDomainHelpers.isFirstPartySecure(r0, r1)
            if (r0 == 0) goto L62
            java.lang.String r1 = "X-FB-Request-Analytics-Tags"
            java.lang.String r0 = com.facebook.aura.network.transport.tigon.TigonHatchHttpClientKt.AURA_ANALYTICS_TAGS_VALUE
            r4.put(r1, r0)
        L62:
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.headers
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L6c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lad
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.getValue()
            if (r9 == 0) goto L8c
            if (r2 == 0) goto L8c
            boolean r0 = r2.equalsIgnoreCase(r3)
            if (r0 != 0) goto L6c
        L8c:
            r4.put(r2, r1)
            goto L6c
        L90:
            r0 = r9
            goto L29
        L92:
            java.util.Iterator r1 = r1.iterator()
        L96:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L96
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L96
            r2 = 1
            goto L1d
        Lad:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.tigon.TigonHatchHttpClient.resolvedHeaders(com.facebook.aura.network.transport.HatchHttpRequest, java.lang.String, java.lang.Integer, java.lang.String):java.util.Map");
    }

    private final boolean shouldUseNoiseHttpRouting(String str) {
        return this.scheme == HatchAuthScheme.VM_JWT && TigonVmAuth.INSTANCE.isMetaAiVmUrl(str) && this.isVmNoiseHttpRoutingEnabled.invoke().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchHttpResponseStream transportFailureStream(Throwable th) {
        HatchHttpResponseStream.Companion companion = HatchHttpResponseStream.Companion;
        C9jH c9jHA0E = AGH.A0E();
        String message = th.getMessage();
        if (message == null) {
            message = C3cI.A0Y(th);
        }
        return companion.of(-1, "", c9jHA0E, null, message, false, th, HatchHttpResponseStream$Companion$of$1.INSTANCE);
    }

    private final HatchHttpTransportTimings transportTimings(CY1 cy1) {
        Number number;
        CY7 propertyGroupView = cy1.getPropertyGroupView(AbstractC4088Clr.A05);
        if (propertyGroupView == null) {
            return null;
        }
        CY4 cy4 = DC3.A02;
        Class cls = Long.TYPE;
        C0861A6i c0861A6i = new C0861A6i(cls);
        TigonPropertyContainer.Group group = propertyGroupView.A00;
        Number number2 = (Number) group.getProperty(cy4, c0861A6i);
        if (number2 == null) {
            return null;
        }
        long jLongValue = number2.longValue();
        long jTransportTimings$offsetMs = transportTimings$offsetMs(propertyGroupView, jLongValue, DC3.A07);
        long jTransportTimings$offsetMs2 = transportTimings$offsetMs(propertyGroupView, jLongValue, DC3.A06);
        long jTransportTimings$offsetMs3 = transportTimings$offsetMs(propertyGroupView, jLongValue, DC3.A04);
        long jTransportTimings$offsetMs4 = transportTimings$offsetMs(propertyGroupView, jLongValue, DC3.A03);
        long jTransportTimings$offsetMs5 = transportTimings$offsetMs(propertyGroupView, jLongValue, DC3.A05);
        Number number3 = (Number) group.getProperty(DC3.A00, new C0861A6i(cls));
        if (number3 == null || number3.longValue() != 1 || jTransportTimings$offsetMs4 != 0 || (number = (Number) group.getProperty(DC3.A01, new C0861A6i(cls))) == null || number.longValue() <= 0 || jTransportTimings$offsetMs < 0 || jTransportTimings$offsetMs2 < jTransportTimings$offsetMs || jTransportTimings$offsetMs3 < jTransportTimings$offsetMs2 || jTransportTimings$offsetMs5 < jTransportTimings$offsetMs3) {
            return null;
        }
        return new HatchHttpTransportTimings(jTransportTimings$offsetMs, jTransportTimings$offsetMs2 - jTransportTimings$offsetMs, jTransportTimings$offsetMs3 - jTransportTimings$offsetMs2, "tigon_request_stats");
    }

    public static final long transportTimings$offsetMs(CY7 cy7, long j, CY4 cy4) {
        C0861A6i c0861A6i = new C0861A6i(Long.TYPE);
        C7384Etj.A0Y(cy4, 0);
        Number number = (Number) cy7.A00.getProperty(cy4, c0861A6i);
        return BV4.A05((number != null ? number.longValue() : j) - j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, X.9jH, java.util.Map] */
    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public Object executeStreaming(HatchHttpRequest hatchHttpRequest, final OutputStream outputStream, HtJ<? super HatchHttpResponse> htJ) throws DispatchException {
        if (AuraNetworkMonitor._state.getValue() instanceof AuraNetworkState.Offline) {
            return TigonHatchHttpClientKt.transportFailureResponse(new NoNetworkException(hatchHttpRequest.url));
        }
        EncodedBody encodedBodyEncodeBody = TigonHatchHttpClientKt.encodeBody(hatchHttpRequest.body);
        String str = encodedBodyEncodeBody.contentType;
        byte[] bArr = encodedBodyEncodeBody.bytes;
        Integer numA0R = bArr != null ? C3cG.A0R(bArr.length) : null;
        ?? A0E = AGH.A0E();
        TigonRequest tigonRequestBuildTigonRequestInternal = buildTigonRequestInternal(hatchHttpRequest, str, null, A0E, numA0R);
        final String strNoiseInboundHost = noiseInboundHost(hatchHttpRequest.url);
        final GBL gblA03 = C7Bm.A03(htJ);
        final F1E f1e = new F1E();
        f1e.element = -1;
        final C10543Hqv c10543HqvA0z = C3cG.A0z();
        c10543HqvA0z.element = A0E;
        final F1F f1f = new F1F();
        final C10543Hqv c10543HqvA0z2 = C3cG.A0z();
        final AtomicReference atomicReferenceA16 = BV4.A16(null);
        try {
            atomicReferenceA16.set(AbstractC4085Cli.A00(this.tigonHttpClientProvider.invoke(), encodedBodyEncodeBody.toBodyProvider(), new TigonCallbacks() { // from class: com.facebook.aura.network.transport.tigon.TigonHatchHttpClient$executeStreaming$2$callbacks$1
                @Override // com.facebook.tigon.TigonCallbacks
                public void onBody(ByteBuffer byteBuffer) {
                    int iRemaining;
                    C7384Etj.A0Y(byteBuffer, 0);
                    String str2 = strNoiseInboundHost;
                    if (str2 != null) {
                        HatchVmInboundTraffic.INSTANCE.recordBytesReceived(str2);
                    }
                    try {
                        if (f1f.element && c10543HqvA0z2.element == null && (iRemaining = byteBuffer.remaining()) > 0) {
                            byte[] bArr2 = new byte[iRemaining];
                            byteBuffer.get(bArr2);
                            outputStream.write(bArr2);
                        }
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }

                @Override // com.facebook.tigon.TigonCallbacks
                public void onError(TigonError tigonError, CY1 cy1) {
                    Hm1<HatchHttpResponse> hm1;
                    HatchHttpResponse hatchHttpResponseOf;
                    C7384Etj.A0Y(tigonError, 0);
                    if (gblA03.isActive()) {
                        Throwable th = c10543HqvA0z2.element;
                        if (th != null) {
                            hm1 = gblA03;
                            hatchHttpResponseOf = TigonHatchHttpClientKt.transportFailureResponse(th);
                        } else {
                            String strA0s = BV8.A0s(tigonError);
                            TigonErrorCode tigonErrorCode = tigonError.category;
                            TigonErrorCode tigonErrorCode2 = TigonErrorCode.A04;
                            hm1 = gblA03;
                            if (tigonErrorCode == tigonErrorCode2) {
                                hm1.A5x(new CancellationException(strA0s));
                                return;
                            }
                            hatchHttpResponseOf = HatchHttpResponse.Companion.of(f1e.element, "", c10543HqvA0z.element, null, strA0s, false, HatchHttpCacheStatus.NETWORK, new TigonTransportException(strA0s, tigonError));
                        }
                        hm1.resumeWith(hatchHttpResponseOf);
                    }
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.Map<java.lang.String, java.lang.String>] */
                @Override // com.facebook.tigon.TigonCallbacks
                public void onResponse(CYF cyf) {
                    C7384Etj.A0Y(cyf, 0);
                    F1E f1e2 = f1e;
                    int i = cyf.A00;
                    f1e2.element = i;
                    c10543HqvA0z.element = cyf.A01;
                    F1F f1f2 = f1f;
                    boolean z = false;
                    if (200 <= i && i < 300) {
                        z = true;
                    }
                    f1f2.element = z;
                }

                @Override // com.facebook.tigon.TigonCallbacks
                public void onEOM(CY1 cy1) {
                    if (gblA03.isActive()) {
                        Throwable th = c10543HqvA0z2.element;
                        gblA03.resumeWith(th != null ? TigonHatchHttpClientKt.transportFailureResponse(th) : HatchHttpResponse.Companion.of(f1e.element, "", c10543HqvA0z.element, null, null, f1f.element, HatchHttpCacheStatus.NETWORK, null));
                    }
                }
            }, tigonRequestBuildTigonRequestInternal, AuraExecutors.INSTANCE.createResponseStreamingSerialExecutor()));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            if (gblA03.isActive()) {
                gblA03.resumeWith(TigonHatchHttpClientKt.transportFailureResponse(th));
            }
        }
        gblA03.AO2(new TigonHatchHttpClient$executeStreaming$2$1(atomicReferenceA16));
        return gblA03.A0F();
    }

    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public Object executeVmProbe(String str, String str2, List<HatchHttpRequest> list, HatchVmProbeAuthProvider hatchVmProbeAuthProvider, HatchVmProbeResponseObserver hatchVmProbeResponseObserver, HtJ<? super HatchVmProbeResult> htJ) {
        if (this.scheme != HatchAuthScheme.VM_JWT) {
            return null;
        }
        return ScopedNoiseIdentityProbe.INSTANCE.execute(str, str2, list, hatchVmProbeAuthProvider, hatchVmProbeResponseObserver, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, X.9jH, java.util.Map] */
    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public Object openResponseStream(HatchHttpRequest hatchHttpRequest, HtJ<? super HatchHttpResponseStream> htJ) {
        if (AuraNetworkMonitor._state.getValue() instanceof AuraNetworkState.Offline) {
            return transportFailureStream(new NoNetworkException(hatchHttpRequest.url));
        }
        EncodedBody encodedBodyEncodeBody = TigonHatchHttpClientKt.encodeBody(hatchHttpRequest.body);
        String str = encodedBodyEncodeBody.contentType;
        byte[] bArr = encodedBodyEncodeBody.bytes;
        Integer numA0R = bArr != null ? C3cG.A0R(bArr.length) : null;
        ?? A0E = AGH.A0E();
        TigonRequest tigonRequestBuildTigonRequestInternal = buildTigonRequestInternal(hatchHttpRequest, str, null, A0E, numA0R);
        final String strNoiseInboundHost = noiseInboundHost(hatchHttpRequest.url);
        GBL gblA03 = C7Bm.A03(htJ);
        final AtomicReference atomicReferenceA16 = BV4.A16(null);
        AtomicBoolean atomicBooleanA12 = BV4.A12(false);
        final AtomicBoolean atomicBooleanA122 = BV4.A12(false);
        final F1E f1e = new F1E();
        f1e.element = -1;
        final C10543Hqv c10543HqvA0z = C3cG.A0z();
        c10543HqvA0z.element = A0E;
        final F1F f1f = new F1F();
        int i = AuraTigonServiceProvider.GATEWAY_STREAM_OPEN_PING_TIMEOUT_MS;
        final C4884DBm c4884DBm = new C4884DBm(F0C.A02().A00);
        final TigonHatchHttpClient$openResponseStream$2$closeStream$1 tigonHatchHttpClient$openResponseStream$2$closeStream$1 = new TigonHatchHttpClient$openResponseStream$2$closeStream$1(c4884DBm, this, atomicBooleanA122, atomicReferenceA16);
        final TigonHatchHttpClient$openResponseStream$2$deliverResponse$1 tigonHatchHttpClient$openResponseStream$2$deliverResponse$1 = new TigonHatchHttpClient$openResponseStream$2$deliverResponse$1(atomicBooleanA12, gblA03);
        TigonCallbacks tigonCallbacks = new TigonCallbacks() { // from class: com.facebook.aura.network.transport.tigon.TigonHatchHttpClient$openResponseStream$2$callbacks$1
            @Override // com.facebook.tigon.TigonCallbacks
            public void onBody(ByteBuffer byteBuffer) {
                C7384Etj.A0Y(byteBuffer, 0);
                String str2 = strNoiseInboundHost;
                if (str2 != null) {
                    HatchVmInboundTraffic.INSTANCE.recordBytesReceived(str2);
                }
                if (atomicBooleanA122.get()) {
                    BV5.A1K(byteBuffer);
                    return;
                }
                try {
                    C4884DBm c4884DBm2 = c4884DBm;
                    try {
                        ReentrantLock reentrantLock = c4884DBm2.A06;
                        reentrantLock.lock();
                        if (c4884DBm2.A08) {
                            throw C3cG.A0Q("Writing to closed buffer");
                        }
                        if (c4884DBm2.A07) {
                            c4884DBm2.A03.releaseBodyBuffer(byteBuffer);
                        } else {
                            if (byteBuffer.remaining() != byteBuffer.capacity()) {
                                throw BV4.A0P();
                            }
                            if (byteBuffer.hasRemaining()) {
                                c4884DBm2.A04.add(byteBuffer);
                                c4884DBm2.A01 += byteBuffer.remaining();
                                c4884DBm2.A00 = Math.max(c4884DBm2.A00, c4884DBm2.available());
                                c4884DBm2.A05.signalAll();
                            }
                        }
                        reentrantLock.unlock();
                    } catch (Throwable th) {
                        c4884DBm2.A06.unlock();
                        throw th;
                    }
                } catch (Throwable th2) {
                    BV5.A1K(byteBuffer);
                    c4884DBm.A02(th2);
                    TigonHatchHttpClient.openResponseStream$lambda$0$cancelRequest(atomicBooleanA122, atomicReferenceA16);
                    tigonHatchHttpClient$openResponseStream$2$deliverResponse$1.invoke(this.transportFailureStream(th2));
                }
            }

            @Override // com.facebook.tigon.TigonCallbacks
            public void onError(TigonError tigonError, CY1 cy1) {
                C7384Etj.A0Y(tigonError, 0);
                String strA0s = BV8.A0s(tigonError);
                Throwable tigonStreamCanceledException = tigonError.category == TigonErrorCode.A04 ? new TigonStreamCanceledException(strA0s) : new TigonTransportException(strA0s, tigonError);
                c4884DBm.A02(tigonStreamCanceledException);
                tigonHatchHttpClient$openResponseStream$2$deliverResponse$1.invoke(HatchHttpResponseStream.Companion.of(f1e.element, "", c10543HqvA0z.element, null, strA0s, false, tigonStreamCanceledException, tigonHatchHttpClient$openResponseStream$2$closeStream$1));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0, types: [T, java.util.Map, java.util.Map<java.lang.String, java.lang.String>] */
            @Override // com.facebook.tigon.TigonCallbacks
            public void onResponse(CYF cyf) {
                C7384Etj.A0Y(cyf, 0);
                F1E f1e2 = f1e;
                int i2 = cyf.A00;
                f1e2.element = i2;
                C10543Hqv<Map<String, String>> c10543Hqv = c10543HqvA0z;
                ?? r5 = cyf.A01;
                c10543Hqv.element = r5;
                F1F f1f2 = f1f;
                boolean z = false;
                if (200 <= i2 && i2 < 300) {
                    z = true;
                }
                f1f2.element = z;
                tigonHatchHttpClient$openResponseStream$2$deliverResponse$1.invoke(HatchHttpResponseStream.Companion.of(i2, "", r5, c4884DBm, null, z, null, tigonHatchHttpClient$openResponseStream$2$closeStream$1));
            }

            @Override // com.facebook.tigon.TigonCallbacks
            public void onEOM(CY1 cy1) {
                c4884DBm.A01();
                tigonHatchHttpClient$openResponseStream$2$deliverResponse$1.invoke(HatchHttpResponseStream.Companion.of(f1e.element, "", c10543HqvA0z.element, null, null, f1f.element, null, tigonHatchHttpClient$openResponseStream$2$closeStream$1));
            }
        };
        gblA03.AO2(new TigonHatchHttpClient$openResponseStream$2$1(tigonHatchHttpClient$openResponseStream$2$closeStream$1));
        try {
            TigonRequestToken tigonRequestTokenA00 = AbstractC4085Cli.A00(this.tigonHttpClientProvider.invoke(), encodedBodyEncodeBody.toBodyProvider(), tigonCallbacks, tigonRequestBuildTigonRequestInternal, AuraExecutors.INSTANCE.createResponseStreamingSerialExecutor());
            atomicReferenceA16.set(tigonRequestTokenA00);
            if (atomicBooleanA122.get()) {
                tigonRequestTokenA00.cancel();
            }
        } catch (CancellationException e) {
            tigonHatchHttpClient$openResponseStream$2$closeStream$1.invoke();
            throw e;
        } catch (Throwable th) {
            tigonHatchHttpClient$openResponseStream$2$closeStream$1.invoke();
            tigonHatchHttpClient$openResponseStream$2$deliverResponse$1.invoke(transportFailureStream(th));
        }
        return gblA03.A0F();
    }

    private final Map<String, String> e2eProxyHeaders(String str) {
        String e2eProxyString = getE2eProxyString();
        Map<String, String> mapA0J = null;
        if (e2eProxyString != null && TigonVmAuth.INSTANCE.isMetaAiVmUrl(str)) {
            try {
                URI uri = new URI(str);
                String host = uri.getHost();
                if (host != null) {
                    if (uri.getPort() != -1) {
                        host = FGI.A0S(host, ":", uri.getPort());
                    }
                    mapA0J = AIW.A0J(C3cG.A0r(TigonHatchHttpClientKt.E2E_PROXY_HEADER, host));
                    return mapA0J;
                }
            } catch (Exception unused) {
                return mapA0J;
            }
        }
        return null;
    }

    public static final void openResponseStream$lambda$0$cancelRequest(AtomicBoolean atomicBoolean, AtomicReference<TigonRequestToken> atomicReference) {
        if (C3cI.A1W(atomicBoolean)) {
            BV5.A1L(atomicReference);
        }
    }

    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public Object executeWithBearer(HatchHttpRequest hatchHttpRequest, String str, String str2, HtJ<? super HatchHttpResponse> htJ) {
        if (C7BY.A0j(str) || !TigonHatchHttpClientKt.hasExpectedHttpsHost(hatchHttpRequest.url, str2)) {
            return null;
        }
        if (TigonHatchHttpClientKt.allowsExplicitBearerFor(this.scheme, str2) || (this.scopedVmChannel && shouldUseNoiseHttpRouting(hatchHttpRequest.url))) {
            return executeInternal(hatchHttpRequest, FGI.A0M("Bearer ", str), htJ);
        }
        return null;
    }

    public final Object openDuplexStreamWithBearer(HatchHttpRequest hatchHttpRequest, String str, String str2, HatchDuplexResponseHandler hatchDuplexResponseHandler, HtJ<? super HatchDuplexHttpStream> htJ) {
        return (!C7BY.A0j(str) && TigonHatchHttpClientKt.hasExpectedHttpsHost(hatchHttpRequest.url, str2) && this.scopedVmChannel && this.scheme == HatchAuthScheme.VM_JWT && shouldUseNoiseHttpRouting(hatchHttpRequest.url)) ? openDuplexStreamInternal(hatchHttpRequest, hatchDuplexResponseHandler, FGI.A0M("Bearer ", str), htJ) : new FailedTigonDuplexHttpStream(TigonHatchHttpClientKt.transportFailureResponse(C60O.A0i("duplex bearer not allowed")));
    }

    /* renamed from: com.facebook.aura.network.transport.tigon.TigonHatchHttpClient$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<String, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C7384Etj.A0Y(str, 0);
            AuraTigonServiceProvider.INSTANCE.preconnect(str);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TigonHatchHttpClient(HatchAuthScheme hatchAuthScheme, Function0<? extends DCW> function0, Function0<Boolean> function02, Function0<String> function03, G0U<? super String, Unit> g0u, boolean z) {
        AnonymousClass005.A17(hatchAuthScheme, function0, function02, function03, g0u);
        this.scheme = hatchAuthScheme;
        this.tigonHttpClientProvider = function0;
        this.isVmNoiseHttpRoutingEnabled = function02;
        this.e2eProxyStringProvider = function03;
        this.preconnector = g0u;
        this.scopedVmChannel = z;
        this.e2eProxyString$delegate = C5322DgG.A01((Function0) new TigonHatchHttpClient$e2eProxyString$2(this));
    }
}
