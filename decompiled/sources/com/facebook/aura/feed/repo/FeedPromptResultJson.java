package com.facebook.aura.feed.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class FeedPromptResultJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final FeedPromptJson prompt;

    public final class Companion {
        public final C9hr<FeedPromptResultJson> serializer() {
            return FeedPromptResultJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(FeedPromptResultJson feedPromptResultJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || feedPromptResultJson.prompt != null) {
            c9j5.AAP(feedPromptResultJson.prompt, FeedPromptJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FeedPromptResultJson) && C7384Etj.areEqual(this.prompt, ((FeedPromptResultJson) obj).prompt));
    }

    public static /* synthetic */ FeedPromptResultJson copy$default(FeedPromptResultJson feedPromptResultJson, FeedPromptJson feedPromptJson, int i, Object obj) {
        if ((i & 1) != 0) {
            feedPromptJson = feedPromptResultJson.prompt;
        }
        return new FeedPromptResultJson(feedPromptJson);
    }

    public final FeedPromptJson component1() {
        return this.prompt;
    }

    public final FeedPromptResultJson copy(FeedPromptJson feedPromptJson) {
        return new FeedPromptResultJson(feedPromptJson);
    }

    public final FeedPromptJson getPrompt() {
        return this.prompt;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.prompt);
    }

    public final FeedPrompt toDomain() {
        FeedPromptJson feedPromptJson = this.prompt;
        if (feedPromptJson != null) {
            return feedPromptJson.toDomain();
        }
        return null;
    }

    public /* synthetic */ FeedPromptResultJson(int i, FeedPromptJson feedPromptJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.prompt = null;
        } else {
            this.prompt = feedPromptJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public FeedPromptResultJson(FeedPromptJson feedPromptJson) {
        this.prompt = feedPromptJson;
    }

    public /* synthetic */ FeedPromptResultJson(FeedPromptJson feedPromptJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : feedPromptJson);
    }

    public FeedPromptResultJson() {
        this(null);
    }
}
