package com.facebook.aura.email.model;

import X.C06H;

/* loaded from: classes.dex */
public final class EmailOwnerVerificationException extends Exception {
    public final Integer attemptsRemaining;
    public final String code;

    public EmailOwnerVerificationException(String str, Integer num) {
        super("Email owner verification failed");
        this.code = str;
        this.attemptsRemaining = num;
    }

    public final Integer getAttemptsRemaining() {
        return this.attemptsRemaining;
    }

    public final String getCode() {
        return this.code;
    }

    public /* synthetic */ EmailOwnerVerificationException(String str, Integer num, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : num);
    }
}
