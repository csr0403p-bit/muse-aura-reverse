package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class CheckoutInfo extends C06G {
    public static final int $stable = 8;
    public final List<CheckoutInfoSection> sections;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutInfo) {
                CheckoutInfo checkoutInfo = (CheckoutInfo) obj;
                if (!C7384Etj.areEqual(this.title, checkoutInfo.title) || !C7384Etj.areEqual(this.sections, checkoutInfo.sections)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutInfo copy$default(CheckoutInfo checkoutInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutInfo.title;
        }
        if ((i & 2) != 0) {
            list = checkoutInfo.sections;
        }
        AnonymousClass003.A0u(str, list);
        return new CheckoutInfo(str, list);
    }

    public final String component1() {
        return this.title;
    }

    public final List<CheckoutInfoSection> component2() {
        return this.sections;
    }

    public final List<CheckoutInfoSection> getSections() {
        return this.sections;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.sections, AnonymousClass001.A0G(this.title));
    }

    public CheckoutInfo(String str, List<CheckoutInfoSection> list) {
        AnonymousClass003.A0u(str, list);
        this.title = str;
        this.sections = list;
    }

    public final CheckoutInfo copy(String str, List<CheckoutInfoSection> list) {
        AnonymousClass003.A0u(str, list);
        return new CheckoutInfo(str, list);
    }

    public String toString() {
        return super.toString();
    }
}
