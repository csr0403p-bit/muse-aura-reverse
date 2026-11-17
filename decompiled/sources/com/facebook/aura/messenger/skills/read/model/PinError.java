package com.facebook.aura.messenger.skills.read.model;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class PinError extends C06G {
    public final Integer attemptsRemaining;
    public final String errorCode;
    public final Integer loginTimeoutRemainingSecs;
    public final String message;

    public final PinError copy(String str, String str2, Integer num, Integer num2) {
        C7384Etj.A0Y(str, 0);
        return new PinError(str, str2, num, num2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PinError) {
                PinError pinError = (PinError) obj;
                if (!C7384Etj.areEqual(this.message, pinError.message) || !C7384Etj.areEqual(this.errorCode, pinError.errorCode) || !C7384Etj.areEqual(this.loginTimeoutRemainingSecs, pinError.loginTimeoutRemainingSecs) || !C7384Etj.areEqual(this.attemptsRemaining, pinError.attemptsRemaining)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PinError copy$default(PinError pinError, String str, String str2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pinError.message;
        }
        if ((i & 2) != 0) {
            str2 = pinError.errorCode;
        }
        if ((i & 4) != 0) {
            num = pinError.loginTimeoutRemainingSecs;
        }
        if ((i & 8) != 0) {
            num2 = pinError.attemptsRemaining;
        }
        C7384Etj.A0Y(str, 0);
        return new PinError(str, str2, num, num2);
    }

    public final String component1() {
        return this.message;
    }

    public final String component2() {
        return this.errorCode;
    }

    public final Integer component3() {
        return this.loginTimeoutRemainingSecs;
    }

    public final Integer component4() {
        return this.attemptsRemaining;
    }

    public final Integer getAttemptsRemaining() {
        return this.attemptsRemaining;
    }

    public final boolean getBypassesLocalFailedAttemptCount() {
        return PinErrorKt.ERROR_CODE_TWO_FACTOR_REQUIRED.equals(this.errorCode);
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final Integer getLoginTimeoutRemainingSecs() {
        return this.loginTimeoutRemainingSecs;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return ((((AnonymousClass001.A0G(this.message) + AnonymousClass006.A0G(this.errorCode)) * 31) + AnonymousClass006.A0D(this.loginTimeoutRemainingSecs)) * 31) + C3cH.A02(this.attemptsRemaining);
    }

    public /* synthetic */ PinError(String str, String str2, Integer num, Integer num2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2);
    }

    public String toString() {
        return super.toString();
    }

    public PinError(String str, String str2, Integer num, Integer num2) {
        C7384Etj.A0Y(str, 0);
        this.message = str;
        this.errorCode = str2;
        this.loginTimeoutRemainingSecs = num;
        this.attemptsRemaining = num2;
    }

    public PinError() {
        this("", null, null, null);
    }
}
