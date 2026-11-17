package X;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.collect.SingletonImmutableSet;

/* loaded from: classes5.dex */
public class DOG<E> extends DOI<E> {
    public DOG() {
        this.A02 = new Object[4];
        this.A00 = 0;
    }

    @Override // X.DOJ
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet<E> build() {
        if (this instanceof DOF) {
            return DOF.A00((DOF) this);
        }
        int i = this.A00;
        if (i == 0) {
            return RegularImmutableSet.A05;
        }
        if (i == 1) {
            return new SingletonImmutableSet(BV6.A0n(this.A02, 0));
        }
        ImmutableSet<E> immutableSetA03 = ImmutableSet.A03(this.A02, i);
        this.A00 = immutableSetA03.size();
        this.A01 = true;
        return immutableSetA03;
    }

    /* JADX WARN: Incorrect return type in method signature: (TE;)LX/DOG<TE;>; */
    /* JADX WARN: Multi-variable type inference failed */
    public void A02(Object element) {
        element.getClass();
        super.add((DOG<E>) element);
    }

    /* JADX WARN: Incorrect return type in method signature: ([TE;)LX/DOG<TE;>; */
    /* JADX WARN: Multi-variable type inference failed */
    public void A03(Object... elements) {
        super.add(elements);
    }

    @Override // X.DOI, X.DOJ
    public /* bridge */ /* synthetic */ DOI add(Object element) {
        A02(element);
        return this;
    }

    @Override // X.DOI, X.DOJ
    public /* bridge */ /* synthetic */ DOJ add(Object element) {
        A02(element);
        return this;
    }

    @Override // X.DOI, X.DOJ
    public /* bridge */ /* synthetic */ DOJ add(Object[] elements) {
        A03(elements);
        return this;
    }
}
