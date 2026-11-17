package com.facebook.aura.skills.connect.config;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CustomConnectorApiKeyValidationError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CustomConnectorApiKeyValidationError[] $VALUES;
    public static final CustomConnectorApiKeyValidationError EMPTY_KEY;
    public static final CustomConnectorApiKeyValidationError HOSTS_COUNT_OUT_OF_RANGE;
    public static final CustomConnectorApiKeyValidationError INVALID_FIELD;
    public static final CustomConnectorApiKeyValidationError INVALID_HOST;
    public static final CustomConnectorApiKeyValidationError INVALID_NAME;
    public static final CustomConnectorApiKeyValidationError INVALID_PLACEMENT;
    public static final CustomConnectorApiKeyValidationError NOT_EXACTLY_ONE_TOKEN_PROXY;
    public static final CustomConnectorApiKeyValidationError SERVICE_NAME_MISMATCH;
    public static final CustomConnectorApiKeyValidationError WRONG_MODE;
    public static final CustomConnectorApiKeyValidationError WRONG_VERSION;

    static {
        CustomConnectorApiKeyValidationError customConnectorApiKeyValidationError = new CustomConnectorApiKeyValidationError("WRONG_VERSION", 0);
        WRONG_VERSION = customConnectorApiKeyValidationError;
        CustomConnectorApiKeyValidationError customConnectorApiKeyValidationError2 = new CustomConnectorApiKeyValidationError("WRONG_MODE", 1);
        WRONG_MODE = customConnectorApiKeyValidationError2;
        CustomConnectorApiKeyValidationError customConnectorApiKeyValidationError3 = new CustomConnectorApiKeyValidationError("INVALID_NAME", 2);
        INVALID_NAME = customConnectorApiKeyValidationError3;
        CustomConnectorApiKeyValidationError customConnectorApiKeyValidationError4 = new CustomConnectorApiKeyValidationError("HOSTS_COUNT_OUT_OF_RANGE", 3);
        HOSTS_COUNT_OUT_OF_RANGE = customConnectorApiKeyValidationError4;
        CustomConnectorApiKeyValidationError customConnectorApiKeyValidationError5 = new CustomConnectorApiKeyValidationError("INVALID_HOST", 4);
        INVALID_HOST = customConnectorApiKeyValidationError5;
        CustomConnectorApiKeyValidationError customConnectorApiKeyValidationError6 = new CustomConnectorApiKeyValidationError("NOT_EXACTLY_ONE_TOKEN_PROXY", 5);
        NOT_EXACTLY_ONE_TOKEN_PROXY = customConnectorApiKeyValidationError6;
        CustomConnectorApiKeyValidationError customConnectorApiKeyValidationError7 = new CustomConnectorApiKeyValidationError("INVALID_FIELD", 6);
        INVALID_FIELD = customConnectorApiKeyValidationError7;
        CustomConnectorApiKeyValidationError customConnectorApiKeyValidationError8 = new CustomConnectorApiKeyValidationError("INVALID_PLACEMENT", 7);
        INVALID_PLACEMENT = customConnectorApiKeyValidationError8;
        CustomConnectorApiKeyValidationError customConnectorApiKeyValidationError9 = new CustomConnectorApiKeyValidationError("EMPTY_KEY", 8);
        EMPTY_KEY = customConnectorApiKeyValidationError9;
        CustomConnectorApiKeyValidationError customConnectorApiKeyValidationError10 = new CustomConnectorApiKeyValidationError("SERVICE_NAME_MISMATCH", 9);
        SERVICE_NAME_MISMATCH = customConnectorApiKeyValidationError10;
        CustomConnectorApiKeyValidationError[] customConnectorApiKeyValidationErrorArr = {customConnectorApiKeyValidationError, customConnectorApiKeyValidationError2, customConnectorApiKeyValidationError3, customConnectorApiKeyValidationError4, customConnectorApiKeyValidationError5, customConnectorApiKeyValidationError6, customConnectorApiKeyValidationError7, customConnectorApiKeyValidationError8, customConnectorApiKeyValidationError9, customConnectorApiKeyValidationError10};
        $VALUES = customConnectorApiKeyValidationErrorArr;
        $ENTRIES = C3cG.A0w(customConnectorApiKeyValidationErrorArr);
    }

    public static Ey9<CustomConnectorApiKeyValidationError> getEntries() {
        return $ENTRIES;
    }

    public static CustomConnectorApiKeyValidationError valueOf(String str) {
        return (CustomConnectorApiKeyValidationError) Enum.valueOf(CustomConnectorApiKeyValidationError.class, str);
    }

    public static CustomConnectorApiKeyValidationError[] values() {
        return (CustomConnectorApiKeyValidationError[]) $VALUES.clone();
    }

    public CustomConnectorApiKeyValidationError(String str, int i) {
    }
}
