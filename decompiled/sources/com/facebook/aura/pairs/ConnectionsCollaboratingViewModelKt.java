package com.facebook.aura.pairs;

import X.AGH;
import X.AGI;
import X.AnonymousClass002;
import X.BFI;
import X.BO6;
import X.C3cG;
import com.facebook.aura.library.repo.ArtifactItem;
import com.facebook.aura.library.repo.ArtifactSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class ConnectionsCollaboratingViewModelKt {
    public static final Set<ConnectionsSharedItemKind> COLLABORATING_KINDS = BFI.A0H(new ConnectionsSharedItemKind[]{ConnectionsSharedItemKind.SPACE, ConnectionsSharedItemKind.GOAL});
    public static final String TAG = "ConnectionsCollaboratingViewModel";

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isSameSpace(com.facebook.aura.library.repo.ArtifactItem r5, com.facebook.aura.navigation.AuraNavKey r6) {
        /*
            boolean r0 = r6 instanceof com.facebook.aura.navigation.key.SpacesModalScreenKey
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L19
            com.facebook.aura.library.repo.ArtifactSource r1 = r5.source
            com.facebook.aura.library.repo.ArtifactSource r0 = com.facebook.aura.library.repo.ArtifactSource.SPACE
            if (r1 != r0) goto L36
            java.lang.String r1 = r5.itemKey
            com.facebook.aura.navigation.key.SpacesModalScreenKey r6 = (com.facebook.aura.navigation.key.SpacesModalScreenKey) r6
            java.lang.String r0 = r6.slug
        L12:
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L36
            return r4
        L19:
            boolean r0 = r6 instanceof com.facebook.aura.navigation.key.PeerSpaceScreenKey
            if (r0 == 0) goto L36
            java.lang.String r0 = r5.itemKey
            com.facebook.aura.library.repo.ArtifactOpenTarget$PeerSpace r2 = com.facebook.aura.library.repo.UnifiedArtifactKt.peerSpaceTargetFromItemKey(r0)
            if (r2 == 0) goto L36
            java.lang.String r1 = r2.hostMuse
            com.facebook.aura.navigation.key.PeerSpaceScreenKey r6 = (com.facebook.aura.navigation.key.PeerSpaceScreenKey) r6
            java.lang.String r0 = r6.hostMuse
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L36
            java.lang.String r1 = r2.spaceId
            java.lang.String r0 = r6.spaceId
            goto L12
        L36:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsCollaboratingViewModelKt.isSameSpace(com.facebook.aura.library.repo.ArtifactItem, com.facebook.aura.navigation.AuraNavKey):boolean");
    }

    public static final BO6<String, ConnectionsSpaceIcon> spaceIcons(List<ConnectionsResource> list, List<ArtifactItem> list2) {
        ArtifactItem next;
        ArrayList arrayListA0h = C3cG.A0h();
        for (ConnectionsResource connectionsResource : list) {
            Iterator<ArtifactItem> it = list2.iterator();
            do {
                next = null;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            } while (!isSameSpace(next, connectionsResource.destination));
            ArtifactItem artifactItem = next;
            if (artifactItem != null) {
                AnonymousClass002.A1J(connectionsResource.bindingId, new ConnectionsSpaceIcon(artifactItem.icon, artifactItem.xmdsIcon, AnonymousClass002.A1Z(artifactItem.source, ArtifactSource.SAVED_SPACE)), arrayListA0h);
            }
        }
        return AGI.A08(AGH.A06(arrayListA0h));
    }
}
