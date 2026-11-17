package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;

/* renamed from: X.FWy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8156FWy {
    public final ColorStateList A00;
    public final ColorStateList A01;
    public final ColorStateList A02;
    public final Rect A03;
    public final FXK A04;

    public static C8156FWy A00(Context context, int i) throws Resources.NotFoundException {
        BeS.A06(AnonymousClass002.A1L(i), "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, FX0.A0A);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListA00 = AbstractC8141FWe.A00(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListA002 = AbstractC8141FWe.A00(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListA003 = AbstractC8141FWe.A00(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        FXK fxk = new FXK(FXK.A03(context, new C8149FWn(0.0f), typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0)));
        typedArrayObtainStyledAttributes.recycle();
        return new C8156FWy(colorStateListA00, colorStateListA002, colorStateListA003, rect, fxk);
    }

    public C8156FWy(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, Rect rect, FXK fxk) {
        if (rect.left < 0) {
            throw BV4.A0P();
        }
        if (rect.top < 0) {
            throw BV4.A0P();
        }
        if (rect.right < 0) {
            throw BV4.A0P();
        }
        if (rect.bottom < 0) {
            throw BV4.A0P();
        }
        this.A03 = rect;
        this.A02 = colorStateList2;
        this.A00 = colorStateList;
        this.A01 = colorStateList3;
        this.A04 = fxk;
    }
}
