package com.facebook.aura.commands.sms;

import X.AnonymousClass003;

/* loaded from: classes3.dex */
public final class SmsSendStepException extends Exception {
    public final Exception failure;
    public final SmsSendStep step;

    public final Exception getFailure() {
        return this.failure;
    }

    public final SmsSendStep getStep() {
        return this.step;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmsSendStepException(SmsSendStep smsSendStep, Exception exc) {
        super(exc);
        AnonymousClass003.A0u(smsSendStep, exc);
        this.step = smsSendStep;
        this.failure = exc;
    }
}
