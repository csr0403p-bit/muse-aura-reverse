package X;

import android.graphics.PointF;

/* renamed from: X.FjL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8720FjL extends AbstractC10522Hop<Float> {
    /* JADX WARN: Multi-variable type inference failed */
    public static final float A00(C8720FjL c8720FjL, C8725FjQ c8725FjQ, float f) {
        T t;
        Number number;
        T t2 = c8725FjQ.A0E;
        if (t2 == 0 || (t = c8725FjQ.A07) == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C8682Fii<A> c8682Fii = c8720FjL.A03;
        if (c8682Fii != 0 && (number = (Number) c8682Fii.A01(t2, t, c8725FjQ.A0A, c8725FjQ.A06.floatValue(), f, c8720FjL.A05(), c8720FjL.A02)) != null) {
            return number.floatValue();
        }
        float fFloatValue = c8725FjQ.A01;
        if (fFloatValue == -3987645.8f) {
            fFloatValue = ((Number) t2).floatValue();
            c8725FjQ.A01 = fFloatValue;
        }
        float fFloatValue2 = c8725FjQ.A00;
        if (fFloatValue2 == -3987645.8f) {
            fFloatValue2 = ((Number) c8725FjQ.A07).floatValue();
            c8725FjQ.A00 = fFloatValue2;
        }
        PointF pointF = AbstractC8699Fiz.A00;
        return fFloatValue + (f * (fFloatValue2 - fFloatValue));
    }

    public static C8720FjL A01(AbstractC8731FjW abstractC8731FjW) {
        return new C8720FjL(abstractC8731FjW.A00);
    }

    public final float A0B() {
        return A00(this, this.A06.AES(), A04());
    }
}
