package com.facebook.aura.analytics.hatch;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.BzK;
import X.C4JM;
import X.C4oT;
import X.C60O;
import X.C7380Etd;
import X.C7384Etj;
import X.C7NB;
import X.C7NC;
import X.C86p;
import X.C86q;
import X.Eu1;
import X.G0U;
import com.facebook.aura.analytics.AuraLogger;
import com.facebook.aura.common.identifiers.AuraDeviceId;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefStore;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefs;

/* loaded from: classes3.dex */
public final class HatchOsNotificationSettingLogger {
    public static final int $stable = 0;
    public static final HatchOsNotificationSettingLogger INSTANCE = new HatchOsNotificationSettingLogger();
    public static final String KEY_LAST_ENABLED = "last_os_notification_enabled";

    /* renamed from: com.facebook.aura.analytics.hatch.HatchOsNotificationSettingLogger$submitLog$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C86q, C7NB<C86q>> {
        public final /* synthetic */ HatchOsNotificationSettingEventType $eventType;
        public final /* synthetic */ boolean $osNotificationEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchOsNotificationSettingEventType hatchOsNotificationSettingEventType, boolean z) {
            super(1);
            this.$eventType = hatchOsNotificationSettingEventType;
            this.$osNotificationEnabled = z;
        }

        @Override // X.G0U
        public final C7NB<C86q> invoke(C86q c86q) {
            C86p c86p = (C86p) c86q;
            c86p.A03("event_type", this.$eventType.getValue());
            c86p.A00.A3P("os_notification_enabled", Boolean.valueOf(this.$osNotificationEnabled));
            c86p.A02("client_event_time_ms", C60O.A0k());
            c86p.A03("device_id", AuraDeviceId.INSTANCE.get());
            return c86p;
        }
    }

    public final void logSnapshot(HatchOsNotificationSettingEventType hatchOsNotificationSettingEventType) {
        C7384Etj.A0Y(hatchOsNotificationSettingEventType, 0);
        submitLog(hatchOsNotificationSettingEventType, readOsNotificationEnabled());
    }

    private final boolean shouldUpdateForegroundChangeDetectionBaseline(HatchOsNotificationSettingEventType hatchOsNotificationSettingEventType) {
        return AnonymousClass006.A1Z(hatchOsNotificationSettingEventType, HatchOsNotificationSettingEventType.PUSH_RECEIVED_SNAPSHOT);
    }

    private final void submitLog(HatchOsNotificationSettingEventType hatchOsNotificationSettingEventType, boolean z) {
        if (hatchOsNotificationSettingEventType != HatchOsNotificationSettingEventType.PUSH_RECEIVED_SNAPSHOT) {
            updateLastEnabled(z);
        }
        Eu1 eu1AcquireEvent = AuraLogger.INSTANCE.getInstance().acquireEvent("hatch_os_notification_setting");
        C86p c86p = new C86p();
        c86p.A00 = eu1AcquireEvent;
        C7NC.A00(c86p, new AnonymousClass1(hatchOsNotificationSettingEventType, z));
    }

    private final void updateLastEnabled(boolean z) {
        C4oT c4oT = AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.NOTIFICATION_SETTINGS);
        if (c4oT.contains(KEY_LAST_ENABLED) && c4oT.getBoolean(KEY_LAST_ENABLED, false) == z) {
            return;
        }
        BzK bzKA9q = c4oT.A9q();
        bzKA9q.A0A(KEY_LAST_ENABLED, z);
        bzKA9q.apply();
    }

    private final boolean readOsNotificationEnabled() {
        return new C7380Etd(C4JM.A00()).A00.areNotificationsEnabled();
    }

    public final void logForegroundSnapshotDetectingChange() {
        boolean osNotificationEnabled = readOsNotificationEnabled();
        C4oT c4oT = AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.NOTIFICATION_SETTINGS);
        boolean z = false;
        if (c4oT.contains(KEY_LAST_ENABLED) && c4oT.getBoolean(KEY_LAST_ENABLED, false) != osNotificationEnabled) {
            z = true;
        }
        submitLog(HatchOsNotificationSettingEventType.SNAPSHOT, osNotificationEnabled);
        if (z) {
            submitLog(HatchOsNotificationSettingEventType.PERMISSION_CHANGE, osNotificationEnabled);
        }
    }
}
