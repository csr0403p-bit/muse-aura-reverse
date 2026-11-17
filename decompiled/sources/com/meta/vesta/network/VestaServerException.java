package com.meta.vesta.network;

/* loaded from: classes6.dex */
public final class VestaServerException extends Exception {
    public final Integer attemptsRemaining;
    public final Integer backoffSeconds;
    public final Integer vestaErrorCode;

    public VestaServerException(Integer num, Integer num2, Integer num3, String str) {
        super(str);
        this.vestaErrorCode = num;
        this.attemptsRemaining = num2;
        this.backoffSeconds = num3;
    }
}
