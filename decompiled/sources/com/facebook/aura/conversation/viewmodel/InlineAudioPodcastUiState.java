package com.facebook.aura.conversation.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class InlineAudioPodcastUiState extends C06G {
    public static final int $stable = 0;
    public final String artworkUrl;
    public final String episodeTitle;
    public final String feedTitle;
    public final boolean isPodcast;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InlineAudioPodcastUiState) {
                InlineAudioPodcastUiState inlineAudioPodcastUiState = (InlineAudioPodcastUiState) obj;
                if (this.isPodcast != inlineAudioPodcastUiState.isPodcast || !C7384Etj.areEqual(this.episodeTitle, inlineAudioPodcastUiState.episodeTitle) || !C7384Etj.areEqual(this.feedTitle, inlineAudioPodcastUiState.feedTitle) || !C7384Etj.areEqual(this.artworkUrl, inlineAudioPodcastUiState.artworkUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ InlineAudioPodcastUiState copy$default(InlineAudioPodcastUiState inlineAudioPodcastUiState, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = inlineAudioPodcastUiState.isPodcast;
        }
        if ((i & 2) != 0) {
            str = inlineAudioPodcastUiState.episodeTitle;
        }
        if ((i & 4) != 0) {
            str2 = inlineAudioPodcastUiState.feedTitle;
        }
        if ((i & 8) != 0) {
            str3 = inlineAudioPodcastUiState.artworkUrl;
        }
        return new InlineAudioPodcastUiState(z, str, str2, str3);
    }

    public final boolean component1() {
        return this.isPodcast;
    }

    public final String component2() {
        return this.episodeTitle;
    }

    public final String component3() {
        return this.feedTitle;
    }

    public final String component4() {
        return this.artworkUrl;
    }

    public final InlineAudioPodcastUiState copy(boolean z, String str, String str2, String str3) {
        return new InlineAudioPodcastUiState(z, str, str2, str3);
    }

    public final String getArtworkUrl() {
        return this.artworkUrl;
    }

    public final String getEpisodeTitle() {
        return this.episodeTitle;
    }

    public final String getFeedTitle() {
        return this.feedTitle;
    }

    public int hashCode() {
        return ((((C0KA.A02(this.isPodcast) + AnonymousClass006.A0G(this.episodeTitle)) * 31) + AnonymousClass006.A0G(this.feedTitle)) * 31) + AnonymousClass005.A0H(this.artworkUrl);
    }

    public final boolean isPodcast() {
        return this.isPodcast;
    }

    public InlineAudioPodcastUiState(boolean z, String str, String str2, String str3) {
        this.isPodcast = z;
        this.episodeTitle = str;
        this.feedTitle = str2;
        this.artworkUrl = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ InlineAudioPodcastUiState(boolean z, String str, String str2, String str3, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public InlineAudioPodcastUiState() {
        this(false, null, null, null);
    }
}
