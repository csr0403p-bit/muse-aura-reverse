package X;

import android.util.SparseArray;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes6.dex */
public final class FTs {
    public SparseArray<FU1> A01 = BV4.A0B();
    public int A00 = 0;
    public Set<AbstractC8091FSx<?>> A02 = Collections.newSetFromMap(new IdentityHashMap());

    public static FU1 A00(FTs fTs, int i) {
        SparseArray<FU1> sparseArray = fTs.A01;
        FU1 fu1 = sparseArray.get(i);
        if (fu1 != null) {
            return fu1;
        }
        FU1 fu12 = new FU1();
        sparseArray.put(i, fu12);
        return fu12;
    }
}
