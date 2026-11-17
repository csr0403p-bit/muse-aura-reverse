package com.facebook.aura.partners.voice.infra;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class MicStatusRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String call_id;
    public final String mic_status;

    public final class Companion {
        public final C9hr<MicStatusRequestJson> serializer() {
            return MicStatusRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(MicStatusRequestJson micStatusRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(micStatusRequestJson.call_id, c9iZ, 0);
        c9j5.AAV(micStatusRequestJson.mic_status, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MicStatusRequestJson) {
                MicStatusRequestJson micStatusRequestJson = (MicStatusRequestJson) obj;
                if (!C7384Etj.areEqual(this.call_id, micStatusRequestJson.call_id) || !C7384Etj.areEqual(this.mic_status, micStatusRequestJson.mic_status)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MicStatusRequestJson copy$default(MicStatusRequestJson micStatusRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = micStatusRequestJson.call_id;
        }
        if ((i & 2) != 0) {
            str2 = micStatusRequestJson.mic_status;
        }
        AnonymousClass003.A0u(str, str2);
        return new MicStatusRequestJson(str, str2);
    }

    public final String component1() {
        return this.call_id;
    }

    public final String component2() {
        return this.mic_status;
    }

    public final String getCall_id() {
        return this.call_id;
    }

    public final String getMic_status() {
        return this.mic_status;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.mic_status, AnonymousClass001.A0G(this.call_id));
    }

    public MicStatusRequestJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.call_id = str;
        this.mic_status = str2;
    }

    public final MicStatusRequestJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new MicStatusRequestJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MicStatusRequestJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(MicStatusRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.call_id = str;
        this.mic_status = str2;
    }
}
