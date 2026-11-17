package com.facebook.aura.nodes.core;

import X.AGH;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2nw;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7pd;
import X.C7qW;
import X.C9jH;
import X.C9oY;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public final class NodeCommandSpec extends C06G {
    public static final Companion Companion = new Companion();
    public final NodeDatatype datatype;
    public final String description;
    public final Map<String, NodeArgSpec> optional;
    public final List<String> permissionRequired;
    public final Map<String, NodeArgSpec> required;
    public final String resultDescription;
    public final long timeoutMs;

    public final class Companion {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [X.AGi] */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
        public final NodeCommandSpec fromJson(JsonObject jsonObject) {
            ?? A0h;
            JsonPrimitive jsonPrimitive;
            String strA04;
            JsonArray jsonArray;
            JsonPrimitive jsonPrimitive2;
            String strA042;
            JsonPrimitive jsonPrimitive3;
            C7384Etj.A0Y(jsonObject, 0);
            Object obj = jsonObject.get(HatchWebPageParserKt.DESCRIPTION);
            NodeDatatype nodeDatatypeFromWire = null;
            String strA043 = (!(obj instanceof JsonPrimitive) || (jsonPrimitive3 = (JsonPrimitive) obj) == null) ? null : C9oY.A04(jsonPrimitive3);
            Object obj2 = jsonObject.get("required");
            Map<String, NodeArgSpec> args = parseArgs(obj2 instanceof JsonObject ? (JsonObject) obj2 : null);
            Object obj3 = jsonObject.get(LinkEncryptedPairingKt.LINK_WIFI_OPTIONAL);
            Map<String, NodeArgSpec> args2 = parseArgs(obj3 instanceof JsonObject ? (JsonObject) obj3 : null);
            Object obj4 = jsonObject.get("permission_required");
            if (!(obj4 instanceof JsonArray) || (jsonArray = (JsonArray) obj4) == null) {
                A0h = C0881AGi.A00;
            } else {
                A0h = C3cG.A0h();
                Iterator<JsonElement> it = jsonArray.iterator();
                while (it.hasNext()) {
                    JsonElement jsonElementA11 = C60Q.A11(it);
                    if ((jsonElementA11 instanceof JsonPrimitive) && (jsonPrimitive2 = (JsonPrimitive) jsonElementA11) != null && (strA042 = C9oY.A04(jsonPrimitive2)) != null) {
                        A0h.add(strA042);
                    }
                }
            }
            Object obj5 = jsonObject.get("datatype");
            if ((obj5 instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj5) != null && (strA04 = C9oY.A04(jsonPrimitive)) != null) {
                nodeDatatypeFromWire = NodeDatatype.Companion.fromWire(strA04);
            }
            return new NodeCommandSpec(strA043, args, args2, A0h, nodeDatatypeFromWire, null, 0L);
        }

        private final Map<String, NodeArgSpec> parseArgs(JsonObject jsonObject) {
            JsonObject jsonObject2;
            NodeArgType nodeArgTypeFromJson;
            JsonPrimitive jsonPrimitive;
            JsonPrimitive jsonPrimitive2;
            String strA04;
            if (jsonObject == null) {
                return AGH.A0E();
            }
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            Iterator<Map.Entry<String, JsonElement>> it = jsonObject.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(it);
                Object key = entryA0l.getKey();
                JsonElement jsonElement = (JsonElement) entryA0l.getValue();
                String strA042 = null;
                if ((jsonElement instanceof JsonObject) && (jsonObject2 = (JsonObject) jsonElement) != null) {
                    Object obj = jsonObject2.get("type");
                    if (!(obj instanceof JsonPrimitive) || (jsonPrimitive2 = (JsonPrimitive) obj) == null || (strA04 = C9oY.A04(jsonPrimitive2)) == null || (nodeArgTypeFromJson = NodeArgType.Companion.fromJson(strA04)) == null) {
                        nodeArgTypeFromJson = NodeArgType.STRING;
                    }
                    Object obj2 = jsonObject2.get(HatchWebPageParserKt.DESCRIPTION);
                    if ((obj2 instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj2) != null) {
                        strA042 = C9oY.A04(jsonPrimitive);
                    }
                    linkedHashMapA0j.put(key, C60O.A09(nodeArgTypeFromJson, strA042));
                }
            }
            return linkedHashMapA0j;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final NodeCommandSpec copy(String str, Map<String, NodeArgSpec> map, Map<String, NodeArgSpec> map2, List<String> list, NodeDatatype nodeDatatype, String str2, long j) {
        AnonymousClass005.A11(map, map2, list, 1);
        return new NodeCommandSpec(str, map, map2, list, nodeDatatype, str2, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NodeCommandSpec) {
                NodeCommandSpec nodeCommandSpec = (NodeCommandSpec) obj;
                if (!C7384Etj.areEqual(this.description, nodeCommandSpec.description) || !C7384Etj.areEqual(this.required, nodeCommandSpec.required) || !C7384Etj.areEqual(this.optional, nodeCommandSpec.optional) || !C7384Etj.areEqual(this.permissionRequired, nodeCommandSpec.permissionRequired) || this.datatype != nodeCommandSpec.datatype || !C7384Etj.areEqual(this.resultDescription, nodeCommandSpec.resultDescription) || this.timeoutMs != nodeCommandSpec.timeoutMs) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ NodeCommandSpec(String str, Map map, Map map2, List list, NodeDatatype nodeDatatype, String str2, long j, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? AGH.A0E() : map, (i & 4) != 0 ? AGH.A0E() : map2, (i & 8) != 0 ? C0881AGi.A00 : list, (i & 16) != 0 ? null : nodeDatatype, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? 0L : j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NodeCommandSpec copy$default(NodeCommandSpec nodeCommandSpec, String str, Map map, Map map2, List list, NodeDatatype nodeDatatype, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nodeCommandSpec.description;
        }
        if ((i & 2) != 0) {
            map = nodeCommandSpec.required;
        }
        if ((i & 4) != 0) {
            map2 = nodeCommandSpec.optional;
        }
        if ((i & 8) != 0) {
            list = nodeCommandSpec.permissionRequired;
        }
        if ((i & 16) != 0) {
            nodeDatatype = nodeCommandSpec.datatype;
        }
        if ((i & 32) != 0) {
            str2 = nodeCommandSpec.resultDescription;
        }
        if ((i & 64) != 0) {
            j = nodeCommandSpec.timeoutMs;
        }
        return nodeCommandSpec.copy(str, map, map2, list, nodeDatatype, str2, j);
    }

    public final String component1() {
        return this.description;
    }

    public final Map<String, NodeArgSpec> component2() {
        return this.required;
    }

    public final Map<String, NodeArgSpec> component3() {
        return this.optional;
    }

    public final List<String> component4() {
        return this.permissionRequired;
    }

    public final NodeDatatype component5() {
        return this.datatype;
    }

    public final String component6() {
        return this.resultDescription;
    }

    public final long component7() {
        return this.timeoutMs;
    }

    public final NodeDatatype getDatatype() {
        return this.datatype;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Map<String, NodeArgSpec> getOptional() {
        return this.optional;
    }

    public final List<String> getPermissionRequired() {
        return this.permissionRequired;
    }

    public final Map<String, NodeArgSpec> getRequired() {
        return this.required;
    }

    public final String getResultDescription() {
        return this.resultDescription;
    }

    public final long getTimeoutMs() {
        return this.timeoutMs;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.timeoutMs, (((AnonymousClass005.A0F(this.permissionRequired, AnonymousClass005.A0F(this.optional, AnonymousClass005.A0F(this.required, AnonymousClass006.A0G(this.description) * 31))) + AnonymousClass006.A0D(this.datatype)) * 31) + AnonymousClass005.A0H(this.resultDescription)) * 31);
    }

    public final JsonObject toJson() {
        C2nw c2nwA1K = C60O.A1K();
        String str = this.description;
        if (str != null) {
            C7qW.A06(HatchWebPageParserKt.DESCRIPTION, str, c2nwA1K);
        }
        C2nw c2nwA1K2 = C60O.A1K();
        Iterator itA0n = AnonymousClass002.A0n(this.required);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            c2nwA1K2.A01(C60O.A0t(entryA0l), ((NodeArgSpec) entryA0l.getValue()).toJson());
        }
        c2nwA1K.A01("required", c2nwA1K2.A00());
        C2nw c2nwA1K3 = C60O.A1K();
        Iterator itA0n2 = AnonymousClass002.A0n(this.optional);
        while (itA0n2.hasNext()) {
            Map.Entry entryA0l2 = C3cH.A0l(itA0n2);
            c2nwA1K3.A01(C60O.A0t(entryA0l2), ((NodeArgSpec) entryA0l2.getValue()).toJson());
        }
        c2nwA1K.A01(LinkEncryptedPairingKt.LINK_WIFI_OPTIONAL, c2nwA1K3.A00());
        if (!this.permissionRequired.isEmpty()) {
            C7pd c7pdA01 = C7pd.A01();
            Iterator<String> it = this.permissionRequired.iterator();
            while (it.hasNext()) {
                C7pd.A03(it, c7pdA01);
            }
            c2nwA1K.A01("permission_required", C7pd.A00(c7pdA01));
        }
        NodeDatatype nodeDatatype = this.datatype;
        if (nodeDatatype != null) {
            C7qW.A06("datatype", nodeDatatype.getWireValue(), c2nwA1K);
        }
        return c2nwA1K.A00();
    }

    public String toString() {
        return super.toString();
    }

    public NodeCommandSpec(String str, Map<String, NodeArgSpec> map, Map<String, NodeArgSpec> map2, List<String> list, NodeDatatype nodeDatatype, String str2, long j) {
        C7384Etj.A0Y(map, 1);
        C7384Etj.A0Y(map2, 2);
        C7384Etj.A0Y(list, 3);
        this.description = str;
        this.required = map;
        this.optional = map2;
        this.permissionRequired = list;
        this.datatype = nodeDatatype;
        this.resultDescription = str2;
        this.timeoutMs = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NodeCommandSpec() {
        C9jH c9jHA0E = AGH.A0E();
        this(null, c9jHA0E, c9jHA0E, C0881AGi.A00, null, null, 0L);
    }
}
