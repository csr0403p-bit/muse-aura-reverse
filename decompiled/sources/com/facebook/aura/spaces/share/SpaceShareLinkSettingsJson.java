package com.facebook.aura.spaces.share;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SpaceShareLinkSettingsJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final SpaceShareLinkAudienceJson audience;
    public final Boolean can_publish;
    public final Boolean current_build_published;
    public final String last_synced_at;
    public final Boolean publication_in_progress;
    public final String url;

    public final class Companion {
        public final C9hr<SpaceShareLinkSettingsJson> serializer() {
            return SpaceShareLinkSettingsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ SpaceShareLinkSettingsJson copy$default(SpaceShareLinkSettingsJson spaceShareLinkSettingsJson, String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, SpaceShareLinkAudienceJson spaceShareLinkAudienceJson, int i, Object obj) {
        String str3 = str;
        Boolean bool4 = bool;
        Boolean bool5 = bool2;
        Boolean bool6 = bool3;
        String str4 = str2;
        SpaceShareLinkAudienceJson spaceShareLinkAudienceJson2 = spaceShareLinkAudienceJson;
        if ((i & 1) != 0) {
            str3 = spaceShareLinkSettingsJson.url;
        }
        if ((i & 2) != 0) {
            bool4 = spaceShareLinkSettingsJson.can_publish;
        }
        if ((i & 4) != 0) {
            bool5 = spaceShareLinkSettingsJson.publication_in_progress;
        }
        if ((i & 8) != 0) {
            bool6 = spaceShareLinkSettingsJson.current_build_published;
        }
        if ((i & 16) != 0) {
            str4 = spaceShareLinkSettingsJson.last_synced_at;
        }
        if ((i & 32) != 0) {
            spaceShareLinkAudienceJson2 = spaceShareLinkSettingsJson.audience;
        }
        return new SpaceShareLinkSettingsJson(str3, bool4, bool5, bool6, str4, spaceShareLinkAudienceJson2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_share_share(SpaceShareLinkSettingsJson spaceShareLinkSettingsJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || spaceShareLinkSettingsJson.url != null) {
            c9j5.AAP(spaceShareLinkSettingsJson.url, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || spaceShareLinkSettingsJson.can_publish != null) {
            c9j5.AAP(spaceShareLinkSettingsJson.can_publish, C07839ix.A00, c9iZ, 1);
        }
        if (zAfR || spaceShareLinkSettingsJson.publication_in_progress != null) {
            c9j5.AAP(spaceShareLinkSettingsJson.publication_in_progress, C07839ix.A00, c9iZ, 2);
        }
        if (zAfR || spaceShareLinkSettingsJson.current_build_published != null) {
            c9j5.AAP(spaceShareLinkSettingsJson.current_build_published, C07839ix.A00, c9iZ, 3);
        }
        if (zAfR || spaceShareLinkSettingsJson.last_synced_at != null) {
            c9j5.AAP(spaceShareLinkSettingsJson.last_synced_at, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || spaceShareLinkSettingsJson.audience != null) {
            c9j5.AAP(spaceShareLinkSettingsJson.audience, SpaceShareLinkAudienceJson$$serializer.INSTANCE, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceShareLinkSettingsJson) {
                SpaceShareLinkSettingsJson spaceShareLinkSettingsJson = (SpaceShareLinkSettingsJson) obj;
                if (!C7384Etj.areEqual(this.url, spaceShareLinkSettingsJson.url) || !C7384Etj.areEqual(this.can_publish, spaceShareLinkSettingsJson.can_publish) || !C7384Etj.areEqual(this.publication_in_progress, spaceShareLinkSettingsJson.publication_in_progress) || !C7384Etj.areEqual(this.current_build_published, spaceShareLinkSettingsJson.current_build_published) || !C7384Etj.areEqual(this.last_synced_at, spaceShareLinkSettingsJson.last_synced_at) || !C7384Etj.areEqual(this.audience, spaceShareLinkSettingsJson.audience)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.url;
    }

    public final Boolean component2() {
        return this.can_publish;
    }

    public final Boolean component3() {
        return this.publication_in_progress;
    }

    public final Boolean component4() {
        return this.current_build_published;
    }

    public final String component5() {
        return this.last_synced_at;
    }

    public final SpaceShareLinkAudienceJson component6() {
        return this.audience;
    }

    public final SpaceShareLinkSettingsJson copy(String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, SpaceShareLinkAudienceJson spaceShareLinkAudienceJson) {
        return new SpaceShareLinkSettingsJson(str, bool, bool2, bool3, str2, spaceShareLinkAudienceJson);
    }

    public final SpaceShareLinkAudienceJson getAudience() {
        return this.audience;
    }

    public final Boolean getCan_publish() {
        return this.can_publish;
    }

    public final Boolean getCurrent_build_published() {
        return this.current_build_published;
    }

    public final String getLast_synced_at() {
        return this.last_synced_at;
    }

    public final Boolean getPublication_in_progress() {
        return this.publication_in_progress;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((((AnonymousClass006.A0G(this.url) * 31) + AnonymousClass006.A0D(this.can_publish)) * 31) + AnonymousClass006.A0D(this.publication_in_progress)) * 31) + AnonymousClass006.A0D(this.current_build_published)) * 31) + AnonymousClass006.A0G(this.last_synced_at)) * 31) + C3cH.A02(this.audience);
    }

    public /* synthetic */ SpaceShareLinkSettingsJson(int i, String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, SpaceShareLinkAudienceJson spaceShareLinkAudienceJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.url = null;
        } else {
            this.url = str;
        }
        if ((i & 2) == 0) {
            this.can_publish = null;
        } else {
            this.can_publish = bool;
        }
        if ((i & 4) == 0) {
            this.publication_in_progress = null;
        } else {
            this.publication_in_progress = bool2;
        }
        if ((i & 8) == 0) {
            this.current_build_published = null;
        } else {
            this.current_build_published = bool3;
        }
        if ((i & 16) == 0) {
            this.last_synced_at = null;
        } else {
            this.last_synced_at = str2;
        }
        if ((i & 32) == 0) {
            this.audience = null;
        } else {
            this.audience = spaceShareLinkAudienceJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public SpaceShareLinkSettingsJson(String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, SpaceShareLinkAudienceJson spaceShareLinkAudienceJson) {
        this.url = str;
        this.can_publish = bool;
        this.publication_in_progress = bool2;
        this.current_build_published = bool3;
        this.last_synced_at = str2;
        this.audience = spaceShareLinkAudienceJson;
    }

    public /* synthetic */ SpaceShareLinkSettingsJson(String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, SpaceShareLinkAudienceJson spaceShareLinkAudienceJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : spaceShareLinkAudienceJson);
    }

    public SpaceShareLinkSettingsJson() {
        this(null, null, null, null, null, null);
    }
}
