package X;

import com.google.common.collect.RegularImmutableSet;
import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: X.E8x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6493E8x extends AbstractQueue<Object> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return RegularImmutableSet.A05.iterator();
    }

    @Override // java.util.Queue
    public final Object peek() {
        return null;
    }

    @Override // java.util.Queue
    public final Object poll() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }

    @Override // java.util.Queue
    public final boolean offer(Object o) {
        return true;
    }
}
