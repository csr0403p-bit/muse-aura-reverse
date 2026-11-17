package com.facebook.aura.spaces.share;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes2.dex */
public final class SpaceShareLinkAudienceRequestJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final JsonElement expected_revision;
    public final Map<String, String> recipient_permissions;
    public final List<String> recipient_principals;
    public final String visibility;

    public final class Companion {
        public final C9hr<SpaceShareLinkAudienceRequestJson> serializer() {
            return SpaceShareLinkAudienceRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1U(num, null, null, AbstractC5321DgF.A02(num, SpaceShareLinkAudienceRequestJson$Companion$$childSerializers$1.INSTANCE), SpaceShareLinkAudienceRequestJson$Companion$$childSerializers$2.INSTANCE);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceShareLinkAudienceRequestJson) {
                SpaceShareLinkAudienceRequestJson spaceShareLinkAudienceRequestJson = (SpaceShareLinkAudienceRequestJson) obj;
                if (!C7384Etj.areEqual(this.visibility, spaceShareLinkAudienceRequestJson.visibility) || !C7384Etj.areEqual(this.expected_revision, spaceShareLinkAudienceRequestJson.expected_revision) || !C7384Etj.areEqual(this.recipient_principals, spaceShareLinkAudienceRequestJson.recipient_principals) || !C7384Etj.areEqual(this.recipient_permissions, spaceShareLinkAudienceRequestJson.recipient_permissions)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpaceShareLinkAudienceRequestJson copy$default(SpaceShareLinkAudienceRequestJson spaceShareLinkAudienceRequestJson, String str, JsonElement jsonElement, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spaceShareLinkAudienceRequestJson.visibility;
        }
        if ((i & 2) != 0) {
            jsonElement = spaceShareLinkAudienceRequestJson.expected_revision;
        }
        if ((i & 4) != 0) {
            list = spaceShareLinkAudienceRequestJson.recipient_principals;
        }
        if ((i & 8) != 0) {
            map = spaceShareLinkAudienceRequestJson.recipient_permissions;
        }
        AnonymousClass005.A0x(str, jsonElement, list);
        return new SpaceShareLinkAudienceRequestJson(str, jsonElement, list, map);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_share_share(SpaceShareLinkAudienceRequestJson spaceShareLinkAudienceRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(spaceShareLinkAudienceRequestJson.visibility, c9iZ, 0);
        c9j5.AAQ(spaceShareLinkAudienceRequestJson.expected_revision, JsonElementSerializer.A00, c9iZ, 1);
        c9j5.AAQ(spaceShareLinkAudienceRequestJson.recipient_principals, C3cH.A15(f0cArr, 2), c9iZ, 2);
        if (c9j5.AfR() || spaceShareLinkAudienceRequestJson.recipient_permissions != null) {
            c9j5.AAP(spaceShareLinkAudienceRequestJson.recipient_permissions, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
    }

    public final String component1() {
        return this.visibility;
    }

    public final JsonElement component2() {
        return this.expected_revision;
    }

    public final List<String> component3() {
        return this.recipient_principals;
    }

    public final Map<String, String> component4() {
        return this.recipient_permissions;
    }

    public final JsonElement getExpected_revision() {
        return this.expected_revision;
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
        return AnonymousClass005.A0F(this.recipient_principals, AnonymousClass005.A0F(this.expected_revision, AnonymousClass001.A0G(this.visibility))) + AnonymousClass006.A0D(this.recipient_permissions);
    }

    public SpaceShareLinkAudienceRequestJson(String str, JsonElement jsonElement, List<String> list, Map<String, String> map) {
        AnonymousClass005.A0x(str, jsonElement, list);
        this.visibility = str;
        this.expected_revision = jsonElement;
        this.recipient_principals = list;
        this.recipient_permissions = map;
    }

    public final SpaceShareLinkAudienceRequestJson copy(String str, JsonElement jsonElement, List<String> list, Map<String, String> map) {
        AnonymousClass005.A0x(str, jsonElement, list);
        return new SpaceShareLinkAudienceRequestJson(str, jsonElement, list, map);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpaceShareLinkAudienceRequestJson(int i, String str, JsonElement jsonElement, List list, Map map, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(SpaceShareLinkAudienceRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.visibility = str;
        this.expected_revision = jsonElement;
        this.recipient_principals = list;
        this.recipient_permissions = (i & 8) == 0 ? null : map;
    }

    public /* synthetic */ SpaceShareLinkAudienceRequestJson(String str, JsonElement jsonElement, List list, Map map, int i, C06H c06h) {
        this(str, jsonElement, list, (i & 8) != 0 ? null : map);
    }
}
