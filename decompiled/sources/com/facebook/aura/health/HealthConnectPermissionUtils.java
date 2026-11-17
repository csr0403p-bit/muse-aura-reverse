package com.facebook.aura.health;

import X.AnonymousClass003;
import X.BGK;
import X.BV3;
import X.C067278z;
import X.C10586Hws;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.HtJ;
import X.Hx6;
import X.HzP;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.facebook.aura.health.HealthConnectConnectAction;
import com.meta.health.healthconnect.HealthConnectPlugin;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HealthConnectPermissionUtils {
    public static final String PERMISSION_REQUEST_ACTION = "androidx.health.ACTION_REQUEST_PERMISSIONS";
    public static final String PROVIDER_PACKAGE = "com.google.android.apps.healthdata";
    public static volatile Set<String> grantableSpecialPermissions;
    public static final HealthConnectPermissionUtils INSTANCE = new HealthConnectPermissionUtils();
    public static final AtomicBoolean granted = C60O.A1E();

    @DebugMetadata(c = "com.facebook.aura.health.HealthConnectPermissionUtils", f = "HealthConnectPermissionUtils.kt", l = {75}, m = "refreshGrantedState", v = 2)
    /* renamed from: com.facebook.aura.health.HealthConnectPermissionUtils$refreshGrantedState$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectPermissionUtils.this.refreshGrantedState(null, this);
        }
    }

    public final HealthConnectConnectAction connectAction(Context context, boolean z) {
        HealthConnectConnectAction healthConnectConnectAction;
        C7384Etj.A0Y(context, 0);
        if (z) {
            healthConnectConnectAction = HealthConnectConnectAction.OpenSettings.INSTANCE;
        } else if (isAvailable(context)) {
            Set<String> set = grantableSpecialPermissions;
            if (set != null) {
                return new HealthConnectConnectAction.RequestPermissions(set);
            }
            healthConnectConnectAction = HealthConnectConnectAction.OpenSettings.INSTANCE;
        } else {
            healthConnectConnectAction = HealthConnectConnectAction.InstallProvider.INSTANCE;
        }
        return healthConnectConnectAction;
    }

    public final boolean isAvailable(Context context) {
        C7384Etj.A0Y(context, 0);
        try {
            return C10586Hws.A00(context) == 3;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean isSupported(Context context) {
        C7384Etj.A0Y(context, 0);
        return C10586Hws.A00(context) != 1;
    }

    public final void openPermissionSettings(Context context) {
        C7384Etj.A0Y(context, 0);
        launchActivity(context, Build.VERSION.SDK_INT >= 34 ? C60R.A09(context) : settingsIntent());
    }

    public final void openProviderInstall(Context context) {
        C7384Etj.A0Y(context, 0);
        Intent intentA09 = C60Q.A09(Uri.parse("market://details?id=com.google.android.apps.healthdata&url=healthconnect%3A%2F%2Fonboarding"));
        intentA09.setPackage(BV3.A00(2));
        intentA09.putExtra("overlay", true);
        intentA09.putExtra("callerId", context.getPackageName());
        launchActivity(context, intentA09);
    }

    public final boolean isGranted() {
        return granted.get();
    }

    public final Hx6<Set<String>, Set<String>> permissionRequestContract() {
        return new C067278z(PROVIDER_PACKAGE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshGrantedState(android.content.Context r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.health.HealthConnectPermissionUtils.AnonymousClass1
            if (r0 == 0) goto L3f
            r5 = r8
            com.facebook.aura.health.HealthConnectPermissionUtils$refreshGrantedState$1 r5 = (com.facebook.aura.health.HealthConnectPermissionUtils.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 != r3) goto L45
            X.Hwg.A00(r0)
        L20:
            boolean r0 = X.AnonymousClass001.A1X(r0)
            r6.setGranted(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2a:
            X.78T r2 = X.AnonymousClass002.A0s(r0)
            r1 = 0
            com.facebook.aura.health.HealthConnectPermissionUtils$refreshGrantedState$minimallyGranted$1 r0 = new com.facebook.aura.health.HealthConnectPermissionUtils$refreshGrantedState$minimallyGranted$1
            r0.<init>(r7, r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r0 = X.GAo.A00(r5, r2, r0)
            if (r0 != r4) goto L20
            return r4
        L3f:
            com.facebook.aura.health.HealthConnectPermissionUtils$refreshGrantedState$1 r5 = new com.facebook.aura.health.HealthConnectPermissionUtils$refreshGrantedState$1
            r5.<init>(r8)
            goto L12
        L45:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.health.HealthConnectPermissionUtils.refreshGrantedState(android.content.Context, X.HtJ):java.lang.Object");
    }

    public final Set<String> requiredPermissions() {
        return BGK.A01(HealthConnectPlugin.A07, HealthConnectPlugin.A08.getValue());
    }

    public final void setGranted(boolean z) {
        if (!granted.getAndSet(z) || z) {
            return;
        }
        HealthConnectorTelemetry.INSTANCE.disconnected("google_health_connect", "permission_revoked");
    }

    public final Intent settingsIntent() {
        return C60P.A03(Build.VERSION.SDK_INT >= 34 ? "android.health.connect.action.HEALTH_HOME_SETTINGS" : "androidx.health.ACTION_HEALTH_CONNECT_SETTINGS");
    }

    private final void launchActivity(Context context, Intent intent) {
        try {
            C60Q.A0S().A05(context, intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    private final int sdkStatus(Context context) {
        try {
            return C10586Hws.A00(context);
        } catch (Exception unused) {
            return 1;
        }
    }

    public final boolean isMinimallyGranted(Set<String> set, Set<String> set2) {
        AnonymousClass003.A0u(set, set2);
        return HealthConnectPlugin.A0E(set, set2);
    }
}
