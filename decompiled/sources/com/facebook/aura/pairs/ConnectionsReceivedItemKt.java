package com.facebook.aura.pairs;

import X.AnonymousClass002;
import X.C06827l3;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import com.facebook.aura.file.view.ArtifactFileActionMenuKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ConnectionsReceivedItemSheetKey;
import com.facebook.aura.navigation.key.ExploreIdeaCardDetailSheetKey;
import com.facebook.aura.navigation.key.GoalDetailScreenKey;
import com.facebook.aura.navigation.key.PeerGoalScreenKey;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ConnectionsReceivedItemKt {
    public static final String DIRECTION_RECEIVED = "received";
    public static final String DIRECTION_SENT = "sent";
    public static final int MAX_ITEM_ID_LENGTH = 256;
    public static final int MAX_RECEIVED_TITLE_LENGTH = 256;
    public static final int MAX_REFERENCE_LENGTH = 1024;
    public static final String SELF_HOST = "self";
    public static final List<String> FILE_REFERENCE_PREFIXES = C60O.A16("workspace/", ArtifactFileActionMenuKt.SANDBOX_REFERENCE_PREFIX);
    public static final C06827l3 PEER_HOST = C06827l3.A02("^[a-z0-9]{1,128}$");

    public static final ConnectionsSharedLinkTarget toLinkTarget(SharedTargetJson sharedTargetJson, String str) {
        String strPeerDisplayText;
        ConnectionsSharedItemKind next;
        int iOrdinal;
        AuraNavKey auraNavKeyGoalDestination;
        int length;
        C7384Etj.A0Y(sharedTargetJson, 0);
        C7384Etj.A0Y(str, 1);
        String str2 = sharedTargetJson.title;
        if (str2 == null || (strPeerDisplayText = PairsTextKt.peerDisplayText(str2, 256)) == null) {
            strPeerDisplayText = "";
        }
        Iterator<ConnectionsSharedItemKind> it = ConnectionsSharedItemKind.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.getWire(), sharedTargetJson.kind)) {
                break;
            }
        }
        ConnectionsSharedItemKind connectionsSharedItemKind = next;
        if (connectionsSharedItemKind != null && (iOrdinal = connectionsSharedItemKind.ordinal()) != -1 && iOrdinal != 3) {
            if (iOrdinal == 2) {
                auraNavKeyGoalDestination = goalDestination(sharedTargetJson, strPeerDisplayText);
                if (auraNavKeyGoalDestination == null) {
                    return null;
                }
            } else if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    String str3 = sharedTargetJson.direction;
                    if ("sent".equals(str3)) {
                        String str4 = sharedTargetJson.idea_id;
                        if (str4 != null && (length = str4.length()) > 0 && length <= 256) {
                            auraNavKeyGoalDestination = new ExploreIdeaCardDetailSheetKey(str4);
                        }
                    } else if (DIRECTION_RECEIVED.equals(str3)) {
                        auraNavKeyGoalDestination = new ConnectionsReceivedItemSheetKey(str);
                    }
                } else if (iOrdinal != 4) {
                    throw C3cG.A0q();
                }
            }
            return new ConnectionsSharedLinkTarget(strPeerDisplayText, null, null, auraNavKeyGoalDestination);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0083 A[EDGE_INSN: B:88:0x0083->B:42:0x0083 BREAK  A[LOOP:1: B:49:0x009a->B:90:?], EDGE_INSN: B:42:0x0083->B:43:0x0084 BREAK  A[LOOP:2: B:61:0x00cf->B:93:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.pairs.ConnectionsReceivedItem toReceivedItem(com.facebook.aura.pairs.ReceivedSharedItemJson r21) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsReceivedItemKt.toReceivedItem(com.facebook.aura.pairs.ReceivedSharedItemJson):com.facebook.aura.pairs.ConnectionsReceivedItem");
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
            try {
                AnonymousClass002.A15(ConnectionsSharedItemKind.FEED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ConnectionsSharedItemKind.IDEA, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ConnectionsSharedItemKind.FILE, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AuraNavKey goalDestination(SharedTargetJson sharedTargetJson, String str) {
        int length;
        String str2;
        String str3 = sharedTargetJson.goal_id;
        if (str3 != null && (length = str3.length()) > 0 && length <= 256 && (str2 = sharedTargetJson.host_muse) != null) {
            if (str2.equals("self")) {
                return new GoalDetailScreenKey(str3, str.length() != 0 ? str : null, null);
            }
            if (PEER_HOST.A08(str2)) {
                return new PeerGoalScreenKey(str2, str3, str);
            }
        }
        return null;
    }
}
