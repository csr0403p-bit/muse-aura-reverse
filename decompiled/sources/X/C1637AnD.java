package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.AnD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1637AnD extends C8053FRg {
    public final /* synthetic */ C1453AjM A00;
    public final /* synthetic */ AndroidComposeView A01;
    public final /* synthetic */ AndroidComposeView A02;

    public C1637AnD(C1453AjM c1453AjM, AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.A02 = androidComposeView;
        this.A00 = c1453AjM;
        this.A01 = androidComposeView2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    @Override // X.C8053FRg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onInitializeAccessibilityNodeInfo(android.view.View r9, X.C2197BAc r10) {
        /*
            r8 = this;
            super.onInitializeAccessibilityNodeInfo(r9, r10)
            androidx.compose.ui.platform.AndroidComposeView r4 = r8.A02
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r5 = r4.A0v
            boolean r0 = r5.A0S()
            if (r0 == 0) goto L13
            r1 = 0
            android.view.accessibility.AccessibilityNodeInfo r0 = r10.A02
            r0.setVisibleToUser(r1)
        L13:
            X.AjM r6 = r8.A00
            r2 = r6
        L16:
            X.AjM r6 = r6.A0E()
            r3 = 0
            if (r6 == 0) goto L2d
            X.Aj7 r1 = r6.A0f
            r0 = 8
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L16
            int r0 = r6.A02
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L2d:
            r7 = -1
            if (r3 == 0) goto L3e
            X.AlM r0 = r4.A11
            X.Alc r0 = r0.A00()
            int r1 = r0.A01
            int r0 = r3.intValue()
            if (r0 != r1) goto L42
        L3e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
        L42:
            androidx.compose.ui.platform.AndroidComposeView r6 = r8.A01
            int r0 = r3.intValue()
            r10.A00 = r0
            android.view.accessibility.AccessibilityNodeInfo r3 = r10.A02
            r3.setParent(r6, r0)
            int r2 = r2.A02
            X.Abw r0 = r5.A06
            int r1 = r0.A02(r2)
            if (r1 < 0) goto L71
            int[] r0 = r0.A03
            r1 = r0[r1]
            if (r1 == r7) goto L71
            X.AnA r0 = r4.getAndroidViewsHandler$ui()
            X.An9 r0 = X.AbstractC1667Anq.A01(r0, r1)
            if (r0 == 0) goto L96
            r3.setTraversalBefore(r0)
        L6c:
            java.lang.String r0 = r5.A0W
            androidx.compose.ui.platform.AndroidComposeView.A0A(r3, r4, r0, r2)
        L71:
            X.Abw r0 = r5.A05
            int r1 = r0.A02(r2)
            if (r1 < 0) goto L91
            int[] r0 = r0.A03
            r1 = r0[r1]
            if (r1 == r7) goto L91
            X.AnA r0 = r4.getAndroidViewsHandler$ui()
            X.An9 r0 = X.AbstractC1667Anq.A01(r0, r1)
            if (r0 == 0) goto L92
            r3.setTraversalAfter(r0)
        L8c:
            java.lang.String r0 = r5.A0V
            androidx.compose.ui.platform.AndroidComposeView.A0A(r3, r4, r0, r2)
        L91:
            return
        L92:
            r3.setTraversalAfter(r6, r1)
            goto L8c
        L96:
            r3.setTraversalBefore(r6, r1)
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1637AnD.onInitializeAccessibilityNodeInfo(android.view.View, X.BAc):void");
    }
}
