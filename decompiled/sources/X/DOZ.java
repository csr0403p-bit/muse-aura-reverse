package X;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableEntry;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class DOZ<F, T> implements Iterator<T> {
    public final Iterator<? extends F> A00;

    /* JADX WARN: Multi-variable type inference failed */
    public final T A00(F f) {
        Function<? super F, ? extends T> function;
        if (this instanceof DPF) {
            function = ((DPF) this).A00.function;
        } else {
            if (!(this instanceof DPG)) {
                if (0 == 0) {
                    if (this instanceof F4F) {
                        F4F f4f = (F4F) this;
                        return f4f.$t != 0 ? (T) new DOU(f4f, (Map.Entry) f) : (T) new ImmutableEntry(f, ((Function) f4f.A00).apply(f));
                    }
                    switch (((F4E) this).$t) {
                        case 0:
                            return (T) ((Map.Entry) f).getKey();
                        case 1:
                            break;
                        default:
                            return (T) ((DPD) f).A01();
                    }
                }
                return (T) ((Map.Entry) f).getValue();
            }
            function = ((DPG) this).A00.function;
        }
        return function.apply(f);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return A00(this.A00.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A00.remove();
    }

    public DOZ(Iterator<? extends F> backingIterator) {
        backingIterator.getClass();
        this.A00 = backingIterator;
    }
}
