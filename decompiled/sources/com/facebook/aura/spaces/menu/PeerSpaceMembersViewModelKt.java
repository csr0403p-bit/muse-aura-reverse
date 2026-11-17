package com.facebook.aura.spaces.menu;

import X.AbstractC3358CGz;
import X.BFI;
import X.C7384Etj;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.library.repo.ArtifactOpenTarget;
import com.facebook.aura.library.repo.UnifiedArtifact;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class PeerSpaceMembersViewModelKt {
    public static final Set<Integer> UNAVAILABLE_CODES = BFI.A0H(new Integer[]{403, 404});

    public static final boolean isPeerSpace(UnifiedArtifact unifiedArtifact, String str, String str2) {
        ArtifactOpenTarget artifactOpenTarget = unifiedArtifact.openTarget;
        ArtifactOpenTarget.PeerSpace peerSpace = artifactOpenTarget instanceof ArtifactOpenTarget.PeerSpace ? (ArtifactOpenTarget.PeerSpace) artifactOpenTarget : null;
        return peerSpace != null && C7384Etj.areEqual(peerSpace.hostMuse, str) && C7384Etj.areEqual(peerSpace.spaceId, str2);
    }

    public static final String resolveIconUrl(String str, AbstractC3358CGz abstractC3358CGz) {
        WorkspaceUriResolver workspaceUriResolver = WorkspaceUriResolver.INSTANCE;
        return workspaceUriResolver.isDaemonApiReference(str) ? workspaceUriResolver.resolveDaemonApiUrl(str, abstractC3358CGz) : workspaceUriResolver.resolveRawAssetUrl(str, abstractC3358CGz);
    }
}
