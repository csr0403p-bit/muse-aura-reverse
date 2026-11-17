package com.facebook.aura.network.transport.tigon;

import X.C06H;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.network.transport.HatchRequestBody;
import com.facebook.aura.network.transport.tigon.internal.TigonMultipartStreamingProvider;
import com.facebook.aura.network.transport.tigon.internal.TigonMultipartStreamingProviderKt;
import com.facebook.tigon.TigonBodyProvider;
import com.facebook.tigon.TigonXplatBodyProvider;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class EncodedBody {
    public final String boundary;
    public final byte[] bytes;
    public final String contentType;
    public final HatchRequestBody.Multipart fileMultipart;

    public final String getBoundary() {
        return this.boundary;
    }

    public final byte[] getBytes() {
        return this.bytes;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final HatchRequestBody.Multipart getFileMultipart() {
        return this.fileMultipart;
    }

    public final TigonBodyProvider toBodyProvider() {
        String str;
        HatchRequestBody.Multipart multipart = this.fileMultipart;
        if (multipart != null && (str = this.boundary) != null) {
            TigonXplatBodyProvider tigonXplatBodyProvider = TigonXplatBodyProvider.$redex_init_class;
            return new TigonMultipartStreamingProvider(TigonMultipartStreamingProviderKt.buildMultipartStreamPlan(multipart, str), (Executor) AuraExecutors.fileUploadStreamingExecutor$delegate.getValue(), 120000L);
        }
        byte[] bArr = this.bytes;
        if (bArr != null) {
            return TigonHatchHttpClientKt.chunkedProvider(bArr);
        }
        return null;
    }

    public EncodedBody(byte[] bArr, String str, HatchRequestBody.Multipart multipart, String str2) {
        this.bytes = bArr;
        this.contentType = str;
        this.fileMultipart = multipart;
        this.boundary = str2;
    }

    public /* synthetic */ EncodedBody(byte[] bArr, String str, HatchRequestBody.Multipart multipart, String str2, int i, C06H c06h) {
        this(bArr, str, (i & 4) != 0 ? null : multipart, (i & 8) != 0 ? null : str2);
    }
}
