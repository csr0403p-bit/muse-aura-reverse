package X;

import com.google.common.base.MoreObjects$ToStringHelper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
public final class CQE<V> implements Runnable {
    public static final String __redex_internal_original_name = "Futures$CallbackListener";
    public final CQG<? super V> A00;
    public final Future<V> A01;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        CQG<? super V> cqg;
        Future<V> future = this.A01;
        if (!(future instanceof AbstractC3445CNq) || (th = ((AbstractC3445CNq) future).tryInternalFastPathGetFailure()) == null) {
            try {
                this.A00.onSuccess(CQD.A00(future));
                return;
            } catch (ExecutionException e) {
                cqg = this.A00;
                th = e.getCause();
            } catch (Throwable th) {
                th = th;
                cqg = this.A00;
            }
        } else {
            cqg = this.A00;
        }
        cqg.onFailure(th);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/Future<TV;>;LX/CQG<-TV;>;)V */
    public CQE(CQG future, Future callback) {
        this.A01 = callback;
        this.A00 = future;
    }

    public final String toString() {
        MoreObjects$ToStringHelper moreObjects$ToStringHelper = new MoreObjects$ToStringHelper(C3cI.A0Y(this));
        moreObjects$ToStringHelper.addValue(this.A00);
        return moreObjects$ToStringHelper.toString();
    }
}
