package com.facebook.aura.sharesheet;

import X.C31u;
import X.C7354EnR;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.sharesheet.MC;

/* loaded from: classes.dex */
public final class HatchShareSheetMC {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7354EnR(HatchShareSheetMC.class, "isShareSheetEnabled", "isShareSheetEnabled()Z", 0), new C7354EnR(HatchShareSheetMC.class, "isScreenshotShareEnabled", "isScreenshotShareEnabled()Z", 0), new C7354EnR(HatchShareSheetMC.class, "isFacebookStoryDestinationEnabled", "isFacebookStoryDestinationEnabled()Z", 0), new C7354EnR(HatchShareSheetMC.class, "isFacebookFeedDestinationEnabled", "isFacebookFeedDestinationEnabled()Z", 0), new C7354EnR(HatchShareSheetMC.class, "usesVideoForFacebookAvatarStory", "getUsesVideoForFacebookAvatarStory()Z", 0)};
    public static final HatchShareSheetMC INSTANCE = new HatchShareSheetMC();
    public static final C31u isShareSheetEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_gtm.share_sheet_enabled);
    public static final C31u isScreenshotShareEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_gtm.screenshot_share_enabled);
    public static final C31u isFacebookStoryDestinationEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_gtm.facebook_story_destination_enabled);
    public static final C31u isFacebookFeedDestinationEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_gtm.facebook_feed_destination_enabled);
    public static final C31u usesVideoForFacebookAvatarStory$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_gtm.facebook_avatar_story_uses_video);

    public final boolean getUsesVideoForFacebookAvatarStory() {
        return C31u.A01(this, usesVideoForFacebookAvatarStory$delegate, $$delegatedProperties, 4);
    }

    public final boolean isFacebookFeedDestinationEnabled() {
        return C31u.A01(this, isFacebookFeedDestinationEnabled$delegate, $$delegatedProperties, 3);
    }

    public final boolean isFacebookStoryDestinationEnabled() {
        return C31u.A01(this, isFacebookStoryDestinationEnabled$delegate, $$delegatedProperties, 2);
    }

    public final boolean isScreenshotShareEnabled() {
        return C31u.A01(this, isScreenshotShareEnabled$delegate, $$delegatedProperties, 1);
    }

    public final boolean isShareSheetEnabled() {
        return C31u.A01(this, isShareSheetEnabled$delegate, $$delegatedProperties, 0);
    }
}
