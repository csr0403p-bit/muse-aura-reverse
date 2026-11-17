package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iL;
import X.Ey9;
import X.F0C;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt;
import com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes3.dex */
public final class DevicePermissionRowId {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ DevicePermissionRowId[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final DevicePermissionRowId CALENDAR;
    public static final DevicePermissionRowId CALL_LOG;
    public static final DevicePermissionRowId CONTACTS;
    public static final Companion Companion;
    public static final DevicePermissionRowId HEALTH;
    public static final DevicePermissionRowId LOCATION;
    public static final DevicePermissionRowId NOTIFICATIONS;
    public static final DevicePermissionRowId PHONE;
    public static final DevicePermissionRowId PHOTOS;
    public static final DevicePermissionRowId SMS;
    public final String wireValue;

    /* loaded from: classes.dex */
    public final class Companion {

        /* renamed from: com.facebook.aura.navigation.key.DevicePermissionRowId$Companion$1, reason: invalid class name */
        /* loaded from: classes3.dex */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.navigation.key.DevicePermissionRowId", DevicePermissionRowId.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(DevicePermissionRowId.$cachedSerializer$delegate);
        }

        public final DevicePermissionRowId fromWire(String str) {
            DevicePermissionRowId next;
            Iterator<DevicePermissionRowId> it = DevicePermissionRowId.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getWireValue(), str)) {
                    break;
                }
            }
            return next;
        }

        public final C9hr<DevicePermissionRowId> serializer() {
            return AnonymousClass001.A12(DevicePermissionRowId.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        DevicePermissionRowId devicePermissionRowId = new DevicePermissionRowId("CONTACTS", 0, "phone_contacts");
        CONTACTS = devicePermissionRowId;
        DevicePermissionRowId devicePermissionRowId2 = new DevicePermissionRowId("LOCATION", 1, MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL);
        LOCATION = devicePermissionRowId2;
        DevicePermissionRowId devicePermissionRowId3 = new DevicePermissionRowId("CALENDAR", 2, "calendar");
        CALENDAR = devicePermissionRowId3;
        DevicePermissionRowId devicePermissionRowId4 = new DevicePermissionRowId("SMS", 3, "text_messages");
        SMS = devicePermissionRowId4;
        DevicePermissionRowId devicePermissionRowId5 = new DevicePermissionRowId("CALL_LOG", 4, "call_log");
        CALL_LOG = devicePermissionRowId5;
        DevicePermissionRowId devicePermissionRowId6 = new DevicePermissionRowId("NOTIFICATIONS", 5, "notifications");
        NOTIFICATIONS = devicePermissionRowId6;
        DevicePermissionRowId devicePermissionRowId7 = new DevicePermissionRowId("HEALTH", 6, "health");
        HEALTH = devicePermissionRowId7;
        DevicePermissionRowId devicePermissionRowId8 = new DevicePermissionRowId("PHONE", 7, HatchLinkOrderSheetKt.PHONE);
        PHONE = devicePermissionRowId8;
        DevicePermissionRowId devicePermissionRowId9 = new DevicePermissionRowId("PHOTOS", 8, "photos");
        PHOTOS = devicePermissionRowId9;
        DevicePermissionRowId[] devicePermissionRowIdArr = {devicePermissionRowId, devicePermissionRowId2, devicePermissionRowId3, devicePermissionRowId4, devicePermissionRowId5, devicePermissionRowId6, devicePermissionRowId7, devicePermissionRowId8, devicePermissionRowId9};
        $VALUES = devicePermissionRowIdArr;
        $ENTRIES = C3cG.A0w(devicePermissionRowIdArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<DevicePermissionRowId> getEntries() {
        return $ENTRIES;
    }

    public static DevicePermissionRowId valueOf(String str) {
        return (DevicePermissionRowId) Enum.valueOf(DevicePermissionRowId.class, str);
    }

    public static DevicePermissionRowId[] values() {
        return (DevicePermissionRowId[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public DevicePermissionRowId(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
