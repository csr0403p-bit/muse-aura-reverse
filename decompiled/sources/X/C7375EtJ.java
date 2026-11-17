package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.EtJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7375EtJ extends C06G implements HCX {
    public final float A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7375EtJ) {
                C7375EtJ c7375EtJ = (C7375EtJ) obj;
                if (this.A01 != c7375EtJ.A01 || Float.compare(this.A00, c7375EtJ.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C3cI.A01(this.A01) + Float.floatToIntBits(this.A00);
    }

    public C7375EtJ(long j, float f) {
        this.A01 = j;
        this.A00 = f;
    }

    @Override // X.HCX
    public final void A9F(Canvas canvas, Paint paint) {
        AnonymousClass003.A0u(canvas, paint);
        long j = this.A01;
        canvas.drawCircle(AnonymousClass003.A03(j), AnonymousClass004.A00(j), this.A00, paint);
    }
}
