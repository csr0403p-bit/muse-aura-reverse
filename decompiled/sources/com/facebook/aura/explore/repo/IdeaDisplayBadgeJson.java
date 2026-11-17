package com.facebook.aura.explore.repo;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class IdeaDisplayBadgeJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String text;

    public final class Companion {
        public final C9hr<IdeaDisplayBadgeJson> serializer() {
            return IdeaDisplayBadgeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(IdeaDisplayBadgeJson ideaDisplayBadgeJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(ideaDisplayBadgeJson.text)) {
            c9j5.AAV(ideaDisplayBadgeJson.text, c9iZ, 0);
        }
    }

    public final IdeaDisplayBadgeJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new IdeaDisplayBadgeJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof IdeaDisplayBadgeJson) && C7384Etj.areEqual(this.text, ((IdeaDisplayBadgeJson) obj).text));
    }

    public static /* synthetic */ IdeaDisplayBadgeJson copy$default(IdeaDisplayBadgeJson ideaDisplayBadgeJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaDisplayBadgeJson.text;
        }
        C7384Etj.A0Y(str, 0);
        return new IdeaDisplayBadgeJson(str);
    }

    public final String component1() {
        return this.text;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode();
    }

    public /* synthetic */ IdeaDisplayBadgeJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.text = "";
        } else {
            this.text = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public IdeaDisplayBadgeJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.text = str;
    }

    public /* synthetic */ IdeaDisplayBadgeJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public IdeaDisplayBadgeJson() {
        this("");
    }
}
