package X;

import android.view.View;

/* renamed from: X.FSm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnApplyWindowInsetsListenerC8081FSm implements View.OnApplyWindowInsetsListener {
    public C8497Ff4 A00 = null;
    public final /* synthetic */ View A01;
    public final /* synthetic */ FPU A02;

    public ViewOnApplyWindowInsetsListenerC8081FSm(View view, FPU fpu) {
        this.A01 = view;
        this.A02 = fpu;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    @Override // android.view.View.OnApplyWindowInsetsListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View r6, android.view.WindowInsets r7) {
        /*
            r5 = this;
            X.Ff4 r4 = X.C8497Ff4.A01(r6, r7)
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r3 >= r2) goto L2d
            android.view.View r1 = r5.A01
            r0 = 2131362437(0x7f0a0285, float:1.8344655E38)
            java.lang.Object r0 = r1.getTag(r0)
            android.view.View$OnApplyWindowInsetsListener r0 = (android.view.View.OnApplyWindowInsetsListener) r0
            if (r0 == 0) goto L1a
            r0.onApplyWindowInsets(r1, r7)
        L1a:
            X.Ff4 r0 = r5.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L2d
            X.FPU r0 = r5.A02
            X.Ff4 r0 = r0.onApplyWindowInsets(r6, r4)
        L28:
            android.view.WindowInsets r0 = r0.A02()
            return r0
        L2d:
            r5.A00 = r4
            X.FPU r0 = r5.A02
            X.Ff4 r0 = r0.onApplyWindowInsets(r6, r4)
            if (r3 >= r2) goto L28
            r6.requestApplyInsets()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnApplyWindowInsetsListenerC8081FSm.onApplyWindowInsets(android.view.View, android.view.WindowInsets):android.view.WindowInsets");
    }
}
