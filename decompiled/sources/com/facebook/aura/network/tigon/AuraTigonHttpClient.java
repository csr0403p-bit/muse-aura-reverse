package com.facebook.aura.network.tigon;

import X.AGH;
import X.AbstractC2159Azp;
import X.AbstractC4085Cli;
import X.AbstractC4087Clp;
import X.AbstractC4088Clr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV4;
import X.BV5;
import X.BV8;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.CXt;
import X.CY1;
import X.CYF;
import X.CYV;
import X.HtJ;
import X.HzP;
import android.os.Handler;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.network.AuraAuthHeaders;
import com.facebook.aura.network.AuraHttpResponse;
import com.facebook.aura.network.AuraUserAgent;
import com.facebook.aura.network.state.AuraNetworkMonitor;
import com.facebook.aura.network.state.AuraNetworkState;
import com.facebook.tigon.TigonBodyProvider;
import com.facebook.tigon.TigonCallbacks;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.iface.TigonPropertyContainer;
import com.facebook.tigon.iface.TigonRequest;
import com.facebook.tigon.iface.TigonRequestBuilder;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class AuraTigonHttpClient {
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String CONTENT_LENGTH_HEADER = "Content-Length";
    public static final String CONTENT_TYPE_HEADER = "Content-Type";
    public static final long DEFAULT_TIMEOUT_MS = 20000;
    public static final AuraTigonHttpClient INSTANCE = new AuraTigonHttpClient();
    public static final Set<String> RETRYABLE_METHODS = C60O.A1A(TigonRequest.GET, TigonRequest.HEAD, "PUT");
    public static final String USER_AGENT_HEADER = "User-Agent";

    @DebugMetadata(c = "com.facebook.aura.network.tigon.AuraTigonHttpClient", f = "AuraTigonHttpClient.kt", l = {94}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.network.tigon.AuraTigonHttpClient$execute$1, reason: invalid class name and case insensitive filesystem */
    public final class C127251 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C127251(HtJ<? super C127251> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraTigonHttpClient.this.execute(null, this);
        }
    }

    public final byte[] copyBodyBufferForTesting$fbandroid_express_aura_java_com_facebook_aura_network_tigon_tigon(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return BV5.A1X(byteBuffer);
    }

    public final Object get(String str, String str2, Map<String, String> map, Long l, CYV cyv, CXt cXt, AuraTigonAuthPolicy auraTigonAuthPolicy, boolean z, boolean z2, HtJ<? super AuraHttpResponse> htJ) {
        return execute(new AuraTigonHttpRequest(TigonRequest.GET, str, str2, map, null, l, true, cyv, cXt, null, auraTigonAuthPolicy, z, z2), htJ);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraTigonAuthPolicy.values().length];
            try {
                AnonymousClass002.A13(AuraTigonAuthPolicy.NONE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraTigonAuthPolicy.META, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraTigonAuthPolicy.VM, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final String authHeaderValue(AuraTigonHttpRequest auraTigonHttpRequest) {
        int iOrdinal = auraTigonHttpRequest.authPolicy.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            return AuraAuthHeaders.INSTANCE.currentMetaBearer();
        }
        if (iOrdinal == 2) {
            return AuraAuthHeaders.INSTANCE.currentVmBearer();
        }
        throw C3cG.A0q();
    }

    private final TigonBodyProvider bodyProvider(AuraTigonHttpRequest auraTigonHttpRequest) {
        AuraTigonBody auraTigonBody = auraTigonHttpRequest.body;
        if (auraTigonBody != null) {
            return auraTigonBody.createProvider();
        }
        return null;
    }

    private final TigonRequest buildTigonRequest(AuraTigonHttpRequest auraTigonHttpRequest) {
        TigonRequestBuilder tigonRequestBuilder = new TigonRequestBuilder(auraTigonHttpRequest.method, auraTigonHttpRequest.url);
        long jResolveTimeoutMs = resolveTimeoutMs(auraTigonHttpRequest.timeoutMs);
        tigonRequestBuilder.setIdleTimeoutMS(jResolveTimeoutMs);
        tigonRequestBuilder.setRequestTimeoutMS(jResolveTimeoutMs);
        tigonRequestBuilder.setRequestCategory(auraTigonHttpRequest.requestCategory);
        tigonRequestBuilder.setPurpose(auraTigonHttpRequest.requestPurpose);
        Boolean bool = auraTigonHttpRequest.retryable;
        tigonRequestBuilder.retryable = bool != null ? bool.booleanValue() : isRetryable(auraTigonHttpRequest.method);
        tigonRequestBuilder.setFriendlyNameAndTags(auraTigonHttpRequest.friendlyName, "", "AuraTigonHttpClient");
        if (!auraTigonHttpRequest.followRedirects) {
            TigonPropertyContainer.Group group = new TigonPropertyContainer.Group();
            group.setProperty(AbstractC4087Clp.A00, true, true);
            tigonRequestBuilder.setPropertyGroup(AbstractC4088Clr.A04, group);
        }
        tigonRequestBuilder.addHeaders(INSTANCE.headersWithPolicies(auraTigonHttpRequest));
        return tigonRequestBuilder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object delete$default(AuraTigonHttpClient auraTigonHttpClient, String str, String str2, Map map, Long l, CYV cyv, CXt cXt, AuraTigonAuthPolicy auraTigonAuthPolicy, boolean z, boolean z2, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            map = AGH.A0E();
        }
        if ((i & 8) != 0) {
            l = null;
        }
        if ((i & 16) != 0) {
            cyv = CYV.A03;
        }
        if ((i & 32) != 0) {
            cXt = CXt.A04;
        }
        if ((i & 64) != 0) {
            auraTigonAuthPolicy = AuraTigonAuthPolicy.NONE;
        }
        if ((i & 128) != 0) {
            z = true;
        }
        return auraTigonHttpClient.delete(str, str2, map, l, cyv, cXt, auraTigonAuthPolicy, z, C3cG.A1K(i & 256, z2), htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object execute$default(AuraTigonHttpClient auraTigonHttpClient, String str, String str2, String str3, Map map, byte[] bArr, String str4, Long l, boolean z, CYV cyv, CXt cXt, AuraTigonAuthPolicy auraTigonAuthPolicy, boolean z2, boolean z3, HtJ htJ, int i, Object obj) {
        if ((i & 8) != 0) {
            map = AGH.A0E();
        }
        if ((i & 16) != 0) {
            bArr = null;
        }
        if ((i & 32) != 0) {
            str4 = "application/json; charset=utf-8";
        }
        if ((i & 64) != 0) {
            l = null;
        }
        if ((i & 128) != 0) {
            z = true;
        }
        if ((i & 256) != 0) {
            cyv = CYV.A03;
        }
        if ((i & 512) != 0) {
            cXt = CXt.A04;
        }
        if ((i & 1024) != 0) {
            auraTigonAuthPolicy = AuraTigonAuthPolicy.NONE;
        }
        if ((i & 2048) != 0) {
            z2 = true;
        }
        return auraTigonHttpClient.execute(str, str2, str3, map, bArr, str4, l, z, cyv, cXt, auraTigonAuthPolicy, z2, C3cG.A1K(i & 4096, z3), htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(AuraTigonHttpClient auraTigonHttpClient, String str, String str2, Map map, Long l, CYV cyv, CXt cXt, AuraTigonAuthPolicy auraTigonAuthPolicy, boolean z, boolean z2, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            map = AGH.A0E();
        }
        if ((i & 8) != 0) {
            l = null;
        }
        if ((i & 16) != 0) {
            cyv = CYV.A03;
        }
        if ((i & 32) != 0) {
            cXt = CXt.A04;
        }
        if ((i & 64) != 0) {
            auraTigonAuthPolicy = AuraTigonAuthPolicy.NONE;
        }
        if ((i & 128) != 0) {
            z = true;
        }
        return auraTigonHttpClient.get(str, str2, map, l, cyv, cXt, auraTigonAuthPolicy, z, C3cG.A1K(i & 256, z2), htJ);
    }

    private final boolean isRetryable(String str) {
        return RETRYABLE_METHODS.contains(str.toUpperCase(Locale.ROOT));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object post$default(AuraTigonHttpClient auraTigonHttpClient, String str, String str2, byte[] bArr, Map map, String str3, Long l, CYV cyv, CXt cXt, AuraTigonAuthPolicy auraTigonAuthPolicy, boolean z, boolean z2, HtJ htJ, int i, Object obj) {
        if ((i & 8) != 0) {
            map = AGH.A0E();
        }
        if ((i & 16) != 0) {
            str3 = "application/json; charset=utf-8";
        }
        if ((i & 32) != 0) {
            l = null;
        }
        if ((i & 64) != 0) {
            cyv = CYV.A03;
        }
        if ((i & 128) != 0) {
            cXt = CXt.A04;
        }
        if ((i & 256) != 0) {
            auraTigonAuthPolicy = AuraTigonAuthPolicy.NONE;
        }
        if ((i & 512) != 0) {
            z = true;
        }
        return auraTigonHttpClient.post(str, str2, bArr, map, str3, l, cyv, cXt, auraTigonAuthPolicy, z, C3cG.A1K(i & 1024, z2), htJ);
    }

    private final long resolveTimeoutMs(Long l) {
        if (l != null) {
            return l.longValue();
        }
        return 20000L;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.network.AuraHttpResponse toAuraHttpResponse(X.C4086Clj r7) {
        /*
            r6 = this;
            com.facebook.tigon.TigonError r0 = r7.A00
            if (r0 == 0) goto L23
            java.lang.String r4 = X.BV8.A0s(r0)
            X.CYF r0 = r7.A01
            if (r0 == 0) goto L21
            int r1 = r0.A00
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.A01
            if (r2 != 0) goto L16
        L12:
            X.9jH r2 = X.AGH.A0E()
        L16:
            r3 = 0
            r5 = 0
            java.lang.String r6 = ""
            com.facebook.aura.network.AuraHttpResponse r0 = new com.facebook.aura.network.AuraHttpResponse
            r7 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L21:
            r1 = -1
            goto L12
        L23:
            X.CYF r0 = r7.A01
            if (r0 == 0) goto L47
            int r1 = r0.A00
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.A01
            if (r2 != 0) goto L31
        L2d:
            X.9jH r2 = X.AGH.A0E()
        L31:
            java.io.InputStream r3 = r7.A03
            r0 = 200(0xc8, float:2.8E-43)
            if (r0 > r1) goto L3c
            r0 = 300(0x12c, float:4.2E-43)
            r5 = 1
            if (r1 < r0) goto L3d
        L3c:
            r5 = 0
        L3d:
            r4 = 0
            java.lang.String r6 = ""
            com.facebook.aura.network.AuraHttpResponse r0 = new com.facebook.aura.network.AuraHttpResponse
            r7 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L47:
            r1 = -1
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.tigon.AuraTigonHttpClient.toAuraHttpResponse(X.Clj):com.facebook.aura.network.AuraHttpResponse");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(com.facebook.aura.network.tigon.AuraTigonHttpRequest r9, X.HtJ<? super com.facebook.aura.network.AuraHttpResponse> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.network.tigon.AuraTigonHttpClient.C127251
            if (r0 == 0) goto L6d
            r7 = r10
            com.facebook.aura.network.tigon.AuraTigonHttpClient$execute$1 r7 = (com.facebook.aura.network.tigon.AuraTigonHttpClient.C127251) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6d
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r3 = 1
            if (r0 == 0) goto L27
            if (r0 != r3) goto L73
            X.Hwg.A00(r1)
        L20:
            X.Clj r1 = (X.C4086Clj) r1
            com.facebook.aura.network.AuraHttpResponse r6 = r8.toAuraHttpResponse(r1)
            return r6
        L27:
            X.Hwg.A00(r1)
            X.BLG<com.facebook.aura.network.state.AuraNetworkState> r0 = com.facebook.aura.network.state.AuraNetworkMonitor._state
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof com.facebook.aura.network.state.AuraNetworkState.Online
            if (r0 != 0) goto L39
            com.facebook.aura.network.AuraHttpResponse r6 = r8.offlineResponse()
            return r6
        L39:
            com.facebook.tigon.iface.TigonRequest r5 = r8.buildTigonRequest(r9)
            X.F0C r0 = com.facebook.aura.network.tigon.AuraTigonServiceProvider.tigonHttpClient$delegate
            java.lang.Object r4 = r0.getValue()
            X.Cli r4 = (X.AbstractC4085Cli) r4
            com.facebook.tigon.TigonBodyProvider r2 = r8.bodyProvider(r9)
            r1 = 0
            r7.L$0 = r1
            r7.L$1 = r1
            r7.label = r3
            X.GBL r3 = X.C7Bm.A04(r7)
            X.Clh r0 = new X.Clh
            r0.<init>(r3)
            com.facebook.tigon.TigonRequestToken r2 = X.AbstractC4085Cli.A00(r4, r2, r0, r5, r1)
            r1 = 5
            X.EQe r0 = new X.EQe
            r0.<init>(r2, r1)
            r3.AO2(r0)
            java.lang.Object r1 = r3.A0F()
            if (r1 != r6) goto L20
            return r6
        L6d:
            com.facebook.aura.network.tigon.AuraTigonHttpClient$execute$1 r7 = new com.facebook.aura.network.tigon.AuraTigonHttpClient$execute$1
            r7.<init>(r10)
            goto L12
        L73:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.tigon.AuraTigonHttpClient.execute(com.facebook.aura.network.tigon.AuraTigonHttpRequest, X.HtJ):java.lang.Object");
    }

    public final Object post(String str, String str2, byte[] bArr, Map<String, String> map, String str3, Long l, CYV cyv, CXt cXt, AuraTigonAuthPolicy auraTigonAuthPolicy, boolean z, boolean z2, HtJ<? super AuraHttpResponse> htJ) {
        return execute(new AuraTigonHttpRequest("POST", str, str2, map, AuraTigonBody.Companion.bytes(bArr, str3), l, true, cyv, cXt, AnonymousClass001.A0h(), auraTigonAuthPolicy, z, z2), htJ);
    }

    private final boolean hasHeader(Map<String, String> map, String str) {
        Set<String> setKeySet = map.keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            Iterator<String> it = setKeySet.iterator();
            while (it.hasNext()) {
                if (AbstractC2159Azp.A12(AnonymousClass005.A0j(it), str, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final Map<String, String> headersWithPolicies(AuraTigonHttpRequest auraTigonHttpRequest) {
        String strAuthHeaderValue;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(auraTigonHttpRequest.headers);
        while (itA0n.hasNext()) {
            AnonymousClass006.A1R(linkedHashMapA0j, C3cH.A0l(itA0n));
        }
        if (auraTigonHttpRequest.addUserAgent && !hasHeader(linkedHashMapA0j, "User-Agent")) {
            linkedHashMapA0j.put("User-Agent", AuraUserAgent.fullUserAgent.getValue());
        }
        if (!hasHeader(linkedHashMapA0j, "Authorization") && (strAuthHeaderValue = authHeaderValue(auraTigonHttpRequest)) != null) {
            linkedHashMapA0j.put("Authorization", strAuthHeaderValue);
        }
        AuraTigonBody auraTigonBody = auraTigonHttpRequest.body;
        if (auraTigonBody != null) {
            if (auraTigonBody.contentType != null && !INSTANCE.hasHeader(linkedHashMapA0j, "Content-Type")) {
                linkedHashMapA0j.put("Content-Type", auraTigonBody.contentType);
            }
            if (auraTigonBody.contentLength >= 0 && !INSTANCE.hasHeader(linkedHashMapA0j, "Content-Length")) {
                linkedHashMapA0j.put("Content-Length", String.valueOf(auraTigonBody.contentLength));
            }
        }
        return linkedHashMapA0j;
    }

    private final AuraHttpResponse offlineResponse() {
        return new AuraHttpResponse(-1, AGH.A0E(), null, "offline", false, "", null);
    }

    private final byte[] toByteArray(ByteBuffer byteBuffer) {
        return BV5.A1X(byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputStream toInputStream(List<? extends InputStream> list) {
        return list.isEmpty() ? BV4.A0E(new byte[0]) : new SequenceInputStream(Collections.enumeration(list));
    }

    public final Object delete(String str, String str2, Map<String, String> map, Long l, CYV cyv, CXt cXt, AuraTigonAuthPolicy auraTigonAuthPolicy, boolean z, boolean z2, HtJ<? super AuraHttpResponse> htJ) {
        return execute(new AuraTigonHttpRequest("DELETE", str, str2, map, null, l, true, cyv, cXt, AnonymousClass001.A0h(), auraTigonAuthPolicy, z, z2), htJ);
    }

    public final void enqueue(AuraTigonHttpRequest auraTigonHttpRequest, final AuraTigonCallback auraTigonCallback) {
        AnonymousClass003.A0u(auraTigonHttpRequest, auraTigonCallback);
        final Handler handlerA02 = C60O.A02();
        if (!(AuraNetworkMonitor._state.getValue() instanceof AuraNetworkState.Online)) {
            final AuraHttpResponse auraHttpResponseOfflineResponse = offlineResponse();
            handlerA02.post(new Runnable() { // from class: com.facebook.aura.network.tigon.AuraTigonHttpClient.enqueue.1
                @Override // java.lang.Runnable
                public final void run() {
                    AuraTigonCallback auraTigonCallback2 = auraTigonCallback;
                    AuraHttpResponse auraHttpResponse = auraHttpResponseOfflineResponse;
                    auraTigonCallback2.onFailure(auraHttpResponse, auraHttpResponse.errorMessage);
                }
            });
        } else {
            TigonCallbacks tigonCallbacks = new TigonCallbacks() { // from class: com.facebook.aura.network.tigon.AuraTigonHttpClient$enqueue$tigonCallbacks$1
                public final List<InputStream> bodyChunks = C3cG.A0h();
                public CYF response;

                @Override // com.facebook.tigon.TigonCallbacks
                public void onBody(ByteBuffer byteBuffer) {
                    C7384Etj.A0Y(byteBuffer, 0);
                    try {
                        this.bodyChunks.add(BV4.A0E(BV5.A1X(byteBuffer)));
                    } finally {
                        BV5.A1K(byteBuffer);
                    }
                }

                @Override // com.facebook.tigon.TigonCallbacks
                public void onError(TigonError tigonError, CY1 cy1) {
                    int i;
                    Map mapA0E;
                    C7384Etj.A0Y(tigonError, 0);
                    final String strA0s = BV8.A0s(tigonError);
                    CYF cyf = this.response;
                    if (cyf != null) {
                        i = cyf.A00;
                        mapA0E = cyf.A01;
                        if (mapA0E == null) {
                        }
                        final AuraHttpResponse auraHttpResponse = new AuraHttpResponse(i, mapA0E, null, strA0s, false, "", null);
                        Handler handler = handlerA02;
                        final AuraTigonCallback auraTigonCallback2 = auraTigonCallback;
                        handler.post(new Runnable() { // from class: com.facebook.aura.network.tigon.AuraTigonHttpClient$enqueue$tigonCallbacks$1$onError$1
                            @Override // java.lang.Runnable
                            public final void run() {
                                auraTigonCallback2.onFailure(auraHttpResponse, strA0s);
                            }
                        });
                    }
                    i = -1;
                    mapA0E = AGH.A0E();
                    final AuraHttpResponse auraHttpResponse2 = new AuraHttpResponse(i, mapA0E, null, strA0s, false, "", null);
                    Handler handler2 = handlerA02;
                    final AuraTigonCallback auraTigonCallback22 = auraTigonCallback;
                    handler2.post(new Runnable() { // from class: com.facebook.aura.network.tigon.AuraTigonHttpClient$enqueue$tigonCallbacks$1$onError$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            auraTigonCallback22.onFailure(auraHttpResponse2, strA0s);
                        }
                    });
                }

                @Override // com.facebook.tigon.TigonCallbacks
                public void onResponse(CYF cyf) {
                    C7384Etj.A0Y(cyf, 0);
                    this.response = cyf;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
                @Override // com.facebook.tigon.TigonCallbacks
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onEOM(X.CY1 r12) {
                    /*
                        r11 = this;
                        X.CYF r0 = r11.response
                        if (r0 == 0) goto L36
                        int r4 = r0.A00
                        java.util.Map<java.lang.String, java.lang.String> r5 = r0.A01
                        if (r5 != 0) goto Le
                    La:
                        X.9jH r5 = X.AGH.A0E()
                    Le:
                        com.facebook.aura.network.tigon.AuraTigonHttpClient r1 = com.facebook.aura.network.tigon.AuraTigonHttpClient.INSTANCE
                        java.util.List<java.io.InputStream> r0 = r11.bodyChunks
                        java.io.InputStream r6 = com.facebook.aura.network.tigon.AuraTigonHttpClient.access$toInputStream(r1, r0)
                        r0 = 200(0xc8, float:2.8E-43)
                        if (r0 > r4) goto L1f
                        r0 = 300(0x12c, float:4.2E-43)
                        r8 = 1
                        if (r4 < r0) goto L20
                    L1f:
                        r8 = 0
                    L20:
                        r7 = 0
                        java.lang.String r9 = ""
                        com.facebook.aura.network.AuraHttpResponse r3 = new com.facebook.aura.network.AuraHttpResponse
                        r10 = r7
                        r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                        android.os.Handler r2 = r2
                        com.facebook.aura.network.tigon.AuraTigonCallback r1 = r3
                        com.facebook.aura.network.tigon.AuraTigonHttpClient$enqueue$tigonCallbacks$1$onEOM$1 r0 = new com.facebook.aura.network.tigon.AuraTigonHttpClient$enqueue$tigonCallbacks$1$onEOM$1
                        r0.<init>()
                        r2.post(r0)
                        return
                    L36:
                        r4 = -1
                        goto La
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.tigon.AuraTigonHttpClient$enqueue$tigonCallbacks$1.onEOM(X.CY1):void");
                }
            };
            AbstractC4085Cli.A00((AbstractC4085Cli) AuraTigonServiceProvider.tigonHttpClient$delegate.getValue(), bodyProvider(auraTigonHttpRequest), tigonCallbacks, buildTigonRequest(auraTigonHttpRequest), AuraExecutors.INSTANCE.createSerialExecutor());
        }
    }

    public final Object execute(String str, String str2, String str3, Map<String, String> map, byte[] bArr, String str4, Long l, boolean z, CYV cyv, CXt cXt, AuraTigonAuthPolicy auraTigonAuthPolicy, boolean z2, boolean z3, HtJ<? super AuraHttpResponse> htJ) {
        AuraTigonBody auraTigonBodyBytes;
        if (bArr != null) {
            auraTigonBodyBytes = AuraTigonBody.Companion.bytes(bArr, str4);
        } else {
            auraTigonBodyBytes = null;
        }
        return execute(new AuraTigonHttpRequest(str, str2, str3, map, auraTigonBodyBytes, l, z, cyv, cXt, null, auraTigonAuthPolicy, z2, z3), htJ);
    }
}
