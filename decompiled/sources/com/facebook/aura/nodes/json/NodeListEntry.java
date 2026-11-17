package com.facebook.aura.nodes.json;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C10571Hud;
import X.C7384Etj;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import java.time.OffsetDateTime;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class NodeListEntry extends C06G {
    public static final Companion Companion = new Companion();
    public static final String HATCH_LINK_DEVICE_FAMILY = "link";
    public static final String HATCH_LINK_NODE_ID_PREFIX = "hatchlink-";
    public static final String HOME_LINK_NODE_ID_PREFIX = "homelink-";
    public final Map<String, NodeCommandSpec> commands;
    public final String connectionState;
    public final String deviceFamily;
    public final String displayName;
    public final String lastSeenAt;
    public final String networkSsid;
    public final String nodeId;
    public final Boolean online;
    public final String pairedAt;
    public final NodePairingStatus pairingStatus;
    public final String platform;
    public final String version;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NodeListEntry) {
                NodeListEntry nodeListEntry = (NodeListEntry) obj;
                if (!C7384Etj.areEqual(this.nodeId, nodeListEntry.nodeId) || !C7384Etj.areEqual(this.displayName, nodeListEntry.displayName) || !C7384Etj.areEqual(this.platform, nodeListEntry.platform) || !C7384Etj.areEqual(this.version, nodeListEntry.version) || !C7384Etj.areEqual(this.lastSeenAt, nodeListEntry.lastSeenAt) || !C7384Etj.areEqual(this.pairedAt, nodeListEntry.pairedAt) || !C7384Etj.areEqual(this.online, nodeListEntry.online) || !C7384Etj.areEqual(this.connectionState, nodeListEntry.connectionState) || !C7384Etj.areEqual(this.deviceFamily, nodeListEntry.deviceFamily) || !C7384Etj.areEqual(this.commands, nodeListEntry.commands) || !C7384Etj.areEqual(this.networkSsid, nodeListEntry.networkSsid) || this.pairingStatus != nodeListEntry.pairingStatus) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NodeListEntry copy$default(NodeListEntry nodeListEntry, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, Map map, String str9, NodePairingStatus nodePairingStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nodeListEntry.nodeId;
        }
        if ((i & 2) != 0) {
            str2 = nodeListEntry.displayName;
        }
        if ((i & 4) != 0) {
            str3 = nodeListEntry.platform;
        }
        if ((i & 8) != 0) {
            str4 = nodeListEntry.version;
        }
        if ((i & 16) != 0) {
            str5 = nodeListEntry.lastSeenAt;
        }
        if ((i & 32) != 0) {
            str6 = nodeListEntry.pairedAt;
        }
        if ((i & 64) != 0) {
            bool = nodeListEntry.online;
        }
        if ((i & 128) != 0) {
            str7 = nodeListEntry.connectionState;
        }
        if ((i & 256) != 0) {
            str8 = nodeListEntry.deviceFamily;
        }
        if ((i & 512) != 0) {
            map = nodeListEntry.commands;
        }
        if ((i & 1024) != 0) {
            str9 = nodeListEntry.networkSsid;
        }
        if ((i & 2048) != 0) {
            nodePairingStatus = nodeListEntry.pairingStatus;
        }
        return nodeListEntry.copy(str, str2, str3, str4, str5, str6, bool, str7, str8, map, str9, nodePairingStatus);
    }

    public final String component1() {
        return this.nodeId;
    }

    public final Map<String, NodeCommandSpec> component10() {
        return this.commands;
    }

    public final String component11() {
        return this.networkSsid;
    }

    public final NodePairingStatus component12() {
        return this.pairingStatus;
    }

    public final String component2() {
        return this.displayName;
    }

    public final String component3() {
        return this.platform;
    }

    public final String component4() {
        return this.version;
    }

    public final String component5() {
        return this.lastSeenAt;
    }

    public final String component6() {
        return this.pairedAt;
    }

    public final Boolean component7() {
        return this.online;
    }

    public final String component8() {
        return this.connectionState;
    }

    public final String component9() {
        return this.deviceFamily;
    }

    public final Map<String, NodeCommandSpec> getCommands() {
        return this.commands;
    }

    public final String getConnectionState() {
        return this.connectionState;
    }

    public final String getDeviceFamily() {
        return this.deviceFamily;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getLastSeenAt() {
        return this.lastSeenAt;
    }

    public final Long getLastSeenMs() {
        Object c10571Hud;
        String str = this.lastSeenAt;
        if (str == null) {
            return null;
        }
        try {
            c10571Hud = Long.valueOf(OffsetDateTime.parse(str).toInstant().toEpochMilli());
        } catch (Throwable th) {
            c10571Hud = new C10571Hud(th);
        }
        return (Long) (c10571Hud instanceof C10571Hud ? null : c10571Hud);
    }

    public final String getNetworkSsid() {
        return this.networkSsid;
    }

    public final String getNodeId() {
        return this.nodeId;
    }

    public final Boolean getOnline() {
        return this.online;
    }

    public final String getPairedAt() {
        return this.pairedAt;
    }

    public final NodePairingStatus getPairingStatus() {
        return this.pairingStatus;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return ((((((((((((((AnonymousClass005.A0I(this.version, AnonymousClass005.A0I(this.platform, AnonymousClass005.A0I(this.displayName, AnonymousClass001.A0G(this.nodeId)))) + AnonymousClass006.A0G(this.lastSeenAt)) * 31) + AnonymousClass006.A0G(this.pairedAt)) * 31) + AnonymousClass006.A0D(this.online)) * 31) + AnonymousClass006.A0G(this.connectionState)) * 31) + AnonymousClass006.A0G(this.deviceFamily)) * 31) + AnonymousClass006.A0D(this.commands)) * 31) + AnonymousClass006.A0G(this.networkSsid)) * 31) + C06G.A04(this.pairingStatus);
    }

    public final boolean isHatchLinkDevice() {
        String strA0l;
        String str = this.deviceFamily;
        String strA0u = null;
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null) {
            strA0u = AnonymousClass001.A0u(strA0l);
        }
        if (!"link".equals(strA0u)) {
            String strNormalizeNodeId = NodeListEntryKt.normalizeNodeId(this.nodeId);
            if (strNormalizeNodeId == null) {
                return false;
            }
            if (!strNormalizeNodeId.startsWith(HATCH_LINK_NODE_ID_PREFIX) && !strNormalizeNodeId.startsWith(HOME_LINK_NODE_ID_PREFIX)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isOnline() {
        String strA0l;
        if (AnonymousClass002.A1b(this.online, true)) {
            return true;
        }
        String str = this.connectionState;
        return "online".equals((str == null || (strA0l = AnonymousClass002.A0l(str)) == null) ? null : AnonymousClass001.A0u(strA0l));
    }

    public final boolean isWearable() {
        String upperCase = this.nodeId.toUpperCase(Locale.ROOT);
        int length = upperCase.length();
        if (length != 14 && length != 8 && length != 19) {
            return false;
        }
        for (int i = 0; i < upperCase.length(); i++) {
            if (!Character.isLetterOrDigit(upperCase.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public NodeListEntry(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, Map<String, NodeCommandSpec> map, String str9, NodePairingStatus nodePairingStatus) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.nodeId = str;
        this.displayName = str2;
        this.platform = str3;
        this.version = str4;
        this.lastSeenAt = str5;
        this.pairedAt = str6;
        this.online = bool;
        this.connectionState = str7;
        this.deviceFamily = str8;
        this.commands = map;
        this.networkSsid = str9;
        this.pairingStatus = nodePairingStatus;
    }

    public final NodeListEntry copy(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, Map<String, NodeCommandSpec> map, String str9, NodePairingStatus nodePairingStatus) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new NodeListEntry(str, str2, str3, str4, str5, str6, bool, str7, str8, map, str9, nodePairingStatus);
    }

    public final DevicePresence getPresence() {
        String strA0l;
        if (isOnline()) {
            return DevicePresence.ONLINE;
        }
        String str = this.connectionState;
        return "wakeable".equals((str == null || (strA0l = AnonymousClass002.A0l(str)) == null) ? null : AnonymousClass001.A0u(strA0l)) ? DevicePresence.WAKEABLE : DevicePresence.OFFLINE;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NodeListEntry(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, Map map, String str9, NodePairingStatus nodePairingStatus, int i, C06H c06h) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : map, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : nodePairingStatus);
    }
}
