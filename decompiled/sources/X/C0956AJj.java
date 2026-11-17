package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.AJj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0956AJj<K, V> {
    public static final C0956AJj A04 = new C0956AJj(null, new Object[0], 0, 0);
    public int A00;
    public int A01;
    public Object[] A02;
    public final AHS A03;

    private final boolean A08(C0956AJj<K, V> c0956AJj) {
        if (this != c0956AJj) {
            if (this.A01 == c0956AJj.A01 && this.A00 == c0956AJj.A00) {
                Object[] objArr = this.A02;
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    if (objArr[i] == c0956AJj.A02[i]) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Incorrect types in method signature: (IIITK;TV;ILX/AHS;)[Ljava/lang/Object; */
    private final Object[] A09(Object obj, Object obj2, AHS ahs, int i, int i2, int i3, int i4) {
        Object obj3 = this.A02[i];
        C0956AJj c0956AJjA02 = A02(obj3, this.A02[i + 1], obj, obj2, ahs, C8j4.A0C(obj3), i3, i4 + 5);
        int iA0D = A0D(i2) + 1;
        Object[] objArr = this.A02;
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 1];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        int i5 = i + 2;
        System.arraycopy(objArr, i5, objArr2, i, iA0D - i5);
        objArr2[iA0D - 2] = c0956AJjA02;
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

    /* JADX WARN: Incorrect types in method signature: (ITK;I)TV; */
    public final Object A0E(Object obj, int i, int i2) {
        int iA01;
        Object[] objArr;
        int i3 = 1 << ((i >> i2) & 31);
        if ((i3 & this.A00) != 0) {
            iA01 = A0C(i3);
            if (!C7384Etj.areEqual(obj, this.A02[iA01])) {
                return null;
            }
            objArr = this.A02;
        } else {
            if ((this.A01 & i3) == 0) {
                return null;
            }
            C0956AJj<K, V> c0956AJjA0G = A0G(A0D(i3));
            if (i2 != 30) {
                return c0956AJjA0G.A0E(obj, i, i2 + 5);
            }
            iA01 = c0956AJjA0G.A01(obj);
            if (iA01 == -1) {
                return null;
            }
            objArr = c0956AJjA0G.A02;
        }
        return objArr[iA01 + 1];
    }

    /* JADX WARN: Incorrect types in method signature: (ITK;TV;I)LX/AK5<TK;TV;>; */
    public final AK5 A0F(Object obj, Object obj2, int i, int i2) {
        Object[] objArrA0A;
        int i3;
        int i4;
        AK5 ak5A0F;
        C0956AJj c0956AJj;
        int i5;
        int i6 = 1 << ((i >> i2) & 31);
        if (AnonymousClass002.A1L(this.A00 & i6)) {
            int iA0C = A0C(i6);
            if (C8j3.A1X(obj, this.A02, iA0C)) {
                Object[] objArr = this.A02;
                int i7 = iA0C + 1;
                if (objArr[i7] != obj2) {
                    Object[] objArrA1a = C8j3.A1a(objArr, objArr.length);
                    objArrA1a[i7] = obj2;
                    c0956AJj = new C0956AJj(null, objArrA1a, this.A00, this.A01);
                    i5 = 0;
                }
                return null;
            }
            objArrA0A = A09(obj, obj2, null, iA0C, i6, i, i2);
            i3 = this.A00 ^ i6;
            i4 = this.A01 | i6;
            c0956AJj = new C0956AJj(null, objArrA0A, i3, i4);
            i5 = 1;
        } else {
            if ((this.A01 & i6) != 0) {
                int iA0D = A0D(i6);
                C0956AJj<K, V> c0956AJjA0G = A0G(iA0D);
                if (i2 == 30) {
                    int iA01 = c0956AJjA0G.A01(obj);
                    if (iA01 != -1) {
                        Object[] objArr2 = c0956AJjA0G.A02;
                        int i8 = iA01 + 1;
                        if (obj2 != objArr2[i8]) {
                            Object[] objArrA1a2 = C8j3.A1a(objArr2, objArr2.length);
                            objArrA1a2[i8] = obj2;
                            ak5A0F = new AK5(new C0956AJj(null, objArrA1a2, 0, 0), 0);
                        }
                        return null;
                    }
                    ak5A0F = new AK5(new C0956AJj(null, A0A(obj, obj2, c0956AJjA0G.A02, 0), 0, 0), 1);
                } else {
                    ak5A0F = c0956AJjA0G.A0F(obj, obj2, i, i2 + 5);
                    if (ak5A0F == null) {
                        return null;
                    }
                }
                ak5A0F.A00 = A07(ak5A0F.A00, null, iA0D, i6);
                return ak5A0F;
            }
            objArrA0A = A0A(obj, obj2, this.A02, A0C(i6));
            i3 = i6 | this.A00;
            i4 = this.A01;
            c0956AJj = new C0956AJj(null, objArrA0A, i3, i4);
            i5 = 1;
        }
        return new AK5(c0956AJj, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Incorrect types in method signature: (ITK;I)LX/AJj<TK;TV;>; */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0956AJj A0H(java.lang.Object r9, int r10, int r11) {
        /*
            r8 = this;
            r3 = 1
            int r0 = r10 >> r11
            r0 = r0 & 31
            int r4 = r3 << r0
            int r0 = r8.A00
            r0 = r0 & r4
            if (r0 == 0) goto L2f
            int r3 = r8.A0C(r4)
            java.lang.Object[] r0 = r8.A02
            boolean r0 = X.C8j3.A1X(r9, r0, r3)
            if (r0 == 0) goto L2e
            java.lang.Object[] r2 = r8.A02
            int r1 = r2.length
            r0 = 2
            if (r1 == r0) goto L79
            java.lang.Object[] r2 = A0B(r2, r3)
            int r0 = r8.A00
            r1 = r4 ^ r0
            int r4 = r8.A01
        L28:
            r0 = 0
            X.AJj r8 = new X.AJj
            r8.<init>(r0, r2, r1, r4)
        L2e:
            return r8
        L2f:
            int r0 = r8.A01
            r0 = r0 & r4
            if (r0 == 0) goto L2e
            int r5 = r8.A0D(r4)
            X.AJj r6 = r8.A0G(r5)
            r0 = 30
            if (r11 != r0) goto L62
            int r7 = r6.A01(r9)
            r0 = -1
            if (r7 == r0) goto L60
            java.lang.Object[] r2 = r6.A02
            int r1 = r2.length
            r0 = 2
            if (r1 == r0) goto L6a
            java.lang.Object[] r3 = A0B(r2, r7)
            r2 = 0
            r0 = 0
            X.AJj r1 = new X.AJj
            r1.<init>(r0, r3, r2, r2)
        L58:
            if (r6 == r1) goto L2e
            r0 = 0
            X.AJj r8 = r8.A07(r1, r0, r5, r4)
            return r8
        L60:
            r1 = r6
            goto L58
        L62:
            int r0 = r11 + 5
            X.AJj r1 = r6.A0H(r9, r10, r0)
            if (r1 != 0) goto L58
        L6a:
            java.lang.Object[] r1 = r8.A02
            int r0 = r1.length
            if (r0 == r3) goto L79
            java.lang.Object[] r2 = X.C8j5.A0t(r1, r0, r5)
            int r1 = r8.A00
            int r0 = r8.A01
            r4 = r4 ^ r0
            goto L28
        L79:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0956AJj.A0H(java.lang.Object, int, int):X.AJj");
    }

    /* JADX WARN: Incorrect types in method signature: (ITK;TV;ILX/AJi<TK;TV;>;)LX/AJj<TK;TV;>; */
    public final C0956AJj A0J(Object obj, Object obj2, C0955AJi c0955AJi, int i, int i2) {
        C0956AJj<K, V> c0956AJjA0J;
        int i3 = 1 << ((i >> i2) & 31);
        if ((this.A00 & i3) != 0) {
            int iA0C = A0C(i3);
            if (C8j3.A1X(obj, this.A02, iA0C) && C8j3.A1X(obj2, this.A02, iA0C + 1)) {
                return A05(c0955AJi, iA0C, i3);
            }
        } else if ((this.A01 & i3) != 0) {
            int iA0D = A0D(i3);
            C0956AJj<K, V> c0956AJjA0G = A0G(iA0D);
            if (i2 == 30) {
                int iA01 = c0956AJjA0G.A01(obj);
                c0956AJjA0J = (iA01 == -1 || !C8j3.A1X(obj2, c0956AJjA0G.A02, iA01 + 1)) ? c0956AJjA0G : c0956AJjA0G.A04(c0955AJi, iA01);
            } else {
                c0956AJjA0J = c0956AJjA0G.A0J(obj, obj2, c0955AJi, i, i2 + 5);
            }
            return A06(c0956AJjA0G, c0956AJjA0J, c0955AJi.A05, iA0D, i3);
        }
        return this;
    }

    /* JADX WARN: Incorrect types in method signature: (ITK;ILX/AJi<TK;TV;>;)LX/AJj<TK;TV;>; */
    public final C0956AJj A0K(Object obj, C0955AJi c0955AJi, int i, int i2) {
        C0956AJj<K, V> c0956AJjA0K;
        int i3 = 1 << ((i >> i2) & 31);
        if ((this.A00 & i3) != 0) {
            int iA0C = A0C(i3);
            if (C8j3.A1X(obj, this.A02, iA0C)) {
                return A05(c0955AJi, iA0C, i3);
            }
        } else if ((this.A01 & i3) != 0) {
            int iA0D = A0D(i3);
            C0956AJj<K, V> c0956AJjA0G = A0G(iA0D);
            if (i2 == 30) {
                int iA01 = c0956AJjA0G.A01(obj);
                c0956AJjA0K = iA01 != -1 ? c0956AJjA0G.A04(c0955AJi, iA01) : c0956AJjA0G;
            } else {
                c0956AJjA0K = c0956AJjA0G.A0K(obj, c0955AJi, i, i2 + 5);
            }
            return A06(c0956AJjA0G, c0956AJjA0K, c0955AJi.A05, iA0D, i3);
        }
        return this;
    }

    /* JADX WARN: Incorrect types in method signature: (ITK;I)Z */
    public final boolean A0M(Object obj, int i, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        if ((this.A00 & i3) != 0) {
            return C8j3.A1X(obj, this.A02, A0C(i3));
        }
        if ((this.A01 & i3) == 0) {
            return false;
        }
        C0956AJj<K, V> c0956AJjA0G = A0G(A0D(i3));
        return i2 == 30 ? AnonymousClass002.A1P(c0956AJjA0G.A01(obj), -1) : c0956AJjA0G.A0M(obj, i, i2 + 5);
    }

    /* JADX WARN: Incorrect types in method signature: <K1:Ljava/lang/Object;V1:Ljava/lang/Object;>(LX/AJj<TK1;TV1;>;LX/G0V<-TV;-TV1;Ljava/lang/Boolean;>;)Z */
    public final boolean A0N(G0V g0v, C0956AJj c0956AJj) {
        int i;
        C7384Etj.A0Y(c0956AJj, 0);
        if (this != c0956AJj) {
            int i2 = this.A00;
            if (i2 == c0956AJj.A00 && (i = this.A01) == c0956AJj.A01) {
                if (i2 == 0 && i == 0) {
                    int length = this.A02.length;
                    if (length == c0956AJj.A02.length) {
                        Iterable iterableA0B = ATD.A0B(new ADq(0, length - 1), 2);
                        if (!(iterableA0B instanceof Collection) || !((Collection) iterableA0B).isEmpty()) {
                            Iterator<Integer> it = iterableA0B.iterator();
                            while (it.hasNext()) {
                                int iA00 = ((BNt) it).A00();
                                Object[] objArr = c0956AJj.A02;
                                Object obj = objArr[iA00];
                                Object obj2 = objArr[iA00 + 1];
                                int iA01 = A01(obj);
                                if (iA01 == -1 || !AnonymousClass001.A1X(g0v.invoke(this.A02[iA01 + 1], obj2))) {
                                    return false;
                                }
                            }
                        }
                    }
                } else {
                    int iBitCount = Integer.bitCount(i2) * 2;
                    C0968AJv c0968AJvA0B = ATD.A0B(ATD.A0C(0, iBitCount), 2);
                    int i3 = c0968AJvA0B.A00;
                    int i4 = c0968AJvA0B.A01;
                    int i5 = c0968AJvA0B.A02;
                    if (i5 <= 0 ? !(i5 >= 0 || i4 > i3) : i3 <= i4) {
                        while (C8j3.A1X(this.A02[i3], c0956AJj.A02, i3)) {
                            int i6 = i3 + 1;
                            if (!AnonymousClass001.A1X(g0v.invoke(this.A02[i6], c0956AJj.A02[i6]))) {
                                break;
                            }
                            if (i3 != i4) {
                                i3 += i5;
                            }
                        }
                    }
                    int length2 = this.A02.length;
                    while (iBitCount < length2) {
                        if (A0G(iBitCount).A0N(g0v, c0956AJj.A0G(iBitCount))) {
                            iBitCount++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    private final int A00() {
        if (this.A01 == 0) {
            return this.A02.length / 2;
        }
        int iBitCount = Integer.bitCount(this.A00);
        int length = this.A02.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += A0G(i).A00();
        }
        return iBitCount;
    }

    private final int A01(Object obj) {
        int i = 0;
        int iA00 = AKD.A00(0, this.A02.length - 1, 2);
        if (iA00 >= 0) {
            while (!C8j3.A1X(obj, this.A02, i)) {
                if (i != iA00) {
                    i += 2;
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX WARN: Incorrect types in method signature: (ITK;TV;ITK;TV;ILX/AHS;)LX/AJj<TK;TV;>; */
    private final C0956AJj A02(Object obj, Object obj2, Object obj3, Object obj4, AHS ahs, int i, int i2, int i3) {
        if (i3 > 30) {
            return new C0956AJj(ahs, new Object[]{obj, obj2, obj3, obj4}, 0, 0);
        }
        int i4 = (i >> i3) & 31;
        int i5 = (i2 >> i3) & 31;
        if (i4 == i5) {
            return new C0956AJj(ahs, new Object[]{A02(obj, obj2, obj3, obj4, ahs, i, i2, i3 + 5)}, 0, 1 << i4);
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
        return new C0956AJj(ahs, objArr, (1 << i4) | (1 << i5), 0);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AJj<TK;TV;>;LX/AJj<TK;TV;>;IILX/AHS;)LX/AJj<TK;TV;>; */
    private final C0956AJj A06(C0956AJj c0956AJj, C0956AJj c0956AJj2, AHS ahs, int i, int i2) {
        if (c0956AJj2 != null) {
            return (c0956AJj2 != c0956AJj || (c0956AJj2.A02.length == 2 && c0956AJj2.A01 == 0)) ? A07(c0956AJj2, ahs, i, i2) : this;
        }
        Object[] objArr = this.A02;
        int length = objArr.length;
        if (length == 1) {
            return null;
        }
        AHS ahs2 = this.A03;
        Object[] objArrA0t = C8j5.A0t(objArr, length, i);
        if (ahs2 != ahs) {
            return new C0956AJj(ahs, objArrA0t, this.A00, i2 ^ this.A01);
        }
        this.A02 = objArrA0t;
        this.A01 ^= i2;
        return this;
    }

    /* JADX WARN: Incorrect types in method signature: (IILX/AJj<TK;TV;>;LX/AHS;)LX/AJj<TK;TV;>; */
    private final C0956AJj A07(C0956AJj c0956AJj, AHS ahs, int i, int i2) {
        Object[] objArr = c0956AJj.A02;
        if (objArr.length != 2 || c0956AJj.A01 != 0) {
            if (ahs != null && this.A03 == ahs) {
                this.A02[i] = c0956AJj;
                return this;
            }
            Object[] objArr2 = this.A02;
            Object[] objArrA1a = C8j3.A1a(objArr2, objArr2.length);
            objArrA1a[i] = c0956AJj;
            return new C0956AJj(ahs, objArrA1a, this.A00, this.A01);
        }
        Object[] objArr3 = this.A02;
        int length = objArr3.length;
        if (length == 1) {
            c0956AJj.A00 = this.A01;
            return c0956AJj;
        }
        int iA0C = A0C(i2);
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrA1a2 = C8j3.A1a(objArr3, length + 1);
        int i3 = i + 1;
        System.arraycopy(objArrA1a2, i3, objArrA1a2, i + 2, length - i3);
        System.arraycopy(objArrA1a2, iA0C, objArrA1a2, iA0C + 2, i - iA0C);
        objArrA1a2[iA0C] = obj;
        objArrA1a2[iA0C + 1] = obj2;
        return new C0956AJj(ahs, objArrA1a2, this.A00 ^ i2, i2 ^ this.A01);
    }

    public final int A0C(int i) {
        return Integer.bitCount((i - 1) & this.A00) * 2;
    }

    public final int A0D(int i) {
        return (this.A02.length - 1) - Integer.bitCount((i - 1) & this.A01);
    }

    public final C0956AJj<K, V> A0G(int i) {
        Object obj = this.A02[i];
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (C0956AJj) obj;
    }

    /* JADX WARN: Incorrect types in method signature: (ITK;TV;ILX/AJi<TK;TV;>;)LX/AJj<TK;TV;>; */
    /* JADX WARN: Multi-variable type inference failed */
    public final C0956AJj A0I(Object obj, Object obj2, C0955AJi c0955AJi, int i, int i2) {
        AHS ahs;
        Object[] objArrA0A;
        int i3;
        int i4;
        int i5 = 1 << ((i >> i2) & 31);
        if ((this.A00 & i5) == 0) {
            if ((this.A01 & i5) != 0) {
                int iA0D = A0D(i5);
                C0956AJj<K, V> c0956AJjA0G = A0G(iA0D);
                C0956AJj<K, V> c0956AJjA03 = i2 == 30 ? c0956AJjA0G.A03(obj, obj2, c0955AJi) : c0956AJjA0G.A0I(obj, obj2, c0955AJi, i, i2 + 5);
                if (c0956AJjA0G != c0956AJjA03) {
                    return A07(c0956AJjA03, c0955AJi.A05, iA0D, i5);
                }
                return this;
            }
            c0955AJi.A03(c0955AJi.size() + 1);
            ahs = c0955AJi.A05;
            int iA0C = A0C(i5);
            AHS ahs2 = this.A03;
            objArrA0A = A0A(obj, obj2, this.A02, iA0C);
            if (ahs2 == ahs) {
                this.A02 = objArrA0A;
                this.A00 = i5 | this.A00;
                return this;
            }
            i3 = i5 | this.A00;
            i4 = this.A01;
            return new C0956AJj(ahs, objArrA0A, i3, i4);
        }
        int iA0C2 = A0C(i5);
        if (!C7384Etj.areEqual(obj, this.A02[iA0C2])) {
            c0955AJi.A03(c0955AJi.size() + 1);
            ahs = c0955AJi.A05;
            AHS ahs3 = this.A03;
            objArrA0A = A09(obj, obj2, ahs, iA0C2, i5, i, i2);
            if (ahs3 != ahs) {
                i3 = this.A00 ^ i5;
                i4 = i5 | this.A01;
                return new C0956AJj(ahs, objArrA0A, i3, i4);
            }
            this.A02 = objArrA0A;
            this.A00 ^= i5;
            this.A01 |= i5;
            return this;
        }
        Object[] objArr = this.A02;
        int i6 = iA0C2 + 1;
        V v = (V) objArr[i6];
        c0955AJi.A02 = v;
        if (v != obj2) {
            if (this.A03 != c0955AJi.A05) {
                c0955AJi.A00++;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                C7384Etj.A0U(objArrCopyOf);
                objArrCopyOf[i6] = obj2;
                return new C0956AJj(c0955AJi.A05, objArrCopyOf, this.A00, this.A01);
            }
            objArr[i6] = obj2;
        }
        return this;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AJj<TK;TV;>;ILX/AKB;LX/AJi<TK;TV;>;)LX/AJj<TK;TV;>; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0144 A[PHI: r11
  0x0144: PHI (r11v7 ??) = (r11v27 ??), (r11v28 ??), (r11v29 ??) binds: [B:56:0x0120, B:53:0x0113, B:64:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13, types: [X.AJj] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3, types: [X.AJj] */
    /* JADX WARN: Type inference failed for: r11v4, types: [X.AJj] */
    /* JADX WARN: Type inference failed for: r11v5, types: [X.AJj] */
    /* JADX WARN: Type inference failed for: r11v6, types: [X.AJj] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [X.AJj] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0956AJj A0L(X.C0955AJi r24, X.C0956AJj r25, X.AKB r26, int r27) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0956AJj.A0L(X.AJi, X.AJj, X.AKB, int):X.AJj");
    }

    public C0956AJj(AHS ahs, Object[] objArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = ahs;
        this.A02 = objArr;
    }

    private final C0956AJj<K, V> A03(K k, V v, C0955AJi<K, V> c0955AJi) {
        Object[] objArrA0A;
        int iA01 = A01(k);
        if (iA01 != -1) {
            Object[] objArr = this.A02;
            int i = iA01 + 1;
            V v2 = (V) objArr[i];
            c0955AJi.A02 = v2;
            if (v2 != v) {
                if (this.A03 == c0955AJi.A05) {
                    objArr[i] = v;
                } else {
                    c0955AJi.A00++;
                    objArrA0A = C8j3.A1a(objArr, objArr.length);
                    objArrA0A[i] = v;
                }
            }
            return this;
        }
        c0955AJi.A03(c0955AJi.size() + 1);
        objArrA0A = A0A(k, v, this.A02, 0);
        return new C0956AJj<>(c0955AJi.A05, objArrA0A, 0, 0);
    }

    /* JADX WARN: Incorrect types in method signature: (ILX/AJi<TK;TV;>;)LX/AJj<TK;TV;>; */
    private final C0956AJj A04(C0955AJi c0955AJi, int i) {
        c0955AJi.A03(c0955AJi.size() - 1);
        Object[] objArr = this.A02;
        c0955AJi.A02 = (V) objArr[i + 1];
        if (objArr.length == 2) {
            return null;
        }
        AHS ahs = this.A03;
        AHS ahs2 = c0955AJi.A05;
        Object[] objArrA0B = A0B(objArr, i);
        if (ahs != ahs2) {
            return new C0956AJj(c0955AJi.A05, objArrA0B, 0, 0);
        }
        this.A02 = objArrA0B;
        return this;
    }

    /* JADX WARN: Incorrect types in method signature: (IILX/AJi<TK;TV;>;)LX/AJj<TK;TV;>; */
    private final C0956AJj A05(C0955AJi c0955AJi, int i, int i2) {
        c0955AJi.A03(c0955AJi.size() - 1);
        Object[] objArr = this.A02;
        c0955AJi.A02 = (V) objArr[i + 1];
        if (objArr.length == 2) {
            return null;
        }
        AHS ahs = this.A03;
        AHS ahs2 = c0955AJi.A05;
        Object[] objArrA0B = A0B(objArr, i);
        if (ahs == ahs2) {
            this.A02 = objArrA0B;
            this.A00 ^= i2;
            return this;
        }
        return new C0956AJj(c0955AJi.A05, objArrA0B, i2 ^ this.A00, this.A01);
    }
}
