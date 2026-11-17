package com.facebook.aura.skills.repo;

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
public final class SkillPermissionLinkResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String link_url;

    public final class Companion {
        public final C9hr<SkillPermissionLinkResponseJson> serializer() {
            return SkillPermissionLinkResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(SkillPermissionLinkResponseJson skillPermissionLinkResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !"".equals(skillPermissionLinkResponseJson.link_url)) {
            c9j5.AAV(skillPermissionLinkResponseJson.link_url, c9iZ, 0);
        }
    }

    public final SkillPermissionLinkResponseJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new SkillPermissionLinkResponseJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SkillPermissionLinkResponseJson) && C7384Etj.areEqual(this.link_url, ((SkillPermissionLinkResponseJson) obj).link_url));
    }

    public /* synthetic */ SkillPermissionLinkResponseJson(String str, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ SkillPermissionLinkResponseJson copy$default(SkillPermissionLinkResponseJson skillPermissionLinkResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skillPermissionLinkResponseJson.link_url;
        }
        C7384Etj.A0Y(str, 0);
        return new SkillPermissionLinkResponseJson(str);
    }

    public final String component1() {
        return this.link_url;
    }

    public final String getLink_url() {
        return this.link_url;
    }

    public int hashCode() {
        return this.link_url.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public SkillPermissionLinkResponseJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.link_url = str;
    }

    public /* synthetic */ SkillPermissionLinkResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.link_url = "";
        } else {
            this.link_url = str;
        }
    }

    public SkillPermissionLinkResponseJson() {
        this("");
    }
}
