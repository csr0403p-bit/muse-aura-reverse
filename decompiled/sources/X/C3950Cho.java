package X;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.facebook.analytics2.logger.legacy.uploader.LollipopUpload;

/* renamed from: X.Cho, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3950Cho implements InterfaceC4070ClI {
    public final JobParameters A00;
    public final Ci4 A01;
    public final /* synthetic */ LollipopUpload A02;

    public C3950Cho(JobParameters jobParameters, LollipopUpload lollipopUpload, Ci4 ci4) {
        this.A02 = lollipopUpload;
        this.A00 = jobParameters;
        this.A01 = ci4;
    }

    @Override // X.InterfaceC4070ClI
    public final void AXM(boolean z) {
        JobParameters jobParameters = this.A00;
        jobParameters.getJobId();
        ((JobService) this.A01).jobFinished(jobParameters, z);
    }
}
