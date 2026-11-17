package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchTosDocument extends C06G {
    public final String label;
    public final String url;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTosDocument) {
                HatchTosDocument hatchTosDocument = (HatchTosDocument) obj;
                if (!C7384Etj.areEqual(this.label, hatchTosDocument.label) || !C7384Etj.areEqual(this.url, hatchTosDocument.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchTosDocument copy$default(HatchTosDocument hatchTosDocument, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchTosDocument.label;
        }
        if ((i & 2) != 0) {
            str2 = hatchTosDocument.url;
        }
        AnonymousClass003.A0u(str, str2);
        return new HatchTosDocument(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.url;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.url, AnonymousClass001.A0G(this.label));
    }

    public HatchTosDocument(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.label = str;
        this.url = str2;
    }

    public final HatchTosDocument copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HatchTosDocument(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
