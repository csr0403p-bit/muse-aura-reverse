package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HatchAttachmentAudioJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String artist;
    public final String audio_asset_id;
    public final String audio_cluster_id;
    public final String cover_art;
    public final long start_ms;
    public final String title;

    public final class Companion {
        public final C9hr<HatchAttachmentAudioJson> serializer() {
            return HatchAttachmentAudioJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchAttachmentAudioJson(String str, String str2, String str3, String str4, String str5, long j) {
        C7384Etj.A0Y(str, 0);
        this.audio_cluster_id = str;
        this.audio_asset_id = str2;
        this.title = str3;
        this.artist = str4;
        this.cover_art = str5;
        this.start_ms = j;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(HatchAttachmentAudioJson hatchAttachmentAudioJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(hatchAttachmentAudioJson.audio_cluster_id)) {
            c9j5.AAV(hatchAttachmentAudioJson.audio_cluster_id, c9iZ, 0);
        }
        if (zAfR || hatchAttachmentAudioJson.audio_asset_id != null) {
            c9j5.AAP(hatchAttachmentAudioJson.audio_asset_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || hatchAttachmentAudioJson.title != null) {
            c9j5.AAP(hatchAttachmentAudioJson.title, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || hatchAttachmentAudioJson.artist != null) {
            c9j5.AAP(hatchAttachmentAudioJson.artist, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || hatchAttachmentAudioJson.cover_art != null) {
            c9j5.AAP(hatchAttachmentAudioJson.cover_art, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || hatchAttachmentAudioJson.start_ms != 0) {
            c9j5.AAN(c9iZ, 5, hatchAttachmentAudioJson.start_ms);
        }
    }

    public final HatchAttachmentAudioJson copy(String str, String str2, String str3, String str4, String str5, long j) {
        C7384Etj.A0Y(str, 0);
        return new HatchAttachmentAudioJson(str, str2, str3, str4, str5, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAttachmentAudioJson) {
                HatchAttachmentAudioJson hatchAttachmentAudioJson = (HatchAttachmentAudioJson) obj;
                if (!C7384Etj.areEqual(this.audio_cluster_id, hatchAttachmentAudioJson.audio_cluster_id) || !C7384Etj.areEqual(this.audio_asset_id, hatchAttachmentAudioJson.audio_asset_id) || !C7384Etj.areEqual(this.title, hatchAttachmentAudioJson.title) || !C7384Etj.areEqual(this.artist, hatchAttachmentAudioJson.artist) || !C7384Etj.areEqual(this.cover_art, hatchAttachmentAudioJson.cover_art) || this.start_ms != hatchAttachmentAudioJson.start_ms) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchAttachmentAudioJson copy$default(HatchAttachmentAudioJson hatchAttachmentAudioJson, String str, String str2, String str3, String str4, String str5, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAttachmentAudioJson.audio_cluster_id;
        }
        if ((i & 2) != 0) {
            str2 = hatchAttachmentAudioJson.audio_asset_id;
        }
        if ((i & 4) != 0) {
            str3 = hatchAttachmentAudioJson.title;
        }
        if ((i & 8) != 0) {
            str4 = hatchAttachmentAudioJson.artist;
        }
        if ((i & 16) != 0) {
            str5 = hatchAttachmentAudioJson.cover_art;
        }
        if ((i & 32) != 0) {
            j = hatchAttachmentAudioJson.start_ms;
        }
        return hatchAttachmentAudioJson.copy(str, str2, str3, str4, str5, j);
    }

    public final String component1() {
        return this.audio_cluster_id;
    }

    public final String component2() {
        return this.audio_asset_id;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.artist;
    }

    public final String component5() {
        return this.cover_art;
    }

    public final long component6() {
        return this.start_ms;
    }

    public final String getArtist() {
        return this.artist;
    }

    public final String getAudio_asset_id() {
        return this.audio_asset_id;
    }

    public final String getAudio_cluster_id() {
        return this.audio_cluster_id;
    }

    public final String getCover_art() {
        return this.cover_art;
    }

    public final long getStart_ms() {
        return this.start_ms;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.start_ms, (((((((AnonymousClass001.A0G(this.audio_cluster_id) + AnonymousClass006.A0G(this.audio_asset_id)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.artist)) * 31) + AnonymousClass005.A0H(this.cover_art)) * 31);
    }

    public final HatchAttachmentAudio toDomain() {
        String str = this.audio_cluster_id;
        if (C7BY.A0j(str) || str == null) {
            return null;
        }
        String str2 = this.audio_asset_id;
        if (str2 == null || C7BY.A0j(str2)) {
            str2 = null;
        }
        String str3 = this.title;
        if (str3 == null || C7BY.A0j(str3)) {
            str3 = null;
        }
        String str4 = this.artist;
        if (str4 == null || C7BY.A0j(str4)) {
            str4 = null;
        }
        String str5 = this.cover_art;
        if (str5 == null || C7BY.A0j(str5)) {
            str5 = null;
        }
        return new HatchAttachmentAudio(str, str2, str3, str4, str5, this.start_ms);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchAttachmentAudioJson(String str, String str2, String str3, String str4, String str5, long j, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? 0L : j);
    }

    public /* synthetic */ HatchAttachmentAudioJson(int i, String str, String str2, String str3, String str4, String str5, long j, C2hx c2hx) {
        this.audio_cluster_id = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.audio_asset_id = null;
        } else {
            this.audio_asset_id = str2;
        }
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.artist = null;
        } else {
            this.artist = str4;
        }
        if ((i & 16) == 0) {
            this.cover_art = null;
        } else {
            this.cover_art = str5;
        }
        if ((i & 32) == 0) {
            this.start_ms = 0L;
        } else {
            this.start_ms = j;
        }
    }

    public HatchAttachmentAudioJson() {
        this("", null, null, null, null, 0L);
    }
}
