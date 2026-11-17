package com.facebook.aura.graduation.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchGraduationDownload extends C06G {
    public final String downloadUrl;
    public final String filename;
    public final String mimeType;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchGraduationDownload) {
                HatchGraduationDownload hatchGraduationDownload = (HatchGraduationDownload) obj;
                if (!C7384Etj.areEqual(this.downloadUrl, hatchGraduationDownload.downloadUrl) || !C7384Etj.areEqual(this.filename, hatchGraduationDownload.filename) || !C7384Etj.areEqual(this.mimeType, hatchGraduationDownload.mimeType)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchGraduationDownload copy$default(HatchGraduationDownload hatchGraduationDownload, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchGraduationDownload.downloadUrl;
        }
        if ((i & 2) != 0) {
            str2 = hatchGraduationDownload.filename;
        }
        if ((i & 4) != 0) {
            str3 = hatchGraduationDownload.mimeType;
        }
        return hatchGraduationDownload.copy(str, str2, str3);
    }

    public final String component1() {
        return this.downloadUrl;
    }

    public final String component2() {
        return this.filename;
    }

    public final String component3() {
        return this.mimeType;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.mimeType, AnonymousClass005.A0I(this.filename, AnonymousClass001.A0G(this.downloadUrl)));
    }

    public HatchGraduationDownload(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.downloadUrl = str;
        this.filename = str2;
        this.mimeType = str3;
    }

    public final HatchGraduationDownload copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new HatchGraduationDownload(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}
