package androidx.work;

import X.AbstractC2947Bpi;
import X.AbstractC6610EKa;
import X.AnonymousClass003;
import X.Br3;
import X.BzB;
import X.C3cG;
import X.C6617EKk;
import X.C7384Etj;
import X.C77S;
import X.C78T;
import X.C78W;
import X.C79;
import X.C9250GBd;
import X.EZE;
import X.EnumC10460Hji;
import X.F60;
import X.GBF;
import X.GBK;
import X.HtJ;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Deprecated;
import kotlin.Unit;

/* loaded from: classes5.dex */
public abstract class CoroutineWorker extends AbstractC6610EKa {
    public final GBK coroutineContext;
    public final WorkerParameters params;

    @Deprecated(message = "use withContext(...) inside doWork() instead.")
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public abstract Object doWork(HtJ<? super C77S> htJ);

    @Override // X.AbstractC6610EKa
    public final void onStopped() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, HtJ<? super C6617EKk> htJ) {
        throw C3cG.A0Q("Not implemented");
    }

    public GBK getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass003.A0u(context, workerParameters);
        this.params = workerParameters;
        this.coroutineContext = GBF.A00;
    }

    public Object getForegroundInfo(HtJ<? super C6617EKk> htJ) {
        getForegroundInfo$suspendImpl(this, htJ);
        throw F60.createAndThrow();
    }

    @Override // X.AbstractC6610EKa
    public final ListenableFuture<C6617EKk> getForegroundInfoAsync() {
        C78T c78tA02 = C78W.A02(getCoroutineContext(), new C9250GBd(null));
        EZE eze = new EZE(this, null, 2);
        Integer num = C79.A00;
        C7384Etj.A0Y(c78tA02, 0);
        return AbstractC2947Bpi.A03(num, c78tA02, eze, 5);
    }

    public final Object setForeground(C6617EKk c6617EKk, HtJ<? super Unit> htJ) {
        ListenableFuture<Void> foregroundAsync = setForegroundAsync(c6617EKk);
        C7384Etj.A0U(foregroundAsync);
        Object objA00 = Br3.A00(foregroundAsync, htJ);
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }

    public final Object setProgress(BzB bzB, HtJ<? super Unit> htJ) {
        ListenableFuture<Void> progressAsync = setProgressAsync(bzB);
        C7384Etj.A0U(progressAsync);
        Object objA00 = Br3.A00(progressAsync, htJ);
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }

    @Override // X.AbstractC6610EKa
    public final ListenableFuture<C77S> startWork() {
        C78T coroutineContext = !C7384Etj.areEqual(getCoroutineContext(), GBF.A00) ? getCoroutineContext() : this.params.A0A;
        C7384Etj.A0X(coroutineContext);
        C78T c78tPlus = coroutineContext.plus(new C9250GBd(null));
        EZE eze = new EZE(this, null, 3);
        Integer num = C79.A00;
        C7384Etj.A0Y(c78tPlus, 0);
        return AbstractC2947Bpi.A03(num, c78tPlus, eze, 5);
    }
}
