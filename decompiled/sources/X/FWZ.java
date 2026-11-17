package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes6.dex */
public abstract class FWZ {
    public static final ThreadLocal<TypedValue> A00 = new ThreadLocal<>();
    public static final int[] A02 = {-16842910};
    public static final int[] A04 = {R.attr.state_focused};
    public static final int[] A05 = {R.attr.state_pressed};
    public static final int[] A01 = {R.attr.state_checked};
    public static final int[] A03 = new int[0];
    public static final int[] A06 = new int[1];

    public static int A01(Context context, int i) {
        int[] iArr = A06;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList A02(Context context, int i) {
        int[] iArr = A06;
        iArr[0] = i;
        C8140FWd c8140FWd = new C8140FWd(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        try {
            return c8140FWd.A01(0);
        } finally {
            c8140FWd.A02.recycle();
        }
    }

    public static void A03(Context context, View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(FYT.A09);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                StringBuilder sbA0x = C60O.A0x("View ");
                sbA0x.append(view.getClass());
                Log.e("ThemeUtils", AnonymousClass001.A0v(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).", sbA0x));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int A00(Context context, int i) {
        ColorStateList colorStateListA02 = A02(context, i);
        if (colorStateListA02 != null && colorStateListA02.isStateful()) {
            return AbstractC7608F5v.A08(colorStateListA02, A02);
        }
        ThreadLocal<TypedValue> threadLocal = A00;
        TypedValue typedValueA0Z = threadLocal.get();
        if (typedValueA0Z == null) {
            typedValueA0Z = AbstractC7607F5u.A0Z();
            threadLocal.set(typedValueA0Z);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueA0Z, true);
        float f = typedValueA0Z.getFloat();
        return EGb.A05(A01(context, i), AbstractC7607F5u.A09(Color.alpha(r1), f));
    }
}
