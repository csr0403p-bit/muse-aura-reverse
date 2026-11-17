package com.facebook.aura.login.api;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class LoginMethod {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LoginMethod[] $VALUES;
    public static final LoginMethod ONE_TAP;
    public static final LoginMethod OTHER;
    public static final LoginMethod OTP;
    public static final LoginMethod PASSKEY;
    public static final LoginMethod PASSWORD;
    public static final LoginMethod SSO;
    public static final LoginMethod TWO_FACTOR;

    static {
        LoginMethod loginMethod = new LoginMethod("PASSKEY", 0);
        PASSKEY = loginMethod;
        LoginMethod loginMethod2 = new LoginMethod("PASSWORD", 1);
        PASSWORD = loginMethod2;
        LoginMethod loginMethod3 = new LoginMethod("OTP", 2);
        OTP = loginMethod3;
        LoginMethod loginMethod4 = new LoginMethod("SSO", 3);
        SSO = loginMethod4;
        LoginMethod loginMethod5 = new LoginMethod("TWO_FACTOR", 4);
        TWO_FACTOR = loginMethod5;
        LoginMethod loginMethod6 = new LoginMethod("ONE_TAP", 5);
        ONE_TAP = loginMethod6;
        LoginMethod loginMethod7 = new LoginMethod("OTHER", 6);
        OTHER = loginMethod7;
        LoginMethod[] loginMethodArr = {loginMethod, loginMethod2, loginMethod3, loginMethod4, loginMethod5, loginMethod6, loginMethod7};
        $VALUES = loginMethodArr;
        $ENTRIES = C3cG.A0w(loginMethodArr);
    }

    public static Ey9<LoginMethod> getEntries() {
        return $ENTRIES;
    }

    public static LoginMethod valueOf(String str) {
        return (LoginMethod) Enum.valueOf(LoginMethod.class, str);
    }

    public static LoginMethod[] values() {
        return (LoginMethod[]) $VALUES.clone();
    }

    public LoginMethod(String str, int i) {
    }
}
