package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.LinkedListMultimap;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes5.dex */
public final class DPQ<K> implements Iterator<K> {
    public int A00;
    public DPS<K, V> A01;
    public DPS<K, V> A02;
    public final Set<K> A03;
    public final /* synthetic */ LinkedListMultimap A04;

    public DPQ(final LinkedListMultimap this$0) {
        int iA00;
        this.A04 = this$0;
        int size = this$0.keySet().size();
        if (size < 3) {
            AbstractC3830CfJ.A00(size, "expectedSize");
            iA00 = size + 1;
        } else {
            iA00 = BV8.A00(size);
        }
        this.A03 = new HashSet(iA00);
        this.A02 = this$0.A02;
        this.A00 = this$0.A00;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A04.A00 == this.A00) {
            return AnonymousClass002.A1X(this.A02);
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final K next() {
        DPS<K, V> dps;
        if (this.A04.A00 != this.A00) {
            throw new ConcurrentModificationException();
        }
        DPS<K, V> dps2 = this.A02;
        if (dps2 == 0) {
            throw C8j3.A1D();
        }
        this.A01 = dps2;
        Set<K> set = this.A03;
        set.add(dps2.A05);
        do {
            dps = this.A02.A00;
            this.A02 = dps;
            if (dps == 0) {
                break;
            }
        } while (!set.add(dps.A05));
        return this.A01.A05;
    }

    @Override // java.util.Iterator
    public final void remove() {
        LinkedListMultimap linkedListMultimap = this.A04;
        if (linkedListMultimap.A00 != this.A00) {
            throw new ConcurrentModificationException();
        }
        Preconditions.checkState(AnonymousClass002.A1X(this.A01), "no calls to next() since the last call to remove()");
        LinkedListMultimap.A02(linkedListMultimap, this.A01.A05);
        this.A01 = null;
        this.A00 = linkedListMultimap.A00;
    }
}
