package com.facebook.aura.conversation.viewmodel;

import X.A6B;
import X.AGH;
import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BO6;
import X.BTQ;
import X.C0881AGi;
import X.C0953AJg;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C8j4;
import X.CFK;
import X.FGI;
import X.G0U;
import com.facebook.aura.components.musicattribution.MusicAttribution;
import com.facebook.aura.conversation.viewmodel.HatchRenderSegment;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentType;
import com.facebook.aura.file.view.api.ContentViewerPageAccessories;
import com.facebook.aura.file.view.api.ContentViewerPageContext;
import com.facebook.aura.gateway.AuraMarkdownUrlResolversKt;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.parser.custom.AuraMarkdown;
import com.facebook.aura.markdown.parser.custom.extensions.AuraCustomBlockNames;
import com.facebook.aura.markdown.parser.custom.extensions.AuraCustomInlineNames;
import com.facebook.aura.markdown.parser.custom.extensions.FileLinkKind;
import com.facebook.aura.markdown.parser.custom.extensions.FileLinkPayload;
import com.facebook.aura.markdown.parser.custom.extensions.ImageGroupPayload;
import com.facebook.aura.model.HatchAttachmentAudio;
import com.facebook.aura.model.HatchAttachmentFile;
import com.facebook.aura.model.HatchAttachmentKind;
import com.facebook.aura.model.HatchContentViewModelData;
import com.facebook.aura.model.HatchMediaLayout;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.model.HatchPresentationData;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.model.ImageGalleryPresentationData;
import com.facebook.aura.model.VideoPresentationData;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class HatchInlineMediaPreComputeKt {
    public static final String TAG = "HatchInlineMediaPreCompute";

    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchInlineMediaPreComputeKt$collect$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<HatchContentViewModelData.InlineImage, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(HatchContentViewModelData.InlineImage inlineImage) {
            C7384Etj.A0Y(inlineImage, 0);
            return Boolean.valueOf(!inlineImage.deleted);
        }
    }

    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchInlineMediaPreComputeKt$collectPresentation$1, reason: invalid class name and case insensitive filesystem */
    public final class C115691 extends AbstractC7559F3s implements G0U<HatchAttachmentFile, Boolean> {
        public static final C115691 INSTANCE = new C115691();

        public C115691() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(HatchAttachmentFile hatchAttachmentFile) {
            C7384Etj.A0Y(hatchAttachmentFile, 0);
            return C3cG.A0P(hatchAttachmentFile.missing);
        }
    }

    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchInlineMediaPreComputeKt$collectPresentation$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<HatchAttachmentFile, Boolean> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(HatchAttachmentFile hatchAttachmentFile) {
            C7384Etj.A0Y(hatchAttachmentFile, 0);
            return C3cG.A0P(hatchAttachmentFile.missing);
        }
    }

    public static final ContentItem buildFallbackImageContentItem(String str, String str2) {
        String strExtractWorkspacePath;
        String str3;
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        if (!str.startsWith("content://")) {
            strExtractWorkspacePath = AuraMarkdownUrlResolversKt.extractWorkspacePath(str);
            str3 = str;
            if (strExtractWorkspacePath != null) {
            }
            return new ContentItem(displayNameFor(str3), ContentType.Image.INSTANCE, strExtractWorkspacePath, str, null, null, str2, null, null, zA1b, null, null, null, null, null);
        }
        strExtractWorkspacePath = str;
        str3 = strExtractWorkspacePath;
        return new ContentItem(displayNameFor(str3), ContentType.Image.INSTANCE, strExtractWorkspacePath, str, null, null, str2, null, null, zA1b, null, null, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.file.view.api.ContentItem buildItem(java.lang.String r10, java.lang.String r11, java.lang.String r12, X.AbstractC3358CGz r13, com.facebook.aura.file.view.api.ContentType r14, java.lang.String r15, java.lang.String r16) {
        /*
            r2 = r11
            r4 = r15
            java.lang.String r0 = "content://"
            r6 = 0
            r11 = 0
            boolean r1 = X.AnonymousClass005.A1a(r10, r0)
            if (r15 != 0) goto Lf
            if (r1 == 0) goto L52
            r4 = r10
        Lf:
            r3 = r14
            boolean r0 = r14 instanceof com.facebook.aura.file.view.api.ContentType.Video
            if (r0 != 0) goto L50
            if (r1 != 0) goto L50
            if (r13 == 0) goto L50
            r0 = r16
            java.lang.String r5 = resolveRawAssetUrl(r10, r4, r13, r0)
        L1e:
            boolean r0 = r14 instanceof com.facebook.aura.file.view.api.ContentType.Image
            if (r0 == 0) goto L2b
            if (r1 != 0) goto L2b
            boolean r0 = r10.equals(r5)
            r9 = r10
            if (r0 == 0) goto L2c
        L2b:
            r9 = r6
        L2c:
            int r0 = r2.length()
            if (r0 != 0) goto L3a
            r0 = r4
            if (r4 != 0) goto L36
            r0 = r10
        L36:
            java.lang.String r2 = displayNameFor(r0)
        L3a:
            java.lang.String r1 = "lobster_media_"
            java.lang.String r0 = "_"
            r8 = r12
            java.lang.String r7 = X.FGI.A0d(r1, r12, r0, r10)
            com.facebook.aura.file.view.api.ContentItem r1 = new com.facebook.aura.file.view.api.ContentItem
            r10 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r15 = r6
            r16 = r6
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        L50:
            r5 = r10
            goto L1e
        L52:
            java.lang.String r4 = com.facebook.aura.gateway.AuraMarkdownUrlResolversKt.extractWorkspacePath(r10)
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchInlineMediaPreComputeKt.buildItem(java.lang.String, java.lang.String, java.lang.String, X.CGz, com.facebook.aura.file.view.api.ContentType, java.lang.String, java.lang.String):com.facebook.aura.file.view.api.ContentItem");
    }

    public static final BO6<String, ContentItem> computeImageCopyTargets(boolean z, List<ContentItem> list) {
        C7384Etj.A0Y(list, 1);
        if (z || list.isEmpty()) {
            return C0953AJg.A03;
        }
        ArrayList<ContentItem> arrayListA0h = C3cG.A0h();
        for (ContentItem contentItem : list) {
            ContentItem contentItem2 = contentItem;
            if ((contentItem2.type instanceof ContentType.Image) && contentItem2.workspacePath != null && contentItem2.imageUri != null) {
                arrayListA0h.add(contentItem);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (ContentItem contentItem3 : arrayListA0h) {
            String str = contentItem3.sharedElementKey;
            if (str != null) {
                AnonymousClass002.A1J(str, contentItem3, arrayListA0h2);
            }
        }
        return AGI.A08(AGH.A06(arrayListA0h2));
    }

    public static final AHD<ContentItem> computeInlineMediaItems(String str, String str2, List<? extends HatchContentViewModelData> list, List<? extends HatchRenderSegment> list2, List<HatchWidgetPresentation> list3, AbstractC3358CGz abstractC3358CGz, G0U<? super String, MarkdownMedia> g0u, List<HatchMessage> list4) {
        String strFallbackTextOrNull;
        String strFallbackTextOrNull2;
        AHD<HatchContentViewModelData> ahd;
        C7384Etj.A0Y(str, 0);
        AnonymousClass003.A10(g0u, list4);
        ArrayList arrayListA0h = C3cG.A0h();
        if (list != null) {
            Iterator<? extends HatchContentViewModelData> it = list.iterator();
            while (it.hasNext()) {
                collect(it.next(), str, abstractC3358CGz, arrayListA0h, g0u);
            }
        }
        if (list2 != null) {
            for (HatchRenderSegment hatchRenderSegment : list2) {
                if ((hatchRenderSegment instanceof HatchRenderSegment.TextSegment) && (ahd = ((HatchRenderSegment.TextSegment) hatchRenderSegment).richContent) != null) {
                    Iterator it2 = ahd.iterator();
                    while (it2.hasNext()) {
                        collect((HatchContentViewModelData) it2.next(), str, abstractC3358CGz, arrayListA0h, g0u);
                    }
                }
            }
        }
        if (list3 != null) {
            for (HatchWidgetPresentation hatchWidgetPresentation : list3) {
                HatchPresentationData hatchPresentationData = hatchWidgetPresentation.data;
                String str3 = hatchWidgetPresentation.hostMessageId;
                if (str3 == null) {
                    str3 = str;
                }
                collectPresentation(hatchPresentationData, str, str3, str2, abstractC3358CGz, list4, arrayListA0h);
                if (HatchWidgetPresentationKt.rendersAsFallbackText(hatchWidgetPresentation) && (strFallbackTextOrNull2 = HatchWidgetPresentationKt.fallbackTextOrNull(hatchWidgetPresentation)) != null) {
                    collectMarkdown(strFallbackTextOrNull2, str, abstractC3358CGz, arrayListA0h, g0u);
                }
                HatchWidget widget = hatchWidgetPresentation.getWidget();
                if (widget != null && HatchWidgetPresentationKt.rendersAsFallbackText(widget) && (strFallbackTextOrNull = HatchWidgetPresentationKt.fallbackTextOrNull(widget)) != null) {
                    collectMarkdown(strFallbackTextOrNull, str, abstractC3358CGz, arrayListA0h, g0u);
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator it3 = arrayListA0h.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            ContentItem contentItem = (ContentItem) next;
            String str4 = contentItem.sharedElementKey;
            if (str4 == null && (str4 = contentItem.imageUri) == null) {
                str4 = contentItem.name;
            }
            AnonymousClass006.A1P(str4, next, hashSet, arrayListA0h2);
        }
        return AGI.A07(arrayListA0h2);
    }

    public static final MarkdownMedia parseMarkdownMedia(String str) {
        C7384Etj.A0Y(str, 0);
        try {
            AuraMarkdownDocument auraMarkdownDocument = AuraMarkdown.INSTANCE.parse(str, true);
            return new MarkdownMedia(markdownImages(auraMarkdownDocument), markdownVideoPayloads(auraMarkdownDocument));
        } catch (Exception e) {
            CFK.A0A(TAG, "Inline media pre-compute skipped: markdown parse failed", e);
            C0881AGi c0881AGi = C0881AGi.A00;
            return new MarkdownMedia(c0881AGi, c0881AGi);
        }
    }

    public static /* synthetic */ ContentItem buildItem$default(String str, String str2, String str3, AbstractC3358CGz abstractC3358CGz, ContentType contentType, String str4, String str5, int i, Object obj) {
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        return buildItem(str, str2, str3, abstractC3358CGz, contentType, str4, str5);
    }

    public static final void collect(HatchContentViewModelData hatchContentViewModelData, String str, AbstractC3358CGz abstractC3358CGz, List<ContentItem> list, G0U<? super String, MarkdownMedia> g0u) {
        String str2;
        ContentItem contentItem;
        if (hatchContentViewModelData instanceof HatchContentViewModelData.InlineImage) {
            HatchContentViewModelData.InlineImage inlineImage = (HatchContentViewModelData.InlineImage) hatchContentViewModelData;
            if (inlineImage.deleted) {
                return;
            } else {
                contentItem = buildItem(inlineImage.url, inlineImage.alt, str, abstractC3358CGz, ContentType.Image.INSTANCE, inlineImage.workspacePath, null);
            }
        } else {
            if (hatchContentViewModelData instanceof HatchContentViewModelData.InlineImageGroup) {
                BTQ btq = new BTQ(A6B.A03(AnonymousClass1.INSTANCE, AbstractC0878AGe.A06(((HatchContentViewModelData.InlineImageGroup) hatchContentViewModelData).images)));
                while (btq.hasNext()) {
                    HatchContentViewModelData.InlineImage inlineImage2 = (HatchContentViewModelData.InlineImage) btq.next();
                    list.add(buildItem(inlineImage2.url, inlineImage2.alt, str, abstractC3358CGz, ContentType.Image.INSTANCE, inlineImage2.workspacePath, null));
                }
                return;
            }
            if (!(hatchContentViewModelData instanceof HatchContentViewModelData.InlineFile)) {
                if (!(hatchContentViewModelData instanceof HatchContentViewModelData.Markdown) || (str2 = ((HatchContentViewModelData.Markdown) hatchContentViewModelData).markdown) == null) {
                    return;
                }
                collectMarkdown(str2, str, abstractC3358CGz, list, g0u);
                return;
            }
            HatchContentViewModelData.InlineFile inlineFile = (HatchContentViewModelData.InlineFile) hatchContentViewModelData;
            String str3 = inlineFile.mimeType;
            if (str3 == null || !str3.startsWith("video/") || inlineFile.deleted) {
                return;
            }
            String strExtractWorkspacePath = AuraMarkdownUrlResolversKt.extractWorkspacePath(inlineFile.url);
            String strDisplayNameFor = inlineFile.fileName;
            if (strDisplayNameFor.length() == 0) {
                strDisplayNameFor = displayNameFor(strExtractWorkspacePath == null ? inlineFile.url : strExtractWorkspacePath);
            }
            ContentType.Video video = ContentType.Video.INSTANCE;
            String str4 = inlineFile.url;
            contentItem = new ContentItem(strDisplayNameFor, video, strExtractWorkspacePath, str4, null, FGI.A0d("lobster_media_", str, "_", str4), str, (String) AbstractC0878AGe.A0G(inlineFile.thumbnailUrls), null, false, null, null, null, null, null);
        }
        list.add(contentItem);
    }

    public static final void collectPresentation(HatchPresentationData hatchPresentationData, String str, String str2, String str3, AbstractC3358CGz abstractC3358CGz, List<HatchMessage> list, List<ContentItem> list2) {
        if (hatchPresentationData instanceof ImageGalleryPresentationData) {
            BTQ btq = new BTQ(A6B.A03(C115691.INSTANCE, AbstractC0878AGe.A06(((ImageGalleryPresentationData) hatchPresentationData).images)));
            while (btq.hasNext()) {
                HatchAttachmentFile hatchAttachmentFile = (HatchAttachmentFile) btq.next();
                ContentItem contentItemBuildItem = buildItem(AuraMarkdownUrlResolversKt.resolveAttachmentThumbnailUrl(hatchAttachmentFile, abstractC3358CGz, str), hatchAttachmentFile.label, str, abstractC3358CGz, ContentType.Image.INSTANCE, null, str);
                list2.add(ContentItem.m937copy9ysdgUI$default(contentItemBuildItem, null, null, null, null, null, null, null, null, null, false, null, null, null, null, ContentViewerPageAccessories.INSTANCE.accessoryFor(hatchAttachmentFile, new ContentViewerPageContext(str3, str2, contentItemBuildItem.imageUri, list)), 16383, null));
            }
            return;
        }
        if (hatchPresentationData instanceof VideoPresentationData) {
            BTQ btq2 = new BTQ(A6B.A03(AnonymousClass3.INSTANCE, AbstractC0878AGe.A06(((VideoPresentationData) hatchPresentationData).videos)));
            while (btq2.hasNext()) {
                HatchAttachmentFile hatchAttachmentFile2 = (HatchAttachmentFile) btq2.next();
                String strResolveAttachmentRawUrl = AuraMarkdownUrlResolversKt.resolveAttachmentRawUrl(hatchAttachmentFile2, abstractC3358CGz);
                String str4 = hatchAttachmentFile2.label;
                ContentType.Video video = ContentType.Video.INSTANCE;
                String strExtractWorkspacePath = AuraMarkdownUrlResolversKt.extractWorkspacePath(hatchAttachmentFile2.path);
                String strA0d = FGI.A0d("lobster_media_", str, "_", strResolveAttachmentRawUrl);
                String str5 = (String) AbstractC0878AGe.A0G(AuraMarkdownUrlResolversKt.resolveAuraMarkdownVideoThumbnails(hatchAttachmentFile2.path, abstractC3358CGz));
                HatchAttachmentKind hatchAttachmentKind = hatchAttachmentFile2.kind;
                HatchAttachmentAudio hatchAttachmentAudio = hatchAttachmentFile2.audio;
                list2.add(new ContentItem(str4, video, strExtractWorkspacePath, strResolveAttachmentRawUrl, null, strA0d, str, str5, null, false, null, hatchAttachmentKind, hatchAttachmentAudio != null ? toMusicAttribution(hatchAttachmentAudio) : null, hatchAttachmentFile2.audio, null));
            }
        }
    }

    public static final String displayNameFor(String str) {
        String strA0W = C7BY.A0W(str, HatchOpenGraphRepository.UNKNOWN_HOST, str);
        return C7BY.A0V(strA0W, CustomConnectorRegisterRepositoryKt.ROOT_PATH, strA0W);
    }

    public static final ContentItem frontItem(VideoPresentationData videoPresentationData, List<ContentItem> list) {
        String str;
        String strExtractWorkspacePath;
        HatchAttachmentFile hatchAttachmentFile = (HatchAttachmentFile) AbstractC0878AGe.A0G(videoPresentationData.videos);
        ContentItem contentItem = null;
        if (hatchAttachmentFile == null || (str = hatchAttachmentFile.path) == null || (strExtractWorkspacePath = AuraMarkdownUrlResolversKt.extractWorkspacePath(str)) == null) {
            return null;
        }
        Iterator<ContentItem> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ContentItem next = it.next();
            ContentItem contentItem2 = next;
            if ((contentItem2.type instanceof ContentType.Video) && strExtractWorkspacePath.equals(contentItem2.workspacePath)) {
                contentItem = next;
                break;
            }
        }
        return contentItem;
    }

    public static final boolean isShareable(HatchMessageRole hatchMessageRole, boolean z) {
        return hatchMessageRole == HatchMessageRole.AGENT && !z;
    }

    public static final String resolveRawAssetUrl(String str, String str2, AbstractC3358CGz abstractC3358CGz, String str3) {
        WorkspaceUriResolver workspaceUriResolver = WorkspaceUriResolver.INSTANCE;
        if (str2 == null) {
            str2 = str;
        }
        String strResolveRawAssetUrl = workspaceUriResolver.resolveRawAssetUrl(str2, abstractC3358CGz);
        if (strResolveRawAssetUrl == null) {
            strResolveRawAssetUrl = str;
        }
        return AuraMarkdownUrlResolversKt.versionWorkspaceImageUrl(str, strResolveRawAssetUrl, str3);
    }

    public static final MusicAttribution toMusicAttribution(HatchAttachmentAudio hatchAttachmentAudio) {
        String str = hatchAttachmentAudio.title;
        if (str != null) {
            return new MusicAttribution(str, hatchAttachmentAudio.artist, hatchAttachmentAudio.coverArtUrl);
        }
        return null;
    }

    public static final void collectMarkdown(String str, String str2, AbstractC3358CGz abstractC3358CGz, List<ContentItem> list, G0U<? super String, MarkdownMedia> g0u) {
        if (str.length() != 0) {
            MarkdownMedia markdownMediaInvoke = g0u.invoke(str);
            Iterator<ContentItem> it = extractMarkdownImageItems(markdownMediaInvoke.images, str2, abstractC3358CGz).iterator();
            while (it.hasNext()) {
                list.add(it.next());
            }
            Iterator<ContentItem> it2 = extractMarkdownVideoItems(markdownMediaInvoke.videos, str2, abstractC3358CGz).iterator();
            while (it2.hasNext()) {
                list.add(it2.next());
            }
        }
    }

    public static final BO6<String, ContentItem> computeMediaShareTargets(HatchMessageRole hatchMessageRole, boolean z, List<ContentItem> list) {
        AnonymousClass003.A0v(hatchMessageRole, list);
        if (!isShareable(hatchMessageRole, z)) {
            return C0953AJg.A03;
        }
        ArrayList<ContentItem> arrayListA0h = C3cG.A0h();
        for (ContentItem contentItem : list) {
            if (contentItem.imageUri != null) {
                arrayListA0h.add(contentItem);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (ContentItem contentItem2 : arrayListA0h) {
            String str = contentItem2.sharedElementKey;
            if (str != null) {
                AnonymousClass002.A1J(str, contentItem2, arrayListA0h2);
            }
        }
        return AGI.A08(AGH.A06(arrayListA0h2));
    }

    public static final ContentItem computeShareableMedia(HatchMessageRole hatchMessageRole, boolean z, String str, List<HatchWidgetPresentation> list, List<ContentItem> list2) {
        VideoPresentationData videoPresentationDataFannedStack;
        AnonymousClass003.A0v(hatchMessageRole, str);
        C7384Etj.A0Y(list2, 4);
        if (isShareable(hatchMessageRole, z) && str.length() <= 0) {
            if (list != null && (videoPresentationDataFannedStack = fannedStack(list)) != null) {
                return frontItem(videoPresentationDataFannedStack, list2);
            }
            ContentItem contentItem = (ContentItem) AbstractC0878AGe.A0K(list2);
            if (contentItem != null) {
                ContentType contentType = contentItem.type;
                if ((contentType instanceof ContentType.Image) || (contentType instanceof ContentType.Video)) {
                    return contentItem;
                }
            }
        }
        return null;
    }

    public static final List<ContentItem> extractMarkdownImageItems(List<AuraInline.Image> list, String str, AbstractC3358CGz abstractC3358CGz) {
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (AuraInline.Image image : list) {
            String strResolveAuraMarkdownImageUrl = AuraMarkdownUrlResolversKt.resolveAuraMarkdownImageUrl(image.url, abstractC3358CGz, str);
            String strExtractWorkspacePath = AuraMarkdownUrlResolversKt.extractWorkspacePath(image.url);
            String strResolveRawAssetUrl = image.url;
            if (abstractC3358CGz != null) {
                strResolveRawAssetUrl = resolveRawAssetUrl(strResolveRawAssetUrl, strExtractWorkspacePath, abstractC3358CGz, str);
            }
            String strDisplayNameFor = image.alt;
            if (strDisplayNameFor.length() == 0) {
                strDisplayNameFor = displayNameFor(strExtractWorkspacePath == null ? image.url : strExtractWorkspacePath);
            }
            ContentType.Image image2 = ContentType.Image.INSTANCE;
            String strA0d = FGI.A0d("lobster_media_", str, "_", strResolveAuraMarkdownImageUrl);
            if (C7384Etj.areEqual(strResolveAuraMarkdownImageUrl, strResolveRawAssetUrl)) {
                strResolveAuraMarkdownImageUrl = null;
            }
            arrayListA0i.add(new ContentItem(strDisplayNameFor, image2, strExtractWorkspacePath, strResolveRawAssetUrl, null, strA0d, str, strResolveAuraMarkdownImageUrl, null, false, null, null, null, null, null));
        }
        return arrayListA0i;
    }

    public static final List<ContentItem> extractMarkdownVideoItems(List<FileLinkPayload> list, String str, AbstractC3358CGz abstractC3358CGz) {
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (FileLinkPayload fileLinkPayload : list) {
            String strResolveAuraMarkdownUrl = AuraMarkdownUrlResolversKt.resolveAuraMarkdownUrl(fileLinkPayload.url, abstractC3358CGz);
            List<String> listResolveAuraMarkdownVideoThumbnails = AuraMarkdownUrlResolversKt.resolveAuraMarkdownVideoThumbnails(fileLinkPayload.url, abstractC3358CGz);
            String strExtractWorkspacePath = AuraMarkdownUrlResolversKt.extractWorkspacePath(strResolveAuraMarkdownUrl);
            String strDisplayNameFor = fileLinkPayload.displayName;
            if (strDisplayNameFor.length() == 0) {
                String str2 = strExtractWorkspacePath;
                if (strExtractWorkspacePath == null) {
                    str2 = strResolveAuraMarkdownUrl;
                }
                strDisplayNameFor = displayNameFor(str2);
            }
            arrayListA0i.add(new ContentItem(strDisplayNameFor, ContentType.Video.INSTANCE, strExtractWorkspacePath, strResolveAuraMarkdownUrl, null, FGI.A0d("lobster_media_", str, "_", strResolveAuraMarkdownUrl), str, (String) AbstractC0878AGe.A0G(listResolveAuraMarkdownVideoThumbnails), null, false, null, null, null, null, null));
        }
        return arrayListA0i;
    }

    public static final VideoPresentationData fannedStack(List<HatchWidgetPresentation> list) {
        VideoPresentationData videoPresentationData;
        Iterator<HatchWidgetPresentation> it = list.iterator();
        while (true) {
            videoPresentationData = null;
            if (!it.hasNext()) {
                break;
            }
            HatchPresentationData hatchPresentationData = it.next().data;
            if ((hatchPresentationData instanceof VideoPresentationData) && (videoPresentationData = (VideoPresentationData) hatchPresentationData) != null && videoPresentationData.layout == HatchMediaLayout.FannedStack) {
                break;
            }
        }
        return videoPresentationData;
    }

    public static final List<AuraInline.Image> markdownImages(AuraMarkdownDocument auraMarkdownDocument) {
        ArrayList arrayListA0h = C3cG.A0h();
        markdownImages$visitBlocks(arrayListA0h, auraMarkdownDocument.blocks);
        return arrayListA0h;
    }

    public static final void markdownImages$visitBlocks(List<AuraInline.Image> list, List<? extends AuraBlock> list2) {
        AHD<AuraInline> ahd;
        ImageGroupPayload imageGroupPayload;
        List<AuraInline.Image> list3;
        Iterator<? extends AuraBlock> it = list2.iterator();
        while (it.hasNext()) {
            AuraBlock auraBlockA0i = C8j4.A0i(it);
            if (auraBlockA0i instanceof AuraBlock.Paragraph) {
                ahd = ((AuraBlock.Paragraph) auraBlockA0i).inlines;
            } else if (auraBlockA0i instanceof AuraBlock.Heading) {
                ahd = ((AuraBlock.Heading) auraBlockA0i).inlines;
            } else if (auraBlockA0i instanceof AuraBlock.BlockQuote) {
                markdownImages$visitBlocks(list, ((AuraBlock.BlockQuote) auraBlockA0i).children);
            } else if (auraBlockA0i instanceof AuraBlock.UnorderedList) {
                Iterator it2 = ((AuraBlock.UnorderedList) auraBlockA0i).items.iterator();
                while (it2.hasNext()) {
                    markdownImages$visitBlocks(list, C8j4.A1E(it2));
                }
            } else if (auraBlockA0i instanceof AuraBlock.OrderedList) {
                Iterator it3 = ((AuraBlock.OrderedList) auraBlockA0i).items.iterator();
                while (it3.hasNext()) {
                    markdownImages$visitBlocks(list, C8j4.A1E(it3));
                }
            } else if (auraBlockA0i instanceof AuraBlock.Table) {
                AuraBlock.Table table = (AuraBlock.Table) auraBlockA0i;
                Iterator it4 = table.header.iterator();
                while (it4.hasNext()) {
                    markdownImages$visitBlocks(list, C8j4.A1F(it4));
                }
                Iterator it5 = table.rows.iterator();
                while (it5.hasNext()) {
                    Iterator itA11 = C8j4.A11(it5);
                    while (itA11.hasNext()) {
                        markdownImages$visitBlocks(list, C8j4.A1F(itA11));
                    }
                }
            } else if (auraBlockA0i instanceof AuraBlock.Custom) {
                AuraBlock.Custom custom = (AuraBlock.Custom) auraBlockA0i;
                if (AuraCustomBlockNames.IMAGE_GROUP.equals(custom.name)) {
                    Object obj = custom.payload;
                    if ((obj instanceof ImageGroupPayload) && (imageGroupPayload = (ImageGroupPayload) obj) != null && (list3 = imageGroupPayload.images) != null) {
                        Iterator<AuraInline.Image> it6 = list3.iterator();
                        while (it6.hasNext()) {
                            list.add(it6.next());
                        }
                    }
                }
            }
            markdownImages$visitInlines(list, ahd);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void markdownImages$visitInlines(List<AuraInline.Image> list, List<? extends AuraInline> list2) {
        AHD<AuraInline> ahd;
        Iterator<? extends AuraInline> it = list2.iterator();
        while (it.hasNext()) {
            AuraInline auraInlineA0j = C8j4.A0j(it);
            if (auraInlineA0j instanceof AuraInline.Image) {
                list.add(auraInlineA0j);
            } else {
                if (auraInlineA0j instanceof AuraInline.Emphasis) {
                    ahd = ((AuraInline.Emphasis) auraInlineA0j).children;
                } else if (auraInlineA0j instanceof AuraInline.Strong) {
                    ahd = ((AuraInline.Strong) auraInlineA0j).children;
                } else if (auraInlineA0j instanceof AuraInline.Strikethrough) {
                    ahd = ((AuraInline.Strikethrough) auraInlineA0j).children;
                } else if (auraInlineA0j instanceof AuraInline.Link) {
                    ahd = ((AuraInline.Link) auraInlineA0j).children;
                }
                markdownImages$visitInlines(list, ahd);
            }
        }
    }

    public static final List<FileLinkPayload> markdownVideoPayloads(AuraMarkdownDocument auraMarkdownDocument) {
        ArrayList arrayListA0h = C3cG.A0h();
        markdownVideoPayloads$visitBlocks(arrayListA0h, auraMarkdownDocument.blocks);
        return arrayListA0h;
    }

    public static final void markdownVideoPayloads$visitBlocks(List<FileLinkPayload> list, List<? extends AuraBlock> list2) {
        FileLinkPayload fileLinkPayload;
        AHD<AuraInline> ahd;
        Iterator<? extends AuraBlock> it = list2.iterator();
        while (it.hasNext()) {
            AuraBlock auraBlockA0i = C8j4.A0i(it);
            if (auraBlockA0i instanceof AuraBlock.Custom) {
                AuraBlock.Custom custom = (AuraBlock.Custom) auraBlockA0i;
                if (AuraCustomInlineNames.FILE_LINK.equals(custom.name)) {
                    Object obj = custom.payload;
                    if ((obj instanceof FileLinkPayload) && (fileLinkPayload = (FileLinkPayload) obj) != null && fileLinkPayload.kind == FileLinkKind.VIDEO) {
                        list.add(fileLinkPayload);
                    }
                }
            } else {
                if (auraBlockA0i instanceof AuraBlock.Paragraph) {
                    ahd = ((AuraBlock.Paragraph) auraBlockA0i).inlines;
                } else if (auraBlockA0i instanceof AuraBlock.Heading) {
                    ahd = ((AuraBlock.Heading) auraBlockA0i).inlines;
                } else if (auraBlockA0i instanceof AuraBlock.BlockQuote) {
                    markdownVideoPayloads$visitBlocks(list, ((AuraBlock.BlockQuote) auraBlockA0i).children);
                } else if (auraBlockA0i instanceof AuraBlock.UnorderedList) {
                    Iterator it2 = ((AuraBlock.UnorderedList) auraBlockA0i).items.iterator();
                    while (it2.hasNext()) {
                        markdownVideoPayloads$visitBlocks(list, C8j4.A1E(it2));
                    }
                } else if (auraBlockA0i instanceof AuraBlock.OrderedList) {
                    Iterator it3 = ((AuraBlock.OrderedList) auraBlockA0i).items.iterator();
                    while (it3.hasNext()) {
                        markdownVideoPayloads$visitBlocks(list, C8j4.A1E(it3));
                    }
                } else if (auraBlockA0i instanceof AuraBlock.Table) {
                    AuraBlock.Table table = (AuraBlock.Table) auraBlockA0i;
                    Iterator it4 = table.header.iterator();
                    while (it4.hasNext()) {
                        markdownVideoPayloads$visitBlocks(list, C8j4.A1F(it4));
                    }
                    Iterator it5 = table.rows.iterator();
                    while (it5.hasNext()) {
                        Iterator itA11 = C8j4.A11(it5);
                        while (itA11.hasNext()) {
                            markdownVideoPayloads$visitBlocks(list, C8j4.A1F(itA11));
                        }
                    }
                } else {
                    continue;
                }
                markdownVideoPayloads$visitInlines(list, ahd);
            }
        }
    }

    public static final void markdownVideoPayloads$visitInlines(List<FileLinkPayload> list, List<? extends AuraInline> list2) {
        FileLinkPayload fileLinkPayload;
        AHD<AuraInline> ahd;
        Iterator<? extends AuraInline> it = list2.iterator();
        while (it.hasNext()) {
            AuraInline auraInlineA0j = C8j4.A0j(it);
            if (auraInlineA0j instanceof AuraInline.Custom) {
                AuraInline.Custom custom = (AuraInline.Custom) auraInlineA0j;
                if (AuraCustomInlineNames.FILE_LINK.equals(custom.name)) {
                    Object obj = custom.payload;
                    if ((obj instanceof FileLinkPayload) && (fileLinkPayload = (FileLinkPayload) obj) != null && fileLinkPayload.kind == FileLinkKind.VIDEO) {
                        list.add(fileLinkPayload);
                    }
                }
            } else {
                if (auraInlineA0j instanceof AuraInline.Emphasis) {
                    ahd = ((AuraInline.Emphasis) auraInlineA0j).children;
                } else if (auraInlineA0j instanceof AuraInline.Strong) {
                    ahd = ((AuraInline.Strong) auraInlineA0j).children;
                } else if (auraInlineA0j instanceof AuraInline.Strikethrough) {
                    ahd = ((AuraInline.Strikethrough) auraInlineA0j).children;
                } else if (auraInlineA0j instanceof AuraInline.Link) {
                    ahd = ((AuraInline.Link) auraInlineA0j).children;
                }
                markdownVideoPayloads$visitInlines(list, ahd);
            }
        }
    }
}
