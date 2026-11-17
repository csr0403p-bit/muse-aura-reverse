package X;

import android.graphics.Matrix;
import android.graphics.PointF;

/* renamed from: X.Fj1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8701Fj1 {
    public AbstractC8724FjP<PointF, PointF> A00;
    public AbstractC8724FjP<?, Float> A01;
    public AbstractC8724FjP<Integer, Integer> A02;
    public AbstractC8724FjP<?, PointF> A03;
    public AbstractC8724FjP<Float, Float> A04;
    public AbstractC8724FjP<C8770Fk9, C8770Fk9> A05;
    public AbstractC8724FjP<?, Float> A06;
    public C8720FjL A07;
    public C8720FjL A08;
    public final float[] A09;
    public final Matrix A0A = new Matrix();
    public final Matrix A0B;
    public final Matrix A0C;
    public final Matrix A0D;
    public final boolean A0E;

    public final Matrix A00() {
        float fFloatValue;
        PointF pointFA06;
        C8770Fk9 c8770Fk9A06;
        float[] fArr;
        PointF pointFA062;
        Matrix matrix = this.A0A;
        matrix.reset();
        AbstractC8724FjP<?, PointF> abstractC8724FjP = this.A03;
        if (abstractC8724FjP != null && (pointFA062 = abstractC8724FjP.A06()) != null) {
            float f = pointFA062.x;
            if (f != 0.0f || pointFA062.y != 0.0f) {
                matrix.preTranslate(f, pointFA062.y);
            }
        }
        if (!this.A0E) {
            AbstractC8724FjP<Float, Float> abstractC8724FjP2 = this.A04;
            if (abstractC8724FjP2 != null) {
                fFloatValue = abstractC8724FjP2 instanceof C8730FjV ? abstractC8724FjP2.A06().floatValue() : ((C8720FjL) abstractC8724FjP2).A0B();
                if (fFloatValue != 0.0f) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (abstractC8724FjP != null) {
            float f2 = abstractC8724FjP.A02;
            PointF pointFA063 = abstractC8724FjP.A06();
            float f3 = pointFA063.x;
            float f4 = pointFA063.y;
            abstractC8724FjP.A08(1.0E-4f + f2);
            PointF pointFA064 = abstractC8724FjP.A06();
            abstractC8724FjP.A08(f2);
            fFloatValue = (float) Math.toDegrees(Math.atan2(pointFA064.y - f4, pointFA064.x - f3));
            matrix.preRotate(fFloatValue);
        }
        if (this.A07 != null) {
            float fCos = this.A08 == null ? 0.0f : (float) Math.cos(Math.toRadians((-r0.A0B()) + 90.0f));
            float fSin = this.A08 == null ? 1.0f : (float) Math.sin(Math.toRadians((-r0.A0B()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r2.A0B()));
            int i = 0;
            do {
                fArr = this.A09;
                fArr[i] = 0.0f;
                i++;
            } while (i < 9);
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f5 = -fSin;
            fArr[3] = f5;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.A0B;
            matrix2.setValues(fArr);
            int i2 = 0;
            do {
                fArr[i2] = 0.0f;
                i2++;
            } while (i2 < 9);
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.A0C;
            matrix3.setValues(fArr);
            int i3 = 0;
            do {
                fArr[i3] = 0.0f;
                i3++;
            } while (i3 < 9);
            fArr[0] = fCos;
            fArr[1] = f5;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.A0D;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        AbstractC8724FjP<C8770Fk9, C8770Fk9> abstractC8724FjP3 = this.A05;
        if (abstractC8724FjP3 != null && (c8770Fk9A06 = abstractC8724FjP3.A06()) != null) {
            float f6 = c8770Fk9A06.A00;
            if (f6 != 1.0f || c8770Fk9A06.A01 != 1.0f) {
                matrix.preScale(f6, c8770Fk9A06.A01);
            }
        }
        AbstractC8724FjP<PointF, PointF> abstractC8724FjP4 = this.A00;
        if (abstractC8724FjP4 != null && (pointFA06 = abstractC8724FjP4.A06()) != null) {
            float f7 = pointFA06.x;
            if (f7 != 0.0f || pointFA06.y != 0.0f) {
                matrix.preTranslate(-f7, -pointFA06.y);
            }
        }
        return matrix;
    }

    public final Matrix A01(float f) {
        float f2;
        AbstractC8724FjP<?, PointF> abstractC8724FjP = this.A03;
        PointF pointFA06 = abstractC8724FjP == null ? null : abstractC8724FjP.A06();
        AbstractC8724FjP<C8770Fk9, C8770Fk9> abstractC8724FjP2 = this.A05;
        C8770Fk9 c8770Fk9A06 = abstractC8724FjP2 == null ? null : abstractC8724FjP2.A06();
        Matrix matrix = this.A0A;
        matrix.reset();
        if (pointFA06 != null) {
            matrix.preTranslate(pointFA06.x * f, pointFA06.y * f);
        }
        if (c8770Fk9A06 != null) {
            double d = f;
            matrix.preScale((float) Math.pow(c8770Fk9A06.A00, d), (float) Math.pow(c8770Fk9A06.A01, d));
        }
        AbstractC8724FjP<Float, Float> abstractC8724FjP3 = this.A04;
        if (abstractC8724FjP3 != null) {
            float fA02 = AbstractC8724FjP.A02(abstractC8724FjP3);
            AbstractC8724FjP<PointF, PointF> abstractC8724FjP4 = this.A00;
            PointF pointFA062 = abstractC8724FjP4 != null ? abstractC8724FjP4.A06() : null;
            float f3 = fA02 * f;
            float f4 = 0.0f;
            if (pointFA062 == null) {
                f2 = 0.0f;
            } else {
                f2 = pointFA062.x;
                f4 = pointFA062.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return matrix;
    }

    public final void A02(InterfaceC8793FkY interfaceC8793FkY) {
        AbstractC8724FjP<Integer, Integer> abstractC8724FjP = this.A02;
        if (abstractC8724FjP != null) {
            abstractC8724FjP.A09(interfaceC8793FkY);
        }
        AbstractC8724FjP<?, Float> abstractC8724FjP2 = this.A06;
        if (abstractC8724FjP2 != null) {
            abstractC8724FjP2.A09(interfaceC8793FkY);
        }
        AbstractC8724FjP<?, Float> abstractC8724FjP3 = this.A01;
        if (abstractC8724FjP3 != null) {
            abstractC8724FjP3.A09(interfaceC8793FkY);
        }
        AbstractC8724FjP<PointF, PointF> abstractC8724FjP4 = this.A00;
        if (abstractC8724FjP4 != null) {
            abstractC8724FjP4.A09(interfaceC8793FkY);
        }
        AbstractC8724FjP<?, PointF> abstractC8724FjP5 = this.A03;
        if (abstractC8724FjP5 != null) {
            abstractC8724FjP5.A09(interfaceC8793FkY);
        }
        AbstractC8724FjP<C8770Fk9, C8770Fk9> abstractC8724FjP6 = this.A05;
        if (abstractC8724FjP6 != null) {
            abstractC8724FjP6.A09(interfaceC8793FkY);
        }
        AbstractC8724FjP<Float, Float> abstractC8724FjP7 = this.A04;
        if (abstractC8724FjP7 != null) {
            abstractC8724FjP7.A09(interfaceC8793FkY);
        }
        C8720FjL c8720FjL = this.A07;
        if (c8720FjL != null) {
            c8720FjL.A09(interfaceC8793FkY);
        }
        C8720FjL c8720FjL2 = this.A08;
        if (c8720FjL2 != null) {
            c8720FjL2.A09(interfaceC8793FkY);
        }
    }

    public final void A03(AbstractC8671FiX abstractC8671FiX) {
        abstractC8671FiX.A07(this.A02);
        abstractC8671FiX.A07(this.A06);
        abstractC8671FiX.A07(this.A01);
        abstractC8671FiX.A07(this.A00);
        abstractC8671FiX.A07(this.A03);
        abstractC8671FiX.A07(this.A05);
        abstractC8671FiX.A07(this.A04);
        abstractC8671FiX.A07(this.A07);
        abstractC8671FiX.A07(this.A08);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;LX/Fii<TT;>;)Z */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04(X.C8682Fii r5, java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8701Fj1.A04(X.Fii, java.lang.Object):boolean");
    }

    public C8701Fj1(C8728FjT c8728FjT) {
        C8737Fjc c8737Fjc = c8728FjT.A07;
        this.A00 = c8737Fjc == null ? null : c8737Fjc.A7a();
        InterfaceC8761Fk0<PointF, PointF> interfaceC8761Fk0 = c8728FjT.A09;
        this.A03 = interfaceC8761Fk0 == null ? null : interfaceC8761Fk0.A7a();
        C8768Fk7 c8768Fk7 = c8728FjT.A08;
        this.A05 = c8768Fk7 == null ? null : new C8718FjJ(c8768Fk7.A00);
        C8689Fip c8689Fip = c8728FjT.A02;
        this.A04 = c8689Fip == null ? null : new C8720FjL(c8689Fip.A00);
        C8689Fip c8689Fip2 = c8728FjT.A03;
        C8720FjL c8720FjL = c8689Fip2 == null ? null : new C8720FjL(c8689Fip2.A00);
        this.A07 = c8720FjL;
        this.A0E = c8728FjT.A00;
        if (c8720FjL != null) {
            this.A0B = new Matrix();
            this.A0C = new Matrix();
            this.A0D = new Matrix();
            this.A09 = new float[9];
        }
        C8689Fip c8689Fip3 = c8728FjT.A04;
        this.A08 = c8689Fip3 == null ? null : new C8720FjL(c8689Fip3.A00);
        C8766Fk5 c8766Fk5 = c8728FjT.A06;
        if (c8766Fk5 != null) {
            this.A02 = new C8722FjN(c8766Fk5.A00);
        }
        C8689Fip c8689Fip4 = c8728FjT.A05;
        if (c8689Fip4 != null) {
            this.A06 = new C8720FjL(c8689Fip4.A00);
        } else {
            this.A06 = null;
        }
        C8689Fip c8689Fip5 = c8728FjT.A01;
        if (c8689Fip5 != null) {
            this.A01 = new C8720FjL(c8689Fip5.A00);
        } else {
            this.A01 = null;
        }
    }
}
