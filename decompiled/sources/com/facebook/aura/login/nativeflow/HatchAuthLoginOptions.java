package com.facebook.aura.login.nativeflow;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchAuthLoginOptions extends C06G {
    public final String authState;
    public final HatchAuthFlow flow;
    public final HatchNtpSourceApp ntpSourceApp;
    public final HatchPasskeyRequestOptions passkeyOptions;
    public final boolean passwordLoginAvailable;
    public final HatchAuthLoginOptionsState state;

    public HatchAuthLoginOptions(HatchAuthLoginOptionsState hatchAuthLoginOptionsState, String str, boolean z, HatchAuthFlow hatchAuthFlow, HatchNtpSourceApp hatchNtpSourceApp, HatchPasskeyRequestOptions hatchPasskeyRequestOptions) {
        C7384Etj.A0Y(hatchAuthLoginOptionsState, 0);
        this.state = hatchAuthLoginOptionsState;
        this.authState = str;
        this.passwordLoginAvailable = z;
        this.flow = hatchAuthFlow;
        this.ntpSourceApp = hatchNtpSourceApp;
        this.passkeyOptions = hatchPasskeyRequestOptions;
    }

    public final HatchAuthLoginOptions copy(HatchAuthLoginOptionsState hatchAuthLoginOptionsState, String str, boolean z, HatchAuthFlow hatchAuthFlow, HatchNtpSourceApp hatchNtpSourceApp, HatchPasskeyRequestOptions hatchPasskeyRequestOptions) {
        C7384Etj.A0Y(hatchAuthLoginOptionsState, 0);
        return new HatchAuthLoginOptions(hatchAuthLoginOptionsState, str, z, hatchAuthFlow, hatchNtpSourceApp, hatchPasskeyRequestOptions);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAuthLoginOptions) {
                HatchAuthLoginOptions hatchAuthLoginOptions = (HatchAuthLoginOptions) obj;
                if (this.state != hatchAuthLoginOptions.state || !C7384Etj.areEqual(this.authState, hatchAuthLoginOptions.authState) || this.passwordLoginAvailable != hatchAuthLoginOptions.passwordLoginAvailable || this.flow != hatchAuthLoginOptions.flow || this.ntpSourceApp != hatchAuthLoginOptions.ntpSourceApp || !C7384Etj.areEqual(this.passkeyOptions, hatchAuthLoginOptions.passkeyOptions)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchAuthLoginOptions copy$default(HatchAuthLoginOptions hatchAuthLoginOptions, HatchAuthLoginOptionsState hatchAuthLoginOptionsState, String str, boolean z, HatchAuthFlow hatchAuthFlow, HatchNtpSourceApp hatchNtpSourceApp, HatchPasskeyRequestOptions hatchPasskeyRequestOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchAuthLoginOptionsState = hatchAuthLoginOptions.state;
        }
        if ((i & 2) != 0) {
            str = hatchAuthLoginOptions.authState;
        }
        if ((i & 4) != 0) {
            z = hatchAuthLoginOptions.passwordLoginAvailable;
        }
        if ((i & 8) != 0) {
            hatchAuthFlow = hatchAuthLoginOptions.flow;
        }
        if ((i & 16) != 0) {
            hatchNtpSourceApp = hatchAuthLoginOptions.ntpSourceApp;
        }
        if ((i & 32) != 0) {
            hatchPasskeyRequestOptions = hatchAuthLoginOptions.passkeyOptions;
        }
        return hatchAuthLoginOptions.copy(hatchAuthLoginOptionsState, str, z, hatchAuthFlow, hatchNtpSourceApp, hatchPasskeyRequestOptions);
    }

    public final HatchAuthLoginOptionsState component1() {
        return this.state;
    }

    public final String component2() {
        return this.authState;
    }

    public final boolean component3() {
        return this.passwordLoginAvailable;
    }

    public final HatchAuthFlow component4() {
        return this.flow;
    }

    public final HatchNtpSourceApp component5() {
        return this.ntpSourceApp;
    }

    public final HatchPasskeyRequestOptions component6() {
        return this.passkeyOptions;
    }

    public final String getAuthState() {
        return this.authState;
    }

    public final HatchAuthFlow getFlow() {
        return this.flow;
    }

    public final HatchNtpSourceApp getNtpSourceApp() {
        return this.ntpSourceApp;
    }

    public final HatchPasskeyRequestOptions getPasskeyOptions() {
        return this.passkeyOptions;
    }

    public final boolean getPasswordLoginAvailable() {
        return this.passwordLoginAvailable;
    }

    public final HatchAuthLoginOptionsState getState() {
        return this.state;
    }

    public int hashCode() {
        return ((((C0KA.A01((AnonymousClass005.A0E(this.state) + AnonymousClass006.A0G(this.authState)) * 31, this.passwordLoginAvailable) + AnonymousClass006.A0D(this.flow)) * 31) + AnonymousClass006.A0D(this.ntpSourceApp)) * 31) + C3cH.A02(this.passkeyOptions);
    }

    public String toString() {
        return super.toString();
    }
}
