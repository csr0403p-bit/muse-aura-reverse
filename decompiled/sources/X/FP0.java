package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class FP0 extends AbstractC8493Ff0 implements FPU {
    public Integer A00;
    public boolean A01;
    public final View A02;
    public final /* synthetic */ C8005FOz A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FP0(View view, C8005FOz c8005FOz) {
        super(1);
        this.A03 = c8005FOz;
        this.A02 = view;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Ff4;Ljava/util/List<LX/Fex;>;)V */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C8497Ff4 r11, X.FP0 r12) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FP0.A00(X.Ff4, X.FP0):void");
    }

    @Override // X.FPU
    public final C8497Ff4 onApplyWindowInsets(View view, C8497Ff4 c8497Ff4) {
        AnonymousClass003.A0u(view, c8497Ff4);
        C8005FOz c8005FOz = this.A03;
        c8005FOz.A0A.onApplyWindowInsets(view, c8497Ff4);
        if (!this.A01) {
            if (!C8005FOz.A01()) {
                AbstractC8060FRo.A03(view, c8497Ff4);
            }
            A00(c8497Ff4, this);
        }
        if (c8005FOz.A08 && C8005FOz.A01() && !c8005FOz.A07) {
            return AbstractC8060FRo.A03(view, c8497Ff4);
        }
        C8497Ff4 c8497Ff42 = C8497Ff4.A01;
        C7384Etj.A0V(c8497Ff42);
        return c8497Ff42;
    }
}
