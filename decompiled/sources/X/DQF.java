package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multisets$ImmutableEntry;
import java.util.Comparator;

/* loaded from: classes5.dex */
public final class DQF<E> {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public DQF<E> A04;
    public DQF<E> A05;
    public DQF<E> A06;
    public DQF<E> A07;
    public final E A08;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Comparator<-TE;>;TE;II[I)LX/DQF<TE;>; */
    public final DQF A0E(Object comparator, Comparator e, int[] expectedCount, int newCount, int result) {
        int iCompare = e.compare(comparator, this.A08);
        if (iCompare < 0) {
            DQF<E> dqf = this.A04;
            if (dqf == null) {
                expectedCount[0] = 0;
                if (newCount == 0 && result > 0) {
                    A08(comparator, result);
                }
                return this;
            }
            this.A04 = dqf.A0E(comparator, e, expectedCount, newCount, result);
            int i = expectedCount[0];
            if (i == newCount) {
                if (result == 0) {
                    if (i != 0) {
                        this.A00--;
                    }
                } else if (result > 0 && i == 0) {
                    this.A00++;
                }
                this.A03 += result - i;
            }
            return A01();
        }
        if (iCompare > 0) {
            DQF<E> dqf2 = this.A06;
            if (dqf2 != null) {
                this.A06 = dqf2.A0E(comparator, e, expectedCount, newCount, result);
                int i2 = expectedCount[0];
                if (i2 == newCount) {
                    if (result == 0) {
                        if (i2 != 0) {
                            this.A00--;
                        }
                    } else if (result > 0 && i2 == 0) {
                        this.A00++;
                    }
                    this.A03 += result - i2;
                }
                return A01();
            }
            expectedCount[0] = 0;
            if (newCount == 0 && result > 0) {
                A09(comparator, result);
                return this;
            }
        } else {
            int i3 = this.A01;
            expectedCount[0] = i3;
            if (newCount == i3) {
                if (result == 0) {
                    return A00();
                }
                this.A03 += result - i3;
                this.A01 = result;
                return this;
            }
        }
        return this;
    }

    private DQF<E> A00() {
        DQF<E> dqf;
        int i = this.A01;
        this.A01 = 0;
        DQF<E> dqf2 = this.A05;
        dqf2.getClass();
        DQF<E> dqf3 = this.A07;
        dqf3.getClass();
        dqf2.A07 = dqf3;
        dqf3.A05 = dqf2;
        DQF<E> dqf4 = this.A04;
        DQF<E> dqf5 = this.A06;
        if (dqf4 == null) {
            return dqf5;
        }
        if (dqf5 == null) {
            return dqf4;
        }
        if (dqf4.A02 >= dqf5.A02) {
            dqf = this.A05;
            dqf.getClass();
            dqf.A04 = this.A04.A02(dqf);
            dqf.A06 = this.A06;
        } else {
            dqf = this.A07;
            dqf.getClass();
            dqf.A06 = this.A06.A03(dqf);
            dqf.A04 = this.A04;
        }
        dqf.A00 = this.A00 - 1;
        dqf.A03 = this.A03 - i;
        return dqf.A01();
    }

    private DQF<E> A01() {
        DQF<E> dqf;
        DQF<E> dqf2 = this.A04;
        int i = dqf2 == null ? 0 : dqf2.A02;
        DQF<E> dqf3 = this.A06;
        int i2 = i - (dqf3 == null ? 0 : dqf3.A02);
        if (i2 == -2) {
            dqf3.getClass();
            dqf = this.A06;
            DQF<E> dqf4 = dqf.A04;
            int i3 = dqf4 == null ? 0 : dqf4.A02;
            DQF<E> dqf5 = dqf.A06;
            if (i3 - (dqf5 == null ? 0 : dqf5.A02) > 0) {
                Preconditions.checkState(AnonymousClass002.A1X(dqf4));
                dqf.A04 = dqf4.A06;
                dqf4.A06 = dqf;
                dqf4.A03 = dqf.A03;
                dqf4.A00 = dqf.A00;
                dqf.A06();
                dqf4.A07();
                this.A06 = dqf4;
                dqf = dqf4;
            }
            Preconditions.checkState(AnonymousClass002.A1X(dqf));
            this.A06 = dqf.A04;
            dqf.A04 = this;
        } else {
            if (i2 != 2) {
                A07();
                return this;
            }
            dqf2.getClass();
            dqf = this.A04;
            DQF<E> dqf6 = dqf.A04;
            int i4 = dqf6 == null ? 0 : dqf6.A02;
            DQF<E> dqf7 = dqf.A06;
            if (i4 - (dqf7 == null ? 0 : dqf7.A02) < 0) {
                Preconditions.checkState(AnonymousClass002.A1X(dqf7));
                dqf.A06 = dqf7.A04;
                dqf7.A04 = dqf;
                dqf7.A03 = dqf.A03;
                dqf7.A00 = dqf.A00;
                dqf.A06();
                dqf7.A07();
                this.A04 = dqf7;
                dqf = dqf7;
            }
            Preconditions.checkState(AnonymousClass002.A1X(dqf));
            this.A04 = dqf.A06;
            dqf.A06 = this;
        }
        dqf.A03 = this.A03;
        dqf.A00 = this.A00;
        A06();
        dqf.A07();
        return dqf;
    }

    private DQF<E> A02(DQF<E> node) {
        DQF<E> dqf = this.A06;
        if (dqf == null) {
            return this.A04;
        }
        this.A06 = dqf.A02(node);
        this.A00--;
        this.A03 -= node.A01;
        return A01();
    }

    private DQF<E> A03(DQF<E> node) {
        DQF<E> dqf = this.A04;
        if (dqf == null) {
            return this.A06;
        }
        this.A04 = dqf.A03(node);
        this.A00--;
        this.A03 -= node.A01;
        return A01();
    }

    public static DQF A04(DQF dqf, Object obj, Comparator comparator) {
        DQF dqfA04;
        int iCompare = comparator.compare(obj, dqf.A08);
        if (iCompare < 0) {
            DQF<E> dqf2 = dqf.A04;
            return (dqf2 == null || (dqfA04 = A04(dqf2, obj, comparator)) == null) ? dqf : dqfA04;
        }
        if (iCompare != 0) {
            DQF<E> dqf3 = dqf.A06;
            if (dqf3 == null) {
                return null;
            }
            return A04(dqf3, obj, comparator);
        }
        return dqf;
    }

    public static DQF A05(DQF dqf, Object obj, Comparator comparator) {
        DQF dqfA05;
        int iCompare = comparator.compare(obj, dqf.A08);
        if (iCompare > 0) {
            DQF<E> dqf2 = dqf.A06;
            return (dqf2 == null || (dqfA05 = A05(dqf2, obj, comparator)) == null) ? dqf : dqfA05;
        }
        if (iCompare != 0) {
            DQF<E> dqf3 = dqf.A04;
            if (dqf3 == null) {
                return null;
            }
            return A05(dqf3, obj, comparator);
        }
        return dqf;
    }

    private void A06() {
        DQF<E> dqf = this.A04;
        int i = (dqf == null ? 0 : dqf.A00) + 1;
        DQF<E> dqf2 = this.A06;
        this.A00 = i + (dqf2 == null ? 0 : dqf2.A00);
        this.A03 = this.A01 + (dqf == null ? 0L : dqf.A03) + (dqf2 == null ? 0L : dqf2.A03);
        A07();
    }

    private void A07() {
        DQF<E> dqf = this.A04;
        int i = dqf == null ? 0 : dqf.A02;
        DQF<E> dqf2 = this.A06;
        this.A02 = Math.max(i, dqf2 == null ? 0 : dqf2.A02) + 1;
    }

    /* JADX WARN: Incorrect return type in method signature: (TE;I)LX/DQF<TE;>; */
    private void A08(Object e, int count) {
        this.A04 = new DQF<>(e, count);
        DQF<E> dqf = this.A05;
        dqf.getClass();
        DQF<E> dqf2 = this.A04;
        dqf.A07 = dqf2;
        dqf2.A05 = dqf;
        dqf2.A07 = this;
        this.A05 = dqf2;
        this.A02 = Math.max(2, this.A02);
        this.A00++;
        this.A03 += count;
    }

    /* JADX WARN: Incorrect return type in method signature: (TE;I)LX/DQF<TE;>; */
    private void A09(Object e, int count) {
        DQF<E> dqf = new DQF<>(e, count);
        this.A06 = dqf;
        DQF<E> dqf2 = this.A07;
        dqf2.getClass();
        this.A07 = dqf;
        dqf.A05 = this;
        dqf.A07 = dqf2;
        dqf2.A05 = dqf;
        this.A02 = Math.max(2, this.A02);
        this.A00++;
        this.A03 += count;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Comparator<-TE;>;TE;)I */
    public final int A0A(Object comparator, Comparator e) {
        DQF<E> dqf;
        int iCompare = e.compare(comparator, this.A08);
        if (iCompare < 0) {
            dqf = this.A04;
        } else {
            if (iCompare <= 0) {
                return this.A01;
            }
            dqf = this.A06;
        }
        if (dqf != null) {
            return dqf.A0A(comparator, e);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.DQF A0B(java.lang.Object r5, java.util.Comparator r6, int[] r7) {
        /*
            r4 = this;
            E r0 = r4.A08
            int r0 = r6.compare(r5, r0)
            r1 = 0
            if (r0 >= 0) goto L29
            X.DQF<E> r0 = r4.A04
            if (r0 == 0) goto L36
            X.DQF r0 = r0.A0B(r5, r6, r7)
            r4.A04 = r0
        L13:
            r1 = r7[r1]
            if (r1 == 0) goto L1d
            int r0 = r4.A00
            int r0 = r0 + (-1)
            r4.A00 = r0
        L1d:
            long r2 = r4.A03
            int r0 = -r1
            long r0 = (long) r0
            long r2 = r2 + r0
            r4.A03 = r2
            X.DQF r0 = r4.A01()
            return r0
        L29:
            if (r0 <= 0) goto L39
            X.DQF<E> r0 = r4.A06
            if (r0 == 0) goto L36
            X.DQF r0 = r0.A0B(r5, r6, r7)
            r4.A06 = r0
            goto L13
        L36:
            r7[r1] = r1
            return r4
        L39:
            int r0 = r4.A01
            r7[r1] = r0
            X.DQF r0 = r4.A00()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DQF.A0B(java.lang.Object, java.util.Comparator, int[]):X.DQF");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Comparator<-TE;>;TE;I[I)LX/DQF<TE;>; */
    public final DQF A0C(Object comparator, Comparator e, int[] count, int result) {
        int i;
        DQF<E> dqfA0C;
        int iCompare = e.compare(comparator, this.A08);
        if (iCompare < 0) {
            DQF<E> dqf = this.A04;
            if (dqf == null) {
                count[0] = 0;
                A08(comparator, result);
                return this;
            }
            i = dqf.A02;
            dqfA0C = dqf.A0C(comparator, e, count, result);
            this.A04 = dqfA0C;
        } else {
            if (iCompare <= 0) {
                int i2 = this.A01;
                count[0] = i2;
                long j = result;
                Preconditions.checkArgument(((long) i2) + j <= 2147483647L);
                this.A01 += result;
                this.A03 += j;
                return this;
            }
            DQF<E> dqf2 = this.A06;
            if (dqf2 == null) {
                count[0] = 0;
                A09(comparator, result);
                return this;
            }
            i = dqf2.A02;
            dqfA0C = dqf2.A0C(comparator, e, count, result);
            this.A06 = dqfA0C;
        }
        if (count[0] == 0) {
            this.A00++;
        }
        this.A03 += result;
        if (dqfA0C.A02 != i) {
            return A01();
        }
        return this;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Comparator<-TE;>;TE;I[I)LX/DQF<TE;>; */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[PHI: r1
  0x002a: PHI (r1v2 int) = (r1v1 int), (r1v3 int) binds: [B:14:0x0028, B:7:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.DQF A0D(java.lang.Object r5, java.util.Comparator r6, int[] r7, int r8) {
        /*
            r4 = this;
            E r0 = r4.A08
            int r0 = r6.compare(r5, r0)
            r1 = 0
            if (r0 >= 0) goto L1a
            X.DQF<E> r0 = r4.A04
            if (r0 == 0) goto L41
            X.DQF r0 = r0.A0D(r5, r6, r7, r8)
            r4.A04 = r0
            r1 = r7[r1]
            if (r1 > 0) goto L2a
            if (r1 != 0) goto L38
            return r4
        L1a:
            if (r0 <= 0) goto L44
            X.DQF<E> r0 = r4.A06
            if (r0 == 0) goto L41
            X.DQF r0 = r0.A0D(r5, r6, r7, r8)
            r4.A06 = r0
            r1 = r7[r1]
            if (r1 <= 0) goto L38
        L2a:
            if (r8 < r1) goto L3d
            int r0 = r4.A00
            int r0 = r0 + (-1)
            r4.A00 = r0
            long r2 = r4.A03
            long r0 = (long) r1
        L35:
            long r2 = r2 - r0
            r4.A03 = r2
        L38:
            X.DQF r0 = r4.A01()
            return r0
        L3d:
            long r2 = r4.A03
            long r0 = (long) r8
            goto L35
        L41:
            r7[r1] = r1
            return r4
        L44:
            int r0 = r4.A01
            r7[r1] = r0
            if (r8 < r0) goto L4f
            X.DQF r0 = r4.A00()
            return r0
        L4f:
            int r0 = r0 - r8
            r4.A01 = r0
            long r2 = r4.A03
            long r0 = (long) r8
            long r2 = r2 - r0
            r4.A03 = r2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DQF.A0D(java.lang.Object, java.util.Comparator, int[], int):X.DQF");
    }

    public final String toString() {
        return new Multisets$ImmutableEntry(this.A08, this.A01).toString();
    }

    public DQF() {
        this.A08 = null;
        this.A01 = 1;
    }

    public DQF(E elem, int elemCount) {
        Preconditions.checkArgument(AnonymousClass002.A1N(elemCount));
        this.A08 = elem;
        this.A01 = elemCount;
        this.A03 = elemCount;
        this.A00 = 1;
        this.A02 = 1;
        this.A04 = null;
        this.A06 = null;
    }
}
