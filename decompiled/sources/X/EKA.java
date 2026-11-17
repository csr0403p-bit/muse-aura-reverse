package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.room.util.DBUtil__DBUtil_androidKt;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class EKA {
    public static final String A00 = C7384Etj.A0I("SystemJobScheduler");

    public static final JobScheduler A00(Context context) {
        C7384Etj.A0Y(context, 0);
        Object systemService = context.getSystemService("jobscheduler");
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? EMv.A00(jobScheduler) : jobScheduler;
    }

    public static final String A01(Context context, WorkDatabase workDatabase) {
        List<JobInfo> allPendingJobs;
        int size;
        int i = Build.VERSION.SDK_INT;
        int i2 = i >= 31 ? 150 : 100;
        int size2 = ((List) DBUtil__DBUtil_androidKt.A01(((C6605EJh) F0C.A01(workDatabase)).A01, new C7588F5b(5), true, false)).size();
        String strA08 = "<faulty JobScheduler failed to getPendingJobs>";
        JobScheduler jobSchedulerA00 = A00(context);
        if (i >= 34) {
            C7384Etj.A0Y(jobSchedulerA00, 0);
            try {
                allPendingJobs = jobSchedulerA00.getAllPendingJobs();
                C7384Etj.A0U(allPendingJobs);
            } catch (Throwable th) {
                String str = A00;
                EK9.A00();
                Log.e(str, "getAllPendingJobs() is not reliable on this device.", th);
                allPendingJobs = null;
            }
            if (allPendingJobs != null) {
                ArrayList arrayListA00 = EKB.A00(jobSchedulerA00, context);
                int size3 = arrayListA00 != null ? allPendingJobs.size() - arrayListA00.size() : 0;
                String strA082 = null;
                String strA083 = size3 == 0 ? null : FGI.A08(size3, " of which are not owned by WorkManager");
                Object systemService = context.getSystemService("jobscheduler");
                C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                ArrayList arrayListA002 = EKB.A00((JobScheduler) systemService, context);
                if (arrayListA002 != null && (size = arrayListA002.size()) != 0) {
                    strA082 = FGI.A08(size, " from WorkManager in the default namespace");
                }
                strA08 = C3cH.A0e(",\n", BFI.A0F(new String[]{FGI.A08(allPendingJobs.size(), " jobs in \"androidx.work.systemjobscheduler\" namespace"), strA083, strA082}));
            }
        } else {
            ArrayList arrayListA003 = EKB.A00(jobSchedulerA00, context);
            if (arrayListA003 != null) {
                strA08 = FGI.A08(arrayListA003.size(), " jobs from WorkManager");
            }
        }
        StringBuilder sbA0y = C60O.A0y("JobScheduler ", i2);
        sbA0y.append(" job limit exceeded.\nIn JobScheduler there are ");
        sbA0y.append(strA08);
        sbA0y.append(".\nThere are ");
        sbA0y.append(size2);
        sbA0y.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
        sbA0y.append(20);
        return AnonymousClass001.A0v(".", sbA0y);
    }
}
