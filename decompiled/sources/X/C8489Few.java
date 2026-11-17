package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.Collections;

/* renamed from: X.Few, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8489Few implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewOnApplyWindowInsetsListenerC8486Fet A02;
    public final /* synthetic */ C8490Fex A03;
    public final /* synthetic */ C8497Ff4 A04;
    public final /* synthetic */ C8497Ff4 A05;

    public C8489Few(View view, ViewOnApplyWindowInsetsListenerC8486Fet viewOnApplyWindowInsetsListenerC8486Fet, C8490Fex c8490Fex, C8497Ff4 c8497Ff4, C8497Ff4 c8497Ff42, int i) {
        this.A02 = viewOnApplyWindowInsetsListenerC8486Fet;
        this.A03 = c8490Fex;
        this.A05 = c8497Ff4;
        this.A04 = c8497Ff42;
        this.A00 = i;
        this.A01 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C8490Fex c8490Fex = this.A03;
        c8490Fex.A00.A09(valueAnimator.getAnimatedFraction());
        C8497Ff4 c8497Ff4 = this.A05;
        C8497Ff4 c8497Ff42 = this.A04;
        float fA06 = c8490Fex.A00.A06();
        int i = this.A00;
        Interpolator interpolator = C8487Feu.A00;
        C8498Ff5 c8498Ff5 = new C8498Ff5(c8497Ff4);
        int i2 = 1;
        do {
            int i3 = i & i2;
            C8345FcJ c8345FcJA04 = c8497Ff4.A00.A04(i2);
            if (i3 != 0) {
                C8345FcJ c8345FcJA042 = c8497Ff42.A00.A04(i2);
                float f = 1.0f - fA06;
                c8345FcJA04 = C8497Ff4.A00(c8345FcJA04, (int) (((c8345FcJA04.A01 - c8345FcJA042.A01) * f) + 0.5d), (int) (((c8345FcJA04.A03 - c8345FcJA042.A03) * f) + 0.5d), (int) (((c8345FcJA04.A02 - c8345FcJA042.A02) * f) + 0.5d), (int) (((c8345FcJA04.A00 - c8345FcJA042.A00) * f) + 0.5d));
            }
            c8498Ff5.A00.A00(c8345FcJA04, i2);
            i2 <<= 1;
        } while (i2 <= 512);
        C8487Feu.A04(this.A01, c8498Ff5.A00(), Collections.singletonList(c8490Fex));
    }
}
