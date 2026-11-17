package com.facebook.aura.shopping.view;

import X.AHD;
import X.AnonymousClass003;
import X.AnonymousClass005;
import com.facebook.aura.shopping.model.ShoppingMerchantRanking;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultProductUiModel;
import com.facebook.aura.shopping.viewmodel.ProductItemsSection;

/* loaded from: classes.dex */
public interface ProductItemsGridItem {

    /* loaded from: classes4.dex */
    public final class Header implements ProductItemsGridItem {
        public static final int $stable = 0;
        public final boolean isFirstSection;
        public final String key;
        public final String label;
        public final String subtitle;

        @Override // com.facebook.aura.shopping.view.ProductItemsGridItem
        public String getKey() {
            return this.key;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final boolean isFirstSection() {
            return this.isFirstSection;
        }

        public Header(String str, String str2, String str3, boolean z) {
            AnonymousClass003.A0u(str, str2);
            this.key = str;
            this.label = str2;
            this.subtitle = str3;
            this.isFirstSection = z;
        }
    }

    /* loaded from: classes4.dex */
    public final class Tile implements ProductItemsGridItem {
        public static final int $stable = ShoppingResultProduct.$stable | ProductItemsSection.$stable;
        public final ShoppingResultProductUiModel displayProduct;
        public final int index;
        public final String key;
        public final ShoppingMerchantRanking merchantRanking;
        public final AHD<ShoppingResultProduct> rawProducts;
        public final ProductItemsSection section;

        public final ShoppingResultProductUiModel getDisplayProduct() {
            return this.displayProduct;
        }

        public final int getIndex() {
            return this.index;
        }

        @Override // com.facebook.aura.shopping.view.ProductItemsGridItem
        public String getKey() {
            return this.key;
        }

        public final ShoppingMerchantRanking getMerchantRanking() {
            return this.merchantRanking;
        }

        public final AHD<ShoppingResultProduct> getRawProducts() {
            return this.rawProducts;
        }

        public final ProductItemsSection getSection() {
            return this.section;
        }

        public Tile(String str, ProductItemsSection productItemsSection, AHD<ShoppingResultProduct> ahd, ShoppingMerchantRanking shoppingMerchantRanking, ShoppingResultProductUiModel shoppingResultProductUiModel, int i) {
            AnonymousClass005.A17(str, productItemsSection, ahd, shoppingMerchantRanking, shoppingResultProductUiModel);
            this.key = str;
            this.section = productItemsSection;
            this.rawProducts = ahd;
            this.merchantRanking = shoppingMerchantRanking;
            this.displayProduct = shoppingResultProductUiModel;
            this.index = i;
        }
    }

    String getKey();
}
