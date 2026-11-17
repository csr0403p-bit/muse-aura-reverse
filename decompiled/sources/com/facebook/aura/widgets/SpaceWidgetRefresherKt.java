package com.facebook.aura.widgets;

import X.AHI;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.library.repo.ArtifactOpenTarget;
import com.facebook.aura.library.repo.UnifiedArtifactKt;
import com.facebook.aura.library.view.PeerSpaceLibraryItemsKt;
import com.facebook.aura.spaces.repo.CardMetadata;
import com.facebook.aura.spaces.repo.SpaceCard;
import com.facebook.aura.spaces.repo.SpaceCardPriority;
import com.facebook.aura.spaces.repo.SpaceCardType;
import com.facebook.aura.spaces.repo.SpacesWebViewSessionKt;

/* loaded from: classes.dex */
public abstract class SpaceWidgetRefresherKt {
    public static final int MIN_SNAPSHOT_DP = 100;
    public static final int SPACE_WIDGET_HEADER_HEIGHT_DP = 64;
    public static final String TAG = "SpaceWidgetRefresher";

    public static final boolean canShowInWidget(SpaceCard spaceCard) {
        CardMetadata cardMetadata;
        C7384Etj.A0Y(spaceCard, 0);
        return (spaceCard.isShared || spaceCard.isBlockingSpaceSurface() || (cardMetadata = spaceCard.metadata) == null || cardMetadata.sourceUrl == null) ? false : true;
    }

    public static final SpaceCard peerSpaceWidgetCard(ArtifactOpenTarget.PeerSpace peerSpace, String str) {
        String strA0M = FGI.A0M(PeerSpaceLibraryItemsKt.PEER_SPACE_REF_PREFIX, peerSpace.getItemKey());
        SpaceCardType spaceCardType = SpaceCardType.HTML_WEB_VIEW;
        String str2 = peerSpace.spaceId;
        return new SpaceCard(strA0M, spaceCardType, str, str2, null, null, SpaceCardPriority.MEDIUM, null, null, null, null, null, null, null, null, null, AHI.A01, new CardMetadata(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, SpacesWebViewSessionKt.peerSpaceDocumentUrl(str2, UnifiedArtifactKt.peerSpaceRootPath(peerSpace.hostMuse, str2)), null, null), null, true, null, null, null, null, null);
    }
}
