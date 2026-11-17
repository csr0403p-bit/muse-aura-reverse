package X;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class Ao1<E> implements Cloneable {
    public /* synthetic */ int A00;
    public /* synthetic */ int[] A01;
    public /* synthetic */ Object[] A02;

    public final int A00(int i) {
        if (i >= this.A00 || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.A01[i];
    }

    public final E A02(int i) {
        if (i >= this.A00 || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (E) this.A02[i];
    }

    public final void A03(int i, E e) {
        int i2;
        int iA00 = AbstractC1684AoN.A00(this.A01, this.A00, i);
        if (iA00 < 0) {
            iA00 ^= -1;
            int i3 = this.A00;
            if (iA00 >= i3 || this.A02[iA00] != AbstractC1674AoB.A00) {
                int[] iArr = this.A01;
                if (i3 >= iArr.length) {
                    int i4 = (i3 + 1) * 4;
                    int i5 = 4;
                    while (true) {
                        i2 = (1 << i5) - 12;
                        if (i4 <= i2) {
                            break;
                        }
                        i5++;
                        if (i5 >= 32) {
                            i2 = i4;
                            break;
                        }
                    }
                    int i6 = i2 / 4;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, i6);
                    C7384Etj.A0U(iArrCopyOf);
                    this.A01 = iArrCopyOf;
                    this.A02 = C8j3.A1a(this.A02, i6);
                }
                int i7 = this.A00;
                if (i7 - iA00 != 0) {
                    int[] iArr2 = this.A01;
                    int i8 = iA00 + 1;
                    AbstractC0903AHf.A03(iArr2, iArr2, i8, iA00, i7);
                    Object[] objArr = this.A02;
                    AbstractC0903AHf.A05(objArr, objArr, i8, iA00, this.A00);
                }
                this.A01[iA00] = i;
                this.A02[iA00] = e;
                this.A00++;
                return;
            }
            this.A01[iA00] = i;
        }
        this.A02[iA00] = e;
    }

    public final String toString() {
        int i = this.A00;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = 0;
        while (true) {
            sb.append(A00(i2));
            sb.append('=');
            E eA02 = A02(i2);
            if (eA02 != this) {
                sb.append(eA02);
            } else {
                sb.append("(this Map)");
            }
            i2++;
            if (i2 >= i) {
                return C8j3.A15(sb);
            }
            if (i2 > 0) {
                C8j3.A1K(sb);
            }
        }
    }

    public Ao1(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = (1 << i3) - 12;
            if (40 <= i2) {
                break;
            }
            i3++;
            if (i3 >= 32) {
                i2 = 40;
                break;
            }
        }
        int i4 = i2 / 4;
        this.A01 = new int[i4];
        this.A02 = new Object[i4];
    }

    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final Ao1<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        C7384Etj.A0Z(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        Ao1<E> ao1 = (Ao1) objClone;
        ao1.A01 = (int[]) this.A01.clone();
        ao1.A02 = (Object[]) this.A02.clone();
        return ao1;
    }

    public Ao1() {
        this(10);
    }
}
