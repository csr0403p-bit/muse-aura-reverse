package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Cex, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3814Cex extends Cf0 {
    public final transient int A00;
    public final transient Object[] A01;
    public final transient C3812Cev A02;

    @Override // X.AbstractC3816Cez, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value != null) {
            return BV7.A1X(value, this.A02.get(key), false);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        AbstractC3815Cey c3813Cew = super.A00;
        if (c3813Cew == null) {
            c3813Cew = new C3813Cew(this);
            super.A00 = c3813Cew;
        }
        return c3813Cew.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00;
    }

    public C3814Cex(C3812Cev c3812Cev, Object[] objArr, int i) {
        this.A02 = c3812Cev;
        this.A01 = objArr;
        this.A00 = i;
    }
}
