package androidx.work.impl.background.systemjob;

import X.AbstractC5222Ddf;
import X.AnonymousClass007;
import X.BV4;
import X.BV5;
import X.C6616EKj;
import X.C6630ELa;
import X.C7384Etj;
import X.EK5;
import X.EK8;
import X.EK9;
import X.EKU;
import X.EKV;
import X.EL6;
import X.ELR;
import X.ELW;
import X.EMx;
import X.EN7;
import X.ENP;
import X.InterfaceC6635ELf;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes5.dex */
public class SystemJobService extends JobService implements InterfaceC6635ELf {
    public static final String A04 = EK9.A01("SystemJobService");
    public EN7 A00;
    public EK5 A01;
    public final Map<C6630ELa, JobParameters> A03 = BV4.A0u();
    public final ELR A02 = new EK8();

    @Override // X.InterfaceC6635ELf
    public final void ATA(C6630ELa id, boolean needsReschedule) {
        A00("onExecuted");
        JobParameters jobParametersRemove = this.A03.remove(id);
        this.A02.AaX(id);
        if (jobParametersRemove != null) {
            BV4.A1E(EK9.A00(), id.A01, " executed on JobScheduler", A04);
            jobFinished(jobParametersRemove, needsReschedule);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters params) {
        A00("onStartJob");
        if (this.A01 == null) {
            EK9.A00().A02(A04, "WorkManager is not initialized; requesting retry.");
            jobFinished(params, true);
            return false;
        }
        try {
            PersistableBundle extras = params.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                C6630ELa c6630ELa = new C6630ELa(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
                Map<C6630ELa, JobParameters> map = this.A03;
                boolean zContainsKey = map.containsKey(c6630ELa);
                EK9 ek9A00 = EK9.A00();
                String str = A04;
                if (zContainsKey) {
                    ek9A00.A02(str, AnonymousClass007.A0a("Job is already being executed by SystemJobService: ", c6630ELa));
                    return false;
                }
                ek9A00.A02(str, AnonymousClass007.A0a("onStartJob for ", c6630ELa));
                map.put(c6630ELa, params);
                ELW elw = new ELW();
                if (params.getTriggeredContentUris() != null) {
                    elw.A02 = Arrays.asList(params.getTriggeredContentUris());
                }
                if (params.getTriggeredContentAuthorities() != null) {
                    elw.A01 = Arrays.asList(params.getTriggeredContentAuthorities());
                }
                elw.A00 = params.getNetwork();
                EN7 en7 = this.A00;
                EMx eMxAhB = this.A02.AhB(c6630ELa);
                EL6 el6 = (EL6) en7;
                C7384Etj.A0Y(eMxAhB, 0);
                ENP enp = el6.A01;
                ((C6616EKj) enp).A01.execute(new EKV(elw, eMxAhB, el6));
                return true;
            }
        } catch (NullPointerException unused) {
        }
        EK9.A00();
        Log.e(A04, "WorkSpec id not found!");
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters params) {
        boolean zContains;
        A00("onStopJob");
        if (this.A01 == null) {
            EK9.A00().A02(A04, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        try {
            PersistableBundle extras = params.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                C6630ELa c6630ELa = new C6630ELa(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
                EK9.A00().A02(A04, AnonymousClass007.A0a("onStopJob for ", c6630ELa));
                this.A03.remove(c6630ELa);
                EMx eMxAaX = this.A02.AaX(c6630ELa);
                if (eMxAaX != null) {
                    this.A00.AgU(eMxAaX, Build.VERSION.SDK_INT >= 31 ? AbstractC5222Ddf.A00(params) : -512);
                }
                EKU eku = this.A01.A03;
                String str = c6630ELa.A01;
                synchronized (eku.A09) {
                    zContains = eku.A08.contains(str);
                }
                return !zContains;
            }
        } catch (NullPointerException unused) {
        }
        EK9.A00();
        Log.e(A04, "WorkSpec id not found!");
        return false;
    }

    public static void A00(String methodName) {
        if (BV5.A0s() != Thread.currentThread()) {
            throw BV5.A0V("Cannot invoke ", methodName, " on a background thread");
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            EK5 ek5A00 = EK5.A00(getApplicationContext());
            this.A01 = ek5A00;
            EKU eku = ek5A00.A03;
            this.A00 = new EL6(eku, ek5A00.A06);
            eku.A02(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            EK9.A00();
            Log.w(A04, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        EK5 ek5 = this.A01;
        if (ek5 != null) {
            EKU eku = ek5.A03;
            synchronized (eku.A09) {
                eku.A0A.remove(this);
            }
        }
    }
}
