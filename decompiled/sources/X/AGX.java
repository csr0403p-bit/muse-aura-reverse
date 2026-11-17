package X;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class AGX<T, R, E> implements C3b6<E> {
    public final G0U<R, Iterator<E>> A00;
    public final G0U<T, R> A01;
    public final C3b6<T> A02;

    @Override // X.C3b6
    public final Iterator<E> iterator() {
        return new BTQ(this);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/3b6<+TT;>;LX/G0U<-TT;+TR;>;LX/G0U<-TR;+Ljava/util/Iterator<+TE;>;>;)V */
    public AGX(G0U g0u, G0U g0u2, C3b6 c3b6) {
        this.A02 = c3b6;
        this.A01 = g0u;
        this.A00 = g0u2;
    }
}
