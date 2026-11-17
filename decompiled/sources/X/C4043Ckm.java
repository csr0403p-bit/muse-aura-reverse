package X;

import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.ConditionVariable;
import com.facebook.analytics2.logger.legacy.uploader.LollipopUploadService;

/* renamed from: X.Ckm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4043Ckm extends AbstractC4063Cl8 {
    public ComponentName A00;
    public final JobScheduler A01;
    public final Context A02;

    public C4043Ckm(Context context) {
        this.A02 = context;
        this.A01 = (JobScheduler) context.getSystemService("jobscheduler");
        ConditionVariable conditionVariable = CIT.A00;
        this.A00 = new ComponentName(context, (Class<?>) LollipopUploadService.class);
    }
}
