package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes4.dex */
public class AH5<E> implements Iterator<E>, BOA {
    public int A00;
    public final /* synthetic */ AH7<E> A01;

    public AH5(AH7 ah7) {
        this.A01 = ah7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00 < this.A01.size();
    }

    @Override // java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        AH7<E> ah7 = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        return ah7.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j4.A10();
    }
}
