package X;

import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: X.CMw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3428CMw {
    public static final HashMap<String, Class<? extends Collection>> A00;
    public static final HashMap<String, Class<? extends Map>> A01;

    static {
        HashMap<String, Class<? extends Collection>> mapA0u = BV4.A0u();
        A00(Collection.class, ArrayList.class, mapA0u);
        A00(List.class, ArrayList.class, mapA0u);
        A00(Set.class, HashSet.class, mapA0u);
        mapA0u.put(SortedSet.class.getName(), TreeSet.class);
        mapA0u.put(Queue.class.getName(), LinkedList.class);
        A00(AbstractList.class, ArrayList.class, mapA0u);
        A00(AbstractSet.class, HashSet.class, mapA0u);
        A00(Deque.class, LinkedList.class, mapA0u);
        A00(NavigableSet.class, TreeSet.class, mapA0u);
        mapA0u.put("java.util.SequencedCollection", ArrayList.class);
        mapA0u.put("java.util.SequencedSet", LinkedHashSet.class);
        A00 = mapA0u;
        HashMap<String, Class<? extends Map>> mapA0u2 = BV4.A0u();
        A00(Map.class, LinkedHashMap.class, mapA0u2);
        A00(AbstractMap.class, LinkedHashMap.class, mapA0u2);
        mapA0u2.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
        mapA0u2.put(SortedMap.class.getName(), TreeMap.class);
        A00(NavigableMap.class, TreeMap.class, mapA0u2);
        mapA0u2.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
        mapA0u2.put("java.util.SequencedMap", LinkedHashMap.class);
        A01 = mapA0u2;
    }

    public static void A00(Class cls, Object obj, AbstractMap abstractMap) {
        abstractMap.put(cls.getName(), obj);
    }
}
