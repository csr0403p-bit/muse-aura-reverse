package com.facebook.aura.pairs;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C06827l3;
import X.C06847l8;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class SpaceCollaboratorsKt {
    public static final String INVITED_STATE = "invited";
    public static final String MUSE_PRINCIPAL_PREFIX = "muse:";
    public static final C06827l3 PEER_PHOTO_PATH = C06827l3.A02("^/api/peers/([a-z0-9]{1,128})/photo/([0-9a-f]{64})$");
    public static final int SPACE_COLLABORATOR_LIMIT = 50;

    public static final SpaceCollaborators toDomain(SpaceCollaboratorsJson spaceCollaboratorsJson) {
        String strA0l;
        String strA0l2;
        C7384Etj.A0Y(spaceCollaboratorsJson, 0);
        List<SpaceCollaboratorJson> list = spaceCollaboratorsJson.collaborators;
        ArrayList arrayListA0h = C3cG.A0h();
        for (SpaceCollaboratorJson spaceCollaboratorJson : list) {
            AnonymousClass006.A1F(spaceCollaboratorJson.principal, spaceCollaboratorJson, arrayListA0h);
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        Iterator it = arrayListA0h.iterator();
        while (true) {
            PairsImageRef pairsImageRefPeerPhotoRef = null;
            if (!it.hasNext()) {
                break;
            }
            SpaceCollaboratorJson spaceCollaboratorJson2 = (SpaceCollaboratorJson) it.next();
            String str = spaceCollaboratorJson2.principal;
            String str2 = spaceCollaboratorJson2.name;
            if (str2 == null || (strA0l2 = AnonymousClass002.A0l(str2)) == null || strA0l2.length() <= 0) {
                strA0l2 = null;
            }
            SpaceRole spaceRoleFromWire = SpaceRole.Companion.fromWire(spaceCollaboratorJson2.permission);
            boolean zEquals = INVITED_STATE.equals(spaceCollaboratorJson2.state);
            String str3 = spaceCollaboratorJson2.photo_url;
            if (str3 != null) {
                pairsImageRefPeerPhotoRef = peerPhotoRef(str3);
            }
            arrayListA0i.add(new SpaceCollaborator(str, strA0l2, spaceRoleFromWire, zEquals, pairsImageRefPeerPhotoRef));
        }
        List<SpaceAccessRequestJson> list2 = spaceCollaboratorsJson.pending_access_requests;
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (SpaceAccessRequestJson spaceAccessRequestJson : list2) {
            SpaceRole spaceRoleFromWire2 = SpaceRole.Companion.fromWire(spaceAccessRequestJson.requested_permission);
            if (spaceRoleFromWire2 == null || spaceRoleFromWire2 == SpaceRole.VIEW) {
                spaceRoleFromWire2 = null;
            }
            if (!C7BY.A0j(spaceAccessRequestJson.activity_id) && spaceRoleFromWire2 != null) {
                String str4 = spaceAccessRequestJson.activity_id;
                String str5 = spaceAccessRequestJson.principal;
                String str6 = spaceAccessRequestJson.name;
                if (str6 == null || (strA0l = AnonymousClass002.A0l(str6)) == null || strA0l.length() <= 0) {
                    strA0l = null;
                }
                arrayListA0h2.add(new SpaceAccessRequest(str4, str5, strA0l, spaceRoleFromWire2));
            }
        }
        return new SpaceCollaborators(arrayListA0i, arrayListA0h2, spaceCollaboratorsJson.connection_revision);
    }

    public static final PairsImageRef peerPhotoRef(String str) {
        C06847l8 c06847l8A01 = C06827l3.A01(str, PEER_PHOTO_PATH);
        if (c06847l8A01 != null) {
            return new PairsImageRef(c06847l8A01.AG1().get(1), c06847l8A01.AG1().get(2), PairsImageKind.PHOTO, true);
        }
        return null;
    }
}
