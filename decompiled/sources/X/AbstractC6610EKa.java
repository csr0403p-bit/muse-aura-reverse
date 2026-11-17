package X;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.EKa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6610EKa {
    public Context mAppContext;
    public final AtomicInteger mStopReason = BV4.A13(-256);
    public boolean mUsed;
    public WorkerParameters mWorkerParams;

    public abstract ListenableFuture<C6617EKk> getForegroundInfoAsync();

    public void onStopped() {
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ListenableFuture<C77S> startWork();

    public static /* synthetic */ Object lambda$getForegroundInfoAsync$0(C3010Brs c3010Brs) {
        c3010Brs.A04(C3cG.A0Q("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
        return "default failing getForegroundInfoAsync";
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.A09;
    }

    public final UUID getId() {
        return this.mWorkerParams.A08;
    }

    public final BzB getInputData() {
        return this.mWorkerParams.A01;
    }

    public final Network getNetwork() {
        return this.mWorkerParams.A05.A00;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.A00;
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.A07;
    }

    public ENP getTaskExecutor() {
        return this.mWorkerParams.A06;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.A05.A01;
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.A05.A02;
    }

    public CGI getWorkerFactory() {
        return this.mWorkerParams.A04;
    }

    public final boolean isStopped() {
        return AnonymousClass002.A1P(this.mStopReason.get(), -256);
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final ListenableFuture<Void> setForegroundAsync(C6617EKk foregroundInfo) {
        WorkerParameters workerParameters = this.mWorkerParams;
        EL0 el0 = workerParameters.A02;
        Context context = this.mAppContext;
        UUID uuid = workerParameters.A08;
        C6614EKg c6614EKg = (C6614EKg) el0;
        ExecutorC6622EKr executorC6622EKr = ((C6616EKj) c6614EKg.A02).A01;
        EKX ekx = new EKX(context, foregroundInfo, c6614EKg, uuid);
        C7384Etj.A0Y(executorC6622EKr, 0);
        return AbstractC2947Bpi.A00(new E91(executorC6622EKr, ekx, "setForegroundAsync", 1));
    }

    public ListenableFuture<Void> setProgressAsync(BzB data) {
        WorkerParameters workerParameters = this.mWorkerParams;
        ENI eni = workerParameters.A03;
        UUID uuid = workerParameters.A08;
        ELE ele = (ELE) eni;
        ExecutorC6622EKr executorC6622EKr = ((C6616EKj) ele.A01).A01;
        C7594F5h c7594F5h = new C7594F5h(uuid, data, ele, 6);
        C7384Etj.A0Y(executorC6622EKr, 0);
        return AbstractC2947Bpi.A00(new E91(executorC6622EKr, c7594F5h, "updateProgress", 1));
    }

    public final void stop(int reason) {
        this.mStopReason.compareAndSet(-256, reason);
    }

    public AbstractC6610EKa(Context appContext, WorkerParameters workerParams) {
        if (appContext == null) {
            throw C60O.A0i("Application Context is null");
        }
        if (workerParams == null) {
            throw C60O.A0i("WorkerParameters is null");
        }
        this.mAppContext = appContext;
        this.mWorkerParams = workerParams;
    }
}
