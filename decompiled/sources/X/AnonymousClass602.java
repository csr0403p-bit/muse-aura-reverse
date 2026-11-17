package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* renamed from: X.602, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass602 implements C20Q {
    public final int $t;
    public final Object A00;

    public static AnonymousClass602 A00(Object obj) {
        return new AnonymousClass602(obj, 0);
    }

    public AnonymousClass602(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.C20Q
    public final Object collect(C20Z<? super T> c20z, HtJ<? super Unit> htJ) {
        Object objCollect;
        if (this.$t != 0) {
            C60D c60d = new C60D(null, (G0W) this.A00, c20z);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GBM.A00;
            HzQ hzQ = new HzQ(htJ, htJ.getContext());
            objCollect = GAj.A00(hzQ, c60d, hzQ, true);
        } else {
            objCollect = ((C20Q) this.A00).collect(new AnonymousClass601(1, new F1E(), c20z), htJ);
        }
        return objCollect != EnumC10460Hji.A02 ? Unit.INSTANCE : objCollect;
    }
}
