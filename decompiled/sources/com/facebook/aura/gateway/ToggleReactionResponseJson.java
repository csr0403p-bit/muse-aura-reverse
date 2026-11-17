package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;

@Serializable
/* loaded from: classes3.dex */
public final class ToggleReactionResponseJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final boolean ok;
    public final JsonArray reactions;

    public final class Companion {
        public final C9hr<ToggleReactionResponseJson> serializer() {
            return ToggleReactionResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ToggleReactionResponseJson(boolean z, JsonArray jsonArray) {
        C7384Etj.A0Y(jsonArray, 1);
        this.ok = z;
        this.reactions = jsonArray;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ToggleReactionResponseJson toggleReactionResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || toggleReactionResponseJson.ok) {
            c9j5.AA7(c9iZ, 0, toggleReactionResponseJson.ok);
        }
        if (zAfR || !C7384Etj.areEqual(toggleReactionResponseJson.reactions, new JsonArray(C0881AGi.A00))) {
            c9j5.AAQ(toggleReactionResponseJson.reactions, JsonArraySerializer.A01, c9iZ, 1);
        }
    }

    public final ToggleReactionResponseJson copy(boolean z, JsonArray jsonArray) {
        C7384Etj.A0Y(jsonArray, 1);
        return new ToggleReactionResponseJson(z, jsonArray);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ToggleReactionResponseJson) {
                ToggleReactionResponseJson toggleReactionResponseJson = (ToggleReactionResponseJson) obj;
                if (this.ok != toggleReactionResponseJson.ok || !C7384Etj.areEqual(this.reactions, toggleReactionResponseJson.reactions)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ToggleReactionResponseJson copy$default(ToggleReactionResponseJson toggleReactionResponseJson, boolean z, JsonArray jsonArray, int i, Object obj) {
        if ((i & 1) != 0) {
            z = toggleReactionResponseJson.ok;
        }
        if ((i & 2) != 0) {
            jsonArray = toggleReactionResponseJson.reactions;
        }
        C7384Etj.A0Y(jsonArray, 1);
        return new ToggleReactionResponseJson(z, jsonArray);
    }

    public final boolean component1() {
        return this.ok;
    }

    public final JsonArray component2() {
        return this.reactions;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final JsonArray getReactions() {
        return this.reactions;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.reactions, C0KA.A02(this.ok));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ToggleReactionResponseJson(int i, boolean z, JsonArray jsonArray, C2hx c2hx) {
        this.ok = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.reactions = new JsonArray(C0881AGi.A00);
        } else {
            this.reactions = jsonArray;
        }
    }

    public /* synthetic */ ToggleReactionResponseJson(boolean z, JsonArray jsonArray, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? new JsonArray(C0881AGi.A00) : jsonArray);
    }

    public ToggleReactionResponseJson() {
        this(false, new JsonArray(C0881AGi.A00));
    }
}
