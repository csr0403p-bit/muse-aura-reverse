package X;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.RegularImmutableSortedSet;
import java.util.Comparator;

/* loaded from: classes5.dex */
public final class DOF<E> extends DOG<E> {
    public final Comparator<? super E> A00;

    public static RegularImmutableSortedSet A00(DOF dof) {
        RegularImmutableSortedSet regularImmutableSortedSetA06 = ImmutableSortedSet.A06(dof.A00, dof.A02, ((DOI) dof).A00);
        ((DOI) dof).A00 = regularImmutableSortedSetA06.size();
        dof.A01 = true;
        return regularImmutableSortedSetA06;
    }

    public DOF(Comparator<? super E> comparator) {
        comparator.getClass();
        this.A00 = comparator;
    }

    @Override // X.DOG
    public final /* bridge */ /* synthetic */ void A02(Object element) {
        super.A02(element);
    }

    @Override // X.DOG
    public final /* bridge */ /* synthetic */ void A03(Object[] elements) {
        super.A03(elements);
    }

    /* JADX WARN: Incorrect return type in method signature: ([TE;)LX/DOF<TE;>; */
    public final void A04(Object... elements) {
        super.A03(elements);
    }

    @Override // X.DOG, X.DOI, X.DOJ
    public final /* bridge */ /* synthetic */ DOI add(Object element) {
        super.A02(element);
        return this;
    }

    @Override // X.DOG, X.DOJ
    public final /* bridge */ /* synthetic */ ImmutableCollection build() {
        return A00(this);
    }

    @Override // X.DOG, X.DOI, X.DOJ
    public final /* bridge */ /* synthetic */ DOJ add(Object element) {
        super.A02(element);
        return this;
    }

    @Override // X.DOG, X.DOI, X.DOJ
    public final /* bridge */ /* synthetic */ DOJ add(Object[] elements) {
        super.A03(elements);
        return this;
    }
}
