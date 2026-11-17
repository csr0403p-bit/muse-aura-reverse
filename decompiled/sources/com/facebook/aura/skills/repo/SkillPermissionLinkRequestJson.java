package com.facebook.aura.skills.repo;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class SkillPermissionLinkRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String account_id;

    public final class Companion {
        public final C9hr<SkillPermissionLinkRequestJson> serializer() {
            return SkillPermissionLinkRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final SkillPermissionLinkRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new SkillPermissionLinkRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SkillPermissionLinkRequestJson) && C7384Etj.areEqual(this.account_id, ((SkillPermissionLinkRequestJson) obj).account_id));
    }

    public /* synthetic */ SkillPermissionLinkRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SkillPermissionLinkRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.account_id = str;
    }

    public static /* synthetic */ SkillPermissionLinkRequestJson copy$default(SkillPermissionLinkRequestJson skillPermissionLinkRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skillPermissionLinkRequestJson.account_id;
        }
        C7384Etj.A0Y(str, 0);
        return new SkillPermissionLinkRequestJson(str);
    }

    public final String component1() {
        return this.account_id;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public int hashCode() {
        return this.account_id.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public SkillPermissionLinkRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.account_id = str;
    }
}
