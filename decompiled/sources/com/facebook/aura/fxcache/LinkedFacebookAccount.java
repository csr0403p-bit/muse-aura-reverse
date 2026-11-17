package com.facebook.aura.fxcache;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class LinkedFacebookAccount extends C06G {
    public final String name;
    public final String profilePictureUrl;

    public LinkedFacebookAccount(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.name = str;
        this.profilePictureUrl = str2;
    }

    public final LinkedFacebookAccount copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new LinkedFacebookAccount(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkedFacebookAccount) {
                LinkedFacebookAccount linkedFacebookAccount = (LinkedFacebookAccount) obj;
                if (!C7384Etj.areEqual(this.name, linkedFacebookAccount.name) || !C7384Etj.areEqual(this.profilePictureUrl, linkedFacebookAccount.profilePictureUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LinkedFacebookAccount copy$default(LinkedFacebookAccount linkedFacebookAccount, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkedFacebookAccount.name;
        }
        if ((i & 2) != 0) {
            str2 = linkedFacebookAccount.profilePictureUrl;
        }
        C7384Etj.A0Y(str, 0);
        return new LinkedFacebookAccount(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.profilePictureUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.name) + AnonymousClass006.A0G(this.profilePictureUrl);
    }

    public String toString() {
        return super.toString();
    }
}
