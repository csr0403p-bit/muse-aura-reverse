package X;

import java.util.List;

/* loaded from: classes5.dex */
public abstract class E0O {
    /* JADX WARN: Incorrect types in method signature: (LX/E0T;LX/E03;LX/Dgn<LX/E00;>;)V */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.InterfaceC5344Dgn r11, X.E0T r12, X.E03 r13) {
        /*
            long r7 = r13.A00
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L47
            r1 = 0
        Lc:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 == 0) goto L45
            int r0 = r12.AFO()
            if (r1 >= r0) goto L45
            java.util.List r6 = r12.AEJ(r7)
            long r9 = r12.AFN(r1)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L45
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L45
            long r9 = r9 - r7
            X.E00 r5 = new X.E00
            r5.<init>(r6, r7, r9)
            r11.accept(r5)
            r3 = 1
        L38:
            r2 = r1
        L39:
            int r0 = r12.AFO()
            if (r2 >= r0) goto L60
            A00(r11, r12, r2)
            int r2 = r2 + 1
            goto L39
        L45:
            r3 = 0
            goto L38
        L47:
            int r1 = r12.AI2(r7)
            r0 = -1
            if (r1 != r0) goto L52
            int r1 = r12.AFO()
        L52:
            if (r1 <= 0) goto Lc
            int r4 = r1 + (-1)
            long r2 = r12.AFN(r4)
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto Lc
            r1 = r4
            goto Lc
        L60:
            boolean r0 = r13.A01
            if (r0 == 0) goto L87
            if (r3 == 0) goto L68
            int r1 = r1 + (-1)
        L68:
            if (r4 >= r1) goto L70
            A00(r11, r12, r4)
            int r4 = r4 + 1
            goto L68
        L70:
            if (r3 == 0) goto L87
            java.util.List r4 = r12.AEJ(r7)
            long r5 = r12.AFN(r1)
            long r0 = r12.AFN(r1)
            long r7 = r7 - r0
            X.E00 r3 = new X.E00
            r3.<init>(r4, r5, r7)
            r11.accept(r3)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E0O.A01(X.Dgn, X.E0T, X.E03):void");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/E0T;ILX/Dgn<LX/E00;>;)V */
    public static void A00(InterfaceC5344Dgn interfaceC5344Dgn, E0T e0t, int i) {
        long jAFN = e0t.AFN(i);
        List<E0J> listAEJ = e0t.AEJ(jAFN);
        if (listAEJ.isEmpty()) {
            return;
        }
        if (i == e0t.AFO() - 1) {
            throw BV4.A0T();
        }
        long jAFN2 = e0t.AFN(i + 1) - e0t.AFN(i);
        if (jAFN2 > 0) {
            interfaceC5344Dgn.accept(new E00(listAEJ, jAFN, jAFN2));
        }
    }
}
