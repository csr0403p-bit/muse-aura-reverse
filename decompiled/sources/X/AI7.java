package X;

import androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class AI7 implements Iterable<Long>, BOA {
    public static final AI7 A04 = new AI7(null, 0, 0, 0);
    public final long A00;
    public final long A01;
    public final long A02;
    public final long[] A03;

    public static final int A00(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public final AI7 A01(long j) {
        long[] jArr;
        int iA00;
        long j2;
        long j3;
        long[] jArr2;
        long j4 = this.A00;
        long j5 = j - j4;
        int iA01 = C7384Etj.A01(j5, 0L);
        if (iA01 >= 0 && C7384Etj.A01(j5, 64L) < 0) {
            long j6 = 1 << ((int) j5);
            long j7 = this.A01;
            if ((j7 & j6) != 0) {
                j2 = this.A02;
                j3 = j7 & (j6 ^ (-1));
                jArr2 = this.A03;
            }
            return this;
        }
        if (C7384Etj.A01(j5, 64L) >= 0 && C7384Etj.A01(j5, 128L) < 0) {
            long j8 = 1 << (((int) j5) - 64);
            long j9 = this.A02;
            if ((j9 & j8) != 0) {
                j2 = j9 & (j8 ^ (-1));
                j3 = this.A01;
                jArr2 = this.A03;
            }
        } else if (iA01 < 0 && (jArr = this.A03) != null && (iA00 = A00(jArr, j)) >= 0) {
            j2 = this.A02;
            j3 = this.A01;
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                jArr2 = new long[i];
                if (iA00 > 0) {
                    System.arraycopy(jArr, 0, jArr2, 0, iA00);
                }
                if (iA00 < i) {
                    int i2 = iA00 + 1;
                    System.arraycopy(jArr, i2, jArr2, iA00, length - i2);
                }
            }
        }
        return this;
        return new AI7(jArr2, j2, j3, j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x015e, code lost:
    
        throw new java.lang.IndexOutOfBoundsException("");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AI7 A02(long r26) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AI7.A02(long):X.AI7");
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return BL3.A0C(new SnapshotIdSet$iterator$1(this, null));
    }

    public final AI7 A03(AI7 ai7) {
        AI7 ai7A01 = this;
        AI7 ai72 = A04;
        if (ai7 == ai72) {
            return this;
        }
        if (ai7A01 == ai72) {
            return ai72;
        }
        long j = ai7.A00;
        long j2 = ai7A01.A00;
        if (j == j2) {
            long[] jArr = ai7.A03;
            long[] jArr2 = ai7A01.A03;
            if (jArr == jArr2) {
                return new AI7(jArr2, (ai7.A02 ^ (-1)) & ai7A01.A02, ((-1) ^ ai7.A01) & ai7A01.A01, j2);
            }
        }
        long[] jArr3 = ai7.A03;
        int i = 0;
        if (jArr3 != null) {
            for (long j3 : jArr3) {
                ai7A01 = ai7A01.A01(j3);
            }
        }
        long j4 = ai7.A01;
        if (j4 != 0) {
            int i2 = 0;
            do {
                if ((j4 & (1 << i2)) != 0) {
                    ai7A01 = ai7A01.A01(j + i2);
                }
                i2++;
            } while (i2 < 64);
        }
        long j5 = ai7.A02;
        if (j5 == 0) {
            return ai7A01;
        }
        do {
            if ((j5 & (1 << i)) != 0) {
                ai7A01 = ai7A01.A01(j + i + 64);
            }
            i++;
        } while (i < 64);
        return ai7A01;
    }

    public final AI7 A04(AI7 ai7) {
        AI7 ai7A02 = this;
        AI7 ai7A022 = ai7;
        AI7 ai72 = A04;
        if (ai7A022 == ai72) {
            return this;
        }
        if (ai7A02 != ai72) {
            long j = ai7A022.A00;
            long j2 = ai7A02.A00;
            if (j == j2) {
                long[] jArr = ai7A022.A03;
                long[] jArr2 = ai7A02.A03;
                if (jArr == jArr2) {
                    return new AI7(jArr2, ai7A022.A02 | ai7A02.A02, ai7A022.A01 | ai7A02.A01, j2);
                }
            }
            int i = 0;
            if (ai7A02.A03 != null) {
                long[] jArr3 = ai7A022.A03;
                if (jArr3 != null) {
                    for (long j3 : jArr3) {
                        ai7A02 = ai7A02.A02(j3);
                    }
                }
                long j4 = ai7A022.A01;
                if (j4 != 0) {
                    int i2 = 0;
                    do {
                        if ((j4 & (1 << i2)) != 0) {
                            ai7A02 = ai7A02.A02(j + i2);
                        }
                        i2++;
                    } while (i2 < 64);
                }
                long j5 = ai7A022.A02;
                if (j5 == 0) {
                    return ai7A02;
                }
                do {
                    if ((j5 & (1 << i)) != 0) {
                        ai7A02 = ai7A02.A02(j + i + 64);
                    }
                    i++;
                } while (i < 64);
                return ai7A02;
            }
            long j6 = ai7A02.A01;
            if (j6 != 0) {
                int i3 = 0;
                do {
                    if ((j6 & (1 << i3)) != 0) {
                        ai7A022 = ai7A022.A02(j2 + i3);
                    }
                    i3++;
                } while (i3 < 64);
            }
            long j7 = ai7A02.A02;
            if (j7 != 0) {
                do {
                    if ((j7 & (1 << i)) != 0) {
                        ai7A022 = ai7A022.A02(j2 + i + 64);
                    }
                    i++;
                } while (i < 64);
            }
        }
        return ai7A022;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(long r14) {
        /*
            r13 = this;
            long r0 = r13.A00
            long r3 = r14 - r0
            r12 = 0
            r1 = 0
            int r11 = X.C7384Etj.A01(r3, r1)
            r9 = 1
            r8 = 1
            r7 = 64
            if (r11 < 0) goto L24
            r5 = 64
            int r0 = X.C7384Etj.A01(r3, r5)
            if (r0 >= 0) goto L24
            int r0 = (int) r3
            long r9 = r9 << r0
            long r3 = r13.A01
        L1e:
            long r9 = r9 & r3
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L47
            return r8
        L24:
            r5 = 64
            int r0 = X.C7384Etj.A01(r3, r5)
            if (r0 < 0) goto L3a
            r5 = 128(0x80, double:6.32E-322)
            int r0 = X.C7384Etj.A01(r3, r5)
            if (r0 >= 0) goto L3a
            int r0 = (int) r3
            int r0 = r0 - r7
            long r9 = r9 << r0
            long r3 = r13.A02
            goto L1e
        L3a:
            if (r11 > 0) goto L47
            long[] r0 = r13.A03
            if (r0 == 0) goto L47
            int r0 = A00(r0, r14)
            if (r0 < 0) goto L47
            return r8
        L47:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AI7.A05(long):boolean");
    }

    public AI7(long[] jArr, long j, long j2, long j3) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
        this.A03 = jArr;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(super.toString());
        sbA0w.append(" [");
        ArrayList arrayListA0i = AnonymousClass003.A0i(this);
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayListA0i.add(String.valueOf(C3cG.A05(it.next())));
        }
        StringBuilder sbA0w2 = C60O.A0w();
        sbA0w2.append((CharSequence) "");
        int size = arrayListA0i.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object string = arrayListA0i.get(i2);
            i++;
            if (i > 1) {
                sbA0w2.append((CharSequence) ", ");
            }
            if (string == null || (string instanceof CharSequence)) {
                sbA0w2.append((CharSequence) string);
            } else if (string instanceof Character) {
                sbA0w2.append(((Character) string).charValue());
            } else {
                string = string.toString();
                sbA0w2.append((CharSequence) string);
            }
        }
        sbA0w2.append((CharSequence) "");
        sbA0w.append(sbA0w2.toString());
        return C8j3.A16(sbA0w, ']');
    }
}
