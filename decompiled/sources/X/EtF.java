package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: classes5.dex */
public final class EtF extends C06G implements HCX {
    public final float A00;
    public final float A01;
    public final float A02;
    public final long A03;
    public final boolean A04;

    @Override // X.HCX
    public final void A9F(Canvas canvas, Paint paint) {
        AnonymousClass003.A0u(canvas, paint);
        long j = this.A03;
        float f = this.A01;
        HxE<Float, Float> hxEA00 = AbstractC7425Evf.A00(this.A02, this.A00, this.A04);
        float fA02 = AnonymousClass001.A02(hxEA00.first);
        float fA022 = AnonymousClass001.A02(hxEA00.second);
        float fA03 = AnonymousClass003.A03(j);
        float fA00 = AnonymousClass004.A00(j);
        canvas.drawArc(new RectF(fA03 - f, fA00 - f, fA03 + f, fA00 + f), fA02, fA022, false, paint);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EtF) {
                EtF etF = (EtF) obj;
                if (this.A03 != etF.A03 || Float.compare(this.A01, etF.A01) != 0 || Float.compare(this.A02, etF.A02) != 0 || Float.compare(this.A00, etF.A00) != 0 || this.A04 != etF.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A00(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(C3cI.A01(this.A03), this.A01), this.A02), this.A00), this.A04);
    }

    public EtF(float f, float f2, float f3, long j, boolean z) {
        this.A03 = j;
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A04 = z;
    }
}
