package X;

import kotlin.Unit;

/* loaded from: classes6.dex */
public final /* synthetic */ class GAg extends C7438Evz implements G0W {
    public static final GAg A00 = new GAg();

    public GAg() {
        super(3, GBM.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        GBM gbm = (GBM) obj;
        C9273GCa c9273GCa = (C9273GCa) obj2;
        while (true) {
            Object obj4 = GBM.A01.get(gbm);
            if (!(obj4 instanceof InterfaceC9269GBw)) {
                c9273GCa.A01 = Unit.INSTANCE;
                break;
            }
            if (GBM.A00(obj4, gbm) >= 0) {
                c9273GCa.A00 = HzS.A01(gbm, new GAf(gbm, c9273GCa), true);
                break;
            }
        }
        return Unit.INSTANCE;
    }
}
