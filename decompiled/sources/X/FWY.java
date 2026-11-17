package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public final class FWY extends RatingBar {
    public final FWX A00;

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.A00.A00;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public FWY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr._name_removed__res_0x7f040489);
        AbstractC7608F5v.A1D(this);
        FWX fwx = new FWX(this);
        this.A00 = fwx;
        fwx.A02(attributeSet, R.attr._name_removed__res_0x7f040489);
    }
}
