package com.facebook.aura.commands.contacts;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C2nw;
import X.C60O;
import X.C7384Etj;
import X.C7qW;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class ContactEmail extends C06G {
    public final String label;
    public final String value;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContactEmail) {
                ContactEmail contactEmail = (ContactEmail) obj;
                if (!C7384Etj.areEqual(this.label, contactEmail.label) || !C7384Etj.areEqual(this.value, contactEmail.value)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ContactEmail copy$default(ContactEmail contactEmail, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactEmail.label;
        }
        if ((i & 2) != 0) {
            str2 = contactEmail.value;
        }
        AnonymousClass003.A0u(str, str2);
        return new ContactEmail(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.value;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.value, AnonymousClass001.A0G(this.label));
    }

    public ContactEmail(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.label = str;
        this.value = str2;
    }

    public final ContactEmail copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new ContactEmail(str, str2);
    }

    public final JsonObject toJson() {
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06("label", this.label, c2nwA1K);
        return C7qW.A01(BrowserOperationCatalogKt.VALUE, this.value, c2nwA1K);
    }

    public String toString() {
        return super.toString();
    }
}
