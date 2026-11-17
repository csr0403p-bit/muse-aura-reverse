package com.facebook.aura.feed.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public interface FeedInfiniteEvent {

    public final class Busy implements FeedInfiniteEvent {
        public static final int $stable = 0;
        public static final Busy INSTANCE = new Busy();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Busy);
        }

        public String toString() {
            return "Busy";
        }

        public int hashCode() {
            return 428152891;
        }
    }

    public final class Done extends C06G implements FeedInfiniteEvent {
        public static final int $stable = 0;
        public final String reason;
        public final int units;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Done) {
                    Done done = (Done) obj;
                    if (this.units != done.units || !C7384Etj.areEqual(this.reason, done.reason)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Done copy$default(Done done, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = done.units;
            }
            if ((i2 & 2) != 0) {
                str = done.reason;
            }
            return new Done(i, str);
        }

        public final int component1() {
            return this.units;
        }

        public final String component2() {
            return this.reason;
        }

        public final Done copy(int i, String str) {
            return new Done(i, str);
        }

        public final String getReason() {
            return this.reason;
        }

        public final int getUnits() {
            return this.units;
        }

        public int hashCode() {
            return (this.units * 31) + AnonymousClass006.A0G(this.reason);
        }

        public Done(int i, String str) {
            this.units = i;
            this.reason = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes3.dex */
    public final class UnitReceived extends C06G implements FeedInfiniteEvent {
        public static final int $stable = 0;
        public final FeedUnit unit;
        public final String unitKey;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UnitReceived) {
                    UnitReceived unitReceived = (UnitReceived) obj;
                    if (!C7384Etj.areEqual(this.unitKey, unitReceived.unitKey) || !C7384Etj.areEqual(this.unit, unitReceived.unit)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ UnitReceived copy$default(UnitReceived unitReceived, String str, FeedUnit feedUnit, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unitReceived.unitKey;
            }
            if ((i & 2) != 0) {
                feedUnit = unitReceived.unit;
            }
            AnonymousClass003.A0u(str, feedUnit);
            return new UnitReceived(str, feedUnit);
        }

        public final String component1() {
            return this.unitKey;
        }

        public final FeedUnit component2() {
            return this.unit;
        }

        public final FeedUnit getUnit() {
            return this.unit;
        }

        public final String getUnitKey() {
            return this.unitKey;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.unit, AnonymousClass001.A0G(this.unitKey));
        }

        public UnitReceived(String str, FeedUnit feedUnit) {
            AnonymousClass003.A0u(str, feedUnit);
            this.unitKey = str;
            this.unit = feedUnit;
        }

        public final UnitReceived copy(String str, FeedUnit feedUnit) {
            AnonymousClass003.A0u(str, feedUnit);
            return new UnitReceived(str, feedUnit);
        }

        public String toString() {
            return super.toString();
        }
    }
}
