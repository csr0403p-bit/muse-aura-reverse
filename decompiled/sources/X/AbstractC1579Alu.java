package X;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.Alu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1579Alu {
    public static final int[] A01 = new int[2];
    public static final Rect A00 = new Rect();

    public static final C1529Aki A00(int i) {
        int i2;
        if (i == 1) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 1;
        } else if (i == 17) {
            i2 = 3;
        } else if (i == 33) {
            i2 = 5;
        } else if (i == 66) {
            i2 = 4;
        } else {
            if (i != 130) {
                return null;
            }
            i2 = 6;
        }
        return new C1529Aki(i2);
    }

    public static final Integer A02(int i) {
        int i2;
        if (i == 5) {
            i2 = 33;
        } else if (i == 6) {
            i2 = 130;
        } else if (i == 3) {
            i2 = 17;
        } else if (i == 4) {
            i2 = 66;
        } else if (i == 1) {
            i2 = 2;
        } else {
            if (i != 2) {
                return null;
            }
            i2 = 1;
        }
        return Integer.valueOf(i2);
    }

    public static final AaC A01(View view, View view2) {
        int[] iArr = A01;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        float f = i - iArr[0];
        float f2 = i2 - iArr[1];
        view.getFocusedRect(A00);
        float f3 = r4.left + f;
        return C8j3.A0f(f3, r4.top + f2, f3 + r4.width(), f2 + r4.top + r4.height());
    }

    public static final boolean A03(Rect rect, View view, Integer num) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return ((AndroidComposeView) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            FocusFinder focusFinder = FocusFinder.getInstance();
            int iIntValue = num.intValue();
            View viewFindNextFocusFromRect = focusFinder.findNextFocusFromRect(viewGroup, rect, iIntValue);
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(iIntValue, rect) : viewGroup.requestFocus(iIntValue, rect);
        }
        View viewFindFocus = viewGroup.hasFocus() ? viewGroup.findFocus() : null;
        FocusFinder focusFinder2 = FocusFinder.getInstance();
        int iIntValue2 = num.intValue();
        View viewFindNextFocus = focusFinder2.findNextFocus(viewGroup, viewFindFocus, iIntValue2);
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(iIntValue2) : view.requestFocus(iIntValue2);
    }
}
