package X;

import java.util.Comparator;

/* renamed from: X.Hze, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10620Hze<T> implements Comparator {
    public final /* synthetic */ F6D A00;
    public final /* synthetic */ HsM A01;

    public C10620Hze(HsM hsM, F6D f6d) {
        this.A01 = hsM;
        this.A00 = f6d;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        HsM hsM = this.A01;
        C9115Fyg c9115FygA00 = C9115Fyg.A00();
        c9115FygA00.A06(obj, 0);
        Object objA00 = AbstractC7691FAk.A00(this.A00, C9115Fyg.A03(c9115FygA00, obj2, 1), hsM);
        if (objA00 instanceof Integer) {
            return AnonymousClass001.A0F(objA00);
        }
        FFI.A01(null, "Got non-integer result while evaluating comparator predicate", null);
        return 0;
    }
}
