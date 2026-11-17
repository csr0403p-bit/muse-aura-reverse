package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.FjH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8716FjH extends AbstractC10522Hop<PointF> {
    public final PointF A00;

    /* JADX WARN: Multi-variable type inference failed */
    public static final PointF A00(C8716FjH c8716FjH, C8725FjQ c8725FjQ, float f, float f2, float f3) {
        T t;
        PointF pointF;
        T t2 = c8725FjQ.A0E;
        if (t2 == 0 || (t = c8725FjQ.A07) == 0) {
            throw C3cG.A0Q("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) t2;
        PointF pointF3 = (PointF) t;
        C8682Fii<A> c8682Fii = c8716FjH.A03;
        if (c8682Fii != 0 && (pointF = (PointF) c8682Fii.A01(pointF2, pointF3, c8725FjQ.A0A, c8725FjQ.A06.floatValue(), f, c8716FjH.A05(), c8716FjH.A02)) != null) {
            return pointF;
        }
        PointF pointF4 = c8716FjH.A00;
        pointF4.set(AbstractC7607F5u.A01(pointF3.x, pointF2.x, f2), AbstractC7607F5u.A01(pointF3.y, pointF2.y, f3));
        return pointF4;
    }

    public C8716FjH(List<C8725FjQ<PointF>> list) {
        super(list);
        this.A00 = new PointF();
    }
}
