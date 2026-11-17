package com.facebook.aura.login.credentials;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class SavedCredentialData extends C06G {
    public final String email;
    public final String profileName;
    public final String profilePictureUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SavedCredentialData) {
                SavedCredentialData savedCredentialData = (SavedCredentialData) obj;
                if (!C7384Etj.areEqual(this.email, savedCredentialData.email) || !C7384Etj.areEqual(this.profilePictureUrl, savedCredentialData.profilePictureUrl) || !C7384Etj.areEqual(this.profileName, savedCredentialData.profileName)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SavedCredentialData copy$default(SavedCredentialData savedCredentialData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedCredentialData.email;
        }
        if ((i & 2) != 0) {
            str2 = savedCredentialData.profilePictureUrl;
        }
        if ((i & 4) != 0) {
            str3 = savedCredentialData.profileName;
        }
        return new SavedCredentialData(str, str2, str3);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.profilePictureUrl;
    }

    public final String component3() {
        return this.profileName;
    }

    public final SavedCredentialData copy(String str, String str2, String str3) {
        return new SavedCredentialData(str, str2, str3);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getProfileName() {
        return this.profileName;
    }

    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.email) * 31) + AnonymousClass006.A0G(this.profilePictureUrl)) * 31) + AnonymousClass005.A0H(this.profileName);
    }

    public SavedCredentialData(String str, String str2, String str3) {
        this.email = str;
        this.profilePictureUrl = str2;
        this.profileName = str3;
    }

    public String toString() {
        return super.toString();
    }
}
