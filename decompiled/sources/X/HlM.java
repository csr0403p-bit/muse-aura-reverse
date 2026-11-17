package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes6.dex */
public final class HlM extends Drawable {
    public final Path A00;
    public final Drawable A01;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        canvas.clipPath(this.A00);
        this.A01.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C7384Etj.A0Y(rect, 0);
        super.onBoundsChange(rect);
        this.A01.setBounds(rect);
        this.A00.offset(rect.exactCenterX(), rect.exactCenterY());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.A01.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }

    public HlM(Drawable drawable, float f) {
        this.A01 = drawable;
        Path pathA0V = AbstractC7607F5u.A0V();
        pathA0V.addCircle(0.0f, 0.0f, f / 2.0f, Path.Direction.CW);
        this.A00 = pathA0V;
    }
}
