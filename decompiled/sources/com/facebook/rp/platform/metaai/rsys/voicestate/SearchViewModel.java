package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class SearchViewModel extends C06G {

    @SerializedName("attribution_link")
    public final String attributionLink;

    @SerializedName("facepile_favicons")
    public final MediaItem[] facepileFavicons;

    @SerializedName("thumbnail_cdn_url")
    public final String[] faviconUri;

    @SerializedName("references_title")
    public final String[] referencesTitle;

    @SerializedName("search_engine")
    public final String searchEngine;

    @SerializedName("search_engine_icon_url")
    public final String searchEngineIconUrl;

    @SerializedName("search_query")
    public final String searchQuery;

    @SerializedName("search_result_uri")
    public final String[] searchResultUri;

    @SerializedName("source_url")
    public final String sourceUrl;

    @SerializedName("sources")
    public final SourceItem[] sources;

    public SearchViewModel(String[] strArr, String str, String str2, String str3, String[] strArr2, String str4, String str5, String[] strArr3, SourceItem[] sourceItemArr, MediaItem[] mediaItemArr) {
        AnonymousClass002.A1C(strArr, 0, strArr2);
        C7384Etj.A0Y(strArr3, 7);
        this.searchResultUri = strArr;
        this.searchEngine = str;
        this.searchQuery = str2;
        this.attributionLink = str3;
        this.referencesTitle = strArr2;
        this.searchEngineIconUrl = str4;
        this.sourceUrl = str5;
        this.faviconUri = strArr3;
        this.sources = sourceItemArr;
        this.facepileFavicons = mediaItemArr;
    }

    public final SearchViewModel copy(String[] strArr, String str, String str2, String str3, String[] strArr2, String str4, String str5, String[] strArr3, SourceItem[] sourceItemArr, MediaItem[] mediaItemArr) {
        AnonymousClass002.A1C(strArr, 0, strArr2);
        C7384Etj.A0Y(strArr3, 7);
        return new SearchViewModel(strArr, str, str2, str3, strArr2, str4, str5, strArr3, sourceItemArr, mediaItemArr);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SearchViewModel) {
                SearchViewModel searchViewModel = (SearchViewModel) obj;
                if (!C7384Etj.areEqual(this.searchResultUri, searchViewModel.searchResultUri) || !C7384Etj.areEqual(this.searchEngine, searchViewModel.searchEngine) || !C7384Etj.areEqual(this.searchQuery, searchViewModel.searchQuery) || !C7384Etj.areEqual(this.attributionLink, searchViewModel.attributionLink) || !C7384Etj.areEqual(this.referencesTitle, searchViewModel.referencesTitle) || !C7384Etj.areEqual(this.searchEngineIconUrl, searchViewModel.searchEngineIconUrl) || !C7384Etj.areEqual(this.sourceUrl, searchViewModel.sourceUrl) || !C7384Etj.areEqual(this.faviconUri, searchViewModel.faviconUri) || !C7384Etj.areEqual(this.sources, searchViewModel.sources) || !C7384Etj.areEqual(this.facepileFavicons, searchViewModel.facepileFavicons)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SearchViewModel copy$default(SearchViewModel searchViewModel, String[] strArr, String str, String str2, String str3, String[] strArr2, String str4, String str5, String[] strArr3, SourceItem[] sourceItemArr, MediaItem[] mediaItemArr, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = searchViewModel.searchResultUri;
        }
        if ((i & 2) != 0) {
            str = searchViewModel.searchEngine;
        }
        if ((i & 4) != 0) {
            str2 = searchViewModel.searchQuery;
        }
        if ((i & 8) != 0) {
            str3 = searchViewModel.attributionLink;
        }
        if ((i & 16) != 0) {
            strArr2 = searchViewModel.referencesTitle;
        }
        if ((i & 32) != 0) {
            str4 = searchViewModel.searchEngineIconUrl;
        }
        if ((i & 64) != 0) {
            str5 = searchViewModel.sourceUrl;
        }
        if ((i & 128) != 0) {
            strArr3 = searchViewModel.faviconUri;
        }
        if ((i & 256) != 0) {
            sourceItemArr = searchViewModel.sources;
        }
        if ((i & 512) != 0) {
            mediaItemArr = searchViewModel.facepileFavicons;
        }
        return searchViewModel.copy(strArr, str, str2, str3, strArr2, str4, str5, strArr3, sourceItemArr, mediaItemArr);
    }

    public final String[] component1() {
        return this.searchResultUri;
    }

    public final MediaItem[] component10() {
        return this.facepileFavicons;
    }

    public final String component2() {
        return this.searchEngine;
    }

    public final String component3() {
        return this.searchQuery;
    }

    public final String component4() {
        return this.attributionLink;
    }

    public final String[] component5() {
        return this.referencesTitle;
    }

    public final String component6() {
        return this.searchEngineIconUrl;
    }

    public final String component7() {
        return this.sourceUrl;
    }

    public final String[] component8() {
        return this.faviconUri;
    }

    public final SourceItem[] component9() {
        return this.sources;
    }

    public final String getAttributionLink() {
        return this.attributionLink;
    }

    public final MediaItem[] getFacepileFavicons() {
        return this.facepileFavicons;
    }

    public final String[] getFaviconUri() {
        return this.faviconUri;
    }

    public final String[] getReferencesTitle() {
        return this.referencesTitle;
    }

    public final String getSearchEngine() {
        return this.searchEngine;
    }

    public final String getSearchEngineIconUrl() {
        return this.searchEngineIconUrl;
    }

    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public final String[] getSearchResultUri() {
        return this.searchResultUri;
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public final SourceItem[] getSources() {
        return this.sources;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((Arrays.hashCode(this.searchResultUri) * 31) + AnonymousClass006.A0G(this.searchEngine)) * 31) + AnonymousClass006.A0G(this.searchQuery)) * 31) + AnonymousClass006.A0G(this.attributionLink)) * 31) + Arrays.hashCode(this.referencesTitle)) * 31) + AnonymousClass006.A0G(this.searchEngineIconUrl)) * 31) + AnonymousClass006.A0G(this.sourceUrl)) * 31) + Arrays.hashCode(this.faviconUri)) * 31;
        SourceItem[] sourceItemArr = this.sources;
        int iHashCode2 = (iHashCode + (sourceItemArr == null ? 0 : Arrays.hashCode(sourceItemArr))) * 31;
        MediaItem[] mediaItemArr = this.facepileFavicons;
        return iHashCode2 + (mediaItemArr != null ? Arrays.hashCode(mediaItemArr) : 0);
    }

    public String toString() {
        String string = Arrays.toString(this.searchResultUri);
        String str = this.searchEngine;
        String str2 = this.searchQuery;
        String str3 = this.attributionLink;
        String string2 = Arrays.toString(this.referencesTitle);
        String str4 = this.searchEngineIconUrl;
        String str5 = this.sourceUrl;
        String string3 = Arrays.toString(this.faviconUri);
        String string4 = Arrays.toString(this.sources);
        String string5 = Arrays.toString(this.facepileFavicons);
        StringBuilder sbA0x = C3cI.A0x("SearchViewModel(searchResultUri=", string);
        sbA0x.append(", searchEngine=");
        sbA0x.append(str);
        sbA0x.append(", searchQuery=");
        sbA0x.append(str2);
        sbA0x.append(", attributionLink=");
        sbA0x.append(str3);
        sbA0x.append(", referencesTitle=");
        sbA0x.append(string2);
        sbA0x.append(", searchEngineIconUrl=");
        sbA0x.append(str4);
        sbA0x.append(", sourceUrl=");
        sbA0x.append(str5);
        sbA0x.append(", faviconUri=");
        sbA0x.append(string3);
        sbA0x.append(", sources=");
        sbA0x.append(string4);
        return C3cJ.A0N(", facepileFavicons=", string5, sbA0x);
    }
}
