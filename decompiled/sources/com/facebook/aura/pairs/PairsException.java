package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class PairsException extends RuntimeException {
    public static final int $stable = 8;
    public final PairsError error;
    public final String errorCode;
    public final Integer httpCode;
    public final boolean isRetryable;

    public final PairsError getError() {
        return this.error;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final Integer getHttpCode() {
        return this.httpCode;
    }

    public final boolean isRetryable() {
        return this.isRetryable;
    }

    public /* synthetic */ PairsException(PairsError pairsError, boolean z, Integer num, String str, int i, C06H c06h) {
        this(pairsError, AnonymousClass001.A1Q(i, z), (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsException(PairsError pairsError, boolean z, Integer num, String str) {
        super(pairsError.name());
        C7384Etj.A0Y(pairsError, 0);
        this.error = pairsError;
        this.isRetryable = z;
        this.httpCode = num;
        this.errorCode = str;
    }
}
