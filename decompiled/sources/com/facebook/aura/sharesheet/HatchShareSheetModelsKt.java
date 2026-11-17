package com.facebook.aura.sharesheet;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C7384Etj;
import com.facebook.aura.navigation.key.ShareType;
import com.facebook.aura.sharesheet.HatchOpenGraphPreviewState;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class HatchShareSheetModelsKt {
    public static final AHH<HatchShareDestination> AvatarShareDestinations;
    public static final AHH<HatchShareDestination> DefaultShareDestinations;
    public static final AHH<HatchShareDestination> InviteShareDestinations;
    public static final AHH<HatchShareDestination> PublishLinkShareDestinations;

    public static final AHD<String> getImageUrls(HatchOpenGraphPreviewState hatchOpenGraphPreviewState) {
        HatchOpenGraphPreviewState.Available available;
        AHD<String> ahd;
        C7384Etj.A0Y(hatchOpenGraphPreviewState, 0);
        return (!(hatchOpenGraphPreviewState instanceof HatchOpenGraphPreviewState.Available) || (available = (HatchOpenGraphPreviewState.Available) hatchOpenGraphPreviewState) == null || (ahd = available.imageUrls) == null) ? AHI.A01 : ahd;
    }

    public static final String getKey(HatchShareRecipient hatchShareRecipient) {
        C7384Etj.A0Y(hatchShareRecipient, 0);
        HatchShareAppTarget hatchShareAppTarget = hatchShareRecipient.appTarget;
        int i = hatchShareRecipient.recipientType;
        String str = hatchShareRecipient.recipientId;
        StringBuilder sb = new StringBuilder();
        sb.append(hatchShareAppTarget);
        sb.append(":");
        sb.append(i);
        sb.append(":");
        return AnonymousClass001.A0v(str, sb);
    }

    public static final boolean isPublishLinkShare(ShareType shareType) {
        C7384Etj.A0Y(shareType, 0);
        return shareType == ShareType.ARTIFACT || shareType == ShareType.SPACE;
    }

    public static final AHD<HatchShareDestination> shareDestinations(ShareType shareType) {
        C7384Etj.A0Y(shareType, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = shareType.ordinal();
        AHH<HatchShareDestination> ahh = iOrdinal != 9 ? iOrdinal != 10 ? (iOrdinal == 7 || iOrdinal == 8 || iOrdinal == 3) ? PublishLinkShareDestinations : DefaultShareDestinations : InviteShareDestinations : AvatarShareDestinations;
        HatchShareSheetMC hatchShareSheetMC = HatchShareSheetMC.INSTANCE;
        boolean zIsFacebookStoryDestinationEnabled = hatchShareSheetMC.isFacebookStoryDestinationEnabled();
        boolean zIsFacebookFeedDestinationEnabled = hatchShareSheetMC.isFacebookFeedDestinationEnabled();
        if (zIsFacebookStoryDestinationEnabled && zIsFacebookFeedDestinationEnabled) {
            return ahh;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : ahh) {
            if (obj != HatchShareDestination.FACEBOOK_STORIES || zIsFacebookStoryDestinationEnabled) {
                if (obj != HatchShareDestination.FACEBOOK_FEED || zIsFacebookFeedDestinationEnabled) {
                    arrayList.add(obj);
                }
            }
        }
        return AGI.A07(arrayList);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareType.values().length];
            try {
                AnonymousClass002.A13(ShareType.AVATAR, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ShareType.INVITE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ShareType.ARTIFACT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ShareType.SPACE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ShareType.IDEA, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        HatchShareDestination hatchShareDestination = HatchShareDestination.OS_SHARE_TO;
        HatchShareDestination hatchShareDestination2 = HatchShareDestination.INSTAGRAM_STORIES;
        HatchShareDestination hatchShareDestination3 = HatchShareDestination.FACEBOOK_STORIES;
        HatchShareDestination hatchShareDestination4 = HatchShareDestination.FACEBOOK_FEED;
        HatchShareDestination hatchShareDestination5 = HatchShareDestination.WHATSAPP;
        HatchShareDestination hatchShareDestination6 = HatchShareDestination.INSTAGRAM_DIRECT;
        HatchShareDestination hatchShareDestination7 = HatchShareDestination.MESSENGER;
        HatchShareDestination hatchShareDestination8 = HatchShareDestination.THREADS;
        HatchShareDestination hatchShareDestination9 = HatchShareDestination.f315X;
        HatchShareDestination hatchShareDestination10 = HatchShareDestination.OS_MESSAGES;
        HatchShareDestination hatchShareDestination11 = HatchShareDestination.SAVE;
        AvatarShareDestinations = AGI.A0E(hatchShareDestination, hatchShareDestination2, hatchShareDestination3, hatchShareDestination4, hatchShareDestination5, hatchShareDestination6, hatchShareDestination7, hatchShareDestination8, hatchShareDestination9, hatchShareDestination10, hatchShareDestination11);
        AHH<HatchShareDestination> ahhA0E = AGI.A0E(hatchShareDestination, hatchShareDestination10, hatchShareDestination2, hatchShareDestination3, hatchShareDestination4, hatchShareDestination6, hatchShareDestination7, hatchShareDestination5, hatchShareDestination8, hatchShareDestination9, hatchShareDestination11);
        DefaultShareDestinations = ahhA0E;
        int iA0E = AnonymousClass002.A0E(ahhA0E);
        HatchShareDestination hatchShareDestination12 = HatchShareDestination.COPY_LINK;
        PublishLinkShareDestinations = ahhA0E.A3D(hatchShareDestination12, iA0E);
        InviteShareDestinations = AGI.A0E(hatchShareDestination, hatchShareDestination10, hatchShareDestination5, hatchShareDestination7, hatchShareDestination6, hatchShareDestination2, hatchShareDestination3, hatchShareDestination4, hatchShareDestination8, hatchShareDestination9, hatchShareDestination12);
    }
}
