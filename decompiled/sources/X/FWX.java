package X;

import android.R;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes6.dex */
public class FWX {
    public static final int[] A02 = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public Bitmap A00;
    public final ProgressBar A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.graphics.drawable.Drawable, android.graphics.drawable.ShapeDrawable] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.graphics.drawable.LayerDrawable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.graphics.drawable.Drawable A01(android.graphics.drawable.Drawable r9, boolean r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof android.graphics.drawable.LayerDrawable
            r3 = 1
            if (r0 == 0) goto L7e
            android.graphics.drawable.LayerDrawable r9 = (android.graphics.drawable.LayerDrawable) r9
            int r2 = r9.getNumberOfLayers()
            android.graphics.drawable.Drawable[] r7 = new android.graphics.drawable.Drawable[r2]
            r1 = 0
            r6 = 0
        Lf:
            if (r6 >= r2) goto L2e
            int r5 = r9.getId(r6)
            android.graphics.drawable.Drawable r4 = r9.getDrawable(r6)
            r0 = 16908301(0x102000d, float:2.3877265E-38)
            if (r5 == r0) goto L24
            r3 = 16908303(0x102000f, float:2.387727E-38)
            r0 = 0
            if (r5 != r3) goto L25
        L24:
            r0 = 1
        L25:
            android.graphics.drawable.Drawable r0 = r8.A01(r4, r0)
            r7[r6] = r0
            int r6 = r6 + 1
            goto Lf
        L2e:
            android.graphics.drawable.LayerDrawable r5 = new android.graphics.drawable.LayerDrawable
            r5.<init>(r7)
        L33:
            if (r1 >= r2) goto Lc8
            int r0 = r9.getId(r1)
            r5.setId(r1, r0)
            int r0 = r9.getLayerGravity(r1)
            r5.setLayerGravity(r1, r0)
            int r0 = r9.getLayerWidth(r1)
            r5.setLayerWidth(r1, r0)
            int r0 = r9.getLayerHeight(r1)
            r5.setLayerHeight(r1, r0)
            int r0 = r9.getLayerInsetLeft(r1)
            r5.setLayerInsetLeft(r1, r0)
            int r0 = r9.getLayerInsetRight(r1)
            r5.setLayerInsetRight(r1, r0)
            int r0 = r9.getLayerInsetTop(r1)
            r5.setLayerInsetTop(r1, r0)
            int r0 = r9.getLayerInsetBottom(r1)
            r5.setLayerInsetBottom(r1, r0)
            int r0 = r9.getLayerInsetStart(r1)
            r5.setLayerInsetStart(r1, r0)
            int r0 = r9.getLayerInsetEnd(r1)
            r5.setLayerInsetEnd(r1, r0)
            int r1 = r1 + 1
            goto L33
        L7e:
            boolean r0 = r9 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto Lc7
            android.graphics.drawable.BitmapDrawable r9 = (android.graphics.drawable.BitmapDrawable) r9
            android.graphics.Bitmap r4 = r9.getBitmap()
            android.graphics.Bitmap r0 = r8.A00
            if (r0 != 0) goto L8e
            r8.A00 = r4
        L8e:
            r0 = 8
            float[] r2 = new float[r0]
            r2 = {x00ca: FILL_ARRAY_DATA , data: [1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584} // fill-array
            r1 = 0
            android.graphics.drawable.shapes.RoundRectShape r0 = new android.graphics.drawable.shapes.RoundRectShape
            r0.<init>(r2, r1, r1)
            android.graphics.drawable.ShapeDrawable r5 = new android.graphics.drawable.ShapeDrawable
            r5.<init>(r0)
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.BitmapShader r1 = new android.graphics.BitmapShader
            r1.<init>(r4, r2, r0)
            android.graphics.Paint r0 = r5.getPaint()
            r0.setShader(r1)
            android.graphics.Paint r1 = r5.getPaint()
            android.graphics.Paint r0 = r9.getPaint()
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            r1.setColorFilter(r0)
            if (r10 == 0) goto Lc8
            r0 = 3
            android.graphics.drawable.ClipDrawable r9 = new android.graphics.drawable.ClipDrawable
            r9.<init>(r5, r0, r3)
        Lc7:
            return r9
        Lc8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FWX.A01(android.graphics.drawable.Drawable, boolean):android.graphics.drawable.Drawable");
    }

    public void A02(AttributeSet attributeSet, int i) {
        ProgressBar progressBar = this.A01;
        C8140FWd c8140FWdA00 = C8140FWd.A00(progressBar.getContext(), attributeSet, A02, i, 0);
        Drawable drawableA03 = c8140FWdA00.A03(0);
        if (drawableA03 != null) {
            if (drawableA03 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableA03;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableA01 = A01(animationDrawable.getFrame(i2), true);
                    drawableA01.setLevel(10000);
                    animationDrawable2.addFrame(drawableA01, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableA03 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(drawableA03);
        }
        Drawable drawableA032 = c8140FWdA00.A03(1);
        if (drawableA032 != null) {
            progressBar.setProgressDrawable(A01(drawableA032, false));
        }
        c8140FWdA00.A02.recycle();
    }

    public FWX(ProgressBar progressBar) {
        this.A01 = progressBar;
    }
}
