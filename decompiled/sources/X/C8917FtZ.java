package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.FtZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8917FtZ implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public C8917FtZ(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                ((View) ((C8311Fbd) ((InterfaceC8349FcN) this.A00)).A00.A08.getParent()).invalidate();
                break;
            case 1:
                float fA03 = AbstractC7609F5w.A03(valueAnimator);
                C8124FUo c8124FUo = (C8124FUo) this.A00;
                C8125FUp c8125FUp = (C8125FUp) this.A01;
                c8124FUo.A01(c8125FUp, fA03);
                c8124FUo.A02(c8125FUp, fA03, false);
                c8124FUo.invalidateSelf();
                break;
            default:
                C7384Etj.A0Y(valueAnimator, 0);
                AbstractC7691FAk.A00((F6D) this.A00, C9115Fyg.A04(valueAnimator), (HsM) this.A01);
                break;
        }
    }
}
