package com.facebook.aura.sharesheet;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import android.net.Uri;
import com.facebook.aura.components.musicattribution.MusicAttribution;
import com.facebook.aura.model.HatchDanceShare;

/* loaded from: classes.dex */
public interface AvatarSharePage {

    public final class Dance extends C06G implements AvatarSharePage {
        public static final int $stable = 0;
        public final HatchDanceShare dance;
        public final Uri mediaUri;
        public final MusicAttribution music;
        public final Uri posterUri;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Dance) {
                    Dance dance = (Dance) obj;
                    if (!C7384Etj.areEqual(this.mediaUri, dance.mediaUri) || !C7384Etj.areEqual(this.posterUri, dance.posterUri) || !C7384Etj.areEqual(this.music, dance.music) || !C7384Etj.areEqual(this.dance, dance.dance)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Dance copy$default(Dance dance, Uri uri, Uri uri2, MusicAttribution musicAttribution, HatchDanceShare hatchDanceShare, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = dance.mediaUri;
            }
            if ((i & 2) != 0) {
                uri2 = dance.posterUri;
            }
            if ((i & 4) != 0) {
                musicAttribution = dance.music;
            }
            if ((i & 8) != 0) {
                hatchDanceShare = dance.dance;
            }
            AnonymousClass003.A0w(uri, hatchDanceShare);
            return new Dance(uri, uri2, musicAttribution, hatchDanceShare);
        }

        public final Uri component1() {
            return this.mediaUri;
        }

        public final Uri component2() {
            return this.posterUri;
        }

        public final MusicAttribution component3() {
            return this.music;
        }

        public final HatchDanceShare component4() {
            return this.dance;
        }

        public final HatchDanceShare getDance() {
            return this.dance;
        }

        @Override // com.facebook.aura.sharesheet.AvatarSharePage
        public Uri getMediaUri() {
            return this.mediaUri;
        }

        public final MusicAttribution getMusic() {
            return this.music;
        }

        public final Uri getPosterUri() {
            return this.posterUri;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.dance, (((AnonymousClass005.A0E(this.mediaUri) + AnonymousClass006.A0D(this.posterUri)) * 31) + C06G.A04(this.music)) * 31);
        }

        public Dance(Uri uri, Uri uri2, MusicAttribution musicAttribution, HatchDanceShare hatchDanceShare) {
            AnonymousClass003.A0w(uri, hatchDanceShare);
            this.mediaUri = uri;
            this.posterUri = uri2;
            this.music = musicAttribution;
            this.dance = hatchDanceShare;
        }

        public final Dance copy(Uri uri, Uri uri2, MusicAttribution musicAttribution, HatchDanceShare hatchDanceShare) {
            AnonymousClass003.A0w(uri, hatchDanceShare);
            return new Dance(uri, uri2, musicAttribution, hatchDanceShare);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Intro extends C06G implements AvatarSharePage {
        public static final int $stable = 0;
        public final Uri mediaUri;
        public final HatchAvatarStoryPalette palette;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Intro) {
                    Intro intro = (Intro) obj;
                    if (!C7384Etj.areEqual(this.mediaUri, intro.mediaUri) || !C7384Etj.areEqual(this.palette, intro.palette)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Intro copy$default(Intro intro, Uri uri, HatchAvatarStoryPalette hatchAvatarStoryPalette, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = intro.mediaUri;
            }
            if ((i & 2) != 0) {
                hatchAvatarStoryPalette = intro.palette;
            }
            AnonymousClass003.A0u(uri, hatchAvatarStoryPalette);
            return new Intro(uri, hatchAvatarStoryPalette);
        }

        public final Uri component1() {
            return this.mediaUri;
        }

        public final HatchAvatarStoryPalette component2() {
            return this.palette;
        }

        @Override // com.facebook.aura.sharesheet.AvatarSharePage
        public Uri getMediaUri() {
            return this.mediaUri;
        }

        public final HatchAvatarStoryPalette getPalette() {
            return this.palette;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.palette, AnonymousClass005.A0E(this.mediaUri));
        }

        public Intro(Uri uri, HatchAvatarStoryPalette hatchAvatarStoryPalette) {
            AnonymousClass003.A0u(uri, hatchAvatarStoryPalette);
            this.mediaUri = uri;
            this.palette = hatchAvatarStoryPalette;
        }

        public final Intro copy(Uri uri, HatchAvatarStoryPalette hatchAvatarStoryPalette) {
            AnonymousClass003.A0u(uri, hatchAvatarStoryPalette);
            return new Intro(uri, hatchAvatarStoryPalette);
        }

        public String toString() {
            return super.toString();
        }
    }

    Uri getMediaUri();
}
