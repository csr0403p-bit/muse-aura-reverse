package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes6.dex */
public final class HyK extends C06G implements HCX {
    public final long A00;
    public final long A01;

    @Override // X.HCX
    public final void A9F(Canvas canvas, Paint paint) {
        AnonymousClass003.A0u(canvas, paint);
        long j = this.A01;
        float fA00 = AnonymousClass001.A00(j);
        float fA002 = AnonymousClass004.A00(j);
        long j2 = this.A00;
        canvas.drawLine(fA00, fA002, AnonymousClass001.A00(j2), AnonymousClass004.A00(j2), paint);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HyK) {
                HyK hyK = (HyK) obj;
                if (this.A01 != hyK.A01 || this.A00 != hyK.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A0B(this.A00, AnonymousClass005.A07(this.A01));
    }

    public HyK(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
