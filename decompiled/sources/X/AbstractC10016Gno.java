package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Gno, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10016Gno {
    public static AbstractC10130Gpv A00(Class cls) {
        if (cls == C9516GMj.class) {
            return new C9976Gmq();
        }
        if (!Collection.class.isAssignableFrom(cls)) {
            if (!Map.class.isAssignableFrom(cls)) {
                return null;
            }
            if (cls == LinkedHashMap.class) {
                return C10139Gq5.A00;
            }
            if (cls == HashMap.class) {
                return C10138Gq3.A00;
            }
            if (cls == ConcurrentHashMap.class) {
                return new C10137Gq2();
            }
            if (cls == TreeMap.class) {
                return new C10135Gq0();
            }
            Map map = Collections.EMPTY_MAP;
            if (cls == map.getClass()) {
                return new Gq7(map);
            }
            return null;
        }
        if (cls == ArrayList.class) {
            return C10140Gq6.A00;
        }
        if (cls == HashSet.class) {
            return Gq4.A00;
        }
        if (cls == LinkedList.class) {
            return new C10134Gpz();
        }
        if (cls == TreeSet.class) {
            return new C10136Gq1();
        }
        Set set = Collections.EMPTY_SET;
        if (cls == set.getClass()) {
            return new Gq7(set);
        }
        List list = Collections.EMPTY_LIST;
        if (cls == list.getClass()) {
            return new Gq7(list);
        }
        return null;
    }
}
