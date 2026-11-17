package X;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class A3b<T> implements C3b6<T>, A3L<T> {
    public final int A00;
    public final C3b6<T> A01;

    @Override // X.A3L
    public final C3b6<T> A9l(int i) {
        int i2 = this.A00;
        return i >= i2 ? A3o.A00 : new A3d(this.A01, i, i2);
    }

    @Override // X.A3L
    public final C3b6<T> Agl(int i) {
        return i >= this.A00 ? this : new A3b(this.A01, i);
    }

    @Override // X.C3b6
    public final Iterator<T> iterator() {
        return new BT4(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public A3b(C3b6<? extends T> c3b6, int i) {
        this.A01 = c3b6;
        this.A00 = i;
        if (i < 0) {
            throw C60O.A0i(FGI.A0G("count must be non-negative, but was ", '.', i));
        }
    }
}
