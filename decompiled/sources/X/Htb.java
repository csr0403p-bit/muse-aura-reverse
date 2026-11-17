package X;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes6.dex */
public final class Htb extends AbstractC8671FiX {
    public AbstractC8724FjP<ColorFilter, ColorFilter> A00;
    public AbstractC8724FjP<Bitmap, Bitmap> A01;
    public final Paint A02;
    public final Rect A03;
    public final Rect A04;
    public final C6840Eas A05;

    public Htb(C8659FiK c8659FiK, C8675Fib c8675Fib) {
        super(c8659FiK, c8675Fib);
        this.A02 = new HrG(3);
        this.A04 = AbstractC7607F5u.A0X();
        this.A03 = AbstractC7607F5u.A0X();
        String str = c8675Fib.A0K;
        C6837Eap c6837Eap = c8659FiK.A0C;
        this.A05 = c6837Eap == null ? null : c6837Eap.A01().get(str);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;LX/Fii<TT;>;)V */
    @Override // X.AbstractC8671FiX, X.InterfaceC8663FiO
    public final void A41(C8682Fii c8682Fii, Object obj) {
        super.A41(c8682Fii, obj);
        if (obj != InterfaceC8702Fj2.A01) {
            if (obj == InterfaceC8702Fj2.A00) {
                this.A01 = c8682Fii != null ? C8730FjV.A00(c8682Fii) : null;
            }
        } else if (c8682Fii == null) {
            this.A00 = null;
        } else {
            this.A00 = new C8730FjV(c8682Fii, null);
        }
    }

    @Override // X.AbstractC8671FiX, X.InterfaceC8694Fiu
    public final void AD3(Matrix matrix, RectF rectF, boolean z) {
        super.AD3(matrix, rectF, z);
        if (this.A05 != null) {
            float fA00 = AbstractC8712FjD.A00();
            rectF.set(0.0f, 0.0f, r1.A02 * fA00, r1.A01 * fA00);
            this.A0A.mapRect(rectF);
        }
    }
}
