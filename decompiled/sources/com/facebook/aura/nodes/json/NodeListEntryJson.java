package com.facebook.aura.nodes.json;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;

@Serializable
/* loaded from: classes3.dex */
public final class NodeListEntryJson extends C06G {
    public static final Companion Companion = new Companion();
    public final JsonElement commands_v2;
    public final String connection_state;
    public final String device_family;
    public final String display_name;
    public final String last_seen_at;
    public final JsonElement metadata;
    public final String node_id;
    public final JsonElement online;
    public final String paired_at;
    public final String pairing_status;
    public final String platform;
    public final String version;

    public final class Companion {
        public final C9hr<NodeListEntryJson> serializer() {
            return NodeListEntryJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public NodeListEntryJson() {
        this("", "Unknown", "", "", null, null, null, null, null, null, null, null);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_json_json(NodeListEntryJson nodeListEntryJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(nodeListEntryJson.node_id)) {
            c9j5.AAV(nodeListEntryJson.node_id, c9iZ, 0);
        }
        if (zAfR || !"Unknown".equals(nodeListEntryJson.display_name)) {
            c9j5.AAV(nodeListEntryJson.display_name, c9iZ, 1);
        }
        if (zAfR || !"".equals(nodeListEntryJson.platform)) {
            c9j5.AAV(nodeListEntryJson.platform, c9iZ, 2);
        }
        if (zAfR || !"".equals(nodeListEntryJson.version)) {
            c9j5.AAV(nodeListEntryJson.version, c9iZ, 3);
        }
        if (zAfR || nodeListEntryJson.last_seen_at != null) {
            c9j5.AAP(nodeListEntryJson.last_seen_at, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || nodeListEntryJson.paired_at != null) {
            c9j5.AAP(nodeListEntryJson.paired_at, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || nodeListEntryJson.online != null) {
            c9j5.AAP(nodeListEntryJson.online, JsonElementSerializer.A00, c9iZ, 6);
        }
        if (zAfR || nodeListEntryJson.connection_state != null) {
            c9j5.AAP(nodeListEntryJson.connection_state, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || nodeListEntryJson.device_family != null) {
            c9j5.AAP(nodeListEntryJson.device_family, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || nodeListEntryJson.pairing_status != null) {
            c9j5.AAP(nodeListEntryJson.pairing_status, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || nodeListEntryJson.commands_v2 != null) {
            c9j5.AAP(nodeListEntryJson.commands_v2, JsonElementSerializer.A00, c9iZ, 10);
        }
        if (zAfR || nodeListEntryJson.metadata != null) {
            c9j5.AAP(nodeListEntryJson.metadata, JsonElementSerializer.A00, c9iZ, 11);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NodeListEntryJson) {
                NodeListEntryJson nodeListEntryJson = (NodeListEntryJson) obj;
                if (!C7384Etj.areEqual(this.node_id, nodeListEntryJson.node_id) || !C7384Etj.areEqual(this.display_name, nodeListEntryJson.display_name) || !C7384Etj.areEqual(this.platform, nodeListEntryJson.platform) || !C7384Etj.areEqual(this.version, nodeListEntryJson.version) || !C7384Etj.areEqual(this.last_seen_at, nodeListEntryJson.last_seen_at) || !C7384Etj.areEqual(this.paired_at, nodeListEntryJson.paired_at) || !C7384Etj.areEqual(this.online, nodeListEntryJson.online) || !C7384Etj.areEqual(this.connection_state, nodeListEntryJson.connection_state) || !C7384Etj.areEqual(this.device_family, nodeListEntryJson.device_family) || !C7384Etj.areEqual(this.pairing_status, nodeListEntryJson.pairing_status) || !C7384Etj.areEqual(this.commands_v2, nodeListEntryJson.commands_v2) || !C7384Etj.areEqual(this.metadata, nodeListEntryJson.metadata)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NodeListEntryJson copy$default(NodeListEntryJson nodeListEntryJson, String str, String str2, String str3, String str4, String str5, String str6, JsonElement jsonElement, String str7, String str8, String str9, JsonElement jsonElement2, JsonElement jsonElement3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nodeListEntryJson.node_id;
        }
        if ((i & 2) != 0) {
            str2 = nodeListEntryJson.display_name;
        }
        if ((i & 4) != 0) {
            str3 = nodeListEntryJson.platform;
        }
        if ((i & 8) != 0) {
            str4 = nodeListEntryJson.version;
        }
        if ((i & 16) != 0) {
            str5 = nodeListEntryJson.last_seen_at;
        }
        if ((i & 32) != 0) {
            str6 = nodeListEntryJson.paired_at;
        }
        if ((i & 64) != 0) {
            jsonElement = nodeListEntryJson.online;
        }
        if ((i & 128) != 0) {
            str7 = nodeListEntryJson.connection_state;
        }
        if ((i & 256) != 0) {
            str8 = nodeListEntryJson.device_family;
        }
        if ((i & 512) != 0) {
            str9 = nodeListEntryJson.pairing_status;
        }
        if ((i & 1024) != 0) {
            jsonElement2 = nodeListEntryJson.commands_v2;
        }
        if ((i & 2048) != 0) {
            jsonElement3 = nodeListEntryJson.metadata;
        }
        return nodeListEntryJson.copy(str, str2, str3, str4, str5, str6, jsonElement, str7, str8, str9, jsonElement2, jsonElement3);
    }

    public final String component1() {
        return this.node_id;
    }

    public final String component10() {
        return this.pairing_status;
    }

    public final JsonElement component11() {
        return this.commands_v2;
    }

    public final JsonElement component12() {
        return this.metadata;
    }

    public final String component2() {
        return this.display_name;
    }

    public final String component3() {
        return this.platform;
    }

    public final String component4() {
        return this.version;
    }

    public final String component5() {
        return this.last_seen_at;
    }

    public final String component6() {
        return this.paired_at;
    }

    public final JsonElement component7() {
        return this.online;
    }

    public final String component8() {
        return this.connection_state;
    }

    public final String component9() {
        return this.device_family;
    }

    public final JsonElement getCommands_v2() {
        return this.commands_v2;
    }

    public final String getConnection_state() {
        return this.connection_state;
    }

    public final String getDevice_family() {
        return this.device_family;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getLast_seen_at() {
        return this.last_seen_at;
    }

    public final JsonElement getMetadata() {
        return this.metadata;
    }

    public final String getNode_id() {
        return this.node_id;
    }

    public final JsonElement getOnline() {
        return this.online;
    }

    public final String getPaired_at() {
        return this.paired_at;
    }

    public final String getPairing_status() {
        return this.pairing_status;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return ((((((((((((((AnonymousClass005.A0I(this.version, AnonymousClass005.A0I(this.platform, AnonymousClass005.A0I(this.display_name, AnonymousClass001.A0G(this.node_id)))) + AnonymousClass006.A0G(this.last_seen_at)) * 31) + AnonymousClass006.A0G(this.paired_at)) * 31) + AnonymousClass006.A0D(this.online)) * 31) + AnonymousClass006.A0G(this.connection_state)) * 31) + AnonymousClass006.A0G(this.device_family)) * 31) + AnonymousClass006.A0G(this.pairing_status)) * 31) + AnonymousClass006.A0D(this.commands_v2)) * 31) + C3cH.A02(this.metadata);
    }

    public final NodeListEntry toDomain() {
        JsonObject jsonObject;
        JsonObject jsonObject2;
        LinkedHashMap linkedHashMap = null;
        if (NodeListEntryKt.normalizeNodeId(this.node_id) == null) {
            return null;
        }
        JsonElement jsonElement = this.commands_v2;
        if ((jsonElement instanceof JsonObject) && (jsonObject = (JsonObject) jsonElement) != null) {
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            Iterator<Map.Entry<String, JsonElement>> it = jsonObject.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(it);
                Object key = entryA0l.getKey();
                JsonElement jsonElement2 = (JsonElement) entryA0l.getValue();
                if ((jsonElement2 instanceof JsonObject) && (jsonObject2 = (JsonObject) jsonElement2) != null) {
                    linkedHashMapA0j.put(key, NodeCommandSpec.Companion.fromJson(jsonObject2));
                }
            }
            if (!linkedHashMapA0j.isEmpty()) {
                linkedHashMap = linkedHashMapA0j;
            }
        }
        return new NodeListEntry(this.node_id, this.display_name, this.platform, this.version, this.last_seen_at, this.paired_at, NodeListEntryJsonKt.asOnlineBooleanOrNull(this.online), this.connection_state, this.device_family, linkedHashMap, NodeListEntryJsonKt.networkSsidOrNull(this.metadata), NodePairingStatus.Companion.fromWire(this.pairing_status));
    }

    public final NodeListEntryJson copy(String str, String str2, String str3, String str4, String str5, String str6, JsonElement jsonElement, String str7, String str8, String str9, JsonElement jsonElement2, JsonElement jsonElement3) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new NodeListEntryJson(str, str2, str3, str4, str5, str6, jsonElement, str7, str8, str9, jsonElement2, jsonElement3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NodeListEntryJson(String str, String str2, String str3, String str4, String str5, String str6, JsonElement jsonElement, String str7, String str8, String str9, JsonElement jsonElement2, JsonElement jsonElement3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "Unknown" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : jsonElement, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : jsonElement2, (i & 2048) != 0 ? null : jsonElement3);
    }

    public NodeListEntryJson(String str, String str2, String str3, String str4, String str5, String str6, JsonElement jsonElement, String str7, String str8, String str9, JsonElement jsonElement2, JsonElement jsonElement3) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.node_id = str;
        this.display_name = str2;
        this.platform = str3;
        this.version = str4;
        this.last_seen_at = str5;
        this.paired_at = str6;
        this.online = jsonElement;
        this.connection_state = str7;
        this.device_family = str8;
        this.pairing_status = str9;
        this.commands_v2 = jsonElement2;
        this.metadata = jsonElement3;
    }

    public /* synthetic */ NodeListEntryJson(int i, String str, String str2, String str3, String str4, String str5, String str6, JsonElement jsonElement, String str7, String str8, String str9, JsonElement jsonElement2, JsonElement jsonElement3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.node_id = "";
        } else {
            this.node_id = str;
        }
        if ((i & 2) == 0) {
            this.display_name = "Unknown";
        } else {
            this.display_name = str2;
        }
        if ((i & 4) == 0) {
            this.platform = "";
        } else {
            this.platform = str3;
        }
        if ((i & 8) == 0) {
            this.version = "";
        } else {
            this.version = str4;
        }
        if ((i & 16) == 0) {
            this.last_seen_at = null;
        } else {
            this.last_seen_at = str5;
        }
        if ((i & 32) == 0) {
            this.paired_at = null;
        } else {
            this.paired_at = str6;
        }
        if ((i & 64) == 0) {
            this.online = null;
        } else {
            this.online = jsonElement;
        }
        if ((i & 128) == 0) {
            this.connection_state = null;
        } else {
            this.connection_state = str7;
        }
        if ((i & 256) == 0) {
            this.device_family = null;
        } else {
            this.device_family = str8;
        }
        if ((i & 512) == 0) {
            this.pairing_status = null;
        } else {
            this.pairing_status = str9;
        }
        if ((i & 1024) == 0) {
            this.commands_v2 = null;
        } else {
            this.commands_v2 = jsonElement2;
        }
        if ((i & 2048) == 0) {
            this.metadata = null;
        } else {
            this.metadata = jsonElement3;
        }
    }
}
