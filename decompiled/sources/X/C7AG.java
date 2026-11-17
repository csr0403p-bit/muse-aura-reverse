package X;

import java.util.Iterator;

/* renamed from: X.7AG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7AG<T, R> implements C3b6<R> {
    public final G0U<T, R> A00;
    public final C3b6<T> A01;

    @Override // X.C3b6
    public final Iterator<R> iterator() {
        return new C7AH(this);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/3b6<+TT;>;LX/G0U<-TT;+TR;>;)V */
    public C7AG(G0U g0u, C3b6 c3b6) {
        this.A01 = c3b6;
        this.A00 = g0u;
    }
}
