package com.facebook.aura.graduation.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class GraduationStartResponseJson extends C06G {
    public final String experience_id;
    public final boolean is_user_graduation_enabled;
    public final Long loop_start_time_ms;
    public final List<GraduationPageJson> pages;
    public final boolean should_show;
    public final GraduationTemplateParametersJson template_parameters;
    public final String video_url;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, GraduationStartResponseJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<GraduationStartResponseJson> serializer() {
            return GraduationStartResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final GraduationStartResponseJson copy(boolean z, boolean z2, String str, String str2, Long l, GraduationTemplateParametersJson graduationTemplateParametersJson, List<GraduationPageJson> list) {
        C7384Etj.A0Y(str, 2);
        AnonymousClass003.A0z(graduationTemplateParametersJson, list);
        return new GraduationStartResponseJson(z, z2, str, str2, l, graduationTemplateParametersJson, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GraduationStartResponseJson) {
                GraduationStartResponseJson graduationStartResponseJson = (GraduationStartResponseJson) obj;
                if (this.should_show != graduationStartResponseJson.should_show || this.is_user_graduation_enabled != graduationStartResponseJson.is_user_graduation_enabled || !C7384Etj.areEqual(this.experience_id, graduationStartResponseJson.experience_id) || !C7384Etj.areEqual(this.video_url, graduationStartResponseJson.video_url) || !C7384Etj.areEqual(this.loop_start_time_ms, graduationStartResponseJson.loop_start_time_ms) || !C7384Etj.areEqual(this.template_parameters, graduationStartResponseJson.template_parameters) || !C7384Etj.areEqual(this.pages, graduationStartResponseJson.pages)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GraduationStartResponseJson copy$default(GraduationStartResponseJson graduationStartResponseJson, boolean z, boolean z2, String str, String str2, Long l, GraduationTemplateParametersJson graduationTemplateParametersJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = graduationStartResponseJson.should_show;
        }
        if ((i & 2) != 0) {
            z2 = graduationStartResponseJson.is_user_graduation_enabled;
        }
        if ((i & 4) != 0) {
            str = graduationStartResponseJson.experience_id;
        }
        if ((i & 8) != 0) {
            str2 = graduationStartResponseJson.video_url;
        }
        if ((i & 16) != 0) {
            l = graduationStartResponseJson.loop_start_time_ms;
        }
        if ((i & 32) != 0) {
            graduationTemplateParametersJson = graduationStartResponseJson.template_parameters;
        }
        if ((i & 64) != 0) {
            list = graduationStartResponseJson.pages;
        }
        return graduationStartResponseJson.copy(z, z2, str, str2, l, graduationTemplateParametersJson, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_graduation_repo_repo(GraduationStartResponseJson graduationStartResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || graduationStartResponseJson.should_show) {
            c9j5.AA7(c9iZ, 0, graduationStartResponseJson.should_show);
        }
        if (zAfR || graduationStartResponseJson.is_user_graduation_enabled) {
            c9j5.AA7(c9iZ, 1, graduationStartResponseJson.is_user_graduation_enabled);
        }
        if (zAfR || !C3cH.A1Q(graduationStartResponseJson.experience_id)) {
            c9j5.AAV(graduationStartResponseJson.experience_id, c9iZ, 2);
        }
        if (zAfR || graduationStartResponseJson.video_url != null) {
            c9j5.AAP(graduationStartResponseJson.video_url, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || graduationStartResponseJson.loop_start_time_ms != null) {
            c9j5.AAP(graduationStartResponseJson.loop_start_time_ms, C9j1.A00, c9iZ, 4);
        }
        if (zAfR || !C7384Etj.areEqual(graduationStartResponseJson.template_parameters, new GraduationTemplateParametersJson("", ""))) {
            c9j5.AAQ(graduationStartResponseJson.template_parameters, GraduationTemplateParametersJson$$serializer.INSTANCE, c9iZ, 5);
        }
        if (zAfR || !C3cG.A1L(graduationStartResponseJson.pages)) {
            c9j5.AAQ(graduationStartResponseJson.pages, C3cH.A15(f0cArr, 6), c9iZ, 6);
        }
    }

    public final boolean component1() {
        return this.should_show;
    }

    public final boolean component2() {
        return this.is_user_graduation_enabled;
    }

    public final String component3() {
        return this.experience_id;
    }

    public final String component4() {
        return this.video_url;
    }

    public final Long component5() {
        return this.loop_start_time_ms;
    }

    public final GraduationTemplateParametersJson component6() {
        return this.template_parameters;
    }

    public final List<GraduationPageJson> component7() {
        return this.pages;
    }

    public final String getExperience_id() {
        return this.experience_id;
    }

    public final Long getLoop_start_time_ms() {
        return this.loop_start_time_ms;
    }

    public final List<GraduationPageJson> getPages() {
        return this.pages;
    }

    public final boolean getShould_show() {
        return this.should_show;
    }

    public final GraduationTemplateParametersJson getTemplate_parameters() {
        return this.template_parameters;
    }

    public final String getVideo_url() {
        return this.video_url;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.pages, AnonymousClass005.A0F(this.template_parameters, (((AnonymousClass005.A0I(this.experience_id, C0KA.A01(C0KA.A02(this.should_show), this.is_user_graduation_enabled)) + AnonymousClass006.A0G(this.video_url)) * 31) + C3cH.A02(this.loop_start_time_ms)) * 31));
    }

    public final boolean is_user_graduation_enabled() {
        return this.is_user_graduation_enabled;
    }

    public /* synthetic */ GraduationStartResponseJson(int i, boolean z, boolean z2, String str, String str2, Long l, GraduationTemplateParametersJson graduationTemplateParametersJson, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.should_show = false;
        } else {
            this.should_show = z;
        }
        if ((i & 2) == 0) {
            this.is_user_graduation_enabled = false;
        } else {
            this.is_user_graduation_enabled = z2;
        }
        if ((i & 4) == 0) {
            this.experience_id = "";
        } else {
            this.experience_id = str;
        }
        if ((i & 8) == 0) {
            this.video_url = null;
        } else {
            this.video_url = str2;
        }
        if ((i & 16) == 0) {
            this.loop_start_time_ms = null;
        } else {
            this.loop_start_time_ms = l;
        }
        if ((i & 32) == 0) {
            this.template_parameters = new GraduationTemplateParametersJson("", "");
        } else {
            this.template_parameters = graduationTemplateParametersJson;
        }
        if ((i & 64) == 0) {
            this.pages = C0881AGi.A00;
        } else {
            this.pages = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GraduationStartResponseJson(boolean z, boolean z2, String str, String str2, Long l, GraduationTemplateParametersJson graduationTemplateParametersJson, List list, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2), (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : l, (i & 32) != 0 ? new GraduationTemplateParametersJson("", "") : graduationTemplateParametersJson, (i & 64) != 0 ? C0881AGi.A00 : list);
    }

    public GraduationStartResponseJson(boolean z, boolean z2, String str, String str2, Long l, GraduationTemplateParametersJson graduationTemplateParametersJson, List<GraduationPageJson> list) {
        C7384Etj.A0Y(str, 2);
        AnonymousClass003.A0z(graduationTemplateParametersJson, list);
        this.should_show = z;
        this.is_user_graduation_enabled = z2;
        this.experience_id = str;
        this.video_url = str2;
        this.loop_start_time_ms = l;
        this.template_parameters = graduationTemplateParametersJson;
        this.pages = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public GraduationStartResponseJson() {
        boolean z = false;
        this(z, z, (String) null, (String) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), (GraduationTemplateParametersJson) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), 127, (C06H) (0 == true ? 1 : 0));
    }
}
