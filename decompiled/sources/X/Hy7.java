package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes6.dex */
public final class Hy7 extends Drawable {
    public Path A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final RectF A04;
    public final HyU A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final Paint[] A0B;
    public final Paint[] A0C;
    public final Path[] A0D;
    public final float A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final RectF A0H;
    public final boolean A0I;
    public static final int[] A0K = {-15173646, -14298266, -668109, -37796, -6278145, -15173646};
    public static final float[] A0J = {0.0f, 0.317f, 0.453f, 0.542f, 0.85f, 1.0f};

    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Hy7(android.content.Context r11, X.HyU r12, X.InterfaceC10557Hsn r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hy7.<init>(android.content.Context, X.HyU, X.Hsn, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0106, code lost:
    
        if (r17.A07 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0206, code lost:
    
        if (r17.A07 != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0204  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hy7.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        float f;
        C7384Etj.A0Y(rect, 0);
        float f2 = this.A07 ? this.A02 : 0.0f;
        float f3 = this.A08 ? this.A02 : 0.0f;
        boolean z = this.A09;
        if (z) {
            f = this.A02 + (this.A0I ? 0.0f : this.A01);
        } else {
            f = 0.0f;
        }
        if (this.A06) {
            f = (this.A0I ? 0.0f : this.A01) + this.A02;
            if (z) {
                float f4 = this.A0E;
                f -= f4;
                f += f4;
            }
        }
        rect.set((int) f2, (int) f, (int) f3, (int) f);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float[] fArrA1Z;
        LinearGradient linearGradient;
        Shader linearGradient2;
        C7384Etj.A0Y(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A04;
        float f = rect.left;
        float f2 = this.A02;
        float f3 = f + f2;
        boolean z = this.A09;
        float f4 = rect.top;
        if (z) {
            f4 += f2;
        }
        float f5 = rect.right - f2;
        boolean z2 = this.A06;
        float f6 = rect.bottom;
        if (z2) {
            f6 -= f2;
        }
        rectF.set(f3, f4, f5, f6);
        RectF rectF2 = this.A0H;
        float f7 = rect.left + f2;
        float f8 = rect.top;
        if (z) {
            f8 = (f8 + f2) - this.A0E;
        }
        float f9 = rect.right - f2;
        float f10 = rect.bottom;
        if (z2) {
            f10 = (f10 - f2) - this.A0E;
        }
        rectF2.set(f7, f8, f9, f10);
        if (this.A07 && z && this.A08 && z2) {
            this.A00 = null;
        } else {
            Path pathA0V = this.A00;
            if (pathA0V == null) {
                pathA0V = AbstractC7607F5u.A0V();
                this.A00 = pathA0V;
            }
            pathA0V.reset();
            float f11 = z ? this.A01 : 0.0f;
            float f12 = z2 ? this.A01 : 0.0f;
            float[] fArr = {f11, f11, f11, 0.0f, 0.0f, f12, 0.0f, 0.0f};
            AbstractC7609F5w.A1T(fArr, f11, f12);
            AbstractC7609F5w.A1S(fArr, f12);
            Path path = this.A00;
            C7384Etj.A0X(path);
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            Path path2 = this.A00;
            C7384Etj.A0X(path2);
            path2.close();
        }
        float f13 = this.A01;
        float f14 = -f13;
        RectF rectF3 = new RectF(f14, f14, f13, f13);
        RectF rectF4 = new RectF(rectF3);
        float f15 = -f2;
        rectF4.inset(f15, f15);
        HyU hyU = this.A05;
        boolean z3 = this.A0A;
        float f16 = z3 ? hyU.colorAlphaMultiplierDark : hyU.colorAlphaMultiplierLight;
        int[] iArrA1a = AbstractC7607F5u.A1a(A0K, 6);
        int[] iArr = {-15173646, -15173646, -15173646};
        if (z3 && hyU.hasFoaStroke) {
            A01(iArr);
            A01(iArrA1a);
        }
        float f17 = 0.3f * f16;
        float f18 = 0.1f * f16;
        int[] iArr2 = {HyN.A00(iArr[0], f17), HyN.A00(iArr[1], f18), HyN.A00(iArr[2], 0.0f)};
        boolean z4 = hyU.hasFoaStroke;
        int i = this.A03;
        int[] iArr3 = z4 ? new int[]{HyN.A00(i, f17), HyN.A00(i, f18), HyN.A00(i, 0.0f)} : new int[]{HyN.A00(i, f16 * 0.5f), HyN.A00(i, f17), HyN.A00(i, f18), HyN.A00(i, 0.0f)};
        if (z4) {
            fArrA1Z = AbstractC7607F5u.A1Z(0.0f, 0.5f, 3);
            fArrA1Z[2] = 1.0f;
            linearGradient = new LinearGradient(0.0f, 0.0f, getBounds().width() - (2.0f * (f2 + f13)), 0.0f, iArrA1a, A0J, Shader.TileMode.REPEAT);
        } else {
            fArrA1Z = new float[]{0.0f, 0.25f, 0.75f, 1.0f};
            linearGradient = null;
        }
        float f19 = f13 + f2;
        int[] iArr4 = iArr3;
        if (hyU.hasFoaStroke) {
            iArr4 = iArr2;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, f19, iArr4, fArrA1Z, tileMode);
        Path[] pathArr = this.A0D;
        int length = pathArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            Path path3 = pathArr[i3];
            C7384Etj.A0X(path3);
            path3.reset();
            path3.setFillType(Path.FillType.EVEN_ODD);
            this.A0B[i3].setShader(radialGradient);
            if (i2 == 90) {
                path3.moveTo(0.0f, f14);
                path3.rLineTo(0.0f, f15);
                linearGradient2 = new LinearGradient(0.0f, 0.0f, f19, 0.0f, iArr2, fArrA1Z, tileMode);
            } else if (i2 == 180) {
                path3.moveTo(f13, 0.0f);
                path3.rLineTo(f2, 0.0f);
                linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, f19, iArr3, fArrA1Z, tileMode);
            } else if (i2 != 270) {
                path3.moveTo(f14, 0.0f);
                path3.rLineTo(f15, 0.0f);
                linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, f15 - f13, iArr3, fArrA1Z, tileMode);
            } else {
                path3.moveTo(0.0f, f13);
                path3.rLineTo(0.0f, f2);
                linearGradient2 = new LinearGradient(0.0f, 0.0f, f15 - f13, 0.0f, iArr2, fArrA1Z, tileMode);
            }
            float f20 = i2;
            path3.arcTo(rectF4, 180.0f + f20, 90.0f, false);
            path3.arcTo(rectF3, f20 + 270.0f, -90.0f, false);
            path3.close();
            if (hyU.hasFoaStroke && linearGradient != null && (i2 == 180 || i2 == 0)) {
                linearGradient2 = new ComposeShader(linearGradient2, linearGradient, PorterDuff.Mode.SRC_IN);
            }
            this.A0C[i3].setShader(linearGradient2);
            i2 += 90;
        }
    }

    public static void A00(Canvas canvas, Hy7 hy7, int i) {
        Path path = hy7.A0D[i];
        C7384Etj.A0X(path);
        canvas.drawPath(path, hy7.A0B[i]);
    }

    public static final void A01(int[] iArr) {
        int iA00 = HyN.A00(FP4.A01(FP5.A08).A00, 0.2f);
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            int iAlpha = Color.alpha(i2);
            int iAlpha2 = Color.alpha(iA00);
            int i3 = (255 - iAlpha2) * iAlpha;
            int i4 = i3 + iAlpha2;
            iArr[i] = Color.argb(Math.min(255, i4), ((Color.red(i2) * i3) + (Color.red(iA00) * iAlpha2)) / i4, ((Color.green(i2) * i3) + (Color.green(iA00) * iAlpha2)) / i4, ((i3 * Color.blue(i2)) + (Color.blue(iA00) * iAlpha2)) / i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        for (Paint paint : this.A0B) {
            paint.setAlpha(i);
        }
        for (Paint paint2 : this.A0C) {
            paint2.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        for (Paint paint : this.A0B) {
            paint.setColorFilter(colorFilter);
        }
        for (Paint paint2 : this.A0C) {
            paint2.setColorFilter(colorFilter);
        }
    }
}
