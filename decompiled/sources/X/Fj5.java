package X;

import android.graphics.BlendMode;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* loaded from: classes6.dex */
public final class Fj5 implements InterfaceC8793FkY, InterfaceC8694Fiu, InterfaceC8792FkW {
    public float A00;
    public AbstractC8724FjP<Float, Float> A01;
    public AbstractC8724FjP<ColorFilter, ColorFilter> A02;
    public C8711FjC A03;
    public final Paint A04;
    public final Path A05;
    public final C8659FiK A06;
    public final AbstractC8724FjP<Integer, Integer> A07;
    public final AbstractC8724FjP<Integer, Integer> A08;
    public final AbstractC8671FiX A09;
    public final String A0A;
    public final List<InterfaceC8790FkU> A0B;
    public final boolean A0C;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC8698Fiy
    public final void AdB(List<InterfaceC8698Fiy> list, List<InterfaceC8698Fiy> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC8698Fiy interfaceC8698Fiy = list2.get(i);
            if (interfaceC8698Fiy instanceof InterfaceC8790FkU) {
                this.A0B.add(interfaceC8698Fiy);
            }
        }
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
        if (obj == InterfaceC8702Fj2.A0a) {
            abstractC8724FjP = this.A07;
        } else {
            if (obj != InterfaceC8702Fj2.A0c) {
                if (obj == InterfaceC8702Fj2.A01) {
                    AbstractC8724FjP<ColorFilter, ColorFilter> abstractC8724FjP3 = this.A02;
                    if (abstractC8724FjP3 != null) {
                        this.A09.A0M.remove(abstractC8724FjP3);
                    }
                    if (c8682Fii == null) {
                        this.A02 = null;
                        return;
                    }
                    C8730FjV c8730FjVA00 = C8730FjV.A00(c8682Fii);
                    this.A02 = c8730FjVA00;
                    c8730FjVA00.A09(this);
                    abstractC8671FiX = this.A09;
                    abstractC8724FjP2 = this.A02;
                } else if (obj == InterfaceC8702Fj2.A0B) {
                    abstractC8724FjP = this.A01;
                    if (abstractC8724FjP == null) {
                        C8730FjV c8730FjVA002 = C8730FjV.A00(c8682Fii);
                        this.A01 = c8730FjVA002;
                        c8730FjVA002.A09(this);
                        abstractC8671FiX = this.A09;
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
            abstractC8724FjP = this.A08;
        }
        abstractC8724FjP.A0A(c8682Fii);
    }

    @Override // X.InterfaceC8694Fiu
    public final void A9E(Canvas canvas, Matrix matrix, int i) {
        BlurMaskFilter blurMaskFilter;
        if (this.A0C) {
            return;
        }
        C8717FjI c8717FjI = (C8717FjI) this.A07;
        int iA00 = C8717FjI.A00(c8717FjI, c8717FjI.A06.AES(), c8717FjI.A04());
        Paint paint = this.A04;
        int i2 = 0;
        PointF pointF = AbstractC8699Fiz.A00;
        paint.setColor((BV5.A02(255, (int) ((((i / 255.0f) * AnonymousClass001.A0F(this.A08.A06())) / 100.0f) * 255.0f), 0) << 24) | (iA00 & 16777215));
        AbstractC7607F5u.A1I(paint, this.A02);
        AbstractC8724FjP<Float, Float> abstractC8724FjP = this.A01;
        if (abstractC8724FjP != null) {
            float fA02 = AbstractC8724FjP.A02(abstractC8724FjP);
            if (fA02 == 0.0f) {
                blurMaskFilter = null;
            } else {
                if (fA02 != this.A00) {
                    AbstractC8671FiX abstractC8671FiX = this.A09;
                    if (abstractC8671FiX.A00 == fA02) {
                        blurMaskFilter = abstractC8671FiX.A01;
                    } else {
                        blurMaskFilter = new BlurMaskFilter(fA02 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                        abstractC8671FiX.A01 = blurMaskFilter;
                        abstractC8671FiX.A00 = fA02;
                    }
                }
                this.A00 = fA02;
            }
            paint.setMaskFilter(blurMaskFilter);
            this.A00 = fA02;
        }
        C8711FjC c8711FjC = this.A03;
        if (c8711FjC != null) {
            c8711FjC.A00(paint);
        }
        Path path = this.A05;
        path.reset();
        while (true) {
            List<InterfaceC8790FkU> list = this.A0B;
            if (i2 >= list.size()) {
                canvas.drawPath(path, paint);
                return;
            } else {
                InterfaceC8790FkU.A00(matrix, path, list, i2);
                i2++;
            }
        }
    }

    @Override // X.InterfaceC8694Fiu
    public final void AD3(Matrix matrix, RectF rectF, boolean z) {
        Path path = this.A05;
        path.reset();
        int i = 0;
        while (true) {
            List<InterfaceC8790FkU> list = this.A0B;
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
        this.A06.invalidateSelf();
    }

    @Override // X.InterfaceC8698Fiy
    public final String getName() {
        return this.A0A;
    }

    public Fj5(C8659FiK c8659FiK, C8734FjZ c8734FjZ, AbstractC8671FiX abstractC8671FiX) {
        Integer num;
        BlendMode blendMode;
        Path pathA0V = AbstractC7607F5u.A0V();
        this.A05 = pathA0V;
        HrG hrG = new HrG(1);
        this.A04 = hrG;
        this.A0B = C3cG.A0h();
        this.A09 = abstractC8671FiX;
        this.A0A = c8734FjZ.A03;
        this.A0C = c8734FjZ.A04;
        this.A06 = c8659FiK;
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
        C8764Fk3 c8764Fk3 = c8734FjZ.A01;
        if (c8764Fk3 == null) {
            this.A07 = null;
            this.A08 = null;
            return;
        }
        C8766Fk5 c8766Fk5 = c8734FjZ.A02;
        int iIntValue = abstractC8671FiX.A0L.A0G.intValue();
        if (iIntValue == 2) {
            num = C79.A06;
        } else if (iIntValue == 3) {
            num = C79.A07;
        } else if (iIntValue == 4) {
            num = C79.A08;
        } else {
            if (iIntValue != 5) {
                if (iIntValue == 16) {
                    num = C79.A04;
                }
                blendMode = null;
                hrG.setBlendMode(blendMode);
                pathA0V.setFillType(c8734FjZ.A00);
                C8717FjI c8717FjI = new C8717FjI(c8764Fk3.A00);
                this.A07 = c8717FjI;
                c8717FjI.A09(this);
                abstractC8671FiX.A07(c8717FjI);
                C8722FjN c8722FjN = new C8722FjN(c8766Fk5.A00);
                this.A08 = c8722FjN;
                c8722FjN.A09(this);
                abstractC8671FiX.A07(c8722FjN);
            }
            num = C79.A09;
        }
        switch (num.intValue()) {
            case 0:
                blendMode = BlendMode.CLEAR;
                break;
            case 1:
                blendMode = BlendMode.SRC;
                break;
            case 2:
                blendMode = BlendMode.DST;
                break;
            case 3:
                blendMode = BlendMode.SRC_OVER;
                break;
            case 4:
                blendMode = BlendMode.DST_OVER;
                break;
            case 5:
                blendMode = BlendMode.SRC_IN;
                break;
            case 6:
                blendMode = BlendMode.DST_IN;
                break;
            case 7:
                blendMode = BlendMode.SRC_OUT;
                break;
            case 8:
                blendMode = BlendMode.DST_OUT;
                break;
            case 9:
                blendMode = BlendMode.SRC_ATOP;
                break;
            case 10:
                blendMode = BlendMode.DST_ATOP;
                break;
            case 11:
                blendMode = BlendMode.XOR;
                break;
            case 12:
                blendMode = BlendMode.PLUS;
                break;
            case 13:
                blendMode = BlendMode.MODULATE;
                break;
            case 14:
                blendMode = BlendMode.SCREEN;
                break;
            case 15:
                blendMode = BlendMode.OVERLAY;
                break;
            case 16:
                blendMode = BlendMode.DARKEN;
                break;
            case 17:
                blendMode = BlendMode.LIGHTEN;
                break;
            case 18:
                blendMode = BlendMode.COLOR_DODGE;
                break;
            case 19:
                blendMode = BlendMode.COLOR_BURN;
                break;
            case 20:
                blendMode = BlendMode.HARD_LIGHT;
                break;
            case 21:
                blendMode = BlendMode.SOFT_LIGHT;
                break;
            case 22:
                blendMode = BlendMode.DIFFERENCE;
                break;
            case 23:
                blendMode = BlendMode.EXCLUSION;
                break;
            case 24:
                blendMode = BlendMode.MULTIPLY;
                break;
            case 25:
                blendMode = BlendMode.HUE;
                break;
            case 26:
                blendMode = BlendMode.SATURATION;
                break;
            case 27:
                blendMode = BlendMode.COLOR;
                break;
            case 28:
                blendMode = BlendMode.LUMINOSITY;
                break;
            default:
                blendMode = null;
                break;
        }
        hrG.setBlendMode(blendMode);
        pathA0V.setFillType(c8734FjZ.A00);
        C8717FjI c8717FjI2 = new C8717FjI(c8764Fk3.A00);
        this.A07 = c8717FjI2;
        c8717FjI2.A09(this);
        abstractC8671FiX.A07(c8717FjI2);
        C8722FjN c8722FjN2 = new C8722FjN(c8766Fk5.A00);
        this.A08 = c8722FjN2;
        c8722FjN2.A09(this);
        abstractC8671FiX.A07(c8722FjN2);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FiV;ILjava/util/List<LX/FiV;>;LX/FiV;)V */
    @Override // X.InterfaceC8663FiO
    public final void AbZ(C8669FiV c8669FiV, C8669FiV c8669FiV2, List list, int i) {
        AbstractC8699Fiz.A02(this, c8669FiV, c8669FiV2, list, i);
    }
}
