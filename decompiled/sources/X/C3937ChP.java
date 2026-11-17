package X;

import android.app.job.JobScheduler;
import android.content.Context;
import com.facebook.pushlite.PushLiteLollipopJobService;

/* renamed from: X.ChP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3937ChP extends AbstractC3938ChQ<PushLiteLollipopJobService> {
    public final JobScheduler A00;
    public final Context A01;

    public C3937ChP(Context context) {
        super(context);
        this.A01 = context;
        this.A00 = (JobScheduler) context.getSystemService("jobscheduler");
    }
}
