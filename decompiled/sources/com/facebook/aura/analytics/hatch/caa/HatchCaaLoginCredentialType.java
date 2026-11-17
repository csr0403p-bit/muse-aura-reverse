package com.facebook.aura.analytics.hatch.caa;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.perf.HatchConnectorQplLogger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaLoginCredentialType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaLoginCredentialType[] $VALUES;
    public static final HatchCaaLoginCredentialType FACEBOOK_ACTIVE_SESSION;
    public static final HatchCaaLoginCredentialType FRL_ACTIVE_SESSION;
    public static final HatchCaaLoginCredentialType INSTAGRAM_ACTIVE_SESSION;
    public static final HatchCaaLoginCredentialType NONCE;
    public static final HatchCaaLoginCredentialType OPENID_CONNECT;
    public static final HatchCaaLoginCredentialType OTP;
    public static final HatchCaaLoginCredentialType PASSKEY;
    public static final HatchCaaLoginCredentialType PASSWORD;
    public static final HatchCaaLoginCredentialType WHATSAPP_AUTH_BUNDLE;
    public final String value;

    static {
        HatchCaaLoginCredentialType hatchCaaLoginCredentialType = new HatchCaaLoginCredentialType("OTP", 0, "otp");
        OTP = hatchCaaLoginCredentialType;
        HatchCaaLoginCredentialType hatchCaaLoginCredentialType2 = new HatchCaaLoginCredentialType("PASSWORD", 1, HatchConnectorQplLogger.AuthType.PASSWORD);
        PASSWORD = hatchCaaLoginCredentialType2;
        HatchCaaLoginCredentialType hatchCaaLoginCredentialType3 = new HatchCaaLoginCredentialType("PASSKEY", 2, "passkey");
        PASSKEY = hatchCaaLoginCredentialType3;
        HatchCaaLoginCredentialType hatchCaaLoginCredentialType4 = new HatchCaaLoginCredentialType("OPENID_CONNECT", 3, "openid_connect");
        OPENID_CONNECT = hatchCaaLoginCredentialType4;
        HatchCaaLoginCredentialType hatchCaaLoginCredentialType5 = new HatchCaaLoginCredentialType("FACEBOOK_ACTIVE_SESSION", 4, "facebook_active_session");
        FACEBOOK_ACTIVE_SESSION = hatchCaaLoginCredentialType5;
        HatchCaaLoginCredentialType hatchCaaLoginCredentialType6 = new HatchCaaLoginCredentialType("INSTAGRAM_ACTIVE_SESSION", 5, "instagram_active_session");
        INSTAGRAM_ACTIVE_SESSION = hatchCaaLoginCredentialType6;
        HatchCaaLoginCredentialType hatchCaaLoginCredentialType7 = new HatchCaaLoginCredentialType("FRL_ACTIVE_SESSION", 6, "frl_active_session");
        FRL_ACTIVE_SESSION = hatchCaaLoginCredentialType7;
        HatchCaaLoginCredentialType hatchCaaLoginCredentialType8 = new HatchCaaLoginCredentialType("WHATSAPP_AUTH_BUNDLE", 7, "whatsapp_auth_bundle");
        WHATSAPP_AUTH_BUNDLE = hatchCaaLoginCredentialType8;
        HatchCaaLoginCredentialType hatchCaaLoginCredentialType9 = new HatchCaaLoginCredentialType("NONCE", 8, "nonce");
        NONCE = hatchCaaLoginCredentialType9;
        HatchCaaLoginCredentialType[] hatchCaaLoginCredentialTypeArr = {hatchCaaLoginCredentialType, hatchCaaLoginCredentialType2, hatchCaaLoginCredentialType3, hatchCaaLoginCredentialType4, hatchCaaLoginCredentialType5, hatchCaaLoginCredentialType6, hatchCaaLoginCredentialType7, hatchCaaLoginCredentialType8, hatchCaaLoginCredentialType9};
        $VALUES = hatchCaaLoginCredentialTypeArr;
        $ENTRIES = C3cG.A0w(hatchCaaLoginCredentialTypeArr);
    }

    public static Ey9<HatchCaaLoginCredentialType> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaLoginCredentialType valueOf(String str) {
        return (HatchCaaLoginCredentialType) Enum.valueOf(HatchCaaLoginCredentialType.class, str);
    }

    public static HatchCaaLoginCredentialType[] values() {
        return (HatchCaaLoginCredentialType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCaaLoginCredentialType(String str, int i, String str2) {
        this.value = str2;
    }
}
