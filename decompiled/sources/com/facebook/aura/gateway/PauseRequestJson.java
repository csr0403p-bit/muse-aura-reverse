package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
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
public final class PauseRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Integer grace_period_secs;
    public final String passphrase_b64;

    public final class Companion {
        public final C9hr<PauseRequestJson> serializer() {
            return PauseRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PauseRequestJson(String str, Integer num) {
        C7384Etj.A0Y(str, 0);
        this.passphrase_b64 = str;
        this.grace_period_secs = num;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(PauseRequestJson pauseRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(pauseRequestJson.passphrase_b64, c9iZ, 0);
        if (c9j5.AfR() || pauseRequestJson.grace_period_secs != null) {
            c9j5.AAP(pauseRequestJson.grace_period_secs, C07729ii.A00, c9iZ, 1);
        }
    }

    public final PauseRequestJson copy(String str, Integer num) {
        C7384Etj.A0Y(str, 0);
        return new PauseRequestJson(str, num);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PauseRequestJson) {
                PauseRequestJson pauseRequestJson = (PauseRequestJson) obj;
                if (!C7384Etj.areEqual(this.passphrase_b64, pauseRequestJson.passphrase_b64) || !C7384Etj.areEqual(this.grace_period_secs, pauseRequestJson.grace_period_secs)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PauseRequestJson copy$default(PauseRequestJson pauseRequestJson, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pauseRequestJson.passphrase_b64;
        }
        if ((i & 2) != 0) {
            num = pauseRequestJson.grace_period_secs;
        }
        C7384Etj.A0Y(str, 0);
        return new PauseRequestJson(str, num);
    }

    public final String component1() {
        return this.passphrase_b64;
    }

    public final Integer component2() {
        return this.grace_period_secs;
    }

    public final Integer getGrace_period_secs() {
        return this.grace_period_secs;
    }

    public final String getPassphrase_b64() {
        return this.passphrase_b64;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.passphrase_b64) + AnonymousClass006.A0D(this.grace_period_secs);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PauseRequestJson(int i, String str, Integer num, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(PauseRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.passphrase_b64 = str;
        this.grace_period_secs = (i & 2) == 0 ? null : num;
    }

    public /* synthetic */ PauseRequestJson(String str, Integer num, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : num);
    }
}
