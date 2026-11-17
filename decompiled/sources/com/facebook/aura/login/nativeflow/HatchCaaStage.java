package com.facebook.aura.login.nativeflow;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.widgets.WidgetComponentsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaStage {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaStage[] $VALUES;
    public static final HatchCaaStage CANCEL_DELETION;
    public static final HatchCaaStage CONFIRM_OTP;
    public static final HatchCaaStage CONFIRM_PASSKEY;
    public static final HatchCaaStage CONFIRM_PASSWORD;
    public static final HatchCaaStage DBL_LOGIN;
    public static final HatchCaaStage PASSKEY_ASSERTION;
    public static final HatchCaaStage REGISTER_COMPLETION;
    public static final HatchCaaStage REGISTER_COMPLETION_LINKED;
    public static final HatchCaaStage REMOVE_CROSS_APP_ACCOUNT;
    public static final HatchCaaStage REMOVE_SAVED_ACCOUNT;
    public static final HatchCaaStage SELECT_ACCOUNT;
    public static final HatchCaaStage SEND_OTP;
    public static final HatchCaaStage SSO_ACCOUNT_INFO;
    public static final HatchCaaStage SSO_EXCHANGE;
    public static final HatchCaaStage START;
    public static final HatchCaaStage TWO_FACTOR;
    public static final HatchCaaStage ZARI_EXCHANGE;
    public final String value;

    static {
        HatchCaaStage hatchCaaStage = new HatchCaaStage("START", 0, WidgetComponentsKt.START_PATH);
        START = hatchCaaStage;
        HatchCaaStage hatchCaaStage2 = new HatchCaaStage("SEND_OTP", 1, "send_otp");
        SEND_OTP = hatchCaaStage2;
        HatchCaaStage hatchCaaStage3 = new HatchCaaStage("CONFIRM_OTP", 2, "confirm_otp");
        CONFIRM_OTP = hatchCaaStage3;
        HatchCaaStage hatchCaaStage4 = new HatchCaaStage("CONFIRM_PASSWORD", 3, "confirm_password");
        CONFIRM_PASSWORD = hatchCaaStage4;
        HatchCaaStage hatchCaaStage5 = new HatchCaaStage("CONFIRM_PASSKEY", 4, "confirm_passkey");
        CONFIRM_PASSKEY = hatchCaaStage5;
        HatchCaaStage hatchCaaStage6 = new HatchCaaStage("PASSKEY_ASSERTION", 5, "passkey_assertion");
        PASSKEY_ASSERTION = hatchCaaStage6;
        HatchCaaStage hatchCaaStage7 = new HatchCaaStage("SELECT_ACCOUNT", 6, "select_account");
        SELECT_ACCOUNT = hatchCaaStage7;
        HatchCaaStage hatchCaaStage8 = new HatchCaaStage("SSO_ACCOUNT_INFO", 7, "sso_account_info");
        SSO_ACCOUNT_INFO = hatchCaaStage8;
        HatchCaaStage hatchCaaStage9 = new HatchCaaStage("CANCEL_DELETION", 8, "cancel_deletion");
        CANCEL_DELETION = hatchCaaStage9;
        HatchCaaStage hatchCaaStage10 = new HatchCaaStage("SSO_EXCHANGE", 9, "sso_exchange");
        SSO_EXCHANGE = hatchCaaStage10;
        HatchCaaStage hatchCaaStage11 = new HatchCaaStage("ZARI_EXCHANGE", 10, "zari_exchange");
        ZARI_EXCHANGE = hatchCaaStage11;
        HatchCaaStage hatchCaaStage12 = new HatchCaaStage("DBL_LOGIN", 11, "dbl_login");
        DBL_LOGIN = hatchCaaStage12;
        HatchCaaStage hatchCaaStage13 = new HatchCaaStage("TWO_FACTOR", 12, "two_factor");
        TWO_FACTOR = hatchCaaStage13;
        HatchCaaStage hatchCaaStage14 = new HatchCaaStage("REGISTER_COMPLETION", 13, "register_completion");
        REGISTER_COMPLETION = hatchCaaStage14;
        HatchCaaStage hatchCaaStage15 = new HatchCaaStage("REGISTER_COMPLETION_LINKED", 14, "register_completion_linked");
        REGISTER_COMPLETION_LINKED = hatchCaaStage15;
        HatchCaaStage hatchCaaStage16 = new HatchCaaStage("REMOVE_SAVED_ACCOUNT", 15, NativeLoginViewModel.REMOVE_SAVED_ACCOUNT_STEP);
        REMOVE_SAVED_ACCOUNT = hatchCaaStage16;
        HatchCaaStage hatchCaaStage17 = new HatchCaaStage("REMOVE_CROSS_APP_ACCOUNT", 16, "remove_cross_app_account");
        REMOVE_CROSS_APP_ACCOUNT = hatchCaaStage17;
        HatchCaaStage[] hatchCaaStageArr = {hatchCaaStage, hatchCaaStage2, hatchCaaStage3, hatchCaaStage4, hatchCaaStage5, hatchCaaStage6, hatchCaaStage7, hatchCaaStage8, hatchCaaStage9, hatchCaaStage10, hatchCaaStage11, hatchCaaStage12, hatchCaaStage13, hatchCaaStage14, hatchCaaStage15, hatchCaaStage16, hatchCaaStage17};
        $VALUES = hatchCaaStageArr;
        $ENTRIES = C3cG.A0w(hatchCaaStageArr);
    }

    public static Ey9<HatchCaaStage> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaStage valueOf(String str) {
        return (HatchCaaStage) Enum.valueOf(HatchCaaStage.class, str);
    }

    public static HatchCaaStage[] values() {
        return (HatchCaaStage[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCaaStage(String str, int i, String str2) {
        this.value = str2;
    }
}
