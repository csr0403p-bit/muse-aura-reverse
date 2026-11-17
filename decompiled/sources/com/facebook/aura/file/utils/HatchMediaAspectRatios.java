package com.facebook.aura.file.utils;

import X.C8j4;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class HatchMediaAspectRatios {
    public static final int $stable = 0;
    public static final int MAX_ENTRIES = 128;
    public static final HatchMediaAspectRatios INSTANCE = new HatchMediaAspectRatios();
    public static final HatchMediaAspectRatios$ratios$1 ratios = new LinkedHashMap<String, Float>() { // from class: com.facebook.aura.file.utils.HatchMediaAspectRatios$ratios$1
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof String) {
                return super.containsKey(obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof Float) {
                return super.containsValue(obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Float get(Object obj) {
            if (obj instanceof String) {
                return (Float) super.get(obj);
            }
            return null;
        }

        public final /* bridge */ Float getOrDefault(Object obj, Float f) {
            return !(obj instanceof String) ? f : (Float) super.getOrDefault(obj, (Object) f);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Float remove(Object obj) {
            if (obj instanceof String) {
                return (Float) super.remove(obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<String, Float>> entrySet() {
            return super.entrySet();
        }

        public /* bridge */ Set<Map.Entry<String, Float>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<String> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<Float> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<String> keySet() {
            return super.keySet();
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, Float> entry) {
            return C8j4.A1V(size(), 128);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return super.size();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<Float> values() {
            return super.values();
        }

        public /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public /* bridge */ boolean containsValue(Float f) {
            return super.containsValue((Object) f);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return super.get(obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return super.getOrDefault(obj, obj2);
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (!(obj instanceof String) || !(obj2 instanceof Float)) {
                return false;
            }
            return super.remove(obj, obj2);
        }

        public /* bridge */ Float get(String str) {
            return (Float) super.get((Object) str);
        }

        public /* bridge */ Float getOrDefault(String str, Float f) {
            return (Float) super.getOrDefault((Object) str, (String) f);
        }

        public /* bridge */ boolean remove(String str, Float f) {
            return super.remove((Object) str, (Object) f);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return super.remove(obj);
        }

        public /* bridge */ Float remove(String str) {
            return (Float) super.remove((Object) str);
        }
    };

    public final synchronized Float get(String str) {
        return str == null ? null : ratios.get((Object) str);
    }

    public final synchronized void put(String str, float f) {
        if (str != null) {
            if (Math.abs(f) <= Float.MAX_VALUE && f > 0.0f) {
                ratios.put(str, Float.valueOf(f));
            }
        }
    }
}
