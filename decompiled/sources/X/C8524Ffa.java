package X;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: X.Ffa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8524Ffa implements InterfaceC8529Ffg {
    public float A00;
    public Bitmap A05;
    public final Paint A06;
    public final Paint A07;
    public final C8525Ffb A08;
    public int A03 = -16776961;
    public int A04 = -1;
    public float A01 = 0.5f;
    public float A02 = 0.1f;

    public static RectF A04(RectF rectF, float f, float f2, float f3) {
        return new RectF(f + f2, rectF.top + f3, rectF.right - f3, rectF.bottom - f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    @Override // X.InterfaceC8529Ffg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A9G(android.graphics.Canvas r10, android.graphics.RectF r11) {
        /*
            r9 = this;
            r0 = 1
            X.C7384Etj.A0Y(r11, r0)
            float r1 = r11.left
            float r0 = r9.A00
            r8 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r8
            android.graphics.RectF r0 = A04(r11, r1, r0, r0)
            android.graphics.Path r6 = r9.A00(r0)
            android.graphics.Bitmap r7 = r9.A05
            if (r7 == 0) goto L9a
            X.Ffb r5 = r9.A08
            boolean r0 = r7.isRecycled()
            if (r0 != 0) goto L9a
            int r0 = r7.getWidth()
            if (r0 <= 0) goto L9a
            int r0 = r7.getHeight()
            if (r0 <= 0) goto L9a
            android.graphics.Bitmap r0 = r5.A00
            if (r0 == r7) goto L3f
            r5.A00 = r7
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.BitmapShader r1 = new android.graphics.BitmapShader
            r1.<init>(r7, r0, r0)
            r5.A01 = r1
            android.graphics.Paint r0 = r5.A03
            r0.setShader(r1)
        L3f:
            float r2 = r11.width()
            int r0 = r7.getWidth()
            float r0 = (float) r0
            float r2 = r2 / r0
            float r1 = r11.height()
            int r0 = r7.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            float r4 = java.lang.Math.max(r2, r1)
            android.graphics.Matrix r3 = r5.A02
            r3.setScale(r4, r4)
            float r2 = r11.centerX()
            int r0 = r7.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r4
            float r0 = r0 / r8
            float r2 = r2 - r0
            float r1 = r11.centerY()
            int r0 = r7.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r4
            float r0 = r0 / r8
            float r1 = r1 - r0
            r3.postTranslate(r2, r1)
            android.graphics.BitmapShader r0 = r5.A01
            if (r0 == 0) goto L7e
            r0.setLocalMatrix(r3)
        L7e:
            android.graphics.Paint r1 = r5.A03
        L80:
            r10.drawPath(r6, r1)
            float r1 = r9.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L99
            android.graphics.Paint r1 = r9.A07
            int r0 = r9.A04
            r1.setColor(r0)
            float r0 = r9.A00
            r1.setStrokeWidth(r0)
            r10.drawPath(r6, r1)
        L99:
            return
        L9a:
            android.graphics.Paint r1 = r9.A06
            int r0 = r9.A03
            r1.setColor(r0)
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8524Ffa.A9G(android.graphics.Canvas, android.graphics.RectF):void");
    }

    @Override // X.InterfaceC8529Ffg
    public final Path AQH(RectF rectF) {
        C7384Etj.A0Y(rectF, 0);
        float f = rectF.left;
        float f2 = this.A00 / 2.0f;
        return A00(A04(rectF, f, f2, f2));
    }

    public static PointF A02(PointF pointF, float f) {
        return new PointF(pointF.x * f, pointF.y * f);
    }

    public static final PointF A03(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x - pointF2.x, pointF.y - pointF2.y);
    }

    @Override // X.InterfaceC8529Ffg
    public final PointF A78(RectF rectF) {
        float f = rectF.left;
        float f2 = this.A00;
        RectF rectFA04 = A04(rectF, f, f2, f2);
        return new PointF(rectFA04.centerX(), rectFA04.top + (rectFA04.width() / 2.0f));
    }

    @Override // X.InterfaceC8529Ffg
    public final RectF AN0(RectF rectF) {
        float f = rectF.left;
        float f2 = this.A00;
        RectF rectFA04 = A04(rectF, f, f2, f2);
        float fWidth = rectFA04.width() / 2.0f;
        PointF pointF = new PointF(rectFA04.centerX(), rectFA04.top + fWidth);
        float fSqrt = fWidth * ((float) Math.sqrt(2.0d));
        float f3 = pointF.x;
        float f4 = fSqrt / 2.0f;
        float f5 = pointF.y;
        return new RectF(f3 - f4, f5 - f4, f3 + f4, f5 + f4);
    }

    @Override // X.InterfaceC8529Ffg
    public final C8530Ffh Agm() {
        return C8530Ffh.A04;
    }

    @Override // X.InterfaceC8529Ffg
    public final C8530Ffh AiL() {
        return C8530Ffh.A04;
    }

    public C8524Ffa() {
        Paint paintA0U = AbstractC7607F5u.A0U(1);
        AbstractC7607F5u.A1G(paintA0U);
        this.A06 = paintA0U;
        Paint paintA0U2 = AbstractC7607F5u.A0U(1);
        paintA0U2.setStyle(Paint.Style.STROKE);
        this.A07 = paintA0U2;
        this.A08 = new C8525Ffb();
    }

    private final Path A00(RectF rectF) {
        Path pathA0V = AbstractC7607F5u.A0V();
        float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
        PointF pointF = new PointF(rectF.centerX(), rectF.top + fMin);
        float fMin2 = Math.min(Math.max(1.5707964f, 2.3561945f), 3.1415927f);
        float f = 4.712389f - fMin2;
        float f2 = pointF.x;
        double d = f;
        float fCos = (float) Math.cos(d);
        float f3 = pointF.y;
        float fSin = (float) Math.sin(d);
        PointF pointF2 = new PointF(f2 + (fCos * fMin), f3 + (fSin * fMin));
        float f4 = pointF.x;
        double d2 = fMin2 + 4.712389f;
        float fCos2 = (float) Math.cos(d2);
        float f5 = pointF.y;
        float fSin2 = (float) Math.sin(d2);
        PointF pointF3 = new PointF(f4 + (fCos2 * fMin), f5 + (fSin2 * fMin));
        PointF pointF4 = new PointF(pointF.x, rectF.bottom);
        float f6 = pointF.x;
        float f7 = pointF.y;
        pathA0V.arcTo(new RectF(f6 - fMin, f7 - fMin, f6 + fMin, f7 + fMin), (float) Math.toDegrees(d), (float) Math.toDegrees(r6 - f), true);
        float f8 = this.A02;
        float f9 = this.A01;
        PointF pointF5 = new PointF(-fSin2, fCos2);
        PointF pointF6 = new PointF(fSin, -fCos);
        PointF pointFA01 = A01(A03(pointF3, pointF4));
        PointF pointFA012 = A01(A03(pointF2, pointF4));
        float fMin3 = Math.min(A03(pointF3, pointF4).length(), A03(pointF2, pointF4).length()) * 0.5f;
        float fMin4 = Math.min(Math.max(f8, 0.0f), 1.0f) * fMin3;
        PointF pointFA0W = AbstractC7607F5u.A0W(pointF4, A02(pointFA01, fMin4));
        PointF pointFA0W2 = AbstractC7607F5u.A0W(pointF4, A02(pointFA012, fMin4));
        float f10 = fMin4 * 0.5f;
        PointF pointFA03 = A03(pointFA0W, A02(pointFA01, f10));
        PointF pointFA032 = A03(pointFA0W2, A02(pointFA012, f10));
        PointF pointFA033 = A03(pointF4, new PointF((((pointFA0W.x + (pointFA03.x * 3.0f)) + (pointFA032.x * 3.0f)) + pointFA0W2.x) / 8.0f, (((pointFA0W.y + (pointFA03.y * 3.0f)) + (3.0f * pointFA032.y)) + pointFA0W2.y) / 8.0f));
        PointF pointFA0W3 = AbstractC7607F5u.A0W(pointFA0W, pointFA033);
        PointF pointFA0W4 = AbstractC7607F5u.A0W(pointFA0W2, pointFA033);
        PointF pointFA0W5 = AbstractC7607F5u.A0W(pointFA03, pointFA033);
        PointF pointFA0W6 = AbstractC7607F5u.A0W(pointFA032, pointFA033);
        float fMin5 = Math.min(Math.max(f9, 0.0f), 1.0f);
        float f11 = fMin3 * 2.0f * fMin5;
        if (fMin5 > 0.0f) {
            PointF pointFA0W7 = AbstractC7607F5u.A0W(pointF3, A02(A01(pointF5), f11));
            PointF pointFA0W8 = AbstractC7607F5u.A0W(pointFA0W3, A03(pointFA0W3, pointFA0W5));
            pathA0V.cubicTo(pointFA0W7.x, pointFA0W7.y, pointFA0W8.x, pointFA0W8.y, pointFA0W3.x, pointFA0W3.y);
        } else {
            pathA0V.lineTo(pointFA0W3.x, pointFA0W3.y);
        }
        pathA0V.cubicTo(pointFA0W5.x, pointFA0W5.y, pointFA0W6.x, pointFA0W6.y, pointFA0W4.x, pointFA0W4.y);
        if (fMin5 > 0.0f) {
            PointF pointFA013 = A01(pointF6);
            PointF pointFA0W9 = AbstractC7607F5u.A0W(pointFA0W4, A03(pointFA0W4, pointFA0W6));
            PointF pointFA0W10 = AbstractC7607F5u.A0W(pointF2, A02(pointFA013, f11));
            pathA0V.cubicTo(pointFA0W9.x, pointFA0W9.y, pointFA0W10.x, pointFA0W10.y, pointF2.x, pointF2.y);
        } else {
            pathA0V.lineTo(pointF2.x, pointF2.y);
        }
        pathA0V.close();
        return pathA0V;
    }

    public static final PointF A01(PointF pointF) {
        float length = pointF.length();
        return length > 0.0f ? new PointF(pointF.x / length, pointF.y / length) : new PointF(0.0f, 0.0f);
    }

    @Override // X.InterfaceC8529Ffg
    public final PointF AXu(RectF rectF) {
        return new PointF(rectF.centerX(), rectF.bottom);
    }
}
