package com.facebook.aura.nodes.cards;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class ContactsCardData extends C06G implements HatchNodeCardData {
    public static final int $stable = 0;
    public final String action;
    public final AHD<ContactsCardContact> contacts;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContactsCardData) {
                ContactsCardData contactsCardData = (ContactsCardData) obj;
                if (!C7384Etj.areEqual(this.action, contactsCardData.action) || !C7384Etj.areEqual(this.contacts, contactsCardData.contacts)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ContactsCardData copy$default(ContactsCardData contactsCardData, String str, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactsCardData.action;
        }
        if ((i & 2) != 0) {
            ahd = contactsCardData.contacts;
        }
        AnonymousClass003.A0u(str, ahd);
        return new ContactsCardData(str, ahd);
    }

    public final String component1() {
        return this.action;
    }

    public final AHD<ContactsCardContact> component2() {
        return this.contacts;
    }

    public final String getAction() {
        return this.action;
    }

    public final AHD<ContactsCardContact> getContacts() {
        return this.contacts;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.contacts, AnonymousClass001.A0G(this.action));
    }

    public ContactsCardData(String str, AHD<ContactsCardContact> ahd) {
        AnonymousClass003.A0u(str, ahd);
        this.action = str;
        this.contacts = ahd;
    }

    public final ContactsCardData copy(String str, AHD<ContactsCardContact> ahd) {
        AnonymousClass003.A0u(str, ahd);
        return new ContactsCardData(str, ahd);
    }

    public String toString() {
        return super.toString();
    }
}
