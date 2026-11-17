package com.hatch.browser.protocol;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06H;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes6.dex */
public final class ControlFact {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public String credentialFillUrl;
    public String name;
    public String reference;
    public String role;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ControlFact) {
                ControlFact controlFact = (ControlFact) obj;
                if (!C7384Etj.areEqual(this.reference, controlFact.reference) || !C7384Etj.areEqual(this.role, controlFact.role) || !C7384Etj.areEqual(this.name, controlFact.name) || !C7384Etj.areEqual(this.credentialFillUrl, controlFact.credentialFillUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setCredentialFillUrl(String str) {
        C7384Etj.A0Y(str, 0);
        this.credentialFillUrl = str;
    }

    public final void setName(String str) {
        C7384Etj.A0Y(str, 0);
        this.name = str;
    }

    public final void setReference(String str) {
        C7384Etj.A0Y(str, 0);
        this.reference = str;
    }

    public final void setRole(String str) {
        C7384Etj.A0Y(str, 0);
        this.role = str;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ ControlFact copy$default(ControlFact controlFact, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = controlFact.reference;
        }
        if ((i & 2) != 0) {
            str2 = controlFact.role;
        }
        if ((i & 4) != 0) {
            str3 = controlFact.name;
        }
        if ((i & 8) != 0) {
            str4 = controlFact.credentialFillUrl;
        }
        return controlFact.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.reference;
    }

    public final String component2() {
        return this.role;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.credentialFillUrl;
    }

    public final String getCredentialFillUrl() {
        return this.credentialFillUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getReference() {
        return this.reference;
    }

    public final String getRole() {
        return this.role;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.credentialFillUrl, AnonymousClass005.A0I(this.name, AnonymousClass005.A0I(this.role, AnonymousClass001.A0G(this.reference))));
    }

    public String toString() {
        return FGI.A0m("ControlFact(reference=", this.reference, ", role=", this.role, ", name=", this.name, ", credentialFillUrl=", this.credentialFillUrl, ")");
    }

    public ControlFact(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.reference = str;
        this.role = str2;
        this.name = str3;
        this.credentialFillUrl = str4;
    }

    public final ControlFact copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new ControlFact(str, str2, str3, str4);
    }
}
