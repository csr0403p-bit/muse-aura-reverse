package X;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Bwg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3062Bwg<T> extends AbstractCollection<T> implements Set<T> {
    public static final Object A07 = C3cG.A0T();
    public Object[] A01;
    public final InterfaceC5259DeO A02;
    public final int[] A04;
    public volatile boolean A06 = true;
    public final ThreadLocal<Boolean> A03 = new ThreadLocal<>();
    public int A00 = 0;
    public volatile InterfaceC3064Bwk A05 = new C3063Bwh(this);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<T> iterator() {
        return new C3061Bwf(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A01.length;
    }

    public C3062Bwg(InterfaceC5259DeO interfaceC5259DeO, int[] iArr) {
        this.A02 = interfaceC5259DeO.AK0();
        this.A04 = iArr;
        this.A01 = new Object[iArr.length];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(T t) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (obj == null) {
                if (next == null) {
                    return true;
                }
            } else if (obj.equals(next)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw C8j3.A17();
    }
}
