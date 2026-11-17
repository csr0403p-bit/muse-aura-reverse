package com.facebook.aura.network.transport.cache;

import X.AnonymousClass005;
import X.C7384Etj;
import com.facebook.aura.network.transport.HatchHttpCacheStatus;
import com.facebook.aura.network.transport.HatchHttpResponse;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchHttpCachedResponse {
    public final long accessedAtMs;
    public final byte[] body;
    public final int code;
    public final Map<String, String> headers;
    public final String message;
    public final long savedAtMs;

    public HatchHttpCachedResponse(int i, String str, Map<String, String> map, byte[] bArr, long j, long j2) {
        AnonymousClass005.A11(str, map, bArr, 1);
        this.code = i;
        this.message = str;
        this.headers = map;
        this.body = bArr;
        this.savedAtMs = j;
        this.accessedAtMs = j2;
    }

    public final HatchHttpResponse toResponse(HatchHttpCacheStatus hatchHttpCacheStatus) {
        C7384Etj.A0Y(hatchHttpCacheStatus, 0);
        HatchHttpResponse.Companion companion = HatchHttpResponse.Companion;
        int i = this.code;
        String str = this.message;
        Map<String, String> map = this.headers;
        byte[] bArr = this.body;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        C7384Etj.A0U(bArrCopyOf);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrCopyOf);
        int i2 = this.code;
        boolean z = false;
        if (200 <= i2 && i2 < 300) {
            z = true;
        }
        return companion.of(i, str, map, byteArrayInputStream, null, z, hatchHttpCacheStatus, null);
    }

    public final long getAccessedAtMs() {
        return this.accessedAtMs;
    }

    public final byte[] getBody() {
        return this.body;
    }

    public final int getCode() {
        return this.code;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getMessage() {
        return this.message;
    }

    public final long getSavedAtMs() {
        return this.savedAtMs;
    }

    public final HatchHttpCachedResponse withAccessedAt(long j) {
        return new HatchHttpCachedResponse(this.code, this.message, this.headers, this.body, this.savedAtMs, j);
    }

    public final HatchHttpCachedResponse withSanitizedHeaders() {
        int i = this.code;
        String str = this.message;
        Map<String, String> mapSanitizedForCacheStorage = CachingHatchHttpClientKt.sanitizedForCacheStorage(this.headers);
        byte[] bArr = this.body;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        C7384Etj.A0U(bArrCopyOf);
        return new HatchHttpCachedResponse(i, str, mapSanitizedForCacheStorage, bArrCopyOf, this.savedAtMs, this.accessedAtMs);
    }
}
