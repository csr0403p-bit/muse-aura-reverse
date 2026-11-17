package com.facebook.aura.pairs;

import X.AGH;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06827l3;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import X.HxE;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.library.repo.ArtifactOpenTarget;
import com.facebook.aura.library.repo.UnifiedArtifactKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.GoalDetailScreenKey;
import com.facebook.aura.navigation.key.PeerGoalScreenKey;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;
import com.facebook.aura.navigation.key.SpacesModalScreenKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class ConnectionsResourceKt {
    public static final String HUMAN_PARTICIPANT = "human";
    public static final int MAX_REFERENCE_LENGTH = 1024;
    public static final int MAX_TITLE_LENGTH = 256;
    public static final String SELF_HOST = "self";
    public static final String WORKSPACE_PREFIX = "workspace/";
    public static final C06827l3 PEER_HOST = C06827l3.A02("^[a-z0-9]{1,128}$");
    public static final C06827l3 SPACE_SLUG = C06827l3.A02("^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$");

    public static final boolean isContainedWorkspacePath(String str) {
        C7384Etj.A0Y(str, 0);
        String strDecodeWorkspacePath = WorkspaceUriResolver.INSTANCE.decodeWorkspacePath(str);
        if (!C7BY.A0k(strDecodeWorkspacePath, '\\')) {
            List listA0h = C7BY.A0h(strDecodeWorkspacePath, new char[1], '/');
            if (!(listA0h instanceof Collection) || !listA0h.isEmpty()) {
                Iterator it = listA0h.iterator();
                while (it.hasNext()) {
                    if ("..".equals(it.next())) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectionsSharedItemKind.values().length];
            try {
                AnonymousClass002.A13(ConnectionsSharedItemKind.SPACE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConnectionsSharedItemKind.GOAL, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AuraNavKey goalDestination(ConnectionResourceJson connectionResourceJson) {
        String str = connectionResourceJson.reference;
        int length = str.length();
        if (length > 0 && length <= 256) {
            String strPeerDisplayText = PairsTextKt.peerDisplayText(connectionResourceJson.title, 256);
            if (strPeerDisplayText == null) {
                strPeerDisplayText = "";
            }
            String str2 = connectionResourceJson.host_muse;
            if ("self".equals(str2)) {
                return new GoalDetailScreenKey(str, strPeerDisplayText.length() != 0 ? strPeerDisplayText : null, null);
            }
            if (PEER_HOST.A08(str2)) {
                return new PeerGoalScreenKey(connectionResourceJson.host_muse, str, strPeerDisplayText);
            }
        }
        return null;
    }

    public static final AuraNavKey spaceDestination(ConnectionResourceJson connectionResourceJson) {
        String str = connectionResourceJson.host_muse;
        AuraNavKey peerSpaceScreenKey = null;
        if ("self".equals(str)) {
            String str2 = connectionResourceJson.reference;
            if (SPACE_SLUG.A08(str2) && str2 != null) {
                peerSpaceScreenKey = new SpacesModalScreenKey(str2, null, false);
            }
        } else {
            ArtifactOpenTarget.PeerSpace peerSpacePeerSpaceTargetFromItemKey = UnifiedArtifactKt.peerSpaceTargetFromItemKey(FGI.A0U(str, ":", connectionResourceJson.resource_id));
            if (peerSpacePeerSpaceTargetFromItemKey != null) {
                String str3 = peerSpacePeerSpaceTargetFromItemKey.hostMuse;
                String str4 = peerSpacePeerSpaceTargetFromItemKey.spaceId;
                String strPeerDisplayText = PairsTextKt.peerDisplayText(connectionResourceJson.title, 256);
                if (strPeerDisplayText == null) {
                    strPeerDisplayText = "";
                }
                peerSpaceScreenKey = new PeerSpaceScreenKey(str3, str4, strPeerDisplayText, null, false);
            }
        }
        return peerSpaceScreenKey;
    }

    public static final ConnectionsResource toResource(ConnectionResourceJson connectionResourceJson, Map<String, String> map) {
        ConnectionsSharedItemKind next;
        if (connectionResourceJson.binding_id.length() == 0) {
            return null;
        }
        Iterator<ConnectionsSharedItemKind> it = ConnectionsSharedItemKind.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.getWire(), connectionResourceJson.kind)) {
                break;
            }
        }
        ConnectionsSharedItemKind connectionsSharedItemKind = next;
        if (connectionsSharedItemKind == null) {
            return null;
        }
        String str = connectionResourceJson.binding_id;
        String strPeerDisplayText = PairsTextKt.peerDisplayText(connectionResourceJson.title, 256);
        if (strPeerDisplayText == null) {
            strPeerDisplayText = "";
        }
        String str2 = connectionResourceJson.reference;
        int iOrdinal = connectionsSharedItemKind.ordinal();
        AuraNavKey auraNavKeyGoalDestination = iOrdinal != 3 ? iOrdinal != 2 ? null : goalDestination(connectionResourceJson) : spaceDestination(connectionResourceJson);
        String str3 = connectionResourceJson.reference;
        if (connectionsSharedItemKind != ConnectionsSharedItemKind.FILE || !C60O.A1X(str3, "workspace/") || str3.length() > 1024 || !isContainedWorkspacePath(str3)) {
            str3 = null;
        }
        String str4 = connectionResourceJson.host_muse;
        return new ConnectionsResource(str, connectionsSharedItemKind, strPeerDisplayText, str2, auraNavKeyGoalDestination, str3, "self".equals(str4), map.get(str4), connectionResourceJson.resource_id);
    }

    public static final ConnectionsResourcePage toPage(ConnectionResourcesJson connectionResourcesJson, List<ConnectionResourceJson> list, List<ConnectionParticipantJson> list2) {
        AnonymousClass005.A0x(connectionResourcesJson, list, list2);
        List<ConnectionParticipantJson> listA0c = AbstractC0878AGe.A0c(list2, new Comparator() { // from class: com.facebook.aura.pairs.ConnectionsResourceKt$toPage$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C3cG.A0P(ConnectionsResourceKt.HUMAN_PARTICIPANT.equals(((ConnectionParticipantJson) t).kind)).compareTo(C3cG.A0P(ConnectionsResourceKt.HUMAN_PARTICIPANT.equals(((ConnectionParticipantJson) t2).kind)));
            }
        });
        ArrayList arrayListA0h = C3cG.A0h();
        for (ConnectionParticipantJson connectionParticipantJson : listA0c) {
            String strPeerDisplayText = PairsTextKt.peerDisplayText(connectionParticipantJson.display_name, 256);
            if (strPeerDisplayText == null || C7BY.A0j(strPeerDisplayText)) {
                strPeerDisplayText = null;
            }
            String str = connectionParticipantJson.muse_id;
            if (str == null || str.length() <= 0) {
                str = connectionParticipantJson.participant_id;
                if (str.length() > 0) {
                }
            }
            if (strPeerDisplayText != null) {
                AnonymousClass002.A1J(str, strPeerDisplayText, arrayListA0h);
            }
        }
        HashSet hashSetA13 = C60O.A13();
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (Object obj : arrayListA0h) {
            AnonymousClass006.A1P(((HxE) obj).first, obj, hashSetA13, arrayListA0h2);
        }
        Map mapA06 = AGH.A06(arrayListA0h2);
        ArrayList arrayListA0h3 = C3cG.A0h();
        Iterator<ConnectionResourceJson> it = list.iterator();
        while (it.hasNext()) {
            ConnectionsResource resource = toResource(it.next(), mapA06);
            if (resource != null) {
                arrayListA0h3.add(resource);
            }
        }
        ArrayList arrayListA0h4 = C3cG.A0h();
        Iterator<ConnectionParticipantJson> it2 = list2.iterator();
        while (it2.hasNext()) {
            String strPeerDisplayText2 = PairsTextKt.peerDisplayText(it2.next().display_name, 256);
            if (strPeerDisplayText2 != null && !C7BY.A0j(strPeerDisplayText2)) {
                arrayListA0h4.add(strPeerDisplayText2);
            }
        }
        Map<String, Integer> map = connectionResourcesJson.counts;
        ArrayList arrayListA0h5 = C3cG.A0h();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            int iA0F = AnonymousClass001.A0F(entryA0l.getValue());
            Iterator<ConnectionsSharedItemKind> it3 = ConnectionsSharedItemKind.getEntries().iterator();
            while (true) {
                if (it3.hasNext()) {
                    ConnectionsSharedItemKind next = it3.next();
                    if (C7384Etj.areEqual(next.getWire(), key)) {
                        if (next != null && iA0F > 0) {
                            AnonymousClass002.A1J(next, Integer.valueOf(iA0F), arrayListA0h5);
                        }
                    }
                }
            }
        }
        Map mapA062 = AGH.A06(arrayListA0h5);
        String str2 = connectionResourcesJson.next;
        if (str2 == null || str2.length() <= 0) {
            str2 = null;
        }
        return new ConnectionsResourcePage(arrayListA0h3, arrayListA0h4, mapA062, str2, !connectionResourcesJson.unavailable_hosts.isEmpty());
    }
}
