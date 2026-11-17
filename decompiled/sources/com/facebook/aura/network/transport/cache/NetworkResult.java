package com.facebook.aura.network.transport.cache;

import X.AnonymousClass003;
import X.C7384Etj;
import com.facebook.aura.network.transport.HatchHttpCacheStatus;
import com.facebook.aura.network.transport.HatchHttpResponse;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class NetworkResult {
    public final byte[] body;
    public final Throwable cause;
    public final int code;
    public final String errorMessage;
    public final Map<String, String> headers;
    public final boolean isSuccessful;
    public final String message;

    public final HatchHttpResponse toResponse(HatchHttpCacheStatus hatchHttpCacheStatus) {
        ByteArrayInputStream byteArrayInputStream;
        C7384Etj.A0Y(hatchHttpCacheStatus, 0);
        HatchHttpResponse.Companion companion = HatchHttpResponse.Companion;
        int i = this.code;
        String str = this.message;
        Map<String, String> map = this.headers;
        byte[] bArr = this.body;
        if (bArr != null) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            C7384Etj.A0U(bArrCopyOf);
            byteArrayInputStream = new ByteArrayInputStream(bArrCopyOf);
        } else {
            byteArrayInputStream = null;
        }
        return companion.of(i, str, map, byteArrayInputStream, this.errorMessage, this.isSuccessful, hatchHttpCacheStatus, this.cause);
    }

    public final byte[] getBody() {
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

    public NetworkResult(int i, String str, Map<String, String> map, byte[] bArr, String str2, boolean z, Throwable th) {
        AnonymousClass003.A0x(str, map);
        this.code = i;
        this.message = str;
        this.headers = map;
        this.body = bArr;
        this.errorMessage = str2;
        this.isSuccessful = z;
        this.cause = th;
    }
}
