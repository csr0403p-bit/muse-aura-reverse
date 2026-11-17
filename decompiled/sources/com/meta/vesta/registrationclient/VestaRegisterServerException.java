package com.meta.vesta.registrationclient;

/* loaded from: classes6.dex */
public final class VestaRegisterServerException extends Exception {
    public final Integer vestaErrorCode;

    public VestaRegisterServerException() {
        super("Missing fields in init and begin response");
        this.vestaErrorCode = null;
    }
}
