package com.facebook.aura.nodes.cards;

import X.C10571Hud;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import X.C9sU;
import X.C9sZ;
import X.F60;
import com.facebook.aura.json.HatchJsonKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public abstract class HatchNodeCardJsonKt {
    public static final String TYPE_CALENDAR = "calendar";
    public static final String TYPE_CALLING = "calling";
    public static final String TYPE_CLOCK = "clock";
    public static final String TYPE_CONTACTS = "contacts";
    public static final String TYPE_GEOFENCE = "geofence";
    public static final String TYPE_MESSAGING = "messaging";
    public static final String TYPE_NOTIFICATION_OPT_IN = "notification_opt_in";
    public static final String TYPE_PERMISSION = "permission";
    public static final String TYPE_REMINDER = "reminder";
    public static final String TYPE_RUN_IN_BACKGROUND = "run_in_background";

    public static final /* synthetic */ <T> T decodeData(JsonElement jsonElement) {
        try {
            C7384Etj.A0Q();
            throw F60.createAndThrow();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final HatchNodeCardData parseHatchNodeCard(String str) {
        Object objA0s;
        JsonObject jsonObject;
        Object objA0s2;
        Object objA0s3;
        Object objA0s4;
        Object objA0s5;
        Object objA0s6;
        Object objA0s7;
        Object objA0s8;
        Object objA0s9;
        Object objA0s10;
        Object objA0s11;
        C7384Etj.A0Y(str, 0);
        try {
            objA0s = (HatchNodeCardEnvelopeJson) HatchJsonKt.HatchJson.A00(str, HatchNodeCardEnvelopeJson$$serializer.INSTANCE);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        HatchNodeCardData domain = null;
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        HatchNodeCardEnvelopeJson hatchNodeCardEnvelopeJson = (HatchNodeCardEnvelopeJson) objA0s;
        if (hatchNodeCardEnvelopeJson != null && hatchNodeCardEnvelopeJson.version == 1 && (jsonObject = hatchNodeCardEnvelopeJson.data) != null) {
            String strA0J = C3cJ.A0J(hatchNodeCardEnvelopeJson.type);
            switch (strA0J.hashCode()) {
                case -2073157164:
                    if (strA0J.equals(TYPE_RUN_IN_BACKGROUND)) {
                        try {
                            objA0s11 = HatchJsonKt.HatchJson.A01(RunInBackgroundCardJson$$serializer.INSTANCE, jsonObject);
                        } catch (Throwable th2) {
                            objA0s11 = C3cG.A0s(th2);
                        }
                        if (objA0s11 instanceof C10571Hud) {
                            objA0s11 = null;
                        }
                        RunInBackgroundCardJson runInBackgroundCardJson = (RunInBackgroundCardJson) objA0s11;
                        if (runInBackgroundCardJson != null) {
                            domain = runInBackgroundCardJson.toDomain();
                            break;
                        }
                    }
                    break;
                case -1440008444:
                    if (strA0J.equals(TYPE_MESSAGING)) {
                        try {
                            C9sU c9sU = HatchJsonKt.HatchJson;
                            int i = MessagingCardJson.$stable;
                            objA0s10 = c9sU.A01(MessagingCardJson$$serializer.INSTANCE, jsonObject);
                        } catch (Throwable th3) {
                            objA0s10 = C3cG.A0s(th3);
                        }
                        if (objA0s10 instanceof C10571Hud) {
                            objA0s10 = null;
                        }
                        MessagingCardJson messagingCardJson = (MessagingCardJson) objA0s10;
                        if (messagingCardJson != null) {
                            domain = messagingCardJson.toDomain();
                            break;
                        }
                    }
                    break;
                case -567451565:
                    if (strA0J.equals(TYPE_CONTACTS)) {
                        try {
                            C9sU c9sU2 = HatchJsonKt.HatchJson;
                            int i2 = ContactsCardJson.$stable;
                            objA0s9 = c9sU2.A01(ContactsCardJson$$serializer.INSTANCE, jsonObject);
                        } catch (Throwable th4) {
                            objA0s9 = C3cG.A0s(th4);
                        }
                        if (objA0s9 instanceof C10571Hud) {
                            objA0s9 = null;
                        }
                        ContactsCardJson contactsCardJson = (ContactsCardJson) objA0s9;
                        if (contactsCardJson != null) {
                            domain = contactsCardJson.toDomain();
                            break;
                        }
                    }
                    break;
                case -518602638:
                    if (strA0J.equals(TYPE_REMINDER)) {
                        try {
                            C9sU c9sU3 = HatchJsonKt.HatchJson;
                            int i3 = ReminderCardJson.$stable;
                            objA0s8 = c9sU3.A01(ReminderCardJson$$serializer.INSTANCE, jsonObject);
                        } catch (Throwable th5) {
                            objA0s8 = C3cG.A0s(th5);
                        }
                        if (objA0s8 instanceof C10571Hud) {
                            objA0s8 = null;
                        }
                        ReminderCardJson reminderCardJson = (ReminderCardJson) objA0s8;
                        if (reminderCardJson != null) {
                            domain = reminderCardJson.toDomain();
                            break;
                        }
                    }
                    break;
                case -517618225:
                    if (strA0J.equals(TYPE_PERMISSION)) {
                        try {
                            objA0s7 = HatchJsonKt.HatchJson.A01(PermissionCardJson$$serializer.INSTANCE, jsonObject);
                        } catch (Throwable th6) {
                            objA0s7 = C3cG.A0s(th6);
                        }
                        if (objA0s7 instanceof C10571Hud) {
                            objA0s7 = null;
                        }
                        PermissionCardJson permissionCardJson = (PermissionCardJson) objA0s7;
                        if (permissionCardJson != null) {
                            domain = permissionCardJson.toDomain();
                            break;
                        }
                    }
                    break;
                case -178324674:
                    if (strA0J.equals("calendar")) {
                        try {
                            C9sU c9sU4 = HatchJsonKt.HatchJson;
                            int i4 = CalendarCardJson.$stable;
                            objA0s6 = c9sU4.A01(CalendarCardJson$$serializer.INSTANCE, jsonObject);
                        } catch (Throwable th7) {
                            objA0s6 = C3cG.A0s(th7);
                        }
                        if (objA0s6 instanceof C10571Hud) {
                            objA0s6 = null;
                        }
                        CalendarCardJson calendarCardJson = (CalendarCardJson) objA0s6;
                        if (calendarCardJson != null) {
                            domain = calendarCardJson.toDomain();
                            break;
                        }
                    }
                    break;
                case 94755854:
                    if (strA0J.equals(TYPE_CLOCK)) {
                        try {
                            C9sU c9sU5 = HatchJsonKt.HatchJson;
                            int i5 = ClockCardJson.$stable;
                            objA0s5 = c9sU5.A01(ClockCardJson$$serializer.INSTANCE, jsonObject);
                        } catch (Throwable th8) {
                            objA0s5 = C3cG.A0s(th8);
                        }
                        if (objA0s5 instanceof C10571Hud) {
                            objA0s5 = null;
                        }
                        ClockCardJson clockCardJson = (ClockCardJson) objA0s5;
                        if (clockCardJson != null) {
                            domain = clockCardJson.toDomain();
                            break;
                        }
                    }
                    break;
                case 548640964:
                    if (strA0J.equals(TYPE_CALLING)) {
                        try {
                            objA0s4 = HatchJsonKt.HatchJson.A01(CallingCardJson$$serializer.INSTANCE, jsonObject);
                        } catch (Throwable th9) {
                            objA0s4 = C3cG.A0s(th9);
                        }
                        if (objA0s4 instanceof C10571Hud) {
                            objA0s4 = null;
                        }
                        CallingCardJson callingCardJson = (CallingCardJson) objA0s4;
                        if (callingCardJson != null) {
                            domain = callingCardJson.toDomain();
                            break;
                        }
                    }
                    break;
                case 1074464773:
                    if (strA0J.equals(TYPE_NOTIFICATION_OPT_IN)) {
                        try {
                            objA0s3 = HatchJsonKt.HatchJson.A01(NotificationOptInCardJson$$serializer.INSTANCE, jsonObject);
                        } catch (Throwable th10) {
                            objA0s3 = C3cG.A0s(th10);
                        }
                        if (objA0s3 instanceof C10571Hud) {
                            objA0s3 = null;
                        }
                        NotificationOptInCardJson notificationOptInCardJson = (NotificationOptInCardJson) objA0s3;
                        if (notificationOptInCardJson != null) {
                            domain = notificationOptInCardJson.toDomain();
                            break;
                        }
                    }
                    break;
                case 1839549312:
                    if (strA0J.equals(TYPE_GEOFENCE)) {
                        try {
                            objA0s2 = HatchJsonKt.HatchJson.A01(GeofenceCardJson$$serializer.INSTANCE, jsonObject);
                        } catch (Throwable th11) {
                            objA0s2 = C3cG.A0s(th11);
                        }
                        if (objA0s2 instanceof C10571Hud) {
                            objA0s2 = null;
                        }
                        GeofenceCardJson geofenceCardJson = (GeofenceCardJson) objA0s2;
                        if (geofenceCardJson != null) {
                            domain = geofenceCardJson.toDomain();
                            break;
                        }
                    }
                    break;
            }
            return domain;
        }
        return null;
    }

    public static final String parseHatchNodeCardSourceClientId(String str) {
        Object objA0s;
        JsonObject jsonObject;
        Object objA0s2;
        C7384Etj.A0Y(str, 0);
        try {
            objA0s = (HatchNodeCardEnvelopeJson) HatchJsonKt.HatchJson.A00(str, HatchNodeCardEnvelopeJson$$serializer.INSTANCE);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        HatchNodeCardEnvelopeJson hatchNodeCardEnvelopeJson = (HatchNodeCardEnvelopeJson) objA0s;
        if (hatchNodeCardEnvelopeJson == null || (jsonObject = hatchNodeCardEnvelopeJson.data) == null) {
            return null;
        }
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            NodeCardSourceJson$$serializer nodeCardSourceJson$$serializer = NodeCardSourceJson$$serializer.INSTANCE;
            C7384Etj.A0Y(nodeCardSourceJson$$serializer, 0);
            objA0s2 = C9sZ.A00(nodeCardSourceJson$$serializer, c9sU, jsonObject);
        } catch (Throwable th2) {
            objA0s2 = C3cG.A0s(th2);
        }
        if (objA0s2 instanceof C10571Hud) {
            objA0s2 = null;
        }
        NodeCardSourceJson nodeCardSourceJson = (NodeCardSourceJson) objA0s2;
        if (nodeCardSourceJson != null) {
            return nodeCardSourceJson.source_client_id;
        }
        return null;
    }
}
