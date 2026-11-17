package com.google.android.gms.common.api;

import X.C60O;
import X.C60P;

/* loaded from: classes5.dex */
public class ApiException extends Exception {

    @Deprecated
    public final Status mStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    public ApiException(Status status) {
        int i = status.A00;
        String str = status.A03;
        str = str == null ? "" : str;
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(i);
        super(C60P.A1M(": ", str, sbA0w));
        this.mStatus = status;
    }
}
