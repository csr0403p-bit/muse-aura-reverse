package X;

import android.graphics.PointF;

/* renamed from: X.FjI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8717FjI extends AbstractC10522Hop<Integer> {
    public static final int A00(C8717FjI c8717FjI, C8725FjQ c8725FjQ, float f) {
        T t;
        Float f2;
        Number number;
        T t2 = c8725FjQ.A0E;
        if (t2 == 0 || (t = c8725FjQ.A07) == 0) {
            throw C3cG.A0Q("Missing values for keyframe.");
        }
        C8682Fii<A> c8682Fii = c8717FjI.A03;
        if (c8682Fii != 0 && (f2 = c8725FjQ.A06) != null && (number = (Number) c8682Fii.A01(t2, t, c8725FjQ.A0A, f2.floatValue(), f, c8717FjI.A05(), c8717FjI.A02)) != null) {
            return number.intValue();
        }
        PointF pointF = AbstractC8699Fiz.A00;
        return AbstractC8787FkR.A02(BV7.A01(1.0f, f, 0.0f), AnonymousClass001.A0F(t2), AnonymousClass001.A0F(c8725FjQ.A07));
    }
}
