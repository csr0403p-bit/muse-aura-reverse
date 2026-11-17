package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public abstract class FW7 {
    public static final int[] A00 = {R.attr.colorPrimary};
    public static final int[] A01 = {R.attr._name_removed__res_0x7f040135};

    public static void A01(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FX0.A0M, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
            if (!context.getTheme().resolveAttribute(R.attr._name_removed__res_0x7f0402ba, typedValueA0Z, true) || (typedValueA0Z.type == 18 && typedValueA0Z.data == 0)) {
                A02(context, "Theme.MaterialComponents", A01);
            }
        }
        A02(context, "Theme.AppCompat", A00);
    }

    public static TypedArray A00(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        A01(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FX0.A0M, i, i2);
        if (typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            boolean z = typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1;
            typedArrayObtainStyledAttributes.recycle();
            if (!z) {
                throw C60O.A0i("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
            }
        } else {
            typedArrayObtainStyledAttributes.recycle();
        }
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static void A02(Context context, String str, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            typedArrayObtainStyledAttributes.recycle();
        } else {
            typedArrayObtainStyledAttributes.recycle();
            throw C60Q.A0V("The style on this component requires your app theme to be ", str, " (or a descendant).");
        }
    }
}
