package com.facebook.aura.partners.accountlinking.nativeauthlogging;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV5;
import X.C31u;
import X.C3cG;
import X.C4992DKo;
import X.C7384Etj;
import X.C7462Ewq;
import X.C7491Exw;
import X.C7BY;
import X.ENw;
import X.EP0;
import X.EP1;
import X.EPL;
import X.EPM;
import X.EPY;
import X.EPi;
import X.HxE;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MC;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class MAHatchNativeAuthAppStartLoggerKt {
    public static final String LAST_LOGGED_AT_MS_KEY = "last_logged_at_ms";
    public static final String LOG_LOCATION = "hatch_android_native_auth_app_start_logging";
    public static final int MAX_ACCOUNTS = 50;
    public static final String SOURCE_APP_FACEBOOK = "facebook";
    public static final String SOURCE_APP_INSTAGRAM = "instagram";
    public static final String SOURCE_APP_MESSENGER = "messenger";
    public static final String SOURCE_APP_THREADS = "threads";
    public static final String STAGE_API_REQUEST = "api_request";
    public static final String STAGE_LAUNCH = "launch";
    public static final String STAGE_V1_FETCH = "v1_fetch";
    public static final String STAGE_V1_THREADS_FETCH = "v1_threads_fetch";
    public static final String STAGE_V2_FETCH = "v2_fetch";
    public static final String STAGE_WA_ELIGIBILITY_FETCH = "wa_eligibility_fetch";
    public static final String STAGE_WORKER = "worker";
    public static final String TAG = "MAHatchNativeAuthAppStartLogger";
    public static final String WA_LINKING_ELIGIBILITY_CALLER_NAME = "waffle_fx_product_wa_linking_eligibility";
    public static final String WORK_NAME = "ma_hatch_native_auth_app_start_logging";
    public static final C31u cooldownDays$delegate;
    public static final C31u isLoggingEnabled$delegate;
    public static final C31u isLoggingStillEnabled$delegate;
    public static final C31u isWaEligibilityFetchEnabled$delegate;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(MAHatchNativeAuthAppStartLoggerKt.class, "isLoggingEnabled", "isLoggingEnabled()Z", 1), new C7462Ewq(MAHatchNativeAuthAppStartLoggerKt.class, "isLoggingStillEnabled", "isLoggingStillEnabled()Z", 1), new C7462Ewq(MAHatchNativeAuthAppStartLoggerKt.class, "cooldownDays", "getCooldownDays()J", 1), new C7462Ewq(MAHatchNativeAuthAppStartLoggerKt.class, "isWaEligibilityFetchEnabled", "isWaEligibilityFetchEnabled()Z", 1)};
    public static final String ACTIVE_ACCOUNT = "active_account";
    public static final String INACTIVE_LOGGED_IN_ACCOUNTS = "inactive_logged_in_accounts";
    public static final String SAVED_ACCOUNTS = "saved_accounts";
    public static final List<String> CREDENTIAL_PRIORITY = BV5.A12(ACTIVE_ACCOUNT, INACTIVE_LOGGED_IN_ACCOUNTS, SAVED_ACCOUNTS);
    public static final List<EPL> LEGACY_SSO_SOURCES = Arrays.asList(EPL.A05, EPL.A06, EPL.A08, EPL.A0G, EPL.A0D, EPL.A0E);

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[EP1.values().length];
            try {
                AnonymousClass005.A0v(EP1.A03, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(EP1.A04, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(EP1.A05, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EPM.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[10] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[5] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[7] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[8] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EPi.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[2] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        C7491Exw c7491Exw = MC.xe_growth_hatch_abra_config.use_app_backgrounded_native_auth_logging_android;
        isLoggingEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(c7491Exw);
        C4992DKo c4992DKo = C4992DKo.A06;
        C7384Etj.A0V(c4992DKo);
        AnonymousClass003.A0u(c7491Exw, c4992DKo);
        isLoggingStillEnabled$delegate = new AuraMobileConfigDelegatesKt.C126951(c7491Exw, c4992DKo);
        cooldownDays$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigLong(MC.xe_growth_hatch_abra_config.app_backgrounded_native_auth_logging_cooldown_days_android);
        isWaEligibilityFetchEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.xe_growth_hatch_abra_config.app_backgrounded_native_auth_logging_fetch_wa_eligibility_android);
    }

    public static final long getCooldownDays() {
        return C3cG.A05(cooldownDays$delegate.getValue(null, $$delegatedProperties[2]));
    }

    public static final boolean isLoggingEnabled() {
        return AnonymousClass001.A1X(C31u.A00(isLoggingEnabled$delegate, $$delegatedProperties));
    }

    public static final boolean isLoggingStillEnabled() {
        return BV5.A1W(isLoggingStillEnabled$delegate, $$delegatedProperties, 1);
    }

    public static final boolean isWaEligibilityFetchEnabled() {
        return BV5.A1W(isWaEligibilityFetchEnabled$delegate, $$delegatedProperties, 3);
    }

    public static final HxE<String, NativeAuthAccountJson> toAccountJson(ENw eNw) {
        String str;
        String str2;
        EP0 ep0 = eNw.A03;
        if (ep0 == EP0.A07 || ep0 == EP0.A08) {
            str = SOURCE_APP_FACEBOOK;
        } else if (ep0 == EP0.A0C) {
            str = "messenger";
        } else if (EP0.A03.contains(ep0)) {
            str = SOURCE_APP_INSTAGRAM;
        } else {
            if (ep0 != EP0.A0F) {
                return null;
            }
            str = SOURCE_APP_THREADS;
        }
        int iOrdinal = eNw.A04.ordinal();
        if (iOrdinal == 0) {
            str2 = ACTIVE_ACCOUNT;
        } else if (iOrdinal == 1) {
            str2 = INACTIVE_LOGGED_IN_ACCOUNTS;
        } else {
            if (iOrdinal != 2) {
                throw C3cG.A0q();
            }
            str2 = SAVED_ACCOUNTS;
        }
        return accountJson(eNw.A02, str, str2, eNw.A01);
    }

    public static final HxE<String, NativeAuthAccountJson> accountJson(String str, String str2, String str3, String str4) {
        if (C7BY.A0j(str) || C7BY.A0j(str4)) {
            return null;
        }
        return C3cG.A0r(str, new NativeAuthAccountJson(str2, str3, str4));
    }

    public static final HxE<String, NativeAuthAccountJson> toAccountJson(EPY epy) {
        String str;
        String str2;
        switch (epy.A05.ordinal()) {
            case 0:
            case 1:
            case 2:
                str = SOURCE_APP_FACEBOOK;
                break;
            case 3:
            case 4:
            case 6:
            case 9:
            default:
                return null;
            case 5:
            case 7:
                str = SOURCE_APP_INSTAGRAM;
                break;
            case 8:
                str = SOURCE_APP_THREADS;
                break;
            case 10:
                str = "messenger";
                break;
        }
        int iOrdinal = epy.A06.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 1 && iOrdinal != 3) {
                    throw C3cG.A0q();
                }
                str2 = INACTIVE_LOGGED_IN_ACCOUNTS;
            } else {
                str2 = SAVED_ACCOUNTS;
            }
        } else {
            str2 = ACTIVE_ACCOUNT;
        }
        return accountJson(epy.A03, str, str2, epy.A02);
    }
}
