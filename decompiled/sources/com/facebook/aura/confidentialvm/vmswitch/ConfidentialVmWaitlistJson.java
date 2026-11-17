package com.facebook.aura.confidentialvm.vmswitch;

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
/* loaded from: classes.dex */
public final class ConfidentialVmWaitlistJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean show_cvm_waitlist;
    public final String status;

    public final class Companion {
        public final C9hr<ConfidentialVmWaitlistJson> serializer() {
            return ConfidentialVmWaitlistJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_vmswitch_vmswitch(ConfidentialVmWaitlistJson confidentialVmWaitlistJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || confidentialVmWaitlistJson.status != null) {
            c9j5.AAP(confidentialVmWaitlistJson.status, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || confidentialVmWaitlistJson.show_cvm_waitlist) {
            c9j5.AA7(c9iZ, 1, confidentialVmWaitlistJson.show_cvm_waitlist);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmWaitlistJson) {
                ConfidentialVmWaitlistJson confidentialVmWaitlistJson = (ConfidentialVmWaitlistJson) obj;
                if (!C7384Etj.areEqual(this.status, confidentialVmWaitlistJson.status) || this.show_cvm_waitlist != confidentialVmWaitlistJson.show_cvm_waitlist) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConfidentialVmWaitlistJson copy$default(ConfidentialVmWaitlistJson confidentialVmWaitlistJson, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confidentialVmWaitlistJson.status;
        }
        if ((i & 2) != 0) {
            z = confidentialVmWaitlistJson.show_cvm_waitlist;
        }
        return new ConfidentialVmWaitlistJson(str, z);
    }

    public final String component1() {
        return this.status;
    }

    public final boolean component2() {
        return this.show_cvm_waitlist;
    }

    public final ConfidentialVmWaitlistJson copy(String str, boolean z) {
        return new ConfidentialVmWaitlistJson(str, z);
    }

    public final boolean getShow_cvm_waitlist() {
        return this.show_cvm_waitlist;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass006.A0G(this.status) * 31, this.show_cvm_waitlist);
    }

    public ConfidentialVmWaitlistJson(String str, boolean z) {
        this.status = str;
        this.show_cvm_waitlist = z;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConfidentialVmWaitlistJson(String str, boolean z, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str), AnonymousClass001.A1Q(i, z));
    }

    public /* synthetic */ ConfidentialVmWaitlistJson(int i, String str, boolean z, C2hx c2hx) {
        this.status = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.show_cvm_waitlist = false;
        } else {
            this.show_cvm_waitlist = z;
        }
    }

    public ConfidentialVmWaitlistJson() {
        this(null, false);
    }
}
