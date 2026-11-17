package com.facebook.aura.partners.voice.infra;

import X.AIW;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3cG;
import X.C3cH;
import X.C9jH;
import X.C9oY;
import X.C9tJ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes6.dex */
public abstract class VoiceCallActivityRepositoryKt {
    public static final JsonObject EMPTY_CONFIG = new JsonObject(C9jH.A00);
    public static final double MAX_EXACT_INTEGRAL_DOUBLE = 9.007199254740992E15d;

    /* JADX WARN: Multi-variable type inference failed */
    public static final JsonElement withCanonicalNumbers(JsonElement jsonElement) {
        JsonElement jsonElementA06;
        if (jsonElement instanceof JsonObject) {
            Map map = (Map) jsonElement;
            LinkedHashMap linkedHashMapA0I = AIW.A0I(map);
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                linkedHashMapA0I.put(entryA0l.getKey(), withCanonicalNumbers((JsonElement) entryA0l.getValue()));
            }
            jsonElementA06 = new JsonObject(linkedHashMapA0I);
        } else if (jsonElement instanceof JsonArray) {
            Iterable iterable = (Iterable) jsonElement;
            ArrayList arrayListA0i = AnonymousClass003.A0i(iterable);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(withCanonicalNumbers((JsonElement) it.next()));
            }
            jsonElementA06 = new JsonArray(arrayListA0i);
        } else {
            if (!(jsonElement instanceof JsonPrimitive)) {
                throw C3cG.A0q();
            }
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
            boolean zA01 = jsonPrimitive.A01();
            jsonElementA06 = jsonPrimitive;
            if (!zA01) {
                Long lA03 = C9oY.A03(jsonPrimitive);
                if (lA03 == null) {
                    Double dA0v = C9tJ.A0v(jsonPrimitive.A00());
                    jsonElementA06 = jsonPrimitive;
                    if (dA0v != null) {
                        double dDoubleValue = dA0v.doubleValue();
                        long j = (long) dDoubleValue;
                        jsonElementA06 = jsonPrimitive;
                        if (dDoubleValue == j) {
                            jsonElementA06 = jsonPrimitive;
                            if (Math.abs(dDoubleValue) <= 9.007199254740992E15d) {
                                lA03 = Long.valueOf(j);
                                jsonElementA06 = C9oY.A06(lA03);
                            }
                        }
                    }
                } else {
                    jsonElementA06 = C9oY.A06(lA03);
                }
            }
        }
        return jsonElementA06;
    }
}
