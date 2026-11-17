package org.webrtc.org.jni_zero;

import X.AnonymousClass002;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class CommonApis {
    public static Map<Object, Object> arrayToMap(Object[] objArr) {
        int length = objArr.length;
        HashMap map = new HashMap(length / 2);
        for (int i = 0; i < length; i += 2) {
            map.put(objArr[i], objArr[i + 1]);
        }
        return map;
    }

    public static Object[] mapToArray(Map<Object, Object> map) {
        Object[] objArr = new Object[map.size() * 2];
        Iterator itA0n = AnonymousClass002.A0n(map);
        int i = 0;
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            int i2 = i + 1;
            objArr[i] = entry.getKey();
            i += 2;
            objArr[i2] = entry.getValue();
        }
        return objArr;
    }
}
