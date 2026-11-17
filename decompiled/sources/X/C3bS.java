package X;

import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.3bS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bS implements Ht9, G0U {
    public final int $t;
    public final Object A00;

    public C3bS(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        G0V g0v;
        C1299Agk c1299Agk;
        long jA00;
        switch (this.$t) {
            case 0:
                g0v = (G0V) this.A00;
                c1299Agk = (C1299Agk) obj;
                jA00 = AbstractC1078AXh.A00(c1299Agk) >> 32;
                g0v.invoke(c1299Agk, Float.valueOf(Float.intBitsToFloat((int) jA00)));
                c1299Agk.A02();
                break;
            case 1:
                g0v = (G0V) this.A00;
                c1299Agk = (C1299Agk) obj;
                jA00 = AbstractC1078AXh.A00(c1299Agk) & 4294967295L;
                g0v.invoke(c1299Agk, Float.valueOf(Float.intBitsToFloat((int) jA00)));
                c1299Agk.A02();
                break;
            case 2:
                Object obj2 = this.A00;
                ASF asf = (ASF) obj;
                asf.A01 = "padding";
                asf.A02.A01("paddingValues", obj2);
                break;
            case 3:
            case 4:
                AYU.A04((AYU) obj, (AZE) this.A00, 0, 0);
                break;
            case 5:
                ((AYU) obj).A0A((AZE) this.A00, 0.0f, 0, 0);
                break;
            case 6:
                List list = (List) this.A00;
                AYU ayu = (AYU) obj;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    AYU.A04(ayu, (AZE) list.get(i), 0, 0);
                }
                break;
            case 7:
            case 8:
            case 9:
            default:
                ((MutableState) this.A00).Af8(obj);
                break;
            case 10:
                List list2 = (List) this.A00;
                AYU ayu2 = (AYU) obj;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ayu2.A0A((AZE) list2.get(i2), 0.0f, 0, 0);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
