package X;

import android.app.job.JobParameters;
import com.facebook.analytics2.logger.legacy.uploader.LollipopUploadServiceDelegate;

/* renamed from: X.Chn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3949Chn implements InterfaceC4070ClI {
    public final JobParameters A00;
    public final /* synthetic */ LollipopUploadServiceDelegate A01;

    public C3949Chn(JobParameters jobParameters, LollipopUploadServiceDelegate lollipopUploadServiceDelegate) {
        this.A01 = lollipopUploadServiceDelegate;
        this.A00 = jobParameters;
    }

    @Override // X.InterfaceC4070ClI
    public final void AXM(boolean z) {
        JobParameters jobParameters = this.A00;
        jobParameters.getJobId();
        this.A01.A01.jobFinished(jobParameters, z);
    }
}
