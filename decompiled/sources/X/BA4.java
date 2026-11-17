package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class BA4<T> implements Iterator<T>, BOA {
    public Iterator<? extends T> A00;
    public final List<Iterator<T>> A01 = C3cG.A0h();
    public final G0U<T, Iterator<T>> A02;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        T next = this.A00.next();
        Iterator<T> itInvoke = this.A02.invoke(next);
        if (itInvoke == null || !itInvoke.hasNext()) {
            while (!this.A00.hasNext()) {
                List<Iterator<T>> list = this.A01;
                if (list.isEmpty()) {
                    break;
                }
                this.A00 = (Iterator) AbstractC0878AGe.A0H(list);
                AbstractC0882AGj.A0p(list);
            }
        } else {
            this.A01.add(this.A00);
            this.A00 = itInvoke;
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BA4(Iterator<? extends T> it, G0U<? super T, ? extends Iterator<? extends T>> g0u) {
        this.A02 = g0u;
        this.A00 = it;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j4.A10();
    }
}
