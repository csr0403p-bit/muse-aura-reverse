package com.facebook.aura.confidentialvm;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchCvmReplacement;
import com.facebook.aura.gateway.HatchGatewayStateSnapshot;
import com.facebook.aura.user.provider.AuraUserData;

/* loaded from: classes2.dex */
public final class HatchVmAccessInputs extends C06G {
    public final boolean connectionFailed;
    public final boolean credentialReconnectInFlight;
    public final HatchGatewayStateSnapshot gatewayState;
    public final HatchCvmReplacement.Active replacement;
    public final AuraUserData userData;

    public HatchVmAccessInputs(AuraUserData auraUserData, HatchGatewayStateSnapshot hatchGatewayStateSnapshot, boolean z, boolean z2, HatchCvmReplacement.Active active) {
        C7384Etj.A0Y(hatchGatewayStateSnapshot, 1);
        this.userData = auraUserData;
        this.gatewayState = hatchGatewayStateSnapshot;
        this.connectionFailed = z;
        this.credentialReconnectInFlight = z2;
        this.replacement = active;
    }

    public final HatchVmAccessInputs copy(AuraUserData auraUserData, HatchGatewayStateSnapshot hatchGatewayStateSnapshot, boolean z, boolean z2, HatchCvmReplacement.Active active) {
        C7384Etj.A0Y(hatchGatewayStateSnapshot, 1);
        return new HatchVmAccessInputs(auraUserData, hatchGatewayStateSnapshot, z, z2, active);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchVmAccessInputs) {
                HatchVmAccessInputs hatchVmAccessInputs = (HatchVmAccessInputs) obj;
                if (!C7384Etj.areEqual(this.userData, hatchVmAccessInputs.userData) || !C7384Etj.areEqual(this.gatewayState, hatchVmAccessInputs.gatewayState) || this.connectionFailed != hatchVmAccessInputs.connectionFailed || this.credentialReconnectInFlight != hatchVmAccessInputs.credentialReconnectInFlight || !C7384Etj.areEqual(this.replacement, hatchVmAccessInputs.replacement)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchVmAccessInputs copy$default(HatchVmAccessInputs hatchVmAccessInputs, AuraUserData auraUserData, HatchGatewayStateSnapshot hatchGatewayStateSnapshot, boolean z, boolean z2, HatchCvmReplacement.Active active, int i, Object obj) {
        if ((i & 1) != 0) {
            auraUserData = hatchVmAccessInputs.userData;
        }
        if ((i & 2) != 0) {
            hatchGatewayStateSnapshot = hatchVmAccessInputs.gatewayState;
        }
        if ((i & 4) != 0) {
            z = hatchVmAccessInputs.connectionFailed;
        }
        if ((i & 8) != 0) {
            z2 = hatchVmAccessInputs.credentialReconnectInFlight;
        }
        if ((i & 16) != 0) {
            active = hatchVmAccessInputs.replacement;
        }
        return hatchVmAccessInputs.copy(auraUserData, hatchGatewayStateSnapshot, z, z2, active);
    }

    public final AuraUserData component1() {
        return this.userData;
    }

    public final HatchGatewayStateSnapshot component2() {
        return this.gatewayState;
    }

    public final boolean component3() {
        return this.connectionFailed;
    }

    public final boolean component4() {
        return this.credentialReconnectInFlight;
    }

    public final HatchCvmReplacement.Active component5() {
        return this.replacement;
    }

    public final boolean getConnectionFailed() {
        return this.connectionFailed;
    }

    public final boolean getCredentialReconnectInFlight() {
        return this.credentialReconnectInFlight;
    }

    public final HatchGatewayStateSnapshot getGatewayState() {
        return this.gatewayState;
    }

    public final HatchCvmReplacement.Active getReplacement() {
        return this.replacement;
    }

    public final AuraUserData getUserData() {
        return this.userData;
    }

    public int hashCode() {
        return C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.gatewayState, AnonymousClass006.A0D(this.userData) * 31), this.connectionFailed), this.credentialReconnectInFlight) + C3cH.A02(this.replacement);
    }

    public String toString() {
        return super.toString();
    }
}
