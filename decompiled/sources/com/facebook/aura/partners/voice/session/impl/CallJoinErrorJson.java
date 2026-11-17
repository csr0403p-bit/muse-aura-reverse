package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.json.HatchEnvelopeError;
import com.facebook.aura.json.HatchEnvelopeError$$serializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CallJoinErrorJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String code;
    public final HatchEnvelopeError error;

    public final class Companion {
        public final C9hr<CallJoinErrorJson> serializer() {
            return CallJoinErrorJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(CallJoinErrorJson callJoinErrorJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || callJoinErrorJson.error != null) {
            c9j5.AAP(callJoinErrorJson.error, HatchEnvelopeError$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || callJoinErrorJson.code != null) {
            c9j5.AAP(callJoinErrorJson.code, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallJoinErrorJson) {
                CallJoinErrorJson callJoinErrorJson = (CallJoinErrorJson) obj;
                if (!C7384Etj.areEqual(this.error, callJoinErrorJson.error) || !C7384Etj.areEqual(this.code, callJoinErrorJson.code)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CallJoinErrorJson copy$default(CallJoinErrorJson callJoinErrorJson, HatchEnvelopeError hatchEnvelopeError, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchEnvelopeError = callJoinErrorJson.error;
        }
        if ((i & 2) != 0) {
            str = callJoinErrorJson.code;
        }
        return new CallJoinErrorJson(hatchEnvelopeError, str);
    }

    public final HatchEnvelopeError component1() {
        return this.error;
    }

    public final String component2() {
        return this.code;
    }

    public final CallJoinErrorJson copy(HatchEnvelopeError hatchEnvelopeError, String str) {
        return new CallJoinErrorJson(hatchEnvelopeError, str);
    }

    public final String getCode() {
        return this.code;
    }

    public final HatchEnvelopeError getError() {
        return this.error;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.error) * 31) + AnonymousClass005.A0H(this.code);
    }

    public CallJoinErrorJson(HatchEnvelopeError hatchEnvelopeError, String str) {
        this.error = hatchEnvelopeError;
        this.code = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CallJoinErrorJson(int i, HatchEnvelopeError hatchEnvelopeError, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.error = null;
        } else {
            this.error = hatchEnvelopeError;
        }
        if ((i & 2) == 0) {
            this.code = null;
        } else {
            this.code = str;
        }
    }

    public /* synthetic */ CallJoinErrorJson(HatchEnvelopeError hatchEnvelopeError, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? null : hatchEnvelopeError, (i & 2) != 0 ? null : str);
    }

    public CallJoinErrorJson() {
        this(null, null);
    }
}
