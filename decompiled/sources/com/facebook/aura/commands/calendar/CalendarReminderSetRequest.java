package com.facebook.aura.commands.calendar;

/* loaded from: classes3.dex */
public final class CalendarReminderSetRequest {
    public final long eventId;
    public final int minutesBefore;
    public final boolean replace;

    public final long getEventId() {
        return this.eventId;
    }

    public final int getMinutesBefore() {
        return this.minutesBefore;
    }

    public final boolean getReplace() {
        return this.replace;
    }

    public CalendarReminderSetRequest(long j, int i, boolean z) {
        this.eventId = j;
        this.minutesBefore = i;
        this.replace = z;
    }
}
