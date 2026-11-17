package X;

import java.util.Arrays;

/* renamed from: X.AoO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1685AoO<E> implements Cloneable {
    public /* synthetic */ int A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ long[] A02;
    public /* synthetic */ Object[] A03;

    public final long A02(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.A00)) {
            throw C60O.A0i(FGI.A0H("Expected index to be within 0..size()-1, but was ", i));
        }
        if (this.A01) {
            long[] jArr = this.A02;
            Object[] objArr = this.A03;
            int i3 = 0;
            int i4 = 0;
            do {
                Object obj = objArr[i3];
                if (obj != AbstractC1693AoX.A00) {
                    if (i3 != i4) {
                        jArr[i4] = jArr[i3];
                        objArr[i4] = obj;
                        objArr[i3] = null;
                    }
                    i4++;
                }
                i3++;
            } while (i3 < i2);
            this.A01 = false;
            this.A00 = i4;
        }
        return this.A02[i];
    }

    public final E A03(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.A00)) {
            throw C60O.A0i(FGI.A0H("Expected index to be within 0..size()-1, but was ", i));
        }
        if (this.A01) {
            long[] jArr = this.A02;
            Object[] objArr = this.A03;
            int i3 = 0;
            int i4 = 0;
            do {
                Object obj = objArr[i3];
                if (obj != AbstractC1693AoX.A00) {
                    if (i3 != i4) {
                        jArr[i4] = jArr[i3];
                        objArr[i4] = obj;
                        objArr[i3] = null;
                    }
                    i4++;
                }
                i3++;
            } while (i3 < i2);
            this.A01 = false;
            this.A00 = i4;
        }
        return (E) this.A03[i];
    }

    public final void A06(int i, E e) {
        int i2;
        if (i < 0 || i >= (i2 = this.A00)) {
            throw C60O.A0i(FGI.A0H("Expected index to be within 0..size()-1, but was ", i));
        }
        if (this.A01) {
            long[] jArr = this.A02;
            Object[] objArr = this.A03;
            int i3 = 0;
            int i4 = 0;
            do {
                Object obj = objArr[i3];
                if (obj != AbstractC1693AoX.A00) {
                    if (i3 != i4) {
                        jArr[i4] = jArr[i3];
                        objArr[i4] = obj;
                        objArr[i3] = null;
                    }
                    i4++;
                }
                i3++;
            } while (i3 < i2);
            this.A01 = false;
            this.A00 = i4;
        }
        this.A03[i] = e;
    }

    public final int A00() {
        if (this.A01) {
            int i = this.A00;
            long[] jArr = this.A02;
            Object[] objArr = this.A03;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC1693AoX.A00) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.A01 = false;
            this.A00 = i2;
        }
        return this.A00;
    }

    public final int A01(long j) {
        if (this.A01) {
            int i = this.A00;
            long[] jArr = this.A02;
            Object[] objArr = this.A03;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC1693AoX.A00) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.A01 = false;
            this.A00 = i2;
        }
        return AbstractC1684AoN.A01(this.A02, this.A00, j);
    }

    public final E A04(long j) {
        E e;
        int iA01 = AbstractC1684AoN.A01(this.A02, this.A00, j);
        if (iA01 < 0 || (e = (E) this.A03[iA01]) == AbstractC1693AoX.A00) {
            return null;
        }
        return e;
    }

    public final void A05() {
        int i = this.A00;
        Object[] objArr = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.A00 = 0;
        this.A01 = false;
    }

    public final void A07(long j) {
        int iA01 = AbstractC1684AoN.A01(this.A02, this.A00, j);
        if (iA01 >= 0) {
            Object[] objArr = this.A03;
            Object obj = objArr[iA01];
            Object obj2 = AbstractC1693AoX.A00;
            if (obj != obj2) {
                objArr[iA01] = obj2;
                this.A01 = true;
            }
        }
    }

    public final void A08(long j, E e) {
        int i;
        int iA01 = AbstractC1684AoN.A01(this.A02, this.A00, j);
        if (iA01 < 0) {
            iA01 ^= -1;
            int i2 = this.A00;
            if (iA01 >= i2 || this.A03[iA01] != AbstractC1693AoX.A00) {
                if (this.A01) {
                    long[] jArr = this.A02;
                    if (i2 >= jArr.length) {
                        Object[] objArr = this.A03;
                        int i3 = 0;
                        for (int i4 = 0; i4 < i2; i4++) {
                            Object obj = objArr[i4];
                            if (obj != AbstractC1693AoX.A00) {
                                if (i4 != i3) {
                                    jArr[i3] = jArr[i4];
                                    objArr[i3] = obj;
                                    objArr[i4] = null;
                                }
                                i3++;
                            }
                        }
                        this.A01 = false;
                        this.A00 = i3;
                        iA01 = AbstractC1684AoN.A01(jArr, i3, j) ^ (-1);
                    }
                }
                int i5 = this.A00;
                long[] jArr2 = this.A02;
                if (i5 >= jArr2.length) {
                    int i6 = (i5 + 1) * 8;
                    int i7 = 4;
                    while (true) {
                        i = (1 << i7) - 12;
                        if (i6 <= i) {
                            break;
                        }
                        i7++;
                        if (i7 >= 32) {
                            i = i6;
                            break;
                        }
                    }
                    int i8 = i / 8;
                    long[] jArrCopyOf = Arrays.copyOf(jArr2, i8);
                    C7384Etj.A0U(jArrCopyOf);
                    this.A02 = jArrCopyOf;
                    Object[] objArrCopyOf = Arrays.copyOf(this.A03, i8);
                    C7384Etj.A0U(objArrCopyOf);
                    this.A03 = objArrCopyOf;
                }
                int i9 = this.A00;
                if (i9 - iA01 != 0) {
                    long[] jArr3 = this.A02;
                    int i10 = iA01 + 1;
                    C7384Etj.A0Y(jArr3, 0);
                    System.arraycopy(jArr3, iA01, jArr3, i10, i9 - iA01);
                    Object[] objArr2 = this.A03;
                    AbstractC0903AHf.A05(objArr2, objArr2, i10, iA01, this.A00);
                }
                this.A02[iA01] = j;
                this.A03[iA01] = e;
                this.A00++;
                return;
            }
            this.A02[iA01] = j;
        }
        this.A03[iA01] = e;
    }

    public C1685AoO(int i) {
        int i2;
        Object[] objArr;
        if (i == 0) {
            this.A02 = AbstractC1684AoN.A01;
            objArr = AbstractC1684AoN.A02;
        } else {
            int i3 = i * 8;
            int i4 = 4;
            while (true) {
                i2 = (1 << i4) - 12;
                if (i3 <= i2) {
                    break;
                }
                i4++;
                if (i4 >= 32) {
                    i2 = i3;
                    break;
                }
            }
            int i5 = i2 / 8;
            this.A02 = new long[i5];
            objArr = new Object[i5];
        }
        this.A03 = objArr;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        C7384Etj.A0Z(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C1685AoO c1685AoO = (C1685AoO) objClone;
        c1685AoO.A02 = (long[]) this.A02.clone();
        c1685AoO.A03 = (Object[]) this.A03.clone();
        return c1685AoO;
    }

    public final String toString() {
        if (A00() <= 0) {
            return "{}";
        }
        int i = this.A00;
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                C8j3.A1K(sb);
            }
            sb.append(A02(i2));
            sb.append('=');
            E eA03 = A03(i2);
            if (eA03 != sb) {
                sb.append(eA03);
            } else {
                sb.append("(this Map)");
            }
        }
        return C8j3.A15(sb);
    }

    public C1685AoO() {
        this(10);
    }
}
