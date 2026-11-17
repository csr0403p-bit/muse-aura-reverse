package com.facebook.aura.feed.repo;

import X.AnonymousClass006;
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
public final class FeedReactionRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String reaction;

    public final class Companion {
        public final C9hr<FeedReactionRequestJson> serializer() {
            return FeedReactionRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FeedReactionRequestJson) && C7384Etj.areEqual(this.reaction, ((FeedReactionRequestJson) obj).reaction));
    }

    public /* synthetic */ FeedReactionRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(FeedReactionRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.reaction = str;
    }

    public static /* synthetic */ FeedReactionRequestJson copy$default(FeedReactionRequestJson feedReactionRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedReactionRequestJson.reaction;
        }
        return new FeedReactionRequestJson(str);
    }

    public final String component1() {
        return this.reaction;
    }

    public final FeedReactionRequestJson copy(String str) {
        return new FeedReactionRequestJson(str);
    }

    public final String getReaction() {
        return this.reaction;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.reaction);
    }

    public String toString() {
        return super.toString();
    }

    public FeedReactionRequestJson(String str) {
        this.reaction = str;
    }
}
