package X;

import android.util.SparseArray;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class FAB {
    public final SparseArray<Map<String, Object>> A00;
    public final SparseArray<FDW> A01;
    public final SparseArray<Map<String, F8J>> A02;
    public final SparseArray<Set<String>> A03;

    public FAB(FAB fab) {
        SparseArray<Map<String, F8J>> sparseArrayClone;
        SparseArray<FDW> sparseArrayClone2;
        SparseArray<Map<String, Object>> sparseArrayClone3;
        SparseArray<Set<String>> sparseArrayClone4;
        this.A03 = (fab == null || (sparseArrayClone4 = fab.A03.clone()) == null) ? new SparseArray<>(0) : sparseArrayClone4;
        this.A00 = (fab == null || (sparseArrayClone3 = fab.A00.clone()) == null) ? new SparseArray<>(0) : sparseArrayClone3;
        this.A01 = (fab == null || (sparseArrayClone2 = fab.A01.clone()) == null) ? new SparseArray<>(0) : sparseArrayClone2;
        this.A02 = (fab == null || (sparseArrayClone = fab.A02.clone()) == null) ? new SparseArray<>(0) : sparseArrayClone;
    }
}
