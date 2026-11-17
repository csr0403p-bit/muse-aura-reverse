package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.List;

/* renamed from: X.Fj4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8704Fj4 implements InterfaceC8793FkY, InterfaceC8694Fiu, InterfaceC8792FkW {
    public float A00;
    public AbstractC8724FjP<Float, Float> A01;
    public AbstractC8724FjP<ColorFilter, ColorFilter> A02;
    public C8711FjC A03;
    public C8730FjV A04;
    public final int A05;
    public final C1685AoO<LinearGradient> A06 = new C1685AoO<>();
    public final C1685AoO<RadialGradient> A07 = new C1685AoO<>();
    public final AbstractC8724FjP<C8746Fjl, C8746Fjl> A08;
    public final AbstractC8724FjP<PointF, PointF> A09;
    public final AbstractC8724FjP<PointF, PointF> A0A;
    public final Paint A0B;
    public final Path A0C;
    public final RectF A0D;
    public final C8659FiK A0E;
    public final AbstractC8724FjP<Integer, Integer> A0F;
    public final AbstractC8671FiX A0G;
    public final Integer A0H;
    public final String A0I;
    public final List<InterfaceC8790FkU> A0J;
    public final boolean A0K;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC8698Fiy
    public final void AdB(List<InterfaceC8698Fiy> list, List<InterfaceC8698Fiy> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC8698Fiy interfaceC8698Fiy = list2.get(i);
            if (interfaceC8698Fiy instanceof InterfaceC8790FkU) {
                this.A0J.add(interfaceC8698Fiy);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int[] A00(int[] iArr) {
        C8730FjV c8730FjV = this.A04;
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

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;LX/Fii<TT;>;)V */
    @Override // X.InterfaceC8663FiO
    public final void A41(C8682Fii c8682Fii, Object obj) {
        C8711FjC c8711FjC;
        AbstractC8724FjP abstractC8724FjP;
        C8711FjC c8711FjC2;
        C8711FjC c8711FjC3;
        C8711FjC c8711FjC4;
        C8711FjC c8711FjC5;
        AbstractC8671FiX abstractC8671FiX;
        AbstractC8724FjP<?, ?> abstractC8724FjP2;
        if (obj != InterfaceC8702Fj2.A0c) {
            if (obj == InterfaceC8702Fj2.A01) {
                AbstractC8724FjP<ColorFilter, ColorFilter> abstractC8724FjP3 = this.A02;
                if (abstractC8724FjP3 != null) {
                    this.A0G.A0M.remove(abstractC8724FjP3);
                }
                if (c8682Fii == null) {
                    this.A02 = null;
                    return;
                }
                C8730FjV c8730FjV = new C8730FjV(c8682Fii, null);
                this.A02 = c8730FjV;
                c8730FjV.A09(this);
                abstractC8671FiX = this.A0G;
                abstractC8724FjP2 = this.A02;
            } else if (obj == InterfaceC8702Fj2.A0f) {
                C8730FjV c8730FjV2 = this.A04;
                if (c8730FjV2 != null) {
                    this.A0G.A0M.remove(c8730FjV2);
                }
                if (c8682Fii == null) {
                    this.A04 = null;
                    return;
                }
                this.A06.A05();
                this.A07.A05();
                C8730FjV c8730FjV3 = new C8730FjV(c8682Fii, null);
                this.A04 = c8730FjV3;
                c8730FjV3.A09(this);
                abstractC8671FiX = this.A0G;
                abstractC8724FjP2 = this.A04;
            } else if (obj == InterfaceC8702Fj2.A0B) {
                abstractC8724FjP = this.A01;
                if (abstractC8724FjP == null) {
                    C8730FjV c8730FjV4 = new C8730FjV(c8682Fii, null);
                    this.A01 = c8730FjV4;
                    c8730FjV4.A09(this);
                    abstractC8671FiX = this.A0G;
                    abstractC8724FjP2 = this.A01;
                }
            } else if (obj == InterfaceC8702Fj2.A0b && (c8711FjC5 = this.A03) != null) {
                abstractC8724FjP = c8711FjC5.A01;
            } else {
                if (obj == InterfaceC8702Fj2.A0F && (c8711FjC4 = this.A03) != null) {
                    c8711FjC4.A04.A0A(c8682Fii == null ? null : new C8687Fin(c8711FjC4, c8682Fii));
                    return;
                }
                if (obj == InterfaceC8702Fj2.A0D && (c8711FjC3 = this.A03) != null) {
                    abstractC8724FjP = c8711FjC3.A02;
                } else if (obj == InterfaceC8702Fj2.A0E && (c8711FjC2 = this.A03) != null) {
                    abstractC8724FjP = c8711FjC2.A03;
                } else if (obj != InterfaceC8702Fj2.A0G || (c8711FjC = this.A03) == null) {
                    return;
                } else {
                    abstractC8724FjP = c8711FjC.A05;
                }
            }
            abstractC8671FiX.A07(abstractC8724FjP2);
            return;
        }
        abstractC8724FjP = this.A0F;
        abstractC8724FjP.A0A(c8682Fii);
    }

    @Override // X.InterfaceC8694Fiu
    public final void A9E(Canvas canvas, Matrix matrix, int i) {
        C1685AoO c1685AoO;
        long j;
        Shader radialGradient;
        BlurMaskFilter blurMaskFilter;
        if (this.A0K) {
            return;
        }
        Path path = this.A0C;
        path.reset();
        int i2 = 0;
        while (true) {
            List<InterfaceC8790FkU> list = this.A0J;
            if (i2 >= list.size()) {
                break;
            }
            path.addPath(list.get(i2).AId(), matrix);
            i2++;
        }
        path.computeBounds(this.A0D, false);
        Integer num = this.A0H;
        Integer num2 = C79.A00;
        AbstractC8724FjP<PointF, PointF> abstractC8724FjP = this.A0A;
        float f = abstractC8724FjP.A02;
        float f2 = this.A05;
        int iA09 = AbstractC7607F5u.A09(f, f2);
        AbstractC8724FjP<PointF, PointF> abstractC8724FjP2 = this.A09;
        int iA092 = AbstractC7607F5u.A09(abstractC8724FjP2.A02, f2);
        AbstractC8724FjP<C8746Fjl, C8746Fjl> abstractC8724FjP3 = this.A08;
        int iA093 = AbstractC7607F5u.A09(abstractC8724FjP3.A02, f2);
        int i3 = iA09 != 0 ? 527 * iA09 : 17;
        if (iA092 != 0) {
            i3 = i3 * 31 * iA092;
        }
        if (iA093 != 0) {
            i3 = i3 * 31 * iA093;
        }
        if (num == num2) {
            c1685AoO = this.A06;
            j = i3;
            radialGradient = (Shader) c1685AoO.A04(j);
            if (radialGradient == null) {
                PointF pointFA06 = abstractC8724FjP.A06();
                PointF pointFA062 = abstractC8724FjP2.A06();
                C8746Fjl c8746FjlA06 = abstractC8724FjP3.A06();
                radialGradient = new LinearGradient(pointFA06.x, pointFA06.y, pointFA062.x, pointFA062.y, A00(c8746FjlA06.A01), c8746FjlA06.A00, Shader.TileMode.CLAMP);
                c1685AoO.A08(j, radialGradient);
            }
        } else {
            c1685AoO = this.A07;
            j = i3;
            radialGradient = (Shader) c1685AoO.A04(j);
            if (radialGradient == null) {
                PointF pointFA063 = abstractC8724FjP.A06();
                PointF pointFA064 = abstractC8724FjP2.A06();
                C8746Fjl c8746FjlA062 = abstractC8724FjP3.A06();
                int[] iArrA00 = A00(c8746FjlA062.A01);
                float[] fArr = c8746FjlA062.A00;
                float f3 = pointFA063.x;
                float f4 = pointFA063.y;
                float fHypot = (float) Math.hypot(pointFA064.x - f3, pointFA064.y - f4);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                radialGradient = new RadialGradient(f3, f4, fHypot, iArrA00, fArr, Shader.TileMode.CLAMP);
                c1685AoO.A08(j, radialGradient);
            }
        }
        radialGradient.setLocalMatrix(matrix);
        Paint paint = this.A0B;
        paint.setShader(radialGradient);
        AbstractC7607F5u.A1I(paint, this.A02);
        AbstractC8724FjP<Float, Float> abstractC8724FjP4 = this.A01;
        if (abstractC8724FjP4 != null) {
            float fA02 = AbstractC8724FjP.A02(abstractC8724FjP4);
            if (fA02 != 0.0f) {
                blurMaskFilter = fA02 != this.A00 ? new BlurMaskFilter(fA02, BlurMaskFilter.Blur.NORMAL) : null;
                this.A00 = fA02;
            }
            paint.setMaskFilter(blurMaskFilter);
            this.A00 = fA02;
        }
        C8711FjC c8711FjC = this.A03;
        if (c8711FjC != null) {
            c8711FjC.A00(paint);
        }
        PointF pointF = AbstractC8699Fiz.A00;
        paint.setAlpha(BV5.A02(255, (int) ((((i / 255.0f) * AnonymousClass001.A0F(this.A0F.A06())) / 100.0f) * 255.0f), 0));
        canvas.drawPath(path, paint);
    }

    @Override // X.InterfaceC8694Fiu
    public final void AD3(Matrix matrix, RectF rectF, boolean z) {
        Path path = this.A0C;
        path.reset();
        int i = 0;
        while (true) {
            List<InterfaceC8790FkU> list = this.A0J;
            if (i >= list.size()) {
                path.computeBounds(rectF, false);
                AbstractC7611F5y.A0f(rectF, rectF.left, 1.0f);
                return;
            } else {
                InterfaceC8790FkU.A00(matrix, path, list, i);
                i++;
            }
        }
    }

    @Override // X.InterfaceC8793FkY
    public final void AX2() {
        this.A0E.invalidateSelf();
    }

    @Override // X.InterfaceC8698Fiy
    public final String getName() {
        return this.A0I;
    }

    public C8704Fj4(C6837Eap c6837Eap, C8659FiK c8659FiK, C8738Fjd c8738Fjd, AbstractC8671FiX abstractC8671FiX) {
        Path pathA0V = AbstractC7607F5u.A0V();
        this.A0C = pathA0V;
        this.A0B = new HrG(1);
        this.A0D = AbstractC7607F5u.A0Y();
        this.A0J = C3cG.A0h();
        this.A00 = 0.0f;
        this.A0G = abstractC8671FiX;
        this.A0I = c8738Fjd.A06;
        this.A0K = c8738Fjd.A07;
        this.A0E = c8659FiK;
        this.A0H = c8738Fjd.A05;
        pathA0V.setFillType(c8738Fjd.A00);
        this.A05 = (int) (c6837Eap.A00() / 32.0f);
        C8719FjK c8719FjK = new C8719FjK(c8738Fjd.A01.A00);
        this.A08 = c8719FjK;
        c8719FjK.A09(this);
        abstractC8671FiX.A07(c8719FjK);
        C8722FjN c8722FjN = new C8722FjN(c8738Fjd.A02.A00);
        this.A0F = c8722FjN;
        c8722FjN.A09(this);
        abstractC8671FiX.A07(c8722FjN);
        C8716FjH c8716FjH = new C8716FjH(c8738Fjd.A04.A00);
        this.A0A = c8716FjH;
        c8716FjH.A09(this);
        abstractC8671FiX.A07(c8716FjH);
        C8716FjH c8716FjH2 = new C8716FjH(c8738Fjd.A03.A00);
        this.A09 = c8716FjH2;
        c8716FjH2.A09(this);
        abstractC8671FiX.A07(c8716FjH2);
        C8791FkV c8791FkVA04 = abstractC8671FiX.A04();
        if (c8791FkVA04 != null) {
            C8720FjL c8720FjLA01 = C8720FjL.A01(c8791FkVA04.A00);
            this.A01 = c8720FjLA01;
            c8720FjLA01.A09(this);
            abstractC8671FiX.A07(this.A01);
        }
        C8778FkI c8778FkIA05 = abstractC8671FiX.A05();
        if (c8778FkIA05 != null) {
            this.A03 = new C8711FjC(this, abstractC8671FiX, c8778FkIA05);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FiV;ILjava/util/List<LX/FiV;>;LX/FiV;)V */
    @Override // X.InterfaceC8663FiO
    public final void AbZ(C8669FiV c8669FiV, C8669FiV c8669FiV2, List list, int i) {
        AbstractC8699Fiz.A02(this, c8669FiV, c8669FiV2, list, i);
    }
}
