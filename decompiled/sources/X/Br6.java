package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: classes5.dex */
public abstract class Br6 {
    public static final String A00 = C7384Etj.A0I("WorkerWrapper");

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Lcom/google/common/util/concurrent/ListenableFuture<TT;>;LX/EKa;LX/HtJ<-TT;>;)Ljava/lang/Object; */
    public static final Object A00(AbstractC6610EKa abstractC6610EKa, ListenableFuture listenableFuture, HtJ htJ) {
        try {
            if (!listenableFuture.isDone()) {
                GBL gblA03 = C7Bm.A03(htJ);
                listenableFuture.addListener(new RunnableC2990Br5(listenableFuture, gblA03), EnumC7478ExU.A02);
                gblA03.AO2(new C7592F5f(4, listenableFuture, abstractC6610EKa));
                return gblA03.A0F();
            }
            boolean z = false;
            while (true) {
                try {
                    V v = listenableFuture.get();
                    BV7.A1N(z);
                    return v;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    BV7.A1N(z);
                    throw th;
                }
            }
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            C7384Etj.A0X(cause);
            throw cause;
        }
    }
}
