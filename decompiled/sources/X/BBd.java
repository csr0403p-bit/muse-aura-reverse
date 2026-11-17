package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class BBd {
    public int A00;
    public final int A01;
    public final Ab2<C2242BCn> A02;
    public final List<C2234BCe> A03;
    public final List<C2234BCe> A04;
    public final F0C A05;

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(int r16, int r17) {
        /*
            r15 = this;
            X.Ab2<X.BCn> r1 = r15.A02
            r0 = r16
            java.lang.Object r10 = r1.A04(r0)
            X.BCn r10 = (X.C2242BCn) r10
            r0 = 0
            if (r10 == 0) goto L70
            int r9 = r10.A01
            int r0 = r10.A00
            r2 = r17
            int r17 = r17 - r0
            r10.A00 = r2
            if (r17 == 0) goto L6f
            java.lang.Object[] r8 = r1.A04
            long[] r7 = r1.A03
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L6f
            r5 = 0
        L23:
            r15 = r7[r5]
            r3 = -1
            long r3 = r3 ^ r15
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r15
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L6a
            int r0 = r5 - r6
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            r4 = 8
            int r3 = 8 - r0
            r2 = 0
        L40:
            if (r2 >= r3) goto L68
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r15
            r11 = 128(0x80, double:6.32E-322)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L64
            int r0 = r5 << 3
            int r0 = r0 + r2
            r1 = r8[r0]
            X.BCn r1 = (X.C2242BCn) r1
            int r0 = r1.A01
            if (r0 < r9) goto L64
            boolean r0 = r1.equals(r10)
            if (r0 != 0) goto L64
            int r0 = r1.A01
            int r0 = r0 + r17
            if (r0 < 0) goto L64
            r1.A01 = r0
        L64:
            long r15 = r15 >> r4
            int r2 = r2 + 1
            goto L40
        L68:
            if (r3 != r4) goto L6f
        L6a:
            if (r5 == r6) goto L6f
            int r5 = r5 + 1
            goto L23
        L6f:
            r0 = 1
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBd.A00(int, int):boolean");
    }

    public BBd(List<C2234BCe> list, int i) {
        this.A03 = list;
        this.A01 = i;
        if (i < 0) {
            throw C60O.A0i("Invalid start index");
        }
        this.A04 = C3cG.A0h();
        Ab2<C2242BCn> ab2A01 = Ab2.A01();
        int size = this.A03.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C2234BCe c2234BCe = this.A03.get(i3);
            int i4 = c2234BCe.A01;
            int i5 = c2234BCe.A02;
            C2242BCn c2242BCn = new C2242BCn();
            c2242BCn.A02 = i3;
            c2242BCn.A01 = i2;
            c2242BCn.A00 = i5;
            ab2A01.A0B(i4, c2242BCn);
            i2 += i5;
        }
        this.A02 = ab2A01;
        this.A05 = AbstractC5321DgF.A03(C2293BSt.A00(this, 24));
    }
}
