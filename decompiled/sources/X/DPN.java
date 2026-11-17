package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.LinkedListMultimap;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes5.dex */
public final class DPN<K, V> implements ListIterator<Map.Entry<K, V>> {
    public int A00;
    public int A01;
    public DPS<K, V> A02;
    public DPS<K, V> A03;
    public DPS<K, V> A04;
    public final /* synthetic */ LinkedListMultimap A05;

    public DPN(final LinkedListMultimap this$0, int index) {
        this.A05 = this$0;
        this.A00 = this$0.A00;
        int i = this$0.A01;
        Preconditions.checkPositionIndex(index, i);
        if (index < i / 2) {
            this.A03 = this$0.A02;
            while (true) {
                int i2 = index - 1;
                if (index <= 0) {
                    break;
                }
                A00();
                DPS<K, V> dps = this.A03;
                if (dps == null) {
                    throw C8j3.A1D();
                }
                this.A02 = dps;
                this.A04 = dps;
                this.A03 = dps.A00;
                this.A01++;
                index = i2;
            }
        } else {
            this.A04 = this$0.A03;
            this.A01 = i;
            while (true) {
                int i3 = index + 1;
                if (index >= i) {
                    break;
                }
                A00();
                DPS<K, V> dps2 = this.A04;
                if (dps2 == null) {
                    throw C8j3.A1D();
                }
                this.A02 = dps2;
                this.A03 = dps2;
                this.A04 = dps2.A02;
                this.A01--;
                index = i3;
            }
        }
        this.A02 = null;
    }

    private void A00() {
        if (this.A05.A00 != this.A00) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A01;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A01 - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object e) {
        throw C8j3.A17();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        A00();
        return AnonymousClass002.A1X(this.A03);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        A00();
        return AnonymousClass002.A1X(this.A04);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        A00();
        DPS<K, V> dps = this.A03;
        if (dps == null) {
            throw C8j3.A1D();
        }
        this.A02 = dps;
        this.A04 = dps;
        this.A03 = dps.A00;
        this.A01++;
        return dps;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        A00();
        DPS<K, V> dps = this.A04;
        if (dps == null) {
            throw C8j3.A1D();
        }
        this.A02 = dps;
        this.A03 = dps;
        this.A04 = dps.A02;
        this.A01--;
        return dps;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        A00();
        Preconditions.checkState(AnonymousClass002.A1X(this.A02), "no calls to next() since the last call to remove()");
        DPS<K, V> dps = this.A02;
        if (dps != this.A03) {
            this.A04 = dps.A02;
            this.A01--;
        } else {
            this.A03 = dps.A00;
        }
        LinkedListMultimap linkedListMultimap = this.A05;
        LinkedListMultimap.A01(dps, linkedListMultimap);
        this.A02 = null;
        this.A00 = linkedListMultimap.A00;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object e) {
        throw C8j3.A17();
    }
}
