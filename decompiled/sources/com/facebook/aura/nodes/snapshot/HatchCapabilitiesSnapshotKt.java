package com.facebook.aura.nodes.snapshot;

import X.AnonymousClass001;
import X.BFI;
import X.C31u;
import X.C60O;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.nodes.snapshot.MC;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModelKt;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class HatchCapabilitiesSnapshotKt {
    public static final Set<String> DEVICE_COMMAND_IDS;
    public static final String PERMISSION_HEALTH_CONNECT = "@health_connect";
    public static final String PERMISSION_NOTIFICATION_LISTENER = "@notification_listener";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = C60O.A1b(HatchCapabilitiesSnapshotKt.class, "productEntityChipsEnabled", "getProductEntityChipsEnabled()Z", 1);
    public static final C31u productEntityChipsEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_product_entity_chips);

    static {
        String[] strArr = new String[71];
        System.arraycopy(new String[]{"calendar.search", "message.search", "message.attachment.get", "message.draft", "message.send", "contacts.search", "call_log.search", "photos.search", "photos.upload", "photos.upload_status", "phone.dial", "contacts.create", "contacts.update", "contacts.delete", "notifications.action", "dnd.get", "dnd.set", "notifications.announce.get", "notifications.announce.set", "location.get", "battery.get", "clipboard.set", "notifications.get", "network.state", "alarm.list", "reminder.list", "geofence.list"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"geofence.set", "geofence.remove", "calendar.events.create", "calendar.events.update", "calendar.events.delete", "calendar.reminders.set", "calendar.reminders.list", "calendar.reminders.remove", "alarm.set", "alarm.dismiss", "alarm.dismiss_all", "alarm.update", "timer.set", "timer.list", "timer.cancel", "reminder.set", "reminder.dismiss", "reminder.dismiss_all", "reminder.update", "reminder.snooze", AuraSubscriptionUsageViewModelKt.SUBSCRIPTIONS_UPGRADE_COMMAND, "invite.upsell", "app.info", "app.update.check", "app.update.start", "assistant.set_default", "shortcut.add_home"}, 0, strArr, 27, 27);
        System.arraycopy(new String[]{"background.session", "camera.open", "flashlight.set", "share.content", "email.compose", "location.set_sharing_mode", "media.control", "media.now_playing", "media.volume.set", "media.play", "settings.open", "display.brightness.set", "app.list", "app.open", "app.open_link", "navigation.start", "bug_report.create"}, 0, strArr, 54, 17);
        DEVICE_COMMAND_IDS = BFI.A0H(strArr);
    }

    public static final boolean getProductEntityChipsEnabled() {
        return AnonymousClass001.A1X(C31u.A00(productEntityChipsEnabled$delegate, $$delegatedProperties));
    }
}
