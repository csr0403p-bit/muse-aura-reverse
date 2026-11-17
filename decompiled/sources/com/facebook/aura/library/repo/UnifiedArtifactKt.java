package com.facebook.aura.library.repo;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06827l3;
import X.C10571Hud;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import com.facebook.aura.library.repo.ArtifactOpenTarget;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.aura.spaces.repo.SpacesWebViewSessionKt;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class UnifiedArtifactKt {
    public static final String OWNER_PRINCIPAL = "owner";
    public static final C06827l3 PEER_SPACE_HOST = new C06827l3("^[a-z0-9]{1,128}$");

    public static final Integer getAudienceRowCount(ArtifactSharingInfo artifactSharingInfo) {
        C7384Etj.A0Y(artifactSharingInfo, 0);
        if (getAudienceVisibility(artifactSharingInfo) != null) {
            return Integer.valueOf(artifactSharingInfo.recipients.size() + (AnonymousClass002.A1X(artifactSharingInfo.viewerPermission) ? 1 : 0));
        }
        return null;
    }

    public static final ArtifactAudienceVisibility getAudienceVisibility(ArtifactSharingInfo artifactSharingInfo) {
        C7384Etj.A0Y(artifactSharingInfo, 0);
        String str = artifactSharingInfo.state;
        if ("restricted".equals(str)) {
            return ArtifactAudienceVisibility.RESTRICTED;
        }
        if ("public".equals(str)) {
            return ArtifactAudienceVisibility.PUBLIC;
        }
        return null;
    }

    public static final boolean isPeerSpaceHost(String str) {
        C7384Etj.A0Y(str, 0);
        return PEER_SPACE_HOST.A08(str);
    }

    public static final boolean isValidUuid(String str) {
        Object c10571Hud;
        C7384Etj.A0Y(str, 0);
        try {
            c10571Hud = UUID.fromString(str);
        } catch (Throwable th) {
            c10571Hud = new C10571Hud(th);
        }
        return !(c10571Hud instanceof C10571Hud);
    }

    public static final ArtifactOpenTarget.PeerSpace peerSpaceTargetFromItemKey(String str) {
        C7384Etj.A0Y(str, 0);
        String strA0S = C7BY.A0S(str, "", HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
        if (isPeerSpaceHost(strA0S) && strA0S != null) {
            String strA0Q = C7BY.A0Q(str, "", HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
            if (isValidUuid(strA0Q) && strA0Q != null) {
                return new ArtifactOpenTarget.PeerSpace(strA0S, strA0Q, null, peerSpaceRootPath(strA0S, strA0Q));
            }
        }
        return null;
    }

    public static final UnifiedArtifact findSpaceBySlug(List<UnifiedArtifact> list, String str) {
        UnifiedArtifact next;
        ArtifactSource artifactSource;
        AnonymousClass003.A0u(list, str);
        Iterator<UnifiedArtifact> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            UnifiedArtifact unifiedArtifact = next;
            if (str.equals(unifiedArtifact.itemKey) && ((artifactSource = unifiedArtifact.source) == ArtifactSource.SPACE || artifactSource == ArtifactSource.SAVED_SPACE)) {
                break;
            }
        }
        return next;
    }

    public static final String peerSpaceRootPath(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return FGI.A0h(SpacesWebViewSessionKt.PEER_SPACES_ROUTE_PREFIX, str, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str2, CustomConnectorRegisterRepositoryKt.ROOT_PATH);
    }
}
