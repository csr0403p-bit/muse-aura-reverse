package com.facebook.aura.analytics.hatch.caa;

import X.AGH;
import X.AIW;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C0924AIa;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C3mZ;
import X.C3ma;
import X.C7384Etj;
import X.C7526EzK;
import X.CFK;
import X.Eu1;
import com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext;
import com.facebook.aura.analytics.hatch.caa.HatchCaaCore;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import java.util.Map;

/* loaded from: classes2.dex */
public final class HatchCaaLoginLogger {
    public static final HatchCaaLoginLogger INSTANCE = new HatchCaaLoginLogger();

    public final class PasswordSavingAnswer {
        public final String flowWireValue;
        public final boolean isChecked;
        public final HatchCaaLoginEventStep step;

        public PasswordSavingAnswer(HatchCaaLoginEventStep hatchCaaLoginEventStep, boolean z, boolean z2) {
            C7384Etj.A0Y(hatchCaaLoginEventStep, 0);
            this.step = hatchCaaLoginEventStep;
            this.isChecked = z;
            this.flowWireValue = HatchCaaLoginLogger.INSTANCE.passwordSavingFlowWireValue(hatchCaaLoginEventStep, z2);
        }

        public final String getFlowWireValue$fbandroid_express_aura_java_com_facebook_aura_analytics_hatch_caa_caa() {
            return this.flowWireValue;
        }

        public final HatchCaaLoginEventStep getStep$fbandroid_express_aura_java_com_facebook_aura_analytics_hatch_caa_caa() {
            return this.step;
        }

        public final boolean isChecked$fbandroid_express_aura_java_com_facebook_aura_analytics_hatch_caa_caa() {
            return this.isChecked;
        }
    }

    private final void log(HatchCaaLoginEvent hatchCaaLoginEvent, HatchCaaLoginEventCategory hatchCaaLoginEventCategory, HatchCaaLoginEventStep hatchCaaLoginEventStep, String str, Map<String, String> map, String str2, HatchCaaFailure hatchCaaFailure, String str3) {
        Integer num;
        String strFlowWireValueFor = str2;
        HatchCaaCore.Companion companion = HatchCaaCore.Companion;
        String value = hatchCaaLoginEvent.getValue();
        String value2 = hatchCaaLoginEventCategory.getValue();
        if (str2 == null) {
            strFlowWireValueFor = flowWireValueFor(hatchCaaLoginEventStep, null);
        }
        HatchCaaCore hatchCaaCoreCreate = companion.create(value, value2, strFlowWireValueFor, hatchCaaLoginEventStep.getValue(), AGH.A02(map, landingSsoSourceData(hatchCaaLoginEvent)), hatchCaaFailure != null ? hatchCaaFailure.accountErrorType : null);
        try {
            Eu1 eu1AcquireEvent = C3cH.A0I().acquireEvent("caa_login_client_events_rl", C7526EzK.A02);
            if (!eu1AcquireEvent.isSampled()) {
                CFK.A0H("HatchCaaLogging", "dropped, not sampled: %s", hatchCaaCoreCreate.describe());
                return;
            }
            C3ma c3ma = new C3ma();
            C3cJ.A0c(c3ma, hatchCaaCoreCreate, str);
            c3ma.A05("exception_type", hatchCaaFailure != null ? hatchCaaFailure.exceptionType : null);
            c3ma.A04("exception_code", (hatchCaaFailure == null || (num = hatchCaaFailure.exceptionCode) == null) ? null : Long.valueOf(num.intValue()));
            c3ma.A05("exception_message", hatchCaaFailure != null ? hatchCaaFailure.exceptionMessage : null);
            c3ma.A05("logged_in_identifier", str3);
            eu1AcquireEvent.A3z(c3ma, "core");
            eu1AcquireEvent.A3z(new C3mZ(), "login_params");
            eu1AcquireEvent.APu();
            if (hatchCaaFailure != null) {
                CFK.A02(hatchCaaCoreCreate.describe(), hatchCaaFailure.describe(), "HatchCaaLogging", "logged %s %s");
            }
        } catch (Exception e) {
            C3cH.A1B("failed to log ", hatchCaaCoreCreate.describe(), "HatchCaaLogging", e);
        }
    }

    private final void logPasswordSaving(HatchCaaLoginEvent hatchCaaLoginEvent, HatchCaaLoginEventCategory hatchCaaLoginEventCategory, HatchCaaLoginEventStep hatchCaaLoginEventStep, String str, boolean z, Map<String, String> map) {
        log(hatchCaaLoginEvent, hatchCaaLoginEventCategory, hatchCaaLoginEventStep, str, map, passwordSavingFlowWireValue(hatchCaaLoginEventStep, z), null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String passwordSavingFlowWireValue(HatchCaaLoginEventStep hatchCaaLoginEventStep, boolean z) {
        return z ? registrationFlowWireValue(null) : flowWireValueFor(hatchCaaLoginEventStep, null);
    }

    public final void logAymhPageShownPerAccount(String str, HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts, boolean z, String str2) {
        C7384Etj.A0Y(str2, 3);
        logLandingEvent(HatchCaaLoginEvent.AYMH_PAGE_SHOWN_PER_ACCOUNT, HatchCaaLoginEventCategory.IMPRESSION, str, landingData(ssoSourceCounts, null, Boolean.valueOf(z), str2), null);
    }

    public final void logAymhProfileLoadFailed(String str, HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts, int i, HatchCaaFailure hatchCaaFailure) {
        C7384Etj.A0Y(hatchCaaFailure, 3);
        logLandingEvent(HatchCaaLoginEvent.AYMH_PROFILE_LOAD_FAILED, HatchCaaLoginEventCategory.LANDING_PAGE_INIT, str, landingData(ssoSourceCounts, Integer.valueOf(i), null, null), hatchCaaFailure);
    }

    public final void logCredentialLoginStart(String str, HatchCaaLoginEventStep hatchCaaLoginEventStep, HatchCaaLoginSource hatchCaaLoginSource, HatchCaaLoginCredentialType hatchCaaLoginCredentialType) {
        C7384Etj.A0Y(hatchCaaLoginEventStep, 1);
        log(HatchCaaLoginEvent.LOGIN_START, HatchCaaLoginEventCategory.LOGIN_HOME_PAGE_INIT, hatchCaaLoginEventStep, str, attribution(hatchCaaLoginSource, hatchCaaLoginCredentialType, null), flowWireValueFor(hatchCaaLoginEventStep, hatchCaaLoginSource), null, null);
    }

    public final void logLoginAttempt(String str, HatchCaaLoginEventStep hatchCaaLoginEventStep, HatchCaaLoginCredentialType hatchCaaLoginCredentialType, HatchCaaLoginSource hatchCaaLoginSource) {
        C7384Etj.A0Y(hatchCaaLoginEventStep, 1);
        HatchCaaLoginEvent hatchCaaLoginEvent = HatchCaaLoginEvent.LOGIN_ATTEMPT;
        HatchCaaLoginEventCategory hatchCaaLoginEventCategory = HatchCaaLoginEventCategory.LOGIN_ATTEMPT;
        HatchCaaLoginSource hatchCaaLoginSourceLoginSourceFor = loginSourceFor(hatchCaaLoginEventStep, hatchCaaLoginSource);
        if (hatchCaaLoginSourceLoginSourceFor == null) {
            hatchCaaLoginSourceLoginSourceFor = HatchCaaLoginSource.LOGIN;
        }
        log(hatchCaaLoginEvent, hatchCaaLoginEventCategory, hatchCaaLoginEventStep, str, attribution(hatchCaaLoginSourceLoginSourceFor, hatchCaaLoginCredentialType, null), flowWireValueFor(hatchCaaLoginEventStep, hatchCaaLoginSource), null, null);
    }

    public final void logNtpLandingShownPerAccount(String str, HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts, boolean z, String str2) {
        C7384Etj.A0Y(str2, 3);
        logLandingEvent(HatchCaaLoginEvent.NTP_LANDING_SHOWN_PER_ACCOUNT, HatchCaaLoginEventCategory.LANDING_PAGE_INIT, str, landingData(ssoSourceCounts, null, Boolean.valueOf(z), str2), null);
    }

    public final void logOtpLoginButtonClicked(String str, HatchCaaFlowSource hatchCaaFlowSource) {
        C7384Etj.A0Y(hatchCaaFlowSource, 1);
        log(HatchCaaLoginEvent.LOGIN_BUTTON_CLICKED, HatchCaaLoginEventCategory.LOGIN_HOME_PAGE_INTERACTION, HatchCaaLoginEventStep.OTP, str, AnonymousClass007.A0d(HatchCaaEnumsKt.FLOW_SOURCE_KEY, hatchCaaFlowSource.getValue(), C3cG.A0r(HatchCaaEnumsKt.LOGIN_CREDENTIAL_TYPE_KEY, HatchCaaLoginCredentialType.OTP.getValue())), null, null, null);
    }

    public final void logOtpLoginFailed(String str, HatchCaaFlowSource hatchCaaFlowSource, HatchCaaFailure hatchCaaFailure) {
        AnonymousClass003.A0x(hatchCaaFlowSource, hatchCaaFailure);
        log(HatchCaaLoginEvent.LOGIN_FAILED, HatchCaaLoginEventCategory.LOGIN_FAILURE, HatchCaaLoginEventStep.OTP, str, AGH.A02(AnonymousClass006.A10(HatchCaaEnumsKt.FLOW_SOURCE_KEY, hatchCaaFlowSource.getValue()), credentialAttribution(HatchCaaLoginCredentialType.OTP)), null, hatchCaaFailure, null);
    }

    public final void logOtpLoginSuccess(String str, HatchCaaFlowSource hatchCaaFlowSource, boolean z, String str2) {
        C7384Etj.A0Y(hatchCaaFlowSource, 1);
        log(HatchCaaLoginEvent.LOGIN_SUCCESS, HatchCaaLoginEventCategory.LOGIN_SUCCESS, HatchCaaLoginEventStep.OTP, str, AGH.A02(AnonymousClass007.A0d(HatchCaaEnumsKt.IS_TWO_FACTOR_KEY, String.valueOf(z), C3cG.A0r(HatchCaaEnumsKt.FLOW_SOURCE_KEY, hatchCaaFlowSource.getValue())), credentialAttribution(HatchCaaLoginCredentialType.OTP)), null, null, str2);
    }

    public final void logOtpPageShown(String str, HatchCaaFlowSource hatchCaaFlowSource) {
        C7384Etj.A0Y(hatchCaaFlowSource, 1);
        log(HatchCaaLoginEvent.OTP_PAGE_SHOWN, HatchCaaLoginEventCategory.LOGIN_HOME_PAGE_INTERACTION, HatchCaaLoginEventStep.OTP, str, AnonymousClass006.A10(HatchCaaEnumsKt.FLOW_SOURCE_KEY, hatchCaaFlowSource.getValue()), null, null, null);
    }

    public final void logPasskeyAssertionFailure(HatchCaaFailure hatchCaaFailure) {
        C7384Etj.A0Y(hatchCaaFailure, 0);
        logPasskeyAssertion(HatchCaaLoginEvent.PASSKEY_LOGIN_ASSERTION_FAILURE, hatchCaaFailure);
    }

    public final void logPasswordLoginFailed(String str, HatchCaaFailure hatchCaaFailure) {
        C7384Etj.A0Y(hatchCaaFailure, 1);
        log(HatchCaaLoginEvent.LOGIN_FAILED, HatchCaaLoginEventCategory.LOGIN_FAILURE, HatchCaaLoginEventStep.PASSWORD, str, credentialAttribution(HatchCaaLoginCredentialType.PASSWORD), null, hatchCaaFailure, null);
    }

    public final void logPasswordSavingCheckboxToggled(String str, HatchCaaLoginEventStep hatchCaaLoginEventStep, boolean z, boolean z2) {
        C7384Etj.A0Y(hatchCaaLoginEventStep, 1);
        logPasswordSaving(HatchCaaLoginEvent.PASSWORD_SAVING_CHECKBOX_TOGGLED, HatchCaaLoginEventCategory.INTERACTION, hatchCaaLoginEventStep, str, z2, AnonymousClass006.A10(HatchCaaEnumsKt.IS_CHECKED_KEY, z ? "1" : HatchPriceImpressionEventDataKt.NO_DISCOUNT));
    }

    public final void logPasswordSavingDecision(String str, PasswordSavingAnswer passwordSavingAnswer) {
        C7384Etj.A0Y(passwordSavingAnswer, 1);
        log(passwordSavingAnswer.isChecked ? HatchCaaLoginEvent.PASSWORD_SAVING_OPT_IN : HatchCaaLoginEvent.PASSWORD_SAVING_OPT_OUT, HatchCaaLoginEventCategory.INTERACTION, passwordSavingAnswer.step, str, AGH.A0E(), passwordSavingAnswer.flowWireValue, null, null);
    }

    public final void logPasswordSavingStart(String str, HatchCaaLoginEventStep hatchCaaLoginEventStep, boolean z, boolean z2) {
        C7384Etj.A0Y(hatchCaaLoginEventStep, 1);
        logPasswordSaving(HatchCaaLoginEvent.PASSWORD_SAVING_START, HatchCaaLoginEventCategory.IMPRESSION, hatchCaaLoginEventStep, str, z2, AnonymousClass006.A10(HatchCaaEnumsKt.IS_CHECKED_KEY, z ? "1" : HatchPriceImpressionEventDataKt.NO_DISCOUNT));
    }

    public final void logRemoveProfileSubmitted(HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts, String str) {
        C7384Etj.A0Y(str, 1);
        logRemoveProfile(HatchCaaLoginEvent.REMOVE_PROFILE_SUBMITTED, removeProfileData(ssoSourceCounts, str, null), null);
    }

    public final void logRemoveProfileSuccess(HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts, String str, int i) {
        C7384Etj.A0Y(str, 1);
        logRemoveProfile(HatchCaaLoginEvent.REMOVE_PROFILE_SUCCESS, removeProfileData(ssoSourceCounts, str, Integer.valueOf(i)), null);
    }

    public final void logResendCodeClicked(String str, HatchCaaFlowSource hatchCaaFlowSource) {
        C7384Etj.A0Y(hatchCaaFlowSource, 1);
        log(HatchCaaLoginEvent.RESEND_CODE_CLICKED, HatchCaaLoginEventCategory.LOGIN_HOME_PAGE_INTERACTION, HatchCaaLoginEventStep.OTP, str, AnonymousClass006.A10(HatchCaaEnumsKt.FLOW_SOURCE_KEY, hatchCaaFlowSource.getValue()), null, null, null);
    }

    public final void logSessionLoginFailed(String str, HatchCaaLoginEventStep hatchCaaLoginEventStep, HatchCaaFailure hatchCaaFailure, HatchCaaLoginSource hatchCaaLoginSource, HatchCaaLoginCredentialType hatchCaaLoginCredentialType) {
        AnonymousClass003.A0x(hatchCaaLoginEventStep, hatchCaaFailure);
        log(HatchCaaLoginEvent.LOGIN_FAILED, HatchCaaLoginEventCategory.LOGIN_FAILURE, hatchCaaLoginEventStep, str, attribution(loginSourceFor(hatchCaaLoginEventStep, hatchCaaLoginSource), hatchCaaLoginCredentialType, null), flowWireValueFor(hatchCaaLoginEventStep, hatchCaaLoginSource), hatchCaaFailure, null);
    }

    public final void logSessionLoginSuccess(String str, String str2, HatchCaaLoginEventStep hatchCaaLoginEventStep, HatchCaaLoginSource hatchCaaLoginSource, HatchCaaLoginCredentialType hatchCaaLoginCredentialType, boolean z) {
        C7384Etj.A0Y(hatchCaaLoginEventStep, 2);
        log(HatchCaaLoginEvent.LOGIN_SUCCESS, HatchCaaLoginEventCategory.LOGIN_SUCCESS, hatchCaaLoginEventStep, str, attribution(loginSourceFor(hatchCaaLoginEventStep, hatchCaaLoginSource), hatchCaaLoginCredentialType, Boolean.valueOf(z)), flowWireValueFor(hatchCaaLoginEventStep, hatchCaaLoginSource), null, str2);
    }

    public final void logTwoFactorLoginFailed(String str, HatchCaaFailure hatchCaaFailure) {
        C7384Etj.A0Y(hatchCaaFailure, 1);
        log(HatchCaaLoginEvent.LOGIN_FAILED_2FA, HatchCaaLoginEventCategory.LOGIN_FAILURE, HatchCaaLoginEventStep.TWO_FAC_REDIRECT, str, AGH.A0E(), null, hatchCaaFailure, null);
    }

    public static /* synthetic */ Map attribution$default(HatchCaaLoginLogger hatchCaaLoginLogger, HatchCaaLoginSource hatchCaaLoginSource, HatchCaaLoginCredentialType hatchCaaLoginCredentialType, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = null;
        }
        return hatchCaaLoginLogger.attribution(hatchCaaLoginSource, hatchCaaLoginCredentialType, bool);
    }

    private final Map<String, String> credentialAttribution(HatchCaaLoginCredentialType hatchCaaLoginCredentialType) {
        return AnonymousClass007.A0d(HatchCaaEnumsKt.LOGIN_CREDENTIAL_TYPE_KEY, hatchCaaLoginCredentialType.getValue(), C3cG.A0r(HatchCaaEnumsKt.LOGIN_SOURCE_KEY, HatchCaaLoginSource.LOGIN.getValue()));
    }

    private final String flowWireValueFor(HatchCaaLoginEventStep hatchCaaLoginEventStep, HatchCaaLoginSource hatchCaaLoginSource) {
        HatchCaaEventFlow hatchCaaEventFlow;
        String str = HatchAuthFlowContext.INSTANCE.snapshot().loginFlow;
        if (hatchCaaLoginSource == HatchCaaLoginSource.SIGN_IN_WITH_GOOGLE_LOGIN) {
            hatchCaaEventFlow = HatchCaaEventFlow.LOGIN_SIGN_IN_WITH_GOOGLE;
        } else if (hatchCaaLoginEventStep == HatchCaaLoginEventStep.PASSKEY) {
            hatchCaaEventFlow = HatchCaaEventFlow.LOGIN_PASSKEY;
        } else if (hatchCaaLoginEventStep == HatchCaaLoginEventStep.LANDING) {
            if (str != null) {
                return str;
            }
            hatchCaaEventFlow = HatchCaaEventFlow.AYMH;
        } else {
            if (hatchCaaLoginEventStep != HatchCaaLoginEventStep.TWO_FAC_REDIRECT && hatchCaaLoginEventStep != HatchCaaLoginEventStep.TOS && str != null) {
                return str;
            }
            hatchCaaEventFlow = HatchCaaEventFlow.LOGIN_MANUAL;
        }
        return hatchCaaEventFlow.getValue();
    }

    public static /* synthetic */ Map landingData$default(HatchCaaLoginLogger hatchCaaLoginLogger, HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts, Integer num, Boolean bool, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        return hatchCaaLoginLogger.landingData(ssoSourceCounts, num, bool, str);
    }

    private final Map<String, String> landingSsoSourceData(HatchCaaLoginEvent hatchCaaLoginEvent) {
        HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts;
        if (hatchCaaLoginEvent != HatchCaaLoginEvent.LOGIN_SUCCESS || (ssoSourceCounts = HatchAuthFlowContext.INSTANCE.snapshot().landingSsoSource) == null) {
            return AGH.A0E();
        }
        C0924AIa c0924AIaA0u = C3cG.A0u();
        INSTANCE.putSsoSource(c0924AIaA0u, ssoSourceCounts);
        return AIW.A0K(c0924AIaA0u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void log$default(HatchCaaLoginLogger hatchCaaLoginLogger, HatchCaaLoginEvent hatchCaaLoginEvent, HatchCaaLoginEventCategory hatchCaaLoginEventCategory, HatchCaaLoginEventStep hatchCaaLoginEventStep, String str, Map map, String str2, HatchCaaFailure hatchCaaFailure, String str3, int i, Object obj) {
        if ((i & 16) != 0) {
            map = AGH.A0E();
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            hatchCaaFailure = null;
        }
        if ((i & 128) != 0) {
            str3 = null;
        }
        hatchCaaLoginLogger.log(hatchCaaLoginEvent, hatchCaaLoginEventCategory, hatchCaaLoginEventStep, str, map, str2, hatchCaaFailure, str3);
    }

    private final void logAccountSelectorEvent(HatchCaaLoginEvent hatchCaaLoginEvent, String str) {
        log(hatchCaaLoginEvent, HatchCaaLoginEventCategory.ACCOUNT_SELECTOR_PAGE_INTERACTION, HatchCaaLoginEventStep.ACCOUNT_SELECTOR, str, AGH.A0E(), null, null, null);
    }

    public static /* synthetic */ void logAymhLoginClicked$default(HatchCaaLoginLogger hatchCaaLoginLogger, String str, HatchCaaLoginCredentialType hatchCaaLoginCredentialType, HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchCaaLoginCredentialType = null;
        }
        if ((i & 4) != 0) {
            ssoSourceCounts = null;
        }
        hatchCaaLoginLogger.logAymhLoginClicked(str, hatchCaaLoginCredentialType, ssoSourceCounts);
    }

    public static /* synthetic */ void logAymhPageShown$default(HatchCaaLoginLogger hatchCaaLoginLogger, String str, HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts, Integer num, Boolean bool, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        hatchCaaLoginLogger.logAymhPageShown(str, ssoSourceCounts, num, bool, str2);
    }

    public static /* synthetic */ void logCredentialLoginStart$default(HatchCaaLoginLogger hatchCaaLoginLogger, String str, HatchCaaLoginEventStep hatchCaaLoginEventStep, HatchCaaLoginSource hatchCaaLoginSource, HatchCaaLoginCredentialType hatchCaaLoginCredentialType, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchCaaLoginEventStep = HatchCaaLoginEventStep.LANDING;
        }
        if ((i & 4) != 0) {
            hatchCaaLoginSource = null;
        }
        if ((i & 8) != 0) {
            hatchCaaLoginCredentialType = null;
        }
        hatchCaaLoginLogger.logCredentialLoginStart(str, hatchCaaLoginEventStep, hatchCaaLoginSource, hatchCaaLoginCredentialType);
    }

    private final void logGoogleCredentialManager(HatchCaaLoginEvent hatchCaaLoginEvent, String str) {
        log(hatchCaaLoginEvent, HatchCaaLoginEventCategory.GOOGLE_CREDENTIAL_MANAGER, HatchCaaLoginEventStep.CONTACTPOINT, str, AGH.A0E(), HatchCaaEventFlow.LOGIN_SIGN_IN_WITH_GOOGLE.getValue(), null, null);
    }

    private final void logLandingEvent(HatchCaaLoginEvent hatchCaaLoginEvent, HatchCaaLoginEventCategory hatchCaaLoginEventCategory, String str, Map<String, String> map, HatchCaaFailure hatchCaaFailure) {
        log(hatchCaaLoginEvent, hatchCaaLoginEventCategory, HatchCaaLoginEventStep.LANDING, str, map, HatchCaaEventFlow.LOGIN.getValue(), hatchCaaFailure, null);
    }

    public static /* synthetic */ void logLandingEvent$default(HatchCaaLoginLogger hatchCaaLoginLogger, HatchCaaLoginEvent hatchCaaLoginEvent, HatchCaaLoginEventCategory hatchCaaLoginEventCategory, String str, Map map, HatchCaaFailure hatchCaaFailure, int i, Object obj) {
        Map<String, String> mapA0o = C3cH.A0o(map, i & 8);
        if ((i & 16) != 0) {
            hatchCaaFailure = null;
        }
        hatchCaaLoginLogger.logLandingEvent(hatchCaaLoginEvent, hatchCaaLoginEventCategory, str, mapA0o, hatchCaaFailure);
    }

    public static /* synthetic */ void logLoginAttempt$default(HatchCaaLoginLogger hatchCaaLoginLogger, String str, HatchCaaLoginEventStep hatchCaaLoginEventStep, HatchCaaLoginCredentialType hatchCaaLoginCredentialType, HatchCaaLoginSource hatchCaaLoginSource, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchCaaLoginCredentialType = null;
        }
        if ((i & 8) != 0) {
            hatchCaaLoginSource = null;
        }
        hatchCaaLoginLogger.logLoginAttempt(str, hatchCaaLoginEventStep, hatchCaaLoginCredentialType, hatchCaaLoginSource);
    }

    public static /* synthetic */ void logNtpLandingNext$default(HatchCaaLoginLogger hatchCaaLoginLogger, String str, HatchCaaLoginCredentialType hatchCaaLoginCredentialType, HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchCaaLoginCredentialType = null;
        }
        if ((i & 4) != 0) {
            ssoSourceCounts = null;
        }
        hatchCaaLoginLogger.logNtpLandingNext(str, hatchCaaLoginCredentialType, ssoSourceCounts);
    }

    public static /* synthetic */ void logNtpLandingStart$default(HatchCaaLoginLogger hatchCaaLoginLogger, String str, HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts, Integer num, Boolean bool, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        hatchCaaLoginLogger.logNtpLandingStart(str, ssoSourceCounts, num, bool, str2);
    }

    private final void logPasskeyAssertion(HatchCaaLoginEvent hatchCaaLoginEvent, HatchCaaFailure hatchCaaFailure) {
        HatchCaaLoginEventCategory hatchCaaLoginEventCategory = HatchCaaLoginEventCategory.PASSKEY;
        HatchCaaLoginEventStep hatchCaaLoginEventStep = HatchCaaLoginEventStep.PASSKEY;
        HatchAuthFlowContext.INSTANCE.snapshot();
        log(hatchCaaLoginEvent, hatchCaaLoginEventCategory, hatchCaaLoginEventStep, null, AGH.A0E(), HatchCaaEventFlow.LOGIN_PASSKEY.getValue(), hatchCaaFailure, null);
    }

    public static /* synthetic */ void logPasskeyAssertion$default(HatchCaaLoginLogger hatchCaaLoginLogger, HatchCaaLoginEvent hatchCaaLoginEvent, HatchCaaFailure hatchCaaFailure, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchCaaFailure = null;
        }
        hatchCaaLoginLogger.logPasskeyAssertion(hatchCaaLoginEvent, hatchCaaFailure);
    }

    private final void logRemoveProfile(HatchCaaLoginEvent hatchCaaLoginEvent, Map<String, String> map, HatchCaaFailure hatchCaaFailure) {
        log(hatchCaaLoginEvent, HatchCaaLoginEventCategory.INTERACTION, HatchCaaLoginEventStep.LANDING, null, map, HatchCaaEventFlow.AYMH.getValue(), hatchCaaFailure, null);
    }

    public static /* synthetic */ void logRemoveProfile$default(HatchCaaLoginLogger hatchCaaLoginLogger, HatchCaaLoginEvent hatchCaaLoginEvent, Map map, HatchCaaFailure hatchCaaFailure, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchCaaFailure = null;
        }
        hatchCaaLoginLogger.logRemoveProfile(hatchCaaLoginEvent, map, hatchCaaFailure);
    }

    public static /* synthetic */ void logSessionLoginFailed$default(HatchCaaLoginLogger hatchCaaLoginLogger, String str, HatchCaaLoginEventStep hatchCaaLoginEventStep, HatchCaaFailure hatchCaaFailure, HatchCaaLoginSource hatchCaaLoginSource, HatchCaaLoginCredentialType hatchCaaLoginCredentialType, int i, Object obj) {
        if ((i & 8) != 0) {
            hatchCaaLoginSource = null;
        }
        if ((i & 16) != 0) {
            hatchCaaLoginCredentialType = null;
        }
        hatchCaaLoginLogger.logSessionLoginFailed(str, hatchCaaLoginEventStep, hatchCaaFailure, hatchCaaLoginSource, hatchCaaLoginCredentialType);
    }

    public static /* synthetic */ void logSessionLoginSuccess$default(HatchCaaLoginLogger hatchCaaLoginLogger, String str, String str2, HatchCaaLoginEventStep hatchCaaLoginEventStep, HatchCaaLoginSource hatchCaaLoginSource, HatchCaaLoginCredentialType hatchCaaLoginCredentialType, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            hatchCaaLoginSource = null;
        }
        if ((i & 16) != 0) {
            hatchCaaLoginCredentialType = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        hatchCaaLoginLogger.logSessionLoginSuccess(str, str2, hatchCaaLoginEventStep, hatchCaaLoginSource, hatchCaaLoginCredentialType, z);
    }

    public static /* synthetic */ void logSignupLoginSuccess$default(HatchCaaLoginLogger hatchCaaLoginLogger, String str, String str2, HatchCaaEventFlow hatchCaaEventFlow, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchCaaEventFlow = null;
        }
        hatchCaaLoginLogger.logSignupLoginSuccess(str, str2, hatchCaaEventFlow);
    }

    private final void logTwoFactorEvent(HatchCaaLoginEvent hatchCaaLoginEvent, HatchCaaLoginEventCategory hatchCaaLoginEventCategory, String str) {
        log(hatchCaaLoginEvent, hatchCaaLoginEventCategory, HatchCaaLoginEventStep.TWO_FAC_REDIRECT, str, AGH.A0E(), null, null, null);
    }

    private final HatchCaaLoginSource loginSourceFor(HatchCaaLoginEventStep hatchCaaLoginEventStep, HatchCaaLoginSource hatchCaaLoginSource) {
        if (hatchCaaLoginSource != null) {
            return hatchCaaLoginSource;
        }
        HatchCaaLoginSource hatchCaaLoginSource2 = HatchCaaLoginSource.ACCOUNTS_YOU_MAY_HAVE;
        if (hatchCaaLoginEventStep != HatchCaaLoginEventStep.LANDING) {
            return null;
        }
        return hatchCaaLoginSource2;
    }

    private final void putSsoSource(Map<String, String> map, HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts) {
        map.put(HatchCaaEnumsKt.SSO_SOURCE_KEY, ssoSourceCounts.ssoSource);
        map.put(HatchCaaEnumsKt.RL_SSO_SOURCE_KEY, ssoSourceCounts.rlSsoSource);
    }

    private final String registrationFlowWireValue(HatchCaaEventFlow hatchCaaEventFlow) {
        String value;
        if (hatchCaaEventFlow != null && (value = hatchCaaEventFlow.getValue()) != null) {
            return value;
        }
        String str = HatchAuthFlowContext.INSTANCE.snapshot().registrationFlow;
        return str == null ? HatchCaaEventFlow.NEW_TO_META.getValue() : str;
    }

    public static /* synthetic */ Map removeProfileData$default(HatchCaaLoginLogger hatchCaaLoginLogger, HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts, String str, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        return hatchCaaLoginLogger.removeProfileData(ssoSourceCounts, str, num);
    }

    private final String toWireFlag(boolean z) {
        return z ? "1" : HatchPriceImpressionEventDataKt.NO_DISCOUNT;
    }

    public final void logAccountSelected(String str) {
        logAccountSelectorEvent(HatchCaaLoginEvent.ACCOUNT_SELECTED, str);
    }

    public final void logAccountSelectionLoginSuccess(String str, boolean z, String str2) {
        log(HatchCaaLoginEvent.LOGIN_SUCCESS, HatchCaaLoginEventCategory.LOGIN_SUCCESS, HatchCaaLoginEventStep.ACCOUNT_SELECTOR, str, AnonymousClass006.A10(HatchCaaEnumsKt.IS_TWO_FACTOR_KEY, String.valueOf(z)), null, null, str2);
    }

    public final void logAccountSelectorBack(String str) {
        logAccountSelectorEvent(HatchCaaLoginEvent.ACCOUNT_SELECTOR_BACK, str);
    }

    public final void logAccountSelectorPageShown(String str) {
        logAccountSelectorEvent(HatchCaaLoginEvent.ACCOUNT_SELECTOR_PAGE_SHOWN, str);
    }

    public final void logAymhLogIntoAnotherAccountClicked(String str) {
        logLandingEvent(HatchCaaLoginEvent.AYMH_LOG_INTO_ANOTHER_ACCOUNT_CLICKED, HatchCaaLoginEventCategory.INTERACTION, str, AGH.A0E(), null);
    }

    public final void logAymhLoginClicked(String str, HatchCaaLoginCredentialType hatchCaaLoginCredentialType, HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts) {
        logLandingEvent(HatchCaaLoginEvent.AYMH_LOGIN_CLICKED, HatchCaaLoginEventCategory.INTERACTION, str, tapAttribution(hatchCaaLoginCredentialType, ssoSourceCounts), null);
    }

    public final void logAymhPageShown(String str, HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts, Integer num, Boolean bool, String str2) {
        logLandingEvent(HatchCaaLoginEvent.AYMH_PAGE_SHOWN, HatchCaaLoginEventCategory.IMPRESSION, str, landingData(ssoSourceCounts, num, bool, str2), null);
    }

    public final void logAymhScreenSkippedNoProfiles(String str, HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts, int i) {
        logLandingEvent(HatchCaaLoginEvent.AYMH_SCREEN_SKIPPED_NO_PROFILES, HatchCaaLoginEventCategory.LANDING_PAGE_INIT, str, landingData(ssoSourceCounts, Integer.valueOf(i), null, null), null);
    }

    public final void logContactPointContinueClicked(String str) {
        log(HatchCaaLoginEvent.CONTACTPOINT_CONTINUE_CLICKED, HatchCaaLoginEventCategory.CONTACTPOINT_PAGE_INTERACTION, HatchCaaLoginEventStep.CONTACTPOINT, str, AGH.A0E(), HatchCaaEventFlow.LOGIN_MANUAL.getValue(), null, null);
    }

    public final void logContactPointFocus() {
        log(HatchCaaLoginEvent.CONTACTPOINT_FOCUS, HatchCaaLoginEventCategory.CONTACTPOINT_PAGE_INTERACTION, HatchCaaLoginEventStep.CONTACTPOINT, null, AGH.A0E(), HatchCaaEventFlow.LOGIN_MANUAL.getValue(), null, null);
    }

    public final void logContactPointPageShown() {
        log(HatchCaaLoginEvent.CONTACTPOINT_PAGE_SHOWN, HatchCaaLoginEventCategory.CONTACTPOINT_PAGE_INTERACTION, HatchCaaLoginEventStep.CONTACTPOINT, null, AGH.A0E(), HatchCaaEventFlow.LOGIN_MANUAL.getValue(), null, null);
    }

    public final void logEnterPasswordInsteadClicked(String str) {
        log(HatchCaaLoginEvent.ENTER_PASSWORD_INSTEAD_BUTTON_CLICKED, HatchCaaLoginEventCategory.LOGIN_HOME_PAGE_INTERACTION, HatchCaaLoginEventStep.OTP, str, AGH.A0E(), null, null, null);
    }

    public final void logForgotPasswordButtonClicked(String str) {
        log(HatchCaaLoginEvent.FORGOT_PASSWORD_BUTTON_CLICKED, HatchCaaLoginEventCategory.LOGIN_HOME_PAGE_INTERACTION, HatchCaaLoginEventStep.PASSWORD, str, AGH.A0E(), null, null, null);
    }

    public final void logGoogleAccountSelected(String str) {
        logGoogleCredentialManager(HatchCaaLoginEvent.GOOGLE_ACCOUNT_SELECTED, str);
    }

    public final void logGoogleCredentialManagerLaunchAttempt() {
        logGoogleCredentialManager(HatchCaaLoginEvent.GOOGLE_CREDENTIAL_MANAGER_LAUNCH_ATTEMPT, null);
    }

    public final void logLoginStart(String str, HatchCaaFlowSource hatchCaaFlowSource) {
        HatchCaaLoginEvent hatchCaaLoginEvent = HatchCaaLoginEvent.LOGIN_START;
        HatchCaaLoginEventCategory hatchCaaLoginEventCategory = HatchCaaLoginEventCategory.LOGIN_HOME_PAGE_INIT;
        HatchCaaLoginEventStep hatchCaaLoginEventStep = HatchCaaLoginEventStep.CONTACTPOINT;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        if (hatchCaaFlowSource != null) {
            c0924AIaA0u.put(HatchCaaEnumsKt.FLOW_SOURCE_KEY, hatchCaaFlowSource.getValue());
        }
        log(hatchCaaLoginEvent, hatchCaaLoginEventCategory, hatchCaaLoginEventStep, str, AIW.A0K(c0924AIaA0u), null, null, null);
    }

    public final void logNtpLandingNext(String str, HatchCaaLoginCredentialType hatchCaaLoginCredentialType, HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts) {
        logLandingEvent(HatchCaaLoginEvent.NTP_LANDING_NEXT, HatchCaaLoginEventCategory.LANDING_PAGE_INIT, str, tapAttribution(hatchCaaLoginCredentialType, ssoSourceCounts), null);
    }

    public final void logNtpLandingStart(String str, HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts, Integer num, Boolean bool, String str2) {
        logLandingEvent(HatchCaaLoginEvent.NTP_LANDING_START, HatchCaaLoginEventCategory.LANDING_PAGE_INIT, str, landingData(ssoSourceCounts, num, bool, str2), null);
    }

    public final void logNtpLandingSwitchToLogin(String str) {
        logLandingEvent(HatchCaaLoginEvent.NTP_LANDING_SWITCH_TO_LOGIN, HatchCaaLoginEventCategory.LANDING_PAGE_INIT, str, AGH.A0E(), null);
    }

    public final void logPasskeyAssertionCancel() {
        logPasskeyAssertion(HatchCaaLoginEvent.PASSKEY_LOGIN_ASSERTION_CANCEL, null);
    }

    public final void logPasskeyAssertionSuccess() {
        logPasskeyAssertion(HatchCaaLoginEvent.PASSKEY_LOGIN_ASSERTION_SUCCESS, null);
    }

    public final void logPasskeyAssertionTriggered() {
        logPasskeyAssertion(HatchCaaLoginEvent.PASSKEY_LOGIN_ASSERTION_TRIGGERED, null);
    }

    public final void logPasswordLoginButtonClicked(String str) {
        log(HatchCaaLoginEvent.LOGIN_BUTTON_CLICKED, HatchCaaLoginEventCategory.LOGIN_HOME_PAGE_INTERACTION, HatchCaaLoginEventStep.PASSWORD, str, AnonymousClass006.A10(HatchCaaEnumsKt.LOGIN_CREDENTIAL_TYPE_KEY, HatchCaaLoginCredentialType.PASSWORD.getValue()), null, null, null);
    }

    public final void logPasswordLoginSuccess(String str, boolean z, String str2) {
        log(HatchCaaLoginEvent.LOGIN_SUCCESS, HatchCaaLoginEventCategory.LOGIN_SUCCESS, HatchCaaLoginEventStep.PASSWORD, str, AGH.A02(AnonymousClass006.A10(HatchCaaEnumsKt.IS_TWO_FACTOR_KEY, String.valueOf(z)), credentialAttribution(HatchCaaLoginCredentialType.PASSWORD)), null, null, str2);
    }

    public final void logPasswordPageShown(String str) {
        log(HatchCaaLoginEvent.PASSWORD_PAGE_SHOWN, HatchCaaLoginEventCategory.LOGIN_HOME_PAGE_INTERACTION, HatchCaaLoginEventStep.PASSWORD, str, AGH.A0E(), null, null, null);
    }

    public final void logRemoveProfileClicked(HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts) {
        logRemoveProfile(HatchCaaLoginEvent.REMOVE_PROFILE_CLICKED, removeProfileData(ssoSourceCounts, null, null), null);
    }

    public final void logSignupLoginSuccess(String str, String str2, HatchCaaEventFlow hatchCaaEventFlow) {
        log(HatchCaaLoginEvent.LOGIN_SUCCESS, HatchCaaLoginEventCategory.LOGIN_SUCCESS, HatchCaaLoginEventStep.TOS, str, AnonymousClass007.A0d(HatchCaaEnumsKt.LOGIN_SOURCE_KEY, HatchCaaLoginSource.REGISTRATION.getValue(), C3cG.A0r(HatchCaaEnumsKt.IS_TWO_FACTOR_KEY, "false")), registrationFlowWireValue(hatchCaaEventFlow), null, str2);
    }

    public final void logTwoFactorConfirmNextClicked(String str) {
        logTwoFactorEvent(HatchCaaLoginEvent.TWO_FAC_CONFIRM_NEXT_CLICKED, HatchCaaLoginEventCategory.INTERACTION, str);
    }

    public final void logTwoFactorConfirmPageShown(String str) {
        logTwoFactorEvent(HatchCaaLoginEvent.TWO_FAC_CONFIRM_PAGE_SHOWN, HatchCaaLoginEventCategory.IMPRESSION, str);
    }

    public final void logTwoFactorLoginSuccess(String str, String str2) {
        log(HatchCaaLoginEvent.LOGIN_SUCCESS_2FA, HatchCaaLoginEventCategory.LOGIN_SUCCESS, HatchCaaLoginEventStep.TWO_FAC_REDIRECT, str, AGH.A0E(), null, null, str2);
    }

    public final void logTwoFactorNextClicked(String str) {
        logTwoFactorEvent(HatchCaaLoginEvent.TWO_FAC_NEXT_CLICKED, HatchCaaLoginEventCategory.INTERACTION, str);
    }

    public final void logTwoFactorPageShown(String str) {
        logTwoFactorEvent(HatchCaaLoginEvent.TWO_FAC_PAGE_SHOWN, HatchCaaLoginEventCategory.IMPRESSION, str);
    }

    private final Map<String, String> attribution(HatchCaaLoginSource hatchCaaLoginSource, HatchCaaLoginCredentialType hatchCaaLoginCredentialType, Boolean bool) {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        if (bool != null) {
            C3cI.A1K(HatchCaaEnumsKt.IS_TWO_FACTOR_KEY, c0924AIaA0u, bool.booleanValue());
        }
        if (hatchCaaLoginSource != null) {
            c0924AIaA0u.put(HatchCaaEnumsKt.LOGIN_SOURCE_KEY, hatchCaaLoginSource.getValue());
        }
        if (hatchCaaLoginCredentialType != null) {
            c0924AIaA0u.put(HatchCaaEnumsKt.LOGIN_CREDENTIAL_TYPE_KEY, hatchCaaLoginCredentialType.getValue());
        }
        return AIW.A0K(c0924AIaA0u);
    }

    private final Map<String, String> landingData(HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts, Integer num, Boolean bool, String str) {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        if (ssoSourceCounts != null) {
            INSTANCE.putSsoSource(c0924AIaA0u, ssoSourceCounts);
        }
        if (num != null) {
            c0924AIaA0u.put(HatchCaaEnumsKt.NUM_ACCOUNTS_KEY, String.valueOf(num.intValue()));
        }
        if (bool != null) {
            c0924AIaA0u.put(HatchCaaEnumsKt.HAS_HATCH_KEY, bool.booleanValue() ? "1" : HatchPriceImpressionEventDataKt.NO_DISCOUNT);
        }
        if (str != null) {
            c0924AIaA0u.put(HatchCaaEnumsKt.IMPRESSION_ID_KEY, str);
        }
        return AIW.A0K(c0924AIaA0u);
    }

    private final Map<String, String> removeProfileData(HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts, String str, Integer num) {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        if (ssoSourceCounts != null) {
            INSTANCE.putSsoSource(c0924AIaA0u, ssoSourceCounts);
        }
        if (str != null) {
            c0924AIaA0u.put(HatchCaaEnumsKt.REMOVE_STAGE_KEY, str);
        }
        if (num != null) {
            c0924AIaA0u.put(HatchCaaEnumsKt.NUM_REMAINING_PROFILES_KEY, String.valueOf(num.intValue()));
        }
        return AIW.A0K(c0924AIaA0u);
    }

    private final Map<String, String> tapAttribution(HatchCaaLoginCredentialType hatchCaaLoginCredentialType, HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts) {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        if (hatchCaaLoginCredentialType != null) {
            c0924AIaA0u.put(HatchCaaEnumsKt.LOGIN_CREDENTIAL_TYPE_KEY, hatchCaaLoginCredentialType.getValue());
        }
        if (ssoSourceCounts != null) {
            c0924AIaA0u.put(HatchCaaEnumsKt.NTP_SOURCE_PLATFORM_KEY, ssoSourceCounts.ssoSource);
            c0924AIaA0u.put(HatchCaaEnumsKt.RL_SSO_SOURCE_KEY, ssoSourceCounts.rlSsoSource);
        }
        return AIW.A0K(c0924AIaA0u);
    }

    public final void logRemoveProfileFailure(HatchAuthFlowContext.SsoSourceCounts ssoSourceCounts, String str, HatchCaaFailure hatchCaaFailure) {
        AnonymousClass003.A0x(str, hatchCaaFailure);
        logRemoveProfile(HatchCaaLoginEvent.REMOVE_PROFILE_FAILURE, removeProfileData(ssoSourceCounts, str, null), hatchCaaFailure);
    }
}
