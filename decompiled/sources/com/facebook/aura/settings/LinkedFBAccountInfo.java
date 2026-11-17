package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class LinkedFBAccountInfo extends C06G {
    public static final int $stable = 0;
    public final String name;
    public final String profilePictureUrl;

    public LinkedFBAccountInfo(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.name = str;
        this.profilePictureUrl = str2;
    }

    public final LinkedFBAccountInfo copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new LinkedFBAccountInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkedFBAccountInfo) {
                LinkedFBAccountInfo linkedFBAccountInfo = (LinkedFBAccountInfo) obj;
                if (!C7384Etj.areEqual(this.name, linkedFBAccountInfo.name) || !C7384Etj.areEqual(this.profilePictureUrl, linkedFBAccountInfo.profilePictureUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LinkedFBAccountInfo copy$default(LinkedFBAccountInfo linkedFBAccountInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkedFBAccountInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = linkedFBAccountInfo.profilePictureUrl;
        }
        C7384Etj.A0Y(str, 0);
        return new LinkedFBAccountInfo(str, str2);
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
