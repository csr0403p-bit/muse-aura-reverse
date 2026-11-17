package com.facebook.aura.nodes.cards;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class ContactsCardContact extends C06G {
    public static final int $stable = 0;
    public final String name;
    public final String number;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContactsCardContact) {
                ContactsCardContact contactsCardContact = (ContactsCardContact) obj;
                if (!C7384Etj.areEqual(this.name, contactsCardContact.name) || !C7384Etj.areEqual(this.number, contactsCardContact.number)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ContactsCardContact copy$default(ContactsCardContact contactsCardContact, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactsCardContact.name;
        }
        if ((i & 2) != 0) {
            str2 = contactsCardContact.number;
        }
        return new ContactsCardContact(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.number;
    }

    public final ContactsCardContact copy(String str, String str2) {
        return new ContactsCardContact(str, str2);
    }

    public final String getName() {
        return this.name;
    }

    public final String getNumber() {
        return this.number;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.name) * 31) + AnonymousClass005.A0H(this.number);
    }

    public ContactsCardContact(String str, String str2) {
        this.name = str;
        this.number = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ContactsCardContact(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public ContactsCardContact() {
        this(null, null);
    }
}
