package X;

import com.google.common.collect.ImmutableCollection;

/* loaded from: classes5.dex */
public abstract class DOJ<E> {
    public abstract DOJ<E> add(E element);

    public DOJ<E> add(E... elements) {
        for (E e : elements) {
            add((DOJ<E>) e);
        }
        return this;
    }

    public abstract ImmutableCollection<E> build();

    public static int A02(int oldCapacity, int minCapacity) {
        if (minCapacity < 0) {
            throw C60O.A0i("cannot store more than Integer.MAX_VALUE elements");
        }
        if (minCapacity <= oldCapacity) {
            return oldCapacity;
        }
        int i = oldCapacity + (oldCapacity >> 1) + 1;
        if (i >= minCapacity) {
            return i;
        }
        int iHighestOneBit = Integer.highestOneBit(minCapacity - 1) << 1;
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }
}
