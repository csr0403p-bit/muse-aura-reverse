package com.facebook.aura.partners.voice.api;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C8j4;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CallVoicePreviewRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String call_id;
    public final String voice_id;

    public final class Companion {
        public final C9hr<CallVoicePreviewRequestJson> serializer() {
            return CallVoicePreviewRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public CallVoicePreviewRequestJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.voice_id = str;
        this.call_id = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_api_api(CallVoicePreviewRequestJson callVoicePreviewRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(callVoicePreviewRequestJson.voice_id, c9iZ, 0);
        if (c9j5.AfR() || callVoicePreviewRequestJson.call_id != null) {
            c9j5.AAP(callVoicePreviewRequestJson.call_id, C07779iq.A01, c9iZ, 1);
        }
    }

    public final CallVoicePreviewRequestJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new CallVoicePreviewRequestJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallVoicePreviewRequestJson) {
                CallVoicePreviewRequestJson callVoicePreviewRequestJson = (CallVoicePreviewRequestJson) obj;
                if (!C7384Etj.areEqual(this.voice_id, callVoicePreviewRequestJson.voice_id) || !C7384Etj.areEqual(this.call_id, callVoicePreviewRequestJson.call_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CallVoicePreviewRequestJson copy$default(CallVoicePreviewRequestJson callVoicePreviewRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callVoicePreviewRequestJson.voice_id;
        }
        if ((i & 2) != 0) {
            str2 = callVoicePreviewRequestJson.call_id;
        }
        C7384Etj.A0Y(str, 0);
        return new CallVoicePreviewRequestJson(str, str2);
    }

    public final String component1() {
        return this.voice_id;
    }

    public final String component2() {
        return this.call_id;
    }

    public final String getCall_id() {
        return this.call_id;
    }

    public final String getVoice_id() {
        return this.voice_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.voice_id) + AnonymousClass006.A0G(this.call_id);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CallVoicePreviewRequestJson(int i, String str, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(CallVoicePreviewRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.voice_id = str;
        this.call_id = C8j4.A0t(i, str2);
    }

    public /* synthetic */ CallVoicePreviewRequestJson(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
