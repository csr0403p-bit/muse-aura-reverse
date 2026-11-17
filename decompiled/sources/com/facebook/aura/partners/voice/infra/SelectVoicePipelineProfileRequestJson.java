package com.facebook.aura.partners.voice.infra;

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
public final class SelectVoicePipelineProfileRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String profile_id;

    public final class Companion {
        public final C9hr<SelectVoicePipelineProfileRequestJson> serializer() {
            return SelectVoicePipelineProfileRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final SelectVoicePipelineProfileRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new SelectVoicePipelineProfileRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SelectVoicePipelineProfileRequestJson) && C7384Etj.areEqual(this.profile_id, ((SelectVoicePipelineProfileRequestJson) obj).profile_id));
    }

    public /* synthetic */ SelectVoicePipelineProfileRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SelectVoicePipelineProfileRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.profile_id = str;
    }

    public static /* synthetic */ SelectVoicePipelineProfileRequestJson copy$default(SelectVoicePipelineProfileRequestJson selectVoicePipelineProfileRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectVoicePipelineProfileRequestJson.profile_id;
        }
        C7384Etj.A0Y(str, 0);
        return new SelectVoicePipelineProfileRequestJson(str);
    }

    public final String component1() {
        return this.profile_id;
    }

    public final String getProfile_id() {
        return this.profile_id;
    }

    public int hashCode() {
        return this.profile_id.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public SelectVoicePipelineProfileRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.profile_id = str;
    }
}
