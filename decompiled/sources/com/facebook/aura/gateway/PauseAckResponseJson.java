package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PauseAckResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String error;
    public final boolean ok;

    public final class Companion {
        public final C9hr<PauseAckResponseJson> serializer() {
            return PauseAckResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(PauseAckResponseJson pauseAckResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || pauseAckResponseJson.ok) {
            c9j5.AA7(c9iZ, 0, pauseAckResponseJson.ok);
        }
        if (zAfR || pauseAckResponseJson.error != null) {
            c9j5.AAP(pauseAckResponseJson.error, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PauseAckResponseJson) {
                PauseAckResponseJson pauseAckResponseJson = (PauseAckResponseJson) obj;
                if (this.ok != pauseAckResponseJson.ok || !C7384Etj.areEqual(this.error, pauseAckResponseJson.error)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PauseAckResponseJson copy$default(PauseAckResponseJson pauseAckResponseJson, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pauseAckResponseJson.ok;
        }
        if ((i & 2) != 0) {
            str = pauseAckResponseJson.error;
        }
        return new PauseAckResponseJson(z, str);
    }

    public final boolean component1() {
        return this.ok;
    }

    public final String component2() {
        return this.error;
    }

    public final PauseAckResponseJson copy(boolean z, String str) {
        return new PauseAckResponseJson(z, str);
    }

    public final String getError() {
        return this.error;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public int hashCode() {
        return C0KA.A02(this.ok) + AnonymousClass006.A0G(this.error);
    }

    public PauseAckResponseJson(boolean z, String str) {
        this.ok = z;
        this.error = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PauseAckResponseJson(int i, boolean z, String str, C2hx c2hx) {
        this.ok = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.error = null;
        } else {
            this.error = str;
        }
    }

    public /* synthetic */ PauseAckResponseJson(boolean z, String str, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass006.A0s(i, str));
    }

    public PauseAckResponseJson() {
        this(false, null);
    }
}
