package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import androidx.health.connect.client.impl.HealthConnectClientImpl;
import androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl;
import com.facebook.aura.health.HealthConnectPermissionUtils;
import java.util.List;

/* renamed from: X.Hws, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10586Hws {
    public static final /* synthetic */ C10586Hws A00 = new C10586Hws();

    public static final InterfaceC9037FxJ A01(Context context) throws PackageManager.NameNotFoundException {
        C7384Etj.A0Y(context, 0);
        int iA00 = A00(context);
        if (iA00 == 1) {
            throw C8j3.A18("SDK version too low or running in a profile");
        }
        if (iA00 != 2) {
            return Build.VERSION.SDK_INT >= 34 ? new HealthConnectClientUpsideDownImpl(context) : new HealthConnectClientImpl(context);
        }
        throw C3cG.A0Q("Service not available");
    }

    public static final int A00(Context context) throws PackageManager.NameNotFoundException {
        C7384Etj.A0Y(context, 0);
        if (34 <= Build.VERSION.SDK_INT) {
            return HyG.A00(context);
        }
        PackageManager packageManager = context.getPackageManager();
        C7384Etj.A0U(packageManager);
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(HealthConnectPermissionUtils.PROVIDER_PACKAGE, 0);
            C7384Etj.A0X(packageInfo);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || !applicationInfo.enabled || packageInfo.getLongVersionCode() < 68623) {
                return 2;
            }
            Intent intent = new Intent();
            intent.setPackage(HealthConnectPermissionUtils.PROVIDER_PACKAGE);
            intent.setAction("androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            C7384Etj.A0U(listQueryIntentServices);
            return !(listQueryIntentServices.isEmpty() ^ true) ? 2 : 3;
        } catch (PackageManager.NameNotFoundException unused) {
            return 2;
        }
    }
}
