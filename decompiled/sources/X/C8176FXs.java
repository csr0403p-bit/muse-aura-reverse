package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* renamed from: X.FXs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8176FXs {
    public ColorStateList A00 = null;
    public PorterDuff.Mode A01 = null;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04;
    public final CompoundButton A05;

    public static final void A00(C8176FXs c8176FXs) {
        CompoundButton compoundButton = c8176FXs.A05;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (c8176FXs.A02 || c8176FXs.A03) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (c8176FXs.A02) {
                    drawableMutate.setTintList(c8176FXs.A00);
                }
                if (c8176FXs.A03) {
                    drawableMutate.setTintMode(c8176FXs.A01);
                }
                AbstractC7610F5x.A18(drawableMutate, compoundButton);
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void A01(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = this.A05;
        Context context = compoundButton.getContext();
        int[] iArr = FYT.A0C;
        C8140FWd c8140FWdA00 = C8140FWd.A00(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = c8140FWdA00.A02;
        compoundButton.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(FWf.A00(context, resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(FWf.A00(context, resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(c8140FWdA00.A01(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(FWU.A00(null, typedArray.getInt(3, -1)));
            }
        } finally {
            typedArray.recycle();
        }
    }

    public C8176FXs(CompoundButton compoundButton) {
        this.A05 = compoundButton;
    }
}
