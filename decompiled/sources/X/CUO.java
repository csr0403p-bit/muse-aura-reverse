package X;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.DependencyCycleException;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class CUO extends CUL {
    public static final CUK<Set<Object>> A06 = new CUK() { // from class: X.CUX
        @Override // X.CUK
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };
    public final List<CUK<ComponentRegistrar>> A00;
    public final Map<C3565CUi<?>, CUK<?>> A01 = BV4.A0u();
    public final Map<Class<?>, CUK<?>> A02 = BV4.A0u();
    public final Map<Class<?>, CUM<?>> A03 = BV4.A0u();
    public final AtomicReference<Boolean> A04 = BV4.A15();
    public final CTM A05;

    @Override // X.CUL
    public final synchronized <T> CUK<T> A04(Class<T> cls) {
        if (cls == null) {
            throw BV4.A0a("Null interface requested.");
        }
        return (CUK) this.A02.get(cls);
    }

    @Override // X.CUL
    public final synchronized <T> CUK<Set<T>> A05(Class<T> cls) {
        CUM<?> cum;
        cum = this.A03.get(cls);
        if (cum == null) {
            cum = (CUK<Set<T>>) A06;
        }
        return cum;
    }

    public final void A06(boolean z) {
        HashMap mapA0w;
        if (Bs8.A00(null, Boolean.valueOf(z), this.A04)) {
            synchronized (this) {
                mapA0w = BV4.A0w(this.A01);
            }
            A01(mapA0w);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/Executor;Ljava/lang/Iterable<LX/CUK<Lcom/google/firebase/components/ComponentRegistrar;>;>;Ljava/util/Collection<LX/CUi<*>;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public CUO(Iterable iterable, Collection collection, Executor executor) {
        Map map;
        CTM ctm = new CTM(executor);
        this.A05 = ctm;
        ArrayList arrayListA0h = C3cG.A0h();
        arrayListA0h.add(C3565CUi.A00(CTM.class, ctm, CT8.class, CTQ.class));
        C3565CUi.A01(CUO.class, this, arrayListA0h);
        for (Object obj : collection) {
            if (obj != null) {
                arrayListA0h.add(obj);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayListA0h2.add(it.next());
        }
        this.A00 = arrayListA0h2;
        ArrayList arrayListA0h3 = C3cG.A0h();
        synchronized (this) {
            Iterator<CUK<ComponentRegistrar>> it2 = this.A00.iterator();
            while (it2.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it2.next().get();
                    if (componentRegistrar != null) {
                        arrayListA0h.addAll(componentRegistrar.getComponents());
                        it2.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            map = this.A01;
            if (map.isEmpty()) {
                A00(arrayListA0h);
            } else {
                ArrayList arrayListA0t = BV4.A0t(map.keySet());
                arrayListA0t.addAll(arrayListA0h);
                A00(arrayListA0t);
            }
            Iterator it3 = arrayListA0h.iterator();
            while (it3.hasNext()) {
                C3565CUi<?> c3565CUi = (C3565CUi) it3.next();
                map.put(c3565CUi, new CUJ(new C7604F5r(1, c3565CUi, this)));
            }
            ArrayList arrayListA0h4 = C3cG.A0h();
            Iterator it4 = arrayListA0h.iterator();
            while (it4.hasNext()) {
                C3565CUi c3565CUi2 = (C3565CUi) it4.next();
                if (c3565CUi2.A01 == 0) {
                    final CUK<?> cuk = map.get(c3565CUi2);
                    for (Object obj2 : c3565CUi2.A04) {
                        Map<Class<?>, CUK<?>> map2 = this.A02;
                        if (map2.containsKey(obj2)) {
                            final CUU cuu = (CUU) ((CUK) map2.get(obj2));
                            arrayListA0h4.add(new Runnable(cuu, cuk) { // from class: X.CUS
                                public static final String __redex_internal_original_name = "ComponentRuntime$$Lambda$3";
                                public final CUU A00;
                                public final CUK A01;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    CUU cuu2 = this.A00;
                                    CUK<T> cuk2 = this.A01;
                                    if (cuu2.A01 != CUU.A03) {
                                        throw C3cG.A0Q("provide() can be called only once.");
                                    }
                                    synchronized (cuu2) {
                                        cuu2.A00 = null;
                                        cuu2.A01 = cuk2;
                                    }
                                }

                                {
                                    this.A00 = cuu;
                                    this.A01 = cuk;
                                }
                            });
                        } else {
                            map2.put(obj2, cuk);
                        }
                    }
                }
            }
            arrayListA0h3.addAll(arrayListA0h4);
            ArrayList arrayListA0h5 = C3cG.A0h();
            HashMap mapA0u = BV4.A0u();
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entry = (Map.Entry) itA0n.next();
                C3565CUi c3565CUi3 = (C3565CUi) entry.getKey();
                if (c3565CUi3.A01 != 0) {
                    Object value = entry.getValue();
                    for (Object obj3 : c3565CUi3.A04) {
                        if (!mapA0u.containsKey(obj3)) {
                            mapA0u.put(obj3, new HashSet());
                        }
                        ((Set) mapA0u.get(obj3)).add(value);
                    }
                }
            }
            Iterator itA0i = C3cG.A0i(mapA0u);
            while (itA0i.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itA0i.next();
                Map<Class<?>, CUM<?>> map3 = this.A03;
                boolean zContainsKey = map3.containsKey(entry2.getKey());
                Object key = entry2.getKey();
                if (zContainsKey) {
                    final CUM cum = (CUM) map3.get(key);
                    for (final CUK cuk2 : (Set) entry2.getValue()) {
                        arrayListA0h5.add(new Runnable(cum, cuk2) { // from class: X.CUN
                            public static final String __redex_internal_original_name = "ComponentRuntime$$Lambda$4";
                            public final CUM A00;
                            public final CUK A01;

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.lang.Runnable
                            public final void run() {
                                Set set;
                                CUK cuk3;
                                CUM cum2 = this.A00;
                                CUK cuk4 = this.A01;
                                synchronized (cum2) {
                                    if (cum2.A00 == null) {
                                        set = cum2.A01;
                                        cuk3 = cuk4;
                                    } else {
                                        set = cum2.A00;
                                        cuk3 = cuk4.get();
                                    }
                                    set.add(cuk3);
                                }
                            }

                            {
                                this.A00 = cum;
                                this.A01 = cuk2;
                            }
                        });
                    }
                } else {
                    Collection collection2 = (Collection) entry2.getValue();
                    CUM cum2 = new CUM();
                    cum2.A00 = null;
                    cum2.A01 = Collections.newSetFromMap(new ConcurrentHashMap());
                    cum2.A01.addAll(collection2);
                    map3.put(key, cum2);
                }
            }
            arrayListA0h3.addAll(arrayListA0h5);
            Iterator itA11 = BV5.A11(map);
            while (itA11.hasNext()) {
                C3565CUi c3565CUi4 = (C3565CUi) itA11.next();
                for (C3567CUm c3567CUm : c3565CUi4.A03) {
                    int i = c3567CUm.A01;
                    boolean z = false;
                    if (i == 2) {
                        z = true;
                        Map<Class<?>, CUM<?>> map4 = this.A03;
                        Class<?> cls = c3567CUm.A02;
                        if (!map4.containsKey(cls)) {
                            Set set = Collections.EMPTY_SET;
                            CUM<?> cum3 = new CUM<>();
                            cum3.A00 = null;
                            cum3.A01 = Collections.newSetFromMap(new ConcurrentHashMap());
                            cum3.A01.addAll(set);
                            map4.put(cls, cum3);
                        }
                    }
                    Map<Class<?>, CUK<?>> map5 = this.A02;
                    Class<?> cls2 = c3567CUm.A02;
                    if (map5.containsKey(cls2)) {
                        continue;
                    } else {
                        if (i == 1) {
                            throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", c3565CUi4, cls2));
                        }
                        if (!z) {
                            CUZ cuz = CUU.A02;
                            CUK cuk3 = CUU.A03;
                            CUU cuu2 = new CUU();
                            cuu2.A00 = cuz;
                            cuu2.A01 = cuk3;
                            map5.put(cls2, cuu2);
                        }
                    }
                }
            }
        }
        Iterator it5 = arrayListA0h3.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        if (this.A04.get() != null) {
            A01(map);
        }
    }

    public static void A00(List<C3565CUi<?>> list) {
        HashMap mapA0v = BV4.A0v(list.size());
        for (C3565CUi<?> c3565CUi : list) {
            CUR cur = new CUR(c3565CUi);
            for (Class<? super Object> cls : c3565CUi.A04) {
                CUT cut = new CUT(cls, !(c3565CUi.A01 == 0));
                if (!mapA0v.containsKey(cut)) {
                    mapA0v.put(cut, new HashSet());
                }
                Set set = (Set) mapA0v.get(cut);
                if (!set.isEmpty() && !cut.A00) {
                    throw BV5.A0T("Multiple components provide %s.", new Object[]{cls});
                }
                set.add(cur);
            }
        }
        Iterator itA0x = BV5.A0x(mapA0v);
        while (itA0x.hasNext()) {
            for (CUR cur2 : (Set) itA0x.next()) {
                for (C3567CUm c3567CUm : cur2.A00.A03) {
                    if (c3567CUm.A00 == 0) {
                        Set<CUR> set2 = (Set) mapA0v.get(new CUT(c3567CUm.A02, c3567CUm.A01 == 2));
                        if (set2 != null) {
                            for (CUR cur3 : set2) {
                                cur2.A01.add(cur3);
                                cur3.A02.add(cur2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSetA13 = C60O.A13();
        Iterator itA0x2 = BV5.A0x(mapA0v);
        while (itA0x2.hasNext()) {
            hashSetA13.addAll((Collection) itA0x2.next());
        }
        HashSet hashSetA132 = C60O.A13();
        Iterator it = hashSetA13.iterator();
        while (it.hasNext()) {
            CUR cur4 = (CUR) it.next();
            if (cur4.A02.isEmpty()) {
                hashSetA132.add(cur4);
            }
        }
        int i = 0;
        while (!hashSetA132.isEmpty()) {
            CUR cur5 = (CUR) hashSetA132.iterator().next();
            hashSetA132.remove(cur5);
            i++;
            for (CUR cur6 : cur5.A01) {
                Set<CUR> set3 = cur6.A02;
                set3.remove(cur5);
                if (set3.isEmpty()) {
                    hashSetA132.add(cur6);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it2 = hashSetA13.iterator();
        while (it2.hasNext()) {
            CUR cur7 = (CUR) it2.next();
            if (!cur7.A02.isEmpty() && !cur7.A01.isEmpty()) {
                arrayListA0h.add(cur7.A00);
            }
        }
        throw new DependencyCycleException(arrayListA0h);
    }

    private void A01(Map map) {
        Queue queue;
        Object obj;
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            C3565CUi c3565CUi = (C3565CUi) entry.getKey();
            CUK cuk = (CUK) entry.getValue();
            if (c3565CUi.A00 == 1) {
                cuk.get();
            }
        }
        CTM ctm = this.A05;
        synchronized (ctm) {
            queue = ctm.A00;
            obj = null;
            if (queue != null) {
                ctm.A00 = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            if (it.hasNext()) {
                it.next();
                obj.getClass();
                throw F60.createAndThrow();
            }
        }
    }
}
