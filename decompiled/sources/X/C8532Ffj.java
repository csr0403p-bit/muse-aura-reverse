package X;

import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: X.Ffj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8532Ffj extends C06G {
    public final PointF A00;
    public final RectF A01;
    public final RectF A02;
    public final RectF A03;
    public final PointF A04;
    public final RectF A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8532Ffj) {
                C8532Ffj c8532Ffj = (C8532Ffj) obj;
                if (!C7384Etj.areEqual(this.A02, c8532Ffj.A02) || !C7384Etj.areEqual(this.A03, c8532Ffj.A03) || !C7384Etj.areEqual(this.A01, c8532Ffj.A01) || !C7384Etj.areEqual(this.A05, c8532Ffj.A05) || !C7384Etj.areEqual(this.A00, c8532Ffj.A00) || !C7384Etj.areEqual(this.A04, c8532Ffj.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A04, AnonymousClass005.A0F(this.A00, AnonymousClass005.A0F(this.A05, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0F(this.A03, AnonymousClass005.A0E(this.A02))))));
    }

    public C8532Ffj(PointF pointF, PointF pointF2, RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4) {
        this.A02 = rectF;
        this.A03 = rectF2;
        this.A01 = rectF3;
        this.A05 = rectF4;
        this.A00 = pointF;
        this.A04 = pointF2;
    }
}
