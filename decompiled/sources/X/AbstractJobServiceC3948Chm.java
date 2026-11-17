package X;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.RemoteException;
import android.os.Trace;
import com.facebook.analytics2.logger.interfaces.IllegalRemoteArgumentException;
import com.facebook.analytics2.logger.legacy.uploader.LollipopUploadServiceDelegate;
import com.facebook.common.build.BuildConstants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

/* renamed from: X.Chm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractJobServiceC3948Chm extends JobService {
    public static final Set<String> A01 = C60O.A13();
    public AbstractC3951Chp A00;

    private final synchronized AbstractC3951Chp A01() throws Throwable {
        AbstractC3951Chp abstractC3951Chp;
        CIT.A00();
        synchronized (this) {
            try {
                abstractC3951Chp = this.A00;
                if (abstractC3951Chp == null) {
                    AbstractC3191C2p.A00("AsyncJobService.getDelegateInstance()");
                    try {
                        try {
                            Object objNewInstance = Class.forName("com.facebook.analytics2.logger.legacy.uploader.LollipopUploadServiceDelegate").getDeclaredConstructor(AbstractJobServiceC3948Chm.class).newInstance(this);
                            C7384Etj.A0Z(objNewInstance, "null cannot be cast to non-null type com.facebook.startup.services.AsyncJobServiceDelegate");
                            abstractC3951Chp = (AbstractC3951Chp) objNewInstance;
                            Trace.endSection();
                            this.A00 = abstractC3951Chp;
                        } catch (Exception e) {
                            if (e instanceof InvocationTargetException) {
                                Throwable cause = ((InvocationTargetException) e).getCause();
                                if (cause == null) {
                                    cause = e;
                                }
                                if (cause instanceof RuntimeException) {
                                    throw cause;
                                }
                                throw BV4.A0e(cause);
                            }
                            if ((e instanceof ClassNotFoundException) || (e instanceof InstantiationException) || (e instanceof NoSuchMethodException) || (e instanceof IllegalAccessException)) {
                                throw new IllegalArgumentException(e);
                            }
                            throw BV4.A0e(e);
                        }
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC3951Chp;
        C1H.A00(abstractC3951Chp);
        synchronized (abstractC3951Chp) {
            try {
                if (!abstractC3951Chp.A00) {
                    abstractC3951Chp.A00 = true;
                    super.onCreate();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return abstractC3951Chp;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        C7384Etj.A0Y(context, 0);
        AbstractC3191C2p.A00("AsyncJobService.attachBaseContext()");
        super.attachBaseContext(context);
        A01();
        Trace.endSection();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C7384Etj.A0Y(configuration, 0);
        super.onConfigurationChanged(configuration);
        Trace.endSection();
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        int i;
        boolean z = false;
        C7384Etj.A0Y(jobParameters, 0);
        AbstractC3191C2p.A00("AsyncJobService.onStartJob()");
        LollipopUploadServiceDelegate lollipopUploadServiceDelegate = (LollipopUploadServiceDelegate) A01();
        PersistableBundle extras = jobParameters.getExtras();
        if (extras == null) {
            CFK.A04("LollipopUploadServiceDel", "Job with no build ID, cancelling job");
        } else {
            try {
                i = extras.getInt("__VERSION_CODE", 0);
            } catch (Exception e) {
                CFK.A0J("LollipopUploadServiceDel", e, "Corrupt bundle, cancelling job");
            }
            if (BuildConstants.A01() == i) {
                try {
                    C4053Ckw c4053Ckw = lollipopUploadServiceDelegate.A00;
                    C1H.A00(c4053Ckw);
                    int jobId = jobParameters.getJobId();
                    c4053Ckw.A05(new C4045Cko(new Bundle(jobParameters.getExtras())), new C3949Chn(jobParameters, lollipopUploadServiceDelegate), jobParameters.getExtras().getString("action"), jobId);
                    z = true;
                } catch (IllegalRemoteArgumentException e2) {
                    CFK.A0A("LollipopUploadServiceDel", "Misunderstood job service extras: %s", e2);
                    z = false;
                }
                Trace.endSection();
                return z;
            }
            BV4.A1B(i, "LollipopUploadServiceDel", "Job with old build ID: %d, cancelling job");
        }
        CFK.A03(Integer.valueOf(jobParameters.getJobId()), "LollipopUploadServiceDel", "Stale job parameters, cancelling jobId: %d");
        Trace.endSection();
        return z;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        C7384Etj.A0Y(jobParameters, 0);
        AbstractC3191C2p.A00("AsyncJobService.onStopJob()");
        C4053Ckw c4053Ckw = ((LollipopUploadServiceDelegate) A01()).A00;
        if (c4053Ckw != null) {
            c4053Ckw.A04(jobParameters.getJobId());
        }
        Trace.endSection();
        return true;
    }

    @Override // android.app.Service
    public final void onCreate() {
        AbstractC3191C2p.A00("AsyncJobService.onCreate()");
        LollipopUploadServiceDelegate lollipopUploadServiceDelegate = (LollipopUploadServiceDelegate) A01();
        lollipopUploadServiceDelegate.A00 = C4053Ckw.A00(lollipopUploadServiceDelegate.A01);
        Trace.endSection();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        AbstractC3191C2p.A00("AsyncJobService.onDestroy()");
        A01().A00();
        Trace.endSection();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        Trace.endSection();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        super.onRebind(intent);
        Trace.endSection();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        Trace.endSection();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) throws IllegalRemoteArgumentException, RemoteException {
        AbstractC3191C2p.A00("AsyncJobService.onStartCommand()");
        LollipopUploadServiceDelegate lollipopUploadServiceDelegate = (LollipopUploadServiceDelegate) A01();
        C4053Ckw c4053Ckw = lollipopUploadServiceDelegate.A00;
        C1H.A00(c4053Ckw);
        int iA03 = c4053Ckw.A03(intent, new C3958Chx(lollipopUploadServiceDelegate.A01, i2));
        Trace.endSection();
        return iA03;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        Trace.endSection();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Trace.endSection();
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        boolean zOnUnbind = super.onUnbind(intent);
        Trace.endSection();
        return zOnUnbind;
    }

    public static AbstractJobServiceC3948Chm A00(AbstractJobServiceC3948Chm abstractJobServiceC3948Chm, String str) {
        AbstractC3191C2p.A00(str);
        return abstractJobServiceC3948Chm.A01().A01;
    }

    public final void A02() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        AnonymousClass005.A0x(fileDescriptor, printWriter, strArr);
        super.dump(fileDescriptor, printWriter, strArr);
        Trace.endSection();
    }
}
