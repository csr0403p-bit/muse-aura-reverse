package com.facebook.aura.commands.calendar;

/* loaded from: classes3.dex */
public final class CalendarReminderRemoveRequest {
    public final long eventId;
    public final Integer minutesBefore;

    public final long getEventId() {
        return this.eventId;
    }

    public final Integer getMinutesBefore() {
        return this.minutesBefore;
    }

    public CalendarReminderRemoveRequest(long j, Integer num) {
        this.eventId = j;
        this.minutesBefore = num;
    }
}
