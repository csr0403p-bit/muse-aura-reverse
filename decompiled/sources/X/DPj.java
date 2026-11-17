package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMapBasedMultiset;
import com.google.common.collect.TreeMultiset;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class DPj<E> extends AbstractCollection<E> implements InterfaceC5026DPa<E> {
    public transient Set<E> A00;
    public transient Set A01;

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC5026DPa
    public final boolean add(E element) {
        A02(element, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC5026DPa
    public final boolean remove(Object element) {
        return AaU(element, 1) > 0;
    }

    /* JADX WARN: Incorrect return type in method signature: (TE;I)I */
    public final void A02(Object element, int occurrences) {
        long j;
        DQF<E> dqfA0C;
        if (this instanceof TreeMultiset) {
            TreeMultiset treeMultiset = (TreeMultiset) this;
            AbstractC3830CfJ.A00(occurrences, "occurrences");
            if (occurrences == 0) {
                treeMultiset.A7Q(element);
                return;
            }
            Preconditions.checkArgument(treeMultiset.A00.A01(element));
            DQK<DQF<E>> dqk = treeMultiset.A02;
            DQF<E> dqf = dqk.A00;
            if (dqf == null) {
                treeMultiset.comparator.compare(element, element);
                dqfA0C = new DQF<>(element, occurrences);
                DQF<E> dqf2 = treeMultiset.A01;
                dqf2.A07 = dqfA0C;
                dqfA0C.A05 = dqf2;
                dqfA0C.A07 = dqf2;
                dqf2.A05 = dqfA0C;
            } else {
                dqfA0C = dqf.A0C(element, treeMultiset.comparator, new int[1], occurrences);
            }
            dqk.A00(dqf, dqfA0C);
            return;
        }
        AbstractMapBasedMultiset abstractMapBasedMultiset = (AbstractMapBasedMultiset) this;
        if (occurrences == 0) {
            abstractMapBasedMultiset.A7Q(element);
            return;
        }
        Preconditions.checkArgument(AnonymousClass002.A1N(occurrences), "occurrences cannot be negative: %s", occurrences);
        int iA04 = abstractMapBasedMultiset.A01.A04(element);
        C5034DPt<E> c5034DPt = abstractMapBasedMultiset.A01;
        if (iA04 == -1) {
            c5034DPt.A05(element, occurrences);
            j = abstractMapBasedMultiset.A00 + occurrences;
        } else {
            Preconditions.checkElementIndex(iA04, c5034DPt.A02);
            long j2 = c5034DPt.A05[iA04];
            long j3 = occurrences;
            long j4 = j2 + j3;
            Preconditions.checkArgument(j4 <= 2147483647L, "too many occurrences: %s", j4);
            C5034DPt<E> c5034DPt2 = abstractMapBasedMultiset.A01;
            Preconditions.checkElementIndex(iA04, c5034DPt2.A02);
            c5034DPt2.A05[iA04] = (int) j4;
            j = abstractMapBasedMultiset.A00 + j3;
        }
        abstractMapBasedMultiset.A00 = j;
    }

    @Override // X.InterfaceC5026DPa
    public Set<E> A9t() {
        Set<E> dq0 = this.A00;
        if (dq0 == null) {
            dq0 = this instanceof AbstractC5037DPz ? new DQ0<>((AbstractC5037DPz) this) : new DPi<>(this);
            this.A00 = dq0;
        }
        return dq0;
    }

    @Override // X.InterfaceC5026DPa
    public int AaU(Object element, int occurrences) {
        AbstractMapBasedMultiset abstractMapBasedMultiset = (AbstractMapBasedMultiset) this;
        if (occurrences == 0) {
            return abstractMapBasedMultiset.A7Q(element);
        }
        Preconditions.checkArgument(AnonymousClass002.A1N(occurrences), "occurrences cannot be negative: %s", occurrences);
        int iA04 = abstractMapBasedMultiset.A01.A04(element);
        if (iA04 == -1) {
            return 0;
        }
        C5034DPt<E> c5034DPt = abstractMapBasedMultiset.A01;
        Preconditions.checkElementIndex(iA04, c5034DPt.A02);
        int i = c5034DPt.A05[iA04];
        C5034DPt<E> c5034DPt2 = abstractMapBasedMultiset.A01;
        if (i > occurrences) {
            Preconditions.checkElementIndex(iA04, c5034DPt2.A02);
            c5034DPt2.A05[iA04] = i - occurrences;
        } else {
            c5034DPt2.A03(iA04);
            occurrences = i;
        }
        abstractMapBasedMultiset.A00 -= occurrences;
        return i;
    }

    @Override // X.InterfaceC5026DPa
    public final Set entrySet() {
        Set set = this.A01;
        if (set != null) {
            return set;
        }
        C5031DPq c5031DPq = new C5031DPq(this);
        this.A01 = c5031DPq;
        return c5031DPq;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> elementsToRemove) {
        if (elementsToRemove instanceof InterfaceC5026DPa) {
            elementsToRemove = ((InterfaceC5026DPa) elementsToRemove).A9t();
        }
        return A9t().removeAll(elementsToRemove);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        int iA02;
        collection.getClass();
        if (!(collection instanceof InterfaceC5026DPa)) {
            if (collection.isEmpty()) {
                return false;
            }
            return AbstractC7483Exg.A01(this, collection.iterator());
        }
        InterfaceC5026DPa interfaceC5026DPa = (InterfaceC5026DPa) collection;
        if (!(interfaceC5026DPa instanceof AbstractMapBasedMultiset)) {
            if (interfaceC5026DPa.isEmpty()) {
                return false;
            }
            for (DPD dpd : interfaceC5026DPa.entrySet()) {
                A02(dpd.A01(), dpd.A00());
            }
            return true;
        }
        AbstractMapBasedMultiset abstractMapBasedMultiset = (AbstractMapBasedMultiset) interfaceC5026DPa;
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        C5034DPt<E> c5034DPt = abstractMapBasedMultiset.A01;
        if (c5034DPt instanceof DQ3) {
            iA02 = ((DQ3) c5034DPt).A00;
            if (iA02 == -2) {
                return true;
            }
        } else {
            iA02 = 0;
            if (c5034DPt.A02 == 0) {
                return true;
            }
        }
        while (iA02 >= 0) {
            Preconditions.checkElementIndex(iA02, c5034DPt.A02);
            Object obj = c5034DPt.A07[iA02];
            C5034DPt<E> c5034DPt2 = abstractMapBasedMultiset.A01;
            Preconditions.checkElementIndex(iA02, c5034DPt2.A02);
            A02(obj, c5034DPt2.A05[iA02]);
            c5034DPt = abstractMapBasedMultiset.A01;
            iA02 = c5034DPt.A02(iA02);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC5026DPa
    public final boolean contains(Object element) {
        return AnonymousClass002.A1N(A7Q(element));
    }

    @Override // java.util.Collection
    public final boolean equals(Object object) {
        return DPb.A00(this, object);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> elementsToRetain) {
        elementsToRetain.getClass();
        if (elementsToRetain instanceof InterfaceC5026DPa) {
            elementsToRetain = ((InterfaceC5026DPa) elementsToRetain).A9t();
        }
        return A9t().retainAll(elementsToRetain);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }
}
