package X;

import android.app.job.JobParameters;
import android.content.Context;
import com.facebook.pushlite.PushLiteLollipopJobService;

/* renamed from: X.Chc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3945Chc implements InterfaceC3959Ci2 {
    public final JobParameters A00;
    public final Context A01;
    public final /* synthetic */ PushLiteLollipopJobService A02;

    public C3945Chc(JobParameters jobParameters, Context context, PushLiteLollipopJobService pushLiteLollipopJobService) {
        this.A02 = pushLiteLollipopJobService;
        this.A00 = jobParameters;
        this.A01 = context;
    }

    @Override // X.InterfaceC3959Ci2
    public final void ATk(boolean z) {
        PushLiteLollipopJobService pushLiteLollipopJobService = this.A02;
        JobParameters jobParameters = this.A00;
        pushLiteLollipopJobService.jobFinished(jobParameters, z);
        if (z) {
            return;
        }
        C3936ChK c3936ChKA00 = C3936ChK.A00(this.A01);
        synchronized (c3936ChKA00) {
            c3936ChKA00.A00.put(jobParameters.getJobId(), false);
        }
    }
}
