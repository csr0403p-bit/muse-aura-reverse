package com.google.android.material.textview;

import X.AbstractC7607F5u;
import X.AbstractC7609F5w;
import X.AnonymousClass002;
import X.C8165FXh;
import X.FX0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public final class MaterialTextView extends C8165FXh {
    public static int A00(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize;
        int i = 0;
        do {
            int i2 = iArr[i];
            TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
            if (typedArray.getValue(i2, typedValueA0Z) && typedValueA0Z.type == 2) {
                TypedArray typedArrayA0R = AbstractC7609F5w.A0R(context.getTheme(), typedValueA0Z.data);
                dimensionPixelSize = typedArrayA0R.getDimensionPixelSize(0, -1);
                typedArrayA0R.recycle();
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            }
            i++;
            if (i >= 2) {
                break;
            }
        } while (dimensionPixelSize < 0);
        return dimensionPixelSize;
    }

    public static boolean A01(Context context) {
        TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
        if (context.getTheme().resolveAttribute(R.attr._name_removed__res_0x7f040551, typedValueA0Z, true) && typedValueA0Z.type == 18) {
            return AnonymousClass002.A1L(typedValueA0Z.data);
        }
        return true;
    }

    @Override // X.C8165FXh, android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        if (A01(context)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, FX0.A0E);
            int iA00 = A00(getContext(), typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iA00 >= 0) {
                setLineHeight(iA00);
            }
        }
    }
}
