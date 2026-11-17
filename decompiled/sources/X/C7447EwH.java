package X;

/* renamed from: X.EwH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7447EwH<T> implements F18<T> {
    public final F18<T> A00;
    public volatile T A01 = null;

    @Override // X.F18
    public final T get() {
        if (this.A01 != null) {
            return this.A01;
        }
        synchronized (this) {
            if (this.A01 != null) {
                return this.A01;
            }
            this.A01 = this.A00.get();
            return this.A01;
        }
    }

    public C7447EwH(F18<T> f18) {
        this.A00 = f18;
    }
}
