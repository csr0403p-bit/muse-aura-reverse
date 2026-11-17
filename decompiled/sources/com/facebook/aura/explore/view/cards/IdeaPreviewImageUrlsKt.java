package com.facebook.aura.explore.view.cards;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchThumbnailDisplaySize;
import com.facebook.aura.gateway.WorkspaceUriResolver;

/* loaded from: classes.dex */
public abstract class IdeaPreviewImageUrlsKt {
    public static final String COLOR_ICON_MIME_TYPE = "image/webp";

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.explore.view.cards.IdeaIcon rememberIdeaIcon(java.lang.String r12, java.lang.String r13, java.lang.String r14, com.facebook.aura.gateway.HatchThumbnailDisplaySize r15, X.BFM r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.view.cards.IdeaPreviewImageUrlsKt.rememberIdeaIcon(java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.gateway.HatchThumbnailDisplaySize, X.BFM, int, int):com.facebook.aura.explore.view.cards.IdeaIcon");
    }

    public static final String resolveIdeaPreviewImageUrl(String str, AbstractC3358CGz abstractC3358CGz, HatchThumbnailDisplaySize hatchThumbnailDisplaySize) {
        String strA0l;
        C7384Etj.A0Y(abstractC3358CGz, 1);
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            return null;
        }
        WorkspaceUriResolver workspaceUriResolver = WorkspaceUriResolver.INSTANCE;
        return workspaceUriResolver.isDaemonApiReference(strA0l) ? workspaceUriResolver.resolveDaemonApiUrl(strA0l, abstractC3358CGz) : workspaceUriResolver.resolveThumbnailUrl(strA0l, abstractC3358CGz, hatchThumbnailDisplaySize);
    }

    public static final IdeaIcon toIdeaIcon(String str, String str2, AbstractC3358CGz abstractC3358CGz, HatchThumbnailDisplaySize hatchThumbnailDisplaySize) {
        C7384Etj.A0Y(abstractC3358CGz, 2);
        String strResolveIdeaPreviewImageUrl = resolveIdeaPreviewImageUrl(str, abstractC3358CGz, hatchThumbnailDisplaySize);
        if (strResolveIdeaPreviewImageUrl != null) {
            return new IdeaIcon(strResolveIdeaPreviewImageUrl, str2 == null ? false : str2.equalsIgnoreCase("image/webp"));
        }
        return null;
    }

    public static /* synthetic */ String resolveIdeaPreviewImageUrl$default(String str, AbstractC3358CGz abstractC3358CGz, HatchThumbnailDisplaySize hatchThumbnailDisplaySize, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchThumbnailDisplaySize = HatchThumbnailDisplaySize.MEDIUM;
        }
        return resolveIdeaPreviewImageUrl(str, abstractC3358CGz, hatchThumbnailDisplaySize);
    }
}
