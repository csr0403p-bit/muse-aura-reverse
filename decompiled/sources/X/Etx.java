package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes5.dex */
public final class Etx {
    public Bitmap A00;
    public final int[] A01;
    public final Paint A02;
    public final int[] A03;

    public static final void A00(Canvas canvas, View view, Etx etx, int i, int i2) {
        if (!(view instanceof TextureView)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    C7384Etj.A0U(childAt);
                    A00(canvas, childAt, etx, i, i2);
                }
                return;
            }
            return;
        }
        TextureView textureView = (TextureView) view;
        int width = textureView.getWidth();
        int height = textureView.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        Bitmap bitmapCreateBitmap = etx.A00;
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        } else if (bitmapCreateBitmap.getWidth() != width || bitmapCreateBitmap.getHeight() != height || bitmapCreateBitmap.isRecycled()) {
            bitmapCreateBitmap.recycle();
            bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        }
        etx.A00 = bitmapCreateBitmap;
        Bitmap bitmap = textureView.getBitmap(bitmapCreateBitmap);
        C7384Etj.A0U(bitmap);
        view.getLocationInWindow(etx.A03);
        canvas.drawBitmap(bitmap, r1[0] - i, r1[1] - i2, etx.A02);
    }

    public final void A01() {
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.A00 = null;
    }

    public Etx() {
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        this.A02 = paint;
        this.A01 = new int[2];
        this.A03 = new int[2];
    }
}
