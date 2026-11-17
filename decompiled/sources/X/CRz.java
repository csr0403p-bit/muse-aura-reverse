package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes5.dex */
public abstract class CRz {
    /* JADX WARN: Incorrect types in method signature: <TResult:Ljava/lang/Object;>(LX/CSA<TTResult;>;JLjava/util/concurrent/TimeUnit;)TTResult; */
    public static Object A00(CSA csa, TimeUnit timeUnit, long j) {
        CRy.A06("Must not be called on the main application thread");
        CRy.A01();
        CRy.A04(csa, "Task must not be null");
        if (!csa.A0B()) {
            CS0 cs0 = new CS0(null);
            Executor executor = AbstractC3097ByB.A01;
            csa.A06(cs0, executor);
            csa.A0A(cs0, executor);
            CSA.A00(new CSN(cs0, executor), (CSC) csa);
            if (!cs0.A00.await(j, timeUnit)) {
                throw new TimeoutException("Timed out waiting for Task");
            }
        }
        if (csa.A0C()) {
            return csa.A08();
        }
        if (((CSC) csa).A05) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(csa.A07());
    }
}
