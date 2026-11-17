package com.facebook.aura.audio.podcast;

import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PodcastEpisodesResponseJson extends C06G {
    public final List<PodcastEpisodeJson> episodes;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, PodcastEpisodesResponseJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<PodcastEpisodesResponseJson> serializer() {
            return PodcastEpisodesResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final PodcastEpisodesResponseJson copy(List<PodcastEpisodeJson> list) {
        C7384Etj.A0Y(list, 0);
        return new PodcastEpisodesResponseJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PodcastEpisodesResponseJson) && C7384Etj.areEqual(this.episodes, ((PodcastEpisodesResponseJson) obj).episodes));
    }

    public static /* synthetic */ PodcastEpisodesResponseJson copy$default(PodcastEpisodesResponseJson podcastEpisodesResponseJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = podcastEpisodesResponseJson.episodes;
        }
        C7384Etj.A0Y(list, 0);
        return new PodcastEpisodesResponseJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_audio_podcast_podcast(PodcastEpisodesResponseJson podcastEpisodesResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C3cG.A1L(podcastEpisodesResponseJson.episodes)) {
            c9j5.AAQ(podcastEpisodesResponseJson.episodes, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<PodcastEpisodeJson> component1() {
        return this.episodes;
    }

    public final List<PodcastEpisodeJson> getEpisodes() {
        return this.episodes;
    }

    public int hashCode() {
        return this.episodes.hashCode();
    }

    public final List<PodcastEpisode> toDomain() {
        List<PodcastEpisodeJson> list = this.episodes;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<PodcastEpisodeJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toDomain());
        }
        return arrayListA0i;
    }

    public /* synthetic */ PodcastEpisodesResponseJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.episodes = C0881AGi.A00;
        } else {
            this.episodes = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public PodcastEpisodesResponseJson(List<PodcastEpisodeJson> list) {
        C7384Etj.A0Y(list, 0);
        this.episodes = list;
    }

    public /* synthetic */ PodcastEpisodesResponseJson(List list, int i, C06H c06h) {
        this(C3cI.A10(list, i));
    }

    public PodcastEpisodesResponseJson() {
        this(C0881AGi.A00);
    }
}
