package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: X.FjQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8725FjQ<T> {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public PointF A04;
    public PointF A05;
    public Float A06;
    public T A07;
    public float A08;
    public float A09;
    public final float A0A;
    public final Interpolator A0B;
    public final Interpolator A0C;
    public final Interpolator A0D;
    public final T A0E;
    public final C6837Eap A0F;

    public final float A00() {
        C6837Eap c6837Eap = this.A0F;
        if (c6837Eap == null) {
            return 1.0f;
        }
        float f = this.A08;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        Float f2 = this.A06;
        if (f2 == null) {
            this.A08 = 1.0f;
            return 1.0f;
        }
        float fA01 = A01() + ((f2.floatValue() - this.A0A) / (c6837Eap.A00 - c6837Eap.A03));
        this.A08 = fA01;
        return fA01;
    }

    public final float A01() {
        C6837Eap c6837Eap = this.A0F;
        if (c6837Eap == null) {
            return 0.0f;
        }
        float f = this.A09;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        float f2 = this.A0A;
        float f3 = c6837Eap.A03;
        float f4 = (f2 - f3) / (c6837Eap.A00 - f3);
        this.A09 = f4;
        return f4;
    }

    public final boolean A02() {
        return this.A0B == null && this.A0C == null && this.A0D == null;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Keyframe{startValue=");
        sbA0x.append(this.A0E);
        sbA0x.append(", endValue=");
        sbA0x.append(this.A07);
        sbA0x.append(", startFrame=");
        sbA0x.append(this.A0A);
        sbA0x.append(", endFrame=");
        sbA0x.append(this.A06);
        sbA0x.append(", interpolator=");
        sbA0x.append(this.A0B);
        return C8j3.A15(sbA0x);
    }

    public C8725FjQ(T t) {
        this.A01 = -3987645.8f;
        this.A00 = -3987645.8f;
        this.A03 = 784923401;
        this.A02 = 784923401;
        this.A09 = Float.MIN_VALUE;
        this.A08 = Float.MIN_VALUE;
        this.A04 = null;
        this.A05 = null;
        this.A0F = null;
        this.A0E = t;
        this.A07 = t;
        this.A0B = null;
        this.A0C = null;
        this.A0D = null;
        this.A0A = Float.MIN_VALUE;
        this.A06 = Float.valueOf(Float.MAX_VALUE);
    }

    public C8725FjQ(T t, T t2) {
        this.A01 = -3987645.8f;
        this.A00 = -3987645.8f;
        this.A03 = 784923401;
        this.A02 = 784923401;
        this.A09 = Float.MIN_VALUE;
        this.A08 = Float.MIN_VALUE;
        this.A04 = null;
        this.A05 = null;
        this.A0F = null;
        this.A0E = t;
        this.A07 = t2;
        this.A0B = null;
        this.A0C = null;
        this.A0D = null;
        this.A0A = Float.MIN_VALUE;
        this.A06 = Float.valueOf(Float.MAX_VALUE);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Eap;TT;TT;Landroid/view/animation/Interpolator;Landroid/view/animation/Interpolator;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public C8725FjQ(Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, C6837Eap c6837Eap, Float f, Object obj, Object obj2, float f2) {
        this.A01 = -3987645.8f;
        this.A00 = -3987645.8f;
        this.A03 = 784923401;
        this.A02 = 784923401;
        this.A09 = Float.MIN_VALUE;
        this.A08 = Float.MIN_VALUE;
        this.A04 = null;
        this.A05 = null;
        this.A0F = c6837Eap;
        this.A0E = obj;
        this.A07 = obj2;
        this.A0B = interpolator;
        this.A0C = interpolator2;
        this.A0D = interpolator3;
        this.A0A = f2;
        this.A06 = f;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Eap;TT;TT;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public C8725FjQ(Interpolator interpolator, C6837Eap c6837Eap, Float f, Object obj, Object obj2, float f2) {
        this.A01 = -3987645.8f;
        this.A00 = -3987645.8f;
        this.A03 = 784923401;
        this.A02 = 784923401;
        this.A09 = Float.MIN_VALUE;
        this.A08 = Float.MIN_VALUE;
        this.A04 = null;
        this.A05 = null;
        this.A0F = c6837Eap;
        this.A0E = obj;
        this.A07 = obj2;
        this.A0B = interpolator;
        this.A0C = null;
        this.A0D = null;
        this.A0A = f2;
        this.A06 = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8725FjQ(Interpolator interpolator, Interpolator interpolator2, C6837Eap c6837Eap, Object obj, Object obj2, float f) {
        this.A01 = -3987645.8f;
        this.A00 = -3987645.8f;
        this.A03 = 784923401;
        this.A02 = 784923401;
        this.A09 = Float.MIN_VALUE;
        this.A08 = Float.MIN_VALUE;
        this.A04 = null;
        this.A05 = null;
        this.A0F = c6837Eap;
        this.A0E = obj;
        this.A07 = obj2;
        this.A0B = null;
        this.A0C = interpolator;
        this.A0D = interpolator2;
        this.A0A = f;
        this.A06 = null;
    }
}
