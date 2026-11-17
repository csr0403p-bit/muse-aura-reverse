package X;

import com.facebook.debug.tracer.Tracer;
import com.facebook.rsys.state.gen.State;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.GRi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9602GRi extends AbstractC7559F3s implements G0U<C9598GRe, Unit> {
    public final /* synthetic */ G0U<GRH, Boolean> $condition;
    public final /* synthetic */ G0U<GRH, Unit> $onStateObserved = null;
    public final /* synthetic */ AtomicReference<GSQ> $resultValue;
    public final /* synthetic */ G0U<GSQ, Unit> $run;
    public final /* synthetic */ GRZ $store;
    public final /* synthetic */ C10543Hqv<Function0<Unit>> $storeSubscription;
    public final /* synthetic */ G0U<C9598GRe, Unit> $storeSubscriptionInit;
    public final /* synthetic */ C10543Hqv<HoC> $timeoutJob;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9602GRi(GRZ grz, AtomicReference atomicReference, G0U g0u, G0U g0u2, G0U g0u3, C10543Hqv c10543Hqv, C10543Hqv c10543Hqv2) {
        super(1);
        this.$storeSubscriptionInit = g0u;
        this.$condition = g0u2;
        this.$store = grz;
        this.$resultValue = atomicReference;
        this.$timeoutJob = c10543Hqv;
        this.$storeSubscription = c10543Hqv2;
        this.$run = g0u3;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(C9598GRe c9598GRe) {
        C9598GRe c9598GReA0P = AbstractC7608F5v.A0P(c9598GRe);
        this.$storeSubscriptionInit.invoke(c9598GReA0P);
        Tracer.A01("SubscriptionInitializerV3.selectModel");
        try {
            Tracer.A01("SubscriptionInitializerV3.selectModel");
            try {
                c9598GReA0P.A02.put(State.class, null);
                Tracer.A00();
                G0U<GRH, Unit> g0u = this.$onStateObserved;
                G0U<GRH, Boolean> g0u2 = this.$condition;
                C9604GRl c9604GRl = new C9604GRl(this.$store, this.$resultValue, g0u, g0u2, this.$run, this.$timeoutJob, this.$storeSubscription);
                if (c9598GReA0P.A00 != null) {
                    throw C3cG.A0Q("afterCallbacks already set.  Overriding afterCallbacks is not supported and will lead to unpredictable behavior.");
                }
                c9598GReA0P.A00 = c9604GRl;
                return Unit.INSTANCE;
            } finally {
                Tracer.A00();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
