package com.google.common.collect;

import X.AnonymousClass005;
import X.BV4;
import X.BV6;
import X.BV7;
import X.C60Q;
import X.DOM;
import com.google.common.base.Predicate;
import com.google.common.collect.Cut;
import java.io.Serializable;
import java.lang.Comparable;

/* loaded from: classes5.dex */
public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies implements Predicate<C>, Serializable {
    public static final Range<Comparable> A00 = new Range<>(Cut.BelowAll.A00, Cut.AboveAll.A00);
    public static final long serialVersionUID = 0;
    public final Cut<C> lowerBound;
    public final Cut<C> upperBound;

    public class RangeLexOrdering extends DOM<Range<?>> implements Serializable {
        public static final DOM<?> A00 = new RangeLexOrdering();
        public static final long serialVersionUID = 0;
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean apply(Object input) {
        Comparable comparable = (Comparable) input;
        comparable.getClass();
        return this.lowerBound.A06(comparable) && !this.upperBound.A06(comparable);
    }

    @Override // com.google.common.base.Predicate
    public final boolean equals(Object object) {
        if (!(object instanceof Range)) {
            return false;
        }
        Range range = (Range) object;
        if (this.lowerBound.equals(range.lowerBound)) {
            return BV7.A1X(this.upperBound, range.upperBound, false);
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.upperBound, AnonymousClass005.A0E(this.lowerBound));
    }

    public Object readResolve() {
        Range<Comparable> range = A00;
        return equals(range) ? range : this;
    }

    public final String toString() {
        Cut<C> cut = this.lowerBound;
        Cut<C> cut2 = this.upperBound;
        StringBuilder sbA0p = BV4.A0p(16);
        cut.A04(sbA0p);
        sbA0p.append("..");
        cut2.A05(sbA0p);
        return sbA0p.toString();
    }

    public Range(Cut<C> lowerBound, Cut<C> upperBound) {
        lowerBound.getClass();
        this.lowerBound = lowerBound;
        upperBound.getClass();
        this.upperBound = upperBound;
        if (lowerBound.A00(upperBound) > 0 || lowerBound == Cut.AboveAll.A00 || upperBound == Cut.BelowAll.A00) {
            StringBuilder sbA0p = BV4.A0p(16);
            lowerBound.A04(sbA0p);
            sbA0p.append("..");
            upperBound.A05(sbA0p);
            throw C60Q.A0U("Invalid range: ", sbA0p.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <C extends Comparable<?>> Range<C> A00(C endpoint, BoundType boundType) {
        int iOrdinal = endpoint.ordinal();
        if (iOrdinal == 0) {
            boundType.getClass();
            return new Range<>(new Cut.AboveValue(boundType), Cut.AboveAll.A00);
        }
        if (iOrdinal != 1) {
            throw BV6.A0f();
        }
        boundType.getClass();
        return new Range<>(new Cut.BelowValue(boundType), Cut.AboveAll.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <C extends Comparable<?>> Range<C> A01(C endpoint, BoundType boundType) {
        int iOrdinal = endpoint.ordinal();
        if (iOrdinal == 0) {
            Cut.BelowAll belowAll = Cut.BelowAll.A00;
            boundType.getClass();
            return new Range<>(belowAll, new Cut.BelowValue(boundType));
        }
        if (iOrdinal != 1) {
            throw BV6.A0f();
        }
        Cut.BelowAll belowAll2 = Cut.BelowAll.A00;
        boundType.getClass();
        return new Range<>(belowAll2, new Cut.AboveValue(boundType));
    }
}
