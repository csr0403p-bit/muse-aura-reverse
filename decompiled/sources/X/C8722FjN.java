package X;

import android.graphics.PointF;

/* renamed from: X.FjN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8722FjN extends AbstractC10522Hop<Integer> {
    public static final int A00(C8722FjN c8722FjN, C8725FjQ c8725FjQ, float f) {
        T t;
        Number number;
        T t2 = c8725FjQ.A0E;
        if (t2 == 0 || (t = c8725FjQ.A07) == 0) {
            throw C3cG.A0Q("Missing values for keyframe.");
        }
        C8682Fii<A> c8682Fii = c8722FjN.A03;
        if (c8682Fii != 0 && (number = (Number) c8682Fii.A01(t2, t, c8725FjQ.A0A, c8725FjQ.A06.floatValue(), f, c8722FjN.A05(), c8722FjN.A02)) != null) {
            return number.intValue();
        }
        int iA0F = c8725FjQ.A03;
        if (iA0F == 784923401) {
            iA0F = AnonymousClass001.A0F(t2);
            c8725FjQ.A03 = iA0F;
        }
        int iA0F2 = c8725FjQ.A02;
        if (iA0F2 == 784923401) {
            iA0F2 = AnonymousClass001.A0F(c8725FjQ.A07);
            c8725FjQ.A02 = iA0F2;
        }
        PointF pointF = AbstractC8699Fiz.A00;
        return (int) (iA0F + (f * (iA0F2 - iA0F)));
    }
}
