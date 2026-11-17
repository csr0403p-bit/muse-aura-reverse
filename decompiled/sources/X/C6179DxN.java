package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.DxN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6179DxN<E> implements Iterable<E> {
    public final Object A02 = C3cG.A0T();
    public final Map<E, Integer> A03 = BV4.A0u();
    public Set<E> A01 = Collections.EMPTY_SET;
    public List<E> A00 = Collections.EMPTY_LIST;

    public final int A00(E e) {
        int iA07;
        synchronized (this.A02) {
            Map<E, Integer> map = this.A03;
            iA07 = map.containsKey(e) ? BV6.A07(map.get(e)) : 0;
        }
        return iA07;
    }

    public final Set<E> A01() {
        Set<E> set;
        synchronized (this.A02) {
            set = this.A01;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.A02) {
            it = this.A00.iterator();
        }
        return it;
    }
}
