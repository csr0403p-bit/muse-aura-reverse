package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.List;
import java.util.Map;

/* renamed from: X.FiY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8672FiY extends AbstractC8671FiX {
    public AbstractC8724FjP<Integer, Integer> A00;
    public AbstractC8724FjP<Integer, Integer> A01;
    public AbstractC8724FjP<Integer, Integer> A02;
    public AbstractC8724FjP<Integer, Integer> A03;
    public AbstractC8724FjP<Float, Float> A04;
    public AbstractC8724FjP<Float, Float> A05;
    public AbstractC8724FjP<Float, Float> A06;
    public AbstractC8724FjP<Float, Float> A07;
    public AbstractC8724FjP<Float, Float> A08;
    public AbstractC8724FjP<Typeface, Typeface> A09;
    public final Matrix A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final RectF A0D;
    public final C1685AoO<String> A0E;
    public final C6837Eap A0F;
    public final C8659FiK A0G;
    public final StringBuilder A0H;
    public final List<C8697Fix> A0I;
    public final Map<HpK, List<C8673FiZ>> A0J;
    public final C8744Fjj A0K;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;FLX/HgT;FFZ)Ljava/util/List<LX/Fix;>; */
    private List A00(HgT hgT, String str, float f, float f2, float f3, boolean z) {
        float fMeasureText;
        float f4 = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        float f5 = 0.0f;
        int i3 = 0;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                HpK hpK = (HpK) AbstractC1674AoB.A00(this.A0F.A07, AnonymousClass001.A0H(hgT.A03, AnonymousClass005.A0I(hgT.A01, cCharAt * 31)));
                if (hpK != null) {
                    fMeasureText = ((float) hpK.A00) * f2 * AbstractC8712FjD.A00();
                }
            } else {
                fMeasureText = this.A0B.measureText(str.substring(i4, i4 + 1));
            }
            float f7 = fMeasureText + f3;
            if (cCharAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                i3 = i4;
                f5 = f7;
                z2 = false;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                List<C8697Fix> list = this.A0I;
                for (int size = list.size(); size < i; size++) {
                    list.add(new C8697Fix());
                }
                C8697Fix c8697Fix = list.get(i - 1);
                if (i3 == i2) {
                    c8697Fix.A01 = str.substring(i2, i4).trim();
                    c8697Fix.A00 = (f4 - f7) - ((r2.length() - r0.length()) * f6);
                    i2 = i4;
                    i3 = i4;
                    f4 = f7;
                    f5 = f7;
                } else {
                    c8697Fix.A01 = str.substring(i2, i3 - 1).trim();
                    c8697Fix.A00 = ((f4 - f5) - ((r0.length() - r2.length()) * f6)) - f6;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            List<C8697Fix> list2 = this.A0I;
            for (int size2 = list2.size(); size2 < i; size2++) {
                list2.add(new C8697Fix());
            }
            C8697Fix c8697Fix2 = list2.get(i - 1);
            c8697Fix2.A01 = str.substring(i2);
            c8697Fix2.A00 = f4;
        }
        return this.A0I.subList(0, i);
    }

    private void A03(Canvas canvas, C8681Fih c8681Fih, float f, int i) {
        float f2;
        PointF pointF = c8681Fih.A07;
        PointF pointF2 = c8681Fih.A08;
        float fA00 = AbstractC8712FjD.A00();
        float f3 = (i * c8681Fih.A01 * fA00) + (pointF == null ? 0.0f : (c8681Fih.A01 * fA00) + pointF.y);
        float f4 = pointF == null ? 0.0f : pointF.x;
        float f5 = pointF2 != null ? pointF2.x : 0.0f;
        int iIntValue = c8681Fih.A09.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1) {
                f2 = f4 + f5;
            } else {
                if (iIntValue != 2) {
                    return;
                }
                f2 = f4 + (f5 / 2.0f);
                f /= 2.0f;
            }
            f4 = f2 - f;
        }
        canvas.translate(f4, f3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cf A[PHI: r0
  0x01cf: PHI (r0v21 X.FjP<java.lang.Float, java.lang.Float>) = (r0v20 X.FjP<java.lang.Float, java.lang.Float>), (r0v135 X.FjP<java.lang.Float, java.lang.Float>) binds: [B:16:0x005f, B:18:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ff A[PHI: r14
  0x01ff: PHI (r14v14 android.graphics.Typeface) = (r14v10 android.graphics.Typeface), (r14v23 android.graphics.Typeface) binds: [B:142:0x038e, B:79:0x01fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, java.util.Map<java.lang.String, android.graphics.Typeface>] */
    @Override // X.AbstractC8671FiX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(android.graphics.Canvas r27, android.graphics.Matrix r28, int r29) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8672FiY.A0A(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public C8672FiY(C8659FiK c8659FiK, C8675Fib c8675Fib) {
        super(c8659FiK, c8675Fib);
        this.A0H = BV4.A0p(2);
        this.A0D = AbstractC7607F5u.A0Y();
        this.A0A = BV4.A08();
        this.A0B = new C8691Fir(this);
        this.A0C = new C8692Fis(this);
        this.A0J = BV4.A0u();
        this.A0E = new C1685AoO<>();
        this.A0I = C3cG.A0h();
        this.A0G = c8659FiK;
        this.A0F = c8675Fib.A09;
        C8744Fjj c8744Fjj = new C8744Fjj(c8675Fib.A0B.A00);
        this.A0K = c8744Fjj;
        c8744Fjj.A09(this);
        A07(c8744Fjj);
        C8695Fiv c8695Fiv = c8675Fib.A0C;
        if (c8695Fiv != null) {
            C8764Fk3 c8764Fk3 = c8695Fiv.A00;
            if (c8764Fk3 != null) {
                C8717FjI c8717FjI = new C8717FjI(c8764Fk3.A00);
                this.A00 = c8717FjI;
                c8717FjI.A09(this);
                A07(this.A00);
            }
            C8764Fk3 c8764Fk32 = c8695Fiv.A01;
            if (c8764Fk32 != null) {
                C8717FjI c8717FjI2 = new C8717FjI(c8764Fk32.A00);
                this.A02 = c8717FjI2;
                c8717FjI2.A09(this);
                A07(this.A02);
            }
            C8689Fip c8689Fip = c8695Fiv.A02;
            if (c8689Fip != null) {
                C8720FjL c8720FjLA01 = C8720FjL.A01(c8689Fip);
                this.A04 = c8720FjLA01;
                c8720FjLA01.A09(this);
                A07(this.A04);
            }
            C8689Fip c8689Fip2 = c8695Fiv.A03;
            if (c8689Fip2 != null) {
                C8720FjL c8720FjLA012 = C8720FjL.A01(c8689Fip2);
                this.A07 = c8720FjLA012;
                c8720FjLA012.A09(this);
                A07(this.A07);
            }
        }
    }

    public static void A01(Canvas canvas, Paint paint, Path path) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawPath(path, paint);
        }
    }

    public static void A02(Canvas canvas, Paint paint, String str) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;LX/Fii<TT;>;)V */
    @Override // X.AbstractC8671FiX, X.InterfaceC8663FiO
    public final void A41(C8682Fii c8682Fii, Object obj) {
        AbstractC8724FjP<?, ?> abstractC8724FjP;
        super.A41(c8682Fii, obj);
        if (obj == InterfaceC8702Fj2.A0a) {
            AbstractC8724FjP<Integer, Integer> abstractC8724FjP2 = this.A01;
            if (abstractC8724FjP2 != null) {
                this.A0M.remove(abstractC8724FjP2);
            }
            if (c8682Fii == null) {
                this.A01 = null;
                return;
            }
            C8730FjV c8730FjV = new C8730FjV(c8682Fii, null);
            this.A01 = c8730FjV;
            c8730FjV.A09(this);
            abstractC8724FjP = this.A01;
        } else if (obj == InterfaceC8702Fj2.A0d) {
            AbstractC8724FjP<Integer, Integer> abstractC8724FjP3 = this.A03;
            if (abstractC8724FjP3 != null) {
                this.A0M.remove(abstractC8724FjP3);
            }
            if (c8682Fii == null) {
                this.A03 = null;
                return;
            }
            C8730FjV c8730FjV2 = new C8730FjV(c8682Fii, null);
            this.A03 = c8730FjV2;
            c8730FjV2.A09(this);
            abstractC8724FjP = this.A03;
        } else if (obj == InterfaceC8702Fj2.A0P) {
            AbstractC8724FjP<Float, Float> abstractC8724FjP4 = this.A05;
            if (abstractC8724FjP4 != null) {
                this.A0M.remove(abstractC8724FjP4);
            }
            if (c8682Fii == null) {
                this.A05 = null;
                return;
            }
            C8730FjV c8730FjV3 = new C8730FjV(c8682Fii, null);
            this.A05 = c8730FjV3;
            c8730FjV3.A09(this);
            abstractC8724FjP = this.A05;
        } else if (obj == InterfaceC8702Fj2.A0R) {
            AbstractC8724FjP<Float, Float> abstractC8724FjP5 = this.A08;
            if (abstractC8724FjP5 != null) {
                this.A0M.remove(abstractC8724FjP5);
            }
            if (c8682Fii == null) {
                this.A08 = null;
                return;
            }
            C8730FjV c8730FjV4 = new C8730FjV(c8682Fii, null);
            this.A08 = c8730FjV4;
            c8730FjV4.A09(this);
            abstractC8724FjP = this.A08;
        } else if (obj == InterfaceC8702Fj2.A0Q) {
            AbstractC8724FjP<Float, Float> abstractC8724FjP6 = this.A06;
            if (abstractC8724FjP6 != null) {
                this.A0M.remove(abstractC8724FjP6);
            }
            if (c8682Fii == null) {
                this.A06 = null;
                return;
            }
            C8730FjV c8730FjV5 = new C8730FjV(c8682Fii, null);
            this.A06 = c8730FjV5;
            c8730FjV5.A09(this);
            abstractC8724FjP = this.A06;
        } else {
            if (obj != InterfaceC8702Fj2.A08) {
                if (obj == "dynamic_text") {
                    C8744Fjj c8744Fjj = this.A0K;
                    c8744Fjj.A0A(new C8678Fie(c8744Fjj, new C8681Fih(), new C8686Fim(), c8682Fii));
                    return;
                }
                return;
            }
            AbstractC8724FjP<Typeface, Typeface> abstractC8724FjP7 = this.A09;
            if (abstractC8724FjP7 != null) {
                this.A0M.remove(abstractC8724FjP7);
            }
            if (c8682Fii == null) {
                this.A09 = null;
                return;
            }
            C8730FjV c8730FjV6 = new C8730FjV(c8682Fii, null);
            this.A09 = c8730FjV6;
            c8730FjV6.A09(this);
            abstractC8724FjP = this.A09;
        }
        A07(abstractC8724FjP);
    }

    @Override // X.AbstractC8671FiX, X.InterfaceC8694Fiu
    public final void AD3(Matrix matrix, RectF rectF, boolean z) {
        super.AD3(matrix, rectF, z);
        C6837Eap c6837Eap = this.A0F;
        rectF.set(0.0f, 0.0f, c6837Eap.A05.width(), c6837Eap.A05.height());
    }
}
