package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PauseStatusPayloadJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean locked;

    public final class Companion {
        public final C9hr<PauseStatusPayloadJson> serializer() {
            return PauseStatusPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(PauseStatusPayloadJson pauseStatusPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || pauseStatusPayloadJson.locked) {
            c9j5.AA7(c9iZ, 0, pauseStatusPayloadJson.locked);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PauseStatusPayloadJson) && this.locked == ((PauseStatusPayloadJson) obj).locked);
    }

    public static /* synthetic */ PauseStatusPayloadJson copy$default(PauseStatusPayloadJson pauseStatusPayloadJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pauseStatusPayloadJson.locked;
        }
        return new PauseStatusPayloadJson(z);
    }

    public final boolean component1() {
        return this.locked;
    }

    public final PauseStatusPayloadJson copy(boolean z) {
        return new PauseStatusPayloadJson(z);
    }

    public final boolean getLocked() {
        return this.locked;
    }

    public int hashCode() {
        return this.locked ? 1231 : 1237;
    }

    public /* synthetic */ PauseStatusPayloadJson(int i, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.locked = false;
        } else {
            this.locked = z;
        }
    }

    public String toString() {
        return super.toString();
    }

    public PauseStatusPayloadJson(boolean z) {
        this.locked = z;
    }

    public /* synthetic */ PauseStatusPayloadJson(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public PauseStatusPayloadJson() {
        this(false);
    }
}
