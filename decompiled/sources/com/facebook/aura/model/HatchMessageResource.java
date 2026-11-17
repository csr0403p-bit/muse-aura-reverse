package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchMessageResource extends C06G {
    public static final int $stable = 0;
    public final String domain;
    public final String faviconUrl;
    public final String kind;
    public final String label;
    public final String uri;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchMessageResource) {
                HatchMessageResource hatchMessageResource = (HatchMessageResource) obj;
                if (!C7384Etj.areEqual(this.kind, hatchMessageResource.kind) || !C7384Etj.areEqual(this.uri, hatchMessageResource.uri) || !C7384Etj.areEqual(this.label, hatchMessageResource.label) || !C7384Etj.areEqual(this.domain, hatchMessageResource.domain) || !C7384Etj.areEqual(this.faviconUrl, hatchMessageResource.faviconUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchMessageResource copy$default(HatchMessageResource hatchMessageResource, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchMessageResource.kind;
        }
        if ((i & 2) != 0) {
            str2 = hatchMessageResource.uri;
        }
        if ((i & 4) != 0) {
            str3 = hatchMessageResource.label;
        }
        if ((i & 8) != 0) {
            str4 = hatchMessageResource.domain;
        }
        if ((i & 16) != 0) {
            str5 = hatchMessageResource.faviconUrl;
        }
        return hatchMessageResource.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.uri;
    }

    public final String component3() {
        return this.label;
    }

    public final String component4() {
        return this.domain;
    }

    public final String component5() {
        return this.faviconUrl;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getFaviconUrl() {
        return this.faviconUrl;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.uri, AnonymousClass001.A0G(this.kind)) + AnonymousClass006.A0G(this.label)) * 31) + AnonymousClass006.A0G(this.domain)) * 31) + AnonymousClass005.A0H(this.faviconUrl);
    }

    public HatchMessageResource(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass003.A0u(str, str2);
        this.kind = str;
        this.uri = str2;
        this.label = str3;
        this.domain = str4;
        this.faviconUrl = str5;
    }

    public final HatchMessageResource copy(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass003.A0u(str, str2);
        return new HatchMessageResource(str, str2, str3, str4, str5);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchMessageResource(String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
