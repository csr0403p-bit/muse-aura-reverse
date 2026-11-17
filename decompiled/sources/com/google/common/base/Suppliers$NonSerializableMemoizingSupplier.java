package com.google.common.base;

import X.AnonymousClass001;
import X.BV7;
import X.C3cG;
import X.C4456CwY;
import X.C60O;

/* loaded from: classes5.dex */
public class Suppliers$NonSerializableMemoizingSupplier<T> implements Supplier<T> {
    public static final Supplier<Void> SUCCESSFULLY_COMPUTED = new C4456CwY(6);
    public volatile Supplier<T> delegate;
    public final Object lock = C3cG.A0T();
    public T value;

    @Override // com.google.common.base.Supplier
    public T get() {
        Supplier<T> supplier = this.delegate;
        Supplier<T> supplier2 = (Supplier<T>) SUCCESSFULLY_COMPUTED;
        if (supplier != supplier2) {
            synchronized (this.lock) {
                if (this.delegate != supplier2) {
                    T t = this.delegate.get();
                    this.value = t;
                    this.delegate = supplier2;
                    return t;
                }
            }
        }
        return this.value;
    }

    public String toString() {
        Object objA0v = this.delegate;
        StringBuilder sbA0x = C60O.A0x("Suppliers.memoize(");
        if (objA0v == SUCCESSFULLY_COMPUTED) {
            StringBuilder sbA0x2 = C60O.A0x("<supplier that returned ");
            sbA0x2.append(this.value);
            objA0v = AnonymousClass001.A0v(">", sbA0x2);
        }
        sbA0x.append(objA0v);
        return BV7.A10(sbA0x);
    }

    public Suppliers$NonSerializableMemoizingSupplier(Supplier<T> delegate) {
        this.delegate = delegate;
    }
}
