package com.facebook.aura.devices.link.ordering;

import X.AIW;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0924AIa;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchEventType;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderResult;
import com.facebook.aura.navigation.key.HatchLinkOrderEntryPoint;
import com.facebook.aura.settings.HatchCredentialsViewModelKt;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class HatchLinkOrderLogger {
    public static final int $stable = 0;
    public static final HatchLinkOrderLogger INSTANCE = new HatchLinkOrderLogger();

    public final void logOpened(HatchLinkOrderEntryPoint hatchLinkOrderEntryPoint, HatchLinkOrderBlockReason hatchLinkOrderBlockReason) {
        C7384Etj.A0Y(hatchLinkOrderEntryPoint, 0);
        HatchAppEventLogger hatchAppEventLogger = HatchAppEventLogger.INSTANCE;
        String value = HatchSurface.SETTINGS.getValue();
        String value2 = HatchSubsurface.DEVICES.getValue();
        String value3 = HatchEventType.STATUS_CHECK.getValue();
        String value4 = HatchComponent.SETTINGS_SCREEN_VIEW.getValue();
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.put(HatchMetadataKey.ENTRY_POINT.getValue(), hatchLinkOrderEntryPoint.getLogValue());
        c0924AIa.put(HatchMetadataKey.RESULT.getValue(), hatchLinkOrderBlockReason == null ? "eligible" : "blocked");
        if (hatchLinkOrderBlockReason != null) {
            c0924AIa.put(HatchMetadataKey.FAILURE_REASON.getValue(), INSTANCE.logValue(hatchLinkOrderBlockReason));
        }
        hatchAppEventLogger.logEvent("home_link_order_opened", value, value2, value3, value4, AIW.A0K(c0924AIa), null);
    }

    public final void logSubmitResult(HatchLinkOrderResult hatchLinkOrderResult) {
        String str;
        C7384Etj.A0Y(hatchLinkOrderResult, 0);
        if (hatchLinkOrderResult instanceof HatchLinkOrderResult.Success) {
            str = null;
        } else if (hatchLinkOrderResult instanceof HatchLinkOrderResult.Blocked) {
            str = "blocked";
        } else if (hatchLinkOrderResult instanceof HatchLinkOrderResult.Rejected) {
            str = "rejected";
        } else {
            if (!(hatchLinkOrderResult instanceof HatchLinkOrderResult.Failed)) {
                throw new NoWhenBranchMatchedException();
            }
            str = HatchCredentialsViewModelKt.SECURE_STORAGE_FAILURE_REQUEST_FAILED;
        }
        logOutcome("home_link_order_submit_result", str);
    }

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchLinkOrderBlockReason.values().length];
            try {
                AnonymousClass002.A13(HatchLinkOrderBlockReason.ORDERING_DISABLED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchLinkOrderBlockReason.NOT_AUTHENTICATED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchLinkOrderBlockReason.NO_SUBSCRIPTION, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchLinkOrderBlockReason.SUBSCRIPTION_NOT_READY, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchLinkOrderBlockReason.SUBSCRIPTION_NOT_ENTITLED, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(HatchLinkOrderBlockReason.CLAIM_UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void logOutcome(String str, String str2) {
        HatchAppEventLogger hatchAppEventLogger = HatchAppEventLogger.INSTANCE;
        String value = HatchSurface.SETTINGS.getValue();
        String value2 = HatchSubsurface.DEVICES.getValue();
        String value3 = HatchEventType.STATUS_CHECK.getValue();
        String value4 = HatchComponent.CONFIRM_BUTTON.getValue();
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.put(HatchMetadataKey.RESULT.getValue(), str2 == null ? "success" : "error");
        if (str2 != null) {
            AnonymousClass001.A1C(HatchMetadataKey.FAILURE_REASON, str2, c0924AIa);
        }
        hatchAppEventLogger.logEvent(str, value, value2, value3, value4, AIW.A0K(c0924AIa), null);
    }

    public final void logContinue() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.DEVICES, HatchScreen.HOME_LINK_ORDER_INFO, HatchComponent.CONTINUE_BUTTON, null, null, null);
    }

    public final void logExit(boolean z) {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.SETTINGS, HatchSubsurface.DEVICES, z ? HatchScreen.HOME_LINK_ORDER_BLOCKED : HatchScreen.HOME_LINK_ORDER_INFO, HatchComponent.BACK_BUTTON, null, null);
    }

    public final void logSeePlans() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.DEVICES, HatchScreen.HOME_LINK_ORDER_INFO, HatchComponent.UPGRADE_BUTTON, null, null, null);
    }

    public final void logSubmit() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.DEVICES, HatchScreen.HOME_LINK_ORDER_DETAILS, HatchComponent.CONFIRM_BUTTON, null, null, null);
    }

    public final void logValidationFailure() {
        logOutcome("home_link_order_validation_failed", HatchCredentialsViewModelKt.SECURE_STORAGE_FAILURE_VALIDATION);
    }

    private final String logValue(HatchLinkOrderBlockReason hatchLinkOrderBlockReason) {
        switch (hatchLinkOrderBlockReason.ordinal()) {
            case 0:
                return "ordering_disabled";
            case 1:
                return "not_authenticated";
            case 2:
                return "no_subscription";
            case 3:
                return "subscription_not_ready";
            case 4:
                return "subscription_not_entitled";
            case 5:
                return "claim_unavailable";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
