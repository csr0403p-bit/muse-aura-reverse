package X;

import com.google.common.base.Preconditions;
import java.util.Iterator;

/* renamed from: X.GCx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9295GCx implements Iterator {
    public E A00;
    public boolean A01;
    public final Iterator<? extends E> A02;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01 || this.A02.hasNext();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [E, java.lang.Object] */
    @Override // java.util.Iterator
    public final E next() {
        if (!this.A01) {
            return this.A02.next();
        }
        E e = this.A00;
        this.A01 = false;
        this.A00 = null;
        return e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Preconditions.checkState(!this.A01, "Can't remove after you've peeked at next");
        this.A02.remove();
    }

    public C9295GCx(Iterator<? extends E> iterator) {
        iterator.getClass();
        this.A02 = iterator;
    }
}
