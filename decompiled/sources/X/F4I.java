package X;

import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes5.dex */
public final class F4I extends AbstractC6735EXt {
    public final int $t;
    public final Object A00;

    public F4I(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.util.concurrent.atomic.AtomicLong] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.Float] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Double] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.util.concurrent.atomic.AtomicLongArray] */
    @Override // X.AbstractC6735EXt
    public final /* bridge */ /* synthetic */ T read(EY1 ey1) throws MalformedJsonException {
        switch (this.$t) {
            case 0:
                if (ey1.A0R() != C79.A0Z) {
                    return Double.valueOf(ey1.A0N());
                }
                break;
            case 1:
                if (ey1.A0R() != C79.A0Z) {
                    return Float.valueOf((float) ey1.A0N());
                }
                break;
            case 2:
                return BV4.A14(C3cG.A05(((AbstractC6735EXt) this.A00).read(ey1)));
            case 3:
                ArrayList arrayListA0h = C3cG.A0h();
                ey1.A0W();
                while (ey1.A0c()) {
                    BV6.A1R(arrayListA0h, C3cG.A05(((AbstractC6735EXt) this.A00).read(ey1)));
                }
                ey1.A0Y();
                int size = arrayListA0h.size();
                ?? atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, C3cG.A05(arrayListA0h.get(i)));
                }
                return atomicLongArray;
            default:
                ey1.A0b();
                return null;
        }
        ey1.A0a();
        return null;
    }

    public final String toString() {
        return 4 - this.$t != 0 ? super.toString() : "AnonymousOrNonStaticLocalClassAdapter";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC6735EXt
    public final /* bridge */ /* synthetic */ void write(C6733EXr c6733EXr, T t) throws IOException {
        switch (this.$t) {
            case 0:
                Number number = (Number) t;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    EY0 ey0 = EYC.A0H;
                    if (!Double.isNaN(dDoubleValue) && !Double.isInfinite(dDoubleValue)) {
                        c6733EXr.A0C(dDoubleValue);
                        return;
                    } else {
                        StringBuilder sbA0w = C60O.A0w();
                        sbA0w.append(dDoubleValue);
                        throw C8j3.A0w(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.", sbA0w);
                    }
                }
                break;
            case 1:
                Number numberValueOf = (Number) t;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    double d = fFloatValue;
                    EY0 ey02 = EYC.A0H;
                    if (Double.isNaN(d) || Double.isInfinite(d)) {
                        StringBuilder sbA0w2 = C60O.A0w();
                        sbA0w2.append(d);
                        throw C8j3.A0w(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.", sbA0w2);
                    }
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    c6733EXr.A0F(numberValueOf);
                    return;
                }
                break;
            case 2:
                ((AbstractC6735EXt) this.A00).write(c6733EXr, Long.valueOf(((AtomicLong) t).get()));
                return;
            case 3:
                AtomicLongArray atomicLongArray = (AtomicLongArray) t;
                c6733EXr.A07();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    ((AbstractC6735EXt) this.A00).write(c6733EXr, Long.valueOf(atomicLongArray.get(i)));
                }
                c6733EXr.A09();
                return;
        }
        c6733EXr.A0B();
    }
}
