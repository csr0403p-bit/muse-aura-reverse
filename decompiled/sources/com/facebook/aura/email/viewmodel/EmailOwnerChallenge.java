package com.facebook.aura.email.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class EmailOwnerChallenge extends C06G {
    public final String address;
    public final String id;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailOwnerChallenge) {
                EmailOwnerChallenge emailOwnerChallenge = (EmailOwnerChallenge) obj;
                if (!C7384Etj.areEqual(this.id, emailOwnerChallenge.id) || !C7384Etj.areEqual(this.address, emailOwnerChallenge.address)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailOwnerChallenge copy$default(EmailOwnerChallenge emailOwnerChallenge, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailOwnerChallenge.id;
        }
        if ((i & 2) != 0) {
            str2 = emailOwnerChallenge.address;
        }
        AnonymousClass003.A0u(str, str2);
        return new EmailOwnerChallenge(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.address;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.address, AnonymousClass001.A0G(this.id));
    }

    public EmailOwnerChallenge(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.address = str2;
    }

    public final EmailOwnerChallenge copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new EmailOwnerChallenge(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
