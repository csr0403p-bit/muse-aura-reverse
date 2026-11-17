package com.facebook.aura.graduation.repo;

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
/* loaded from: classes3.dex */
public final class GraduationTemplateParametersJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String display_name;
    public final String joined_date;

    public final class Companion {
        public final C9hr<GraduationTemplateParametersJson> serializer() {
            return GraduationTemplateParametersJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_graduation_repo_repo(GraduationTemplateParametersJson graduationTemplateParametersJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(graduationTemplateParametersJson.display_name)) {
            c9j5.AAV(graduationTemplateParametersJson.display_name, c9iZ, 0);
        }
        if (zAfR || !"".equals(graduationTemplateParametersJson.joined_date)) {
            c9j5.AAV(graduationTemplateParametersJson.joined_date, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GraduationTemplateParametersJson) {
                GraduationTemplateParametersJson graduationTemplateParametersJson = (GraduationTemplateParametersJson) obj;
                if (!C7384Etj.areEqual(this.display_name, graduationTemplateParametersJson.display_name) || !C7384Etj.areEqual(this.joined_date, graduationTemplateParametersJson.joined_date)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GraduationTemplateParametersJson copy$default(GraduationTemplateParametersJson graduationTemplateParametersJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = graduationTemplateParametersJson.display_name;
        }
        if ((i & 2) != 0) {
            str2 = graduationTemplateParametersJson.joined_date;
        }
        AnonymousClass003.A0u(str, str2);
        return new GraduationTemplateParametersJson(str, str2);
    }

    public final String component1() {
        return this.display_name;
    }

    public final String component2() {
        return this.joined_date;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getJoined_date() {
        return this.joined_date;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.joined_date, AnonymousClass001.A0G(this.display_name));
    }

    public GraduationTemplateParametersJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.display_name = str;
        this.joined_date = str2;
    }

    public final GraduationTemplateParametersJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new GraduationTemplateParametersJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GraduationTemplateParametersJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.display_name = "";
        } else {
            this.display_name = str;
        }
        if ((i & 2) == 0) {
            this.joined_date = "";
        } else {
            this.joined_date = str2;
        }
    }

    public /* synthetic */ GraduationTemplateParametersJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public GraduationTemplateParametersJson() {
        this("", "");
    }
}
