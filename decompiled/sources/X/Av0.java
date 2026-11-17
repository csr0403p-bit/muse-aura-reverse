package X;

import java.util.List;

/* loaded from: classes4.dex */
public abstract class Av0 {
    public static final int A00(List<C1960Auz> list, int i) {
        StringBuilder sbA0y;
        int i2;
        int i3 = ((C1960Auz) AbstractC0878AGe.A0H(list)).A04;
        if (i <= ((C1960Auz) AbstractC0878AGe.A0H(list)).A04) {
            int size = list.size() - 1;
            int i4 = 0;
            while (true) {
                if (i4 > size) {
                    i2 = -(i4 + 1);
                    break;
                }
                i2 = (i4 + size) >>> 1;
                C1960Auz c1960AuzA0i = C8j3.A0i(list, i2);
                if (c1960AuzA0i.A05 <= i) {
                    if (c1960AuzA0i.A04 > i) {
                        break;
                    }
                    i4 = i2 + 1;
                } else {
                    size = i2 - 1;
                }
            }
            if (i2 >= 0 && i2 < list.size()) {
                return i2;
            }
            sbA0y = C60O.A0y("Found paragraph index ", i2);
            sbA0y.append(" should be in range [0, ");
            sbA0y.append(list.size());
            sbA0y.append(").\nDebug info: index=");
            sbA0y.append(i);
            sbA0y.append(", paragraphs=[");
            sbA0y.append(C1Vi.A00(", ", "", "", list, new C2279BSf(38)));
            sbA0y.append(']');
        } else {
            sbA0y = C60O.A0y("Index ", i);
            sbA0y.append(" should be less or equal than last line's end ");
            sbA0y.append(i3);
        }
        throw C60O.A0i(sbA0y.toString());
    }

    public static final int A01(List<C1960Auz> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C1960Auz c1960AuzA0i = C8j3.A0i(list, i3);
            if (c1960AuzA0i.A03 > i) {
                size = i3 - 1;
            } else {
                if (c1960AuzA0i.A02 > i) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/Auz;>;JLX/G0U<-LX/Auz;Lkotlin/Unit;>;)V */
    public static final void A02(List list, G0U g0u, long j) {
        int size = list.size();
        for (int iA00 = A00(list, Au3.A02(j)); iA00 < size; iA00++) {
            C1960Auz c1960AuzA0i = C8j3.A0i(list, iA00);
            if (c1960AuzA0i.A05 >= Au3.A01(j)) {
                return;
            }
            if (c1960AuzA0i.A05 != c1960AuzA0i.A04) {
                g0u.invoke(c1960AuzA0i);
            }
        }
    }
}
