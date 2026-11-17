package com.facebook.aura.nodes.cards;

import X.AGI;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ContactsCardJson extends C06G {
    public static final int $stable = 8;
    public final String action;
    public final List<ContactsCardItemJson> contacts;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, ContactsCardJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ContactsCardJson> serializer() {
            return ContactsCardJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContactsCardJson) {
                ContactsCardJson contactsCardJson = (ContactsCardJson) obj;
                if (!C7384Etj.areEqual(this.action, contactsCardJson.action) || !C7384Etj.areEqual(this.contacts, contactsCardJson.contacts)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ContactsCardJson copy$default(ContactsCardJson contactsCardJson, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactsCardJson.action;
        }
        if ((i & 2) != 0) {
            list = contactsCardJson.contacts;
        }
        AnonymousClass003.A0u(str, list);
        return new ContactsCardJson(str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(ContactsCardJson contactsCardJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(contactsCardJson.action)) {
            c9j5.AAV(contactsCardJson.action, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(contactsCardJson.contacts)) {
            c9j5.AAQ(contactsCardJson.contacts, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final String component1() {
        return this.action;
    }

    public final List<ContactsCardItemJson> component2() {
        return this.contacts;
    }

    public final String getAction() {
        return this.action;
    }

    public final List<ContactsCardItemJson> getContacts() {
        return this.contacts;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.contacts, AnonymousClass001.A0G(this.action));
    }

    public final ContactsCardData toDomain() {
        String strA0J = C3cJ.A0J(this.action);
        if (strA0J.length() <= 0) {
            return null;
        }
        List<ContactsCardItemJson> list = this.contacts;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<ContactsCardItemJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toDomain());
        }
        return new ContactsCardData(strA0J, AGI.A07(arrayListA0i));
    }

    public ContactsCardJson(String str, List<ContactsCardItemJson> list) {
        AnonymousClass003.A0u(str, list);
        this.action = str;
        this.contacts = list;
    }

    public final ContactsCardJson copy(String str, List<ContactsCardItemJson> list) {
        AnonymousClass003.A0u(str, list);
        return new ContactsCardJson(str, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ContactsCardJson(int i, String str, List list, C2hx c2hx) {
        this.action = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.contacts = C0881AGi.A00;
        } else {
            this.contacts = list;
        }
    }

    public /* synthetic */ ContactsCardJson(String str, List list, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), C3cI.A11(list, i));
    }

    public ContactsCardJson() {
        this("", C0881AGi.A00);
    }
}
