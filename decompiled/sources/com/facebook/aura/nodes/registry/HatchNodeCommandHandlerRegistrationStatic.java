package com.facebook.aura.nodes.registry;

import X.AnonymousClass005;
import X.AnonymousClass801;
import com.facebook.aura.commands.alarm.AlarmDismissAllHandler;
import com.facebook.aura.commands.alarm.AlarmDismissHandler;
import com.facebook.aura.commands.alarm.AlarmListHandler;
import com.facebook.aura.commands.alarm.AlarmSetHandler;
import com.facebook.aura.commands.alarm.AlarmUpdateHandler;
import com.facebook.aura.commands.alarm.ReminderDismissAllHandler;
import com.facebook.aura.commands.alarm.ReminderDismissHandler;
import com.facebook.aura.commands.alarm.ReminderListHandler;
import com.facebook.aura.commands.alarm.ReminderSetHandler;
import com.facebook.aura.commands.alarm.ReminderSnoozeHandler;
import com.facebook.aura.commands.alarm.ReminderUpdateHandler;
import com.facebook.aura.commands.app.AppInfoHandler;
import com.facebook.aura.commands.app.AppUpdateCheckHandler;
import com.facebook.aura.commands.app.AppUpdateStartHandler;
import com.facebook.aura.commands.app.AssistantSetDefaultHandler;
import com.facebook.aura.commands.app.ShortcutAddHomeHandler;
import com.facebook.aura.commands.background.BackgroundSessionHandler;
import com.facebook.aura.commands.battery.BatteryGetHandler;
import com.facebook.aura.commands.calendar.CalendarEventsCreateHandler;
import com.facebook.aura.commands.calendar.CalendarEventsDeleteHandler;
import com.facebook.aura.commands.calendar.CalendarEventsUpdateHandler;
import com.facebook.aura.commands.calendar.CalendarRemindersListHandler;
import com.facebook.aura.commands.calendar.CalendarRemindersRemoveHandler;
import com.facebook.aura.commands.calendar.CalendarRemindersSetHandler;
import com.facebook.aura.commands.calendar.CalendarSearchHandler;
import com.facebook.aura.commands.calllogs.CallLogSearchHandler;
import com.facebook.aura.commands.contacts.ContactsCreateHandler;
import com.facebook.aura.commands.contacts.ContactsDeleteHandler;
import com.facebook.aura.commands.contacts.ContactsSearchHandler;
import com.facebook.aura.commands.contacts.ContactsUpdateHandler;
import com.facebook.aura.commands.geofence.GeofenceListHandler;
import com.facebook.aura.commands.geofence.GeofenceRemoveHandler;
import com.facebook.aura.commands.geofence.GeofenceSetHandler;
import com.facebook.aura.commands.invite.InviteUpsellHandler;
import com.facebook.aura.commands.location.LocationGetHandler;
import com.facebook.aura.commands.network.NetworkStateHandler;
import com.facebook.aura.commands.notifications.NotificationsActionHandler;
import com.facebook.aura.commands.notifications.NotificationsGetHandler;
import com.facebook.aura.commands.phone.PhoneCallHandler;
import com.facebook.aura.commands.photos.PhotosSearchHandler;
import com.facebook.aura.commands.photos.PhotosUploadHandler;
import com.facebook.aura.commands.photos.PhotosUploadStatusHandler;
import com.facebook.aura.commands.sms.MessageAttachmentGetHandler;
import com.facebook.aura.commands.sms.MessageDraftHandler;
import com.facebook.aura.commands.sms.MessageSearchHandler;
import com.facebook.aura.commands.sms.MessageSendHandler;
import com.facebook.aura.commands.subscriptions.SubscriptionsUpgradeHandler;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public class HatchNodeCommandHandlerRegistrationStatic {
    public static NodeCommandId getCommandId(int i) {
        return AnonymousClass801.A05(i);
    }

    public static HatchNodeCommandHandler getHandler(int i) {
        return AnonymousClass801.A08(i);
    }

    public static int[] getKeys() {
        return AnonymousClass801.A0p();
    }

    public static NodeCommandSpec getSpec(int i) {
        switch (i) {
            case 0:
                return AlarmDismissAllHandler.INSTANCE.getSpec();
            case 1:
                return AlarmDismissHandler.INSTANCE.getSpec();
            case 2:
                return AlarmListHandler.INSTANCE.getSpec();
            case 3:
                return AlarmSetHandler.INSTANCE.getSpec();
            case 4:
                return AlarmUpdateHandler.INSTANCE.getSpec();
            case 5:
                return ReminderDismissAllHandler.INSTANCE.getSpec();
            case 6:
                return ReminderDismissHandler.INSTANCE.getSpec();
            case 7:
                return ReminderListHandler.INSTANCE.getSpec();
            case 8:
                return ReminderSetHandler.INSTANCE.getSpec();
            case 9:
                return ReminderSnoozeHandler.INSTANCE.getSpec();
            case 10:
                return ReminderUpdateHandler.INSTANCE.getSpec();
            case 11:
                return NetworkStateHandler.INSTANCE.getSpec();
            case 12:
                return ContactsCreateHandler.INSTANCE.getSpec();
            case 13:
                return ContactsDeleteHandler.INSTANCE.getSpec();
            case 14:
                return ContactsSearchHandler.INSTANCE.getSpec();
            case 15:
                return ContactsUpdateHandler.INSTANCE.getSpec();
            case 16:
                return NotificationsActionHandler.INSTANCE.getSpec();
            case 17:
                return NotificationsGetHandler.INSTANCE.getSpec();
            case 18:
                return AppInfoHandler.INSTANCE.getSpec();
            case 19:
                return AppUpdateCheckHandler.INSTANCE.getSpec();
            case 20:
                return AppUpdateStartHandler.INSTANCE.getSpec();
            case 21:
                return AssistantSetDefaultHandler.INSTANCE.getSpec();
            case 22:
                return ShortcutAddHomeHandler.INSTANCE.getSpec();
            case 23:
                return BackgroundSessionHandler.INSTANCE.getSpec();
            case 24:
                return BatteryGetHandler.INSTANCE.getSpec();
            case 25:
                return CalendarEventsCreateHandler.INSTANCE.getSpec();
            case 26:
                return CalendarEventsDeleteHandler.INSTANCE.getSpec();
            case 27:
                return CalendarEventsUpdateHandler.INSTANCE.getSpec();
            case 28:
                return CalendarRemindersListHandler.INSTANCE.getSpec();
            case 29:
                return CalendarRemindersRemoveHandler.INSTANCE.getSpec();
            case 30:
                return CalendarRemindersSetHandler.INSTANCE.getSpec();
            case 31:
                return CalendarSearchHandler.INSTANCE.getSpec();
            case 32:
                return CallLogSearchHandler.INSTANCE.getSpec();
            case 33:
                return GeofenceListHandler.INSTANCE.getSpec();
            case 34:
                return GeofenceRemoveHandler.INSTANCE.getSpec();
            case 35:
                return GeofenceSetHandler.INSTANCE.getSpec();
            case 36:
                return InviteUpsellHandler.INSTANCE.getSpec();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return LocationGetHandler.INSTANCE.getSpec();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return PhoneCallHandler.INSTANCE.getSpec();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return PhotosSearchHandler.INSTANCE.getSpec();
            case 40:
                return PhotosUploadHandler.INSTANCE.getSpec();
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return PhotosUploadStatusHandler.INSTANCE.getSpec();
            case 42:
                return MessageAttachmentGetHandler.INSTANCE.getSpec();
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return MessageDraftHandler.INSTANCE.getSpec();
            case 44:
                return MessageSearchHandler.INSTANCE.getSpec();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return MessageSendHandler.INSTANCE.getSpec();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return SubscriptionsUpgradeHandler.INSTANCE.getSpec();
            default:
                throw AnonymousClass005.A0c(i);
        }
    }
}
