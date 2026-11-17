package com.facebook.aura.partners.voice.session.impl;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CallJoinResultJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String payload_b64;

    public final class Companion {
        public final C9hr<CallJoinResultJson> serializer() {
            return CallJoinResultJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(CallJoinResultJson callJoinResultJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(callJoinResultJson.payload_b64)) {
            c9j5.AAV(callJoinResultJson.payload_b64, c9iZ, 0);
        }
    }

    public final CallJoinResultJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new CallJoinResultJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CallJoinResultJson) && C7384Etj.areEqual(this.payload_b64, ((CallJoinResultJson) obj).payload_b64));
    }

    public static /* synthetic */ CallJoinResultJson copy$default(CallJoinResultJson callJoinResultJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callJoinResultJson.payload_b64;
        }
        C7384Etj.A0Y(str, 0);
        return new CallJoinResultJson(str);
    }

    public final String component1() {
        return this.payload_b64;
    }

    public final String getPayload_b64() {
        return this.payload_b64;
    }

    public int hashCode() {
        return this.payload_b64.hashCode();
    }

    public /* synthetic */ CallJoinResultJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.payload_b64 = "";
        } else {
            this.payload_b64 = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public CallJoinResultJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.payload_b64 = str;
    }

    public /* synthetic */ CallJoinResultJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public CallJoinResultJson() {
        this("");
    }
}
