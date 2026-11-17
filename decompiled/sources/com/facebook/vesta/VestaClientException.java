package com.facebook.vesta;

import X.EnumC10335Gup;

/* loaded from: classes6.dex */
public final class VestaClientException extends Exception {
    public static final long serialVersionUID = 1;
    public final EnumC10335Gup error;

    public VestaClientException(int i) {
        this.error = (i < 1 || i >= 20) ? EnumC10335Gup.UNKNOWN_ERROR_CODE : EnumC10335Gup.values()[i];
    }
}
