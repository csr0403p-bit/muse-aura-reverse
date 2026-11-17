package com.google.common.collect;

import X.AbstractC3830CfJ;
import X.AbstractC5037DPz;
import X.BV4;
import X.BV6;
import X.DPC;
import X.DPE;
import X.DQ1;
import X.DQF;
import X.DQK;
import X.DX6;
import X.F5P;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class TreeMultiset<E> extends AbstractC5037DPz<E> implements Serializable {
    public static final long serialVersionUID = 1;
    public final transient GeneralRange<E> A00;
    public final transient DQF<E> A01;
    public final transient DQK<DQF<E>> A02;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public abstract class Aggregate {
        public static final /* synthetic */ Aggregate[] A00;
        public static final Aggregate A01;
        public static final Aggregate A02;

        static {
            Aggregate aggregate = new Aggregate() { // from class: com.google.common.collect.TreeMultiset.Aggregate.1
            };
            A02 = aggregate;
            Aggregate aggregate2 = new Aggregate() { // from class: com.google.common.collect.TreeMultiset.Aggregate.2
            };
            A01 = aggregate2;
            A00 = new Aggregate[]{aggregate, aggregate2};
        }

        public static Aggregate valueOf(String name) {
            return (Aggregate) Enum.valueOf(Aggregate.class, name);
        }

        public static Aggregate[] values() {
            return (Aggregate[]) A00.clone();
        }

        public final long A00(DQF<?> root) {
            if (this instanceof AnonymousClass2) {
                if (root != null) {
                    return root.A00;
                }
                return 0L;
            }
            if (root != null) {
                return root.A03;
            }
            return 0L;
        }

        public Aggregate(String $enum$name, int $enum$ordinal) {
        }
    }

    public TreeMultiset(Comparator<? super E> comparator) {
        super(comparator);
        BoundType boundType = BoundType.OPEN;
        this.A00 = new GeneralRange<>(boundType, boundType, null, null, comparator, false, false);
        DQF<E> dqf = new DQF<>();
        this.A01 = dqf;
        dqf.A07 = dqf;
        dqf.A05 = dqf;
        this.A02 = new DQK<>();
    }

    @Override // X.InterfaceC5026DPa
    public final int A7Q(Object element) {
        try {
            DQF<E> dqf = this.A02.A00;
            if (this.A00.A01(element) && dqf != null) {
                return dqf.A0A(element, this.comparator);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    public static long A00(Aggregate aggregate, DQF dqf, TreeMultiset treeMultiset) {
        long jA00;
        long jA002;
        if (dqf == null) {
            return 0L;
        }
        Comparator<? super E> comparator = treeMultiset.comparator;
        GeneralRange<E> generalRange = treeMultiset.A00;
        int iCompare = comparator.compare(generalRange.upperEndpoint, dqf.A08);
        if (iCompare > 0) {
            return A00(aggregate, dqf.A06, treeMultiset);
        }
        if (iCompare == 0) {
            int iOrdinal = generalRange.upperBoundType.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    return aggregate.A00(dqf.A06);
                }
                throw BV6.A0f();
            }
            jA00 = aggregate instanceof Aggregate.AnonymousClass2 ? 1 : dqf.A01;
            jA002 = aggregate.A00(dqf.A06);
        } else {
            jA00 = aggregate.A00(dqf.A06) + (aggregate instanceof Aggregate.AnonymousClass2 ? 1 : dqf.A01);
            jA002 = A00(aggregate, dqf.A04, treeMultiset);
        }
        return jA00 + jA002;
    }

    public static long A01(Aggregate aggregate, DQF dqf, TreeMultiset treeMultiset) {
        long jA00;
        long jA01;
        if (dqf == null) {
            return 0L;
        }
        Comparator<? super E> comparator = treeMultiset.comparator;
        GeneralRange<E> generalRange = treeMultiset.A00;
        int iCompare = comparator.compare(generalRange.lowerEndpoint, dqf.A08);
        if (iCompare < 0) {
            return A01(aggregate, dqf.A04, treeMultiset);
        }
        if (iCompare == 0) {
            int iOrdinal = generalRange.lowerBoundType.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    return aggregate.A00(dqf.A04);
                }
                throw BV6.A0f();
            }
            jA00 = aggregate instanceof Aggregate.AnonymousClass2 ? 1 : dqf.A01;
            jA01 = aggregate.A00(dqf.A04);
        } else {
            jA00 = aggregate.A00(dqf.A04) + (aggregate instanceof Aggregate.AnonymousClass2 ? 1 : dqf.A01);
            jA01 = A01(aggregate, dqf.A06, treeMultiset);
        }
        return jA00 + jA01;
    }

    /* JADX WARN: Incorrect types in method signature: (TE;Lcom/google/common/collect/BoundType;)LX/DQ1<TE;>; */
    @Override // X.DQ1
    public final DQ1 ANM(BoundType upperBound, Object boundType) {
        return new TreeMultiset(this.A00.A00(new GeneralRange<>(BoundType.OPEN, upperBound, null, boundType, this.comparator, false, true)), this.A01, this.A02);
    }

    @Override // X.DPj, X.InterfaceC5026DPa
    public final int AaU(Object element, int occurrences) {
        AbstractC3830CfJ.A00(occurrences, "occurrences");
        if (occurrences == 0) {
            return A7Q(element);
        }
        DQK<DQF<E>> dqk = this.A02;
        DQF<E> dqf = dqk.A00;
        int[] iArr = new int[1];
        try {
            if (this.A00.A01(element) && dqf != null) {
                dqk.A00(dqf, dqf.A0D(element, this.comparator, iArr, occurrences));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // X.InterfaceC5026DPa
    public final boolean AdC(E element, int oldCount, int newCount) {
        AbstractC3830CfJ.A00(newCount, "newCount");
        AbstractC3830CfJ.A00(oldCount, "oldCount");
        Preconditions.checkArgument(this.A00.A01(element));
        DQK<DQF<E>> dqk = this.A02;
        DQF<E> dqf = dqk.A00;
        if (dqf != null) {
            int[] iArr = new int[1];
            dqk.A00(dqf, dqf.A0E(element, this.comparator, iArr, oldCount, newCount));
            if (iArr[0] == oldCount) {
                return true;
            }
        } else if (oldCount == 0) {
            if (newCount > 0) {
                A02(element, newCount);
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: (TE;Lcom/google/common/collect/BoundType;)LX/DQ1<TE;>; */
    @Override // X.DQ1
    public final DQ1 Agk(BoundType lowerBound, Object boundType) {
        return new TreeMultiset(this.A00.A00(new GeneralRange<>(lowerBound, BoundType.OPEN, boundType, null, this.comparator, true, false)), this.A01, this.A02);
    }

    @Override // X.DPj, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        GeneralRange<E> generalRange = this.A00;
        if (generalRange.hasLowerBound || generalRange.hasUpperBound) {
            F5P f5p = new F5P(this, 2);
            while (f5p.hasNext()) {
                f5p.next();
                f5p.remove();
            }
            return;
        }
        DQF<E> dqf = this.A01;
        DQF<E> dqf2 = dqf.A07;
        dqf2.getClass();
        while (true) {
            DQF<E> dqf3 = dqf2;
            if (dqf2 == dqf) {
                dqf.A07 = dqf;
                dqf.A05 = dqf;
                this.A02.A00 = null;
                return;
            } else {
                dqf2 = dqf2.A07;
                dqf2.getClass();
                dqf3.A01 = 0;
                dqf3.A04 = null;
                dqf3.A06 = null;
                dqf3.A05 = null;
                dqf3.A07 = null;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC5026DPa
    public final int size() {
        Aggregate aggregate = Aggregate.A02;
        DQF<E> dqf = this.A02.A00;
        long jA00 = aggregate.A00(dqf);
        GeneralRange<E> generalRange = this.A00;
        if (generalRange.hasLowerBound) {
            jA00 -= A01(aggregate, dqf, this);
        }
        if (generalRange.hasUpperBound) {
            jA00 -= A00(aggregate, dqf, this);
        }
        return DX6.A01(jA00);
    }

    private void readObject(ObjectInputStream stream) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, IOException, SecurityException, IllegalArgumentException {
        stream.defaultReadObject();
        Object object = stream.readObject();
        object.getClass();
        Comparator comparator = (Comparator) object;
        try {
            Field declaredField = AbstractC5037DPz.class.getDeclaredField("comparator");
            declaredField.setAccessible(true);
            try {
                declaredField.set(this, comparator);
                try {
                    Field fieldA0r = BV4.A0r(TreeMultiset.class, "range");
                    BoundType boundType = BoundType.OPEN;
                    try {
                        fieldA0r.set(this, new GeneralRange(boundType, boundType, null, null, comparator, false, false));
                        try {
                            try {
                                BV4.A0r(TreeMultiset.class, "rootReference").set(this, new DQK());
                                DQF<E> dqf = new DQF<>();
                                try {
                                    try {
                                        BV4.A0r(TreeMultiset.class, "header").set(this, dqf);
                                        dqf.A07 = dqf;
                                        dqf.A05 = dqf;
                                        int i = stream.readInt();
                                        for (int i2 = 0; i2 < i; i2++) {
                                            A02(stream.readObject(), stream.readInt());
                                        }
                                    } catch (IllegalAccessException e) {
                                        throw BV4.A0N(e);
                                    }
                                } catch (NoSuchFieldException e2) {
                                    throw BV4.A0N(e2);
                                }
                            } catch (IllegalAccessException e3) {
                                throw BV4.A0N(e3);
                            }
                        } catch (NoSuchFieldException e4) {
                            throw BV4.A0N(e4);
                        }
                    } catch (IllegalAccessException e5) {
                        throw BV4.A0N(e5);
                    }
                } catch (NoSuchFieldException e6) {
                    throw BV4.A0N(e6);
                }
            } catch (IllegalAccessException e7) {
                throw BV4.A0N(e7);
            }
        } catch (NoSuchFieldException e8) {
            throw BV4.A0N(e8);
        }
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(A9t().comparator());
        DPC.A02(this, stream);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new DPE(this, entrySet().iterator());
    }

    /* JADX WARN: Incorrect types in method signature: (LX/DQK<LX/DQF<TE;>;>;Lcom/google/common/collect/GeneralRange<TE;>;LX/DQF<TE;>;)V */
    public TreeMultiset(GeneralRange rootReference, DQF range, DQK endLink) {
        super(rootReference.comparator);
        this.A02 = endLink;
        this.A00 = rootReference;
        this.A01 = range;
    }
}
