package com.facebook.aura.skills.connect.repository;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SkillConnectInfoResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final SkillConnectActionJson action;

    public final class Companion {
        public final C9hr<SkillConnectInfoResponseJson> serializer() {
            return SkillConnectInfoResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final SkillConnectInfoResponseJson copy(SkillConnectActionJson skillConnectActionJson) {
        C7384Etj.A0Y(skillConnectActionJson, 0);
        return new SkillConnectInfoResponseJson(skillConnectActionJson);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SkillConnectInfoResponseJson) && C7384Etj.areEqual(this.action, ((SkillConnectInfoResponseJson) obj).action));
    }

    public /* synthetic */ SkillConnectInfoResponseJson(int i, SkillConnectActionJson skillConnectActionJson, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SkillConnectInfoResponseJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.action = skillConnectActionJson;
    }

    public static /* synthetic */ SkillConnectInfoResponseJson copy$default(SkillConnectInfoResponseJson skillConnectInfoResponseJson, SkillConnectActionJson skillConnectActionJson, int i, Object obj) {
        if ((i & 1) != 0) {
            skillConnectActionJson = skillConnectInfoResponseJson.action;
        }
        C7384Etj.A0Y(skillConnectActionJson, 0);
        return new SkillConnectInfoResponseJson(skillConnectActionJson);
    }

    public final SkillConnectActionJson component1() {
        return this.action;
    }

    public final SkillConnectActionJson getAction() {
        return this.action;
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public SkillConnectInfoResponseJson(SkillConnectActionJson skillConnectActionJson) {
        C7384Etj.A0Y(skillConnectActionJson, 0);
        this.action = skillConnectActionJson;
    }
}
