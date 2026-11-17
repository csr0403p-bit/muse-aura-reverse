package com.facebook.aura.activation.model;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.activation.data.ActivationState;
import com.facebook.aura.user.provider.AuraUserData;

/* loaded from: classes2.dex */
public final class ActivationSnapshot extends C06G {
    public final String ageChoice;
    public final AgeStep ageStep;
    public final boolean canReturnToWaitlist;
    public final ActivationState state;
    public final AuraUserData userData;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivationSnapshot) {
                ActivationSnapshot activationSnapshot = (ActivationSnapshot) obj;
                if (!C7384Etj.areEqual(this.userData, activationSnapshot.userData) || this.state != activationSnapshot.state || this.canReturnToWaitlist != activationSnapshot.canReturnToWaitlist || !C7384Etj.areEqual(this.ageChoice, activationSnapshot.ageChoice) || !C7384Etj.areEqual(this.ageStep, activationSnapshot.ageStep)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivationSnapshot copy$default(ActivationSnapshot activationSnapshot, AuraUserData auraUserData, ActivationState activationState, boolean z, String str, AgeStep ageStep, int i, Object obj) {
        if ((i & 1) != 0) {
            auraUserData = activationSnapshot.userData;
        }
        if ((i & 2) != 0) {
            activationState = activationSnapshot.state;
        }
        if ((i & 4) != 0) {
            z = activationSnapshot.canReturnToWaitlist;
        }
        if ((i & 8) != 0) {
            str = activationSnapshot.ageChoice;
        }
        if ((i & 16) != 0) {
            ageStep = activationSnapshot.ageStep;
        }
        return activationSnapshot.copy(auraUserData, activationState, z, str, ageStep);
    }

    public final AuraUserData component1() {
        return this.userData;
    }

    public final ActivationState component2() {
        return this.state;
    }

    public final boolean component3() {
        return this.canReturnToWaitlist;
    }

    public final String component4() {
        return this.ageChoice;
    }

    public final AgeStep component5() {
        return this.ageStep;
    }

    public final String getAgeChoice() {
        return this.ageChoice;
    }

    public final AgeStep getAgeStep() {
        return this.ageStep;
    }

    public final boolean getCanReturnToWaitlist() {
        return this.canReturnToWaitlist;
    }

    public final ActivationState getState() {
        return this.state;
    }

    public final AuraUserData getUserData() {
        return this.userData;
    }

    public int hashCode() {
        return ((C0KA.A01(AnonymousClass005.A0F(this.state, AnonymousClass005.A0E(this.userData)), this.canReturnToWaitlist) + AnonymousClass006.A0G(this.ageChoice)) * 31) + C3cH.A02(this.ageStep);
    }

    public ActivationSnapshot(AuraUserData auraUserData, ActivationState activationState, boolean z, String str, AgeStep ageStep) {
        AnonymousClass003.A0u(auraUserData, activationState);
        this.userData = auraUserData;
        this.state = activationState;
        this.canReturnToWaitlist = z;
        this.ageChoice = str;
        this.ageStep = ageStep;
    }

    public final ActivationSnapshot copy(AuraUserData auraUserData, ActivationState activationState, boolean z, String str, AgeStep ageStep) {
        AnonymousClass003.A0u(auraUserData, activationState);
        return new ActivationSnapshot(auraUserData, activationState, z, str, ageStep);
    }

    public String toString() {
        return super.toString();
    }
}
