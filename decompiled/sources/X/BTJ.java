package X;

import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BTJ implements Ht9, G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final boolean A02;

    public BTJ(Object obj, Object obj2, int i, boolean z) {
        this.$t = i;
        this.A02 = z;
        this.A00 = obj;
        this.A01 = obj2;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                List list = (List) this.A00;
                List list2 = (List) this.A01;
                boolean z = this.A02;
                AYU ayu = (AYU) obj;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((C1160Acs) list.get(i)).A01(ayu, z);
                }
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C1160Acs) list2.get(i2)).A01(ayu, z);
                }
                break;
            case 1:
                List list3 = (List) this.A00;
                List list4 = (List) this.A01;
                boolean z2 = this.A02;
                AYU ayu2 = (AYU) obj;
                int size3 = list3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((Ad0) list3.get(i3)).A01(ayu2, z2);
                }
                int size4 = list4.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((Ad0) list4.get(i4)).A01(ayu2, z2);
                }
                break;
            default:
                boolean z3 = this.A02;
                Object obj2 = this.A00;
                Object obj3 = this.A01;
                InterfaceC0857A6e interfaceC0857A6e = (InterfaceC0857A6e) obj;
                if (z3) {
                    InterfaceC0857A6e.A00(AbstractC1578Alt.A0I, interfaceC0857A6e, null, new BTB(8, obj2, obj3));
                    InterfaceC0857A6e.A00(AbstractC1578Alt.A0F, interfaceC0857A6e, null, new BTB(9, obj2, obj3));
                    break;
                } else {
                    InterfaceC0857A6e.A00(AbstractC1578Alt.A0G, interfaceC0857A6e, null, new BTB(10, obj2, obj3));
                    InterfaceC0857A6e.A00(AbstractC1578Alt.A0H, interfaceC0857A6e, null, new BTB(11, obj2, obj3));
                    break;
                }
        }
        return Unit.INSTANCE;
    }
}
