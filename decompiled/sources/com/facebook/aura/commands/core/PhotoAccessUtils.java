package com.facebook.aura.commands.core;

import X.AnonymousClass002;
import X.C7384Etj;
import android.content.Context;
import android.os.Build;

/* loaded from: classes3.dex */
public final class PhotoAccessUtils {
    public static final int $stable = 0;
    public static final PhotoAccessUtils INSTANCE = new PhotoAccessUtils();

    public final boolean isFullLibraryGranted(Context context) {
        C7384Etj.A0Y(context, 0);
        return AnonymousClass002.A1M(context.checkSelfPermission(Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE"));
    }

    public final boolean isMediaLocationGranted(Context context) {
        C7384Etj.A0Y(context, 0);
        return AnonymousClass002.A1M(context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION"));
    }

    public final boolean isReadGranted(Context context) {
        C7384Etj.A0Y(context, 0);
        return isFullLibraryGranted(context) || isSelectedOnlyGranted(context);
    }

    public final boolean isSelectedOnlyGranted(Context context) {
        C7384Etj.A0Y(context, 0);
        return Build.VERSION.SDK_INT >= 34 && AnonymousClass002.A1M(context.checkSelfPermission("android.permission.READ_MEDIA_VISUAL_USER_SELECTED"));
    }

    public final String readPermission() {
        return Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE";
    }

    public final String[] requestPermissions() {
        return Build.VERSION.SDK_INT >= 34 ? new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"} : new String[]{readPermission()};
    }

    private final boolean isGranted(Context context, String str) {
        return AnonymousClass002.A1M(context.checkSelfPermission(str));
    }
}
