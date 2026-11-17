package com.facebook.aura.messenger.skills.read.viewmodel;

import X.AGH;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.AnonymousClass007;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.navigation.key.MessengerPinLockoutReason;
import java.util.Map;

/* loaded from: classes.dex */
public final class MessengerPinAnalytics {
    public static final MessengerPinAnalytics INSTANCE = new MessengerPinAnalytics();

    private final Map<String, String> lockoutMetadata(MessengerPinLockoutReason messengerPinLockoutReason) {
        Map<String, String> mapA10;
        return (messengerPinLockoutReason == null || (mapA10 = AnonymousClass006.A10(HatchMetadataKey.FAILURE_REASON.getValue(), AnonymousClass006.A0x(messengerPinLockoutReason))) == null) ? AGH.A0E() : mapA10;
    }

    public final void cancelTapped(HatchSkillOAuthOrigin hatchSkillOAuthOrigin, MessengerPinLockoutReason messengerPinLockoutReason) {
        HatchInteractionLogger hatchInteractionLoggerA0b = AnonymousClass006.A0b(hatchSkillOAuthOrigin);
        HatchComponent hatchComponent = HatchComponent.CANCEL_BUTTON;
        Map<String, String> mapLockoutMetadata = lockoutMetadata(messengerPinLockoutReason);
        if (mapLockoutMetadata.isEmpty()) {
            mapLockoutMetadata = null;
        }
        hatchInteractionLoggerA0b.logClick(hatchSkillOAuthOrigin, hatchComponent, mapLockoutMetadata);
    }

    public final void openMessengerTapped(HatchSkillOAuthOrigin hatchSkillOAuthOrigin, MessengerPinLockoutReason messengerPinLockoutReason) {
        AnonymousClass006.A0b(hatchSkillOAuthOrigin).logClick(hatchSkillOAuthOrigin, HatchComponent.OPEN_COMPANION_APP_BUTTON, AGH.A02(AnonymousClass006.A10(HatchMetadataKey.PROVIDER.getValue(), "messenger"), lockoutMetadata(messengerPinLockoutReason)));
    }

    public final void pinHelpTapped(HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str) {
        AnonymousClass003.A0u(hatchSkillOAuthOrigin, str);
        HatchInteractionLogger.INSTANCE.logClick(hatchSkillOAuthOrigin, HatchComponent.PIN_HELP_BUTTON, AnonymousClass007.A0c(HatchMetadataKey.PROVIDER, str));
    }

    public final void troubleshootingDismissed(HatchSkillOAuthOrigin hatchSkillOAuthOrigin) {
        AnonymousClass006.A0b(hatchSkillOAuthOrigin).logDismiss(hatchSkillOAuthOrigin.getSurface(), hatchSkillOAuthOrigin.getSubsurface(), hatchSkillOAuthOrigin.getScreen(), HatchComponent.CANCEL_BUTTON, null, null);
    }
}
