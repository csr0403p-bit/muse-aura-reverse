package com.facebook.aura.feed.repo;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.feed.repo.FeedInfiniteEvent;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FeedInfiniteLineJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean busy;
    public final boolean done;
    public final String reason;
    public final FeedUnitJson unit;
    public final String unit_key;
    public final int units;

    public final class Companion {
        public final C9hr<FeedInfiniteLineJson> serializer() {
            return FeedInfiniteLineJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public FeedInfiniteLineJson() {
        this(null, null, false, 0, null, false);
    }

    public static /* synthetic */ FeedInfiniteLineJson copy$default(FeedInfiniteLineJson feedInfiniteLineJson, String str, FeedUnitJson feedUnitJson, boolean z, int i, String str2, boolean z2, int i2, Object obj) {
        String str3 = str;
        FeedUnitJson feedUnitJson2 = feedUnitJson;
        boolean z3 = z;
        int i3 = i;
        String str4 = str2;
        boolean z4 = z2;
        if ((i2 & 1) != 0) {
            str3 = feedInfiniteLineJson.unit_key;
        }
        if ((i2 & 2) != 0) {
            feedUnitJson2 = feedInfiniteLineJson.unit;
        }
        if ((i2 & 4) != 0) {
            z3 = feedInfiniteLineJson.done;
        }
        if ((i2 & 8) != 0) {
            i3 = feedInfiniteLineJson.units;
        }
        if ((i2 & 16) != 0) {
            str4 = feedInfiniteLineJson.reason;
        }
        if ((i2 & 32) != 0) {
            z4 = feedInfiniteLineJson.busy;
        }
        return new FeedInfiniteLineJson(str3, feedUnitJson2, z3, i3, str4, z4);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(FeedInfiniteLineJson feedInfiniteLineJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || feedInfiniteLineJson.unit_key != null) {
            c9j5.AAP(feedInfiniteLineJson.unit_key, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || feedInfiniteLineJson.unit != null) {
            c9j5.AAP(feedInfiniteLineJson.unit, FeedUnitJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || feedInfiniteLineJson.done) {
            c9j5.AA7(c9iZ, 2, feedInfiniteLineJson.done);
        }
        if (zAfR || feedInfiniteLineJson.units != 0) {
            c9j5.AAK(c9iZ, 3, feedInfiniteLineJson.units);
        }
        if (zAfR || feedInfiniteLineJson.reason != null) {
            c9j5.AAP(feedInfiniteLineJson.reason, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || feedInfiniteLineJson.busy) {
            c9j5.AA7(c9iZ, 5, feedInfiniteLineJson.busy);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedInfiniteLineJson) {
                FeedInfiniteLineJson feedInfiniteLineJson = (FeedInfiniteLineJson) obj;
                if (!C7384Etj.areEqual(this.unit_key, feedInfiniteLineJson.unit_key) || !C7384Etj.areEqual(this.unit, feedInfiniteLineJson.unit) || this.done != feedInfiniteLineJson.done || this.units != feedInfiniteLineJson.units || !C7384Etj.areEqual(this.reason, feedInfiniteLineJson.reason) || this.busy != feedInfiniteLineJson.busy) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.unit_key;
    }

    public final FeedUnitJson component2() {
        return this.unit;
    }

    public final boolean component3() {
        return this.done;
    }

    public final int component4() {
        return this.units;
    }

    public final String component5() {
        return this.reason;
    }

    public final boolean component6() {
        return this.busy;
    }

    public final FeedInfiniteLineJson copy(String str, FeedUnitJson feedUnitJson, boolean z, int i, String str2, boolean z2) {
        return new FeedInfiniteLineJson(str, feedUnitJson, z, i, str2, z2);
    }

    public final boolean getBusy() {
        return this.busy;
    }

    public final boolean getDone() {
        return this.done;
    }

    public final String getReason() {
        return this.reason;
    }

    public final FeedUnitJson getUnit() {
        return this.unit;
    }

    public final String getUnit_key() {
        return this.unit_key;
    }

    public final int getUnits() {
        return this.units;
    }

    public int hashCode() {
        return C0KA.A00((((C0KA.A01(((AnonymousClass006.A0G(this.unit_key) * 31) + AnonymousClass006.A0D(this.unit)) * 31, this.done) + this.units) * 31) + AnonymousClass005.A0H(this.reason)) * 31, this.busy);
    }

    public final FeedInfiniteEvent toDomain() {
        FeedUnitJson feedUnitJson;
        FeedInfiniteEvent unitReceived;
        if (this.busy) {
            unitReceived = FeedInfiniteEvent.Busy.INSTANCE;
        } else {
            String str = null;
            if (this.done) {
                int i = this.units;
                String str2 = this.reason;
                if (str2 != null && !C7BY.A0j(str2)) {
                    str = str2;
                }
                return new FeedInfiniteEvent.Done(i, str);
            }
            String str3 = this.unit_key;
            if (str3 == null || (feedUnitJson = this.unit) == null) {
                return null;
            }
            F0C<C9hr<Object>>[] f0cArr = FeedUnitJson.$childSerializers;
            unitReceived = new FeedInfiniteEvent.UnitReceived(str3, feedUnitJson.toDomain("", null, false));
        }
        return unitReceived;
    }

    public String toString() {
        return super.toString();
    }

    public FeedInfiniteLineJson(String str, FeedUnitJson feedUnitJson, boolean z, int i, String str2, boolean z2) {
        this.unit_key = str;
        this.unit = feedUnitJson;
        this.done = z;
        this.units = i;
        this.reason = str2;
        this.busy = z2;
    }

    public /* synthetic */ FeedInfiniteLineJson(String str, FeedUnitJson feedUnitJson, boolean z, int i, String str2, boolean z2, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : feedUnitJson, AnonymousClass005.A1O(i2, z), (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str2, AnonymousClass002.A1R(i2, z2));
    }

    public /* synthetic */ FeedInfiniteLineJson(int i, String str, FeedUnitJson feedUnitJson, boolean z, int i2, String str2, boolean z2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.unit_key = null;
        } else {
            this.unit_key = str;
        }
        if ((i & 2) == 0) {
            this.unit = null;
        } else {
            this.unit = feedUnitJson;
        }
        if ((i & 4) == 0) {
            this.done = false;
        } else {
            this.done = z;
        }
        if ((i & 8) == 0) {
            this.units = 0;
        } else {
            this.units = i2;
        }
        if ((i & 16) == 0) {
            this.reason = null;
        } else {
            this.reason = str2;
        }
        if ((i & 32) == 0) {
            this.busy = false;
        } else {
            this.busy = z2;
        }
    }
}
