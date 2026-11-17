package com.facebook.aura.analytics.hatch.caa;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaRegistrationState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaRegistrationState[] $VALUES;
    public static final HatchCaaRegistrationState AC_OPTED_IN;
    public static final HatchCaaRegistrationState AC_OPTED_OUT;
    public static final HatchCaaRegistrationState AC_OPT_IN_BACK;
    public static final HatchCaaRegistrationState AC_OPT_IN_START;
    public static final HatchCaaRegistrationState BIRTHDAY_BACK;
    public static final HatchCaaRegistrationState BIRTHDAY_FOCUSED;
    public static final HatchCaaRegistrationState BIRTHDAY_INTERACTION;
    public static final HatchCaaRegistrationState BIRTHDAY_NEXT;
    public static final HatchCaaRegistrationState BIRTHDAY_START;
    public static final HatchCaaRegistrationState CONFIRMATION_FAILURE;
    public static final HatchCaaRegistrationState CONFIRMATION_NEXT;
    public static final HatchCaaRegistrationState CONFIRMATION_RESEND_CODE_CLICKED;
    public static final HatchCaaRegistrationState CONFIRMATION_START;
    public static final HatchCaaRegistrationState CONFIRMATION_SUCCESS;
    public static final HatchCaaRegistrationState CREATE_ATTEMPT;
    public static final HatchCaaRegistrationState CREATE_FAILURE;
    public static final HatchCaaRegistrationState CREATE_SUCCESS;
    public static final HatchCaaRegistrationState NAME_BACK;
    public static final HatchCaaRegistrationState NAME_INTERACTION_FIRST_NAME;
    public static final HatchCaaRegistrationState NAME_INTERACTION_LAST_NAME;
    public static final HatchCaaRegistrationState NAME_NEXT;
    public static final HatchCaaRegistrationState NAME_START;
    public static final HatchCaaRegistrationState REGISTRATION_START;
    public static final HatchCaaRegistrationState SWITCH_TO_NTM;
    public static final HatchCaaRegistrationState TOS_ACCEPTED;
    public static final HatchCaaRegistrationState UPSELL_BACK;
    public static final HatchCaaRegistrationState UPSELL_LOGIN_TO_EXISTING_ACCOUNT;
    public static final HatchCaaRegistrationState UPSELL_START;
    public final String value;

    static {
        HatchCaaRegistrationState hatchCaaRegistrationState = new HatchCaaRegistrationState("REGISTRATION_START", 0, "registration_start");
        REGISTRATION_START = hatchCaaRegistrationState;
        HatchCaaRegistrationState hatchCaaRegistrationState2 = new HatchCaaRegistrationState("NAME_START", 1, "name_start");
        NAME_START = hatchCaaRegistrationState2;
        HatchCaaRegistrationState hatchCaaRegistrationState3 = new HatchCaaRegistrationState("NAME_INTERACTION_FIRST_NAME", 2, "name_interaction_first_name");
        NAME_INTERACTION_FIRST_NAME = hatchCaaRegistrationState3;
        HatchCaaRegistrationState hatchCaaRegistrationState4 = new HatchCaaRegistrationState("NAME_INTERACTION_LAST_NAME", 3, "name_interaction_last_name");
        NAME_INTERACTION_LAST_NAME = hatchCaaRegistrationState4;
        HatchCaaRegistrationState hatchCaaRegistrationState5 = new HatchCaaRegistrationState("NAME_NEXT", 4, "name_next");
        NAME_NEXT = hatchCaaRegistrationState5;
        HatchCaaRegistrationState hatchCaaRegistrationState6 = new HatchCaaRegistrationState("NAME_BACK", 5, "name_back");
        NAME_BACK = hatchCaaRegistrationState6;
        HatchCaaRegistrationState hatchCaaRegistrationState7 = new HatchCaaRegistrationState("BIRTHDAY_START", 6, "birthday_start");
        BIRTHDAY_START = hatchCaaRegistrationState7;
        HatchCaaRegistrationState hatchCaaRegistrationState8 = new HatchCaaRegistrationState("BIRTHDAY_FOCUSED", 7, "birthday_focused");
        BIRTHDAY_FOCUSED = hatchCaaRegistrationState8;
        HatchCaaRegistrationState hatchCaaRegistrationState9 = new HatchCaaRegistrationState("BIRTHDAY_INTERACTION", 8, "birthday_interaction");
        BIRTHDAY_INTERACTION = hatchCaaRegistrationState9;
        HatchCaaRegistrationState hatchCaaRegistrationState10 = new HatchCaaRegistrationState("BIRTHDAY_NEXT", 9, "birthday_next");
        BIRTHDAY_NEXT = hatchCaaRegistrationState10;
        HatchCaaRegistrationState hatchCaaRegistrationState11 = new HatchCaaRegistrationState("BIRTHDAY_BACK", 10, "birthday_back");
        BIRTHDAY_BACK = hatchCaaRegistrationState11;
        HatchCaaRegistrationState hatchCaaRegistrationState12 = new HatchCaaRegistrationState("CREATE_ATTEMPT", 11, "create_attempt");
        CREATE_ATTEMPT = hatchCaaRegistrationState12;
        HatchCaaRegistrationState hatchCaaRegistrationState13 = new HatchCaaRegistrationState("CREATE_SUCCESS", 12, "create_success");
        CREATE_SUCCESS = hatchCaaRegistrationState13;
        HatchCaaRegistrationState hatchCaaRegistrationState14 = new HatchCaaRegistrationState("CREATE_FAILURE", 13, "create_failure");
        CREATE_FAILURE = hatchCaaRegistrationState14;
        HatchCaaRegistrationState hatchCaaRegistrationState15 = new HatchCaaRegistrationState("UPSELL_START", 14, "upsell_start");
        UPSELL_START = hatchCaaRegistrationState15;
        HatchCaaRegistrationState hatchCaaRegistrationState16 = new HatchCaaRegistrationState("UPSELL_LOGIN_TO_EXISTING_ACCOUNT", 15, "upsell_login_to_existing_account");
        UPSELL_LOGIN_TO_EXISTING_ACCOUNT = hatchCaaRegistrationState16;
        HatchCaaRegistrationState hatchCaaRegistrationState17 = new HatchCaaRegistrationState("SWITCH_TO_NTM", 16, "switch_to_ntm");
        SWITCH_TO_NTM = hatchCaaRegistrationState17;
        HatchCaaRegistrationState hatchCaaRegistrationState18 = new HatchCaaRegistrationState("UPSELL_BACK", 17, "upsell_back");
        UPSELL_BACK = hatchCaaRegistrationState18;
        HatchCaaRegistrationState hatchCaaRegistrationState19 = new HatchCaaRegistrationState("CONFIRMATION_START", 18, "confirmation_start");
        CONFIRMATION_START = hatchCaaRegistrationState19;
        HatchCaaRegistrationState hatchCaaRegistrationState20 = new HatchCaaRegistrationState("CONFIRMATION_NEXT", 19, "confirmation_next");
        CONFIRMATION_NEXT = hatchCaaRegistrationState20;
        HatchCaaRegistrationState hatchCaaRegistrationState21 = new HatchCaaRegistrationState("CONFIRMATION_RESEND_CODE_CLICKED", 20, "confirmation_resend_code_clicked");
        CONFIRMATION_RESEND_CODE_CLICKED = hatchCaaRegistrationState21;
        HatchCaaRegistrationState hatchCaaRegistrationState22 = new HatchCaaRegistrationState("CONFIRMATION_SUCCESS", 21, "confirmation_success");
        CONFIRMATION_SUCCESS = hatchCaaRegistrationState22;
        HatchCaaRegistrationState hatchCaaRegistrationState23 = new HatchCaaRegistrationState("CONFIRMATION_FAILURE", 22, "confirmation_failure");
        CONFIRMATION_FAILURE = hatchCaaRegistrationState23;
        HatchCaaRegistrationState hatchCaaRegistrationState24 = new HatchCaaRegistrationState("TOS_ACCEPTED", 23, "tos_accepted");
        TOS_ACCEPTED = hatchCaaRegistrationState24;
        HatchCaaRegistrationState hatchCaaRegistrationState25 = new HatchCaaRegistrationState("AC_OPT_IN_START", 24, "ac_opt_in_start");
        AC_OPT_IN_START = hatchCaaRegistrationState25;
        HatchCaaRegistrationState hatchCaaRegistrationState26 = new HatchCaaRegistrationState("AC_OPTED_IN", 25, "ac_opted_in");
        AC_OPTED_IN = hatchCaaRegistrationState26;
        HatchCaaRegistrationState hatchCaaRegistrationState27 = new HatchCaaRegistrationState("AC_OPTED_OUT", 26, "ac_opted_out");
        AC_OPTED_OUT = hatchCaaRegistrationState27;
        HatchCaaRegistrationState hatchCaaRegistrationState28 = new HatchCaaRegistrationState("AC_OPT_IN_BACK", 27, "ac_opt_in_back");
        AC_OPT_IN_BACK = hatchCaaRegistrationState28;
        HatchCaaRegistrationState[] hatchCaaRegistrationStateArr = new HatchCaaRegistrationState[28];
        System.arraycopy(new HatchCaaRegistrationState[]{hatchCaaRegistrationState, hatchCaaRegistrationState2, hatchCaaRegistrationState3, hatchCaaRegistrationState4, hatchCaaRegistrationState5, hatchCaaRegistrationState6, hatchCaaRegistrationState7, hatchCaaRegistrationState8, hatchCaaRegistrationState9, hatchCaaRegistrationState10, hatchCaaRegistrationState11, hatchCaaRegistrationState12, hatchCaaRegistrationState13, hatchCaaRegistrationState14, hatchCaaRegistrationState15, hatchCaaRegistrationState16, hatchCaaRegistrationState17, hatchCaaRegistrationState18, hatchCaaRegistrationState19, hatchCaaRegistrationState20, hatchCaaRegistrationState21, hatchCaaRegistrationState22, hatchCaaRegistrationState23, hatchCaaRegistrationState24, hatchCaaRegistrationState25, hatchCaaRegistrationState26, hatchCaaRegistrationState27}, 0, hatchCaaRegistrationStateArr, 0, 27);
        System.arraycopy(new HatchCaaRegistrationState[]{hatchCaaRegistrationState28}, 0, hatchCaaRegistrationStateArr, 27, 1);
        $VALUES = hatchCaaRegistrationStateArr;
        $ENTRIES = C3cG.A0w(hatchCaaRegistrationStateArr);
    }

    public static Ey9<HatchCaaRegistrationState> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaRegistrationState valueOf(String str) {
        return (HatchCaaRegistrationState) Enum.valueOf(HatchCaaRegistrationState.class, str);
    }

    public static HatchCaaRegistrationState[] values() {
        return (HatchCaaRegistrationState[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCaaRegistrationState(String str, int i, String str2) {
        this.value = str2;
    }
}
