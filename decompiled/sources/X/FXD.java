package X;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes6.dex */
public abstract class FXD {
    public static void A00(View view, FX9 fx9) {
        FXB fxb = fx9.A00.A0J;
        if (fxb == null || !fxb.A03) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        FXA fxa = fx9.A00;
        if (fxa.A02 != elevation) {
            fxa.A02 = elevation;
            FX9.A04(fx9);
        }
    }
}
