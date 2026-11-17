package X;

import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.TransactionTooLargeException;
import com.facebook.analytics2.logger.legacy.uploader.AlarmBasedUploadService;
import com.facebook.aura.wearablebroadcast.MC;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class CHb {
    public static CHb A02;
    public static final String A03 = AlarmBasedUploadService.class.getName();
    public final Context A00;
    public volatile String A01;

    public static synchronized CHb A00(Context context) {
        CHb cHb;
        cHb = A02;
        if (cHb == null) {
            cHb = new CHb(context.getApplicationContext());
            A02 = cHb;
        }
        return cHb;
    }

    public CHb(Context context) {
        this.A00 = context;
    }

    public final boolean A01() {
        String str;
        String str2;
        ServiceInfo[] serviceInfoArr;
        String strA00 = AbstractC3294CCd.A00();
        synchronized (this) {
            if (this.A01 == null) {
                String str3 = A03;
                String str4 = null;
                try {
                    Context context = this.A00;
                    PackageManager packageManager = context.getPackageManager();
                    packageManager.getClass();
                    serviceInfoArr = packageManager.getPackageInfo(context.getPackageName(), MC.wearables_hatch.__CONFIG__).services;
                } catch (PackageManager.NameNotFoundException e) {
                    CFK.A0E("UploadServiceProcessUtil", "Package %s cannot  be found!", e, this.A00.getPackageName());
                } catch (RuntimeException e2) {
                    Throwable cause = e2;
                    while (cause.getCause() != null) {
                        cause = cause.getCause();
                    }
                    if (cause instanceof DeadObjectException) {
                        str2 = "DeadObjectException when trying to get package manager from context";
                    } else {
                        if (!(cause instanceof TransactionTooLargeException)) {
                            throw e2;
                        }
                        str2 = "TransactionTooLargeException Exception when trying to get package manager from context";
                    }
                    CFK.A08("UploadServiceProcessUtil", str2, e2);
                }
                if (serviceInfoArr != null) {
                    for (ServiceInfo serviceInfo : serviceInfoArr) {
                        if (((PackageItemInfo) serviceInfo).name.equals(str3)) {
                            str4 = ((ComponentInfo) serviceInfo).processName;
                            break;
                        }
                    }
                    CFK.A0F("UploadServiceProcessUtil", "Unable to find the UploadService! Services registered: %s", Arrays.deepToString(serviceInfoArr));
                    this.A01 = str4;
                } else {
                    CFK.A0F("UploadServiceProcessUtil", "Unable to find the UploadService! Services registered: %s", Arrays.deepToString(serviceInfoArr));
                    this.A01 = str4;
                }
            }
            str = this.A01;
        }
        if (str == null) {
            return false;
        }
        return str.equals(strA00);
    }
}
