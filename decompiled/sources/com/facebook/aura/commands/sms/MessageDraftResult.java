package com.facebook.aura.commands.sms;

import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class MessageDraftResult extends C06G {
    public final String errorCode;
    public final String exceptionKind;
    public final SmsSendStep failedStep;
    public final String message;
    public final boolean ok;

    public MessageDraftResult(boolean z, String str, String str2, String str3, SmsSendStep smsSendStep) {
        C7384Etj.A0Y(str, 1);
        this.ok = z;
        this.message = str;
        this.errorCode = str2;
        this.exceptionKind = str3;
        this.failedStep = smsSendStep;
    }

    public final MessageDraftResult copy(boolean z, String str, String str2, String str3, SmsSendStep smsSendStep) {
        C7384Etj.A0Y(str, 1);
        return new MessageDraftResult(z, str, str2, str3, smsSendStep);
    }

    public static /* synthetic */ MessageDraftResult copy$default(MessageDraftResult messageDraftResult, boolean z, String str, String str2, String str3, SmsSendStep smsSendStep, int i, Object obj) {
        if ((i & 1) != 0) {
            z = messageDraftResult.ok;
        }
        if ((i & 2) != 0) {
            str = messageDraftResult.message;
        }
        if ((i & 4) != 0) {
            str2 = messageDraftResult.errorCode;
        }
        if ((i & 8) != 0) {
            str3 = messageDraftResult.exceptionKind;
        }
        if ((i & 16) != 0) {
            smsSendStep = messageDraftResult.failedStep;
        }
        return messageDraftResult.copy(z, str, str2, str3, smsSendStep);
    }

    public final boolean component1() {
        return this.ok;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.errorCode;
    }

    public final String component4() {
        return this.exceptionKind;
    }

    public final SmsSendStep component5() {
        return this.failedStep;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getExceptionKind() {
        return this.exceptionKind;
    }

    public final SmsSendStep getFailedStep() {
        return this.failedStep;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MessageDraftResult(boolean z, String str, String str2, String str3, SmsSendStep smsSendStep, int i, C06H c06h) {
        this(z, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : smsSendStep);
    }
}
