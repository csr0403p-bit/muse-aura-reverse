package com.facebook.aura.confidentialvm.repository;

import X.C06H;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class ConfidentialVmPinVerifierCryptoException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmPinVerifierCryptoException(String str, Throwable th) {
        super(str, th);
        C7384Etj.A0Y(str, 0);
    }

    public /* synthetic */ ConfidentialVmPinVerifierCryptoException(String str, Throwable th, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
