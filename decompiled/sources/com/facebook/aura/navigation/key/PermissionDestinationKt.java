package com.facebook.aura.navigation.key;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C7384Etj;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class PermissionDestinationKt {
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.navigation.AuraFullScreenNavKey devicePermissionsDeeplinkKey(com.facebook.aura.navigation.key.DevicePermissionRowId r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L1c
            com.facebook.aura.navigation.key.PermissionDestination r1 = toPermissionDestination(r3)
            int[] r0 = com.facebook.aura.navigation.key.PermissionDestinationKt.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r0 = 0
            if (r1 != r0) goto L1c
            X.F0C<X.9hr<java.lang.Object>>[] r0 = com.facebook.aura.navigation.key.PermissionDetailScreenKey.$childSerializers
            com.facebook.aura.navigation.key.PermissionDestination r1 = com.facebook.aura.navigation.key.PermissionDestination.LOCATION
            com.facebook.aura.navigation.key.PermissionDetailScreenKey r0 = new com.facebook.aura.navigation.key.PermissionDetailScreenKey
            r0.<init>(r1)
        L19:
            com.facebook.aura.navigation.AuraFullScreenNavKey r0 = (com.facebook.aura.navigation.AuraFullScreenNavKey) r0
            return r0
        L1c:
            com.facebook.aura.navigation.key.DevicePermissionsSettingsScreenKey r0 = new com.facebook.aura.navigation.key.DevicePermissionsSettingsScreenKey
            r0.<init>(r2)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.navigation.key.PermissionDestinationKt.devicePermissionsDeeplinkKey(com.facebook.aura.navigation.key.DevicePermissionRowId):com.facebook.aura.navigation.AuraFullScreenNavKey");
    }

    public static final PermissionDestination toPermissionDestination(DevicePermissionRowId devicePermissionRowId) {
        C7384Etj.A0Y(devicePermissionRowId, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (devicePermissionRowId.ordinal()) {
            case 0:
                return PermissionDestination.CONTACTS;
            case 1:
                return PermissionDestination.LOCATION;
            case 2:
                return PermissionDestination.CALENDAR;
            case 3:
                return PermissionDestination.MESSAGES;
            case 4:
                return PermissionDestination.CALL_LOG;
            case 5:
                return PermissionDestination.PHONE_NOTIFICATIONS;
            case 6:
                return PermissionDestination.HEALTH;
            case 7:
                return PermissionDestination.PHONE;
            case 8:
                return PermissionDestination.PHOTOS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DevicePermissionRowId.values().length];
            try {
                AnonymousClass005.A0v(DevicePermissionRowId.CONTACTS, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(DevicePermissionRowId.LOCATION, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(DevicePermissionRowId.CALENDAR, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(DevicePermissionRowId.SMS, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(DevicePermissionRowId.CALL_LOG, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(DevicePermissionRowId.NOTIFICATIONS, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(DevicePermissionRowId.HEALTH, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(DevicePermissionRowId.PHONE, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(DevicePermissionRowId.PHOTOS, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PermissionDestination.values().length];
            try {
                AnonymousClass005.A0v(PermissionDestination.LOCATION, iArr2, 1);
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
