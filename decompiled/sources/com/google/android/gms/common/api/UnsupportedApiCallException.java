package com.google.android.gms.common.api;

import X.BV7;
import com.google.android.gms.common.Feature;

/* loaded from: classes5.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    public final Feature zza;

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(BV7.A0w(this.zza));
    }

    public UnsupportedApiCallException(Feature feature) {
        this.zza = feature;
    }
}
