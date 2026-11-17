package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* renamed from: X.FWe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8141FWe {
    public static ColorStateList A00(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListA03;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListA03 = AbstractC4103Cmd.A03(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListA03;
    }

    public static Drawable A01(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableA00;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableA00 = FWf.A00(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableA00;
    }
}
