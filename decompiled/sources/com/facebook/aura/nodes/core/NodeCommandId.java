package com.facebook.aura.nodes.core;

import X.C06H;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModelKt;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class NodeCommandId {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NodeCommandId[] $VALUES;
    public static final NodeCommandId ALARM_DISMISS;
    public static final NodeCommandId ALARM_DISMISS_ALL;
    public static final NodeCommandId ALARM_LIST;
    public static final NodeCommandId ALARM_SET;
    public static final NodeCommandId ALARM_UPDATE;
    public static final NodeCommandId APP_INFO;
    public static final NodeCommandId APP_LIST;
    public static final NodeCommandId APP_OPEN;
    public static final NodeCommandId APP_OPEN_LINK;
    public static final NodeCommandId APP_UPDATE_CHECK;
    public static final NodeCommandId APP_UPDATE_START;
    public static final NodeCommandId ASSISTANT_SET_DEFAULT;
    public static final NodeCommandId BACKGROUND_SESSION;
    public static final NodeCommandId BATTERY_GET;
    public static final NodeCommandId BUG_REPORT_CREATE;
    public static final NodeCommandId CALENDAR_EVENTS_CREATE;
    public static final NodeCommandId CALENDAR_EVENTS_DELETE;
    public static final NodeCommandId CALENDAR_EVENTS_UPDATE;
    public static final NodeCommandId CALENDAR_REMINDERS_LIST;
    public static final NodeCommandId CALENDAR_REMINDERS_REMOVE;
    public static final NodeCommandId CALENDAR_REMINDERS_SET;
    public static final NodeCommandId CALENDAR_SEARCH;
    public static final NodeCommandId CALL_LOG_SEARCH;
    public static final NodeCommandId CAMERA_OPEN;
    public static final NodeCommandId CLIPBOARD_SET;
    public static final NodeCommandId CONTACTS_CREATE;
    public static final NodeCommandId CONTACTS_DELETE;
    public static final NodeCommandId CONTACTS_SEARCH;
    public static final NodeCommandId CONTACTS_UPDATE;
    public static final Companion Companion;
    public static final NodeCommandId DISPLAY_BRIGHTNESS_SET;
    public static final NodeCommandId DND_GET;
    public static final NodeCommandId DND_SET;
    public static final NodeCommandId EMAIL_COMPOSE;
    public static final NodeCommandId FLASHLIGHT_SET;
    public static final NodeCommandId GEOFENCE_LIST;
    public static final NodeCommandId GEOFENCE_REMOVE;
    public static final NodeCommandId GEOFENCE_SET;
    public static final NodeCommandId INVITE_UPSELL;
    public static final NodeCommandId LOCATION_GET;
    public static final NodeCommandId LOCATION_SET_SHARING_MODE;
    public static final NodeCommandId MEDIA_CONTROL;
    public static final NodeCommandId MEDIA_NOW_PLAYING;
    public static final NodeCommandId MEDIA_PLAY;
    public static final NodeCommandId MEDIA_VOLUME_SET;
    public static final NodeCommandId MESSAGE_ATTACHMENT_GET;
    public static final NodeCommandId MESSAGE_DRAFT;
    public static final NodeCommandId MESSAGE_SEARCH;
    public static final NodeCommandId MESSAGE_SEND;
    public static final NodeCommandId NAVIGATION_START;
    public static final NodeCommandId NETWORK_STATE;
    public static final NodeCommandId NOTIFICATIONS_ACTION;
    public static final NodeCommandId NOTIFICATIONS_ANNOUNCE_GET;
    public static final NodeCommandId NOTIFICATIONS_ANNOUNCE_SET;
    public static final NodeCommandId NOTIFICATIONS_GET;
    public static final NodeCommandId PHONE_CALL;
    public static final NodeCommandId PHOTOS_SEARCH;
    public static final NodeCommandId PHOTOS_UPLOAD;
    public static final NodeCommandId PHOTOS_UPLOAD_STATUS;
    public static final NodeCommandId REMINDER_DISMISS;
    public static final NodeCommandId REMINDER_DISMISS_ALL;
    public static final NodeCommandId REMINDER_LIST;
    public static final NodeCommandId REMINDER_SET;
    public static final NodeCommandId REMINDER_SNOOZE;
    public static final NodeCommandId REMINDER_UPDATE;
    public static final NodeCommandId SETTINGS_OPEN;
    public static final NodeCommandId SHARE_CONTENT;
    public static final NodeCommandId SHORTCUT_ADD_HOME;
    public static final NodeCommandId SUBSCRIPTIONS_UPGRADE;
    public static final NodeCommandId TIMER_CANCEL;
    public static final NodeCommandId TIMER_LIST;
    public static final NodeCommandId TIMER_SET;
    public final String commandId;

    static {
        NodeCommandId nodeCommandIdA0A = C60O.A0A("CONTACTS_SEARCH", "contacts.search", 0);
        CONTACTS_SEARCH = nodeCommandIdA0A;
        NodeCommandId nodeCommandIdA0A2 = C60O.A0A("CALL_LOG_SEARCH", "call_log.search", 1);
        CALL_LOG_SEARCH = nodeCommandIdA0A2;
        NodeCommandId nodeCommandIdA0A3 = C60O.A0A("CONTACTS_CREATE", "contacts.create", 2);
        CONTACTS_CREATE = nodeCommandIdA0A3;
        NodeCommandId nodeCommandIdA0A4 = C60O.A0A("CONTACTS_UPDATE", "contacts.update", 3);
        CONTACTS_UPDATE = nodeCommandIdA0A4;
        NodeCommandId nodeCommandIdA0A5 = C60O.A0A("CONTACTS_DELETE", "contacts.delete", 4);
        CONTACTS_DELETE = nodeCommandIdA0A5;
        NodeCommandId nodeCommandIdA0A6 = C60O.A0A("NETWORK_STATE", "network.state", 5);
        NETWORK_STATE = nodeCommandIdA0A6;
        NodeCommandId nodeCommandIdA0A7 = C60O.A0A("LOCATION_GET", "location.get", 6);
        LOCATION_GET = nodeCommandIdA0A7;
        NodeCommandId nodeCommandIdA0A8 = C60O.A0A("BATTERY_GET", "battery.get", 7);
        BATTERY_GET = nodeCommandIdA0A8;
        NodeCommandId nodeCommandIdA0A9 = C60O.A0A("CLIPBOARD_SET", "clipboard.set", 8);
        CLIPBOARD_SET = nodeCommandIdA0A9;
        NodeCommandId nodeCommandIdA0A10 = C60O.A0A("NOTIFICATIONS_GET", "notifications.get", 9);
        NOTIFICATIONS_GET = nodeCommandIdA0A10;
        NodeCommandId nodeCommandIdA0A11 = C60O.A0A("NOTIFICATIONS_ACTION", "notifications.action", 10);
        NOTIFICATIONS_ACTION = nodeCommandIdA0A11;
        NodeCommandId nodeCommandIdA0A12 = C60O.A0A("DND_GET", "dnd.get", 11);
        DND_GET = nodeCommandIdA0A12;
        NodeCommandId nodeCommandIdA0A13 = C60O.A0A("DND_SET", "dnd.set", 12);
        DND_SET = nodeCommandIdA0A13;
        NodeCommandId nodeCommandIdA0A14 = C60O.A0A("NOTIFICATIONS_ANNOUNCE_GET", "notifications.announce.get", 13);
        NOTIFICATIONS_ANNOUNCE_GET = nodeCommandIdA0A14;
        NodeCommandId nodeCommandIdA0A15 = C60O.A0A("NOTIFICATIONS_ANNOUNCE_SET", "notifications.announce.set", 14);
        NOTIFICATIONS_ANNOUNCE_SET = nodeCommandIdA0A15;
        NodeCommandId nodeCommandIdA0A16 = C60O.A0A("GEOFENCE_SET", "geofence.set", 15);
        GEOFENCE_SET = nodeCommandIdA0A16;
        NodeCommandId nodeCommandIdA0A17 = C60O.A0A("GEOFENCE_REMOVE", "geofence.remove", 16);
        GEOFENCE_REMOVE = nodeCommandIdA0A17;
        NodeCommandId nodeCommandIdA0A18 = C60O.A0A("GEOFENCE_LIST", "geofence.list", 17);
        GEOFENCE_LIST = nodeCommandIdA0A18;
        NodeCommandId nodeCommandIdA0A19 = C60O.A0A("CALENDAR_SEARCH", "calendar.search", 18);
        CALENDAR_SEARCH = nodeCommandIdA0A19;
        NodeCommandId nodeCommandIdA0A20 = C60O.A0A("CALENDAR_EVENTS_CREATE", "calendar.events.create", 19);
        CALENDAR_EVENTS_CREATE = nodeCommandIdA0A20;
        NodeCommandId nodeCommandIdA0A21 = C60O.A0A("CALENDAR_EVENTS_UPDATE", "calendar.events.update", 20);
        CALENDAR_EVENTS_UPDATE = nodeCommandIdA0A21;
        NodeCommandId nodeCommandIdA0A22 = C60O.A0A("CALENDAR_EVENTS_DELETE", "calendar.events.delete", 21);
        CALENDAR_EVENTS_DELETE = nodeCommandIdA0A22;
        NodeCommandId nodeCommandIdA0A23 = C60O.A0A("CALENDAR_REMINDERS_SET", "calendar.reminders.set", 22);
        CALENDAR_REMINDERS_SET = nodeCommandIdA0A23;
        NodeCommandId nodeCommandIdA0A24 = C60O.A0A("CALENDAR_REMINDERS_LIST", "calendar.reminders.list", 23);
        CALENDAR_REMINDERS_LIST = nodeCommandIdA0A24;
        NodeCommandId nodeCommandIdA0A25 = C60O.A0A("CALENDAR_REMINDERS_REMOVE", "calendar.reminders.remove", 24);
        CALENDAR_REMINDERS_REMOVE = nodeCommandIdA0A25;
        NodeCommandId nodeCommandIdA0A26 = C60O.A0A("MESSAGE_SEARCH", "message.search", 25);
        MESSAGE_SEARCH = nodeCommandIdA0A26;
        NodeCommandId nodeCommandIdA0A27 = C60O.A0A("PHOTOS_SEARCH", "photos.search", 26);
        PHOTOS_SEARCH = nodeCommandIdA0A27;
        NodeCommandId nodeCommandIdA0A28 = C60O.A0A("PHOTOS_UPLOAD", "photos.upload", 27);
        PHOTOS_UPLOAD = nodeCommandIdA0A28;
        NodeCommandId nodeCommandIdA0A29 = C60O.A0A("PHOTOS_UPLOAD_STATUS", "photos.upload_status", 28);
        PHOTOS_UPLOAD_STATUS = nodeCommandIdA0A29;
        NodeCommandId nodeCommandIdA0A30 = C60O.A0A("MESSAGE_ATTACHMENT_GET", "message.attachment.get", 29);
        MESSAGE_ATTACHMENT_GET = nodeCommandIdA0A30;
        NodeCommandId nodeCommandIdA0A31 = C60O.A0A("MESSAGE_DRAFT", "message.draft", 30);
        MESSAGE_DRAFT = nodeCommandIdA0A31;
        NodeCommandId nodeCommandIdA0A32 = C60O.A0A("MESSAGE_SEND", "message.send", 31);
        MESSAGE_SEND = nodeCommandIdA0A32;
        NodeCommandId nodeCommandIdA0A33 = C60O.A0A("PHONE_CALL", "phone.dial", 32);
        PHONE_CALL = nodeCommandIdA0A33;
        NodeCommandId nodeCommandIdA0A34 = C60O.A0A("ALARM_SET", "alarm.set", 33);
        ALARM_SET = nodeCommandIdA0A34;
        NodeCommandId nodeCommandIdA0A35 = C60O.A0A("ALARM_DISMISS", "alarm.dismiss", 34);
        ALARM_DISMISS = nodeCommandIdA0A35;
        NodeCommandId nodeCommandIdA0A36 = C60O.A0A("ALARM_LIST", "alarm.list", 35);
        ALARM_LIST = nodeCommandIdA0A36;
        NodeCommandId nodeCommandIdA0A37 = C60O.A0A("ALARM_DISMISS_ALL", "alarm.dismiss_all", 36);
        ALARM_DISMISS_ALL = nodeCommandIdA0A37;
        NodeCommandId nodeCommandIdA0A38 = C60O.A0A("ALARM_UPDATE", "alarm.update", 37);
        ALARM_UPDATE = nodeCommandIdA0A38;
        NodeCommandId nodeCommandIdA0A39 = C60O.A0A("TIMER_SET", "timer.set", 38);
        TIMER_SET = nodeCommandIdA0A39;
        NodeCommandId nodeCommandIdA0A40 = C60O.A0A("TIMER_LIST", "timer.list", 39);
        TIMER_LIST = nodeCommandIdA0A40;
        NodeCommandId nodeCommandIdA0A41 = C60O.A0A("TIMER_CANCEL", "timer.cancel", 40);
        TIMER_CANCEL = nodeCommandIdA0A41;
        NodeCommandId nodeCommandIdA0A42 = C60O.A0A("REMINDER_SET", "reminder.set", 41);
        REMINDER_SET = nodeCommandIdA0A42;
        NodeCommandId nodeCommandIdA0A43 = C60O.A0A("REMINDER_DISMISS", "reminder.dismiss", 42);
        REMINDER_DISMISS = nodeCommandIdA0A43;
        NodeCommandId nodeCommandIdA0A44 = C60O.A0A("REMINDER_LIST", "reminder.list", 43);
        REMINDER_LIST = nodeCommandIdA0A44;
        NodeCommandId nodeCommandIdA0A45 = C60O.A0A("REMINDER_DISMISS_ALL", "reminder.dismiss_all", 44);
        REMINDER_DISMISS_ALL = nodeCommandIdA0A45;
        NodeCommandId nodeCommandIdA0A46 = C60O.A0A("REMINDER_UPDATE", "reminder.update", 45);
        REMINDER_UPDATE = nodeCommandIdA0A46;
        NodeCommandId nodeCommandIdA0A47 = C60O.A0A("REMINDER_SNOOZE", "reminder.snooze", 46);
        REMINDER_SNOOZE = nodeCommandIdA0A47;
        NodeCommandId nodeCommandIdA0A48 = C60O.A0A("SUBSCRIPTIONS_UPGRADE", AuraSubscriptionUsageViewModelKt.SUBSCRIPTIONS_UPGRADE_COMMAND, 47);
        SUBSCRIPTIONS_UPGRADE = nodeCommandIdA0A48;
        NodeCommandId nodeCommandIdA0A49 = C60O.A0A("INVITE_UPSELL", "invite.upsell", 48);
        INVITE_UPSELL = nodeCommandIdA0A49;
        NodeCommandId nodeCommandIdA0A50 = C60O.A0A("APP_INFO", "app.info", 49);
        APP_INFO = nodeCommandIdA0A50;
        NodeCommandId nodeCommandIdA0A51 = C60O.A0A("APP_UPDATE_CHECK", "app.update.check", 50);
        APP_UPDATE_CHECK = nodeCommandIdA0A51;
        NodeCommandId nodeCommandIdA0A52 = C60O.A0A("APP_UPDATE_START", "app.update.start", 51);
        APP_UPDATE_START = nodeCommandIdA0A52;
        NodeCommandId nodeCommandIdA0A53 = C60O.A0A("ASSISTANT_SET_DEFAULT", "assistant.set_default", 52);
        ASSISTANT_SET_DEFAULT = nodeCommandIdA0A53;
        NodeCommandId nodeCommandIdA0A54 = C60O.A0A("SHORTCUT_ADD_HOME", "shortcut.add_home", 53);
        SHORTCUT_ADD_HOME = nodeCommandIdA0A54;
        NodeCommandId nodeCommandIdA0A55 = C60O.A0A("BACKGROUND_SESSION", "background.session", 54);
        BACKGROUND_SESSION = nodeCommandIdA0A55;
        NodeCommandId nodeCommandIdA0A56 = C60O.A0A("CAMERA_OPEN", "camera.open", 55);
        CAMERA_OPEN = nodeCommandIdA0A56;
        NodeCommandId nodeCommandIdA0A57 = C60O.A0A("FLASHLIGHT_SET", "flashlight.set", 56);
        FLASHLIGHT_SET = nodeCommandIdA0A57;
        NodeCommandId nodeCommandIdA0A58 = C60O.A0A("SHARE_CONTENT", "share.content", 57);
        SHARE_CONTENT = nodeCommandIdA0A58;
        NodeCommandId nodeCommandIdA0A59 = C60O.A0A("EMAIL_COMPOSE", "email.compose", 58);
        EMAIL_COMPOSE = nodeCommandIdA0A59;
        NodeCommandId nodeCommandIdA0A60 = C60O.A0A("LOCATION_SET_SHARING_MODE", "location.set_sharing_mode", 59);
        LOCATION_SET_SHARING_MODE = nodeCommandIdA0A60;
        NodeCommandId nodeCommandIdA0A61 = C60O.A0A("MEDIA_CONTROL", "media.control", 60);
        MEDIA_CONTROL = nodeCommandIdA0A61;
        NodeCommandId nodeCommandIdA0A62 = C60O.A0A("MEDIA_NOW_PLAYING", "media.now_playing", 61);
        MEDIA_NOW_PLAYING = nodeCommandIdA0A62;
        NodeCommandId nodeCommandIdA0A63 = C60O.A0A("MEDIA_VOLUME_SET", "media.volume.set", 62);
        MEDIA_VOLUME_SET = nodeCommandIdA0A63;
        NodeCommandId nodeCommandIdA0A64 = C60O.A0A("MEDIA_PLAY", "media.play", 63);
        MEDIA_PLAY = nodeCommandIdA0A64;
        NodeCommandId nodeCommandIdA0A65 = C60O.A0A("SETTINGS_OPEN", "settings.open", 64);
        SETTINGS_OPEN = nodeCommandIdA0A65;
        NodeCommandId nodeCommandIdA0A66 = C60O.A0A("DISPLAY_BRIGHTNESS_SET", "display.brightness.set", 65);
        DISPLAY_BRIGHTNESS_SET = nodeCommandIdA0A66;
        NodeCommandId nodeCommandIdA0A67 = C60O.A0A("APP_LIST", "app.list", 66);
        APP_LIST = nodeCommandIdA0A67;
        NodeCommandId nodeCommandIdA0A68 = C60O.A0A("APP_OPEN", "app.open", 67);
        APP_OPEN = nodeCommandIdA0A68;
        NodeCommandId nodeCommandIdA0A69 = C60O.A0A("APP_OPEN_LINK", "app.open_link", 68);
        APP_OPEN_LINK = nodeCommandIdA0A69;
        NodeCommandId nodeCommandIdA0A70 = C60O.A0A("NAVIGATION_START", "navigation.start", 69);
        NAVIGATION_START = nodeCommandIdA0A70;
        NodeCommandId nodeCommandIdA0A71 = C60O.A0A("BUG_REPORT_CREATE", "bug_report.create", 70);
        BUG_REPORT_CREATE = nodeCommandIdA0A71;
        NodeCommandId[] nodeCommandIdArr = new NodeCommandId[71];
        System.arraycopy(new NodeCommandId[]{nodeCommandIdA0A, nodeCommandIdA0A2, nodeCommandIdA0A3, nodeCommandIdA0A4, nodeCommandIdA0A5, nodeCommandIdA0A6, nodeCommandIdA0A7, nodeCommandIdA0A8, nodeCommandIdA0A9, nodeCommandIdA0A10, nodeCommandIdA0A11, nodeCommandIdA0A12, nodeCommandIdA0A13, nodeCommandIdA0A14, nodeCommandIdA0A15, nodeCommandIdA0A16, nodeCommandIdA0A17, nodeCommandIdA0A18, nodeCommandIdA0A19, nodeCommandIdA0A20, nodeCommandIdA0A21, nodeCommandIdA0A22, nodeCommandIdA0A23, nodeCommandIdA0A24, nodeCommandIdA0A25, nodeCommandIdA0A26, nodeCommandIdA0A27}, 0, nodeCommandIdArr, 0, 27);
        System.arraycopy(new NodeCommandId[]{nodeCommandIdA0A28, nodeCommandIdA0A29, nodeCommandIdA0A30, nodeCommandIdA0A31, nodeCommandIdA0A32, nodeCommandIdA0A33, nodeCommandIdA0A34, nodeCommandIdA0A35, nodeCommandIdA0A36, nodeCommandIdA0A37, nodeCommandIdA0A38, nodeCommandIdA0A39, nodeCommandIdA0A40, nodeCommandIdA0A41, nodeCommandIdA0A42, nodeCommandIdA0A43, nodeCommandIdA0A44, nodeCommandIdA0A45, nodeCommandIdA0A46, nodeCommandIdA0A47, nodeCommandIdA0A48, nodeCommandIdA0A49, nodeCommandIdA0A50, nodeCommandIdA0A51, nodeCommandIdA0A52, nodeCommandIdA0A53, nodeCommandIdA0A54}, 0, nodeCommandIdArr, 27, 27);
        System.arraycopy(new NodeCommandId[]{nodeCommandIdA0A55, nodeCommandIdA0A56, nodeCommandIdA0A57, nodeCommandIdA0A58, nodeCommandIdA0A59, nodeCommandIdA0A60, nodeCommandIdA0A61, nodeCommandIdA0A62, nodeCommandIdA0A63, nodeCommandIdA0A64, nodeCommandIdA0A65, nodeCommandIdA0A66, nodeCommandIdA0A67, nodeCommandIdA0A68, nodeCommandIdA0A69, nodeCommandIdA0A70, nodeCommandIdA0A71}, 0, nodeCommandIdArr, 54, 17);
        $VALUES = nodeCommandIdArr;
        $ENTRIES = C3cG.A0w(nodeCommandIdArr);
        Companion = new Companion();
    }

    public static Ey9<NodeCommandId> getEntries() {
        return $ENTRIES;
    }

    public static NodeCommandId valueOf(String str) {
        return (NodeCommandId) Enum.valueOf(NodeCommandId.class, str);
    }

    public static NodeCommandId[] values() {
        return (NodeCommandId[]) $VALUES.clone();
    }

    public final String getCommandId() {
        return this.commandId;
    }

    public final class Companion {
        public final NodeCommandId fromId(String str) {
            NodeCommandId next;
            C7384Etj.A0Y(str, 0);
            Iterator<NodeCommandId> it = NodeCommandId.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.getCommandId())) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public NodeCommandId(String str, int i, String str2) {
        this.commandId = str2;
    }
}
