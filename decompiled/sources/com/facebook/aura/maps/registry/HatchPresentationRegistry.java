package com.facebook.aura.maps.registry;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C8j4;
import X.G0U;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchPresentationRegistry<T> {
    public final G0U<T, Unit> close;
    public final LinkedHashMap<String, T> entries;
    public final IdentityHashMap<T, Integer> holderCounts;
    public final int maxEntries;

    /* JADX WARN: Multi-variable type inference failed */
    public HatchPresentationRegistry(int i, G0U<? super T, Unit> g0u) {
        C7384Etj.A0Y(g0u, 1);
        this.maxEntries = i;
        this.close = g0u;
        this.entries = new LinkedHashMap<>(16, 0.75f, true);
        this.holderCounts = new IdentityHashMap<>();
    }

    public final synchronized T acquire(String str, G0U<? super T, Boolean> g0u, Function0<? extends T> function0) {
        T tInvoke;
        AnonymousClass005.A0x(str, g0u, function0);
        tInvoke = this.entries.get(str);
        if (tInvoke == null || !AnonymousClass003.A1X(tInvoke, g0u)) {
            if (tInvoke != null) {
                this.entries.remove(str);
                closeIfUnheld(tInvoke);
            }
            tInvoke = function0.invoke();
            this.entries.put(str, tInvoke);
        }
        IdentityHashMap<T, Integer> identityHashMap = this.holderCounts;
        Integer num = identityHashMap.get(tInvoke);
        C8j4.A1O(tInvoke, identityHashMap, (num != null ? num.intValue() : 0) + 1);
        trim();
        return tInvoke;
    }

    public final synchronized void clear() {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Collection<T> collectionValues = this.entries.values();
        C7384Etj.A0U(collectionValues);
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            identityHashMap.put(it.next(), true);
        }
        Set<T> setKeySet = this.holderCounts.keySet();
        C7384Etj.A0U(setKeySet);
        Iterator<T> it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            identityHashMap.put(it2.next(), true);
        }
        this.entries.clear();
        this.holderCounts.clear();
        Set setKeySet2 = identityHashMap.keySet();
        C7384Etj.A0U(setKeySet2);
        G0U<T, Unit> g0u = this.close;
        Iterator it3 = setKeySet2.iterator();
        while (it3.hasNext()) {
            g0u.invoke(it3.next());
        }
    }

    public final synchronized void evictUnheld(G0U<? super T, Boolean> g0u) {
        C7384Etj.A0Y(g0u, 0);
        Iterator<T> it = this.entries.values().iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (!this.holderCounts.containsKey(next) && AnonymousClass003.A1X(next, g0u)) {
                it.remove();
                this.close.invoke(next);
            }
        }
    }

    public final synchronized void release(T t) {
        Integer num = this.holderCounts.get(t);
        if (num != null) {
            int iIntValue = num.intValue();
            IdentityHashMap<T, Integer> identityHashMap = this.holderCounts;
            if (iIntValue > 1) {
                C8j4.A1O(t, identityHashMap, iIntValue - 1);
            } else {
                identityHashMap.remove(t);
                closeIfUnheld(t);
                trim();
            }
        }
    }

    public final synchronized void retain(T t) {
        IdentityHashMap<T, Integer> identityHashMap = this.holderCounts;
        Integer num = identityHashMap.get(t);
        C8j4.A1O(t, identityHashMap, (num != null ? num.intValue() : 0) + 1);
    }

    private final void closeIfUnheld(T t) {
        if (this.holderCounts.containsKey(t)) {
            return;
        }
        Collection<T> collectionValues = this.entries.values();
        C7384Etj.A0U(collectionValues);
        if (!collectionValues.isEmpty()) {
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (it.next() == t) {
                    return;
                }
            }
        }
        this.close.invoke(t);
    }

    private final void trim() {
        Iterator itA0i;
        Object value;
        while (true) {
            LinkedHashMap<String, T> linkedHashMap = this.entries;
            if (linkedHashMap.size() > this.maxEntries) {
                itA0i = C3cG.A0i(linkedHashMap);
                while (itA0i.hasNext()) {
                    value = C3cH.A0l(itA0i).getValue();
                    if (!this.holderCounts.containsKey(value)) {
                        break;
                    }
                }
                return;
            }
            return;
            itA0i.remove();
            this.close.invoke(value);
        }
    }
}
