package com.facebook.aura.sharesheet;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C31u;
import X.C7462Ewq;
import X.FGI;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.sharesheet.MC;

/* loaded from: classes.dex */
public abstract class HatchShareSheetViewModelKt {
    public static final float ARTIFACT_LINK_STICKER_CENTER_Y_RATIO = 0.82f;
    public static final long AVATAR_DANCES_LOADING_TIMEOUT_MILLIS = 5000;
    public static final float AVATAR_STORY_CENTER_X_RATIO = 0.5f;
    public static final float AVATAR_STORY_CENTER_Y_RATIO = 0.5f;
    public static final String AVATAR_STORY_STICKER_MIME_TYPE = "image/png";
    public static final float DEFAULT_LINK_STICKER_CENTER_Y_RATIO = 0.88f;
    public static final long IDEA_SHARE_PREPARATION_TIMEOUT_MILLIS = 60000;
    public static final int INSTAGRAM_MESSAGE_STORY_BACKGROUND_COLOR = -2631721;
    public static final int INSTAGRAM_STORY_BOTTOM_BACKGROUND_COLOR = -6701071;
    public static final int INSTAGRAM_STORY_TOP_BACKGROUND_COLOR = -14000217;
    public static final String INVITE_SHARE_TAG = "HatchInviteShare";
    public static final long RECIPIENT_SEND_UNDO_DURATION_MILLIS = 3000;
    public static final String SHARE_TAG = "HatchShareSheetViewModel";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(HatchShareSheetViewModelKt.class, "hatchShareDownloadLinkUrl", "getHatchShareDownloadLinkUrl()Ljava/lang/String;", 1)};
    public static final C31u hatchShareDownloadLinkUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_gtm.download_link_url);

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchShareAppTarget.values().length];
            try {
                AnonymousClass002.A13(HatchShareAppTarget.INSTAGRAM, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchShareAppTarget.MESSENGER, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean getCanShare(HatchShareEligibilityState hatchShareEligibilityState) {
        return hatchShareEligibilityState == HatchShareEligibilityState.NOT_REQUIRED || hatchShareEligibilityState == HatchShareEligibilityState.ELIGIBLE;
    }

    public static final HatchShareDestination getDestination(HatchShareRecipient hatchShareRecipient) {
        HatchShareAppTarget hatchShareAppTarget = hatchShareRecipient.appTarget;
        if (hatchShareAppTarget == null) {
            return null;
        }
        int iOrdinal = hatchShareAppTarget.ordinal();
        if (iOrdinal == 1) {
            return HatchShareDestination.INSTAGRAM_DIRECT;
        }
        if (iOrdinal == 2) {
            return HatchShareDestination.MESSENGER;
        }
        return null;
    }

    public static final String getHatchShareDownloadLinkUrl() {
        return (String) C31u.A00(hatchShareDownloadLinkUrl$delegate, $$delegatedProperties);
    }

    public static final boolean getUsesNetworkSend(HatchShareRecipient hatchShareRecipient) {
        return hatchShareRecipient.appTarget == HatchShareAppTarget.INSTAGRAM || AnonymousClass003.A17(hatchShareRecipient.recipientType);
    }

    public static final boolean isMessengerGroup(HatchShareRecipient hatchShareRecipient) {
        return AnonymousClass003.A17(hatchShareRecipient.recipientType);
    }

    public static final String getFoaContactType(HatchShareRecipient hatchShareRecipient) {
        String foaContactTypeOrNull = HatchShareLoggingKt.getFoaContactTypeOrNull(hatchShareRecipient);
        if (foaContactTypeOrNull != null) {
            return foaContactTypeOrNull;
        }
        throw new IllegalStateException(FGI.A0H("Unsupported sharesheet recipient type: ", hatchShareRecipient.recipientType));
    }
}
