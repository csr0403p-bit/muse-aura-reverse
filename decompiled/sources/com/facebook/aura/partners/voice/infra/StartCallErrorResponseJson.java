package com.facebook.aura.partners.voice.infra;

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
public final class StartCallErrorResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final StartCallErrorJson error;

    public final class Companion {
        public final C9hr<StartCallErrorResponseJson> serializer() {
            return StartCallErrorResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(StartCallErrorResponseJson startCallErrorResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || startCallErrorResponseJson.error != null) {
            c9j5.AAP(startCallErrorResponseJson.error, StartCallErrorJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof StartCallErrorResponseJson) && C7384Etj.areEqual(this.error, ((StartCallErrorResponseJson) obj).error));
    }

    public static /* synthetic */ StartCallErrorResponseJson copy$default(StartCallErrorResponseJson startCallErrorResponseJson, StartCallErrorJson startCallErrorJson, int i, Object obj) {
        if ((i & 1) != 0) {
            startCallErrorJson = startCallErrorResponseJson.error;
        }
        return new StartCallErrorResponseJson(startCallErrorJson);
    }

    public final StartCallErrorJson component1() {
        return this.error;
    }

    public final StartCallErrorResponseJson copy(StartCallErrorJson startCallErrorJson) {
        return new StartCallErrorResponseJson(startCallErrorJson);
    }

    public final StartCallErrorJson getError() {
        return this.error;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.error);
    }

    public /* synthetic */ StartCallErrorResponseJson(int i, StartCallErrorJson startCallErrorJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.error = null;
        } else {
            this.error = startCallErrorJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public StartCallErrorResponseJson(StartCallErrorJson startCallErrorJson) {
        this.error = startCallErrorJson;
    }

    public /* synthetic */ StartCallErrorResponseJson(StartCallErrorJson startCallErrorJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : startCallErrorJson);
    }

    public StartCallErrorResponseJson() {
        this(null);
    }
}
