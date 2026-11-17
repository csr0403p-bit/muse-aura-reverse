package X;

import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.Log;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* loaded from: classes6.dex */
public final class HB9 {
    public static HashSet<String> A07;
    public float A00;
    public Canvas A01;
    public HBA A02;
    public HBE A03;
    public Stack<Matrix> A04;
    public Stack<HB7> A05;
    public Stack<HBE> A06;

    private HBQ A0A(HBD hbd, HBD hbd2, HBD hbd3, HBD hbd4) {
        float fA02 = hbd != null ? hbd.A02(this) : 0.0f;
        float fA03 = hbd2 != null ? hbd2.A03(this) : 0.0f;
        HBE hbe = this.A03;
        HBQ hbq = hbe.A02;
        if (hbq == null) {
            hbq = hbe.A03;
        }
        return new HBQ(fA02, fA03, hbd3 != null ? hbd3.A02(this) : hbq.A03, hbd4 != null ? hbd4.A03(this) : hbq.A00);
    }

    private void A0E(float f, float f2, float f3, float f4) {
        float fA02 = f3 + f;
        float fA03 = f4 + f2;
        HC3 hc3 = this.A03.A04.A01;
        if (hc3 != null) {
            f += hc3.A01.A02(this);
            f2 += this.A03.A04.A01.A03.A03(this);
            fA02 -= this.A03.A04.A01.A02.A02(this);
            fA03 -= this.A03.A04.A01.A00.A03(this);
        }
        this.A01.clipRect(f, f2, fA02, fA03);
    }

    private void A0K(HBQ hbq, HBW hbw, AbstractC10356HBv abstractC10356HBv) {
        float fA02;
        float fA03;
        Boolean bool = hbw.A05;
        if (bool == null || !bool.booleanValue()) {
            HBD hbd = hbw.A01;
            float fA04 = hbd != null ? hbd.A04(this, 1.0f) : 1.2f;
            HBD hbd2 = hbw.A00;
            float fA042 = hbd2 != null ? hbd2.A04(this, 1.0f) : 1.2f;
            fA02 = fA04 * hbq.A03;
            fA03 = fA042 * hbq.A00;
        } else {
            HBD hbd3 = hbw.A01;
            fA02 = hbd3 != null ? hbd3.A02(this) : hbq.A03;
            HBD hbd4 = hbw.A00;
            fA03 = hbd4 != null ? hbd4.A03(this) : hbq.A00;
        }
        if (fA02 == 0.0f || fA03 == 0.0f) {
            return;
        }
        A0i(this);
        HBE hbe = new HBE(this);
        A0U(HBB.A00(), hbe, this);
        A0b(hbw, hbe);
        this.A03 = hbe;
        hbe.A04.A0F = Float.valueOf(1.0f);
        boolean zA0k = A0k();
        Canvas canvas = this.A01;
        canvas.save();
        Boolean bool2 = hbw.A04;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(hbq.A01, hbq.A02);
            canvas.scale(hbq.A03, hbq.A00);
        }
        A0V(hbw, false);
        canvas.restore();
        if (zA0k) {
            A0N(hbq, abstractC10356HBv);
        }
        A0h(this);
    }

    public static int A00(int i, float f) {
        int i2 = 255;
        int iA09 = AbstractC7607F5u.A09((i >> 24) & 255, f);
        if (iA09 < 0) {
            i2 = 0;
        } else if (iA09 <= 255) {
            i2 = iA09;
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static Matrix A02(HBQ hbq, boolean z) {
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(hbq.A01, hbq.A02);
            matrix.preScale(hbq.A03, hbq.A00);
        }
        return matrix;
    }

    private Path A03(HBQ hbq, AbstractC10356HBv abstractC10356HBv) {
        Path pathA08;
        HB4 hb4A04 = ((HB3) abstractC10356HBv).A01.A04(this.A03.A04.A0W);
        if (hb4A04 == null) {
            A0j("ClipPath reference '%s' not found", this.A03.A04.A0W);
            return null;
        }
        C10350HBo c10350HBo = (C10350HBo) hb4A04;
        this.A06.push(this.A03);
        A0c(c10350HBo, this);
        Boolean bool = c10350HBo.A00;
        Matrix matrixA02 = A02(hbq, bool == null || bool.booleanValue());
        Matrix matrix = ((C10349HBn) c10350HBo).A00;
        if (matrix != null) {
            matrixA02.preConcat(matrix);
        }
        Path pathA0V = AbstractC7607F5u.A0V();
        for (HB3 hb3 : ((HBP) c10350HBo).A01) {
            if ((hb3 instanceof AbstractC10356HBv) && (pathA08 = A08((AbstractC10356HBv) hb3, true)) != null) {
                pathA0V.op(pathA08, Path.Op.UNION);
            }
        }
        if (this.A03.A04.A0W != null) {
            HBQ hbqA09 = ((AbstractC10356HBv) c10350HBo).A00;
            if (hbqA09 == null) {
                hbqA09 = A09(pathA0V);
                ((AbstractC10356HBv) c10350HBo).A00 = hbqA09;
            }
            Path pathA03 = A03(hbqA09, c10350HBo);
            if (pathA03 != null) {
                pathA0V.op(pathA03, Path.Op.INTERSECT);
            }
        }
        pathA0V.transform(matrixA02);
        this.A03 = this.A06.pop();
        return pathA0V;
    }

    private Path A04(C10347HBl c10347HBl) {
        HBD hbd = c10347HBl.A00;
        float fA02 = hbd != null ? hbd.A02(this) : 0.0f;
        HBD hbd2 = c10347HBl.A01;
        float fA03 = hbd2 != null ? hbd2.A03(this) : 0.0f;
        float fA01 = c10347HBl.A02.A01(this);
        float f = fA02 - fA01;
        float f2 = fA03 - fA01;
        float f3 = fA02 + fA01;
        float f4 = fA03 + fA01;
        if (((AbstractC10356HBv) c10347HBl).A00 == null) {
            float f5 = 2.0f * fA01;
            ((AbstractC10356HBv) c10347HBl).A00 = new HBQ(f, f2, f5, f5);
        }
        float f6 = fA01 * 0.5522848f;
        Path pathA0V = AbstractC7607F5u.A0V();
        pathA0V.moveTo(fA02, f2);
        float f7 = fA02 + f6;
        float f8 = fA03 - f6;
        pathA0V.cubicTo(f7, f2, f3, f8, f3, fA03);
        float f9 = fA03 + f6;
        pathA0V.cubicTo(f3, f9, f7, f4, fA02, f4);
        float f10 = fA02 - f6;
        pathA0V.cubicTo(f10, f4, f, f9, f, fA03);
        pathA0V.cubicTo(f, f8, f10, f2, fA02, f2);
        pathA0V.close();
        return pathA0V;
    }

    private Path A05(C10341HBf c10341HBf) {
        HBD hbd = c10341HBf.A00;
        float fA02 = hbd != null ? hbd.A02(this) : 0.0f;
        HBD hbd2 = c10341HBf.A01;
        float fA03 = hbd2 != null ? hbd2.A03(this) : 0.0f;
        float fA022 = c10341HBf.A02.A02(this);
        float fA032 = c10341HBf.A03.A03(this);
        float f = fA02 - fA022;
        float f2 = fA03 - fA032;
        float f3 = fA02 + fA022;
        float f4 = fA03 + fA032;
        if (((AbstractC10356HBv) c10341HBf).A00 == null) {
            ((AbstractC10356HBv) c10341HBf).A00 = new HBQ(f, f2, fA022 * 2.0f, 2.0f * fA032);
        }
        float f5 = fA022 * 0.5522848f;
        float f6 = fA032 * 0.5522848f;
        Path pathA0V = AbstractC7607F5u.A0V();
        pathA0V.moveTo(fA02, f2);
        float f7 = fA02 + f5;
        float f8 = fA03 - f6;
        pathA0V.cubicTo(f7, f2, f3, f8, f3, fA03);
        float f9 = fA03 + f6;
        pathA0V.cubicTo(f3, f9, f7, f4, fA02, f4);
        float f10 = fA02 - f5;
        pathA0V.cubicTo(f10, f4, f, f9, f, fA03);
        pathA0V.cubicTo(f, f8, f10, f2, fA02, f2);
        pathA0V.close();
        return pathA0V;
    }

    private Path A07(C10338HBc c10338HBc) {
        float fA02;
        float fA03;
        HBD hbd = c10338HBc.A01;
        if (hbd == null && c10338HBc.A02 == null) {
            fA02 = 0.0f;
            fA03 = 0.0f;
        } else {
            HBD hbd2 = c10338HBc.A02;
            if (hbd == null) {
                fA02 = hbd2.A03(this);
            } else {
                fA02 = hbd.A02(this);
                if (hbd2 != null) {
                    fA03 = c10338HBc.A02.A03(this);
                }
            }
            fA03 = fA02;
        }
        float fMin = Math.min(fA02, c10338HBc.A03.A02(this) / 2.0f);
        float fMin2 = Math.min(fA03, c10338HBc.A00.A03(this) / 2.0f);
        HBD hbd3 = c10338HBc.A04;
        float fA022 = hbd3 != null ? hbd3.A02(this) : 0.0f;
        HBD hbd4 = c10338HBc.A05;
        float fA032 = hbd4 != null ? hbd4.A03(this) : 0.0f;
        float fA023 = c10338HBc.A03.A02(this);
        float fA033 = c10338HBc.A00.A03(this);
        if (((AbstractC10356HBv) c10338HBc).A00 == null) {
            ((AbstractC10356HBv) c10338HBc).A00 = new HBQ(fA022, fA032, fA023, fA033);
        }
        float f = fA023 + fA022;
        float f2 = fA032 + fA033;
        Path pathA0V = AbstractC7607F5u.A0V();
        if (fMin == 0.0f || fMin2 == 0.0f) {
            pathA0V.moveTo(fA022, fA032);
            pathA0V.lineTo(f, fA032);
            pathA0V.lineTo(f, f2);
            pathA0V.lineTo(fA022, f2);
            pathA0V.lineTo(fA022, fA032);
        } else {
            float f3 = fMin * 0.5522848f;
            float f4 = 0.5522848f * fMin2;
            float f5 = fA032 + fMin2;
            pathA0V.moveTo(fA022, f5);
            float f6 = f5 - f4;
            float f7 = fA022 + fMin;
            float f8 = f7 - f3;
            pathA0V.cubicTo(fA022, f6, f8, fA032, f7, fA032);
            float f9 = f - fMin;
            pathA0V.lineTo(f9, fA032);
            float f10 = f9 + f3;
            pathA0V.cubicTo(f10, fA032, f, f6, f, f5);
            float f11 = f2 - fMin2;
            pathA0V.lineTo(f, f11);
            float f12 = f11 + f4;
            pathA0V.cubicTo(f, f12, f10, f2, f9, f2);
            pathA0V.lineTo(f7, f2);
            pathA0V.cubicTo(f8, f2, fA022, f12, fA022, f11);
            pathA0V.lineTo(fA022, f5);
        }
        pathA0V.close();
        return pathA0V;
    }

    private Path A08(AbstractC10356HBv abstractC10356HBv, boolean z) {
        Path pathA0V;
        Matrix matrix;
        Path pathA03;
        this.A06.push(this.A03);
        HBE hbe = new HBE(this.A03, this);
        this.A03 = hbe;
        A0Z(abstractC10356HBv, hbe);
        Boolean bool = this.A03.A04.A0B;
        if (!(bool != null ? bool.booleanValue() : true) || !A0o(this)) {
            this.A03 = this.A06.pop();
        } else {
            if (!(abstractC10356HBv instanceof C10337HBb)) {
                if (abstractC10356HBv instanceof HC2) {
                    HC2 hc2 = (HC2) abstractC10356HBv;
                    if (abstractC10356HBv instanceof C10354HBs) {
                        pathA0V = new HBN(((C10354HBs) abstractC10356HBv).A00, this).A02;
                        if (abstractC10356HBv.A00 == null) {
                            abstractC10356HBv.A00 = A09(pathA0V);
                        }
                    } else if (abstractC10356HBv instanceof C10338HBc) {
                        pathA0V = A07((C10338HBc) abstractC10356HBv);
                    } else if (abstractC10356HBv instanceof C10347HBl) {
                        pathA0V = A04((C10347HBl) abstractC10356HBv);
                    } else if (abstractC10356HBv instanceof C10341HBf) {
                        pathA0V = A05((C10341HBf) abstractC10356HBv);
                    } else if (abstractC10356HBv instanceof HBt) {
                        pathA0V = A06((HBt) abstractC10356HBv);
                    }
                    if (((AbstractC10356HBv) hc2).A00 == null) {
                        ((AbstractC10356HBv) hc2).A00 = A09(pathA0V);
                    }
                    matrix = hc2.A00;
                } else {
                    if (!(abstractC10356HBv instanceof C10352HBq)) {
                        A0j("Invalid %s element found in clipPath definition", abstractC10356HBv.A00());
                        return null;
                    }
                    C10352HBq c10352HBq = (C10352HBq) abstractC10356HBv;
                    List<HBD> list = ((AbstractC10345HBj) c10352HBq).A02;
                    float fA03 = 0.0f;
                    float fA02 = (list == null || list.size() == 0) ? 0.0f : ((AbstractC10345HBj) c10352HBq).A02.get(0).A02(this);
                    List<HBD> list2 = ((AbstractC10345HBj) c10352HBq).A03;
                    float fA032 = (list2 == null || list2.size() == 0) ? 0.0f : ((AbstractC10345HBj) c10352HBq).A03.get(0).A03(this);
                    List<HBD> list3 = ((AbstractC10345HBj) c10352HBq).A00;
                    float fA022 = (list3 == null || list3.size() == 0) ? 0.0f : ((AbstractC10345HBj) c10352HBq).A00.get(0).A02(this);
                    List<HBD> list4 = ((AbstractC10345HBj) c10352HBq).A01;
                    if (list4 != null && list4.size() != 0) {
                        fA03 = ((AbstractC10345HBj) c10352HBq).A01.get(0).A03(this);
                    }
                    if (this.A03.A04.A0T != C79.A00) {
                        HBY hby = new HBY(this);
                        A0e(c10352HBq, hby);
                        float f = hby.A00;
                        if (this.A03.A04.A0T == C79.A01) {
                            f /= 2.0f;
                        }
                        fA02 -= f;
                    }
                    A0f(c10352HBq, this, fA02, fA032);
                    pathA0V = AbstractC7607F5u.A0V();
                    A0e(c10352HBq, new HBH(pathA0V, this, fA02 + fA022, fA032 + fA03));
                    matrix = c10352HBq.A00;
                }
                if (matrix != null) {
                    pathA0V.transform(matrix);
                }
                Integer num = this.A03.A04.A0L;
                pathA0V.setFillType((num == null || num != C79.A01) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                if (this.A03.A04.A0W != null) {
                    pathA0V.op(pathA03, Path.Op.INTERSECT);
                }
                this.A03 = this.A06.pop();
                return pathA0V;
            }
            if (!z) {
                A0j("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            C10337HBb c10337HBb = (C10337HBb) abstractC10356HBv;
            HB4 hb4A04 = ((HB3) abstractC10356HBv).A01.A04(c10337HBb.A04);
            if (hb4A04 == null) {
                A0j("Use reference '%s' not found", c10337HBb.A04);
            } else if (hb4A04 instanceof AbstractC10356HBv) {
                pathA0V = A08((AbstractC10356HBv) hb4A04, false);
                if (pathA0V != null) {
                    if (((AbstractC10356HBv) c10337HBb).A00 == null) {
                        ((AbstractC10356HBv) c10337HBb).A00 = A09(pathA0V);
                    }
                    Matrix matrix2 = ((C10349HBn) c10337HBb).A00;
                    if (matrix2 != null) {
                        pathA0V.transform(matrix2);
                    }
                    if (this.A03.A04.A0W != null && (pathA03 = A03(abstractC10356HBv.A00, abstractC10356HBv)) != null) {
                        pathA0V.op(pathA03, Path.Op.INTERSECT);
                    }
                    this.A03 = this.A06.pop();
                    return pathA0V;
                }
            }
            this.A03 = this.A06.pop();
        }
        return null;
    }

    private Integer A0B() {
        Integer num;
        HBB hbb = this.A03.A04;
        Integer num2 = hbb.A0M;
        Integer num3 = C79.A00;
        return (num2 == num3 || (num = hbb.A0T) == C79.A01) ? hbb.A0T : num == num3 ? C79.A0C : num3;
    }

    private String A0C(String str, boolean z, boolean z2) {
        String str2;
        if (this.A03.A07) {
            str2 = "[\\n\\t]";
        } else {
            str = str.replaceAll("\\n", "").replaceAll("\\t", InviteCodeScratcherKt.CODE_SEPARATOR);
            if (z) {
                str = str.replaceAll("^\\s+", "");
            }
            if (z2) {
                str = str.replaceAll("\\s+$", "");
            }
            str2 = "\\s{2,}";
        }
        return str.replaceAll(str2, InviteCodeScratcherKt.CODE_SEPARATOR);
    }

    private void A0D() {
        C10340HBe c10340HBe;
        HBB hbb = this.A03.A04;
        HC9 hc9 = hbb.A0A;
        if (hc9 instanceof C10340HBe) {
            c10340HBe = (C10340HBe) hc9;
        } else if (!(hc9 instanceof HC8)) {
            return;
        } else {
            c10340HBe = hbb.A02;
        }
        int iA00 = c10340HBe.A00;
        Float f = hbb.A0K;
        if (f != null) {
            iA00 = A00(iA00, f.floatValue());
        }
        this.A01.drawColor(iA00);
    }

    public static void A0F(Matrix matrix, HB9 hb9) {
        if (matrix != null) {
            hb9.A01.concat(matrix);
        }
    }

    private void A0G(Path path) {
        HBE hbe = this.A03;
        Integer num = hbe.A04.A0V;
        Integer num2 = C79.A01;
        Canvas canvas = this.A01;
        if (num != num2) {
            canvas.drawPath(path, hbe.A01);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path pathA0V = AbstractC7607F5u.A0V();
        path.transform(matrix, pathA0V);
        canvas.setMatrix(BV4.A08());
        Shader shader = this.A03.A01.getShader();
        Matrix matrixA08 = BV4.A08();
        if (shader != null) {
            shader.getLocalMatrix(matrixA08);
            Matrix matrix2 = new Matrix(matrixA08);
            matrix2.postConcat(matrix);
            shader.setLocalMatrix(matrix2);
        }
        canvas.drawPath(pathA0V, this.A03.A01);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrixA08);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0H(android.graphics.Path r19, X.AbstractC10356HBv r20) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HB9.A0H(android.graphics.Path, X.HBv):void");
    }

    public static void A0I(Path path, HB9 hb9) {
        if (hb9.A03.A06) {
            hb9.A0G(path);
        }
    }

    public static void A0J(HBJ hbj, HBQ hbq, HBQ hbq2, C10343HBh c10343HBh, HB9 hb9) {
        if (hbq.A03 == 0.0f || hbq.A00 == 0.0f) {
            return;
        }
        if (hbj == null && (hbj = ((AbstractC10358HBx) c10343HBh).A00) == null) {
            hbj = HBJ.A02;
        }
        if (A0n(c10343HBh, hb9)) {
            HBE hbe = hb9.A03;
            hbe.A03 = hbq;
            A0O(hbq, hbe, hb9);
            hb9.A0M(hb9.A03.A03, c10343HBh);
            Canvas canvas = hb9.A01;
            HBQ hbq3 = hb9.A03.A03;
            if (hbq2 != null) {
                canvas.concat(A01(hbj, hbq3, hbq2));
                hb9.A03.A02 = ((AbstractC10359HBy) c10343HBh).A00;
            } else {
                canvas.translate(hbq3.A01, hbq3.A02);
            }
            boolean zA0k = hb9.A0k();
            hb9.A0D();
            hb9.A0V(c10343HBh, true);
            if (zA0k) {
                hb9.A0X(c10343HBh);
            }
            hb9.A0Y(c10343HBh);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011d A[PHI: r5 r15 r16
  0x011d: PHI (r5v5 float) = (r5v3 float), (r5v8 float) binds: [B:74:0x010d, B:38:0x0070] A[DONT_GENERATE, DONT_INLINE]
  0x011d: PHI (r15v10 float) = (r15v8 float), (r15v13 float) binds: [B:74:0x010d, B:38:0x0070] A[DONT_GENERATE, DONT_INLINE]
  0x011d: PHI (r16v10 float) = (r16v8 float), (r16v13 float) binds: [B:74:0x010d, B:38:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0L(X.HBQ r19, X.C10339HBd r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HB9.A0L(X.HBQ, X.HBd, boolean):void");
    }

    private void A0M(HBQ hbq, AbstractC10356HBv abstractC10356HBv) {
        Path pathA03;
        if (this.A03.A04.A0W == null || (pathA03 = A03(hbq, abstractC10356HBv)) == null) {
            return;
        }
        this.A01.clipPath(pathA03);
    }

    private void A0N(HBQ hbq, AbstractC10356HBv abstractC10356HBv) {
        if (this.A03.A04.A0a != null) {
            Paint paintA0T = AbstractC7607F5u.A0T();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            AbstractC7607F5u.A1H(paintA0T, mode);
            Canvas canvas = this.A01;
            canvas.saveLayer(null, paintA0T, 31);
            Paint paintA0T2 = AbstractC7607F5u.A0T();
            paintA0T2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paintA0T2, 31);
            HBW hbw = (HBW) this.A02.A04(this.A03.A04.A0a);
            A0K(hbq, hbw, abstractC10356HBv);
            canvas.restore();
            Paint paintA0T3 = AbstractC7607F5u.A0T();
            AbstractC7607F5u.A1H(paintA0T3, mode);
            canvas.saveLayer(null, paintA0T3, 31);
            A0K(hbq, hbw, abstractC10356HBv);
            canvas.restore();
            canvas.restore();
        }
        A0h(this);
    }

    public static void A0O(HBQ hbq, HBE hbe, HB9 hb9) {
        if (hbe.A04.A0C.booleanValue()) {
            return;
        }
        hb9.A0E(hbq.A01, hbq.A02, hbq.A03, hbq.A00);
    }

    private void A0P(HBF hbf, String str) {
        HB4 hb4A04 = ((HB3) hbf).A01.A04(str);
        if (hb4A04 == null) {
            BV6.A1L("Gradient reference '%s' not found", "SVGAndroidRenderer", new Object[]{str});
            return;
        }
        if (!(hb4A04 instanceof HBF)) {
            A0j("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (hb4A04 == hbf) {
            A0j("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        HBF hbf2 = (HBF) hb4A04;
        if (hbf.A01 == null) {
            hbf.A01 = hbf2.A01;
        }
        if (hbf.A00 == null) {
            hbf.A00 = hbf2.A00;
        }
        if (hbf.A02 == null) {
            hbf.A02 = hbf2.A02;
        }
        if (hbf.A04.isEmpty()) {
            hbf.A04 = hbf2.A04;
        }
        try {
            if (hbf instanceof C10344HBi) {
                C10344HBi c10344HBi = (C10344HBi) hbf;
                C10344HBi c10344HBi2 = (C10344HBi) hb4A04;
                if (c10344HBi.A00 == null) {
                    c10344HBi.A00 = c10344HBi2.A00;
                }
                if (c10344HBi.A02 == null) {
                    c10344HBi.A02 = c10344HBi2.A02;
                }
                if (c10344HBi.A01 == null) {
                    c10344HBi.A01 = c10344HBi2.A01;
                }
                if (c10344HBi.A03 == null) {
                    c10344HBi.A03 = c10344HBi2.A03;
                }
            } else {
                C10336HBa c10336HBa = (C10336HBa) hbf;
                C10336HBa c10336HBa2 = (C10336HBa) hb4A04;
                if (c10336HBa.A00 == null) {
                    c10336HBa.A00 = c10336HBa2.A00;
                }
                if (c10336HBa.A01 == null) {
                    c10336HBa.A01 = c10336HBa2.A01;
                }
                if (c10336HBa.A04 == null) {
                    c10336HBa.A04 = c10336HBa2.A04;
                }
                if (c10336HBa.A02 == null) {
                    c10336HBa.A02 = c10336HBa2.A02;
                }
                if (c10336HBa.A03 == null) {
                    c10336HBa.A03 = c10336HBa2.A03;
                }
            }
        } catch (ClassCastException unused) {
        }
        String str2 = hbf2.A03;
        if (str2 != null) {
            A0P(hbf, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A0Q(HC2 hc2) {
        HBV hbv;
        HBV hbv2;
        HBV hbv3;
        List list;
        HBB hbb = this.A03.A04;
        String str = hbb.A0Z;
        if (str == null && hbb.A0Y == null && hbb.A0X == null) {
            return;
        }
        if (str == null) {
            hbv = null;
        } else {
            HB4 hb4A04 = ((HB3) hc2).A01.A04(str);
            if (hb4A04 != null) {
                hbv = (HBV) hb4A04;
            } else {
                A0j("Marker reference '%s' not found", this.A03.A04.A0Z);
                hbv = null;
            }
        }
        String str2 = this.A03.A04.A0Y;
        if (str2 == null) {
            hbv2 = null;
        } else {
            HB4 hb4A042 = ((HB3) hc2).A01.A04(str2);
            if (hb4A042 != null) {
                hbv2 = (HBV) hb4A042;
            } else {
                A0j("Marker reference '%s' not found", this.A03.A04.A0Y);
                hbv2 = null;
            }
        }
        String str3 = this.A03.A04.A0X;
        if (str3 == null) {
            hbv3 = null;
        } else {
            HB4 hb4A043 = ((HB3) hc2).A01.A04(str3);
            if (hb4A043 != null) {
                hbv3 = (HBV) hb4A043;
            } else {
                A0j("Marker reference '%s' not found", this.A03.A04.A0X);
                hbv3 = null;
            }
        }
        if (hc2 instanceof C10354HBs) {
            list = new HBG(((C10354HBs) hc2).A00, this).A04;
        } else if (hc2 instanceof C10342HBg) {
            C10342HBg c10342HBg = (C10342HBg) hc2;
            HBD hbd = c10342HBg.A00;
            float fA02 = hbd != null ? hbd.A02(this) : 0.0f;
            HBD hbd2 = c10342HBg.A02;
            float fA03 = hbd2 != null ? hbd2.A03(this) : 0.0f;
            HBD hbd3 = c10342HBg.A01;
            float fA022 = hbd3 != null ? hbd3.A02(this) : 0.0f;
            HBD hbd4 = c10342HBg.A03;
            float fA032 = hbd4 != null ? hbd4.A03(this) : 0.0f;
            ArrayList arrayListA11 = C60O.A11(2);
            float f = fA022 - fA02;
            float f2 = fA032 - fA03;
            arrayListA11.add(new HBI(this, fA02, fA03, f, f2));
            arrayListA11.add(new HBI(this, fA022, fA032, f, f2));
            list = arrayListA11;
        } else {
            HBt hBt = (HBt) hc2;
            float[] fArr = hBt.A00;
            int length = fArr.length;
            if (length < 2) {
                return;
            }
            ArrayList arrayListA0h = C3cG.A0h();
            float f3 = fArr[0];
            float f4 = fArr[1];
            HBI hbi = new HBI(this, f3, f4, 0.0f, 0.0f);
            float f5 = 0.0f;
            float f6 = 0.0f;
            for (int i = 2; i < length; i += 2) {
                f5 = fArr[i];
                f6 = fArr[i + 1];
                hbi.A00(f5, f6);
                arrayListA0h.add(hbi);
                hbi = new HBI(this, f5, f6, f5 - hbi.A02, f6 - hbi.A03);
            }
            if (hBt instanceof HC4) {
                list = arrayListA0h;
                if (f5 != f3) {
                    list = arrayListA0h;
                    if (f6 != f4) {
                        hbi.A00(f3, f4);
                        arrayListA0h.add(hbi);
                        HBI hbi2 = new HBI(this, f3, f4, f3 - hbi.A02, f4 - hbi.A03);
                        hbi2.A01((HBI) arrayListA0h.get(0));
                        arrayListA0h.add(hbi2);
                        arrayListA0h.set(0, hbi2);
                        list = arrayListA0h;
                    }
                }
            } else {
                arrayListA0h.add(hbi);
                list = arrayListA0h;
            }
        }
        int size = list.size();
        if (size != 0) {
            HBB hbb2 = this.A03.A04;
            hbb2.A0X = null;
            hbb2.A0Y = null;
            hbb2.A0Z = null;
            if (hbv != null) {
                A0R(hbv, (HBI) list.get(0));
            }
            if (hbv2 != null && list.size() > 2) {
                HBI hbi3 = (HBI) list.get(0);
                HBI hbi4 = (HBI) list.get(1);
                int i2 = 1;
                while (i2 < size - 1) {
                    i2++;
                    HBI hbi5 = (HBI) list.get(i2);
                    if (hbi4.A04) {
                        float f7 = hbi4.A00;
                        float f8 = hbi4.A01;
                        float f9 = hbi4.A02;
                        float f10 = f9 - hbi3.A02;
                        float f11 = hbi4.A03;
                        float fA033 = C8j3.A03(f7, f10, f8, f11 - hbi3.A03);
                        if (fA033 == 0.0f) {
                            fA033 = C8j3.A03(f7, hbi5.A02 - f9, f8, hbi5.A03 - f11);
                        }
                        if (fA033 <= 0.0f && (fA033 != 0.0f || (f7 <= 0.0f && f8 < 0.0f))) {
                            hbi4.A00 = -f7;
                            hbi4.A01 = -f8;
                        }
                    }
                    hbi3 = hbi4;
                    A0R(hbv2, hbi4);
                    hbi4 = hbi5;
                }
            }
            if (hbv3 != null) {
                A0R(hbv3, (HBI) list.get(size - 1));
            }
        }
    }

    public static void A0S(InterfaceC10348HBm interfaceC10348HBm, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            interfaceC10348HBm.APc(f6, f7);
            return;
        }
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        double radians = Math.toRadians(f5 % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d = (f - f6) / 2.0d;
        double d2 = (f2 - f7) / 2.0d;
        double d3 = (dCos * d) + (dSin * d2);
        double d4 = ((-dSin) * d) + (dCos * d2);
        double d5 = fAbs * fAbs;
        double d6 = fAbs2 * fAbs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d7 / d5) + (d8 / d6);
        if (d9 > 0.99999d) {
            double dSqrt = Math.sqrt(d9) * 1.00001d;
            float f8 = (float) (fAbs * dSqrt);
            fAbs = f8;
            fAbs2 = (float) (dSqrt * fAbs2);
            d5 = f8 * f8;
            d6 = fAbs2 * fAbs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double dSqrt2 = d10 * Math.sqrt(d14);
        double d15 = fAbs;
        double d16 = fAbs2;
        double d17 = ((d15 * d4) / d16) * dSqrt2;
        double d18 = (-((d16 * d3) / d15)) * dSqrt2;
        double d19 = ((f + f6) / 2.0d) + ((dCos * d17) - (dSin * d18));
        double d20 = ((f2 + f7) / 2.0d) + (dSin * d17) + (dCos * d18);
        double d21 = (d3 - d17) / d15;
        double d22 = (d4 - d18) / d16;
        double d23 = ((-d3) - d17) / d15;
        double d24 = ((-d4) - d18) / d16;
        double d25 = (d21 * d21) + (d22 * d22);
        double dA01 = AbstractC7610F5x.A01((d22 > 0.0d ? 1 : (d22 == 0.0d ? 0 : -1))) * Math.acos(d21 / Math.sqrt(d25));
        double dSqrt3 = ((d21 * d23) + (d22 * d24)) / Math.sqrt(d25 * ((d23 * d23) + (d24 * d24)));
        double dAcos = ((d21 * d24) - (d22 * d23) >= 0.0d ? 1.0d : -1.0d) * (dSqrt3 < -1.0d ? 3.141592653589793d : dSqrt3 > 1.0d ? 0.0d : Math.acos(dSqrt3));
        if (z2) {
            if (dAcos < 0.0d) {
                dAcos += 6.283185307179586d;
            }
        } else if (dAcos > 0.0d) {
            dAcos -= 6.283185307179586d;
        }
        double d26 = dAcos % 6.283185307179586d;
        double d27 = dA01 % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d26) * 2.0d) / 3.141592653589793d);
        double d28 = d26 / iCeil;
        double d29 = d28 / 2.0d;
        double dSin2 = (Math.sin(d29) * 1.3333333333333333d) / (Math.cos(d29) + 1.0d);
        int i = iCeil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        for (int i3 = 0; i3 < iCeil; i3++) {
            double d30 = d27 + (i3 * d28);
            double dCos2 = Math.cos(d30);
            double dSin3 = Math.sin(d30);
            fArr[i2] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i2 + 1] = (float) (dSin3 + (dCos2 * dSin2));
            double d31 = d30 + d28;
            double dCos3 = Math.cos(d31);
            double dSin4 = Math.sin(d31);
            fArr[i2 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i2 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            int i4 = i2 + 5;
            fArr[i2 + 4] = (float) dCos3;
            i2 += 6;
            fArr[i4] = (float) dSin4;
        }
        Matrix matrixA08 = BV4.A08();
        matrixA08.postScale(fAbs, fAbs2);
        matrixA08.postRotate(f5);
        matrixA08.postTranslate((float) d19, (float) d20);
        matrixA08.mapPoints(fArr);
        fArr[i - 2] = f6;
        fArr[i - 1] = f7;
        for (int i5 = 0; i5 < i; i5 += 6) {
            interfaceC10348HBm.A87(fArr[i5], fArr[i5 + 1], fArr[i5 + 2], fArr[i5 + 3], fArr[i5 + 4], fArr[i5 + 5]);
        }
    }

    private void A0T(HBR hbr, String str) {
        HB4 hb4A04 = ((HB3) hbr).A01.A04(str);
        if (hb4A04 == null) {
            BV6.A1L("Pattern reference '%s' not found", "SVGAndroidRenderer", new Object[]{str});
            return;
        }
        if (!(hb4A04 instanceof HBR)) {
            A0j("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (hb4A04 == hbr) {
            A0j("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        HBR hbr2 = (HBR) hb4A04;
        if (hbr.A06 == null) {
            hbr.A06 = hbr2.A06;
        }
        if (hbr.A05 == null) {
            hbr.A05 = hbr2.A05;
        }
        if (hbr.A00 == null) {
            hbr.A00 = hbr2.A00;
        }
        if (hbr.A03 == null) {
            hbr.A03 = hbr2.A03;
        }
        if (hbr.A04 == null) {
            hbr.A04 = hbr2.A04;
        }
        if (hbr.A02 == null) {
            hbr.A02 = hbr2.A02;
        }
        if (hbr.A01 == null) {
            hbr.A01 = hbr2.A01;
        }
        if (((HBP) hbr).A01.isEmpty()) {
            ((HBP) hbr).A01 = ((HBP) hbr2).A01;
        }
        if (((AbstractC10359HBy) hbr).A00 == null) {
            ((AbstractC10359HBy) hbr).A00 = ((AbstractC10359HBy) hbr2).A00;
        }
        if (((AbstractC10358HBx) hbr).A00 == null) {
            ((AbstractC10358HBx) hbr).A00 = ((AbstractC10358HBx) hbr2).A00;
        }
        String str2 = hbr2.A07;
        if (str2 != null) {
            A0T(hbr, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0298 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x021d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0U(X.HBB r12, X.HBE r13, X.HB9 r14) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HB9.A0U(X.HBB, X.HBE, X.HB9):void");
    }

    private void A0V(HB7 hb7, boolean z) {
        if (z) {
            this.A05.push(hb7);
            this.A04.push(this.A01.getMatrix());
        }
        Iterator<HB3> it = hb7.ADb().iterator();
        while (it.hasNext()) {
            A0a(it.next());
        }
        if (z) {
            this.A05.pop();
            this.A04.pop();
        }
    }

    private void A0W(AbstractC10356HBv abstractC10356HBv) {
        HC9 hc9 = this.A03.A04.A06;
        if (hc9 instanceof C10339HBd) {
            A0L(abstractC10356HBv.A00, (C10339HBd) hc9, true);
        }
        HC9 hc92 = this.A03.A04.A09;
        if (hc92 instanceof C10339HBd) {
            A0L(abstractC10356HBv.A00, (C10339HBd) hc92, false);
        }
    }

    private void A0X(AbstractC10356HBv abstractC10356HBv) {
        A0N(abstractC10356HBv.A00, abstractC10356HBv);
    }

    private void A0Y(AbstractC10356HBv abstractC10356HBv) {
        if (((HB3) abstractC10356HBv).A00 == null || abstractC10356HBv.A00 == null) {
            return;
        }
        Matrix matrixA08 = BV4.A08();
        if (this.A04.peek().invert(matrixA08)) {
            HBQ hbq = abstractC10356HBv.A00;
            float f = hbq.A01;
            float f2 = hbq.A02;
            float f3 = f + hbq.A03;
            float f4 = f2 + hbq.A00;
            int i = 2;
            float[] fArr = {f, f2, f3, 0.0f, 0.0f, f4, f, f4};
            AbstractC7609F5w.A1T(fArr, f2, f3);
            matrixA08.preConcat(this.A01.getMatrix());
            matrixA08.mapPoints(fArr);
            float f5 = fArr[0];
            float f6 = fArr[1];
            RectF rectF = new RectF(f5, f6, f5, f6);
            do {
                if (fArr[i] < rectF.left) {
                    rectF.left = fArr[i];
                }
                if (fArr[i] > rectF.right) {
                    rectF.right = fArr[i];
                }
                int i2 = i + 1;
                if (fArr[i2] < rectF.top) {
                    rectF.top = fArr[i2];
                }
                if (fArr[i2] > rectF.bottom) {
                    rectF.bottom = fArr[i2];
                }
                i += 2;
            } while (i <= 6);
            AbstractC10356HBv abstractC10356HBv2 = (AbstractC10356HBv) this.A05.peek();
            HBQ hbq2 = abstractC10356HBv2.A00;
            float f7 = rectF.left;
            float f8 = rectF.top;
            HBQ hbq3 = new HBQ(f7, f8, rectF.right - f7, rectF.bottom - f8);
            if (hbq2 == null) {
                abstractC10356HBv2.A00 = hbq3;
                return;
            }
            float f9 = hbq3.A01;
            float f10 = hbq2.A01;
            if (f9 < f10) {
                hbq2.A01 = f9;
                f10 = f9;
            }
            float f11 = hbq3.A02;
            float f12 = hbq2.A02;
            if (f11 < f12) {
                hbq2.A02 = f11;
                f12 = f11;
            }
            float f13 = hbq3.A01 + hbq3.A03;
            if (f13 > hbq2.A03 + f10) {
                hbq2.A03 = f13 - f10;
            }
            float f14 = hbq3.A02 + hbq3.A00;
            if (f14 > hbq2.A00 + f12) {
                hbq2.A00 = f14 - f12;
            }
        }
    }

    private void A0Z(HB4 hb4, HBE hbe) {
        boolean zA1Y = AnonymousClass002.A1Y(((HB3) hb4).A00);
        HBB hbb = hbe.A04;
        Boolean bool = Boolean.TRUE;
        hbb.A0B = bool;
        if (!zA1Y) {
            bool = Boolean.FALSE;
        }
        hbb.A0C = bool;
        hbb.A01 = null;
        hbb.A0W = null;
        Float fValueOf = Float.valueOf(1.0f);
        hbb.A0F = fValueOf;
        hbb.A08 = C10340HBe.A01;
        hbb.A0H = fValueOf;
        hbb.A0a = null;
        hbb.A07 = null;
        hbb.A0G = fValueOf;
        hbb.A0A = null;
        hbb.A0K = fValueOf;
        hbb.A0V = C79.A00;
        HBB hbb2 = hb4.A00;
        if (hbb2 != null) {
            A0U(hbb2, hbe, this);
        }
        List<HjE> list = this.A02.A00.A00;
        if (list != null && !list.isEmpty()) {
            for (HjE hjE : this.A02.A00.A00) {
                if (HAn.A03(null, hjE.A00, hb4)) {
                    A0U(hjE.A01, hbe, this);
                }
            }
        }
        HBB hbb3 = hb4.A01;
        if (hbb3 != null) {
            A0U(hbb3, hbe, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0662 A[PHI: r12
  0x0662: PHI (r12v11 ??) = (r12v1 ??), (r12v8 ??), (r12v10 ??), (r12v12 ??) binds: [B:306:0x05d3, B:185:0x03b1, B:167:0x0368, B:325:0x0660] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0205 A[PHI: r12
  0x0205: PHI (r12v17 ??) = (r12v14 ??), (r12v18 ??) binds: [B:71:0x01a1, B:85:0x0203] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.HB9] */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.HB4, X.HBO, X.HBj, X.HBq, X.HBv] */
    /* JADX WARN: Type inference failed for: r12v10, types: [X.HB4, X.HBs, X.HBv, X.HC2] */
    /* JADX WARN: Type inference failed for: r12v11, types: [X.HBv] */
    /* JADX WARN: Type inference failed for: r12v12, types: [X.HB4, X.HBX, X.HBv, X.HBx] */
    /* JADX WARN: Type inference failed for: r12v13, types: [X.HB4, X.HB7, X.HBn, X.HBv] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [X.HB4, X.HBP, X.HBn, X.HBv] */
    /* JADX WARN: Type inference failed for: r12v16, types: [X.HBv] */
    /* JADX WARN: Type inference failed for: r12v17, types: [X.HBv] */
    /* JADX WARN: Type inference failed for: r12v18, types: [X.HB3, X.HB4, X.HBb, X.HBn, X.HBv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v5, types: [X.HB4, X.HBg, X.HBv, X.HC2] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r2v16, types: [X.HB3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0a(X.HB3 r12) {
        /*
            Method dump skipped, instructions count: 1646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HB9.A0a(X.HB3):void");
    }

    public static void A0c(HB3 hb3, HB9 hb9) {
        HBE hbe = new HBE(hb9);
        A0U(HBB.A00(), hbe, hb9);
        hb9.A0b(hb3, hbe);
        hb9.A03 = hbe;
    }

    public static void A0d(HC9 hc9, HBE hbe, boolean z) {
        C10340HBe c10340HBe;
        HBB hbb = hbe.A04;
        float fFloatValue = (z ? hbb.A0E : hbb.A0J).floatValue();
        if (hc9 instanceof C10340HBe) {
            c10340HBe = (C10340HBe) hc9;
        } else if (!(hc9 instanceof HC8)) {
            return;
        } else {
            c10340HBe = hbb.A02;
        }
        (z ? hbe.A00 : hbe.A01).setColor(A00(c10340HBe.A00, fFloatValue));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d3 A[PHI: r1
  0x01d3: PHI (r1v7 X.HBv) = (r1v17 X.HBv), (r1v18 X.HBv) binds: [B:80:0x0163, B:100:0x01d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0e(X.HBO r12, X.AbstractC10355HBu r13) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HB9.A0e(X.HBO, X.HBu):void");
    }

    public static void A0f(HBO hbo, HB9 hb9, float f, float f2) {
        if (((AbstractC10356HBv) hbo).A00 == null) {
            HBC hbc = new HBC(hb9, f, f2);
            hb9.A0e(hbo, hbc);
            RectF rectF = hbc.A02;
            ((AbstractC10356HBv) hbo).A00 = new HBQ(rectF.left, rectF.top, rectF.width(), rectF.height());
        }
    }

    private void A0g(HBO hbo, StringBuilder sb) {
        Iterator<HB3> it = ((HBP) hbo).A01.iterator();
        boolean z = true;
        while (it.hasNext()) {
            HB3 next = it.next();
            if (next instanceof HBO) {
                A0g((HBO) next, sb);
            } else if (next instanceof C10353HBr) {
                sb.append(A0C(((C10353HBr) next).A00, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public static void A0h(HB9 hb9) {
        hb9.A01.restore();
        hb9.A03 = hb9.A06.pop();
    }

    public static void A0i(HB9 hb9) {
        hb9.A01.save();
        hb9.A06.push(hb9.A03);
        hb9.A03 = new HBE(hb9.A03, hb9);
    }

    public static void A0j(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0k() {
        /*
            r5 = this;
            X.HBE r0 = r5.A03
            X.HBB r2 = r0.A04
            java.lang.Float r0 = r2.A0F
            float r1 = r0.floatValue()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L16
            java.lang.String r0 = r2.A0a
            if (r0 != 0) goto L16
            r2 = 0
        L15:
            return r2
        L16:
            android.graphics.Canvas r4 = r5.A01
            r0 = 1132462080(0x43800000, float:256.0)
            float r1 = r1 * r0
            int r2 = (int) r1
            if (r2 >= 0) goto L5f
            r2 = 0
        L1f:
            r1 = r2
        L20:
            r0 = 31
            r3 = 0
            r4.saveLayerAlpha(r3, r1, r0)
            java.util.Stack<X.HBE> r1 = r5.A06
            X.HBE r0 = r5.A03
            r1.push(r0)
            X.HBE r1 = r5.A03
            X.HBE r0 = new X.HBE
            r0.<init>(r1, r5)
            r5.A03 = r0
            X.HBB r0 = r0.A04
            java.lang.String r1 = r0.A0a
            r2 = 1
            if (r1 == 0) goto L15
            X.HBA r0 = r5.A02
            X.HB4 r0 = r0.A04(r1)
            if (r0 == 0) goto L49
            boolean r0 = r0 instanceof X.HBW
            if (r0 != 0) goto L15
        L49:
            X.HBE r0 = r5.A03
            X.HBB r0 = r0.A04
            java.lang.String r0 = r0.A0a
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Mask reference '%s' not found"
            A0j(r0, r1)
            X.HBE r0 = r5.A03
            X.HBB r0 = r0.A04
            r0.A0a = r3
            return r2
        L5f:
            r0 = 255(0xff, float:3.57E-43)
            r1 = 255(0xff, float:3.57E-43)
            if (r2 > r0) goto L20
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HB9.A0k():boolean");
    }

    public static boolean A0m(HBB hbb, long j) {
        return AnonymousClass002.A1L(((j & hbb.A00) > 0L ? 1 : ((j & hbb.A00) == 0L ? 0 : -1)));
    }

    public static boolean A0n(HB4 hb4, HB9 hb9) {
        hb9.A0Z(hb4, hb9.A03);
        Boolean bool = hb9.A03.A04.A0B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static boolean A0o(HB9 hb9) {
        Boolean bool = hb9.A03.A04.A0D;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r8 != 7) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Matrix A01(X.HBJ r12, X.HBQ r13, X.HBQ r14) {
        /*
            android.graphics.Matrix r5 = X.BV4.A08()
            X.HHN r11 = r12.A00
            if (r11 == 0) goto L2f
            float r10 = r13.A03
            float r9 = r14.A03
            float r8 = r10 / r9
            float r7 = r13.A00
            float r6 = r14.A00
            float r2 = r7 / r6
            float r0 = r14.A01
            float r4 = -r0
            float r0 = r14.A02
            float r3 = -r0
            X.HBJ r0 = X.HBJ.A03
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L30
            float r1 = r13.A01
            float r0 = r13.A02
            r5.preTranslate(r1, r0)
            r5.preScale(r8, r2)
        L2c:
            r5.preTranslate(r4, r3)
        L2f:
            return r5
        L30:
            java.lang.Integer r1 = r12.A01
            java.lang.Integer r0 = X.C79.A01
            if (r1 != r0) goto L70
            float r2 = java.lang.Math.max(r8, r2)
        L3a:
            float r10 = r10 / r2
            float r7 = r7 / r2
            int r8 = r11.ordinal()
            r1 = 1073741824(0x40000000, float:2.0)
            switch(r8) {
                case 2: goto L6a;
                case 3: goto L6d;
                case 4: goto L45;
                case 5: goto L6a;
                case 6: goto L6d;
                case 7: goto L45;
                case 8: goto L6a;
                case 9: goto L6d;
                default: goto L45;
            }
        L45:
            r0 = 5
            if (r8 == r0) goto L64
            r0 = 8
            if (r8 == r0) goto L67
            r0 = 6
            if (r8 == r0) goto L64
            r0 = 9
            if (r8 == r0) goto L67
            r0 = 4
            if (r8 == r0) goto L64
            r0 = 7
            if (r8 == r0) goto L67
        L59:
            float r1 = r13.A01
            float r0 = r13.A02
            r5.preTranslate(r1, r0)
            r5.preScale(r2, r2)
            goto L2c
        L64:
            float r6 = r6 - r7
            float r6 = r6 / r1
            goto L68
        L67:
            float r6 = r6 - r7
        L68:
            float r3 = r3 - r6
            goto L59
        L6a:
            float r9 = r9 - r10
            float r9 = r9 / r1
            goto L6e
        L6d:
            float r9 = r9 - r10
        L6e:
            float r4 = r4 - r9
            goto L45
        L70:
            float r2 = java.lang.Math.min(r8, r2)
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HB9.A01(X.HBJ, X.HBQ, X.HBQ):android.graphics.Matrix");
    }

    private Path A06(HBt hBt) {
        Path pathA0V = AbstractC7607F5u.A0V();
        float[] fArr = hBt.A00;
        pathA0V.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = hBt.A00;
            if (i >= fArr2.length) {
                break;
            }
            pathA0V.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (hBt instanceof HC4) {
            pathA0V.close();
        }
        if (((AbstractC10356HBv) hBt).A00 == null) {
            ((AbstractC10356HBv) hBt).A00 = A09(pathA0V);
        }
        return pathA0V;
    }

    public static HBQ A09(Path path) {
        RectF rectFA0Y = AbstractC7607F5u.A0Y();
        path.computeBounds(rectFA0Y, true);
        return new HBQ(rectFA0Y.left, rectFA0Y.top, rectFA0Y.width(), rectFA0Y.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00be, code lost:
    
        if (r9 != 7) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0R(X.HBV r13, X.HBI r14) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HB9.A0R(X.HBV, X.HBI):void");
    }

    private void A0b(HB3 hb3, HBE hbe) {
        ArrayList arrayListA0h = C3cG.A0h();
        while (true) {
            if (hb3 instanceof HB4) {
                arrayListA0h.add(0, hb3);
            }
            if (hb3.A00 == null) {
                break;
            } else {
                hb3 = (HB3) hb3.A00;
            }
        }
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            A0Z((HB4) it.next(), hbe);
        }
        HBE hbe2 = this.A03;
        hbe.A02 = hbe2.A02;
        hbe.A03 = hbe2.A03;
    }

    public static boolean A0l(Path path, AbstractC10356HBv abstractC10356HBv, HB9 hb9) {
        hb9.A0W(abstractC10356HBv);
        hb9.A0M(abstractC10356HBv.A00, abstractC10356HBv);
        boolean zA0k = hb9.A0k();
        if (hb9.A03.A05) {
            hb9.A0H(path, abstractC10356HBv);
        }
        return zA0k;
    }
}
