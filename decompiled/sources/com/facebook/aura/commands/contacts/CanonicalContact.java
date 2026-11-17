package com.facebook.aura.commands.contacts;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2nw;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C7pd;
import X.C7qW;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class CanonicalContact extends C06G {
    public final List<ContactAddress> addresses;
    public final String birthday;
    public final String displayName;
    public final List<ContactEmail> emails;
    public final String jobTitle;
    public final String note;
    public final String organization;
    public final List<ContactPhone> phones;
    public final String platformId;
    public final String thumbnail;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CanonicalContact) {
                CanonicalContact canonicalContact = (CanonicalContact) obj;
                if (!C7384Etj.areEqual(this.platformId, canonicalContact.platformId) || !C7384Etj.areEqual(this.displayName, canonicalContact.displayName) || !C7384Etj.areEqual(this.organization, canonicalContact.organization) || !C7384Etj.areEqual(this.jobTitle, canonicalContact.jobTitle) || !C7384Etj.areEqual(this.phones, canonicalContact.phones) || !C7384Etj.areEqual(this.emails, canonicalContact.emails) || !C7384Etj.areEqual(this.addresses, canonicalContact.addresses) || !C7384Etj.areEqual(this.birthday, canonicalContact.birthday) || !C7384Etj.areEqual(this.note, canonicalContact.note) || !C7384Etj.areEqual(this.thumbnail, canonicalContact.thumbnail)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CanonicalContact copy$default(CanonicalContact canonicalContact, String str, String str2, String str3, String str4, List list, List list2, List list3, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = canonicalContact.platformId;
        }
        if ((i & 2) != 0) {
            str2 = canonicalContact.displayName;
        }
        if ((i & 4) != 0) {
            str3 = canonicalContact.organization;
        }
        if ((i & 8) != 0) {
            str4 = canonicalContact.jobTitle;
        }
        if ((i & 16) != 0) {
            list = canonicalContact.phones;
        }
        if ((i & 32) != 0) {
            list2 = canonicalContact.emails;
        }
        if ((i & 64) != 0) {
            list3 = canonicalContact.addresses;
        }
        if ((i & 128) != 0) {
            str5 = canonicalContact.birthday;
        }
        if ((i & 256) != 0) {
            str6 = canonicalContact.note;
        }
        if ((i & 512) != 0) {
            str7 = canonicalContact.thumbnail;
        }
        return canonicalContact.copy(str, str2, str3, str4, list, list2, list3, str5, str6, str7);
    }

    public final String component1() {
        return this.platformId;
    }

    public final String component10() {
        return this.thumbnail;
    }

    public final String component2() {
        return this.displayName;
    }

    public final String component3() {
        return this.organization;
    }

    public final String component4() {
        return this.jobTitle;
    }

    public final List<ContactPhone> component5() {
        return this.phones;
    }

    public final List<ContactEmail> component6() {
        return this.emails;
    }

    public final List<ContactAddress> component7() {
        return this.addresses;
    }

    public final String component8() {
        return this.birthday;
    }

    public final String component9() {
        return this.note;
    }

    public final List<ContactAddress> getAddresses() {
        return this.addresses;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final List<ContactEmail> getEmails() {
        return this.emails;
    }

    public final String getJobTitle() {
        return this.jobTitle;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getOrganization() {
        return this.organization;
    }

    public final List<ContactPhone> getPhones() {
        return this.phones;
    }

    public final String getPlatformId() {
        return this.platformId;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0F(this.addresses, AnonymousClass005.A0F(this.emails, AnonymousClass005.A0F(this.phones, (((AnonymousClass005.A0I(this.displayName, AnonymousClass001.A0G(this.platformId)) + AnonymousClass006.A0G(this.organization)) * 31) + AnonymousClass006.A0G(this.jobTitle)) * 31))) + AnonymousClass006.A0G(this.birthday)) * 31) + AnonymousClass006.A0G(this.note)) * 31) + AnonymousClass005.A0H(this.thumbnail);
    }

    public CanonicalContact(String str, String str2, String str3, String str4, List<ContactPhone> list, List<ContactEmail> list2, List<ContactAddress> list3, String str5, String str6, String str7) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(list, 4);
        AnonymousClass003.A0z(list2, list3);
        this.platformId = str;
        this.displayName = str2;
        this.organization = str3;
        this.jobTitle = str4;
        this.phones = list;
        this.emails = list2;
        this.addresses = list3;
        this.birthday = str5;
        this.note = str6;
        this.thumbnail = str7;
    }

    public final CanonicalContact copy(String str, String str2, String str3, String str4, List<ContactPhone> list, List<ContactEmail> list2, List<ContactAddress> list3, String str5, String str6, String str7) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(list, 4);
        AnonymousClass003.A0z(list2, list3);
        return new CanonicalContact(str, str2, str3, str4, list, list2, list3, str5, str6, str7);
    }

    public final JsonObject toJson() {
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06("platformId", this.platformId, c2nwA1K);
        C7qW.A06("displayName", this.displayName, c2nwA1K);
        C60R.A1M(this.organization, "organization", c2nwA1K);
        C60R.A1M(this.jobTitle, "jobTitle", c2nwA1K);
        C7pd c7pdA01 = C7pd.A01();
        Iterator<ContactPhone> it = this.phones.iterator();
        while (it.hasNext()) {
            c7pdA01.A06(it.next().toJson());
        }
        c2nwA1K.A01("phones", C7pd.A00(c7pdA01));
        C7pd c7pdA012 = C7pd.A01();
        Iterator<ContactEmail> it2 = this.emails.iterator();
        while (it2.hasNext()) {
            c7pdA012.A06(it2.next().toJson());
        }
        c2nwA1K.A01("emails", C7pd.A00(c7pdA012));
        C7pd c7pdA013 = C7pd.A01();
        Iterator<ContactAddress> it3 = this.addresses.iterator();
        while (it3.hasNext()) {
            c7pdA013.A06(it3.next().toJson());
        }
        c2nwA1K.A01("addresses", C7pd.A00(c7pdA013));
        C60R.A1M(this.birthday, "birthday", c2nwA1K);
        C60R.A1M(this.note, "note", c2nwA1K);
        C60R.A1M(this.thumbnail, HatchWebPageParserKt.THUMBNAIL, c2nwA1K);
        return c2nwA1K.A00();
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CanonicalContact(String str, String str2, String str3, String str4, List list, List list2, List list3, String str5, String str6, String str7, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? C0881AGi.A00 : list, (i & 32) != 0 ? C0881AGi.A00 : list2, (i & 64) != 0 ? C0881AGi.A00 : list3, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7);
    }
}
