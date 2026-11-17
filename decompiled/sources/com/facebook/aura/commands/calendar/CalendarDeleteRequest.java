package com.facebook.aura.commands.calendar;

import X.C7384Etj;

/* loaded from: classes3.dex */
public final class CalendarDeleteRequest {
    public final boolean allEvents;
    public final CalendarEventTarget target;

    public CalendarDeleteRequest(CalendarEventTarget calendarEventTarget, boolean z) {
        C7384Etj.A0Y(calendarEventTarget, 0);
        this.target = calendarEventTarget;
        this.allEvents = z;
    }

    public final boolean getAllEvents() {
        return this.allEvents;
    }

    public final CalendarEventTarget getTarget() {
        return this.target;
    }
}
