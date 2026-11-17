package com.facebook.aura.analytics.impl;

import X.AGH;
import X.AIW;
import X.AbstractC9245GAx;
import X.AnonymousClass003;
import X.BV4;
import X.C3cG;
import X.C3cI;
import X.C4008Cjj;
import X.C4010Cjo;
import X.C60Q;
import X.C60R;
import X.C6ys;
import X.C7384Etj;
import X.C83;
import X.CFK;
import X.CFW;
import X.FGI;
import X.HxE;
import X.InterfaceC3363CHh;
import X.InterfaceC3367CHl;
import X.InterfaceC4012Cjq;
import X.InterfaceC4013Cjt;
import X.InterfaceC4014Cju;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.analytics.ffdb.AuraFFDBProvider;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuationKt;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.network.AuraUserAgent;
import com.facebook.aura.network.endpoint.AuraAnalyticsEndpointSelector;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchHttpResponseBody;
import com.facebook.aura.network.transport.HatchRequestBody;
import com.facebook.aura.network.transport.HatchRequestCategory;
import com.facebook.aura.network.transport.HatchRequestPurpose;
import com.facebook.aura.network.transport.HatchResponseBodyPolicy;
import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes5.dex */
public final class MetaAnalyticsUploader implements InterfaceC4012Cjq {
    public final AuraAnalyticsEndpointSelector endpointSelector = new AuraAnalyticsEndpointSelector();
    public final String callerClassName = C60Q.A0e(this);

    private final HatchHttpRequest buildRequest(InterfaceC3363CHh interfaceC3363CHh) throws IOException {
        byte[] bArrSerializeAndGzip = serializeAndGzip(interfaceC3363CHh);
        HxE[] hxEArr = {C3cG.A0r("User-Agent", AuraUserAgent.fullUserAgent.getValue()), C3cG.A0r("fb_api_req_friendly_name", "sendAnalyticsLog"), C3cG.A0r("fb_api_caller_class", this.callerClassName), C3cG.A0r("Content-Encoding", "gzip")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(AIW.A0H(4));
        AGH.A0G(linkedHashMap, hxEArr);
        return HatchHttpRequest.Companion.post(endpointUrl(), new HatchRequestBody.Bytes(bArrSerializeAndGzip, "application/x-www-form-urlencoded"), linkedHashMap, null, null, null, HatchRequestCategory.API, HatchRequestPurpose.FETCH, null, false, false, true, HatchResponseBodyPolicy.DEFAULT, null, false, true);
    }

    private final String endpointUrl() {
        return C60R.A0b(new Uri.Builder().scheme("https").authority(this.endpointSelector.facebookAuthority("graph")).path("/logging_client_events"));
    }

    @Override // X.InterfaceC4012Cjq
    public void upload(C4010Cjo c4010Cjo, InterfaceC4013Cjt interfaceC4013Cjt, InterfaceC4014Cju interfaceC4014Cju) {
        IOException iOException;
        InterfaceC3367CHl interfaceC3367CHl;
        AnonymousClass003.A0u(c4010Cjo, interfaceC4013Cjt);
        try {
            try {
                HatchHttpResponse hatchHttpResponse = (HatchHttpResponse) AbstractC9245GAx.A00(C6ys.A00, new MetaAnalyticsUploader$upload$response$1(buildRequest(c4010Cjo.A00), null));
                HatchHttpResponseBody hatchHttpResponseBodyBody = hatchHttpResponse.body();
                if (hatchHttpResponseBodyBody == null) {
                    String str = hatchHttpResponse.errorMessage;
                    if (str == null) {
                        str = "no response body";
                    }
                    interfaceC4013Cjt.onFailure(BV4.A0K(str));
                    return;
                }
                try {
                    final int i = hatchHttpResponse.statusCode;
                    InputStream inputStream = hatchHttpResponseBodyBody.stream;
                    C4008Cjj c4008Cjj = (C4008Cjj) interfaceC4013Cjt;
                    try {
                        try {
                        } catch (IOException e) {
                            c4008Cjj.A01.onFailure(e);
                            interfaceC3367CHl = c4008Cjj.A00;
                        }
                        if (i != 200) {
                            final String strA0H = FGI.A0H("Unexpected HTTP code ", i);
                            throw new IOException(i, strA0H) { // from class: com.facebook.analytics2.logger.legacy.uploader.UploadProcessor$HttpResponseException
                                public static final long serialVersionUID = 1;
                                public final int mStatusCode;

                                {
                                    super(strA0H);
                                    this.mStatusCode = i;
                                }
                            };
                        }
                        SamplingPolicyConfig samplingPolicyConfig = c4008Cjj.A03;
                        if (samplingPolicyConfig != null) {
                            samplingPolicyConfig.updatePolicyFromServer(inputStream, c4008Cjj.A02);
                        }
                        interfaceC3367CHl = c4008Cjj.A00;
                        interfaceC3367CHl.AQ9();
                        c4008Cjj.A01.onSuccess();
                        if (interfaceC3367CHl.ANC()) {
                            interfaceC3367CHl.unlock();
                        }
                        inputStream.close();
                    } catch (Throwable th) {
                        InterfaceC3367CHl interfaceC3367CHl2 = c4008Cjj.A00;
                        if (interfaceC3367CHl2.ANC()) {
                            interfaceC3367CHl2.unlock();
                        }
                        inputStream.close();
                        throw th;
                    }
                } finally {
                }
            } catch (IOException e2) {
                interfaceC4013Cjt.onFailure(e2);
            } catch (Exception e3) {
                String strA0Y = C3cI.A0Y(e3);
                CFK.A0C(MetaAnalyticsUploaderKt.TAG, "Unexpected upload error: %s", e3, strA0Y);
                iOException = new IOException(FGI.A0M("Unexpected upload error: ", strA0Y), e3);
                interfaceC4013Cjt.onFailure(iOException);
            } catch (OutOfMemoryError e4) {
                CFK.A0J(MetaAnalyticsUploaderKt.TAG, e4, "Upload OOM");
                iOException = new IOException("Upload OOM", e4);
                interfaceC4013Cjt.onFailure(iOException);
            }
        } catch (IOException e5) {
            CFK.A0C(MetaAnalyticsUploaderKt.TAG, "Failed to build request: %s", e5, C3cI.A0Y(e5));
            interfaceC4013Cjt.onFailure(e5);
        }
    }

    public MetaAnalyticsUploader(Context context) {
    }

    private final byte[] serializeAndGzip(InterfaceC3363CHh interfaceC3363CHh) throws IOException {
        int iAFK = interfaceC3363CHh.AFK();
        if (iAFK < 0) {
            iAFK = 0;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iAFK);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            FormEncoder formEncoder = new FormEncoder(gZIPOutputStream);
            formEncoder.write(NativeLoginCheckpointContinuationKt.ACCESS_TOKEN_PARAM, MetaAnalyticsUploaderKt.FALCO_CLIENT_TOKEN);
            formEncoder.write("format", "json");
            formEncoder.write("compressed", HatchPriceImpressionEventDataKt.NO_DISCOUNT);
            if (interfaceC3363CHh.AOm()) {
                formEncoder.write("multi_batch", "1");
            }
            String fFDBToken = interfaceC3363CHh.getFFDBToken();
            if (fFDBToken.length() > 0) {
                formEncoder.write(AuraFFDBProvider.FFDB_TOKEN_PREF_KEY, fFDBToken);
            }
            if (interfaceC3363CHh.AfZ()) {
                formEncoder.write("request_debug_config", "1");
            }
            formEncoder.write(ReplyAttributionSerializer.TYPE_MESSAGE, null);
            C83 c83 = new C83(new CFW(gZIPOutputStream, null));
            interfaceC3363CHh.Ais(c83);
            c83.flush();
            gZIPOutputStream.close();
            return C7384Etj.A0d(byteArrayOutputStream);
        } finally {
        }
    }
}
