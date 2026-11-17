package com.facebook.aura.network.transport.flipper;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchHttpResponseStream;
import com.facebook.aura.network.transport.HatchRequestBody;
import com.facebook.aura.network.transport.HatchRequestCategory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public abstract class FlipperReportingHatchHttpClientKt {
    public static final String BEARER_OVERRIDE_UNSUPPORTED = "Explicit bearer is unsupported";
    public static final int FLIPPER_STREAM_BODY_MAX_BYTES = 4194304;
    public static final int REPORT_BUFFER_SIZE = 8192;
    public static final String VM_PROBE_FAILURE_MESSAGE = "Scoped VM probe failed before receiving a response";
    public static final String VM_PROBE_MISSING_RESPONSE_MESSAGE = "Scoped VM probe returned no response";

    public static final /* synthetic */ boolean access$shouldReportResponseBody(HatchHttpRequest hatchHttpRequest) {
        return !hatchHttpRequest.skipBodyObserver;
    }

    public static final CapturedBody readUpTo(InputStream inputStream, long j) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        long j2 = 0;
        do {
            int i = inputStream.read(bArr);
            if (i < 0) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C7384Etj.A0U(byteArray);
                return new CapturedBody(byteArray, null);
            }
            byteArrayOutputStream.write(bArr, 0, i);
            j2 += i;
        } while (j2 <= j);
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        C7384Etj.A0U(byteArray2);
        return new CapturedBody(byteArray2, inputStream);
    }

    public static final byte[] reportBody(HatchHttpRequest hatchHttpRequest) {
        if (hatchHttpRequest.skipBodyObserver) {
            return null;
        }
        HatchRequestBody hatchRequestBody = hatchHttpRequest.body;
        if (hatchRequestBody instanceof HatchRequestBody.Json) {
            return C3cG.A1S(((HatchRequestBody.Json) hatchRequestBody).value);
        }
        if (hatchRequestBody instanceof HatchRequestBody.Bytes) {
            return ((HatchRequestBody.Bytes) hatchRequestBody).bytes;
        }
        return null;
    }

    public static final boolean shouldCaptureStreamBody(HatchHttpRequest hatchHttpRequest, HatchHttpResponseStream hatchHttpResponseStream) {
        String strA0p;
        String strA0S;
        String strA0l;
        if (hatchHttpRequest.category == HatchRequestCategory.VIDEO || (strA0p = C60O.A0p("Content-Type", hatchHttpResponseStream.headers)) == null || (strA0S = C7BY.A0S(strA0p, strA0p, ';')) == null || (strA0l = AnonymousClass002.A0l(strA0S)) == null) {
            return false;
        }
        String strA0u = AnonymousClass001.A0u(strA0l);
        return strA0u.equals("application/json") || strA0u.equals("text/json") || strA0u.endsWith("+json");
    }

    public static final boolean shouldReportResponseBody(HatchHttpRequest hatchHttpRequest) {
        return !hatchHttpRequest.skipBodyObserver;
    }

    public static final HatchHttpResponse withBody(HatchHttpResponse hatchHttpResponse, InputStream inputStream) {
        return HatchHttpResponse.Companion.of(hatchHttpResponse.statusCode, hatchHttpResponse.statusMessage, hatchHttpResponse.headers, inputStream, hatchHttpResponse.errorMessage, hatchHttpResponse.isSuccessful, hatchHttpResponse.cacheStatus, hatchHttpResponse.cause);
    }
}
