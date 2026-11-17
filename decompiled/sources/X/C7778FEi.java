package X;

import android.util.LongSparseArray;

/* renamed from: X.FEi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7778FEi {
    public final LongSparseArray<FEI<?, FBB>> A00;
    public final LongSparseArray<FEI<?, FBB>> A01;

    public C7778FEi(FDW fdw, InterfaceC7780FEk interfaceC7780FEk) {
        LongSparseArray<FEI<?, FBB>> longSparseArray;
        C7384Etj.A0Y(fdw, 1);
        int i = fdw.A04;
        int size = fdw.A0G().size();
        Object objValueOf = Long.valueOf(i);
        Object objA88 = interfaceC7780FEk.A88(objValueOf);
        if (!(objA88 instanceof LongSparseArray) || (longSparseArray = (LongSparseArray) objA88) == null) {
            longSparseArray = new LongSparseArray<>(size);
            interfaceC7780FEk.AYn(objValueOf, longSparseArray);
        }
        this.A01 = longSparseArray;
        this.A00 = (LongSparseArray) interfaceC7780FEk.AYV(objValueOf);
    }
}
