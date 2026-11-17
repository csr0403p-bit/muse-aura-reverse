package com.facebook.aura.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchSourceReference extends C06G {
    public static final int $stable = 0;
    public final String description;
    public final String faviconUri;
    public final String link;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSourceReference) {
                HatchSourceReference hatchSourceReference = (HatchSourceReference) obj;
                if (!C7384Etj.areEqual(this.title, hatchSourceReference.title) || !C7384Etj.areEqual(this.link, hatchSourceReference.link) || !C7384Etj.areEqual(this.faviconUri, hatchSourceReference.faviconUri) || !C7384Etj.areEqual(this.description, hatchSourceReference.description)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchSourceReference copy$default(HatchSourceReference hatchSourceReference, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchSourceReference.title;
        }
        if ((i & 2) != 0) {
            str2 = hatchSourceReference.link;
        }
        if ((i & 4) != 0) {
            str3 = hatchSourceReference.faviconUri;
        }
        if ((i & 8) != 0) {
            str4 = hatchSourceReference.description;
        }
        return new HatchSourceReference(str, str2, str3, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.link;
    }

    public final String component3() {
        return this.faviconUri;
    }

    public final String component4() {
        return this.description;
    }

    public final HatchSourceReference copy(String str, String str2, String str3, String str4) {
        return new HatchSourceReference(str, str2, str3, str4);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFaviconUri() {
        return this.faviconUri;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0G(this.link)) * 31) + AnonymousClass006.A0G(this.faviconUri)) * 31) + AnonymousClass005.A0H(this.description);
    }

    public HatchSourceReference(String str, String str2, String str3, String str4) {
        this.title = str;
        this.link = str2;
        this.faviconUri = str3;
        this.description = str4;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchSourceReference(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(str, str2, str3, AnonymousClass006.A0u(i, str4));
    }
}
