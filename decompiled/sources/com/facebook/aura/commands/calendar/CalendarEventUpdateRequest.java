package com.facebook.aura.commands.calendar;

import X.C7384Etj;

/* loaded from: classes3.dex */
public final class CalendarEventUpdateRequest {
    public final Boolean allDay;
    public final boolean allEvents;
    public final Long calendarId;
    public final String description;
    public final String duration;
    public final Long endMillis;
    public final String location;
    public final Integer reminderMinutes;
    public final String rrule;
    public final Long startMillis;
    public final CalendarEventTarget target;
    public final String timezone;
    public final String title;

    public CalendarEventUpdateRequest(CalendarEventTarget calendarEventTarget, boolean z, String str, Long l, Long l2, String str2, String str3, Boolean bool, String str4, String str5, String str6, Long l3, Integer num) {
        C7384Etj.A0Y(calendarEventTarget, 0);
        this.target = calendarEventTarget;
        this.allEvents = z;
        this.title = str;
        this.startMillis = l;
        this.endMillis = l2;
        this.description = str2;
        this.location = str3;
        this.allDay = bool;
        this.rrule = str4;
        this.duration = str5;
        this.timezone = str6;
        this.calendarId = l3;
        this.reminderMinutes = num;
    }

    public final Boolean getAllDay() {
        return this.allDay;
    }

    public final boolean getAllEvents() {
        return this.allEvents;
    }

    public final Long getCalendarId() {
        return this.calendarId;
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

    public final long getEventId() {
        return this.target.getEventId();
    }

    public final String getLocation() {
        return this.location;
    }

    public final Integer getReminderMinutes() {
        return this.reminderMinutes;
    }

    public final String getRrule() {
        return this.rrule;
    }

    public final Long getStartMillis() {
        return this.startMillis;
    }

    public final CalendarEventTarget getTarget() {
        return this.target;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final String getTitle() {
        return this.title;
    }
}
