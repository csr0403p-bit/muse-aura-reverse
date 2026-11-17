package X;

import com.google.common.base.Preconditions;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes5.dex */
public final class CPf<T> implements Iterator<T> {
    public boolean A00 = true;
    public final /* synthetic */ CQB A01;
    public final /* synthetic */ Iterator A02;

    public CPf(final CQB this$0, final Iterator val$iterator) {
        this.A02 = val$iterator;
        this.A01 = this$0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A02.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = (T) this.A02.next();
        this.A00 = false;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Preconditions.checkState(!this.A00, "no calls to next() since the last call to remove()");
        this.A02.remove();
    }
}
