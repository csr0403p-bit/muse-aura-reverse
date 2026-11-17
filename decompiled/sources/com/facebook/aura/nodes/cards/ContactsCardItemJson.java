package com.facebook.aura.nodes.cards;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ContactsCardItemJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String name;
    public final String number;

    public final class Companion {
        public final C9hr<ContactsCardItemJson> serializer() {
            return ContactsCardItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(ContactsCardItemJson contactsCardItemJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || contactsCardItemJson.name != null) {
            c9j5.AAP(contactsCardItemJson.name, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || contactsCardItemJson.number != null) {
            c9j5.AAP(contactsCardItemJson.number, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContactsCardItemJson) {
                ContactsCardItemJson contactsCardItemJson = (ContactsCardItemJson) obj;
                if (!C7384Etj.areEqual(this.name, contactsCardItemJson.name) || !C7384Etj.areEqual(this.number, contactsCardItemJson.number)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ContactsCardItemJson copy$default(ContactsCardItemJson contactsCardItemJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactsCardItemJson.name;
        }
        if ((i & 2) != 0) {
            str2 = contactsCardItemJson.number;
        }
        return new ContactsCardItemJson(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.number;
    }

    public final ContactsCardItemJson copy(String str, String str2) {
        return new ContactsCardItemJson(str, str2);
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

    public final ContactsCardContact toDomain() {
        String strA0l;
        String strA0l2;
        String str = this.name;
        String str2 = null;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            strA0l = null;
        }
        String str3 = this.number;
        if (str3 != null && (strA0l2 = AnonymousClass002.A0l(str3)) != null && strA0l2.length() > 0) {
            str2 = strA0l2;
        }
        return new ContactsCardContact(strA0l, str2);
    }

    public ContactsCardItemJson(String str, String str2) {
        this.name = str;
        this.number = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ContactsCardItemJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.number = null;
        } else {
            this.number = str2;
        }
    }

    public /* synthetic */ ContactsCardItemJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public ContactsCardItemJson() {
        this(null, null);
    }
}
