package com.facebook.aura.spaces.share;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SpaceShareLinkAudienceResponseJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final SpaceShareLinkAudienceJson audience;

    public final class Companion {
        public final C9hr<SpaceShareLinkAudienceResponseJson> serializer() {
            return SpaceShareLinkAudienceResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_share_share(SpaceShareLinkAudienceResponseJson spaceShareLinkAudienceResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || spaceShareLinkAudienceResponseJson.audience != null) {
            c9j5.AAP(spaceShareLinkAudienceResponseJson.audience, SpaceShareLinkAudienceJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SpaceShareLinkAudienceResponseJson) && C7384Etj.areEqual(this.audience, ((SpaceShareLinkAudienceResponseJson) obj).audience));
    }

    public static /* synthetic */ SpaceShareLinkAudienceResponseJson copy$default(SpaceShareLinkAudienceResponseJson spaceShareLinkAudienceResponseJson, SpaceShareLinkAudienceJson spaceShareLinkAudienceJson, int i, Object obj) {
        if ((i & 1) != 0) {
            spaceShareLinkAudienceJson = spaceShareLinkAudienceResponseJson.audience;
        }
        return new SpaceShareLinkAudienceResponseJson(spaceShareLinkAudienceJson);
    }

    public final SpaceShareLinkAudienceJson component1() {
        return this.audience;
    }

    public final SpaceShareLinkAudienceResponseJson copy(SpaceShareLinkAudienceJson spaceShareLinkAudienceJson) {
        return new SpaceShareLinkAudienceResponseJson(spaceShareLinkAudienceJson);
    }

    public final SpaceShareLinkAudienceJson getAudience() {
        return this.audience;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.audience);
    }

    public /* synthetic */ SpaceShareLinkAudienceResponseJson(int i, SpaceShareLinkAudienceJson spaceShareLinkAudienceJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.audience = null;
        } else {
            this.audience = spaceShareLinkAudienceJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public SpaceShareLinkAudienceResponseJson(SpaceShareLinkAudienceJson spaceShareLinkAudienceJson) {
        this.audience = spaceShareLinkAudienceJson;
    }

    public /* synthetic */ SpaceShareLinkAudienceResponseJson(SpaceShareLinkAudienceJson spaceShareLinkAudienceJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : spaceShareLinkAudienceJson);
    }

    public SpaceShareLinkAudienceResponseJson() {
        this(null);
    }
}
