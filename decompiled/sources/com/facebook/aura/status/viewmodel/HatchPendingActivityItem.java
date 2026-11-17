package com.facebook.aura.status.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BLG;
import X.C06G;
import X.C1BN;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.HwN;

/* loaded from: classes3.dex */
public final class HatchPendingActivityItem {
    public static final HatchPendingActivityItem INSTANCE = new HatchPendingActivityItem();
    public static final BLG<Event> _events;
    public static final C1BN<Event> events;

    public final class Event extends C06G {
        public final String activityId;
        public final long nonce;

        public Event(String str, long j) {
            C7384Etj.A0Y(str, 0);
            this.activityId = str;
            this.nonce = j;
        }

        public final Event copy(String str, long j) {
            C7384Etj.A0Y(str, 0);
            return new Event(str, j);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Event) {
                    Event event = (Event) obj;
                    if (!C7384Etj.areEqual(this.activityId, event.activityId) || this.nonce != event.nonce) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Event copy$default(Event event, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = event.activityId;
            }
            if ((i & 2) != 0) {
                j = event.nonce;
            }
            C7384Etj.A0Y(str, 0);
            return new Event(str, j);
        }

        public final String component1() {
            return this.activityId;
        }

        public final long component2() {
            return this.nonce;
        }

        public final String getActivityId() {
            return this.activityId;
        }

        public final long getNonce() {
            return this.nonce;
        }

        public int hashCode() {
            return AnonymousClass006.A05(this.nonce, AnonymousClass001.A0G(this.activityId));
        }

        public String toString() {
            return super.toString();
        }
    }

    public final void acknowledge(Event event) {
        C7384Etj.A0Y(event, 0);
        C9286GCn.A00(event, HwN.A01, (C9286GCn) _events);
    }

    public final void publish(String str) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass002.A1I(_events, new Event(str, System.nanoTime()));
    }

    static {
        C9286GCn c9286GCnA13 = C3cG.A13();
        _events = c9286GCnA13;
        events = C3cG.A11(c9286GCnA13);
    }

    public final C1BN<Event> getEvents() {
        return events;
    }
}
