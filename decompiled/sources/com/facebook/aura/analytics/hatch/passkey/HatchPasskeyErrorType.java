package com.facebook.aura.analytics.hatch.passkey;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.analytics.hatch.caa.HatchCaaErrorType;
import com.facebook.aura.messenger.skills.read.model.PinErrorKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchPasskeyErrorType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchPasskeyErrorType[] $VALUES;
    public static final HatchPasskeyErrorType ACCOUNT_SELECTION_REQUIRED;
    public static final HatchPasskeyErrorType ASSERTION_FAILED;
    public static final HatchPasskeyErrorType CHECKPOINT_REQUIRED;
    public static final HatchPasskeyErrorType FLOW_BUSY;
    public static final HatchPasskeyErrorType HOST_UNAVAILABLE;
    public static final HatchPasskeyErrorType INTERRUPTED_OPERATION;
    public static final HatchPasskeyErrorType INVALID_DOMAIN;
    public static final HatchPasskeyErrorType LOGIN_OPTIONS_FAILED;
    public static final HatchPasskeyErrorType MALFORMED_REQUEST;
    public static final HatchPasskeyErrorType PROVIDER_CONFIGURATION_FAILURE;
    public static final HatchPasskeyErrorType REACTIVATION_REQUIRED;
    public static final HatchPasskeyErrorType SCREEN_LEFT;
    public static final HatchPasskeyErrorType SERVER_FAILURE;
    public static final HatchPasskeyErrorType TEMP_TOKEN_UNAVAILABLE;
    public static final HatchPasskeyErrorType TIMED_OUT;
    public static final HatchPasskeyErrorType TWO_FACTOR_REQUIRED;
    public static final HatchPasskeyErrorType UNSUPPORTED_PLATFORM;
    public static final HatchPasskeyErrorType UNUSABLE_REQUEST_OPTIONS;
    public static final HatchPasskeyErrorType USER_CANCELED;
    public final String value;

    static {
        HatchPasskeyErrorType hatchPasskeyErrorType = new HatchPasskeyErrorType("TEMP_TOKEN_UNAVAILABLE", 0, HatchCaaErrorType.TEMP_TOKEN_UNAVAILABLE);
        TEMP_TOKEN_UNAVAILABLE = hatchPasskeyErrorType;
        HatchPasskeyErrorType hatchPasskeyErrorType2 = new HatchPasskeyErrorType("TIMED_OUT", 1, "timed_out");
        TIMED_OUT = hatchPasskeyErrorType2;
        HatchPasskeyErrorType hatchPasskeyErrorType3 = new HatchPasskeyErrorType("LOGIN_OPTIONS_FAILED", 2, "login_options_failed");
        LOGIN_OPTIONS_FAILED = hatchPasskeyErrorType3;
        HatchPasskeyErrorType hatchPasskeyErrorType4 = new HatchPasskeyErrorType("UNUSABLE_REQUEST_OPTIONS", 3, "unusable_request_options");
        UNUSABLE_REQUEST_OPTIONS = hatchPasskeyErrorType4;
        HatchPasskeyErrorType hatchPasskeyErrorType5 = new HatchPasskeyErrorType("FLOW_BUSY", 4, "flow_busy");
        FLOW_BUSY = hatchPasskeyErrorType5;
        HatchPasskeyErrorType hatchPasskeyErrorType6 = new HatchPasskeyErrorType("HOST_UNAVAILABLE", 5, "host_unavailable");
        HOST_UNAVAILABLE = hatchPasskeyErrorType6;
        HatchPasskeyErrorType hatchPasskeyErrorType7 = new HatchPasskeyErrorType("SCREEN_LEFT", 6, "screen_left");
        SCREEN_LEFT = hatchPasskeyErrorType7;
        HatchPasskeyErrorType hatchPasskeyErrorType8 = new HatchPasskeyErrorType("USER_CANCELED", 7, "user_canceled");
        USER_CANCELED = hatchPasskeyErrorType8;
        HatchPasskeyErrorType hatchPasskeyErrorType9 = new HatchPasskeyErrorType("INVALID_DOMAIN", 8, "invalid_domain");
        INVALID_DOMAIN = hatchPasskeyErrorType9;
        HatchPasskeyErrorType hatchPasskeyErrorType10 = new HatchPasskeyErrorType("ASSERTION_FAILED", 9, "assertion_failed");
        ASSERTION_FAILED = hatchPasskeyErrorType10;
        HatchPasskeyErrorType hatchPasskeyErrorType11 = new HatchPasskeyErrorType("MALFORMED_REQUEST", 10, "malformed_request");
        MALFORMED_REQUEST = hatchPasskeyErrorType11;
        HatchPasskeyErrorType hatchPasskeyErrorType12 = new HatchPasskeyErrorType("UNSUPPORTED_PLATFORM", 11, "unsupported_platform");
        UNSUPPORTED_PLATFORM = hatchPasskeyErrorType12;
        HatchPasskeyErrorType hatchPasskeyErrorType13 = new HatchPasskeyErrorType("INTERRUPTED_OPERATION", 12, "interrupted_operation");
        INTERRUPTED_OPERATION = hatchPasskeyErrorType13;
        HatchPasskeyErrorType hatchPasskeyErrorType14 = new HatchPasskeyErrorType("PROVIDER_CONFIGURATION_FAILURE", 13, "provider_configuration_failure");
        PROVIDER_CONFIGURATION_FAILURE = hatchPasskeyErrorType14;
        HatchPasskeyErrorType hatchPasskeyErrorType15 = new HatchPasskeyErrorType("SERVER_FAILURE", 14, "server_failure");
        SERVER_FAILURE = hatchPasskeyErrorType15;
        HatchPasskeyErrorType hatchPasskeyErrorType16 = new HatchPasskeyErrorType("ACCOUNT_SELECTION_REQUIRED", 15, "account_selection_required");
        ACCOUNT_SELECTION_REQUIRED = hatchPasskeyErrorType16;
        HatchPasskeyErrorType hatchPasskeyErrorType17 = new HatchPasskeyErrorType("TWO_FACTOR_REQUIRED", 16, PinErrorKt.ERROR_CODE_TWO_FACTOR_REQUIRED);
        TWO_FACTOR_REQUIRED = hatchPasskeyErrorType17;
        HatchPasskeyErrorType hatchPasskeyErrorType18 = new HatchPasskeyErrorType("CHECKPOINT_REQUIRED", 17, "checkpoint_required");
        CHECKPOINT_REQUIRED = hatchPasskeyErrorType18;
        HatchPasskeyErrorType hatchPasskeyErrorType19 = new HatchPasskeyErrorType("REACTIVATION_REQUIRED", 18, HatchCaaErrorType.REACTIVATION_REQUIRED);
        REACTIVATION_REQUIRED = hatchPasskeyErrorType19;
        HatchPasskeyErrorType[] hatchPasskeyErrorTypeArr = {hatchPasskeyErrorType, hatchPasskeyErrorType2, hatchPasskeyErrorType3, hatchPasskeyErrorType4, hatchPasskeyErrorType5, hatchPasskeyErrorType6, hatchPasskeyErrorType7, hatchPasskeyErrorType8, hatchPasskeyErrorType9, hatchPasskeyErrorType10, hatchPasskeyErrorType11, hatchPasskeyErrorType12, hatchPasskeyErrorType13, hatchPasskeyErrorType14, hatchPasskeyErrorType15, hatchPasskeyErrorType16, hatchPasskeyErrorType17, hatchPasskeyErrorType18, hatchPasskeyErrorType19};
        $VALUES = hatchPasskeyErrorTypeArr;
        $ENTRIES = C3cG.A0w(hatchPasskeyErrorTypeArr);
    }

    public static Ey9<HatchPasskeyErrorType> getEntries() {
        return $ENTRIES;
    }

    public static HatchPasskeyErrorType valueOf(String str) {
        return (HatchPasskeyErrorType) Enum.valueOf(HatchPasskeyErrorType.class, str);
    }

    public static HatchPasskeyErrorType[] values() {
        return (HatchPasskeyErrorType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchPasskeyErrorType(String str, int i, String str2) {
        this.value = str2;
    }
}
