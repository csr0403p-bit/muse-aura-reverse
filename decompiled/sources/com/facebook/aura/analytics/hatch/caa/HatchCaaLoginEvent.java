package com.facebook.aura.analytics.hatch.caa;

import X.C3cG;
import X.C3cH;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaLoginEvent {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaLoginEvent[] $VALUES;
    public static final HatchCaaLoginEvent ACCOUNT_SELECTED;
    public static final HatchCaaLoginEvent ACCOUNT_SELECTOR_BACK;
    public static final HatchCaaLoginEvent ACCOUNT_SELECTOR_PAGE_SHOWN;
    public static final HatchCaaLoginEvent AYMH_LOGIN_CLICKED;
    public static final HatchCaaLoginEvent AYMH_LOG_INTO_ANOTHER_ACCOUNT_CLICKED;
    public static final HatchCaaLoginEvent AYMH_PAGE_SHOWN;
    public static final HatchCaaLoginEvent AYMH_PAGE_SHOWN_PER_ACCOUNT;
    public static final HatchCaaLoginEvent AYMH_PROFILE_LOAD_FAILED;
    public static final HatchCaaLoginEvent AYMH_SCREEN_SKIPPED_NO_PROFILES;
    public static final HatchCaaLoginEvent CONTACTPOINT_CONTINUE_CLICKED;
    public static final HatchCaaLoginEvent CONTACTPOINT_FOCUS;
    public static final HatchCaaLoginEvent CONTACTPOINT_PAGE_SHOWN;
    public static final HatchCaaLoginEvent ENTER_PASSWORD_INSTEAD_BUTTON_CLICKED;
    public static final HatchCaaLoginEvent FORGOT_PASSWORD_BUTTON_CLICKED;
    public static final HatchCaaLoginEvent GOOGLE_ACCOUNT_SELECTED;
    public static final HatchCaaLoginEvent GOOGLE_CREDENTIAL_MANAGER_LAUNCH_ATTEMPT;
    public static final HatchCaaLoginEvent LOGIN_ATTEMPT;
    public static final HatchCaaLoginEvent LOGIN_BUTTON_CLICKED;
    public static final HatchCaaLoginEvent LOGIN_FAILED;
    public static final HatchCaaLoginEvent LOGIN_FAILED_2FA;
    public static final HatchCaaLoginEvent LOGIN_START;
    public static final HatchCaaLoginEvent LOGIN_SUCCESS;
    public static final HatchCaaLoginEvent LOGIN_SUCCESS_2FA;
    public static final HatchCaaLoginEvent NTP_LANDING_NEXT;
    public static final HatchCaaLoginEvent NTP_LANDING_SHOWN_PER_ACCOUNT;
    public static final HatchCaaLoginEvent NTP_LANDING_START;
    public static final HatchCaaLoginEvent NTP_LANDING_SWITCH_TO_LOGIN;
    public static final HatchCaaLoginEvent OTP_PAGE_SHOWN;
    public static final HatchCaaLoginEvent PASSKEY_LOGIN_ASSERTION_CANCEL;
    public static final HatchCaaLoginEvent PASSKEY_LOGIN_ASSERTION_FAILURE;
    public static final HatchCaaLoginEvent PASSKEY_LOGIN_ASSERTION_SUCCESS;
    public static final HatchCaaLoginEvent PASSKEY_LOGIN_ASSERTION_TRIGGERED;
    public static final HatchCaaLoginEvent PASSKEY_NUX_CANCELLED;
    public static final HatchCaaLoginEvent PASSKEY_NUX_CONTINUED;
    public static final HatchCaaLoginEvent PASSKEY_NUX_SHOWN;
    public static final HatchCaaLoginEvent PASSWORD_PAGE_SHOWN;
    public static final HatchCaaLoginEvent PASSWORD_SAVING_CHECKBOX_TOGGLED;
    public static final HatchCaaLoginEvent PASSWORD_SAVING_OPT_IN;
    public static final HatchCaaLoginEvent PASSWORD_SAVING_OPT_OUT;
    public static final HatchCaaLoginEvent PASSWORD_SAVING_START;
    public static final HatchCaaLoginEvent REMOVE_PROFILE_CLICKED;
    public static final HatchCaaLoginEvent REMOVE_PROFILE_FAILURE;
    public static final HatchCaaLoginEvent REMOVE_PROFILE_SUBMITTED;
    public static final HatchCaaLoginEvent REMOVE_PROFILE_SUCCESS;
    public static final HatchCaaLoginEvent RESEND_CODE_CLICKED;
    public static final HatchCaaLoginEvent TWO_FAC_CONFIRM_NEXT_CLICKED;
    public static final HatchCaaLoginEvent TWO_FAC_CONFIRM_PAGE_SHOWN;
    public static final HatchCaaLoginEvent TWO_FAC_NEXT_CLICKED;
    public static final HatchCaaLoginEvent TWO_FAC_PAGE_SHOWN;
    public final String value;

    static {
        HatchCaaLoginEvent hatchCaaLoginEventA0L = C3cH.A0L("CONTACTPOINT_PAGE_SHOWN", "contactpoint_page_shown", 0);
        CONTACTPOINT_PAGE_SHOWN = hatchCaaLoginEventA0L;
        HatchCaaLoginEvent hatchCaaLoginEventA0L2 = C3cH.A0L("CONTACTPOINT_FOCUS", "contactpoint_focus", 1);
        CONTACTPOINT_FOCUS = hatchCaaLoginEventA0L2;
        HatchCaaLoginEvent hatchCaaLoginEventA0L3 = C3cH.A0L("CONTACTPOINT_CONTINUE_CLICKED", "contactpoint_continue_clicked", 2);
        CONTACTPOINT_CONTINUE_CLICKED = hatchCaaLoginEventA0L3;
        HatchCaaLoginEvent hatchCaaLoginEventA0L4 = C3cH.A0L("LOGIN_START", "login_start", 3);
        LOGIN_START = hatchCaaLoginEventA0L4;
        HatchCaaLoginEvent hatchCaaLoginEventA0L5 = C3cH.A0L("OTP_PAGE_SHOWN", "otp_page_shown", 4);
        OTP_PAGE_SHOWN = hatchCaaLoginEventA0L5;
        HatchCaaLoginEvent hatchCaaLoginEventA0L6 = C3cH.A0L("RESEND_CODE_CLICKED", "resend_code_clicked", 5);
        RESEND_CODE_CLICKED = hatchCaaLoginEventA0L6;
        HatchCaaLoginEvent hatchCaaLoginEventA0L7 = C3cH.A0L("ENTER_PASSWORD_INSTEAD_BUTTON_CLICKED", "enter_password_instead_button_clicked", 6);
        ENTER_PASSWORD_INSTEAD_BUTTON_CLICKED = hatchCaaLoginEventA0L7;
        HatchCaaLoginEvent hatchCaaLoginEventA0L8 = C3cH.A0L("PASSWORD_PAGE_SHOWN", "password_page_shown", 7);
        PASSWORD_PAGE_SHOWN = hatchCaaLoginEventA0L8;
        HatchCaaLoginEvent hatchCaaLoginEventA0L9 = C3cH.A0L("FORGOT_PASSWORD_BUTTON_CLICKED", "forgot_password_button_clicked", 8);
        FORGOT_PASSWORD_BUTTON_CLICKED = hatchCaaLoginEventA0L9;
        HatchCaaLoginEvent hatchCaaLoginEventA0L10 = C3cH.A0L("LOGIN_BUTTON_CLICKED", "login_button_clicked", 9);
        LOGIN_BUTTON_CLICKED = hatchCaaLoginEventA0L10;
        HatchCaaLoginEvent hatchCaaLoginEventA0L11 = C3cH.A0L("LOGIN_ATTEMPT", "login_attempt", 10);
        LOGIN_ATTEMPT = hatchCaaLoginEventA0L11;
        HatchCaaLoginEvent hatchCaaLoginEventA0L12 = C3cH.A0L("LOGIN_SUCCESS", "login_success", 11);
        LOGIN_SUCCESS = hatchCaaLoginEventA0L12;
        HatchCaaLoginEvent hatchCaaLoginEventA0L13 = C3cH.A0L("LOGIN_FAILED", "login_failed", 12);
        LOGIN_FAILED = hatchCaaLoginEventA0L13;
        HatchCaaLoginEvent hatchCaaLoginEventA0L14 = C3cH.A0L("LOGIN_SUCCESS_2FA", "2fa_login_success", 13);
        LOGIN_SUCCESS_2FA = hatchCaaLoginEventA0L14;
        HatchCaaLoginEvent hatchCaaLoginEventA0L15 = C3cH.A0L("LOGIN_FAILED_2FA", "2fa_login_failed", 14);
        LOGIN_FAILED_2FA = hatchCaaLoginEventA0L15;
        HatchCaaLoginEvent hatchCaaLoginEventA0L16 = C3cH.A0L("TWO_FAC_PAGE_SHOWN", "2fa_page_shown", 15);
        TWO_FAC_PAGE_SHOWN = hatchCaaLoginEventA0L16;
        HatchCaaLoginEvent hatchCaaLoginEventA0L17 = C3cH.A0L("TWO_FAC_NEXT_CLICKED", "2fa_next_clicked", 16);
        TWO_FAC_NEXT_CLICKED = hatchCaaLoginEventA0L17;
        HatchCaaLoginEvent hatchCaaLoginEventA0L18 = C3cH.A0L("TWO_FAC_CONFIRM_PAGE_SHOWN", "2fa_confirm_page_shown", 17);
        TWO_FAC_CONFIRM_PAGE_SHOWN = hatchCaaLoginEventA0L18;
        HatchCaaLoginEvent hatchCaaLoginEventA0L19 = C3cH.A0L("TWO_FAC_CONFIRM_NEXT_CLICKED", "2fa_confirm_next_clicked", 18);
        TWO_FAC_CONFIRM_NEXT_CLICKED = hatchCaaLoginEventA0L19;
        HatchCaaLoginEvent hatchCaaLoginEventA0L20 = C3cH.A0L("AYMH_LOGIN_CLICKED", "aymh_login_clicked", 19);
        AYMH_LOGIN_CLICKED = hatchCaaLoginEventA0L20;
        HatchCaaLoginEvent hatchCaaLoginEventA0L21 = C3cH.A0L("AYMH_PAGE_SHOWN", "aymh_page_shown", 20);
        AYMH_PAGE_SHOWN = hatchCaaLoginEventA0L21;
        HatchCaaLoginEvent hatchCaaLoginEventA0L22 = C3cH.A0L("AYMH_LOG_INTO_ANOTHER_ACCOUNT_CLICKED", "aymh_log_into_another_account_clicked", 21);
        AYMH_LOG_INTO_ANOTHER_ACCOUNT_CLICKED = hatchCaaLoginEventA0L22;
        HatchCaaLoginEvent hatchCaaLoginEventA0L23 = C3cH.A0L("AYMH_PAGE_SHOWN_PER_ACCOUNT", "aymh_page_shown_per_account", 22);
        AYMH_PAGE_SHOWN_PER_ACCOUNT = hatchCaaLoginEventA0L23;
        HatchCaaLoginEvent hatchCaaLoginEventA0L24 = C3cH.A0L("NTP_LANDING_SHOWN_PER_ACCOUNT", "ntp_landing_shown_per_account", 23);
        NTP_LANDING_SHOWN_PER_ACCOUNT = hatchCaaLoginEventA0L24;
        HatchCaaLoginEvent hatchCaaLoginEventA0L25 = C3cH.A0L("NTP_LANDING_START", "ntp_landing_start", 24);
        NTP_LANDING_START = hatchCaaLoginEventA0L25;
        HatchCaaLoginEvent hatchCaaLoginEventA0L26 = C3cH.A0L("NTP_LANDING_NEXT", "ntp_landing_next", 25);
        NTP_LANDING_NEXT = hatchCaaLoginEventA0L26;
        HatchCaaLoginEvent hatchCaaLoginEventA0L27 = C3cH.A0L("NTP_LANDING_SWITCH_TO_LOGIN", "ntp_landing_switch_to_login", 26);
        NTP_LANDING_SWITCH_TO_LOGIN = hatchCaaLoginEventA0L27;
        HatchCaaLoginEvent hatchCaaLoginEventA0L28 = C3cH.A0L("AYMH_PROFILE_LOAD_FAILED", "aymh_profile_load_failed", 27);
        AYMH_PROFILE_LOAD_FAILED = hatchCaaLoginEventA0L28;
        HatchCaaLoginEvent hatchCaaLoginEventA0L29 = C3cH.A0L("AYMH_SCREEN_SKIPPED_NO_PROFILES", "aymh_screen_skipped_no_profiles", 28);
        AYMH_SCREEN_SKIPPED_NO_PROFILES = hatchCaaLoginEventA0L29;
        HatchCaaLoginEvent hatchCaaLoginEventA0L30 = C3cH.A0L("ACCOUNT_SELECTOR_PAGE_SHOWN", "account_selector_page_shown", 29);
        ACCOUNT_SELECTOR_PAGE_SHOWN = hatchCaaLoginEventA0L30;
        HatchCaaLoginEvent hatchCaaLoginEventA0L31 = C3cH.A0L("ACCOUNT_SELECTED", "account_selected", 30);
        ACCOUNT_SELECTED = hatchCaaLoginEventA0L31;
        HatchCaaLoginEvent hatchCaaLoginEventA0L32 = C3cH.A0L("ACCOUNT_SELECTOR_BACK", "account_selector_back", 31);
        ACCOUNT_SELECTOR_BACK = hatchCaaLoginEventA0L32;
        HatchCaaLoginEvent hatchCaaLoginEventA0L33 = C3cH.A0L("GOOGLE_CREDENTIAL_MANAGER_LAUNCH_ATTEMPT", "login_google_credential_manager_launch_attempt", 32);
        GOOGLE_CREDENTIAL_MANAGER_LAUNCH_ATTEMPT = hatchCaaLoginEventA0L33;
        HatchCaaLoginEvent hatchCaaLoginEventA0L34 = C3cH.A0L("GOOGLE_ACCOUNT_SELECTED", "login_google_account_selected", 33);
        GOOGLE_ACCOUNT_SELECTED = hatchCaaLoginEventA0L34;
        HatchCaaLoginEvent hatchCaaLoginEventA0L35 = C3cH.A0L("PASSKEY_LOGIN_ASSERTION_TRIGGERED", "passkey_login_assertion_triggered", 34);
        PASSKEY_LOGIN_ASSERTION_TRIGGERED = hatchCaaLoginEventA0L35;
        HatchCaaLoginEvent hatchCaaLoginEventA0L36 = C3cH.A0L("PASSKEY_LOGIN_ASSERTION_SUCCESS", "passkey_login_assertion_success", 35);
        PASSKEY_LOGIN_ASSERTION_SUCCESS = hatchCaaLoginEventA0L36;
        HatchCaaLoginEvent hatchCaaLoginEventA0L37 = C3cH.A0L("PASSKEY_LOGIN_ASSERTION_FAILURE", "passkey_login_assertion_failure", 36);
        PASSKEY_LOGIN_ASSERTION_FAILURE = hatchCaaLoginEventA0L37;
        HatchCaaLoginEvent hatchCaaLoginEventA0L38 = C3cH.A0L("PASSKEY_LOGIN_ASSERTION_CANCEL", "passkey_login_assertion_cancel", 37);
        PASSKEY_LOGIN_ASSERTION_CANCEL = hatchCaaLoginEventA0L38;
        HatchCaaLoginEvent hatchCaaLoginEventA0L39 = C3cH.A0L("PASSKEY_NUX_SHOWN", "passkey_nux_shown", 38);
        PASSKEY_NUX_SHOWN = hatchCaaLoginEventA0L39;
        HatchCaaLoginEvent hatchCaaLoginEventA0L40 = C3cH.A0L("PASSKEY_NUX_CONTINUED", "passkey_nux_continued", 39);
        PASSKEY_NUX_CONTINUED = hatchCaaLoginEventA0L40;
        HatchCaaLoginEvent hatchCaaLoginEventA0L41 = C3cH.A0L("PASSKEY_NUX_CANCELLED", "passkey_nux_cancelled", 40);
        PASSKEY_NUX_CANCELLED = hatchCaaLoginEventA0L41;
        HatchCaaLoginEvent hatchCaaLoginEventA0L42 = C3cH.A0L("REMOVE_PROFILE_CLICKED", "remove_profile_clicked", 41);
        REMOVE_PROFILE_CLICKED = hatchCaaLoginEventA0L42;
        HatchCaaLoginEvent hatchCaaLoginEventA0L43 = C3cH.A0L("REMOVE_PROFILE_SUBMITTED", "remove_profile_submitted", 42);
        REMOVE_PROFILE_SUBMITTED = hatchCaaLoginEventA0L43;
        HatchCaaLoginEvent hatchCaaLoginEventA0L44 = C3cH.A0L("REMOVE_PROFILE_SUCCESS", "remove_profile_success", 43);
        REMOVE_PROFILE_SUCCESS = hatchCaaLoginEventA0L44;
        HatchCaaLoginEvent hatchCaaLoginEventA0L45 = C3cH.A0L("REMOVE_PROFILE_FAILURE", "remove_profile_failure", 44);
        REMOVE_PROFILE_FAILURE = hatchCaaLoginEventA0L45;
        HatchCaaLoginEvent hatchCaaLoginEventA0L46 = C3cH.A0L("PASSWORD_SAVING_START", "password_saving_start", 45);
        PASSWORD_SAVING_START = hatchCaaLoginEventA0L46;
        HatchCaaLoginEvent hatchCaaLoginEventA0L47 = C3cH.A0L("PASSWORD_SAVING_CHECKBOX_TOGGLED", "password_saving_checkbox_toggled", 46);
        PASSWORD_SAVING_CHECKBOX_TOGGLED = hatchCaaLoginEventA0L47;
        HatchCaaLoginEvent hatchCaaLoginEventA0L48 = C3cH.A0L("PASSWORD_SAVING_OPT_IN", "password_saving_opt_in", 47);
        PASSWORD_SAVING_OPT_IN = hatchCaaLoginEventA0L48;
        HatchCaaLoginEvent hatchCaaLoginEventA0L49 = C3cH.A0L("PASSWORD_SAVING_OPT_OUT", "password_saving_opt_out", 48);
        PASSWORD_SAVING_OPT_OUT = hatchCaaLoginEventA0L49;
        HatchCaaLoginEvent[] hatchCaaLoginEventArr = new HatchCaaLoginEvent[49];
        System.arraycopy(new HatchCaaLoginEvent[]{hatchCaaLoginEventA0L, hatchCaaLoginEventA0L2, hatchCaaLoginEventA0L3, hatchCaaLoginEventA0L4, hatchCaaLoginEventA0L5, hatchCaaLoginEventA0L6, hatchCaaLoginEventA0L7, hatchCaaLoginEventA0L8, hatchCaaLoginEventA0L9, hatchCaaLoginEventA0L10, hatchCaaLoginEventA0L11, hatchCaaLoginEventA0L12, hatchCaaLoginEventA0L13, hatchCaaLoginEventA0L14, hatchCaaLoginEventA0L15, hatchCaaLoginEventA0L16, hatchCaaLoginEventA0L17, hatchCaaLoginEventA0L18, hatchCaaLoginEventA0L19, hatchCaaLoginEventA0L20, hatchCaaLoginEventA0L21, hatchCaaLoginEventA0L22, hatchCaaLoginEventA0L23, hatchCaaLoginEventA0L24, hatchCaaLoginEventA0L25, hatchCaaLoginEventA0L26, hatchCaaLoginEventA0L27}, 0, hatchCaaLoginEventArr, 0, 27);
        System.arraycopy(new HatchCaaLoginEvent[]{hatchCaaLoginEventA0L28, hatchCaaLoginEventA0L29, hatchCaaLoginEventA0L30, hatchCaaLoginEventA0L31, hatchCaaLoginEventA0L32, hatchCaaLoginEventA0L33, hatchCaaLoginEventA0L34, hatchCaaLoginEventA0L35, hatchCaaLoginEventA0L36, hatchCaaLoginEventA0L37, hatchCaaLoginEventA0L38, hatchCaaLoginEventA0L39, hatchCaaLoginEventA0L40, hatchCaaLoginEventA0L41, hatchCaaLoginEventA0L42, hatchCaaLoginEventA0L43, hatchCaaLoginEventA0L44, hatchCaaLoginEventA0L45, hatchCaaLoginEventA0L46, hatchCaaLoginEventA0L47, hatchCaaLoginEventA0L48, hatchCaaLoginEventA0L49}, 0, hatchCaaLoginEventArr, 27, 22);
        $VALUES = hatchCaaLoginEventArr;
        $ENTRIES = C3cG.A0w(hatchCaaLoginEventArr);
    }

    public static Ey9<HatchCaaLoginEvent> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaLoginEvent valueOf(String str) {
        return (HatchCaaLoginEvent) Enum.valueOf(HatchCaaLoginEvent.class, str);
    }

    public static HatchCaaLoginEvent[] values() {
        return (HatchCaaLoginEvent[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCaaLoginEvent(String str, int i, String str2) {
        this.value = str2;
    }
}
