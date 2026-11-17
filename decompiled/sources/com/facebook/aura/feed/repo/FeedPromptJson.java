package com.facebook.aura.feed.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C8j4;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class FeedPromptJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final long created_at_ms;
    public final String free_text;
    public final String full_prompt;
    public final String prompt_id;
    public final String title;
    public final long updated_at_ms;

    public final class Companion {
        public final C9hr<FeedPromptJson> serializer() {
            return FeedPromptJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(FeedPromptJson feedPromptJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(feedPromptJson.prompt_id)) {
            c9j5.AAV(feedPromptJson.prompt_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(feedPromptJson.title)) {
            c9j5.AAV(feedPromptJson.title, c9iZ, 1);
        }
        if (zAfR || !"".equals(feedPromptJson.free_text)) {
            c9j5.AAV(feedPromptJson.free_text, c9iZ, 2);
        }
        if (zAfR || !"".equals(feedPromptJson.full_prompt)) {
            c9j5.AAV(feedPromptJson.full_prompt, c9iZ, 3);
        }
        if (zAfR || feedPromptJson.created_at_ms != 0) {
            c9j5.AAN(c9iZ, 4, feedPromptJson.created_at_ms);
        }
        if (zAfR || feedPromptJson.updated_at_ms != 0) {
            c9j5.AAN(c9iZ, 5, feedPromptJson.updated_at_ms);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedPromptJson) {
                FeedPromptJson feedPromptJson = (FeedPromptJson) obj;
                if (!C7384Etj.areEqual(this.prompt_id, feedPromptJson.prompt_id) || !C7384Etj.areEqual(this.title, feedPromptJson.title) || !C7384Etj.areEqual(this.free_text, feedPromptJson.free_text) || !C7384Etj.areEqual(this.full_prompt, feedPromptJson.full_prompt) || this.created_at_ms != feedPromptJson.created_at_ms || this.updated_at_ms != feedPromptJson.updated_at_ms) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedPromptJson copy$default(FeedPromptJson feedPromptJson, String str, String str2, String str3, String str4, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedPromptJson.prompt_id;
        }
        if ((i & 2) != 0) {
            str2 = feedPromptJson.title;
        }
        if ((i & 4) != 0) {
            str3 = feedPromptJson.free_text;
        }
        if ((i & 8) != 0) {
            str4 = feedPromptJson.full_prompt;
        }
        if ((i & 16) != 0) {
            j = feedPromptJson.created_at_ms;
        }
        if ((i & 32) != 0) {
            j2 = feedPromptJson.updated_at_ms;
        }
        return feedPromptJson.copy(str, str2, str3, str4, j, j2);
    }

    public final String component1() {
        return this.prompt_id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.free_text;
    }

    public final String component4() {
        return this.full_prompt;
    }

    public final long component5() {
        return this.created_at_ms;
    }

    public final long component6() {
        return this.updated_at_ms;
    }

    public final long getCreated_at_ms() {
        return this.created_at_ms;
    }

    public final String getFree_text() {
        return this.free_text;
    }

    public final String getFull_prompt() {
        return this.full_prompt;
    }

    public final String getPrompt_id() {
        return this.prompt_id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getUpdated_at_ms() {
        return this.updated_at_ms;
    }

    public int hashCode() {
        return C8j4.A0B(this.updated_at_ms, AnonymousClass006.A06(this.created_at_ms, AnonymousClass005.A0I(this.full_prompt, AnonymousClass005.A0I(this.free_text, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.prompt_id))))));
    }

    public final FeedPrompt toDomain() {
        return new FeedPrompt(this.prompt_id, this.title, this.free_text, this.full_prompt, this.created_at_ms, this.updated_at_ms);
    }

    public /* synthetic */ FeedPromptJson(int i, String str, String str2, String str3, String str4, long j, long j2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.prompt_id = "";
        } else {
            this.prompt_id = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.free_text = "";
        } else {
            this.free_text = str3;
        }
        if ((i & 8) == 0) {
            this.full_prompt = "";
        } else {
            this.full_prompt = str4;
        }
        if ((i & 16) == 0) {
            this.created_at_ms = 0L;
        } else {
            this.created_at_ms = j;
        }
        if ((i & 32) == 0) {
            this.updated_at_ms = 0L;
        } else {
            this.updated_at_ms = j2;
        }
    }

    public final FeedPromptJson copy(String str, String str2, String str3, String str4, long j, long j2) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new FeedPromptJson(str, str2, str3, str4, j, j2);
    }

    public String toString() {
        return super.toString();
    }

    public FeedPromptJson(String str, String str2, String str3, String str4, long j, long j2) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.prompt_id = str;
        this.title = str2;
        this.free_text = str3;
        this.full_prompt = str4;
        this.created_at_ms = j;
        this.updated_at_ms = j2;
    }

    public /* synthetic */ FeedPromptJson(String str, String str2, String str3, String str4, long j, long j2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? 0L : j, C3cH.A03(i & 32, j2));
    }

    public FeedPromptJson() {
        this("", "", "", "", 0L, 0L);
    }
}
