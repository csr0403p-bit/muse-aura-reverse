package com.facebook.aura.ccv.nativeflow.ui;

import X.AGH;
import X.AHD;
import X.AIW;
import X.AbstractC0885AGm;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C0924AIa;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.HxE;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchEventType;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.ccv.nativeflow.HatchCardFieldError;
import com.facebook.aura.ccv.nativeflow.HatchCcvCountryConfig;
import com.facebook.aura.ccv.nativeflow.HatchCcvCountryOptions;
import com.facebook.aura.ccv.nativeflow.HatchCcvPostalFieldConfig;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutUnavailableReason;
import com.facebook.aura.ccv.nativeflow.HatchPostalValidationRule;
import com.facebook.aura.ccv.nativeflow.HatchThreeDSChallengeResult;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchCcvLogging {
    public static final int $stable = 0;
    public static final HatchCcvLogging INSTANCE = new HatchCcvLogging();

    public final void logCountrySelected(String str) {
        C7384Etj.A0Y(str, 0);
        log(HatchCcvLoggingKt.EVENT_COUNTRY_SELECTED, "success", HatchComponent.CCV_COUNTRY_PICKER, AnonymousClass006.A10(HatchCcvLoggingKt.KEY_BILLING_COUNTRY, str));
    }

    public final void logFormConfigMissing(String str) {
        C7384Etj.A0Y(str, 0);
        log(HatchCcvLoggingKt.EVENT_FORM_CONFIG, "error", HatchComponent.CCV_FORM, AnonymousClass007.A0d("upl_session_id", str, C3cG.A0r(HatchMetadataKey.FAILURE_REASON.getValue(), HatchCcvLoggingKt.FAILURE_MISSING_COUNTRY_CONFIG)));
    }

    public final void logThreeDSStepUpOutcome(HatchThreeDSChallengeResult hatchThreeDSChallengeResult, String str, String str2) {
        String str3;
        boolean zA1a = AnonymousClass002.A1a(hatchThreeDSChallengeResult, str);
        C7384Etj.A0Y(str2, 2);
        int iOrdinal = hatchThreeDSChallengeResult.ordinal();
        if (iOrdinal == 0) {
            str3 = "success";
        } else if (iOrdinal == 2) {
            str3 = "warning";
        } else {
            if (iOrdinal != zA1a && iOrdinal != 3 && iOrdinal != 4) {
                throw C3cG.A0q();
            }
            str3 = "error";
        }
        log(HatchCcvLoggingKt.EVENT_THREE_DS_STEP_UP, str3, HatchComponent.CCV_THREE_DS_CHALLENGE, AGH.A08(AbstractC0885AGm.A0z(hatchThreeDSChallengeResult != HatchThreeDSChallengeResult.AUTHENTICATED ? C3cG.A0r(HatchMetadataKey.FAILURE_REASON.getValue(), hatchThreeDSChallengeResult.name()) : null), threeDSMetadata(str, str2)));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchThreeDSChallengeResult.values().length];
            try {
                AnonymousClass002.A13(HatchThreeDSChallengeResult.AUTHENTICATED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchThreeDSChallengeResult.DISMISSED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchThreeDSChallengeResult.AUTH_FAILED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchThreeDSChallengeResult.INVALID_URL, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchThreeDSChallengeResult.NOT_PRESENTED, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void log(String str, String str2, HatchComponent hatchComponent, Map<String, String> map) {
        HatchAppEventLogger hatchAppEventLogger = HatchAppEventLogger.INSTANCE;
        String value = HatchSurface.AGE_CONFIRMATION.getValue();
        String value2 = hatchComponent.getValue();
        String strAgeCheckId = AgeCheckFunnelLogging.INSTANCE.ageCheckId();
        hatchAppEventLogger.logEvent(str, value, null, str2, value2, AGH.A08(AbstractC0885AGm.A0z(strAgeCheckId != null ? C3cG.A0r("age_check_id", strAgeCheckId) : null), map), null);
    }

    public static /* synthetic */ void logFormOutcome$default(HatchCcvLogging hatchCcvLogging, HatchCcvFormOutcome hatchCcvFormOutcome, String str, HatchCheckoutUnavailableReason hatchCheckoutUnavailableReason, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchCheckoutUnavailableReason = null;
        }
        hatchCcvLogging.logFormOutcome(hatchCcvFormOutcome, str, hatchCheckoutUnavailableReason);
    }

    private final void logValidation(String str, String str2, String str3) {
        log(HatchCcvLoggingKt.EVENT_FORM_VALIDATION, "warning", HatchComponent.CCV_FORM, C3cH.A0m(HatchCcvLoggingKt.KEY_BILLING_COUNTRY, str, C3cG.A0r(HatchCcvLoggingKt.KEY_FIELD_ID, str2), AnonymousClass006.A12(HatchMetadataKey.FAILURE_REASON, str3)));
    }

    private final Map<String, String> threeDSMetadata(String str, String str2) {
        return C3cH.A0m(HatchCcvLoggingKt.KEY_BILLING_COUNTRY, str2, C3cG.A0r(HatchCcvLoggingKt.KEY_STEP_UP_SOURCE, HatchCcvLoggingKt.STEP_UP_SOURCE_CREDENTIAL), C3cG.A0r("upl_session_id", str));
    }

    public final void logFormConfig(HatchCcvCountryOptions hatchCcvCountryOptions, String str) {
        HatchCcvPostalFieldConfig hatchCcvPostalFieldConfig;
        AHD<HatchPostalValidationRule> ahd;
        AnonymousClass003.A0u(hatchCcvCountryOptions, str);
        String value = HatchEventType.STATUS_CHECK.getValue();
        HatchComponent hatchComponent = HatchComponent.CCV_FORM;
        String str2 = hatchCcvCountryOptions.defaultCountry;
        HxE hxEA0r = C3cG.A0r(HatchCcvLoggingKt.KEY_BILLING_COUNTRY, str2);
        HatchCcvCountryConfig hatchCcvCountryConfigConfigFor = hatchCcvCountryOptions.configFor(str2);
        log(HatchCcvLoggingKt.EVENT_FORM_CONFIG, value, hatchComponent, C3cH.A0n("upl_session_id", str, hxEA0r, C3cG.A0r(HatchCcvLoggingKt.KEY_POSTAL_RULE_COUNT, (hatchCcvCountryConfigConfigFor == null || (hatchCcvPostalFieldConfig = hatchCcvCountryConfigConfigFor.postalField) == null || (ahd = hatchCcvPostalFieldConfig.validationRules) == null) ? HatchCcvLoggingKt.NO_POSTAL_FIELD : String.valueOf(ahd.size())), C3cG.A0r(HatchCcvLoggingKt.KEY_COUNTRY_COUNT, String.valueOf(hatchCcvCountryOptions.countries.size()))));
    }

    public final void logFormOutcome(HatchCcvFormOutcome hatchCcvFormOutcome, String str, HatchCheckoutUnavailableReason hatchCheckoutUnavailableReason) {
        AnonymousClass003.A0u(hatchCcvFormOutcome, str);
        String eventType = hatchCcvFormOutcome.getEventType();
        HatchComponent hatchComponent = HatchComponent.AGE_CONFIRMATION_OUTCOME;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put(HatchMetadataKey.RESULT.getValue(), hatchCcvFormOutcome.getResult());
        c0924AIaA0u.put(HatchCcvLoggingKt.KEY_BILLING_COUNTRY, str);
        if (hatchCheckoutUnavailableReason != null) {
            c0924AIaA0u.put(HatchMetadataKey.FAILURE_REASON.getValue(), hatchCheckoutUnavailableReason.name());
        }
        log(HatchCcvLoggingKt.EVENT_FORM_OUTCOME, eventType, hatchComponent, AIW.A0K(c0924AIaA0u));
    }

    public final void logThreeDSStepUpAttempt(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        log(HatchCcvLoggingKt.EVENT_THREE_DS_STEP_UP, HatchCcvLoggingKt.EVENT_TYPE_ATTEMPT, HatchComponent.CCV_THREE_DS_CHALLENGE, threeDSMetadata(str, str2));
    }

    public final void logValidationRejected(String str, List<? extends HatchCardFieldError> list, HatchPostalValidationRule hatchPostalValidationRule) {
        AnonymousClass003.A0u(str, list);
        Iterator<? extends HatchCardFieldError> it = list.iterator();
        while (it.hasNext()) {
            HxE<String, String> fieldAndReason = HatchCcvLoggingKt.toFieldAndReason(it.next());
            INSTANCE.logValidation(str, fieldAndReason.first, fieldAndReason.second);
        }
        if (hatchPostalValidationRule != null) {
            INSTANCE.logValidation(str, "zip", hatchPostalValidationRule.type.getWireValue());
        }
    }
}
