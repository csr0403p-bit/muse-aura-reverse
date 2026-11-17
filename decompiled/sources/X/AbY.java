package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AbY {
    /* JADX WARN: Incorrect types in method signature: (LX/Aba;IJLX/AdQ;JLX/AYu;LX/3TH;LX/1AC;LX/Arj;ZILX/Ab2<Ljava/util/List<LX/AZE;>;>;)LX/AbZ; */
    public static final AbZ A00(Ab2 ab2, EnumC1108AYu enumC1108AYu, InterfaceC1126Aba interfaceC1126Aba, C1168AdQ c1168AdQ, C3TH c3th, C1AC c1ac, EnumC1820Arj enumC1820Arj, int i, int i2, long j, long j2, boolean z) {
        Object objAGm = c1168AdQ.AGm(i);
        List list = (List) ab2.A04(i);
        List list2 = list;
        if (list == null) {
            List<C3TG> listA6h = interfaceC1126Aba.A6h(i);
            int size = listA6h.size();
            ArrayList arrayListA11 = C60O.A11(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayListA11.add(listA6h.get(i3).AQW(j));
            }
            ab2.A0B(i, arrayListA11);
            list2 = arrayListA11;
        }
        return new AbZ(enumC1108AYu, c3th, c1ac, enumC1820Arj, objAGm, list2, i, i2, j2, z);
    }
}
