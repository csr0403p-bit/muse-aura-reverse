package X;

import java.util.Arrays;

/* renamed from: X.AJk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0957AJk<K, V> {
    public static final C0957AJk A04 = new C0957AJk(null, new Object[0], 0, 0);
    public int A00;
    public int A01;
    public Object[] A02;
    public final C0902AHe A03;

    private final boolean A07(C0957AJk<K, V> c0957AJk) {
        if (this != c0957AJk) {
            if (this.A01 == c0957AJk.A01 && this.A00 == c0957AJk.A00) {
                Object[] objArr = this.A02;
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    if (objArr[i] == c0957AJk.A02[i]) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Incorrect types in method signature: (IIITK;TV;ILX/AHe;)[Ljava/lang/Object; */
    private final Object[] A09(C0902AHe c0902AHe, Object obj, Object obj2, int i, int i2, int i3, int i4) {
        Object obj3 = this.A02[i];
        C0957AJk c0957AJkA06 = A06(c0902AHe, obj3, this.A02[i + 1], obj, obj2, obj3 != null ? obj3.hashCode() : 0, i3, i4 + 5);
        int iA0D = A0D(i2) + 1;
        Object[] objArr = this.A02;
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 1];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        int i5 = i + 2;
        System.arraycopy(objArr, i5, objArr2, i, iA0D - i5);
        objArr2[iA0D - 2] = c0957AJkA06;
        System.arraycopy(objArr, iA0D, objArr2, iA0D - 1, length - iA0D);
        return objArr2;
    }

    /* JADX WARN: Incorrect types in method signature: <K:Ljava/lang/Object;V:Ljava/lang/Object;>([Ljava/lang/Object;ITK;TV;)[Ljava/lang/Object; */
    public static final Object[] A0A(Object obj, Object obj2, Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 2];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        System.arraycopy(objArr, i, objArr2, i + 2, length - i);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] A0B(Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 2];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        int i2 = i + 2;
        System.arraycopy(objArr, i2, objArr2, i, length - i2);
        return objArr2;
    }

    /* JADX WARN: Incorrect types in method signature: (ITK;TV;I)LX/AK4<TK;TV;>; */
    public final AK4 A0E(Object obj, Object obj2, int i, int i2) {
        C0957AJk c0957AJk;
        AK4 ak4A0E;
        int i3;
        int i4 = 1 << ((i >> i2) & 31);
        if ((i4 & this.A00) != 0) {
            int iA0C = A0C(i4);
            if (C7384Etj.areEqual(obj, this.A02[iA0C])) {
                Object[] objArr = this.A02;
                int i5 = iA0C + 1;
                if (objArr[i5] != obj2) {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    C7384Etj.A0U(objArrCopyOf);
                    objArrCopyOf[i5] = obj2;
                    c0957AJk = new C0957AJk(null, objArrCopyOf, this.A00, this.A01);
                    i3 = 0;
                }
                return null;
            }
            c0957AJk = new C0957AJk(null, A09(null, obj, obj2, iA0C, i4, i, i2), this.A00 ^ i4, this.A01 | i4);
            i3 = 1;
        } else {
            if ((this.A01 & i4) != 0) {
                int iA0D = A0D(i4);
                C0957AJk<K, V> c0957AJkA0F = A0F(iA0D);
                if (i2 == 30) {
                    C0968AJv c0968AJvA0B = ATD.A0B(ATD.A0C(0, c0957AJkA0F.A02.length), 2);
                    int i6 = c0968AJvA0B.A00;
                    int i7 = c0968AJvA0B.A01;
                    int i8 = c0968AJvA0B.A02;
                    if (i8 <= 0 ? i8 >= 0 || i7 > i6 : i6 > i7) {
                        ak4A0E = new AK4(new C0957AJk(null, A0A(obj, obj2, c0957AJkA0F.A02, 0), 0, 0), 1);
                        break;
                    }
                    while (!C7384Etj.areEqual(obj, c0957AJkA0F.A02[i6])) {
                        if (i6 == i7) {
                            ak4A0E = new AK4(new C0957AJk(null, A0A(obj, obj2, c0957AJkA0F.A02, 0), 0, 0), 1);
                            break;
                        }
                        i6 += i8;
                    }
                    Object[] objArr2 = c0957AJkA0F.A02;
                    int i9 = i6 + 1;
                    if (obj2 != objArr2[i9]) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        C7384Etj.A0U(objArrCopyOf2);
                        objArrCopyOf2[i9] = obj2;
                        ak4A0E = new AK4(new C0957AJk(null, objArrCopyOf2, 0, 0), 0);
                    }
                    return null;
                }
                ak4A0E = c0957AJkA0F.A0E(obj, obj2, i, i2 + 5);
                if (ak4A0E == null) {
                    return null;
                }
                ak4A0E.A00 = A03(ak4A0E.A00, iA0D, i4);
                return ak4A0E;
            }
            c0957AJk = new C0957AJk(null, A0A(obj, obj2, this.A02, A0C(i4)), i4 | this.A00, this.A01);
            i3 = 1;
        }
        return new AK4(c0957AJk, i3);
    }

    /* JADX WARN: Incorrect types in method signature: (ITK;ILX/AJl<TK;TV;>;)LX/AJk<TK;TV;>; */
    public final C0957AJk A0H(C0958AJl c0958AJl, Object obj, int i, int i2) {
        C0957AJk<K, V> c0957AJkA0H;
        int i3 = 1 << ((i >> i2) & 31);
        if ((this.A00 & i3) != 0) {
            int iA0C = A0C(i3);
            if (C8j3.A1X(obj, this.A02, iA0C)) {
                return A02(c0958AJl, iA0C, i3);
            }
        } else if ((this.A01 & i3) != 0) {
            int iA0D = A0D(i3);
            C0957AJk<K, V> c0957AJkA0F = A0F(iA0D);
            if (i2 == 30) {
                C0968AJv c0968AJvA0B = ATD.A0B(ATD.A0C(0, c0957AJkA0F.A02.length), 2);
                int i4 = c0968AJvA0B.A00;
                int i5 = c0968AJvA0B.A01;
                int i6 = c0968AJvA0B.A02;
                if (i6 <= 0 ? i6 >= 0 || i5 > i4 : i4 > i5) {
                    c0957AJkA0H = c0957AJkA0F;
                    break;
                }
                while (!C7384Etj.areEqual(obj, c0957AJkA0F.A02[i4])) {
                    if (i4 == i5) {
                        c0957AJkA0H = c0957AJkA0F;
                        break;
                    }
                    i4 += i6;
                }
                c0957AJkA0H = c0957AJkA0F.A01(c0958AJl, i4);
            } else {
                c0957AJkA0H = c0957AJkA0F.A0H(c0958AJl, obj, i, i2 + 5);
            }
            return A04(c0957AJkA0F, c0957AJkA0H, c0958AJl.A02, iA0D, i3);
        }
        return this;
    }

    /* JADX WARN: Incorrect types in method signature: (ITK;TV;ILX/AJl<TK;TV;>;)LX/AJk<TK;TV;>; */
    public final C0957AJk A0J(C0958AJl c0958AJl, Object obj, Object obj2, int i, int i2) {
        C0957AJk<K, V> c0957AJkA0J;
        int i3 = 1 << ((i >> i2) & 31);
        if ((this.A00 & i3) != 0) {
            int iA0C = A0C(i3);
            if (C8j3.A1X(obj, this.A02, iA0C) && C8j3.A1X(obj2, this.A02, iA0C + 1)) {
                return A02(c0958AJl, iA0C, i3);
            }
        } else if ((this.A01 & i3) != 0) {
            int iA0D = A0D(i3);
            C0957AJk<K, V> c0957AJkA0F = A0F(iA0D);
            if (i2 == 30) {
                C0968AJv c0968AJvA0B = ATD.A0B(ATD.A0C(0, c0957AJkA0F.A02.length), 2);
                int i4 = c0968AJvA0B.A00;
                int i5 = c0968AJvA0B.A01;
                int i6 = c0968AJvA0B.A02;
                if (i6 <= 0 ? i6 >= 0 || i5 > i4 : i4 > i5) {
                    c0957AJkA0J = c0957AJkA0F;
                } else {
                    while (true) {
                        if (!C8j3.A1X(obj, c0957AJkA0F.A02, i4) || !C8j3.A1X(obj2, c0957AJkA0F.A02, i4 + 1)) {
                            if (i4 == i5) {
                                break;
                            }
                            i4 += i6;
                        } else {
                            c0957AJkA0J = c0957AJkA0F.A01(c0958AJl, i4);
                            break;
                        }
                    }
                    c0957AJkA0J = c0957AJkA0F;
                }
            } else {
                c0957AJkA0J = c0957AJkA0F.A0J(c0958AJl, obj, obj2, i, i2 + 5);
            }
            return A04(c0957AJkA0F, c0957AJkA0J, c0958AJl.A02, iA0D, i3);
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Incorrect types in method signature: (ITK;I)LX/AJk<TK;TV;>; */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0957AJk A0K(java.lang.Object r11, int r12, int r13) {
        /*
            r10 = this;
            r2 = 1
            int r0 = r12 >> r13
            r0 = r0 & 31
            int r3 = r2 << r0
            int r0 = r10.A00
            r0 = r0 & r3
            if (r0 == 0) goto L2e
            int r4 = r10.A0C(r3)
            java.lang.Object[] r0 = r10.A02
            boolean r0 = X.C8j3.A1X(r11, r0, r4)
            if (r0 == 0) goto L2d
            java.lang.Object[] r2 = r10.A02
            int r1 = r2.length
            r0 = 2
            if (r1 == r0) goto L9b
            java.lang.Object[] r2 = A0B(r2, r4)
            int r0 = r10.A00
            r3 = r3 ^ r0
            int r1 = r10.A01
            r0 = 0
            X.AJk r10 = new X.AJk
            r10.<init>(r0, r2, r3, r1)
        L2d:
            return r10
        L2e:
            int r0 = r10.A01
            r0 = r0 & r3
            if (r0 == 0) goto L2d
            int r4 = r10.A0D(r3)
            X.AJk r5 = r10.A0F(r4)
            r0 = 30
            if (r13 != r0) goto L7e
            java.lang.Object[] r0 = r5.A02
            int r0 = r0.length
            r7 = 0
            X.ADq r0 = X.ATD.A0C(r7, r0)
            r9 = 2
            X.AJv r0 = X.ATD.A0B(r0, r9)
            int r8 = r0.A00
            int r6 = r0.A01
            int r1 = r0.A02
            if (r1 <= 0) goto L5e
            if (r8 <= r6) goto L62
        L56:
            r0 = r5
        L57:
            if (r5 == r0) goto L2d
            X.AJk r10 = r10.A03(r0, r4, r3)
            return r10
        L5e:
            if (r1 >= 0) goto L56
            if (r6 > r8) goto L56
        L62:
            java.lang.Object[] r0 = r5.A02
            boolean r0 = X.C8j3.A1X(r11, r0, r8)
            if (r0 == 0) goto L7a
            java.lang.Object[] r1 = r5.A02
            int r0 = r1.length
            if (r0 == r9) goto L86
            java.lang.Object[] r2 = A0B(r1, r8)
            r1 = 0
            X.AJk r0 = new X.AJk
            r0.<init>(r1, r2, r7, r7)
            goto L57
        L7a:
            if (r8 == r6) goto L56
            int r8 = r8 + r1
            goto L62
        L7e:
            int r0 = r13 + 5
            X.AJk r0 = r5.A0K(r11, r12, r0)
            if (r0 != 0) goto L57
        L86:
            java.lang.Object[] r1 = r10.A02
            int r0 = r1.length
            if (r0 == r2) goto L9b
            java.lang.Object[] r2 = X.C8j5.A0t(r1, r0, r4)
            int r1 = r10.A00
            int r0 = r10.A01
            r3 = r3 ^ r0
            r0 = 0
            X.AJk r10 = new X.AJk
            r10.<init>(r0, r2, r1, r3)
            return r10
        L9b:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0957AJk.A0K(java.lang.Object, int, int):X.AJk");
    }

    /* JADX WARN: Incorrect types in method signature: (ITK;I)TV; */
    public final Object A0L(Object obj, int i, int i2) {
        int iA0C;
        int i3 = 1 << ((i >> i2) & 31);
        if ((i3 & this.A00) != 0) {
            iA0C = A0C(i3);
            if (!C7384Etj.areEqual(obj, this.A02[iA0C])) {
                return null;
            }
        } else {
            if ((this.A01 & i3) == 0) {
                return null;
            }
            this = A0F(A0D(i3));
            if (i2 != 30) {
                return this.A0L(obj, i, i2 + 5);
            }
            C0968AJv c0968AJvA0B = ATD.A0B(ATD.A0C(0, this.A02.length), 2);
            iA0C = c0968AJvA0B.A00;
            int i4 = c0968AJvA0B.A01;
            int i5 = c0968AJvA0B.A02;
            if (i5 > 0) {
                if (iA0C > i4) {
                    return null;
                }
            } else if (i5 >= 0 || i4 > iA0C) {
                return null;
            }
            while (!C7384Etj.areEqual(obj, this.A02[iA0C])) {
                if (iA0C == i4) {
                    return null;
                }
                iA0C += i5;
            }
        }
        return this.A02[iA0C + 1];
    }

    /* JADX WARN: Incorrect types in method signature: (ITK;I)Z */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A0M(Object obj, int i, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        if ((this.A00 & i3) != 0) {
            return C8j3.A1X(obj, this.A02, A0C(i3));
        }
        if ((this.A01 & i3) == 0) {
            return false;
        }
        C0957AJk<K, V> c0957AJkA0F = A0F(A0D(i3));
        return i2 == 30 ? c0957AJkA0F.A08(obj) : c0957AJkA0F.A0M(obj, i, i2 + 5);
    }

    private final int A00() {
        if (this.A01 == 0) {
            return this.A02.length / 2;
        }
        int iBitCount = Integer.bitCount(this.A00);
        int length = this.A02.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += A0F(i).A00();
        }
        return iBitCount;
    }

    /* JADX WARN: Incorrect types in method signature: (IILX/AJk<TK;TV;>;)LX/AJk<TK;TV;>; */
    private final C0957AJk A03(C0957AJk c0957AJk, int i, int i2) {
        Object[] objArr = c0957AJk.A02;
        if (objArr.length != 2 || c0957AJk.A01 != 0) {
            Object[] objArr2 = this.A02;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            C7384Etj.A0U(objArrCopyOf);
            objArrCopyOf[i] = c0957AJk;
            return new C0957AJk(null, objArrCopyOf, this.A00, this.A01);
        }
        Object[] objArr3 = this.A02;
        int length = objArr3.length;
        if (length == 1) {
            c0957AJk.A00 = this.A01;
            return c0957AJk;
        }
        int iA0C = A0C(i2);
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, length + 1);
        C7384Etj.A0U(objArrCopyOf2);
        int i3 = i + 1;
        System.arraycopy(objArrCopyOf2, i3, objArrCopyOf2, i + 2, length - i3);
        System.arraycopy(objArrCopyOf2, iA0C, objArrCopyOf2, iA0C + 2, i - iA0C);
        objArrCopyOf2[iA0C] = obj;
        objArrCopyOf2[iA0C + 1] = obj2;
        return new C0957AJk(null, objArrCopyOf2, this.A00 ^ i2, i2 ^ this.A01);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AJk<TK;TV;>;LX/AJk<TK;TV;>;IILX/AHe;)LX/AJk<TK;TV;>; */
    private final C0957AJk A04(C0957AJk c0957AJk, C0957AJk c0957AJk2, C0902AHe c0902AHe, int i, int i2) {
        if (c0957AJk2 != null) {
            return (this.A03 == c0902AHe || c0957AJk != c0957AJk2) ? A05(c0957AJk2, c0902AHe, i) : this;
        }
        Object[] objArr = this.A02;
        int length = objArr.length;
        if (length == 1) {
            return null;
        }
        C0902AHe c0902AHe2 = this.A03;
        Object[] objArrA0t = C8j5.A0t(objArr, length, i);
        if (c0902AHe2 != c0902AHe) {
            return new C0957AJk(c0902AHe, objArrA0t, this.A00, i2 ^ this.A01);
        }
        this.A02 = objArrA0t;
        this.A01 ^= i2;
        return this;
    }

    /* JADX WARN: Incorrect types in method signature: (ILX/AJk<TK;TV;>;LX/AHe;)LX/AJk<TK;TV;>; */
    private final C0957AJk A05(C0957AJk c0957AJk, C0902AHe c0902AHe, int i) {
        Object[] objArr = this.A02;
        int length = objArr.length;
        if (length == 1 && c0957AJk.A02.length == 2 && c0957AJk.A01 == 0) {
            c0957AJk.A00 = this.A01;
            return c0957AJk;
        }
        if (this.A03 == c0902AHe) {
            objArr[i] = c0957AJk;
            return this;
        }
        Object[] objArrA1a = C8j3.A1a(objArr, length);
        objArrA1a[i] = c0957AJk;
        return new C0957AJk(c0902AHe, objArrA1a, this.A00, this.A01);
    }

    /* JADX WARN: Incorrect types in method signature: (ITK;TV;ITK;TV;ILX/AHe;)LX/AJk<TK;TV;>; */
    private final C0957AJk A06(C0902AHe c0902AHe, Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        if (i3 > 30) {
            return new C0957AJk(c0902AHe, new Object[]{obj, obj2, obj3, obj4}, 0, 0);
        }
        int i4 = (i >> i3) & 31;
        int i5 = (i2 >> i3) & 31;
        if (i4 == i5) {
            return new C0957AJk(c0902AHe, new Object[]{A06(c0902AHe, obj, obj2, obj3, obj4, i, i2, i3 + 5)}, 0, 1 << i4);
        }
        Object[] objArr = new Object[4];
        if (i4 < i5) {
            objArr[0] = obj;
            objArr[1] = obj2;
            objArr[2] = obj3;
            objArr[3] = obj4;
        } else {
            objArr[0] = obj3;
            objArr[1] = obj4;
            objArr[2] = obj;
            objArr[3] = obj2;
        }
        return new C0957AJk(c0902AHe, objArr, (1 << i4) | (1 << i5), 0);
    }

    private final boolean A08(K k) {
        C0968AJv c0968AJvA0B = ATD.A0B(ATD.A0C(0, this.A02.length), 2);
        int i = c0968AJvA0B.A00;
        int i2 = c0968AJvA0B.A01;
        int i3 = c0968AJvA0B.A02;
        if (i3 <= 0 ? !(i3 >= 0 || i2 > i) : i <= i2) {
            while (!C8j3.A1X(k, this.A02, i)) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final int A0C(int i) {
        return Integer.bitCount((i - 1) & this.A00) * 2;
    }

    public final int A0D(int i) {
        return (this.A02.length - 1) - Integer.bitCount((i - 1) & this.A01);
    }

    public final C0957AJk<K, V> A0F(int i) {
        Object obj = this.A02[i];
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (C0957AJk) obj;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AJk<TK;TV;>;ILX/AKA;LX/AJl<TK;TV;>;)LX/AJk<TK;TV;>; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0164 A[PHI: r9
  0x0164: PHI (r9v15 X.AJk<K, V>) = (r9v13 X.AJk<K, V>), (r9v19 X.AJk<K, V>) binds: [B:54:0x0119, B:67:0x0162] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0957AJk A0G(X.C0958AJl r25, X.C0957AJk r26, X.AKA r27, int r28) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0957AJk.A0G(X.AJl, X.AJk, X.AKA, int):X.AJk");
    }

    /* JADX WARN: Incorrect types in method signature: (ITK;TV;ILX/AJl<TK;TV;>;)LX/AJk<TK;TV;>; */
    public final C0957AJk A0I(C0958AJl c0958AJl, Object obj, Object obj2, int i, int i2) {
        C0902AHe c0902AHe;
        Object[] objArrA0A;
        int i3;
        int i4;
        C0957AJk<K, V> c0957AJkA0I;
        Object[] objArrCopyOf;
        int i5 = 1 << ((i >> i2) & 31);
        if ((this.A00 & i5) != 0) {
            int iA0C = A0C(i5);
            if (!C7384Etj.areEqual(obj, this.A02[iA0C])) {
                c0958AJl.A03(c0958AJl.size() + 1);
                c0902AHe = c0958AJl.A02;
                C0902AHe c0902AHe2 = this.A03;
                objArrA0A = A09(c0902AHe, obj, obj2, iA0C, i5, i, i2);
                if (c0902AHe2 != c0902AHe) {
                    i3 = this.A00 ^ i5;
                    i4 = i5 | this.A01;
                    return new C0957AJk(c0902AHe, objArrA0A, i3, i4);
                }
                this.A02 = objArrA0A;
                this.A00 ^= i5;
                this.A01 |= i5;
                return this;
            }
            Object[] objArr = this.A02;
            int i6 = iA0C + 1;
            V v = (V) objArr[i6];
            c0958AJl.A03 = v;
            if (v != obj2) {
                if (this.A03 != c0958AJl.A02) {
                    c0958AJl.A00++;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length);
                    C7384Etj.A0U(objArrCopyOf2);
                    objArrCopyOf2[i6] = obj2;
                    return new C0957AJk(c0958AJl.A02, objArrCopyOf2, this.A00, this.A01);
                }
                objArr[i6] = obj2;
            }
            return this;
        }
        if ((this.A01 & i5) == 0) {
            c0958AJl.A03(c0958AJl.size() + 1);
            c0902AHe = c0958AJl.A02;
            int iA0C2 = A0C(i5);
            C0902AHe c0902AHe3 = this.A03;
            objArrA0A = A0A(obj, obj2, this.A02, iA0C2);
            if (c0902AHe3 == c0902AHe) {
                this.A02 = objArrA0A;
                this.A00 = i5 | this.A00;
                return this;
            }
            i3 = i5 | this.A00;
            i4 = this.A01;
            return new C0957AJk(c0902AHe, objArrA0A, i3, i4);
        }
        int iA0D = A0D(i5);
        C0957AJk<K, V> c0957AJkA0F = A0F(iA0D);
        if (i2 == 30) {
            C0968AJv c0968AJvA0B = ATD.A0B(ATD.A0C(0, c0957AJkA0F.A02.length), 2);
            int i7 = c0968AJvA0B.A00;
            int i8 = c0968AJvA0B.A01;
            int i9 = c0968AJvA0B.A02;
            if (i9 <= 0 ? i9 >= 0 || i8 > i7 : i7 > i8) {
                c0958AJl.A03(c0958AJl.size() + 1);
                objArrCopyOf = A0A(obj, obj2, c0957AJkA0F.A02, 0);
                c0957AJkA0I = new C0957AJk<>(c0958AJl.A02, objArrCopyOf, 0, 0);
            } else {
                while (!C7384Etj.areEqual(obj, c0957AJkA0F.A02[i7])) {
                    if (i7 == i8) {
                        c0958AJl.A03(c0958AJl.size() + 1);
                        objArrCopyOf = A0A(obj, obj2, c0957AJkA0F.A02, 0);
                        break;
                    }
                    i7 += i9;
                }
                Object[] objArr2 = c0957AJkA0F.A02;
                int i10 = i7 + 1;
                c0958AJl.A03 = (V) objArr2[i10];
                if (c0957AJkA0F.A03 == c0958AJl.A02) {
                    objArr2[i10] = obj2;
                    c0957AJkA0I = c0957AJkA0F;
                } else {
                    c0958AJl.A00++;
                    objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
                    C7384Etj.A0U(objArrCopyOf);
                    objArrCopyOf[i10] = obj2;
                    c0957AJkA0I = new C0957AJk<>(c0958AJl.A02, objArrCopyOf, 0, 0);
                }
            }
            return this;
        }
        c0957AJkA0I = c0957AJkA0F.A0I(c0958AJl, obj, obj2, i, i2 + 5);
        if (c0957AJkA0F != c0957AJkA0I) {
            return A05(c0957AJkA0I, c0958AJl.A02, iA0D);
        }
        return this;
    }

    public C0957AJk(C0902AHe c0902AHe, Object[] objArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = c0902AHe;
        this.A02 = objArr;
    }

    /* JADX WARN: Incorrect types in method signature: (ILX/AJl<TK;TV;>;)LX/AJk<TK;TV;>; */
    private final C0957AJk A01(C0958AJl c0958AJl, int i) {
        c0958AJl.A03(c0958AJl.size() - 1);
        Object[] objArr = this.A02;
        c0958AJl.A03 = (V) objArr[i + 1];
        if (objArr.length == 2) {
            return null;
        }
        C0902AHe c0902AHe = this.A03;
        C0902AHe c0902AHe2 = c0958AJl.A02;
        Object[] objArrA0B = A0B(objArr, i);
        if (c0902AHe != c0902AHe2) {
            return new C0957AJk(c0958AJl.A02, objArrA0B, 0, 0);
        }
        this.A02 = objArrA0B;
        return this;
    }

    /* JADX WARN: Incorrect types in method signature: (IILX/AJl<TK;TV;>;)LX/AJk<TK;TV;>; */
    private final C0957AJk A02(C0958AJl c0958AJl, int i, int i2) {
        c0958AJl.A03(c0958AJl.size() - 1);
        Object[] objArr = this.A02;
        c0958AJl.A03 = (V) objArr[i + 1];
        if (objArr.length == 2) {
            return null;
        }
        C0902AHe c0902AHe = this.A03;
        C0902AHe c0902AHe2 = c0958AJl.A02;
        Object[] objArrA0B = A0B(objArr, i);
        if (c0902AHe == c0902AHe2) {
            this.A02 = objArrA0B;
            this.A00 ^= i2;
            return this;
        }
        return new C0957AJk(c0958AJl.A02, objArrA0B, i2 ^ this.A00, this.A01);
    }
}
