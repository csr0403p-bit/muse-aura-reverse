package com.facebook.aura.audio.podcast;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes3.dex */
public interface PodcastJarvisPath extends JarvisPath.Extension {

    public final class PodcastEpisodes implements PodcastJarvisPath {
        public static final PodcastEpisodes INSTANCE = new PodcastEpisodes();
        public static final String value = "api/podcasts/episodes";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PodcastEpisodes);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "PodcastEpisodes";
        }

        public int hashCode() {
            return -1615059382;
        }
    }

    public final class PodcastFeed implements PodcastJarvisPath {
        public static final PodcastFeed INSTANCE = new PodcastFeed();
        public static final String value = "api/podcasts/feed";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PodcastFeed);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "PodcastFeed";
        }

        public int hashCode() {
            return -63040752;
        }
    }
}
