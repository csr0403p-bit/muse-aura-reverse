package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.model.HatchDanceShare;
import com.facebook.aura.model.HatchDanceShare$$serializer;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HatchShareSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String contentId;
    public final HatchDanceShare dance;
    public final HatchShareDownloadTarget downloadTarget;
    public final String instagramStoriesStickerUri;
    public final String mediaUri;
    public final String messageId;
    public final String previewTitle;
    public final String previewUri;
    public final String shareText;
    public final ShareType shareType;
    public final String threadId;

    public final class Companion {
        public final C9hr<HatchShareSheetKey> serializer() {
            return HatchShareSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{AbstractC5321DgF.A02(num, HatchShareSheetKey$Companion$$childSerializers$1.INSTANCE), null, null, null, null, AbstractC5321DgF.A02(num, HatchShareSheetKey$Companion$$childSerializers$2.INSTANCE), null, null, null, null, null};
    }

    public HatchShareSheetKey(ShareType shareType, String str, String str2, String str3, String str4, HatchShareDownloadTarget hatchShareDownloadTarget, String str5, String str6, String str7, String str8, HatchDanceShare hatchDanceShare) {
        C7384Etj.A0Y(shareType, 0);
        this.shareType = shareType;
        this.previewUri = str;
        this.previewTitle = str2;
        this.mediaUri = str3;
        this.shareText = str4;
        this.downloadTarget = hatchShareDownloadTarget;
        this.instagramStoriesStickerUri = str5;
        this.contentId = str6;
        this.messageId = str7;
        this.threadId = str8;
        this.dance = hatchDanceShare;
    }

    public final HatchShareSheetKey copy(ShareType shareType, String str, String str2, String str3, String str4, HatchShareDownloadTarget hatchShareDownloadTarget, String str5, String str6, String str7, String str8, HatchDanceShare hatchDanceShare) {
        C7384Etj.A0Y(shareType, 0);
        return new HatchShareSheetKey(shareType, str, str2, str3, str4, hatchShareDownloadTarget, str5, str6, str7, str8, hatchDanceShare);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchShareSheetKey) {
                HatchShareSheetKey hatchShareSheetKey = (HatchShareSheetKey) obj;
                if (this.shareType != hatchShareSheetKey.shareType || !C7384Etj.areEqual(this.previewUri, hatchShareSheetKey.previewUri) || !C7384Etj.areEqual(this.previewTitle, hatchShareSheetKey.previewTitle) || !C7384Etj.areEqual(this.mediaUri, hatchShareSheetKey.mediaUri) || !C7384Etj.areEqual(this.shareText, hatchShareSheetKey.shareText) || !C7384Etj.areEqual(this.downloadTarget, hatchShareSheetKey.downloadTarget) || !C7384Etj.areEqual(this.instagramStoriesStickerUri, hatchShareSheetKey.instagramStoriesStickerUri) || !C7384Etj.areEqual(this.contentId, hatchShareSheetKey.contentId) || !C7384Etj.areEqual(this.messageId, hatchShareSheetKey.messageId) || !C7384Etj.areEqual(this.threadId, hatchShareSheetKey.threadId) || !C7384Etj.areEqual(this.dance, hatchShareSheetKey.dance)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchShareSheetKey copy$default(HatchShareSheetKey hatchShareSheetKey, ShareType shareType, String str, String str2, String str3, String str4, HatchShareDownloadTarget hatchShareDownloadTarget, String str5, String str6, String str7, String str8, HatchDanceShare hatchDanceShare, int i, Object obj) {
        if ((i & 1) != 0) {
            shareType = hatchShareSheetKey.shareType;
        }
        if ((i & 2) != 0) {
            str = hatchShareSheetKey.previewUri;
        }
        if ((i & 4) != 0) {
            str2 = hatchShareSheetKey.previewTitle;
        }
        if ((i & 8) != 0) {
            str3 = hatchShareSheetKey.mediaUri;
        }
        if ((i & 16) != 0) {
            str4 = hatchShareSheetKey.shareText;
        }
        if ((i & 32) != 0) {
            hatchShareDownloadTarget = hatchShareSheetKey.downloadTarget;
        }
        if ((i & 64) != 0) {
            str5 = hatchShareSheetKey.instagramStoriesStickerUri;
        }
        if ((i & 128) != 0) {
            str6 = hatchShareSheetKey.contentId;
        }
        if ((i & 256) != 0) {
            str7 = hatchShareSheetKey.messageId;
        }
        if ((i & 512) != 0) {
            str8 = hatchShareSheetKey.threadId;
        }
        if ((i & 1024) != 0) {
            hatchDanceShare = hatchShareSheetKey.dance;
        }
        return hatchShareSheetKey.copy(shareType, str, str2, str3, str4, hatchShareDownloadTarget, str5, str6, str7, str8, hatchDanceShare);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(HatchShareSheetKey hatchShareSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchShareSheetKey.shareType != ShareType.DEFAULT) {
            c9j5.AAQ(hatchShareSheetKey.shareType, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || hatchShareSheetKey.previewUri != null) {
            c9j5.AAP(hatchShareSheetKey.previewUri, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || hatchShareSheetKey.previewTitle != null) {
            c9j5.AAP(hatchShareSheetKey.previewTitle, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || !C7384Etj.areEqual(hatchShareSheetKey.mediaUri, hatchShareSheetKey.previewUri)) {
            c9j5.AAP(hatchShareSheetKey.mediaUri, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || hatchShareSheetKey.shareText != null) {
            c9j5.AAP(hatchShareSheetKey.shareText, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || hatchShareSheetKey.downloadTarget != null) {
            c9j5.AAP(hatchShareSheetKey.downloadTarget, C3cH.A15(f0cArr, 5), c9iZ, 5);
        }
        if (zAfR || hatchShareSheetKey.instagramStoriesStickerUri != null) {
            c9j5.AAP(hatchShareSheetKey.instagramStoriesStickerUri, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || hatchShareSheetKey.contentId != null) {
            c9j5.AAP(hatchShareSheetKey.contentId, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || hatchShareSheetKey.messageId != null) {
            c9j5.AAP(hatchShareSheetKey.messageId, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || hatchShareSheetKey.threadId != null) {
            c9j5.AAP(hatchShareSheetKey.threadId, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || hatchShareSheetKey.dance != null) {
            c9j5.AAP(hatchShareSheetKey.dance, HatchDanceShare$$serializer.INSTANCE, c9iZ, 10);
        }
    }

    public final ShareType component1() {
        return this.shareType;
    }

    public final String component10() {
        return this.threadId;
    }

    public final HatchDanceShare component11() {
        return this.dance;
    }

    public final String component2() {
        return this.previewUri;
    }

    public final String component3() {
        return this.previewTitle;
    }

    public final String component4() {
        return this.mediaUri;
    }

    public final String component5() {
        return this.shareText;
    }

    public final HatchShareDownloadTarget component6() {
        return this.downloadTarget;
    }

    public final String component7() {
        return this.instagramStoriesStickerUri;
    }

    public final String component8() {
        return this.contentId;
    }

    public final String component9() {
        return this.messageId;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final HatchDanceShare getDance() {
        return this.dance;
    }

    public final HatchShareDownloadTarget getDownloadTarget() {
        return this.downloadTarget;
    }

    public final String getInstagramStoriesStickerUri() {
        return this.instagramStoriesStickerUri;
    }

    public final String getMediaUri() {
        return this.mediaUri;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getPreviewTitle() {
        return this.previewTitle;
    }

    public final String getPreviewUri() {
        return this.previewUri;
    }

    public final String getShareText() {
        return this.shareText;
    }

    public final ShareType getShareType() {
        return this.shareType;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public int hashCode() {
        return ((((((((((((((((((AnonymousClass005.A0E(this.shareType) + AnonymousClass006.A0G(this.previewUri)) * 31) + AnonymousClass006.A0G(this.previewTitle)) * 31) + AnonymousClass006.A0G(this.mediaUri)) * 31) + AnonymousClass006.A0G(this.shareText)) * 31) + AnonymousClass006.A0D(this.downloadTarget)) * 31) + AnonymousClass006.A0G(this.instagramStoriesStickerUri)) * 31) + AnonymousClass006.A0G(this.contentId)) * 31) + AnonymousClass006.A0G(this.messageId)) * 31) + AnonymousClass006.A0G(this.threadId)) * 31) + C3cH.A02(this.dance);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchShareSheetKey(int i, ShareType shareType, String str, String str2, String str3, String str4, HatchShareDownloadTarget hatchShareDownloadTarget, String str5, String str6, String str7, String str8, HatchDanceShare hatchDanceShare, C2hx c2hx) {
        this.shareType = (i & 1) == 0 ? ShareType.DEFAULT : shareType;
        if ((i & 2) == 0) {
            this.previewUri = null;
            str = null;
        } else {
            this.previewUri = str;
        }
        if ((i & 4) == 0) {
            this.previewTitle = null;
        } else {
            this.previewTitle = str2;
        }
        if ((i & 8) == 0) {
            this.mediaUri = str;
        } else {
            this.mediaUri = str3;
        }
        if ((i & 16) == 0) {
            this.shareText = null;
        } else {
            this.shareText = str4;
        }
        if ((i & 32) == 0) {
            this.downloadTarget = null;
        } else {
            this.downloadTarget = hatchShareDownloadTarget;
        }
        if ((i & 64) == 0) {
            this.instagramStoriesStickerUri = null;
        } else {
            this.instagramStoriesStickerUri = str5;
        }
        if ((i & 128) == 0) {
            this.contentId = null;
        } else {
            this.contentId = str6;
        }
        if ((i & 256) == 0) {
            this.messageId = null;
        } else {
            this.messageId = str7;
        }
        if ((i & 512) == 0) {
            this.threadId = null;
        } else {
            this.threadId = str8;
        }
        if ((i & 1024) == 0) {
            this.dance = null;
        } else {
            this.dance = hatchDanceShare;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HatchShareSheetKey(ShareType shareType, String str, String str2, String str3, String str4, HatchShareDownloadTarget hatchShareDownloadTarget, String str5, String str6, String str7, String str8, HatchDanceShare hatchDanceShare, int i, C06H c06h) {
        shareType = (i & 1) != 0 ? ShareType.DEFAULT : shareType;
        str = (i & 2) != 0 ? null : str;
        this(shareType, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? str : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : hatchShareDownloadTarget, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : hatchDanceShare);
    }

    public HatchShareSheetKey() {
        this(ShareType.DEFAULT, null, null, null, null, null, null, null, null, null, null);
    }
}
