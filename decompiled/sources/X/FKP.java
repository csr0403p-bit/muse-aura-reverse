package X;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class FKP {
    public float A00;
    public int A01;
    public Path A02;
    public Path A03;
    public Path A04;
    public FE6 A05;
    public List<FKS> A06;
    public boolean A07;
    public float[] A08;
    public final Path A09;
    public final RectF A0A;
    public final RectF A0B;
    public final float[] A0C;
    public final Path[] A0D;
    public final Paint A0E;
    public final Paint A0F;

    public static float A00(double d, float f) {
        double d2 = f;
        if (d <= d2 || d <= 0.0d) {
            return 1.0f;
        }
        return (float) (d2 / d);
    }

    public static void A03(float[] fArr, float f, float f2) {
        int i = 0;
        float fMin = Math.min(Math.min(A00(fArr[0] + fArr[2], f), A00(fArr[6] + fArr[4], f)), Math.min(A00(fArr[1] + fArr[7], f2), A00(fArr[3] + fArr[5], f2)));
        do {
            fArr[i] = fArr[i] * fMin;
            i++;
        } while (i < 8);
    }

    public final void A04(Canvas canvas, RectF rectF, float[] fArr) {
        int length = fArr.length;
        if (length < 8) {
            throw BV5.A0Q("Expected 8 corner radii, got ", length);
        }
        if (this.A03 != null) {
            this.A03 = null;
            this.A07 = true;
        }
        if (rectF.isEmpty()) {
            return;
        }
        FE6 fe6 = this.A05;
        int i = 0;
        do {
            if (fe6.A00.A00[i] > 0.0f && (fe6.A01[i] >>> 24) != 0) {
                RectF rectF2 = this.A0A;
                if (!rectF2.equals(rectF) || !Arrays.equals(this.A0C, fArr)) {
                    rectF2.set(rectF);
                    System.arraycopy(fArr, 0, this.A0C, 0, 8);
                    this.A07 = true;
                }
                A01(canvas, this);
                return;
            }
            i++;
        } while (i < 4);
    }

    public final void A05(FE6 fe6, float[] fArr, float f) {
        int length;
        boolean z = false;
        if (fArr != null && (length = fArr.length) >= 2 && length % 2 == 0) {
            int i = 0;
            float f2 = 0.0f;
            while (true) {
                float f3 = fArr[i];
                if (f3 < 0.0f || Float.isInfinite(f3)) {
                    break;
                }
                f2 += f3;
                i++;
                if (i >= length) {
                    if (f2 > 0.0f && !Float.isInfinite(f2)) {
                        z = true;
                    }
                }
            }
        }
        if (!z) {
            fArr = null;
        }
        if (this.A05.equals(fe6) && Arrays.equals(this.A08, fArr) && this.A00 == f) {
            return;
        }
        this.A05 = fe6;
        this.A08 = fArr == null ? null : (float[]) fArr.clone();
        this.A00 = f;
        this.A06 = Collections.EMPTY_LIST;
        this.A04 = null;
        this.A07 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0108 A[EDGE_INSN: B:182:0x0108->B:43:0x0108 BREAK  A[LOOP:2: B:35:0x00eb->B:184:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[LOOP:2: B:35:0x00eb->B:184:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0237  */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r34v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(android.graphics.Canvas r45, X.FKP r46) {
        /*
            Method dump skipped, instructions count: 1372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FKP.A01(android.graphics.Canvas, X.FKP):void");
    }

    private void A02(RectF rectF) {
        float[] fArr = this.A05.A00.A00;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float fA00 = A00(f4 + f2, rectF.width());
        float fA002 = A00(f + f3, rectF.height());
        float f5 = f4 * fA00;
        float f6 = f2 * fA00;
        float f7 = f * fA002;
        float f8 = f3 * fA002;
        RectF rectF2 = new RectF(rectF.left + f5, rectF.top + f7, rectF.right - f6, rectF.bottom - f8);
        float[] fArr2 = (float[]) this.A0C.clone();
        A03(fArr2, rectF.width(), rectF.height());
        float fMax = Math.max(0.0f, fArr2[0] - f5);
        float fMax2 = Math.max(0.0f, fArr2[1] - f7);
        float fMax3 = Math.max(0.0f, fArr2[2] - f6);
        float fMax4 = Math.max(0.0f, fArr2[3] - f7);
        float fMax5 = Math.max(0.0f, fArr2[4] - f6);
        float fMax6 = Math.max(0.0f, fArr2[5] - f8);
        float fMax7 = Math.max(0.0f, fArr2[6] - f5);
        float fMax8 = Math.max(0.0f, fArr2[7] - f8);
        float[] fArrA1Z = AbstractC7607F5u.A1Z(fMax, fMax2, 8);
        fArrA1Z[2] = fMax3;
        fArrA1Z[3] = fMax4;
        fArrA1Z[4] = fMax5;
        fArrA1Z[5] = fMax6;
        fArrA1Z[6] = fMax7;
        fArrA1Z[7] = fMax8;
        A03(fArrA1Z, rectF2.width(), rectF2.height());
        Path path = this.A09;
        path.reset();
        path.setFillType(Path.FillType.EVEN_ODD);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr2, direction);
        if (!rectF2.isEmpty()) {
            path.addRoundRect(rectF2, fArrA1Z, direction);
        }
        if (this.A08 != null) {
            RectF rectF3 = new RectF(rectF.left + (f5 / 2.0f), rectF.top + (f7 / 2.0f), rectF.right - (f6 / 2.0f), rectF.bottom - (f8 / 2.0f));
            float[] fArr3 = new float[8];
            int i = 0;
            do {
                fArr3[i] = (fArr2[i] + fArrA1Z[i]) / 2.0f;
                i++;
            } while (i < 8);
            A03(fArr3, rectF3.width(), rectF3.height());
            Path pathA0V = AbstractC7607F5u.A0V();
            pathA0V.addRoundRect(rectF3, fArr3, direction);
            Paint paintA0T = AbstractC7607F5u.A0T();
            paintA0T.setStyle(Paint.Style.STROKE);
            paintA0T.setStrokeWidth(Math.max(Math.max(f7, f8), Math.max(f5, f6)) * 2.0f);
            paintA0T.setPathEffect(new DashPathEffect(this.A08, this.A00));
            Path pathA0V2 = AbstractC7607F5u.A0V();
            paintA0T.getFillPath(pathA0V, pathA0V2);
            path.op(pathA0V2, Path.Op.INTERSECT);
        }
        float[] fArrA1Z2 = AbstractC7607F5u.A1Z(f7, f6, 4);
        fArrA1Z2[2] = f8;
        fArrA1Z2[3] = f5;
        int i2 = 0;
        do {
            Path[] pathArr = this.A0D;
            Path path2 = pathArr[i2];
            path2.reset();
            if (fArrA1Z2[i2] != 0.0f) {
                float[] fArr4 = {0.0f, -1.0f, 0.0f, 1.0f};
                float[] fArr5 = {1.0f, 0.0f, -1.0f, 0.0f};
                float f9 = -rectF.top;
                float f10 = rectF.right;
                float f11 = rectF.bottom;
                float f12 = -rectF.left;
                float[] fArrA1Z3 = AbstractC7607F5u.A1Z(f9, f10, 4);
                fArrA1Z3[2] = f11;
                fArrA1Z3[3] = f12;
                RectF rectF4 = this.A0A;
                float f13 = rectF4.left;
                float f14 = rectF4.top;
                float[] fArrA1Z4 = AbstractC7607F5u.A1Z(f13, f14, 2);
                float f15 = rectF4.right;
                float[] fArrA1Z5 = AbstractC7607F5u.A1Z(f15, f14, 2);
                float f16 = rectF4.bottom;
                float[][] fArr6 = {fArrA1Z4, fArrA1Z5, AbstractC7607F5u.A1Z(f15, f16, 2), AbstractC7607F5u.A1Z(f13, f16, 2)};
                int i3 = 0;
                do {
                    if (i3 != i2) {
                        float f17 = fArrA1Z2[i3];
                        if (f17 != 0.0f) {
                            float f18 = fArr4[i2] * f17;
                            float f19 = fArr4[i3];
                            float f20 = fArrA1Z2[i2];
                            float f21 = f18 - (f19 * f20);
                            float f22 = (fArr5[i2] * f17) - (fArr5[i3] * f20);
                            float f23 = (fArrA1Z3[i2] * f17) - (fArrA1Z3[i3] * f20);
                            int length = fArr6.length;
                            float[][] fArr7 = new float[length * 2][];
                            int i4 = 0;
                            int i5 = 0;
                            while (i4 < length) {
                                float[] fArr8 = fArr6[i4];
                                i4++;
                                float[] fArr9 = fArr6[i4 % length];
                                float f24 = fArr8[0];
                                float f25 = fArr8[1];
                                float f26 = (f21 * f24) + (f22 * f25) + f23;
                                float f27 = fArr9[0];
                                float f28 = fArr9[1];
                                float f29 = (f21 * f27) + (f22 * f28) + f23;
                                if (f26 <= 0.0f) {
                                    fArr7[i5] = fArr8;
                                    i5++;
                                }
                                if ((f26 < 0.0f && f29 > 0.0f) || (f26 > 0.0f && f29 < 0.0f)) {
                                    float f30 = f26 / (f26 - f29);
                                    fArr7[i5] = AbstractC7607F5u.A1Z(C8j3.A02(f27, f24, f30), AbstractC7607F5u.A01(f28, f25, f30), 2);
                                    i5++;
                                }
                            }
                            fArr6 = (float[][]) Arrays.copyOf(fArr7, i5);
                        }
                    }
                    i3++;
                } while (i3 < 4);
                int length2 = fArr6.length;
                if (length2 != 0) {
                    float[] fArr10 = fArr6[0];
                    path2.moveTo(fArr10[0], fArr10[1]);
                    for (int i6 = 1; i6 < length2; i6++) {
                        float[] fArr11 = fArr6[i6];
                        path2.lineTo(fArr11[0], fArr11[1]);
                    }
                    path2.close();
                }
            }
            pathArr[i2].op(path, Path.Op.INTERSECT);
            i2++;
        } while (i2 < 4);
    }

    public FKP() {
        Paint paintA0U = AbstractC7607F5u.A0U(2);
        this.A0E = paintA0U;
        this.A0F = AbstractC7607F5u.A0U(1);
        this.A0A = AbstractC7607F5u.A0Y();
        this.A0C = new float[8];
        this.A0D = new Path[]{AbstractC7607F5u.A0V(), AbstractC7607F5u.A0V(), AbstractC7607F5u.A0V(), AbstractC7607F5u.A0V()};
        this.A09 = AbstractC7607F5u.A0V();
        this.A0B = AbstractC7607F5u.A0Y();
        this.A06 = Collections.EMPTY_LIST;
        this.A05 = new FE6(new FI4(0.0f, 0.0f, 0.0f, 0.0f), 0, 0, 0, 0);
        this.A07 = true;
        paintA0U.setFilterBitmap(true);
    }
}
