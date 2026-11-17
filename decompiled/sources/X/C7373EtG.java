package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.EtG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7373EtG extends C06G implements HCX {
    public final float A00;
    public final long A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7373EtG) {
                C7373EtG c7373EtG = (C7373EtG) obj;
                if (this.A02 != c7373EtG.A02 || this.A01 != c7373EtG.A01 || Float.compare(this.A00, c7373EtG.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass006.A06(this.A01, AnonymousClass005.A07(this.A02)) + Float.floatToIntBits(this.A00);
    }

    public C7373EtG(long j, long j2, float f) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = f;
    }

    @Override // X.HCX
    public final void A9F(Canvas canvas, Paint paint) {
        AnonymousClass003.A0u(canvas, paint);
        long j = this.A02;
        RectF rectFA0P = BV8.A0P(AnonymousClass001.A00(j), AnonymousClass004.A00(j), this.A01);
        float f = this.A00;
        canvas.drawRoundRect(rectFA0P, f, f, paint);
    }
}
