package X;

import android.content.res.ColorStateList;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public final class FX4 extends C8171FXn {
    public static final int[][] A02 = AbstractC7611F5y.A1D();
    public boolean A00;
    public ColorStateList A01;

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.A01;
        if (colorStateList != null) {
            return colorStateList;
        }
        int iA01 = FWM.A01(this, R.attr._name_removed__res_0x7f04012b);
        int iA012 = FWM.A01(this, R.attr._name_removed__res_0x7f040132);
        int iA013 = FWM.A01(this, R.attr._name_removed__res_0x7f040139);
        ColorStateList colorStateList2 = new ColorStateList(A02, new int[]{FWP.A00(1.0f, iA013, iA01), FWP.A00(0.54f, iA013, iA012), FWP.A00(0.38f, iA013, iA012), FWP.A00(0.38f, iA013, iA012)});
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
