package com.facebook.aura.sharesheet;

import X.AnonymousClass004;
import X.C7384Etj;
import com.facebook.aura.model.HatchDanceShare;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchShareDownloadTarget;
import com.facebook.aura.navigation.key.HatchShareSheetKey;
import com.facebook.aura.navigation.key.ShareType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchShareSheetMCKt {
    public static final void openHatchShareSheetOrElse(AuraNavigator auraNavigator, ShareType shareType, String str, String str2, String str3, String str4, HatchShareDownloadTarget hatchShareDownloadTarget, String str5, String str6, String str7, String str8, HatchDanceShare hatchDanceShare, Function0<Unit> function0) {
        boolean zA1b = AnonymousClass004.A1b(auraNavigator, shareType);
        C7384Etj.A0Y(function0, 12);
        if (HatchShareSheetMC.INSTANCE.isShareSheetEnabled()) {
            auraNavigator.navigate(new HatchShareSheetKey(shareType, str, str2, str3, str4, hatchShareDownloadTarget, str5, str6, str7, str8, hatchDanceShare), zA1b);
        } else {
            function0.invoke();
        }
    }

    public static final boolean isHatchFacebookFeedDestinationEnabled() {
        return HatchShareSheetMC.INSTANCE.isFacebookFeedDestinationEnabled();
    }

    public static final boolean isHatchFacebookStoryDestinationEnabled() {
        return HatchShareSheetMC.INSTANCE.isFacebookStoryDestinationEnabled();
    }

    public static final boolean isHatchScreenshotShareEnabled() {
        return HatchShareSheetMC.INSTANCE.isScreenshotShareEnabled();
    }

    public static final boolean isHatchShareSheetEnabled() {
        return HatchShareSheetMC.INSTANCE.isShareSheetEnabled();
    }

    public static /* synthetic */ void openHatchShareSheetOrElse$default(AuraNavigator auraNavigator, ShareType shareType, String str, String str2, String str3, String str4, HatchShareDownloadTarget hatchShareDownloadTarget, String str5, String str6, String str7, String str8, HatchDanceShare hatchDanceShare, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = str;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            hatchShareDownloadTarget = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        if ((i & 128) != 0) {
            str6 = null;
        }
        if ((i & 256) != 0) {
            str7 = null;
        }
        if ((i & 512) != 0) {
            str8 = null;
        }
        if ((i & 1024) != 0) {
            hatchDanceShare = null;
        }
        openHatchShareSheetOrElse(auraNavigator, shareType, str, str2, str3, str4, hatchShareDownloadTarget, str5, str6, str7, str8, hatchDanceShare, function0);
    }

    public static final boolean usesVideoForHatchFacebookAvatarStory() {
        return HatchShareSheetMC.INSTANCE.getUsesVideoForFacebookAvatarStory();
    }
}
