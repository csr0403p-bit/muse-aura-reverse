package com.facebook.aura.spaces.share;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07839ix;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Serializable
/* loaded from: classes2.dex */
public final class SpaceShareLinkResponseJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final JsonElement error;
    public final Boolean ok;
    public final JsonObject result;

    public final class Companion {
        public final C9hr<SpaceShareLinkResponseJson> serializer() {
            return SpaceShareLinkResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_share_share(SpaceShareLinkResponseJson spaceShareLinkResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || spaceShareLinkResponseJson.ok != null) {
            c9j5.AAP(spaceShareLinkResponseJson.ok, C07839ix.A00, c9iZ, 0);
        }
        if (zAfR || spaceShareLinkResponseJson.error != null) {
            c9j5.AAP(spaceShareLinkResponseJson.error, JsonElementSerializer.A00, c9iZ, 1);
        }
        if (zAfR || spaceShareLinkResponseJson.result != null) {
            c9j5.AAP(spaceShareLinkResponseJson.result, JsonObjectSerializer.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceShareLinkResponseJson) {
                SpaceShareLinkResponseJson spaceShareLinkResponseJson = (SpaceShareLinkResponseJson) obj;
                if (!C7384Etj.areEqual(this.ok, spaceShareLinkResponseJson.ok) || !C7384Etj.areEqual(this.error, spaceShareLinkResponseJson.error) || !C7384Etj.areEqual(this.result, spaceShareLinkResponseJson.result)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpaceShareLinkResponseJson copy$default(SpaceShareLinkResponseJson spaceShareLinkResponseJson, Boolean bool, JsonElement jsonElement, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = spaceShareLinkResponseJson.ok;
        }
        if ((i & 2) != 0) {
            jsonElement = spaceShareLinkResponseJson.error;
        }
        if ((i & 4) != 0) {
            jsonObject = spaceShareLinkResponseJson.result;
        }
        return new SpaceShareLinkResponseJson(bool, jsonElement, jsonObject);
    }

    public final Boolean component1() {
        return this.ok;
    }

    public final JsonElement component2() {
        return this.error;
    }

    public final JsonObject component3() {
        return this.result;
    }

    public final SpaceShareLinkResponseJson copy(Boolean bool, JsonElement jsonElement, JsonObject jsonObject) {
        return new SpaceShareLinkResponseJson(bool, jsonElement, jsonObject);
    }

    public final JsonElement getError() {
        return this.error;
    }

    public final Boolean getOk() {
        return this.ok;
    }

    public final JsonObject getResult() {
        return this.result;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0D(this.ok) * 31) + AnonymousClass006.A0D(this.error)) * 31) + C3cH.A02(this.result);
    }

    public SpaceShareLinkResponseJson(Boolean bool, JsonElement jsonElement, JsonObject jsonObject) {
        this.ok = bool;
        this.error = jsonElement;
        this.result = jsonObject;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpaceShareLinkResponseJson(int i, Boolean bool, JsonElement jsonElement, JsonObject jsonObject, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.ok = null;
        } else {
            this.ok = bool;
        }
        if ((i & 2) == 0) {
            this.error = null;
        } else {
            this.error = jsonElement;
        }
        if ((i & 4) == 0) {
            this.result = null;
        } else {
            this.result = jsonObject;
        }
    }

    public /* synthetic */ SpaceShareLinkResponseJson(Boolean bool, JsonElement jsonElement, JsonObject jsonObject, int i, C06H c06h) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : jsonElement, (i & 4) != 0 ? null : jsonObject);
    }

    public SpaceShareLinkResponseJson() {
        this(null, null, null);
    }
}
