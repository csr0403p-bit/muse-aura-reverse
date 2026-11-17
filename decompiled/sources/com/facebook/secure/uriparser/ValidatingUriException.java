package com.facebook.secure.uriparser;

import X.C6938Eco;

/* loaded from: classes5.dex */
public class ValidatingUriException extends Exception {
    public final C6938Eco mParsedUri;

    public ValidatingUriException(C6938Eco c6938Eco, String str) {
        super(str);
        this.mParsedUri = c6938Eco;
    }

    public ValidatingUriException(C6938Eco c6938Eco, String str, Throwable th) {
        super(str, th);
        this.mParsedUri = c6938Eco;
    }
}
