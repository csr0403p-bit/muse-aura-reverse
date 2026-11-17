package com.facebook.aura.commands.calendar;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C06G;
import X.C3cG;

/* loaded from: classes3.dex */
public interface CalendarEventTarget {

    public final class SingleOccurrence extends C06G implements CalendarEventTarget {
        public final long eventId;
        public final long occurrenceStartMs;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SingleOccurrence) {
                    SingleOccurrence singleOccurrence = (SingleOccurrence) obj;
                    if (this.eventId != singleOccurrence.eventId || this.occurrenceStartMs != singleOccurrence.occurrenceStartMs) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ SingleOccurrence copy$default(SingleOccurrence singleOccurrence, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = singleOccurrence.eventId;
            }
            if ((i & 2) != 0) {
                j2 = singleOccurrence.occurrenceStartMs;
            }
            return new SingleOccurrence(j, j2);
        }

        public final long component1() {
            return this.eventId;
        }

        public final long component2() {
            return this.occurrenceStartMs;
        }

        public final SingleOccurrence copy(long j, long j2) {
            return new SingleOccurrence(j, j2);
        }

        @Override // com.facebook.aura.commands.calendar.CalendarEventTarget
        public long getEventId() {
            return this.eventId;
        }

        public final long getOccurrenceStartMs() {
            return this.occurrenceStartMs;
        }

        public int hashCode() {
            return AnonymousClass005.A07(this.eventId) + C3cG.A02(this.occurrenceStartMs);
        }

        public SingleOccurrence(long j, long j2) {
            this.eventId = j;
            this.occurrenceStartMs = j2;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class WholeSeries extends C06G implements CalendarEventTarget {
        public final long eventId;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof WholeSeries) && this.eventId == ((WholeSeries) obj).eventId);
        }

        public static /* synthetic */ WholeSeries copy$default(WholeSeries wholeSeries, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = wholeSeries.eventId;
            }
            return new WholeSeries(j);
        }

        public final long component1() {
            return this.eventId;
        }

        public final WholeSeries copy(long j) {
            return new WholeSeries(j);
        }

        @Override // com.facebook.aura.commands.calendar.CalendarEventTarget
        public long getEventId() {
            return this.eventId;
        }

        public int hashCode() {
            return AnonymousClass002.A0A(this.eventId);
        }

        public WholeSeries(long j) {
            this.eventId = j;
        }

        public String toString() {
            return super.toString();
        }
    }

    long getEventId();
}
