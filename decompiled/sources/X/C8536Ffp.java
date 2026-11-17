package X;

import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Ffp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8536Ffp extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ C8535Ffo A02;
    public final /* synthetic */ C8542Ffv A03;
    public final /* synthetic */ boolean A04;

    public C8536Ffp(View view, ViewGroup viewGroup, C8535Ffo c8535Ffo, C8542Ffv c8542Ffv, boolean z) {
        this.A01 = viewGroup;
        this.A00 = view;
        this.A04 = z;
        this.A03 = c8542Ffv;
        this.A02 = c8535Ffo;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationEnd(android.animation.Animator r6) {
        /*
            r5 = this;
            android.view.ViewGroup r4 = r5.A01
            android.view.View r3 = r5.A00
            r4.endViewTransition(r3)
            boolean r0 = r5.A04
            if (r0 != 0) goto L13
            X.Ffv r2 = r5.A03
            java.lang.Integer r1 = r2.A00
            java.lang.Integer r0 = X.C79.A0C
            if (r1 != r0) goto L1d
        L13:
            X.Ffv r2 = r5.A03
            java.lang.Integer r0 = r2.A00
            X.C7384Etj.A0T(r3)
            X.AbstractC8523FfY.A02(r3, r4, r0)
        L1d:
            X.Ffo r1 = r5.A02
            X.Ffm r0 = r1.A01
            X.Ffv r0 = r0.A00
            r0.A04(r1)
            boolean r0 = X.AbstractC8571FgQ.A0L()
            if (r0 == 0) goto L37
            java.lang.String r0 = "Animator from operation "
            java.lang.StringBuilder r1 = X.C3cG.A0f(r2, r0)
            java.lang.String r0 = " has ended."
            X.AbstractC7610F5x.A1O(r1, r0)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8536Ffp.onAnimationEnd(android.animation.Animator):void");
    }
}
