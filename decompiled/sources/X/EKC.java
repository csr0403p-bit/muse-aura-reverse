package X;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: classes5.dex */
public final class EKC {
    public static final String A02 = EK9.A01("SystemJobInfoConverter");
    public final ComponentName A00;
    public final ED6 A01;

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.job.JobInfo A00(X.EKE r12, int r13) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EKC.A00(X.EKE, int):android.app.job.JobInfo");
    }

    public EKC(Context context, ED6 ed6) {
        this.A01 = ed6;
        this.A00 = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
