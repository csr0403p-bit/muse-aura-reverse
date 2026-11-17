package com.facebook.aura.partners.voice.api;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CallVoicePreviewResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String status;

    public final class Companion {
        public final C9hr<CallVoicePreviewResponseJson> serializer() {
            return CallVoicePreviewResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final CallVoicePreviewResponseJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new CallVoicePreviewResponseJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CallVoicePreviewResponseJson) && C7384Etj.areEqual(this.status, ((CallVoicePreviewResponseJson) obj).status));
    }

    public /* synthetic */ CallVoicePreviewResponseJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(CallVoicePreviewResponseJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.status = str;
    }

    public static /* synthetic */ CallVoicePreviewResponseJson copy$default(CallVoicePreviewResponseJson callVoicePreviewResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callVoicePreviewResponseJson.status;
        }
        C7384Etj.A0Y(str, 0);
        return new CallVoicePreviewResponseJson(str);
    }

    public final String component1() {
        return this.status;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public CallVoicePreviewResponseJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.status = str;
    }
}
