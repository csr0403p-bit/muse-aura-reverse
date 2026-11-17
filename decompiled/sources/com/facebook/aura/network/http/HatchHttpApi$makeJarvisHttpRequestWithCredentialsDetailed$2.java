package com.facebook.aura.network.http;

import X.AbstractC07127nr;
import X.C3UX;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.gateway.HatcheryVMIdUtilsKt;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchHttpCachePolicy;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchTransport;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.network.http.HatchHttpApi$makeJarvisHttpRequestWithCredentialsDetailed$2", f = "HatchHttpApi.kt", l = {730}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchHttpApi$makeJarvisHttpRequestWithCredentialsDetailed$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchHttpRequestResult>, Object> {
    public final /* synthetic */ String $authToken;
    public final /* synthetic */ String $body;
    public final /* synthetic */ HatchHttpCachePolicy $cachePolicy;
    public final /* synthetic */ JarvisPath $endpoint;
    public final /* synthetic */ Map<String, String> $extraHeaders;
    public final /* synthetic */ boolean $followRedirects;
    public final /* synthetic */ HxE<String, Object>[] $queryParams;
    public final /* synthetic */ RequestType $requestType;
    public final /* synthetic */ boolean $retryable;
    public final /* synthetic */ boolean $skipBodyObserver;
    public final /* synthetic */ Long $timeoutSeconds;
    public final /* synthetic */ String $wsUrl;
    public Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchHttpApi$makeJarvisHttpRequestWithCredentialsDetailed$2(String str, JarvisPath jarvisPath, String str2, RequestType requestType, String str3, Long l, HatchHttpCachePolicy hatchHttpCachePolicy, HxE<String, ? extends Object>[] hxEArr, Map<String, String> map, boolean z, boolean z2, boolean z3, HtJ<? super HatchHttpApi$makeJarvisHttpRequestWithCredentialsDetailed$2> htJ) {
        super(2, htJ);
        this.$wsUrl = str;
        this.$endpoint = jarvisPath;
        this.$body = str2;
        this.$requestType = requestType;
        this.$authToken = str3;
        this.$timeoutSeconds = l;
        this.$cachePolicy = hatchHttpCachePolicy;
        this.$queryParams = hxEArr;
        this.$extraHeaders = map;
        this.$retryable = z;
        this.$skipBodyObserver = z2;
        this.$followRedirects = z3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchHttpApi$makeJarvisHttpRequestWithCredentialsDetailed$2(this.$wsUrl, this.$endpoint, this.$body, this.$requestType, this.$authToken, this.$timeoutSeconds, this.$cachePolicy, this.$queryParams, this.$extraHeaders, this.$retryable, this.$skipBodyObserver, this.$followRedirects, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objExecute = obj;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(objExecute);
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                String strJarvisHttpBaseUrl = hatchHttpApi.jarvisHttpBaseUrl(this.$wsUrl);
                if (strJarvisHttpBaseUrl == null) {
                    HatchHttpFailure hatchHttpFailure = new HatchHttpFailure("bad_gateway_url", HatcheryVMIdUtilsKt.redactedGatewayUrlForLog(this.$wsUrl));
                    CFK.A04(HatchHttpApiKt.TAG, FGI.A0M("Cannot convert WebSocket URL to HTTP URL: ", hatchHttpFailure.getLogValue()));
                    return new HatchHttpRequestFailure(hatchHttpFailure);
                }
                HatchHttpRequest hatchHttpRequestBuildJarvisRequest$default = HatchHttpApi.buildJarvisRequest$default(hatchHttpApi, strJarvisHttpBaseUrl, this.$endpoint, this.$body, this.$requestType, this.$authToken, this.$timeoutSeconds, null, this.$cachePolicy, this.$queryParams, this.$extraHeaders, this.$retryable, this.$skipBodyObserver, this.$followRedirects, 64, null);
                HatchHttpClient hatchHttpClientHttpClient = HatchTransport.INSTANCE.httpClient(HatchAuthScheme.VM_JWT);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                objExecute = hatchHttpClientHttpClient.execute(hatchHttpRequestBuildJarvisRequest$default, this);
                if (objExecute == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Hwg.A00(objExecute);
            }
            return new HatchHttpRequestSuccess((HatchHttpResponse) objExecute);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            HatchHttpFailure hatchHttpFailure2 = new HatchHttpFailure("execute_failed", HatchHttpApi.INSTANCE.failureDetail(e2));
            CFK.A0A(HatchHttpApiKt.TAG, FGI.A0M("Failed to execute Jarvis HTTP request: ", hatchHttpFailure2.getLogValue()), e2);
            return new HatchHttpRequestFailure(hatchHttpFailure2);
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchHttpRequestResult> htJ) {
        return ((HatchHttpApi$makeJarvisHttpRequestWithCredentialsDetailed$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
