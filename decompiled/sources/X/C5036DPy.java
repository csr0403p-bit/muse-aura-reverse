package X;

import com.google.common.collect.BoundType;
import com.google.common.collect.ComparatorOrdering;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* renamed from: X.DPy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5036DPy extends DPh implements DQ1 {
    public transient Comparator<? super E> A00;
    public transient NavigableSet<E> A01;
    public transient Set A02;
    public final /* synthetic */ AbstractC5037DPz A03;

    public C5036DPy(final AbstractC5037DPz this$0) {
        this.A03 = this$0;
    }

    @Override // X.DQ1
    public final DQ1<E> A8u() {
        return this.A03;
    }

    @Override // X.InterfaceC5026DPa
    /* renamed from: A9s */
    public final NavigableSet<E> A9t() {
        NavigableSet<E> navigableSet = this.A01;
        if (navigableSet != 0) {
            return navigableSet;
        }
        DQ0 dq0 = new DQ0(this);
        this.A01 = dq0;
        return dq0;
    }

    @Override // X.DQ1
    public final DPD ABd() {
        return this.A03.APT();
    }

    /* JADX WARN: Incorrect types in method signature: (TE;Lcom/google/common/collect/BoundType;)LX/DQ1<TE;>; */
    @Override // X.DQ1
    public final DQ1 ANM(BoundType toElement, Object boundType) {
        return this.A03.Agk(toElement, boundType).A8u();
    }

    @Override // X.DQ1
    public final DPD APT() {
        return this.A03.ABd();
    }

    @Override // X.DQ1
    public final DPD AY1() {
        return this.A03.AY2();
    }

    @Override // X.DQ1
    public final DPD AY2() {
        return this.A03.AY1();
    }

    /* JADX WARN: Incorrect types in method signature: (TE;Lcom/google/common/collect/BoundType;TE;Lcom/google/common/collect/BoundType;)LX/DQ1<TE;>; */
    @Override // X.DQ1
    public final DQ1 AgY(BoundType fromElement, BoundType fromBoundType, Object toElement, Object toBoundType) {
        return this.A03.AgY(fromBoundType, fromElement, toBoundType, toElement).A8u();
    }

    /* JADX WARN: Incorrect types in method signature: (TE;Lcom/google/common/collect/BoundType;)LX/DQ1<TE;>; */
    @Override // X.DQ1
    public final DQ1 Agk(BoundType fromElement, Object boundType) {
        return this.A03.ANM(fromElement, boundType).A8u();
    }

    @Override // X.DQ1, X.InterfaceC7431Evo
    public final Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.A00;
        if (comparator != 0) {
            return comparator;
        }
        Comparator<? super E> comparator2 = this.A03.comparator;
        DOM domA00 = (comparator2 instanceof DOM ? (DOM) comparator2 : new ComparatorOrdering(comparator2)).A00();
        this.A00 = domA00;
        return domA00;
    }

    @Override // X.InterfaceC5026DPa
    public final Set entrySet() {
        Set set = this.A02;
        if (set != null) {
            return set;
        }
        C5032DPr c5032DPr = new C5032DPr(this);
        this.A02 = c5032DPr;
        return c5032DPr;
    }

    @Override // X.DNX, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        DQ1 dq1A8u = this.A03.A8u();
        return new DPE(dq1A8u, dq1A8u.entrySet().iterator());
    }

    @Override // X.DNX, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) Eu2.A01(this, tArr);
    }

    @Override // X.AbstractC3450CNv
    public final String toString() {
        return entrySet().toString();
    }

    public C5036DPy() {
    }

    @Override // X.DNX, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
