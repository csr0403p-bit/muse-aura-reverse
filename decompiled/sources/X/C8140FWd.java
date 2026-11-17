package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: X.FWd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8140FWd {
    public TypedValue A00;
    public final Context A01;
    public final TypedArray A02;

    public final ColorStateList A01(int i) {
        int resourceId;
        ColorStateList colorStateListA03;
        TypedArray typedArray = this.A02;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListA03 = AbstractC4103Cmd.A03(this.A01, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListA03;
    }

    public final Drawable A02(int i) {
        int resourceId;
        TypedArray typedArray = this.A02;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : FWf.A00(this.A01, resourceId);
    }

    public final Drawable A03(int i) {
        int resourceId;
        Drawable drawableA04;
        TypedArray typedArray = this.A02;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        C8139FWc c8139FWcA00 = C8139FWc.A00();
        Context context = this.A01;
        synchronized (c8139FWcA00) {
            drawableA04 = c8139FWcA00.A00.A04(context, resourceId, true);
        }
        return drawableA04;
    }

    public C8140FWd(Context context, TypedArray typedArray) {
        this.A01 = context;
        this.A02 = typedArray;
    }

    public static C8140FWd A00(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C8140FWd(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }
}
