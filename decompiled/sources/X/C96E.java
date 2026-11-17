package X;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.96E, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C96E extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<G0U<C1DG, Unit>> $currentOnHeight$delegate;
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ Set<Object> $liveKeys;
    public final /* synthetic */ C96F $reporter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/96F;LX/AXN;Ljava/util/Set<+Ljava/lang/Object;>;LX/1BO<+LX/G0U<-LX/1DG;Lkotlin/Unit;>;>;)V */
    public C96E(C1BO c1bo, AXN axn, C96F c96f, Set set) {
        super(0);
        this.$reporter = c96f;
        this.$density = axn;
        this.$liveKeys = set;
        this.$currentOnHeight$delegate = c1bo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Unit invoke() {
        C96F c96f = this.$reporter;
        AXN axn = this.$density;
        C7384Etj.A0Y(axn, 0);
        c96f.A00 = axn;
        C96F c96f2 = this.$reporter;
        G0U<? super C1DG, Unit> g0uA0B = C1BO.A0B(this.$currentOnHeight$delegate);
        C7384Etj.A0Y(g0uA0B, 0);
        c96f2.A01 = g0uA0B;
        C96F c96f3 = this.$reporter;
        Set<Object> set = this.$liveKeys;
        C7384Etj.A0Y(set, 0);
        if (c96f3.A03.keySet().retainAll(set)) {
            C96F.A00(c96f3);
        }
        return Unit.INSTANCE;
    }
}
