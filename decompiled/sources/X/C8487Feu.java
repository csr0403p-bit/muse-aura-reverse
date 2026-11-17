package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.facebook.aura.R;
import java.util.List;

/* renamed from: X.Feu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8487Feu extends AbstractC8484Fer {
    public static final Interpolator A02 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final Interpolator A00 = new FWK();
    public static final Interpolator A03 = new DecelerateInterpolator(1.5f);
    public static final Interpolator A01 = new AccelerateInterpolator(1.5f);

    public static AbstractC8493Ff0 A00(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC8486Fet) {
            return ((ViewOnApplyWindowInsetsListenerC8486Fet) tag).A01;
        }
        return null;
    }

    public static void A01(View view, C8492Fez c8492Fez, C8490Fex c8490Fex) {
        AbstractC8493Ff0 abstractC8493Ff0A00 = A00(view);
        if (abstractC8493Ff0A00 != null) {
            abstractC8493Ff0A00.A03(c8492Fez, c8490Fex);
            if (abstractC8493Ff0A00.A01 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A01(viewGroup.getChildAt(i), c8492Fez, c8490Fex);
            }
        }
    }

    public static void A02(View view, C8490Fex c8490Fex) {
        AbstractC8493Ff0 abstractC8493Ff0A00 = A00(view);
        if (abstractC8493Ff0A00 != null) {
            abstractC8493Ff0A00.A05(c8490Fex);
            if (abstractC8493Ff0A00.A01 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A02(viewGroup.getChildAt(i), c8490Fex);
            }
        }
    }

    public static void A03(View view, C8490Fex c8490Fex, C8497Ff4 c8497Ff4, boolean z) {
        AbstractC8493Ff0 abstractC8493Ff0A00 = A00(view);
        if (abstractC8493Ff0A00 != null) {
            abstractC8493Ff0A00.A00 = c8497Ff4;
            if (!z) {
                abstractC8493Ff0A00.A06(c8490Fex);
                z = AnonymousClass002.A1M(abstractC8493Ff0A00.A01);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A03(viewGroup.getChildAt(i), c8490Fex, c8497Ff4, z);
            }
        }
    }

    public static void A04(View view, C8497Ff4 c8497Ff4, List<C8490Fex> list) {
        AbstractC8493Ff0 abstractC8493Ff0A00 = A00(view);
        if (abstractC8493Ff0A00 != null) {
            c8497Ff4 = abstractC8493Ff0A00.A04(c8497Ff4, list);
            if (abstractC8493Ff0A00.A01 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A04(viewGroup.getChildAt(i), c8497Ff4, list);
            }
        }
    }
}
