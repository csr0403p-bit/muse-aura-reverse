package com.facebook.aura.network.http;

import X.AGH;
import X.AIW;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BQG;
import X.BV3;
import X.C0924AIa;
import X.C10571Hud;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C6tn;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.CFK;
import X.EnumC10460Hji;
import X.F60;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.gateway.HatcheryVMIdUtilsKt;
import com.facebook.aura.gateway.VmAuthTokenKt;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.json.HatchEnvelopeDecoderKt;
import com.facebook.aura.json.HatchJarvisResponseDecoderKt;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.network.AuraAcceptLanguage;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.api.StefiPath;
import com.facebook.aura.network.transport.HatchDuplexHttpStream;
import com.facebook.aura.network.transport.HatchDuplexResponseHandler;
import com.facebook.aura.network.transport.HatchHttpCachePolicy;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpRequestAttemptObserverFactory;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchHttpResponseStream;
import com.facebook.aura.network.transport.HatchMultipartFilePart;
import com.facebook.aura.network.transport.HatchMultipartPart;
import com.facebook.aura.network.transport.HatchRequestBody;
import com.facebook.aura.network.transport.HatchRequestCategory;
import com.facebook.aura.network.transport.HatchRequestPriorityPolicyKt;
import com.facebook.aura.network.transport.HatchRequestPurpose;
import com.facebook.aura.network.transport.HatchResponseBodyPolicy;
import com.facebook.aura.network.transport.HatchVmProbeAuthProvider;
import com.facebook.aura.network.transport.HatchVmProbeResponseObserver;
import com.facebook.aura.network.transport.HatchVmProbeResult;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.OutputStream;
import java.net.URI;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchHttpApi {
    public static final HatchHttpApi INSTANCE = new HatchHttpApi();

    @DebugMetadata(c = "com.facebook.aura.network.http.HatchHttpApi$executeVmProbeAttempt$2", f = "HatchHttpApi.kt", l = {1478}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.network.http.HatchHttpApi$executeVmProbeAttempt$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchVmProbeResult>, Object> {
        public final /* synthetic */ HatchVmProbeAuthProvider $authProvider;
        public final /* synthetic */ String $authToken;
        public final /* synthetic */ List<JarvisPath> $endpoints;
        public final /* synthetic */ HatchVmProbeResponseObserver $responseObserver;
        public final /* synthetic */ String $vmUrl;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, List<? extends JarvisPath> list, String str2, HatchVmProbeAuthProvider hatchVmProbeAuthProvider, HatchVmProbeResponseObserver hatchVmProbeResponseObserver, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$vmUrl = str;
            this.$endpoints = list;
            this.$authToken = str2;
            this.$authProvider = hatchVmProbeAuthProvider;
            this.$responseObserver = hatchVmProbeResponseObserver;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$vmUrl, this.$endpoints, this.$authToken, this.$authProvider, this.$responseObserver, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String strRedactedGatewayUrlForLog;
            Object objExecuteVmProbe = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objExecuteVmProbe);
                    strRedactedGatewayUrlForLog = HatcheryVMIdUtilsKt.redactedGatewayUrlForLog(this.$vmUrl);
                    try {
                        HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                        String strJarvisHttpBaseUrl = hatchHttpApi.jarvisHttpBaseUrl(this.$vmUrl);
                        if (strJarvisHttpBaseUrl == null) {
                            C60O.A1P("executeVmProbeAttempt: cannot convert WebSocket URL to HTTP URL: ", strRedactedGatewayUrlForLog, HatchHttpApiKt.TAG);
                            return null;
                        }
                        List<JarvisPath> list = this.$endpoints;
                        String str = this.$authToken;
                        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                        Iterator<JarvisPath> it = list.iterator();
                        while (it.hasNext()) {
                            arrayListA0i.add(HatchHttpApi.buildJarvisRequest$default(hatchHttpApi, strJarvisHttpBaseUrl, it.next(), null, RequestType.GET, str, C3cG.A0S(20L), null, null, new HxE[0], null, false, false, false, 7872, null));
                        }
                        HatchHttpClient hatchHttpClientA08 = C60O.A08();
                        String str2 = this.$vmUrl;
                        String str3 = this.$authToken;
                        HatchVmProbeAuthProvider hatchVmProbeAuthProvider = this.$authProvider;
                        HatchVmProbeResponseObserver hatchVmProbeResponseObserver = this.$responseObserver;
                        this.L$0 = strRedactedGatewayUrlForLog;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 1;
                        objExecuteVmProbe = hatchHttpClientA08.executeVmProbe(str2, str3, arrayListA0i, hatchVmProbeAuthProvider, hatchVmProbeResponseObserver, this);
                        if (objExecuteVmProbe == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } catch (Exception e) {
                        e = e;
                        CFK.A08(HatchHttpApiKt.TAG, C60P.A1L("executeVmProbeAttempt failed for ", strRedactedGatewayUrlForLog, e.getMessage()), e);
                        return null;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    strRedactedGatewayUrlForLog = (String) this.L$0;
                    try {
                        Hwg.A00(objExecuteVmProbe);
                    } catch (Exception e2) {
                        e = e2;
                        CFK.A08(HatchHttpApiKt.TAG, C60P.A1L("executeVmProbeAttempt failed for ", strRedactedGatewayUrlForLog, e.getMessage()), e);
                        return null;
                    }
                }
                return (HatchVmProbeResult) objExecuteVmProbe;
            } catch (CancellationException e3) {
                throw e3;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchVmProbeResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.http.HatchHttpApi", f = "HatchHttpApi.kt", l = {497}, m = "makeJarvisHttpRequestInternal", v = 2)
    /* renamed from: com.facebook.aura.network.http.HatchHttpApi$makeJarvisHttpRequestInternal$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public boolean Z$0;
        public boolean Z$1;
        public boolean Z$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchHttpApi.this.makeJarvisHttpRequestInternal(null, null, null, null, null, null, null, false, null, false, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.http.HatchHttpApi$makeJarvisHttpRequestStreamingInternal$2", f = "HatchHttpApi.kt", l = {840}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.network.http.HatchHttpApi$makeJarvisHttpRequestStreamingInternal$2, reason: invalid class name and case insensitive filesystem */
    public final class C127182 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchHttpResponse>, Object> {
        public final /* synthetic */ String $body;
        public final /* synthetic */ JarvisPath $endpoint;
        public final /* synthetic */ Map<String, String> $extraHeaders;
        public final /* synthetic */ boolean $followRedirects;
        public final /* synthetic */ Long $idleTimeoutSeconds;
        public final /* synthetic */ HxE<String, Object>[] $queryParams;
        public final /* synthetic */ RequestType $requestType;
        public final /* synthetic */ OutputStream $sink;
        public final /* synthetic */ boolean $skipBodyObserver;
        public final /* synthetic */ Long $timeoutSeconds;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ String $wsUrl;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127182(String str, JarvisPath jarvisPath, String str2, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, Long l2, HxE<String, ? extends Object>[] hxEArr, Map<String, String> map, boolean z, boolean z2, OutputStream outputStream, HtJ<? super C127182> htJ) {
            super(2, htJ);
            this.$wsUrl = str;
            this.$endpoint = jarvisPath;
            this.$body = str2;
            this.$requestType = requestType;
            this.$userSession = abstractC3358CGz;
            this.$timeoutSeconds = l;
            this.$idleTimeoutSeconds = l2;
            this.$queryParams = hxEArr;
            this.$extraHeaders = map;
            this.$skipBodyObserver = z;
            this.$followRedirects = z2;
            this.$sink = outputStream;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C127182(this.$wsUrl, this.$endpoint, this.$body, this.$requestType, this.$userSession, this.$timeoutSeconds, this.$idleTimeoutSeconds, this.$queryParams, this.$extraHeaders, this.$skipBodyObserver, this.$followRedirects, this.$sink, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objExecuteStreaming = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        HatchHttpApi hatchHttpApiA06 = C60O.A06(objExecuteStreaming);
                        String strJarvisHttpBaseUrl = hatchHttpApiA06.jarvisHttpBaseUrl(this.$wsUrl);
                        if (strJarvisHttpBaseUrl == null) {
                            C60O.A1P("Cannot convert WebSocket URL to HTTP URL: ", HatcheryVMIdUtilsKt.redactedGatewayUrlForLog(this.$wsUrl), HatchHttpApiKt.TAG);
                            return null;
                        }
                        try {
                            HatchHttpRequest hatchHttpRequestBuildJarvisRequest$default = HatchHttpApi.buildJarvisRequest$default(hatchHttpApiA06, strJarvisHttpBaseUrl, this.$endpoint, this.$body, this.$requestType, VmAuthTokenKt.vmBoundAuthToken(this.$userSession), this.$timeoutSeconds, this.$idleTimeoutSeconds, null, this.$queryParams, this.$extraHeaders, false, this.$skipBodyObserver, this.$followRedirects, 1152, null);
                            HatchHttpClient hatchHttpClientA08 = C60O.A08();
                            OutputStream outputStream = this.$sink;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 1;
                            objExecuteStreaming = hatchHttpClientA08.executeStreaming(hatchHttpRequestBuildJarvisRequest$default, outputStream, this);
                            if (objExecuteStreaming == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                        } catch (Exception e) {
                            e = e;
                            C60O.A1Q("Failed to execute streaming Jarvis HTTP request: ", e.getMessage(), HatchHttpApiKt.TAG, e);
                            return null;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(objExecuteStreaming);
                    }
                    return (HatchHttpResponse) objExecuteStreaming;
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (CancellationException e3) {
                throw e3;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchHttpResponse> htJ) {
            return ((C127182) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.http.HatchHttpApi", f = "HatchHttpApi.kt", l = {677}, m = "makeJarvisHttpRequestWithCredentials", v = 2)
    /* renamed from: com.facebook.aura.network.http.HatchHttpApi$makeJarvisHttpRequestWithCredentials$1, reason: invalid class name and case insensitive filesystem */
    public final class C127191 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C127191(HtJ<? super C127191> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchHttpApi.this.makeJarvisHttpRequestWithCredentials(null, null, null, null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.http.HatchHttpApi$makeJarvisHttpStreamingPost$2", f = "HatchHttpApi.kt", l = {899}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.network.http.HatchHttpApi$makeJarvisHttpStreamingPost$2, reason: invalid class name and case insensitive filesystem */
    public final class C127202 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchHttpResponse>, Object> {
        public final /* synthetic */ String $accept;
        public final /* synthetic */ JarvisPath $endpoint;
        public final /* synthetic */ Long $idleTimeoutMs;
        public final /* synthetic */ Long $requestTimeoutMs;
        public final /* synthetic */ OutputStream $sink;
        public final /* synthetic */ String $wsUrl;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127202(String str, JarvisPath jarvisPath, String str2, Long l, Long l2, OutputStream outputStream, HtJ<? super C127202> htJ) {
            super(2, htJ);
            this.$wsUrl = str;
            this.$endpoint = jarvisPath;
            this.$accept = str2;
            this.$requestTimeoutMs = l;
            this.$idleTimeoutMs = l2;
            this.$sink = outputStream;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C127202(this.$wsUrl, this.$endpoint, this.$accept, this.$requestTimeoutMs, this.$idleTimeoutMs, this.$sink, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objExecuteStreaming = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    HatchHttpApi hatchHttpApiA06 = C60O.A06(objExecuteStreaming);
                    String strJarvisHttpBaseUrl = hatchHttpApiA06.jarvisHttpBaseUrl(this.$wsUrl);
                    if (strJarvisHttpBaseUrl == null) {
                        C60O.A1P("Cannot convert WebSocket URL to HTTP URL: ", HatcheryVMIdUtilsKt.redactedGatewayUrlForLog(this.$wsUrl), HatchHttpApiKt.TAG);
                        return null;
                    }
                    HatchHttpRequest hatchHttpRequestPost = HatchHttpRequest.Companion.post(hatchHttpApiA06.buildJarvisUrl(strJarvisHttpBaseUrl, this.$endpoint, new HxE[0]), HatchRequestBody.Empty.INSTANCE, AGH.A0D(C60O.A1Z(AuraAcceptLanguage.HEADER, AuraAcceptLanguage.INSTANCE.headerValue(), C3cG.A0r("Accept", this.$accept))), null, this.$requestTimeoutMs, this.$idleTimeoutMs, HatchRequestPriorityPolicyKt.categoryFor(this.$endpoint), HatchRequestPurpose.FETCH, null, false, false, true, HatchResponseBodyPolicy.DEFAULT, null, false, true);
                    HatchHttpClient hatchHttpClientA08 = C60O.A08();
                    OutputStream outputStream = this.$sink;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    objExecuteStreaming = hatchHttpClientA08.executeStreaming(hatchHttpRequestPost, outputStream, this);
                    if (objExecuteStreaming == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objExecuteStreaming);
                }
                return (HatchHttpResponse) objExecuteStreaming;
            } catch (Exception e) {
                C60O.A1Q("Failed to execute streaming Jarvis POST: ", e.getMessage(), HatchHttpApiKt.TAG, e);
                return null;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchHttpResponse> htJ) {
            return ((C127202) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.http.HatchHttpApi$openJarvisDuplexStream$2", f = "HatchHttpApi.kt", l = {943}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.network.http.HatchHttpApi$openJarvisDuplexStream$2, reason: invalid class name and case insensitive filesystem */
    public final class C127212 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchDuplexHttpStream>, Object> {
        public final /* synthetic */ JarvisPath $endpoint;
        public final /* synthetic */ HxE<String, Object>[] $queryParams;
        public final /* synthetic */ HatchDuplexResponseHandler $responseHandler;
        public final /* synthetic */ boolean $retryable;
        public final /* synthetic */ Long $timeoutSeconds;
        public final /* synthetic */ String $wsUrl;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127212(String str, JarvisPath jarvisPath, HxE<String, ? extends Object>[] hxEArr, Long l, boolean z, HatchDuplexResponseHandler hatchDuplexResponseHandler, HtJ<? super C127212> htJ) {
            super(2, htJ);
            this.$wsUrl = str;
            this.$endpoint = jarvisPath;
            this.$queryParams = hxEArr;
            this.$timeoutSeconds = l;
            this.$retryable = z;
            this.$responseHandler = hatchDuplexResponseHandler;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C127212(this.$wsUrl, this.$endpoint, this.$queryParams, this.$timeoutSeconds, this.$retryable, this.$responseHandler, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objOpenDuplexStream = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    HatchHttpApi hatchHttpApiA06 = C60O.A06(objOpenDuplexStream);
                    String strJarvisHttpBaseUrl = hatchHttpApiA06.jarvisHttpBaseUrl(this.$wsUrl);
                    if (strJarvisHttpBaseUrl == null) {
                        C60O.A1P("Cannot convert WebSocket URL to HTTP URL: ", HatcheryVMIdUtilsKt.redactedGatewayUrlForLog(this.$wsUrl), HatchHttpApiKt.TAG);
                        return null;
                    }
                    HatchHttpRequest.Companion companion = HatchHttpRequest.Companion;
                    String strBuildJarvisUrl = hatchHttpApiA06.buildJarvisUrl(strJarvisHttpBaseUrl, this.$endpoint, this.$queryParams);
                    HatchRequestBody.Empty empty = HatchRequestBody.Empty.INSTANCE;
                    Map<String, String> mapA0D = AGH.A0D(C60O.A1Z(AuraAcceptLanguage.HEADER, AuraAcceptLanguage.INSTANCE.headerValue(), C3cG.A0r("Accept", "application/octet-stream")));
                    Long l = this.$timeoutSeconds;
                    Long lA0S = l != null ? C3cG.A0S(l.longValue() * 1000) : null;
                    HatchHttpRequest hatchHttpRequestPost = companion.post(strBuildJarvisUrl, empty, mapA0D, lA0S, lA0S, lA0S, HatchRequestCategory.API, HatchRequestPurpose.FETCH, null, false, false, this.$retryable, HatchResponseBodyPolicy.DEFAULT, null, false, true);
                    HatchHttpClient hatchHttpClientA08 = C60O.A08();
                    HatchDuplexResponseHandler hatchDuplexResponseHandler = this.$responseHandler;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    objOpenDuplexStream = hatchHttpClientA08.openDuplexStream(hatchHttpRequestPost, hatchDuplexResponseHandler, this);
                    if (objOpenDuplexStream == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objOpenDuplexStream);
                }
                return (HatchDuplexHttpStream) objOpenDuplexStream;
            } catch (Exception e) {
                C60O.A1Q("Failed to open duplex Jarvis HTTP request: ", e.getMessage(), HatchHttpApiKt.TAG, e);
                return null;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchDuplexHttpStream> htJ) {
            return ((C127212) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.http.HatchHttpApi$openJarvisHttpPostStream$2", f = "HatchHttpApi.kt", l = {654}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.network.http.HatchHttpApi$openJarvisHttpPostStream$2, reason: invalid class name and case insensitive filesystem */
    public final class C127222 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchHttpStreamRequestResult>, Object> {
        public final /* synthetic */ String $accept;
        public final /* synthetic */ JarvisPath $endpoint;
        public final /* synthetic */ Long $idleTimeoutMs;
        public final /* synthetic */ Long $requestTimeoutMs;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ String $wsUrl;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127222(String str, AbstractC3358CGz abstractC3358CGz, JarvisPath jarvisPath, Long l, Long l2, String str2, HtJ<? super C127222> htJ) {
            super(2, htJ);
            this.$wsUrl = str;
            this.$userSession = abstractC3358CGz;
            this.$endpoint = jarvisPath;
            this.$requestTimeoutMs = l;
            this.$idleTimeoutMs = l2;
            this.$accept = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C127222(this.$wsUrl, this.$userSession, this.$endpoint, this.$requestTimeoutMs, this.$idleTimeoutMs, this.$accept, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objOpenResponseStream = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    HatchHttpApi hatchHttpApiA06 = C60O.A06(objOpenResponseStream);
                    String strJarvisHttpBaseUrl = hatchHttpApiA06.jarvisHttpBaseUrl(this.$wsUrl);
                    if (strJarvisHttpBaseUrl == null) {
                        HatchHttpFailure hatchHttpFailure = new HatchHttpFailure("bad_gateway_url", HatcheryVMIdUtilsKt.redactedGatewayUrlForLog(this.$wsUrl));
                        C60O.A1P("Cannot convert WebSocket URL to HTTP URL: ", hatchHttpFailure.getLogValue(), HatchHttpApiKt.TAG);
                        return new HatchHttpStreamRequestFailure(hatchHttpFailure);
                    }
                    String strVmBoundAuthToken = VmAuthTokenKt.vmBoundAuthToken(this.$userSession);
                    if (C7BY.A0j(strVmBoundAuthToken)) {
                        strVmBoundAuthToken = null;
                    }
                    HatchHttpRequest.Companion companion = HatchHttpRequest.Companion;
                    String strBuildJarvisUrl = hatchHttpApiA06.buildJarvisUrl(strJarvisHttpBaseUrl, this.$endpoint, new HxE[0]);
                    HatchRequestBody.Empty empty = HatchRequestBody.Empty.INSTANCE;
                    String str = this.$accept;
                    C0924AIa c0924AIaA0u = C3cG.A0u();
                    c0924AIaA0u.put("Accept", str);
                    c0924AIaA0u.put(AuraAcceptLanguage.HEADER, AuraAcceptLanguage.INSTANCE.headerValue());
                    if (strVmBoundAuthToken != null) {
                        c0924AIaA0u.put("Authorization", FGI.A0M("Bearer ", strVmBoundAuthToken));
                    }
                    HatchHttpRequest hatchHttpRequestPost = companion.post(strBuildJarvisUrl, empty, AIW.A0K(c0924AIaA0u), null, this.$requestTimeoutMs, this.$idleTimeoutMs, HatchRequestPriorityPolicyKt.categoryFor(this.$endpoint), HatchRequestPurpose.FETCH, null, false, false, true, HatchResponseBodyPolicy.DEFAULT, null, false, true);
                    HatchHttpClient hatchHttpClientA08 = C60O.A08();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 1;
                    objOpenResponseStream = hatchHttpClientA08.openResponseStream(hatchHttpRequestPost, this);
                    if (objOpenResponseStream == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objOpenResponseStream);
                }
                return new HatchHttpStreamRequestSuccess((HatchHttpResponseStream) objOpenResponseStream);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                HatchHttpFailure hatchHttpFailure2 = new HatchHttpFailure("execute_failed", HatchHttpApi.INSTANCE.failureDetail(e2));
                C60O.A1Q("Failed to open streaming Jarvis POST: ", hatchHttpFailure2.getLogValue(), HatchHttpApiKt.TAG, e2);
                return new HatchHttpStreamRequestFailure(hatchHttpFailure2);
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchHttpStreamRequestResult> htJ) {
            return ((C127222) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.http.HatchHttpApi$openJarvisHttpResponseStreamDetailedInternal$2", f = "HatchHttpApi.kt", l = {593}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.network.http.HatchHttpApi$openJarvisHttpResponseStreamDetailedInternal$2, reason: invalid class name and case insensitive filesystem */
    public final class C127232 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchHttpStreamRequestResult>, Object> {
        public final /* synthetic */ HatchHttpCachePolicy $cachePolicy;
        public final /* synthetic */ JarvisPath $endpoint;
        public final /* synthetic */ Long $idleTimeoutSeconds;
        public final /* synthetic */ HxE<String, Object>[] $queryParams;
        public final /* synthetic */ RequestType $requestType;
        public final /* synthetic */ Long $timeoutSeconds;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ String $wsUrl;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127232(String str, JarvisPath jarvisPath, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, Long l2, HatchHttpCachePolicy hatchHttpCachePolicy, HxE<String, ? extends Object>[] hxEArr, HtJ<? super C127232> htJ) {
            super(2, htJ);
            this.$wsUrl = str;
            this.$endpoint = jarvisPath;
            this.$requestType = requestType;
            this.$userSession = abstractC3358CGz;
            this.$timeoutSeconds = l;
            this.$idleTimeoutSeconds = l2;
            this.$cachePolicy = hatchHttpCachePolicy;
            this.$queryParams = hxEArr;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C127232(this.$wsUrl, this.$endpoint, this.$requestType, this.$userSession, this.$timeoutSeconds, this.$idleTimeoutSeconds, this.$cachePolicy, this.$queryParams, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objOpenResponseStream = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    HatchHttpApi hatchHttpApiA06 = C60O.A06(objOpenResponseStream);
                    String strJarvisHttpBaseUrl = hatchHttpApiA06.jarvisHttpBaseUrl(this.$wsUrl);
                    if (strJarvisHttpBaseUrl == null) {
                        HatchHttpFailure hatchHttpFailure = new HatchHttpFailure("bad_gateway_url", HatcheryVMIdUtilsKt.redactedGatewayUrlForLog(this.$wsUrl));
                        C60O.A1P("Cannot convert WebSocket URL to HTTP URL: ", hatchHttpFailure.getLogValue(), HatchHttpApiKt.TAG);
                        return new HatchHttpStreamRequestFailure(hatchHttpFailure);
                    }
                    JarvisPath jarvisPath = this.$endpoint;
                    RequestType requestType = this.$requestType;
                    String strVmBoundAuthToken = VmAuthTokenKt.vmBoundAuthToken(this.$userSession);
                    if (C7BY.A0j(strVmBoundAuthToken)) {
                        strVmBoundAuthToken = null;
                    }
                    HatchHttpRequest hatchHttpRequestBuildJarvisRequest$default = HatchHttpApi.buildJarvisRequest$default(hatchHttpApiA06, strJarvisHttpBaseUrl, jarvisPath, null, requestType, strVmBoundAuthToken, this.$timeoutSeconds, this.$idleTimeoutSeconds, this.$cachePolicy, this.$queryParams, null, false, false, false, OggOpusStreamEncoder.MAX_INPUT_BYTES, null);
                    HatchHttpClient hatchHttpClientA08 = C60O.A08();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    objOpenResponseStream = hatchHttpClientA08.openResponseStream(hatchHttpRequestBuildJarvisRequest$default, this);
                    if (objOpenResponseStream == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objOpenResponseStream);
                }
                return new HatchHttpStreamRequestSuccess((HatchHttpResponseStream) objOpenResponseStream);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                HatchHttpFailure hatchHttpFailure2 = new HatchHttpFailure("execute_failed", HatchHttpApi.INSTANCE.failureDetail(e2));
                C60O.A1Q("Failed to execute Jarvis HTTP request: ", hatchHttpFailure2.getLogValue(), HatchHttpApiKt.TAG, e2);
                return new HatchHttpStreamRequestFailure(hatchHttpFailure2);
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchHttpStreamRequestResult> htJ) {
            return ((C127232) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final HatchHttpRequest buildJarvisRequest(String str, JarvisPath jarvisPath, String str2, RequestType requestType, String str3, Long l, Long l2, HatchHttpCachePolicy hatchHttpCachePolicy, HxE<String, ? extends Object>[] hxEArr, Map<String, String> map, boolean z, boolean z2, boolean z3) {
        String strBuildJarvisUrl = buildJarvisUrl(str, jarvisPath, hxEArr);
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.put("Accept", "application/json");
        c0924AIa.put(AuraAcceptLanguage.HEADER, AuraAcceptLanguage.INSTANCE.headerValue());
        if (str3 != null && !C7BY.A0j(str3)) {
            c0924AIa.put("Authorization", FGI.A0M("Bearer ", str3));
        }
        c0924AIa.putAll(map);
        return buildRequest(strBuildJarvisUrl, requestType, str2, AIW.A0K(c0924AIa), l, HatchRequestPriorityPolicyKt.categoryFor(jarvisPath), hatchHttpCachePolicy, l2, z, z2, z3);
    }

    /* renamed from: decodeJarvisResponseInternal-LiYkppA, reason: not valid java name */
    private final <Res> Object m1586decodeJarvisResponseInternalLiYkppA(Function0<? extends C9hr<Res>> function0, boolean z, JarvisPath jarvisPath, RequestType requestType, HatchHttpResponse hatchHttpResponse, Set<Integer> set, boolean z2, boolean z3, boolean z4, String str) {
        Object c10571Hud;
        if (hatchHttpResponse != null) {
            String value = jarvisPath.getValue();
            c10571Hud = z2 ? HatchEnvelopeDecoderKt.decodeEnvelopeWith(hatchHttpResponse, function0, z, value, set, z3) : HatchJarvisResponseDecoderKt.decodeJarvisResponseWith(hatchHttpResponse, function0, z, value, set, z3, z4, str);
        } else {
            c10571Hud = new C10571Hud(new RuntimeException("Failed to execute request"));
        }
        logResponseResult$fbandroid_express_aura_java_com_facebook_aura_network_http_http("Jarvis", jarvisPath, requestType, c10571Hud);
        return c10571Hud;
    }

    public static /* synthetic */ Object makeJarvisHttpRequest__EXCEPTIONAL_USE_CASES_ONLY$default(HatchHttpApi hatchHttpApi, JarvisPath jarvisPath, Object obj, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, HatchHttpCachePolicy hatchHttpCachePolicy, HxE[] hxEArr, boolean z, Map map, HtJ htJ, int i, Object obj2) {
        Long l2 = l;
        HatchHttpCachePolicy hatchHttpCachePolicy2 = hatchHttpCachePolicy;
        Map mapA0E = map;
        if ((i & 16) != 0) {
            l2 = null;
        }
        if ((i & 32) != 0) {
            hatchHttpCachePolicy2 = null;
        }
        boolean zA1Q = C60Q.A1Q(i & 128, z);
        if ((i & 256) != 0) {
            mapA0E = AGH.A0E();
        }
        if (obj instanceof String) {
            C7384Etj.A0Z(obj, BV3.A00(0));
            return hatchHttpApi.makeJarvisHttpRequestInternal(jarvisPath, (String) obj, requestType, abstractC3358CGz, l2, hatchHttpCachePolicy2, hxEArr, zA1Q, mapA0E, false, true, htJ);
        }
        C7384Etj.A0Q();
        throw F60.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* renamed from: executeStefiMultipartRequestWith-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <Res> java.lang.Object m1601executeStefiMultipartRequestWithhUnOzRk(kotlin.jvm.functions.Function0<? extends X.C9hr<Res>> r14, boolean r15, com.facebook.aura.network.api.StefiPath r16, java.util.List<com.facebook.aura.network.transport.HatchMultipartPart> r17, java.util.List<com.facebook.aura.network.transport.HatchMultipartFilePart> r18, X.HtJ<? super X.HsJ<? extends Res>> r19) {
        /*
            r13 = this;
            r1 = r14
            r5 = r15
            r7 = r19
            r8 = r16
            boolean r0 = r7 instanceof com.facebook.aura.network.http.HatchHttpApi$executeStefiMultipartRequestWith$1
            r3 = r13
            if (r0 == 0) goto L2f
            r6 = r7
            com.facebook.aura.network.http.HatchHttpApi$executeStefiMultipartRequestWith$1 r6 = (com.facebook.aura.network.http.HatchHttpApi$executeStefiMultipartRequestWith$1) r6
            int r4 = r6.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto L2f
            int r4 = r4 - r2
            r6.label = r4
        L19:
            java.lang.Object r4 = r6.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r13 = 1
            if (r0 == 0) goto L3a
            if (r0 != r13) goto L35
            boolean r5 = r6.Z$0
            java.lang.Object r8 = r6.L$1
            com.facebook.aura.network.api.StefiPath r8 = (com.facebook.aura.network.api.StefiPath) r8
            java.lang.Object r1 = r6.L$0
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            goto L65
        L2f:
            com.facebook.aura.network.http.HatchHttpApi$executeStefiMultipartRequestWith$1 r6 = new com.facebook.aura.network.http.HatchHttpApi$executeStefiMultipartRequestWith$1
            r6.<init>(r13, r7)
            goto L19
        L35:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3a:
            X.Hwg.A00(r4)
            com.facebook.aura.network.stefi.AuraStefiClient r7 = com.facebook.aura.network.stefi.AuraStefiClient.INSTANCE     // Catch: java.lang.Exception -> L73 java.util.concurrent.CancellationException -> L9b
            java.lang.String r9 = r8.getValue()     // Catch: java.lang.Exception -> L73 java.util.concurrent.CancellationException -> L9b
            r6.L$0 = r14     // Catch: java.lang.Exception -> L73 java.util.concurrent.CancellationException -> L9b
            r6.L$1 = r8     // Catch: java.lang.Exception -> L73 java.util.concurrent.CancellationException -> L9b
            r0 = 0
            r6.L$2 = r0     // Catch: java.lang.Exception -> L73 java.util.concurrent.CancellationException -> L9b
            r6.L$3 = r0     // Catch: java.lang.Exception -> L73 java.util.concurrent.CancellationException -> L9b
            r6.Z$0 = r15     // Catch: java.lang.Exception -> L73 java.util.concurrent.CancellationException -> L9b
            r6.label = r13     // Catch: java.lang.Exception -> L73 java.util.concurrent.CancellationException -> L9b
            X.9jH r12 = X.AGH.A0E()     // Catch: java.lang.Exception -> L73 java.util.concurrent.CancellationException -> L9b
            com.facebook.aura.network.stefi.AuraStefiClient$postMultipart$2 r16 = com.facebook.aura.network.stefi.AuraStefiClient.C127242.INSTANCE     // Catch: java.lang.Exception -> L73 java.util.concurrent.CancellationException -> L9b
            r10 = r17
            r11 = r18
            r14 = r13
            r15 = r13
            r17 = r6
            java.lang.Object r4 = r7.postMultipart(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L73 java.util.concurrent.CancellationException -> L9b
            if (r4 != r2) goto L68
            return r2
        L65:
            X.Hwg.A00(r4)     // Catch: java.lang.Exception -> L73 java.util.concurrent.CancellationException -> L9b
        L68:
            com.facebook.aura.network.AuraHttpResponse r4 = (com.facebook.aura.network.AuraHttpResponse) r4     // Catch: java.lang.Exception -> L73 java.util.concurrent.CancellationException -> L9b
            java.lang.String r0 = r8.getValue()     // Catch: java.lang.Exception -> L73 java.util.concurrent.CancellationException -> L9b
            java.lang.Object r2 = com.facebook.aura.json.HatchStefiResponseDecoderKt.decodeStefiResponseWith(r4, r1, r5, r0)     // Catch: java.lang.Exception -> L73 java.util.concurrent.CancellationException -> L9b
            goto L93
        L73:
            r13 = move-exception
            java.lang.String r10 = r13.getMessage()
            if (r10 != 0) goto L84
            java.lang.String r1 = r8.getValue()
            java.lang.String r0 = " request failed"
            java.lang.String r10 = X.FGI.A0M(r1, r0)
        L84:
            r12 = 0
            r11 = -1
            com.facebook.aura.json.NetworkException r9 = new com.facebook.aura.json.NetworkException
            r14 = r12
            r15 = r12
            r16 = r12
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            X.Hud r2 = X.C3cG.A0s(r9)
        L93:
            java.lang.String r1 = "Stefi"
            com.facebook.aura.network.http.RequestType r0 = com.facebook.aura.network.http.RequestType.POST
            r3.logResponseResult$fbandroid_express_aura_java_com_facebook_aura_network_http_http(r1, r8, r0, r2)
            return r2
        L9b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.http.HatchHttpApi.m1601executeStefiMultipartRequestWithhUnOzRk(kotlin.jvm.functions.Function0, boolean, com.facebook.aura.network.api.StefiPath, java.util.List, java.util.List, X.HtJ):java.lang.Object");
    }

    public final <T> void logResponseResult$fbandroid_express_aura_java_com_facebook_aura_network_http_http(String str, Object obj, RequestType requestType, Object obj2) {
        NetworkException networkException;
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(obj, 1);
        C7384Etj.A0Y(requestType, 2);
        String simpleName = obj.getClass().getSimpleName();
        Throwable thA00 = HsJ.A00(obj2);
        if (thA00 != null) {
            CFK.A0A(HatchHttpApiKt.TAG, FGI.A0k(str, InviteCodeScratcherKt.CODE_SEPARATOR, requestType.name(), InviteCodeScratcherKt.CODE_SEPARATOR, simpleName, " response failed", (!(thA00 instanceof NetworkException) || (networkException = (NetworkException) thA00) == null) ? "" : FGI.A0W(" http_status=", " error_code=", networkException.errorCode, networkException.httpResponseCode)), thA00);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <Req> Object makeJarvisHttpRequestStreaming(JarvisPath jarvisPath, Req req, OutputStream outputStream, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, HtJ<? super HatchHttpResponse> htJ) {
        if (req instanceof String) {
            return makeJarvisHttpRequestStreamingInternal(jarvisPath, (String) req, outputStream, requestType, abstractC3358CGz, l, AGH.A0E(), new HxE[0], null, false, true, null, htJ);
        }
        C7384Etj.A0Q();
        throw F60.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T> Object makeJarvisHttpRequest__EXCEPTIONAL_USE_CASES_ONLY(JarvisPath jarvisPath, T t, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, HatchHttpCachePolicy hatchHttpCachePolicy, HxE<String, ? extends Object>[] hxEArr, boolean z, Map<String, String> map, HtJ<? super HatchHttpResponse> htJ) {
        if (t instanceof String) {
            C7384Etj.A0Z(t, BV3.A00(0));
            return makeJarvisHttpRequestInternal(jarvisPath, (String) t, requestType, abstractC3358CGz, l, hatchHttpCachePolicy, hxEArr, z, map, false, true, htJ);
        }
        C7384Etj.A0Q();
        throw F60.createAndThrow();
    }

    public final Object openJarvisHttpPostStream(JarvisPath jarvisPath, AbstractC3358CGz abstractC3358CGz, String str, Long l, Long l2, HtJ<? super HatchHttpStreamRequestResult> htJ) {
        String strA1K = C60P.A1K(abstractC3358CGz);
        if (!C7BY.A0j(strA1K)) {
            return GAo.A00(htJ, AnonymousClass001.A0y(), new C127222(strA1K, abstractC3358CGz, jarvisPath, l, l2, str, null));
        }
        HatchHttpFailure hatchHttpFailure = new HatchHttpFailure("missing_gateway_url", null);
        CFK.A04(HatchHttpApiKt.TAG, FGI.A0M("Cannot create streaming POST: ", hatchHttpFailure.getLogValue()));
        return new HatchHttpStreamRequestFailure(hatchHttpFailure);
    }

    public final Object openJarvisHttpResponseStreamDetailedInternal(JarvisPath jarvisPath, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, Long l2, HatchHttpCachePolicy hatchHttpCachePolicy, HxE<String, ? extends Object>[] hxEArr, HtJ<? super HatchHttpStreamRequestResult> htJ) {
        String strA1K = C60P.A1K(abstractC3358CGz);
        if (!C7BY.A0j(strA1K)) {
            return GAo.A00(htJ, AnonymousClass001.A0y(), new C127232(strA1K, jarvisPath, requestType, abstractC3358CGz, l, l2, hatchHttpCachePolicy, hxEArr, null));
        }
        HatchHttpFailure hatchHttpFailure = new HatchHttpFailure("missing_gateway_url", null);
        CFK.A04(HatchHttpApiKt.TAG, FGI.A0M("Cannot create request: ", hatchHttpFailure.getLogValue()));
        return new HatchHttpStreamRequestFailure(hatchHttpFailure);
    }

    /* renamed from: withRedactedFailure-KWTtemM$fbandroid_express_aura_java_com_facebook_aura_network_http_http, reason: not valid java name */
    public final <T> Object m1605x2f9bfbdd(Object obj, StefiPath stefiPath) {
        NetworkException networkException;
        C7384Etj.A0Y(stefiPath, 1);
        Throwable thA00 = HsJ.A00(obj);
        if (thA00 == null) {
            return obj;
        }
        int i = (!(thA00 instanceof NetworkException) || (networkException = (NetworkException) thA00) == null) ? -1 : networkException.httpResponseCode;
        return C3cG.A0s(new NetworkException(FGI.A0X(stefiPath.getValue(), " request failed: HTTP ", " (details redacted)", i), i, null, null, null, null, null));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestType.values().length];
            try {
                AnonymousClass002.A13(RequestType.GET, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(RequestType.POST, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(RequestType.DELETE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(RequestType.PATCH, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(RequestType.PUT, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchHttpRequest buildJarvisRequest$default(HatchHttpApi hatchHttpApi, String str, JarvisPath jarvisPath, String str2, RequestType requestType, String str3, Long l, Long l2, HatchHttpCachePolicy hatchHttpCachePolicy, HxE[] hxEArr, Map map, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 64) != 0) {
            l2 = null;
        }
        if ((i & 128) != 0) {
            hatchHttpCachePolicy = null;
        }
        if ((i & 512) != 0) {
            map = AGH.A0E();
        }
        if ((i & 1024) != 0) {
            z = true;
        }
        if ((i & 2048) != 0) {
            z2 = false;
        }
        if ((i & 4096) != 0) {
            z3 = true;
        }
        return hatchHttpApi.buildJarvisRequest(str, jarvisPath, str2, requestType, str3, l, l2, hatchHttpCachePolicy, hxEArr, map, z, z2, z3);
    }

    private final HatchHttpRequest buildRequest(String str, RequestType requestType, String str2, Map<String, String> map, Long l, HatchRequestCategory hatchRequestCategory, HatchHttpCachePolicy hatchHttpCachePolicy, Long l2, boolean z, boolean z2, boolean z3) {
        String str3 = str2;
        Long lValueOf = l != null ? Long.valueOf(l.longValue() * 1000) : null;
        Long lValueOf2 = l2 != null ? Long.valueOf(l2.longValue() * 1000) : lValueOf;
        int iOrdinal = requestType.ordinal();
        if (iOrdinal == 0) {
            return HatchHttpRequest.Companion.get(str, map, lValueOf, lValueOf, lValueOf2, hatchRequestCategory, HatchRequestPurpose.FETCH, hatchHttpCachePolicy, false, false, HatchResponseBodyPolicy.DEFAULT);
        }
        if (iOrdinal == 1) {
            HatchHttpRequest.Companion companion = HatchHttpRequest.Companion;
            if (str2 == null) {
                str3 = "{}";
            }
            return companion.post(str, new HatchRequestBody.Json(str3), map, lValueOf, lValueOf, lValueOf, hatchRequestCategory, HatchRequestPurpose.FETCH, hatchHttpCachePolicy, false, false, z, HatchResponseBodyPolicy.DEFAULT, null, z2, z3);
        }
        if (iOrdinal == 4) {
            return HatchHttpRequest.Companion.delete(str, str2 != null ? new HatchRequestBody.Json(str3) : HatchRequestBody.Empty.INSTANCE, map, lValueOf, lValueOf, lValueOf, hatchRequestCategory, HatchRequestPurpose.FETCH, HatchResponseBodyPolicy.DEFAULT);
        }
        if (iOrdinal == 3) {
            HatchHttpRequest.Companion companion2 = HatchHttpRequest.Companion;
            if (str2 == null) {
                str3 = "{}";
            }
            return companion2.patch(str, new HatchRequestBody.Json(str3), map, lValueOf, lValueOf, lValueOf, hatchRequestCategory, HatchRequestPurpose.FETCH, HatchResponseBodyPolicy.DEFAULT, true, null);
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        HatchHttpRequest.Companion companion3 = HatchHttpRequest.Companion;
        if (str2 == null) {
            str3 = "{}";
        }
        return companion3.put(str, new HatchRequestBody.Json(str3), map, lValueOf, lValueOf, lValueOf, hatchRequestCategory, HatchRequestPurpose.FETCH, z, HatchResponseBodyPolicy.DEFAULT);
    }

    public static /* synthetic */ HatchHttpRequest buildRequest$default(HatchHttpApi hatchHttpApi, String str, RequestType requestType, String str2, Map map, Long l, HatchRequestCategory hatchRequestCategory, HatchHttpCachePolicy hatchHttpCachePolicy, Long l2, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 32) != 0) {
            hatchRequestCategory = HatchRequestCategory.API;
        }
        if ((i & 64) != 0) {
            hatchHttpCachePolicy = null;
        }
        if ((i & 128) != 0) {
            l2 = null;
        }
        return hatchHttpApi.buildRequest(str, requestType, str2, map, l, hatchRequestCategory, hatchHttpCachePolicy, l2, C60Q.A1Q(i & 256, z), C3cG.A1K(i & 512, z2), C60Q.A1Q(i & 1024, z3));
    }

    /* renamed from: decodeJarvisResponseInternal-LiYkppA$default, reason: not valid java name */
    public static /* synthetic */ Object m1587decodeJarvisResponseInternalLiYkppA$default(HatchHttpApi hatchHttpApi, Function0 function0, boolean z, JarvisPath jarvisPath, RequestType requestType, HatchHttpResponse hatchHttpResponse, Set set, boolean z2, boolean z3, boolean z4, String str, int i, Object obj) {
        if ((i & 128) != 0) {
            z3 = false;
        }
        if ((i & 256) != 0) {
            z4 = false;
        }
        if ((i & 512) != 0) {
            str = null;
        }
        return hatchHttpApi.m1586decodeJarvisResponseInternalLiYkppA(function0, z, jarvisPath, requestType, hatchHttpResponse, set, z2, z3, z4, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: executeStefiRequestInternal-1iavgos$default, reason: not valid java name */
    public static /* synthetic */ Object m1594executeStefiRequestInternal1iavgos$default(HatchHttpApi hatchHttpApi, Function0 function0, boolean z, StefiPath stefiPath, byte[] bArr, RequestType requestType, Long l, Long l2, Map map, boolean z2, HatchHttpRequestAttemptObserverFactory hatchHttpRequestAttemptObserverFactory, boolean z3, Map map2, HtJ htJ, int i, Object obj) {
        if ((i & 64) != 0) {
            l2 = null;
        }
        if ((i & 128) != 0) {
            map = AGH.A0E();
        }
        boolean zA1Q = C60Q.A1Q(i & 256, z2);
        if ((i & 512) != 0) {
            hatchHttpRequestAttemptObserverFactory = null;
        }
        boolean zA1K = C3cG.A1K(i & 1024, z3);
        if ((i & 2048) != 0) {
            map2 = AGH.A0E();
        }
        return hatchHttpApi.m1593executeStefiRequestInternal1iavgos(function0, z, stefiPath, bArr, requestType, l, l2, map, zA1Q, hatchHttpRequestAttemptObserverFactory, zA1K, map2, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object makeJarvisHttpRequestDetailedInternal$default(HatchHttpApi hatchHttpApi, JarvisPath jarvisPath, String str, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, HatchHttpCachePolicy hatchHttpCachePolicy, HxE[] hxEArr, boolean z, Map map, boolean z2, boolean z3, HtJ htJ, int i, Object obj) {
        if ((i & 32) != 0) {
            hatchHttpCachePolicy = null;
        }
        boolean zA1Q = C60Q.A1Q(i & 128, z);
        if ((i & 256) != 0) {
            map = AGH.A0E();
        }
        return hatchHttpApi.makeJarvisHttpRequestDetailedInternal(jarvisPath, str, requestType, abstractC3358CGz, l, hatchHttpCachePolicy, hxEArr, zA1Q, map, C3cG.A1K(i & 512, z2), C60Q.A1Q(i & 1024, z3), htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object makeJarvisHttpRequestInternal$default(HatchHttpApi hatchHttpApi, JarvisPath jarvisPath, String str, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, HatchHttpCachePolicy hatchHttpCachePolicy, HxE[] hxEArr, boolean z, Map map, boolean z2, boolean z3, HtJ htJ, int i, Object obj) {
        if ((i & 32) != 0) {
            hatchHttpCachePolicy = null;
        }
        boolean zA1Q = C60Q.A1Q(i & 128, z);
        if ((i & 256) != 0) {
            map = AGH.A0E();
        }
        return hatchHttpApi.makeJarvisHttpRequestInternal(jarvisPath, str, requestType, abstractC3358CGz, l, hatchHttpCachePolicy, hxEArr, zA1Q, map, C3cG.A1K(i & 512, z2), C60Q.A1Q(i & 1024, z3), htJ);
    }

    public static /* synthetic */ Object makeJarvisHttpRequestStreaming$default(HatchHttpApi hatchHttpApi, JarvisPath jarvisPath, OutputStream outputStream, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, Map map, HxE[] hxEArr, String str, boolean z, boolean z2, Long l2, HtJ htJ, int i, Object obj) {
        Long l3 = l;
        String str2 = str;
        boolean z3 = z;
        boolean z4 = z2;
        Long l4 = l2;
        if ((i & 16) != 0) {
            l3 = null;
        }
        Map<String, String> mapA0o = C3cH.A0o(map, i & 32);
        if ((i & 128) != 0) {
            str2 = null;
        }
        if ((i & 256) != 0) {
            z3 = false;
        }
        if ((i & 512) != 0) {
            z4 = true;
        }
        if ((i & 1024) != 0) {
            l4 = null;
        }
        return hatchHttpApi.makeJarvisHttpRequestStreamingInternal(jarvisPath, null, outputStream, requestType, abstractC3358CGz, l3, mapA0o, hxEArr, str2, z3, z4, l4, htJ);
    }

    public static /* synthetic */ Object makeJarvisHttpRequestStreamingInternal$default(HatchHttpApi hatchHttpApi, JarvisPath jarvisPath, String str, OutputStream outputStream, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, Map map, HxE[] hxEArr, String str2, boolean z, boolean z2, Long l2, HtJ htJ, int i, Object obj) {
        if ((i & 256) != 0) {
            str2 = null;
        }
        boolean zA1K = C3cG.A1K(i & 512, z);
        boolean zA1Q = C60Q.A1Q(i & 1024, z2);
        if ((i & 2048) != 0) {
            l2 = null;
        }
        return hatchHttpApi.makeJarvisHttpRequestStreamingInternal(jarvisPath, str, outputStream, requestType, abstractC3358CGz, l, map, hxEArr, str2, zA1K, zA1Q, l2, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object makeJarvisHttpRequestWithCredentials$default(HatchHttpApi hatchHttpApi, JarvisPath jarvisPath, String str, RequestType requestType, String str2, String str3, Long l, HxE[] hxEArr, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            l = null;
        }
        if ((i & 64) != 0) {
            hxEArr = new HxE[0];
        }
        return hatchHttpApi.makeJarvisHttpRequestWithCredentials(jarvisPath, str, requestType, str2, str3, l, hxEArr, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object makeJarvisHttpRequestWithCredentialsDetailed$fbandroid_express_aura_java_com_facebook_aura_network_http_http$default(HatchHttpApi hatchHttpApi, JarvisPath jarvisPath, String str, RequestType requestType, String str2, String str3, Long l, HatchHttpCachePolicy hatchHttpCachePolicy, HxE[] hxEArr, boolean z, Map map, boolean z2, boolean z3, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            l = null;
        }
        if ((i & 64) != 0) {
            hatchHttpCachePolicy = null;
        }
        if ((i & 128) != 0) {
            hxEArr = new HxE[0];
        }
        boolean zA1Q = C60Q.A1Q(i & 256, z);
        if ((i & 512) != 0) {
            map = AGH.A0E();
        }
        return hatchHttpApi.makeJarvisHttpRequestWithCredentialsDetailed$fbandroid_express_aura_java_com_facebook_aura_network_http_http(jarvisPath, str, requestType, str2, str3, l, hatchHttpCachePolicy, hxEArr, zA1Q, map, C3cG.A1K(i & 1024, z2), C60Q.A1Q(i & 2048, z3), htJ);
    }

    public static /* synthetic */ Object openJarvisDuplexStream$default(HatchHttpApi hatchHttpApi, JarvisPath jarvisPath, AbstractC3358CGz abstractC3358CGz, HatchDuplexResponseHandler hatchDuplexResponseHandler, Long l, HxE[] hxEArr, boolean z, HtJ htJ, int i, Object obj) {
        if ((i & 8) != 0) {
            l = null;
        }
        return hatchHttpApi.openJarvisDuplexStream(jarvisPath, abstractC3358CGz, hatchDuplexResponseHandler, l, hxEArr, C60Q.A1Q(i & 32, z), htJ);
    }

    public static /* synthetic */ Object openJarvisHttpResponseStreamDetailedInternal$default(HatchHttpApi hatchHttpApi, JarvisPath jarvisPath, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, Long l2, HatchHttpCachePolicy hatchHttpCachePolicy, HxE[] hxEArr, HtJ htJ, int i, Object obj) {
        if ((i & 16) != 0) {
            l2 = null;
        }
        if ((i & 32) != 0) {
            hatchHttpCachePolicy = null;
        }
        return hatchHttpApi.openJarvisHttpResponseStreamDetailedInternal(jarvisPath, requestType, abstractC3358CGz, l, l2, hatchHttpCachePolicy, hxEArr, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* renamed from: executeBodylessStefiRequestWith-tZkwj4A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <Res> java.lang.Object m1596executeBodylessStefiRequestWithtZkwj4A(kotlin.jvm.functions.Function0<? extends X.C9hr<Res>> r17, boolean r18, com.facebook.aura.network.api.StefiPath r19, com.facebook.aura.network.http.RequestType r20, java.lang.Long r21, java.lang.Long r22, java.util.Map<java.lang.String, java.lang.String> r23, java.util.Map<java.lang.String, java.lang.String> r24, X.HtJ<? super X.HsJ<? extends Res>> r25) {
        /*
            r16 = this;
            r4 = r25
            boolean r0 = r4 instanceof com.facebook.aura.network.http.HatchHttpApi$executeBodylessStefiRequestWith$1
            r5 = r16
            if (r0 == 0) goto L6b
            r3 = r4
            com.facebook.aura.network.http.HatchHttpApi$executeBodylessStefiRequestWith$1 r3 = (com.facebook.aura.network.http.HatchHttpApi$executeBodylessStefiRequestWith$1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r2 = r3.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r14 = 1
            if (r0 == 0) goto L26
            if (r0 != r14) goto L71
            java.lang.Object r1 = X.AnonymousClass001.A0q(r2)
        L25:
            return r1
        L26:
            X.Hwg.A00(r2)
            com.facebook.aura.network.http.RequestType r0 = com.facebook.aura.network.http.RequestType.PATCH
            r10 = r20
            if (r10 == r0) goto L76
            com.facebook.aura.network.http.RequestType r0 = com.facebook.aura.network.http.RequestType.PUT
            if (r10 == r0) goto L76
            com.facebook.aura.network.http.RequestType r0 = com.facebook.aura.network.http.RequestType.POST
            if (r10 != r0) goto L69
            java.lang.String r0 = "{}"
            byte[] r9 = X.C3cG.A1S(r0)
        L3d:
            r15 = 0
            r3.L$0 = r15
            r3.L$1 = r15
            r3.L$2 = r15
            r3.L$3 = r15
            r3.L$4 = r15
            r3.L$5 = r15
            r3.L$6 = r15
            r7 = r18
            r3.Z$0 = r7
            r3.label = r14
            r16 = 0
            r6 = r17
            r8 = r19
            r11 = r21
            r12 = r22
            r13 = r23
            r17 = r24
            r18 = r3
            java.lang.Object r0 = r5.m1593executeStefiRequestInternal1iavgos(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            if (r0 == r1) goto L25
            return r0
        L69:
            r9 = 0
            goto L3d
        L6b:
            com.facebook.aura.network.http.HatchHttpApi$executeBodylessStefiRequestWith$1 r3 = new com.facebook.aura.network.http.HatchHttpApi$executeBodylessStefiRequestWith$1
            r3.<init>(r5, r4)
            goto L16
        L71:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L76:
            java.lang.String r0 = "Stefi PATCH and PUT requests are not supported"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.http.HatchHttpApi.m1596executeBodylessStefiRequestWithtZkwj4A(kotlin.jvm.functions.Function0, boolean, com.facebook.aura.network.api.StefiPath, com.facebook.aura.network.http.RequestType, java.lang.Long, java.lang.Long, java.util.Map, java.util.Map, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00a7: INVOKE (r1 I:java.lang.String) = (r8 I:com.facebook.aura.network.api.StefiPath) INTERFACE call: com.facebook.aura.network.api.StefiPath.getValue():java.lang.String A[MD:():java.lang.String (m)] (LINE:167), block:B:35:0x00a7 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00c4: INVOKE 
  (r5v0 ?? I:com.facebook.aura.network.http.HatchHttpApi)
  (r0v3 ?? I:java.lang.String)
  (r8 I:java.lang.Object)
  (r10 I:com.facebook.aura.network.http.RequestType)
  (r2 I:java.lang.Object)
 VIRTUAL call: com.facebook.aura.network.http.HatchHttpApi.logResponseResult$fbandroid_express_aura_java_com_facebook_aura_network_http_http(java.lang.String, java.lang.Object, com.facebook.aura.network.http.RequestType, java.lang.Object):void A[MD:<T>:(java.lang.String, java.lang.Object, com.facebook.aura.network.http.RequestType, java.lang.Object):void (m)] (LINE:196), block:B:36:0x00b1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.facebook.aura.network.api.StefiPath] */
    /* renamed from: executeStefiRequestWith-jLovISM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <Req, Res> java.lang.Object m1604executeStefiRequestWithjLovISM(kotlin.jvm.functions.Function0<? extends X.C9hr<Req>> r12, kotlin.jvm.functions.Function0<? extends X.C9hr<Res>> r13, boolean r14, com.facebook.aura.network.api.StefiPath r15, Req r16, com.facebook.aura.network.http.RequestType r17, java.util.Map<java.lang.String, java.lang.String> r18, boolean r19, com.facebook.aura.network.transport.HatchHttpRequestAttemptObserverFactory r20, boolean r21, java.lang.Long r22, X.HtJ<? super X.HsJ<? extends Res>> r23) {
        /*
            r11 = this;
            r9 = r16
            r4 = r23
            boolean r0 = r4 instanceof com.facebook.aura.network.http.HatchHttpApi$executeStefiRequestWith$1
            r5 = r11
            if (r0 == 0) goto L94
            r3 = r4
            com.facebook.aura.network.http.HatchHttpApi$executeStefiRequestWith$1 r3 = (com.facebook.aura.network.http.HatchHttpApi$executeStefiRequestWith$1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L94
            int r2 = r2 - r1
            r3.label = r2
        L17:
            java.lang.Object r1 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r4 = 1
            if (r0 == 0) goto L27
            if (r0 != r4) goto L9b
            java.lang.Object r2 = X.AnonymousClass001.A0q(r1)
        L26:
            return r2
        L27:
            X.Hwg.A00(r1)
            com.facebook.aura.network.http.RequestType r0 = com.facebook.aura.network.http.RequestType.POST
            r10 = r17
            if (r10 == r0) goto L3b
            com.facebook.aura.network.http.RequestType r0 = com.facebook.aura.network.http.RequestType.PATCH
            if (r10 == r0) goto L3b
            java.lang.String r0 = "Stefi request bodies require POST or PATCH"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        L3b:
            r8 = r15
            boolean r0 = r9 instanceof byte[]     // Catch: java.lang.Exception -> La0 java.util.concurrent.CancellationException -> Lc8
            if (r0 == 0) goto L43
            byte[] r9 = (byte[]) r9     // Catch: java.lang.Exception -> La0 java.util.concurrent.CancellationException -> Lc8
            goto L5e
        L43:
            boolean r0 = r9 instanceof java.lang.String     // Catch: java.lang.Exception -> La0 java.util.concurrent.CancellationException -> Lc8
            if (r0 == 0) goto L4e
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> La0 java.util.concurrent.CancellationException -> Lc8
            byte[] r9 = X.C3cG.A1S(r9)     // Catch: java.lang.Exception -> La0 java.util.concurrent.CancellationException -> Lc8
            goto L5e
        L4e:
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Exception -> La0 java.util.concurrent.CancellationException -> Lc8
            java.lang.Object r0 = r12.invoke()     // Catch: java.lang.Exception -> La0 java.util.concurrent.CancellationException -> Lc8
            X.9hv r0 = (X.C9hv) r0     // Catch: java.lang.Exception -> La0 java.util.concurrent.CancellationException -> Lc8
            java.lang.String r0 = r1.A02(r9, r0)     // Catch: java.lang.Exception -> La0 java.util.concurrent.CancellationException -> Lc8
            byte[] r9 = X.C3cG.A1S(r0)     // Catch: java.lang.Exception -> La0 java.util.concurrent.CancellationException -> Lc8
        L5e:
            r11 = 0
            r3.L$0 = r11
            r3.L$1 = r11
            r3.L$2 = r11
            r3.L$3 = r11
            r3.L$4 = r11
            r3.L$5 = r11
            r3.L$6 = r11
            r3.L$7 = r11
            r3.L$8 = r11
            r7 = r14
            r3.Z$0 = r14
            r14 = r19
            r3.Z$1 = r14
            r0 = r21
            r3.Z$2 = r0
            r3.label = r4
            X.9jH r17 = X.AGH.A0E()
            r6 = r13
            r13 = r18
            r15 = r20
            r12 = r22
            r18 = r3
            r16 = r0
            java.lang.Object r0 = r5.m1593executeStefiRequestInternal1iavgos(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            if (r0 == r2) goto L26
            return r0
        L94:
            com.facebook.aura.network.http.HatchHttpApi$executeStefiRequestWith$1 r3 = new com.facebook.aura.network.http.HatchHttpApi$executeStefiRequestWith$1
            r3.<init>(r11, r4)
            goto L17
        L9b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        La0:
            r15 = move-exception
            java.lang.String r12 = r15.getMessage()
            if (r12 != 0) goto Lb1
            java.lang.String r1 = r8.getValue()
            java.lang.String r0 = " request encoding failed"
            java.lang.String r12 = X.FGI.A0M(r1, r0)
        Lb1:
            r14 = 0
            r13 = -1
            com.facebook.aura.json.NetworkException r11 = new com.facebook.aura.json.NetworkException
            r16 = r14
            r17 = r14
            r18 = r14
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            X.Hud r2 = X.C3cG.A0s(r11)
            java.lang.String r0 = "Stefi"
            r5.logResponseResult$fbandroid_express_aura_java_com_facebook_aura_network_http_http(r0, r8, r10, r2)
            return r2
        Lc8:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.http.HatchHttpApi.m1604executeStefiRequestWithjLovISM(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, com.facebook.aura.network.api.StefiPath, java.lang.Object, com.facebook.aura.network.http.RequestType, java.util.Map, boolean, com.facebook.aura.network.transport.HatchHttpRequestAttemptObserverFactory, boolean, java.lang.Long, X.HtJ):java.lang.Object");
    }

    public final String jarvisHttpBaseUrl(String str) {
        String strA0L;
        String strA0L2;
        C7384Etj.A0Y(str, 0);
        String string = C7BY.A0F(str).toString();
        C7384Etj.A0Y(string, 0);
        String strA0M = null;
        if (!string.regionMatches(true, 0, "wss://", 0, "wss://".length())) {
            return null;
        }
        try {
            URI uri = new URI(FGI.A0M("https://", BQG.A16(string, 6)));
            String path = uri.getPath();
            String strA0L3 = (path == null || (strA0L = C7BY.A0L("/gateway", path)) == null || (strA0L2 = C7BY.A0L("/ws", strA0L)) == null) ? null : C7BY.A0L(CustomConnectorRegisterRepositoryKt.ROOT_PATH, strA0L2);
            if (strA0L3 == null) {
                strA0L3 = "";
            }
            String strA0h = FGI.A0h(uri.getScheme(), "://", uri.getHost(), uri.getPort() != -1 ? FGI.A0H(":", uri.getPort()) : "", strA0L3);
            if (strA0h.endsWith(CustomConnectorRegisterRepositoryKt.ROOT_PATH)) {
                return strA0h;
            }
            strA0M = FGI.A0M(strA0h, CustomConnectorRegisterRepositoryKt.ROOT_PATH);
            return strA0M;
        } catch (Exception e) {
            CFK.A0A(HatchHttpApiKt.TAG, FGI.A0M("Failed to parse WebSocket URL: ", HatcheryVMIdUtilsKt.redactedGatewayUrlForLog(str)), e);
            return strA0M;
        }
    }

    public final Object makeJarvisHttpRequestDetailedInternal(JarvisPath jarvisPath, String str, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, HatchHttpCachePolicy hatchHttpCachePolicy, HxE<String, ? extends Object>[] hxEArr, boolean z, Map<String, String> map, boolean z2, boolean z3, HtJ<? super HatchHttpRequestResult> htJ) {
        String gatewayUrl = HatchGatewayPrefsStore.Companion.getInstance(abstractC3358CGz).getGatewayUrl();
        if (!C7BY.A0j(gatewayUrl)) {
            String strVmBoundAuthToken = VmAuthTokenKt.vmBoundAuthToken(abstractC3358CGz);
            return makeJarvisHttpRequestWithCredentialsDetailed$fbandroid_express_aura_java_com_facebook_aura_network_http_http(jarvisPath, str, requestType, gatewayUrl, C7BY.A0j(strVmBoundAuthToken) ? null : strVmBoundAuthToken, l, hatchHttpCachePolicy, hxEArr, z, map, z2, z3, htJ);
        }
        HatchHttpFailure hatchHttpFailure = new HatchHttpFailure("missing_gateway_url", null);
        CFK.A04(HatchHttpApiKt.TAG, FGI.A0M("Cannot create request: ", hatchHttpFailure.getLogValue()));
        return new HatchHttpRequestFailure(hatchHttpFailure);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object makeJarvisHttpRequestInternal(com.facebook.aura.network.api.JarvisPath r6, java.lang.String r7, com.facebook.aura.network.http.RequestType r8, X.AbstractC3358CGz r9, java.lang.Long r10, com.facebook.aura.network.transport.HatchHttpCachePolicy r11, X.HxE<java.lang.String, ? extends java.lang.Object>[] r12, boolean r13, java.util.Map<java.lang.String, java.lang.String> r14, boolean r15, boolean r16, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponse> r17) {
        /*
            r5 = this;
            r3 = r17
            boolean r0 = r3 instanceof com.facebook.aura.network.http.HatchHttpApi.AnonymousClass1
            if (r0 == 0) goto L54
            r4 = r3
            com.facebook.aura.network.http.HatchHttpApi$makeJarvisHttpRequestInternal$1 r4 = (com.facebook.aura.network.http.HatchHttpApi.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r4.label = r2
        L14:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L66
            X.Hwg.A00(r3)
        L22:
            com.facebook.aura.network.http.HatchHttpRequestResult r3 = (com.facebook.aura.network.http.HatchHttpRequestResult) r3
            boolean r0 = r3 instanceof com.facebook.aura.network.http.HatchHttpRequestSuccess
            if (r0 == 0) goto L5a
            com.facebook.aura.network.http.HatchHttpRequestSuccess r3 = (com.facebook.aura.network.http.HatchHttpRequestSuccess) r3
            com.facebook.aura.network.transport.HatchHttpResponse r2 = r3.response
            return r2
        L2d:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.L$3 = r0
            r4.L$4 = r0
            r4.L$5 = r0
            r4.L$6 = r0
            r4.L$7 = r0
            r4.Z$0 = r13
            r4.Z$1 = r15
            r0 = r16
            r4.Z$2 = r0
            r4.label = r1
            r17 = r4
            java.lang.Object r3 = r5.makeJarvisHttpRequestDetailedInternal(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r3 != r2) goto L22
            return r2
        L54:
            com.facebook.aura.network.http.HatchHttpApi$makeJarvisHttpRequestInternal$1 r4 = new com.facebook.aura.network.http.HatchHttpApi$makeJarvisHttpRequestInternal$1
            r4.<init>(r3)
            goto L14
        L5a:
            boolean r0 = r3 instanceof com.facebook.aura.network.http.HatchHttpRequestFailure
            if (r0 == 0) goto L60
            r2 = 0
            return r2
        L60:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L66:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.http.HatchHttpApi.makeJarvisHttpRequestInternal(com.facebook.aura.network.api.JarvisPath, java.lang.String, com.facebook.aura.network.http.RequestType, X.CGz, java.lang.Long, com.facebook.aura.network.transport.HatchHttpCachePolicy, X.HxE[], boolean, java.util.Map, boolean, boolean, X.HtJ):java.lang.Object");
    }

    public final Object makeJarvisHttpRequestStreamingInternal(JarvisPath jarvisPath, String str, OutputStream outputStream, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, Map<String, String> map, HxE<String, ? extends Object>[] hxEArr, String str2, boolean z, boolean z2, Long l2, HtJ<? super HatchHttpResponse> htJ) {
        String strA1K = C60P.A1K(abstractC3358CGz);
        if (str2 != null && !str2.equals(strA1K)) {
            return null;
        }
        if (!C7BY.A0j(strA1K)) {
            return GAo.A00(htJ, AnonymousClass001.A0y(), new C127182(strA1K, jarvisPath, str, requestType, abstractC3358CGz, l, l2, hxEArr, map, z, z2, outputStream, null));
        }
        CFK.A04(HatchHttpApiKt.TAG, "Cannot create streaming request: missing gateway URL");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object makeJarvisHttpRequestWithCredentials(com.facebook.aura.network.api.JarvisPath r17, java.lang.String r18, com.facebook.aura.network.http.RequestType r19, java.lang.String r20, java.lang.String r21, java.lang.Long r22, X.HxE<java.lang.String, ? extends java.lang.Object>[] r23, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponse> r24) {
        /*
            r16 = this;
            r4 = r24
            boolean r0 = r4 instanceof com.facebook.aura.network.http.HatchHttpApi.C127191
            r5 = r16
            if (r0 == 0) goto L62
            r3 = r4
            com.facebook.aura.network.http.HatchHttpApi$makeJarvisHttpRequestWithCredentials$1 r3 = (com.facebook.aura.network.http.HatchHttpApi.C127191) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r2 = r3.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r14 = 1
            if (r0 == 0) goto L2f
            if (r0 != r14) goto L73
            X.Hwg.A00(r2)
        L24:
            com.facebook.aura.network.http.HatchHttpRequestResult r2 = (com.facebook.aura.network.http.HatchHttpRequestResult) r2
            boolean r0 = r2 instanceof com.facebook.aura.network.http.HatchHttpRequestSuccess
            if (r0 == 0) goto L68
            com.facebook.aura.network.http.HatchHttpRequestSuccess r2 = (com.facebook.aura.network.http.HatchHttpRequestSuccess) r2
            com.facebook.aura.network.transport.HatchHttpResponse r1 = r2.response
            return r1
        L2f:
            X.Hwg.A00(r2)
            r12 = 0
            r3.L$0 = r12
            r3.L$1 = r12
            r3.L$2 = r12
            r3.L$3 = r12
            r3.L$4 = r12
            r3.L$5 = r12
            r3.L$6 = r12
            r3.label = r14
            X.9jH r15 = X.AGH.A0E()
            r16 = 0
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r13 = r23
            r17 = r14
            r18 = r3
            java.lang.Object r2 = r5.makeJarvisHttpRequestWithCredentialsDetailed$fbandroid_express_aura_java_com_facebook_aura_network_http_http(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            if (r2 != r1) goto L24
            return r1
        L62:
            com.facebook.aura.network.http.HatchHttpApi$makeJarvisHttpRequestWithCredentials$1 r3 = new com.facebook.aura.network.http.HatchHttpApi$makeJarvisHttpRequestWithCredentials$1
            r3.<init>(r4)
            goto L16
        L68:
            boolean r0 = r2 instanceof com.facebook.aura.network.http.HatchHttpRequestFailure
            if (r0 == 0) goto L6e
            r1 = 0
            return r1
        L6e:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L73:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.http.HatchHttpApi.makeJarvisHttpRequestWithCredentials(com.facebook.aura.network.api.JarvisPath, java.lang.String, com.facebook.aura.network.http.RequestType, java.lang.String, java.lang.String, java.lang.Long, X.HxE[], X.HtJ):java.lang.Object");
    }

    public final Object makeJarvisHttpRequestWithCredentialsDetailed$fbandroid_express_aura_java_com_facebook_aura_network_http_http(JarvisPath jarvisPath, String str, RequestType requestType, String str2, String str3, Long l, HatchHttpCachePolicy hatchHttpCachePolicy, HxE<String, ? extends Object>[] hxEArr, boolean z, Map<String, String> map, boolean z2, boolean z3, HtJ<? super HatchHttpRequestResult> htJ) {
        return GAo.A00(htJ, AuraDispatchers.INSTANCE.io(), new HatchHttpApi$makeJarvisHttpRequestWithCredentialsDetailed$2(str2, jarvisPath, str, requestType, str3, l, hatchHttpCachePolicy, hxEArr, map, z, z2, z3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildJarvisUrl(String str, JarvisPath jarvisPath, HxE<String, ? extends Object>[] hxEArr) {
        StringBuilder sb;
        String value = jarvisPath.getValue();
        int length = hxEArr.length;
        if (length == 0) {
            sb = new StringBuilder();
            sb.append(str);
            sb.append(value);
        } else {
            sb = new StringBuilder();
            boolean z = !C7BY.A0q(value, HatchOpenGraphRepository.UNKNOWN_HOST, false);
            int i = 0;
            do {
                HxE<String, ? extends Object> hxE = hxEArr[i];
                String str2 = hxE.first;
                B b = hxE.second;
                sb.append(z ? HatchOpenGraphRepository.UNKNOWN_HOST : "&");
                sb.append(URLEncoder.encode(str2, HatchWebPageParserKt.UTF_8));
                sb.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                sb.append(URLEncoder.encode(b.toString(), HatchWebPageParserKt.UTF_8));
                i++;
                z = false;
            } while (i < length);
            String string = sb.toString();
            sb = new StringBuilder();
            sb.append(str);
            sb.append(value);
            sb.append(string);
        }
        return sb.toString();
    }

    /* renamed from: executeJarvisRequest-1iavgos$default, reason: not valid java name */
    public static /* synthetic */ Object m1588executeJarvisRequest1iavgos$default(HatchHttpApi hatchHttpApi, JarvisPath jarvisPath, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, HxE[] hxEArr, HatchHttpCachePolicy hatchHttpCachePolicy, Set set, boolean z, Map map, boolean z2, String str, boolean z3, HtJ htJ, int i, Object obj) {
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    /* renamed from: executeJarvisRequest-Z6QaZII$default, reason: not valid java name */
    public static /* synthetic */ Object m1589executeJarvisRequestZ6QaZII$default(HatchHttpApi hatchHttpApi, JarvisPath jarvisPath, Object obj, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, HatchHttpCachePolicy hatchHttpCachePolicy, HxE[] hxEArr, Set set, boolean z, boolean z2, Map map, String str, boolean z3, boolean z4, boolean z5, boolean z6, String str2, boolean z7, HtJ htJ, int i, Object obj2) {
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    /* renamed from: executeStefiMultipartRequest-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m1590executeStefiMultipartRequestBWLJW6A$default(HatchHttpApi hatchHttpApi, StefiPath stefiPath, List list, List list2, HtJ htJ, int i, Object obj) {
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    /* renamed from: executeStefiRequest-bMdYcbs$default, reason: not valid java name */
    public static /* synthetic */ Object m1591executeStefiRequestbMdYcbs$default(HatchHttpApi hatchHttpApi, StefiPath stefiPath, RequestType requestType, Long l, Long l2, Map map, Map map2, HtJ htJ, int i, Object obj) {
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    /* renamed from: executeStefiRequest-tZkwj4A$default, reason: not valid java name */
    public static /* synthetic */ Object m1592executeStefiRequesttZkwj4A$default(HatchHttpApi hatchHttpApi, StefiPath stefiPath, Object obj, RequestType requestType, Map map, boolean z, HatchHttpRequestAttemptObserverFactory hatchHttpRequestAttemptObserverFactory, boolean z2, Long l, HtJ htJ, int i, Object obj2) {
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String failureDetail(Throwable th) {
        String strA03;
        String message = th.getMessage();
        return (message == null || (strA03 = C6tn.A03(message)) == null || C7BY.A0j(strA03)) ? C3cI.A0Y(th) : FGI.A0U(C3cI.A0Y(th), ":", strA03);
    }

    /* renamed from: executeJarvisRequest-1iavgos, reason: not valid java name */
    public final /* synthetic */ <Res> Object m1597executeJarvisRequest1iavgos(JarvisPath jarvisPath, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, HxE<String, ? extends Object>[] hxEArr, HatchHttpCachePolicy hatchHttpCachePolicy, Set<Integer> set, boolean z, Map<String, String> map, boolean z2, String str, boolean z3, HtJ<? super HsJ<? extends Res>> htJ) {
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    /* renamed from: executeJarvisRequest-Z6QaZII, reason: not valid java name */
    public final /* synthetic */ <Req, Res> Object m1598executeJarvisRequestZ6QaZII(JarvisPath jarvisPath, Req req, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, HatchHttpCachePolicy hatchHttpCachePolicy, HxE<String, ? extends Object>[] hxEArr, Set<Integer> set, boolean z, boolean z2, Map<String, String> map, String str, boolean z3, boolean z4, boolean z5, boolean z6, String str2, boolean z7, HtJ<? super HsJ<? extends Res>> htJ) {
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    /* renamed from: executeStefiMultipartRequest-BWLJW6A, reason: not valid java name */
    public final /* synthetic */ <Res> Object m1600executeStefiMultipartRequestBWLJW6A(StefiPath stefiPath, List<HatchMultipartPart> list, List<HatchMultipartFilePart> list2, HtJ<? super HsJ<? extends Res>> htJ) {
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    /* renamed from: executeStefiRequest-bMdYcbs, reason: not valid java name */
    public final /* synthetic */ <Res> Object m1602executeStefiRequestbMdYcbs(StefiPath stefiPath, RequestType requestType, Long l, Long l2, Map<String, String> map, Map<String, String> map2, HtJ<? super HsJ<? extends Res>> htJ) {
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    /* renamed from: executeStefiRequest-tZkwj4A, reason: not valid java name */
    public final /* synthetic */ <Req, Res> Object m1603executeStefiRequesttZkwj4A(StefiPath stefiPath, Req req, RequestType requestType, Map<String, String> map, boolean z, HatchHttpRequestAttemptObserverFactory hatchHttpRequestAttemptObserverFactory, boolean z2, Long l, HtJ<? super HsJ<? extends Res>> htJ) {
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    public final Object executeVmProbeAttempt(String str, String str2, List<? extends JarvisPath> list, HatchVmProbeAuthProvider hatchVmProbeAuthProvider, HatchVmProbeResponseObserver hatchVmProbeResponseObserver, HtJ<? super HatchVmProbeResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, list, str2, hatchVmProbeAuthProvider, hatchVmProbeResponseObserver, null));
    }

    public final Object makeJarvisHttpStreamingPost(JarvisPath jarvisPath, OutputStream outputStream, AbstractC3358CGz abstractC3358CGz, String str, Long l, Long l2, HtJ<? super HatchHttpResponse> htJ) {
        String strA1K = C60P.A1K(abstractC3358CGz);
        if (!C7BY.A0j(strA1K)) {
            return GAo.A00(htJ, AnonymousClass001.A0y(), new C127202(strA1K, jarvisPath, str, l, l2, outputStream, null));
        }
        CFK.A04(HatchHttpApiKt.TAG, "Cannot create streaming request: missing gateway URL");
        return null;
    }

    public final Object openJarvisDuplexStream(JarvisPath jarvisPath, AbstractC3358CGz abstractC3358CGz, HatchDuplexResponseHandler hatchDuplexResponseHandler, Long l, HxE<String, ? extends Object>[] hxEArr, boolean z, HtJ<? super HatchDuplexHttpStream> htJ) {
        String strA1K = C60P.A1K(abstractC3358CGz);
        if (!C7BY.A0j(strA1K)) {
            return GAo.A00(htJ, AnonymousClass001.A0y(), new C127212(strA1K, jarvisPath, hxEArr, l, z, hatchDuplexResponseHandler, null));
        }
        CFK.A04(HatchHttpApiKt.TAG, "Cannot create duplex request: missing gateway URL");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0173  */
    /* renamed from: executeBodylessJarvisRequestWith-p3iPjrY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <Res> java.lang.Object m1595executeBodylessJarvisRequestWithp3iPjrY(kotlin.jvm.functions.Function0<? extends X.C9hr<Res>> r23, boolean r24, com.facebook.aura.network.api.JarvisPath r25, com.facebook.aura.network.http.RequestType r26, X.AbstractC3358CGz r27, java.lang.Long r28, X.HxE<java.lang.String, ? extends java.lang.Object>[] r29, com.facebook.aura.network.transport.HatchHttpCachePolicy r30, java.util.Set<java.lang.Integer> r31, boolean r32, java.util.Map<java.lang.String, java.lang.String> r33, boolean r34, java.lang.String r35, boolean r36, X.HtJ<? super X.HsJ<? extends Res>> r37) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.http.HatchHttpApi.m1595executeBodylessJarvisRequestWithp3iPjrY(kotlin.jvm.functions.Function0, boolean, com.facebook.aura.network.api.JarvisPath, com.facebook.aura.network.http.RequestType, X.CGz, java.lang.Long, X.HxE[], com.facebook.aura.network.transport.HatchHttpCachePolicy, java.util.Set, boolean, java.util.Map, boolean, java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01da  */
    /* renamed from: executeJarvisRequestWith-Fof5HsY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <Req, Res> java.lang.Object m1599executeJarvisRequestWithFof5HsY(kotlin.jvm.functions.Function0<? extends X.C9hr<Req>> r34, kotlin.jvm.functions.Function0<? extends X.C9hr<Res>> r35, boolean r36, com.facebook.aura.network.api.JarvisPath r37, Req r38, com.facebook.aura.network.http.RequestType r39, X.AbstractC3358CGz r40, java.lang.Long r41, com.facebook.aura.network.transport.HatchHttpCachePolicy r42, X.HxE<java.lang.String, ? extends java.lang.Object>[] r43, java.util.Set<java.lang.Integer> r44, boolean r45, boolean r46, java.util.Map<java.lang.String, java.lang.String> r47, java.lang.String r48, boolean r49, boolean r50, boolean r51, boolean r52, java.lang.String r53, boolean r54, X.HtJ<? super X.HsJ<? extends Res>> r55) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.http.HatchHttpApi.m1599executeJarvisRequestWithFof5HsY(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, com.facebook.aura.network.api.JarvisPath, java.lang.Object, com.facebook.aura.network.http.RequestType, X.CGz, java.lang.Long, com.facebook.aura.network.transport.HatchHttpCachePolicy, X.HxE[], java.util.Set, boolean, boolean, java.util.Map, java.lang.String, boolean, boolean, boolean, boolean, java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* renamed from: executeStefiRequestInternal-1iavgos, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <Res> java.lang.Object m1593executeStefiRequestInternal1iavgos(kotlin.jvm.functions.Function0<? extends X.C9hr<Res>> r16, boolean r17, com.facebook.aura.network.api.StefiPath r18, byte[] r19, com.facebook.aura.network.http.RequestType r20, java.lang.Long r21, java.lang.Long r22, java.util.Map<java.lang.String, java.lang.String> r23, boolean r24, com.facebook.aura.network.transport.HatchHttpRequestAttemptObserverFactory r25, boolean r26, java.util.Map<java.lang.String, java.lang.String> r27, X.HtJ<? super X.HsJ<? extends Res>> r28) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.http.HatchHttpApi.m1593executeStefiRequestInternal1iavgos(kotlin.jvm.functions.Function0, boolean, com.facebook.aura.network.api.StefiPath, byte[], com.facebook.aura.network.http.RequestType, java.lang.Long, java.lang.Long, java.util.Map, boolean, com.facebook.aura.network.transport.HatchHttpRequestAttemptObserverFactory, boolean, java.util.Map, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object makeJarvisHttpRequestStreaming$default(HatchHttpApi hatchHttpApi, JarvisPath jarvisPath, Object obj, OutputStream outputStream, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, HtJ htJ, int i, Object obj2) {
        Long l2 = l;
        if ((i & 32) != 0) {
            l2 = null;
        }
        if (obj instanceof String) {
            return hatchHttpApi.makeJarvisHttpRequestStreamingInternal(jarvisPath, (String) obj, outputStream, requestType, abstractC3358CGz, l2, AGH.A0E(), new HxE[0], null, false, true, null, htJ);
        }
        C7384Etj.A0Q();
        throw F60.createAndThrow();
    }

    public static /* synthetic */ Object makeJarvisHttpRequest__EXCEPTIONAL_USE_CASES_ONLY$default(HatchHttpApi hatchHttpApi, JarvisPath jarvisPath, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, HxE[] hxEArr, HatchHttpCachePolicy hatchHttpCachePolicy, HtJ htJ, int i, Object obj) {
        if ((i & 8) != 0) {
            l = null;
        }
        if ((i & 32) != 0) {
            hatchHttpCachePolicy = null;
        }
        return hatchHttpApi.makeJarvisHttpRequest__EXCEPTIONAL_USE_CASES_ONLY(jarvisPath, requestType, abstractC3358CGz, l, hxEArr, hatchHttpCachePolicy, htJ);
    }

    public final Object makeJarvisHttpRequestStreaming(JarvisPath jarvisPath, OutputStream outputStream, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, Map<String, String> map, HxE<String, ? extends Object>[] hxEArr, String str, boolean z, boolean z2, Long l2, HtJ<? super HatchHttpResponse> htJ) {
        return makeJarvisHttpRequestStreamingInternal(jarvisPath, null, outputStream, requestType, abstractC3358CGz, l, map, hxEArr, str, z, z2, l2, htJ);
    }

    public final Object makeJarvisHttpRequest__EXCEPTIONAL_USE_CASES_ONLY(JarvisPath jarvisPath, RequestType requestType, AbstractC3358CGz abstractC3358CGz, Long l, HxE<String, ? extends Object>[] hxEArr, HatchHttpCachePolicy hatchHttpCachePolicy, HtJ<? super HatchHttpResponse> htJ) {
        return makeJarvisHttpRequestInternal(jarvisPath, null, requestType, abstractC3358CGz, l, hatchHttpCachePolicy, hxEArr, true, AGH.A0E(), false, true, htJ);
    }
}
