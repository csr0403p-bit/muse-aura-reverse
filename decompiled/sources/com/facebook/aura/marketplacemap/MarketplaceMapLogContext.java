package com.facebook.aura.marketplacemap;

import X.AnonymousClass002;
import X.AnonymousClass007;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import java.util.Map;

/* loaded from: classes4.dex */
public final class MarketplaceMapLogContext {
    public static final int $stable = 0;
    public final HatchScreen clickScreen;
    public final HatchScreen impressionScreen;
    public final boolean isPrimaryThread;
    public final Map<String, String> metadata;
    public final String sessionId;

    public MarketplaceMapLogContext(String str, String str2) {
        C7384Etj.A0Y(str2, 1);
        this.sessionId = str;
        boolean zA1Y = AnonymousClass002.A1Y(str);
        this.isPrimaryThread = zA1Y;
        this.metadata = HatchInteractionEnumsKt.chatThreadLogMetadata(zA1Y, str, null, AnonymousClass007.A0c(HatchMetadataKey.HOST_MESSAGE_ID, str2));
        this.impressionScreen = zA1Y ? HatchScreen.MAIN_CHAT : HatchScreen.CHAT_THREAD;
        this.clickScreen = HatchInteractionEnumsKt.chatScreen(zA1Y);
    }

    public final void logListingTap(MarketplaceMapTapSource marketplaceMapTapSource) {
        HatchScreen hatchScreen;
        C7384Etj.A0Y(marketplaceMapTapSource, 0);
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.CHAT;
        HatchSubsurface hatchSubsurface = HatchSubsurface.MESSAGE_LIST;
        int iOrdinal = marketplaceMapTapSource.ordinal();
        if (iOrdinal == 0) {
            hatchScreen = HatchScreen.INLINE_MAP;
        } else if (iOrdinal == 1) {
            hatchScreen = HatchScreen.FULL_SCREEN_MAP;
        } else {
            if (iOrdinal != 2) {
                throw C3cG.A0q();
            }
            hatchScreen = this.clickScreen;
        }
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreen, HatchComponent.MARKETPLACE_MAP_LISTING, null, this.metadata, null);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketplaceMapTapSource.values().length];
            try {
                AnonymousClass002.A13(MarketplaceMapTapSource.PIN, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(MarketplaceMapTapSource.FULLSCREEN_PIN, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(MarketplaceMapTapSource.ROW, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final HatchScreen getClickScreen() {
        return this.clickScreen;
    }

    public final HatchScreen getImpressionScreen() {
        return this.impressionScreen;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final void logListingDetails() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, this.clickScreen, HatchComponent.MARKETPLACE_MAP_LISTING_DETAILS, null, this.metadata, null);
    }
}
