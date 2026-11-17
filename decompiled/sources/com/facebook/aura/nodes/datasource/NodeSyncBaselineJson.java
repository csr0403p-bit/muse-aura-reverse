package com.facebook.aura.nodes.datasource;

import X.AGH;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.Map;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;

@Serializable
/* loaded from: classes2.dex */
public final class NodeSyncBaselineJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String fingerprint;
    public final Map<String, String> hashes;
    public final Map<String, JsonObject> payloads;

    public final class Companion {
        public final C9hr<NodeSyncBaselineJson> serializer() {
            return NodeSyncBaselineJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1V(num, null, AbstractC5321DgF.A02(num, NodeSyncBaselineJson$Companion$$childSerializers$1.INSTANCE), NodeSyncBaselineJson$Companion$$childSerializers$2.INSTANCE);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NodeSyncBaselineJson) {
                NodeSyncBaselineJson nodeSyncBaselineJson = (NodeSyncBaselineJson) obj;
                if (!C7384Etj.areEqual(this.fingerprint, nodeSyncBaselineJson.fingerprint) || !C7384Etj.areEqual(this.hashes, nodeSyncBaselineJson.hashes) || !C7384Etj.areEqual(this.payloads, nodeSyncBaselineJson.payloads)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NodeSyncBaselineJson copy$default(NodeSyncBaselineJson nodeSyncBaselineJson, String str, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nodeSyncBaselineJson.fingerprint;
        }
        if ((i & 2) != 0) {
            map = nodeSyncBaselineJson.hashes;
        }
        if ((i & 4) != 0) {
            map2 = nodeSyncBaselineJson.payloads;
        }
        return nodeSyncBaselineJson.copy(str, map, map2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_datasource_datasource(NodeSyncBaselineJson nodeSyncBaselineJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(nodeSyncBaselineJson.fingerprint)) {
            c9j5.AAV(nodeSyncBaselineJson.fingerprint, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1M(nodeSyncBaselineJson.hashes)) {
            c9j5.AAQ(nodeSyncBaselineJson.hashes, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || !C3cG.A1M(nodeSyncBaselineJson.payloads)) {
            c9j5.AAQ(nodeSyncBaselineJson.payloads, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.fingerprint;
    }

    public final Map<String, String> component2() {
        return this.hashes;
    }

    public final Map<String, JsonObject> component3() {
        return this.payloads;
    }

    public final String getFingerprint() {
        return this.fingerprint;
    }

    public final Map<String, String> getHashes() {
        return this.hashes;
    }

    public final Map<String, JsonObject> getPayloads() {
        return this.payloads;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.payloads, AnonymousClass005.A0F(this.hashes, AnonymousClass001.A0G(this.fingerprint)));
    }

    public NodeSyncBaselineJson(String str, Map<String, String> map, Map<String, JsonObject> map2) {
        AnonymousClass005.A0x(str, map, map2);
        this.fingerprint = str;
        this.hashes = map;
        this.payloads = map2;
    }

    public final NodeSyncBaselineJson copy(String str, Map<String, String> map, Map<String, JsonObject> map2) {
        AnonymousClass005.A0x(str, map, map2);
        return new NodeSyncBaselineJson(str, map, map2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NodeSyncBaselineJson(int i, String str, Map map, Map map2, C2hx c2hx) {
        this.fingerprint = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.hashes = AGH.A0E();
        } else {
            this.hashes = map;
        }
        if ((i & 4) == 0) {
            this.payloads = AGH.A0E();
        } else {
            this.payloads = map2;
        }
    }

    public /* synthetic */ NodeSyncBaselineJson(String str, Map map, Map map2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), C3cH.A0o(map, i & 2), C3cH.A0o(map2, i & 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NodeSyncBaselineJson() {
        this((String) null, (Map) (0 == true ? 1 : 0), (Map) (0 == true ? 1 : 0), 7, (C06H) (0 == true ? 1 : 0));
    }
}
