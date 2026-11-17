package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.EtI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7374EtI extends C06G implements HCX {
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7374EtI) {
                C7374EtI c7374EtI = (C7374EtI) obj;
                if (this.A01 != c7374EtI.A01 || this.A00 != c7374EtI.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A0B(this.A00, AnonymousClass005.A07(this.A01));
    }

    public C7374EtI(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // X.HCX
    public final void A9F(Canvas canvas, Paint paint) {
        AnonymousClass003.A0u(canvas, paint);
        long j = this.A01;
        canvas.drawOval(BV8.A0P(AnonymousClass001.A00(j), AnonymousClass004.A00(j), this.A00), paint);
    }
}
