package X;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class AJ2<K, V> extends AbstractC0891AGs<K> implements BQI<K> {
    public final C0953AJg<K, V> A00;

    @Override // X.AbstractC0890AGr
    public final int A0D() {
        return this.A00.size();
    }

    @Override // X.AbstractC0890AGr, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // X.AbstractC0890AGr, java.util.Collection, java.lang.Iterable
    public final Iterator<K> iterator() {
        return new C0965AJs(this.A00);
    }

    public AJ2(C0953AJg<K, V> c0953AJg) {
        this.A00 = c0953AJg;
    }
}
