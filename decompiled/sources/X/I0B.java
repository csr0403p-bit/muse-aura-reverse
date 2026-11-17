package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes6.dex */
public final class I0B extends Animation {
    public final int $t;
    public final Object A00;

    public I0B(C8117FUh c8117FUh, int i) {
        this.$t = i;
        this.A00 = c8117FUh;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.$t;
        C8117FUh c8117FUh = (C8117FUh) this.A00;
        switch (i) {
            case 0:
                c8117FUh.setAnimationProgress(f);
                break;
            case 1:
                c8117FUh.setAnimationProgress(1.0f - f);
                break;
            case 2:
                AbstractC7611F5y.A0l(c8117FUh, f, c8117FUh.A09 - Math.abs(c8117FUh.A08), c8117FUh.A06);
                C8124FUo c8124FUo = c8117FUh.A0H;
                float f2 = 1.0f - f;
                C8125FUp c8125FUp = c8124FUo.A05;
                if (f2 != c8125FUp.A00) {
                    c8125FUp.A00 = f2;
                }
                c8124FUo.invalidateSelf();
                break;
            default:
                AbstractC7611F5y.A0l(c8117FUh, f, c8117FUh.A08, c8117FUh.A06);
                break;
        }
    }
}
