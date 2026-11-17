package X;

import android.text.TextUtils;
import com.meta.mftpaymentssecurity.ptt.interfaces.Sensitive;
import com.meta.mftpaymentssecurity.ptt.interfaces.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.EWi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6704EWi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static Object A00(Object obj, Map<String, Object> map, boolean z) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        Object objA0u;
        if (obj == null || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Collection) {
            objA0u = C3cG.A0h();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                objA0u.add(A00(it.next(), map, z));
            }
        } else {
            if (!(obj instanceof Map)) {
                if (obj instanceof EWG) {
                    return processPttBloksPayload((EWG) obj, map, z);
                }
                Class<?> cls = obj.getClass();
                HashMap mapA0u = BV4.A0u();
                for (Field field : cls.getDeclaredFields()) {
                    processFieldPayload(field, obj, mapA0u, map, z);
                }
                return mapA0u;
            }
            objA0u = BV4.A0u();
            Iterator itA0n = AnonymousClass002.A0n((Map) obj);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                objA0u.put(entryA0l.getKey(), A00(entryA0l.getValue(), map, z));
            }
        }
        return objA0u;
    }

    public static C7418EvO<byte[], byte[]> createPayloads(Object obj) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        byte[] bArrA1a;
        byte[] bArrA1a2;
        obj.getClass();
        EYF eyf = new EYF();
        eyf.A06 = false;
        EYC eycA00 = eyf.A00();
        HashMap mapA0u = BV4.A0u();
        Object objA00 = A00(obj, mapA0u, false);
        String strA03 = objA00 == null ? eycA00.A03(C6714EWu.A00) : eycA00.A04(objA00, objA00.getClass());
        if (mapA0u.isEmpty()) {
            bArrA1a = BV7.A1a(strA03);
            bArrA1a2 = null;
        } else {
            String strA04 = eycA00.A04(mapA0u, mapA0u.getClass());
            bArrA1a = BV7.A1a(strA03);
            bArrA1a2 = BV7.A1a(strA04);
        }
        return new C7418EvO<>(bArrA1a, bArrA1a2);
    }

    public static void processFieldPayload(Field field, Object obj, Map<String, Object> map, Map<String, Object> map2, boolean z) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        Object objA00;
        SerializedName serializedName;
        if (Modifier.isStatic(field.getModifiers()) || field.isSynthetic()) {
            return;
        }
        field.setAccessible(true);
        Object obj2 = field.get(obj);
        if (obj2 != null) {
            String name = (!field.isAnnotationPresent(SerializedName.class) || (serializedName = (SerializedName) field.getAnnotation(SerializedName.class)) == null || TextUtils.isEmpty(serializedName.value())) ? field.getName() : serializedName.value();
            if (z || !field.isAnnotationPresent(Sensitive.class) || (name.equalsIgnoreCase("csc") && (obj2 instanceof String) && ((String) obj2).isEmpty())) {
                objA00 = A00(obj2, map2, z);
            } else {
                map2.put(name, A00(obj2, map2, true));
                objA00 = "$e2ee";
            }
            map.put(name, objA00);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map<String, Object> processPttBloksPayload(EWG ewg, Map<String, Object> map, boolean z) {
        HashMap mapA0u = BV4.A0u();
        Map mapUnmodifiableMap = Collections.unmodifiableMap(ewg.A00);
        Iterator itA0n = AnonymousClass002.A0n(mapUnmodifiableMap);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            mapA0u.put(entryA0l.getKey(), A00(entryA0l.getValue(), map, z));
        }
        for (Object obj : Collections.unmodifiableSet(ewg.A01)) {
            if (mapUnmodifiableMap.containsKey(obj)) {
                map.put(obj, A00(mapUnmodifiableMap.get(obj), map, true));
                mapA0u.put(obj, "$e2ee");
            }
        }
        return mapA0u;
    }
}
