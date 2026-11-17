package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
public final /* synthetic */ class GAv extends C7438Evz implements G0W<GBM, Object, Object, Object> {
    public static final GAv A00 = new GAv();

    public GAv() {
        super(3, GBM.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(GBM gbm, Object obj, Object obj2) throws Throwable {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GBM.A00;
        if (obj2 instanceof C10474Hkl) {
            throw ((C10474Hkl) obj2).A00;
        }
        return obj2;
    }
}
