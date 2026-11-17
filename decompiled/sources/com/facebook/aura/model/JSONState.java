package com.facebook.aura.model;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C60O;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Serializable
/* loaded from: classes3.dex */
public final class JSONState extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final JsonObject data;
    public final long version;

    public final class Companion {
        public final C9hr<JSONState> serializer() {
            return JSONState$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public JSONState(long j, JsonObject jsonObject) {
        C7384Etj.A0Y(jsonObject, 1);
        this.version = j;
        this.data = jsonObject;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(JSONState jSONState, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || jSONState.version != 0) {
            c9j5.AAN(c9iZ, 0, jSONState.version);
        }
        if (zAfR || !C7384Etj.areEqual(jSONState.data, C60O.A1G())) {
            c9j5.AAQ(jSONState.data, JsonObjectSerializer.A01, c9iZ, 1);
        }
    }

    public final JSONState copy(long j, JsonObject jsonObject) {
        C7384Etj.A0Y(jsonObject, 1);
        return new JSONState(j, jsonObject);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JSONState) {
                JSONState jSONState = (JSONState) obj;
                if (this.version != jSONState.version || !C7384Etj.areEqual(this.data, jSONState.data)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ JSONState copy$default(JSONState jSONState, long j, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            j = jSONState.version;
        }
        if ((i & 2) != 0) {
            jsonObject = jSONState.data;
        }
        C7384Etj.A0Y(jsonObject, 1);
        return new JSONState(j, jsonObject);
    }

    public final long component1() {
        return this.version;
    }

    public final JsonObject component2() {
        return this.data;
    }

    public final JsonObject getData() {
        return this.data;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.data, AnonymousClass002.A0A(this.version) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ JSONState(int i, long j, JsonObject jsonObject, C2hx c2hx) {
        this.version = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.data = C60O.A1G();
        } else {
            this.data = jsonObject;
        }
    }

    public /* synthetic */ JSONState(long j, JsonObject jsonObject, int i, C06H c06h) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? C60O.A1G() : jsonObject);
    }

    public JSONState() {
        this(0L, C60O.A1G());
    }
}
