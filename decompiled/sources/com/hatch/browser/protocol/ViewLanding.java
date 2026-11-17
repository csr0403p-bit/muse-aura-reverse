package com.hatch.browser.protocol;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06H;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes6.dex */
public final class ViewLanding {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public String name;
    public String reference;
    public String role;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewLanding) {
                ViewLanding viewLanding = (ViewLanding) obj;
                if (!C7384Etj.areEqual(this.reference, viewLanding.reference) || !C7384Etj.areEqual(this.role, viewLanding.role) || !C7384Etj.areEqual(this.name, viewLanding.name)) {
                }
            }
            return false;
        }
        return true;
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

    public static /* synthetic */ ViewLanding copy$default(ViewLanding viewLanding, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewLanding.reference;
        }
        if ((i & 2) != 0) {
            str2 = viewLanding.role;
        }
        if ((i & 4) != 0) {
            str3 = viewLanding.name;
        }
        return viewLanding.copy(str, str2, str3);
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
        return AnonymousClass001.A0H(this.name, AnonymousClass005.A0I(this.role, AnonymousClass001.A0G(this.reference)));
    }

    public String toString() {
        return FGI.A0k("ViewLanding(reference=", this.reference, ", role=", this.role, ", name=", this.name, ")");
    }

    public ViewLanding(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.reference = str;
        this.role = str2;
        this.name = str3;
    }

    public final ViewLanding copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new ViewLanding(str, str2, str3);
    }
}
