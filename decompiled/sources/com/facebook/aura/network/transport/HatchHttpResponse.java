package com.facebook.aura.network.transport;

import X.C06H;
import X.C7384Etj;
import X.C9tI;
import com.facebook.aura.network.api.HttpResponseBytesKt;
import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class HatchHttpResponse {
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final Companion Companion = new Companion();
    public static final long UNKNOWN_CONTENT_LENGTH = -1;
    public final InputStream bodyStream;
    public final HatchHttpCacheStatus cacheStatus;
    public final Throwable cause;
    public final String errorMessage;
    public final Map<String, String> headers;
    public final boolean isSuccessful;
    public final int statusCode;
    public final String statusMessage;

    public final class Companion {
        public final HatchHttpResponse of(int i, String str, Map<String, String> map, InputStream inputStream, String str2, boolean z, HatchHttpCacheStatus hatchHttpCacheStatus, Throwable th) {
            C7384Etj.A0Y(str, 1);
            C7384Etj.A0Y(map, 2);
            C7384Etj.A0Y(hatchHttpCacheStatus, 6);
            return new HatchHttpResponse(i, str, map, inputStream, str2, z, hatchHttpCacheStatus, th);
        }

        public static /* synthetic */ HatchHttpResponse of$default(Companion companion, int i, String str, Map map, InputStream inputStream, String str2, boolean z, HatchHttpCacheStatus hatchHttpCacheStatus, Throwable th, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                str = "";
            }
            if ((i2 & 64) != 0) {
                hatchHttpCacheStatus = HatchHttpCacheStatus.NETWORK;
            }
            if ((i2 & 128) != 0) {
                th = null;
            }
            return companion.of(i, str, map, inputStream, str2, z, hatchHttpCacheStatus, th);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchHttpResponse(int i, String str, Map<String, String> map, InputStream inputStream, String str2, boolean z, HatchHttpCacheStatus hatchHttpCacheStatus, Throwable th) {
        C7384Etj.A0Y(str, 1);
        C7384Etj.A0Y(map, 2);
        C7384Etj.A0Y(hatchHttpCacheStatus, 6);
        this.statusCode = i;
        this.statusMessage = str;
        this.bodyStream = inputStream;
        this.errorMessage = str2;
        this.isSuccessful = z;
        this.cacheStatus = hatchHttpCacheStatus;
        this.cause = th;
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        C7384Etj.A0V(comparator);
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        this.headers = treeMap;
    }

    public final String header(String str) {
        C7384Etj.A0Y(str, 0);
        return this.headers.get(str);
    }

    private final long contentLengthOrUnknown() {
        String strHeader;
        Long lA0s;
        int i = this.statusCode;
        if (i == 204 || i == 304 || (strHeader = header("Content-Length")) == null || (lA0s = C9tI.A0s(strHeader)) == null) {
            return -1L;
        }
        return lA0s.longValue();
    }

    public final HatchHttpResponseBody body() {
        InputStream inputStream = this.bodyStream;
        if (inputStream != null) {
            return new HatchHttpResponseBody(inputStream, contentLengthOrUnknown());
        }
        return null;
    }

    public final byte[] bodyBytes() {
        InputStream inputStream = this.bodyStream;
        if (inputStream != null) {
            return HttpResponseBytesKt.readBoundedBytes(inputStream, 50331648L, contentLengthOrUnknown());
        }
        return null;
    }

    public final String bodyString() throws IOException {
        InputStream inputStream = this.bodyStream;
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

    public final InputStream boundedBodyStream() {
        InputStream inputStream = this.bodyStream;
        if (inputStream != null) {
            return HttpResponseBytesKt.withByteLimit(inputStream, 50331648L, contentLengthOrUnknown());
        }
        return null;
    }

    public final int code() {
        return this.statusCode;
    }

    public final HatchHttpCacheStatus getCacheStatus() {
        return this.cacheStatus;
    }

    public final Throwable getCause() {
        return this.cause;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final String message() {
        return this.statusMessage;
    }

    public /* synthetic */ HatchHttpResponse(int i, String str, Map map, InputStream inputStream, String str2, boolean z, HatchHttpCacheStatus hatchHttpCacheStatus, Throwable th, int i2, C06H c06h) {
        this(i, str, map, inputStream, str2, z, (i2 & 64) != 0 ? HatchHttpCacheStatus.NETWORK : hatchHttpCacheStatus, (i2 & 128) != 0 ? null : th);
    }
}
