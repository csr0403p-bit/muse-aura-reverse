package X;

import com.google.common.collect.LinkedListMultimap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes5.dex */
public final class DPR<K> extends AbstractC5014DOf<K> {
    public final /* synthetic */ LinkedListMultimap A00;

    public DPR(final LinkedListMultimap this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object key) {
        return this.A00.A04.containsKey(key);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new DPQ(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object o) {
        LinkedListMultimap linkedListMultimap = this.A00;
        DPP dpp = new DPP(linkedListMultimap, o);
        ArrayList arrayListA0h = C3cG.A0h();
        AbstractC7483Exg.A01(arrayListA0h, dpp);
        List listUnmodifiableList = Collections.unmodifiableList(arrayListA0h);
        LinkedListMultimap.A02(linkedListMultimap, o);
        return BV6.A1b(listUnmodifiableList);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.A04.size();
    }
}
