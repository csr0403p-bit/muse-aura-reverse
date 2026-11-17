package com.facebook.aura.explore.repo;

import X.AnonymousClass001;
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
/* loaded from: classes4.dex */
public final class IdeaLabelJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String role;
    public final String text;

    public final class Companion {
        public final C9hr<IdeaLabelJson> serializer() {
            return IdeaLabelJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(IdeaLabelJson ideaLabelJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(ideaLabelJson.text)) {
            c9j5.AAV(ideaLabelJson.text, c9iZ, 0);
        }
        if (zAfR || !"".equals(ideaLabelJson.role)) {
            c9j5.AAV(ideaLabelJson.role, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaLabelJson) {
                IdeaLabelJson ideaLabelJson = (IdeaLabelJson) obj;
                if (!C7384Etj.areEqual(this.text, ideaLabelJson.text) || !C7384Etj.areEqual(this.role, ideaLabelJson.role)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdeaLabelJson copy$default(IdeaLabelJson ideaLabelJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaLabelJson.text;
        }
        if ((i & 2) != 0) {
            str2 = ideaLabelJson.role;
        }
        AnonymousClass003.A0u(str, str2);
        return new IdeaLabelJson(str, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.role;
    }

    public final String getRole() {
        return this.role;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.role, AnonymousClass001.A0G(this.text));
    }

    public IdeaLabelJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.text = str;
        this.role = str2;
    }

    public final IdeaLabelJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new IdeaLabelJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeaLabelJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.text = "";
        } else {
            this.text = str;
        }
        if ((i & 2) == 0) {
            this.role = "";
        } else {
            this.role = str2;
        }
    }

    public /* synthetic */ IdeaLabelJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public IdeaLabelJson() {
        this("", "");
    }
}
