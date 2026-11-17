package X;

import com.google.common.collect.ImmutableMultiset;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: X.DPe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5027DPe<E> extends AbstractC7489Ext<E> {
    public int A00;
    public E A01;
    public final /* synthetic */ ImmutableMultiset A02;
    public final /* synthetic */ Iterator A03;

    public C5027DPe(final ImmutableMultiset this$0, final Iterator val$entryIterator) {
        this.A03 = val$entryIterator;
        this.A02 = this$0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00 > 0 || this.A03.hasNext();
    }

    @Override // java.util.Iterator
    public final E next() {
        int iA00 = this.A00;
        if (iA00 <= 0) {
            DPD dpd = (DPD) this.A03.next();
            this.A01 = (E) dpd.A01();
            iA00 = dpd.A00();
            this.A00 = iA00;
        }
        this.A00 = iA00 - 1;
        E e = this.A01;
        e.getClass();
        return e;
    }
}
