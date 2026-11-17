package X;

import com.facebook.pando.IPandoGraphQLService;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class DZQ implements Runnable {
    public static final String __redex_internal_original_name = "PandoGraphQLConsistencyJNI$setUpSubscription$1";
    public final /* synthetic */ DZS A00;
    public final /* synthetic */ CPW<T> A01;
    public final /* synthetic */ Executor A02;
    public final /* synthetic */ Function0<IPandoGraphQLService.Token> A03;

    /* JADX WARN: Incorrect types in method signature: (LX/DZS;Lkotlin/jvm/functions/Function0<+Lcom/facebook/pando/IPandoGraphQLService$Token;>;Ljava/util/concurrent/Executor;LX/CPW<TT;>;)V */
    public DZQ(DZS dzs, CPW cpw, Executor executor, Function0 function0) {
        this.A00 = dzs;
        this.A03 = function0;
        this.A02 = executor;
        this.A01 = cpw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DZS dzs = this.A00;
        Function0<IPandoGraphQLService.Token> function0 = this.A03;
        Executor executor = this.A02;
        CPW<T> cpw = this.A01;
        C7384Etj.A0Y(function0, 0);
        AtomicReference<AbstractC5118DZt> atomicReference = dzs.A00;
        AbstractC5118DZt abstractC5118DZt = atomicReference.get();
        DZn dZn = DZn.A00;
        if (C7384Etj.areEqual(abstractC5118DZt, dZn)) {
            return;
        }
        try {
            IPandoGraphQLService.Token tokenInvoke = function0.invoke();
            if (Bs8.A00(DZm.A00, new C5115DZk(tokenInvoke), atomicReference)) {
                return;
            }
            tokenInvoke.cancel();
        } catch (Exception e) {
            AbstractC5118DZt andSet = atomicReference.getAndSet(dZn);
            CFK.A0B("PandoGraphQLConsistencyJNI", "Subscription setup failed on the subscribe executor", e);
            if (C7384Etj.areEqual(andSet, dZn)) {
                return;
            }
            executor.execute(new CPU(cpw, e));
        }
    }
}
