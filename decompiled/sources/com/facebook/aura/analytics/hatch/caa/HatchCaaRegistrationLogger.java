package com.facebook.aura.analytics.hatch.caa;

import X.AGH;
import X.AIW;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C0924AIa;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C3mb;
import X.C3mc;
import X.C4ln;
import X.C7384Etj;
import X.C7526EzK;
import X.C8ee;
import X.C9tI;
import X.CFK;
import X.Eu1;
import X.FGI;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.analytics.AuraLogger;
import com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext;
import com.facebook.aura.analytics.hatch.caa.HatchCaaCore;
import java.util.Map;

/* loaded from: classes2.dex */
public final class HatchCaaRegistrationLogger {
    public static final HatchCaaRegistrationLogger INSTANCE = new HatchCaaRegistrationLogger();

    private final C4ln accountType(HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
        int iOrdinal;
        if (hatchCaaNtpSourcePlatform == null || (iOrdinal = hatchCaaNtpSourcePlatform.ordinal()) == -1) {
            return null;
        }
        if (iOrdinal == 0) {
            return C4ln.FACEBOOK;
        }
        if (iOrdinal == 1) {
            return C4ln.INSTAGRAM;
        }
        if (iOrdinal == 2) {
            return C4ln.FRL;
        }
        if (iOrdinal == 3) {
            return C4ln.WHATSAPP;
        }
        throw C3cG.A0q();
    }

    public final void logConfirmationFailure(String str, HatchCaaFlowSource hatchCaaFlowSource, HatchCaaFailure hatchCaaFailure, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
        AnonymousClass003.A0x(hatchCaaFlowSource, hatchCaaFailure);
        logConfirmation(HatchCaaRegistrationState.CONFIRMATION_FAILURE, str, hatchCaaFlowSource, hatchCaaFailure, null, null, hatchCaaNtpSourcePlatform, C3cH.A0I());
    }

    public final void logConfirmationNext(String str, HatchCaaFlowSource hatchCaaFlowSource, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
        C7384Etj.A0Y(hatchCaaFlowSource, 1);
        logConfirmation(HatchCaaRegistrationState.CONFIRMATION_NEXT, str, hatchCaaFlowSource, null, null, null, hatchCaaNtpSourcePlatform, C3cH.A0I());
    }

    public final void logConfirmationResendCodeClicked(String str, HatchCaaFlowSource hatchCaaFlowSource, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
        C7384Etj.A0Y(hatchCaaFlowSource, 1);
        logConfirmation(HatchCaaRegistrationState.CONFIRMATION_RESEND_CODE_CLICKED, str, hatchCaaFlowSource, null, null, null, hatchCaaNtpSourcePlatform, C3cH.A0I());
    }

    public final void logConfirmationStart(String str, HatchCaaFlowSource hatchCaaFlowSource, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
        C7384Etj.A0Y(hatchCaaFlowSource, 1);
        logConfirmation(HatchCaaRegistrationState.CONFIRMATION_START, str, hatchCaaFlowSource, null, null, null, hatchCaaNtpSourcePlatform, C3cH.A0I());
    }

    public final void logConfirmationSuccess(String str, HatchCaaFlowSource hatchCaaFlowSource, String str2, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, C8ee<C7526EzK> c8ee) {
        AnonymousClass002.A1C(hatchCaaFlowSource, 1, c8ee);
        logConfirmation(HatchCaaRegistrationState.CONFIRMATION_SUCCESS, str, hatchCaaFlowSource, null, str2 != null ? C9tI.A0s(str2) : null, str2, hatchCaaNtpSourcePlatform, c8ee);
    }

    public final void logCreateFailure(String str, HatchCaaEventFlow hatchCaaEventFlow, HatchCaaRegistrationSource hatchCaaRegistrationSource, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, HatchCaaFailure hatchCaaFailure) {
        C7384Etj.A0Y(hatchCaaFailure, 4);
        log(HatchCaaRegistrationState.CREATE_FAILURE, HatchCaaRegistrationEventStep.ACCOUNT_CREATION, str, hatchCaaEventFlow, extraClientData(hatchCaaRegistrationSource), null, HatchCaaRegistrationFunnel.REGISTRATION, hatchCaaFailure, null, hatchCaaNtpSourcePlatform, C3cH.A0I());
    }

    public final void logRegistrationStart(HatchCaaRegistrationEventStep hatchCaaRegistrationEventStep, String str, HatchCaaFlowSource hatchCaaFlowSource, HatchCaaEventFlow hatchCaaEventFlow, HatchCaaRegistrationSource hatchCaaRegistrationSource, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, HatchCaaNtmSwitchReason hatchCaaNtmSwitchReason) {
        C7384Etj.A0Y(hatchCaaRegistrationEventStep, 0);
        HatchCaaRegistrationState hatchCaaRegistrationState = HatchCaaRegistrationState.REGISTRATION_START;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        if (hatchCaaFlowSource != null) {
            c0924AIaA0u.put(HatchCaaEnumsKt.FLOW_SOURCE_KEY, hatchCaaFlowSource.getValue());
        }
        if (hatchCaaRegistrationSource != null) {
            c0924AIaA0u.put(HatchCaaEnumsKt.REGISTRATION_SOURCE_KEY, hatchCaaRegistrationSource.getValue());
        }
        if (hatchCaaNtmSwitchReason != null) {
            c0924AIaA0u.put(HatchCaaEnumsKt.NTM_SWITCH_REASON_KEY, hatchCaaNtmSwitchReason.getValue());
        }
        log(hatchCaaRegistrationState, hatchCaaRegistrationEventStep, str, hatchCaaEventFlow, AIW.A0K(c0924AIaA0u), null, HatchCaaRegistrationFunnel.REGISTRATION, null, null, hatchCaaNtpSourcePlatform, C3cH.A0I());
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchCaaNtpSourcePlatform.values().length];
            try {
                AnonymousClass002.A13(HatchCaaNtpSourcePlatform.FACEBOOK, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchCaaNtpSourcePlatform.INSTAGRAM, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchCaaNtpSourcePlatform.FRL, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchCaaNtpSourcePlatform.WHATSAPP, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Map<String, String> extraClientData(HatchCaaRegistrationSource hatchCaaRegistrationSource) {
        Map<String, String> mapA10;
        return (hatchCaaRegistrationSource == null || (mapA10 = AnonymousClass006.A10(HatchCaaEnumsKt.REGISTRATION_SOURCE_KEY, hatchCaaRegistrationSource.getValue())) == null) ? AGH.A0E() : mapA10;
    }

    private final Map<String, String> latchedRegistrationSource(HatchAuthFlowContext.State state) {
        Map<String, String> mapA10;
        String str = state.registrationSource;
        return (str == null || (mapA10 = AnonymousClass006.A10(HatchCaaEnumsKt.REGISTRATION_SOURCE_KEY, str)) == null) ? AGH.A0E() : mapA10;
    }

    private final void log(HatchCaaRegistrationState hatchCaaRegistrationState, HatchCaaRegistrationEventStep hatchCaaRegistrationEventStep, String str, HatchCaaEventFlow hatchCaaEventFlow, Map<String, String> map, Long l, HatchCaaRegistrationFunnel hatchCaaRegistrationFunnel, HatchCaaFailure hatchCaaFailure, String str2, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, C8ee<C7526EzK> c8ee) {
        String value;
        Integer num;
        HatchAuthFlowContext.State stateSnapshot = HatchAuthFlowContext.INSTANCE.snapshot();
        HatchCaaCore.Companion companion = HatchCaaCore.Companion;
        String eventName = hatchCaaRegistrationFunnel.getEventName();
        String value2 = hatchCaaRegistrationFunnel.getCategory().getValue();
        if ((hatchCaaEventFlow == null || (value = hatchCaaEventFlow.getValue()) == null) && (value = stateSnapshot.registrationFlow) == null) {
            value = HatchCaaEventFlow.NEW_TO_META.getValue();
        }
        HatchCaaCore hatchCaaCoreCreate = companion.create(eventName, value2, value, hatchCaaRegistrationEventStep.getValue(), AGH.A02(latchedRegistrationSource(stateSnapshot), map), hatchCaaFailure != null ? hatchCaaFailure.accountErrorType : null);
        try {
            Eu1 eu1AcquireEvent = c8ee.acquireEvent("caa_acquisition_client_events_rl", C7526EzK.A02);
            if (!eu1AcquireEvent.isSampled()) {
                CFK.A0H("HatchCaaLogging", "dropped, not sampled: state=%s %s", hatchCaaRegistrationState.getValue(), hatchCaaCoreCreate.describe());
                return;
            }
            C3mb c3mb = new C3mb();
            C3cJ.A0c(c3mb, hatchCaaCoreCreate, str);
            c3mb.A05("exception_type", hatchCaaFailure != null ? hatchCaaFailure.exceptionType : null);
            c3mb.A04("exception_code", (hatchCaaFailure == null || (num = hatchCaaFailure.exceptionCode) == null) ? null : Long.valueOf(num.intValue()));
            c3mb.A05("exception_message", hatchCaaFailure != null ? hatchCaaFailure.exceptionMessage : null);
            c3mb.A05("logged_in_identifier", str2);
            eu1AcquireEvent.A3z(c3mb, "core");
            C3mc c3mc = new C3mc();
            String str3 = hatchCaaCoreCreate.waterfallId;
            if (str3 == null) {
                str3 = "";
            }
            c3mc.A05("reg_instance", str3);
            c3mc.A04("created_userid", l);
            c3mc.A05("state", hatchCaaRegistrationState.getValue());
            c3mc.A05("entry_point", stateSnapshot.entryPoint);
            c3mc.A03(accountType(hatchCaaNtpSourcePlatform), HatchCaaEnumsKt.NTP_SOURCE_PLATFORM_KEY);
            eu1AcquireEvent.A3z(c3mc, "acquisition_client_params");
            eu1AcquireEvent.APu();
            if (hatchCaaFailure != null) {
                CFK.A01(hatchCaaRegistrationState.getValue(), hatchCaaCoreCreate.describe(), hatchCaaFailure.describe(), "HatchCaaLogging", "logged state=%s %s %s");
            }
        } catch (Exception e) {
            CFK.A08("HatchCaaLogging", FGI.A0d("failed to log state=", hatchCaaRegistrationState.getValue(), InviteCodeScratcherKt.CODE_SEPARATOR, hatchCaaCoreCreate.describe()), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void log$default(HatchCaaRegistrationLogger hatchCaaRegistrationLogger, HatchCaaRegistrationState hatchCaaRegistrationState, HatchCaaRegistrationEventStep hatchCaaRegistrationEventStep, String str, HatchCaaEventFlow hatchCaaEventFlow, Map map, Long l, HatchCaaRegistrationFunnel hatchCaaRegistrationFunnel, HatchCaaFailure hatchCaaFailure, String str2, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, C8ee c8ee, int i, Object obj) {
        if ((i & 8) != 0) {
            hatchCaaEventFlow = null;
        }
        Map mapA0o = C3cH.A0o(map, i & 16);
        if ((i & 32) != 0) {
            l = null;
        }
        if ((i & 64) != 0) {
            hatchCaaRegistrationFunnel = HatchCaaRegistrationFunnel.REGISTRATION;
        }
        if ((i & 128) != 0) {
            hatchCaaFailure = null;
        }
        if ((i & 256) != 0) {
            str2 = null;
        }
        if ((i & 512) != 0) {
            hatchCaaNtpSourcePlatform = null;
        }
        if ((i & 1024) != 0) {
            c8ee = C3cH.A0I();
        }
        hatchCaaRegistrationLogger.log(hatchCaaRegistrationState, hatchCaaRegistrationEventStep, str, hatchCaaEventFlow, mapA0o, l, hatchCaaRegistrationFunnel, hatchCaaFailure, str2, hatchCaaNtpSourcePlatform, c8ee);
    }

    private final void logAcOptIn(HatchCaaRegistrationState hatchCaaRegistrationState, String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
        log(hatchCaaRegistrationState, HatchCaaRegistrationEventStep.ACCOUNT_CENTER_OPT_IN, str, HatchCaaEventFlow.NEW_TO_PLATFORM, AGH.A0E(), null, HatchCaaRegistrationFunnel.REGISTRATION, null, null, hatchCaaNtpSourcePlatform, C3cH.A0I());
    }

    private final void logConfirmation(HatchCaaRegistrationState hatchCaaRegistrationState, String str, HatchCaaFlowSource hatchCaaFlowSource, HatchCaaFailure hatchCaaFailure, Long l, String str2, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, C8ee<C7526EzK> c8ee) {
        log(hatchCaaRegistrationState, HatchCaaRegistrationEventStep.CONFIRMATION, str, null, AnonymousClass006.A10(HatchCaaEnumsKt.FLOW_SOURCE_KEY, hatchCaaFlowSource.getValue()), l, HatchCaaRegistrationFunnel.CONFIRMATION, hatchCaaFailure, str2, hatchCaaNtpSourcePlatform, c8ee);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logConfirmation$default(HatchCaaRegistrationLogger hatchCaaRegistrationLogger, HatchCaaRegistrationState hatchCaaRegistrationState, String str, HatchCaaFlowSource hatchCaaFlowSource, HatchCaaFailure hatchCaaFailure, Long l, String str2, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, C8ee c8ee, int i, Object obj) {
        if ((i & 8) != 0) {
            hatchCaaFailure = null;
        }
        if ((i & 16) != 0) {
            l = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            hatchCaaNtpSourcePlatform = null;
        }
        if ((i & 128) != 0) {
            c8ee = C3cH.A0I();
        }
        hatchCaaRegistrationLogger.logConfirmation(hatchCaaRegistrationState, str, hatchCaaFlowSource, hatchCaaFailure, l, str2, hatchCaaNtpSourcePlatform, c8ee);
    }

    public static /* synthetic */ void logConfirmationFailure$default(HatchCaaRegistrationLogger hatchCaaRegistrationLogger, String str, HatchCaaFlowSource hatchCaaFlowSource, HatchCaaFailure hatchCaaFailure, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, int i, Object obj) {
        if ((i & 8) != 0) {
            hatchCaaNtpSourcePlatform = null;
        }
        hatchCaaRegistrationLogger.logConfirmationFailure(str, hatchCaaFlowSource, hatchCaaFailure, hatchCaaNtpSourcePlatform);
    }

    public static /* synthetic */ void logConfirmationNext$default(HatchCaaRegistrationLogger hatchCaaRegistrationLogger, String str, HatchCaaFlowSource hatchCaaFlowSource, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchCaaNtpSourcePlatform = null;
        }
        hatchCaaRegistrationLogger.logConfirmationNext(str, hatchCaaFlowSource, hatchCaaNtpSourcePlatform);
    }

    public static /* synthetic */ void logConfirmationResendCodeClicked$default(HatchCaaRegistrationLogger hatchCaaRegistrationLogger, String str, HatchCaaFlowSource hatchCaaFlowSource, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchCaaNtpSourcePlatform = null;
        }
        hatchCaaRegistrationLogger.logConfirmationResendCodeClicked(str, hatchCaaFlowSource, hatchCaaNtpSourcePlatform);
    }

    public static /* synthetic */ void logConfirmationStart$default(HatchCaaRegistrationLogger hatchCaaRegistrationLogger, String str, HatchCaaFlowSource hatchCaaFlowSource, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchCaaNtpSourcePlatform = null;
        }
        hatchCaaRegistrationLogger.logConfirmationStart(str, hatchCaaFlowSource, hatchCaaNtpSourcePlatform);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logConfirmationSuccess$default(HatchCaaRegistrationLogger hatchCaaRegistrationLogger, String str, HatchCaaFlowSource hatchCaaFlowSource, String str2, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, C8ee c8ee, int i, Object obj) {
        if ((i & 8) != 0) {
            hatchCaaNtpSourcePlatform = null;
        }
        if ((i & 16) != 0) {
            c8ee = C3cH.A0I();
        }
        hatchCaaRegistrationLogger.logConfirmationSuccess(str, hatchCaaFlowSource, str2, hatchCaaNtpSourcePlatform, c8ee);
    }

    public static /* synthetic */ void logCreateAttempt$default(HatchCaaRegistrationLogger hatchCaaRegistrationLogger, String str, HatchCaaEventFlow hatchCaaEventFlow, HatchCaaRegistrationSource hatchCaaRegistrationSource, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchCaaEventFlow = null;
        }
        if ((i & 4) != 0) {
            hatchCaaRegistrationSource = null;
        }
        if ((i & 8) != 0) {
            hatchCaaNtpSourcePlatform = null;
        }
        hatchCaaRegistrationLogger.logCreateAttempt(str, hatchCaaEventFlow, hatchCaaRegistrationSource, hatchCaaNtpSourcePlatform);
    }

    public static /* synthetic */ void logCreateFailure$default(HatchCaaRegistrationLogger hatchCaaRegistrationLogger, String str, HatchCaaEventFlow hatchCaaEventFlow, HatchCaaRegistrationSource hatchCaaRegistrationSource, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, HatchCaaFailure hatchCaaFailure, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchCaaEventFlow = null;
        }
        if ((i & 4) != 0) {
            hatchCaaRegistrationSource = null;
        }
        if ((i & 8) != 0) {
            hatchCaaNtpSourcePlatform = null;
        }
        hatchCaaRegistrationLogger.logCreateFailure(str, hatchCaaEventFlow, hatchCaaRegistrationSource, hatchCaaNtpSourcePlatform, hatchCaaFailure);
    }

    public static /* synthetic */ void logCreateSuccess$default(HatchCaaRegistrationLogger hatchCaaRegistrationLogger, String str, Long l, HatchCaaEventFlow hatchCaaEventFlow, HatchCaaRegistrationSource hatchCaaRegistrationSource, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchCaaEventFlow = null;
        }
        if ((i & 8) != 0) {
            hatchCaaRegistrationSource = null;
        }
        if ((i & 16) != 0) {
            hatchCaaNtpSourcePlatform = null;
        }
        hatchCaaRegistrationLogger.logCreateSuccess(str, l, hatchCaaEventFlow, hatchCaaRegistrationSource, hatchCaaNtpSourcePlatform);
    }

    public static /* synthetic */ void logRegistrationStart$default(HatchCaaRegistrationLogger hatchCaaRegistrationLogger, HatchCaaRegistrationEventStep hatchCaaRegistrationEventStep, String str, HatchCaaFlowSource hatchCaaFlowSource, HatchCaaEventFlow hatchCaaEventFlow, HatchCaaRegistrationSource hatchCaaRegistrationSource, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, HatchCaaNtmSwitchReason hatchCaaNtmSwitchReason, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchCaaFlowSource = null;
        }
        if ((i & 8) != 0) {
            hatchCaaEventFlow = null;
        }
        if ((i & 16) != 0) {
            hatchCaaRegistrationSource = null;
        }
        if ((i & 32) != 0) {
            hatchCaaNtpSourcePlatform = null;
        }
        if ((i & 64) != 0) {
            hatchCaaNtmSwitchReason = null;
        }
        hatchCaaRegistrationLogger.logRegistrationStart(hatchCaaRegistrationEventStep, str, hatchCaaFlowSource, hatchCaaEventFlow, hatchCaaRegistrationSource, hatchCaaNtpSourcePlatform, hatchCaaNtmSwitchReason);
    }

    public static /* synthetic */ void logTosAccepted$default(HatchCaaRegistrationLogger hatchCaaRegistrationLogger, String str, HatchCaaEventFlow hatchCaaEventFlow, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, HatchCaaRegionalTos hatchCaaRegionalTos, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchCaaEventFlow = null;
        }
        if ((i & 4) != 0) {
            hatchCaaNtpSourcePlatform = null;
        }
        if ((i & 8) != 0) {
            hatchCaaRegionalTos = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        hatchCaaRegistrationLogger.logTosAccepted(str, hatchCaaEventFlow, hatchCaaNtpSourcePlatform, hatchCaaRegionalTos, str2);
    }

    private final void logUpsell(HatchCaaRegistrationState hatchCaaRegistrationState, String str) {
        log(hatchCaaRegistrationState, HatchCaaRegistrationEventStep.UPSELL_AT_LOGIN, str, HatchCaaEventFlow.NEW_TO_PLATFORM, AGH.A0E(), null, HatchCaaRegistrationFunnel.REGISTRATION, null, null, null, C3cH.A0I());
    }

    public final void logAcOptInBack(String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
        logAcOptIn(HatchCaaRegistrationState.AC_OPT_IN_BACK, str, hatchCaaNtpSourcePlatform);
    }

    public final void logAcOptInStart(String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
        logAcOptIn(HatchCaaRegistrationState.AC_OPT_IN_START, str, hatchCaaNtpSourcePlatform);
    }

    public final void logAcOptedIn(String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
        logAcOptIn(HatchCaaRegistrationState.AC_OPTED_IN, str, hatchCaaNtpSourcePlatform);
    }

    public final void logAcOptedOut(String str, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
        logAcOptIn(HatchCaaRegistrationState.AC_OPTED_OUT, str, hatchCaaNtpSourcePlatform);
    }

    public final void logBirthdayBack(String str) {
        log(HatchCaaRegistrationState.BIRTHDAY_BACK, HatchCaaRegistrationEventStep.BIRTHDAY, str, null, AGH.A0E(), null, HatchCaaRegistrationFunnel.REGISTRATION, null, null, null, AuraLogger.INSTANCE.getInstance());
    }

    public final void logBirthdayFocused(String str) {
        log(HatchCaaRegistrationState.BIRTHDAY_FOCUSED, HatchCaaRegistrationEventStep.BIRTHDAY, str, null, AGH.A0E(), null, HatchCaaRegistrationFunnel.REGISTRATION, null, null, null, AuraLogger.INSTANCE.getInstance());
    }

    public final void logBirthdayInteraction(String str) {
        log(HatchCaaRegistrationState.BIRTHDAY_INTERACTION, HatchCaaRegistrationEventStep.BIRTHDAY, str, null, AGH.A0E(), null, HatchCaaRegistrationFunnel.REGISTRATION, null, null, null, AuraLogger.INSTANCE.getInstance());
    }

    public final void logBirthdayNext(String str) {
        log(HatchCaaRegistrationState.BIRTHDAY_NEXT, HatchCaaRegistrationEventStep.BIRTHDAY, str, null, AGH.A0E(), null, HatchCaaRegistrationFunnel.REGISTRATION, null, null, null, AuraLogger.INSTANCE.getInstance());
    }

    public final void logBirthdayStart(String str) {
        log(HatchCaaRegistrationState.BIRTHDAY_START, HatchCaaRegistrationEventStep.BIRTHDAY, str, null, AGH.A0E(), null, HatchCaaRegistrationFunnel.REGISTRATION, null, null, null, AuraLogger.INSTANCE.getInstance());
    }

    public final void logCreateAttempt(String str, HatchCaaEventFlow hatchCaaEventFlow, HatchCaaRegistrationSource hatchCaaRegistrationSource, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
        log(HatchCaaRegistrationState.CREATE_ATTEMPT, HatchCaaRegistrationEventStep.ACCOUNT_CREATION, str, hatchCaaEventFlow, extraClientData(hatchCaaRegistrationSource), null, HatchCaaRegistrationFunnel.REGISTRATION, null, null, hatchCaaNtpSourcePlatform, C3cH.A0I());
    }

    public final void logCreateSuccess(String str, Long l, HatchCaaEventFlow hatchCaaEventFlow, HatchCaaRegistrationSource hatchCaaRegistrationSource, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform) {
        log(HatchCaaRegistrationState.CREATE_SUCCESS, HatchCaaRegistrationEventStep.ACCOUNT_CREATION, str, hatchCaaEventFlow, extraClientData(hatchCaaRegistrationSource), l, HatchCaaRegistrationFunnel.REGISTRATION, null, null, hatchCaaNtpSourcePlatform, C3cH.A0I());
    }

    public final void logNameBack(String str) {
        log(HatchCaaRegistrationState.NAME_BACK, HatchCaaRegistrationEventStep.NAME, str, null, AGH.A0E(), null, HatchCaaRegistrationFunnel.REGISTRATION, null, null, null, AuraLogger.INSTANCE.getInstance());
    }

    public final void logNameInteractionFirstName(String str) {
        log(HatchCaaRegistrationState.NAME_INTERACTION_FIRST_NAME, HatchCaaRegistrationEventStep.NAME, str, null, AGH.A0E(), null, HatchCaaRegistrationFunnel.REGISTRATION, null, null, null, AuraLogger.INSTANCE.getInstance());
    }

    public final void logNameInteractionLastName(String str) {
        log(HatchCaaRegistrationState.NAME_INTERACTION_LAST_NAME, HatchCaaRegistrationEventStep.NAME, str, null, AGH.A0E(), null, HatchCaaRegistrationFunnel.REGISTRATION, null, null, null, AuraLogger.INSTANCE.getInstance());
    }

    public final void logNameNext(String str) {
        log(HatchCaaRegistrationState.NAME_NEXT, HatchCaaRegistrationEventStep.NAME, str, null, AGH.A0E(), null, HatchCaaRegistrationFunnel.REGISTRATION, null, null, null, AuraLogger.INSTANCE.getInstance());
    }

    public final void logNameStart(String str) {
        log(HatchCaaRegistrationState.NAME_START, HatchCaaRegistrationEventStep.NAME, str, null, AGH.A0E(), null, HatchCaaRegistrationFunnel.REGISTRATION, null, null, null, AuraLogger.INSTANCE.getInstance());
    }

    public final void logTosAccepted(String str, HatchCaaEventFlow hatchCaaEventFlow, HatchCaaNtpSourcePlatform hatchCaaNtpSourcePlatform, HatchCaaRegionalTos hatchCaaRegionalTos, String str2) {
        HatchCaaRegistrationState hatchCaaRegistrationState = HatchCaaRegistrationState.TOS_ACCEPTED;
        HatchCaaRegistrationEventStep hatchCaaRegistrationEventStep = HatchCaaRegistrationEventStep.TERMS_OF_SERVICE;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        if (hatchCaaRegionalTos != null) {
            c0924AIaA0u.put(HatchCaaEnumsKt.REGIONAL_TOS_KEY, hatchCaaRegionalTos.getValue());
        }
        if (str2 != null) {
            c0924AIaA0u.put(HatchCaaEnumsKt.TOS_CONTENT_VERSION_KEY, str2);
        }
        log(hatchCaaRegistrationState, hatchCaaRegistrationEventStep, str, hatchCaaEventFlow, AIW.A0K(c0924AIaA0u), null, HatchCaaRegistrationFunnel.REGISTRATION, null, null, hatchCaaNtpSourcePlatform, C3cH.A0I());
    }

    public final void logUpsellBack(String str) {
        logUpsell(HatchCaaRegistrationState.UPSELL_BACK, str);
    }

    public final void logUpsellLoginToExistingAccount(String str) {
        logUpsell(HatchCaaRegistrationState.UPSELL_LOGIN_TO_EXISTING_ACCOUNT, str);
    }

    public final void logUpsellStart(String str) {
        logUpsell(HatchCaaRegistrationState.UPSELL_START, str);
    }

    public final void logUpsellSwitchToNtm(String str) {
        logUpsell(HatchCaaRegistrationState.SWITCH_TO_NTM, str);
    }
}
