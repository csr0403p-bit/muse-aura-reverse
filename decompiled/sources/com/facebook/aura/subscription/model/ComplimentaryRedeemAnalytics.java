package com.facebook.aura.subscription.model;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionLogger;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.key.ComplimentaryRedeemEntryPoint;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class ComplimentaryRedeemAnalytics {
    public static final int $stable = 0;
    public static final ComplimentaryRedeemAnalytics INSTANCE = new ComplimentaryRedeemAnalytics();
    public static final Attribution chatCard = new Attribution(HatchOrigin.CHAT, HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.CHAT_THREAD);
    public static final Attribution redeemPage;
    public static final Attribution subscriptionPaywall;

    public final class Attribution {
        public static final int $stable = 0;
        public final HatchOrigin origin;
        public final HatchScreen screen;
        public final HatchSubsurface subsurface;
        public final HatchSurface surface;

        public final HatchOrigin getOrigin() {
            return this.origin;
        }

        public final HatchScreen getScreen() {
            return this.screen;
        }

        public final HatchSubsurface getSubsurface() {
            return this.subsurface;
        }

        public final HatchSurface getSurface() {
            return this.surface;
        }

        public Attribution(HatchOrigin hatchOrigin, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen) {
            AnonymousClass005.A14(hatchOrigin, hatchSurface, hatchSubsurface, hatchScreen);
            this.origin = hatchOrigin;
            this.surface = hatchSurface;
            this.subsurface = hatchSubsurface;
            this.screen = hatchScreen;
        }
    }

    private final void logOutcome(HatchComponent hatchComponent, ComplimentaryRedeemEntryPoint complimentaryRedeemEntryPoint, String str) {
        String str2 = str;
        Attribution attribution = attribution(complimentaryRedeemEntryPoint);
        HatchImpressionLogger hatchImpressionLogger = HatchImpressionLogger.INSTANCE;
        HatchOrigin hatchOrigin = attribution.origin;
        HatchSurface hatchSurface = attribution.surface;
        HatchSubsurface hatchSubsurface = attribution.subsurface;
        HatchScreen hatchScreen = attribution.screen;
        if (complimentaryRedeemEntryPoint != ComplimentaryRedeemEntryPoint.CHAT_CARD) {
            str2 = null;
        }
        hatchImpressionLogger.logImpression(hatchOrigin, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, str2, metadata(complimentaryRedeemEntryPoint), null);
    }

    public final Attribution attribution(ComplimentaryRedeemEntryPoint complimentaryRedeemEntryPoint) {
        C7384Etj.A0Y(complimentaryRedeemEntryPoint, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = complimentaryRedeemEntryPoint.ordinal();
        if (iOrdinal == 2) {
            return chatCard;
        }
        if (iOrdinal == 0 || iOrdinal == 1) {
            return redeemPage;
        }
        if (iOrdinal == 3) {
            return subscriptionPaywall;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Map<String, String> metadata(ComplimentaryRedeemEntryPoint complimentaryRedeemEntryPoint) {
        C7384Etj.A0Y(complimentaryRedeemEntryPoint, 0);
        return AnonymousClass006.A10(HatchMetadataKey.ENTRY_POINT.getValue(), complimentaryRedeemEntryPoint.getValue());
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComplimentaryRedeemEntryPoint.values().length];
            try {
                AnonymousClass002.A13(ComplimentaryRedeemEntryPoint.CHAT_CARD, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ComplimentaryRedeemEntryPoint.SETTINGS, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ComplimentaryRedeemEntryPoint.SUBSCRIPTION_MANAGEMENT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ComplimentaryRedeemEntryPoint.SUBSCRIPTION_PAYWALL, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        HatchOrigin hatchOrigin = HatchOrigin.MONETIZATION;
        HatchSurface hatchSurface = HatchSurface.MONETIZATION;
        HatchSubsurface hatchSubsurface = HatchSubsurface.SUBSCRIPTION;
        redeemPage = new Attribution(hatchOrigin, hatchSurface, hatchSubsurface, HatchScreen.REDEEM_COMPLIMENTARY_SUBSCRIPTION);
        subscriptionPaywall = new Attribution(hatchOrigin, hatchSurface, hatchSubsurface, HatchScreen.SUBSCRIPTION_PAYWALL);
    }

    public final void logPlanPickerClaimResult(String str, boolean z) {
        HatchInteractionLogger hatchInteractionLoggerA0b = AnonymousClass006.A0b(str);
        Attribution attribution = subscriptionPaywall;
        hatchInteractionLoggerA0b.logStatusCheck(attribution.surface, null, attribution.screen, HatchComponent.REDEEM_COMPLIMENTARY_SUBSCRIPTION_BUTTON, AnonymousClass007.A0d(HatchMetadataKey.RESULT.getValue(), z ? "success" : "failed", AnonymousClass006.A12(HatchMetadataKey.ENTRY_POINT, str)));
    }

    public final void logRedeemFailed(ComplimentaryRedeemEntryPoint complimentaryRedeemEntryPoint, String str) {
        AnonymousClass003.A0u(complimentaryRedeemEntryPoint, str);
        logOutcome(HatchComponent.REDEEM_COMPLIMENTARY_SUBSCRIPTION_ERROR_DIALOG, complimentaryRedeemEntryPoint, str);
    }

    public final void logRedeemSucceeded(ComplimentaryRedeemEntryPoint complimentaryRedeemEntryPoint, String str) {
        AnonymousClass003.A0u(complimentaryRedeemEntryPoint, str);
        logOutcome(HatchComponent.REDEEM_COMPLIMENTARY_SUBSCRIPTION_SUCCESS_TOAST, complimentaryRedeemEntryPoint, str);
    }
}
