package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;

/* renamed from: X.CMe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3416CMe {
    public static final File A00(Context context, int i) {
        String str;
        switch (i) {
            case 194178138:
                str = "app_sigquit";
                break;
            case 211429074:
                str = "modules";
                break;
            case 345253467:
                str = "app_optsvc_analytics";
                break;
            case 1045170971:
                str = "app_qpl";
                break;
            case 1239662554:
                str = "app_light_prefs";
                break;
            case 1543572765:
                str = "app_analytics";
                break;
            case 1874789883:
                str = "app_minidumps";
                break;
            case 2101388817:
                str = "app_fb-forker-tmp";
                break;
            default:
                throw BV5.A0S("Storage config ", " not in startup registry.", i);
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return C3cG.A0O(BV4.A0G(context.isDeviceProtectedStorage() ? applicationInfo.deviceProtectedDataDir : applicationInfo.dataDir), str);
    }
}
