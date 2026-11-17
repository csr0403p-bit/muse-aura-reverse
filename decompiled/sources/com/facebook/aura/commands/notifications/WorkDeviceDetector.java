package com.facebook.aura.commands.notifications;

import X.AnonymousClass003;
import X.C7384Etj;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class WorkDeviceDetector {
    public static final WorkDeviceDetector INSTANCE = new WorkDeviceDetector();

    public final String deviceOwnerPackage(Context context) {
        DevicePolicyManager devicePolicyManager;
        String next;
        ComponentName next2;
        C7384Etj.A0Y(context, 0);
        Object systemService = context.getSystemService("device_policy");
        if (!(systemService instanceof DevicePolicyManager) || (devicePolicyManager = (DevicePolicyManager) systemService) == null) {
            return null;
        }
        Iterator<String> it = WorkDeviceDetectorKt.KNOWN_DPC_PACKAGES.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (devicePolicyManager.isDeviceOwnerApp(next)) {
                break;
            }
        }
        String str = next;
        if (str != null) {
            return str;
        }
        List<ComponentName> activeAdmins = devicePolicyManager.getActiveAdmins();
        if (activeAdmins != null) {
            Iterator<ComponentName> it2 = activeAdmins.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (devicePolicyManager.isDeviceOwnerApp(next2.getPackageName())) {
                    break;
                }
            }
            ComponentName componentName = next2;
            if (componentName != null) {
                return componentName.getPackageName();
            }
        }
        return null;
    }

    public final boolean hasWorkProfile(Context context) {
        UserManager userManager;
        C7384Etj.A0Y(context, 0);
        Object systemService = context.getSystemService("user");
        if ((systemService instanceof UserManager) && (userManager = (UserManager) systemService) != null) {
            List<UserHandle> userProfiles = userManager.getUserProfiles();
            C7384Etj.A0U(userProfiles);
            if (!(userProfiles instanceof Collection) || !userProfiles.isEmpty()) {
                Iterator<UserHandle> it = userProfiles.iterator();
                while (it.hasNext()) {
                    if (!C7384Etj.areEqual(it.next(), Process.myUserHandle())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean isFullyManagedDevice(Context context) {
        C7384Etj.A0Y(context, 0);
        return deviceOwnerPackage(context) != null;
    }

    public final boolean isManagedProfileUser(Context context, UserHandle userHandle) {
        UserManager userManager;
        C7384Etj.A0Y(context, 0);
        if (userHandle == null || userHandle.equals(Process.myUserHandle())) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        if (!(systemService instanceof UserManager) || (userManager = (UserManager) systemService) == null) {
            return false;
        }
        return userManager.getUserProfiles().contains(userHandle);
    }

    public final String installerPackageOf(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            return Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(str).getInstallingPackageName() : packageManager.getInstallerPackageName(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
