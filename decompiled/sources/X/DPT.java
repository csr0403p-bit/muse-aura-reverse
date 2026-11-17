package X;

import com.google.common.collect.LinkedListMultimap;
import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes5.dex */
public final class DPT<V> extends AbstractSequentialList<V> {
    public final /* synthetic */ LinkedListMultimap A00;
    public final /* synthetic */ Object A01;

    public DPT(final LinkedListMultimap this$0, final Object val$key) {
        this.A01 = val$key;
        this.A00 = this$0;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<V> listIterator(int index) {
        return new DPP(this.A00, this.A01, index);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        DPU dpu = (DPU) this.A00.A04.get(this.A01);
        if (dpu == null) {
            return 0;
        }
        return dpu.A00;
    }
}
