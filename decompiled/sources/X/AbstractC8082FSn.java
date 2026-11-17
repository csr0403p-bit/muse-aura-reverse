package X;

import android.os.Build;
import android.view.View;
import com.facebook.aura.R;

/* renamed from: X.FSn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8082FSn {
    public static void A00(View view, FPU fpu) {
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC8081FSm = fpu != null ? new ViewOnApplyWindowInsetsListenerC8081FSm(view, fpu) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, viewOnApplyWindowInsetsListenerC8081FSm);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null) {
            if (viewOnApplyWindowInsetsListenerC8081FSm == null) {
                viewOnApplyWindowInsetsListenerC8081FSm = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            }
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC8081FSm);
        }
    }
}
