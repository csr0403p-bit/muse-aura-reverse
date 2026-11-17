package X;

import X.InterfaceC1174Add;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Acx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1164Acx<T extends InterfaceC1174Add> {
    public final Ab2<List<AZE>> A00;

    public final List<AZE> A01(InterfaceC1126Aba interfaceC1126Aba, int i, long j) {
        Ab2<List<AZE>> ab2 = this.A00;
        List<AZE> listA04 = ab2.A04(i);
        if (listA04 != null) {
            return listA04;
        }
        List<C3TG> listA6h = interfaceC1126Aba.A6h(i);
        int size = listA6h.size();
        ArrayList arrayListA11 = C60O.A11(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayListA11.add(listA6h.get(i2).AQW(j));
        }
        ab2.A0B(i, arrayListA11);
        return arrayListA11;
    }

    public AbstractC1164Acx() {
        Ab2 ab2 = AbstractC1489Ajw.A00;
        this.A00 = Ab2.A01();
    }
}
