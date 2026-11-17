package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ArtifactPlacementRequest extends C06G {
    public final String artifactRef;
    public final ArtifactPlacement placement;
    public final String spaceId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactPlacementRequest) {
                ArtifactPlacementRequest artifactPlacementRequest = (ArtifactPlacementRequest) obj;
                if (!C7384Etj.areEqual(this.artifactRef, artifactPlacementRequest.artifactRef) || !C7384Etj.areEqual(this.spaceId, artifactPlacementRequest.spaceId) || this.placement != artifactPlacementRequest.placement) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ArtifactPlacementRequest copy$default(ArtifactPlacementRequest artifactPlacementRequest, String str, String str2, ArtifactPlacement artifactPlacement, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactPlacementRequest.artifactRef;
        }
        if ((i & 2) != 0) {
            str2 = artifactPlacementRequest.spaceId;
        }
        if ((i & 4) != 0) {
            artifactPlacement = artifactPlacementRequest.placement;
        }
        return artifactPlacementRequest.copy(str, str2, artifactPlacement);
    }

    public final String component1() {
        return this.artifactRef;
    }

    public final String component2() {
        return this.spaceId;
    }

    public final ArtifactPlacement component3() {
        return this.placement;
    }

    public final String getArtifactRef() {
        return this.artifactRef;
    }

    public final ArtifactPlacement getPlacement() {
        return this.placement;
    }

    public final String getSpaceId() {
        return this.spaceId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.placement, AnonymousClass005.A0I(this.spaceId, AnonymousClass001.A0G(this.artifactRef)));
    }

    public ArtifactPlacementRequest(String str, String str2, ArtifactPlacement artifactPlacement) {
        AnonymousClass005.A0x(str, str2, artifactPlacement);
        this.artifactRef = str;
        this.spaceId = str2;
        this.placement = artifactPlacement;
    }

    public final ArtifactPlacementRequest copy(String str, String str2, ArtifactPlacement artifactPlacement) {
        AnonymousClass005.A0x(str, str2, artifactPlacement);
        return new ArtifactPlacementRequest(str, str2, artifactPlacement);
    }

    public String toString() {
        return super.toString();
    }
}
