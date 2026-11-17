package com.facebook.aura.graduation.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
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
public final class GraduationPageJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String body;
    public final String header;
    public final long start_time_ms;
    public final String title;

    public final class Companion {
        public final C9hr<GraduationPageJson> serializer() {
            return GraduationPageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ GraduationPageJson copy$default(GraduationPageJson graduationPageJson, String str, String str2, String str3, long j, int i, Object obj) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        long j2 = j;
        if ((i & 1) != 0) {
            str4 = graduationPageJson.title;
        }
        if ((i & 2) != 0) {
            str5 = graduationPageJson.header;
        }
        if ((i & 4) != 0) {
            str6 = graduationPageJson.body;
        }
        if ((i & 8) != 0) {
            j2 = graduationPageJson.start_time_ms;
        }
        AnonymousClass005.A0x(str4, str5, str6);
        return new GraduationPageJson(str4, str5, str6, j2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_graduation_repo_repo(GraduationPageJson graduationPageJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(graduationPageJson.title)) {
            c9j5.AAV(graduationPageJson.title, c9iZ, 0);
        }
        if (zAfR || !"".equals(graduationPageJson.header)) {
            c9j5.AAV(graduationPageJson.header, c9iZ, 1);
        }
        if (zAfR || !"".equals(graduationPageJson.body)) {
            c9j5.AAV(graduationPageJson.body, c9iZ, 2);
        }
        if (zAfR || graduationPageJson.start_time_ms != 0) {
            c9j5.AAN(c9iZ, 3, graduationPageJson.start_time_ms);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GraduationPageJson) {
                GraduationPageJson graduationPageJson = (GraduationPageJson) obj;
                if (!C7384Etj.areEqual(this.title, graduationPageJson.title) || !C7384Etj.areEqual(this.header, graduationPageJson.header) || !C7384Etj.areEqual(this.body, graduationPageJson.body) || this.start_time_ms != graduationPageJson.start_time_ms) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.header;
    }

    public final String component3() {
        return this.body;
    }

    public final long component4() {
        return this.start_time_ms;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getHeader() {
        return this.header;
    }

    public final long getStart_time_ms() {
        return this.start_time_ms;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.start_time_ms, AnonymousClass005.A0I(this.body, AnonymousClass005.A0I(this.header, AnonymousClass001.A0G(this.title))));
    }

    public /* synthetic */ GraduationPageJson(int i, String str, String str2, String str3, long j, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.header = "";
        } else {
            this.header = str2;
        }
        if ((i & 4) == 0) {
            this.body = "";
        } else {
            this.body = str3;
        }
        if ((i & 8) == 0) {
            this.start_time_ms = 0L;
        } else {
            this.start_time_ms = j;
        }
    }

    public final GraduationPageJson copy(String str, String str2, String str3, long j) {
        AnonymousClass005.A0x(str, str2, str3);
        return new GraduationPageJson(str, str2, str3, j);
    }

    public String toString() {
        return super.toString();
    }

    public GraduationPageJson(String str, String str2, String str3, long j) {
        AnonymousClass005.A0x(str, str2, str3);
        this.title = str;
        this.header = str2;
        this.body = str3;
        this.start_time_ms = j;
    }

    public /* synthetic */ GraduationPageJson(String str, String str2, String str3, long j, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0L : j);
    }

    public GraduationPageJson() {
        this("", "", "", 0L);
    }
}
