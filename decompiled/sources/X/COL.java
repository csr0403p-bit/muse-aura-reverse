package X;

/* loaded from: classes5.dex */
public final class COL extends CO4 {
    public static final Object A01 = C3cG.A0T();
    public Object A00;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AnonymousClass006.A1Z(this.A00, A01);
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.A00;
        Object obj2 = A01;
        if (obj == obj2) {
            throw C8j3.A1D();
        }
        this.A00 = obj2;
        return obj;
    }
}
