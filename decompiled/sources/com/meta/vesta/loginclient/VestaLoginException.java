package com.meta.vesta.loginclient;

/* loaded from: classes6.dex */
public final class VestaLoginException extends Exception {
    public final Integer attemptsRemaining;
    public final boolean isVestaServerError;
    public final Integer loginTimeoutRemainingSecs;
    public final Integer vestaErrorCode;

    public VestaLoginException(Integer num, Integer num2, Integer num3, String str, boolean z) {
        super(str);
        this.vestaErrorCode = num;
        this.attemptsRemaining = num2;
        this.loginTimeoutRemainingSecs = num3;
        this.isVestaServerError = z;
    }
}
