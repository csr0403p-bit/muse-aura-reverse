package X;

import java.util.ConcurrentModificationException;

/* loaded from: classes5.dex */
public final class DQK<T> {
    public T A00;

    public final void A00(T expected, T newValue) {
        if (this.A00 != expected) {
            throw new ConcurrentModificationException();
        }
        this.A00 = newValue;
    }
}
