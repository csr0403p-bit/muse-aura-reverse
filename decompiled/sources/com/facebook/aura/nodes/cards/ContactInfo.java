package com.facebook.aura.nodes.cards;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class ContactInfo extends C06G {
    public static final int $stable = 0;
    public final String name;
    public final String photoUri;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContactInfo) {
                ContactInfo contactInfo = (ContactInfo) obj;
                if (!C7384Etj.areEqual(this.name, contactInfo.name) || !C7384Etj.areEqual(this.photoUri, contactInfo.photoUri)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ContactInfo copy$default(ContactInfo contactInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = contactInfo.photoUri;
        }
        return new ContactInfo(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.photoUri;
    }

    public final ContactInfo copy(String str, String str2) {
        return new ContactInfo(str, str2);
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhotoUri() {
        return this.photoUri;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.name) * 31) + AnonymousClass005.A0H(this.photoUri);
    }

    public ContactInfo(String str, String str2) {
        this.name = str;
        this.photoUri = str2;
    }

    public String toString() {
        return super.toString();
    }
}
