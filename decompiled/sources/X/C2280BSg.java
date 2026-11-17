package X;

import java.util.List;

/* renamed from: X.BSg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2280BSg implements Ht9, G0V {
    public final int $t;

    public C2280BSg(int i) {
        this.$t = i;
    }

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        boolean zAreEqual;
        switch (this.$t) {
            case 0:
                return new ANU(AbstractC1011APs.A04(new C1003AOr(null, 1.0f, 1600.0f), 0.0f), AbstractC1011APs.A0F(new C1003AOr(null, 1.0f, 400.0f), 0.7f, C15k.A01), new ANS(BUR.A00(0), true), 0.0f);
            case 1:
            case 2:
            case 7:
            case 8:
                AK6 ak6 = (AK6) obj2;
                C7384Etj.A0Y(ak6, 1);
                zAreEqual = C7384Etj.areEqual(obj, ak6.A02);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                zAreEqual = C7384Etj.areEqual(obj, obj2);
                break;
            case 9:
            case 10:
            case 13:
            case 14:
                AK6 ak62 = (AK6) obj;
                AK6 ak63 = (AK6) obj2;
                AnonymousClass003.A0u(ak62, ak63);
                zAreEqual = C7384Etj.areEqual(ak62.A02, ak63.A02);
                break;
            case 11:
            case 12:
            case 15:
            case 16:
                AK6 ak64 = (AK6) obj;
                C7384Etj.A0Y(ak64, 0);
                zAreEqual = C7384Etj.areEqual(ak64.A02, obj2);
                break;
            case 17:
            case 18:
            case 19:
            case 20:
                return AnonymousClass001.A0i();
            case 21:
                C9uG c9uG = (C9uG) obj;
                List list = (List) obj2;
                C9uC<? extends Object> c9uC = C9u9.A00;
                AnonymousClass003.A0u(c9uG, list);
                return C9u8.A01(C9u8.A00(list, AbstractC2260BKq.A00), C2293BSt.A00(list, 43), c9uG);
            case 22:
                C9uG c9uG2 = (C9uG) obj;
                List list2 = (List) obj2;
                C9uC<? extends Object> c9uC2 = C9u9.A00;
                AnonymousClass003.A0u(c9uG2, list2);
                C9hr c9hrA01 = C9u8.A01(C9u8.A00(list2, AbstractC2260BKq.A00), C2293BSt.A00(list2, 44), c9uG2);
                if (c9hrA01 != null) {
                    return AbstractC07749im.A00(c9hrA01);
                }
                return null;
            default:
                return null;
        }
        return Boolean.valueOf(zAreEqual);
    }
}
