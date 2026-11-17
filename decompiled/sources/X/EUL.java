package X;

import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public final class EUL<T> {
    public int A00;
    public long A01;
    public T[] A02;
    public final int A03;
    public final int A04;
    public final DK9 A05;
    public final int A06;
    public final EUQ A07;
    public final Class<T> A08;

    public final synchronized T A01() {
        T t;
        int i = this.A00;
        if (i > 0) {
            int i2 = i - 1;
            this.A00 = i2;
            T[] tArr = this.A02;
            t = tArr[i2];
            tArr[i2] = null;
        } else {
            t = (T) this.A07.A00();
        }
        this.A07.A01(t);
        return t;
    }

    public final synchronized void A02(T t) {
        long jNow = this.A05.now();
        int i = this.A00;
        int i2 = this.A03;
        if (i < i2 * 2) {
            this.A01 = jNow;
        }
        if (jNow - this.A01 > 60000) {
            int length = this.A02.length;
            int iMax = Math.max(length - i2, this.A04);
            if (iMax != length) {
                A00(iMax);
            }
        }
        this.A07.A02(t);
        int i3 = this.A00;
        int i4 = this.A06;
        if (i3 < i4) {
            int i5 = i3 + 1;
            int length2 = this.A02.length;
            if (i5 > length2) {
                A00(Math.min(i4, length2 + i2));
            }
            T[] tArr = this.A02;
            int i6 = this.A00;
            this.A00 = i6 + 1;
            tArr[i6] = t;
        }
    }

    public EUL(EUQ euq, DK9 dk9, Class cls) {
        this.A08 = cls;
        int iMax = Math.max(16, 0);
        this.A04 = iMax;
        this.A06 = Math.max(iMax, 1024);
        this.A03 = Math.max(16, 1);
        this.A07 = euq;
        this.A05 = dk9;
        this.A02 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, iMax));
    }

    private void A00(int i) {
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) this.A08, i));
        T[] tArr2 = this.A02;
        System.arraycopy(tArr2, 0, tArr, 0, Math.min(tArr2.length, i));
        this.A02 = tArr;
        this.A00 = Math.min(this.A00, i);
    }
}
