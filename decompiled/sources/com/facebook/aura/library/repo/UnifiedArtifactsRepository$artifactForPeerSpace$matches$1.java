package com.facebook.aura.library.repo;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.library.repo.ArtifactOpenTarget;

/* loaded from: classes.dex */
public final class UnifiedArtifactsRepository$artifactForPeerSpace$matches$1 extends AbstractC7559F3s implements G0U<UnifiedArtifact, Boolean> {
    public final /* synthetic */ String $hostMuse;
    public final /* synthetic */ String $spaceId;

    @Override // X.G0U
    public final Boolean invoke(UnifiedArtifact unifiedArtifact) {
        C7384Etj.A0Y(unifiedArtifact, 0);
        ArtifactOpenTarget artifactOpenTarget = unifiedArtifact.openTarget;
        ArtifactOpenTarget.PeerSpace peerSpace = artifactOpenTarget instanceof ArtifactOpenTarget.PeerSpace ? (ArtifactOpenTarget.PeerSpace) artifactOpenTarget : null;
        boolean z = false;
        if (peerSpace != null) {
            String str = this.$hostMuse;
            String str2 = this.$spaceId;
            if (C7384Etj.areEqual(peerSpace.hostMuse, str) && C7384Etj.areEqual(peerSpace.spaceId, str2)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedArtifactsRepository$artifactForPeerSpace$matches$1(String str, String str2) {
        super(1);
        this.$hostMuse = str;
        this.$spaceId = str2;
    }
}
