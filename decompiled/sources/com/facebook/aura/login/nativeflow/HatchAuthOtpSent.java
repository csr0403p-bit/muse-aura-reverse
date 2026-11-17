package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchAuthOtpSent extends C06G {
    public final String authState;
    public final HatchAuthFlow flow;
    public final Boolean hasMuseAccount;
    public final HatchNtpSourceApp ntpSourceApp;
    public final HatchPasswordCopy passwordCopy;
    public final boolean passwordLoginAvailable;

    public final HatchAuthOtpSent copy(String str, boolean z, HatchAuthFlow hatchAuthFlow, HatchNtpSourceApp hatchNtpSourceApp, Boolean bool, HatchPasswordCopy hatchPasswordCopy) {
        C7384Etj.A0Y(str, 0);
        return new HatchAuthOtpSent(str, z, hatchAuthFlow, hatchNtpSourceApp, bool, hatchPasswordCopy);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAuthOtpSent) {
                HatchAuthOtpSent hatchAuthOtpSent = (HatchAuthOtpSent) obj;
                if (!C7384Etj.areEqual(this.authState, hatchAuthOtpSent.authState) || this.passwordLoginAvailable != hatchAuthOtpSent.passwordLoginAvailable || this.flow != hatchAuthOtpSent.flow || this.ntpSourceApp != hatchAuthOtpSent.ntpSourceApp || !C7384Etj.areEqual(this.hasMuseAccount, hatchAuthOtpSent.hasMuseAccount) || !C7384Etj.areEqual(this.passwordCopy, hatchAuthOtpSent.passwordCopy)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchAuthOtpSent(String str, boolean z, HatchAuthFlow hatchAuthFlow, HatchNtpSourceApp hatchNtpSourceApp, Boolean bool, HatchPasswordCopy hatchPasswordCopy, int i, C06H c06h) {
        this(str, z, (i & 4) != 0 ? null : hatchAuthFlow, (i & 8) != 0 ? null : hatchNtpSourceApp, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : hatchPasswordCopy);
    }

    public static /* synthetic */ HatchAuthOtpSent copy$default(HatchAuthOtpSent hatchAuthOtpSent, String str, boolean z, HatchAuthFlow hatchAuthFlow, HatchNtpSourceApp hatchNtpSourceApp, Boolean bool, HatchPasswordCopy hatchPasswordCopy, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAuthOtpSent.authState;
        }
        if ((i & 2) != 0) {
            z = hatchAuthOtpSent.passwordLoginAvailable;
        }
        if ((i & 4) != 0) {
            hatchAuthFlow = hatchAuthOtpSent.flow;
        }
        if ((i & 8) != 0) {
            hatchNtpSourceApp = hatchAuthOtpSent.ntpSourceApp;
        }
        if ((i & 16) != 0) {
            bool = hatchAuthOtpSent.hasMuseAccount;
        }
        if ((i & 32) != 0) {
            hatchPasswordCopy = hatchAuthOtpSent.passwordCopy;
        }
        return hatchAuthOtpSent.copy(str, z, hatchAuthFlow, hatchNtpSourceApp, bool, hatchPasswordCopy);
    }

    public final String component1() {
        return this.authState;
    }

    public final boolean component2() {
        return this.passwordLoginAvailable;
    }

    public final HatchAuthFlow component3() {
        return this.flow;
    }

    public final HatchNtpSourceApp component4() {
        return this.ntpSourceApp;
    }

    public final Boolean component5() {
        return this.hasMuseAccount;
    }

    public final HatchPasswordCopy component6() {
        return this.passwordCopy;
    }

    public final String getAuthState() {
        return this.authState;
    }

    public final HatchAuthFlow getFlow() {
        return this.flow;
    }

    public final Boolean getHasMuseAccount() {
        return this.hasMuseAccount;
    }

    public final HatchNtpSourceApp getNtpSourceApp() {
        return this.ntpSourceApp;
    }

    public final HatchPasswordCopy getPasswordCopy() {
        return this.passwordCopy;
    }

    public final boolean getPasswordLoginAvailable() {
        return this.passwordLoginAvailable;
    }

    public int hashCode() {
        return ((((((C0KA.A01(AnonymousClass001.A0G(this.authState), this.passwordLoginAvailable) + AnonymousClass006.A0D(this.flow)) * 31) + AnonymousClass006.A0D(this.ntpSourceApp)) * 31) + AnonymousClass006.A0D(this.hasMuseAccount)) * 31) + C3cH.A02(this.passwordCopy);
    }

    public String toString() {
        return super.toString();
    }

    public HatchAuthOtpSent(String str, boolean z, HatchAuthFlow hatchAuthFlow, HatchNtpSourceApp hatchNtpSourceApp, Boolean bool, HatchPasswordCopy hatchPasswordCopy) {
        C7384Etj.A0Y(str, 0);
        this.authState = str;
        this.passwordLoginAvailable = z;
        this.flow = hatchAuthFlow;
        this.ntpSourceApp = hatchNtpSourceApp;
        this.hasMuseAccount = bool;
        this.passwordCopy = hatchPasswordCopy;
    }
}
