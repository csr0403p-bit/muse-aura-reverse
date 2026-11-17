package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* renamed from: X.BoX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2907BoX {
    public static final EnumC2911Boc A08 = EnumC2911Boc.FILL_CENTER;
    public int A00;
    public int A01;
    public Matrix A02;
    public Rect A03;
    public Size A04;
    public EnumC2911Boc A05 = A08;
    public boolean A06;
    public boolean A07;

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A01(X.C2907BoX r5) {
        /*
            boolean r0 = r5.A06
            r4 = 0
            r3 = 1
            if (r0 == 0) goto Lc
            int r2 = r5.A01
            r0 = -1
            r1 = 0
            if (r2 == r0) goto Ld
        Lc:
            r1 = 1
        Ld:
            android.graphics.Rect r0 = r5.A03
            if (r0 == 0) goto L18
            android.util.Size r0 = r5.A04
            if (r0 == 0) goto L18
            if (r1 == 0) goto L18
            return r3
        L18:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2907BoX.A01(X.BoX):boolean");
    }

    public static final Matrix A00(C2907BoX c2907BoX) {
        BeS.A07(A01(c2907BoX), null);
        RectF rectFA0R = BV8.A0R(c2907BoX.A04, c2907BoX.A04.getWidth());
        return BfO.A00(rectFA0R, rectFA0R, !c2907BoX.A06 ? c2907BoX.A00 : -AbstractC2467Bbu.A00(c2907BoX.A01), false);
    }

    public final Matrix A02(Size size, int i) {
        int iWidth;
        int iHeight;
        int iWidth2;
        int iHeight2;
        RectF rectFA0Q;
        Matrix.ScaleToFit scaleToFit;
        BeS.A07(A01(this), null);
        boolean zA03 = BfO.A03(this.A00);
        Rect rect = this.A03;
        if (zA03) {
            iWidth = rect.height();
            iHeight = this.A03.width();
        } else {
            iWidth = rect.width();
            iHeight = this.A03.height();
        }
        Size sizeA0P = BV6.A0P(iWidth, iHeight);
        float width = size.getWidth() / size.getHeight();
        float width2 = (sizeA0P.getWidth() + 1.0f) / (sizeA0P.getHeight() - 1.0f);
        if (width < (sizeA0P.getWidth() - 1.0f) / (sizeA0P.getHeight() + 1.0f) || width2 < width) {
            RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
            boolean zA032 = BfO.A03(this.A00);
            Rect rect2 = this.A03;
            if (zA032) {
                iWidth2 = rect2.height();
                iHeight2 = this.A03.width();
            } else {
                iWidth2 = rect2.width();
                iHeight2 = this.A03.height();
            }
            rectFA0Q = BV8.A0Q(BV6.A0P(iWidth2, iHeight2));
            Matrix matrixA08 = BV4.A08();
            EnumC2911Boc enumC2911Boc = this.A05;
            switch (enumC2911Boc) {
                case FILL_START:
                case FIT_START:
                    scaleToFit = Matrix.ScaleToFit.START;
                    break;
                case FILL_CENTER:
                case FIT_CENTER:
                    scaleToFit = Matrix.ScaleToFit.CENTER;
                    break;
                case FILL_END:
                case FIT_END:
                    scaleToFit = Matrix.ScaleToFit.END;
                    break;
                default:
                    AbstractC2875Bni.A02("PreviewTransform", AnonymousClass007.A0a("Unexpected crop rect: ", enumC2911Boc));
                    scaleToFit = Matrix.ScaleToFit.FILL;
                    break;
            }
            if (enumC2911Boc == EnumC2911Boc.FIT_CENTER || enumC2911Boc == EnumC2911Boc.FIT_START || enumC2911Boc == EnumC2911Boc.FIT_END) {
                matrixA08.setRectToRect(rectFA0Q, rectF, scaleToFit);
            } else {
                matrixA08.setRectToRect(rectF, rectFA0Q, scaleToFit);
                matrixA08.invert(matrixA08);
            }
            matrixA08.mapRect(rectFA0Q);
            if (i == 1) {
                float width3 = size.getWidth() / 2.0f;
                float f = width3 + width3;
                rectFA0Q = new RectF(f - rectFA0Q.right, rectFA0Q.top, f - rectFA0Q.left, rectFA0Q.bottom);
            }
        } else {
            rectFA0Q = BV8.A0R(size, size.getWidth());
        }
        Matrix matrixA00 = BfO.A00(new RectF(this.A03), rectFA0Q, this.A00, false);
        if (this.A07 && this.A06) {
            boolean zA033 = BfO.A03(this.A00);
            float fCenterX = this.A03.centerX();
            float fCenterY = this.A03.centerY();
            if (!zA033) {
                matrixA00.preScale(-1.0f, 1.0f, fCenterX, fCenterY);
                return matrixA00;
            }
            matrixA00.preScale(1.0f, -1.0f, fCenterX, fCenterY);
        }
        return matrixA00;
    }
}
