package X;

/* loaded from: classes4.dex */
public abstract class AI3<Key, Scope> {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C0918AHu<java.lang.Object, java.lang.Object> r13, Scope r14) {
        /*
            long[] r8 = r13.A03
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L5a
            r6 = 0
        L8:
            r11 = r8[r6]
            r3 = -1
            long r3 = r3 ^ r11
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r11
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L55
            int r0 = r6 - r7
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            r5 = 8
            int r4 = 8 - r0
            r3 = 0
        L25:
            if (r3 >= r4) goto L53
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r11
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4c
            int r2 = r6 << 3
            int r2 = r2 + r3
            java.lang.Object[] r0 = r13.A05
            r1 = r0[r2]
            boolean r0 = r1 instanceof X.C0917AHt
            if (r0 == 0) goto L50
            java.lang.String r0 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"
            X.C7384Etj.A0Z(r1, r0)
            X.AHt r1 = (X.C0917AHt) r1
            r1.A0C(r14)
            int r0 = r1.A01
            if (r0 != 0) goto L4c
        L49:
            r13.A0A(r2)
        L4c:
            long r11 = r11 >> r5
            int r3 = r3 + 1
            goto L25
        L50:
            if (r1 != r14) goto L4c
            goto L49
        L53:
            if (r4 != r5) goto L5a
        L55:
            if (r6 == r7) goto L5a
            int r6 = r6 + 1
            goto L8
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AI3.A00(X.AHu, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.AHt] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    public static final void A01(C0918AHu<Object, Object> c0918AHu, Key key, Scope scope) {
        int iA09 = c0918AHu.A09(key);
        if (iA09 < 0) {
            iA09 ^= -1;
            c0918AHu.A04[iA09] = key;
        } else {
            ?? r2 = c0918AHu.A05[iA09];
            if (r2 != 0) {
                if (r2 instanceof C0917AHt) {
                    ((C0917AHt) r2).A0B(scope);
                } else if (r2 != scope) {
                    ?? c0917AHt = new C0917AHt(6);
                    c0917AHt.A0B(r2);
                    c0917AHt.A0B(scope);
                    scope = c0917AHt;
                }
                scope = r2;
            }
        }
        c0918AHu.A05[iA09] = scope;
    }

    public static final boolean A02(C0918AHu<Object, Object> c0918AHu, Key key, Scope scope) {
        Object objA05 = c0918AHu.A05(key);
        boolean zA0C = false;
        if (objA05 != null) {
            if (objA05 instanceof C0917AHt) {
                C0917AHt c0917AHt = (C0917AHt) objA05;
                zA0C = c0917AHt.A0C(scope);
                if (zA0C && c0917AHt.A01 == 0) {
                    c0918AHu.A0B(key);
                }
            } else if (objA05.equals(scope)) {
                c0918AHu.A0B(key);
                return true;
            }
        }
        return zA0C;
    }
}
