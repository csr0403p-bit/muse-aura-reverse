package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes4.dex */
public final class Am9 implements Runnable {
    public static final String __redex_internal_original_name = "AndroidComposeView$resendMotionEventRunnable$1";
    public final /* synthetic */ AndroidComposeView A00;

    public Am9(AndroidComposeView androidComposeView) {
        this.A00 = androidComposeView;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            androidx.compose.ui.platform.AndroidComposeView r3 = r7.A00
            r3.removeCallbacks(r7)
            android.view.MotionEvent r2 = r3.A03
            if (r2 == 0) goto L23
            int r1 = r2.getActionMasked()
            r0 = 10
            if (r1 == r0) goto L23
            r0 = 1
            if (r1 == r0) goto L23
            r0 = 7
            if (r1 == r0) goto L1c
            r0 = 9
            r4 = 2
            if (r1 != r0) goto L1d
        L1c:
            r4 = 7
        L1d:
            long r5 = r3.A01
            r7 = 0
            androidx.compose.ui.platform.AndroidComposeView.A07(r2, r3, r4, r5, r7)
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Am9.run():void");
    }
}
