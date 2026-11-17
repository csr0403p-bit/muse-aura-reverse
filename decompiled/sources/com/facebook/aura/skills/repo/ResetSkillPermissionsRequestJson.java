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
public final class ResetSkillPermissionsRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String reason;

    public final class Companion {
        public final C9hr<ResetSkillPermissionsRequestJson> serializer() {
            return ResetSkillPermissionsRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(ResetSkillPermissionsRequestJson resetSkillPermissionsRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !"settings_permissions_connector_reset".equals(resetSkillPermissionsRequestJson.reason)) {
            c9j5.AAV(resetSkillPermissionsRequestJson.reason, c9iZ, 0);
        }
    }

    public final ResetSkillPermissionsRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new ResetSkillPermissionsRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ResetSkillPermissionsRequestJson) && C7384Etj.areEqual(this.reason, ((ResetSkillPermissionsRequestJson) obj).reason));
    }

    public /* synthetic */ ResetSkillPermissionsRequestJson(String str, int i, C06H c06h) {
        this((i & 1) != 0 ? "settings_permissions_connector_reset" : str);
    }

    public static /* synthetic */ ResetSkillPermissionsRequestJson copy$default(ResetSkillPermissionsRequestJson resetSkillPermissionsRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resetSkillPermissionsRequestJson.reason;
        }
        C7384Etj.A0Y(str, 0);
        return new ResetSkillPermissionsRequestJson(str);
    }

    public final String component1() {
        return this.reason;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return this.reason.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ResetSkillPermissionsRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.reason = str;
    }

    public /* synthetic */ ResetSkillPermissionsRequestJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.reason = "settings_permissions_connector_reset";
        } else {
            this.reason = str;
        }
    }

    public ResetSkillPermissionsRequestJson() {
        this("settings_permissions_connector_reset");
    }
}
