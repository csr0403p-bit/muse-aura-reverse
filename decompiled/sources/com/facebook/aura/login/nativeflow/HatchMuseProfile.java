package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchMuseProfile extends C06G {
    public final String name;
    public final String profilePictureUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchMuseProfile) {
                HatchMuseProfile hatchMuseProfile = (HatchMuseProfile) obj;
                if (!C7384Etj.areEqual(this.name, hatchMuseProfile.name) || !C7384Etj.areEqual(this.profilePictureUrl, hatchMuseProfile.profilePictureUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchMuseProfile copy$default(HatchMuseProfile hatchMuseProfile, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchMuseProfile.name;
        }
        if ((i & 2) != 0) {
            str2 = hatchMuseProfile.profilePictureUrl;
        }
        AnonymousClass003.A0u(str, str2);
        return new HatchMuseProfile(str, str2);
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
        return AnonymousClass001.A0H(this.profilePictureUrl, AnonymousClass001.A0G(this.name));
    }

    public HatchMuseProfile(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.name = str;
        this.profilePictureUrl = str2;
    }

    public final HatchMuseProfile copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HatchMuseProfile(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
