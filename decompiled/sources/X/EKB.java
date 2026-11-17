package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.room.util.DBUtil__DBUtil_androidKt;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class EKB implements ELY {
    public static final String A05 = EK9.A01("SystemJobScheduler");
    public final JobScheduler A00;
    public final Context A01;
    public final EKi A02;
    public final WorkDatabase A03;
    public final EKC A04;

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/List<Landroid/app/job/JobInfo;>; */
    public static ArrayList A00(JobScheduler context, Context jobScheduler) {
        List<JobInfo> allPendingJobs;
        C7384Etj.A0Y(context, 0);
        try {
            allPendingJobs = context.getAllPendingJobs();
            C7384Etj.A0U(allPendingJobs);
        } catch (Throwable th) {
            String str = EKA.A00;
            EK9.A00();
            Log.e(str, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayListA0t = C60Q.A0t(allPendingJobs);
        ComponentName componentName = new ComponentName(jobScheduler, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayListA0t.add(jobInfo);
            }
        }
        return arrayListA0t;
    }

    public static void A02(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            EKA.A00(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList arrayListA00 = A00(jobScheduler, context);
        if (arrayListA00 == null || arrayListA00.isEmpty()) {
            return;
        }
        Iterator it = arrayListA00.iterator();
        while (it.hasNext()) {
            A01(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    private final void A03(EKE workSpec, int jobId) {
        JobInfo jobInfoA00 = this.A04.A00(workSpec, jobId);
        EK9 ek9A00 = EK9.A00();
        String str = A05;
        StringBuilder sbA0x = C60O.A0x("Scheduling work ID ");
        String str2 = workSpec.A0O;
        sbA0x.append(str2);
        sbA0x.append(" (");
        sbA0x.append(workSpec.A0K);
        ek9A00.A02(str, C60P.A1O("), Job ID ", sbA0x, jobId));
        try {
            if (this.A00.schedule(jobInfoA00) == 0) {
                EK9.A00();
                BV4.A1J("Unable to schedule work ID ", str2, str);
                if (workSpec.A0L && workSpec.A0H == C79.A00) {
                    workSpec.A0L = false;
                    EK9.A00().A02(str, String.format("Scheduling a non-expedited job (work ID %s)", str2));
                    A03(workSpec, jobId);
                }
            }
        } catch (IllegalStateException e) {
            String strA01 = EKA.A01(this.A01, this.A03);
            EK9.A00();
            Log.e(str, strA01);
            throw new IllegalStateException(strA01, e);
        } catch (Throwable th) {
            EK9.A00();
            Log.e(str, AnonymousClass007.A0a("Unable to schedule ", workSpec), th);
        }
    }

    @Override // X.ELY
    public final boolean ANB() {
        return true;
    }

    @Override // X.ELY
    public final void Ac8(EKE... workSpecs) {
        int iIntValue;
        WorkDatabase workDatabase = this.A03;
        EN1 en1 = new EN1(workDatabase);
        for (EKE eke : workSpecs) {
            workDatabase.beginTransaction();
            try {
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) workDatabase;
                EL5 value = workDatabase_Impl.A06.getValue();
                String str = eke.A0O;
                C7384Etj.A0Y(str, 0);
                EKE eke2 = (EKE) C7596F5j.A00(((C6605EJh) value).A01, str, 12);
                if (eke2 == null) {
                    EK9.A00();
                    Log.w(A05, FGI.A0U("Skipping scheduling ", str, " because it's no longer in the DB"));
                } else if (eke2.A0E != EnumC6619EKm.A04) {
                    EK9.A00();
                    Log.w(A05, FGI.A0U("Skipping scheduling ", str, " because it is no longer enqueued"));
                } else {
                    C6630ELa c6630ELaA00 = AbstractC6646ELq.A00(eke);
                    F0C<EMw> f0c = workDatabase_Impl.A03;
                    ELJ elj = (ELJ) f0c.getValue();
                    String str2 = c6630ELaA00.A01;
                    int i = c6630ELaA00.A00;
                    ELO elo = (ELO) DBUtil__DBUtil_androidKt.A01(elj.A01, new C7598F5l(i, str2, 0), true, false);
                    if (elo != null) {
                        iIntValue = elo.A01;
                    } else {
                        Object objRunInTransaction = en1.A00.runInTransaction(new CallableC7564F4d(en1, 2));
                        C7384Etj.A0U(objRunInTransaction);
                        iIntValue = ((Number) objRunInTransaction).intValue();
                        ELO elo2 = new ELO(str2, i, iIntValue);
                        ELJ elj2 = (ELJ) f0c.getValue();
                        DBUtil__DBUtil_androidKt.A01(elj2.A01, new C7592F5f(10, elj2, elo2), false, true);
                    }
                    A03(eke, iIntValue);
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    @Override // X.ELY
    public final void cancel(String workSpecId) {
        Context context = this.A01;
        JobScheduler jobScheduler = this.A00;
        ArrayList arrayListA00 = A00(jobScheduler, context);
        if (arrayListA00 != null) {
            ArrayList arrayListA11 = C60O.A11(2);
            Iterator it = arrayListA00.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                PersistableBundle extras = jobInfo.getExtras();
                if (extras != null) {
                    try {
                        if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                            extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0);
                            String string = extras.getString("EXTRA_WORK_SPEC_ID");
                            C7384Etj.A0Y(string, 0);
                            if (workSpecId.equals(string)) {
                                C60Q.A1P(arrayListA11, jobInfo.getId());
                            }
                        }
                    } catch (NullPointerException unused) {
                    }
                }
            }
            if (arrayListA11.isEmpty()) {
                return;
            }
            Iterator it2 = arrayListA11.iterator();
            while (it2.hasNext()) {
                int iA03 = C60Q.A03(it2);
                EK9.A00().A02(A05, FGI.A0V("Cancelling work ID ", workSpecId, ", Job ID ", iA03));
                A01(jobScheduler, iA03);
            }
            ELJ elj = (ELJ) ((WorkDatabase_Impl) this.A03).A03.getValue();
            C7384Etj.A0Y(workSpecId, 0);
            DBUtil__DBUtil_androidKt.A01(elj.A01, new C7596F5j(workSpecId, 4), false, true);
        }
    }

    public EKB(Context context, EKi workDatabase, WorkDatabase configuration) {
        JobScheduler jobSchedulerA00 = EKA.A00(context);
        EKC ekc = new EKC(context, workDatabase.A01);
        this.A01 = context;
        this.A00 = jobSchedulerA00;
        this.A04 = ekc;
        this.A03 = configuration;
        this.A02 = workDatabase;
    }

    public static void A01(JobScheduler jobScheduler, int id) {
        try {
            jobScheduler.cancel(id);
        } catch (Throwable th) {
            EK9.A00();
            Log.e(A05, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", BV5.A1Y(id)), th);
        }
    }
}
