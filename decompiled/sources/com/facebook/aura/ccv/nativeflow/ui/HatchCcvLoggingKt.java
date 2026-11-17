package com.facebook.aura.ccv.nativeflow.ui;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C3cG;
import X.HxE;
import com.facebook.aura.ccv.nativeflow.HatchCardFieldError;

/* loaded from: classes3.dex */
public abstract class HatchCcvLoggingKt {
    public static final String EVENT_COUNTRY_SELECTED = "ccv_country_selected";
    public static final String EVENT_FORM_CONFIG = "ccv_form_config";
    public static final String EVENT_FORM_OUTCOME = "ccv_form_outcome";
    public static final String EVENT_FORM_VALIDATION = "ccv_form_validation";
    public static final String EVENT_THREE_DS_STEP_UP = "ccv_three_ds_step_up";
    public static final String EVENT_TYPE_ATTEMPT = "attempt";
    public static final String EVENT_TYPE_ERROR = "error";
    public static final String EVENT_TYPE_SUCCESS = "success";
    public static final String EVENT_TYPE_WARNING = "warning";
    public static final String FAILURE_MISSING_COUNTRY_CONFIG = "missing_country_config";
    public static final String FIELD_CSC = "csc";
    public static final String FIELD_EXPIRY = "expiry";
    public static final String FIELD_PAN = "pan";
    public static final String FIELD_ZIP = "zip";
    public static final String KEY_AGE_CHECK_ID = "age_check_id";
    public static final String KEY_BILLING_COUNTRY = "billing_country";
    public static final String KEY_COUNTRY_COUNT = "country_count";
    public static final String KEY_FIELD_ID = "field_id";
    public static final String KEY_POSTAL_RULE_COUNT = "postal_rule_count";
    public static final String KEY_STEP_UP_SOURCE = "step_up_source";
    public static final String KEY_UPL_SESSION_ID = "upl_session_id";
    public static final String NO_POSTAL_FIELD = "null";
    public static final String STEP_UP_SOURCE_CREDENTIAL = "credential";

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchCardFieldError.values().length];
            try {
                AnonymousClass002.A13(HatchCardFieldError.PAN_EMPTY, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchCardFieldError.PAN_INCOMPLETE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchCardFieldError.PAN_INVALID, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchCardFieldError.PAN_UNSUPPORTED_BRAND, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchCardFieldError.EXPIRY_EMPTY, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(HatchCardFieldError.EXPIRY_MALFORMED, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(HatchCardFieldError.EXPIRY_MONTH_INVALID, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(HatchCardFieldError.EXPIRY_PAST, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(HatchCardFieldError.CSC_EMPTY, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(HatchCardFieldError.CSC_WRONG_LENGTH, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(HatchCardFieldError.ZIP_EMPTY, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final HxE<String, String> toFieldAndReason(HatchCardFieldError hatchCardFieldError) {
        int iOrdinal = hatchCardFieldError.ordinal();
        String str = "INCOMPLETE";
        String str2 = FIELD_PAN;
        switch (iOrdinal) {
            case 0:
                return C3cG.A0r(str2, "EMPTY");
            case 1:
                return C3cG.A0r(FIELD_PAN, str);
            case 2:
                str = "INVALID";
                return C3cG.A0r(FIELD_PAN, str);
            case 3:
                str = "UNSUPPORTED_BRAND";
                return C3cG.A0r(FIELD_PAN, str);
            case 4:
                return C3cG.A0r(FIELD_EXPIRY, "EMPTY");
            case 5:
                return C3cG.A0r(FIELD_EXPIRY, str);
            case 6:
                str = "INVALID_MONTH";
                return C3cG.A0r(FIELD_EXPIRY, str);
            case 7:
                str = "EXPIRED";
                return C3cG.A0r(FIELD_EXPIRY, str);
            case 8:
                return C3cG.A0r("csc", "EMPTY");
            case 9:
                return C3cG.A0r("csc", "EXACT_LENGTH");
            case 10:
                str2 = "zip";
                return C3cG.A0r(str2, "EMPTY");
            default:
                throw C3cG.A0q();
        }
    }
}
