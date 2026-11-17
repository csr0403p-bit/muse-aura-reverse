package com.facebook.aura.feed.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FeedUnitResultJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final FeedUnitJson unit;

    public final class Companion {
        public final C9hr<FeedUnitResultJson> serializer() {
            return FeedUnitResultJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(FeedUnitResultJson feedUnitResultJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || feedUnitResultJson.unit != null) {
            c9j5.AAP(feedUnitResultJson.unit, FeedUnitJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FeedUnitResultJson) && C7384Etj.areEqual(this.unit, ((FeedUnitResultJson) obj).unit));
    }

    public static /* synthetic */ FeedUnitResultJson copy$default(FeedUnitResultJson feedUnitResultJson, FeedUnitJson feedUnitJson, int i, Object obj) {
        if ((i & 1) != 0) {
            feedUnitJson = feedUnitResultJson.unit;
        }
        return new FeedUnitResultJson(feedUnitJson);
    }

    public final FeedUnitJson component1() {
        return this.unit;
    }

    public final FeedUnitResultJson copy(FeedUnitJson feedUnitJson) {
        return new FeedUnitResultJson(feedUnitJson);
    }

    public final FeedUnitJson getUnit() {
        return this.unit;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.unit);
    }

    public final FeedUnit toDomain() {
        FeedUnitJson feedUnitJson = this.unit;
        if (feedUnitJson == null) {
            return null;
        }
        F0C<C9hr<Object>>[] f0cArr = FeedUnitJson.$childSerializers;
        return feedUnitJson.toDomain("", null, false);
    }

    public /* synthetic */ FeedUnitResultJson(int i, FeedUnitJson feedUnitJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.unit = null;
        } else {
            this.unit = feedUnitJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public FeedUnitResultJson(FeedUnitJson feedUnitJson) {
        this.unit = feedUnitJson;
    }

    public /* synthetic */ FeedUnitResultJson(FeedUnitJson feedUnitJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : feedUnitJson);
    }

    public FeedUnitResultJson() {
        this(null);
    }
}
