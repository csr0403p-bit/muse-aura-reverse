package com.facebook.aura.gateway;

import X.AnonymousClass003;

/* loaded from: classes5.dex */
public final class DeferredBadGatewayDiagnostics {
    public final long epoch;
    public final String errorMessage;
    public final String errorType;

    public final long getEpoch() {
        return this.epoch;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getErrorType() {
        return this.errorType;
    }

    public DeferredBadGatewayDiagnostics(long j, String str, String str2) {
        AnonymousClass003.A0x(str, str2);
        this.epoch = j;
        this.errorType = str;
        this.errorMessage = str2;
    }
}
