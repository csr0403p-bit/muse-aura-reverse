package X;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class A3d<T> implements C3b6<T>, A3L<T> {
    public final int A00;
    public final int A01;
    public final C3b6<T> A02;

    @Override // X.A3L
    public final C3b6<T> A9l(int i) {
        int i2 = this.A00;
        int i3 = this.A01;
        return i >= i2 - i3 ? A3o.A00 : new A3d(this.A02, i3 + i, i2);
    }

    @Override // X.A3L
    public final C3b6<T> Agl(int i) {
        int i2 = this.A00;
        int i3 = this.A01;
        return i >= i2 - i3 ? this : new A3d(this.A02, i3, i + i3);
    }

    @Override // X.C3b6
    public final Iterator<T> iterator() {
        return new BTG(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public A3d(C3b6<? extends T> c3b6, int i, int i2) {
        this.A02 = c3b6;
        this.A01 = i;
        this.A00 = i2;
        if (i < 0) {
            throw C60O.A0i(FGI.A0H("startIndex should be non-negative, but is ", i));
        }
        if (i2 < 0) {
            throw C60O.A0i(FGI.A0H("endIndex should be non-negative, but is ", i2));
        }
        if (i2 < i) {
            throw C8j3.A0v("endIndex should be not less than startIndex, but was ", " < ", i2, i);
        }
    }
}
