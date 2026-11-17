package com.facebook.aura.library.model;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class RecentFile extends C06G {
    public static final int $stable = 8;
    public final String fileExtension;
    public final String fileType;
    public final String id;
    public final String imageUri;
    public final Long lastModified;
    public final String name;
    public final List<String> previewUris;
    public final String relativePath;
    public final String size;
    public final Long sizeBytes;
    public final String thumbnailUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecentFile) {
                RecentFile recentFile = (RecentFile) obj;
                if (!C7384Etj.areEqual(this.id, recentFile.id) || !C7384Etj.areEqual(this.name, recentFile.name) || !C7384Etj.areEqual(this.fileType, recentFile.fileType) || !C7384Etj.areEqual(this.size, recentFile.size) || !C7384Etj.areEqual(this.relativePath, recentFile.relativePath) || !C7384Etj.areEqual(this.fileExtension, recentFile.fileExtension) || !C7384Etj.areEqual(this.lastModified, recentFile.lastModified) || !C7384Etj.areEqual(this.thumbnailUrl, recentFile.thumbnailUrl) || !C7384Etj.areEqual(this.sizeBytes, recentFile.sizeBytes) || !C7384Etj.areEqual(this.imageUri, recentFile.imageUri) || !C7384Etj.areEqual(this.previewUris, recentFile.previewUris)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecentFile copy$default(RecentFile recentFile, String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, Long l2, String str8, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recentFile.id;
        }
        if ((i & 2) != 0) {
            str2 = recentFile.name;
        }
        if ((i & 4) != 0) {
            str3 = recentFile.fileType;
        }
        if ((i & 8) != 0) {
            str4 = recentFile.size;
        }
        if ((i & 16) != 0) {
            str5 = recentFile.relativePath;
        }
        if ((i & 32) != 0) {
            str6 = recentFile.fileExtension;
        }
        if ((i & 64) != 0) {
            l = recentFile.lastModified;
        }
        if ((i & 128) != 0) {
            str7 = recentFile.thumbnailUrl;
        }
        if ((i & 256) != 0) {
            l2 = recentFile.sizeBytes;
        }
        if ((i & 512) != 0) {
            str8 = recentFile.imageUri;
        }
        if ((i & 1024) != 0) {
            list = recentFile.previewUris;
        }
        return recentFile.copy(str, str2, str3, str4, str5, str6, l, str7, l2, str8, list);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.imageUri;
    }

    public final List<String> component11() {
        return this.previewUris;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.fileType;
    }

    public final String component4() {
        return this.size;
    }

    public final String component5() {
        return this.relativePath;
    }

    public final String component6() {
        return this.fileExtension;
    }

    public final Long component7() {
        return this.lastModified;
    }

    public final String component8() {
        return this.thumbnailUrl;
    }

    public final Long component9() {
        return this.sizeBytes;
    }

    public final String getFileExtension() {
        return this.fileExtension;
    }

    public final String getFileType() {
        return this.fileType;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUri() {
        return this.imageUri;
    }

    public final Long getLastModified() {
        return this.lastModified;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getPreviewUris() {
        return this.previewUris;
    }

    public final String getRelativePath() {
        return this.relativePath;
    }

    public final String getSize() {
        return this.size;
    }

    public final Long getSizeBytes() {
        return this.sizeBytes;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.previewUris, (((((((((AnonymousClass005.A0I(this.relativePath, AnonymousClass005.A0I(this.size, AnonymousClass005.A0I(this.fileType, AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.id))))) + AnonymousClass006.A0G(this.fileExtension)) * 31) + AnonymousClass006.A0D(this.lastModified)) * 31) + AnonymousClass006.A0G(this.thumbnailUrl)) * 31) + AnonymousClass006.A0D(this.sizeBytes)) * 31) + AnonymousClass005.A0H(this.imageUri)) * 31);
    }

    public RecentFile(String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, Long l2, String str8, List<String> list) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(list, 10);
        this.id = str;
        this.name = str2;
        this.fileType = str3;
        this.size = str4;
        this.relativePath = str5;
        this.fileExtension = str6;
        this.lastModified = l;
        this.thumbnailUrl = str7;
        this.sizeBytes = l2;
        this.imageUri = str8;
        this.previewUris = list;
    }

    public final RecentFile copy(String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, Long l2, String str8, List<String> list) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(list, 10);
        return new RecentFile(str, str2, str3, str4, str5, str6, l, str7, l2, str8, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RecentFile(String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, Long l2, String str8, List list, int i, C06H c06h) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : l2, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? C0881AGi.A00 : list);
    }
}
