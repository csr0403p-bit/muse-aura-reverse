package com.facebook.aura.spacesharing.impl;

import X.AGI;
import X.AHD;
import X.AII;
import X.AIM;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.library.repo.ArtifactAudienceVisibility;
import com.facebook.aura.library.repo.ArtifactSharePermission;
import com.facebook.aura.library.repo.ArtifactSharingInfo;
import com.facebook.aura.library.repo.ArtifactSharingRecipient;
import com.facebook.aura.library.repo.UnifiedArtifactKt;
import com.facebook.aura.spacesharing.impl.SavedSpaceAudience;
import com.facebook.aura.spacesharing.impl.SavedSpaceAudienceRow;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class SavedSpaceAudienceViewModelKt {
    public static final SavedSpaceAudience toAudience(ArtifactSharingInfo artifactSharingInfo) {
        SavedSpaceAudience savedSpaceAudience;
        if (artifactSharingInfo == null) {
            savedSpaceAudience = SavedSpaceAudience.Unavailable.INSTANCE;
        } else if ("unshared".equals(artifactSharingInfo.state)) {
            savedSpaceAudience = SavedSpaceAudience.Revoked.INSTANCE;
        } else {
            ArtifactAudienceVisibility audienceVisibility = UnifiedArtifactKt.getAudienceVisibility(artifactSharingInfo);
            if (audienceVisibility != null) {
                List<ArtifactSharingRecipient> list = artifactSharingInfo.recipients;
                ArrayList<ArtifactSharingRecipient> arrayListA0h = C3cG.A0h();
                ArrayList<ArtifactSharingRecipient> arrayListA0h2 = C3cG.A0h();
                for (ArtifactSharingRecipient artifactSharingRecipient : list) {
                    if (artifactSharingRecipient.isOwner()) {
                        arrayListA0h.add(artifactSharingRecipient);
                    } else {
                        arrayListA0h2.add(artifactSharingRecipient);
                    }
                }
                AII aiiA17 = AIM.A17();
                for (ArtifactSharingRecipient artifactSharingRecipient2 : arrayListA0h) {
                    aiiA17.add(new SavedSpaceAudienceRow.Owner(artifactSharingRecipient2.name, artifactSharingRecipient2.photoUrl));
                }
                ArtifactSharePermission artifactSharePermission = artifactSharingInfo.viewerPermission;
                if (artifactSharePermission != null) {
                    aiiA17.add(new SavedSpaceAudienceRow.Self(artifactSharePermission, null));
                }
                for (ArtifactSharingRecipient artifactSharingRecipient3 : arrayListA0h2) {
                    aiiA17.add(new SavedSpaceAudienceRow.Recipient(artifactSharingRecipient3.name, artifactSharingRecipient3.photoUrl, artifactSharingRecipient3.permission));
                }
                return new SavedSpaceAudience.Known(audienceVisibility, AGI.A07(AIM.A18(aiiA17)), AnonymousClass002.A1X(artifactSharingInfo.viewerPermission));
            }
            savedSpaceAudience = SavedSpaceAudience.Unavailable.INSTANCE;
        }
        return savedSpaceAudience;
    }

    public static final SavedSpaceAudienceState withSelfPhoto(SavedSpaceAudienceState savedSpaceAudienceState, String str) {
        SavedSpaceAudience.Known known;
        SavedSpaceAudience savedSpaceAudience = savedSpaceAudienceState.audience;
        if (!(savedSpaceAudience instanceof SavedSpaceAudience.Known) || (known = (SavedSpaceAudience.Known) savedSpaceAudience) == null) {
            return savedSpaceAudienceState;
        }
        AHD<SavedSpaceAudienceRow> ahd = known.rows;
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
        for (Object self : ahd) {
            if (self instanceof SavedSpaceAudienceRow.Self) {
                ArtifactSharePermission artifactSharePermission = ((SavedSpaceAudienceRow.Self) self).permission;
                C7384Etj.A0Y(artifactSharePermission, 0);
                self = new SavedSpaceAudienceRow.Self(artifactSharePermission, str);
            }
            arrayListA0i.add(self);
        }
        SavedSpaceAudience.Known knownCopy = known.copy(known.visibility, AGI.A07(arrayListA0i), known.viewerRoleKnown);
        String str2 = savedSpaceAudienceState.title;
        String str3 = savedSpaceAudienceState.iconUrl;
        String str4 = savedSpaceAudienceState.shareUrl;
        AnonymousClass003.A0w(str2, knownCopy);
        return new SavedSpaceAudienceState(str2, str3, str4, knownCopy);
    }
}
