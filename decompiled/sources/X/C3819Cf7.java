package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Cf7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3819Cf7 extends AbstractC3822CfA {
    public final transient int A00;
    public final transient Object[] A01;
    public final transient C3817Cf5 A02;

    @Override // X.AbstractC3821Cf9, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
        AbstractC3820Cf8 c3818Cf6 = super.A00;
        if (c3818Cf6 == null) {
            c3818Cf6 = new C3818Cf6(this);
            super.A00 = c3818Cf6;
        }
        return c3818Cf6.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00;
    }

    public C3819Cf7(C3817Cf5 c3817Cf5, Object[] objArr, int i) {
        this.A02 = c3817Cf5;
        this.A01 = objArr;
        this.A00 = i;
    }
}
