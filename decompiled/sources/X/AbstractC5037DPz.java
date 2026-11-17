package X;

import com.google.common.collect.BoundType;
import com.google.common.collect.Multisets$ImmutableEntry;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.TreeMultiset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* renamed from: X.DPz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5037DPz<E> extends DPj<E> implements DQ1<E> {
    public transient DQ1<E> A00;
    public final Comparator<? super E> comparator;

    @Override // X.DQ1
    public final DQ1<E> A8u() {
        DQ1<E> dq1 = this.A00;
        if (dq1 != null) {
            return dq1;
        }
        C5036DPy c5036DPy = new C5036DPy(this);
        this.A00 = c5036DPy;
        return c5036DPy;
    }

    @Override // X.DQ1
    public final DPD ABd() {
        Iterator f5p = this instanceof TreeMultiset ? new F5P((TreeMultiset) this, 2) : new DQ6(null);
        if (f5p.hasNext()) {
            return (DPD) f5p.next();
        }
        return null;
    }

    @Override // X.DQ1
    public final DPD APT() {
        F5P f5p = new F5P((TreeMultiset) this, 3);
        if (f5p.hasNext()) {
            return (DPD) f5p.next();
        }
        return null;
    }

    @Override // X.DQ1
    public final DPD AY1() {
        Iterator f5p = this instanceof TreeMultiset ? new F5P((TreeMultiset) this, 2) : new DQ6(null);
        if (!f5p.hasNext()) {
            return null;
        }
        DPD dpd = (DPD) f5p.next();
        Multisets$ImmutableEntry multisets$ImmutableEntry = new Multisets$ImmutableEntry(dpd.A01(), dpd.A00());
        f5p.remove();
        return multisets$ImmutableEntry;
    }

    @Override // X.DQ1
    public final DPD AY2() {
        F5P f5p = new F5P((TreeMultiset) this, 3);
        if (!f5p.hasNext()) {
            return null;
        }
        DPD dpd = (DPD) f5p.next();
        Multisets$ImmutableEntry multisets$ImmutableEntry = new Multisets$ImmutableEntry(dpd.A01(), dpd.A00());
        f5p.remove();
        return multisets$ImmutableEntry;
    }

    @Override // X.DQ1, X.InterfaceC7431Evo
    public final Comparator<? super E> comparator() {
        return this.comparator;
    }

    public AbstractC5037DPz(Comparator<? super E> comparator) {
        comparator.getClass();
        this.comparator = comparator;
    }

    @Override // X.DPj, X.InterfaceC5026DPa
    /* renamed from: A9s, reason: merged with bridge method [inline-methods] */
    public final NavigableSet<E> A9t() {
        return (NavigableSet) super.A9t();
    }

    /* JADX WARN: Incorrect types in method signature: (TE;Lcom/google/common/collect/BoundType;TE;Lcom/google/common/collect/BoundType;)LX/DQ1<TE;>; */
    @Override // X.DQ1
    public final DQ1 AgY(BoundType fromElement, BoundType fromBoundType, Object toElement, Object toBoundType) {
        fromElement.getClass();
        fromBoundType.getClass();
        return Agk(fromElement, toElement).ANM(fromBoundType, toBoundType);
    }

    public AbstractC5037DPz() {
        this(NaturalOrdering.A00);
    }
}
