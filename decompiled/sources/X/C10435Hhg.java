package X;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.Hhg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10435Hhg extends AbstractC8671FiX {
    public AbstractC8724FjP<Integer, Integer> A00;
    public AbstractC8724FjP<ColorFilter, ColorFilter> A01;
    public final Paint A02;
    public final Path A03;
    public final C8675Fib A04;
    public final float[] A05;
    public final RectF A06;

    public C10435Hhg(C8659FiK c8659FiK, C8675Fib c8675Fib) {
        super(c8659FiK, c8675Fib);
        this.A06 = AbstractC7607F5u.A0Y();
        HrG hrG = new HrG();
        this.A02 = hrG;
        this.A05 = new float[8];
        this.A03 = AbstractC7607F5u.A0V();
        this.A04 = c8675Fib;
        hrG.setAlpha(0);
        AbstractC7607F5u.A1G(hrG);
        hrG.setColor(c8675Fib.A04);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;LX/Fii<TT;>;)V */
    @Override // X.AbstractC8671FiX, X.InterfaceC8663FiO
    public final void A41(C8682Fii c8682Fii, Object obj) {
        super.A41(c8682Fii, obj);
        if (obj == InterfaceC8702Fj2.A01) {
            if (c8682Fii == null) {
                this.A01 = null;
                return;
            } else {
                this.A01 = new C8730FjV(c8682Fii, null);
                return;
            }
        }
        if (obj == InterfaceC8702Fj2.A0a) {
            if (c8682Fii != null) {
                this.A00 = C8730FjV.A00(c8682Fii);
            } else {
                this.A00 = null;
                this.A02.setColor(this.A04.A04);
            }
        }
    }

    @Override // X.AbstractC8671FiX, X.InterfaceC8694Fiu
    public final void AD3(Matrix matrix, RectF rectF, boolean z) {
        super.AD3(matrix, rectF, z);
        RectF rectF2 = this.A06;
        C8675Fib c8675Fib = this.A04;
        rectF2.set(0.0f, 0.0f, c8675Fib.A06, c8675Fib.A05);
        this.A0A.mapRect(rectF2);
        rectF.set(rectF2);
    }
}
