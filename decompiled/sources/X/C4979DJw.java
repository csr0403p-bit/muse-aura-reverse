package X;

import android.util.SparseArray;

/* renamed from: X.DJw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4979DJw<E> extends SparseArray<E> implements InterfaceC4978DJv<E> {
    public boolean A00;

    private final void A00() {
        if (this.A00) {
            throw new IllegalStateException("Map is locked from modifications");
        }
    }

    @Override // android.util.SparseArray
    public final void append(int i, E e) {
        A00();
        super.append(i, e);
    }

    @Override // android.util.SparseArray
    public final void clear() {
        A00();
        super.clear();
    }

    @Override // android.util.SparseArray, X.InterfaceC4978DJv
    public final void put(int i, E e) {
        A00();
        super.put(i, e);
    }

    @Override // android.util.SparseArray
    public final void remove(int i) {
        A00();
        super.remove(i);
    }

    @Override // android.util.SparseArray
    public final void removeAt(int i) {
        A00();
        super.removeAt(i);
    }

    @Override // android.util.SparseArray
    public final void setValueAt(int i, E e) {
        A00();
        super.setValueAt(i, e);
    }
}
