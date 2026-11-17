package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public final class FeedRankingViewModel extends C06G {

    @SerializedName("ranking_prompt")
    public final String rankingPrompt;

    @SerializedName("search_keywords")
    public final String searchKeywords;

    @SerializedName("should_trigger_feed_refresh")
    public final boolean shouldTriggerFeedRefresh;

    @SerializedName("should_trigger_search")
    public final boolean shouldTriggerSearch;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedRankingViewModel) {
                FeedRankingViewModel feedRankingViewModel = (FeedRankingViewModel) obj;
                if (this.shouldTriggerFeedRefresh != feedRankingViewModel.shouldTriggerFeedRefresh || !C7384Etj.areEqual(this.rankingPrompt, feedRankingViewModel.rankingPrompt) || !C7384Etj.areEqual(this.searchKeywords, feedRankingViewModel.searchKeywords) || this.shouldTriggerSearch != feedRankingViewModel.shouldTriggerSearch) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedRankingViewModel copy$default(FeedRankingViewModel feedRankingViewModel, boolean z, String str, String str2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = feedRankingViewModel.shouldTriggerFeedRefresh;
        }
        if ((i & 2) != 0) {
            str = feedRankingViewModel.rankingPrompt;
        }
        if ((i & 4) != 0) {
            str2 = feedRankingViewModel.searchKeywords;
        }
        if ((i & 8) != 0) {
            z2 = feedRankingViewModel.shouldTriggerSearch;
        }
        AnonymousClass003.A0x(str, str2);
        return new FeedRankingViewModel(z, str, str2, z2);
    }

    public final boolean component1() {
        return this.shouldTriggerFeedRefresh;
    }

    public final String component2() {
        return this.rankingPrompt;
    }

    public final String component3() {
        return this.searchKeywords;
    }

    public final boolean component4() {
        return this.shouldTriggerSearch;
    }

    public final String getRankingPrompt() {
        return this.rankingPrompt;
    }

    public final String getSearchKeywords() {
        return this.searchKeywords;
    }

    public final boolean getShouldTriggerFeedRefresh() {
        return this.shouldTriggerFeedRefresh;
    }

    public final boolean getShouldTriggerSearch() {
        return this.shouldTriggerSearch;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.searchKeywords, AnonymousClass005.A0I(this.rankingPrompt, C0KA.A02(this.shouldTriggerFeedRefresh))), this.shouldTriggerSearch);
    }

    public String toString() {
        boolean z = this.shouldTriggerFeedRefresh;
        String str = this.rankingPrompt;
        String str2 = this.searchKeywords;
        boolean z2 = this.shouldTriggerSearch;
        StringBuilder sb = new StringBuilder("FeedRankingViewModel(shouldTriggerFeedRefresh=");
        sb.append(z);
        sb.append(", rankingPrompt=");
        sb.append(str);
        sb.append(", searchKeywords=");
        sb.append(str2);
        sb.append(", shouldTriggerSearch=");
        sb.append(z2);
        return AnonymousClass001.A0v(")", sb);
    }

    public FeedRankingViewModel(boolean z, String str, String str2, boolean z2) {
        AnonymousClass003.A0x(str, str2);
        this.shouldTriggerFeedRefresh = z;
        this.rankingPrompt = str;
        this.searchKeywords = str2;
        this.shouldTriggerSearch = z2;
    }

    public final FeedRankingViewModel copy(boolean z, String str, String str2, boolean z2) {
        AnonymousClass003.A0x(str, str2);
        return new FeedRankingViewModel(z, str, str2, z2);
    }
}
