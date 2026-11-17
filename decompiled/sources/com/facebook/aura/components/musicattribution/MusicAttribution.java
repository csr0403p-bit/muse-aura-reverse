package com.facebook.aura.components.musicattribution;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes.dex */
public final class MusicAttribution {
    public static final int $stable = 0;
    public final String artist;
    public final String coverUrl;
    public final String title;

    public MusicAttribution(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.title = str;
        this.artist = str2;
        this.coverUrl = str3;
    }

    public final MusicAttribution copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new MusicAttribution(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MusicAttribution) {
                MusicAttribution musicAttribution = (MusicAttribution) obj;
                if (!C7384Etj.areEqual(this.title, musicAttribution.title) || !C7384Etj.areEqual(this.artist, musicAttribution.artist) || !C7384Etj.areEqual(this.coverUrl, musicAttribution.coverUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MusicAttribution copy$default(MusicAttribution musicAttribution, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = musicAttribution.title;
        }
        if ((i & 2) != 0) {
            str2 = musicAttribution.artist;
        }
        if ((i & 4) != 0) {
            str3 = musicAttribution.coverUrl;
        }
        return musicAttribution.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.artist;
    }

    public final String component3() {
        return this.coverUrl;
    }

    public final String getArtist() {
        return this.artist;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.artist)) * 31) + AnonymousClass005.A0H(this.coverUrl);
    }

    public String toString() {
        return FGI.A0k("MusicAttribution(title=", this.title, ", artist=", this.artist, ", coverUrl=", this.coverUrl, ")");
    }

    public /* synthetic */ MusicAttribution(String str, String str2, String str3, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
