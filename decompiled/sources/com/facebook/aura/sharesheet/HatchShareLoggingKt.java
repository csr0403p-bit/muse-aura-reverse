package com.facebook.aura.sharesheet;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BRg;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.login.nativeflow.NativeLoginAccountResolverKt;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;
import com.facebook.aura.settings.HatchDataExportLoggingKt;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class HatchShareLoggingKt {
    public static final String AVATAR_DANCE_CONTENT_TYPE = "avatar_dance_video";

    public static final String getFoaContactTypeOrNull(HatchShareRecipient hatchShareRecipient) {
        C7384Etj.A0Y(hatchShareRecipient, 0);
        int i = hatchShareRecipient.recipientType;
        if (i == 1) {
            return "IGD_USER";
        }
        if (i == 2) {
            return "IGD_THREAD";
        }
        if (i == 3) {
            return "MSGR_CONTACT";
        }
        if (i != 4) {
            return null;
        }
        return "MSGR_GROUP";
    }

    public static final BRg shareSheetImpression(BRg bRg, HatchShareLogContext hatchShareLogContext) {
        AnonymousClass003.A0u(bRg, hatchShareLogContext);
        return HatchImpressionModifierKt.hatchImpression(bRg, HatchOrigin.SHARE_SHEET, HatchSurface.SHARE_SHEET, null, HatchScreen.SHARE_SHEET, HatchComponent.SHARE_SHEET, null, HatchShareLogging.INSTANCE.impressionMetadata$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(hatchShareLogContext), null, 500L, 0.0f, null, null, null);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HatchShareDestination.values().length];
            try {
                AnonymousClass005.A0v(HatchShareDestination.OS_SHARE_TO, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(HatchShareDestination.OS_MESSAGES, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(HatchShareDestination.WHATSAPP, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchShareDestination.INSTAGRAM_STORIES, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchShareDestination.FACEBOOK_STORIES, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(HatchShareDestination.FACEBOOK_FEED, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(HatchShareDestination.INSTAGRAM_DIRECT, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(HatchShareDestination.MESSENGER, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(HatchShareDestination.THREADS, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(HatchShareDestination.f315X, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(HatchShareDestination.COPY_LINK, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(HatchShareDestination.SAVE, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchShareAppTarget.values().length];
            try {
                AnonymousClass005.A0v(HatchShareAppTarget.INSTAGRAM, iArr2, 1);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AnonymousClass005.A0v(HatchShareAppTarget.MESSENGER, iArr2, 2);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                AnonymousClass005.A0v(HatchShareAppTarget.FACEBOOK, iArr2, 3);
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final String sharePlatform(HatchShareDestination hatchShareDestination) {
        switch (AnonymousClass003.A0L(hatchShareDestination)) {
            case 0:
                return "instagram_direct";
            case 1:
                return "instagram_story";
            case 2:
                return "facebook_story";
            case 3:
                return "facebook_feed";
            case 4:
                return NativeLoginAccountResolverKt.WHATSAPP_USER_ID;
            case 5:
                return "system_share";
            case 6:
                return "messenger";
            case 7:
                return MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_THREADS;
            case 8:
                return "x";
            case 9:
                return "os_messages";
            case 10:
                return "copy_link";
            case 11:
                return HatchDataExportLoggingKt.PHASE_SAVE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String sharePlatform(HatchShareAppTarget hatchShareAppTarget) {
        int iOrdinal;
        if (hatchShareAppTarget != null && (iOrdinal = hatchShareAppTarget.ordinal()) != -1) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 0) {
                        return MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_FACEBOOK;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return "messenger";
            }
            return "instagram_direct";
        }
        return "unknown";
    }
}
