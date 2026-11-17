package X;

import com.google.common.base.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public final class F5N implements Function {
    public final int $t;
    public final Object A00;

    public F5N(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                C5272Dem c5272Dem = (C5272Dem) this.A00;
                c5272Dem.A06 = AnonymousClass001.A0F(obj);
                return Integer.valueOf(c5272Dem.A06);
            case 1:
                return this.A00;
            case 2:
                C6154Dwx c6154Dwx = C6367E2u.A0c;
                return obj;
            case 3:
                C6154Dwx c6154Dwx2 = C6368E2v.A0Z;
                return obj;
            case 4:
                return ((C5021DOq) this.A00).A00.A00.AC1(obj);
            default:
                ArrayList arrayListA0h = C3cG.A0h();
                ArrayList arrayListA0h2 = C3cG.A0h();
                arrayListA0h2.addAll((Collection) this.A00);
                for (InterfaceC6668EOe interfaceC6668EOe : (List) obj) {
                    if (interfaceC6668EOe instanceof EON) {
                        arrayListA0h.addAll(((EON) interfaceC6668EOe).A00);
                    } else {
                        if (!(interfaceC6668EOe instanceof EOK)) {
                            throw C3cG.A0q();
                        }
                        arrayListA0h2.add(((EOK) interfaceC6668EOe).A01);
                    }
                }
                return new EOM(arrayListA0h, arrayListA0h2);
        }
    }
}
