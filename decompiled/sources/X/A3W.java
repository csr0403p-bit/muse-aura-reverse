package X;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class A3W<T, K> implements C3b6<T> {
    public final G0U<T, K> A00;
    public final C3b6<T> A01;

    @Override // X.C3b6
    public final Iterator<T> iterator() {
        return new A3X(this.A01.iterator(), this.A00);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/3b6<+TT;>;LX/G0U<-TT;+TK;>;)V */
    public A3W(G0U g0u, C3b6 c3b6) {
        this.A01 = c3b6;
        this.A00 = g0u;
    }
}
