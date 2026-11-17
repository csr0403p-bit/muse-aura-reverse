package com.facebook.aura.commands.calendar;

import X.C7384Etj;

/* loaded from: classes3.dex */
public final class CalendarEventCreateRequest {
    public final boolean allDay;
    public final String description;
    public final String duration;
    public final Long endMillis;
    public final String location;
    public final int reminderMinutes;
    public final Long requestedCalendarId;
    public final String rrule;
    public final long startMillis;
    public final String timezone;
    public final String title;

    public CalendarEventCreateRequest(String str, long j, Long l, Long l2, String str2, String str3, boolean z, String str4, int i, String str5, String str6) {
        C7384Etj.A0Y(str, 0);
        this.title = str;
        this.startMillis = j;
        this.requestedCalendarId = l;
        this.endMillis = l2;
        this.description = str2;
        this.location = str3;
        this.allDay = z;
        this.timezone = str4;
        this.reminderMinutes = i;
        this.rrule = str5;
        this.duration = str6;
    }

    public final boolean getAllDay() {
        return this.allDay;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final Long getEndMillis() {
        return this.endMillis;
    }

    public final String getLocation() {
        return this.location;
    }

    public final int getReminderMinutes() {
        return this.reminderMinutes;
    }

    public final Long getRequestedCalendarId() {
        return this.requestedCalendarId;
    }

    public final String getRrule() {
        return this.rrule;
    }

    public final long getStartMillis() {
        return this.startMillis;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final String getTitle() {
        return this.title;
    }
}
