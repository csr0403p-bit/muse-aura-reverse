package com.facebook.aura.gateway;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C0881AGi;
import X.C7384Etj;
import X.C7BY;
import android.net.Uri;
import com.facebook.aura.file.core.HatchMimeResolver;
import com.facebook.aura.model.HatchAttachmentFile;
import com.facebook.aura.model.HatchMessageKt;
import java.util.List;

/* loaded from: classes.dex */
public abstract class AuraMarkdownUrlResolversKt {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048 A[PHI: r1
  0x0048: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v3 java.lang.String) binds: [B:3:0x0011, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String extractWorkspacePath(java.lang.String r5) {
        /*
            r4 = 0
            X.C7384Etj.A0Y(r5, r4)
            java.lang.String r0 = "/home/hatch/"
            java.lang.String r2 = X.C7BY.A0K(r0, r5)
            java.lang.String r1 = "fs/raw/"
            r3 = 0
            boolean r0 = X.C7BY.A0q(r2, r1, r4)
            if (r0 != 0) goto L48
            java.lang.String r1 = "fs/thumbnail/"
            boolean r0 = X.C7BY.A0q(r2, r1, r4)
            if (r0 != 0) goto L48
            java.lang.String r1 = "sandbox://"
            boolean r0 = X.AnonymousClass005.A1a(r2, r1)
            if (r0 != 0) goto L33
            java.lang.String r0 = "workspace/"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L39
            java.lang.String r1 = "~/"
            boolean r0 = r2.startsWith(r1)
            if (r0 == 0) goto L47
        L33:
            java.lang.String r2 = X.C7BY.A0K(r1, r2)
        L37:
            if (r2 == 0) goto L47
        L39:
            java.lang.String r0 = "?"
            java.lang.String r1 = X.C7BY.A0W(r2, r0, r2)
            if (r1 == 0) goto L47
            com.facebook.aura.gateway.WorkspaceUriResolver r0 = com.facebook.aura.gateway.WorkspaceUriResolver.INSTANCE
            java.lang.String r3 = r0.decodeWorkspacePath(r1)
        L47:
            return r3
        L48:
            java.lang.String r2 = X.C7BY.A0U(r2, r1, r2)
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.AuraMarkdownUrlResolversKt.extractWorkspacePath(java.lang.String):java.lang.String");
    }

    public static final String resolveAttachmentRawUrl(HatchAttachmentFile hatchAttachmentFile, AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(hatchAttachmentFile, 0);
        String strResolveAuraMarkdownUrl = resolveAuraMarkdownUrl(hatchAttachmentFile.path, abstractC3358CGz);
        String str = hatchAttachmentFile.path;
        return (strResolveAuraMarkdownUrl.equals(str) && (strResolveAuraMarkdownUrl = hatchAttachmentFile.originalUrl) == null) ? str : strResolveAuraMarkdownUrl;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028 A[PHI: r1
  0x0028: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v4 java.lang.String) binds: [B:13:0x003f, B:7:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String resolveAttachmentThumbnailUrl(com.facebook.aura.model.HatchAttachmentFile r5, X.AbstractC3358CGz r6, java.lang.String r7) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r5, r0)
            if (r6 == 0) goto L30
            com.facebook.aura.file.core.HatchMimeResolver r4 = com.facebook.aura.file.core.HatchMimeResolver.INSTANCE
            java.lang.String r3 = r5.mime
            java.lang.String r2 = r5.label
            java.lang.String r1 = r5.path
            java.lang.String r0 = r5.originalUrl
            java.lang.String[] r0 = new java.lang.String[]{r2, r1, r0}
            boolean r0 = r4.isSvg(r3, r0)
            if (r0 == 0) goto L35
            java.lang.String r0 = r5.path
            java.lang.String r1 = resolveAuraMarkdownUrl(r0, r6)
            java.lang.String r0 = r5.path
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L30
        L28:
            java.lang.String r0 = r5.path
            java.lang.String r0 = versionWorkspaceImageUrl(r0, r1, r7)
            if (r0 != 0) goto L34
        L30:
            java.lang.String r0 = resolveAttachmentRawUrl(r5, r6)
        L34:
            return r0
        L35:
            com.facebook.aura.gateway.HatchFileOperations r2 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            java.lang.String r1 = r5.path
            com.facebook.aura.gateway.HatchThumbnailDisplaySize r0 = com.facebook.aura.gateway.HatchThumbnailDisplaySize.MEDIUM
            java.lang.String r1 = r2.buildAuthenticatedImageUrl(r1, r6, r0)
            if (r1 == 0) goto L30
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.AuraMarkdownUrlResolversKt.resolveAttachmentThumbnailUrl(com.facebook.aura.model.HatchAttachmentFile, X.CGz, java.lang.String):java.lang.String");
    }

    public static final String resolveAuraMarkdownImageUrl(String str, AbstractC3358CGz abstractC3358CGz, String str2) {
        String strBuildAuthenticatedImageUrl;
        C7384Etj.A0Y(str, 0);
        String strResolveAuraMarkdownUrl = resolveAuraMarkdownUrl(str, abstractC3358CGz);
        if (abstractC3358CGz != null && !HatchMimeResolver.INSTANCE.isSvg(null, str, strResolveAuraMarkdownUrl) && (strBuildAuthenticatedImageUrl = HatchFileOperations.INSTANCE.buildAuthenticatedImageUrl(str, abstractC3358CGz, HatchThumbnailDisplaySize.MEDIUM)) != null) {
            strResolveAuraMarkdownUrl = strBuildAuthenticatedImageUrl;
        }
        return versionWorkspaceImageUrl(str, strResolveAuraMarkdownUrl, str2);
    }

    public static final String resolveAuraMarkdownUrl(String str, AbstractC3358CGz abstractC3358CGz) {
        String strResolveRawAssetUrl;
        C7384Etj.A0Y(str, 0);
        return (abstractC3358CGz == null || str.startsWith("hatch-slides://") || str.startsWith("slides://") || str.startsWith(HatchMessageKt.FILE_DISCUSSION_SCHEME) || (strResolveRawAssetUrl = WorkspaceUriResolver.INSTANCE.resolveRawAssetUrl(str, abstractC3358CGz)) == null) ? str : strResolveRawAssetUrl;
    }

    public static final List<String> resolveAuraMarkdownVideoThumbnails(String str, AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(str, 0);
        return abstractC3358CGz == null ? C0881AGi.A00 : HatchFileOperations.INSTANCE.buildAuthenticatedVideoThumbnailUrls(str, abstractC3358CGz, HatchThumbnailDisplaySize.MEDIUM);
    }

    public static final String withImageVersion(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        char c = C7BY.A0k(str, '?') ? '&' : '?';
        String strEncode = Uri.encode(str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(c);
        sb.append("v=");
        return AnonymousClass001.A0v(strEncode, sb);
    }

    public static final String versionWorkspaceImageUrl(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return (extractWorkspacePath(str) == null || str2.equals(str)) ? str2 : withImageVersion(str2, str3);
    }
}
