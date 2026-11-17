package X;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class AMh implements ListIterator, BOA {
    public int A00;
    public int A01 = -1;
    public int A02;
    public final SnapshotStateList<T> A03;

    private final void A00() {
        if (AMg.A00(this.A03) != this.A02) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.A00 < this.A03.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return C8j3.A1Q(this.A00);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A00 + 1;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A00;
    }

    public AMh(SnapshotStateList<T> snapshotStateList, int i) {
        this.A03 = snapshotStateList;
        this.A00 = i - 1;
        this.A02 = AMg.A00(snapshotStateList);
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        A00();
        SnapshotStateList<T> snapshotStateList = this.A03;
        snapshotStateList.add(this.A00 + 1, t);
        this.A01 = -1;
        this.A00++;
        this.A02 = AMg.A00(snapshotStateList);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        A00();
        int i = this.A00 + 1;
        this.A01 = i;
        List list = this.A03;
        AMg.A01(i, list.size());
        ?? r0 = list.get(i);
        this.A00 = i;
        return r0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // java.util.ListIterator
    public final T previous() {
        A00();
        int i = this.A00;
        List list = this.A03;
        AMg.A01(i, list.size());
        int i2 = this.A00;
        this.A01 = i2;
        this.A00--;
        return list.get(i2);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        A00();
        SnapshotStateList<T> snapshotStateList = this.A03;
        snapshotStateList.remove(this.A01);
        this.A00--;
        this.A01 = -1;
        this.A02 = AMg.A00(snapshotStateList);
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        A00();
        int i = this.A01;
        if (i < 0) {
            throw C3cG.A0Q("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
        }
        SnapshotStateList<T> snapshotStateList = this.A03;
        snapshotStateList.set(i, t);
        this.A02 = AMg.A00(snapshotStateList);
    }
}
