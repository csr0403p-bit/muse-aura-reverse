package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: X.Fj6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8705Fj6 extends AbstractC8703Fj3 {
    public C8730FjV A00;
    public final int A01;
    public final C1685AoO<LinearGradient> A02;
    public final C1685AoO<RadialGradient> A03;
    public final AbstractC8724FjP<C8746Fjl, C8746Fjl> A04;
    public final AbstractC8724FjP<PointF, PointF> A05;
    public final AbstractC8724FjP<PointF, PointF> A06;
    public final RectF A07;
    public final Integer A08;
    public final String A09;
    public final boolean A0A;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8705Fj6(C8659FiK c8659FiK, C8715FjG c8715FjG, AbstractC8671FiX abstractC8671FiX) {
        int iIntValue = c8715FjG.A07.intValue();
        Paint.Cap cap = iIntValue != 0 ? iIntValue != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iIntValue2 = c8715FjG.A09.intValue();
        super(cap, iIntValue2 != 2 ? iIntValue2 != 0 ? iIntValue2 != 1 ? null : Paint.Join.ROUND : Paint.Join.MITER : Paint.Join.BEVEL, c8659FiK, c8715FjG.A02, c8715FjG.A01, c8715FjG.A04, abstractC8671FiX, c8715FjG.A0B, c8715FjG.A00);
        this.A02 = new C1685AoO<>();
        this.A03 = new C1685AoO<>();
        this.A07 = AbstractC7607F5u.A0Y();
        this.A09 = c8715FjG.A0A;
        this.A08 = c8715FjG.A08;
        this.A0A = c8715FjG.A0C;
        this.A01 = (int) (c8659FiK.A0C.A00() / 32.0f);
        C8719FjK c8719FjK = new C8719FjK(c8715FjG.A03.A00);
        this.A04 = c8719FjK;
        c8719FjK.A09(this);
        abstractC8671FiX.A07(c8719FjK);
        C8716FjH c8716FjH = new C8716FjH(c8715FjG.A06.A00);
        this.A06 = c8716FjH;
        c8716FjH.A09(this);
        abstractC8671FiX.A07(c8716FjH);
        C8716FjH c8716FjH2 = new C8716FjH(c8715FjG.A05.A00);
        this.A05 = c8716FjH2;
        c8716FjH2.A09(this);
        abstractC8671FiX.A07(c8716FjH2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int[] A00(int[] iArr) {
        C8730FjV c8730FjV = this.A00;
        if (c8730FjV != null) {
            Integer[] numArr = (Integer[]) c8730FjV.A06();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length != length2) {
                iArr = new int[length2];
                while (i < length2) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                while (i < length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // X.AbstractC8703Fj3, X.InterfaceC8694Fiu
    public final void A9E(Canvas canvas, Matrix matrix, int i) {
        C1685AoO c1685AoO;
        long j;
        Shader radialGradient;
        if (this.A0A) {
            return;
        }
        AD3(matrix, this.A07, false);
        Integer num = this.A08;
        Integer num2 = C79.A00;
        AbstractC8724FjP<PointF, PointF> abstractC8724FjP = this.A06;
        float f = abstractC8724FjP.A02;
        float f2 = this.A01;
        int iA09 = AbstractC7607F5u.A09(f, f2);
        AbstractC8724FjP<PointF, PointF> abstractC8724FjP2 = this.A05;
        int iA092 = AbstractC7607F5u.A09(abstractC8724FjP2.A02, f2);
        AbstractC8724FjP<C8746Fjl, C8746Fjl> abstractC8724FjP3 = this.A04;
        int iA093 = AbstractC7607F5u.A09(abstractC8724FjP3.A02, f2);
        int i2 = iA09 != 0 ? 527 * iA09 : 17;
        if (iA092 != 0) {
            i2 = i2 * 31 * iA092;
        }
        if (iA093 != 0) {
            i2 = i2 * 31 * iA093;
        }
        if (num == num2) {
            c1685AoO = this.A02;
            j = i2;
            radialGradient = (Shader) c1685AoO.A04(j);
            if (radialGradient == null) {
                PointF pointFA06 = abstractC8724FjP.A06();
                PointF pointFA062 = abstractC8724FjP2.A06();
                C8746Fjl c8746FjlA06 = abstractC8724FjP3.A06();
                radialGradient = new LinearGradient(pointFA06.x, pointFA06.y, pointFA062.x, pointFA062.y, A00(c8746FjlA06.A01), c8746FjlA06.A00, Shader.TileMode.CLAMP);
                c1685AoO.A08(j, radialGradient);
            }
        } else {
            c1685AoO = this.A03;
            j = i2;
            radialGradient = (Shader) c1685AoO.A04(j);
            if (radialGradient == null) {
                PointF pointFA063 = abstractC8724FjP.A06();
                PointF pointFA064 = abstractC8724FjP2.A06();
                C8746Fjl c8746FjlA062 = abstractC8724FjP3.A06();
                int[] iArrA00 = A00(c8746FjlA062.A01);
                float[] fArr = c8746FjlA062.A00;
                radialGradient = new RadialGradient(pointFA063.x, pointFA063.y, (float) Math.hypot(pointFA064.x - r13, pointFA064.y - r14), iArrA00, fArr, Shader.TileMode.CLAMP);
                c1685AoO.A08(j, radialGradient);
            }
        }
        radialGradient.setLocalMatrix(matrix);
        super.A04.setShader(radialGradient);
        super.A9E(canvas, matrix, i);
    }

    @Override // X.InterfaceC8698Fiy
    public final String getName() {
        return this.A09;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;LX/Fii<TT;>;)V */
    @Override // X.AbstractC8703Fj3, X.InterfaceC8663FiO
    public final void A41(C8682Fii c8682Fii, Object obj) {
        super.A41(c8682Fii, obj);
        if (obj == InterfaceC8702Fj2.A0f) {
            C8730FjV c8730FjV = this.A00;
            if (c8730FjV != null) {
                this.A0G.A0M.remove(c8730FjV);
            }
            if (c8682Fii == null) {
                this.A00 = null;
                return;
            }
            C8730FjV c8730FjVA00 = C8730FjV.A00(c8682Fii);
            this.A00 = c8730FjVA00;
            c8730FjVA00.A09(this);
            this.A0G.A07(this.A00);
        }
    }
}
