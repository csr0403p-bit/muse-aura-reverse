package X;

import com.facebook.aura.model.GenericListPresentationKt;
import com.facebook.aura.settings.WhatsAppConnectConsentRepository;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class EVK implements InterfaceC2571Be0<String> {
    public static final /* synthetic */ EVK[] A00;
    public static final EVK A01;
    public static final EVK A02;
    public static final EVK A03;
    public static final EVK A04;
    public static final EVK A05;
    public static final EVK A06;
    public static final EVK A07;
    public static final EVK A08;
    public static final EVK A09;
    public static final EVK A0A;
    public static final EVK A0B;
    public static final EVK A0C;
    public static final EVK A0D;
    public static final EVK A0E;
    public static final EVK A0F;
    public static final EVK A0G;
    public static final EVK A0H;
    public static final EVK A0I;
    public static final EVK A0J;
    public static final EVK A0K;
    public static final EVK A0L;
    public static final EVK A0M;
    public static final EVK A0N;
    public static final EVK A0O;
    public static final EVK A0P;
    public static final EVK A0Q;
    public static final EVK A0R;
    public static final EVK A0S;
    public static final EVK A0T;
    public static final EVK A0U;
    public static final EVK A0V;
    public static final EVK A0W;
    public static final EVK A0X;
    public static final EVK A0Y;
    public static final EVK A0Z;
    public static final EVK A0a;
    public static final EVK A0b;
    public static final EVK A0c;
    public static final EVK A0d;
    public static final EVK A0e;
    public static final EVK A0f;
    public static final EVK A0g;
    public static final EVK A0h;
    public static final EVK A0i;
    public static final EVK A0j;
    public static final EVK A0k;
    public static final EVK A0l;
    public static final EVK A0m;
    public static final EVK A0n;
    public static final EVK A0o;
    public static final EVK A0p;
    public static final EVK A0q;
    public static final EVK A0r;
    public static final EVK A0s;
    public static final EVK A0t;
    public static final EVK A0u;
    public static final EVK A0v;
    public static final EVK A0w;
    public static final EVK A0x;
    public static final EVK A0y;
    public static final EVK A0z;
    public static final EVK A10;
    public static final EVK A11;
    public static final EVK A12;
    public final String mValue;

    static {
        EVK evkA00 = A00("APP_STARTUP", "app_startup", 0);
        A01 = evkA00;
        EVK evkA002 = A00("CHAT_TAB_CLICK", "chat_tab_click", 1);
        A02 = evkA002;
        EVK evkA003 = A00("CLIENT_OPEN", "client_open", 2);
        A03 = evkA003;
        EVK evkA004 = A00("CONNECT_VM", "connect_vm", 3);
        A05 = evkA004;
        EVK evkA005 = A00("CONNECTIONS_TAB_CLICK", "connections_tab_click", 4);
        A04 = evkA005;
        EVK evkA006 = A00("CVM_ACCESS_ERROR_VIEW", "cvm_access_error_view", 5);
        A06 = evkA006;
        EVK evkA007 = A00("CVM_ACTIVATION_COMPLETE", "cvm_activation_complete", 6);
        A07 = evkA007;
        EVK evkA008 = A00("CVM_DOWNGRADE", "cvm_downgrade", 7);
        A08 = evkA008;
        EVK evkA009 = A00("CVM_ENCRYPTION_SETTINGS_CLICK", "cvm_encryption_settings_click", 8);
        A09 = evkA009;
        EVK evkA0010 = A00("CVM_ENCRYPTION_SETTINGS_VIEW", "cvm_encryption_settings_view", 9);
        A0A = evkA0010;
        EVK evkA0011 = A00("CVM_HELP_CLICK", "cvm_help_click", 10);
        A0B = evkA0011;
        EVK evkA0012 = A00("CVM_LOGOUT_CLICK", "cvm_logout_click", 11);
        A0C = evkA0012;
        EVK evkA0013 = A00("CVM_MAINTENANCE_VIEW", "cvm_maintenance_view", 12);
        A0D = evkA0013;
        EVK evkA0014 = A00("CVM_READY_CONFIRM_CLICK", "cvm_ready_confirm_click", 13);
        A0E = evkA0014;
        EVK evkA0015 = A00("CVM_READY_VIEW", "cvm_ready_view", 14);
        A0F = evkA0015;
        EVK evkA0016 = A00("CVM_REPLACEMENT_CHIP_BID", "cvm_replacement_chip_bid", 15);
        A0G = evkA0016;
        EVK evkA0017 = A00("CVM_REPLACEMENT_CHIP_BUDGET_EXHAUSTED", "cvm_replacement_chip_budget_exhausted", 16);
        A0H = evkA0017;
        EVK evkA0018 = A00("CVM_REPLACEMENT_CHIP_BUDGET_SETTINGS_CLICK", "cvm_replacement_chip_budget_settings_click", 17);
        A0I = evkA0018;
        EVK evkA0019 = A00("CVM_REPLACEMENT_CHIP_BUDGET_SUPPORT_CLICK", "cvm_replacement_chip_budget_support_click", 18);
        A0J = evkA0019;
        EVK evkA0020 = A00("CVM_REPLACEMENT_CHIP_SUBMITTED", "cvm_replacement_chip_submitted", 19);
        A0K = evkA0020;
        EVK evkA0021 = A00("CVM_REPLACEMENT_PUSH_RECEIVED", "cvm_replacement_push_received", 20);
        A0L = evkA0021;
        EVK evkA0022 = A00("CVM_REPLACEMENT_UNLOCK", "cvm_replacement_unlock", 21);
        A0M = evkA0022;
        EVK evkA0023 = A00("CVM_SUBSCRIPTION_ENDED_CONTINUE_CLICK", "cvm_subscription_ended_continue_click", 22);
        A0N = evkA0023;
        EVK evkA0024 = A00("CVM_SUBSCRIPTION_ENDED_RENEW_CLICK", "cvm_subscription_ended_renew_click", 23);
        A0O = evkA0024;
        EVK evkA0025 = A00("CVM_SUBSCRIPTION_ENDED_VIEW", "cvm_subscription_ended_view", 24);
        A0P = evkA0025;
        EVK evkA0026 = A00("CVM_SWITCH_BACK_CLICK", "cvm_switch_back_click", 25);
        A0Q = evkA0026;
        EVK evkA0027 = A00("CVM_SWITCH_BACK_DELETE_CANCEL_CLICK", "cvm_switch_back_delete_cancel_click", 26);
        A0R = evkA0027;
        EVK evkA0028 = A00("CVM_SWITCH_BACK_DISMISS_CLICK", "cvm_switch_back_dismiss_click", 27);
        A0S = evkA0028;
        EVK evkA0029 = A00("CVM_SWITCH_BACK_DOWNLOAD_CLICK", "cvm_switch_back_download_click", 28);
        A0T = evkA0029;
        EVK evkA0030 = A00("CVM_SWITCH_BACK_KEEP_DATA_CLICK", "cvm_switch_back_keep_data_click", 29);
        A0U = evkA0030;
        EVK evkA0031 = A00("CVM_SWITCH_BACK_KEEP_DATA_OPTION_CLICK", "cvm_switch_back_keep_data_option_click", 30);
        A0V = evkA0031;
        EVK evkA0032 = A00("CVM_SWITCH_BACK_LEARN_MORE_CLICK", "cvm_switch_back_learn_more_click", 31);
        A0W = evkA0032;
        EVK evkA0033 = A00("CVM_SWITCH_BACK_REFUSED", "cvm_switch_back_refused", 32);
        A0X = evkA0033;
        EVK evkA0034 = A00("CVM_SWITCH_BACK_START_FRESH_CLICK", "cvm_switch_back_start_fresh_click", 33);
        A0Y = evkA0034;
        EVK evkA0035 = A00("CVM_SWITCH_BACK_START_FRESH_OPTION_CLICK", "cvm_switch_back_start_fresh_option_click", 34);
        A0Z = evkA0035;
        EVK evkA0036 = A00("CVM_SWITCH_START_FRESH", "cvm_switch_start_fresh", 35);
        A0a = evkA0036;
        EVK evkA0037 = A00("CVM_SWITCH_TRANSFER", "cvm_switch_transfer", 36);
        A0b = evkA0037;
        EVK evkA0038 = A00("CVM_WEB_MEDIA_ALLOW_CLICK", "cvm_web_media_allow_click", 37);
        A0c = evkA0038;
        EVK evkA0039 = A00("CVM_WEB_MEDIA_DENY_CLICK", "cvm_web_media_deny_click", 38);
        A0d = evkA0039;
        EVK evkA0040 = A00("FEED_TAB_CLICK", "feed_tab_click", 39);
        A0e = evkA0040;
        EVK evkA0041 = A00("GOALS_TAB_CLICK", "goals_tab_click", 40);
        A0f = evkA0041;
        EVK evkA0042 = A00("IDEAS_TAB_CLICK", "ideas_tab_click", 41);
        A0g = evkA0042;
        EVK evkA0043 = A00("LIBRARY_TAB_CLICK", "library_tab_click", 42);
        A0h = evkA0043;
        EVK evkA0044 = A00("RECOVERY_PIN_CHANGE", "recovery_pin_change", 43);
        A0i = evkA0044;
        EVK evkA0045 = A00("RECOVERY_PIN_CHANGE_CLICK", "recovery_pin_change_click", 44);
        A0j = evkA0045;
        EVK evkA0046 = A00("RECOVERY_PIN_CREATE", "recovery_pin_create", 45);
        A0k = evkA0046;
        EVK evkA0047 = A00("RECOVERY_PIN_HELP_VIEW", "recovery_pin_help_view", 46);
        A0l = evkA0047;
        EVK evkA0048 = A00("RECOVERY_PIN_LOGOUT_CLICK", "recovery_pin_logout_click", 47);
        A0m = evkA0048;
        EVK evkA0049 = A00("RECOVERY_PIN_LOOKUP_FAILED_VIEW", "recovery_pin_lookup_failed_view", 48);
        A0n = evkA0049;
        EVK evkA0050 = A00("RECOVERY_PIN_REMINDER_PROMPT_VIEW", "recovery_pin_reminder_prompt_view", 49);
        A0o = evkA0050;
        EVK evkA0051 = A00("RECOVERY_PIN_REMINDER_VERIFY", "recovery_pin_reminder_verify", 50);
        A0p = evkA0051;
        EVK evkA0052 = A00("RECOVERY_PIN_REMINDER_VIEW", "recovery_pin_reminder_view", 51);
        A0q = evkA0052;
        EVK evkA0053 = A00("RECOVERY_PIN_RESET", "recovery_pin_reset", 52);
        A0r = evkA0053;
        EVK evkA0054 = A00("RECOVERY_PIN_RESET_CLICK", "recovery_pin_reset_click", 53);
        A0s = evkA0054;
        EVK evkA0055 = A00("RECOVERY_PIN_VERIFY", "recovery_pin_verify", 54);
        A0t = evkA0055;
        EVK evkA0056 = A00("SEND_MESSAGE", GenericListPresentationKt.GENERIC_LIST_ROW_TYPE_SEND_MESSAGE, 55);
        A0u = evkA0056;
        EVK evkA0057 = A00("TIME_SPENT_BACKGROUND", "time_spent_background", 56);
        A0v = evkA0057;
        EVK evkA0058 = A00("TIME_SPENT_BIT_ARRAY", "time_spent_bit_array", 57);
        A0w = evkA0058;
        EVK evkA0059 = A00("TIME_SPENT_FOREGROUND", "time_spent_foreground", 58);
        A0x = evkA0059;
        EVK evkA0060 = A00("TIME_SPENT_NAVIGATION", "time_spent_navigation", 59);
        A0y = evkA0060;
        EVK evkA0061 = A00("VOICE_DICTATION", "voice_dictation", 60);
        A0z = evkA0061;
        EVK evkA0062 = A00("WHATSAPP_CONNECT", WhatsAppConnectConsentRepository.WHATSAPP_CONNECT_TOS_NAME, 61);
        A10 = evkA0062;
        EVK evkA0063 = A00("WHATSAPP_UPDATE_CLICK", "whatsapp_update_click", 62);
        A11 = evkA0063;
        EVK evkA0064 = A00("WHATSAPP_UPDATE_PROMPT_VIEW", "whatsapp_update_prompt_view", 63);
        A12 = evkA0064;
        EVK[] evkArr = new EVK[64];
        System.arraycopy(new EVK[]{evkA00, evkA002, evkA003, evkA004, evkA005, evkA006, evkA007, evkA008, evkA009, evkA0010, evkA0011, evkA0012, evkA0013, evkA0014, evkA0015, evkA0016, evkA0017, evkA0018, evkA0019, evkA0020, evkA0021, evkA0022, evkA0023, evkA0024, evkA0025, evkA0026, evkA0027}, 0, evkArr, 0, 27);
        System.arraycopy(new EVK[]{evkA0028, evkA0029, evkA0030, evkA0031, evkA0032, evkA0033, evkA0034, evkA0035, evkA0036, evkA0037, evkA0038, evkA0039, evkA0040, evkA0041, evkA0042, evkA0043, evkA0044, evkA0045, evkA0046, evkA0047, evkA0048, evkA0049, evkA0050, evkA0051, evkA0052, evkA0053, evkA0054}, 0, evkArr, 27, 27);
        System.arraycopy(new EVK[]{evkA0055, evkA0056, evkA0057, evkA0058, evkA0059, evkA0060, evkA0061, evkA0062, evkA0063, evkA0064}, 0, evkArr, 54, 10);
        A00 = evkArr;
    }

    public static EVK A00(String str, String str2, int i) {
        return new EVK(str, i, str2);
    }

    public static EVK valueOf(String str) {
        return (EVK) Enum.valueOf(EVK.class, str);
    }

    public static EVK[] values() {
        return (EVK[]) A00.clone();
    }

    @Override // X.InterfaceC2571Be0
    public final /* bridge */ /* synthetic */ String getValue() {
        return this.mValue;
    }

    public EVK(String str, int i, String str2) {
        this.mValue = str2;
    }
}
