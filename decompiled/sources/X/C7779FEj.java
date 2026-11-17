package X;

import android.util.LongSparseArray;

/* renamed from: X.FEj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7779FEj {
    public final LongSparseArray<Object> A00;
    public final LongSparseArray<Object> A01;

    public C7779FEj(FDW fdw, InterfaceC7780FEk interfaceC7780FEk) {
        LongSparseArray<Object> longSparseArray;
        C7384Etj.A0Y(fdw, 1);
        int size = fdw.A0G().size();
        Object objValueOf = Long.valueOf(fdw.A04);
        this.A00 = (LongSparseArray) interfaceC7780FEk.AYV(objValueOf);
        Object objA88 = interfaceC7780FEk.A88(objValueOf);
        if (!(objA88 instanceof LongSparseArray) || (longSparseArray = (LongSparseArray) objA88) == null) {
            longSparseArray = new LongSparseArray<>(size);
            interfaceC7780FEk.AYn(objValueOf, longSparseArray);
        }
        this.A01 = longSparseArray;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/FDW;LX/FEE<TT;LX/FBB;>;Z)V */
    public final void A00(FEE fee, FDW fdw, boolean z) {
        C7384Etj.A0Y(fee, 1);
        long jA0D = BV7.A0D(Integer.valueOf(fdw.A04), Boolean.valueOf(z));
        LongSparseArray<Object> longSparseArray = this.A01;
        synchronized (longSparseArray) {
            longSparseArray.put(jA0D, fee);
        }
    }
}
