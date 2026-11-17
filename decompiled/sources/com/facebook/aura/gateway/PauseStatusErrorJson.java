package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PauseStatusErrorJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String message;

    public final class Companion {
        public final C9hr<PauseStatusErrorJson> serializer() {
            return PauseStatusErrorJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(PauseStatusErrorJson pauseStatusErrorJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || pauseStatusErrorJson.message != null) {
            c9j5.AAP(pauseStatusErrorJson.message, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PauseStatusErrorJson) && C7384Etj.areEqual(this.message, ((PauseStatusErrorJson) obj).message));
    }

    public static /* synthetic */ PauseStatusErrorJson copy$default(PauseStatusErrorJson pauseStatusErrorJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pauseStatusErrorJson.message;
        }
        return new PauseStatusErrorJson(str);
    }

    public final String component1() {
        return this.message;
    }

    public final PauseStatusErrorJson copy(String str) {
        return new PauseStatusErrorJson(str);
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.message);
    }

    public /* synthetic */ PauseStatusErrorJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public PauseStatusErrorJson(String str) {
        this.message = str;
    }

    public /* synthetic */ PauseStatusErrorJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public PauseStatusErrorJson() {
        this(null);
    }
}
