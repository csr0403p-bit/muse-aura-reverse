package X;

/* loaded from: classes6.dex */
public final class FL5 implements FHS {
    public final /* synthetic */ FLA A00;

    public FL5(FLA fla) {
        this.A00 = fla;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r0 <= 0) goto L37;
     */
    @Override // X.FHS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean ATg(android.view.MotionEvent r10, android.view.View r11) {
        /*
            r9 = this;
            X.FLA r0 = r9.A00
            X.FPq r2 = r0.A00
            if (r2 == 0) goto L90
            r9 = 0
            r6 = 1
            boolean r0 = r2.A04
            if (r0 == 0) goto L90
            int r0 = r10.getAction()
            r8 = 1
            if (r0 != 0) goto L2a
            float r0 = r10.getX()
            r2.A00 = r0
            float r0 = r10.getY()
            r2.A01 = r0
            android.view.ViewParent r0 = r11.getParent()
            if (r0 == 0) goto L2a
            r0.requestDisallowInterceptTouchEvent(r6)
            r2.A03 = r6
        L2a:
            int r1 = r10.getAction()
            r0 = 2
            if (r1 != r0) goto L8b
            float r1 = r10.getX()
            float r0 = r2.A00
            float r7 = X.C8j3.A01(r1, r0)
            float r1 = r10.getY()
            float r0 = r2.A01
            float r5 = X.C8j3.A01(r1, r0)
            java.lang.String r4 = r2.A02
            r0 = 34
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r4)
            r3 = 1084227584(0x40a00000, float:5.0)
            r2 = 1101004800(0x41a00000, float:20.0)
            r1 = 1092616192(0x41200000, float:10.0)
            if (r0 == 0) goto L6a
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L61
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L65
        L61:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
        L63:
            if (r0 <= 0) goto L8b
        L65:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L6a:
            java.lang.String r0 = "horizontal"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L7d
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7a
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L65
        L7a:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            goto L63
        L7d:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L86
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L86
            r8 = 0
        L86:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        L8b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            return r0
        L90:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FL5.ATg(android.view.MotionEvent, android.view.View):java.lang.Boolean");
    }
}
