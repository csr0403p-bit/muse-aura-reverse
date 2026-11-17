package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BY4 implements InterfaceC2571Be0<String> {
    public static final /* synthetic */ BY4[] A00;
    public static final BY4 A01;
    public final String mValue;

    static {
        BY4 by4A00 = A00("CDS_OTP_CONFIRM_PHONE_NUMBER_SCREEN", "cds_otp_confirm_phone_number_screen", 0);
        BY4 by4A002 = A00("CDS_OTP_ENTER_CODE", "cds_otp_enter_code", 1);
        BY4 by4A003 = A00("CHECKOUT", "checkout", 2);
        BY4 by4A004 = A00("COMET_DOC_UPLOAD", "comet_doc_upload", 3);
        BY4 by4A005 = A00("COULD_NOT_VERIFY", "could_not_verify", 4);
        BY4 by4A006 = A00("DOC_UPLOAD_DECLINE", "doc_upload_decline", 5);
        BY4 by4A007 = A00("DOC_UPLOAD_DECLINE_REAPPEAL", "doc_upload_decline_reappeal", 6);
        BY4 by4A008 = A00("DOC_UPLOAD_GENERIC_UPLOADER", "doc_upload_generic_uploader", 7);
        BY4 by4A009 = A00("DOC_UPLOAD_IN_PROGRESS", "doc_upload_in_progress", 8);
        BY4 by4A0010 = A00("DOC_UPLOAD_INIT", "doc_upload_init", 9);
        BY4 by4A0011 = A00("DOC_UPLOAD_NO_DATA", "doc_upload_no_data", 10);
        BY4 by4A0012 = A00("DOC_UPLOAD_REDIRECT", "doc_upload_redirect", 11);
        BY4 by4A0013 = A00("DOC_UPLOAD_SUCCESS", "doc_upload_success", 12);
        BY4 by4A0014 = A00("DYNAMIC_AUTH", "dynamic_authentication", 13);
        BY4 by4A0015 = A00("FBPAY_CONFIRM_PIN", "fbpay_confirm_pin", 14);
        BY4 by4A0016 = A00("FBPAY_CREATE_PIN", "fbpay_create_pin", 15);
        BY4 by4A0017 = A00("FBPAY_FORGET_PIN", "fbpay_forget_pin", 16);
        BY4 by4A0018 = A00("FBPAY_RESET_PIN", "reset_pin", 17);
        BY4 by4A0019 = A00("FBPAY_VERIFY_BIO", "fbpay_verify_bio", 18);
        BY4 by4A0020 = A00("FBPAY_VERIFY_CVV", "fbpay_verify_cvv", 19);
        BY4 by4A0021 = A00("FBPAY_VERIFY_PAYPAL", "fbpay_verify_paypal", 20);
        BY4 by4A0022 = A00("FBPAY_VERIFY_PIN", "fbpay_verify_pin", 21);
        BY4 by4A0023 = A00("FETCH_ENCRYPTION_KEY", "fetch_encryption_key", 22);
        A01 = by4A0023;
        BY4 by4A0024 = A00("LEAVE_WITHOUT_RESET", "leave_without_reset", 23);
        BY4 by4A0025 = A00("OC_OTP", "oc_otp", 24);
        BY4 by4A0026 = A00("OC_PIN", "oc_pin", 25);
        BY4 by4A0027 = A00("OTP_CONFIRM_PHONE_OR_EMAIL", "otp_confirm_phone_or_email", 26);
        BY4[] by4Arr = new BY4[44];
        System.arraycopy(new BY4[]{A00("OTP_ENTER_CODE", "otp_enter_code", 27), A00("PASSKEY_VERIFICATION", "passkey_verification", 28), A00("PASSWORD_VERIFICATION", "password_verification", 29), A00("RESET_PIN_CONFIRM", "reset_pin_confirm", 30), A00("RESET_PIN_CVV", "reset_pin_cvv", 31), A00("RESET_PIN_PAYPAL", "reset_pin_paypal", 32), A00("RESET_WITH_ANOTHER_FACTOR", "reset_with_another_factor", 33), A00("SDC_ACCOUNT_VERIFIED", "sdc_account_verified", 34), A00("SDC_AUTHORIZATION_SENT", "sdc_authorization_sent", 35), A00("SDC_COULD_NOT_VERIFY", "sdc_could_not_verify", 36), A00("SDC_ENTER_CODE", "sdc_enter_code", 37), A00("SDC_PAYMENTS_DISABLED", "sdc_payments_disabled", 38), A00("SDC_VERIFICATION_NEEDED", "sdc_verification_needed", 39), A00("SSO_ACCESS_TOKEN_GENERATION", "sso_access_token_generation", 40), A00("UNDEFINED", "undefined", 41), A00("UNIVERSAL_LINK_REDIRECT", "universal_link_redirect", 42), A00("VERIFICATION_NEEDED", "verification_needed", 43)}, BV5.A1U(new BY4[]{by4A00, by4A002, by4A003, by4A004, by4A005, by4A006, by4A007, by4A008, by4A009, by4A0010, by4A0011, by4A0012, by4A0013, by4A0014, by4A0015, by4A0016, by4A0017, by4A0018, by4A0019, by4A0020, by4A0021, by4A0022, by4A0023, by4A0024, by4A0025, by4A0026, by4A0027}, by4Arr) ? 1 : 0, by4Arr, 27, 17);
        A00 = by4Arr;
    }

    public static BY4 A00(String str, String str2, int i) {
        return new BY4(str, i, str2);
    }

    public static BY4 valueOf(String str) {
        return (BY4) Enum.valueOf(BY4.class, str);
    }

    public static BY4[] values() {
        return (BY4[]) A00.clone();
    }

    @Override // X.InterfaceC2571Be0
    public final /* bridge */ /* synthetic */ String getValue() {
        return this.mValue;
    }

    public BY4(String str, int i, String str2) {
        this.mValue = str2;
    }
}
