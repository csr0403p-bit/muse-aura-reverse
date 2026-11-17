package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.AJr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0964AJr<K, V> implements Iterator<AK6<V>>, BOA {
    public Object A00;
    public int A01;
    public final Map<K, AK6<V>> A02;

    public C0964AJr(Object obj, Map<K, AK6<V>> map) {
        C7384Etj.A0Y(map, 1);
        this.A00 = obj;
        this.A02 = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01 < this.A02.size();
    }

    @Override // java.util.Iterator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final AK6<V> next() {
        if (!hasNext()) {
            throw C8j3.A1D();
        }
        AK6<V> ak6 = this.A02.get(this.A00);
        if (ak6 == null) {
            StringBuilder sbA0x = C60O.A0x("Hash code of a key (");
            sbA0x.append(this.A00);
            throw new ConcurrentModificationException(AnonymousClass001.A0v(") has changed after it was added to the persistent map.", sbA0x));
        }
        AK6<V> ak62 = ak6;
        this.A01++;
        this.A00 = ak62.A00;
        return ak62;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j4.A10();
    }
}
