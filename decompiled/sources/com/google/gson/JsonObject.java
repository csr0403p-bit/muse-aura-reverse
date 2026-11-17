package com.google.gson;

import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C6714EWu;
import X.ERD;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class JsonObject extends JsonElement {
    public final ERD<String, JsonElement> members = new ERD<>(false);

    public void add(String str, JsonElement jsonElement) {
        ERD<String, JsonElement> erd = this.members;
        if (jsonElement == null) {
            jsonElement = C6714EWu.A00;
        }
        erd.put(str, jsonElement);
    }

    public void addProperty(String str, Boolean bool) {
        add(str, bool == null ? C6714EWu.A00 : new JsonPrimitive(bool));
    }

    public Map<String, JsonElement> asMap() {
        return this.members;
    }

    @Override // com.google.gson.JsonElement
    public JsonObject deepCopy() {
        JsonObject jsonObject = new JsonObject();
        Iterator itA0i = C3cG.A0i(this.members);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            jsonObject.add(C60O.A0t(entryA0l), ((JsonElement) entryA0l.getValue()).deepCopy());
        }
        return jsonObject;
    }

    public Set<Map.Entry<String, JsonElement>> entrySet() {
        return this.members.entrySet();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JsonObject) && ((JsonObject) obj).members.equals(this.members);
        }
        return true;
    }

    public JsonElement get(String str) {
        return this.members.get(str);
    }

    public JsonArray getAsJsonArray(String str) {
        return (JsonArray) this.members.get(str);
    }

    public JsonObject getAsJsonObject(String str) {
        return (JsonObject) this.members.get(str);
    }

    public JsonPrimitive getAsJsonPrimitive(String str) {
        return (JsonPrimitive) this.members.get(str);
    }

    public boolean has(String str) {
        return this.members.containsKey(str);
    }

    public int hashCode() {
        return this.members.hashCode();
    }

    public boolean isEmpty() {
        return this.members.isEmpty();
    }

    public Set<String> keySet() {
        return this.members.keySet();
    }

    public JsonElement remove(String str) {
        return this.members.remove(str);
    }

    public int size() {
        return this.members.size();
    }

    public void addProperty(String str, Character ch) {
        JsonElement jsonPrimitive;
        if (ch == null) {
            jsonPrimitive = C6714EWu.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(ch);
        }
        add(str, jsonPrimitive);
    }

    public void addProperty(String str, Number number) {
        JsonElement jsonPrimitive;
        if (number == null) {
            jsonPrimitive = C6714EWu.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(number);
        }
        add(str, jsonPrimitive);
    }

    public void addProperty(String str, String str2) {
        JsonElement jsonPrimitive;
        if (str2 == null) {
            jsonPrimitive = C6714EWu.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(str2);
        }
        add(str, jsonPrimitive);
    }
}
