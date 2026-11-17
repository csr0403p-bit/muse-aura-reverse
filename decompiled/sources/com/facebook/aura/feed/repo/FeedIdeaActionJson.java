package com.facebook.aura.feed.repo;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class FeedIdeaActionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String idea_id;
    public final String state;

    public final class Companion {
        public final C9hr<FeedIdeaActionJson> serializer() {
            return FeedIdeaActionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(FeedIdeaActionJson feedIdeaActionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(feedIdeaActionJson.idea_id)) {
            c9j5.AAV(feedIdeaActionJson.idea_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(feedIdeaActionJson.state)) {
            c9j5.AAV(feedIdeaActionJson.state, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedIdeaActionJson) {
                FeedIdeaActionJson feedIdeaActionJson = (FeedIdeaActionJson) obj;
                if (!C7384Etj.areEqual(this.idea_id, feedIdeaActionJson.idea_id) || !C7384Etj.areEqual(this.state, feedIdeaActionJson.state)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedIdeaActionJson copy$default(FeedIdeaActionJson feedIdeaActionJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedIdeaActionJson.idea_id;
        }
        if ((i & 2) != 0) {
            str2 = feedIdeaActionJson.state;
        }
        AnonymousClass003.A0u(str, str2);
        return new FeedIdeaActionJson(str, str2);
    }

    public final String component1() {
        return this.idea_id;
    }

    public final String component2() {
        return this.state;
    }

    public final String getIdea_id() {
        return this.idea_id;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.state, AnonymousClass001.A0G(this.idea_id));
    }

    public final FeedIdeaAction toDomain() {
        String strA0l = AnonymousClass002.A0l(this.idea_id);
        if (strA0l.length() > 0) {
            return new FeedIdeaAction(strA0l, FeedApiJsonKt.toIdeaActionState(this.state));
        }
        return null;
    }

    public FeedIdeaActionJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.idea_id = str;
        this.state = str2;
    }

    public final FeedIdeaActionJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new FeedIdeaActionJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedIdeaActionJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public /* synthetic */ FeedIdeaActionJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.idea_id = "";
        } else {
            this.idea_id = str;
        }
        if ((i & 2) == 0) {
            this.state = "";
        } else {
            this.state = str2;
        }
    }

    public FeedIdeaActionJson() {
        this("", "");
    }
}
