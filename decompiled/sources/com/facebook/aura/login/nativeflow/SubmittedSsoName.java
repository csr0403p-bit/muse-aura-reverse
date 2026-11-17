package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class SubmittedSsoName extends C06G {
    public final String firstName;
    public final String lastName;
    public final String tosContentVersion;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubmittedSsoName) {
                SubmittedSsoName submittedSsoName = (SubmittedSsoName) obj;
                if (!C7384Etj.areEqual(this.firstName, submittedSsoName.firstName) || !C7384Etj.areEqual(this.lastName, submittedSsoName.lastName) || !C7384Etj.areEqual(this.tosContentVersion, submittedSsoName.tosContentVersion)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SubmittedSsoName copy$default(SubmittedSsoName submittedSsoName, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submittedSsoName.firstName;
        }
        if ((i & 2) != 0) {
            str2 = submittedSsoName.lastName;
        }
        if ((i & 4) != 0) {
            str3 = submittedSsoName.tosContentVersion;
        }
        return submittedSsoName.copy(str, str2, str3);
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component2() {
        return this.lastName;
    }

    public final String component3() {
        return this.tosContentVersion;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getTosContentVersion() {
        return this.tosContentVersion;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.lastName, AnonymousClass001.A0G(this.firstName)) + AnonymousClass006.A0G(this.tosContentVersion);
    }

    public SubmittedSsoName(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.firstName = str;
        this.lastName = str2;
        this.tosContentVersion = str3;
    }

    public final SubmittedSsoName copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new SubmittedSsoName(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}
