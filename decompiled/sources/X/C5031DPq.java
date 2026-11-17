package X;

import com.google.common.collect.AbstractMapBasedMultiset;
import com.google.common.collect.GeneralRange;
import com.google.common.collect.TreeMultiset;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: X.DPq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5031DPq<E> extends AbstractC5028DPf<E> {
    public final /* synthetic */ DPj A00;

    public C5031DPq(final DPj this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        DPj dPj = this.A00;
        return dPj instanceof TreeMultiset ? new F5P((TreeMultiset) dPj, 2) : new DQ6((AbstractMapBasedMultiset) dPj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        DPj dPj = this.A00;
        if (!(dPj instanceof TreeMultiset)) {
            return ((AbstractMapBasedMultiset) dPj).A01.A02;
        }
        TreeMultiset treeMultiset = (TreeMultiset) dPj;
        TreeMultiset.Aggregate aggregate = TreeMultiset.Aggregate.A01;
        DQF<E> dqf = treeMultiset.A02.A00;
        long jA00 = aggregate.A00(dqf);
        GeneralRange<E> generalRange = treeMultiset.A00;
        if (generalRange.hasLowerBound) {
            jA00 -= TreeMultiset.A01(aggregate, dqf, treeMultiset);
        }
        if (generalRange.hasUpperBound) {
            jA00 -= TreeMultiset.A00(aggregate, dqf, treeMultiset);
        }
        return DX6.A01(jA00);
    }
}
