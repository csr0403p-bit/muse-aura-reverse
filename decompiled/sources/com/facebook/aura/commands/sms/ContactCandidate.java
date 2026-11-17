package com.facebook.aura.commands.sms;

import X.AnonymousClass005;
import X.C06G;

/* loaded from: classes3.dex */
public final class ContactCandidate extends C06G {
    public final String contactId;
    public final String name;
    public final String phone;

    public static /* synthetic */ ContactCandidate copy$default(ContactCandidate contactCandidate, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactCandidate.name;
        }
        if ((i & 2) != 0) {
            str2 = contactCandidate.phone;
        }
        if ((i & 4) != 0) {
            str3 = contactCandidate.contactId;
        }
        return contactCandidate.copy(str, str2, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.phone;
    }

    public final String component3() {
        return this.contactId;
    }

    public final String getContactId() {
        return this.contactId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhone() {
        return this.phone;
    }

    public ContactCandidate(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.name = str;
        this.phone = str2;
        this.contactId = str3;
    }

    public final ContactCandidate copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new ContactCandidate(str, str2, str3);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
