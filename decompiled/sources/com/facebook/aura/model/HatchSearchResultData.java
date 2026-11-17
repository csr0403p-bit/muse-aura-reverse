package com.facebook.aura.model;

import X.AHD;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchSearchResultData extends C06G {
    public static final int $stable = 0;
    public final AHD<HatchSourceReference> references;
    public final String searchEngineIcon;
    public final String searchEngineName;
    public final String searchEngineUrl;
    public final String searchQuery;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSearchResultData) {
                HatchSearchResultData hatchSearchResultData = (HatchSearchResultData) obj;
                if (!C7384Etj.areEqual(this.references, hatchSearchResultData.references) || !C7384Etj.areEqual(this.searchEngineName, hatchSearchResultData.searchEngineName) || !C7384Etj.areEqual(this.searchEngineUrl, hatchSearchResultData.searchEngineUrl) || !C7384Etj.areEqual(this.searchEngineIcon, hatchSearchResultData.searchEngineIcon) || !C7384Etj.areEqual(this.searchQuery, hatchSearchResultData.searchQuery)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchSearchResultData copy$default(HatchSearchResultData hatchSearchResultData, AHD ahd, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = hatchSearchResultData.references;
        }
        if ((i & 2) != 0) {
            str = hatchSearchResultData.searchEngineName;
        }
        if ((i & 4) != 0) {
            str2 = hatchSearchResultData.searchEngineUrl;
        }
        if ((i & 8) != 0) {
            str3 = hatchSearchResultData.searchEngineIcon;
        }
        if ((i & 16) != 0) {
            str4 = hatchSearchResultData.searchQuery;
        }
        return hatchSearchResultData.copy(ahd, str, str2, str3, str4);
    }

    public final AHD<HatchSourceReference> component1() {
        return this.references;
    }

    public final String component2() {
        return this.searchEngineName;
    }

    public final String component3() {
        return this.searchEngineUrl;
    }

    public final String component4() {
        return this.searchEngineIcon;
    }

    public final String component5() {
        return this.searchQuery;
    }

    public final HatchSearchResultData copy(AHD<HatchSourceReference> ahd, String str, String str2, String str3, String str4) {
        return new HatchSearchResultData(ahd, str, str2, str3, str4);
    }

    public final AHD<HatchSourceReference> getReferences() {
        return this.references;
    }

    public final String getSearchEngineIcon() {
        return this.searchEngineIcon;
    }

    public final String getSearchEngineName() {
        return this.searchEngineName;
    }

    public final String getSearchEngineUrl() {
        return this.searchEngineUrl;
    }

    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0D(this.references) * 31) + AnonymousClass006.A0G(this.searchEngineName)) * 31) + AnonymousClass006.A0G(this.searchEngineUrl)) * 31) + AnonymousClass006.A0G(this.searchEngineIcon)) * 31) + AnonymousClass005.A0H(this.searchQuery);
    }

    public HatchSearchResultData(AHD<HatchSourceReference> ahd, String str, String str2, String str3, String str4) {
        this.references = ahd;
        this.searchEngineName = str;
        this.searchEngineUrl = str2;
        this.searchEngineIcon = str3;
        this.searchQuery = str4;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchSearchResultData(AHD ahd, String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(ahd, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
