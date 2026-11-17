package com.facebook.aura.spaces.menu;

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
public final class PeerSpaceEnvelopeJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final JsonElement error;
    public final Boolean ok;
    public final JsonObject result;

    public final class Companion {
        public final C9hr<PeerSpaceEnvelopeJson> serializer() {
            return PeerSpaceEnvelopeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_menu_menu(PeerSpaceEnvelopeJson peerSpaceEnvelopeJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || peerSpaceEnvelopeJson.ok != null) {
            c9j5.AAP(peerSpaceEnvelopeJson.ok, C07839ix.A00, c9iZ, 0);
        }
        if (zAfR || peerSpaceEnvelopeJson.error != null) {
            c9j5.AAP(peerSpaceEnvelopeJson.error, JsonElementSerializer.A00, c9iZ, 1);
        }
        if (zAfR || peerSpaceEnvelopeJson.result != null) {
            c9j5.AAP(peerSpaceEnvelopeJson.result, JsonObjectSerializer.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerSpaceEnvelopeJson) {
                PeerSpaceEnvelopeJson peerSpaceEnvelopeJson = (PeerSpaceEnvelopeJson) obj;
                if (!C7384Etj.areEqual(this.ok, peerSpaceEnvelopeJson.ok) || !C7384Etj.areEqual(this.error, peerSpaceEnvelopeJson.error) || !C7384Etj.areEqual(this.result, peerSpaceEnvelopeJson.result)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerSpaceEnvelopeJson copy$default(PeerSpaceEnvelopeJson peerSpaceEnvelopeJson, Boolean bool, JsonElement jsonElement, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = peerSpaceEnvelopeJson.ok;
        }
        if ((i & 2) != 0) {
            jsonElement = peerSpaceEnvelopeJson.error;
        }
        if ((i & 4) != 0) {
            jsonObject = peerSpaceEnvelopeJson.result;
        }
        return new PeerSpaceEnvelopeJson(bool, jsonElement, jsonObject);
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

    public final PeerSpaceEnvelopeJson copy(Boolean bool, JsonElement jsonElement, JsonObject jsonObject) {
        return new PeerSpaceEnvelopeJson(bool, jsonElement, jsonObject);
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

    public PeerSpaceEnvelopeJson(Boolean bool, JsonElement jsonElement, JsonObject jsonObject) {
        this.ok = bool;
        this.error = jsonElement;
        this.result = jsonObject;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerSpaceEnvelopeJson(int i, Boolean bool, JsonElement jsonElement, JsonObject jsonObject, C2hx c2hx) {
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

    public /* synthetic */ PeerSpaceEnvelopeJson(Boolean bool, JsonElement jsonElement, JsonObject jsonObject, int i, C06H c06h) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : jsonElement, (i & 4) != 0 ? null : jsonObject);
    }

    public PeerSpaceEnvelopeJson() {
        this(null, null, null);
    }
}
