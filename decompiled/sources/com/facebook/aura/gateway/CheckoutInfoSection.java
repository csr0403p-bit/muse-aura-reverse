package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class CheckoutInfoSection extends C06G {
    public static final int $stable = 8;
    public final String kind;
    public final List<String> paragraphs;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutInfoSection) {
                CheckoutInfoSection checkoutInfoSection = (CheckoutInfoSection) obj;
                if (!C7384Etj.areEqual(this.kind, checkoutInfoSection.kind) || !C7384Etj.areEqual(this.title, checkoutInfoSection.title) || !C7384Etj.areEqual(this.paragraphs, checkoutInfoSection.paragraphs)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckoutInfoSection copy$default(CheckoutInfoSection checkoutInfoSection, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutInfoSection.kind;
        }
        if ((i & 2) != 0) {
            str2 = checkoutInfoSection.title;
        }
        if ((i & 4) != 0) {
            list = checkoutInfoSection.paragraphs;
        }
        return checkoutInfoSection.copy(str, str2, list);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.title;
    }

    public final List<String> component3() {
        return this.paragraphs;
    }

    public final String getKind() {
        return this.kind;
    }

    public final List<String> getParagraphs() {
        return this.paragraphs;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.paragraphs, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.kind)));
    }

    public CheckoutInfoSection(String str, String str2, List<String> list) {
        AnonymousClass005.A0x(str, str2, list);
        this.kind = str;
        this.title = str2;
        this.paragraphs = list;
    }

    public final CheckoutInfoSection copy(String str, String str2, List<String> list) {
        AnonymousClass005.A0x(str, str2, list);
        return new CheckoutInfoSection(str, str2, list);
    }

    public String toString() {
        return super.toString();
    }
}
