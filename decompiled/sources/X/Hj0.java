package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;

/* loaded from: classes6.dex */
public final class Hj0 extends AbstractC7281Ek8 implements Runnable {
    public static final String __redex_internal_original_name = "AutoRotateDrawable";
    public float A00;
    public int A01;
    public boolean A02;
    public boolean A03;

    @Override // java.lang.Runnable
    public final void run() {
        this.A03 = false;
        this.A00 += (int) ((20.0f / this.A01) * 360.0f);
        invalidateSelf();
    }

    @Override // X.AbstractC7281Ek8, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.A00;
        if (!this.A02) {
            f = 360.0f - f;
        }
        canvas.rotate(f, r1 + (i / 2), r3 + (i2 / 2));
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        if (this.A03) {
            return;
        }
        this.A03 = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }
}
