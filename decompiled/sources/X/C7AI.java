package X;

import java.util.Iterator;

/* renamed from: X.7AI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7AI<T, R> implements C3b6<R> {
    public final G0V<Integer, T, R> A00;
    public final C3b6<T> A01;

    @Override // X.C3b6
    public final Iterator<R> iterator() {
        return new C8iC(this);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/3b6<+TT;>;LX/G0V<-Ljava/lang/Integer;-TT;+TR;>;)V */
    public C7AI(G0V g0v, C3b6 c3b6) {
        this.A01 = c3b6;
        this.A00 = g0v;
    }
}
