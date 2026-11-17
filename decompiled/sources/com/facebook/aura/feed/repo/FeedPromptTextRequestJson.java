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
public final class FeedPromptTextRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String prompt;

    public final class Companion {
        public final C9hr<FeedPromptTextRequestJson> serializer() {
            return FeedPromptTextRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final FeedPromptTextRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new FeedPromptTextRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FeedPromptTextRequestJson) && C7384Etj.areEqual(this.prompt, ((FeedPromptTextRequestJson) obj).prompt));
    }

    public /* synthetic */ FeedPromptTextRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(FeedPromptTextRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.prompt = str;
    }

    public static /* synthetic */ FeedPromptTextRequestJson copy$default(FeedPromptTextRequestJson feedPromptTextRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedPromptTextRequestJson.prompt;
        }
        C7384Etj.A0Y(str, 0);
        return new FeedPromptTextRequestJson(str);
    }

    public final String component1() {
        return this.prompt;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public int hashCode() {
        return this.prompt.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public FeedPromptTextRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.prompt = str;
    }
}
