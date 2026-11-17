package com.facebook.aura.ccv.nativeflow;

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
public final class HatchLinkingWebAuthCompletionRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String attempt_id;

    public final class Companion {
        public final C9hr<HatchLinkingWebAuthCompletionRequestJson> serializer() {
            return HatchLinkingWebAuthCompletionRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final HatchLinkingWebAuthCompletionRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new HatchLinkingWebAuthCompletionRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchLinkingWebAuthCompletionRequestJson) && C7384Etj.areEqual(this.attempt_id, ((HatchLinkingWebAuthCompletionRequestJson) obj).attempt_id));
    }

    public /* synthetic */ HatchLinkingWebAuthCompletionRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(HatchLinkingWebAuthCompletionRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.attempt_id = str;
    }

    public static /* synthetic */ HatchLinkingWebAuthCompletionRequestJson copy$default(HatchLinkingWebAuthCompletionRequestJson hatchLinkingWebAuthCompletionRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchLinkingWebAuthCompletionRequestJson.attempt_id;
        }
        C7384Etj.A0Y(str, 0);
        return new HatchLinkingWebAuthCompletionRequestJson(str);
    }

    public final String component1() {
        return this.attempt_id;
    }

    public final String getAttempt_id() {
        return this.attempt_id;
    }

    public int hashCode() {
        return this.attempt_id.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public HatchLinkingWebAuthCompletionRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.attempt_id = str;
    }
}
