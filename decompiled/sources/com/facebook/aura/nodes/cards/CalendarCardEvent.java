package com.facebook.aura.nodes.cards;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class CalendarCardEvent extends C06G {
    public static final int $stable = 0;
    public final boolean allDay;
    public final Long endTimeMs;
    public final Long eventId;
    public final String location;
    public final Long startTimeMs;
    public final String title;

    public CalendarCardEvent() {
        this(null, null, null, null, false, null);
    }

    public static /* synthetic */ CalendarCardEvent copy$default(CalendarCardEvent calendarCardEvent, Long l, String str, Long l2, Long l3, boolean z, String str2, int i, Object obj) {
        Long l4 = l;
        String str3 = str;
        Long l5 = l2;
        Long l6 = l3;
        boolean z2 = z;
        String str4 = str2;
        if ((i & 1) != 0) {
            l4 = calendarCardEvent.eventId;
        }
        if ((i & 2) != 0) {
            str3 = calendarCardEvent.title;
        }
        if ((i & 4) != 0) {
            l5 = calendarCardEvent.startTimeMs;
        }
        if ((i & 8) != 0) {
            l6 = calendarCardEvent.endTimeMs;
        }
        if ((i & 16) != 0) {
            z2 = calendarCardEvent.allDay;
        }
        if ((i & 32) != 0) {
            str4 = calendarCardEvent.location;
        }
        return new CalendarCardEvent(l4, str3, l5, l6, z2, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CalendarCardEvent) {
                CalendarCardEvent calendarCardEvent = (CalendarCardEvent) obj;
                if (!C7384Etj.areEqual(this.eventId, calendarCardEvent.eventId) || !C7384Etj.areEqual(this.title, calendarCardEvent.title) || !C7384Etj.areEqual(this.startTimeMs, calendarCardEvent.startTimeMs) || !C7384Etj.areEqual(this.endTimeMs, calendarCardEvent.endTimeMs) || this.allDay != calendarCardEvent.allDay || !C7384Etj.areEqual(this.location, calendarCardEvent.location)) {
                }
            }
            return false;
        }
        return true;
    }

    public final Long component1() {
        return this.eventId;
    }

    public final String component2() {
        return this.title;
    }

    public final Long component3() {
        return this.startTimeMs;
    }

    public final Long component4() {
        return this.endTimeMs;
    }

    public final boolean component5() {
        return this.allDay;
    }

    public final String component6() {
        return this.location;
    }

    public final CalendarCardEvent copy(Long l, String str, Long l2, Long l3, boolean z, String str2) {
        return new CalendarCardEvent(l, str, l2, l3, z, str2);
    }

    public final boolean getAllDay() {
        return this.allDay;
    }

    public final Long getEndTimeMs() {
        return this.endTimeMs;
    }

    public final Long getEventId() {
        return this.eventId;
    }

    public final String getLocation() {
        return this.location;
    }

    public final Long getStartTimeMs() {
        return this.startTimeMs;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return C0KA.A01(((((((AnonymousClass006.A0D(this.eventId) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0D(this.startTimeMs)) * 31) + AnonymousClass006.A0D(this.endTimeMs)) * 31, this.allDay) + AnonymousClass005.A0H(this.location);
    }

    public String toString() {
        return super.toString();
    }

    public CalendarCardEvent(Long l, String str, Long l2, Long l3, boolean z, String str2) {
        this.eventId = l;
        this.title = str;
        this.startTimeMs = l2;
        this.endTimeMs = l3;
        this.allDay = z;
        this.location = str2;
    }

    public /* synthetic */ CalendarCardEvent(Long l, String str, Long l2, Long l3, boolean z, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : l3, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? null : str2);
    }
}
