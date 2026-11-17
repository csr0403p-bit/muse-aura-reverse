package com.facebook.aura.library.repo;

/* loaded from: classes.dex */
public abstract class UnifiedArtifactsRepositoryKt {
    public static final String COLLECTION_ALL = "all";
    public static final String ERROR_ARTIFACT_BUSY = "artifact_busy";
    public static final String ERROR_ARTIFACT_CHANGED = "artifact_changed";
    public static final String ERROR_INVALID_PARAMS = "invalid_params";
    public static final String ERROR_NOT_FOUND = "not_found";
    public static final String ERROR_SIDEBAR_FULL = "sidebar_full";
    public static final int HTTP_BAD_REQUEST = 400;
    public static final int HTTP_CONFLICT = 409;
    public static final int HTTP_FORBIDDEN = 403;
    public static final int HTTP_NOT_FOUND = 404;
    public static final int MAX_PAGE_SIZE = 100;
    public static final int PAGE_SIZE = 25;
    public static final String PLACEMENT_LIBRARY = "library";
    public static final long REFRESH_DEBOUNCE_MS = 400;
    public static final String TAG = "UnifiedArtifactsRepository";

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.library.repo.ArtifactPlacementOutcome toArtifactPlacementOutcome(java.lang.Throwable r2) {
        /*
            boolean r0 = r2 instanceof com.facebook.aura.json.NetworkException
            if (r0 == 0) goto L35
            com.facebook.aura.json.NetworkException r2 = (com.facebook.aura.json.NetworkException) r2
            if (r2 == 0) goto L35
            int r1 = r2.httpResponseCode
            r0 = 403(0x193, float:5.65E-43)
            if (r1 != r0) goto L13
            com.facebook.aura.library.repo.ArtifactPlacementOutcome$Forbidden r0 = com.facebook.aura.library.repo.ArtifactPlacementOutcome.Forbidden.INSTANCE
        L10:
            com.facebook.aura.library.repo.ArtifactPlacementOutcome r0 = (com.facebook.aura.library.repo.ArtifactPlacementOutcome) r0
            return r0
        L13:
            r0 = 409(0x199, float:5.73E-43)
            if (r1 != r0) goto L24
            java.lang.String r1 = r2.errorCode
            java.lang.String r0 = "artifact_changed"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            com.facebook.aura.library.repo.ArtifactPlacementOutcome$ArtifactChanged r0 = com.facebook.aura.library.repo.ArtifactPlacementOutcome.ArtifactChanged.INSTANCE
            goto L10
        L24:
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L35
            java.lang.String r1 = r2.errorCode
            java.lang.String r0 = "sidebar_full"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            com.facebook.aura.library.repo.ArtifactPlacementOutcome$SidebarFull r0 = com.facebook.aura.library.repo.ArtifactPlacementOutcome.SidebarFull.INSTANCE
            goto L10
        L35:
            com.facebook.aura.library.repo.ArtifactPlacementOutcome$Uncertain r0 = com.facebook.aura.library.repo.ArtifactPlacementOutcome.Uncertain.INSTANCE
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.UnifiedArtifactsRepositoryKt.toArtifactPlacementOutcome(java.lang.Throwable):com.facebook.aura.library.repo.ArtifactPlacementOutcome");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.library.repo.SpaceRenameOutcome toSpaceRenameOutcome(java.lang.Throwable r2) {
        /*
            boolean r0 = r2 instanceof com.facebook.aura.json.NetworkException
            if (r0 == 0) goto L3f
            com.facebook.aura.json.NetworkException r2 = (com.facebook.aura.json.NetworkException) r2
            if (r2 == 0) goto L3f
            int r1 = r2.httpResponseCode
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L1d
            java.lang.String r1 = r2.errorCode
            java.lang.String r0 = "invalid_params"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3f
            com.facebook.aura.library.repo.SpaceRenameOutcome$Invalid r0 = com.facebook.aura.library.repo.SpaceRenameOutcome.Invalid.INSTANCE
        L1a:
            com.facebook.aura.library.repo.SpaceRenameOutcome r0 = (com.facebook.aura.library.repo.SpaceRenameOutcome) r0
            return r0
        L1d:
            r0 = 404(0x194, float:5.66E-43)
            if (r1 != r0) goto L2e
            java.lang.String r1 = r2.errorCode
            java.lang.String r0 = "not_found"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3f
            com.facebook.aura.library.repo.SpaceRenameOutcome$NotFound r0 = com.facebook.aura.library.repo.SpaceRenameOutcome.NotFound.INSTANCE
            goto L1a
        L2e:
            r0 = 409(0x199, float:5.73E-43)
            if (r1 != r0) goto L3f
            java.lang.String r1 = r2.errorCode
            java.lang.String r0 = "artifact_busy"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3f
            com.facebook.aura.library.repo.SpaceRenameOutcome$Busy r0 = com.facebook.aura.library.repo.SpaceRenameOutcome.Busy.INSTANCE
            goto L1a
        L3f:
            com.facebook.aura.library.repo.SpaceRenameOutcome$Failed r0 = com.facebook.aura.library.repo.SpaceRenameOutcome.Failed.INSTANCE
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.UnifiedArtifactsRepositoryKt.toSpaceRenameOutcome(java.lang.Throwable):com.facebook.aura.library.repo.SpaceRenameOutcome");
    }
}
