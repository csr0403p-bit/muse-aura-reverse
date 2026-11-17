package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;

/* renamed from: X.FjB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8710FjB extends AbstractC8703Fj3 {
    public AbstractC8724FjP<ColorFilter, ColorFilter> A00;
    public final AbstractC8724FjP<Integer, Integer> A01;
    public final AbstractC8671FiX A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8710FjB(C8659FiK c8659FiK, C8727FjS c8727FjS, AbstractC8671FiX abstractC8671FiX) {
        int iIntValue = c8727FjS.A05.intValue();
        Paint.Cap cap = iIntValue != 0 ? iIntValue != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iIntValue2 = c8727FjS.A06.intValue();
        super(cap, iIntValue2 != 2 ? iIntValue2 != 0 ? iIntValue2 != 1 ? null : Paint.Join.ROUND : Paint.Join.MITER : Paint.Join.BEVEL, c8659FiK, c8727FjS.A03, c8727FjS.A02, c8727FjS.A04, abstractC8671FiX, c8727FjS.A08, c8727FjS.A00);
        this.A02 = abstractC8671FiX;
        this.A03 = c8727FjS.A07;
        this.A04 = c8727FjS.A09;
        C8717FjI c8717FjI = new C8717FjI(c8727FjS.A01.A00);
        this.A01 = c8717FjI;
        c8717FjI.A09(this);
        abstractC8671FiX.A07(c8717FjI);
    }

    @Override // X.AbstractC8703Fj3, X.InterfaceC8694Fiu
    public final void A9E(Canvas canvas, Matrix matrix, int i) {
        if (this.A04) {
            return;
        }
        Paint paint = super.A04;
        C8717FjI c8717FjI = (C8717FjI) this.A01;
        paint.setColor(C8717FjI.A00(c8717FjI, c8717FjI.A06.AES(), c8717FjI.A04()));
        AbstractC7607F5u.A1I(paint, this.A00);
        super.A9E(canvas, matrix, i);
    }

    @Override // X.InterfaceC8698Fiy
    public final String getName() {
        return this.A03;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;LX/Fii<TT;>;)V */
    @Override // X.AbstractC8703Fj3, X.InterfaceC8663FiO
    public final void A41(C8682Fii c8682Fii, Object obj) {
        super.A41(c8682Fii, obj);
        if (obj == InterfaceC8702Fj2.A0d) {
            this.A01.A0A(c8682Fii);
            return;
        }
        if (obj == InterfaceC8702Fj2.A01) {
            AbstractC8724FjP<ColorFilter, ColorFilter> abstractC8724FjP = this.A00;
            if (abstractC8724FjP != null) {
                this.A02.A0M.remove(abstractC8724FjP);
            }
            if (c8682Fii == null) {
                this.A00 = null;
                return;
            }
            C8730FjV c8730FjVA00 = C8730FjV.A00(c8682Fii);
            this.A00 = c8730FjVA00;
            c8730FjVA00.A09(this);
            this.A02.A07(this.A01);
        }
    }
}
