package com.facebook.aura.analytics.impl;

import X.AGH;
import X.AII;
import X.AIM;
import X.AIW;
import X.AbstractC9245GAx;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.C0881AGi;
import X.C3cG;
import X.C3cI;
import X.C4016Cjx;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C6ys;
import X.C7384Etj;
import X.CFK;
import X.DG8;
import X.F60;
import X.HandlerC4948DGt;
import X.HxE;
import X.InterfaceC4017Cjy;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuationKt;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.network.AuraUserAgent;
import com.facebook.aura.network.endpoint.AuraAnalyticsEndpointSelector;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchHttpResponseBody;
import com.facebook.aura.network.transport.HatchMultipartPart;
import com.facebook.aura.network.transport.HatchRequestBody;
import com.facebook.aura.network.transport.HatchRequestCategory;
import com.facebook.aura.network.transport.HatchRequestPurpose;
import com.facebook.aura.network.transport.HatchResponseBodyPolicy;
import com.facebook.falco.sampling.FFSamplingBridgeJava;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class FFMetaAnalyticsUploader {
    public final AuraAnalyticsEndpointSelector endpointSelector = new AuraAnalyticsEndpointSelector();
    public final String callerClassName = C60Q.A0e(this);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map] */
    private final HatchHttpRequest buildRequest(byte[] bArr, boolean z, boolean z2) {
        String strEndpointUrl;
        Long l;
        HatchRequestBody multipart;
        LinkedHashMap linkedHashMapA11;
        HxE[] hxEArr = {C3cG.A0r("User-Agent", AuraUserAgent.fullUserAgent.getValue()), C3cG.A0r("fb_api_req_friendly_name", "sendAnalyticsLog"), C3cG.A0r("fb_api_caller_class", this.callerClassName)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(AIW.A0H(3));
        AGH.A0G(linkedHashMap, hxEArr);
        if (z2) {
            linkedHashMap.put(FFMetaAnalyticsUploaderKt.DEIDENTIFIED_HEADER, "1");
        }
        HatchHttpRequest.Companion companion = HatchHttpRequest.Companion;
        if (z) {
            strEndpointUrl = endpointUrl(true);
            multipart = new HatchRequestBody.Bytes(bArr, "application/json");
            l = null;
            linkedHashMapA11 = AnonymousClass006.A11("Content-Encoding", "gzip", linkedHashMap);
        } else {
            strEndpointUrl = endpointUrl(false);
            l = null;
            multipart = new HatchRequestBody.Multipart(buildNestParts(bArr), C0881AGi.A00);
            linkedHashMapA11 = linkedHashMap;
        }
        return companion.post(strEndpointUrl, multipart, linkedHashMapA11, l, l, l, HatchRequestCategory.API, HatchRequestPurpose.FETCH, l, false, false, true, HatchResponseBodyPolicy.DEFAULT, l, false, true);
    }

    private final String endpointUrl(boolean z) {
        return C60R.A0b(new Uri.Builder().scheme("https").authority(this.endpointSelector.facebookAuthority("graph")).path(z ? "/pigeon_health_metrics" : "/pigeon_nest"));
    }

    public FFMetaAnalyticsUploader(Context context) {
    }

    private final List<HatchMultipartPart> buildNestParts(byte[] bArr) {
        AII aiiA17 = AIM.A17();
        aiiA17.add(stringPart("thrift_protocol", "compact"));
        aiiA17.add(stringPart("cmethod", "gzip"));
        aiiA17.add(new HatchMultipartPart("cmsg", ReplyAttributionSerializer.TYPE_MESSAGE, "application/octet-stream", bArr));
        aiiA17.add(stringPart(NativeLoginCheckpointContinuationKt.ACCESS_TOKEN_PARAM, FFMetaAnalyticsUploaderKt.FALCO_CLIENT_TOKEN));
        return AIM.A18(aiiA17);
    }

    private final HatchMultipartPart stringPart(String str, String str2) {
        return new HatchMultipartPart(str, null, "text/plain", C3cG.A1S(str2));
    }

    public void doUpload(byte[] bArr, InterfaceC4017Cjy interfaceC4017Cjy, boolean z, boolean z2) {
        Object[] objArr;
        String str;
        boolean zA1Y = C60P.A1Y(bArr, interfaceC4017Cjy);
        HatchHttpRequest hatchHttpRequestBuildRequest = buildRequest(bArr, z, z2);
        Boolean boolValueOf = Boolean.valueOf(z);
        try {
            HatchHttpResponse hatchHttpResponse = (HatchHttpResponse) AbstractC9245GAx.A00(C6ys.A00, new FFMetaAnalyticsUploader$doUpload$response$1(hatchHttpRequestBuildRequest, null));
            HatchHttpResponseBody hatchHttpResponseBodyBody = hatchHttpResponse.body();
            if (!hatchHttpResponse.isSuccessful || hatchHttpResponseBodyBody == null) {
                interfaceC4017Cjy.ATJ(z);
                return;
            }
            try {
                InputStream inputStream = hatchHttpResponseBodyBody.stream;
                C4016Cjx c4016Cjx = (C4016Cjx) interfaceC4017Cjy;
                if (!z) {
                    DG8 dg8 = c4016Cjx.A00.A00;
                    if (dg8 == null) {
                        C7384Etj.A0b("eventQueue");
                        throw F60.createAndThrow();
                    }
                    synchronized (((HandlerC4948DGt) dg8).A0C) {
                    }
                }
                FFSamplingBridgeJava.onUploadComplete(zA1Y, inputStream, z);
            } finally {
            }
        } catch (IOException e) {
            e = e;
            objArr = new Object[]{C3cI.A0Y(e), boolValueOf};
            str = "Upload IOException: %s isHC=%b";
            CFK.A0C(FFMetaAnalyticsUploaderKt.TAG, str, e, objArr);
            interfaceC4017Cjy.ATJ(z);
        } catch (Exception e2) {
            e = e2;
            objArr = new Object[]{C3cI.A0Y(e), boolValueOf};
            str = "Unexpected upload error: %s isHC=%b";
            CFK.A0C(FFMetaAnalyticsUploaderKt.TAG, str, e, objArr);
            interfaceC4017Cjy.ATJ(z);
        } catch (OutOfMemoryError e3) {
            CFK.A0C(FFMetaAnalyticsUploaderKt.TAG, "Upload OOM: isHC=%b", e3, boolValueOf);
            interfaceC4017Cjy.ATJ(z);
        }
    }

    public void doUpload(byte[] bArr, InterfaceC4017Cjy interfaceC4017Cjy, boolean z) {
        doUpload(bArr, interfaceC4017Cjy, z, AnonymousClass004.A1b(bArr, interfaceC4017Cjy));
    }
}
