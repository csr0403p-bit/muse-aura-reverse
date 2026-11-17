package com.facebook.secure.uriparser;

import X.C6937Ecn;

/* loaded from: classes5.dex */
public class ValidatingUriAuthorityException extends Exception {
    public final C6937Ecn mAuthority;

    public ValidatingUriAuthorityException(C6937Ecn c6937Ecn, String str) {
        super(str);
        this.mAuthority = c6937Ecn;
    }

    public ValidatingUriAuthorityException(C6937Ecn c6937Ecn, String str, Throwable th) {
        super(str, th);
        this.mAuthority = c6937Ecn;
    }
}
