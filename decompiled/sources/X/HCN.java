package X;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class HCN extends AbstractCollection {
    public final /* synthetic */ HCD A00;

    public HCN(HCD hcd) {
        this.A00 = hcd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        HCD hcd = this.A00;
        Map mapA03 = hcd.A03();
        return mapA03 != null ? BV5.A10(mapA03) : new HCS(hcd);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.A00.size();
    }
}
