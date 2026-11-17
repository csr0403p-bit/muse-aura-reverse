package com.facebook.aura.composer.dictation;

import X.AGH;
import X.AnonymousClass006;
import X.C9iZ;
import X.C9oY;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes.dex */
public abstract class DictationAttributionKt {
    public static final String THREAD_IS_DICTATION_USED_KEY = "thread_is_dictation_used";

    public static final Map<String, Object> withDictationAttribution(Map<String, ? extends Object> map, boolean z) {
        Map mapA0E;
        if (map == null) {
            map = AGH.A0E();
        }
        Object obj = map.get("metadata");
        if (!(obj instanceof JsonObject) || (mapA0E = (JsonObject) obj) == null) {
            mapA0E = AGH.A0E();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapA0E);
        Boolean boolValueOf = Boolean.valueOf(z);
        C9iZ c9iZ = C9oY.A00;
        linkedHashMap.put(THREAD_IS_DICTATION_USED_KEY, new JsonLiteral(boolValueOf, null, false));
        return AnonymousClass006.A11("metadata", new JsonObject(linkedHashMap), map);
    }
}
