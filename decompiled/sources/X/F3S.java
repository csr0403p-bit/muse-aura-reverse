package X;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.util.Log;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.util.HashMap;

/* loaded from: classes5.dex */
public abstract class F3S {
    public static final String A00 = C7384Etj.A0I("PackageManagerHelper");
    public static final HashMap<ComponentName, Boolean> A01 = BV4.A0u();

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/pm/PackageManager;Landroid/content/ComponentName;ZLX/G0V<-Landroid/content/pm/PackageManager;-Landroid/content/ComponentName;Ljava/lang/Boolean;>;)V */
    public static final void A00(ComponentName componentName, PackageManager packageManager, G0V g0v, boolean z) {
        try {
            if (z != AnonymousClass001.A1X(g0v.invoke(packageManager, componentName))) {
                packageManager.setComponentEnabledSetting(componentName, BV5.A01(z ? 1 : 0), 1);
                EK9.A00().A02(A00, FGI.A0U(componentName.getClassName(), InviteCodeScratcherKt.CODE_SEPARATOR, z ? "enabled" : "disabled"));
            }
        } catch (Exception e) {
            EK9 ek9A00 = EK9.A00();
            String str = A00;
            String strA0U = FGI.A0U(componentName.getClassName(), " could not be ", z ? "enabled" : "disabled");
            if (ek9A00.A00 <= 3) {
                Log.d(str, strA0U, e);
            }
        }
    }
}
