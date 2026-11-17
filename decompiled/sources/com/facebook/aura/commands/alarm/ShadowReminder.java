package com.facebook.aura.commands.alarm;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C10571Hud;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import X.F60;
import java.time.ZoneId;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShadowReminder extends C06G {
    public final long anchorMs;
    public final Long calendarId;
    public final String days;
    public final ReminderDelivery delivery;
    public final Long eventId;
    public final int firedCount;
    public final int hour;
    public final String id;
    public final String label;
    public final int minute;
    public final boolean pendingSnooze;
    public final Recurrence recurrence;
    public final String timezone;
    public final long triggerTimeMs;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, ShadowReminder$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<ShadowReminder> serializer() {
            return ShadowReminder$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShadowReminder) {
                ShadowReminder shadowReminder = (ShadowReminder) obj;
                if (!C7384Etj.areEqual(this.id, shadowReminder.id) || !C7384Etj.areEqual(this.label, shadowReminder.label) || this.hour != shadowReminder.hour || this.minute != shadowReminder.minute || !C7384Etj.areEqual(this.days, shadowReminder.days) || this.triggerTimeMs != shadowReminder.triggerTimeMs || !C7384Etj.areEqual(this.eventId, shadowReminder.eventId) || !C7384Etj.areEqual(this.calendarId, shadowReminder.calendarId) || !C7384Etj.areEqual(this.recurrence, shadowReminder.recurrence) || this.anchorMs != shadowReminder.anchorMs || this.firedCount != shadowReminder.firedCount || this.pendingSnooze != shadowReminder.pendingSnooze || !C7384Etj.areEqual(this.timezone, shadowReminder.timezone) || this.delivery != shadowReminder.delivery) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShadowReminder copy$default(ShadowReminder shadowReminder, String str, String str2, int i, int i2, String str3, long j, Long l, Long l2, Recurrence recurrence, long j2, int i3, boolean z, String str4, ReminderDelivery reminderDelivery, int i4, Object obj) {
        String str5 = str2;
        int i5 = i;
        int i6 = i2;
        String str6 = str3;
        long j3 = j;
        Long l3 = l;
        Long l4 = l2;
        Recurrence recurrence2 = recurrence;
        long j4 = j2;
        int i7 = i3;
        boolean z2 = z;
        String str7 = str4;
        ReminderDelivery reminderDelivery2 = reminderDelivery;
        if ((i4 & 1) != 0) {
            str = shadowReminder.id;
        }
        if ((i4 & 2) != 0) {
            str5 = shadowReminder.label;
        }
        if ((i4 & 4) != 0) {
            i5 = shadowReminder.hour;
        }
        if ((i4 & 8) != 0) {
            i6 = shadowReminder.minute;
        }
        if ((i4 & 16) != 0) {
            str6 = shadowReminder.days;
        }
        if ((i4 & 32) != 0) {
            j3 = shadowReminder.triggerTimeMs;
        }
        if ((i4 & 64) != 0) {
            l3 = shadowReminder.eventId;
        }
        if ((i4 & 128) != 0) {
            l4 = shadowReminder.calendarId;
        }
        if ((i4 & 256) != 0) {
            recurrence2 = shadowReminder.recurrence;
        }
        if ((i4 & 512) != 0) {
            j4 = shadowReminder.anchorMs;
        }
        if ((i4 & 1024) != 0) {
            i7 = shadowReminder.firedCount;
        }
        if ((i4 & 2048) != 0) {
            z2 = shadowReminder.pendingSnooze;
        }
        if ((i4 & 4096) != 0) {
            str7 = shadowReminder.timezone;
        }
        if ((i4 & 8192) != 0) {
            reminderDelivery2 = shadowReminder.delivery;
        }
        return shadowReminder.copy(str, str5, i5, i6, str6, j3, l3, l4, recurrence2, j4, i7, z2, str7, reminderDelivery2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(ShadowReminder shadowReminder, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(shadowReminder.id, c9iZ, 0);
        c9j5.AAV(shadowReminder.label, c9iZ, 1);
        c9j5.AAK(c9iZ, 2, shadowReminder.hour);
        c9j5.AAK(c9iZ, 3, shadowReminder.minute);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(shadowReminder.days)) {
            c9j5.AAV(shadowReminder.days, c9iZ, 4);
        }
        c9j5.AAN(c9iZ, 5, shadowReminder.triggerTimeMs);
        if (zAfR || shadowReminder.eventId != null) {
            c9j5.AAP(shadowReminder.eventId, C9j1.A00, c9iZ, 6);
        }
        if (zAfR || shadowReminder.calendarId != null) {
            c9j5.AAP(shadowReminder.calendarId, C9j1.A00, c9iZ, 7);
        }
        if (zAfR || shadowReminder.recurrence != null) {
            c9j5.AAP(shadowReminder.recurrence, Recurrence$$serializer.INSTANCE, c9iZ, 8);
        }
        if (zAfR || shadowReminder.anchorMs != 0) {
            c9j5.AAN(c9iZ, 9, shadowReminder.anchorMs);
        }
        if (zAfR || shadowReminder.firedCount != 0) {
            c9j5.AAK(c9iZ, 10, shadowReminder.firedCount);
        }
        if (zAfR || shadowReminder.pendingSnooze) {
            c9j5.AA7(c9iZ, 11, shadowReminder.pendingSnooze);
        }
        if (zAfR || shadowReminder.timezone != null) {
            c9j5.AAP(shadowReminder.timezone, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || shadowReminder.delivery != null) {
            c9j5.AAP(shadowReminder.delivery, C3cH.A15(f0cArr, 13), c9iZ, 13);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final long component10() {
        return this.anchorMs;
    }

    public final int component11() {
        return this.firedCount;
    }

    public final boolean component12() {
        return this.pendingSnooze;
    }

    public final String component13() {
        return this.timezone;
    }

    public final ReminderDelivery component14() {
        return this.delivery;
    }

    public final String component2() {
        return this.label;
    }

    public final int component3() {
        return this.hour;
    }

    public final int component4() {
        return this.minute;
    }

    public final String component5() {
        return this.days;
    }

    public final long component6() {
        return this.triggerTimeMs;
    }

    public final Long component7() {
        return this.eventId;
    }

    public final Long component8() {
        return this.calendarId;
    }

    public final Recurrence component9() {
        return this.recurrence;
    }

    public final Recurrence effectiveRecurrence() {
        Recurrence recurrence = this.recurrence;
        if (recurrence != null) {
            return recurrence;
        }
        List<Integer> days = AlarmHandlersKt.parseDays(this.days);
        if (days.isEmpty()) {
            return null;
        }
        F0C<C9hr<Object>>[] f0cArr = Recurrence.$childSerializers;
        return new Recurrence(RecurrenceFrequency.WEEKLY, 1, days, null, null);
    }

    public final long getAnchorMs() {
        return this.anchorMs;
    }

    public final Long getCalendarId() {
        return this.calendarId;
    }

    public final String getDays() {
        return this.days;
    }

    public final ReminderDelivery getDelivery() {
        return this.delivery;
    }

    public final ReminderDelivery getEffectiveDelivery() {
        ReminderDelivery reminderDelivery = this.delivery;
        return reminderDelivery == null ? ReminderDelivery.IN_APP : reminderDelivery;
    }

    public final Long getEventId() {
        return this.eventId;
    }

    public final int getFiredCount() {
        return this.firedCount;
    }

    public final int getHour() {
        return this.hour;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getMinute() {
        return this.minute;
    }

    public final boolean getPendingSnooze() {
        return this.pendingSnooze;
    }

    public final Recurrence getRecurrence() {
        return this.recurrence;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final long getTriggerTimeMs() {
        return this.triggerTimeMs;
    }

    public int hashCode() {
        return ((C0KA.A01((AnonymousClass006.A06(this.anchorMs, (((((AnonymousClass006.A06(this.triggerTimeMs, AnonymousClass005.A0I(this.days, (((AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.id)) + this.hour) * 31) + this.minute) * 31)) + AnonymousClass006.A0D(this.eventId)) * 31) + AnonymousClass006.A0D(this.calendarId)) * 31) + AnonymousClass006.A0D(this.recurrence)) * 31) + this.firedCount) * 31, this.pendingSnooze) + AnonymousClass006.A0G(this.timezone)) * 31) + C3cH.A02(this.delivery);
    }

    public final ZoneId zoneId() {
        Object objA0s;
        String str = this.timezone;
        if (str != null) {
            try {
                objA0s = ZoneId.of(str);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            ZoneId zoneId = (ZoneId) objA0s;
            if (zoneId != null) {
                return zoneId;
            }
        }
        return C60Q.A0r();
    }

    public ShadowReminder(String str, String str2, int i, int i2, String str3, long j, Long l, Long l2, Recurrence recurrence, long j2, int i3, boolean z, String str4, ReminderDelivery reminderDelivery) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str3, 4);
        this.id = str;
        this.label = str2;
        this.hour = i;
        this.minute = i2;
        this.days = str3;
        this.triggerTimeMs = j;
        this.eventId = l;
        this.calendarId = l2;
        this.recurrence = recurrence;
        this.anchorMs = j2;
        this.firedCount = i3;
        this.pendingSnooze = z;
        this.timezone = str4;
        this.delivery = reminderDelivery;
    }

    public final ShadowReminder copy(String str, String str2, int i, int i2, String str3, long j, Long l, Long l2, Recurrence recurrence, long j2, int i3, boolean z, String str4, ReminderDelivery reminderDelivery) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str3, 4);
        return new ShadowReminder(str, str2, i, i2, str3, j, l, l2, recurrence, j2, i3, z, str4, reminderDelivery);
    }

    public final boolean isRecurring() {
        return AnonymousClass002.A1X(effectiveRecurrence());
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShadowReminder(int i, String str, String str2, int i2, int i3, String str3, long j, Long l, Long l2, Recurrence recurrence, long j2, int i4, boolean z, String str4, ReminderDelivery reminderDelivery, C2hx c2hx) {
        if (47 != (i & 47)) {
            C9iI.A00(ShadowReminder$$serializer.descriptor, i, 47);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.label = str2;
        this.hour = i2;
        this.minute = i3;
        this.days = (i & 16) == 0 ? "" : str3;
        this.triggerTimeMs = j;
        if ((i & 64) == 0) {
            this.eventId = null;
        } else {
            this.eventId = l;
        }
        if ((i & 128) == 0) {
            this.calendarId = null;
        } else {
            this.calendarId = l2;
        }
        if ((i & 256) == 0) {
            this.recurrence = null;
        } else {
            this.recurrence = recurrence;
        }
        if ((i & 512) == 0) {
            this.anchorMs = 0L;
        } else {
            this.anchorMs = j2;
        }
        if ((i & 1024) == 0) {
            this.firedCount = 0;
        } else {
            this.firedCount = i4;
        }
        if ((i & 2048) == 0) {
            this.pendingSnooze = false;
        } else {
            this.pendingSnooze = z;
        }
        if ((i & 4096) == 0) {
            this.timezone = null;
        } else {
            this.timezone = str4;
        }
        if ((i & 8192) == 0) {
            this.delivery = null;
        } else {
            this.delivery = reminderDelivery;
        }
    }

    public /* synthetic */ ShadowReminder(String str, String str2, int i, int i2, String str3, long j, Long l, Long l2, Recurrence recurrence, long j2, int i3, boolean z, String str4, ReminderDelivery reminderDelivery, int i4, C06H c06h) {
        this(str, str2, i, i2, (i4 & 16) != 0 ? "" : str3, j, (i4 & 64) != 0 ? null : l, (i4 & 128) != 0 ? null : l2, (i4 & 256) != 0 ? null : recurrence, C3cH.A03(i4 & 512, j2), (i4 & 1024) != 0 ? 0 : i3, C3cG.A1K(i4 & 2048, z), (i4 & 4096) != 0 ? null : str4, (i4 & 8192) != 0 ? null : reminderDelivery);
    }
}
