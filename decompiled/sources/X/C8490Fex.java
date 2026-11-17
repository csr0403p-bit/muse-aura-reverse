package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import com.facebook.aura.R;

/* renamed from: X.Fex, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8490Fex {
    public AbstractC8484Fer A00;

    public static C8490Fex A00(WindowInsetsAnimation windowInsetsAnimation) {
        C8490Fex c8490Fex = new C8490Fex(0, null, 0L);
        c8490Fex.A00 = new C8491Fey(windowInsetsAnimation);
        return c8490Fex;
    }

    public static void A01(View view, AbstractC8493Ff0 abstractC8493Ff0) {
        if (Build.VERSION.SDK_INT >= 30) {
            C8491Fey.A03(view, abstractC8493Ff0);
            return;
        }
        Interpolator interpolator = C8487Feu.A00;
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC8486Fet = abstractC8493Ff0 != null ? new ViewOnApplyWindowInsetsListenerC8486Fet(view, abstractC8493Ff0) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC8486Fet);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC8486Fet);
        }
    }

    public C8490Fex(int i, Interpolator interpolator, long j) {
        this.A00 = Build.VERSION.SDK_INT >= 30 ? new C8491Fey(i, interpolator, j) : new C8487Feu(i, interpolator, j);
    }
}
