package X;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes5.dex */
public final class F4K implements EYY {
    public final int $t;
    public final Object A00;

    public F4K(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.EYY
    public final <T> AbstractC6735EXt<T> create(EYC eyc, C6753EYn<T> c6753EYn) {
        Class<? super T> cls;
        int i = this.$t;
        Class<? super T> cls2 = c6753EYn.A01;
        switch (i) {
            case 0:
                cls = Number.class;
                break;
            case 1:
                if (cls2 == Object.class) {
                    return new C6740EXz(eyc, (EY0) this.A00);
                }
                return null;
            default:
                if (cls2 != Calendar.class) {
                    cls = GregorianCalendar.class;
                    break;
                }
                return (AbstractC6735EXt) this.A00;
        }
        if (cls2 != cls) {
            return null;
        }
        return (AbstractC6735EXt) this.A00;
    }

    public final String toString() {
        if (2 - this.$t != 0) {
            return super.toString();
        }
        StringBuilder sbA0x = C60O.A0x("Factory[type=");
        BV6.A18(Calendar.class, sbA0x);
        sbA0x.append("+");
        BV6.A18(GregorianCalendar.class, sbA0x);
        sbA0x.append(",adapter=");
        return BV8.A0u(this.A00, sbA0x);
    }
}
