package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.CeG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3773CeG extends CPY {
    public final transient int A00;
    public final transient Object[] A01;
    public final transient C3772CeF A02;

    @Override // X.COV, java.util.AbstractCollection, java.util.Collection
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
        AbstractC3777CeK c3775CeI = super.A00;
        if (c3775CeI == null) {
            c3775CeI = new C3775CeI(this);
            super.A00 = c3775CeI;
        }
        return c3775CeI.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00;
    }

    public C3773CeG(C3772CeF c3772CeF, Object[] objArr, int i) {
        this.A02 = c3772CeF;
        this.A01 = objArr;
        this.A00 = i;
    }
}
