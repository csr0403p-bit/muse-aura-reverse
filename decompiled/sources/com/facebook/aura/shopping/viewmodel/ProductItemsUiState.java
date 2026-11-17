package com.facebook.aura.shopping.viewmodel;

import X.AHD;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.shopping.model.ShoppingResultsAttribution;

/* loaded from: classes4.dex */
public interface ProductItemsUiState {

    public final class Empty implements ProductItemsUiState {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public String toString() {
            return "Empty";
        }

        public int hashCode() {
            return 77296747;
        }
    }

    public final class Loaded extends C06G implements ProductItemsUiState {
        public static final int $stable = 0;
        public final ShoppingResultsAttribution merchant;
        public final ProductItemsNavText merchantDetail;
        public final int productCount;
        public final AHD<ProductItemsSection> sections;
        public final ProductItemsNavText title;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Loaded) {
                    Loaded loaded = (Loaded) obj;
                    if (!C7384Etj.areEqual(this.title, loaded.title) || this.productCount != loaded.productCount || !C7384Etj.areEqual(this.sections, loaded.sections) || !C7384Etj.areEqual(this.merchant, loaded.merchant) || !C7384Etj.areEqual(this.merchantDetail, loaded.merchantDetail)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, ProductItemsNavText productItemsNavText, int i, AHD ahd, ShoppingResultsAttribution shoppingResultsAttribution, ProductItemsNavText productItemsNavText2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                productItemsNavText = loaded.title;
            }
            if ((i2 & 2) != 0) {
                i = loaded.productCount;
            }
            if ((i2 & 4) != 0) {
                ahd = loaded.sections;
            }
            if ((i2 & 8) != 0) {
                shoppingResultsAttribution = loaded.merchant;
            }
            if ((i2 & 16) != 0) {
                productItemsNavText2 = loaded.merchantDetail;
            }
            return loaded.copy(productItemsNavText, i, ahd, shoppingResultsAttribution, productItemsNavText2);
        }

        public final ProductItemsNavText component1() {
            return this.title;
        }

        public final int component2() {
            return this.productCount;
        }

        public final AHD<ProductItemsSection> component3() {
            return this.sections;
        }

        public final ShoppingResultsAttribution component4() {
            return this.merchant;
        }

        public final ProductItemsNavText component5() {
            return this.merchantDetail;
        }

        public final ShoppingResultsAttribution getMerchant() {
            return this.merchant;
        }

        public final ProductItemsNavText getMerchantDetail() {
            return this.merchantDetail;
        }

        public final int getProductCount() {
            return this.productCount;
        }

        public final AHD<ProductItemsSection> getSections() {
            return this.sections;
        }

        public final ProductItemsNavText getTitle() {
            return this.title;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.merchantDetail, (AnonymousClass005.A0F(this.sections, (AnonymousClass005.A0E(this.title) + this.productCount) * 31) + AnonymousClass006.A0D(this.merchant)) * 31);
        }

        public Loaded(ProductItemsNavText productItemsNavText, int i, AHD<ProductItemsSection> ahd, ShoppingResultsAttribution shoppingResultsAttribution, ProductItemsNavText productItemsNavText2) {
            AnonymousClass003.A0v(productItemsNavText, ahd);
            C7384Etj.A0Y(productItemsNavText2, 4);
            this.title = productItemsNavText;
            this.productCount = i;
            this.sections = ahd;
            this.merchant = shoppingResultsAttribution;
            this.merchantDetail = productItemsNavText2;
        }

        public final Loaded copy(ProductItemsNavText productItemsNavText, int i, AHD<ProductItemsSection> ahd, ShoppingResultsAttribution shoppingResultsAttribution, ProductItemsNavText productItemsNavText2) {
            AnonymousClass003.A0v(productItemsNavText, ahd);
            C7384Etj.A0Y(productItemsNavText2, 4);
            return new Loaded(productItemsNavText, i, ahd, shoppingResultsAttribution, productItemsNavText2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Loading implements ProductItemsUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return -1066762022;
        }
    }
}
