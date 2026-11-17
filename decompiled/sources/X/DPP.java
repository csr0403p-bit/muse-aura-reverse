package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.LinkedListMultimap;
import java.util.ListIterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes5.dex */
public final class DPP<V> implements ListIterator<V> {
    public int A00;
    public DPS<K, V> A01;
    public DPS<K, V> A02;
    public DPS<K, V> A03;
    public final K A04;
    public final /* synthetic */ LinkedListMultimap A05;

    /* JADX WARN: Multi-variable type inference failed */
    public DPP(LinkedListMultimap linkedListMultimap, K k) {
        this.A05 = linkedListMultimap;
        this.A04 = k;
        DPU dpu = (DPU) linkedListMultimap.A04.get(k);
        this.A02 = dpu == null ? 0 : dpu.A01;
    }

    @Override // java.util.ListIterator
    public final void add(V value) {
        this.A03 = LinkedListMultimap.A00(this.A02, this.A05, this.A04, value);
        this.A00++;
        this.A01 = null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return AnonymousClass002.A1X(this.A02);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return AnonymousClass002.A1X(this.A03);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final V next() {
        DPS<K, V> dps = this.A02;
        if (dps == 0) {
            throw C8j3.A1D();
        }
        this.A01 = dps;
        this.A03 = dps;
        this.A02 = dps.A01;
        this.A00++;
        return dps.A04;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A00;
    }

    @Override // java.util.ListIterator
    public final V previous() {
        DPS<K, V> dps = this.A03;
        if (dps == 0) {
            throw C8j3.A1D();
        }
        this.A01 = dps;
        this.A02 = dps;
        this.A03 = dps.A03;
        this.A00--;
        return dps.A04;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A00 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        Preconditions.checkState(AnonymousClass002.A1X(this.A01), "no calls to next() since the last call to remove()");
        DPS<K, V> dps = this.A01;
        if (dps != this.A02) {
            this.A03 = dps.A03;
            this.A00--;
        } else {
            this.A02 = dps.A01;
        }
        LinkedListMultimap.A01(dps, this.A05);
        this.A01 = null;
    }

    @Override // java.util.ListIterator
    public final void set(V value) {
        DPS<K, V> dps = this.A01;
        Preconditions.checkState(AnonymousClass002.A1X(dps));
        dps.A04 = value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DPP(LinkedListMultimap linkedListMultimap, K k, int i) {
        int i2;
        DPS<K, V> dps;
        DPS<K, V> dps2;
        this.A05 = linkedListMultimap;
        DPU dpu = (DPU) linkedListMultimap.A04.get(k);
        if (dpu == null) {
            i2 = 0;
        } else {
            i2 = dpu.A00;
        }
        Preconditions.checkPositionIndex(i, i2);
        if (i >= i2 / 2) {
            if (dpu == null) {
                dps2 = 0;
            } else {
                dps2 = dpu.A02;
            }
            this.A03 = dps2;
            this.A00 = i2;
            while (true) {
                int i3 = i + 1;
                if (i >= i2) {
                    break;
                }
                previous();
                i = i3;
            }
        } else {
            if (dpu == null) {
                dps = 0;
            } else {
                dps = dpu.A01;
            }
            this.A02 = dps;
            while (true) {
                int i4 = i - 1;
                if (i <= 0) {
                    break;
                }
                next();
                i = i4;
            }
        }
        this.A04 = k;
        this.A01 = null;
    }
}
