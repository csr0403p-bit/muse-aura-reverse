package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.common.gcmcompat.OneoffTask;
import java.util.Iterator;
import java.util.List;
import org.webrtc.HardwareVideoEncoderFactory;

@Deprecated
/* renamed from: X.Chg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3947Chg {
    public static C3947Chg A01;
    public static final Integer A02 = BV4.A0Z();
    public final Context A00;

    public static Intent A00(ComponentName componentName, C3947Chg c3947Chg, String str) {
        C7m8 c7m8 = new C7m8();
        c7m8.A03 = componentName;
        return C60P.A03("com.google.android.gms.gcm.ACTION_SCHEDULE").setPackage(AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE).putExtra("scheduler_action", str).putExtra(ErrorReportingConstants.APP_NAME_KEY, c7m8.A02(c3947Chg.A00, 0, 0)).putExtra(PhotosSearchHandlerKt.PARAM_SOURCE, A02).putExtra("source_version", 12451000);
    }

    @Deprecated
    public static synchronized C3947Chg A01(Context context) {
        C3947Chg c3947Chg;
        c3947Chg = A01;
        if (c3947Chg == null) {
            c3947Chg = new C3947Chg(context.getApplicationContext());
            A01 = c3947Chg;
        }
        return c3947Chg;
    }

    public static void A02(C3947Chg c3947Chg, String str) {
        if (str == null) {
            throw BV4.A0a("GcmTaskService must not be null.");
        }
        Intent intentA03 = C60P.A03("com.google.android.gms.gcm.ACTION_TASK_READY");
        Context context = c3947Chg.A00;
        intentA03.setPackage(context.getPackageName());
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intentA03, 512);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            throw C60O.A0i("There is no GcmTaskService component registered within this package. Have you extended GcmTaskService correctly?");
        }
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            if (serviceInfo != null && ((PackageItemInfo) serviceInfo).name.equals(str)) {
                return;
            }
        }
        throw C60O.A0i("The GcmTaskService class you provided  does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY.");
    }

    @Deprecated
    public final void A03(OneoffTask oneoffTask) {
        String str = oneoffTask.A04;
        A02(this, str);
        Context context = this.A00;
        Intent intentA00 = A00(new ComponentName(context, str), this, "SCHEDULE_TASK");
        if (intentA00 != null) {
            Bundle bundleA0N = BV6.A0N();
            Bundle bundleA0N2 = BV6.A0N();
            bundleA0N2.putInt("retry_policy", 0);
            bundleA0N2.putInt("initial_backoff_seconds", 30);
            bundleA0N2.putInt("maximum_backoff_seconds", HardwareVideoEncoderFactory.PERIODIC_KEY_FRAME_INTERVAL_S);
            bundleA0N.putString("tag", oneoffTask.A05);
            bundleA0N.putBoolean(C8j2.A00(76), oneoffTask.A08);
            bundleA0N.putBoolean("persisted", oneoffTask.A06);
            bundleA0N.putString("service", str);
            bundleA0N.putInt("requiredNetwork", oneoffTask.A02);
            bundleA0N.putBoolean("requiresCharging", oneoffTask.A07);
            bundleA0N.putBoolean("requiresIdle", false);
            bundleA0N.putBundle("retryStrategy", bundleA0N2);
            bundleA0N.putBundle("extras", oneoffTask.A03);
            bundleA0N.putLong("window_start", oneoffTask.A01);
            bundleA0N.putLong("window_end", oneoffTask.A00);
            intentA00.putExtras(bundleA0N);
            context.sendBroadcast(intentA00);
        }
    }

    public C3947Chg(Context context) {
        this.A00 = context;
    }
}
