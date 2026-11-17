package X;

import android.util.LongSparseArray;

/* renamed from: X.FEh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7777FEh {
    public final LongSparseArray<C7775FEf> A00;
    public final LongSparseArray<C7775FEf> A01;

    public C7777FEh(FDW fdw, InterfaceC7780FEk interfaceC7780FEk) {
        LongSparseArray<C7775FEf> longSparseArray;
        C7384Etj.A0Y(fdw, 1);
        Object objValueOf = Long.valueOf(fdw.A04);
        Object objA88 = interfaceC7780FEk.A88(objValueOf);
        if (!(objA88 instanceof LongSparseArray) || (longSparseArray = (LongSparseArray) objA88) == null) {
            longSparseArray = new LongSparseArray<>(fdw.A0G().size());
            interfaceC7780FEk.AYn(objValueOf, longSparseArray);
        }
        this.A01 = longSparseArray;
        this.A00 = (LongSparseArray) interfaceC7780FEk.AYV(objValueOf);
    }
}
