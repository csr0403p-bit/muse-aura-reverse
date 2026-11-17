package com.facebook.aura.library.model;

import X.AbstractC3358CGz;
import X.FGI;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.library.repo.ArtifactSource;
import com.facebook.aura.library.repo.UnifiedArtifact;

/* loaded from: classes.dex */
public abstract class HatchLibraryViewModelKt {
    public static final String LEGACY_SORT_NAME = "NAME";
    public static final String LIBRARY_SORT_MODE_PREF_KEY = "library_sort_mode";
    public static final String TAG = "HatchLibraryViewModel";

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.library.model.ArtifactFile toArtifactFile(com.facebook.aura.library.repo.UnifiedArtifact r39, X.AbstractC3358CGz r40) {
        /*
            r9 = r39
            com.facebook.aura.library.repo.ArtifactSource r1 = r9.source
            com.facebook.aura.library.repo.ArtifactSource r0 = com.facebook.aura.library.repo.ArtifactSource.PEER_SPACE
            r12 = r40
            if (r1 != r0) goto Lf
            com.facebook.aura.library.model.ArtifactFile r16 = toPeerSpaceArtifactFile(r9, r12)
            return r16
        Lf:
            com.facebook.aura.library.repo.ArtifactSource r2 = com.facebook.aura.library.repo.ArtifactSource.SPACE
            if (r1 == r2) goto L18
            com.facebook.aura.library.repo.ArtifactSource r0 = com.facebook.aura.library.repo.ArtifactSource.SAVED_SPACE
            r4 = 0
            if (r1 != r0) goto L19
        L18:
            r4 = 1
        L19:
            java.lang.String r3 = r1.getWire()
            java.lang.String r1 = r9.itemKey
            java.lang.String r0 = "_"
            java.lang.String r17 = X.FGI.A0U(r3, r0, r1)
            java.lang.String r8 = r9.displayName
            int r0 = r8.length()
            if (r0 != 0) goto L33
            com.facebook.aura.file.utils.HatchFileUIUtils r0 = com.facebook.aura.file.utils.HatchFileUIUtils.INSTANCE
            java.lang.String r8 = r0.displayNameForPath(r1)
        L33:
            java.lang.String r0 = r9.itemKey
            r19 = r0
            r7 = 0
            java.lang.String r3 = r9.iconUrl
            if (r4 == 0) goto L9d
            if (r3 == 0) goto L94
            com.facebook.aura.gateway.WorkspaceUriResolver r1 = com.facebook.aura.gateway.WorkspaceUriResolver.INSTANCE
            com.facebook.aura.gateway.HatchThumbnailDisplaySize r0 = com.facebook.aura.gateway.HatchThumbnailDisplaySize.MEDIUM
            java.lang.String r22 = r1.resolveThumbnailUrl(r3, r12, r0)
        L46:
            if (r4 != 0) goto L96
            r23 = r7
        L4a:
            java.lang.String r0 = r9.iconUrl
            r25 = r0
            com.facebook.aura.library.repo.ArtifactSource r6 = r9.source
            boolean r26 = X.AnonymousClass002.A1Z(r6, r2)
            long r0 = r9.sortTimestampMs
            boolean r15 = r9.isPinned
            boolean r14 = r9.canShare
            boolean r13 = r9.canDownloadHtml
            java.lang.String r5 = r9.artifactRef
            java.lang.String r4 = r9.spaceId
            com.facebook.aura.library.repo.ArtifactPlacement r3 = r9.placement
            java.lang.String r2 = r9.format
            com.facebook.aura.gateway.WorkspaceUriResolver r11 = com.facebook.aura.gateway.WorkspaceUriResolver.INSTANCE
            java.lang.String r10 = r9.thumbnailUrl
            com.facebook.aura.gateway.HatchThumbnailDisplaySize r9 = com.facebook.aura.gateway.HatchThumbnailDisplaySize.MEDIUM
            java.lang.String r38 = r11.resolveThumbnailUrl(r10, r12, r9)
            r20 = 0
            r40 = 1
            com.facebook.aura.library.model.ArtifactFile r16 = new com.facebook.aura.library.model.ArtifactFile
            r21 = r20
            r27 = r20
            r28 = r0
            r30 = r15
            r31 = r14
            r32 = r13
            r33 = r6
            r34 = r5
            r35 = r4
            r36 = r3
            r37 = r2
            r39 = r20
            r18 = r8
            r24 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return r16
        L94:
            r22 = r7
        L96:
            java.lang.String r0 = r9.itemKey
            r23 = r0
            java.lang.String r7 = r9.iconUrl
            goto L4a
        L9d:
            if (r3 == 0) goto La7
            com.facebook.aura.gateway.WorkspaceUriResolver r0 = com.facebook.aura.gateway.WorkspaceUriResolver.INSTANCE
            java.lang.String r22 = r0.resolveRawAssetUrl(r3, r12)
            if (r22 != 0) goto L46
        La7:
            com.facebook.aura.gateway.WorkspaceUriResolver r1 = com.facebook.aura.gateway.WorkspaceUriResolver.INSTANCE
            java.lang.String r0 = r9.itemKey
            java.lang.String r22 = r1.resolveRawAssetUrl(r0, r12)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.model.HatchLibraryViewModelKt.toArtifactFile(com.facebook.aura.library.repo.UnifiedArtifact, X.CGz):com.facebook.aura.library.model.ArtifactFile");
    }

    public static final ArtifactFile toPeerSpaceArtifactFile(UnifiedArtifact unifiedArtifact, AbstractC3358CGz abstractC3358CGz) {
        String str = unifiedArtifact.thumbnailUrl;
        String strResolveDaemonApiUrl = null;
        if (str != null) {
            WorkspaceUriResolver workspaceUriResolver = WorkspaceUriResolver.INSTANCE;
            if (workspaceUriResolver.isDaemonApiReference(str)) {
                strResolveDaemonApiUrl = workspaceUriResolver.resolveDaemonApiUrl(str, abstractC3358CGz);
            }
        }
        ArtifactSource artifactSource = unifiedArtifact.source;
        String wire = artifactSource.getWire();
        String str2 = unifiedArtifact.itemKey;
        return new ArtifactFile(FGI.A0U(wire, "_", str2), unifiedArtifact.displayName, str2, null, null, strResolveDaemonApiUrl, null, null, unifiedArtifact.iconUrl, false, null, unifiedArtifact.sortTimestampMs, unifiedArtifact.isPinned, false, false, artifactSource, unifiedArtifact.artifactRef, unifiedArtifact.spaceId, unifiedArtifact.placement, null, strResolveDaemonApiUrl, unifiedArtifact.publisherName, unifiedArtifact.canPin);
    }
}
