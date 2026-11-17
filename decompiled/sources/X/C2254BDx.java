package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.BDx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2254BDx<T> {
    public T A00;
    public final AtomicReference<C2256BDz> A02 = new AtomicReference<>(BE0.A00);
    public final Object A01 = C3cG.A0T();

    public final T A00() {
        long id = Thread.currentThread().getId();
        if (id == AbstractC2255BDy.A00) {
            return this.A00;
        }
        C2256BDz c2256BDz = this.A02.get();
        int iA00 = C2256BDz.A00(c2256BDz, id);
        if (iA00 >= 0) {
            return (T) c2256BDz.A02[iA00];
        }
        return null;
    }

    public final void A01(T t) {
        long id = Thread.currentThread().getId();
        if (id == AbstractC2255BDy.A00) {
            this.A00 = t;
            return;
        }
        synchronized (this.A01) {
            AtomicReference<C2256BDz> atomicReference = this.A02;
            C2256BDz c2256BDz = atomicReference.get();
            int iA00 = C2256BDz.A00(c2256BDz, id);
            if (iA00 < 0) {
                int i = c2256BDz.A00;
                Object[] objArr = c2256BDz.A02;
                int i2 = 0;
                int i3 = 0;
                for (Object obj : objArr) {
                    if (obj != null) {
                        i3++;
                    }
                }
                int i4 = i3 + 1;
                long[] jArr = new long[i4];
                Object[] objArr2 = new Object[i4];
                if (i4 > 1) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i) {
                            break;
                        }
                        long j = c2256BDz.A01[i5];
                        Object obj2 = objArr[i5];
                        if (j > id) {
                            jArr[i2] = id;
                            objArr2[i2] = t;
                            i2++;
                            break;
                        } else {
                            if (obj2 != null) {
                                jArr[i2] = j;
                                objArr2[i2] = obj2;
                                i2++;
                            }
                            i5++;
                            if (i2 >= i4) {
                                break;
                            }
                        }
                    }
                    if (i5 == i) {
                        jArr[i3] = id;
                        objArr2[i3] = t;
                    } else {
                        while (i2 < i4) {
                            long j2 = c2256BDz.A01[i5];
                            Object obj3 = objArr[i5];
                            if (obj3 != null) {
                                jArr[i2] = j2;
                                objArr2[i2] = obj3;
                                i2++;
                            }
                            i5++;
                        }
                    }
                } else {
                    jArr[0] = id;
                    objArr2[0] = t;
                }
                atomicReference.set(new C2256BDz(jArr, objArr2, i4));
            } else {
                c2256BDz.A02[iA00] = t;
            }
        }
    }
}
