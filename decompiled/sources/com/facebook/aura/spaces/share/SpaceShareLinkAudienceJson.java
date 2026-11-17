package com.facebook.aura.spaces.share;

import X.AbstractC5321DgF;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes2.dex */
public final class SpaceShareLinkAudienceJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final JsonElement audience_revision;
    public final Map<String, String> recipient_permissions;
    public final List<String> recipient_principals;
    public final String visibility;

    public final class Companion {
        public final C9hr<SpaceShareLinkAudienceJson> serializer() {
            return SpaceShareLinkAudienceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1U(num, null, null, AbstractC5321DgF.A02(num, SpaceShareLinkAudienceJson$Companion$$childSerializers$1.INSTANCE), SpaceShareLinkAudienceJson$Companion$$childSerializers$2.INSTANCE);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceShareLinkAudienceJson) {
                SpaceShareLinkAudienceJson spaceShareLinkAudienceJson = (SpaceShareLinkAudienceJson) obj;
                if (!C7384Etj.areEqual(this.visibility, spaceShareLinkAudienceJson.visibility) || !C7384Etj.areEqual(this.audience_revision, spaceShareLinkAudienceJson.audience_revision) || !C7384Etj.areEqual(this.recipient_principals, spaceShareLinkAudienceJson.recipient_principals) || !C7384Etj.areEqual(this.recipient_permissions, spaceShareLinkAudienceJson.recipient_permissions)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpaceShareLinkAudienceJson copy$default(SpaceShareLinkAudienceJson spaceShareLinkAudienceJson, String str, JsonElement jsonElement, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spaceShareLinkAudienceJson.visibility;
        }
        if ((i & 2) != 0) {
            jsonElement = spaceShareLinkAudienceJson.audience_revision;
        }
        if ((i & 4) != 0) {
            list = spaceShareLinkAudienceJson.recipient_principals;
        }
        if ((i & 8) != 0) {
            map = spaceShareLinkAudienceJson.recipient_permissions;
        }
        return new SpaceShareLinkAudienceJson(str, jsonElement, list, map);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_share_share(SpaceShareLinkAudienceJson spaceShareLinkAudienceJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || spaceShareLinkAudienceJson.visibility != null) {
            c9j5.AAP(spaceShareLinkAudienceJson.visibility, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || spaceShareLinkAudienceJson.audience_revision != null) {
            c9j5.AAP(spaceShareLinkAudienceJson.audience_revision, JsonElementSerializer.A00, c9iZ, 1);
        }
        if (zAfR || spaceShareLinkAudienceJson.recipient_principals != null) {
            c9j5.AAP(spaceShareLinkAudienceJson.recipient_principals, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || spaceShareLinkAudienceJson.recipient_permissions != null) {
            c9j5.AAP(spaceShareLinkAudienceJson.recipient_permissions, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
    }

    public final String component1() {
        return this.visibility;
    }

    public final JsonElement component2() {
        return this.audience_revision;
    }

    public final List<String> component3() {
        return this.recipient_principals;
    }

    public final Map<String, String> component4() {
        return this.recipient_permissions;
    }

    public final SpaceShareLinkAudienceJson copy(String str, JsonElement jsonElement, List<String> list, Map<String, String> map) {
        return new SpaceShareLinkAudienceJson(str, jsonElement, list, map);
    }

    public final JsonElement getAudience_revision() {
        return this.audience_revision;
    }

    public final Map<String, String> getRecipient_permissions() {
        return this.recipient_permissions;
    }

    public final List<String> getRecipient_principals() {
        return this.recipient_principals;
    }

    public final String getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.visibility) * 31) + AnonymousClass006.A0D(this.audience_revision)) * 31) + AnonymousClass006.A0D(this.recipient_principals)) * 31) + C3cH.A02(this.recipient_permissions);
    }

    public SpaceShareLinkAudienceJson(String str, JsonElement jsonElement, List<String> list, Map<String, String> map) {
        this.visibility = str;
        this.audience_revision = jsonElement;
        this.recipient_principals = list;
        this.recipient_permissions = map;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpaceShareLinkAudienceJson(int i, String str, JsonElement jsonElement, List list, Map map, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.visibility = null;
        } else {
            this.visibility = str;
        }
        if ((i & 2) == 0) {
            this.audience_revision = null;
        } else {
            this.audience_revision = jsonElement;
        }
        if ((i & 4) == 0) {
            this.recipient_principals = null;
        } else {
            this.recipient_principals = list;
        }
        if ((i & 8) == 0) {
            this.recipient_permissions = null;
        } else {
            this.recipient_permissions = map;
        }
    }

    public /* synthetic */ SpaceShareLinkAudienceJson(String str, JsonElement jsonElement, List list, Map map, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : jsonElement, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : map);
    }

    public SpaceShareLinkAudienceJson() {
        this(null, null, null, null);
    }
}
