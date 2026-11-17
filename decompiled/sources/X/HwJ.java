package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class HwJ extends AbstractList<String> implements Hl2, RandomAccess {
    public final Hl2 A00;

    @Override // X.Hl2
    public final Object AJO(int i) {
        return this.A00.AJO(i);
    }

    @Override // X.Hl2
    public final List<?> AME() {
        return this.A00.AME();
    }

    @Override // X.Hl2
    public final Hl2 AMH() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new F5O(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new DRG(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.size();
    }

    public HwJ(Hl2 hl2) {
        this.A00 = hl2;
    }

    @Override // X.Hl2
    public final void A36(AbstractC9309GDl abstractC9309GDl) {
        throw C8j3.A17();
    }
}
