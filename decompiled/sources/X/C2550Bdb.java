package X;

import android.graphics.RectF;
import android.util.Rational;
import java.util.Comparator;

/* renamed from: X.Bdb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2550Bdb implements Comparator<Rational> {
    public final RectF A00;
    public final Rational A01;
    public final Rational A02;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ int compare(android.util.Rational r6, android.util.Rational r7) {
        /*
            r5 = this;
            android.util.Rational r6 = (android.util.Rational) r6
            android.util.Rational r7 = (android.util.Rational) r7
            boolean r0 = r6.equals(r7)
            if (r0 == 0) goto Lc
            r0 = 0
            return r0
        Lc:
            android.graphics.RectF r4 = r5.A01(r6)
            android.graphics.RectF r3 = r5.A01(r7)
            android.graphics.RectF r5 = r5.A00
            float r1 = r4.width()
            float r0 = r5.width()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L2f
            float r1 = r4.height()
            float r0 = r5.height()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1
            if (r0 >= 0) goto L30
        L2f:
            r2 = 0
        L30:
            float r1 = r3.width()
            float r0 = r5.width()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L49
            float r1 = r3.height()
            float r0 = r5.height()
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 1
            if (r1 >= 0) goto L4a
        L49:
            r0 = 0
        L4a:
            if (r2 == 0) goto L69
            if (r0 == 0) goto L67
            float r2 = r4.width()
            float r0 = r4.height()
            float r2 = r2 * r0
            float r1 = r3.width()
            float r0 = r3.height()
            float r1 = r1 * r0
            float r2 = r2 - r1
            float r0 = java.lang.Math.signum(r2)
            int r0 = (int) r0
            return r0
        L67:
            r0 = -1
            return r0
        L69:
            if (r0 == 0) goto L6d
            r0 = 1
            return r0
        L6d:
            float r1 = A00(r4, r5)
            float r0 = A00(r3, r5)
            float r1 = r1 - r0
            float r0 = java.lang.Math.signum(r1)
            int r0 = (int) r0
            int r0 = -r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2550Bdb.compare(java.lang.Object, java.lang.Object):int");
    }

    public C2550Bdb(Rational rational, Rational rational2) {
        this.A02 = rational;
        this.A01 = rational2 == null ? new Rational(4, 3) : rational2;
        this.A00 = A01(rational);
    }

    public static float A00(RectF rectF, RectF rectF2) {
        return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
    }

    private RectF A01(Rational rational) {
        float numerator;
        float denominator;
        float fFloatValue = rational.floatValue();
        Rational rational2 = this.A01;
        if (fFloatValue == rational2.floatValue()) {
            numerator = rational2.getNumerator();
        } else {
            if (rational.floatValue() > rational2.floatValue()) {
                numerator = rational2.getNumerator();
                denominator = (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator();
                return new RectF(0.0f, 0.0f, numerator, denominator);
            }
            numerator = (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator();
        }
        denominator = rational2.getDenominator();
        return new RectF(0.0f, 0.0f, numerator, denominator);
    }
}
