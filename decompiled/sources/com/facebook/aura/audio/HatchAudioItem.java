package com.facebook.aura.audio;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchAudioItem extends C06G {
    public static final int $stable = 0;
    public final String artist;
    public final String artworkUrl;
    public final String audioType;
    public final String fileName;
    public final String id;
    public final String mimeType;
    public final String sourceMessageId;
    public final String sourceSessionId;
    public final String title;
    public final String url;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAudioItem) {
                HatchAudioItem hatchAudioItem = (HatchAudioItem) obj;
                if (!C7384Etj.areEqual(this.id, hatchAudioItem.id) || !C7384Etj.areEqual(this.url, hatchAudioItem.url) || !C7384Etj.areEqual(this.fileName, hatchAudioItem.fileName) || !C7384Etj.areEqual(this.title, hatchAudioItem.title) || !C7384Etj.areEqual(this.artist, hatchAudioItem.artist) || !C7384Etj.areEqual(this.artworkUrl, hatchAudioItem.artworkUrl) || !C7384Etj.areEqual(this.mimeType, hatchAudioItem.mimeType) || !C7384Etj.areEqual(this.sourceMessageId, hatchAudioItem.sourceMessageId) || !C7384Etj.areEqual(this.sourceSessionId, hatchAudioItem.sourceSessionId) || !C7384Etj.areEqual(this.audioType, hatchAudioItem.audioType)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchAudioItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, C06H c06h) {
        this(str, str2, str3, str4, str5, str6, str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10);
    }

    public static /* synthetic */ HatchAudioItem copy$default(HatchAudioItem hatchAudioItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAudioItem.id;
        }
        if ((i & 2) != 0) {
            str2 = hatchAudioItem.url;
        }
        if ((i & 4) != 0) {
            str3 = hatchAudioItem.fileName;
        }
        if ((i & 8) != 0) {
            str4 = hatchAudioItem.title;
        }
        if ((i & 16) != 0) {
            str5 = hatchAudioItem.artist;
        }
        if ((i & 32) != 0) {
            str6 = hatchAudioItem.artworkUrl;
        }
        if ((i & 64) != 0) {
            str7 = hatchAudioItem.mimeType;
        }
        if ((i & 128) != 0) {
            str8 = hatchAudioItem.sourceMessageId;
        }
        if ((i & 256) != 0) {
            str9 = hatchAudioItem.sourceSessionId;
        }
        if ((i & 512) != 0) {
            str10 = hatchAudioItem.audioType;
        }
        return hatchAudioItem.copy(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.audioType;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.fileName;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.artist;
    }

    public final String component6() {
        return this.artworkUrl;
    }

    public final String component7() {
        return this.mimeType;
    }

    public final String component8() {
        return this.sourceMessageId;
    }

    public final String component9() {
        return this.sourceSessionId;
    }

    public final String getArtist() {
        return this.artist;
    }

    public final String getArtworkUrl() {
        return this.artworkUrl;
    }

    public final String getAudioType() {
        return this.audioType;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getSourceMessageId() {
        return this.sourceMessageId;
    }

    public final String getSourceSessionId() {
        return this.sourceSessionId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return ((((((((AnonymousClass005.A0I(this.artist, AnonymousClass005.A0I(this.title, AnonymousClass005.A0I(this.fileName, AnonymousClass005.A0I(this.url, AnonymousClass001.A0G(this.id))))) + AnonymousClass006.A0G(this.artworkUrl)) * 31) + AnonymousClass006.A0G(this.mimeType)) * 31) + AnonymousClass006.A0G(this.sourceMessageId)) * 31) + AnonymousClass006.A0G(this.sourceSessionId)) * 31) + AnonymousClass005.A0H(this.audioType);
    }

    public final HatchAudioItem copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        return new HatchAudioItem(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public String toString() {
        return super.toString();
    }

    public HatchAudioItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        this.id = str;
        this.url = str2;
        this.fileName = str3;
        this.title = str4;
        this.artist = str5;
        this.artworkUrl = str6;
        this.mimeType = str7;
        this.sourceMessageId = str8;
        this.sourceSessionId = str9;
        this.audioType = str10;
    }
}
