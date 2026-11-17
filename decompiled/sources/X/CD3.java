package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.voltron.runtime.ModuleApkUtil$ModuleResolver;

/* loaded from: classes5.dex */
public abstract class CD3 {
    public static final CDA A00(Context context, String str) {
        CDA cdaA00 = ModuleApkUtil$ModuleResolver.A00(context, str);
        if (cdaA00.A01 != null) {
            return cdaA00;
        }
        try {
            Context contextCreatePackageContext = context.createPackageContext(context.getPackageName(), 0);
            C7384Etj.A0X(contextCreatePackageContext);
            context = contextCreatePackageContext;
        } catch (PackageManager.NameNotFoundException e) {
            CFK.A0A("ModuleApkUtil", FGI.A0M("Unable to get updated context for package: ", context.getPackageName()), e);
        }
        return ModuleApkUtil$ModuleResolver.A00(context, str);
    }
}
