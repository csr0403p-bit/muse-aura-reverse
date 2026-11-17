package X;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes6.dex */
public abstract class FWU {
    public static final int[] A01 = {R.attr.state_checked};
    public static final int[] A02 = new int[0];
    public static final Rect A00 = AbstractC7607F5u.A0X();

    public static PorterDuff.Mode A00(PorterDuff.Mode mode, int i) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void A01(Drawable drawable) {
        String strA0e = C60Q.A0e(drawable);
        if (Build.VERSION.SDK_INT >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(strA0e)) {
            return;
        }
        int[] state = drawable.getState();
        drawable.setState((state == null || state.length == 0) ? A01 : A02);
        drawable.setState(state);
    }
}
