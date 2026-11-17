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
/* loaded from: classes3.dex */
public final class VoicePipelineProfileJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String id;
    public final String label;

    public final class Companion {
        public final C9hr<VoicePipelineProfileJson> serializer() {
            return VoicePipelineProfileJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(VoicePipelineProfileJson voicePipelineProfileJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(voicePipelineProfileJson.id, c9iZ, 0);
        c9j5.AAV(voicePipelineProfileJson.label, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoicePipelineProfileJson) {
                VoicePipelineProfileJson voicePipelineProfileJson = (VoicePipelineProfileJson) obj;
                if (!C7384Etj.areEqual(this.id, voicePipelineProfileJson.id) || !C7384Etj.areEqual(this.label, voicePipelineProfileJson.label)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoicePipelineProfileJson copy$default(VoicePipelineProfileJson voicePipelineProfileJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voicePipelineProfileJson.id;
        }
        if ((i & 2) != 0) {
            str2 = voicePipelineProfileJson.label;
        }
        AnonymousClass003.A0u(str, str2);
        return new VoicePipelineProfileJson(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.label;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.label, AnonymousClass001.A0G(this.id));
    }

    public VoicePipelineProfileJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.label = str2;
    }

    public final VoicePipelineProfileJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new VoicePipelineProfileJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoicePipelineProfileJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(VoicePipelineProfileJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.label = str2;
    }
}
