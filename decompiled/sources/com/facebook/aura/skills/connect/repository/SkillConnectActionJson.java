package com.facebook.aura.skills.connect.repository;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SkillConnectActionJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String type;
    public final String url;

    public final class Companion {
        public final C9hr<SkillConnectActionJson> serializer() {
            return SkillConnectActionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SkillConnectActionJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.type = str;
        this.url = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_connect_repository_repository(SkillConnectActionJson skillConnectActionJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(skillConnectActionJson.type, c9iZ, 0);
        if (c9j5.AfR() || skillConnectActionJson.url != null) {
            c9j5.AAP(skillConnectActionJson.url, C07779iq.A01, c9iZ, 1);
        }
    }

    public final SkillConnectActionJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new SkillConnectActionJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SkillConnectActionJson) {
                SkillConnectActionJson skillConnectActionJson = (SkillConnectActionJson) obj;
                if (!C7384Etj.areEqual(this.type, skillConnectActionJson.type) || !C7384Etj.areEqual(this.url, skillConnectActionJson.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SkillConnectActionJson copy$default(SkillConnectActionJson skillConnectActionJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skillConnectActionJson.type;
        }
        if ((i & 2) != 0) {
            str2 = skillConnectActionJson.url;
        }
        C7384Etj.A0Y(str, 0);
        return new SkillConnectActionJson(str, str2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.url;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.type) + AnonymousClass006.A0G(this.url);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SkillConnectActionJson(int i, String str, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SkillConnectActionJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.type = str;
        this.url = (i & 2) == 0 ? null : str2;
    }

    public /* synthetic */ SkillConnectActionJson(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
