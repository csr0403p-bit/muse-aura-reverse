package com.facebook.aura.composer.dictation.voyager;

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
public final class VoyagerAsrEndStreamJson extends C06G {
    public static final Companion Companion = new Companion();
    public final JsonObject endStream;

    public final class Companion {
        public final C9hr<VoyagerAsrEndStreamJson> serializer() {
            return VoyagerAsrEndStreamJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_voyager_voyager(VoyagerAsrEndStreamJson voyagerAsrEndStreamJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C7384Etj.areEqual(voyagerAsrEndStreamJson.endStream, C60O.A1G())) {
            c9j5.AAQ(voyagerAsrEndStreamJson.endStream, JsonObjectSerializer.A01, c9iZ, 0);
        }
    }

    public final VoyagerAsrEndStreamJson copy(JsonObject jsonObject) {
        C7384Etj.A0Y(jsonObject, 0);
        return new VoyagerAsrEndStreamJson(jsonObject);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof VoyagerAsrEndStreamJson) && C7384Etj.areEqual(this.endStream, ((VoyagerAsrEndStreamJson) obj).endStream));
    }

    public static /* synthetic */ VoyagerAsrEndStreamJson copy$default(VoyagerAsrEndStreamJson voyagerAsrEndStreamJson, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonObject = voyagerAsrEndStreamJson.endStream;
        }
        C7384Etj.A0Y(jsonObject, 0);
        return new VoyagerAsrEndStreamJson(jsonObject);
    }

    public final JsonObject component1() {
        return this.endStream;
    }

    public final JsonObject getEndStream() {
        return this.endStream;
    }

    public int hashCode() {
        return this.endStream.hashCode();
    }

    public /* synthetic */ VoyagerAsrEndStreamJson(int i, JsonObject jsonObject, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.endStream = C60O.A1G();
        } else {
            this.endStream = jsonObject;
        }
    }

    public String toString() {
        return super.toString();
    }

    public VoyagerAsrEndStreamJson(JsonObject jsonObject) {
        C7384Etj.A0Y(jsonObject, 0);
        this.endStream = jsonObject;
    }

    public /* synthetic */ VoyagerAsrEndStreamJson(JsonObject jsonObject, int i, C06H c06h) {
        this((i & 1) != 0 ? C60O.A1G() : jsonObject);
    }

    public VoyagerAsrEndStreamJson() {
        this(C60O.A1G());
    }
}
