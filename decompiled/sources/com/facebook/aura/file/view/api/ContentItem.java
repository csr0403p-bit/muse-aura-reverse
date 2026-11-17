package com.facebook.aura.file.view.api;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BL4;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import X.FGI;
import android.graphics.Bitmap;
import com.facebook.aura.components.musicattribution.MusicAttribution;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.model.HatchAttachmentAudio;
import com.facebook.aura.model.HatchAttachmentKind;
import com.facebook.aura.model.HatchDanceShare;

/* loaded from: classes.dex */
public final class ContentItem extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final HatchAttachmentAudio audio;
    public final Bitmap imageBitmap;
    public final String imageUri;
    public final boolean isBriefing;
    public final HatchAttachmentKind kind;
    public final String messageId;
    public final MusicAttribution music;
    public final String name;
    public final ContentViewerPageAccessory pageAccessory;
    public final String sharedElementKey;
    public final ContentSocialSource socialSource;
    public final BL4 sourceDecodeSizePx;
    public final String thumbnailUri;
    public final ContentType type;
    public final String workspacePath;

    public final class Companion {
        public final ContentItem fromWorkspaceEntry(WorkspaceEntry workspaceEntry, AbstractC3358CGz abstractC3358CGz) {
            boolean zA1b = AnonymousClass004.A1b(workspaceEntry, abstractC3358CGz);
            String strResolveWorkspacePath = HatchFileUIUtils.INSTANCE.resolveWorkspacePath(workspaceEntry.relativePath);
            return new ContentItem(workspaceEntry.name, ContentTypeDetector.INSTANCE.fromFileName(strResolveWorkspacePath), strResolveWorkspacePath, WorkspaceUriResolver.INSTANCE.resolveRawFileSystemUrl(strResolveWorkspacePath, abstractC3358CGz), null, FGI.A0M("lobster_content_", workspaceEntry.relativePath), null, null, null, zA1b, null, null, null, null, null);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContentItem) {
                ContentItem contentItem = (ContentItem) obj;
                if (!C7384Etj.areEqual(this.name, contentItem.name) || !C7384Etj.areEqual(this.type, contentItem.type) || !C7384Etj.areEqual(this.workspacePath, contentItem.workspacePath) || !C7384Etj.areEqual(this.imageUri, contentItem.imageUri) || !C7384Etj.areEqual(this.imageBitmap, contentItem.imageBitmap) || !C7384Etj.areEqual(this.sharedElementKey, contentItem.sharedElementKey) || !C7384Etj.areEqual(this.messageId, contentItem.messageId) || !C7384Etj.areEqual(this.thumbnailUri, contentItem.thumbnailUri) || !C7384Etj.areEqual(this.sourceDecodeSizePx, contentItem.sourceDecodeSizePx) || this.isBriefing != contentItem.isBriefing || !C7384Etj.areEqual(this.socialSource, contentItem.socialSource) || this.kind != contentItem.kind || !C7384Etj.areEqual(this.music, contentItem.music) || !C7384Etj.areEqual(this.audio, contentItem.audio) || !C7384Etj.areEqual(this.pageAccessory, contentItem.pageAccessory)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-9ysdgUI$default, reason: not valid java name */
    public static /* synthetic */ ContentItem m937copy9ysdgUI$default(ContentItem contentItem, String str, ContentType contentType, String str2, String str3, Bitmap bitmap, String str4, String str5, String str6, BL4 bl4, boolean z, ContentSocialSource contentSocialSource, HatchAttachmentKind hatchAttachmentKind, MusicAttribution musicAttribution, HatchAttachmentAudio hatchAttachmentAudio, ContentViewerPageAccessory contentViewerPageAccessory, int i, Object obj) {
        String str7 = str;
        ContentType contentType2 = contentType;
        String str8 = str3;
        Bitmap bitmap2 = bitmap;
        String str9 = str4;
        String str10 = str5;
        String str11 = str6;
        BL4 bl42 = bl4;
        boolean z2 = z;
        ContentSocialSource contentSocialSource2 = contentSocialSource;
        HatchAttachmentKind hatchAttachmentKind2 = hatchAttachmentKind;
        MusicAttribution musicAttribution2 = musicAttribution;
        HatchAttachmentAudio hatchAttachmentAudio2 = hatchAttachmentAudio;
        ContentViewerPageAccessory contentViewerPageAccessory2 = contentViewerPageAccessory;
        if ((i & 1) != 0) {
            str7 = contentItem.name;
        }
        if ((i & 2) != 0) {
            contentType2 = contentItem.type;
        }
        if ((i & 4) != 0) {
            str2 = contentItem.workspacePath;
        }
        if ((i & 8) != 0) {
            str8 = contentItem.imageUri;
        }
        if ((i & 16) != 0) {
            bitmap2 = contentItem.imageBitmap;
        }
        if ((i & 32) != 0) {
            str9 = contentItem.sharedElementKey;
        }
        if ((i & 64) != 0) {
            str10 = contentItem.messageId;
        }
        if ((i & 128) != 0) {
            str11 = contentItem.thumbnailUri;
        }
        if ((i & 256) != 0) {
            bl42 = contentItem.sourceDecodeSizePx;
        }
        if ((i & 512) != 0) {
            z2 = contentItem.isBriefing;
        }
        if ((i & 1024) != 0) {
            contentSocialSource2 = contentItem.socialSource;
        }
        if ((i & 2048) != 0) {
            hatchAttachmentKind2 = contentItem.kind;
        }
        if ((i & 4096) != 0) {
            musicAttribution2 = contentItem.music;
        }
        if ((i & 8192) != 0) {
            hatchAttachmentAudio2 = contentItem.audio;
        }
        if ((i & 16384) != 0) {
            contentViewerPageAccessory2 = contentItem.pageAccessory;
        }
        AnonymousClass003.A0u(str7, contentType2);
        String str12 = str8;
        return new ContentItem(str7, contentType2, str2, str12, bitmap2, str9, str10, str11, bl42, z2, contentSocialSource2, hatchAttachmentKind2, musicAttribution2, hatchAttachmentAudio2, contentViewerPageAccessory2);
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component10() {
        return this.isBriefing;
    }

    public final ContentSocialSource component11() {
        return this.socialSource;
    }

    public final HatchAttachmentKind component12() {
        return this.kind;
    }

    public final MusicAttribution component13() {
        return this.music;
    }

    public final HatchAttachmentAudio component14() {
        return this.audio;
    }

    public final ContentViewerPageAccessory component15() {
        return this.pageAccessory;
    }

    public final ContentType component2() {
        return this.type;
    }

    public final String component3() {
        return this.workspacePath;
    }

    public final String component4() {
        return this.imageUri;
    }

    public final Bitmap component5() {
        return this.imageBitmap;
    }

    public final String component6() {
        return this.sharedElementKey;
    }

    public final String component7() {
        return this.messageId;
    }

    public final String component8() {
        return this.thumbnailUri;
    }

    /* renamed from: component9-bOM6tXw, reason: not valid java name */
    public final BL4 m938component9bOM6tXw() {
        return this.sourceDecodeSizePx;
    }

    public final HatchAttachmentAudio getAudio() {
        return this.audio;
    }

    public final boolean getCanDelete() {
        return !this.isBriefing;
    }

    public final boolean getCanEdit() {
        return !this.isBriefing;
    }

    public final HatchDanceShare getDance() {
        HatchAttachmentKind hatchAttachmentKind = this.kind;
        if (hatchAttachmentKind == null || !hatchAttachmentKind.getSharesAsDance()) {
            return null;
        }
        return new HatchDanceShare(this.audio);
    }

    public final Bitmap getImageBitmap() {
        return this.imageBitmap;
    }

    public final String getImageUri() {
        return this.imageUri;
    }

    public final HatchAttachmentKind getKind() {
        return this.kind;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final MusicAttribution getMusic() {
        return this.music;
    }

    public final String getName() {
        return this.name;
    }

    public final ContentViewerPageAccessory getPageAccessory() {
        return this.pageAccessory;
    }

    public final ContentPrimaryAction getPrimaryAction() {
        HatchAttachmentKind hatchAttachmentKind = this.kind;
        return (hatchAttachmentKind == null || !hatchAttachmentKind.getUseShareAsPrimaryAction()) ? ContentPrimaryAction.Download : ContentPrimaryAction.Share;
    }

    public final String getSharedElementKey() {
        return this.sharedElementKey;
    }

    public final boolean getShowsPageIndicator() {
        HatchAttachmentKind hatchAttachmentKind = this.kind;
        return hatchAttachmentKind != null && hatchAttachmentKind.getShowsPageIndicator();
    }

    public final ContentSocialSource getSocialSource() {
        return this.socialSource;
    }

    /* renamed from: getSourceDecodeSizePx-bOM6tXw, reason: not valid java name */
    public final BL4 m940getSourceDecodeSizePxbOM6tXw() {
        return this.sourceDecodeSizePx;
    }

    public final String getThumbnailUri() {
        return this.thumbnailUri;
    }

    public final ContentType getType() {
        return this.type;
    }

    public final String getWorkspacePath() {
        return this.workspacePath;
    }

    public int hashCode() {
        int iA0F = (((((((((((AnonymousClass005.A0F(this.type, AnonymousClass001.A0G(this.name)) + AnonymousClass006.A0G(this.workspacePath)) * 31) + AnonymousClass006.A0G(this.imageUri)) * 31) + AnonymousClass006.A0D(this.imageBitmap)) * 31) + AnonymousClass006.A0G(this.sharedElementKey)) * 31) + AnonymousClass006.A0G(this.messageId)) * 31) + AnonymousClass006.A0G(this.thumbnailUri)) * 31;
        BL4 bl4 = this.sourceDecodeSizePx;
        return ((((((((C0KA.A01((iA0F + (bl4 == null ? 0 : AnonymousClass002.A0A(bl4.A00))) * 31, this.isBriefing) + AnonymousClass006.A0D(this.socialSource)) * 31) + AnonymousClass006.A0D(this.kind)) * 31) + AnonymousClass006.A0D(this.music)) * 31) + AnonymousClass006.A0D(this.audio)) * 31) + C06G.A04(this.pageAccessory);
    }

    public final boolean isBriefing() {
        return this.isBriefing;
    }

    public ContentItem(String str, ContentType contentType, String str2, String str3, Bitmap bitmap, String str4, String str5, String str6, BL4 bl4, boolean z, ContentSocialSource contentSocialSource, HatchAttachmentKind hatchAttachmentKind, MusicAttribution musicAttribution, HatchAttachmentAudio hatchAttachmentAudio, ContentViewerPageAccessory contentViewerPageAccessory) {
        AnonymousClass003.A0u(str, contentType);
        this.name = str;
        this.type = contentType;
        this.workspacePath = str2;
        this.imageUri = str3;
        this.imageBitmap = bitmap;
        this.sharedElementKey = str4;
        this.messageId = str5;
        this.thumbnailUri = str6;
        this.sourceDecodeSizePx = bl4;
        this.isBriefing = z;
        this.socialSource = contentSocialSource;
        this.kind = hatchAttachmentKind;
        this.music = musicAttribution;
        this.audio = hatchAttachmentAudio;
        this.pageAccessory = contentViewerPageAccessory;
    }

    /* renamed from: copy-9ysdgUI, reason: not valid java name */
    public final ContentItem m939copy9ysdgUI(String str, ContentType contentType, String str2, String str3, Bitmap bitmap, String str4, String str5, String str6, BL4 bl4, boolean z, ContentSocialSource contentSocialSource, HatchAttachmentKind hatchAttachmentKind, MusicAttribution musicAttribution, HatchAttachmentAudio hatchAttachmentAudio, ContentViewerPageAccessory contentViewerPageAccessory) {
        AnonymousClass003.A0u(str, contentType);
        return new ContentItem(str, contentType, str2, str3, bitmap, str4, str5, str6, bl4, z, contentSocialSource, hatchAttachmentKind, musicAttribution, hatchAttachmentAudio, contentViewerPageAccessory);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ContentItem(String str, ContentType contentType, String str2, String str3, Bitmap bitmap, String str4, String str5, String str6, BL4 bl4, boolean z, ContentSocialSource contentSocialSource, HatchAttachmentKind hatchAttachmentKind, MusicAttribution musicAttribution, HatchAttachmentAudio hatchAttachmentAudio, ContentViewerPageAccessory contentViewerPageAccessory, int i, C06H c06h) {
        this(str, contentType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bitmap, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : bl4, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? null : contentSocialSource, (i & 2048) != 0 ? null : hatchAttachmentKind, (i & 4096) != 0 ? null : musicAttribution, (i & 8192) != 0 ? null : hatchAttachmentAudio, (i & 16384) != 0 ? null : contentViewerPageAccessory);
    }

    public /* synthetic */ ContentItem(String str, ContentType contentType, String str2, String str3, Bitmap bitmap, String str4, String str5, String str6, BL4 bl4, boolean z, ContentSocialSource contentSocialSource, HatchAttachmentKind hatchAttachmentKind, MusicAttribution musicAttribution, HatchAttachmentAudio hatchAttachmentAudio, ContentViewerPageAccessory contentViewerPageAccessory, C06H c06h) {
        this(str, contentType, str2, str3, bitmap, str4, str5, str6, bl4, z, contentSocialSource, hatchAttachmentKind, musicAttribution, hatchAttachmentAudio, contentViewerPageAccessory);
    }
}
