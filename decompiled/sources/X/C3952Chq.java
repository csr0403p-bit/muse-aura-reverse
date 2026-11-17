package X;

import android.app.job.JobParameters;
import com.facebook.analytics2.logger.legacy.uploader.LollipopUploadService;

/* renamed from: X.Chq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3952Chq implements InterfaceC4070ClI {
    public final JobParameters A00;
    public final /* synthetic */ LollipopUploadService A01;

    public C3952Chq(JobParameters jobParameters, LollipopUploadService lollipopUploadService) {
        this.A01 = lollipopUploadService;
        this.A00 = jobParameters;
    }

    @Override // X.InterfaceC4070ClI
    public final void AXM(boolean z) {
        JobParameters jobParameters = this.A00;
        jobParameters.getJobId();
        this.A01.jobFinished(jobParameters, z);
    }
}
