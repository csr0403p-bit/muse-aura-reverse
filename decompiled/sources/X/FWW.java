package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public final class FWW extends SeekBar {
    public final FWV A00;

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        FWV fwv = this.A00;
        if (fwv.A00 != null) {
            int max = fwv.A05.getMax();
            if (max > 1) {
                int intrinsicWidth = fwv.A00.getIntrinsicWidth();
                int intrinsicHeight = fwv.A00.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                fwv.A00.setBounds(-i, -i2, i, i2);
                float fA0I = AbstractC7610F5x.A0I(r6, r6.getWidth()) / max;
                int iSave = canvas.save();
                canvas.translate(r6.getPaddingLeft(), r6.getHeight() / 2);
                int i3 = 0;
                do {
                    fwv.A00.draw(canvas);
                    canvas.translate(fA0I, 0.0f);
                    i3++;
                } while (i3 <= max);
                canvas.restoreToCount(iSave);
            }
        }
    }

    public FWW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr._name_removed__res_0x7f0404b3);
        AbstractC7608F5v.A1D(this);
        FWV fwv = new FWV(this);
        this.A00 = fwv;
        fwv.A02(attributeSet, R.attr._name_removed__res_0x7f0404b3);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        FWV fwv = this.A00;
        Drawable drawable = fwv.A00;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = fwv.A05;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A00.A00;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
