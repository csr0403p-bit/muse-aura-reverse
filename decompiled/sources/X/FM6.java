package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.List;

/* loaded from: classes6.dex */
public final class FM6 extends FHQ {
    public FM7 A00;
    public FM9 A01;
    public int A02;
    public Paint A03;
    public boolean A04;
    public boolean A05;
    public final ViewTreeObserver.OnPreDrawListener A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FM6(Context context) {
        super(context);
        C7384Etj.A0Y(context, 0);
        this.A06 = new ViewTreeObserverOnPreDrawListenerC10642I0m(this, 3);
        this.A01 = new FM9(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0D() {
        /*
            r2 = this;
            boolean r0 = r2.A05
            if (r0 != 0) goto L21
            X.FM9 r1 = r2.A01
            boolean r0 = r1.A07
            if (r0 == 0) goto L27
            X.FKP r0 = r1.A05
            if (r0 == 0) goto L27
            boolean r0 = r1.A06
            if (r0 == 0) goto L27
            android.graphics.Paint r0 = r1.A09
            android.graphics.Xfermode r0 = r0.getXfermode()
            if (r0 == 0) goto L27
            float r1 = r1.A02
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L27
        L21:
            r1 = 2
        L22:
            r0 = 0
            r2.setLayerType(r1, r0)
            return
        L27:
            r1 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FM6.A0D():void");
    }

    public final void A0E(Canvas canvas, float f) {
        FM7 fm7 = this.A00;
        if (fm7 != null && fm7.A08.A05 && getVisibility() == 0) {
            float alpha = getAlpha() * f * getTransitionAlpha();
            if (!fm7.A08.A05) {
                fm7.A01 = false;
            } else if (canvas.isHardwareAccelerated()) {
                FM8 fm8 = fm7.A00;
                if (fm8 == null) {
                    fm8 = new FM8(fm7);
                    fm7.A00 = fm8;
                }
                fm8.A00(this, alpha);
                canvas.drawRenderNode(fm8.A02);
                fm7.A01 = true;
            } else {
                fm7.A01 = false;
                int iSave = canvas.save();
                canvas.translate(getLeft(), getTop());
                Matrix matrix = getMatrix();
                if (!matrix.isIdentity()) {
                    canvas.concat(matrix);
                }
                fm7.A01(canvas, alpha, getWidth(), getHeight());
                canvas.restoreToCount(iSave);
            }
            FM7.A00(this, fm7, fm7.A0D);
            fm7.A02 = true;
        }
    }

    public FM7 getBoxShadowPainter() {
        return this.A00;
    }

    public C7915FKn getBoxShadowStyle() {
        FM7 fm7 = this.A00;
        if (fm7 == null) {
            return null;
        }
        return fm7.A08;
    }

    public FM9 getDecorationHelper() {
        return this.A01;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        FM8 fm8;
        FM7 fm7 = this.A00;
        if (fm7 != null && (fm8 = fm7.A00) != null) {
            fm8.A02.discardDisplayList();
            fm8.A01 = -1;
            fm8.A00 = -1;
        }
        if (this.A04) {
            getViewTreeObserver().removeOnPreDrawListener(this.A06);
            this.A04 = false;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float[] fArr;
        super.onDraw(canvas);
        FM7 fm7 = this.A00;
        if (fm7 != null) {
            int width = getWidth();
            int height = getHeight();
            C7384Etj.A0Y(canvas, 0);
            C7915FKn c7915FKn = fm7.A08;
            if (!c7915FKn.A04 || width <= 0 || height <= 0) {
                return;
            }
            float f = c7915FKn.A00;
            RectF rectF = fm7.A06;
            float fMax = Math.max(f, 0.0f);
            rectF.set(fMax, fMax, width - fMax, height - fMax);
            if (rectF.isEmpty()) {
                return;
            }
            int iSave = canvas.save();
            boolean z = fm7.A0A;
            if (z) {
                float[] fArr2 = fm7.A0B;
                float[] fArr3 = fm7.A0F;
                int i = 0;
                do {
                    float f2 = fArr2[i] - fMax;
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    fArr3[i] = f2;
                    i++;
                } while (i < 8);
                Path path = fm7.A03;
                path.rewind();
                path.addRoundRect(rectF, fArr3, Path.Direction.CW);
                canvas.clipPath(path);
            } else {
                canvas.clipRect(rectF);
            }
            List<C7916FKo> list = c7915FKn.A03;
            int iA00 = C60O.A00(list);
            if (iA00 >= 0) {
                while (true) {
                    int i2 = iA00 - 1;
                    C7916FKo c7916FKo = list.get(iA00);
                    if (c7916FKo.A05 && Color.alpha(c7916FKo.A04) != 0) {
                        RectF rectF2 = fm7.A05;
                        rectF2.set(rectF);
                        float f3 = c7916FKo.A03;
                        float f4 = f3 * 2.0f;
                        if (f4 > rectF.width() || f4 > rectF.height()) {
                            rectF2.setEmpty();
                        } else {
                            rectF2.inset(f3, f3);
                        }
                        rectF2.offset(c7916FKo.A01, c7916FKo.A02);
                        RectF rectF3 = fm7.A07;
                        float f5 = c7916FKo.A00 * 1.5f;
                        rectF3.set(rectF);
                        float f6 = -f5;
                        rectF3.inset(f6, f6);
                        rectF3.union(rectF2);
                        if (z) {
                            float[] fArr4 = fm7.A0F;
                            float f7 = -c7916FKo.A03;
                            fArr = fm7.A0E;
                            FMB.A00(fArr4, fArr, f7);
                        } else {
                            fArr = FMC.A01;
                        }
                        canvas.drawDoubleRoundRect(rectF3, FMC.A01, rectF2, fArr, fm7.A09.get(iA00));
                    }
                    if (i2 < 0) {
                        break;
                    } else {
                        iA00 = i2;
                    }
                }
            }
            canvas.restoreToCount(iSave);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setBoxShadowStyle(X.C7915FKn r3) {
        /*
            r2 = this;
            X.FM7 r1 = r2.A00
            if (r1 != 0) goto L7
            if (r3 != 0) goto L39
        L6:
            return
        L7:
            X.FKn r0 = r1.A08
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L6
            X.FM8 r1 = r1.A00
            if (r1 == 0) goto L1d
            android.graphics.RenderNode r0 = r1.A02
            r0.discardDisplayList()
            r0 = -1
            r1.A01 = r0
            r1.A00 = r0
        L1d:
            if (r3 != 0) goto L39
            r0 = 0
        L20:
            r2.A00 = r0
            r2.A00()
            r2.invalidate()
            android.view.ViewParent r1 = r2.getParent()
        L2c:
            if (r1 == 0) goto L3f
            boolean r0 = X.FMA.A02(r1)
            if (r0 == 0) goto L3f
            android.view.ViewParent r1 = r1.getParent()
            goto L2c
        L39:
            X.FM7 r0 = new X.FM7
            r0.<init>(r3)
            goto L20
        L3f:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L6
            android.view.View r1 = (android.view.View) r1
            r1.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FM6.setBoxShadowStyle(X.FKn):void");
    }

    public void setDrawablesRequireHardwareLayer(boolean z) {
        this.A05 = z;
        A0D();
    }

    @Override // android.view.View
    public final void setLayerType(int i, Paint paint) {
        this.A02 = i;
        this.A03 = paint;
        super.setLayerType(i, paint);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00() {
        /*
            r3 = this;
            boolean r0 = r3.isAttachedToWindow()
            if (r0 == 0) goto L11
            X.FM7 r0 = r3.A00
            if (r0 == 0) goto L11
            X.FKn r0 = r0.A08
            boolean r0 = r0.A05
            r2 = 1
            if (r0 != 0) goto L12
        L11:
            r2 = 0
        L12:
            boolean r0 = r3.A04
            if (r2 == r0) goto L23
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r0 = r3.A06
            if (r2 == 0) goto L24
            r1.addOnPreDrawListener(r0)
        L21:
            r3.A04 = r2
        L23:
            return
        L24:
            r1.removeOnPreDrawListener(r0)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FM6.A00():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    @Override // X.FHQ, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r10) {
        /*
            r9 = this;
            super.dispatchDraw(r10)
            int r1 = r9.A02
            r0 = 2
            if (r1 != r0) goto Lf
            int r1 = r9.getLayerType()
            r0 = 1
            if (r1 == 0) goto L10
        Lf:
            r0 = 0
        L10:
            X.FM9 r4 = r9.A01
            r9 = r0 ^ 1
            boolean r0 = r4.A07
            if (r0 == 0) goto L6c
            android.graphics.Path r6 = r4.A0B
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L43
            android.graphics.RectF r8 = r4.A0C
            float r2 = r4.A00
            android.graphics.RectF r7 = r4.A0D
            float r1 = r7.right
            float r1 = r1 - r2
            float r0 = r7.bottom
            float r0 = r0 - r2
            r8.set(r2, r2, r1, r0)
            android.graphics.Path$Direction r5 = android.graphics.Path.Direction.CW
            r6.addRect(r7, r5)
            int r2 = r4.A03
            boolean r0 = X.Hnb.A02(r2)
            float r1 = r4.A02
            if (r0 == 0) goto L6d
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CCW
            r6.addRoundRect(r7, r1, r1, r0)
        L43:
            boolean r0 = r4.A06
            if (r0 == 0) goto L56
            if (r9 != 0) goto L51
            android.graphics.Paint r0 = r4.A09
            android.graphics.Xfermode r0 = r0.getXfermode()
            if (r0 != 0) goto L56
        L51:
            android.graphics.Paint r0 = r4.A09
            r10.drawPath(r6, r0)
        L56:
            X.FKP r3 = r4.A05
            if (r3 == 0) goto L85
            float[] r2 = r4.A0F
            float r1 = r4.A02
            int r0 = r4.A03
            if (r0 != 0) goto L64
            r0 = 15
        L64:
            X.Hnb.A01(r2, r1, r0)
            android.graphics.RectF r0 = r4.A0D
            r3.A04(r10, r0, r2)
        L6c:
            return
        L6d:
            float[] r3 = r4.A0F
            X.Hnb.A01(r3, r1, r2)
            r6.addRoundRect(r7, r3, r5)
            android.graphics.Path r2 = r4.A0A
            r2.reset()
            float r1 = r4.A01
            int r0 = r4.A03
            X.Hnb.A01(r3, r1, r0)
            r2.addRoundRect(r8, r3, r5)
            goto L43
        L85:
            int r0 = r4.A03
            boolean r0 = X.Hnb.A02(r0)
            if (r0 == 0) goto L97
            android.graphics.RectF r2 = r4.A0C
            float r1 = r4.A01
            android.graphics.Paint r0 = r4.A08
            r10.drawRoundRect(r2, r1, r1, r0)
            return
        L97:
            android.graphics.Path r1 = r4.A0A
            android.graphics.Paint r0 = r4.A08
            r10.drawPath(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FM6.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        FMA.A00(canvas, view);
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A00();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        FM9 fm9 = this.A01;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        RectF rectF = fm9.A0D;
        float f = measuredWidth;
        if (rectF.right == f && rectF.bottom == measuredHeight) {
            return;
        }
        rectF.set(0.0f, 0.0f, f, measuredHeight);
        fm9.A0B.reset();
    }

    @Override // X.FHQ, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = this.A02;
        if (i5 != getLayerType()) {
            super.setLayerType(i5, this.A03);
        }
    }
}
