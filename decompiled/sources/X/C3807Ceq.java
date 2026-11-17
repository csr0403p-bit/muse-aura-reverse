package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Ceq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3807Ceq extends AbstractC3805Ceo {
    public final transient int A00;
    public final transient Object[] A01;
    public final transient C3802Cel A02;

    @Override // X.AbstractC3806Cep, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
        AbstractC3804Cen c3810Cet = super.A00;
        if (c3810Cet == null) {
            c3810Cet = new C3810Cet(this);
            super.A00 = c3810Cet;
        }
        return c3810Cet.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00;
    }

    public C3807Ceq(C3802Cel c3802Cel, Object[] objArr, int i) {
        this.A02 = c3802Cel;
        this.A01 = objArr;
        this.A00 = i;
    }
}
