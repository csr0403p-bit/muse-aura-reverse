package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* renamed from: X.Dxh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6197Dxh {
    public final SparseArray<C6202Dxm> A00;
    public final DzH A01;

    public static C6202Dxm A00(C6197Dxh c6197Dxh, int i) {
        C6202Dxm c6202Dxm = c6197Dxh.A00.get(i);
        c6202Dxm.getClass();
        return c6202Dxm;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/DzH;Landroid/util/SparseArray<LX/Dxm;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public C6197Dxh(SparseArray sparseArray, DzH dzH) {
        this.A01 = dzH;
        SparseBooleanArray sparseBooleanArray = dzH.A00;
        SparseArray<C6202Dxm> sparseArray2 = new SparseArray<>(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int iA00 = C1G.A00(sparseBooleanArray, i);
            Object obj = sparseArray.get(iA00);
            obj.getClass();
            sparseArray2.append(iA00, obj);
        }
        this.A00 = sparseArray2;
    }
}
