package com.facebook.aura.checkout.ui;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchFormOption extends C06G {
    public static final int $stable = 0;
    public final String autofillName;
    public final String label;
    public final String value;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchFormOption) {
                HatchFormOption hatchFormOption = (HatchFormOption) obj;
                if (!C7384Etj.areEqual(this.value, hatchFormOption.value) || !C7384Etj.areEqual(this.label, hatchFormOption.label) || !C7384Etj.areEqual(this.autofillName, hatchFormOption.autofillName)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchFormOption copy$default(HatchFormOption hatchFormOption, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchFormOption.value;
        }
        if ((i & 2) != 0) {
            str2 = hatchFormOption.label;
        }
        if ((i & 4) != 0) {
            str3 = hatchFormOption.autofillName;
        }
        return hatchFormOption.copy(str, str2, str3);
    }

    public final String component1() {
        return this.value;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.autofillName;
    }

    public final String getAutofillName() {
        return this.autofillName;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.value)) + AnonymousClass006.A0G(this.autofillName);
    }

    public HatchFormOption(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.value = str;
        this.label = str2;
        this.autofillName = str3;
    }

    public final HatchFormOption copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new HatchFormOption(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchFormOption(String str, String str2, String str3, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3));
    }
}
