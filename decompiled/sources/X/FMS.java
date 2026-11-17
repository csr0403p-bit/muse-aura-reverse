package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public abstract class FMS {
    public static final int[][] A00 = AbstractC7611F5y.A1D();

    public static ColorStateList A00(Context context, Integer num, Integer num2, Integer num3, Integer num4) {
        int color;
        int iA08 = -7829368;
        if (num != null) {
            color = num.intValue();
        } else {
            TypedArray typedArrayA0R = AbstractC7609F5w.A0R(context.getTheme(), R.attr._name_removed__res_0x7f04012b);
            color = typedArrayA0R.getColor(0, -7829368);
            typedArrayA0R.recycle();
        }
        TypedArray typedArrayA0R2 = AbstractC7609F5w.A0R(context.getTheme(), R.attr._name_removed__res_0x7f04013a);
        ColorStateList colorStateList = typedArrayA0R2.getColorStateList(0);
        typedArrayA0R2.recycle();
        int iIntValue = num2 != null ? num2.intValue() : colorStateList == null ? -7829368 : colorStateList.getDefaultColor();
        int iIntValue2 = num3 != null ? num3.intValue() : colorStateList == null ? -7829368 : AbstractC7608F5v.A08(colorStateList, new int[]{-16842910});
        if (num4 != null) {
            iA08 = num4.intValue();
        } else if (colorStateList != null) {
            iA08 = AbstractC7608F5v.A08(colorStateList, new int[]{-16842910});
        }
        return new ColorStateList(A00, new int[]{color, iIntValue, iIntValue2, iA08});
    }

    public static ColorStateList A01(Context context, Integer num, Integer num2, Integer num3, Integer num4) {
        int color;
        int color2;
        int iA05;
        int iA052;
        if (num != null) {
            color = num.intValue();
        } else {
            TypedArray typedArrayA0R = AbstractC7609F5w.A0R(context.getTheme(), android.R.attr.colorControlActivated);
            color = typedArrayA0R.getColor(0, -7829368);
            typedArrayA0R.recycle();
        }
        if (num2 != null) {
            color2 = num2.intValue();
        } else {
            TypedArray typedArrayA0R2 = AbstractC7609F5w.A0R(context.getTheme(), android.R.attr.colorForeground);
            color2 = typedArrayA0R2.getColor(0, -7829368);
            typedArrayA0R2.recycle();
        }
        if (num3 != null) {
            iA05 = num3.intValue();
        } else {
            TypedArray typedArrayA0R3 = AbstractC7609F5w.A0R(context.getTheme(), android.R.attr.colorControlActivated);
            iA05 = EGb.A05(typedArrayA0R3.getColor(0, -7829368), AbstractC7607F5u.A09(Color.alpha(color), 0.25f));
            typedArrayA0R3.recycle();
        }
        if (num4 != null) {
            iA052 = num4.intValue();
        } else {
            TypedArray typedArrayA0R4 = AbstractC7609F5w.A0R(context.getTheme(), android.R.attr.colorForeground);
            iA052 = EGb.A05(typedArrayA0R4.getColor(0, -7829368), AbstractC7607F5u.A09(Color.alpha(color2), 0.25f));
            typedArrayA0R4.recycle();
        }
        return new ColorStateList(A00, new int[]{color, color2, iA05, iA052});
    }
}
