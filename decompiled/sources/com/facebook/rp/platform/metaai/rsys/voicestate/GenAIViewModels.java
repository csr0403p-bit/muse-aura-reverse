package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AnonymousClass006;
import X.C06G;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public final class GenAIViewModels extends C06G {

    @SerializedName("feed_ranking_view_model")
    public final FeedRankingViewModel feedRankingViewModel;

    @SerializedName("imagine_view_model")
    public final ImagineViewModel imagineViewModel;

    @SerializedName("memory_notifications_view_model")
    public final MemoryNotificationsViewModel memoryNotificationsViewModel;

    @SerializedName("memory_update_view_model")
    public final MemoryUpdateViewModel memoryUpdateViewModel;

    @SerializedName("reels_view_model")
    public final ReelsViewModel reelsViewModel;

    @SerializedName("search_view_model")
    public final SearchViewModel searchViewModel;

    @SerializedName("streaming_state_view_model")
    public final StreamingStateViewModel streamingStateViewModel;

    @SerializedName("studio_transparency_view_model")
    public final TransparencyViewModel transparencyViewModel;

    public static /* synthetic */ GenAIViewModels copy$default(GenAIViewModels genAIViewModels, ImagineViewModel imagineViewModel, ReelsViewModel reelsViewModel, SearchViewModel searchViewModel, MemoryUpdateViewModel memoryUpdateViewModel, TransparencyViewModel transparencyViewModel, MemoryNotificationsViewModel memoryNotificationsViewModel, StreamingStateViewModel streamingStateViewModel, FeedRankingViewModel feedRankingViewModel, int i, Object obj) {
        ImagineViewModel imagineViewModel2 = imagineViewModel;
        ReelsViewModel reelsViewModel2 = reelsViewModel;
        SearchViewModel searchViewModel2 = searchViewModel;
        MemoryUpdateViewModel memoryUpdateViewModel2 = memoryUpdateViewModel;
        TransparencyViewModel transparencyViewModel2 = transparencyViewModel;
        MemoryNotificationsViewModel memoryNotificationsViewModel2 = memoryNotificationsViewModel;
        StreamingStateViewModel streamingStateViewModel2 = streamingStateViewModel;
        FeedRankingViewModel feedRankingViewModel2 = feedRankingViewModel;
        if ((i & 1) != 0) {
            imagineViewModel2 = genAIViewModels.imagineViewModel;
        }
        if ((i & 2) != 0) {
            reelsViewModel2 = genAIViewModels.reelsViewModel;
        }
        if ((i & 4) != 0) {
            searchViewModel2 = genAIViewModels.searchViewModel;
        }
        if ((i & 8) != 0) {
            memoryUpdateViewModel2 = genAIViewModels.memoryUpdateViewModel;
        }
        if ((i & 16) != 0) {
            transparencyViewModel2 = genAIViewModels.transparencyViewModel;
        }
        if ((i & 32) != 0) {
            memoryNotificationsViewModel2 = genAIViewModels.memoryNotificationsViewModel;
        }
        if ((i & 64) != 0) {
            streamingStateViewModel2 = genAIViewModels.streamingStateViewModel;
        }
        if ((i & 128) != 0) {
            feedRankingViewModel2 = genAIViewModels.feedRankingViewModel;
        }
        return new GenAIViewModels(imagineViewModel2, reelsViewModel2, searchViewModel2, memoryUpdateViewModel2, transparencyViewModel2, memoryNotificationsViewModel2, streamingStateViewModel2, feedRankingViewModel2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GenAIViewModels) {
                GenAIViewModels genAIViewModels = (GenAIViewModels) obj;
                if (!C7384Etj.areEqual(this.imagineViewModel, genAIViewModels.imagineViewModel) || !C7384Etj.areEqual(this.reelsViewModel, genAIViewModels.reelsViewModel) || !C7384Etj.areEqual(this.searchViewModel, genAIViewModels.searchViewModel) || !C7384Etj.areEqual(this.memoryUpdateViewModel, genAIViewModels.memoryUpdateViewModel) || !C7384Etj.areEqual(this.transparencyViewModel, genAIViewModels.transparencyViewModel) || !C7384Etj.areEqual(this.memoryNotificationsViewModel, genAIViewModels.memoryNotificationsViewModel) || !C7384Etj.areEqual(this.streamingStateViewModel, genAIViewModels.streamingStateViewModel) || !C7384Etj.areEqual(this.feedRankingViewModel, genAIViewModels.feedRankingViewModel)) {
                }
            }
            return false;
        }
        return true;
    }

    public final ImagineViewModel component1() {
        return this.imagineViewModel;
    }

    public final ReelsViewModel component2() {
        return this.reelsViewModel;
    }

    public final SearchViewModel component3() {
        return this.searchViewModel;
    }

    public final MemoryUpdateViewModel component4() {
        return this.memoryUpdateViewModel;
    }

    public final TransparencyViewModel component5() {
        return this.transparencyViewModel;
    }

    public final MemoryNotificationsViewModel component6() {
        return this.memoryNotificationsViewModel;
    }

    public final StreamingStateViewModel component7() {
        return this.streamingStateViewModel;
    }

    public final FeedRankingViewModel component8() {
        return this.feedRankingViewModel;
    }

    public final GenAIViewModels copy(ImagineViewModel imagineViewModel, ReelsViewModel reelsViewModel, SearchViewModel searchViewModel, MemoryUpdateViewModel memoryUpdateViewModel, TransparencyViewModel transparencyViewModel, MemoryNotificationsViewModel memoryNotificationsViewModel, StreamingStateViewModel streamingStateViewModel, FeedRankingViewModel feedRankingViewModel) {
        return new GenAIViewModels(imagineViewModel, reelsViewModel, searchViewModel, memoryUpdateViewModel, transparencyViewModel, memoryNotificationsViewModel, streamingStateViewModel, feedRankingViewModel);
    }

    public final FeedRankingViewModel getFeedRankingViewModel() {
        return this.feedRankingViewModel;
    }

    public final ImagineViewModel getImagineViewModel() {
        return this.imagineViewModel;
    }

    public final MemoryNotificationsViewModel getMemoryNotificationsViewModel() {
        return this.memoryNotificationsViewModel;
    }

    public final MemoryUpdateViewModel getMemoryUpdateViewModel() {
        return this.memoryUpdateViewModel;
    }

    public final ReelsViewModel getReelsViewModel() {
        return this.reelsViewModel;
    }

    public final SearchViewModel getSearchViewModel() {
        return this.searchViewModel;
    }

    public final StreamingStateViewModel getStreamingStateViewModel() {
        return this.streamingStateViewModel;
    }

    public final TransparencyViewModel getTransparencyViewModel() {
        return this.transparencyViewModel;
    }

    public int hashCode() {
        return (((((((((((((AnonymousClass006.A0D(this.imagineViewModel) * 31) + AnonymousClass006.A0D(this.reelsViewModel)) * 31) + AnonymousClass006.A0D(this.searchViewModel)) * 31) + AnonymousClass006.A0D(this.memoryUpdateViewModel)) * 31) + AnonymousClass006.A0D(this.transparencyViewModel)) * 31) + AnonymousClass006.A0D(this.memoryNotificationsViewModel)) * 31) + AnonymousClass006.A0D(this.streamingStateViewModel)) * 31) + C3cH.A02(this.feedRankingViewModel);
    }

    public String toString() {
        ImagineViewModel imagineViewModel = this.imagineViewModel;
        ReelsViewModel reelsViewModel = this.reelsViewModel;
        SearchViewModel searchViewModel = this.searchViewModel;
        MemoryUpdateViewModel memoryUpdateViewModel = this.memoryUpdateViewModel;
        TransparencyViewModel transparencyViewModel = this.transparencyViewModel;
        MemoryNotificationsViewModel memoryNotificationsViewModel = this.memoryNotificationsViewModel;
        StreamingStateViewModel streamingStateViewModel = this.streamingStateViewModel;
        FeedRankingViewModel feedRankingViewModel = this.feedRankingViewModel;
        StringBuilder sbA0f = C3cG.A0f(imagineViewModel, "GenAIViewModels(imagineViewModel=");
        sbA0f.append(", reelsViewModel=");
        sbA0f.append(reelsViewModel);
        sbA0f.append(", searchViewModel=");
        sbA0f.append(searchViewModel);
        sbA0f.append(", memoryUpdateViewModel=");
        sbA0f.append(memoryUpdateViewModel);
        sbA0f.append(", transparencyViewModel=");
        sbA0f.append(transparencyViewModel);
        sbA0f.append(", memoryNotificationsViewModel=");
        sbA0f.append(memoryNotificationsViewModel);
        sbA0f.append(", streamingStateViewModel=");
        sbA0f.append(streamingStateViewModel);
        return C3cJ.A0L(feedRankingViewModel, ", feedRankingViewModel=", sbA0f);
    }

    public GenAIViewModels(ImagineViewModel imagineViewModel, ReelsViewModel reelsViewModel, SearchViewModel searchViewModel, MemoryUpdateViewModel memoryUpdateViewModel, TransparencyViewModel transparencyViewModel, MemoryNotificationsViewModel memoryNotificationsViewModel, StreamingStateViewModel streamingStateViewModel, FeedRankingViewModel feedRankingViewModel) {
        this.imagineViewModel = imagineViewModel;
        this.reelsViewModel = reelsViewModel;
        this.searchViewModel = searchViewModel;
        this.memoryUpdateViewModel = memoryUpdateViewModel;
        this.transparencyViewModel = transparencyViewModel;
        this.memoryNotificationsViewModel = memoryNotificationsViewModel;
        this.streamingStateViewModel = streamingStateViewModel;
        this.feedRankingViewModel = feedRankingViewModel;
    }
}
