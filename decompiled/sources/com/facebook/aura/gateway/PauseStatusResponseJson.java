package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PauseStatusResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final PauseStatusErrorJson error;
    public final boolean locked;
    public final PauseStatusPayloadJson result;

    public final class Companion {
        public final C9hr<PauseStatusResponseJson> serializer() {
            return PauseStatusResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(PauseStatusResponseJson pauseStatusResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || pauseStatusResponseJson.result != null) {
            c9j5.AAP(pauseStatusResponseJson.result, PauseStatusPayloadJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || pauseStatusResponseJson.locked) {
            c9j5.AA7(c9iZ, 1, pauseStatusResponseJson.locked);
        }
        if (zAfR || pauseStatusResponseJson.error != null) {
            c9j5.AAP(pauseStatusResponseJson.error, PauseStatusErrorJson$$serializer.INSTANCE, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PauseStatusResponseJson) {
                PauseStatusResponseJson pauseStatusResponseJson = (PauseStatusResponseJson) obj;
                if (!C7384Etj.areEqual(this.result, pauseStatusResponseJson.result) || this.locked != pauseStatusResponseJson.locked || !C7384Etj.areEqual(this.error, pauseStatusResponseJson.error)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PauseStatusResponseJson copy$default(PauseStatusResponseJson pauseStatusResponseJson, PauseStatusPayloadJson pauseStatusPayloadJson, boolean z, PauseStatusErrorJson pauseStatusErrorJson, int i, Object obj) {
        if ((i & 1) != 0) {
            pauseStatusPayloadJson = pauseStatusResponseJson.result;
        }
        if ((i & 2) != 0) {
            z = pauseStatusResponseJson.locked;
        }
        if ((i & 4) != 0) {
            pauseStatusErrorJson = pauseStatusResponseJson.error;
        }
        return new PauseStatusResponseJson(pauseStatusPayloadJson, z, pauseStatusErrorJson);
    }

    public final PauseStatusPayloadJson component1() {
        return this.result;
    }

    public final boolean component2() {
        return this.locked;
    }

    public final PauseStatusErrorJson component3() {
        return this.error;
    }

    public final PauseStatusResponseJson copy(PauseStatusPayloadJson pauseStatusPayloadJson, boolean z, PauseStatusErrorJson pauseStatusErrorJson) {
        return new PauseStatusResponseJson(pauseStatusPayloadJson, z, pauseStatusErrorJson);
    }

    public final PauseStatusErrorJson getError() {
        return this.error;
    }

    public final boolean getLocked() {
        return this.locked;
    }

    public final PauseStatusPayloadJson getResult() {
        return this.result;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass006.A0D(this.result) * 31, this.locked) + C3cH.A02(this.error);
    }

    public final boolean pausedOrFlat() {
        PauseStatusPayloadJson pauseStatusPayloadJson = this.result;
        return pauseStatusPayloadJson != null ? pauseStatusPayloadJson.locked : this.locked;
    }

    public PauseStatusResponseJson(PauseStatusPayloadJson pauseStatusPayloadJson, boolean z, PauseStatusErrorJson pauseStatusErrorJson) {
        this.result = pauseStatusPayloadJson;
        this.locked = z;
        this.error = pauseStatusErrorJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PauseStatusResponseJson(int i, PauseStatusPayloadJson pauseStatusPayloadJson, boolean z, PauseStatusErrorJson pauseStatusErrorJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.result = null;
        } else {
            this.result = pauseStatusPayloadJson;
        }
        if ((i & 2) == 0) {
            this.locked = false;
        } else {
            this.locked = z;
        }
        if ((i & 4) == 0) {
            this.error = null;
        } else {
            this.error = pauseStatusErrorJson;
        }
    }

    public /* synthetic */ PauseStatusResponseJson(PauseStatusPayloadJson pauseStatusPayloadJson, boolean z, PauseStatusErrorJson pauseStatusErrorJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : pauseStatusPayloadJson, AnonymousClass001.A1Q(i, z), (i & 4) != 0 ? null : pauseStatusErrorJson);
    }

    public PauseStatusResponseJson() {
        this(null, false, null);
    }
}
