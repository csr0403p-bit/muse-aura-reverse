package com.facebook.aura.graduation.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
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
public final class GraduationDownloadResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String download_url;
    public final String filename;
    public final String mime_type;

    public final class Companion {
        public final C9hr<GraduationDownloadResponseJson> serializer() {
            return GraduationDownloadResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_graduation_repo_repo(GraduationDownloadResponseJson graduationDownloadResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(graduationDownloadResponseJson.download_url)) {
            c9j5.AAV(graduationDownloadResponseJson.download_url, c9iZ, 0);
        }
        if (zAfR || !"".equals(graduationDownloadResponseJson.filename)) {
            c9j5.AAV(graduationDownloadResponseJson.filename, c9iZ, 1);
        }
        if (zAfR || !"".equals(graduationDownloadResponseJson.mime_type)) {
            c9j5.AAV(graduationDownloadResponseJson.mime_type, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GraduationDownloadResponseJson) {
                GraduationDownloadResponseJson graduationDownloadResponseJson = (GraduationDownloadResponseJson) obj;
                if (!C7384Etj.areEqual(this.download_url, graduationDownloadResponseJson.download_url) || !C7384Etj.areEqual(this.filename, graduationDownloadResponseJson.filename) || !C7384Etj.areEqual(this.mime_type, graduationDownloadResponseJson.mime_type)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GraduationDownloadResponseJson copy$default(GraduationDownloadResponseJson graduationDownloadResponseJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = graduationDownloadResponseJson.download_url;
        }
        if ((i & 2) != 0) {
            str2 = graduationDownloadResponseJson.filename;
        }
        if ((i & 4) != 0) {
            str3 = graduationDownloadResponseJson.mime_type;
        }
        return graduationDownloadResponseJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.download_url;
    }

    public final String component2() {
        return this.filename;
    }

    public final String component3() {
        return this.mime_type;
    }

    public final String getDownload_url() {
        return this.download_url;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getMime_type() {
        return this.mime_type;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.mime_type, AnonymousClass005.A0I(this.filename, AnonymousClass001.A0G(this.download_url)));
    }

    public GraduationDownloadResponseJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.download_url = str;
        this.filename = str2;
        this.mime_type = str3;
    }

    public final GraduationDownloadResponseJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new GraduationDownloadResponseJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GraduationDownloadResponseJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.download_url = "";
        } else {
            this.download_url = str;
        }
        if ((i & 2) == 0) {
            this.filename = "";
        } else {
            this.filename = str2;
        }
        if ((i & 4) == 0) {
            this.mime_type = "";
        } else {
            this.mime_type = str3;
        }
    }

    public /* synthetic */ GraduationDownloadResponseJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public GraduationDownloadResponseJson() {
        this("", "", "");
    }
}
