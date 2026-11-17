package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class HCH extends AbstractSet {
    public final /* synthetic */ HCD A00;

    public HCH(HCD hcd) {
        this.A00 = hcd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        HCD hcd = this.A00;
        Map mapA03 = hcd.A03();
        return mapA03 != null ? BV5.A11(mapA03) : new HCR(hcd);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        HCD hcd = this.A00;
        Map mapA03 = hcd.A03();
        return mapA03 != null ? mapA03.keySet().remove(obj) : HCD.A02(hcd, obj) != HCD.A09;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }
}
