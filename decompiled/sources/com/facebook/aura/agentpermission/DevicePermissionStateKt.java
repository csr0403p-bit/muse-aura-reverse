package com.facebook.aura.agentpermission;

import X.AnonymousClass002;
import X.AnonymousClass006;
import android.content.Context;
import com.facebook.aura.navigation.key.PermissionDestination;

/* loaded from: classes.dex */
public abstract class DevicePermissionStateKt {
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isDevicePermissionGranted(android.content.Context r4, com.facebook.aura.navigation.key.PermissionDestination r5) {
        /*
            r2 = 0
            boolean r3 = X.AnonymousClass002.A1a(r4, r5)
            int[] r0 = com.facebook.aura.agentpermission.DevicePermissionStateKt.WhenMappings.$EnumSwitchMapping$0
            int r0 = r5.ordinal()
            switch(r0) {
                case 0: goto L49;
                case 1: goto L26;
                case 2: goto L17;
                case 3: goto L82;
                case 4: goto L14;
                case 5: goto L43;
                case 6: goto L46;
                case 7: goto L35;
                case 8: goto L3c;
                case 9: goto L58;
                case 10: goto L63;
                case 11: goto L88;
                default: goto Le;
            }
        Le:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L14:
            java.lang.String r0 = "android.permission.READ_SMS"
            goto L5a
        L17:
            java.lang.String r0 = "android.permission.READ_CALENDAR"
            int r0 = r4.checkSelfPermission(r0)
            boolean r0 = X.AnonymousClass002.A1M(r0)
            if (r0 != 0) goto L81
            java.lang.String r0 = "android.permission.WRITE_CALENDAR"
            goto L77
        L26:
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            int r0 = r4.checkSelfPermission(r0)
            boolean r0 = X.AnonymousClass002.A1M(r0)
            if (r0 != 0) goto L81
            java.lang.String r0 = "android.permission.WRITE_CONTACTS"
            goto L77
        L35:
            com.facebook.aura.commands.core.PhotoAccessUtils r0 = com.facebook.aura.commands.core.PhotoAccessUtils.INSTANCE
            boolean r2 = r0.isReadGranted(r4)
            return r2
        L3c:
            com.facebook.aura.commands.core.NotificationAccessUtils r0 = com.facebook.aura.commands.core.NotificationAccessUtils.INSTANCE
            boolean r2 = r0.isNotificationAccessGranted(r4)
            return r2
        L43:
            java.lang.String r0 = "android.permission.READ_CALL_LOG"
            goto L5a
        L46:
            java.lang.String r0 = "android.permission.CALL_PHONE"
            goto L5a
        L49:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = r4.checkSelfPermission(r0)
            boolean r0 = X.AnonymousClass002.A1M(r0)
            if (r0 != 0) goto L81
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            goto L77
        L58:
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
        L5a:
            int r0 = r4.checkSelfPermission(r0)
            boolean r2 = X.AnonymousClass002.A1M(r0)
            return r2
        L63:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L81
            java.lang.String r0 = "android.permission.BLUETOOTH_CONNECT"
            int r0 = r4.checkSelfPermission(r0)
            boolean r0 = X.AnonymousClass002.A1M(r0)
            if (r0 == 0) goto L88
            java.lang.String r0 = "android.permission.BLUETOOTH_SCAN"
        L77:
            int r0 = r4.checkSelfPermission(r0)
            boolean r0 = X.AnonymousClass002.A1M(r0)
            if (r0 == 0) goto L88
        L81:
            return r3
        L82:
            java.util.concurrent.atomic.AtomicBoolean r0 = com.facebook.aura.health.HealthConnectPermissionUtils.granted
            boolean r2 = r0.get()
        L88:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.DevicePermissionStateKt.isDevicePermissionGranted(android.content.Context, com.facebook.aura.navigation.key.PermissionDestination):boolean");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PermissionDestination.values().length];
            try {
                AnonymousClass002.A13(PermissionDestination.CALENDAR, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PermissionDestination.CONTACTS, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(PermissionDestination.MESSAGES, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(PermissionDestination.PHOTOS, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(PermissionDestination.PHONE_NOTIFICATIONS, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(PermissionDestination.CALL_LOG, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(PermissionDestination.PHONE, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(PermissionDestination.LOCATION, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(PermissionDestination.MICROPHONE, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(PermissionDestination.BLUETOOTH, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(PermissionDestination.HEALTH, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(PermissionDestination.RUN_IN_BACKGROUND, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean hasPermission(Context context, String str) {
        return AnonymousClass002.A1M(context.checkSelfPermission(str));
    }
}
