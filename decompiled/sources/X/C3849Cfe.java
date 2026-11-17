package X;

/* renamed from: X.Cfe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3849Cfe<T> implements F18<T>, CgR<T> {
    public static final Object A02 = C3cG.A0T();
    public volatile Object A00;
    public volatile F18<T> A01;

    @Override // X.F18
    /* renamed from: get */
    public final T AMN() {
        T tAMN;
        T t = (T) this.A00;
        Object obj = A02;
        if (t != obj) {
            return t;
        }
        synchronized (this) {
            tAMN = (T) this.A00;
            if (tAMN == obj) {
                tAMN = this.A01.AMN();
                Object obj2 = this.A00;
                if (obj2 != obj && obj2 != tAMN) {
                    StringBuilder sbA0f = C3cG.A0f(obj2, "Scoped provider was invoked recursively returning different results: ");
                    sbA0f.append(" & ");
                    sbA0f.append(tAMN);
                    throw BV8.A0m(". This is likely due to a circular dependency.", sbA0f);
                }
                this.A00 = tAMN;
                this.A01 = null;
            }
        }
        return tAMN;
    }
}
