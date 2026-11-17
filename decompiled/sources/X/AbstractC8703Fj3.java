package X;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.Fj3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8703Fj3 implements InterfaceC8793FkY, InterfaceC8694Fiu, InterfaceC8792FkW {
    public float A00;
    public AbstractC8724FjP<Float, Float> A01;
    public AbstractC8724FjP<ColorFilter, ColorFilter> A02;
    public C8711FjC A03;
    public final Paint A04;
    public final AbstractC8724FjP<?, Float> A08;
    public final List<AbstractC8724FjP<?, Float>> A09;
    public final float[] A0A;
    public final C8659FiK A0C;
    public final AbstractC8724FjP<?, Integer> A0D;
    public final AbstractC8724FjP<?, Float> A0E;
    public final AbstractC8671FiX A0G;
    public final PathMeasure A07 = new PathMeasure();
    public final Path A05 = AbstractC7607F5u.A0V();
    public final Path A06 = AbstractC7607F5u.A0V();
    public final RectF A0B = AbstractC7607F5u.A0Y();
    public final List<C8771FkA> A0F = C3cG.A0h();

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;LX/Fii<TT;>;)V */
    @Override // X.InterfaceC8663FiO
    public void A41(C8682Fii c8682Fii, Object obj) {
        C8711FjC c8711FjC;
        AbstractC8724FjP abstractC8724FjP;
        C8711FjC c8711FjC2;
        C8711FjC c8711FjC3;
        C8711FjC c8711FjC4;
        C8711FjC c8711FjC5;
        AbstractC8671FiX abstractC8671FiX;
        AbstractC8724FjP<?, ?> abstractC8724FjP2;
        if (obj == InterfaceC8702Fj2.A0c) {
            abstractC8724FjP = this.A0D;
        } else {
            if (obj != InterfaceC8702Fj2.A0P) {
                if (obj == InterfaceC8702Fj2.A01) {
                    AbstractC8724FjP<ColorFilter, ColorFilter> abstractC8724FjP3 = this.A02;
                    if (abstractC8724FjP3 != null) {
                        this.A0G.A0M.remove(abstractC8724FjP3);
                    }
                    if (c8682Fii == null) {
                        this.A02 = null;
                        return;
                    }
                    C8730FjV c8730FjVA00 = C8730FjV.A00(c8682Fii);
                    this.A02 = c8730FjVA00;
                    c8730FjVA00.A09(this);
                    abstractC8671FiX = this.A0G;
                    abstractC8724FjP2 = this.A02;
                } else if (obj == InterfaceC8702Fj2.A0B) {
                    abstractC8724FjP = this.A01;
                    if (abstractC8724FjP == null) {
                        C8730FjV c8730FjVA002 = C8730FjV.A00(c8682Fii);
                        this.A01 = c8730FjVA002;
                        c8730FjVA002.A09(this);
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
            abstractC8724FjP = this.A0E;
        }
        abstractC8724FjP.A0A(c8682Fii);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01a8  */
    @Override // X.InterfaceC8694Fiu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A9E(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8703Fj3.A9E(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // X.InterfaceC8694Fiu
    public final void AD3(Matrix matrix, RectF rectF, boolean z) {
        Path path = this.A05;
        path.reset();
        int i = 0;
        while (true) {
            List<C8771FkA> list = this.A0F;
            if (i >= list.size()) {
                RectF rectF2 = this.A0B;
                path.computeBounds(rectF2, false);
                AbstractC7611F5y.A0f(rectF2, rectF2.left, ((C8720FjL) this.A0E).A0B() / 2.0f);
                rectF.set(rectF2);
                AbstractC7611F5y.A0f(rectF, rectF.left, 1.0f);
                return;
            }
            C8771FkA c8771FkA = list.get(i);
            for (int i2 = 0; i2 < c8771FkA.A01.size(); i2++) {
                InterfaceC8790FkU.A00(matrix, path, c8771FkA.A01, i2);
            }
            i++;
        }
    }

    @Override // X.InterfaceC8793FkY
    public final void AX2() {
        this.A0C.invalidateSelf();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FiK;LX/FiX;Landroid/graphics/Paint$Cap;Landroid/graphics/Paint$Join;FLX/Fk5;LX/Fip;Ljava/util/List<LX/Fip;>;LX/Fip;)V */
    public AbstractC8703Fj3(Paint.Cap cap, Paint.Join join, C8659FiK c8659FiK, C8689Fip c8689Fip, C8689Fip c8689Fip2, C8766Fk5 c8766Fk5, AbstractC8671FiX abstractC8671FiX, List list, float f) {
        HrG hrG = new HrG(1);
        this.A04 = hrG;
        this.A00 = 0.0f;
        this.A0C = c8659FiK;
        this.A0G = abstractC8671FiX;
        hrG.setStyle(Paint.Style.STROKE);
        hrG.setStrokeCap(cap);
        hrG.setStrokeJoin(join);
        hrG.setStrokeMiter(f);
        this.A0D = new C8722FjN(c8766Fk5.A00);
        this.A0E = C8720FjL.A01(c8689Fip);
        this.A08 = c8689Fip2 == null ? null : C8720FjL.A01(c8689Fip2);
        this.A09 = C60Q.A0t(list);
        this.A0A = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.A09.add(new C8720FjL(((AbstractC8731FjW) list.get(i)).A00));
        }
        abstractC8671FiX.A07(this.A0D);
        abstractC8671FiX.A07(this.A0E);
        for (int i2 = 0; i2 < this.A09.size(); i2++) {
            abstractC8671FiX.A07(this.A09.get(i2));
        }
        AbstractC8724FjP<?, Float> abstractC8724FjP = this.A08;
        if (abstractC8724FjP != null) {
            abstractC8671FiX.A07(abstractC8724FjP);
        }
        this.A0D.A09(this);
        this.A0E.A09(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.A09.get(i3).A09(this);
        }
        AbstractC8724FjP<?, Float> abstractC8724FjP2 = this.A08;
        if (abstractC8724FjP2 != null) {
            abstractC8724FjP2.A09(this);
        }
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    @Override // X.InterfaceC8698Fiy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AdB(java.util.List<X.InterfaceC8698Fiy> r8, java.util.List<X.InterfaceC8698Fiy> r9) {
        /*
            r7 = this;
            int r3 = X.C60O.A00(r8)
            r5 = 0
            r6 = r5
        L6:
            if (r3 < 0) goto L1e
            java.lang.Object r2 = r8.get(r3)
            X.Fiy r2 = (X.InterfaceC8698Fiy) r2
            boolean r0 = r2 instanceof X.C8723FjO
            if (r0 == 0) goto L1b
            X.FjO r2 = (X.C8723FjO) r2
            java.lang.Integer r1 = r2.A03
            java.lang.Integer r0 = X.C79.A01
            if (r1 != r0) goto L1b
            r6 = r2
        L1b:
            int r3 = r3 + (-1)
            goto L6
        L1e:
            if (r6 == 0) goto L25
            java.util.List<X.FkY> r0 = r6.A04
            r0.add(r7)
        L25:
            int r4 = X.C60O.A00(r9)
        L29:
            if (r4 < 0) goto L63
            java.lang.Object r3 = r9.get(r4)
            X.Fiy r3 = (X.InterfaceC8698Fiy) r3
            boolean r0 = r3 instanceof X.C8723FjO
            if (r0 == 0) goto L52
            r2 = r3
            X.FjO r2 = (X.C8723FjO) r2
            java.lang.Integer r1 = r2.A03
            java.lang.Integer r0 = X.C79.A01
            if (r1 != r0) goto L52
            if (r5 == 0) goto L45
            java.util.List<X.FkA> r0 = r7.A0F
            r0.add(r5)
        L45:
            X.FkA r5 = new X.FkA
            r5.<init>(r2)
            java.util.List<X.FkY> r0 = r2.A04
            r0.add(r7)
        L4f:
            int r4 = r4 + (-1)
            goto L29
        L52:
            boolean r0 = r3 instanceof X.InterfaceC8790FkU
            if (r0 == 0) goto L4f
            if (r5 != 0) goto L5d
            X.FkA r5 = new X.FkA
            r5.<init>(r6)
        L5d:
            java.util.List<X.FkU> r0 = r5.A01
            r0.add(r3)
            goto L4f
        L63:
            if (r5 == 0) goto L6a
            java.util.List<X.FkA> r0 = r7.A0F
            r0.add(r5)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8703Fj3.AdB(java.util.List, java.util.List):void");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FiV;ILjava/util/List<LX/FiV;>;LX/FiV;)V */
    @Override // X.InterfaceC8663FiO
    public final void AbZ(C8669FiV c8669FiV, C8669FiV c8669FiV2, List list, int i) {
        AbstractC8699Fiz.A02(this, c8669FiV, c8669FiV2, list, i);
    }
}
