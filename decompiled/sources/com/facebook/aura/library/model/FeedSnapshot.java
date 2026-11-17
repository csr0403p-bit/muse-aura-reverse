package com.facebook.aura.library.model;

import X.AHD;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.library.repo.ArtifactSortMode;
import com.facebook.aura.library.repo.LoadingState;
import com.facebook.aura.library.repo.UnifiedArtifact;
import com.facebook.aura.library.repo.WorkspaceEntry;

/* loaded from: classes.dex */
public final class FeedSnapshot extends C06G {
    public final AHD<UnifiedArtifact> artifactItems;
    public final LoadingState artifactsLoadingState;
    public final LoadingState loadingState;
    public final AHD<WorkspaceEntry> media;
    public final ArtifactSortMode sort;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedSnapshot) {
                FeedSnapshot feedSnapshot = (FeedSnapshot) obj;
                if (!C7384Etj.areEqual(this.media, feedSnapshot.media) || this.loadingState != feedSnapshot.loadingState || !C7384Etj.areEqual(this.artifactItems, feedSnapshot.artifactItems) || this.artifactsLoadingState != feedSnapshot.artifactsLoadingState || this.sort != feedSnapshot.sort) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedSnapshot copy$default(FeedSnapshot feedSnapshot, AHD ahd, LoadingState loadingState, AHD ahd2, LoadingState loadingState2, ArtifactSortMode artifactSortMode, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = feedSnapshot.media;
        }
        if ((i & 2) != 0) {
            loadingState = feedSnapshot.loadingState;
        }
        if ((i & 4) != 0) {
            ahd2 = feedSnapshot.artifactItems;
        }
        if ((i & 8) != 0) {
            loadingState2 = feedSnapshot.artifactsLoadingState;
        }
        if ((i & 16) != 0) {
            artifactSortMode = feedSnapshot.sort;
        }
        return feedSnapshot.copy(ahd, loadingState, ahd2, loadingState2, artifactSortMode);
    }

    public final AHD<WorkspaceEntry> component1() {
        return this.media;
    }

    public final LoadingState component2() {
        return this.loadingState;
    }

    public final AHD<UnifiedArtifact> component3() {
        return this.artifactItems;
    }

    public final LoadingState component4() {
        return this.artifactsLoadingState;
    }

    public final ArtifactSortMode component5() {
        return this.sort;
    }

    public final AHD<UnifiedArtifact> getArtifactItems() {
        return this.artifactItems;
    }

    public final LoadingState getArtifactsLoadingState() {
        return this.artifactsLoadingState;
    }

    public final LoadingState getLoadingState() {
        return this.loadingState;
    }

    public final AHD<WorkspaceEntry> getMedia() {
        return this.media;
    }

    public final ArtifactSortMode getSort() {
        return this.sort;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.sort, AnonymousClass005.A0F(this.artifactsLoadingState, AnonymousClass005.A0F(this.artifactItems, AnonymousClass005.A0F(this.loadingState, AnonymousClass005.A0E(this.media)))));
    }

    public FeedSnapshot(AHD<WorkspaceEntry> ahd, LoadingState loadingState, AHD<UnifiedArtifact> ahd2, LoadingState loadingState2, ArtifactSortMode artifactSortMode) {
        AnonymousClass005.A17(ahd, loadingState, ahd2, loadingState2, artifactSortMode);
        this.media = ahd;
        this.loadingState = loadingState;
        this.artifactItems = ahd2;
        this.artifactsLoadingState = loadingState2;
        this.sort = artifactSortMode;
    }

    public final FeedSnapshot copy(AHD<WorkspaceEntry> ahd, LoadingState loadingState, AHD<UnifiedArtifact> ahd2, LoadingState loadingState2, ArtifactSortMode artifactSortMode) {
        AnonymousClass005.A17(ahd, loadingState, ahd2, loadingState2, artifactSortMode);
        return new FeedSnapshot(ahd, loadingState, ahd2, loadingState2, artifactSortMode);
    }

    public String toString() {
        return super.toString();
    }
}
