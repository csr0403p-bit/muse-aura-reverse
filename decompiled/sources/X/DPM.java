package X;

import com.google.common.collect.LinkedListMultimap;
import java.util.AbstractSequentialList;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes5.dex */
public final class DPM<K, V> extends AbstractSequentialList<Map.Entry<K, V>> {
    public final /* synthetic */ LinkedListMultimap A00;

    public DPM(final LinkedListMultimap this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<Map.Entry<K, V>> listIterator(int index) {
        return new DPN(this.A00, index);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.A01;
    }
}
