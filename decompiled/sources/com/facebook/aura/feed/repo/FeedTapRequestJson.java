package com.facebook.aura.feed.repo;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class FeedTapRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String kind;

    public final class Companion {
        public final C9hr<FeedTapRequestJson> serializer() {
            return FeedTapRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final FeedTapRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new FeedTapRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FeedTapRequestJson) && C7384Etj.areEqual(this.kind, ((FeedTapRequestJson) obj).kind));
    }

    public /* synthetic */ FeedTapRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(FeedTapRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.kind = str;
    }

    public static /* synthetic */ FeedTapRequestJson copy$default(FeedTapRequestJson feedTapRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedTapRequestJson.kind;
        }
        C7384Etj.A0Y(str, 0);
        return new FeedTapRequestJson(str);
    }

    public final String component1() {
        return this.kind;
    }

    public final String getKind() {
        return this.kind;
    }

    public int hashCode() {
        return this.kind.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public FeedTapRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.kind = str;
    }
}
