package X;

/* renamed from: X.AhU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1343AhU {
    public final C0910AHm<C1340AhR> A01 = C0910AHm.A01(new C1340AhR[16]);
    public final C0912AHo<C1343AhU> A00 = new C0912AHo<>(10);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r5v7, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [X.Aj8] */
    public final void A00() {
        if (!(this instanceof C1340AhR)) {
            C0910AHm<C1340AhR> c0910AHm = this.A01;
            C1340AhR[] c1340AhRArr = c0910AHm.A01;
            int i = c0910AHm.A00;
            for (int i2 = 0; i2 < i; i2++) {
                c1340AhRArr[i2].A00();
            }
            return;
        }
        C1340AhR c1340AhR = (C1340AhR) this;
        C0910AHm<C1340AhR> c0910AHm2 = ((C1343AhU) c1340AhR).A01;
        C1340AhR[] c1340AhRArr2 = c0910AHm2.A01;
        int i3 = c0910AHm2.A00;
        for (int i4 = 0; i4 < i3; i4++) {
            c1340AhRArr2[i4].A00();
        }
        AbstractC1437Aj6 abstractC1437Aj6A00 = c1340AhR.A06;
        C0910AHm c0910AHmA0W = null;
        while (abstractC1437Aj6A00 != 0) {
            if (abstractC1437Aj6A00 instanceof InterfaceC1348AhZ) {
                ((InterfaceC1348AhZ) abstractC1437Aj6A00).onViewConfigurationChange();
            } else if ((abstractC1437Aj6A00.kindSet & 16) != 0 && (abstractC1437Aj6A00 instanceof AbstractC1437Aj6)) {
                AbstractC1439Aj8 abstractC1439Aj8 = abstractC1437Aj6A00.A00;
                int i5 = 0;
                abstractC1437Aj6A00 = abstractC1437Aj6A00;
                while (abstractC1439Aj8 != null) {
                    if ((abstractC1439Aj8.kindSet & 16) != 0) {
                        i5++;
                        if (i5 == 1) {
                            abstractC1437Aj6A00 = abstractC1439Aj8;
                        } else {
                            c0910AHmA0W = C8j4.A0W(c0910AHmA0W);
                            abstractC1437Aj6A00 = C8j4.A0X(c0910AHmA0W, abstractC1437Aj6A00);
                            c0910AHmA0W.A0G(abstractC1439Aj8);
                        }
                    }
                    abstractC1439Aj8 = abstractC1439Aj8.child;
                    abstractC1437Aj6A00 = abstractC1437Aj6A00;
                }
                if (i5 == 1) {
                }
            }
            abstractC1437Aj6A00 = AbstractC1414Aij.A00(c0910AHmA0W);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (JLX/AHo<LX/AhR;>;)V */
    public final void A01(C0912AHo c0912AHo, long j) {
        if (!(this instanceof C1340AhR)) {
            C0910AHm<C1340AhR> c0910AHm = this.A01;
            C1340AhR[] c1340AhRArr = c0910AHm.A01;
            int i = c0910AHm.A00;
            for (int i2 = 0; i2 < i; i2++) {
                c1340AhRArr[i2].A01(c0912AHo, j);
            }
            return;
        }
        C1340AhR c1340AhR = (C1340AhR) this;
        C1344AhV c1344AhV = c1340AhR.A07;
        int i3 = c1344AhV.A00;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            if (c1344AhV.A01[i4] != j) {
                i4++;
            } else if (c0912AHo.A02(c1340AhR) < 0) {
                c1344AhV.A01(j);
                c1340AhR.A05.A07(j);
            }
        }
        C0910AHm<C1340AhR> c0910AHm2 = ((C1343AhU) c1340AhR).A01;
        C1340AhR[] c1340AhRArr2 = c0910AHm2.A01;
        int i5 = c0910AHm2.A00;
        for (int i6 = 0; i6 < i5; i6++) {
            c1340AhRArr2[i6].A01(c0912AHo, j);
        }
    }

    public void A02(C1319Ah5 c1319Ah5) {
        C0910AHm<C1340AhR> c0910AHm = this.A01;
        int i = c0910AHm.A00;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (c0910AHm.A01[i].A07.A00 == 0) {
                c0910AHm.A07(i);
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AoO<LX/Agk;>;LX/Ak4;LX/Ah5;Z)Z */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A03(X.C1685AoO r5, X.C1319Ah5 r6, X.InterfaceC1497Ak4 r7, boolean r8) {
        /*
            r4 = this;
            X.AHm<X.AhR> r0 = r4.A01
            T[] r4 = r0.A01
            int r3 = r0.A00
            r2 = 0
            r1 = 0
        L8:
            if (r2 >= r3) goto L1c
            r0 = r4[r2]
            X.AhU r0 = (X.C1343AhU) r0
            boolean r0 = r0.A03(r5, r6, r7, r8)
            if (r0 != 0) goto L18
            r0 = r1
            r1 = 0
            if (r0 == 0) goto L19
        L18:
            r1 = 1
        L19:
            int r2 = r2 + 1
            goto L8
        L1c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1343AhU.A03(X.AoO, X.Ah5, X.Ak4, boolean):boolean");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AoO<LX/Agk;>;LX/Ak4;LX/Ah5;Z)Z */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f8  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r11v6, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04(X.C1685AoO r14, X.C1319Ah5 r15, X.InterfaceC1497Ak4 r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1343AhU.A04(X.AoO, X.Ah5, X.Ak4, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r9v5, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(X.C1319Ah5 r13) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.C1340AhR
            if (r0 == 0) goto L9c
            X.AhR r12 = (X.C1340AhR) r12
            X.AoO<X.Agk> r6 = r12.A05
            int r0 = r6.A00()
            boolean r0 = X.AnonymousClass002.A1M(r0)
            r4 = 0
            if (r0 != 0) goto L92
            X.Aj8 r11 = r12.A06
            boolean r0 = r11.isAttached
            if (r0 == 0) goto L92
            X.AiH r0 = r11.coordinator
            if (r0 == 0) goto L92
            X.AjM r0 = r0.A0P
            if (r0 == 0) goto L92
            X.AjS r0 = r0.A0d
            X.AjN r0 = r0.A0G
            boolean r0 = r0.A0G
            if (r0 == 0) goto L92
            X.Afe r10 = r12.A00
            X.C7384Etj.A0X(r10)
            X.Ak4 r0 = r12.A01
            X.C7384Etj.A0X(r0)
            long r1 = r0.AKd()
            r9 = r11
            r8 = 0
        L39:
            r7 = 1
            if (r9 == 0) goto L7b
            boolean r0 = r9 instanceof X.InterfaceC1348AhZ
            if (r0 == 0) goto L4c
            X.AhZ r9 = (X.InterfaceC1348AhZ) r9
            X.AXj r0 = X.EnumC1080AXj.A02
            r9.mo13onPointerEventH0pRuoY(r10, r0, r1)
        L47:
            X.Aj8 r9 = X.AbstractC1414Aij.A00(r8)
            goto L39
        L4c:
            int r0 = r9.kindSet
            r0 = r0 & 16
            if (r0 == 0) goto L47
            boolean r0 = r9 instanceof X.AbstractC1437Aj6
            if (r0 == 0) goto L47
            r0 = r9
            X.Aj6 r0 = (X.AbstractC1437Aj6) r0
            X.Aj8 r5 = r0.A00
            r3 = 0
        L5c:
            if (r5 == 0) goto L78
            int r0 = r5.kindSet
            r0 = r0 & 16
            if (r0 == 0) goto L69
            int r3 = r3 + 1
            if (r3 != r7) goto L6c
            r9 = r5
        L69:
            X.Aj8 r5 = r5.child
            goto L5c
        L6c:
            X.AHm r8 = X.C8j4.A0W(r8)
            X.Aj8 r9 = X.C8j4.A0X(r8, r9)
            r8.A0G(r5)
            goto L69
        L78:
            if (r3 != r7) goto L47
            goto L39
        L7b:
            boolean r0 = r11.isAttached
            if (r0 == 0) goto L91
            X.AHm<X.AhR> r0 = r12.A01
            T[] r2 = r0.A01
            int r1 = r0.A00
        L85:
            if (r4 >= r1) goto L91
            r0 = r2[r4]
            X.AhU r0 = (X.C1343AhU) r0
            r0.A05(r13)
            int r4 = r4 + 1
            goto L85
        L91:
            r4 = 1
        L92:
            r12.A02(r13)
            r6.A05()
            r0 = 0
            r12.A01 = r0
            return r4
        L9c:
            X.AHm<X.AhR> r0 = r12.A01
            T[] r3 = r0.A01
            int r2 = r0.A00
            r1 = 0
            r4 = 0
        La4:
            if (r1 >= r2) goto Lb8
            r0 = r3[r1]
            X.AhU r0 = (X.C1343AhU) r0
            boolean r0 = r0.A05(r13)
            if (r0 != 0) goto Lb4
            r0 = r4
            r4 = 0
            if (r0 == 0) goto Lb5
        Lb4:
            r4 = 1
        Lb5:
            int r1 = r1 + 1
            goto La4
        Lb8:
            r12.A02(r13)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1343AhU.A05(X.Ah5):boolean");
    }
}
