package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import X.FGI;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes3.dex */
public final class ReelsData extends C06G {

    @SerializedName("author")
    public final String author;

    @SerializedName("avatar_url")
    public final String profilePictureUrl;

    @SerializedName("reels_url")
    public final String reelsUrl;

    @SerializedName("thumbnail_url")
    public final String thumbnailUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReelsData) {
                ReelsData reelsData = (ReelsData) obj;
                if (!C7384Etj.areEqual(this.reelsUrl, reelsData.reelsUrl) || !C7384Etj.areEqual(this.thumbnailUrl, reelsData.thumbnailUrl) || !C7384Etj.areEqual(this.author, reelsData.author) || !C7384Etj.areEqual(this.profilePictureUrl, reelsData.profilePictureUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ReelsData copy$default(ReelsData reelsData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reelsData.reelsUrl;
        }
        if ((i & 2) != 0) {
            str2 = reelsData.thumbnailUrl;
        }
        if ((i & 4) != 0) {
            str3 = reelsData.author;
        }
        if ((i & 8) != 0) {
            str4 = reelsData.profilePictureUrl;
        }
        return new ReelsData(str, str2, str3, str4);
    }

    public final String component1() {
        return this.reelsUrl;
    }

    public final String component2() {
        return this.thumbnailUrl;
    }

    public final String component3() {
        return this.author;
    }

    public final String component4() {
        return this.profilePictureUrl;
    }

    public final ReelsData copy(String str, String str2, String str3, String str4) {
        return new ReelsData(str, str2, str3, str4);
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public final String getReelsUrl() {
        return this.reelsUrl;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.reelsUrl) * 31) + AnonymousClass006.A0G(this.thumbnailUrl)) * 31) + AnonymousClass006.A0G(this.author)) * 31) + AnonymousClass005.A0H(this.profilePictureUrl);
    }

    public String toString() {
        return FGI.A0m("ReelsData(reelsUrl=", this.reelsUrl, ", thumbnailUrl=", this.thumbnailUrl, ", author=", this.author, ", profilePictureUrl=", this.profilePictureUrl, ")");
    }

    public ReelsData(String str, String str2, String str3, String str4) {
        this.reelsUrl = str;
        this.thumbnailUrl = str2;
        this.author = str3;
        this.profilePictureUrl = str4;
    }
}
