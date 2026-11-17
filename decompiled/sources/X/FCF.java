package X;

import android.util.SparseArray;
import java.util.List;

/* loaded from: classes6.dex */
public final class FCF {
    public final SparseArray<HxE<Object, List<FCT<Object>>>> A00;
    public final SparseArray<Object> A01;
    public final FCY<FBB, FCT<Object>> A02;
    public final Object A03 = C3cG.A0T();
    public final List<FCT<Object>> A04;

    /* JADX WARN: Incorrect types in method signature: (LX/FCY<LX/FBB;LX/FCT<Ljava/lang/Object;>;>;Landroid/util/SparseArray<Ljava/lang/Object;>;Ljava/util/List<+LX/FCT<Ljava/lang/Object;>;>;)V */
    public FCF(SparseArray sparseArray, FCY fcy, List list) {
        SparseArray<Object> sparseArrayA0B;
        this.A02 = fcy;
        this.A04 = list != null ? BV4.A0t(list) : null;
        if (sparseArray == null || (sparseArrayA0B = sparseArray.clone()) == null) {
            sparseArrayA0B = BV4.A0B();
        } else {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                sparseArrayA0B.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
        this.A01 = sparseArrayA0B;
        this.A00 = BV4.A0B();
    }
}
