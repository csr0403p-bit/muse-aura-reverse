package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.Deprecated;

/* loaded from: classes6.dex */
public final class Htr extends Drawable {
    public Path A00;
    public EtN A01;
    public final C7377EtL A02;
    public final FBB A03;
    public final FDW A04;
    public final float[] A05;

    public Htr(C7377EtL c7377EtL, FBB fbb, FDW fdw, float[] fArr) {
        C7384Etj.A0Y(c7377EtL, 2);
        this.A04 = fdw;
        this.A03 = fbb;
        this.A02 = c7377EtL;
        this.A05 = fArr;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        EtN etN = this.A01;
        if (etN != null) {
            C7384Etj.A0U(getBounds());
            canvas.save();
            canvas.translate(r2.left, r2.top);
            Path path = this.A00;
            if (path != null) {
                canvas.clipPath(path);
            }
            try {
                etN.A10(canvas);
            } catch (Exception e) {
                FFI.A01(this.A03, "Failed to draw canvas model", e);
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        EtN etNA00;
        C7384Etj.A0Y(rect, 0);
        Path pathA0V = null;
        if (rect.isEmpty()) {
            this.A01 = null;
        } else {
            int iWidth = rect.width();
            int iHeight = rect.height();
            try {
                etNA00 = HxQ.A00(this.A02, this.A04, this.A03, AbstractC5463Diy.A01(iWidth, iHeight));
            } catch (Exception e) {
                FFI.A01(this.A03, "Failed to parse canvas model", e);
                etNA00 = null;
            }
            this.A01 = etNA00;
            float[] fArr = this.A05;
            if (fArr != null) {
                pathA0V = AbstractC7607F5u.A0V();
                pathA0V.addRoundRect(new RectF(0.0f, 0.0f, iWidth, iHeight), fArr, Path.Direction.CW);
            }
        }
        this.A00 = pathA0V;
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
