package X;

import android.graphics.PointF;

/* loaded from: classes6.dex */
public final class HjF {
    public final PointF A00;
    public final PointF A01;
    public final PointF A02;

    public final String toString() {
        PointF pointF = this.A02;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.A00;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.A01;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public HjF() {
        this.A00 = new PointF();
        this.A01 = new PointF();
        this.A02 = new PointF();
    }

    public HjF(PointF pointF, PointF pointF2, PointF pointF3) {
        this.A00 = pointF;
        this.A01 = pointF2;
        this.A02 = pointF3;
    }
}
