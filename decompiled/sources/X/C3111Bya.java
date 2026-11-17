package X;

/* renamed from: X.Bya, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3111Bya<T> implements HsC<T> {
    public int A00;
    public final Object[] A01;

    @Override // X.HsC
    public boolean AaC(T t) {
        C7384Etj.A0Y(t, 0);
        int i = this.A00;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.A01[i2] == t) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        Object[] objArr = this.A01;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.A00 = i + 1;
        return true;
    }

    @Override // X.HsC
    public T A2t() {
        int i = this.A00;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.A01;
        T t = (T) objArr[i2];
        C7384Etj.A0Z(t, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.A00--;
        return t;
    }

    public C3111Bya(int i) {
        if (i <= 0) {
            throw C60O.A0i("The max pool size must be > 0");
        }
        this.A01 = new Object[i];
    }
}
