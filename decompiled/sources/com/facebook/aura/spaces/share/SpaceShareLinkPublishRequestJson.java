package com.facebook.aura.spaces.share;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SpaceShareLinkPublishRequestJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final SpaceShareLinkAudienceRequestJson audience;
    public final boolean publish_now;

    public final class Companion {
        public final C9hr<SpaceShareLinkPublishRequestJson> serializer() {
            return SpaceShareLinkPublishRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SpaceShareLinkPublishRequestJson(boolean z, SpaceShareLinkAudienceRequestJson spaceShareLinkAudienceRequestJson) {
        C7384Etj.A0Y(spaceShareLinkAudienceRequestJson, 1);
        this.publish_now = z;
        this.audience = spaceShareLinkAudienceRequestJson;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_share_share(SpaceShareLinkPublishRequestJson spaceShareLinkPublishRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AA7(c9iZ, 0, spaceShareLinkPublishRequestJson.publish_now);
        c9j5.AAQ(spaceShareLinkPublishRequestJson.audience, SpaceShareLinkAudienceRequestJson$$serializer.INSTANCE, c9iZ, 1);
    }

    public final SpaceShareLinkPublishRequestJson copy(boolean z, SpaceShareLinkAudienceRequestJson spaceShareLinkAudienceRequestJson) {
        C7384Etj.A0Y(spaceShareLinkAudienceRequestJson, 1);
        return new SpaceShareLinkPublishRequestJson(z, spaceShareLinkAudienceRequestJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceShareLinkPublishRequestJson) {
                SpaceShareLinkPublishRequestJson spaceShareLinkPublishRequestJson = (SpaceShareLinkPublishRequestJson) obj;
                if (this.publish_now != spaceShareLinkPublishRequestJson.publish_now || !C7384Etj.areEqual(this.audience, spaceShareLinkPublishRequestJson.audience)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpaceShareLinkPublishRequestJson copy$default(SpaceShareLinkPublishRequestJson spaceShareLinkPublishRequestJson, boolean z, SpaceShareLinkAudienceRequestJson spaceShareLinkAudienceRequestJson, int i, Object obj) {
        if ((i & 1) != 0) {
            z = spaceShareLinkPublishRequestJson.publish_now;
        }
        if ((i & 2) != 0) {
            spaceShareLinkAudienceRequestJson = spaceShareLinkPublishRequestJson.audience;
        }
        C7384Etj.A0Y(spaceShareLinkAudienceRequestJson, 1);
        return new SpaceShareLinkPublishRequestJson(z, spaceShareLinkAudienceRequestJson);
    }

    public final boolean component1() {
        return this.publish_now;
    }

    public final SpaceShareLinkAudienceRequestJson component2() {
        return this.audience;
    }

    public final SpaceShareLinkAudienceRequestJson getAudience() {
        return this.audience;
    }

    public final boolean getPublish_now() {
        return this.publish_now;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.audience, C0KA.A02(this.publish_now));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpaceShareLinkPublishRequestJson(int i, boolean z, SpaceShareLinkAudienceRequestJson spaceShareLinkAudienceRequestJson, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(SpaceShareLinkPublishRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.publish_now = z;
        this.audience = spaceShareLinkAudienceRequestJson;
    }
}
