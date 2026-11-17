package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.C60O;
import X.C7384Etj;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class UniffiHandleMap<T> {
    public static final int $stable = 8;
    public final ConcurrentHashMap<Long, T> map = C60O.A1C();
    public final AtomicLong counter = AbstractC7609F5w.A11();

    public final long insert(T t) {
        C7384Etj.A0Y(t, 0);
        long andAdd = this.counter.getAndAdd(2L);
        this.map.put(Long.valueOf(andAdd), t);
        return andAdd;
    }

    public final long clone(long j) throws InternalException {
        T t = this.map.get(Long.valueOf(j));
        if (t != null) {
            return insert(t);
        }
        throw new InternalException("UniffiHandleMap.clone: Invalid handle");
    }

    public final T get(long j) throws InternalException {
        T t = this.map.get(Long.valueOf(j));
        if (t != null) {
            return t;
        }
        throw new InternalException("UniffiHandleMap.get: Invalid handle");
    }

    public final int getSize() {
        return this.map.size();
    }

    public final T remove(long j) throws InternalException {
        T tRemove = this.map.remove(Long.valueOf(j));
        if (tRemove != null) {
            return tRemove;
        }
        throw new InternalException("UniffiHandleMap: Invalid handle");
    }
}
