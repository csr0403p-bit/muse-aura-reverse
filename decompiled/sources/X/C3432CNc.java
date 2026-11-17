package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.CNc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3432CNc {
    public static final Integer A02 = C79.A04;
    public static final Integer A03 = C79.A05;
    public final EF5 A00;
    public final C3433CNd A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [F, X.DAH] */
    public static final RunnableC3443CNo A00(C3432CNc c3432CNc, Integer num, Function0 function0, G0U g0u) {
        ListenableFuture listenableFuture;
        C3433CNd c3433CNd = c3432CNc.A01;
        try {
            CallableC7564F4d callableC7564F4d = new CallableC7564F4d(function0, 5);
            Executor executor = c3433CNd.A00;
            RunnableFutureC3435CNg runnableFutureC3435CNg = new RunnableFutureC3435CNg(callableC7564F4d);
            executor.execute(runnableFutureC3435CNg);
            boolean zIsDone = runnableFutureC3435CNg.isDone();
            RunnableC3430CNa runnableC3430CNa = runnableFutureC3435CNg;
            if (!zIsDone) {
                RunnableC3430CNa runnableC3430CNa2 = new RunnableC3430CNa();
                runnableC3430CNa2.A00 = runnableFutureC3435CNg;
                runnableFutureC3435CNg.addListener(runnableC3430CNa2, EnumC3451CNw.A01);
                runnableC3430CNa = runnableC3430CNa2;
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ScheduledExecutorService scheduledExecutorService = c3433CNd.A01;
            boolean zIsDone2 = runnableC3430CNa.isDone();
            listenableFuture = runnableC3430CNa;
            if (!zIsDone2) {
                C3434CNf<V> c3434CNf = new C3434CNf<>();
                c3434CNf.A00 = runnableC3430CNa;
                RunnableC3431CNb runnableC3431CNb = new RunnableC3431CNb();
                runnableC3431CNb.A00 = c3434CNf;
                c3434CNf.A01 = scheduledExecutorService.schedule(runnableC3431CNb, 10000L, timeUnit);
                runnableC3430CNa.addListener(runnableC3431CNb, EnumC3451CNw.A01);
                listenableFuture = c3434CNf;
            }
        } catch (RejectedExecutionException e) {
            CNZ cnz = new CNZ();
            cnz.setException(e);
            listenableFuture = cnz;
        }
        ?? dah = new DAH(c3432CNc, num, g0u);
        EnumC3451CNw enumC3451CNw = EnumC3451CNw.A01;
        RunnableC3443CNo runnableC3443CNo = new RunnableC3443CNo();
        runnableC3443CNo.A00 = listenableFuture;
        runnableC3443CNo.A01 = Exception.class;
        runnableC3443CNo.A02 = dah;
        listenableFuture.addListener(runnableC3443CNo, enumC3451CNw);
        return runnableC3443CNo;
    }

    public C3432CNc(C3433CNd c3433CNd, EF5 ef5) {
        this.A00 = ef5;
        this.A01 = c3433CNd;
    }
}
