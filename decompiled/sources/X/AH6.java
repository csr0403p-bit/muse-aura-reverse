package X;

import java.util.ListIterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes4.dex */
public final class AH6<E> extends AH7<E>.IteratorImpl implements ListIterator<E>, BOA {
    public final /* synthetic */ AH7<E> A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AH6(AH7 ah7, int i) {
        super(ah7);
        this.A00 = ah7;
        AH7.A02(i, ah7.size());
        this.A00 = i;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return AnonymousClass002.A1N(this.A00);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A00;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A00 - 1;
    }

    @Override // java.util.ListIterator
    public final void add(E e) {
        throw C8j4.A10();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw C8j3.A1D();
        }
        AH7<E> ah7 = this.A00;
        int i = this.A00 - 1;
        this.A00 = i;
        return ah7.get(i);
    }

    @Override // java.util.ListIterator
    public final void set(E e) {
        throw C8j4.A10();
    }
}
