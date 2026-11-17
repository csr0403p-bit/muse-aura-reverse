package X;

/* renamed from: X.GoM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10042GoM<T> {
    public int A00;
    public C10114Gpf<T> A01;
    public C10114Gpf<T> A02;
    public T A03;

    /* JADX WARN: Multi-variable type inference failed */
    private final T A01(int i) {
        return this instanceof C10167Gqc ? (T) new short[i] : this instanceof C10168Gqd ? (T) new long[i] : this instanceof C10169Gqe ? (T) new int[i] : this instanceof C10170Gqf ? (T) new float[i] : this instanceof C10171Gqg ? (T) new double[i] : this instanceof C10172Gqh ? (T) new byte[i] : (T) new boolean[i];
    }

    public final T A00() {
        C10114Gpf<T> c10114Gpf = this.A02;
        if (c10114Gpf != null) {
            this.A03 = c10114Gpf.A02;
        }
        this.A02 = null;
        this.A01 = null;
        this.A00 = 0;
        T t = this.A03;
        return t == null ? A01(12) : t;
    }

    public final T A02(T t, int i) {
        C10114Gpf<T> c10114Gpf = new C10114Gpf<>(t, i);
        if (this.A01 == null) {
            this.A02 = c10114Gpf;
            this.A01 = c10114Gpf;
        } else {
            C10114Gpf<T> c10114Gpf2 = this.A02;
            if (c10114Gpf2.A00 != null) {
                throw new IllegalStateException();
            }
            c10114Gpf2.A00 = c10114Gpf;
            this.A02 = c10114Gpf;
        }
        this.A00 += i;
        int i2 = i + i;
        if (i >= 16384) {
            i2 = (i >> 2) + i;
        }
        return A01(i2);
    }

    public final T A03(T t, int i) {
        int i2 = this.A00 + i;
        T tA01 = A01(i2);
        int i3 = 0;
        for (C10114Gpf<T> c10114Gpf = this.A01; c10114Gpf != null; c10114Gpf = c10114Gpf.A00) {
            T t2 = c10114Gpf.A02;
            int i4 = c10114Gpf.A01;
            System.arraycopy(t2, 0, tA01, i3, i4);
            i3 += i4;
        }
        System.arraycopy(t, 0, tA01, i3, i);
        int i5 = i3 + i;
        if (i5 == i2) {
            return tA01;
        }
        throw C3cG.A0Q(FGI.A0T("Should have gotten ", " entries, got ", i2, i5));
    }
}
