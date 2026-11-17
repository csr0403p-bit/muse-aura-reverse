package com.facebook.payments.dcp.xapp.model;

import X.GPM;

/* loaded from: classes6.dex */
public final class IapSdkException extends RuntimeException {
    public final GPM reason;

    public IapSdkException(GPM gpm, String str) {
        super(str);
        this.reason = gpm;
    }
}
