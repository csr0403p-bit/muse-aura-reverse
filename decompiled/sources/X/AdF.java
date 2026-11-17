package X;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AdF {
    public static final Comparator<InterfaceC1174Add> A00 = new BSF(2);

    /* JADX WARN: Incorrect types in method signature: <T::LX/Add;>(IILjava/util/List<+TT;>;Ljava/util/List<+TT;>;)Ljava/util/List<TT;>; */
    public static final List A00(List list, List list2, int i, int i2) {
        if (list.isEmpty()) {
            return C0881AGi.A00;
        }
        ArrayList arrayListA0R = AbstractC0878AGe.A0R(list2);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC1174Add interfaceC1174Add = (InterfaceC1174Add) list.get(i3);
            int index = interfaceC1174Add.getIndex();
            if (i <= index && index <= i2) {
                arrayListA0R.add(interfaceC1174Add);
            }
        }
        AbstractC06907md.A04(arrayListA0R, A00);
        return arrayListA0R;
    }
}
