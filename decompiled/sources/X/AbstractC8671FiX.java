package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FiX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8671FiX implements InterfaceC8793FkY, InterfaceC8663FiO, InterfaceC8694Fiu {
    public float A00;
    public BlurMaskFilter A01;
    public C8720FjL A02;
    public C8680Fig A03;
    public AbstractC8671FiX A04;
    public AbstractC8671FiX A05;
    public boolean A06;
    public Paint A07;
    public List<AbstractC8671FiX> A08;
    public boolean A09;
    public final Matrix A0A;
    public final Paint A0C;
    public final Paint A0D;
    public final RectF A0F;
    public final RectF A0G;
    public final RectF A0H;
    public final RectF A0I;
    public final C8659FiK A0J;
    public final C8701Fj1 A0K;
    public final C8675Fib A0L;
    public final List<AbstractC8724FjP<?, ?>> A0M;
    public final Paint A0P;
    public final Paint A0Q;
    public final RectF A0R;
    public final Path A0E = AbstractC7607F5u.A0V();
    public final Matrix A0O = BV4.A08();
    public final Matrix A0N = BV4.A08();
    public final Paint A0B = new HrG(1);

    private void A00() {
        if (this.A08 == null) {
            AbstractC8671FiX abstractC8671FiX = this.A05;
            if (abstractC8671FiX == null) {
                this.A08 = Collections.EMPTY_LIST;
                return;
            }
            this.A08 = new ArrayList();
            do {
                this.A08.add(abstractC8671FiX);
                abstractC8671FiX = abstractC8671FiX.A05;
            } while (abstractC8671FiX != null);
        }
    }

    private void A01(Canvas canvas) {
        RectF rectF = this.A0H;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.A0P);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FiV;ILjava/util/List<LX/FiV;>;LX/FiV;)V */
    private final void A08(C8669FiV c8669FiV, C8669FiV c8669FiV2, List list, int i) {
        if (this instanceof C8677Fid) {
            ((C8677Fid) this).A00.AbZ(c8669FiV, c8669FiV2, list, i);
            return;
        }
        if (!(this instanceof C8670FiW)) {
            return;
        }
        C8670FiW c8670FiW = (C8670FiW) this;
        int i2 = 0;
        while (true) {
            List<AbstractC8671FiX> list2 = c8670FiW.A04;
            if (i2 >= list2.size()) {
                return;
            }
            list2.get(i2).AbZ(c8669FiV, c8669FiV2, list, i);
            i2++;
        }
    }

    public final C8791FkV A04() {
        if (!(this instanceof C8677Fid)) {
            return this.A0L.A0E;
        }
        C8677Fid c8677Fid = (C8677Fid) this;
        C8791FkV c8791FkV = c8677Fid.A0L.A0E;
        return c8791FkV == null ? c8677Fid.A01.A04() : c8791FkV;
    }

    public final C8778FkI A05() {
        if (!(this instanceof C8677Fid)) {
            return this.A0L.A0F;
        }
        C8677Fid c8677Fid = (C8677Fid) this;
        C8778FkI c8778FkI = c8677Fid.A0L.A0F;
        return c8778FkI == null ? c8677Fid.A01.A05() : c8778FkI;
    }

    public void A06(float f) {
        C8701Fj1 c8701Fj1 = this.A0K;
        AbstractC8724FjP<Integer, Integer> abstractC8724FjP = c8701Fj1.A02;
        if (abstractC8724FjP != null) {
            abstractC8724FjP.A08(f);
        }
        AbstractC8724FjP<?, Float> abstractC8724FjP2 = c8701Fj1.A06;
        if (abstractC8724FjP2 != null) {
            abstractC8724FjP2.A08(f);
        }
        AbstractC8724FjP<?, Float> abstractC8724FjP3 = c8701Fj1.A01;
        if (abstractC8724FjP3 != null) {
            abstractC8724FjP3.A08(f);
        }
        AbstractC8724FjP<PointF, PointF> abstractC8724FjP4 = c8701Fj1.A00;
        if (abstractC8724FjP4 != null) {
            abstractC8724FjP4.A08(f);
        }
        AbstractC8724FjP<?, PointF> abstractC8724FjP5 = c8701Fj1.A03;
        if (abstractC8724FjP5 != null) {
            abstractC8724FjP5.A08(f);
        }
        AbstractC8724FjP<C8770Fk9, C8770Fk9> abstractC8724FjP6 = c8701Fj1.A05;
        if (abstractC8724FjP6 != null) {
            abstractC8724FjP6.A08(f);
        }
        AbstractC8724FjP<Float, Float> abstractC8724FjP7 = c8701Fj1.A04;
        if (abstractC8724FjP7 != null) {
            abstractC8724FjP7.A08(f);
        }
        C8720FjL c8720FjL = c8701Fj1.A07;
        if (c8720FjL != null) {
            c8720FjL.A08(f);
        }
        C8720FjL c8720FjL2 = c8701Fj1.A08;
        if (c8720FjL2 != null) {
            c8720FjL2.A08(f);
        }
        C8680Fig c8680Fig = this.A03;
        if (c8680Fig != null) {
            int i = 0;
            while (true) {
                List<AbstractC8724FjP<C10447Hid, Path>> list = c8680Fig.A00;
                if (i >= list.size()) {
                    break;
                }
                list.get(i).A08(f);
                i++;
            }
        }
        C8720FjL c8720FjL3 = this.A02;
        if (c8720FjL3 != null) {
            c8720FjL3.A08(f);
        }
        AbstractC8671FiX abstractC8671FiX = this.A04;
        if (abstractC8671FiX != null) {
            abstractC8671FiX.A06(f);
        }
        List<AbstractC8724FjP<?, ?>> list2 = this.A0M;
        list2.size();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            list2.get(i2).A08(f);
        }
        list2.size();
    }

    public final void A07(AbstractC8724FjP<?, ?> abstractC8724FjP) {
        if (abstractC8724FjP != null) {
            this.A0M.add(abstractC8724FjP);
        }
    }

    public void A09(boolean z) {
        if (z && this.A07 == null) {
            this.A07 = new HrG();
        }
        this.A09 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0A(android.graphics.Canvas r14, android.graphics.Matrix r15, int r16) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8671FiX.A0A(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;LX/Fii<TT;>;)V */
    public void A41(C8682Fii c8682Fii, Object obj) {
        this.A0K.A04(c8682Fii, obj);
    }

    @Override // X.InterfaceC8694Fiu
    public final void A9E(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        int i2;
        Path path;
        Paint paint2;
        Paint paint3;
        Path path2;
        Paint paint4;
        C8680Fig c8680Fig;
        Integer numA06;
        if (this.A06) {
            C8675Fib c8675Fib = this.A0L;
            if (c8675Fib.A0O) {
                return;
            }
            A00();
            Matrix matrix2 = this.A0O;
            matrix2.reset();
            matrix2.set(matrix);
            int size = this.A08.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    matrix2.preConcat(this.A08.get(size).A0K.A00());
                }
            }
            C8701Fj1 c8701Fj1 = this.A0K;
            AbstractC8724FjP<Integer, Integer> abstractC8724FjP = c8701Fj1.A02;
            int iIntValue = (int) ((((i / 255.0f) * ((abstractC8724FjP == null || (numA06 = abstractC8724FjP.A06()) == null) ? 100 : numA06.intValue())) / 100.0f) * 255.0f);
            if (this.A04 == null && ((c8680Fig = this.A03) == null || c8680Fig.A00.isEmpty())) {
                matrix2.preConcat(c8701Fj1.A00());
                A0A(canvas, matrix2, iIntValue);
                return;
            }
            RectF rectF = this.A0H;
            AD3(matrix2, rectF, false);
            if (this.A04 != null && c8675Fib.A0I != C79.A0C) {
                RectF rectF2 = this.A0G;
                rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.A04.AD3(matrix, rectF2, true);
                if (!rectF.intersect(rectF2)) {
                    rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix2.preConcat(c8701Fj1.A00());
            RectF rectF3 = this.A0F;
            rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
            C8680Fig c8680Fig2 = this.A03;
            if (c8680Fig2 != null) {
                List<AbstractC8724FjP<C10447Hid, Path>> list = c8680Fig2.A00;
                if (!list.isEmpty()) {
                    List<C8693Fit> list2 = c8680Fig2.A01;
                    int size2 = list2.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size2) {
                            C8693Fit c8693Fit = list2.get(i3);
                            Path pathA06 = list.get(i3).A06();
                            if (pathA06 != null) {
                                Path path3 = this.A0E;
                                path3.set(pathA06);
                                path3.transform(matrix2);
                                int iIntValue2 = c8693Fit.A02.intValue();
                                if (iIntValue2 == 3 || iIntValue2 == 1 || ((iIntValue2 == 2 || iIntValue2 == 0) && c8693Fit.A03)) {
                                    break;
                                }
                                RectF rectF4 = this.A0I;
                                path3.computeBounds(rectF4, false);
                                if (i3 == 0) {
                                    rectF3.set(rectF4);
                                } else {
                                    rectF3.set(Math.min(rectF3.left, rectF4.left), Math.min(rectF3.top, rectF4.top), Math.max(rectF3.right, rectF4.right), Math.max(rectF3.bottom, rectF4.bottom));
                                }
                            }
                            i3++;
                        } else if (!rectF.intersect(rectF3)) {
                            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    }
                }
            }
            RectF rectF5 = this.A0R;
            rectF5.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            Matrix matrix3 = this.A0N;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF.intersect(rectF5)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            if (rectF.width() >= 1.0f && rectF.height() >= 1.0f) {
                Paint paint5 = this.A0B;
                paint5.setAlpha(255);
                canvas.saveLayer(rectF, paint5);
                A01(canvas);
                A0A(canvas, matrix2, iIntValue);
                if (c8680Fig2 != null) {
                    List<AbstractC8724FjP<C10447Hid, Path>> list3 = c8680Fig2.A00;
                    if (!list3.isEmpty()) {
                        Paint paint6 = this.A0C;
                        canvas.saveLayer(rectF, paint6);
                        int i4 = 0;
                        while (true) {
                            List<C8693Fit> list4 = c8680Fig2.A01;
                            if (i4 >= list4.size()) {
                                break;
                            }
                            C8693Fit c8693Fit2 = list4.get(i4);
                            AbstractC8724FjP<C10447Hid, Path> abstractC8724FjP2 = list3.get(i4);
                            AbstractC8724FjP<Integer, Integer> abstractC8724FjP3 = c8680Fig2.A02.get(i4);
                            int iIntValue3 = c8693Fit2.A02.intValue();
                            if (iIntValue3 != 3) {
                                if (iIntValue3 != 1) {
                                    if (iIntValue3 != 2) {
                                        if (iIntValue3 == 0) {
                                            if (c8693Fit2.A03) {
                                                canvas.saveLayer(rectF, paint5);
                                                canvas.drawRect(rectF, paint5);
                                                Path pathA062 = abstractC8724FjP2.A06();
                                                path2 = this.A0E;
                                                path2.set(pathA062);
                                                path2.transform(matrix2);
                                                paint5.setAlpha((int) (abstractC8724FjP3.A06().intValue() * 2.55f));
                                                paint4 = this.A0D;
                                            } else {
                                                Path pathA063 = abstractC8724FjP2.A06();
                                                path = this.A0E;
                                                path.set(pathA063);
                                                path.transform(matrix2);
                                                paint2 = paint5;
                                                paint5.setAlpha((int) (abstractC8724FjP3.A06().intValue() * 2.55f));
                                                canvas.drawPath(path, paint2);
                                            }
                                        }
                                    } else if (c8693Fit2.A03) {
                                        canvas.saveLayer(rectF, paint6);
                                        canvas.drawRect(rectF, paint5);
                                        paint3 = this.A0D;
                                        paint3.setAlpha((int) (abstractC8724FjP3.A06().intValue() * 2.55f));
                                        Path pathA064 = abstractC8724FjP2.A06();
                                        Path path4 = this.A0E;
                                        path4.set(pathA064);
                                        path4.transform(matrix2);
                                        canvas.drawPath(path4, paint3);
                                        canvas.restore();
                                    } else {
                                        canvas.saveLayer(rectF, paint6);
                                        Path pathA065 = abstractC8724FjP2.A06();
                                        path2 = this.A0E;
                                        path2.set(pathA065);
                                        path2.transform(matrix2);
                                        paint4 = paint5;
                                        paint5.setAlpha((int) (abstractC8724FjP3.A06().intValue() * 2.55f));
                                    }
                                    canvas.drawPath(path2, paint4);
                                    canvas.restore();
                                } else {
                                    if (i4 == 0) {
                                        paint5.setColor(-16777216);
                                        paint5.setAlpha(255);
                                        canvas.drawRect(rectF, paint5);
                                    }
                                    if (c8693Fit2.A03) {
                                        paint3 = this.A0D;
                                        canvas.saveLayer(rectF, paint3);
                                        canvas.drawRect(rectF, paint5);
                                        paint3.setAlpha((int) (abstractC8724FjP3.A06().intValue() * 2.55f));
                                        Path pathA0642 = abstractC8724FjP2.A06();
                                        Path path42 = this.A0E;
                                        path42.set(pathA0642);
                                        path42.transform(matrix2);
                                        canvas.drawPath(path42, paint3);
                                        canvas.restore();
                                    } else {
                                        Path pathA066 = abstractC8724FjP2.A06();
                                        path = this.A0E;
                                        path.set(pathA066);
                                        path.transform(matrix2);
                                        paint2 = this.A0D;
                                        canvas.drawPath(path, paint2);
                                    }
                                }
                            } else if (!list3.isEmpty()) {
                                while (true) {
                                    if (i2 >= list4.size()) {
                                        paint5.setAlpha(255);
                                        canvas.drawRect(rectF, paint5);
                                        break;
                                    }
                                    i2 = list4.get(i2).A02 == C79.A0K ? i2 + 1 : 0;
                                }
                            }
                            i4++;
                        }
                        canvas.restore();
                    }
                }
                if (this.A04 != null) {
                    canvas.saveLayer(rectF, this.A0Q);
                    A01(canvas);
                    this.A04.A9E(canvas, matrix, iIntValue);
                    canvas.restore();
                }
                canvas.restore();
            }
            if (!this.A09 || (paint = this.A07) == null) {
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            this.A07.setColor(-251901);
            this.A07.setStrokeWidth(4.0f);
            canvas.drawRect(rectF, this.A07);
            this.A07.setStyle(Paint.Style.FILL);
            this.A07.setColor(1357638635);
            canvas.drawRect(rectF, this.A07);
        }
    }

    public void AD3(Matrix matrix, RectF rectF, boolean z) {
        this.A0H.set(0.0f, 0.0f, 0.0f, 0.0f);
        A00();
        Matrix matrix2 = this.A0A;
        matrix2.set(matrix);
        if (z) {
            List<AbstractC8671FiX> list = this.A08;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        matrix2.preConcat(this.A08.get(size).A0K.A00());
                    }
                }
            } else {
                AbstractC8671FiX abstractC8671FiX = this.A05;
                if (abstractC8671FiX != null) {
                    matrix2.preConcat(abstractC8671FiX.A0K.A00());
                }
            }
        }
        matrix2.preConcat(this.A0K.A00());
    }

    @Override // X.InterfaceC8793FkY
    public final void AX2() {
        this.A0J.invalidateSelf();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FiV;ILjava/util/List<LX/FiV;>;LX/FiV;)V */
    @Override // X.InterfaceC8663FiO
    public final void AbZ(C8669FiV c8669FiV, C8669FiV c8669FiV2, List list, int i) {
        AbstractC8671FiX abstractC8671FiX = this.A04;
        if (abstractC8671FiX != null) {
            String str = abstractC8671FiX.A0L.A0J;
            C8669FiV c8669FiV3 = new C8669FiV(c8669FiV2);
            c8669FiV3.A01.add(str);
            if (c8669FiV.A01(this.A04.A0L.A0J, i)) {
                AbstractC8671FiX abstractC8671FiX2 = this.A04;
                C8669FiV c8669FiV4 = new C8669FiV(c8669FiV3);
                c8669FiV4.A00 = abstractC8671FiX2;
                list.add(c8669FiV4);
            }
            if (c8669FiV.A03(this.A0L.A0J, i)) {
                this.A04.A08(c8669FiV, c8669FiV3, list, c8669FiV.A00(this.A04.A0L.A0J, i) + i);
            }
        }
        String str2 = this.A0L.A0J;
        if (c8669FiV.A02(str2, i)) {
            if (!"__container".equals(str2)) {
                C8669FiV c8669FiV5 = new C8669FiV(c8669FiV2);
                c8669FiV5.A01.add(str2);
                c8669FiV2 = c8669FiV5;
                if (c8669FiV.A01(str2, i)) {
                    C8669FiV c8669FiV6 = new C8669FiV(c8669FiV5);
                    c8669FiV6.A00 = this;
                    list.add(c8669FiV6);
                }
            }
            if (c8669FiV.A03(str2, i)) {
                A08(c8669FiV, c8669FiV2, list, i + c8669FiV.A00(str2, i));
            }
        }
    }

    @Override // X.InterfaceC8698Fiy
    public final String getName() {
        return this.A0L.A0J;
    }

    public AbstractC8671FiX(C8659FiK c8659FiK, C8675Fib c8675Fib) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        HrG hrG = new HrG(1);
        AbstractC7607F5u.A1H(hrG, mode);
        this.A0C = hrG;
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        HrG hrG2 = new HrG(1);
        AbstractC7607F5u.A1H(hrG2, mode2);
        this.A0D = hrG2;
        HrG hrG3 = new HrG(1);
        this.A0Q = hrG3;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        HrG hrG4 = new HrG();
        AbstractC7607F5u.A1H(hrG4, mode3);
        this.A0P = hrG4;
        this.A0H = AbstractC7607F5u.A0Y();
        this.A0R = AbstractC7607F5u.A0Y();
        this.A0F = AbstractC7607F5u.A0Y();
        this.A0G = AbstractC7607F5u.A0Y();
        this.A0I = AbstractC7607F5u.A0Y();
        this.A0A = BV4.A08();
        this.A0M = C3cG.A0h();
        this.A06 = true;
        this.A00 = 0.0f;
        this.A0J = c8659FiK;
        this.A0L = c8675Fib;
        AbstractC7607F5u.A1H(hrG3, c8675Fib.A0I == C79.A0C ? PorterDuff.Mode.DST_OUT : PorterDuff.Mode.DST_IN);
        C8701Fj1 c8701Fj1 = new C8701Fj1(c8675Fib.A0D);
        this.A0K = c8701Fj1;
        c8701Fj1.A02(this);
        List<C8693Fit> list = c8675Fib.A0M;
        if (list != null && !list.isEmpty()) {
            C8680Fig c8680Fig = new C8680Fig(list);
            this.A03 = c8680Fig;
            Iterator<AbstractC8724FjP<C10447Hid, Path>> it = c8680Fig.A00.iterator();
            while (it.hasNext()) {
                it.next().A09(this);
            }
            for (AbstractC8724FjP<Integer, Integer> abstractC8724FjP : this.A03.A02) {
                A07(abstractC8724FjP);
                abstractC8724FjP.A09(this);
            }
        }
        List<C8725FjQ<Float>> list2 = this.A0L.A0L;
        if (list2.isEmpty()) {
            if (true != this.A06) {
                this.A06 = true;
                this.A0J.invalidateSelf();
                return;
            }
            return;
        }
        C8720FjL c8720FjL = new C8720FjL(list2);
        this.A02 = c8720FjL;
        c8720FjL.A04 = true;
        c8720FjL.A09(new InterfaceC8793FkY() { // from class: X.Fil
            @Override // X.InterfaceC8793FkY
            public final void AX2() {
                AbstractC8671FiX abstractC8671FiX = this.A00;
                boolean zA1M = AnonymousClass002.A1M((abstractC8671FiX.A02.A0B() > 1.0f ? 1 : (abstractC8671FiX.A02.A0B() == 1.0f ? 0 : -1)));
                if (zA1M != abstractC8671FiX.A06) {
                    abstractC8671FiX.A06 = zA1M;
                    abstractC8671FiX.A0J.invalidateSelf();
                }
            }
        });
        boolean z = AbstractC8724FjP.A02(this.A02) == 1.0f;
        if (z != this.A06) {
            this.A06 = z;
            this.A0J.invalidateSelf();
        }
        A07(this.A02);
    }

    @Override // X.InterfaceC8698Fiy
    public final void AdB(List<InterfaceC8698Fiy> list, List<InterfaceC8698Fiy> list2) {
    }
}
