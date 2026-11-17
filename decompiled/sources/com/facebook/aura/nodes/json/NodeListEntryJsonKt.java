package com.facebook.aura.nodes.json;

import X.AnonymousClass002;
import X.BFI;
import X.C0881AGi;
import X.C10571Hud;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.C9oY;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.nodes.HatchNodeClientKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class NodeListEntryJsonKt {
    public static final List<NodeListEntry> parseNodeListEntries(JsonObject jsonObject) {
        C7384Etj.A0Y(jsonObject, 0);
        List<NodeListEntry> nodeListEntriesOrNull = parseNodeListEntriesOrNull(jsonObject);
        return nodeListEntriesOrNull == null ? C0881AGi.A00 : nodeListEntriesOrNull;
    }

    public static final List<NodeListEntry> parseNodeListEntriesOrNull(JsonObject jsonObject) {
        Object objA0s;
        C7384Etj.A0Y(jsonObject, 0);
        JsonArray jsonArrayExtractNodeArray = extractNodeArray(jsonObject);
        if (jsonArrayExtractNodeArray == null) {
            return null;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<JsonElement> it = jsonArrayExtractNodeArray.iterator();
        while (it.hasNext()) {
            JsonElement next = it.next();
            if (!(next instanceof JsonObject)) {
                next = null;
            }
            if (next != null) {
                arrayListA0h.add(next);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            try {
                objA0s = ((NodeListEntryJson) HatchJsonKt.HatchJson.A01(NodeListEntryJson$$serializer.INSTANCE, C60Q.A11(it2))).toDomain();
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            if (objA0s != null) {
                arrayListA0h2.add(objA0s);
            }
        }
        return arrayListA0h2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r1.equals("online") != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Boolean asOnlineBooleanOrNull(kotlinx.serialization.json.JsonElement r3) {
        /*
            boolean r0 = r3 instanceof kotlinx.serialization.json.JsonPrimitive
            r2 = 0
            if (r0 == 0) goto L26
            kotlinx.serialization.json.JsonPrimitive r3 = (kotlinx.serialization.json.JsonPrimitive) r3
            if (r3 == 0) goto L26
            java.lang.Boolean r0 = X.C9oY.A01(r3)
            if (r0 != 0) goto L5c
            java.lang.String r0 = X.C9oY.A04(r3)
            if (r0 == 0) goto L26
            java.lang.String r0 = X.AnonymousClass002.A0l(r0)
            if (r0 == 0) goto L26
            java.lang.String r1 = X.AnonymousClass001.A0u(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1548612125: goto L27;
                case -1381388741: goto L2a;
                case -1012222381: goto L45;
                case -579210487: goto L2d;
                case 48: goto L30;
                case 49: goto L33;
                case 3521: goto L36;
                case 119527: goto L39;
                case 3569038: goto L3c;
                case 97196323: goto L4f;
                default: goto L26;
            }
        L26:
            return r2
        L27:
            java.lang.String r0 = "offline"
            goto L51
        L2a:
            java.lang.String r0 = "disconnected"
            goto L51
        L2d:
            java.lang.String r0 = "connected"
            goto L3e
        L30:
            java.lang.String r0 = "0"
            goto L51
        L33:
            java.lang.String r0 = "1"
            goto L3e
        L36:
            java.lang.String r0 = "no"
            goto L51
        L39:
            java.lang.String r0 = "yes"
            goto L3e
        L3c:
            java.lang.String r0 = "true"
        L3e:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4d
            return r2
        L45:
            java.lang.String r0 = "online"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L26
        L4d:
            r0 = 1
            goto L58
        L4f:
            java.lang.String r0 = "false"
        L51:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L26
            r0 = 0
        L58:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.json.NodeListEntryJsonKt.asOnlineBooleanOrNull(kotlinx.serialization.json.JsonElement):java.lang.Boolean");
    }

    public static final JsonArray extractNodeArray(JsonObject jsonObject) {
        JsonObject jsonObject2;
        JsonArray jsonArray;
        JsonArray jsonArray2;
        JsonArray jsonArray3;
        JsonArray jsonArray4;
        Object obj = jsonObject.get("payload");
        if (!(obj instanceof JsonObject)) {
            obj = null;
        }
        JsonObject jsonObject3 = (JsonObject) obj;
        Object obj2 = jsonObject.get("result");
        if (!(obj2 instanceof JsonObject)) {
            obj2 = null;
        }
        for (JsonObject jsonObject4 : BFI.A0F(new JsonObject[]{jsonObject, jsonObject3, (JsonObject) obj2})) {
            Object obj3 = jsonObject4.get("devices");
            if ((obj3 instanceof JsonArray) && (jsonArray4 = (JsonArray) obj3) != null) {
                return jsonArray4;
            }
            Object obj4 = jsonObject4.get(HatchNodeClientKt.REGISTER_SURFACE);
            if ((obj4 instanceof JsonArray) && (jsonArray3 = (JsonArray) obj4) != null) {
                return jsonArray3;
            }
        }
        Object obj5 = jsonObject.get("result");
        if ((obj5 instanceof JsonArray) && (jsonArray2 = (JsonArray) obj5) != null) {
            return jsonArray2;
        }
        Object obj6 = jsonObject.get("payload");
        if ((obj6 instanceof JsonObject) && (jsonObject2 = (JsonObject) obj6) != null) {
            Object obj7 = jsonObject2.get("result");
            if ((obj7 instanceof JsonArray) && (jsonArray = (JsonArray) obj7) != null) {
                return jsonArray;
            }
        }
        return null;
    }

    public static final String networkSsidOrNull(JsonElement jsonElement) {
        JsonObject jsonObject;
        JsonPrimitive jsonPrimitive;
        String strA04;
        String strA0l;
        if ((jsonElement instanceof JsonObject) && (jsonObject = (JsonObject) jsonElement) != null) {
            Object obj = jsonObject.get("network_ssid");
            if ((obj instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj) != null && (strA04 = C9oY.A04(jsonPrimitive)) != null && (strA0l = AnonymousClass002.A0l(strA04)) != null && strA0l.length() != 0) {
                return strA0l;
            }
        }
        return null;
    }
}
