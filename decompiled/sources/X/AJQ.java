package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AJQ implements Iterator, BOA {
    public final AJT<K, V, Map.Entry<K, V>> A00;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A00.remove();
    }

    public AJQ(C0958AJl<K, V> c0958AJl) {
        AJV[] ajvArr = new AJV[8];
        int i = 0;
        do {
            ajvArr[i] = new AJS(this);
            i++;
        } while (i < 8);
        this.A00 = new AJT(c0958AJl, ajvArr);
    }
}
