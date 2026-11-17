package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes6.dex */
public final class FPD extends Drawable.ConstantState {
    public final Drawable.ConstantState A00;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.A00.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C8406FdN c8406FdN = new C8406FdN();
        ((AbstractC8146FWk) c8406FdN).A00 = this.A00.newDrawable();
        return c8406FdN;
    }

    public FPD(Drawable.ConstantState constantState) {
        this.A00 = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C8406FdN c8406FdN = new C8406FdN();
        ((AbstractC8146FWk) c8406FdN).A00 = this.A00.newDrawable(resources, theme);
        return c8406FdN;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C8406FdN c8406FdN = new C8406FdN();
        ((AbstractC8146FWk) c8406FdN).A00 = this.A00.newDrawable(resources);
        return c8406FdN;
    }
}
