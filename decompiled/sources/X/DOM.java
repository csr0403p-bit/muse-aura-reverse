package X;

import com.google.common.collect.ByFunctionOrdering;
import com.google.common.collect.ComparatorOrdering;
import com.google.common.collect.CompoundOrdering;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.Range;
import com.google.common.collect.ReverseNaturalOrdering;
import com.google.common.collect.ReverseOrdering;
import java.util.Comparator;

/* loaded from: classes5.dex */
public abstract class DOM<T> implements Comparator<T> {
    public final <S extends T> DOM<S> A00() {
        return this instanceof ReverseOrdering ? ((ReverseOrdering) this).forwardOrder : this instanceof ReverseNaturalOrdering ? NaturalOrdering.A00 : this instanceof NaturalOrdering ? ReverseNaturalOrdering.A00 : new ReverseOrdering(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        if (this instanceof ReverseOrdering) {
            return ((ReverseOrdering) this).forwardOrder.compare(t2, t);
        }
        if (this instanceof ReverseNaturalOrdering) {
            Comparable comparable = (Comparable) t2;
            t.getClass();
            if (t != comparable) {
                return comparable.compareTo(t);
            }
            return 0;
        }
        if (this instanceof Range.RangeLexOrdering) {
            Range range = (Range) t;
            Range range2 = (Range) t2;
            AbstractC6142Dwk abstractC6142Dwk = AbstractC6142Dwk.A00;
            int iCompareTo = range.lowerBound.compareTo(range2.lowerBound);
            AbstractC6142Dwk abstractC6142Dwk2 = iCompareTo < 0 ? AbstractC6142Dwk.A02 : iCompareTo > 0 ? AbstractC6142Dwk.A01 : AbstractC6142Dwk.A00;
            com.google.common.collect.Cut<C> cut = range.upperBound;
            Object obj = range2.upperBound;
            if (!(abstractC6142Dwk2 instanceof C6144Dwm)) {
                int iCompareTo2 = cut.compareTo(obj);
                abstractC6142Dwk2 = iCompareTo2 < 0 ? AbstractC6142Dwk.A02 : iCompareTo2 > 0 ? AbstractC6142Dwk.A01 : AbstractC6142Dwk.A00;
            }
            if (abstractC6142Dwk2 instanceof C6144Dwm) {
                return ((C6144Dwm) abstractC6142Dwk2).A00;
            }
            return 0;
        }
        if (this instanceof NaturalOrdering) {
            Comparable comparable2 = (Comparable) t;
            comparable2.getClass();
            t2.getClass();
            return comparable2.compareTo(t2);
        }
        if (!(this instanceof CompoundOrdering)) {
            if (this instanceof ComparatorOrdering) {
                return ((ComparatorOrdering) this).comparator.compare(t, t2);
            }
            ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) this;
            return byFunctionOrdering.ordering.compare(byFunctionOrdering.function.apply(t), byFunctionOrdering.function.apply(t2));
        }
        CompoundOrdering compoundOrdering = (CompoundOrdering) this;
        int i = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = compoundOrdering.comparators;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }
}
