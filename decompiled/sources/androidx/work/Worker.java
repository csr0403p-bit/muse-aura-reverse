package androidx.work;

import X.AbstractC2947Bpi;
import X.AbstractC6610EKa;
import X.C6617EKk;
import X.C7384Etj;
import X.C7589F5c;
import X.C77S;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public abstract class Worker extends AbstractC6610EKa {
    @Override // X.AbstractC6610EKa
    public final ListenableFuture<C6617EKk> getForegroundInfoAsync() {
        Executor executor = this.mWorkerParams.A09;
        C7384Etj.A0U(executor);
        return AbstractC2947Bpi.A02(new C7589F5c(this, 11), executor, 10);
    }

    @Override // X.AbstractC6610EKa
    public final ListenableFuture<C77S> startWork() {
        Executor executor = this.mWorkerParams.A09;
        C7384Etj.A0U(executor);
        return AbstractC2947Bpi.A02(new C7589F5c(this, 10), executor, 10);
    }
}
