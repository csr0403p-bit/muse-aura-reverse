package com.facebook.aura.feed.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BLG;
import X.C06G;
import X.C1BN;
import X.C3Pi;
import X.C7384Etj;
import X.C9286GCn;
import X.HwN;

/* loaded from: classes.dex */
public final class HatchPendingFeedUnit {
    public static final int $stable = 0;
    public static final HatchPendingFeedUnit INSTANCE = new HatchPendingFeedUnit();
    public static final BLG<Event> _events;
    public static final C1BN<Event> events;

    public final class Event extends C06G {
        public static final int $stable = 0;
        public final long nonce;
        public final String unitId;

        public Event(String str, long j) {
            C7384Etj.A0Y(str, 0);
            this.unitId = str;
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
                    if (!C7384Etj.areEqual(this.unitId, event.unitId) || this.nonce != event.nonce) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Event copy$default(Event event, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = event.unitId;
            }
            if ((i & 2) != 0) {
                j = event.nonce;
            }
            C7384Etj.A0Y(str, 0);
            return new Event(str, j);
        }

        public final String component1() {
            return this.unitId;
        }

        public final long component2() {
            return this.nonce;
        }

        public final long getNonce() {
            return this.nonce;
        }

        public final String getUnitId() {
            return this.unitId;
        }

        public int hashCode() {
            return AnonymousClass006.A05(this.nonce, AnonymousClass001.A0G(this.unitId));
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
        C9286GCn c9286GCn = new C9286GCn(HwN.A01);
        _events = c9286GCn;
        events = new C3Pi(null, c9286GCn);
    }

    public final C1BN<Event> getEvents() {
        return events;
    }
}
