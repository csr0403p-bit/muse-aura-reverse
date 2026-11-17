package com.facebook.aura.login.nativeflow;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.caa.HatchCaaFlowSource;

/* loaded from: classes2.dex */
public final class OtpFunnel extends C06G {
    public static final int $stable = 0;
    public final boolean isRegistration;
    public final HatchCaaFlowSource source;

    public OtpFunnel(boolean z, HatchCaaFlowSource hatchCaaFlowSource) {
        C7384Etj.A0Y(hatchCaaFlowSource, 1);
        this.isRegistration = z;
        this.source = hatchCaaFlowSource;
    }

    public final OtpFunnel copy(boolean z, HatchCaaFlowSource hatchCaaFlowSource) {
        C7384Etj.A0Y(hatchCaaFlowSource, 1);
        return new OtpFunnel(z, hatchCaaFlowSource);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OtpFunnel) {
                OtpFunnel otpFunnel = (OtpFunnel) obj;
                if (this.isRegistration != otpFunnel.isRegistration || this.source != otpFunnel.source) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ OtpFunnel copy$default(OtpFunnel otpFunnel, boolean z, HatchCaaFlowSource hatchCaaFlowSource, int i, Object obj) {
        if ((i & 1) != 0) {
            z = otpFunnel.isRegistration;
        }
        if ((i & 2) != 0) {
            hatchCaaFlowSource = otpFunnel.source;
        }
        C7384Etj.A0Y(hatchCaaFlowSource, 1);
        return new OtpFunnel(z, hatchCaaFlowSource);
    }

    public final boolean component1() {
        return this.isRegistration;
    }

    public final HatchCaaFlowSource component2() {
        return this.source;
    }

    public final HatchCaaFlowSource getSource() {
        return this.source;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.source, C0KA.A02(this.isRegistration));
    }

    public final boolean isRegistration() {
        return this.isRegistration;
    }

    public String toString() {
        return super.toString();
    }
}
