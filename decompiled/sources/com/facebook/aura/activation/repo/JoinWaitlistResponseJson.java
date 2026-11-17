package com.facebook.aura.activation.repo;

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
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class JoinWaitlistResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String eligibility_error;
    public final String status;

    public final class Companion {
        public final C9hr<JoinWaitlistResponseJson> serializer() {
            return JoinWaitlistResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(JoinWaitlistResponseJson joinWaitlistResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || joinWaitlistResponseJson.status != null) {
            c9j5.AAP(joinWaitlistResponseJson.status, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || joinWaitlistResponseJson.eligibility_error != null) {
            c9j5.AAP(joinWaitlistResponseJson.eligibility_error, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JoinWaitlistResponseJson) {
                JoinWaitlistResponseJson joinWaitlistResponseJson = (JoinWaitlistResponseJson) obj;
                if (!C7384Etj.areEqual(this.status, joinWaitlistResponseJson.status) || !C7384Etj.areEqual(this.eligibility_error, joinWaitlistResponseJson.eligibility_error)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ JoinWaitlistResponseJson copy$default(JoinWaitlistResponseJson joinWaitlistResponseJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = joinWaitlistResponseJson.status;
        }
        if ((i & 2) != 0) {
            str2 = joinWaitlistResponseJson.eligibility_error;
        }
        return new JoinWaitlistResponseJson(str, str2);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.eligibility_error;
    }

    public final JoinWaitlistResponseJson copy(String str, String str2) {
        return new JoinWaitlistResponseJson(str, str2);
    }

    public final String getEligibility_error() {
        return this.eligibility_error;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.status) * 31) + AnonymousClass005.A0H(this.eligibility_error);
    }

    public JoinWaitlistResponseJson(String str, String str2) {
        this.status = str;
        this.eligibility_error = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ JoinWaitlistResponseJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.status = null;
        } else {
            this.status = str;
        }
        if ((i & 2) == 0) {
            this.eligibility_error = null;
        } else {
            this.eligibility_error = str2;
        }
    }

    public /* synthetic */ JoinWaitlistResponseJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public JoinWaitlistResponseJson() {
        this(null, null);
    }
}
