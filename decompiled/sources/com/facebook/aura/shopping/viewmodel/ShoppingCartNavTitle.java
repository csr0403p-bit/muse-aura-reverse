package com.facebook.aura.shopping.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class ShoppingCartNavTitle extends C06G {
    public static final int $stable = 0;
    public final String detail;
    public final String iconUrl;
    public final String merchant;

    public ShoppingCartNavTitle(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.merchant = str;
        this.detail = str2;
        this.iconUrl = str3;
    }

    public final ShoppingCartNavTitle copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new ShoppingCartNavTitle(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCartNavTitle) {
                ShoppingCartNavTitle shoppingCartNavTitle = (ShoppingCartNavTitle) obj;
                if (!C7384Etj.areEqual(this.merchant, shoppingCartNavTitle.merchant) || !C7384Etj.areEqual(this.detail, shoppingCartNavTitle.detail) || !C7384Etj.areEqual(this.iconUrl, shoppingCartNavTitle.iconUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingCartNavTitle copy$default(ShoppingCartNavTitle shoppingCartNavTitle, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingCartNavTitle.merchant;
        }
        if ((i & 2) != 0) {
            str2 = shoppingCartNavTitle.detail;
        }
        if ((i & 4) != 0) {
            str3 = shoppingCartNavTitle.iconUrl;
        }
        return shoppingCartNavTitle.copy(str, str2, str3);
    }

    public final String component1() {
        return this.merchant;
    }

    public final String component2() {
        return this.detail;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getMerchant() {
        return this.merchant;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.merchant) + AnonymousClass006.A0G(this.detail)) * 31) + AnonymousClass005.A0H(this.iconUrl);
    }

    public String toString() {
        return super.toString();
    }
}
