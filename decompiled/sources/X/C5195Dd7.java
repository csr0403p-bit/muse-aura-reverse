package X;

/* renamed from: X.Dd7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5195Dd7<V> {
    public final V A00;
    public final Throwable A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5195Dd7)) {
                return false;
            }
            C5195Dd7 c5195Dd7 = (C5195Dd7) obj;
            V v = this.A00;
            if (v == null || !v.equals(c5195Dd7.A00)) {
                Throwable th = this.A01;
                if (th == null || c5195Dd7.A01 == null) {
                    return false;
                }
                return th.toString().equals(th.toString());
            }
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0D(this.A00, this.A01);
    }

    public C5195Dd7(V v) {
        this.A00 = v;
        this.A01 = null;
    }

    public C5195Dd7(Throwable th) {
        this.A01 = th;
        this.A00 = null;
    }
}
