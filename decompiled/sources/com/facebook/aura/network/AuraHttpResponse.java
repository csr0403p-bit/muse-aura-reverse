package com.facebook.aura.network;

import X.AnonymousClass002;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import X.C9tI;
import com.facebook.aura.network.api.HttpResponseBytesKt;
import java.io.InputStream;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class AuraHttpResponse {
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final Companion Companion = new Companion();
    public static final long UNKNOWN_CONTENT_LENGTH = -1;
    public final InputStream body;
    public final Throwable cause;
    public final int code;
    public final String errorMessage;
    public final Map<String, String> headers;
    public final boolean isSuccessful;
    public final String message;

    public final String header(String str) {
        C7384Etj.A0Y(str, 0);
        return C60O.A0p(str, this.headers);
    }

    public /* synthetic */ AuraHttpResponse(int i, Map map, InputStream inputStream, String str, boolean z, String str2, Throwable th, int i2, C06H c06h) {
        this(i, map, inputStream, str, z, (i2 & 32) != 0 ? "" : str2, (i2 & 64) != 0 ? null : th);
    }

    private final long contentLengthOrUnknown() {
        String strA0p;
        Long lA0s;
        int i = this.code;
        if (i == 204 || i == 304 || (strA0p = C60O.A0p("Content-Length", this.headers)) == null || (lA0s = C9tI.A0s(strA0p)) == null) {
            return -1L;
        }
        return lA0s.longValue();
    }

    public final byte[] bodyBytes() {
        InputStream inputStream = this.body;
        if (inputStream != null) {
            return HttpResponseBytesKt.readBoundedBytes(inputStream, 50331648L, contentLengthOrUnknown());
        }
        return null;
    }

    public final String bodyString() {
        InputStream inputStream = this.body;
        String boundedString = null;
        if (inputStream != null) {
            try {
                boundedString = HttpResponseBytesKt.readBoundedString(inputStream, 50331648L, contentLengthOrUnknown());
                inputStream.close();
            } finally {
            }
        }
        return boundedString;
    }

    public final InputStream getBody() {
        return this.body;
    }

    public final Throwable getCause() {
        return this.cause;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuraHttpResponse(int i, Map<String, String> map, InputStream inputStream, String str, boolean z, String str2, Throwable th) {
        AnonymousClass002.A1D(map, 1, str2);
        this.code = i;
        this.body = inputStream;
        this.errorMessage = str;
        this.isSuccessful = z;
        this.message = str2;
        this.cause = th;
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        C7384Etj.A0V(comparator);
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        this.headers = treeMap;
    }
}
