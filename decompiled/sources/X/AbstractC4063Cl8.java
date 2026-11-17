package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.facebook.analytics2.logger.GooglePlayUploadService;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.gcmcompat.OneoffTask;
import java.util.List;

/* renamed from: X.Cl8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4063Cl8 {
    public static AbstractC4063Cl8 A00;

    public final void A02(C4045Cko c4045Cko, String str, int i, long j, long j2) {
        ComponentName componentName;
        String str2;
        int componentEnabledSetting;
        if (this instanceof C4043Ckm) {
            C4043Ckm c4043Ckm = (C4043Ckm) this;
            JobScheduler jobScheduler = c4043Ckm.A01;
            if (jobScheduler == null || (componentName = c4043Ckm.A00) == null) {
                return;
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", str);
            persistableBundle.putInt("__VERSION_CODE", BuildConstants.A01());
            JobInfo.Builder overrideDeadline = new JobInfo.Builder(i, componentName).setMinimumLatency(j).setOverrideDeadline(j2);
            persistableBundle.putString("uploader_class", c4045Cko.A0C);
            C4045Cko.A00(persistableBundle, c4045Cko);
            InterfaceC4014Cju interfaceC4014Cju = c4045Cko.A02;
            persistableBundle.putString("upload_extra_params_user_id", interfaceC4014Cju != null ? ((C4068ClF) interfaceC4014Cju).A00 : null);
            JobInfo jobInfoBuild = overrideDeadline.setExtras(persistableBundle).setRequiredNetworkType(1).setPersisted(false).build();
            if (jobInfoBuild != null) {
                try {
                    jobScheduler.schedule(jobInfoBuild);
                    return;
                } catch (IllegalArgumentException e) {
                    PackageManager packageManager = c4043Ckm.A02.getPackageManager();
                    if (packageManager != null && (componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName)) != 1 && componentEnabledSetting != 2 && componentEnabledSetting != 3 && componentEnabledSetting != 4) {
                        try {
                            packageManager.getServiceInfo(componentName, 512).isEnabled();
                        } catch (Throwable th) {
                            CFK.A08("LollipopUploadScheduler", "Error getting serviceInfo from PackageManager", th);
                        }
                    }
                    CFK.A0D("LollipopUploadScheduler", "The Service is disabled, cannot schedule job for %s", e, componentName);
                    return;
                } catch (IllegalStateException e2) {
                    e = e2;
                    str2 = "JobScheduler threw IllegalStateException, skipping schedule";
                    CFK.A0K("LollipopUploadScheduler", e, str2);
                    return;
                } catch (NullPointerException e3) {
                    e = e3;
                    str2 = "Nullpointer exception encountered while scheduling job";
                    CFK.A0K("LollipopUploadScheduler", e, str2);
                    return;
                }
            }
            return;
        }
        Context context = ((C4044Ckn) this).A00;
        synchronized (GooglePlayUploadService.class) {
            GooglePlayUploadService.A01(context);
            long j3 = j / 1000;
            long j4 = j2 / 1000;
            if (j2 < j) {
                CFK.A0I("GooglePlay-MaxDelay", "MaxDelayms(%d) < MinDelayms(%d)", Long.valueOf(j2), Long.valueOf(j));
            }
            if (j3 >= j4) {
                j4 = 1 + j3;
            }
            Bundle bundleA0N = BV6.A0N();
            if (str != null) {
                bundleA0N.putString("action", str);
            }
            bundleA0N.putInt("__VERSION_CODE", BuildConstants.A01());
            String name = GooglePlayUploadService.class.getName();
            String strA0H = FGI.A0H("analytics2-gcm-", i);
            String str3 = c4045Cko.A0C;
            if (str3 != null) {
                bundleA0N.putString("uploader_class", str3);
            }
            String str4 = c4045Cko.A09;
            if (str4 != null) {
                bundleA0N.putString("flexible_sampling_updater", str4);
            }
            String str5 = c4045Cko.A08;
            if (str5 != null) {
                bundleA0N.putString("privacy_policy", str5);
            }
            String str6 = c4045Cko.A0A;
            if (str6 != null) {
                bundleA0N.putString("thread_handler_factory", str6);
            }
            String str7 = c4045Cko.A0B;
            if (str7 != null) {
                bundleA0N.putString("upload_job_instrumentation", str7);
            }
            String absolutePath = c4045Cko.A03.getAbsolutePath();
            if (absolutePath != null) {
                bundleA0N.putString("priority_dir", absolutePath);
            }
            bundleA0N.putInt("network_priority", c4045Cko.A04.intValue());
            String str8 = c4045Cko.A07;
            if (str8 != null) {
                bundleA0N.putString("marauder_tier", str8);
            }
            bundleA0N.putInt("multi_batch_payload_size", c4045Cko.A01);
            bundleA0N.putInt("non_sticky_handling", c4045Cko.A0D ? 1 : 0);
            bundleA0N.putInt("use_fifo_uploads", c4045Cko.A0E ? 1 : 0);
            String str9 = c4045Cko.A05;
            if (str9 != null) {
                bundleA0N.putString("batch_payload_iterator_factory", str9);
            }
            String str10 = c4045Cko.A00;
            if (str10 != null) {
                bundleA0N.putString("acs_provider", str10);
            }
            String str11 = c4045Cko.A06;
            if (str11 != null) {
                bundleA0N.putString("ffdb_provider", str11);
            }
            InterfaceC4014Cju interfaceC4014Cju2 = c4045Cko.A02;
            String str12 = interfaceC4014Cju2 != null ? ((C4068ClF) interfaceC4014Cju2).A00 : null;
            if (str12 != null) {
                bundleA0N.putString("upload_extra_params_user_id", str12);
            }
            boolean z = GooglePlayUploadService.A01;
            OneoffTask.A01(strA0H);
            OneoffTask.A00(bundleA0N);
            if (j3 == -1 || j4 == -1) {
                throw C60O.A0i("Must specify an execution window using setExecutionWindow.");
            }
            if (j3 < 0 || j4 < 0) {
                throw C60O.A0i("Window start and end cannot be negative.");
            }
            if (j3 >= j4) {
                throw C60O.A0i("Window start must be shorter than window end.");
            }
            GooglePlayUploadService.A03(context, new OneoffTask(bundleA0N, name, strA0H, j4, j3, z), i);
            GooglePlayUploadService.A01 = true;
        }
    }

    public static synchronized AbstractC4063Cl8 A00(Context context) {
        AbstractC4063Cl8 c4043Ckm;
        c4043Ckm = A00;
        if (c4043Ckm == null) {
            c4043Ckm = new C4043Ckm(context);
            A00 = c4043Ckm;
        }
        return c4043Ckm;
    }

    public final long A01(int i) {
        C4043Ckm c4043Ckm;
        JobScheduler jobScheduler;
        if (!(this instanceof C4043Ckm) || (jobScheduler = (c4043Ckm = (C4043Ckm) this).A01) == null) {
            return LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        }
        try {
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            if (allPendingJobs == null) {
                return LinkEncryptedPairingKt.LINK_COUNTER_MAX;
            }
            for (JobInfo jobInfo : allPendingJobs) {
                if (jobInfo.getId() == i) {
                    String className = jobInfo.getService().getClassName();
                    String className2 = c4043Ckm.A00.getClassName();
                    if (className.equals(className2)) {
                        return jobInfo.getMinLatencyMillis();
                    }
                    CFK.A0H("LollipopUploadScheduler", "Job scheduled with wrong component. Expected %s, but got %s Cancelling.", className2, className);
                    jobScheduler.cancel(i);
                    return LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                }
            }
            return LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        } catch (NullPointerException e) {
            CFK.A0L("LollipopUploadScheduler", e, "Scheduler binder is null. Skipping scheduling.");
            return LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        }
    }
}
