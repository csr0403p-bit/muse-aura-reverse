package com.facebook.aura.preloads;

import X.AGH;
import X.AbstractC07207oh;
import X.AbstractC7498EyD;
import X.AnonymousClass006;
import X.C3620CZj;
import X.C7384Etj;
import X.CFK;
import X.F2B;
import X.FGI;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.aura.activation.model.HatchInviteLogging;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.oxygen.preloads.sdk.firstparty.settings.AppmanagerRemoteException;
import com.facebook.oxygen.preloads.sdk.firstparty.settings.TosAcceptedFlag;

/* loaded from: classes3.dex */
public final class HatchPreloadsTosRepository {
    public static final HatchPreloadsTosRepository INSTANCE = new HatchPreloadsTosRepository();

    public final boolean shouldAcceptTosSilently(Context context) {
        C7384Etj.A0Y(context, 0);
        if (HatchPreloadsTosRepositoryKt.isPreloadsTosEnabled()) {
            try {
                if (isAppManagerSupported(context)) {
                    F2B f2bA00 = AbstractC7498EyD.A00(context);
                    if (f2bA00.A01) {
                        if (!f2bA00.A02) {
                            return true;
                        }
                    }
                }
            } catch (RuntimeException e) {
                CFK.A0A(HatchPreloadsTosRepositoryKt.TAG, "Failed to read TOS state", e);
                return false;
            }
        }
        return false;
    }

    private final void logOutcome(String str, String str2) {
        try {
            HatchAppEventLogger.INSTANCE.logEvent("preloads_tos_status", "onboarding", null, HatchInviteLogging.EVENT_TYPE_STATUS_CHECK, "preloads_tos", AGH.A0D(AnonymousClass006.A12(HatchMetadataKey.ACTION, str), AnonymousClass006.A12(HatchMetadataKey.RESULT, str2)), null);
        } catch (RuntimeException e) {
            CFK.A0A(HatchPreloadsTosRepositoryKt.TAG, "Failed to log TOS outcome", e);
        }
    }

    public final void recordAccepted(Context context) throws AppmanagerRemoteException, PackageManager.NameNotFoundException {
        String str;
        String str2 = "error";
        C7384Etj.A0Y(context, 0);
        try {
            try {
                PackageManager packageManager = context.getPackageManager();
                packageManager.getClass();
                packageManager.getPackageInfo("com.facebook.appmanager", 0);
                PackageManager packageManager2 = context.getPackageManager();
                packageManager2.getClass();
                ComponentName componentName = new ComponentName(context, (Class<?>) TosAcceptedFlag.class);
                if (packageManager2.getComponentEnabledSetting(componentName) != 1) {
                    packageManager2.setComponentEnabledSetting(componentName, 1, 1);
                    String packageName = context.getPackageName();
                    ContentResolver contentResolver = context.getContentResolver();
                    if (new C3620CZj(context, context.getPackageManager()).A02(2)) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("terms_of_service_accepted", (Integer) 1);
                        try {
                            int iUpdate = contentResolver.update(AbstractC07207oh.A00.buildUpon().appendPath("package").appendPath(packageName).build(), contentValues, null, null);
                            if (iUpdate != 1) {
                                throw new AppmanagerRemoteException(FGI.A0H("Expected 1 row changed, actually ", iUpdate));
                            }
                        } catch (IllegalArgumentException e) {
                            throw new AppmanagerRemoteException(1, "Could not resolve content uri for firstparty settings", e);
                        } catch (Throwable th) {
                            throw new AppmanagerRemoteException(0, "Unexpected failure.", th);
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            str2 = "success";
        } catch (AppmanagerRemoteException e2) {
            e = e2;
            str = "Failed to record TOS acceptance with App Manager";
            CFK.A0A(HatchPreloadsTosRepositoryKt.TAG, str, e);
            logOutcome("acceptance", str2);
        } catch (RuntimeException e3) {
            e = e3;
            str = "Failed to record TOS acceptance";
            CFK.A0A(HatchPreloadsTosRepositoryKt.TAG, str, e);
            logOutcome("acceptance", str2);
        }
        logOutcome("acceptance", str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldShowExplicitTos(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r3 = "show"
            r1 = 0
            X.C7384Etj.A0Y(r5, r1)
            boolean r0 = com.facebook.aura.preloads.HatchPreloadsTosRepositoryKt.isPreloadsTosEnabled()
            if (r0 == 0) goto L3a
            boolean r0 = r4.isAppManagerSupported(r5)     // Catch: java.lang.RuntimeException -> L25
            if (r0 != 0) goto L15
            java.lang.String r1 = "unsupported"
            goto L31
        L15:
            X.F2B r1 = X.AbstractC7498EyD.A00(r5)     // Catch: java.lang.RuntimeException -> L25
            boolean r0 = r1.A01     // Catch: java.lang.RuntimeException -> L25
            if (r0 == 0) goto L22
            boolean r0 = r1.A02     // Catch: java.lang.RuntimeException -> L25
            if (r0 == 0) goto L22
            goto L30
        L22:
            java.lang.String r1 = "not_required"
            goto L31
        L25:
            r2 = move-exception
            java.lang.String r1 = "Failed to read TOS state"
            java.lang.String r0 = "HatchPreloadsTos"
            X.CFK.A0A(r0, r1, r2)
            java.lang.String r1 = "error"
            goto L31
        L30:
            r1 = r3
        L31:
            java.lang.String r0 = "eligibility"
            r4.logOutcome(r0, r1)
            boolean r1 = r1.equals(r3)
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.preloads.HatchPreloadsTosRepository.shouldShowExplicitTos(android.content.Context):boolean");
    }

    private final boolean isAppManagerSupported(Context context) {
        return new C3620CZj(context, context.getPackageManager()).A02(42);
    }

    public final boolean isEnabled() {
        return HatchPreloadsTosRepositoryKt.isPreloadsTosEnabled();
    }
}
