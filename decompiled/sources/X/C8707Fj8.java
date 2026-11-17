package X;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.Fj8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8707Fj8 implements InterfaceC8790FkU, InterfaceC8793FkY, InterfaceC8792FkW {
    public boolean A00;
    public final C8659FiK A02;
    public final AbstractC8724FjP<?, Float> A06;
    public final AbstractC8724FjP<?, PointF> A07;
    public final AbstractC8724FjP<?, PointF> A08;
    public final String A09;
    public final boolean A0A;
    public final Path A03 = AbstractC7607F5u.A0V();
    public final RectF A04 = AbstractC7607F5u.A0Y();
    public final C8735Fja A05 = new C8735Fja();
    public AbstractC8724FjP<Float, Float> A01 = null;

    @Override // X.InterfaceC8793FkY
    public final void AX2() {
        this.A00 = false;
        this.A02.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    @Override // X.InterfaceC8698Fiy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AdB(java.util.List<X.InterfaceC8698Fiy> r6, java.util.List<X.InterfaceC8698Fiy> r7) {
        /*
            r5 = this;
            r4 = 0
        L1:
            int r0 = r6.size()
            if (r4 >= r0) goto L34
            java.lang.Object r3 = r6.get(r4)
            X.Fiy r3 = (X.InterfaceC8698Fiy) r3
            boolean r0 = r3 instanceof X.C8723FjO
            if (r0 == 0) goto L29
            r2 = r3
            X.FjO r2 = (X.C8723FjO) r2
            java.lang.Integer r1 = r2.A03
            java.lang.Integer r0 = X.C79.A00
            if (r1 != r0) goto L29
            X.Fja r0 = r5.A05
            java.util.List<X.FjO> r0 = r0.A00
            r0.add(r2)
            java.util.List<X.FkY> r0 = r2.A04
            r0.add(r5)
        L26:
            int r4 = r4 + 1
            goto L1
        L29:
            boolean r0 = r3 instanceof X.C8740Fjf
            if (r0 == 0) goto L26
            X.Fjf r3 = (X.C8740Fjf) r3
            X.FjP<java.lang.Float, java.lang.Float> r0 = r3.A01
            r5.A01 = r0
            goto L26
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8707Fj8.AdB(java.util.List, java.util.List):void");
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;LX/Fii<TT;>;)V */
    @Override // X.InterfaceC8663FiO
    public final void A41(C8682Fii c8682Fii, Object obj) {
        AbstractC8724FjP abstractC8724FjP;
        if (obj == InterfaceC8702Fj2.A05) {
            abstractC8724FjP = this.A08;
        } else if (obj == InterfaceC8702Fj2.A04) {
            abstractC8724FjP = this.A07;
        } else if (obj != InterfaceC8702Fj2.A0C) {
            return;
        } else {
            abstractC8724FjP = this.A06;
        }
        abstractC8724FjP.A0A(c8682Fii);
    }

    @Override // X.InterfaceC8790FkU
    public final Path AId() {
        AbstractC8724FjP<Float, Float> abstractC8724FjP;
        boolean z = this.A00;
        Path path = this.A03;
        if (!z) {
            path.reset();
            if (!this.A0A) {
                PointF pointFA06 = this.A08.A06();
                float f = pointFA06.x / 2.0f;
                float f2 = pointFA06.y / 2.0f;
                float fA0B = ((C8720FjL) this.A06).A0B();
                if (fA0B == 0.0f && (abstractC8724FjP = this.A01) != null) {
                    fA0B = Math.min(AbstractC8724FjP.A02(abstractC8724FjP), Math.min(f, f2));
                }
                float fMin = Math.min(f, f2);
                if (fA0B > fMin) {
                    fA0B = fMin;
                }
                PointF pointFA062 = this.A07.A06();
                path.moveTo(pointFA062.x + f, (pointFA062.y - f2) + fA0B);
                path.lineTo(pointFA062.x + f, (pointFA062.y + f2) - fA0B);
                if (fA0B > 0.0f) {
                    RectF rectF = this.A04;
                    float f3 = pointFA062.x + f;
                    float f4 = fA0B * 2.0f;
                    float f5 = pointFA062.y + f2;
                    rectF.set(f3 - f4, f5 - f4, f3, f5);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                }
                path.lineTo((pointFA062.x - f) + fA0B, pointFA062.y + f2);
                if (fA0B > 0.0f) {
                    RectF rectF2 = this.A04;
                    float f6 = pointFA062.x - f;
                    float f7 = pointFA062.y + f2;
                    float f8 = fA0B * 2.0f;
                    rectF2.set(f6, f7 - f8, f8 + f6, f7);
                    path.arcTo(rectF2, 90.0f, 90.0f, false);
                }
                path.lineTo(pointFA062.x - f, (pointFA062.y - f2) + fA0B);
                if (fA0B > 0.0f) {
                    RectF rectF3 = this.A04;
                    float f9 = pointFA062.x - f;
                    float f10 = pointFA062.y - f2;
                    float f11 = fA0B * 2.0f;
                    rectF3.set(f9, f10, f9 + f11, f11 + f10);
                    path.arcTo(rectF3, 180.0f, 90.0f, false);
                }
                path.lineTo((pointFA062.x + f) - fA0B, pointFA062.y - f2);
                if (fA0B > 0.0f) {
                    RectF rectF4 = this.A04;
                    float f12 = pointFA062.x + f;
                    float f13 = fA0B * 2.0f;
                    float f14 = pointFA062.y - f2;
                    rectF4.set(f12 - f13, f14, f12, f14 + f13);
                    path.arcTo(rectF4, 270.0f, 90.0f, false);
                }
                path.close();
                this.A05.A00(path);
            }
            this.A00 = true;
        }
        return path;
    }

    @Override // X.InterfaceC8698Fiy
    public final String getName() {
        return this.A09;
    }

    public C8707Fj8(C8659FiK c8659FiK, C8729FjU c8729FjU, AbstractC8671FiX abstractC8671FiX) {
        this.A09 = c8729FjU.A03;
        this.A0A = c8729FjU.A04;
        this.A02 = c8659FiK;
        AbstractC8724FjP<PointF, PointF> abstractC8724FjPA7a = c8729FjU.A01.A7a();
        this.A07 = abstractC8724FjPA7a;
        AbstractC8724FjP<PointF, PointF> abstractC8724FjPA7a2 = c8729FjU.A02.A7a();
        this.A08 = abstractC8724FjPA7a2;
        C8720FjL c8720FjLA01 = C8720FjL.A01(c8729FjU.A00);
        this.A06 = c8720FjLA01;
        abstractC8671FiX.A07(abstractC8724FjPA7a);
        abstractC8671FiX.A07(abstractC8724FjPA7a2);
        abstractC8671FiX.A07(c8720FjLA01);
        abstractC8724FjPA7a.A09(this);
        abstractC8724FjPA7a2.A09(this);
        c8720FjLA01.A09(this);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FiV;ILjava/util/List<LX/FiV;>;LX/FiV;)V */
    @Override // X.InterfaceC8663FiO
    public final void AbZ(C8669FiV c8669FiV, C8669FiV c8669FiV2, List list, int i) {
        AbstractC8699Fiz.A02(this, c8669FiV, c8669FiV2, list, i);
    }
}
