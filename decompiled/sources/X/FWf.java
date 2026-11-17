package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes6.dex */
public abstract class FWf {
    public static Drawable A00(Context context, int i) {
        C8137FWa c8137FWa;
        synchronized (C8137FWa.class) {
            c8137FWa = C8137FWa.A05;
            if (c8137FWa == null) {
                c8137FWa = new C8137FWa();
                C8137FWa.A05 = c8137FWa;
            }
        }
        return c8137FWa.A03(context, i);
    }

    public static Drawable A01(View view, int i) {
        return A00(view.getContext(), i);
    }
}
