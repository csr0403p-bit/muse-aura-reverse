package com.facebook.aura.explore.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class IdeaItemContentJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String buildSummary;
    public final String summary;
    public final String title;

    public final class Companion {
        public final C9hr<IdeaItemContentJson> serializer() {
            return IdeaItemContentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public IdeaItemContentJson(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.title = str;
        this.summary = str2;
        this.buildSummary = str3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(IdeaItemContentJson ideaItemContentJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(ideaItemContentJson.title)) {
            c9j5.AAV(ideaItemContentJson.title, c9iZ, 0);
        }
        if (zAfR || ideaItemContentJson.summary != null) {
            c9j5.AAP(ideaItemContentJson.summary, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || ideaItemContentJson.buildSummary != null) {
            c9j5.AAP(ideaItemContentJson.buildSummary, C07779iq.A01, c9iZ, 2);
        }
    }

    public final IdeaItemContentJson copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new IdeaItemContentJson(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaItemContentJson) {
                IdeaItemContentJson ideaItemContentJson = (IdeaItemContentJson) obj;
                if (!C7384Etj.areEqual(this.title, ideaItemContentJson.title) || !C7384Etj.areEqual(this.summary, ideaItemContentJson.summary) || !C7384Etj.areEqual(this.buildSummary, ideaItemContentJson.buildSummary)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdeaItemContentJson copy$default(IdeaItemContentJson ideaItemContentJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaItemContentJson.title;
        }
        if ((i & 2) != 0) {
            str2 = ideaItemContentJson.summary;
        }
        if ((i & 4) != 0) {
            str3 = ideaItemContentJson.buildSummary;
        }
        return ideaItemContentJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.summary;
    }

    public final String component3() {
        return this.buildSummary;
    }

    public final String getBuildSummary() {
        return this.buildSummary;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.summary)) * 31) + AnonymousClass005.A0H(this.buildSummary);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeaItemContentJson(int i, String str, String str2, String str3, C2hx c2hx) {
        this.title = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.summary = null;
        } else {
            this.summary = str2;
        }
        if ((i & 4) == 0) {
            this.buildSummary = null;
        } else {
            this.buildSummary = str3;
        }
    }

    public /* synthetic */ IdeaItemContentJson(String str, String str2, String str3, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public IdeaItemContentJson() {
        this("", null, null);
    }
}
