package com.facebook.aura.checkout.ui;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchAddress extends C06G {
    public static final int $stable = 0;
    public final String address;
    public final String fullName;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAddress) {
                HatchAddress hatchAddress = (HatchAddress) obj;
                if (!C7384Etj.areEqual(this.fullName, hatchAddress.fullName) || !C7384Etj.areEqual(this.address, hatchAddress.address)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchAddress copy$default(HatchAddress hatchAddress, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAddress.fullName;
        }
        if ((i & 2) != 0) {
            str2 = hatchAddress.address;
        }
        AnonymousClass003.A0u(str, str2);
        return new HatchAddress(str, str2);
    }

    public final String component1() {
        return this.fullName;
    }

    public final String component2() {
        return this.address;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.address, AnonymousClass001.A0G(this.fullName));
    }

    public HatchAddress(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.fullName = str;
        this.address = str2;
    }

    public final HatchAddress copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HatchAddress(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchAddress(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public HatchAddress() {
        this("", "");
    }
}
