package com.facebook.nativeutil;

import X.AbstractC7606F5t;
import X.AnonymousClass001;
import X.BV5;
import X.BV6;
import X.C01;
import X.C3463COl;
import X.C3cG;
import X.C7384Etj;
import X.C8j3;
import com.facebook.jni.HybridData;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class NativeMap extends AbstractMap<String, Object> {
    public static final NativeMap $redex_init_class = null;
    public HybridData mHybridData;

    public NativeMap(Map<String, ? extends Object> map) {
        C7384Etj.A0Y(map, 0);
        this.mHybridData = initHybridData();
        putAll(map);
    }

    public static final native HybridData initHybridData();

    private final native void putBoolean(String str, boolean z);

    private final native void putDouble(String str, double d);

    private final native void putInt(String str, long j);

    private final native void putNativeList(String str, NativeList nativeList);

    private final native void putNativeMap(String str, NativeMap nativeMap);

    private final native void putNull(String str);

    private final native void putString(String str, String str2);

    public final native Map<String, Object> consumeMap();

    static {
        C3463COl.loadLibrary("nativeutil-jni");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.containsKey(obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Object>> entrySet() {
        throw C8j3.A18(AbstractC7606F5t.A00(48));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.get(obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return (obj == null || (obj instanceof String)) ? super.getOrDefault(obj, obj2) : obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj;
        Object objA00 = C01.A00(obj2);
        if (objA00 == null) {
            putNull(str);
            return obj2;
        }
        if (objA00 instanceof Boolean) {
            putBoolean(str, AnonymousClass001.A1X(objA00));
            return obj2;
        }
        if ((objA00 instanceof Integer) || (objA00 instanceof Long) || (objA00 instanceof Short)) {
            putInt(str, C3cG.A05(objA00));
            return obj2;
        }
        if (objA00 instanceof Number) {
            putDouble(str, BV6.A00(objA00));
            return obj2;
        }
        if (objA00 instanceof String) {
            putString(str, (String) objA00);
            return obj2;
        }
        if (objA00 instanceof NativeMap) {
            putNativeMap(str, (NativeMap) objA00);
            return obj2;
        }
        if (!(objA00 instanceof NativeList)) {
            throw BV5.A0O(objA00.getClass(), "Could not convert ");
        }
        putNativeList(str, (NativeList) objA00);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.remove(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return super.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return super.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return super.values();
    }

    public NativeMap() {
        this.mHybridData = initHybridData();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj != null && !(obj instanceof String)) {
            return false;
        }
        return super.remove(obj, obj2);
    }
}
