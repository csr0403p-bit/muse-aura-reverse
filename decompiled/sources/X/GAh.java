package X;

import kotlin.Unit;

/* loaded from: classes6.dex */
public final /* synthetic */ class GAh extends C7438Evz implements G0W {
    public static final GAh A00 = new GAh();

    public GAh() {
        super(3, GBM.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        GBM gbm = (GBM) obj;
        C9273GCa c9273GCa = (C9273GCa) obj2;
        while (true) {
            Object objA00 = GBM.A01.get(gbm);
            if (!(objA00 instanceof InterfaceC9269GBw)) {
                if (!(objA00 instanceof C10474Hkl)) {
                    objA00 = AbstractC9251GBe.A00(objA00);
                }
                c9273GCa.A01 = objA00;
            } else if (GBM.A00(objA00, gbm) >= 0) {
                c9273GCa.A00 = HzS.A01(gbm, new GAi(gbm, c9273GCa), true);
                break;
            }
        }
        return Unit.INSTANCE;
    }
}
