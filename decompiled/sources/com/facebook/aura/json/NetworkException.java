package com.facebook.aura.json;

import X.C06H;
import X.C7384Etj;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes4.dex */
public class NetworkException extends RuntimeException {
    public final JsonElement errorBody;
    public final String errorCode;
    public final int httpResponseCode;
    public final Boolean serverRetryable;
    public final String transportFailureKind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkException(String str, int i, String str2, Throwable th, Boolean bool, JsonElement jsonElement, String str3) {
        super(str, th);
        C7384Etj.A0Y(str, 0);
        this.httpResponseCode = i;
        this.errorCode = str2;
        this.serverRetryable = bool;
        this.errorBody = jsonElement;
        this.transportFailureKind = str3;
    }

    public final JsonElement getErrorBody() {
        return this.errorBody;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final int getHttpResponseCode() {
        return this.httpResponseCode;
    }

    public final Boolean getServerRetryable() {
        return this.serverRetryable;
    }

    public final String getTransportFailureKind() {
        return this.transportFailureKind;
    }

    public /* synthetic */ NetworkException(String str, int i, String str2, Throwable th, Boolean bool, JsonElement jsonElement, String str3, int i2, C06H c06h) {
        this(str, i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : th, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : jsonElement, (i2 & 64) != 0 ? null : str3);
    }
}
