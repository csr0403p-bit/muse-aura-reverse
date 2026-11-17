package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class LegalSubstitution extends C06G {
    public final boolean isEmphasized;
    public final String placeholder;
    public final String url;
    public final String value;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LegalSubstitution) {
                LegalSubstitution legalSubstitution = (LegalSubstitution) obj;
                if (!C7384Etj.areEqual(this.placeholder, legalSubstitution.placeholder) || !C7384Etj.areEqual(this.value, legalSubstitution.value) || !C7384Etj.areEqual(this.url, legalSubstitution.url) || this.isEmphasized != legalSubstitution.isEmphasized) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LegalSubstitution copy$default(LegalSubstitution legalSubstitution, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = legalSubstitution.placeholder;
        }
        if ((i & 2) != 0) {
            str2 = legalSubstitution.value;
        }
        if ((i & 4) != 0) {
            str3 = legalSubstitution.url;
        }
        if ((i & 8) != 0) {
            z = legalSubstitution.isEmphasized;
        }
        AnonymousClass003.A0u(str, str2);
        return new LegalSubstitution(str, str2, str3, z);
    }

    public final String component1() {
        return this.placeholder;
    }

    public final String component2() {
        return this.value;
    }

    public final String component3() {
        return this.url;
    }

    public final boolean component4() {
        return this.isEmphasized;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0I(this.value, AnonymousClass001.A0G(this.placeholder)) + AnonymousClass006.A0G(this.url)) * 31, this.isEmphasized);
    }

    public final boolean isEmphasized() {
        return this.isEmphasized;
    }

    public LegalSubstitution(String str, String str2, String str3, boolean z) {
        AnonymousClass003.A0u(str, str2);
        this.placeholder = str;
        this.value = str2;
        this.url = str3;
        this.isEmphasized = z;
    }

    public final LegalSubstitution copy(String str, String str2, String str3, boolean z) {
        AnonymousClass003.A0u(str, str2);
        return new LegalSubstitution(str, str2, str3, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LegalSubstitution(String str, String str2, String str3, boolean z, int i, C06H c06h) {
        this(str, str2, str3, AnonymousClass005.A1P(i, z));
    }
}
