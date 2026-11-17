package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.FfY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8523FfY extends Enum<AbstractC8523FfY> {
    public static final void A02(View view, ViewGroup viewGroup, Integer num) {
        ViewGroup viewGroup2;
        int i = 0;
        if (AbstractC8571FgQ.A0N(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || (viewGroup2 = (ViewGroup) parent) == null) {
                return;
            }
            if (AbstractC8571FgQ.A0N(2)) {
                AbstractC7610F5x.A1M(viewGroup2, " from container ", C3cG.A0f(view, "SpecialEffectsController: Removing view "));
            }
            viewGroup2.removeView(view);
            return;
        }
        if (iIntValue == 1) {
            if (AbstractC8571FgQ.A0N(2)) {
                AbstractC7609F5w.A1N(C3cG.A0f(view, "SpecialEffectsController: Setting view "), " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if (!(parent2 instanceof ViewGroup) || parent2 == null) {
                if (AbstractC8571FgQ.A0N(2)) {
                    AbstractC7610F5x.A1M(viewGroup, " to Container ", C3cG.A0f(view, "SpecialEffectsController: Adding view "));
                }
                viewGroup.addView(view);
            }
        } else if (iIntValue != 2) {
            i = 4;
            if (AbstractC8571FgQ.A0N(2)) {
                AbstractC7609F5w.A1N(C3cG.A0f(view, "SpecialEffectsController: Setting view "), " to INVISIBLE");
            }
        } else {
            if (AbstractC8571FgQ.A0N(2)) {
                AbstractC7609F5w.A1N(C3cG.A0f(view, "SpecialEffectsController: Setting view "), " to GONE");
            }
            i = 8;
        }
        view.setVisibility(i);
    }

    public static final Integer A00(int i) {
        if (i == 0) {
            return C79.A01;
        }
        if (i == 4) {
            return C79.A0K;
        }
        if (i == 8) {
            return C79.A0C;
        }
        throw BV5.A0Q("Unknown visibility ", i);
    }

    public static final Integer A01(View view) {
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? C79.A0K : A00(view.getVisibility());
    }
}
