package com.facebook.aura.analytics.hatch.caa;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.gateway.JarvisProtocolKt;

/* loaded from: classes2.dex */
public final class HatchCaaFailure extends C06G {
    public static final Companion Companion = new Companion();
    public static final int MAXIMUM_MESSAGE_LENGTH = 200;
    public final HatchCaaAccountErrorType accountErrorType;
    public final Integer exceptionCode;
    public final String exceptionMessage;
    public final String exceptionType;

    public final class Companion {
        public static /* synthetic */ HatchCaaFailure clientSide$default(Companion companion, String str, String str2, HatchCaaAccountErrorType hatchCaaAccountErrorType, int i, Object obj) {
            if ((i & 4) != 0) {
                hatchCaaAccountErrorType = HatchCaaAccountErrorType.SYSTEM_ERROR;
            }
            return companion.clientSide(str, str2, hatchCaaAccountErrorType);
        }

        public final HatchCaaFailure clientSide(String str, String str2, HatchCaaAccountErrorType hatchCaaAccountErrorType) {
            AnonymousClass005.A0x(str, str2, hatchCaaAccountErrorType);
            return new HatchCaaFailure(str, null, FGI.A0U(str2, " | ", str), hatchCaaAccountErrorType);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchCaaFailure(String str, Integer num, String str2, HatchCaaAccountErrorType hatchCaaAccountErrorType) {
        C7384Etj.A0Y(hatchCaaAccountErrorType, 3);
        this.exceptionType = str;
        this.exceptionCode = num;
        this.exceptionMessage = str2;
        this.accountErrorType = hatchCaaAccountErrorType;
    }

    public final HatchCaaFailure copy(String str, Integer num, String str2, HatchCaaAccountErrorType hatchCaaAccountErrorType) {
        C7384Etj.A0Y(hatchCaaAccountErrorType, 3);
        return new HatchCaaFailure(str, num, str2, hatchCaaAccountErrorType);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCaaFailure) {
                HatchCaaFailure hatchCaaFailure = (HatchCaaFailure) obj;
                if (!C7384Etj.areEqual(this.exceptionType, hatchCaaFailure.exceptionType) || !C7384Etj.areEqual(this.exceptionCode, hatchCaaFailure.exceptionCode) || !C7384Etj.areEqual(this.exceptionMessage, hatchCaaFailure.exceptionMessage) || this.accountErrorType != hatchCaaFailure.accountErrorType) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCaaFailure copy$default(HatchCaaFailure hatchCaaFailure, String str, Integer num, String str2, HatchCaaAccountErrorType hatchCaaAccountErrorType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCaaFailure.exceptionType;
        }
        if ((i & 2) != 0) {
            num = hatchCaaFailure.exceptionCode;
        }
        if ((i & 4) != 0) {
            str2 = hatchCaaFailure.exceptionMessage;
        }
        if ((i & 8) != 0) {
            hatchCaaAccountErrorType = hatchCaaFailure.accountErrorType;
        }
        C7384Etj.A0Y(hatchCaaAccountErrorType, 3);
        return new HatchCaaFailure(str, num, str2, hatchCaaAccountErrorType);
    }

    public final String component1() {
        return this.exceptionType;
    }

    public final Integer component2() {
        return this.exceptionCode;
    }

    public final String component3() {
        return this.exceptionMessage;
    }

    public final HatchCaaAccountErrorType component4() {
        return this.accountErrorType;
    }

    public final String describe() {
        String str = this.exceptionType;
        String str2 = JarvisProtocolKt.NONE_LOG_VALUE;
        if (str == null) {
            str = JarvisProtocolKt.NONE_LOG_VALUE;
        }
        Integer num = this.exceptionCode;
        String strValueOf = num != null ? String.valueOf(num.intValue()) : JarvisProtocolKt.NONE_LOG_VALUE;
        String value = this.accountErrorType.getValue();
        String str3 = this.exceptionMessage;
        if (str3 != null) {
            str2 = str3;
        }
        return FGI.A0l("type=", str, " code=", strValueOf, " error_type=", value, " message=", str2);
    }

    public final HatchCaaAccountErrorType getAccountErrorType() {
        return this.accountErrorType;
    }

    public final Integer getExceptionCode() {
        return this.exceptionCode;
    }

    public final String getExceptionMessage() {
        return this.exceptionMessage;
    }

    public final String getExceptionType() {
        return this.exceptionType;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.accountErrorType, ((((AnonymousClass006.A0G(this.exceptionType) * 31) + AnonymousClass006.A0D(this.exceptionCode)) * 31) + AnonymousClass005.A0H(this.exceptionMessage)) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
