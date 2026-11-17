package X;

import android.content.res.ColorStateList;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public final class FX7 extends C8170FXm {
    public static final int[][] A02 = AbstractC7611F5y.A1D();
    public boolean A00;
    public ColorStateList A01;

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.A01;
        if (colorStateList != null) {
            return colorStateList;
        }
        int[][] iArr = A02;
        int iA01 = FWM.A01(this, R.attr._name_removed__res_0x7f04012b);
        int iA012 = FWM.A01(this, R.attr._name_removed__res_0x7f040139);
        int iA013 = FWM.A01(this, R.attr._name_removed__res_0x7f040132);
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{FWP.A00(1.0f, iA012, iA01), FWP.A00(0.54f, iA012, iA013), FWP.A00(0.38f, iA012, iA013), FWP.A00(0.38f, iA012, iA013)});
        this.A01 = colorStateList2;
        return colorStateList2;
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.A00 = z;
        setButtonTintList(z ? getMaterialThemeColorsTintList() : null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A00 && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }
}
