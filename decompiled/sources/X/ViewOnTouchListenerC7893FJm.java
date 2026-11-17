package X;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.FJm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnTouchListenerC7893FJm implements View.OnTouchListener {
    public FJY A00;
    public final FBB A01;
    public final FDW A02;
    public final FDW A03;
    public final float A04;

    public ViewOnTouchListenerC7893FJm(FBB fbb, FDW fdw, FDW fdw2) {
        this.A03 = fdw;
        this.A01 = fbb;
        this.A02 = fdw2;
        this.A00 = (FJY) FBA.A05(fbb, fdw);
        this.A04 = ViewConfiguration.get(fbb.A00).getScaledTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r4.A00 != false) goto L28;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            int r1 = r10.getAction()
            r6 = 0
            if (r1 == 0) goto L7f
            r5 = 1
            if (r1 == r5) goto L15
            r0 = 3
            if (r1 == r0) goto L67
            r0 = 4
            if (r1 == r0) goto L67
        L10:
            X.FJY r0 = r8.A00
            boolean r0 = r0.A00
            return r0
        L15:
            X.FJY r4 = r8.A00
            boolean r0 = r4.A00
            if (r0 == 0) goto L10
            float r7 = r10.getX()
            float r3 = r10.getY()
            float r2 = r8.A04
            X.C7384Etj.A0Y(r9, r6)
            float r1 = -r2
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L6d
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L6d
            int r1 = r9.getRight()
            int r0 = r9.getLeft()
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 + r2
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L6d
            int r0 = r9.getBottom()
            int r0 = X.AbstractC7607F5u.A0E(r9, r0)
            float r0 = (float) r0
            float r0 = r0 + r2
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L6d
            X.FDW r3 = r8.A03
            r0 = 38
            X.HsM r2 = r3.A0D(r0)
            if (r2 == 0) goto La8
            X.Fyg r1 = X.C9115Fyg.A00()
            X.FDW r0 = r8.A02
            r1.A06(r0, r6)
        L61:
            X.FBB r0 = r8.A01
            X.F9J.A03(r0, r3, r1, r2, r5)
            goto La8
        L67:
            X.FJY r4 = r8.A00
            boolean r0 = r4.A00
            if (r0 == 0) goto L10
        L6d:
            X.FDW r3 = r8.A03
            X.HsM r2 = X.AbstractC7608F5v.A0Z(r3)
            if (r2 == 0) goto La8
            X.Fyg r1 = X.C9115Fyg.A00()
            X.FDW r0 = r8.A02
            r1.A06(r0, r6)
            goto L61
        L7f:
            X.FDW r3 = r8.A03
            X.HsM r2 = X.AbstractC7608F5v.A0a(r3)
            if (r2 != 0) goto L88
            return r6
        L88:
            X.Fyg r1 = X.C9115Fyg.A00()
            X.FDW r0 = r8.A02
            X.Hj6 r1 = X.C9115Fyg.A03(r1, r0, r6)
            X.FBB r0 = r8.A01
            java.lang.Object r2 = X.F6D.A03(r0, r3, r1, r2)
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 != 0) goto Lac
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 != 0) goto Lac
            java.lang.String r1 = "Got non-boolean result while evaluating touch down expression"
            r0 = 0
            X.FFI.A01(r0, r1, r0)
            X.FJY r4 = r8.A00
        La8:
            r4.A00 = r6
            goto L10
        Lac:
            X.FJY r1 = r8.A00
            boolean r0 = X.HoH.A01(r2)
            r1.A00 = r0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC7893FJm.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
