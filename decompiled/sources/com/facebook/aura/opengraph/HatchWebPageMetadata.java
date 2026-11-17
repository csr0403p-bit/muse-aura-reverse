package com.facebook.aura.opengraph;

import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class HatchWebPageMetadata extends C06G {
    public static final Companion Companion = new Companion();
    public static final HatchWebPageMetadata EMPTY = new HatchWebPageMetadata(null, null, null, null, AHI.A01, null);
    public final String canonicalUrl;
    public final String description;
    public final String faviconUrl;
    public final AHD<String> imageCandidates;
    public final String siteName;
    public final String title;

    public final class Companion {
        public final HatchWebPageMetadata getEMPTY() {
            return HatchWebPageMetadata.EMPTY;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchWebPageMetadata() {
        this(null, null, null, null, AHI.A01, null);
    }

    public final HatchWebPageMetadata copy(String str, String str2, String str3, String str4, AHD<String> ahd, String str5) {
        C7384Etj.A0Y(ahd, 4);
        return new HatchWebPageMetadata(str, str2, str3, str4, ahd, str5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchWebPageMetadata) {
                HatchWebPageMetadata hatchWebPageMetadata = (HatchWebPageMetadata) obj;
                if (!C7384Etj.areEqual(this.title, hatchWebPageMetadata.title) || !C7384Etj.areEqual(this.description, hatchWebPageMetadata.description) || !C7384Etj.areEqual(this.siteName, hatchWebPageMetadata.siteName) || !C7384Etj.areEqual(this.canonicalUrl, hatchWebPageMetadata.canonicalUrl) || !C7384Etj.areEqual(this.imageCandidates, hatchWebPageMetadata.imageCandidates) || !C7384Etj.areEqual(this.faviconUrl, hatchWebPageMetadata.faviconUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchWebPageMetadata copy$default(HatchWebPageMetadata hatchWebPageMetadata, String str, String str2, String str3, String str4, AHD ahd, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchWebPageMetadata.title;
        }
        if ((i & 2) != 0) {
            str2 = hatchWebPageMetadata.description;
        }
        if ((i & 4) != 0) {
            str3 = hatchWebPageMetadata.siteName;
        }
        if ((i & 8) != 0) {
            str4 = hatchWebPageMetadata.canonicalUrl;
        }
        if ((i & 16) != 0) {
            ahd = hatchWebPageMetadata.imageCandidates;
        }
        if ((i & 32) != 0) {
            str5 = hatchWebPageMetadata.faviconUrl;
        }
        return hatchWebPageMetadata.copy(str, str2, str3, str4, ahd, str5);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.siteName;
    }

    public final String component4() {
        return this.canonicalUrl;
    }

    public final AHD<String> component5() {
        return this.imageCandidates;
    }

    public final String component6() {
        return this.faviconUrl;
    }

    public final String getCanonicalUrl() {
        return this.canonicalUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFaviconUrl() {
        return this.faviconUrl;
    }

    public final AHD<String> getImageCandidates() {
        return this.imageCandidates;
    }

    public final String getSiteName() {
        return this.siteName;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.imageCandidates, ((((((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0G(this.description)) * 31) + AnonymousClass006.A0G(this.siteName)) * 31) + AnonymousClass006.A0G(this.canonicalUrl)) * 31) + AnonymousClass005.A0H(this.faviconUrl);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchWebPageMetadata(String str, String str2, String str3, String str4, AHD ahd, String str5, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? AHI.A01 : ahd, (i & 32) != 0 ? null : str5);
    }

    public HatchWebPageMetadata(String str, String str2, String str3, String str4, AHD<String> ahd, String str5) {
        C7384Etj.A0Y(ahd, 4);
        this.title = str;
        this.description = str2;
        this.siteName = str3;
        this.canonicalUrl = str4;
        this.imageCandidates = ahd;
        this.faviconUrl = str5;
    }
}
