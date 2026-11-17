package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class FM7 {
    public static final float[] A0I = new float[9];
    public FM8 A00;
    public boolean A01;
    public boolean A02;
    public final Path A03;
    public final Path A04;
    public final RectF A05;
    public final RectF A06;
    public final RectF A07;
    public final C7915FKn A08;
    public final List<Paint> A09;
    public final boolean A0A;
    public final float[] A0B;
    public final float[] A0C;
    public final float[] A0D;
    public final float[] A0E;
    public final float[] A0F;
    public final Matrix A0G;
    public final Matrix A0H;

    public static final void A00(View view, FM7 fm7, float[] fArr) {
        fArr[0] = view.getLeft();
        fArr[1] = view.getTop();
        fArr[2] = AbstractC7607F5u.A02(view);
        fArr[3] = AbstractC7607F5u.A03(view);
        fArr[4] = view.getAlpha();
        fArr[5] = view.getVisibility();
        fArr[6] = view.getTranslationX();
        fArr[7] = view.getTranslationY();
        fArr[8] = view.getScaleX();
        fArr[9] = view.getScaleY();
        fArr[10] = view.getRotation();
        fArr[11] = view.getRotationX();
        fArr[12] = view.getRotationY();
        fArr[13] = view.getPivotX();
        fArr[14] = view.getPivotY();
        fArr[15] = view.getTransitionAlpha();
        fArr[16] = view.getCameraDistance();
        fArr[17] = view.getElevation();
        fArr[18] = view.getTranslationZ();
        Matrix matrix = fm7.A0G;
        matrix.reset();
        Object parent = view.getParent();
        float alpha = 1.0f;
        int visibility = 0;
        float z = 0.0f;
        while ((parent instanceof ViewGroup) && FMA.A02(parent)) {
            View view2 = (View) parent;
            z = view2.getZ();
            Matrix matrix2 = fm7.A0H;
            matrix2.set(view2.getMatrix());
            matrix2.preTranslate(-view2.getScrollX(), -view2.getScrollY());
            matrix2.postTranslate(view2.getLeft(), view2.getTop());
            matrix.postConcat(matrix2);
            alpha *= view2.getAlpha() * view2.getTransitionAlpha();
            if (view2.getVisibility() != 0) {
                visibility = view2.getVisibility();
            }
            parent = view2.getParent();
        }
        float[] fArr2 = A0I;
        matrix.getValues(fArr2);
        System.arraycopy(fArr2, 0, fArr, 19, 9);
        fArr[28] = alpha;
        fArr[29] = visibility;
        fArr[30] = z;
    }

    public final void A01(Canvas canvas, float f, int i, int i2) {
        C7915FKn c7915FKn = this.A08;
        if (!c7915FKn.A05 || i <= 0 || i2 <= 0 || f <= 0.0f) {
            return;
        }
        float f2 = i;
        float f3 = i2;
        int iSave = canvas.save();
        RectF rectF = this.A07;
        rectF.set(0.0f, 0.0f, f2, f3);
        rectF.inset(0.4f, 0.4f);
        boolean z = this.A0A;
        if (z) {
            Path path = this.A03;
            path.rewind();
            path.addRoundRect(rectF, this.A0B, Path.Direction.CW);
            canvas.clipOutPath(path);
        } else {
            canvas.clipOutRect(rectF);
        }
        List<C7916FKo> list = c7915FKn.A03;
        int iA00 = C60O.A00(list);
        if (iA00 >= 0) {
            while (true) {
                int i3 = iA00 - 1;
                C7916FKo c7916FKo = list.get(iA00);
                if (!c7916FKo.A05) {
                    Paint paint = this.A09.get(iA00);
                    paint.setAlpha(Ab3.A02(Color.alpha(c7916FKo.A04), f));
                    if (paint.getAlpha() != 0) {
                        rectF.set(0.0f, 0.0f, f2, f3);
                        float f4 = -c7916FKo.A03;
                        rectF.inset(f4, f4);
                        rectF.offset(c7916FKo.A01, c7916FKo.A02);
                        if (!rectF.isEmpty()) {
                            if (z) {
                                float[] fArr = this.A0B;
                                float f5 = c7916FKo.A03;
                                float[] fArr2 = this.A0E;
                                FMB.A00(fArr, fArr2, f5);
                                int i4 = 0;
                                float f6 = fArr2[0];
                                while (true) {
                                    if (fArr2[i4] != f6) {
                                        Path path2 = this.A04;
                                        path2.rewind();
                                        path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                                        canvas.drawPath(path2, paint);
                                        break;
                                    }
                                    i4++;
                                    if (i4 >= 8) {
                                        canvas.drawRoundRect(rectF, f6, f6, paint);
                                        break;
                                    }
                                }
                            } else {
                                canvas.drawRect(rectF, paint);
                            }
                        }
                    }
                }
                if (i3 < 0) {
                    break;
                } else {
                    iA00 = i3;
                }
            }
        }
        canvas.restoreToCount(iSave);
    }

    public FM7(C7915FKn c7915FKn) {
        boolean z;
        this.A08 = c7915FKn;
        List<C7916FKo> list = c7915FKn.A03;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<C7916FKo> it = list.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            C7916FKo next = it.next();
            Paint paintA0U = AbstractC7607F5u.A0U(1);
            paintA0U.setColor(next.A04);
            float f = next.A00 * 0.5f;
            if (f > 0.5f) {
                float f2 = (f - 0.5f) / 0.57735f;
                if (f2 > 0.0f) {
                    LruCache<Float, BlurMaskFilter> lruCache = FMC.A00;
                    Float fValueOf = Float.valueOf(f2);
                    BlurMaskFilter blurMaskFilter = lruCache.get(fValueOf);
                    if (blurMaskFilter == null) {
                        blurMaskFilter = new BlurMaskFilter(f2, BlurMaskFilter.Blur.NORMAL);
                        lruCache.put(fValueOf, blurMaskFilter);
                    }
                    paintA0U.setMaskFilter(blurMaskFilter);
                }
            }
            arrayListA0i.add(paintA0U);
        }
        this.A09 = arrayListA0i;
        C7915FKn c7915FKn2 = this.A08;
        float[] fArr = new float[8];
        Hnb.A01(fArr, Math.max(c7915FKn2.A01, 0.0f), c7915FKn2.A02);
        this.A0B = fArr;
        int i = 0;
        while (true) {
            if (fArr[i] > 0.0f) {
                break;
            }
            i++;
            if (i >= 8) {
                z = false;
                break;
            }
        }
        this.A0A = z;
        this.A0E = new float[8];
        this.A0F = new float[8];
        this.A07 = AbstractC7607F5u.A0Y();
        this.A06 = AbstractC7607F5u.A0Y();
        this.A05 = AbstractC7607F5u.A0Y();
        this.A04 = AbstractC7607F5u.A0V();
        this.A03 = AbstractC7607F5u.A0V();
        this.A0D = new float[31];
        this.A0C = new float[31];
        this.A0G = BV4.A08();
        this.A0H = BV4.A08();
    }
}
