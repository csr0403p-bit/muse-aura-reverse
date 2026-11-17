package com.facebook.acra.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* loaded from: classes5.dex */
public final class PackageManagerWrapper {
    public final Context context;
    public final String logTag;

    public String getInstallerPackageName() {
        PackageManager packageManager = this.context.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        return packageManager.getInstallerPackageName(this.context.getPackageName());
    }

    public PackageInfo getPackageInfo() {
        return getPackageInfo(this.context.getPackageName(), 0);
    }

    public boolean hasPermission(String str) {
        PackageManager packageManager = this.context.getPackageManager();
        if (packageManager != null) {
            return packageManager.checkPermission(str, this.context.getPackageName()) == 0;
        }
        return false;
    }

    public PackageManagerWrapper(Context context, String str) {
        this.context = context;
        this.logTag = str;
    }

    public PackageInfo getPackageInfo(String str, int i) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = this.context.getPackageManager();
        PackageInfo packageInfo = null;
        if (packageManager != null) {
            try {
                packageInfo = packageManager.getPackageInfo(str, i);
                return packageInfo;
            } catch (PackageManager.NameNotFoundException unused) {
                this.context.getPackageName();
            } catch (RuntimeException unused2) {
                return packageInfo;
            }
        }
        return packageInfo;
    }
}
