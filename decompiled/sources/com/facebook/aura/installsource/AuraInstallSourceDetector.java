package com.facebook.aura.installsource;

import X.AnonymousClass002;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.CFK;
import X.DLO;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger;
import com.facebook.aura.commands.notifications.WorkAppNotificationFilterKt;
import java.util.Set;

/* loaded from: classes5.dex */
public final class AuraInstallSourceDetector {
    public static final int SYSTEM_IMAGE_FLAGS = 129;
    public static volatile AuraInstallSource cachedInstallSource;
    public static final AuraInstallSourceDetector INSTANCE = new AuraInstallSourceDetector();
    public static final Set<String> OXYGEN_INSTALLERS = C60O.A19("com.facebook.system", "com.facebook.appmanager");
    public static final Set<String> OXYGEN_DEBUG_INSTALLERS = C60O.A19("com.facebook.system.dev", "com.facebook.appmanager.dev");
    public static final Set<String> MOBILE_HOME_INSTALLERS = C60O.A19(WorkAppNotificationFilterKt.MOBILEHOME_PKG, "com.facebook.mobilehome_debug");

    public final AuraInstallSource getInstallSource(Context context) {
        C7384Etj.A0Y(context, 0);
        AuraInstallSource auraInstallSource = cachedInstallSource;
        if (auraInstallSource != null) {
            return auraInstallSource;
        }
        AuraInstallSource auraInstallSourceResolveInstallSource = resolveInstallSource(context);
        cachedInstallSource = auraInstallSourceResolveInstallSource;
        return auraInstallSourceResolveInstallSource;
    }

    public final boolean isInternalToolingAllowed(Context context) {
        C7384Etj.A0Y(context, 0);
        int iOrdinal = getInstallSource(context).ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 0) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw C3cG.A0q();
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean isOxygenInstall(Context context) {
        C7384Etj.A0Y(context, 0);
        int iOrdinal = getInstallSource(context).ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 0 || iOrdinal == 3 || iOrdinal == 4) {
            return false;
        }
        throw C3cG.A0q();
    }

    public final boolean isPlayStoreInstall(Context context) {
        C7384Etj.A0Y(context, 0);
        return getInstallSource(context) == AuraInstallSource.PLAY_STORE;
    }

    public final boolean isPublicInstall(Context context) {
        C7384Etj.A0Y(context, 0);
        int iOrdinal = getInstallSource(context).ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 0) {
                    if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            return isSystemPreload(context);
                        }
                        throw C3cG.A0q();
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean isSystemPreload(Context context) {
        C7384Etj.A0Y(context, 0);
        return (context.getApplicationInfo().flags & SYSTEM_IMAGE_FLAGS) != 0;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraInstallSource.values().length];
            try {
                AnonymousClass002.A13(AuraInstallSource.OXYGEN, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraInstallSource.OXYGEN_DEBUG, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraInstallSource.PLAY_STORE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AuraInstallSource.MOBILE_HOME, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(AuraInstallSource.OTHER, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final AuraInstallSource resolveInstallSource(Context context) {
        String installerPackageName;
        try {
            installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            if (installerPackageName == null) {
                installerPackageName = "";
            }
        } catch (IllegalArgumentException e) {
            CFK.A0K("PackageUtil", e, "Failed to get installer package name due to invalid package name");
            installerPackageName = "unknown";
        }
        String[] strArr = DLO.A00;
        if (!HatchInstallReferrerLogger.PLAY_STORE_PACKAGE.equals(installerPackageName)) {
            String[] strArr2 = DLO.A00;
            int i = 0;
            while (!installerPackageName.equals(strArr2[i])) {
                i++;
                if (i >= 2) {
                    return OXYGEN_INSTALLERS.contains(installerPackageName) ? AuraInstallSource.OXYGEN : OXYGEN_DEBUG_INSTALLERS.contains(installerPackageName) ? AuraInstallSource.OXYGEN_DEBUG : MOBILE_HOME_INSTALLERS.contains(installerPackageName) ? AuraInstallSource.MOBILE_HOME : AuraInstallSource.OTHER;
                }
            }
        }
        return AuraInstallSource.PLAY_STORE;
    }
}
