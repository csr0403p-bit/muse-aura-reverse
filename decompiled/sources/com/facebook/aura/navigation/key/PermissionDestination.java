package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06H;
import X.C79;
import X.C9hr;
import X.C9iL;
import X.Ey9;
import X.F0C;
import X.F3w;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes.dex */
public final class PermissionDestination {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PermissionDestination[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final PermissionDestination BLUETOOTH;
    public static final PermissionDestination CALENDAR;
    public static final PermissionDestination CALL_LOG;
    public static final PermissionDestination CONTACTS;
    public static final Companion Companion;
    public static final PermissionDestination HEALTH;
    public static final PermissionDestination LOCATION;
    public static final PermissionDestination MESSAGES;
    public static final PermissionDestination MICROPHONE;
    public static final PermissionDestination PHONE;
    public static final PermissionDestination PHONE_NOTIFICATIONS;
    public static final PermissionDestination PHOTOS;
    public static final PermissionDestination RUN_IN_BACKGROUND;

    public final class Companion {

        /* renamed from: com.facebook.aura.navigation.key.PermissionDestination$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.navigation.key.PermissionDestination", PermissionDestination.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(PermissionDestination.$cachedSerializer$delegate);
        }

        public final C9hr<PermissionDestination> serializer() {
            return AnonymousClass001.A12(PermissionDestination.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        PermissionDestination permissionDestination = new PermissionDestination("LOCATION", 0);
        LOCATION = permissionDestination;
        PermissionDestination permissionDestination2 = new PermissionDestination("CONTACTS", 1);
        CONTACTS = permissionDestination2;
        PermissionDestination permissionDestination3 = new PermissionDestination("CALENDAR", 2);
        CALENDAR = permissionDestination3;
        PermissionDestination permissionDestination4 = new PermissionDestination("HEALTH", 3);
        HEALTH = permissionDestination4;
        PermissionDestination permissionDestination5 = new PermissionDestination("MESSAGES", 4);
        MESSAGES = permissionDestination5;
        PermissionDestination permissionDestination6 = new PermissionDestination("CALL_LOG", 5);
        CALL_LOG = permissionDestination6;
        PermissionDestination permissionDestination7 = new PermissionDestination("PHONE", 6);
        PHONE = permissionDestination7;
        PermissionDestination permissionDestination8 = new PermissionDestination("PHOTOS", 7);
        PHOTOS = permissionDestination8;
        PermissionDestination permissionDestination9 = new PermissionDestination("PHONE_NOTIFICATIONS", 8);
        PHONE_NOTIFICATIONS = permissionDestination9;
        PermissionDestination permissionDestination10 = new PermissionDestination("MICROPHONE", 9);
        MICROPHONE = permissionDestination10;
        PermissionDestination permissionDestination11 = new PermissionDestination("BLUETOOTH", 10);
        BLUETOOTH = permissionDestination11;
        PermissionDestination permissionDestination12 = new PermissionDestination("RUN_IN_BACKGROUND", 11);
        RUN_IN_BACKGROUND = permissionDestination12;
        PermissionDestination[] permissionDestinationArr = {permissionDestination, permissionDestination2, permissionDestination3, permissionDestination4, permissionDestination5, permissionDestination6, permissionDestination7, permissionDestination8, permissionDestination9, permissionDestination10, permissionDestination11, permissionDestination12};
        $VALUES = permissionDestinationArr;
        $ENTRIES = new F3w(permissionDestinationArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<PermissionDestination> getEntries() {
        return $ENTRIES;
    }

    public static PermissionDestination valueOf(String str) {
        return (PermissionDestination) Enum.valueOf(PermissionDestination.class, str);
    }

    public static PermissionDestination[] values() {
        return (PermissionDestination[]) $VALUES.clone();
    }

    public PermissionDestination(String str, int i) {
    }
}
