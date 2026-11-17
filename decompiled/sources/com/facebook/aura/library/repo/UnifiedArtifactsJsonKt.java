package com.facebook.aura.library.repo;

import X.C7BY;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.aura.spaces.repo.PinnedItemsRepositoryJsonKt;

/* loaded from: classes.dex */
public abstract class UnifiedArtifactsJsonKt {
    public static final String artifactRefSuffix(String str) {
        return C7BY.A0K(CustomConnectorRegisterRepositoryKt.ROOT_PATH, C7BY.A0U(str, ":", ""));
    }

    public static final ArtifactSource artifactSourceFromApi(String str) {
        switch (str.hashCode()) {
            case -1843153943:
                if (str.equals("peer_space")) {
                    return ArtifactSource.PEER_SPACE;
                }
                return null;
            case 3143036:
                if (str.equals("file")) {
                    return ArtifactSource.LIBRARY;
                }
                return null;
            case 109637894:
                if (str.equals("space")) {
                    return ArtifactSource.SPACE;
                }
                return null;
            case 411468110:
                if (str.equals(PinnedItemsRepositoryJsonKt.NAVIGATION_SOURCE_SAVED_SPACE)) {
                    return ArtifactSource.SAVED_SPACE;
                }
                return null;
            default:
                return null;
        }
    }
}
