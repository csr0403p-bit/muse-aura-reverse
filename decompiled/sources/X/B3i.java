package X;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class B3i<T> implements C3b6<T> {
    public final G0U<T, Boolean> A00;
    public final C3b6<T> A01;
    public final boolean A02;

    @Override // X.C3b6
    public final Iterator<T> iterator() {
        return new BTQ(this);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/3b6<+TT;>;ZLX/G0U<-TT;Ljava/lang/Boolean;>;)V */
    public B3i(G0U g0u, C3b6 c3b6, boolean z) {
        this.A01 = c3b6;
        this.A02 = z;
        this.A00 = g0u;
    }
}
