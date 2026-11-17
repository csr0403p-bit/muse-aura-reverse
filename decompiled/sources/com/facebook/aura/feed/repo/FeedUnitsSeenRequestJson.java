package com.facebook.aura.feed.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class FeedUnitsSeenRequestJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final List<String> unit_ids;
    public final List<FeedUnitViewJson> views;

    public final class Companion {
        public final C9hr<FeedUnitsSeenRequestJson> serializer() {
            return FeedUnitsSeenRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedUnitsSeenRequestJson) {
                FeedUnitsSeenRequestJson feedUnitsSeenRequestJson = (FeedUnitsSeenRequestJson) obj;
                if (!C7384Etj.areEqual(this.unit_ids, feedUnitsSeenRequestJson.unit_ids) || !C7384Etj.areEqual(this.views, feedUnitsSeenRequestJson.views)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1W(num, AbstractC5321DgF.A02(num, FeedUnitsSeenRequestJson$Companion$$childSerializers$1.INSTANCE), FeedUnitsSeenRequestJson$Companion$$childSerializers$2.INSTANCE);
    }

    public static /* synthetic */ FeedUnitsSeenRequestJson copy$default(FeedUnitsSeenRequestJson feedUnitsSeenRequestJson, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = feedUnitsSeenRequestJson.unit_ids;
        }
        if ((i & 2) != 0) {
            list2 = feedUnitsSeenRequestJson.views;
        }
        return new FeedUnitsSeenRequestJson(list, list2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(FeedUnitsSeenRequestJson feedUnitsSeenRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || feedUnitsSeenRequestJson.unit_ids != null) {
            c9j5.AAP(feedUnitsSeenRequestJson.unit_ids, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || feedUnitsSeenRequestJson.views != null) {
            c9j5.AAP(feedUnitsSeenRequestJson.views, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final List<String> component1() {
        return this.unit_ids;
    }

    public final List<FeedUnitViewJson> component2() {
        return this.views;
    }

    public final FeedUnitsSeenRequestJson copy(List<String> list, List<FeedUnitViewJson> list2) {
        return new FeedUnitsSeenRequestJson(list, list2);
    }

    public final List<String> getUnit_ids() {
        return this.unit_ids;
    }

    public final List<FeedUnitViewJson> getViews() {
        return this.views;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.unit_ids) * 31) + C3cH.A02(this.views);
    }

    public FeedUnitsSeenRequestJson(List<String> list, List<FeedUnitViewJson> list2) {
        this.unit_ids = list;
        this.views = list2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedUnitsSeenRequestJson(int i, List list, List list2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.unit_ids = null;
        } else {
            this.unit_ids = list;
        }
        if ((i & 2) == 0) {
            this.views = null;
        } else {
            this.views = list2;
        }
    }

    public /* synthetic */ FeedUnitsSeenRequestJson(List list, List list2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }

    public FeedUnitsSeenRequestJson() {
        this(null, null);
    }
}
