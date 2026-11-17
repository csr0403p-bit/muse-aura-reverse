package X;

/* loaded from: classes6.dex */
public abstract class FSG extends FSF {
    public AbstractC8085FSq A00;
    public AbstractC8085FSq A01;

    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(X.FSG r19, X.AbstractC8085FSq r20, X.FTN r21, int r22, int r23) {
        /*
            r2 = r19
            android.widget.Scroller r11 = r2.A00
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            r12 = 0
            r14 = r22
            r15 = r23
            r13 = r12
            r18 = r16
            r19 = r5
            r17 = r5
            r11.fling(r12, r13, r14, r15, r16, r17, r18, r19)
            android.widget.Scroller r0 = r2.A00
            int r1 = r0.getFinalX()
            android.widget.Scroller r0 = r2.A00
            int r0 = r0.getFinalY()
            int[] r10 = new int[]{r1, r0}
            r11 = r21
            int r9 = r11.A0h()
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L7d
            r7 = 0
            r6 = r7
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
        L37:
            if (r3 >= r9) goto L4f
            android.view.View r2 = r11.A0x(r3)
            int r1 = X.FTN.A0Y(r2)
            r0 = -1
            if (r1 == r0) goto L4c
            if (r1 >= r5) goto L48
            r7 = r2
            r5 = r1
        L48:
            if (r1 <= r4) goto L4c
            r6 = r2
            r4 = r1
        L4c:
            int r3 = r3 + 1
            goto L37
        L4f:
            if (r7 == 0) goto L7d
            if (r6 == 0) goto L7d
            r3 = r20
            int r1 = r3.A09(r7)
            int r0 = r3.A09(r6)
            int r2 = java.lang.Math.min(r1, r0)
            int r1 = r3.A06(r7)
            int r0 = r3.A06(r6)
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = r0 - r2
            if (r0 == 0) goto L7d
            float r1 = (float) r0
            float r1 = r1 * r8
            int r4 = r4 - r5
            int r0 = r4 + 1
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L7f
            return r12
        L7d:
            r1 = 1065353216(0x3f800000, float:1.0)
        L7f:
            r4 = r10[r12]
            int r3 = java.lang.Math.abs(r4)
            r0 = 1
            r2 = r10[r0]
            int r0 = java.lang.Math.abs(r2)
            if (r3 <= r0) goto L8f
            r2 = r4
        L8f:
            float r0 = (float) r2
            float r0 = r0 / r1
            int r0 = java.lang.Math.round(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FSG.A01(X.FSG, X.FSq, X.FTN, int, int):int");
    }
}
