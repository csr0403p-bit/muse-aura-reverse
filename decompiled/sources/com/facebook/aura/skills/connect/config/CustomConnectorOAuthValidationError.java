package com.facebook.aura.skills.connect.config;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CustomConnectorOAuthValidationError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CustomConnectorOAuthValidationError[] $VALUES;
    public static final CustomConnectorOAuthValidationError DOMAINS_EMPTY;
    public static final CustomConnectorOAuthValidationError EMPTY_CLIENT_ID;
    public static final CustomConnectorOAuthValidationError INVALID_AUTHORIZATION_URL;
    public static final CustomConnectorOAuthValidationError INVALID_AUTH_METHOD;
    public static final CustomConnectorOAuthValidationError INVALID_DOMAIN;
    public static final CustomConnectorOAuthValidationError INVALID_ISSUER_DOMAIN;
    public static final CustomConnectorOAuthValidationError INVALID_NAME;
    public static final CustomConnectorOAuthValidationError INVALID_REDIRECT_URI;
    public static final CustomConnectorOAuthValidationError INVALID_REVOKE_URL;
    public static final CustomConnectorOAuthValidationError INVALID_TOKEN_URL;
    public static final CustomConnectorOAuthValidationError MISSING_CLIENT_SECRET;
    public static final CustomConnectorOAuthValidationError WRONG_VERSION;

    static {
        CustomConnectorOAuthValidationError customConnectorOAuthValidationError = new CustomConnectorOAuthValidationError("WRONG_VERSION", 0);
        WRONG_VERSION = customConnectorOAuthValidationError;
        CustomConnectorOAuthValidationError customConnectorOAuthValidationError2 = new CustomConnectorOAuthValidationError("INVALID_NAME", 1);
        INVALID_NAME = customConnectorOAuthValidationError2;
        CustomConnectorOAuthValidationError customConnectorOAuthValidationError3 = new CustomConnectorOAuthValidationError("DOMAINS_EMPTY", 2);
        DOMAINS_EMPTY = customConnectorOAuthValidationError3;
        CustomConnectorOAuthValidationError customConnectorOAuthValidationError4 = new CustomConnectorOAuthValidationError("INVALID_DOMAIN", 3);
        INVALID_DOMAIN = customConnectorOAuthValidationError4;
        CustomConnectorOAuthValidationError customConnectorOAuthValidationError5 = new CustomConnectorOAuthValidationError("INVALID_ISSUER_DOMAIN", 4);
        INVALID_ISSUER_DOMAIN = customConnectorOAuthValidationError5;
        CustomConnectorOAuthValidationError customConnectorOAuthValidationError6 = new CustomConnectorOAuthValidationError("INVALID_AUTHORIZATION_URL", 5);
        INVALID_AUTHORIZATION_URL = customConnectorOAuthValidationError6;
        CustomConnectorOAuthValidationError customConnectorOAuthValidationError7 = new CustomConnectorOAuthValidationError("INVALID_TOKEN_URL", 6);
        INVALID_TOKEN_URL = customConnectorOAuthValidationError7;
        CustomConnectorOAuthValidationError customConnectorOAuthValidationError8 = new CustomConnectorOAuthValidationError("INVALID_REVOKE_URL", 7);
        INVALID_REVOKE_URL = customConnectorOAuthValidationError8;
        CustomConnectorOAuthValidationError customConnectorOAuthValidationError9 = new CustomConnectorOAuthValidationError("INVALID_REDIRECT_URI", 8);
        INVALID_REDIRECT_URI = customConnectorOAuthValidationError9;
        CustomConnectorOAuthValidationError customConnectorOAuthValidationError10 = new CustomConnectorOAuthValidationError("INVALID_AUTH_METHOD", 9);
        INVALID_AUTH_METHOD = customConnectorOAuthValidationError10;
        CustomConnectorOAuthValidationError customConnectorOAuthValidationError11 = new CustomConnectorOAuthValidationError("EMPTY_CLIENT_ID", 10);
        EMPTY_CLIENT_ID = customConnectorOAuthValidationError11;
        CustomConnectorOAuthValidationError customConnectorOAuthValidationError12 = new CustomConnectorOAuthValidationError("MISSING_CLIENT_SECRET", 11);
        MISSING_CLIENT_SECRET = customConnectorOAuthValidationError12;
        CustomConnectorOAuthValidationError[] customConnectorOAuthValidationErrorArr = {customConnectorOAuthValidationError, customConnectorOAuthValidationError2, customConnectorOAuthValidationError3, customConnectorOAuthValidationError4, customConnectorOAuthValidationError5, customConnectorOAuthValidationError6, customConnectorOAuthValidationError7, customConnectorOAuthValidationError8, customConnectorOAuthValidationError9, customConnectorOAuthValidationError10, customConnectorOAuthValidationError11, customConnectorOAuthValidationError12};
        $VALUES = customConnectorOAuthValidationErrorArr;
        $ENTRIES = C3cG.A0w(customConnectorOAuthValidationErrorArr);
    }

    public static Ey9<CustomConnectorOAuthValidationError> getEntries() {
        return $ENTRIES;
    }

    public static CustomConnectorOAuthValidationError valueOf(String str) {
        return (CustomConnectorOAuthValidationError) Enum.valueOf(CustomConnectorOAuthValidationError.class, str);
    }

    public static CustomConnectorOAuthValidationError[] values() {
        return (CustomConnectorOAuthValidationError[]) $VALUES.clone();
    }

    public CustomConnectorOAuthValidationError(String str, int i) {
    }
}
