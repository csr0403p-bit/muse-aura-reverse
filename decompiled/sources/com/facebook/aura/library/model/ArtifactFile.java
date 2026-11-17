package com.facebook.aura.library.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.library.repo.ArtifactPlacement;
import com.facebook.aura.library.repo.ArtifactPlacementRequest;
import com.facebook.aura.library.repo.ArtifactSource;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ArtifactFile extends C06G {
    public static final int $stable = 0;
    public final String artifactRef;
    public final boolean canDownloadHtml;
    public final boolean canPin;
    public final boolean canShare;
    public final String displayPath;
    public final String format;
    public final Boolean hasServerActions;
    public final String iconUrl;
    public final String id;
    public final String imageUri;
    public final boolean isOwnedSpace;
    public final boolean isPinned;
    public final String modifiedAt;
    public final String name;
    public final ArtifactPlacement placement;
    public final String publisherName;
    public final Long size;
    public final long sortTimestampMs;
    public final ArtifactSource source;
    public final String spaceIcon;
    public final String spaceId;
    public final String spaceSlug;
    public final String thumbnailUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactFile) {
                ArtifactFile artifactFile = (ArtifactFile) obj;
                if (!C7384Etj.areEqual(this.id, artifactFile.id) || !C7384Etj.areEqual(this.name, artifactFile.name) || !C7384Etj.areEqual(this.displayPath, artifactFile.displayPath) || !C7384Etj.areEqual(this.size, artifactFile.size) || !C7384Etj.areEqual(this.modifiedAt, artifactFile.modifiedAt) || !C7384Etj.areEqual(this.imageUri, artifactFile.imageUri) || !C7384Etj.areEqual(this.spaceSlug, artifactFile.spaceSlug) || !C7384Etj.areEqual(this.spaceIcon, artifactFile.spaceIcon) || !C7384Etj.areEqual(this.iconUrl, artifactFile.iconUrl) || this.isOwnedSpace != artifactFile.isOwnedSpace || !C7384Etj.areEqual(this.hasServerActions, artifactFile.hasServerActions) || this.sortTimestampMs != artifactFile.sortTimestampMs || this.isPinned != artifactFile.isPinned || this.canShare != artifactFile.canShare || this.canDownloadHtml != artifactFile.canDownloadHtml || this.source != artifactFile.source || !C7384Etj.areEqual(this.artifactRef, artifactFile.artifactRef) || !C7384Etj.areEqual(this.spaceId, artifactFile.spaceId) || this.placement != artifactFile.placement || !C7384Etj.areEqual(this.format, artifactFile.format) || !C7384Etj.areEqual(this.thumbnailUrl, artifactFile.thumbnailUrl) || !C7384Etj.areEqual(this.publisherName, artifactFile.publisherName) || this.canPin != artifactFile.canPin) {
                }
            }
            return false;
        }
        return true;
    }

    public final ArtifactPlacementRequest placementRequest(ArtifactPlacement artifactPlacement) {
        ArtifactPlacement artifactPlacement2;
        C7384Etj.A0Y(artifactPlacement, 0);
        String str = this.spaceId;
        if (str == null || !ArtifactFileKt.isValidUuid(str) || (artifactPlacement2 = this.placement) == null || artifactPlacement2 == artifactPlacement || !C7384Etj.areEqual(this.artifactRef, this.source.placementArtifactRef(this.displayPath))) {
            return null;
        }
        return new ArtifactPlacementRequest(this.artifactRef, str, artifactPlacement);
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.isOwnedSpace;
    }

    public final Boolean component11() {
        return this.hasServerActions;
    }

    public final long component12() {
        return this.sortTimestampMs;
    }

    public final boolean component13() {
        return this.isPinned;
    }

    public final boolean component14() {
        return this.canShare;
    }

    public final boolean component15() {
        return this.canDownloadHtml;
    }

    public final ArtifactSource component16() {
        return this.source;
    }

    public final String component17() {
        return this.artifactRef;
    }

    public final String component18() {
        return this.spaceId;
    }

    public final ArtifactPlacement component19() {
        return this.placement;
    }

    public final String component2() {
        return this.name;
    }

    public final String component20() {
        return this.format;
    }

    public final String component21() {
        return this.thumbnailUrl;
    }

    public final String component22() {
        return this.publisherName;
    }

    public final boolean component23() {
        return this.canPin;
    }

    public final String component3() {
        return this.displayPath;
    }

    public final Long component4() {
        return this.size;
    }

    public final String component5() {
        return this.modifiedAt;
    }

    public final String component6() {
        return this.imageUri;
    }

    public final String component7() {
        return this.spaceSlug;
    }

    public final String component8() {
        return this.spaceIcon;
    }

    public final String component9() {
        return this.iconUrl;
    }

    public final String getArtifactRef() {
        return this.artifactRef;
    }

    public final boolean getCanDownloadHtml() {
        return this.canDownloadHtml;
    }

    public final boolean getCanPin() {
        return this.canPin;
    }

    public final boolean getCanShare() {
        return this.canShare;
    }

    public final String getDisplayPath() {
        return this.displayPath;
    }

    public final String getFileExtension() {
        String str = this.format;
        return str == null ? HatchFileUIUtils.INSTANCE.fileExtensionForPath(this.displayPath) : str;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Boolean getHasServerActions() {
        return this.hasServerActions;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUri() {
        return this.imageUri;
    }

    public final String getModifiedAt() {
        return this.modifiedAt;
    }

    public final String getName() {
        return this.name;
    }

    public final ArtifactPlacement getPlacement() {
        return this.placement;
    }

    public final String getPublisherName() {
        return this.publisherName;
    }

    public final Long getSize() {
        return this.size;
    }

    public final long getSortTimestampMs() {
        return this.sortTimestampMs;
    }

    public final ArtifactSource getSource() {
        return this.source;
    }

    public final String getSpaceIcon() {
        return this.spaceIcon;
    }

    public final String getSpaceId() {
        return this.spaceId;
    }

    public final String getSpaceSlug() {
        return this.spaceSlug;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public int hashCode() {
        return C0KA.A00((((((((((AnonymousClass005.A0I(this.artifactRef, AnonymousClass005.A0F(this.source, C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass006.A06(this.sortTimestampMs, (C0KA.A01((((((((((((AnonymousClass005.A0I(this.displayPath, AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.id))) + AnonymousClass006.A0D(this.size)) * 31) + AnonymousClass006.A0G(this.modifiedAt)) * 31) + AnonymousClass006.A0G(this.imageUri)) * 31) + AnonymousClass006.A0G(this.spaceSlug)) * 31) + AnonymousClass006.A0G(this.spaceIcon)) * 31) + AnonymousClass006.A0G(this.iconUrl)) * 31, this.isOwnedSpace) + AnonymousClass006.A0D(this.hasServerActions)) * 31), this.isPinned), this.canShare), this.canDownloadHtml))) + AnonymousClass006.A0G(this.spaceId)) * 31) + AnonymousClass006.A0D(this.placement)) * 31) + AnonymousClass006.A0G(this.format)) * 31) + AnonymousClass006.A0G(this.thumbnailUrl)) * 31) + AnonymousClass005.A0H(this.publisherName)) * 31, this.canPin);
    }

    public final boolean isOwnedSpace() {
        return this.isOwnedSpace;
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public final RecentFile toRecentFile() {
        String str = this.id;
        String str2 = this.name;
        String upperCase = getFileExtension().toUpperCase(Locale.ROOT);
        if (upperCase.length() == 0) {
            upperCase = "HTML";
        }
        HatchFileUIUtils hatchFileUIUtils = HatchFileUIUtils.INSTANCE;
        String fileSize = hatchFileUIUtils.formatFileSize(this.size);
        String str3 = this.displayPath;
        String fileExtension = getFileExtension();
        if (fileExtension.length() == 0) {
            fileExtension = "html";
        }
        return new RecentFile(str, str2, upperCase, fileSize, str3, fileExtension, hatchFileUIUtils.parseModifiedAt(this.modifiedAt), this.thumbnailUrl, this.size, this.imageUri, C0881AGi.A00);
    }

    public ArtifactFile(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, String str8, boolean z, Boolean bool, long j, boolean z2, boolean z3, boolean z4, ArtifactSource artifactSource, String str9, String str10, ArtifactPlacement artifactPlacement, String str11, String str12, String str13, boolean z5) {
        AnonymousClass005.A0x(str, str2, str3);
        AnonymousClass003.A12(artifactSource, str9);
        this.id = str;
        this.name = str2;
        this.displayPath = str3;
        this.size = l;
        this.modifiedAt = str4;
        this.imageUri = str5;
        this.spaceSlug = str6;
        this.spaceIcon = str7;
        this.iconUrl = str8;
        this.isOwnedSpace = z;
        this.hasServerActions = bool;
        this.sortTimestampMs = j;
        this.isPinned = z2;
        this.canShare = z3;
        this.canDownloadHtml = z4;
        this.source = artifactSource;
        this.artifactRef = str9;
        this.spaceId = str10;
        this.placement = artifactPlacement;
        this.format = str11;
        this.thumbnailUrl = str12;
        this.publisherName = str13;
        this.canPin = z5;
    }

    public final ArtifactFile copy(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, String str8, boolean z, Boolean bool, long j, boolean z2, boolean z3, boolean z4, ArtifactSource artifactSource, String str9, String str10, ArtifactPlacement artifactPlacement, String str11, String str12, String str13, boolean z5) {
        AnonymousClass005.A0x(str, str2, str3);
        AnonymousClass003.A12(artifactSource, str9);
        return new ArtifactFile(str, str2, str3, l, str4, str5, str6, str7, str8, z, bool, j, z2, z3, z4, artifactSource, str9, str10, artifactPlacement, str11, str12, str13, z5);
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ ArtifactFile copy$default(ArtifactFile artifactFile, String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, String str8, boolean z, Boolean bool, long j, boolean z2, boolean z3, boolean z4, ArtifactSource artifactSource, String str9, String str10, ArtifactPlacement artifactPlacement, String str11, String str12, String str13, boolean z5, int i, Object obj) {
        String str14 = str2;
        String str15 = str3;
        String str16 = str;
        Long l2 = l;
        String str17 = str4;
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        boolean z6 = z;
        Boolean bool2 = bool;
        long j2 = j;
        boolean z7 = z2;
        boolean z8 = z3;
        boolean z9 = z4;
        ArtifactPlacement artifactPlacement2 = artifactPlacement;
        String str22 = str11;
        String str23 = str12;
        String str24 = str13;
        ArtifactSource artifactSource2 = artifactSource;
        String str25 = str9;
        String str26 = str10;
        boolean z10 = z5;
        if ((i & 1) != 0) {
            str16 = artifactFile.id;
        }
        if ((i & 2) != 0) {
            str14 = artifactFile.name;
        }
        if ((i & 4) != 0) {
            str15 = artifactFile.displayPath;
        }
        if ((i & 8) != 0) {
            l2 = artifactFile.size;
        }
        if ((i & 16) != 0) {
            str17 = artifactFile.modifiedAt;
        }
        if ((i & 32) != 0) {
            str18 = artifactFile.imageUri;
        }
        if ((i & 64) != 0) {
            str19 = artifactFile.spaceSlug;
        }
        if ((i & 128) != 0) {
            str20 = artifactFile.spaceIcon;
        }
        if ((i & 256) != 0) {
            str21 = artifactFile.iconUrl;
        }
        if ((i & 512) != 0) {
            z6 = artifactFile.isOwnedSpace;
        }
        if ((i & 1024) != 0) {
            bool2 = artifactFile.hasServerActions;
        }
        if ((i & 2048) != 0) {
            j2 = artifactFile.sortTimestampMs;
        }
        if ((i & 4096) != 0) {
            z7 = artifactFile.isPinned;
        }
        if ((i & 8192) != 0) {
            z8 = artifactFile.canShare;
        }
        if ((i & 16384) != 0) {
            z9 = artifactFile.canDownloadHtml;
        }
        if ((i & 32768) != 0) {
            artifactSource2 = artifactFile.source;
        }
        if ((i & 65536) != 0) {
            str25 = artifactFile.artifactRef;
        }
        if ((i & 131072) != 0) {
            str26 = artifactFile.spaceId;
        }
        if ((i & 262144) != 0) {
            artifactPlacement2 = artifactFile.placement;
        }
        if ((i & 524288) != 0) {
            str22 = artifactFile.format;
        }
        if ((i & 1048576) != 0) {
            str23 = artifactFile.thumbnailUrl;
        }
        if ((i & 2097152) != 0) {
            str24 = artifactFile.publisherName;
        }
        if ((i & 4194304) != 0) {
            z10 = artifactFile.canPin;
        }
        return artifactFile.copy(str16, str14, str15, l2, str17, str18, str19, str20, str21, z6, bool2, j2, z7, z8, z9, artifactSource2, str25, str26, artifactPlacement2, str22, str23, str24, z10);
    }

    public /* synthetic */ ArtifactFile(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, String str8, boolean z, Boolean bool, long j, boolean z2, boolean z3, boolean z4, ArtifactSource artifactSource, String str9, String str10, ArtifactPlacement artifactPlacement, String str11, String str12, String str13, boolean z5, int i, C06H c06h) {
        this(str, str2, str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? 0L : j, (i & 4096) != 0 ? false : z2, (i & 8192) != 0 ? false : z3, (i & 16384) != 0 ? false : z4, (32768 & i) != 0 ? ArtifactSource.LIBRARY : artifactSource, (65536 & i) != 0 ? str : str9, (131072 & i) != 0 ? null : str10, (262144 & i) != 0 ? null : artifactPlacement, (524288 & i) != 0 ? null : str11, (1048576 & i) != 0 ? null : str12, (2097152 & i) != 0 ? null : str13, (i & 4194304) != 0 ? true : z5);
    }
}
