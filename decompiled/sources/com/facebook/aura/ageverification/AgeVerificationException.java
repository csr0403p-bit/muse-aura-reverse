package com.facebook.aura.ageverification;

import X.FGI;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;

/* loaded from: classes6.dex */
public final class AgeVerificationException extends Exception {
    public static final int $stable = 8;
    public final int httpResponseCode;
    public final String problemType;

    public AgeVerificationException(String str, int i) {
        super(FGI.A0W("Age verification request failed: HTTP ", InviteCodeScratcherKt.CODE_SEPARATOR, str == null ? "" : str, i));
        this.problemType = str;
        this.httpResponseCode = i;
    }

    public final int getHttpResponseCode() {
        return this.httpResponseCode;
    }

    public final String getProblemType() {
        return this.problemType;
    }
}
