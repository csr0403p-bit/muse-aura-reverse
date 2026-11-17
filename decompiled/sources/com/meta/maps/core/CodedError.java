package com.meta.maps.core;

import X.C7384Etj;

/* loaded from: classes6.dex */
public final class CodedError {
    public final int code;
    public final String message;

    public CodedError(int i, String str) {
        C7384Etj.A0Y(str, 1);
        this.code = i;
        this.message = str;
    }

    public final native boolean isCancelled();

    public final native boolean isClientError();

    public final native boolean isNetworkError();

    public final native boolean isServerError();

    public final native boolean isSuccess();
}
