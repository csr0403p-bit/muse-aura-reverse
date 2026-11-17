package X;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class C9i {
    public static final C9i A00 = new C9i();

    public final ArrayList<Object> A02(JSONArray jSONArray) throws JSONException {
        C7384Etj.A0Y(jSONArray, 0);
        int length = jSONArray.length();
        ArrayList<Object> arrayListA11 = C60O.A11(length);
        for (int i = 0; i < length; i++) {
            Object objValueOf = jSONArray.get(i);
            if (objValueOf instanceof String) {
                arrayListA11.add(objValueOf);
            } else {
                if (objValueOf instanceof JSONObject) {
                    objValueOf = A03((JSONObject) objValueOf);
                } else if (objValueOf instanceof JSONArray) {
                    objValueOf = A02((JSONArray) objValueOf);
                } else if (objValueOf instanceof Integer) {
                    objValueOf = Integer.valueOf(AnonymousClass001.A0F(objValueOf));
                } else if (objValueOf instanceof Double) {
                    objValueOf = HoH.A00(BV6.A00(objValueOf));
                } else if (objValueOf instanceof Float) {
                    objValueOf = HoH.A00(AnonymousClass001.A02(objValueOf));
                } else if (!(objValueOf instanceof Boolean)) {
                    if (objValueOf instanceof Long) {
                        objValueOf = Long.valueOf(C3cG.A05(objValueOf));
                    }
                }
                arrayListA11.add(objValueOf);
            }
        }
        return arrayListA11;
    }

    public final HashMap<Object, Object> A03(JSONObject jSONObject) throws JSONException {
        Object objA03;
        C7384Etj.A0Y(jSONObject, 0);
        HashMap<Object, Object> mapA0u = BV4.A0u();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String strA0j = AnonymousClass005.A0j(itKeys);
            Object obj = jSONObject.get(strA0j);
            if (!(obj instanceof String)) {
                if (obj instanceof JSONObject) {
                    objA03 = A03((JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    objA03 = A02((JSONArray) obj);
                } else if (obj instanceof Integer) {
                    objA03 = Integer.valueOf(AnonymousClass001.A0F(obj));
                } else if (obj instanceof Double) {
                    objA03 = HoH.A00(BV6.A00(obj));
                } else if (obj instanceof Float) {
                    objA03 = HoH.A00(AnonymousClass001.A02(obj));
                } else if (!(obj instanceof Boolean)) {
                    if (obj instanceof Long) {
                        objA03 = Long.valueOf(C3cG.A05(obj));
                    }
                }
                mapA0u.put(strA0j, objA03);
            }
            mapA0u.put(strA0j, obj);
        }
        return mapA0u;
    }

    private final void A00(JsonWriter jsonWriter, Object obj, boolean z, boolean z2) throws IOException {
        String string;
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            boolean zA1X = AnonymousClass001.A1X(obj);
            if (z2) {
                jsonWriter.value(zA1X ? 1L : 0L);
                return;
            } else {
                jsonWriter.value(zA1X);
                return;
            }
        }
        if (obj instanceof String) {
            string = (String) obj;
        } else {
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                if (z) {
                    TreeMap treeMap = new TreeMap();
                    Iterator itA0n = AnonymousClass002.A0n((Map) obj);
                    while (itA0n.hasNext()) {
                        Map.Entry entryA0l = C3cH.A0l(itA0n);
                        Object key = entryA0l.getKey();
                        treeMap.put(String.valueOf(key), entryA0l.getValue());
                    }
                    Iterator itA0i = C3cG.A0i(treeMap);
                    while (itA0i.hasNext()) {
                        Map.Entry entryA0l2 = C3cH.A0l(itA0i);
                        String strA0t = C60O.A0t(entryA0l2);
                        Object value = entryA0l2.getValue();
                        jsonWriter.name(strA0t);
                        A00(jsonWriter, value, z, z2);
                    }
                } else {
                    Iterator itA0n2 = AnonymousClass002.A0n((Map) obj);
                    while (itA0n2.hasNext()) {
                        Map.Entry entryA0l3 = C3cH.A0l(itA0n2);
                        Object key2 = entryA0l3.getKey();
                        Object value2 = entryA0l3.getValue();
                        jsonWriter.name(String.valueOf(key2));
                        A00(jsonWriter, value2, z, z2);
                    }
                }
                jsonWriter.endObject();
                return;
            }
            if (obj instanceof List) {
                jsonWriter.beginArray();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    A00(jsonWriter, it.next(), z, z2);
                }
                jsonWriter.endArray();
                return;
            }
            string = obj.toString();
        }
        jsonWriter.value(string);
    }

    public final String A01(Object obj, boolean z, boolean z2) throws IOException {
        if (!(obj instanceof List) && !(obj instanceof Map)) {
            return obj == null ? "" : obj.toString();
        }
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            A00(jsonWriter, obj, z, z2);
            jsonWriter.close();
            return C60O.A0o(stringWriter);
        } catch (IOException e) {
            return AnonymousClass007.A0a("Exception in serialization ", e);
        }
    }
}
