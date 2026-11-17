package X;

import android.util.Rational;
import java.util.Comparator;

/* loaded from: classes5.dex */
public final class BZT implements Comparator<Rational> {
    public final Rational A00;

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Rational rational, Rational rational2) {
        Rational rational3 = rational2;
        Rational rational4 = this.A00;
        float fFloatValue = rational.floatValue();
        float fFloatValue2 = rational4.floatValue();
        float f = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
        float fFloatValue3 = rational3.floatValue();
        float fFloatValue4 = rational4.floatValue();
        return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f);
    }

    public BZT(Rational rational) {
        this.A00 = rational;
    }
}
