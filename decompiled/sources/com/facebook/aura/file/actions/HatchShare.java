package com.facebook.aura.file.actions;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import X.C7mU;
import X.C7n4;
import X.CFK;
import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Telephony;
import com.facebook.aura.common.HatchVersionName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class HatchShare {
    public static final HatchShare INSTANCE = new HatchShare();

    public final class FacebookStorySticker extends C06G {
        public final float centerXRatio;
        public final float centerYRatio;
        public final float rotationDegrees;
        public final Uri uri;
        public final float widthRatio;

        public FacebookStorySticker(Uri uri, float f, float f2, float f3, float f4) {
            C7384Etj.A0Y(uri, 0);
            this.uri = uri;
            this.widthRatio = f;
            this.centerXRatio = f2;
            this.centerYRatio = f3;
            this.rotationDegrees = f4;
        }

        public final FacebookStorySticker copy(Uri uri, float f, float f2, float f3, float f4) {
            C7384Etj.A0Y(uri, 0);
            return new FacebookStorySticker(uri, f, f2, f3, f4);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FacebookStorySticker) {
                    FacebookStorySticker facebookStorySticker = (FacebookStorySticker) obj;
                    if (!C7384Etj.areEqual(this.uri, facebookStorySticker.uri) || Float.compare(this.widthRatio, facebookStorySticker.widthRatio) != 0 || Float.compare(this.centerXRatio, facebookStorySticker.centerXRatio) != 0 || Float.compare(this.centerYRatio, facebookStorySticker.centerYRatio) != 0 || Float.compare(this.rotationDegrees, facebookStorySticker.rotationDegrees) != 0) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ FacebookStorySticker copy$default(FacebookStorySticker facebookStorySticker, Uri uri, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = facebookStorySticker.uri;
            }
            if ((i & 2) != 0) {
                f = facebookStorySticker.widthRatio;
            }
            if ((i & 4) != 0) {
                f2 = facebookStorySticker.centerXRatio;
            }
            if ((i & 8) != 0) {
                f3 = facebookStorySticker.centerYRatio;
            }
            if ((i & 16) != 0) {
                f4 = facebookStorySticker.rotationDegrees;
            }
            return facebookStorySticker.copy(uri, f, f2, f3, f4);
        }

        public final Uri component1() {
            return this.uri;
        }

        public final float component2() {
            return this.widthRatio;
        }

        public final float component3() {
            return this.centerXRatio;
        }

        public final float component4() {
            return this.centerYRatio;
        }

        public final float component5() {
            return this.rotationDegrees;
        }

        public final float getCenterXRatio() {
            return this.centerXRatio;
        }

        public final float getCenterYRatio() {
            return this.centerYRatio;
        }

        public final float getRotationDegrees() {
            return this.rotationDegrees;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public final float getWidthRatio() {
            return this.widthRatio;
        }

        public int hashCode() {
            return AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0E(this.uri), this.widthRatio), this.centerXRatio), this.centerYRatio) + Float.floatToIntBits(this.rotationDegrees);
        }

        public String toString() {
            return super.toString();
        }
    }

    private final boolean launchExplicitTargetIntent(Context context, Intent intent, String str) {
        try {
            C7mU c7mUA00 = C7mU.A00();
            if (!c7mUA00.A05().A05(context, intent)) {
                if (!c7mUA00.A03().A05(context, intent)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            CFK.A0D(HatchShareKt.TAG, "Share to %s failed", e, str);
            return false;
        }
    }

    private final boolean redirectMissingAppToPlayStore(Context context, String str) throws PackageManager.NameNotFoundException {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            List listAsList = Arrays.asList(new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", str).build(), new Uri.Builder().scheme("https").authority("play.google.com").appendPath("store").appendPath("apps").appendPath("details").appendQueryParameter("id", str).build());
            C7n4 c7n4A0S = C60Q.A0S();
            if (!(listAsList instanceof Collection) || !listAsList.isEmpty()) {
                Iterator it = listAsList.iterator();
                while (it.hasNext()) {
                    try {
                    } catch (Exception e) {
                        CFK.A0D(HatchShareKt.TAG, "Failed to open app store for %s", e, str);
                    }
                    if (c7n4A0S.A05(context, C60Q.A09((Uri) it.next()).addFlags(268435456))) {
                        return true;
                    }
                }
            }
            CFK.A0H(HatchShareKt.TAG, "No app store available for %s", str);
            return false;
        }
    }

    private final boolean shareImageToMessenger(Context context, Uri uri, String str, String str2, String str3, String str4) {
        Activity activityFindActivity = findActivity(context);
        if (activityFindActivity != null) {
            Intent intentCreateMediaShareIntent = createMediaShareIntent(context, uri, str, str2, "com.facebook.orca", str3, str4, null);
            if (!redirectMissingAppToPlayStore(context, "com.facebook.orca")) {
                if (intentCreateMediaShareIntent.resolveActivity(context.getPackageManager()) != null) {
                    try {
                        C7mU c7mUA00 = C7mU.A00();
                        if (!c7mUA00.A05().A07(activityFindActivity, intentCreateMediaShareIntent)) {
                            if (c7mUA00.A03().A07(activityFindActivity, intentCreateMediaShareIntent)) {
                                return true;
                            }
                        }
                    } catch (Exception e) {
                        CFK.A0K(HatchShareKt.TAG, e, "Messenger image share failed");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    private final boolean supportsInstagramAvatarStories(Context context) {
        try {
            if (context.getPackageManager().getPackageInfo("com.instagram.android", 0).versionName != null) {
                return !HatchVersionName.INSTANCE.isBelow(r2, HatchShareKt.MINIMUM_INSTAGRAM_AVATAR_STORY_VERSION);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final String facebookAppPackage(Context context) {
        C7384Etj.A0Y(context, 0);
        return !isPackageInstalled(context, "com.facebook.wakizashi") ? "com.facebook.katana" : "com.facebook.wakizashi";
    }

    public final boolean isPackageInstalled(Context context, String str) throws PackageManager.NameNotFoundException {
        boolean zA1a = AnonymousClass002.A1a(context, str);
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return zA1a;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final boolean shareMediaToFacebookFeed(Context context, Uri uri, String str, String str2, String str3) {
        AnonymousClass005.A0x(context, uri, str);
        C7384Etj.A0Y(str3, 4);
        return shareMediaTo(context, uri, str, str2, str3, null, null, HatchShareKt.FACEBOOK_NEWS_FEED_ALIAS);
    }

    public final boolean shareMediaToFacebookStory(Context context, Uri uri, String str, int i, int i2, String str2, String str3, Float f, String str4, HatchStoryAudio hatchStoryAudio, String str5) {
        AnonymousClass005.A10(context, uri, str);
        C7384Etj.A0Y(str4, 8);
        return shareToFacebookStory(context, uri, str, i, i2, str2, str3, f, str4, false, null, hatchStoryAudio, str5);
    }

    public final boolean shareMediaToInstagramDirect(Context context, Uri uri, String str, String str2, String str3, String str4) {
        AnonymousClass005.A10(context, uri, str);
        return shareMediaToInstagram(context, uri, str, HatchShareKt.INSTAGRAM_DIRECT_ACTION, "Direct", null, null, null, null, null, false, str2, str3, str4, null, false, null);
    }

    public final boolean shareMediaToInstagramStory(Context context, Uri uri, String str, String str2, String str3, Uri uri2, Float f, String str4, boolean z, HatchStoryAudio hatchStoryAudio, boolean z2, String str5) {
        AnonymousClass005.A0x(context, uri, str);
        return shareMediaToInstagram(context, uri, str, HatchShareKt.INSTAGRAM_STORY_ACTION, "Stories", str2, str3, uri2, f, str4, z, null, null, null, hatchStoryAudio, z2, str5);
    }

    public final boolean shareMediaToMessages(Context context, Uri uri, String str, String str2) {
        AnonymousClass005.A1Z(context, uri, str);
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
        if (defaultSmsPackage == null) {
            return false;
        }
        Intent intentA03 = C60P.A03("android.intent.action.SEND");
        intentA03.setType(str);
        intentA03.putExtra("android.intent.extra.STREAM", uri);
        if (str2 != null) {
            intentA03.putExtra("android.intent.extra.TEXT", str2);
            intentA03.putExtra("sms_body", str2);
        }
        intentA03.setPackage(defaultSmsPackage);
        C60Q.A16(context.getContentResolver(), intentA03, uri, "Shared media");
        return launchExplicitTargetIntent(context, intentA03, defaultSmsPackage);
    }

    public final boolean shareMediaToMessenger(Context context, Uri uri, String str, String str2, String str3, String str4) {
        AnonymousClass005.A0x(context, uri, str);
        return (str.startsWith("image/") && str4 == null) ? shareImageToMessenger(context, uri, str, str2, str3, str4) : shareMediaTo(context, uri, str, str2, "com.facebook.orca", str3, str4, null);
    }

    public final boolean shareMediaToThreads(Context context, Uri uri, String str, String str2, String str3) {
        AnonymousClass005.A0x(context, uri, str);
        Intent intentCreateMediaShareIntent = createMediaShareIntent(context, uri, str, str2, "com.instagram.barcelona", null, null, null);
        if (str3 != null) {
            intentCreateMediaShareIntent.putExtra(HatchShareKt.AUDIO_CLUSTER_ID_PARAM, str3);
        }
        return launchTargetIntent(context, intentCreateMediaShareIntent, "com.instagram.barcelona");
    }

    public final boolean shareMediaToWhatsApp(Context context, Uri uri, String str, String str2, String str3) {
        AnonymousClass005.A0x(context, uri, str);
        C7384Etj.A0Y(str3, 4);
        return shareMediaTo(context, uri, str, str2, str3, null, null, null);
    }

    public final boolean shareMediaToX(Context context, Uri uri, String str, String str2) {
        AnonymousClass005.A0x(context, uri, str);
        return shareMediaTo(context, uri, str, str2, HatchShareKt.X_PACKAGE, null, null, null);
    }

    public final boolean shareStickerToFacebookStory(Context context, Uri uri, String str, int i, int i2, String str2, String str3, Float f, String str4, Float f2) {
        boolean zA1Z = AnonymousClass005.A1Z(context, uri, str);
        C7384Etj.A0Y(str4, 8);
        return shareToFacebookStory(context, uri, str, i, i2, str2, str3, f, str4, zA1Z, f2, null, null);
    }

    public final boolean shareStickersToFacebookStory(Context context, List<FacebookStorySticker> list, String str, int i, int i2, String str2, String str3, String str4) {
        boolean zA1Z = AnonymousClass005.A1Z(context, list, str);
        C7384Etj.A0Y(str4, 7);
        if (list.isEmpty()) {
            return false;
        }
        Intent intentA03 = C60P.A03(HatchShareKt.FACEBOOK_STORY_ACTION);
        intentA03.setPackage(str4);
        intentA03.setType(str);
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (FacebookStorySticker facebookStorySticker : list) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(HatchShareKt.INTERACTIVE_ASSET_URI_PARAM, facebookStorySticker.uri);
            bundle.putFloat(HatchShareKt.STICKER_WIDTH_RATIO_PARAM, facebookStorySticker.widthRatio);
            bundle.putFloat(HatchShareKt.STICKER_CENTER_X_RATIO_PARAM, facebookStorySticker.centerXRatio);
            bundle.putFloat(HatchShareKt.STICKER_CENTER_Y_RATIO_PARAM, facebookStorySticker.centerYRatio);
            bundle.putFloat(HatchShareKt.STICKER_ROTATION_PARAM, facebookStorySticker.rotationDegrees);
            arrayListA0i.add(bundle);
        }
        intentA03.putParcelableArrayListExtra(HatchShareKt.INTERACTIVE_ASSET_LIST_PARAM, new ArrayList<>(arrayListA0i));
        intentA03.putExtra(HatchShareKt.INTERACTIVE_ASSET_URI_PARAM, ((FacebookStorySticker) AbstractC0878AGe.A0F(list)).uri);
        HatchShare hatchShare = INSTANCE;
        intentA03.putExtra(HatchShareKt.TOP_BACKGROUND_COLOR_PARAM, hatchShare.toHexColor(i));
        intentA03.putExtra(HatchShareKt.BOTTOM_BACKGROUND_COLOR_PARAM, hatchShare.toHexColor(i2));
        ClipData clipDataNewUri = ClipData.newUri(context.getContentResolver(), "Story sticker", ((FacebookStorySticker) AbstractC0878AGe.A0F(list)).uri);
        Iterator it = AbstractC0878AGe.A0Z(list, zA1Z ? 1 : 0).iterator();
        while (it.hasNext()) {
            clipDataNewUri.addItem(new ClipData.Item(((FacebookStorySticker) it.next()).uri));
        }
        intentA03.setClipData(clipDataNewUri);
        intentA03.addFlags(zA1Z ? 1 : 0);
        hatchShare.addAttribution(intentA03, context, str4);
        if (str2 != null) {
            intentA03.putExtra(HatchShareKt.CONTENT_URL_PARAM, str2);
            intentA03.putExtra(HatchShareKt.LINK_STICKER_URL_PARAM, str2);
        }
        if (str3 != null) {
            intentA03.putExtra(HatchShareKt.LINK_STICKER_TEXT_PARAM, str3);
        }
        return launchMetaAppIntent(context, intentA03, str4, "Stories");
    }

    public final boolean shareTextToFacebookFeed(Context context, String str, String str2, String str3) {
        AnonymousClass005.A0x(context, str, str2);
        return shareTextTo(context, str, str2, null, null, HatchShareKt.FACEBOOK_NEWS_FEED_ALIAS, str3);
    }

    public final boolean shareTextToInstagramDirect(Context context, String str, String str2, String str3) {
        AnonymousClass003.A0u(context, str);
        return shareTextTo(context, str, "com.instagram.android", str2, str3, null, null);
    }

    public final boolean shareTextToMessenger(Context context, String str, String str2, String str3) {
        AnonymousClass003.A0u(context, str);
        return shareTextTo(context, str, "com.facebook.orca", str2, str3, null, null);
    }

    public final boolean shareTextToThreads(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        return shareTextTo(context, str, "com.instagram.barcelona", null, null, null, null);
    }

    public final boolean shareTextToWhatsApp(Context context, String str, String str2) {
        AnonymousClass005.A0x(context, str, str2);
        return shareTextTo(context, str, str2, null, null, null, null);
    }

    public final boolean shareTextToX(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        return shareTextTo(context, str, HatchShareKt.X_PACKAGE, null, null, null, null);
    }

    private final void addContactDestination(Intent intent, String str, String str2) {
        if (str == null || C7BY.A0j(str) || str2 == null || C7BY.A0j(str2)) {
            return;
        }
        intent.putExtra(HatchShareKt.CONTACT_DESTINATION_TYPE_KEY, str);
        intent.putExtra(HatchShareKt.CONTACT_DESTINATION_HASH_KEY, String.valueOf(str2.hashCode()));
    }

    private final Intent createMediaShareIntent(Context context, Uri uri, String str, String str2, String str3, String str4, String str5, String str6) {
        Intent intentA03 = C60P.A03("android.intent.action.SEND");
        intentA03.setType(str);
        intentA03.putExtra("android.intent.extra.STREAM", uri);
        if (str2 != null) {
            intentA03.putExtra("android.intent.extra.TEXT", str2);
            if ("com.facebook.orca".equals(str3)) {
                intentA03.putExtra(HatchShareKt.MESSENGER_MEDIA_CAPTION_KEY, str2);
                intentA03.putExtra(HatchShareKt.MESSENGER_SHOW_COMPOSER_KEY, true);
                intentA03.putExtra(HatchShareKt.COMPOSER_INITIAL_TEXT_KEY, str2);
            }
        }
        intentA03.setPackage(str3);
        if (str6 != null) {
            intentA03.setClassName(str3, str6);
        }
        C60Q.A16(context.getContentResolver(), intentA03, uri, "Shared media");
        HatchShare hatchShare = INSTANCE;
        hatchShare.addAttribution(intentA03, context, str3);
        hatchShare.addContactDestination(intentA03, str4, str5);
        if ("com.facebook.orca".equals(str3) && str5 != null) {
            intentA03.putExtra(HatchShareKt.MESSENGER_PRESELECTED_RECIPIENTS_KEY, new String[]{str5});
        }
        return intentA03;
    }

    public static /* synthetic */ Intent createMediaShareIntent$default(HatchShare hatchShare, Context context, Uri uri, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        if ((i & 128) != 0) {
            str6 = null;
        }
        return hatchShare.createMediaShareIntent(context, uri, str, str2, str3, str4, str5, str6);
    }

    private final Activity findActivity(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            C7384Etj.A0U(context);
        }
        return (Activity) context;
    }

    private final boolean launchInstagramIntent(Context context, Intent intent, String str) {
        return launchMetaAppIntent(context, intent, "com.instagram.android", str);
    }

    private final void putStoryAudio(Intent intent, HatchStoryAudio hatchStoryAudio) {
        if (hatchStoryAudio != null) {
            String str = hatchStoryAudio.assetId;
            if (str != null) {
                intent.putExtra(HatchShareKt.AUDIO_ASSET_ID_PARAM, str);
            }
            intent.putExtra(HatchShareKt.AUDIO_CLUSTER_ID_PARAM, hatchStoryAudio.clusterId);
            intent.putExtra(HatchShareKt.AUDIO_START_TIME_MS_PARAM, hatchStoryAudio.startMs);
            Integer num = hatchStoryAudio.durationMs;
            if (num != null) {
                intent.putExtra(HatchShareKt.AUDIO_OVERLAP_DURATION_MS_PARAM, num.intValue());
            }
        }
    }

    public static /* synthetic */ boolean shareAvatarVideoToInstagramStory$default(HatchShare hatchShare, Context context, Uri uri, String str, String str2, int i, int i2, int i3, String str3, String str4, Uri uri2, Float f, String str5, boolean z, int i4, Object obj) {
        if ((i4 & 128) != 0) {
            str3 = null;
        }
        if ((i4 & 256) != 0) {
            str4 = null;
        }
        if ((i4 & 512) != 0) {
            uri2 = null;
        }
        if ((i4 & 1024) != 0) {
            f = null;
        }
        if ((i4 & 2048) != 0) {
            str5 = HatchShareKt.DEFAULT_INSTAGRAM_LINK_STICKER_ID;
        }
        return hatchShare.shareAvatarVideoToInstagramStory(context, uri, str, str2, i, i2, i3, str3, str4, uri2, f, str5, C60Q.A1Q(i4 & 4096, z));
    }

    public static /* synthetic */ boolean shareMediaTo$default(HatchShare hatchShare, Context context, Uri uri, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        if ((i & 128) != 0) {
            str6 = null;
        }
        return hatchShare.shareMediaTo(context, uri, str, str2, str3, str4, str5, str6);
    }

    public static /* synthetic */ boolean shareMediaToFacebookStory$default(HatchShare hatchShare, Context context, Uri uri, String str, int i, int i2, String str2, String str3, Float f, String str4, HatchStoryAudio hatchStoryAudio, String str5, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            str2 = null;
        }
        if ((i3 & 64) != 0) {
            str3 = null;
        }
        if ((i3 & 128) != 0) {
            f = null;
        }
        if ((i3 & 256) != 0) {
            str4 = "com.facebook.katana";
        }
        if ((i3 & 512) != 0) {
            hatchStoryAudio = null;
        }
        if ((i3 & 1024) != 0) {
            str5 = null;
        }
        return hatchShare.shareMediaToFacebookStory(context, uri, str, i, i2, str2, str3, f, str4, hatchStoryAudio, str5);
    }

    public static /* synthetic */ boolean shareMediaToInstagram$default(HatchShare hatchShare, Context context, Uri uri, String str, String str2, String str3, String str4, String str5, Uri uri2, Float f, String str6, boolean z, String str7, String str8, String str9, HatchStoryAudio hatchStoryAudio, boolean z2, String str10, int i, Object obj) {
        if ((i & 2048) != 0) {
            str7 = null;
        }
        if ((i & 4096) != 0) {
            str8 = null;
        }
        if ((i & 8192) != 0) {
            str9 = null;
        }
        if ((i & 16384) != 0) {
            hatchStoryAudio = null;
        }
        boolean zA1L = C3cH.A1L(32768, i, z2);
        if ((i & 65536) != 0) {
            str10 = null;
        }
        return hatchShare.shareMediaToInstagram(context, uri, str, str2, str3, str4, str5, uri2, f, str6, z, str7, str8, str9, hatchStoryAudio, zA1L, str10);
    }

    public static /* synthetic */ boolean shareMediaToInstagramDirect$default(HatchShare hatchShare, Context context, Uri uri, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        return hatchShare.shareMediaToInstagramDirect(context, uri, str, str2, str3, str4);
    }

    public static /* synthetic */ boolean shareMediaToInstagramStory$default(HatchShare hatchShare, Context context, Uri uri, String str, String str2, String str3, Uri uri2, Float f, String str4, boolean z, HatchStoryAudio hatchStoryAudio, boolean z2, String str5, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            uri2 = null;
        }
        if ((i & 64) != 0) {
            f = null;
        }
        if ((i & 128) != 0) {
            str4 = HatchShareKt.DEFAULT_INSTAGRAM_LINK_STICKER_ID;
        }
        if ((i & 256) != 0) {
            z = true;
        }
        if ((i & 512) != 0) {
            hatchStoryAudio = null;
        }
        if ((i & 1024) != 0) {
            z2 = false;
        }
        if ((i & 2048) != 0) {
            str5 = null;
        }
        return hatchShare.shareMediaToInstagramStory(context, uri, str, str2, str3, uri2, f, str4, z, hatchStoryAudio, z2, str5);
    }

    public static /* synthetic */ boolean shareMediaToMessenger$default(HatchShare hatchShare, Context context, Uri uri, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        return hatchShare.shareMediaToMessenger(context, uri, str, str2, str3, str4);
    }

    public static /* synthetic */ boolean shareMediaToThreads$default(HatchShare hatchShare, Context context, Uri uri, String str, String str2, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        return hatchShare.shareMediaToThreads(context, uri, str, str2, str3);
    }

    public static /* synthetic */ boolean shareStickerToFacebookStory$default(HatchShare hatchShare, Context context, Uri uri, String str, int i, int i2, String str2, String str3, Float f, String str4, Float f2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            str2 = null;
        }
        if ((i3 & 64) != 0) {
            str3 = null;
        }
        if ((i3 & 128) != 0) {
            f = null;
        }
        if ((i3 & 256) != 0) {
            str4 = "com.facebook.katana";
        }
        if ((i3 & 512) != 0) {
            f2 = null;
        }
        return hatchShare.shareStickerToFacebookStory(context, uri, str, i, i2, str2, str3, f, str4, f2);
    }

    public static /* synthetic */ boolean shareStickerToInstagramStory$default(HatchShare hatchShare, Context context, Uri uri, String str, int i, int i2, String str2, String str3, Uri uri2, Float f, String str4, boolean z, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            str2 = null;
        }
        if ((i3 & 64) != 0) {
            str3 = null;
        }
        if ((i3 & 128) != 0) {
            uri2 = null;
        }
        if ((i3 & 256) != 0) {
            f = null;
        }
        if ((i3 & 512) != 0) {
            str4 = HatchShareKt.DEFAULT_INSTAGRAM_LINK_STICKER_ID;
        }
        if ((i3 & 1024) != 0) {
            z = true;
        }
        return hatchShare.shareStickerToInstagramStory(context, uri, str, i, i2, str2, str3, uri2, f, str4, z);
    }

    public static /* synthetic */ boolean shareStickersToFacebookStory$default(HatchShare hatchShare, Context context, List list, String str, int i, int i2, String str2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            str2 = null;
        }
        if ((i3 & 64) != 0) {
            str3 = null;
        }
        if ((i3 & 128) != 0) {
            str4 = "com.facebook.katana";
        }
        return hatchShare.shareStickersToFacebookStory(context, list, str, i, i2, str2, str3, str4);
    }

    public static /* synthetic */ boolean shareText$default(HatchShare hatchShare, Context context, String str, String str2, Uri uri, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            uri = null;
        }
        return hatchShare.shareText(context, str, str2, uri);
    }

    public static /* synthetic */ boolean shareTextTo$default(HatchShare hatchShare, Context context, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            str6 = null;
        }
        return hatchShare.shareTextTo(context, str, str2, str3, str4, str5, str6);
    }

    public static /* synthetic */ boolean shareTextToInstagramDirect$default(HatchShare hatchShare, Context context, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        return hatchShare.shareTextToInstagramDirect(context, str, str2, str3);
    }

    public static /* synthetic */ boolean shareTextToMessenger$default(HatchShare hatchShare, Context context, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        return hatchShare.shareTextToMessenger(context, str, str2, str3);
    }

    public static /* synthetic */ boolean shareTextToWhatsApp$default(HatchShare hatchShare, Context context, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "com.whatsapp";
        }
        return hatchShare.shareTextToWhatsApp(context, str, str2);
    }

    public static /* synthetic */ boolean shareToFacebookStory$default(HatchShare hatchShare, Context context, Uri uri, String str, int i, int i2, String str2, String str3, Float f, String str4, boolean z, Float f2, HatchStoryAudio hatchStoryAudio, String str5, int i3, Object obj) {
        if ((i3 & 1024) != 0) {
            f2 = null;
        }
        if ((i3 & 2048) != 0) {
            hatchStoryAudio = null;
        }
        if ((i3 & 4096) != 0) {
            str5 = null;
        }
        return hatchShare.shareToFacebookStory(context, uri, str, i, i2, str2, str3, f, str4, z, f2, hatchStoryAudio, str5);
    }

    public static /* synthetic */ void shareUrl$default(HatchShare hatchShare, Context context, String str, String str2, Uri uri, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            uri = null;
        }
        hatchShare.shareUrl(context, str, str2, uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addAttribution(android.content.Intent r2, android.content.Context r3, java.lang.String r4) {
        /*
            r1 = this;
            int r0 = r4.hashCode()
            switch(r0) {
                case -662003450: goto L8;
                case -122760062: goto Lb;
                case 419128298: goto L18;
                case 714499313: goto L1b;
                case 908140028: goto L28;
                default: goto L7;
            }
        L7:
            return
        L8:
            java.lang.String r0 = "com.instagram.android"
            goto Ld
        Lb:
            java.lang.String r0 = "com.instagram.barcelona"
        Ld:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "4331325740476680"
            java.lang.String r0 = "com.instagram.platform.extra.APPLICATION_ID"
            goto L34
        L18:
            java.lang.String r0 = "com.facebook.wakizashi"
            goto L1d
        L1b:
            java.lang.String r0 = "com.facebook.katana"
        L1d:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "4331325740476680"
            java.lang.String r0 = "com.facebook.platform.extra.APPLICATION_ID"
            goto L34
        L28:
            java.lang.String r0 = "com.facebook.orca"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "4331325740476680"
            java.lang.String r0 = "com.facebook.orca.extra.APPLICATION_ID"
        L34:
            r2.putExtra(r0, r1)
            java.lang.String r1 = "source_application"
            java.lang.String r0 = r3.getPackageName()
            r2.putExtra(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.actions.HatchShare.addAttribution(android.content.Intent, android.content.Context, java.lang.String):void");
    }

    private final boolean launchMetaAppIntent(Context context, Intent intent, String str, String str2) {
        if (!redirectMissingAppToPlayStore(context, str)) {
            try {
                if (intent.resolveActivity(context.getPackageManager()) != null) {
                    C7mU c7mUA00 = C7mU.A00();
                    if (!c7mUA00.A05().A05(context, intent)) {
                        if (c7mUA00.A03().A05(context, intent)) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Exception e) {
                CFK.A0D(HatchShareKt.TAG, "%s %s media share failed", e, str, str2);
                return false;
            }
        }
        return true;
    }

    private final boolean launchTargetIntent(Context context, Intent intent, String str) {
        if (redirectMissingAppToPlayStore(context, str)) {
            return true;
        }
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return launchExplicitTargetIntent(context, intent, str);
        }
        CFK.A0H(HatchShareKt.TAG, "No activity resolved share package=%s component=%s", str, intent.getComponent());
        return false;
    }

    private final ComponentName[] ownShareTargets(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent(intent).setPackage(context.getPackageName()), 0);
        C7384Etj.A0U(listQueryIntentActivities);
        ArrayList arrayListA0i = AnonymousClass003.A0i(listQueryIntentActivities);
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            arrayListA0i.add(new ComponentName(((PackageItemInfo) activityInfo).packageName, ((PackageItemInfo) activityInfo).name));
        }
        return (ComponentName[]) arrayListA0i.toArray(new ComponentName[0]);
    }

    private final boolean shareMediaTo(Context context, Uri uri, String str, String str2, String str3, String str4, String str5, String str6) {
        return launchTargetIntent(context, createMediaShareIntent(context, uri, str, str2, str3, str4, str5, str6), str3);
    }

    private final boolean shareMediaToInstagram(Context context, Uri uri, String str, String str2, String str3, String str4, String str5, Uri uri2, Float f, String str6, boolean z, String str7, String str8, String str9, HatchStoryAudio hatchStoryAudio, boolean z2, String str10) {
        Intent intentA03 = C60P.A03(str2);
        intentA03.setPackage("com.instagram.android");
        intentA03.setDataAndType(uri, str);
        HatchShare hatchShare = INSTANCE;
        hatchShare.putStoryAudio(intentA03, hatchStoryAudio);
        if (z2) {
            intentA03.putExtra(HatchShareKt.MUSE_ADD_YOURS_PARAM, true);
            if (str10 != null) {
                intentA03.putExtra(HatchShareKt.MUSE_AVATAR_NAME_PARAM, str10);
            }
        }
        intentA03.putExtra("android.intent.extra.STREAM", uri);
        if (str7 != null) {
            intentA03.putExtra("android.intent.extra.TEXT", str7);
            intentA03.putExtra(HatchShareKt.INSTAGRAM_SHOW_COMPOSER_KEY, true);
            intentA03.putExtra(HatchShareKt.INSTAGRAM_SHOW_TEXT_IN_COMPOSER_KEY, true);
        }
        hatchShare.addContactDestination(intentA03, str8, str9);
        C60Q.A16(context.getContentResolver(), intentA03, uri, "Shared media");
        hatchShare.addAttribution(intentA03, context, "com.instagram.android");
        if (str4 != null) {
            intentA03.putExtra(HatchShareKt.CONTENT_URL_PARAM, str4);
        }
        if (str5 != null) {
            intentA03.putExtra(HatchShareKt.LINK_STICKER_CUSTOM_CTA_PARAM, str5);
        }
        if (f != null) {
            float fFloatValue = f.floatValue();
            if (Math.abs(fFloatValue) <= Float.MAX_VALUE && 0.0f <= fFloatValue && fFloatValue <= 1.0f) {
                intentA03.putExtra(HatchShareKt.LINK_STICKER_CENTER_Y_RATIO_PARAM, fFloatValue);
            }
        }
        if (str6 != null) {
            intentA03.putExtra(HatchShareKt.LINK_STICKER_ID_PARAM, str6);
        }
        if (z) {
            intentA03.putExtra(HatchShareKt.LINK_STICKER_PRESERVE_CUSTOM_CTA_CASE_PARAM, true);
        }
        C60R.A0y(intentA03, uri2);
        return launchInstagramIntent(context, intentA03, str3);
    }

    public static /* synthetic */ boolean shareMediaToWhatsApp$default(HatchShare hatchShare, Context context, Uri uri, String str, String str2, String str3, int i, Object obj) {
        String strA0u = AnonymousClass006.A0u(i, str2);
        if ((i & 16) != 0) {
            str3 = "com.whatsapp";
        }
        return hatchShare.shareMediaToWhatsApp(context, uri, str, strA0u, str3);
    }

    private final String toHexColor(int i) {
        return String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1));
    }

    public final boolean shareMedia(Context context, Uri uri, String str, String str2, boolean z) {
        AnonymousClass005.A1Z(context, uri, str);
        Intent intentA03 = C60P.A03("android.intent.action.SEND");
        intentA03.setType(str);
        intentA03.putExtra("android.intent.extra.STREAM", uri);
        if (str2 != null) {
            intentA03.putExtra("android.intent.extra.TEXT", str2);
        }
        C60Q.A16(context.getContentResolver(), intentA03, uri, "Shared media");
        Intent intentCreateChooser = Intent.createChooser(intentA03, null);
        if (z) {
            intentCreateChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", INSTANCE.ownShareTargets(context, intentA03));
        }
        return C60Q.A0S().A05(context, intentCreateChooser);
    }

    public final boolean shareStickerToInstagramStory(Context context, Uri uri, String str, int i, int i2, String str2, String str3, Uri uri2, Float f, String str4, boolean z) {
        boolean zA1Z = AnonymousClass005.A1Z(context, uri, str);
        Intent intentA03 = C60P.A03(HatchShareKt.INSTAGRAM_STORY_ACTION);
        intentA03.setPackage("com.instagram.android");
        intentA03.setType(str);
        intentA03.putExtra(HatchShareKt.INTERACTIVE_ASSET_URI_PARAM, uri);
        HatchShare hatchShare = INSTANCE;
        intentA03.putExtra(HatchShareKt.TOP_BACKGROUND_COLOR_PARAM, hatchShare.toHexColor(i));
        intentA03.putExtra(HatchShareKt.BOTTOM_BACKGROUND_COLOR_PARAM, hatchShare.toHexColor(i2));
        C60Q.A16(context.getContentResolver(), intentA03, uri, "Story sticker");
        hatchShare.addAttribution(intentA03, context, "com.instagram.android");
        if (str2 != null) {
            intentA03.putExtra(HatchShareKt.CONTENT_URL_PARAM, str2);
        }
        if (str3 != null) {
            intentA03.putExtra(HatchShareKt.LINK_STICKER_CUSTOM_CTA_PARAM, str3);
        }
        if (f != null) {
            float fFloatValue = f.floatValue();
            if (Math.abs(fFloatValue) <= Float.MAX_VALUE && 0.0f <= fFloatValue && fFloatValue <= 1.0f) {
                intentA03.putExtra(HatchShareKt.LINK_STICKER_CENTER_Y_RATIO_PARAM, fFloatValue);
            }
        }
        if (str4 != null) {
            intentA03.putExtra(HatchShareKt.LINK_STICKER_ID_PARAM, str4);
        }
        if (z) {
            intentA03.putExtra(HatchShareKt.LINK_STICKER_PRESERVE_CUSTOM_CTA_CASE_PARAM, zA1Z);
        }
        C60R.A0y(intentA03, uri2);
        return launchInstagramIntent(context, intentA03, "Stories");
    }

    public final boolean shareText(Context context, String str, String str2, Uri uri) {
        C60P.A1Y(context, str);
        Intent intentA0A = C60R.A0A(str);
        if (str2 != null) {
            intentA0A.putExtra("android.intent.extra.TITLE", str2);
            intentA0A.putExtra("android.intent.extra.SUBJECT", str2);
        }
        if (uri != null) {
            C60Q.A16(context.getContentResolver(), intentA0A, uri, str2);
        }
        return C60Q.A0S().A05(context, Intent.createChooser(intentA0A, null));
    }

    public final boolean shareTextTo(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        boolean zA1Z = AnonymousClass005.A1Z(context, str, str2);
        Intent intentA0A = C60R.A0A(str);
        intentA0A.setPackage(str2);
        if (str5 != null) {
            intentA0A.setClassName(str2, str5);
        }
        HatchShare hatchShare = INSTANCE;
        hatchShare.addAttribution(intentA0A, context, str2);
        hatchShare.addContactDestination(intentA0A, str3, str4);
        if (str6 != null) {
            intentA0A.putExtra(HatchShareKt.COMPOSER_INITIAL_TEXT_KEY, str6);
        }
        if (str2.equals("com.instagram.android")) {
            intentA0A.putExtra(HatchShareKt.INSTAGRAM_SHOW_COMPOSER_KEY, zA1Z);
            intentA0A.putExtra(HatchShareKt.INSTAGRAM_SHOW_TEXT_IN_COMPOSER_KEY, zA1Z);
        } else if (str2.equals("com.facebook.orca")) {
            intentA0A.putExtra(HatchShareKt.MESSENGER_SHOW_COMPOSER_KEY, zA1Z);
            intentA0A.putExtra(HatchShareKt.COMPOSER_INITIAL_TEXT_KEY, str);
            if (str4 != null) {
                intentA0A.putExtra(HatchShareKt.MESSENGER_PRESELECTED_RECIPIENTS_KEY, new String[]{str4});
            }
        }
        return launchTargetIntent(context, intentA0A, str2);
    }

    public final boolean shareTextToMessages(Context context, String str) {
        boolean zA1b = AnonymousClass004.A1b(context, str);
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
        if (defaultSmsPackage == null) {
            return zA1b;
        }
        Intent intentA03 = C60P.A03("android.intent.action.SENDTO");
        intentA03.setData(new Uri.Builder().scheme("smsto").build());
        intentA03.putExtra("sms_body", str);
        intentA03.setPackage(defaultSmsPackage);
        return launchExplicitTargetIntent(context, intentA03, defaultSmsPackage);
    }

    public final void shareUrl(Context context, String str, String str2, Uri uri) {
        AnonymousClass003.A0u(context, str);
        shareText(context, str, str2, uri);
    }

    public final boolean shareAvatarVideoToInstagramStory(Context context, Uri uri, String str, String str2, int i, int i2, int i3, String str3, String str4, Uri uri2, Float f, String str5, boolean z) {
        C7384Etj.A0Y(context, 0);
        AnonymousClass005.A11(uri, str, str2, 1);
        if (!supportsInstagramAvatarStories(context)) {
            return shareMediaToInstagramStory(context, uri, str, str3, str4, uri2, f, str5, z, null, false, null);
        }
        String hexColor = toHexColor(i);
        String hexColor2 = toHexColor(i2);
        String hexColor3 = toHexColor(i3);
        Intent intentA03 = C60P.A03(HatchShareKt.INSTAGRAM_STORY_ACTION);
        intentA03.setPackage("com.instagram.android");
        intentA03.setType(str);
        intentA03.putExtra(HatchShareKt.INTERACTIVE_ASSET_URI_PARAM, uri);
        intentA03.putExtra(HatchShareKt.TOP_BACKGROUND_COLOR_PARAM, hexColor);
        intentA03.putExtra(HatchShareKt.BOTTOM_BACKGROUND_COLOR_PARAM, hexColor2);
        intentA03.putExtra(HatchShareKt.HATCH_AVATAR_STORY_VERSION_PARAM, 1);
        intentA03.putExtra(HatchShareKt.HATCH_AVATAR_STORY_BUBBLE_TEXT_PARAM, str2);
        intentA03.putExtra(HatchShareKt.HATCH_AVATAR_STORY_BUBBLE_TEXT_COLOR_PARAM, hexColor3);
        intentA03.putExtra(HatchShareKt.HATCH_AVATAR_STORY_TOP_COLOR_PARAM, hexColor);
        intentA03.putExtra(HatchShareKt.HATCH_AVATAR_STORY_BOTTOM_COLOR_PARAM, hexColor2);
        C60Q.A16(context.getContentResolver(), intentA03, uri, "Avatar video");
        INSTANCE.addAttribution(intentA03, context, "com.instagram.android");
        if (str3 != null) {
            intentA03.putExtra(HatchShareKt.CONTENT_URL_PARAM, str3);
        }
        if (str4 != null) {
            intentA03.putExtra(HatchShareKt.LINK_STICKER_CUSTOM_CTA_PARAM, str4);
        }
        if (f != null) {
            float fFloatValue = f.floatValue();
            if (Math.abs(fFloatValue) <= Float.MAX_VALUE && 0.0f <= fFloatValue && fFloatValue <= 1.0f) {
                intentA03.putExtra(HatchShareKt.LINK_STICKER_CENTER_Y_RATIO_PARAM, fFloatValue);
            }
        }
        if (str5 != null) {
            intentA03.putExtra(HatchShareKt.LINK_STICKER_ID_PARAM, str5);
        }
        if (z) {
            intentA03.putExtra(HatchShareKt.LINK_STICKER_PRESERVE_CUSTOM_CTA_CASE_PARAM, true);
        }
        C60R.A0y(intentA03, uri2);
        return launchInstagramIntent(context, intentA03, "Stories");
    }

    private final boolean shareToFacebookStory(Context context, Uri uri, String str, int i, int i2, String str2, String str3, Float f, String str4, boolean z, Float f2, HatchStoryAudio hatchStoryAudio, String str5) {
        Intent intentA03 = C60P.A03(HatchShareKt.FACEBOOK_STORY_ACTION);
        intentA03.setPackage(str4);
        HatchShare hatchShare = INSTANCE;
        hatchShare.putStoryAudio(intentA03, hatchStoryAudio);
        if (str5 != null) {
            intentA03.putExtra(HatchShareKt.MUSE_AVATAR_NAME_PARAM, str5);
        }
        if (z) {
            intentA03.setType(str);
            intentA03.putExtra(HatchShareKt.INTERACTIVE_ASSET_URI_PARAM, uri);
        } else {
            intentA03.setDataAndType(uri, str);
        }
        intentA03.putExtra(HatchShareKt.TOP_BACKGROUND_COLOR_PARAM, hatchShare.toHexColor(i));
        intentA03.putExtra(HatchShareKt.BOTTOM_BACKGROUND_COLOR_PARAM, hatchShare.toHexColor(i2));
        intentA03.setClipData(ClipData.newUri(context.getContentResolver(), "Story media", uri));
        intentA03.addFlags(1);
        hatchShare.addAttribution(intentA03, context, str4);
        if (str2 != null) {
            intentA03.putExtra(HatchShareKt.CONTENT_URL_PARAM, str2);
            intentA03.putExtra(HatchShareKt.LINK_STICKER_URL_PARAM, str2);
        }
        if (str3 != null) {
            intentA03.putExtra(HatchShareKt.LINK_STICKER_TEXT_PARAM, str3);
        }
        if (f != null) {
            float fFloatValue = f.floatValue();
            if (Math.abs(fFloatValue) <= Float.MAX_VALUE && 0.0f <= fFloatValue && fFloatValue <= 1.0f) {
                intentA03.putExtra(HatchShareKt.LINK_STICKER_CENTER_Y_RATIO_PARAM, fFloatValue);
            }
        }
        if (f2 != null) {
            intentA03.putExtra(HatchShareKt.STICKER_WIDTH_RATIO_PARAM, f2.floatValue());
        }
        return launchMetaAppIntent(context, intentA03, str4, "Stories");
    }
}
