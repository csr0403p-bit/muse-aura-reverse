package com.facebook.aura.spaces.menu;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.library.repo.ArtifactItem;
import com.facebook.aura.library.repo.ArtifactPlacement;
import com.facebook.aura.library.repo.ArtifactPlacementRequest;
import com.facebook.aura.library.repo.UnifiedArtifact;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$moveToLibrary$1", f = "PeerSpaceMembersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class PeerSpaceMembersViewModel$moveToLibrary$1 extends AbstractC07127nr implements G0W<UnifiedArtifact, ArtifactItem, HtJ<? super ArtifactPlacementRequest>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public PeerSpaceMembersViewModel$moveToLibrary$1(HtJ<? super PeerSpaceMembersViewModel$moveToLibrary$1> htJ) {
        super(3, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        ArtifactPlacementRequest artifactPlacementRequestPlacementRequest;
        UnifiedArtifact unifiedArtifact = (UnifiedArtifact) this.L$0;
        ArtifactItem artifactItem = (ArtifactItem) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (unifiedArtifact != null && (artifactPlacementRequestPlacementRequest = unifiedArtifact.placementRequest(ArtifactPlacement.LIBRARY)) != null) {
            return artifactPlacementRequestPlacementRequest;
        }
        if (artifactItem != null) {
            return artifactItem.moveToLibraryRequest();
        }
        return null;
    }

    @Override // X.G0W
    public final Object invoke(UnifiedArtifact unifiedArtifact, ArtifactItem artifactItem, HtJ<? super ArtifactPlacementRequest> htJ) {
        PeerSpaceMembersViewModel$moveToLibrary$1 peerSpaceMembersViewModel$moveToLibrary$1 = new PeerSpaceMembersViewModel$moveToLibrary$1(htJ);
        peerSpaceMembersViewModel$moveToLibrary$1.L$0 = unifiedArtifact;
        peerSpaceMembersViewModel$moveToLibrary$1.L$1 = artifactItem;
        return peerSpaceMembersViewModel$moveToLibrary$1.invokeSuspend(Unit.INSTANCE);
    }
}
