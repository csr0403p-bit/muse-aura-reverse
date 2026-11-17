package X;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
public final class BpX<V> implements Runnable {
    public static final String __redex_internal_original_name = "Futures$CallbackListener";
    public final BpZ<? super V> A00;
    public final Future<V> A01;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Future<V> future = this.A01;
            BeS.A07(future.isDone(), AnonymousClass007.A0a("Future was expected to be done, ", future));
            this.A00.onSuccess(AbstractC2942BpW.A02(future));
        } catch (Error | RuntimeException e) {
            this.A00.onFailure(e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            BpZ<? super V> bpZ = this.A00;
            if (cause == null) {
                bpZ.onFailure(e2);
            } else {
                bpZ.onFailure(cause);
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/Future<TV;>;LX/BpZ<-TV;>;)V */
    public BpX(BpZ bpZ, Future future) {
        this.A01 = future;
        this.A00 = bpZ;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(C3cI.A0Y(this));
        sbA0w.append(",");
        return C8j3.A14(this.A00, sbA0w);
    }
}
