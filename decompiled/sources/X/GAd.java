package X;

import kotlin.Unit;

/* loaded from: classes6.dex */
public final /* synthetic */ class GAd extends C7438Evz implements G0W {
    public static final GAd A00 = new GAd();

    public GAd() {
        super(3, Hrk.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        final Hrk hrk = (Hrk) obj;
        final C9273GCa c9273GCa = (C9273GCa) obj2;
        long j = hrk.A00;
        if (j <= 0) {
            c9273GCa.A01 = Unit.INSTANCE;
        } else {
            Runnable runnable = new Runnable() { // from class: X.GAe
                public static final String __redex_internal_original_name = "OnTimeout$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    C9273GCa.A00(hrk, Unit.INSTANCE, c9273GCa);
                }
            };
            C7384Etj.A0Z(c9273GCa, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            C78T c78t = c9273GCa.A04;
            c9273GCa.A00 = C7Bq.A03(c78t).AO7(runnable, c78t, j);
        }
        return Unit.INSTANCE;
    }
}
