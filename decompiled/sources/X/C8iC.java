package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.8iC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iC implements Iterator, BOA {
    public final int $t;
    public int A00;
    public Object A01;
    public final Object A02;

    public C8iC(C7AI<T, R> c7ai) {
        this.$t = 1;
        this.A02 = c7ai;
        this.A01 = c7ai.A01.iterator();
    }

    private final void A00() {
        Object objInvoke;
        int i = this.A00;
        C79x c79x = (C79x) this.A02;
        if (i == -2) {
            objInvoke = c79x.A00.invoke();
        } else {
            G0U<T, T> g0u = c79x.A01;
            Object obj = this.A01;
            C7384Etj.A0X(obj);
            objInvoke = g0u.invoke(obj);
        }
        this.A01 = objInvoke;
        this.A00 = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.$t != 0) {
            return ((Iterator) this.A01).hasNext();
        }
        if (this.A00 < 0) {
            A00();
        }
        return this.A00 == 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.Object] */
    @Override // java.util.Iterator
    public final T next() {
        if (this.$t != 0) {
            G0V<Integer, T, R> g0v = ((C7AI) this.A02).A00;
            int i = this.A00;
            this.A00 = i + 1;
            if (i >= 0) {
                return g0v.invoke(Integer.valueOf(i), ((Iterator) this.A01).next());
            }
            AbstractC0885AGm.A14();
            throw F60.createAndThrow();
        }
        if (this.A00 < 0) {
            A00();
        }
        if (this.A00 == 0) {
            throw new NoSuchElementException();
        }
        ?? r1 = this.A01;
        C7384Etj.A0Z(r1, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.A00 = -1;
        return r1;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.$t;
        throw new UnsupportedOperationException(C8j2.A00(0));
    }

    public C8iC(C79x<T> c79x) {
        this.$t = 0;
        this.A02 = c79x;
        this.A00 = -2;
    }
}
