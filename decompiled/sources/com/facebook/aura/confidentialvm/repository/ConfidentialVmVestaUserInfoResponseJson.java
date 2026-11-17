package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ConfidentialVmVestaUserInfoResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Integer attempts_remaining;
    public final boolean is_registered;
    public final Integer login_timeout_remaining_secs;

    public final class Companion {
        public final C9hr<ConfidentialVmVestaUserInfoResponseJson> serializer() {
            return ConfidentialVmVestaUserInfoResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_repository_repository(ConfidentialVmVestaUserInfoResponseJson confidentialVmVestaUserInfoResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AA7(c9iZ, 0, confidentialVmVestaUserInfoResponseJson.is_registered);
        boolean zAfR = c9j5.AfR();
        if (zAfR || confidentialVmVestaUserInfoResponseJson.attempts_remaining != null) {
            c9j5.AAP(confidentialVmVestaUserInfoResponseJson.attempts_remaining, C07729ii.A00, c9iZ, 1);
        }
        if (zAfR || confidentialVmVestaUserInfoResponseJson.login_timeout_remaining_secs != null) {
            c9j5.AAP(confidentialVmVestaUserInfoResponseJson.login_timeout_remaining_secs, C07729ii.A00, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmVestaUserInfoResponseJson) {
                ConfidentialVmVestaUserInfoResponseJson confidentialVmVestaUserInfoResponseJson = (ConfidentialVmVestaUserInfoResponseJson) obj;
                if (this.is_registered != confidentialVmVestaUserInfoResponseJson.is_registered || !C7384Etj.areEqual(this.attempts_remaining, confidentialVmVestaUserInfoResponseJson.attempts_remaining) || !C7384Etj.areEqual(this.login_timeout_remaining_secs, confidentialVmVestaUserInfoResponseJson.login_timeout_remaining_secs)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConfidentialVmVestaUserInfoResponseJson copy$default(ConfidentialVmVestaUserInfoResponseJson confidentialVmVestaUserInfoResponseJson, boolean z, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = confidentialVmVestaUserInfoResponseJson.is_registered;
        }
        if ((i & 2) != 0) {
            num = confidentialVmVestaUserInfoResponseJson.attempts_remaining;
        }
        if ((i & 4) != 0) {
            num2 = confidentialVmVestaUserInfoResponseJson.login_timeout_remaining_secs;
        }
        return new ConfidentialVmVestaUserInfoResponseJson(z, num, num2);
    }

    public final boolean component1() {
        return this.is_registered;
    }

    public final Integer component2() {
        return this.attempts_remaining;
    }

    public final Integer component3() {
        return this.login_timeout_remaining_secs;
    }

    public final ConfidentialVmVestaUserInfoResponseJson copy(boolean z, Integer num, Integer num2) {
        return new ConfidentialVmVestaUserInfoResponseJson(z, num, num2);
    }

    public final Integer getAttempts_remaining() {
        return this.attempts_remaining;
    }

    public final Integer getLogin_timeout_remaining_secs() {
        return this.login_timeout_remaining_secs;
    }

    public int hashCode() {
        return ((C0KA.A02(this.is_registered) + AnonymousClass006.A0D(this.attempts_remaining)) * 31) + C3cH.A02(this.login_timeout_remaining_secs);
    }

    public final boolean is_registered() {
        return this.is_registered;
    }

    public ConfidentialVmVestaUserInfoResponseJson(boolean z, Integer num, Integer num2) {
        this.is_registered = z;
        this.attempts_remaining = num;
        this.login_timeout_remaining_secs = num2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConfidentialVmVestaUserInfoResponseJson(int i, boolean z, Integer num, Integer num2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ConfidentialVmVestaUserInfoResponseJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.is_registered = z;
        if ((i & 2) == 0) {
            this.attempts_remaining = null;
        } else {
            this.attempts_remaining = num;
        }
        if ((i & 4) == 0) {
            this.login_timeout_remaining_secs = null;
        } else {
            this.login_timeout_remaining_secs = num2;
        }
    }

    public /* synthetic */ ConfidentialVmVestaUserInfoResponseJson(boolean z, Integer num, Integer num2, int i, C06H c06h) {
        this(z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
