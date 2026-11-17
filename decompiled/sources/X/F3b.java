package X;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final /* synthetic */ class F3b extends C7438Evz implements G0V<PackageManager, ComponentName, Boolean> {
    public static final F3b A00 = new F3b();

    public F3b() {
        super(2, F3S.class, "isServiceEnabled", "isServiceEnabled(Landroid/content/pm/PackageManager;Landroid/content/ComponentName;)Z", 1);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Boolean invoke(PackageManager packageManager, ComponentName componentName) throws PackageManager.NameNotFoundException {
        boolean zBooleanValue;
        PackageManager packageManager2 = packageManager;
        ComponentName componentName2 = componentName;
        boolean zA1Y = C60P.A1Y(packageManager2, componentName2);
        int componentEnabledSetting = packageManager2.getComponentEnabledSetting(componentName2);
        boolean z = false;
        if (componentEnabledSetting != 0) {
            zBooleanValue = true;
            if (componentEnabledSetting == zA1Y) {
                z = zBooleanValue;
            }
        } else {
            HashMap<ComponentName, Boolean> map = F3S.A01;
            synchronized (map) {
                Boolean bool = map.get(componentName2);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                    z = zBooleanValue;
                } else {
                    try {
                        ServiceInfo serviceInfo = packageManager2.getServiceInfo(componentName2, 512);
                        if (serviceInfo != null) {
                            z = ((ComponentInfo) serviceInfo).enabled;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        EK9.A00();
                        Log.w(F3S.A00, FGI.A0M(componentName2.getClassName(), " could not be found in manifest"), e);
                    }
                    synchronized (map) {
                        BV4.A1G(componentName2, map, z);
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
