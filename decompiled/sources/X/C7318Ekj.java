package X;

import java.lang.ref.SoftReference;
import java.util.ArrayDeque;
import java.util.function.Supplier;

/* renamed from: X.Ekj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7318Ekj<T> {
    public final ThreadLocal<SoftReference<ArrayDeque<T>>> A00 = ThreadLocal.withInitial(new Supplier() { // from class: X.Ekk
        @Override // java.util.function.Supplier
        public final Object get() {
            return new SoftReference(BV4.A0s());
        }
    });
    public final Supplier<T> A01;

    public final T A00() {
        ThreadLocal<SoftReference<ArrayDeque<T>>> threadLocal = this.A00;
        ArrayDeque<T> arrayDequeA0s = threadLocal.get().get();
        if (arrayDequeA0s == null) {
            arrayDequeA0s = BV4.A0s();
            threadLocal.set(new SoftReference<>(arrayDequeA0s));
        }
        return !arrayDequeA0s.isEmpty() ? arrayDequeA0s.pop() : this.A01.get();
    }

    public final void A01(T t) {
        ThreadLocal<SoftReference<ArrayDeque<T>>> threadLocal = this.A00;
        ArrayDeque<T> arrayDequeA0s = threadLocal.get().get();
        if (arrayDequeA0s == null) {
            arrayDequeA0s = BV4.A0s();
            threadLocal.set(new SoftReference<>(arrayDequeA0s));
        }
        if (arrayDequeA0s.size() < 12) {
            arrayDequeA0s.push(t);
        }
    }

    public C7318Ekj(Supplier<T> supplier) {
        this.A01 = supplier;
    }
}
