package com.facebook.aura.explore.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class IdeaCardContentJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String buildSummary;
    public final String detailDescription;
    public final String fitReason;
    public final String summary;
    public final String title;

    public final class Companion {
        public final C9hr<IdeaCardContentJson> serializer() {
            return IdeaCardContentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(IdeaCardContentJson ideaCardContentJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(ideaCardContentJson.title)) {
            c9j5.AAV(ideaCardContentJson.title, c9iZ, 0);
        }
        if (zAfR || !"".equals(ideaCardContentJson.summary)) {
            c9j5.AAV(ideaCardContentJson.summary, c9iZ, 1);
        }
        if (zAfR || ideaCardContentJson.detailDescription != null) {
            c9j5.AAP(ideaCardContentJson.detailDescription, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || ideaCardContentJson.fitReason != null) {
            c9j5.AAP(ideaCardContentJson.fitReason, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || ideaCardContentJson.buildSummary != null) {
            c9j5.AAP(ideaCardContentJson.buildSummary, C07779iq.A01, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaCardContentJson) {
                IdeaCardContentJson ideaCardContentJson = (IdeaCardContentJson) obj;
                if (!C7384Etj.areEqual(this.title, ideaCardContentJson.title) || !C7384Etj.areEqual(this.summary, ideaCardContentJson.summary) || !C7384Etj.areEqual(this.detailDescription, ideaCardContentJson.detailDescription) || !C7384Etj.areEqual(this.fitReason, ideaCardContentJson.fitReason) || !C7384Etj.areEqual(this.buildSummary, ideaCardContentJson.buildSummary)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdeaCardContentJson copy$default(IdeaCardContentJson ideaCardContentJson, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaCardContentJson.title;
        }
        if ((i & 2) != 0) {
            str2 = ideaCardContentJson.summary;
        }
        if ((i & 4) != 0) {
            str3 = ideaCardContentJson.detailDescription;
        }
        if ((i & 8) != 0) {
            str4 = ideaCardContentJson.fitReason;
        }
        if ((i & 16) != 0) {
            str5 = ideaCardContentJson.buildSummary;
        }
        return ideaCardContentJson.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.summary;
    }

    public final String component3() {
        return this.detailDescription;
    }

    public final String component4() {
        return this.fitReason;
    }

    public final String component5() {
        return this.buildSummary;
    }

    public final String getBuildSummary() {
        return this.buildSummary;
    }

    public final String getDetailDescription() {
        return this.detailDescription;
    }

    public final String getFitReason() {
        return this.fitReason;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.summary, AnonymousClass001.A0G(this.title)) + AnonymousClass006.A0G(this.detailDescription)) * 31) + AnonymousClass006.A0G(this.fitReason)) * 31) + AnonymousClass005.A0H(this.buildSummary);
    }

    public /* synthetic */ IdeaCardContentJson(int i, String str, String str2, String str3, String str4, String str5, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.summary = "";
        } else {
            this.summary = str2;
        }
        if ((i & 4) == 0) {
            this.detailDescription = null;
        } else {
            this.detailDescription = str3;
        }
        if ((i & 8) == 0) {
            this.fitReason = null;
        } else {
            this.fitReason = str4;
        }
        if ((i & 16) == 0) {
            this.buildSummary = null;
        } else {
            this.buildSummary = str5;
        }
    }

    public final IdeaCardContentJson copy(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass003.A0u(str, str2);
        return new IdeaCardContentJson(str, str2, str3, str4, str5);
    }

    public String toString() {
        return super.toString();
    }

    public IdeaCardContentJson(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass003.A0u(str, str2);
        this.title = str;
        this.summary = str2;
        this.detailDescription = str3;
        this.fitReason = str4;
        this.buildSummary = str5;
    }

    public /* synthetic */ IdeaCardContentJson(String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public IdeaCardContentJson() {
        this("", "", null, null, null);
    }
}
