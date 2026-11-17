package com.facebook.aura.productactions.impl;

import com.facebook.aura.json.NetworkException;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class ProductSaveActionKt {
    public static final int SAVED_STATE_READ_ATTEMPTS = 3;
    public static final long SAVED_STATE_RETRY_DELAY_MS = 1000;

    public static final boolean isTransient(Throwable th) {
        NetworkException networkException = th instanceof NetworkException ? (NetworkException) th : null;
        if (networkException == null) {
            return false;
        }
        Boolean bool = networkException.serverRetryable;
        if (bool != null) {
            return bool.booleanValue();
        }
        int i = networkException.httpResponseCode;
        if (i < 0) {
            return networkException.getCause() instanceof IOException;
        }
        if (i == 408 || i == 429) {
            return true;
        }
        return 500 <= i && i < 600;
    }
}
