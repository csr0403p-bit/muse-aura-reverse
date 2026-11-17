package com.facebook.aura.audio.podcast;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;

/* loaded from: classes.dex */
public final class PodcastPresentationResolver {
    public static final PodcastPresentationResolver INSTANCE = new PodcastPresentationResolver();
    public static final String PODCASTS_SEGMENT = "workspace/podcasts/";
    public static final String VM_HOME_PREFIX = "/home/hatch/";

    public final class PodcastPresentation extends C06G {
        public final String coverPath;
        public final String episodeTitle;
        public final String feedTitle;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PodcastPresentation) {
                    PodcastPresentation podcastPresentation = (PodcastPresentation) obj;
                    if (!C7384Etj.areEqual(this.episodeTitle, podcastPresentation.episodeTitle) || !C7384Etj.areEqual(this.feedTitle, podcastPresentation.feedTitle) || !C7384Etj.areEqual(this.coverPath, podcastPresentation.coverPath)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ PodcastPresentation copy$default(PodcastPresentation podcastPresentation, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = podcastPresentation.episodeTitle;
            }
            if ((i & 2) != 0) {
                str2 = podcastPresentation.feedTitle;
            }
            if ((i & 4) != 0) {
                str3 = podcastPresentation.coverPath;
            }
            return new PodcastPresentation(str, str2, str3);
        }

        public final String component1() {
            return this.episodeTitle;
        }

        public final String component2() {
            return this.feedTitle;
        }

        public final String component3() {
            return this.coverPath;
        }

        public final PodcastPresentation copy(String str, String str2, String str3) {
            return new PodcastPresentation(str, str2, str3);
        }

        public final String getCoverPath() {
            return this.coverPath;
        }

        public final String getEpisodeTitle() {
            return this.episodeTitle;
        }

        public final String getFeedTitle() {
            return this.feedTitle;
        }

        public int hashCode() {
            return (((AnonymousClass006.A0G(this.episodeTitle) * 31) + AnonymousClass006.A0G(this.feedTitle)) * 31) + AnonymousClass005.A0H(this.coverPath);
        }

        public PodcastPresentation(String str, String str2, String str3) {
            this.episodeTitle = str;
            this.feedTitle = str2;
            this.coverPath = str3;
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getLinkedPodcastFeedTitle(com.facebook.aura.audio.podcast.PodcastEpisode r6, com.facebook.aura.audio.podcast.PodcastFeed r7) {
        /*
            r5 = this;
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)
            r5 = 0
            if (r7 == 0) goto L1b
            java.lang.String r0 = r7.feedTitle
            if (r0 == 0) goto L1b
            java.lang.String r4 = X.AnonymousClass002.A0l(r0)
        Lf:
            java.lang.String r3 = ""
            if (r4 != 0) goto L14
            r4 = r3
        L14:
            int r0 = r4.length()
            if (r0 != 0) goto L1d
            return r5
        L1b:
            r4 = r5
            goto Lf
        L1d:
            java.lang.String r0 = r6.feedUrl
            if (r0 == 0) goto L27
            java.lang.String r1 = X.AnonymousClass002.A0l(r0)
            if (r1 != 0) goto L28
        L27:
            r1 = r3
        L28:
            if (r7 == 0) goto L35
            java.lang.String r0 = r7.feedUrl
            if (r0 == 0) goto L35
            java.lang.String r0 = X.AnonymousClass002.A0l(r0)
            if (r0 == 0) goto L35
            r3 = r0
        L35:
            int r0 = r1.length()
            r2 = 1
            if (r0 <= 0) goto L49
            int r0 = r3.length()
            if (r0 <= 0) goto L49
            boolean r0 = r1.equals(r3)
            r1 = 1
            if (r0 != 0) goto L4a
        L49:
            r1 = 0
        L4a:
            java.lang.String r0 = r6.spotifyEpisodeUri
            if (r0 == 0) goto L55
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto L55
            r2 = 0
        L55:
            if (r1 != 0) goto L5a
            if (r2 == 0) goto L5a
            return r5
        L5a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.audio.podcast.PodcastPresentationResolver.getLinkedPodcastFeedTitle(com.facebook.aura.audio.podcast.PodcastEpisode, com.facebook.aura.audio.podcast.PodcastFeed):java.lang.String");
    }

    public final String getPodcastSlugFromPath(String str) {
        int iA0B;
        C7384Etj.A0Y(str, 0);
        int i = 0;
        if (str.startsWith(PODCASTS_SEGMENT) || ((iA0B = C7BY.A0B(str, "/workspace/podcasts/", 0, false)) >= 0 && (i = iA0B + 1) >= 0)) {
            String strSubstring = str.substring(i + 19);
            String strA0S = C7BY.A0S(strSubstring, strSubstring, '/');
            String strA0S2 = C7BY.A0S(strA0S, strA0S, '?');
            String strA0S3 = C7BY.A0S(strA0S2, strA0S2, '#');
            if (!C7BY.A0j(strA0S3)) {
                return strA0S3;
            }
        }
        return null;
    }

    public final boolean isPodcastPath(String str) {
        C7384Etj.A0Y(str, 0);
        return getPodcastSlugFromPath(str) != null;
    }

    public final String normalizeCoverPath(String str) {
        C7384Etj.A0Y(str, 0);
        return C7BY.A0K(CustomConnectorRegisterRepositoryKt.ROOT_PATH, C7BY.A0K("~/", C7BY.A0K(VM_HOME_PREFIX, AnonymousClass002.A0l(str))));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[PHI: r2 r3 r5
  0x0047: PHI (r2v5 java.lang.String) = (r2v1 java.lang.String), (r2v6 java.lang.String), (r2v7 java.lang.String) binds: [B:48:0x008a, B:19:0x0044, B:20:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r3v5 java.lang.String) = (r3v1 java.lang.String), (r3v6 java.lang.String), (r3v6 java.lang.String) binds: [B:48:0x008a, B:19:0x0044, B:20:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r5v4 com.facebook.aura.audio.podcast.PodcastEpisode) = 
  (r5v3 com.facebook.aura.audio.podcast.PodcastEpisode)
  (r5v7 com.facebook.aura.audio.podcast.PodcastEpisode)
  (r5v7 com.facebook.aura.audio.podcast.PodcastEpisode)
 binds: [B:48:0x008a, B:19:0x0044, B:20:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[PHI: r2 r3
  0x0057: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v5 java.lang.String), (r2v5 java.lang.String), (r2v5 java.lang.String) binds: [B:48:0x008a, B:22:0x0049, B:24:0x004f, B:26:0x0055] A[DONT_GENERATE, DONT_INLINE]
  0x0057: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v5 java.lang.String), (r3v5 java.lang.String), (r3v5 java.lang.String) binds: [B:48:0x008a, B:22:0x0049, B:24:0x004f, B:26:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075 A[PHI: r1 r2 r3
  0x0075: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v3 java.lang.String) binds: [B:36:0x006d, B:26:0x0055] A[DONT_GENERATE, DONT_INLINE]
  0x0075: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v5 java.lang.String) binds: [B:36:0x006d, B:26:0x0055] A[DONT_GENERATE, DONT_INLINE]
  0x0075: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v5 java.lang.String) binds: [B:36:0x006d, B:26:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.audio.podcast.PodcastPresentationResolver.PodcastPresentation resolve(java.lang.String r5, com.facebook.aura.audio.podcast.PodcastCatalog r6) {
        /*
            r4 = this;
            r0 = 0
            X.C7384Etj.A0Y(r5, r0)
            java.lang.String r2 = r4.getPodcastSlugFromPath(r5)
            r4 = 0
            if (r2 == 0) goto L87
            if (r6 == 0) goto L87
            java.util.List<com.facebook.aura.audio.podcast.PodcastEpisode> r0 = r6.episodes
            if (r0 == 0) goto L87
            java.util.Iterator r1 = r0.iterator()
        L15:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r5 = r1.next()
            r0 = r5
            com.facebook.aura.audio.podcast.PodcastEpisode r0 = (com.facebook.aura.audio.podcast.PodcastEpisode) r0
            java.lang.String r0 = r0.slug
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L15
        L2a:
            com.facebook.aura.audio.podcast.PodcastEpisode r5 = (com.facebook.aura.audio.podcast.PodcastEpisode) r5
            if (r5 == 0) goto L88
            com.facebook.aura.audio.podcast.PodcastPresentationResolver r1 = com.facebook.aura.audio.podcast.PodcastPresentationResolver.INSTANCE
            com.facebook.aura.audio.podcast.PodcastFeed r0 = r6.feed
            java.lang.String r3 = r1.getLinkedPodcastFeedTitle(r5, r0)
            java.lang.String r0 = r5.title
            if (r0 == 0) goto L89
            java.lang.String r2 = X.AnonymousClass002.A0l(r0)
            if (r2 == 0) goto L89
            boolean r0 = X.C7BY.A0j(r2)
            if (r0 == 0) goto L47
            r2 = r4
        L47:
            java.lang.String r0 = r5.cover
            if (r0 == 0) goto L57
            java.lang.String r1 = X.AnonymousClass002.A0l(r0)
            if (r1 == 0) goto L57
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 == 0) goto L75
        L57:
            if (r3 == 0) goto L6f
            if (r6 == 0) goto L6f
            com.facebook.aura.audio.podcast.PodcastFeed r0 = r6.feed
            if (r0 == 0) goto L6f
            java.lang.String r0 = r0.cover
            if (r0 == 0) goto L6f
            java.lang.String r1 = X.AnonymousClass002.A0l(r0)
            if (r1 == 0) goto L6f
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 == 0) goto L75
        L6f:
            com.facebook.aura.audio.podcast.PodcastPresentationResolver$PodcastPresentation r0 = new com.facebook.aura.audio.podcast.PodcastPresentationResolver$PodcastPresentation
            r0.<init>(r2, r3, r4)
            return r0
        L75:
            com.facebook.aura.audio.podcast.PodcastPresentationResolver r0 = com.facebook.aura.audio.podcast.PodcastPresentationResolver.INSTANCE
            java.lang.String r1 = r0.normalizeCoverPath(r1)
            if (r1 == 0) goto L6f
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 != 0) goto L6f
            r4 = r1
            goto L6f
        L85:
            r5 = r4
            goto L2a
        L87:
            r5 = r4
        L88:
            r3 = r4
        L89:
            r2 = r4
            if (r5 == 0) goto L57
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.audio.podcast.PodcastPresentationResolver.resolve(java.lang.String, com.facebook.aura.audio.podcast.PodcastCatalog):com.facebook.aura.audio.podcast.PodcastPresentationResolver$PodcastPresentation");
    }
}
