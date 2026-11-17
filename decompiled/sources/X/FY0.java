package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public final class FY0 extends C8178FXu implements InterfaceC8335Fc2 {
    public final /* synthetic */ C8243FaJ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FY0(Context context, C8243FaJ c8243FaJ) {
        super(context, null, R.attr._name_removed__res_0x7f040029);
        this.A00 = c8243FaJ;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setTooltipText(getContentDescription());
        setOnTouchListener(new C8244FaM(this, this, c8243FaJ));
    }

    @Override // X.InterfaceC8335Fc2
    public final boolean AR4() {
        return false;
    }

    @Override // X.InterfaceC8335Fc2
    public final boolean AR5() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.A00.A04();
        }
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int iA0F = (width + AbstractC7607F5u.A0F(this, getPaddingLeft())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(iA0F - iMax, paddingTop - iMax, iA0F + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
