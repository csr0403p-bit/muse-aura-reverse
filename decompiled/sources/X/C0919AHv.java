package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.AHv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0919AHv implements InterfaceC0857A6e, Iterable<Map.Entry<? extends C0920AHw<?>, ? extends Object>>, BOA {
    public boolean A00;
    public boolean A01;
    public Map<C0920AHw<?>, ? extends Object> A02;
    public final C0918AHu<C0920AHw<?>, Object> A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0919AHv) {
                C0919AHv c0919AHv = (C0919AHv) obj;
                if (!this.A03.equals(c0919AHv.A03) || this.A01 != c0919AHv.A01 || this.A00 != c0919AHv.A00) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0919AHv A00() {
        /*
            r16 = this;
            X.AHv r12 = new X.AHv
            r12.<init>()
            r1 = r16
            boolean r0 = r1.A01
            r12.A01 = r0
            boolean r0 = r1.A00
            r12.A00 = r0
            X.AHu<X.AHw<?>, java.lang.Object> r11 = r12.A03
            X.AHu<X.AHw<?>, java.lang.Object> r0 = r1.A03
            java.lang.Object[] r10 = r0.A04
            java.lang.Object[] r9 = r0.A05
            long[] r8 = r0.A03
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L58
            r6 = 0
        L1f:
            r15 = r8[r6]
            long r3 = X.C8j5.A0A(r15)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L53
            int r0 = X.C8j3.A0E(r6, r7)
            r5 = 8
            int r4 = 8 - r0
            r3 = 0
        L38:
            if (r3 >= r4) goto L51
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r15
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4d
            int r0 = r6 << 3
            int r0 = r0 + r3
            r1 = r10[r0]
            r0 = r9[r0]
            r11.A0E(r1, r0)
        L4d:
            long r15 = r15 >> r5
            int r3 = r3 + 1
            goto L38
        L51:
            if (r4 != r5) goto L58
        L53:
            if (r6 == r7) goto L58
            int r6 = r6 + 1
            goto L1f
        L58:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0919AHv.A00():X.AHv");
    }

    public final <T> T A01(C0920AHw<T> c0920AHw) {
        T t = (T) this.A03.A05(c0920AHw);
        if (t != null) {
            return t;
        }
        throw C3cG.A0Q(AnonymousClass001.A0v(" - consider getOrElse or getOrNull", C3cG.A0f(c0920AHw, "Key not present: ")));
    }

    public final void A02(C0919AHv c0919AHv) {
        C0918AHu<C0920AHw<?>, Object> c0918AHu = c0919AHv.A03;
        Object[] objArr = c0918AHu.A04;
        Object[] objArr2 = c0918AHu.A05;
        long[] jArr = c0918AHu.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((C8j5.A0A(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                int iA0E = 8 - C8j3.A0E(i, length);
                for (int i2 = 0; i2 < iA0E; i2++) {
                    if ((255 & j) < 128) {
                        int i3 = (i << 3) + i2;
                        Object obj = objArr[i3];
                        Object obj2 = objArr2[i3];
                        C0920AHw<?> c0920AHw = (C0920AHw) obj;
                        C0918AHu<C0920AHw<?>, Object> c0918AHu2 = this.A03;
                        Object objA05 = c0918AHu2.A05(c0920AHw);
                        C7384Etj.A0Z(c0920AHw, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objInvoke = c0920AHw.A02.invoke(objA05, obj2);
                        if (objInvoke != null) {
                            c0918AHu2.A0E(c0920AHw, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (iA0E != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC0857A6e
    public final <T> void Aca(C0920AHw<T> c0920AHw, T t) {
        if (t instanceof C0864A6l) {
            C0918AHu<C0920AHw<?>, Object> c0918AHu = this.A03;
            if (c0918AHu.A07(c0920AHw)) {
                Object objA05 = c0918AHu.A05(c0920AHw);
                C7384Etj.A0Z(objA05, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                C0864A6l c0864A6l = (C0864A6l) objA05;
                C0864A6l c0864A6l2 = (C0864A6l) t;
                String str = c0864A6l2.A00;
                if (str == null) {
                    str = c0864A6l.A00;
                }
                Ht9 ht9 = c0864A6l2.A01;
                if (ht9 == null) {
                    ht9 = c0864A6l.A01;
                }
                c0918AHu.A0E(c0920AHw, new C0864A6l(str, ht9));
                return;
            }
        }
        this.A03.A0E(c0920AHw, t);
    }

    public final int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass005.A0E(this.A03), this.A01), this.A00);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends C0920AHw<?>, ? extends Object>> iterator() {
        Map ags = this.A02;
        if (ags == null) {
            C0918AHu<C0920AHw<?>, Object> c0918AHu = this.A03;
            ags = c0918AHu.A02;
            if (ags == null) {
                ags = new AGS(c0918AHu);
                c0918AHu.A02 = ags;
            }
            this.A02 = ags;
        }
        return AnonymousClass002.A0n(ags);
    }

    public C0919AHv() {
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        this.A03 = new C0918AHu<>(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[PHI: r12
  0x0076: PHI (r12v4 java.lang.String) = (r12v3 java.lang.String), (r12v5 java.lang.String) binds: [B:12:0x003d, B:19:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            java.lang.StringBuilder r8 = X.C60O.A0w()
            r10 = r19
            boolean r0 = r10.A01
            java.lang.String r19 = ", "
            if (r0 == 0) goto L7b
            java.lang.String r0 = "mergeDescendants=true"
            r8.append(r0)
            r12 = r19
        L13:
            boolean r0 = r10.A00
            if (r0 == 0) goto L21
            r8.append(r12)
            java.lang.String r0 = "isClearingSemantics=true"
            r8.append(r0)
            r12 = r19
        L21:
            X.AHu<X.AHw<?>, java.lang.Object> r0 = r10.A03
            java.lang.Object[] r11 = r0.A04
            java.lang.Object[] r9 = r0.A05
            long[] r7 = r0.A03
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L7e
            r5 = 0
        L2f:
            r17 = r7[r5]
            long r3 = X.C8j5.A0A(r17)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L76
            int r0 = X.C8j3.A0E(r5, r6)
            r4 = 8
            int r3 = 8 - r0
            r2 = 0
        L48:
            if (r2 >= r3) goto L74
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r17
            r13 = 128(0x80, double:6.32E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L6f
            int r1 = r5 << 3
            int r1 = r1 + r2
            r0 = r11[r1]
            r1 = r9[r1]
            X.AHw r0 = (X.C0920AHw) r0
            r8.append(r12)
            java.lang.String r0 = r0.A01
            r8.append(r0)
            java.lang.String r0 = " : "
            r8.append(r0)
            r8.append(r1)
            r12 = r19
        L6f:
            long r17 = r17 >> r4
            int r2 = r2 + 1
            goto L48
        L74:
            if (r3 != r4) goto L7e
        L76:
            if (r5 == r6) goto L7e
            int r5 = r5 + 1
            goto L2f
        L7b:
            java.lang.String r12 = ""
            goto L13
        L7e:
            java.lang.StringBuilder r1 = X.C60O.A0w()
            java.lang.String r0 = X.AbstractC0867A6r.A00(r10)
            r1.append(r0)
            java.lang.String r0 = "{ "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " }"
            java.lang.String r0 = X.AnonymousClass001.A0v(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0919AHv.toString():java.lang.String");
    }
}
