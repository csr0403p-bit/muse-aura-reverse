package X;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class AJ5<K, V> extends AbstractC0891AGs<K> implements BQI<K> {
    public final C0952AJf<K, V> A00;

    @Override // X.AbstractC0890AGr, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // X.AbstractC0890AGr, java.util.Collection, java.lang.Iterable
    public final Iterator<K> iterator() {
        C0956AJj<K, V> c0956AJj = this.A00.A00;
        C7384Etj.A0Y(c0956AJj, 0);
        AJH[] ajhArr = new AJH[8];
        int i = 0;
        do {
            ajhArr[i] = new AJJ();
            i++;
        } while (i < 8);
        return new AJ7(c0956AJj, ajhArr);
    }

    public AJ5(C0952AJf<K, V> c0952AJf) {
        this.A00 = c0952AJf;
    }
}
