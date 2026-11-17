package com.facebook.aura.pairs;

import X.AnonymousClass007;

/* loaded from: classes3.dex */
public final class SharedGoalException extends RuntimeException {
    public static final int $stable = 8;
    public final Integer httpCode;

    public SharedGoalException(Integer num) {
        super(AnonymousClass007.A0a("shared goal ", num));
        this.httpCode = num;
    }

    public final Integer getHttpCode() {
        return this.httpCode;
    }
}
