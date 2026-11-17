package com.facebook.aura.feed.repo;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C8j4;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class FeedUnitViewJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final long seen_at_ms;
    public final long timespent_ms;
    public final String unit_id;

    public final class Companion {
        public final C9hr<FeedUnitViewJson> serializer() {
            return FeedUnitViewJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public FeedUnitViewJson(String str, long j, long j2) {
        C7384Etj.A0Y(str, 0);
        this.unit_id = str;
        this.timespent_ms = j;
        this.seen_at_ms = j2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(FeedUnitViewJson feedUnitViewJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(feedUnitViewJson.unit_id, c9iZ, 0);
        c9j5.AAN(c9iZ, 1, feedUnitViewJson.timespent_ms);
        c9j5.AAN(c9iZ, 2, feedUnitViewJson.seen_at_ms);
    }

    public final FeedUnitViewJson copy(String str, long j, long j2) {
        C7384Etj.A0Y(str, 0);
        return new FeedUnitViewJson(str, j, j2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedUnitViewJson) {
                FeedUnitViewJson feedUnitViewJson = (FeedUnitViewJson) obj;
                if (!C7384Etj.areEqual(this.unit_id, feedUnitViewJson.unit_id) || this.timespent_ms != feedUnitViewJson.timespent_ms || this.seen_at_ms != feedUnitViewJson.seen_at_ms) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedUnitViewJson copy$default(FeedUnitViewJson feedUnitViewJson, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedUnitViewJson.unit_id;
        }
        if ((i & 2) != 0) {
            j = feedUnitViewJson.timespent_ms;
        }
        if ((i & 4) != 0) {
            j2 = feedUnitViewJson.seen_at_ms;
        }
        return feedUnitViewJson.copy(str, j, j2);
    }

    public final String component1() {
        return this.unit_id;
    }

    public final long component2() {
        return this.timespent_ms;
    }

    public final long component3() {
        return this.seen_at_ms;
    }

    public final long getSeen_at_ms() {
        return this.seen_at_ms;
    }

    public final long getTimespent_ms() {
        return this.timespent_ms;
    }

    public final String getUnit_id() {
        return this.unit_id;
    }

    public int hashCode() {
        return C8j4.A0B(this.seen_at_ms, AnonymousClass006.A06(this.timespent_ms, AnonymousClass001.A0G(this.unit_id)));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedUnitViewJson(int i, String str, long j, long j2, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(FeedUnitViewJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.unit_id = str;
        this.timespent_ms = j;
        this.seen_at_ms = j2;
    }
}
