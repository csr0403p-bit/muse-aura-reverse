package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class HCI extends AbstractSet {
    public final /* synthetic */ HCE A00;

    public HCI(HCE hce) {
        this.A00 = hce;
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
        HCE hce = this.A00;
        Map mapA03 = hce.A03();
        return mapA03 != null ? BV5.A11(mapA03) : new HCT(hce);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        HCE hce = this.A00;
        Map mapA03 = hce.A03();
        return mapA03 != null ? mapA03.keySet().remove(obj) : HCE.A02(hce, obj) != HCE.A09;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }
}
