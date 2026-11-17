package X;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class A3X<T, K> extends AbstractC7470ExA<T> {
    public final HashSet<K> A00;
    public final Iterator<T> A01;
    public final G0U<T, K> A02;

    /* JADX WARN: Multi-variable type inference failed */
    public A3X(Iterator<? extends T> it, G0U<? super T, ? extends K> g0u) {
        C7384Etj.A0Y(it, 0);
        this.A01 = it;
        this.A02 = g0u;
        this.A00 = new HashSet<>();
    }

    @Override // X.AbstractC7470ExA
    public final void A00() {
        int i;
        while (true) {
            Iterator<T> it = this.A01;
            if (!it.hasNext()) {
                i = 2;
                break;
            }
            T next = it.next();
            if (this.A00.add(this.A02.invoke(next))) {
                super.A01 = next;
                i = 1;
                break;
            }
        }
        super.A00 = i;
    }
}
