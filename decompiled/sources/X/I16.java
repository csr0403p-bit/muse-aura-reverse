package X;

import kotlin.Unit;

/* loaded from: classes6.dex */
public final class I16 implements Ht9, G0V {
    public final int $t;

    public I16(int i) {
        this.$t = i;
    }

    public static Double A00(Object obj, Object obj2) {
        Double d = (Double) obj;
        C7384Etj.A0Y(obj2, 0);
        return d;
    }

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        boolean zA1S;
        int iIntValue;
        Number number;
        switch (this.$t) {
            case 0:
                C8978Fvd c8978Fvd = (C8978Fvd) obj;
                double dA00 = BV6.A00(obj2);
                C7384Etj.A0Y(c8978Fvd, 0);
                c8978Fvd.A0G = Integer.valueOf(Ab3.A00(dA00));
                return Unit.INSTANCE;
            case 1:
                C8978Fvd c8978Fvd2 = (C8978Fvd) obj;
                c8978Fvd2.A06 = A00(obj2, c8978Fvd2);
                return Unit.INSTANCE;
            case 2:
                C8978Fvd c8978Fvd3 = (C8978Fvd) obj;
                double dA002 = BV6.A00(obj2);
                C7384Etj.A0Y(c8978Fvd3, 0);
                c8978Fvd3.A0F = Integer.valueOf(Ab3.A00(dA002));
                return Unit.INSTANCE;
            case 3:
                C8978Fvd c8978Fvd4 = (C8978Fvd) obj;
                c8978Fvd4.A09 = A00(obj2, c8978Fvd4);
                return Unit.INSTANCE;
            case 4:
                C8978Fvd c8978Fvd5 = (C8978Fvd) obj;
                c8978Fvd5.A0A = A00(obj2, c8978Fvd5);
                return Unit.INSTANCE;
            case 5:
                C8978Fvd c8978Fvd6 = (C8978Fvd) obj;
                c8978Fvd6.A0C = A00(obj2, c8978Fvd6);
                return Unit.INSTANCE;
            case 6:
                C8978Fvd c8978Fvd7 = (C8978Fvd) obj;
                c8978Fvd7.A08 = A00(obj2, c8978Fvd7);
                return Unit.INSTANCE;
            case 7:
                C8978Fvd c8978Fvd8 = (C8978Fvd) obj;
                c8978Fvd8.A0E = A00(obj2, c8978Fvd8);
                return Unit.INSTANCE;
            case 8:
                C8978Fvd c8978Fvd9 = (C8978Fvd) obj;
                c8978Fvd9.A02 = A00(obj2, c8978Fvd9);
                return Unit.INSTANCE;
            case 9:
                C8978Fvd c8978Fvd10 = (C8978Fvd) obj;
                c8978Fvd10.A03 = A00(obj2, c8978Fvd10);
                return Unit.INSTANCE;
            case 10:
                C8978Fvd c8978Fvd11 = (C8978Fvd) obj;
                c8978Fvd11.A07 = A00(obj2, c8978Fvd11);
                return Unit.INSTANCE;
            case 11:
                C8978Fvd c8978Fvd12 = (C8978Fvd) obj;
                c8978Fvd12.A0D = A00(obj2, c8978Fvd12);
                return Unit.INSTANCE;
            case 12:
                C8978Fvd c8978Fvd13 = (C8978Fvd) obj;
                c8978Fvd13.A04 = A00(obj2, c8978Fvd13);
                return Unit.INSTANCE;
            case 13:
                C8978Fvd c8978Fvd14 = (C8978Fvd) obj;
                c8978Fvd14.A05 = A00(obj2, c8978Fvd14);
                return Unit.INSTANCE;
            case 14:
                C8978Fvd c8978Fvd15 = (C8978Fvd) obj;
                c8978Fvd15.A0B = A00(obj2, c8978Fvd15);
                return Unit.INSTANCE;
            case 15:
                C8978Fvd c8978Fvd16 = (C8978Fvd) obj;
                c8978Fvd16.A00 = A00(obj2, c8978Fvd16);
                return Unit.INSTANCE;
            case 16:
                C8978Fvd c8978Fvd17 = (C8978Fvd) obj;
                c8978Fvd17.A01 = A00(obj2, c8978Fvd17);
                return Unit.INSTANCE;
            case 17:
                zA1S = C8j3.A1S(AnonymousClass001.A1X(obj) ? 1 : 0);
                return Boolean.valueOf(zA1S);
            case 18:
                return ((C78T) obj).plus((C78T) obj2);
            case 19:
                zA1S = C7384Etj.areEqual(obj, obj2);
                return Boolean.valueOf(zA1S);
            case 20:
                if (!(obj2 instanceof GC7)) {
                    return obj;
                }
                if (!(obj instanceof Integer) || (number = (Number) obj) == null) {
                    iIntValue = 1;
                } else {
                    iIntValue = number.intValue();
                    if (iIntValue == 0) {
                        return obj2;
                    }
                }
                return Integer.valueOf(iIntValue + 1);
            case 21:
                if (obj != null) {
                    return obj;
                }
                if (obj2 instanceof GC7) {
                    return obj2;
                }
                return null;
            case 22:
                GCB gcb = (GCB) obj;
                C78X c78x = (C78X) obj2;
                if (!(c78x instanceof GC7)) {
                    return gcb;
                }
                GC7<Object> gc7 = (GC7) c78x;
                HnY hnY = (HnY) gc7;
                ThreadLocal<T> threadLocal = hnY.A01;
                Object obj3 = threadLocal.get();
                threadLocal.set(hnY.A00);
                Object[] objArr = gcb.A02;
                int i = gcb.A00;
                objArr[i] = obj3;
                GC7<Object>[] gc7Arr = gcb.A03;
                gcb.A00 = i + 1;
                gc7Arr[i] = gc7;
                return gcb;
            default:
                return null;
        }
    }
}
